package JSF;

import jpa.entities.Cuentas;
import JSF.util.JsfUtil;
import JSF.util.PaginationHelper;
import bai.CuentasFacade;

import java.io.Serializable;
import java.util.ResourceBundle;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpSession;
import static jpa.entities.Cuentas_.nombre;

@Named("cuentasController")
@SessionScoped
public class CuentasController implements Serializable {

    private Cuentas current;
    private DataModel items = null;
    @EJB
    private bai.CuentasFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;

    private String correoElectronico;
    private String claveUsuario;
    private String confirmarcionClave;
    private String nombreCompleto;
    private String nombreUsuario;
    private short permisoUsuario;
    private long idUsuario = 2;
    private short permiso3 = 3;
    
    public String registrarUsuario() {
        if (nombreCompleto.isEmpty()) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Todos los campos son obligatorios."));
            return "registro";
        }

        if (!claveUsuario.equals(confirmarcionClave)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("La contraseña y la confirmación de la contraseña no coinciden."));
            return "registro";
        }

        Cuentas nuevaCuenta = new Cuentas();

        nuevaCuenta.setNombre(nombreCompleto);
        nuevaCuenta.setEmail(correoElectronico);
        nuevaCuenta.setContraseña(claveUsuario);
        nuevaCuenta.setId(idUsuario);
        nuevaCuenta.setPermiso(permiso3);

        if (ejbFacade.registrarUsuario(nuevaCuenta)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuario registrado exitosamente"));
            nombreCompleto = "";
            correoElectronico = "";
            claveUsuario = "";
            confirmarcionClave = "";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error al registrar usuario"));
        }
        return "login?faces-redirect=true";
    }

    public String validaLogin() {
        Cuentas cuenta = ejbFacade.validarUsuario(correoElectronico, claveUsuario);
        if (cuenta != null) {
            nombreUsuario = cuenta.getNombre();
            permisoUsuario = cuenta.getPermiso();
            if (1 == permisoUsuario || 2 == permisoUsuario) {
                return "/Vistas/dashboard?faces-redirect=true";
            } else if (3 == permisoUsuario) {
                return "index?faces-redirect=true";
            } else {
                return "/Vistas/404?faces-redirect=true";
            }
        } else {
            return "login?faces-redirect=true";
        }
    }

    public String logout() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        if (session != null) {
            session.invalidate();
        }
        return "index?faces-redirect=true";
    }

    public boolean isLoggedIn() {
        return nombreUsuario != null && !nombreUsuario.isEmpty();
    }
    
    public boolean isCliente() {
        return isLoggedIn() && 3 == permisoUsuario;
    }

    public boolean isVendedor() {
        return isLoggedIn() && 2 == permisoUsuario;
    }

    public boolean isAdministrador() {
        return isLoggedIn() && 1 == permisoUsuario;
    }

    public boolean isNone() {
        return !isLoggedIn() || (!(3 == permisoUsuario) && !(2 == permisoUsuario) && !(1 == permisoUsuario));
    }

    public short getPermisoUsuario() {
        return permisoUsuario;
    }

    public void setPermisoUsuario(short permisoUsuario) {
        this.permisoUsuario = permisoUsuario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    public String getConfirmarcionClave() {
        return confirmarcionClave;
    }

    public void setConfirmarcionClave(String confirmarcionClave) {
        this.confirmarcionClave = confirmarcionClave;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public CuentasController() {
    }

    public Cuentas getSelected() {
        if (current == null) {
            current = new Cuentas();
            selectedItemIndex = -1;
        }
        return current;
    }

    private CuentasFacade getFacade() {
        return ejbFacade;
    }

    public PaginationHelper getPagination() {
        if (pagination == null) {
            pagination = new PaginationHelper(10) {

                @Override
                public int getItemsCount() {
                    return getFacade().count();
                }

                @Override
                public DataModel createPageDataModel() {
                    return new ListDataModel(getFacade().findRange(new int[]{getPageFirstItem(), getPageFirstItem() + getPageSize()}));
                }
            };
        }
        return pagination;
    }

    public String prepareList() {
        recreateModel();
        return "List";
    }

    public String prepareView() {
        current = (Cuentas) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new Cuentas();
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() {
        try {
            getFacade().create(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("CuentasCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (Cuentas) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("CuentasUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (Cuentas) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        performDestroy();
        recreatePagination();
        recreateModel();
        return "List";
    }

    public String destroyAndView() {
        performDestroy();
        recreateModel();
        updateCurrentItem();
        if (selectedItemIndex >= 0) {
            return "View";
        } else {
            // all items were removed - go back to list
            recreateModel();
            return "List";
        }
    }

    private void performDestroy() {
        try {
            getFacade().remove(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("CuentasDeleted"));
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
        }
    }

    private void updateCurrentItem() {
        int count = getFacade().count();
        if (selectedItemIndex >= count) {
            // selected index cannot be bigger than number of items:
            selectedItemIndex = count - 1;
            // go to previous page if last page disappeared:
            if (pagination.getPageFirstItem() >= count) {
                pagination.previousPage();
            }
        }
        if (selectedItemIndex >= 0) {
            current = getFacade().findRange(new int[]{selectedItemIndex, selectedItemIndex + 1}).get(0);
        }
    }

    public DataModel getItems() {
        if (items == null) {
            items = getPagination().createPageDataModel();
        }
        return items;
    }

    private void recreateModel() {
        items = null;
    }

    private void recreatePagination() {
        pagination = null;
    }

    public String next() {
        getPagination().nextPage();
        recreateModel();
        return "List";
    }

    public String previous() {
        getPagination().previousPage();
        recreateModel();
        return "List";
    }

    public SelectItem[] getItemsAvailableSelectMany() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), false);
    }

    public SelectItem[] getItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), true);
    }

    public Cuentas getCuentas(java.lang.Long id) {
        return ejbFacade.find(id);
    }

    @FacesConverter(forClass = Cuentas.class)
    public static class CuentasControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            CuentasController controller = (CuentasController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "cuentasController");
            return controller.getCuentas(getKey(value));
        }

        java.lang.Long getKey(String value) {
            java.lang.Long key;
            key = Long.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Cuentas) {
                Cuentas o = (Cuentas) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + Cuentas.class.getName());
            }
        }

    }

}

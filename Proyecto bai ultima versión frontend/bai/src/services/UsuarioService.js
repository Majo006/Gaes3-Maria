import axios from "axios";

const USUARIO_BASE_REST_API_URL = "http://localhost:8083/api/usuario/all";

class UsuarioService {
    getAllUsuario() {
        return axios.get(USUARIO_BASE_REST_API_URL);
    }
}

export default new UsuarioService();

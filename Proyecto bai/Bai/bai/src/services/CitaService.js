import axios from "axios";

const CITA_BASE_REST_API_URL = "http:http://localhost:8083/api/cita/all";

class CitaService {
    getAllCita(){
        return axios.get(CITA_BASE_REST_API_URL);
    }
}

export default new CitaService();
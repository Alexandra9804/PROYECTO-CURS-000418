package pe.edu.galaxy.training.java.arq.hex.app_be_gestion_autorizaciones.application.common;

public class UseCaseResponse<T> {

    private final T data;

    public UseCaseResponse(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

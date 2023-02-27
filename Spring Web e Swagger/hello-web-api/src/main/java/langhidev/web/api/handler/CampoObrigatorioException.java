package langhidev.web.api.handler;

public class CampoObrigatorioException extends BusinessException{

    public CampoObrigatorioException(String campo) {
        super("Obrigatório o campo %s", campo);
    }
}

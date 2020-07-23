package Steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import support.core.RequestDetails;

public class Usuarios {
 private RequestSpecification requestSpecification = RequestDetails.getRequestSpecification();
 private Response response = null;

 @Dado("^que envio uma requisicao com \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" (\\d+)$")
 public void que_envio_uma_requisicao_com(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, int arg7) throws Throwable {

 }

 @Entao("^recebo uma resposta de sucesso com o (\\d+)$")
 public void recebo_uma_resposta_de_sucesso_com_o(int arg1) throws Throwable {

 }
}


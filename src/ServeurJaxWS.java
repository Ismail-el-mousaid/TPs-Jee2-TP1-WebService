import webservice.BanqueService;

import javax.xml.ws.Endpoint;

//Serveur ou deployé web service
public class ServeurJaxWS {
    public static void main(String[] args) {
        //Publier web service dans ce url
        String url = "http://0.0.0.0:8686/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("web sevice déployé sur " + url);
    }
}

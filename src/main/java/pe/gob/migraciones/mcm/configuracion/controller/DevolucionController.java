package pe.gob.migraciones.mcm.configuracion.controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author epalacios
 */
@RestController
public class DevolucionController {

    @GetMapping("/")
    public String home() {
        return "Hello World from DZONE";
    }
//    @GetMapping(value = "/route")
//    public String contingenciaReniec() throws IOException, NoSuchAlgorithmException {
//        InetAddress ip;
//        String hostname;
//
//        ip = InetAddress.getLocalHost();
//        hostname = ip.getHostName();
//        System.out.println("Your current IP address : " + ip);
//        System.out.println("Your current Hostname : " + hostname);
//
//        return "IP::.."+ip+"-Hostname::.."+hostname;
}

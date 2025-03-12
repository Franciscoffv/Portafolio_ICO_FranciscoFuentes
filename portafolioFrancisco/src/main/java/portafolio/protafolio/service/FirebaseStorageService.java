/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package portafolio.protafolio.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    // El BucketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "techshop-70262.appspot.com";

    // Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "techshop";

    // Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";

    // El nombre del archivo Json
    final String archivoJsonFile = "farmacia-la-salvacion-335b0-firebase-adminsdk-fbsvc-3e0366d1f7";
}
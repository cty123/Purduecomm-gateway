package com.cty.purduecomm.gateway.infrastructure.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;

@Configuration
public class FireBaseConfig {

    @PostConstruct
    public void init() throws Exception{
        FileInputStream serviceAccount =
                new FileInputStream("/home/ctydw/Downloads/plenary-vim-201315-firebase-adminsdk-fhj7h-e4df50251f.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://plenary-vim-201315.firebaseio.com")
                .build();

        FirebaseApp.initializeApp(options);
    }
}

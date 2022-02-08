package com.leo2020.awsimageupload.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AwsSecrets {

    private String username;
    private String password;
    private String host;
    private String port;

}
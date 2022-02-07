package com.leo2020.awsimageupload.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Spring instantiates Config and anything in the class
@Configuration
public class AmazonConfig {

    //give us the s3 client
    @Bean
    public AmazonS3 s3() { //comes from dependency added in pom.xml
        AWSCredentials awsCredentials = new BasicAWSCredentials(
               accessKey: "AKIAY3JGGVL5HAPBYOE5",
               secretKey: "4W9dJVSw0Kv7ThD3qcEGmWtKc1bUrygsEFMVcXZ"
        );
        return AmazonS3ClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .build();
    }
}

package com.leo2020.awsimageupload.profile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user-profile")
public class UserProfileController {

    @GetMapping
    public List<UserProfile> getUserProfiles() {
        return null;
    }
}

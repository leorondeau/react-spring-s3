package com.leo2020.awsimageupload.datastore;

import com.leo2020.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), username:"leorondeau", userProfileImageLink:null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), username:"dukerondeau", userProfileImageLink:null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}

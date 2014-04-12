package ua.dev.bitbucket.api.v1.models;

import org.codehaus.jackson.annotate.JsonProperty;

public class UpdatedRepository {
    @JsonProperty("name")
    private String mName;
    @JsonProperty("url")
    private String mURL;
    @JsonProperty("avatar")
    private String mAvatar;
    @JsonProperty("owner")
    private String mOwner;
    @JsonProperty("slug")
    private String mSlug;
    @JsonProperty("is_private")
    private boolean isPrivateRepository;
    
    public UpdatedRepository(){
        
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getURL() {
        return mURL;
    }

    public void setURL(String mURL) {
        this.mURL = mURL;
    }

    public String getAvatar() {
        return mAvatar;
    }

    public void setAvatar(String mAvatar) {
        this.mAvatar = mAvatar;
    }

    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String mOwner) {
        this.mOwner = mOwner;
    }

    public String getSlug() {
        return mSlug;
    }

    public void setSlug(String mSlug) {
        this.mSlug = mSlug;
    }

    public boolean isPrivateRepository() {
        return isPrivateRepository;
    }

    public void setPrivateRepository(boolean isPrivateRepository) {
        this.isPrivateRepository = isPrivateRepository;
    }
}

package ua.dev.bitbucket.api.v1.models;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class User {

    @JsonProperty("repositories")
    private List<Repository> mRepositories;
    @JsonProperty("username")
    private String mUserName;
    @JsonProperty("first_name")
    private String mFirstName;
    @JsonProperty("last_name")
    private String mLastName;
    @JsonProperty("display_name")
    private String mDisplayName;
    @JsonProperty("is_team")
    private boolean isTeam;
    @JsonProperty("avatar")
    private String mAvatarURL;
    @JsonProperty("resource_uri")
    private String mResourceURI;
    
    public User(){
        
    }

    public List<Repository> getRepositories() {
        return mRepositories;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    public String getDisplayName() {
        return mDisplayName;
    }

    public void setDisplayName(String mDisplayName) {
        this.mDisplayName = mDisplayName;
    }

    public boolean isTeam() {
        return isTeam;
    }

    public void setTeam(boolean isTeam) {
        this.isTeam = isTeam;
    }

    public String getAvatarURL() {
        return mAvatarURL;
    }

    public void setAvatarURL(String mAvatarURL) {
        this.mAvatarURL = mAvatarURL;
    }

    public String getResourceURI() {
        return mResourceURI;
    }

    public void setResourceURI(String mResourceURI) {
        this.mResourceURI = mResourceURI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (isTeam != user.isTeam) return false;
        if (!mAvatarURL.equals(user.mAvatarURL)) return false;
        if (!mDisplayName.equals(user.mDisplayName)) return false;
        if (!mFirstName.equals(user.mFirstName)) return false;
        if (!mLastName.equals(user.mLastName)) return false;
        if (!mRepositories.equals(user.mRepositories)) return false;
        if (!mResourceURI.equals(user.mResourceURI)) return false;
        if (!mUserName.equals(user.mUserName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mRepositories.hashCode();
        result = 31 * result + mUserName.hashCode();
        result = 31 * result + mFirstName.hashCode();
        result = 31 * result + mLastName.hashCode();
        result = 31 * result + mDisplayName.hashCode();
        result = 31 * result + (isTeam ? 1 : 0);
        result = 31 * result + mAvatarURL.hashCode();
        result = 31 * result + mResourceURI.hashCode();
        return result;
    }
}

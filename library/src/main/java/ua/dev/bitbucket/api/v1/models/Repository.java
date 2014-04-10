package ua.dev.bitbucket.api.v1.models;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Date;

public class Repository {

    @JsonProperty("scm")
    private String mScmType;
    @JsonProperty("has_wiki")
    private boolean hasWiki;
    @JsonProperty("last_updated")
    private Date mLastUpdated;
    @JsonProperty("no_forks")
    private boolean hasForks;
    @JsonProperty("created_on")
    private Date mCreatedOn;
    @JsonProperty("owner")
    private String mOwnerName;
    @JsonProperty("logo")
    private String mLogoUrl;
    @JsonProperty("email_mailinglist")
    private String mEmailMailingList;
    @JsonProperty("is_mq")
    private boolean isMq;
    @JsonProperty("size")
    private long mSize;
    @JsonProperty("read_only")
    private boolean isReadOnly;
    @JsonProperty("fork_of")//todo: correct this
    private String mForkOf;
    @JsonProperty("mq_of")//todo: correct this
    private String mMqOf;
    @JsonProperty("state")//todo: correct this
    private String mState;
    @JsonProperty("utc_created_on")
    private Date mUtcCreatedOn;
    @JsonProperty("website")
    private String mWebSite;
    @JsonProperty("description")
    private String mDescription;
    @JsonProperty("has_issues")
    private boolean hasIssues;
    @JsonProperty("is_fork")
    private boolean isFork;
    @JsonProperty("slug")
    private String mSlug;
    @JsonProperty("is_private")
    private boolean isPrivate;
    @JsonProperty("name")
    private String mRepoName;
    @JsonProperty("language")
    private String mRepoLanguage;
    @JsonProperty("utc_last_updated")
    private Date mUtcLastUpdated;
    @JsonProperty("email_writers")
    private boolean emailWriters;
    @JsonProperty("no_public_forks")
    private boolean allowPublicForks;
    @JsonProperty("creator")//todo: correct this
    private String mCreator;
    @JsonProperty("resource_uri")
    private String mResourceUri;
    
    public Repository(){}

    public String getScmType() {
        return mScmType;
    }

    public void setScmType(String mScmType) {
        this.mScmType = mScmType;
    }

    public boolean isHasWiki() {
        return hasWiki;
    }

    public void setHasWiki(boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    public Date getLastUpdated() {
        return mLastUpdated;
    }

    public void setLastUpdated(Date mLastUpdated) {
        this.mLastUpdated = mLastUpdated;
    }

    public boolean isHasForks() {
        return hasForks;
    }

    public void setHasForks(boolean hasForks) {
        this.hasForks = hasForks;
    }

    public Date getCreatedOn() {
        return mCreatedOn;
    }

    public void setCreatedOn(Date mCreatedOn) {
        this.mCreatedOn = mCreatedOn;
    }

    public String getOwnerName() {
        return mOwnerName;
    }

    public void setOwnerName(String mOwnerName) {
        this.mOwnerName = mOwnerName;
    }

    public String getLogoUrl() {
        return mLogoUrl;
    }

    public void setLogoUrl(String mLogoUrl) {
        this.mLogoUrl = mLogoUrl;
    }

    public String getEmailMailingList() {
        return mEmailMailingList;
    }

    public void setEmailMailingList(String mEmailMailingList) {
        this.mEmailMailingList = mEmailMailingList;
    }

    public boolean isMq() {
        return isMq;
    }

    public void setq(boolean isMq) {
        this.isMq = isMq;
    }

    public long getSize() {
        return mSize;
    }

    public void setSize(long mSize) {
        this.mSize = mSize;
    }

    public boolean isReadOnly() {
        return isReadOnly;
    }

    public void setReadOnly(boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
    }

    public String getForkOf() {
        return mForkOf;
    }

    public void setForkOf(String mForkOf) {
        this.mForkOf = mForkOf;
    }

    public String getMqOf() {
        return mMqOf;
    }

    public void setMqOf(String mMqOf) {
        this.mMqOf = mMqOf;
    }

    public String getState() {
        return mState;
    }

    public void setState(String mState) {
        this.mState = mState;
    }

    public Date getUtcCreatedOn() {
        return mUtcCreatedOn;
    }

    public void setUtcCreatedOn(Date mUtcCreatedOn) {
        this.mUtcCreatedOn = mUtcCreatedOn;
    }

    public String getWebSite() {
        return mWebSite;
    }

    public void setWebSite(String mWebSite) {
        this.mWebSite = mWebSite;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public boolean isHasIssues() {
        return hasIssues;
    }

    public void setHasIssues(boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    public boolean isFork() {
        return isFork;
    }

    public void setFork(boolean isFork) {
        this.isFork = isFork;
    }

    public String getSlug() {
        return mSlug;
    }

    public void setSlug(String mSlug) {
        this.mSlug = mSlug;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public String getRepoName() {
        return mRepoName;
    }

    public void setRepoName(String mRepoName) {
        this.mRepoName = mRepoName;
    }

    public String getRepoLanguage() {
        return mRepoLanguage;
    }

    public void setRepoLanguage(String mRepoLanguage) {
        this.mRepoLanguage = mRepoLanguage;
    }

    public Date getUtcLastUpdated() {
        return mUtcLastUpdated;
    }

    public void setUtcLastUpdated(Date mUtcLastUpdated) {
        this.mUtcLastUpdated = mUtcLastUpdated;
    }

    public boolean isEmailWriters() {
        return emailWriters;
    }

    public void setEmailWriters(boolean emailWriters) {
        this.emailWriters = emailWriters;
    }

    public boolean isAllowPublicForks() {
        return allowPublicForks;
    }

    public void setAllowPublicForks(boolean allowPublicForks) {
        this.allowPublicForks = allowPublicForks;
    }

    public String getCreator() {
        return mCreator;
    }

    public void setCreator(String mCreator) {
        this.mCreator = mCreator;
    }

    public String getResourceUri() {
        return mResourceUri;
    }

    public void setResourceUri(String mResourceUri) {
        this.mResourceUri = mResourceUri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Repository)) return false;

        Repository that = (Repository) o;

        if (allowPublicForks != that.allowPublicForks) return false;
        if (emailWriters != that.emailWriters) return false;
        if (hasForks != that.hasForks) return false;
        if (hasIssues != that.hasIssues) return false;
        if (hasWiki != that.hasWiki) return false;
        if (isFork != that.isFork) return false;
        if (isMq != that.isMq) return false;
        if (isPrivate != that.isPrivate) return false;
        if (isReadOnly != that.isReadOnly) return false;
        if (mSize != that.mSize) return false;
        if (!mCreatedOn.equals(that.mCreatedOn)) return false;
        if (mCreator != null ? !mCreator.equals(that.mCreator) : that.mCreator != null)
            return false;
        if (!mDescription.equals(that.mDescription)) return false;
        if (!mEmailMailingList.equals(that.mEmailMailingList)) return false;
        if (mForkOf != null ? !mForkOf.equals(that.mForkOf) : that.mForkOf != null) return false;
        if (!mLastUpdated.equals(that.mLastUpdated)) return false;
        if (!mLogoUrl.equals(that.mLogoUrl)) return false;
        if (mMqOf != null ? !mMqOf.equals(that.mMqOf) : that.mMqOf != null) return false;
        if (!mOwnerName.equals(that.mOwnerName)) return false;
        if (!mRepoLanguage.equals(that.mRepoLanguage)) return false;
        if (!mRepoName.equals(that.mRepoName)) return false;
        if (!mResourceUri.equals(that.mResourceUri)) return false;
        if (!mScmType.equals(that.mScmType)) return false;
        if (!mSlug.equals(that.mSlug)) return false;
        if (!mState.equals(that.mState)) return false;
        if (!mUtcCreatedOn.equals(that.mUtcCreatedOn)) return false;
        if (!mUtcLastUpdated.equals(that.mUtcLastUpdated)) return false;
        if (!mWebSite.equals(that.mWebSite)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mScmType.hashCode();
        result = 31 * result + (hasWiki ? 1 : 0);
        result = 31 * result + mLastUpdated.hashCode();
        result = 31 * result + (hasForks ? 1 : 0);
        result = 31 * result + mCreatedOn.hashCode();
        result = 31 * result + mOwnerName.hashCode();
        result = 31 * result + mLogoUrl.hashCode();
        result = 31 * result + mEmailMailingList.hashCode();
        result = 31 * result + (isMq ? 1 : 0);
        result = 31 * result + (int) (mSize ^ (mSize >>> 32));
        result = 31 * result + (isReadOnly ? 1 : 0);
        result = 31 * result + (mForkOf != null ? mForkOf.hashCode() : 0);
        result = 31 * result + (mMqOf != null ? mMqOf.hashCode() : 0);
        result = 31 * result + mState.hashCode();
        result = 31 * result + mUtcCreatedOn.hashCode();
        result = 31 * result + mWebSite.hashCode();
        result = 31 * result + mDescription.hashCode();
        result = 31 * result + (hasIssues ? 1 : 0);
        result = 31 * result + (isFork ? 1 : 0);
        result = 31 * result + mSlug.hashCode();
        result = 31 * result + (isPrivate ? 1 : 0);
        result = 31 * result + mRepoName.hashCode();
        result = 31 * result + mRepoLanguage.hashCode();
        result = 31 * result + mUtcLastUpdated.hashCode();
        result = 31 * result + (emailWriters ? 1 : 0);
        result = 31 * result + (allowPublicForks ? 1 : 0);
        result = 31 * result + (mCreator != null ? mCreator.hashCode() : 0);
        result = 31 * result + mResourceUri.hashCode();
        return result;
    }
}

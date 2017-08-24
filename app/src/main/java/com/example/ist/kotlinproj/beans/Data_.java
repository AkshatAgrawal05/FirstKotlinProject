
package com.example.ist.kotlinproj.beans;

import com.squareup.moshi.Json;

import java.io.Serializable;
import java.util.List;

public class Data_ implements Serializable {

    private final static long serialVersionUID = 5005090556336940315L;
    @Json(name = "domain")
    private String domain;
    @Json(name = "approved_at_utc")
    private Object approvedAtUtc;
    @Json(name = "banned_by")
    private Object bannedBy;
    @Json(name = "media_embed")
    private MediaEmbed mediaEmbed;
    @Json(name = "thumbnail_width")
    private int thumbnailWidth;
    @Json(name = "subreddit")
    private String subreddit;
    @Json(name = "selftext_html")
    private Object selftextHtml;
    @Json(name = "selftext")
    private String selftext;
    @Json(name = "likes")
    private Object likes;
    @Json(name = "suggested_sort")
    private Object suggestedSort;
    @Json(name = "user_reports")
    private List<Object> userReports = null;
    @Json(name = "secure_media")
    private Object secureMedia;
    @Json(name = "link_flair_text")
    private String linkFlairText;
    @Json(name = "id")
    private String id;
    @Json(name = "banned_at_utc")
    private Object bannedAtUtc;
    @Json(name = "view_count")
    private Object viewCount;
    @Json(name = "archived")
    private boolean archived;
    @Json(name = "clicked")
    private boolean clicked;
    @Json(name = "report_reasons")
    private Object reportReasons;
    @Json(name = "title")
    private String title;
    @Json(name = "media")
    private Object media;
    @Json(name = "mod_reports")
    private List<Object> modReports = null;
    @Json(name = "can_mod_post")
    private boolean canModPost;
    @Json(name = "author_flair_text")
    private Object authorFlairText;
    @Json(name = "score")
    private int score;
    @Json(name = "approved_by")
    private Object approvedBy;
    @Json(name = "over_18")
    private boolean over18;
    @Json(name = "hidden")
    private boolean hidden;
    @Json(name = "preview")
    private Preview preview;
    @Json(name = "thumbnail")
    private String thumbnail;
    @Json(name = "subreddit_id")
    private String subredditId;
    @Json(name = "edited")
    private boolean edited;
    @Json(name = "link_flair_css_class")
    private String linkFlairCssClass;
    @Json(name = "author_flair_css_class")
    private Object authorFlairCssClass;
    @Json(name = "contest_mode")
    private boolean contestMode;
    @Json(name = "gilded")
    private int gilded;
    @Json(name = "downs")
    private int downs;
    @Json(name = "brand_safe")
    private boolean brandSafe;
    @Json(name = "secure_media_embed")
    private SecureMediaEmbed secureMediaEmbed;
    @Json(name = "saved")
    private boolean saved;
    @Json(name = "removal_reason")
    private Object removalReason;
    @Json(name = "post_hint")
    private String postHint;
    @Json(name = "stickied")
    private boolean stickied;
    @Json(name = "can_gild")
    private boolean canGild;
    @Json(name = "thumbnail_height")
    private int thumbnailHeight;
    @Json(name = "parent_whitelist_status")
    private String parentWhitelistStatus;
    @Json(name = "name")
    private String name;
    @Json(name = "spoiler")
    private boolean spoiler;
    @Json(name = "permalink")
    private String permalink;
    @Json(name = "subreddit_type")
    private String subredditType;
    @Json(name = "locked")
    private boolean locked;
    @Json(name = "hide_score")
    private boolean hideScore;
    @Json(name = "created")
    private int created;
    @Json(name = "url")
    private String url;
    @Json(name = "whitelist_status")
    private String whitelistStatus;
    @Json(name = "quarantine")
    private boolean quarantine;
    @Json(name = "author")
    private String author;
    @Json(name = "created_utc")
    private int createdUtc;
    @Json(name = "subreddit_name_prefixed")
    private String subredditNamePrefixed;
    @Json(name = "ups")
    private int ups;
    @Json(name = "num_comments")
    private int numComments;
    @Json(name = "is_self")
    private boolean isSelf;
    @Json(name = "visited")
    private boolean visited;
    @Json(name = "num_reports")
    private Object numReports;
    @Json(name = "is_video")
    private boolean isVideo;
    @Json(name = "distinguished")
    private Object distinguished;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Object getApprovedAtUtc() {
        return approvedAtUtc;
    }

    public void setApprovedAtUtc(Object approvedAtUtc) {
        this.approvedAtUtc = approvedAtUtc;
    }

    public Object getBannedBy() {
        return bannedBy;
    }

    public void setBannedBy(Object bannedBy) {
        this.bannedBy = bannedBy;
    }

    public MediaEmbed getMediaEmbed() {
        return mediaEmbed;
    }

    public void setMediaEmbed(MediaEmbed mediaEmbed) {
        this.mediaEmbed = mediaEmbed;
    }

    public int getThumbnailWidth() {
        return thumbnailWidth;
    }

    public void setThumbnailWidth(int thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }

    public Object getSelftextHtml() {
        return selftextHtml;
    }

    public void setSelftextHtml(Object selftextHtml) {
        this.selftextHtml = selftextHtml;
    }

    public String getSelftext() {
        return selftext;
    }

    public void setSelftext(String selftext) {
        this.selftext = selftext;
    }

    public Object getLikes() {
        return likes;
    }

    public void setLikes(Object likes) {
        this.likes = likes;
    }

    public Object getSuggestedSort() {
        return suggestedSort;
    }

    public void setSuggestedSort(Object suggestedSort) {
        this.suggestedSort = suggestedSort;
    }

    public List<Object> getUserReports() {
        return userReports;
    }

    public void setUserReports(List<Object> userReports) {
        this.userReports = userReports;
    }

    public Object getSecureMedia() {
        return secureMedia;
    }

    public void setSecureMedia(Object secureMedia) {
        this.secureMedia = secureMedia;
    }

    public String getLinkFlairText() {
        return linkFlairText;
    }

    public void setLinkFlairText(String linkFlairText) {
        this.linkFlairText = linkFlairText;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getBannedAtUtc() {
        return bannedAtUtc;
    }

    public void setBannedAtUtc(Object bannedAtUtc) {
        this.bannedAtUtc = bannedAtUtc;
    }

    public Object getViewCount() {
        return viewCount;
    }

    public void setViewCount(Object viewCount) {
        this.viewCount = viewCount;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public boolean isClicked() {
        return clicked;
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public Object getReportReasons() {
        return reportReasons;
    }

    public void setReportReasons(Object reportReasons) {
        this.reportReasons = reportReasons;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getMedia() {
        return media;
    }

    public void setMedia(Object media) {
        this.media = media;
    }

    public List<Object> getModReports() {
        return modReports;
    }

    public void setModReports(List<Object> modReports) {
        this.modReports = modReports;
    }

    public boolean isCanModPost() {
        return canModPost;
    }

    public void setCanModPost(boolean canModPost) {
        this.canModPost = canModPost;
    }

    public Object getAuthorFlairText() {
        return authorFlairText;
    }

    public void setAuthorFlairText(Object authorFlairText) {
        this.authorFlairText = authorFlairText;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Object getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(Object approvedBy) {
        this.approvedBy = approvedBy;
    }

    public boolean isOver18() {
        return over18;
    }

    public void setOver18(boolean over18) {
        this.over18 = over18;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public Preview getPreview() {
        return preview;
    }

    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getSubredditId() {
        return subredditId;
    }

    public void setSubredditId(String subredditId) {
        this.subredditId = subredditId;
    }

    public boolean isEdited() {
        return edited;
    }

    public void setEdited(boolean edited) {
        this.edited = edited;
    }

    public String getLinkFlairCssClass() {
        return linkFlairCssClass;
    }

    public void setLinkFlairCssClass(String linkFlairCssClass) {
        this.linkFlairCssClass = linkFlairCssClass;
    }

    public Object getAuthorFlairCssClass() {
        return authorFlairCssClass;
    }

    public void setAuthorFlairCssClass(Object authorFlairCssClass) {
        this.authorFlairCssClass = authorFlairCssClass;
    }

    public boolean isContestMode() {
        return contestMode;
    }

    public void setContestMode(boolean contestMode) {
        this.contestMode = contestMode;
    }

    public int getGilded() {
        return gilded;
    }

    public void setGilded(int gilded) {
        this.gilded = gilded;
    }

    public int getDowns() {
        return downs;
    }

    public void setDowns(int downs) {
        this.downs = downs;
    }

    public boolean isBrandSafe() {
        return brandSafe;
    }

    public void setBrandSafe(boolean brandSafe) {
        this.brandSafe = brandSafe;
    }

    public SecureMediaEmbed getSecureMediaEmbed() {
        return secureMediaEmbed;
    }

    public void setSecureMediaEmbed(SecureMediaEmbed secureMediaEmbed) {
        this.secureMediaEmbed = secureMediaEmbed;
    }

    public boolean isSaved() {
        return saved;
    }

    public void setSaved(boolean saved) {
        this.saved = saved;
    }

    public Object getRemovalReason() {
        return removalReason;
    }

    public void setRemovalReason(Object removalReason) {
        this.removalReason = removalReason;
    }

    public String getPostHint() {
        return postHint;
    }

    public void setPostHint(String postHint) {
        this.postHint = postHint;
    }

    public boolean isStickied() {
        return stickied;
    }

    public void setStickied(boolean stickied) {
        this.stickied = stickied;
    }

    public boolean isCanGild() {
        return canGild;
    }

    public void setCanGild(boolean canGild) {
        this.canGild = canGild;
    }

    public int getThumbnailHeight() {
        return thumbnailHeight;
    }

    public void setThumbnailHeight(int thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
    }

    public String getParentWhitelistStatus() {
        return parentWhitelistStatus;
    }

    public void setParentWhitelistStatus(String parentWhitelistStatus) {
        this.parentWhitelistStatus = parentWhitelistStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSpoiler() {
        return spoiler;
    }

    public void setSpoiler(boolean spoiler) {
        this.spoiler = spoiler;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getSubredditType() {
        return subredditType;
    }

    public void setSubredditType(String subredditType) {
        this.subredditType = subredditType;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public boolean isHideScore() {
        return hideScore;
    }

    public void setHideScore(boolean hideScore) {
        this.hideScore = hideScore;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWhitelistStatus() {
        return whitelistStatus;
    }

    public void setWhitelistStatus(String whitelistStatus) {
        this.whitelistStatus = whitelistStatus;
    }

    public boolean isQuarantine() {
        return quarantine;
    }

    public void setQuarantine(boolean quarantine) {
        this.quarantine = quarantine;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCreatedUtc() {
        return createdUtc;
    }

    public void setCreatedUtc(int createdUtc) {
        this.createdUtc = createdUtc;
    }

    public String getSubredditNamePrefixed() {
        return subredditNamePrefixed;
    }

    public void setSubredditNamePrefixed(String subredditNamePrefixed) {
        this.subredditNamePrefixed = subredditNamePrefixed;
    }

    public int getUps() {
        return ups;
    }

    public void setUps(int ups) {
        this.ups = ups;
    }

    public int getNumComments() {
        return numComments;
    }

    public void setNumComments(int numComments) {
        this.numComments = numComments;
    }

    public boolean isIsSelf() {
        return isSelf;
    }

    public void setIsSelf(boolean isSelf) {
        this.isSelf = isSelf;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Object getNumReports() {
        return numReports;
    }

    public void setNumReports(Object numReports) {
        this.numReports = numReports;
    }

    public boolean isIsVideo() {
        return isVideo;
    }

    public void setIsVideo(boolean isVideo) {
        this.isVideo = isVideo;
    }

    public Object getDistinguished() {
        return distinguished;
    }

    public void setDistinguished(Object distinguished) {
        this.distinguished = distinguished;
    }

}

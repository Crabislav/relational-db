package lesson6.homework.forums;

import java.util.Date;

public class ForumPost {
    private Integer id;
    private ForumSubcategory forumSubcategory;
    private User user;
    private ForumPost parentPost;
    private String title;
    private String context;
    private Boolean isPoll;
    private Date date;
    private String ip;

    public ForumPost(Integer id, ForumSubcategory forumSubcategory, User user, ForumPost parentPost, String title, String context, Boolean isPoll, Date date, String ip) {
        this.id = id;
        this.forumSubcategory = forumSubcategory;
        this.user = user;
        this.parentPost = parentPost;
        this.title = title;
        this.context = context;
        this.isPoll = isPoll;
        this.date = date;
        this.ip = ip;
    }

    public Integer getId() {
        return id;
    }

    public ForumSubcategory getForumSubcategory() {
        return forumSubcategory;
    }

    public User getUser() {
        return user;
    }

    public ForumPost getParentPost() {
        return parentPost;
    }

    public String getTitle() {
        return title;
    }

    public String getContext() {
        return context;
    }

    public Boolean getPoll() {
        return isPoll;
    }

    public Date getDate() {
        return date;
    }

    public String getIp() {
        return ip;
    }
}

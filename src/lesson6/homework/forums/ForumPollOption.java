package lesson6.homework.forums;

import java.util.Date;

public class ForumPollOption {
    private Integer id;
    private ForumPollOption forumPollOption;
    private User user;
    private Date dateCreated;
    private String ip;

    public ForumPollOption(Integer id, ForumPollOption forumPollOption, User user, Date dateCreated, String ip) {
        this.id = id;
        this.forumPollOption = forumPollOption;
        this.user = user;
        this.dateCreated = dateCreated;
        this.ip = ip;
    }

    public Integer getId() {
        return id;
    }

    public ForumPollOption getForumPollOption() {
        return forumPollOption;
    }

    public User getUser() {
        return user;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getIp() {
        return ip;
    }
}

package lesson6.homework.forums;

import java.util.Date;

public class ForumPollOptionsVote {
    private Integer id;
    private ForumPost forumPost;
    private String title;
    private Date dateCreated;

    public ForumPollOptionsVote(Integer id, ForumPost forumPost, String title, Date dateCreated) {
        this.id = id;
        this.forumPost = forumPost;
        this.title = title;
        this.dateCreated = dateCreated;
    }

    public Integer getId() {
        return id;
    }

    public ForumPost getForumPost() {
        return forumPost;
    }

    public String getTitle() {
        return title;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
}

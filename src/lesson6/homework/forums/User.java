package lesson6.homework.forums;

import java.util.Date;

public class User {
    private Integer id;
    private String nick;
    private String password;
    private String eMail;
    private Date date;
    private Float karma;
    private String ip;

    public User(Integer id, String nick, String password, String eMail, Date date, Float karma, String ip) {
        this.id = id;
        this.nick = nick;
        this.password = password;
        this.eMail = eMail;
        this.date = date;
        this.karma = karma;
        this.ip = ip;
    }

    public Integer getId() {
        return id;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public String geteMail() {
        return eMail;
    }

    public Date getDate() {
        return date;
    }

    public Float getKarma() {
        return karma;
    }

    public String getIp() {
        return ip;
    }
}

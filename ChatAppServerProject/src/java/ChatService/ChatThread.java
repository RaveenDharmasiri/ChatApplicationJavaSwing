/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChatService;

/**
 *
 * @author CW
 */
public class ChatThread {
    
    private String threadTitle;
    private String createdDate;
    private String threadOwner;

    public String getThreadTitle() {
        return threadTitle;
    }

    public void setThreadTitle(String threadTitle) {
        this.threadTitle = threadTitle;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getThreadOwner() {
        return threadOwner;
    }

    public void setThreadOwner(String threadOwner) {
        this.threadOwner = threadOwner;
    }
    
}

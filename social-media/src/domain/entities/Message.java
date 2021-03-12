package domain.entities;

import domain.entities.interfaces.HasAuthor;
import domain.entities.interfaces.HasSentiment;
import domain.entities.interfaces.IsCommentable;

public class Message implements HasAuthor, IsCommentable,HasSentiment{
	
	private Object content;
	private int id;
	private User hasUser;
	private Sentiment hasSentiment;
	
	public Message() {
		
	}
	public Message(Object content,Sentiment hasSentiment, int id) {
		this.content = content;
		this.id = id;
		this.hasSentiment = hasSentiment;
	}
	
	public Message(Object content, int id, User hasUser, Sentiment hasSentiment) {
		this.content = content;
		this.id = id;
		this.hasUser = hasUser;
		this.hasSentiment = hasSentiment;
	}
	public Object getContent() {
		return content;
	}
	public void setContent(Object content) {
		this.content = content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getHasUser() {
		return hasUser;
	}
	public void setHasUser(User hasUser) {
		this.hasUser = hasUser;
	}
	public Sentiment getHasSentiment() {
		return hasSentiment;
	}
	public void setHasSentiment(Sentiment hasSentiment) {
		this.hasSentiment = hasSentiment;
	}
	@Override
	public String toString() {
		return "Message [content=" + content + ", hasSentiment=" + hasSentiment + "]";
	}
	
	
}

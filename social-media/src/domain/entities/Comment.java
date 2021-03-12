package domain.entities;

import domain.entities.interfaces.HasAuthor;
import domain.entities.interfaces.HasSentiment;
import domain.entities.interfaces.IsChronological;
import domain.entities.interfaces.IsCommentable;

public class Comment implements HasAuthor, HasSentiment, IsChronological, IsCommentable {
	private int id;
	private User hasUser;
	private Message hasMessage;
	private Sentiment hasSentiment;
	
	public Comment() {
		
	}
	public Comment(int id, Message hasMessage, Sentiment hasSentiment) {
		this.id = id;
		this.hasMessage = hasMessage;
		this.hasSentiment = hasSentiment;
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
	public Message getHasMessage() {
		return hasMessage;
	}
	public void setHasMessage(Message hasMessage) {
		this.hasMessage = hasMessage;
	}
	public Sentiment getHasSentiment() {
		return hasSentiment;
	}
	public void setHasSentiment(Sentiment hasSentiment) {
		this.hasSentiment = hasSentiment;
	}
	
}

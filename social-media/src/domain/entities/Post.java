package domain.entities;

import domain.entities.interfaces.HasAuthor;
import domain.entities.interfaces.HasSentiment;
import domain.entities.interfaces.IsChronological;
import domain.entities.interfaces.IsCommentable;

public class Post implements HasAuthor, IsChronological, HasSentiment, IsCommentable {
	
	private Object content;
	private User hasUser;
	private Message hasMessage;
	private Sentiment hasSenetiment;
	private Comment hasComment;
	private int id;
	
	public Post() {
		
	}
	public Post(Object content,int id) {
		this.content = content;
		this.id = id;
	}
	
	public Post(Object content, User hasUser, Message hasMessage, Sentiment hasSenetiment, Comment hasComment, int id) {
		this.content = content;
		this.hasUser = hasUser;
		this.hasMessage = hasMessage;
		this.hasSenetiment = hasSenetiment;
		this.hasComment = hasComment;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
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

	public Sentiment getHasSenetiment() {
		return hasSenetiment;
	}

	public void setHasSenetiment(Sentiment hasSenetiment) {
		this.hasSenetiment = hasSenetiment;
	}

	public Comment getHasComment() {
		return hasComment;
	}

	public void setHasComment(Comment hasComment) {
		this.hasComment = hasComment;
	}
	
	@Override
	public String toString() {
		return "Post [content=" + content + "]";
	}
	
}

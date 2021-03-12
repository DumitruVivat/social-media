package domain.entities;

import java.util.List;

import domain.entities.interfaces.HasAuthor;
import domain.entities.interfaces.HasSentiment;
import domain.entities.interfaces.IsChronological;

public class Sentiment implements HasSentiment,HasAuthor,IsChronological{
	
	private Object emoji;
	private String sentiment;
	private List<Object> listOfEmoji;
	private int id;
	
	public Sentiment() {
		
	}
	
	public Sentiment(String sentiment,int id) {
		this.sentiment = sentiment;
		this.id = id;
	}
	public Sentiment(Object emoji,int id) {
		this.emoji = emoji;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Object getEmoji() {
		return emoji;
	}

	public void setEmoji(Object emoji) {
		this.emoji = emoji;
	}

	public String getSentiment() {
		return sentiment;
	}

	public void setSentiment(String sentiment) {
		this.sentiment = sentiment;
	}

	public List<Object> getListOfEmoji() {
		return listOfEmoji;
	}

	public void setListOfEmoji(List<Object> listOfEmoji) {
		this.listOfEmoji = listOfEmoji;
	}

	@Override
	public String toString() {
		return "Sentiment [emoji=" + emoji + ", sentiment=" + sentiment + ", listOfEmoji=" + listOfEmoji + "]";
	}
	
}

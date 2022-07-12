
public class StreamTwo {
	private int newsId;
    private String userPost;
    private String userComment;
    private String comment;
    private int commentsCount;
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getUserPost() {
		return userPost;
	}
	public void setUserPost(String userPost) {
		this.userPost = userPost;
	}
	public String getUserComment() {
		return userComment;
	}
	public void setUserComment(String userComment) {
		this.userComment = userComment;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getCommentsCount() {
		return commentsCount;
	}
	public void setCommentsCount(int commentsCount) {
		this.commentsCount = commentsCount;
	}
	public StreamTwo(int newsId, String userPost, String userComment, String comment, int commentsCount) {
		super();
		this.newsId = newsId;
		this.userPost = userPost;
		this.userComment = userComment;
		this.comment = comment;
		this.commentsCount = commentsCount;
	}
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", userPost=" + userPost + ", userComment=" + userComment + ", comment="
				+ comment + ", commentsCount=" + commentsCount + "]";
	}
    
  
	
}

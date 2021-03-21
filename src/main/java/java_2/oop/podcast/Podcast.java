package java_2.oop.podcast;

class Podcast {
	/*
		Properties
		   - Title
		   - Host
		   - Duration
		 - **A podcast must exist in the Podcast before it can be added to the playlist (so you can only podcasts that you own.)**
	*/

    private String title;
    private String host;
    private String duration;

    public Podcast(String title, String host, String duration) {
        this.title = title;
        this.host = host;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "title='" + title + '\'' +
                ", host='" + host + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}

package java_2.oop.podcast;

import java.util.ArrayList;
import java.util.List;

class PodcastingApp {

/*
	   Properties :
	   - appName (Apple Podcasts, Pocket Casts, Overcast, Google Podcasts, etc.)
       - playlist of Podcasts (with a capital P)

       Methods :
       - loadPlaylist (replace the existing playlist with a new one)
       - addPodcast (add a new podcast to the playlist.  order of the playlist should be maintained.
       - play()
       - stop()
       - next()
       - previous()
       - repeat()
       - showPlaylist()
       - removeFromPlaylist(Podcast)
*/
    private String appName;
    List<Podcast> podcasts;
    private boolean isPlaying;
    private int index;

    public PodcastingApp(String appName) {
        this.appName = appName;
        podcasts = new ArrayList<>();
        isPlaying = false;
        index = 0;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void loadPlaylist() { //(replace the existing playlist with a new one)
        // Function name provided and instructions are kind of confusing
        // So going to do what the instruction says by clearing existing playlist and starting fresh
        System.out.println("Loading playlist. Replacing playlist with a new one");
        podcasts.clear();
    }

    public void addPodcast(Podcast podcast) { //add a new podcast to the playlist.  order of the playlist should be maintained
        System.out.println("Podcast " + podcast.getTitle() + " is being added to playlist");
        podcasts.add(podcast);
    }

    public void play() {
        if (podcasts.isEmpty())
        {
            System.out.println("Playlist is empty! Add some podcasts to your playlist!");
        }
        else
        {
            isPlaying = true;
            System.out.println("Currently playing : " + podcasts.get(index).getTitle());
        }
    }

    public void stop() {
        if (podcasts.isEmpty())
        {
            System.out.println("Playlist is empty! Add some podcasts to your playlist!");
        }
        else if (isPlaying)
        {
            isPlaying = false;
            System.out.println("Stopping : " + podcasts.get(index).getTitle());
        }
        else
        {
            System.out.println("No podcast is playing at the moment! No podcast can be stopped!");
        }
    }

    public void next() {
        // If index+1 is at least size of playlist (at end of playlist) then reset index to 0
        if (index+1 >= podcasts.size())
        {
            index = 0;
        }
        else
        {
            index++;
        }
        System.out.println(podcasts.get(index).getTitle() + " will be played next if chosen");
    }

    public void previous() {
        // If index-1 is at most 0 then it is at start of playlist and index will be size-1
        if (index-1 <= 0)
        {
            index = podcasts.size()-1;
        }
        else
        {
            index--;
        }
        System.out.println(podcasts.get(index).getTitle() + " will be played next if chosen");
    }

    public void repeat() {
        System.out.println("Repeating podcast : " + podcasts.get(index).getTitle());
    }

    public void showPlaylist() {
        System.out.println(podcasts);
    }

    public void removeFromPlaylist(Podcast podcast) {
        System.out.println("Podcast " + podcast.getTitle() + " is being removed from playlist!");
        podcasts.remove(podcast);
    }

}


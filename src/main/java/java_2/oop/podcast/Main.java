package main.java.java_2.oop.podcast;

public class Main {

	public static void main(String[] args) {
		/*	Do the following tasks here in the main method, or in methods on this LambdaMain class.
			Create 9 podcasts.
			Create 3 Podcasting Apps
			Load 3 podcasts in each of the podcasting apps
			 - play and stop a podcast in one of the podcasting apps
			 - go to the next() and previous() podcasts in the 2nd podcasting app
			 - stop() the playing podcast on the 2nd podcasting app
			 - put a podcast on repeat() in the 3rd podcasting app.
       		 - show the playlist in the 3rd podcasting app
       		 - remove a podcast from the playlist in the 3rd podcasting app
		 */

		/* Create 9 podcasts. */
		Podcast offTopic = new Podcast("Off Topic", "Michael Jones", "02:30:00");
		Podcast faceJam = new Podcast("Face Jam", "Jordan Cwierz", "01:30:00");
		Podcast roosterTeeth = new Podcast("The RoosterTeeth Podcast", "Gustavo Sorola", "01:30:00");
		Podcast joeRoganExperience = new Podcast("The Joe Rogan Experience", "Joe Rogan", "02:30:00");
		Podcast needsAFriend = new Podcast("Conan 0'Brien Needs A Friend", "Team Coco", "01:00:00");
		Podcast MichelleObamaPodcast = new Podcast("The Michelle Obama Podcast", "Michelle Obama", "50:00");
		Podcast tedTalksDaily = new Podcast("TED Talks Daily", "TED", "20:00");
		Podcast officeLadies = new Podcast("Office Ladies", "Jenna Fischer", "01:00:00");
		Podcast redWeb = new Podcast("Red Web", "Trevor Collins", "01:00:00");

		/* Create 3 Podcasting Apps */
		PodcastingApp spotify = new PodcastingApp("Spotify");
		PodcastingApp pandora = new PodcastingApp("Pandora");
		PodcastingApp limeWire = new PodcastingApp("Lime Wire");

		/* Load 3 podcasts in each of the podcasting apps */
		spotify.addPodcast(offTopic);
		spotify.addPodcast(faceJam);
		spotify.addPodcast(roosterTeeth);
		pandora.addPodcast(joeRoganExperience);
		pandora.addPodcast(needsAFriend);
		pandora.addPodcast(MichelleObamaPodcast);
		limeWire.addPodcast(tedTalksDaily);
		limeWire.addPodcast(officeLadies);
		limeWire.addPodcast(redWeb);
		System.out.println();

		/* play and stop a podcast in one of the podcasting apps */
		spotify.play();
		spotify.stop();
		System.out.println();

		/* go to the next() and previous() podcasts in the 2nd podcasting app */
		pandora.next();
		pandora.previous();
		System.out.println();

		/* stop() the playing podcast on the 2nd podcasting app */
		pandora.stop();
		System.out.println();

		/* put a podcast on repeat() in the 3rd podcasting app. */
		limeWire.repeat();
		System.out.println();

		/* show the playlist in the 3rd podcasting app */
		limeWire.showPlaylist();
		System.out.println();

		/* remove a podcast from the playlist in the 3rd podcasting app */
		limeWire.removeFromPlaylist(redWeb);
	}
}

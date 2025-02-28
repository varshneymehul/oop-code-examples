package proxy;

import proxy.example.internet.Internet;
import proxy.example.internet.ProxyInternet;
import proxy.example.video.ProxyVideoDownloader;
import proxy.example.video.VideoDownloader;

public class MainApp {

    /*
     * Video Reference: https://youtu.be/TS5i-uPXLs8
     */
    public static void main(String[] args) {

        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("banned.com");

        System.out.println("==========================================");

        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("geekific");
        videoDownloader.getVideo("geekific");
        videoDownloader.getVideo("likeNsub");
        videoDownloader.getVideo("likeNsub");
        videoDownloader.getVideo("geekific");

    }

}

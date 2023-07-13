package org.example.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            "applicationContext.xml"
        );

//        Music musicBeen = context.getBean("musicBeen", Music.class);
//
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusicList();

        System.out.println(musicPlayer.getVolume());

//        System.out.println(testBeen.getName());

        context.close();
    }
}

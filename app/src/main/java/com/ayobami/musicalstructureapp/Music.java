package com.ayobami.musicalstructureapp;


public class Music {

    /** first text view element to be displayed based on the screen we are on */
    private String mTopText;

    /** first text view element to be displayed based on the screen we are on */
    private String mBottomText;

    /**
     * Create a new Music object.
     *
     * @param topText is the first text displayed e.g songName

     * @param bottomText is the second text to be displayed e.g artist
     */
    public Music(String topText, String bottomText) {
        mTopText = topText;
        mBottomText = bottomText;
    }

    /**
     * Get the first text
     */
    public String getTopText() {
        return mTopText;
    }

    /**
     * Get the bottom text
     */
    public String getBottomText() {
        return mBottomText;
    }


}

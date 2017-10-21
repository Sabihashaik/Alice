package com.sabihashaik.alice;

public class StoryPath {
    int StoryID;
    int mTop;
    int mBot;

    StoryPath(int newID,int newTop,int newBot ){
        StoryID=newID;
        mTop=newTop;
        mBot=newBot;
    }

    public int getBot() {
        return mBot;
    }

    public void setBot(int bot) {
        mBot = bot;
    }

    public int getTop() {
        return mTop;
    }

    public void setTop(int top) {
        mTop = top;
    }

    public int getStoryID() {
        return StoryID;
    }

    public void setStoryID(int storyID) {
        StoryID = storyID;
    }
}

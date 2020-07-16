package com.www.customkeyboard.ViewModel;

public class SavedWordModel {

    String word,remove;

    public SavedWordModel(String word, String remove) {
        this.word = word;
        this.remove = remove;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getRemove() {
        return remove;
    }

    public void setRemove(String remove) {
        this.remove = remove;
    }
}

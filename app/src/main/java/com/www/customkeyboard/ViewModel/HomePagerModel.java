package com.www.customkeyboard.ViewModel;

import com.www.customkeyboard.R;

public class HomePagerModel{

  private int title_id;
    private  int layout_id;




   public HomePagerModel(int title_id, int layout_id) {
        this.title_id = title_id;
        this.layout_id = layout_id;
    }

    public int getTitle_id() {
        return title_id;
    }

    public void setTitle_id(int title_id) {
        this.title_id = title_id;
    }

    public int getLayout_id() {
        return layout_id;
    }

    public void setLayout_id(int layout_id) {
        this.layout_id = layout_id;
    }
}

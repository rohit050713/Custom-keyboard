package com.www.customkeyboard.ViewModel;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
import android.os.Parcel;
import android.os.Parcelable;

public class ProfileModel implements Parcelable {
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
public class ProfileModel {
>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
    String num,title,subtitle;

    public ProfileModel(String num, String title, String subtitle) {
        this.num = num;
        this.title = title;
        this.subtitle = subtitle;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> e974059dd0de90e7d3240d726fc2feded53ec5eb
>>>>>>> e59287e117049324a3d5334b2c013d43692f6d1a
>>>>>>> d09538a264c42fde81a92a43fa207bd6ed210a7f
>>>>>>> 57b3d49b88b962e819237893ebf8b421bf067efb
>>>>>>> 02bb1b856fec1d032aa22613a7c3b54da93eb1d7
}

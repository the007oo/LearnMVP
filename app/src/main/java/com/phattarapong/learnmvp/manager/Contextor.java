package com.phattarapong.learnmvp.manager;

import android.content.Context;

/**
 * Created by Phattarapong on 9/26/2017.
 */

public class Contextor {

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    private Context context;

    private static final Contextor ourInstance = new Contextor();

    public static Contextor getInstance() {
        return ourInstance;
    }

    private Contextor() {
    }


}

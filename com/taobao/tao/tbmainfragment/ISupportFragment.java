package com.taobao.tao.tbmainfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.taobao.tao.tbmainfragment.anim.FragmentAnimator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface ISupportFragment {
    public static final int RESULT_OK = -1;
    public static final int SINGLETASK = 2;
    public static final int SINGLETOP = 1;
    public static final int STANDARD = 0;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes8.dex */
    public @interface LaunchMode {
    }

    Fragment asFragment();

    h getSupportDelegate();

    boolean isSupportVisible();

    FragmentAnimator onCreateFragmentAnimator();

    void onNewBundle(Bundle bundle);

    void onSupportInvisible();

    void onSupportVisible();
}

package com.taobao.android.launcher.bootstrap.tao;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes5.dex */
public interface ScheduleComposer {
    public static final String PARCEL_KEY_BOOT_IMAGE_AD = "EXTRA_COLD_START_BOOT_IMAGE_AD";
    public static final String PARCEL_KEY_STATE_REWROTE = "__STATE_REWROTE__";
    public static final int STATE_ACTIVITY_CREATED = 1;
    public static final int STATE_ACTIVITY_FIRST_FRAME = 4;
    public static final int STATE_ACTIVITY_FIRST_LOOPER = 5;
    public static final int STATE_ACTIVITY_FOURTH_LOOPER = 8;
    public static final int STATE_ACTIVITY_RESUMED = 3;
    public static final int STATE_ACTIVITY_SECOND_LOOPER = 6;
    public static final int STATE_ACTIVITY_STARTED = 2;
    public static final int STATE_ACTIVITY_THIRD_LOOPER = 7;
    public static final int STATE_DEFAULT = -1;
    public static final int STATE_DONE = 9;
    public static final int STATE_INTERRUPTED = 10;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface ComposerState {
    }

    void a(Application application, o oVar);

    void a(String str);

    boolean a();

    void onActivityPostCreated(Activity activity, Bundle bundle);

    void onActivityPreCreated(Activity activity, Bundle bundle);
}

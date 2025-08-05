package com.ut.share.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

/* loaded from: classes9.dex */
public interface IFlowOutHelper {
    void startActivity(Context context, Intent intent);

    void startActivityForResult(Activity activity, Intent intent, int i);

    void startActivityForResult(Fragment fragment, Intent intent, int i);
}

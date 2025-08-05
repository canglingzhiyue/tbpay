package com.taobao.android.launcher.bootstrap.tao.ability;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes5.dex */
public interface d {
    Activity a(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException;

    void a(Activity activity, Intent intent);

    void a(Activity activity, Bundle bundle, Runnable runnable);
}

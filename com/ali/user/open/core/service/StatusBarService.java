package com.ali.user.open.core.service;

import android.app.Activity;

/* loaded from: classes2.dex */
public interface StatusBarService {
    int getTransparentWebLayout();

    int getWebDialogLayout();

    int getWebLayout();

    void setStatusBar(Activity activity);
}

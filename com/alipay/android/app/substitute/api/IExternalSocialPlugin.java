package com.alipay.android.app.substitute.api;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes3.dex */
public interface IExternalSocialPlugin {

    /* loaded from: classes3.dex */
    public interface IFriendListCallback {
        void onResult(Bundle[] bundleArr, Bundle bundle);
    }

    void getLatestFriendList(Context context, Bundle bundle, IFriendListCallback iFriendListCallback);
}

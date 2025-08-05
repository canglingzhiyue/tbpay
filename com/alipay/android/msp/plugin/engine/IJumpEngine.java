package com.alipay.android.msp.plugin.engine;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes3.dex */
public interface IJumpEngine {
    void processScheme(String str);

    int processUri(Uri uri);

    boolean processUrl(Context context, String str);

    void startSmartDevicesApp();

    void startWalletApp(String str, Bundle bundle);
}

package com.taobao.android.detail.datasdk.protocol.adapter.core;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.io.Serializable;

/* loaded from: classes4.dex */
public interface INavAdapter extends Serializable {
    void navigateTo(Context context, Uri uri);

    void navigateTo(Context context, String str, Bundle bundle);

    void navigateTo(Context context, String str, Bundle bundle, int i);
}

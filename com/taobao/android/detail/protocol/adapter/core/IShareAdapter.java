package com.taobao.android.detail.protocol.adapter.core;

import android.app.Activity;
import android.content.Context;
import com.taobao.android.detail.protocol.model.share.ShareModel;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes4.dex */
public interface IShareAdapter extends Serializable {
    void copyToClipBoard(Context context, String str, String str2);

    void shareItem(Activity activity, ShareModel shareModel, HashMap<String, String> hashMap);

    @Deprecated
    void shareItem(Activity activity, String str, String str2, String str3, String str4);

    @Deprecated
    void shareItem(Activity activity, String str, String str2, String str3, String str4, HashMap<String, String> hashMap);
}

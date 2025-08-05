package com.taobao.taolive.sdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public abstract class x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-899206327);
    }

    public static String a(Context context) {
        Intent intent;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context}) : (!(context instanceof Activity) || (intent = ((Activity) context).getIntent()) == null || intent.getData() == null) ? "" : intent.getDataString();
    }
}

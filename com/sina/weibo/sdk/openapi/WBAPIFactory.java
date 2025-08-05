package com.sina.weibo.sdk.openapi;

import android.content.Context;
import tb.kge;

/* loaded from: classes4.dex */
public class WBAPIFactory {
    static {
        kge.a(-2125072498);
    }

    public static IWBAPI createWBAPI(Context context) {
        return new a(context);
    }
}

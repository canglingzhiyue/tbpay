package com.taobao.calendar.sdk.common;

import android.content.Context;
import tb.kge;

/* loaded from: classes6.dex */
public class Dp2PxUtil {
    private static float scale;

    static {
        kge.a(-557639233);
    }

    public static int dip2px(float f) {
        return (int) ((f * scale) + 0.5f);
    }

    public static void init(Context context) {
        try {
            scale = context.getResources().getDisplayMetrics().density;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int px2dip(float f) {
        return (int) ((f / scale) + 0.5f);
    }
}

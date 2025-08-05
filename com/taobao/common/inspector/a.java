package com.taobao.common.inspector;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1289196295);
    }

    public static float a(Intent intent, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2864bb6e", new Object[]{intent, new Integer(i)})).floatValue() : intent == null ? i : intent.getIntExtra("temperature", i * 10) / 10.0f;
    }

    public static float a(Intent intent, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2864b02b", new Object[]{intent, new Float(f)})).floatValue();
        }
        if (intent == null) {
            return f;
        }
        int intExtra = intent.getIntExtra("level", 0);
        int intExtra2 = intent.getIntExtra("scale", 0);
        return intExtra2 > 0 ? (intExtra * 100.0f) / intExtra2 : f;
    }
}

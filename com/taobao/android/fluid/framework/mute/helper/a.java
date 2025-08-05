package com.taobao.android.fluid.framework.mute.helper;

import android.content.Context;
import android.media.AudioManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.spz;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1202507919);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : b(context) > 0;
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        try {
            int streamVolume = ((AudioManager) context.getSystemService("audio")).getStreamVolume(3);
            spz.c("tab3MuteUpgrade", "当前音量:" + streamVolume);
            return streamVolume;
        } catch (Throwable unused) {
            return -1;
        }
    }
}

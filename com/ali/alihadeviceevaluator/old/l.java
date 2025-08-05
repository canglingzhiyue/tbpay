package com.ali.alihadeviceevaluator.old;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public int a(HardWareInfo hardWareInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5aea3420", new Object[]{this, hardWareInfo})).intValue();
        }
        float f = 7.0f;
        try {
            File file = new File("/sdcard/Android/");
            if (file.exists()) {
                long abs = Math.abs(System.currentTimeMillis() - file.lastModified()) / android.taobao.windvane.cache.d.DEFAULT_MAX_AGE;
                f = abs > 100 ? 5.0f : abs > 50 ? 0.0f : Math.round(10.0f - (((float) abs) * 0.2f));
            }
        } catch (Throwable unused) {
        }
        if (f < 0.0f) {
            f = 5.0f;
        }
        return (int) f;
    }
}

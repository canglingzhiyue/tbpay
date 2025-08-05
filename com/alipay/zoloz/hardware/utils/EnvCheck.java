package com.alipay.zoloz.hardware.utils;

import com.alipay.zoloz.hardware.camera.utils.RecordUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class EnvCheck {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static native String[] getProcessMaps();

    static {
        System.loadLibrary("env-check");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.alipay.zoloz.hardware.utils.EnvCheck$1] */
    public static void check(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de45bf25", new Object[]{new Boolean(z)});
        } else {
            new Thread() { // from class: com.alipay.zoloz.hardware.utils.EnvCheck.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    int i = 0;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String[] processMaps = EnvCheck.getProcessMaps();
                    RecordUtil recordUtil = RecordUtil.getInstance();
                    HashMap hashMap = new HashMap();
                    if (processMaps != null && processMaps.length > 0) {
                        int i2 = 0;
                        while (i < processMaps.length) {
                            String str = processMaps[i];
                            if (str != null && (str.contains("frida") || str.contains("Frida") || str.contains("xpose") || str.contains("Xpose") || str.startsWith("/data/app/") || str.startsWith("/data/data/"))) {
                                if (!z) {
                                    hashMap.put("content" + i2, processMaps[i]);
                                }
                                i2++;
                            }
                            if (z) {
                                hashMap.put("content" + i, processMaps[i]);
                            }
                            i++;
                        }
                        i = i2;
                    }
                    if (i > 0) {
                        i = 1;
                    }
                    hashMap.put("result", i + "");
                    recordUtil.write(RecordUtil.CHECK_PROC_MAPS, hashMap);
                }
            }.start();
        }
    }
}

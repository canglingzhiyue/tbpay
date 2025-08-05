package com.taobao.adaemon;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;
import tb.kat;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class MemArt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static native int memArtNative();

    static {
        kge.a(153488523);
        System.loadLibrary("memArt");
    }

    public static void a(final Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9e64", new Object[]{context, new Long(j)});
        } else {
            c.b(new Runnable() { // from class: com.taobao.adaemon.MemArt.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (l.e(context)) {
                        e.b("MemArt", "mem art, fg return", new Object[0]);
                    } else {
                        int memArtNative = MemArt.memArtNative();
                        if (memArtNative == 0) {
                            kat.a(k.MODULE_NAME, k.f, "success", 1.0d);
                            g.b().a(3, true);
                        } else {
                            String str = k.f;
                            kat.a(k.MODULE_NAME, str, memArtNative + "", mto.a.GEO_NOT_SUPPORT);
                        }
                        e.b("MemArt", "memArtCleanDex -> " + memArtNative, new Object[0]);
                    }
                }
            }, j, TimeUnit.MILLISECONDS);
        }
    }
}

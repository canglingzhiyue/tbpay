package com.android.taobao.zstd;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.ihq;
import tb.ihw;
import tb.ihy;
import tb.ihz;

/* loaded from: classes3.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static AtomicBoolean f6413a;
    private static boolean b;

    static {
        try {
            Class.forName("tb.ihq");
            b = true;
            f6413a = new AtomicBoolean(false);
        } catch (ClassNotFoundException unused) {
            b = false;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (!b) {
            return true;
        }
        if (!f6413a.get()) {
            ihq.a().a("zstd", new ihy() { // from class: com.android.taobao.zstd.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ihy
                public void onLoadFinished(ihz ihzVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6344c753", new Object[]{this, ihzVar});
                    } else {
                        d.f6413a.set(ihzVar.g());
                    }
                }
            });
        }
        return f6413a.get();
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        if (!b) {
            return null;
        }
        ihw a2 = ihq.b().a("zstd");
        if (!a2.g()) {
            return null;
        }
        return a2.b();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        try {
            if (b) {
                if (!f6413a.get()) {
                    f6413a.set(ihq.a().b("zstd").g());
                }
                return f6413a.get();
            }
            System.loadLibrary("zstd");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

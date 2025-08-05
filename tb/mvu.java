package tb;

import com.alibaba.android.icart.core.performance.cache.b;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class mvu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1280525245);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!jqi.a("iCart", "preloadCachedFirstPageItemPictures", true)) {
            d();
        } else {
            jqh.a(new Runnable() { // from class: tb.mvu.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        b.a();
                    } catch (Exception e) {
                        bed.a("loadCachedFirstPageItemPictures", e.getMessage());
                    }
                }
            });
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else {
            b.b();
        }
    }
}

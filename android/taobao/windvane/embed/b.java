package android.taobao.windvane.embed;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.e;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f1588a;

    static {
        kge.a(-1699064318);
        f1588a = false;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        synchronized (b.class) {
            if (f1588a) {
                return;
            }
            f1588a = true;
            try {
                a.a("widget", (Class<? extends BaseEmbedView>) Class.forName("com.alibaba.triver.cannal_engine.scene.TRWidgetWVEmbedView"), true);
                a.a("demo", (Class<? extends BaseEmbedView>) EmbedViewDemo.class, true);
                a.a("empty", (Class<? extends BaseEmbedView>) Empty.class, true);
            } catch (Exception e) {
                RVLLevel rVLLevel = RVLLevel.Error;
                e.a(rVLLevel, "WindVane/WVEmbedInitializer", "failed to register widget component. " + e);
            }
        }
    }
}

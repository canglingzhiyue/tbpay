package tb;

import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.intelligence.IIntelligenceService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;

/* loaded from: classes5.dex */
public class jct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1980128791);
    }

    private static jqr b(sjb sjbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jqr) ipChange.ipc$dispatch("36a3138d", new Object[]{sjbVar}) : sjbVar.f33621a;
    }

    public static void a(FluidContext fluidContext, sjb sjbVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9d37ed", new Object[]{fluidContext, sjbVar, aVar});
        } else if (!a()) {
        } else {
            jqr jqrVar = new jqr(fluidContext);
            sjbVar.f33621a = jqrVar;
            try {
                jqrVar.a(aVar.a().E().a(), aVar.a().E());
            } catch (Throwable th) {
                spz.a("LruFeedBack", "", th);
            }
        }
    }

    public static void a(sjb sjbVar, int i, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e706c0f6", new Object[]{sjbVar, new Integer(i), aVar});
            return;
        }
        jqr b = b(sjbVar);
        if (b == null) {
            return;
        }
        try {
            b.a(aVar.a().E().a(), i);
        } catch (Throwable th) {
            spz.a("LruFeedBack", "", th);
        }
    }

    public static void a(sjb sjbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed5860d", new Object[]{sjbVar});
            return;
        }
        jqr b = b(sjbVar);
        if (b == null) {
            return;
        }
        b.a(false);
        b.a();
    }

    public static LruCache<String, jcu> a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("27c206cb", new Object[]{fluidContext});
        }
        if (!a()) {
            return null;
        }
        return ((IIntelligenceService) fluidContext.getService(IIntelligenceService.class)).getConfig().g();
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : oec.a((Object) FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("enableVideoFeedback", "false"), false);
    }
}

package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;

/* loaded from: classes5.dex */
public class sms {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1086182926);
    }

    public static void a(FluidContext fluidContext, a.c cVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2df10ed3", new Object[]{fluidContext, cVar});
            return;
        }
        spz.c("RecordDisableHelper", "changeRecordFlags");
        if (cVar == null || cVar.i() == null || cVar.i().config == null || !cVar.i().config.disableRecord) {
            z = false;
        }
        a(fluidContext, z);
    }

    public static void a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc4079a", new Object[]{fluidContext});
            return;
        }
        spz.c("RecordDisableHelper", "clearRecordFlags");
        a(fluidContext, false);
    }

    private static void a(FluidContext fluidContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68bd9e7a", new Object[]{fluidContext, new Boolean(z)});
        } else if (!a()) {
        } else {
            Context context = fluidContext.getContext();
            if (!(context instanceof Activity)) {
                return;
            }
            if (z) {
                spz.c("RecordDisableHelper", "禁止录屏");
                ((Activity) context).getWindow().addFlags(8192);
                return;
            }
            spz.c("RecordDisableHelper", "允许录屏");
            ((Activity) context).getWindow().clearFlags(8192);
        }
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : oeb.a("ShortVideo.enablePrivacyRecord", true);
    }
}

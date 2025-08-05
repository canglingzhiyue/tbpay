package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.mute.helper.f;
import com.taobao.android.layoutmanager.adapter.impl.p;

/* loaded from: classes5.dex */
public class hhx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1396767866);
    }

    public static void a(FluidContext fluidContext, psy psyVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a327940f", new Object[]{fluidContext, psyVar, new Integer(i)});
        } else if (!d() || psyVar == null) {
        } else {
            spz.c("VideoCardPrePlayManager", "videoAppearPlay,静音起播");
            psyVar.a(false, true);
        }
    }

    public static boolean a(FluidContext fluidContext, snv snvVar, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39280409", new Object[]{fluidContext, snvVar, new Boolean(z)})).booleanValue();
        }
        if (!d() || snvVar == null) {
            return false;
        }
        if (!z && !f.g(fluidContext)) {
            z2 = false;
        }
        spz.c("VideoCardPrePlayManager", "setMediaMute,设置播放器静音:" + z);
        snvVar.a(z2);
        return z;
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableVideoAppearPlay", true);
    }

    private static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        boolean z = p.b() == 0;
        spz.c("VideoCardPrePlayManager", "highDevice:" + z);
        return z && b();
    }
}

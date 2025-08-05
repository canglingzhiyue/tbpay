package tb;

import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.ut.mini.core.WVUserTrack;

/* loaded from: classes.dex */
public class rqe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(320767683);
    }

    public static void registerWindvane(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942ed1e0", new Object[]{new Boolean(z)});
        } else if (!rqd.bWindvaneExtend) {
            apr.c("UTAnalytics", "user disable WVTBUserTrack ");
        } else if (z) {
            apr.c("UTAnalytics", "Has registered WVTBUserTrack plugin,not need to register again! ");
        } else {
            Class<? extends e> cls = null;
            try {
                rqm multiProcessAdapter = rqn.getMultiProcessAdapter();
                if (multiProcessAdapter != null) {
                    if (multiProcessAdapter.isUiSubProcess()) {
                        cls = multiProcessAdapter.getSubProcessWVApiPluginClass();
                    } else {
                        cls = WVUserTrack.class;
                    }
                }
                if (cls == null) {
                    cls = WVUserTrack.class;
                }
                q.a("WVTBUserTrack", cls, true);
                apr.b("UTAnalytics", "register WVTBUserTrack Success");
            } catch (Throwable th) {
                apr.e("UTAnalytics", TLogTracker.SCENE_EXCEPTION, th.toString());
            }
        }
    }
}

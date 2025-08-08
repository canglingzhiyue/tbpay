package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.motu.tbrest.d;
import com.alibaba.ut.abtest.internal.util.b;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.n;
import com.alibaba.ut.abtest.track.TrackId;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.mini.module.trackerlistener.a;

/* loaded from: classes.dex */
public class bwu extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1376725310);
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public String trackerListenerName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1d8246a2", new Object[]{this}) : "Yixiu";
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void updatePageName(UTTracker uTTracker, Object obj, String str) {
        TrackId a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fa4c9a", new Object[]{this, uTTracker, obj, str});
            return;
        }
        try {
            if (!cex.a().j().m()) {
                return;
            }
            h.a("UserTrackPageLifeCycleListener", "updatePageName. pageName=" + str + ", pageObject=" + obj);
            if (obj == null || StringUtils.isEmpty(str) || (a2 = cex.a().k().a(str, 2001, null, null, null, null, null)) == null) {
                return;
            }
            String a3 = cex.a().k().a(a2, 2001, UTAnalytics.getInstance().getDefaultTracker().getPageProperties(obj));
            if (StringUtils.isEmpty(a3)) {
                return;
            }
            UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(obj, a3);
            d.a().m = obj.getClass().getSimpleName();
            d.a().n = a3;
            h.a("UserTrackPageLifeCycleListener", "track, pageName=" + n.a(str) + ", uttrack=" + a3);
            b.b(b.TRACK_PAGE_COUNTER, "updatePageName");
        } catch (Throwable th) {
            b.a("UserTrackPageLifeCycleListener.updatePageName", th);
        }
    }
}

package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.editionswitcher.b;
import com.taobao.tao.Globals;
import com.taobao.tao.image.d;
import com.taobao.tao.log.TLog;
import com.taobao.zcache.n;

/* loaded from: classes6.dex */
public class jin {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_TAG = "tmghklocal";

    private jin() {
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            TLog.logd(MODULE_TAG, jin.class.getSimpleName(), "launchTmgBundleBeforeRender");
            jip.a().a(Globals.getApplication());
        } catch (Exception e) {
            d.a("OverseaManager", "launchTmgBundleBeforeRender ex", e.toString());
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        TLog.logd(MODULE_TAG, jin.class.getSimpleName(), "launchTmgBundleRendered");
        d();
    }

    private static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        try {
            PositionInfo b = b.b(Globals.getApplication());
            Class.forName("com.taobao.zcache.n");
            n.a(jis.a(b.countryCode));
        } catch (Exception unused) {
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        try {
            TLog.logd(MODULE_TAG, jin.class.getSimpleName(), "editionChanged");
            jip.a().b(Globals.getApplication());
            d();
        } catch (Exception e) {
            d.a("OverseaManager", "editionChanged ex", e.toString());
        }
    }
}

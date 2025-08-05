package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.card.cards.web.a;
import java.util.Map;

/* loaded from: classes5.dex */
public class ljp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1876805287);
    }

    public static void a(ljo ljoVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ebb891", new Object[]{ljoVar, str});
        } else {
            a(ljoVar, str, null);
        }
    }

    public static void a(ljo ljoVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b81dced4", new Object[]{ljoVar, str, map});
        } else if (ljoVar == null) {
        } else {
            ljoVar.a(str, map);
        }
    }

    public static long a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ee746e9", new Object[]{aVar})).longValue();
        }
        long j = 0;
        if (aVar == null) {
            return 0L;
        }
        ljo U = aVar.U();
        if (U != null) {
            j = U.c();
        }
        spz.c("[webcomponent_trackerUtils]", "getGameDuration:" + j);
        return j;
    }

    public static void a(ljo ljoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e98287", new Object[]{ljoVar});
        } else if (ljoVar == null) {
        } else {
            ljoVar.b();
            spz.c("[webcomponent_trackerUtils]", "clearGameDuration");
        }
    }
}

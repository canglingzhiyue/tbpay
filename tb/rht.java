package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taolive.sdk.monitor.b;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class rht {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(219981050);
    }

    public static void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("902c638f", new Object[]{cVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("gl_opt", "" + a.i());
        hashMap.put("deviceLevel", "" + com.taobao.taolive.room.service.c.M());
        String str = "1";
        hashMap.put("glNewPage", a.a(cVar) ? str : "0");
        if (!a.w()) {
            str = "0";
        }
        hashMap.put("cdnCache", str);
        b.b().a("tbl_gl_scroll2_p", hashMap);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            b.b().a("tbl_gl_scroll2_p");
        }
    }
}

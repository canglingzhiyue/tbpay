package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.homepage.d;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import com.taobao.tao.topmultitab.c;

/* loaded from: classes8.dex */
public class ovs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1584881901);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        b();
        c.a().G();
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            a(c());
        }
    }

    private static String c() {
        AwesomeGetContainerInnerData c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        String l = oqc.a().l();
        ope f = d.f(l);
        if (f != null && (c = f.c(l)) != null && c.ext != null) {
            return c.ext.getString("clickBack");
        }
        return null;
    }

    private static void a(String str) {
        AwesomeGetContainerInnerData c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        String m = oqc.a().m();
        ope f = d.f(m);
        if (f == null || (c = f.c(m)) == null || c.ext == null) {
            return;
        }
        c.ext.put("clickBack", (Object) str);
    }
}

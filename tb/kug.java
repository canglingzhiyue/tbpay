package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.j;
import com.taobao.tao.topmultitab.c;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes7.dex */
public class kug {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static kug f30325a;

    static {
        kge.a(-770528266);
    }

    private kug() {
    }

    public static kug a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kug) ipChange.ipc$dispatch("f070c81", new Object[0]);
        }
        if (f30325a == null) {
            f30325a = new kug();
        }
        return f30325a;
    }

    public void a(lbq lbqVar, kuh kuhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e99c0d05", new Object[]{this, lbqVar, kuhVar, new Boolean(z)});
            return;
        }
        lgt.a(lgt.OUT_LINK_TRIGGER, null);
        if (lbqVar == null || kuhVar == null) {
            return;
        }
        a(lbqVar, kuhVar.e);
        b(lbqVar, kuhVar, z);
    }

    private void a(lbq lbqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a36a63c7", new Object[]{this, lbqVar, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(kuh.ALI_TRACK_ID, str);
            kss.a(lbqVar.getCurActivity(), hashMap);
        }
    }

    private void b(lbq lbqVar, kuh kuhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7021c7a4", new Object[]{this, lbqVar, kuhVar, new Boolean(z)});
        } else if (kuhVar == null || kuhVar.f30326a == null) {
        } else {
            c.a().l();
            lgt.a(lgt.OUT_LINK_PARSE_PARAMS_END, null);
            String str = kuhVar.f30326a;
            char c = 65535;
            if (str.hashCode() == 108388903 && str.equals("recmd")) {
                c = 0;
            }
            if (c == 0) {
                ojg.a(kuhVar, z);
            } else if (!b()) {
            } else {
                List<String> F = c.a().F();
                String str2 = kuhVar.f30326a;
                if (a(F, str2)) {
                    c.a().a(str2);
                    c.a().a(kuhVar.f30326a, kuhVar.d, kuhVar.b);
                    return;
                }
                a(kuhVar);
            }
        }
    }

    private boolean a(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c6e0ee7", new Object[]{this, list, str})).booleanValue() : !StringUtils.isEmpty(str) && list.contains(str);
    }

    private void a(kuh kuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1cc7dda", new Object[]{this, kuhVar});
            return;
        }
        IHomeSubTabController z = c.a().z();
        if (z == null) {
            return;
        }
        String a2 = c.a().a(z);
        if (StringUtils.isEmpty(a2)) {
            return;
        }
        c.a().a(a2, kuhVar.d, kuhVar.b);
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        String a2 = j.a("outLinkToSubscribeEnable", "true");
        return !StringUtils.isEmpty(a2) && a2.equalsIgnoreCase("true");
    }
}

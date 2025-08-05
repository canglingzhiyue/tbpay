package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.datasource.c;
import com.ut.mini.l;
import java.util.Map;

/* loaded from: classes8.dex */
public class nwt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static nwt f31818a;

    public c a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("a1fa42cd", new Object[]{this, map});
        }
        return null;
    }

    static {
        kge.a(1501632345);
        kge.a(-1452874305);
        f31818a = new nwt();
    }

    public static nwt a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nwt) ipChange.ipc$dispatch("f0872b3", new Object[0]) : f31818a;
    }

    private nwt() {
        nti.a(l.getInstance().getCurrentPageName(), nwt.class.getSimpleName());
    }
}

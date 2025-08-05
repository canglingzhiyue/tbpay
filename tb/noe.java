package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.m;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class noe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f31609a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public String f;
    public Map<String, String> g;
    public List<noe> h;
    public Map<String, String> i;

    static {
        kge.a(-1820706502);
    }

    public int a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821d35f", new Object[]{this, new Boolean(z)})).intValue();
        }
        m mVar = m.INSTANCE;
        return m.a(m.a.INSTANCE.c(), z);
    }
}

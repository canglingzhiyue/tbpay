package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class jmj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile jmj b;

    /* renamed from: a  reason: collision with root package name */
    private boolean f29631a = false;

    static {
        kge.a(-1955804887);
        b = null;
    }

    private jmj() {
    }

    public static jmj a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jmj) ipChange.ipc$dispatch("f067a77", new Object[0]);
        }
        if (b == null) {
            synchronized (jmj.class) {
                if (b == null) {
                    b = new jmj();
                }
            }
        }
        return b;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f29631a;
    }

    public void a(MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75d0bd46", new Object[]{this, mtopBusiness});
        } else if (!b() || !jmi.b()) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(adk.KEY_GREY, "true");
            mtopBusiness.mo1297headers((Map<String, String>) hashMap);
        }
    }
}

package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.aa;

/* loaded from: classes8.dex */
public class oej {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f31973a;
    public float b = -1.0f;
    public long c = -1;
    public oei d;
    public oeh e;
    public aa f;

    static {
        kge.a(-113208926);
    }

    public static oej a(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oej) ipChange.ipc$dispatch("ce972962", new Object[]{aaVar});
        }
        oej oejVar = new oej();
        oejVar.f = aaVar;
        oejVar.f31973a = 0;
        oejVar.c = 0L;
        oejVar.e = oeh.a(aaVar);
        return oejVar;
    }
}

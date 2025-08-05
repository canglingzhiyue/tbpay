package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes8.dex */
public class pmk implements pmi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f32760a;
    private pmi b;
    private pmj c;

    static {
        kge.a(890756139);
        kge.a(-1976708749);
        f32760a = pmk.class.getSimpleName();
    }

    public void a(pmi pmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e4714c", new Object[]{this, pmiVar});
        } else {
            this.b = pmiVar;
        }
    }

    public void a(pmj pmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e4e5ab", new Object[]{this, pmjVar});
        } else {
            this.c = pmjVar;
        }
    }

    @Override // tb.pmi
    public String a(String str, String str2, String str3) {
        pmj pmjVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3});
        }
        String str4 = null;
        pmi pmiVar = this.b;
        if (pmiVar != null) {
            str4 = pmiVar.a(str, str2, str3);
        }
        if (pav.INSTANCE.a() && (pmjVar = this.c) != null) {
            pmjVar.a(str, str2, str4 != null ? str4 : "", str3);
        }
        return str4;
    }

    @Override // tb.pmi
    public String b(String str, String str2, String str3) {
        pmj pmjVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87942679", new Object[]{this, str, str2, str3});
        }
        String str4 = null;
        pmi pmiVar = this.b;
        if (pmiVar != null) {
            str4 = pmiVar.b(str, str2, str3);
        }
        if (pav.INSTANCE.a() && (pmjVar = this.c) != null) {
            pmjVar.a(str, str2, str4 != null ? str4 : "", str3);
        }
        return str4;
    }

    @Override // tb.pmi
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        pmi pmiVar = this.b;
        if (pmiVar == null) {
            return;
        }
        pmiVar.a(str, map);
    }
}

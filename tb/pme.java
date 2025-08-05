package tb;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class pme implements pmf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private pmf f32759a;
    private pmg b;

    static {
        kge.a(-487185822);
        kge.a(668129862);
    }

    public void a(pmf pmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e3142f", new Object[]{this, pmfVar});
        } else {
            this.f32759a = pmfVar;
        }
    }

    public void a(pmg pmgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e3888e", new Object[]{this, pmgVar});
        } else {
            this.b = pmgVar;
        }
    }

    @Override // tb.pmf
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            return;
        }
        pmf pmfVar = this.f32759a;
        if (pmfVar == null) {
            return;
        }
        pmfVar.a(str, obj);
    }

    @Override // tb.pmf
    public String a(String str, String str2, String str3, String str4) {
        pmg pmgVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfa4f210", new Object[]{this, str, str2, str3, str4});
        }
        pmf pmfVar = this.f32759a;
        if (pmfVar == null) {
            return null;
        }
        String a2 = pmfVar.a(str, str2, str3, str4);
        if (pav.INSTANCE.a() && (pmgVar = this.b) != null) {
            pmgVar.a(str, str2, str3, str4, a2);
        }
        VariationSet activate = UTABTest.activate(str, str2, null, null);
        if (activate != null) {
            tjy.a("tblive", activate.getExperimentId(), activate.getExperimentReleaseId(), activate.getExperimentBucketId());
        }
        return a2;
    }

    @Override // tb.pmf
    public String b(String str, String str2, String str3, String str4) {
        pmg pmgVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f6525af", new Object[]{this, str, str2, str3, str4});
        }
        pmf pmfVar = this.f32759a;
        if (pmfVar == null) {
            return null;
        }
        String b = pmfVar.b(str, str2, str3, str4);
        if (pav.INSTANCE.a() && (pmgVar = this.b) != null) {
            pmgVar.a(str, str2, str3, str4, b);
        }
        return b;
    }
}

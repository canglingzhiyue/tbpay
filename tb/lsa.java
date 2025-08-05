package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.BehaviR;
import com.taobao.android.behavir.solution.BHRSolution;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class lsa implements BHRSolution<HashMap<String, Object>, Map<String, Object>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ljs f30883a;
    private a b;

    /* loaded from: classes7.dex */
    public interface a {
        boolean a();
    }

    static {
        kge.a(1223230581);
        kge.a(1685160846);
    }

    public HashMap<String, Object> a(dqi dqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("b2ee1e3f", new Object[]{this, dqiVar});
        }
        return null;
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public /* bridge */ /* synthetic */ void a(dqi dqiVar, Map<String, Object> map) {
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public void a(dqi dqiVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ab0c5a", new Object[]{this, dqiVar, runnable});
        }
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public Map<String, String> h(dqi dqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c3eb3e58", new Object[]{this, dqiVar});
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.HashMap<java.lang.String, java.lang.Object>] */
    @Override // com.taobao.android.behavir.solution.BHRSolution
    public /* synthetic */ HashMap<String, Object> i(dqi dqiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("465affce", new Object[]{this, dqiVar}) : a(dqiVar);
    }

    public lsa(ljs ljsVar, a aVar) {
        this.f30883a = ljsVar;
        BehaviR.getInstance().registerSolution(e(), this);
        ldf.d("SmartLoadingSolution", "registerSolution");
        this.b = aVar;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.b != null) {
            this.b = null;
        }
        BehaviR.getInstance().unRegisterSolution(e(), this);
        ldf.d("SmartLoadingSolution", "unRegisterSolution");
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public boolean f(dqi dqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e31c865", new Object[]{this, dqiVar})).booleanValue();
        }
        a aVar = this.b;
        if (aVar != null) {
            return aVar.a();
        }
        return false;
    }

    private String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        return this.f30883a.a().a() + "_NGSmartLoadingSolution";
    }
}

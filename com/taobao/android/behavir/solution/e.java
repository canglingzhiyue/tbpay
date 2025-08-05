package com.taobao.android.behavir.solution;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.dqi;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class e<O, R> implements BHRSolution<O, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1657387901);
        kge.a(1685160846);
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public final void a(dqi dqiVar, R r) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a96d8b8", new Object[]{this, dqiVar, r});
        }
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public final void a(dqi dqiVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ab0c5a", new Object[]{this, dqiVar, runnable});
        }
    }

    public abstract boolean a(f fVar);

    public abstract O b(f fVar);

    public abstract Map<String, String> c(f fVar);

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public final boolean f(dqi dqiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8e31c865", new Object[]{this, dqiVar})).booleanValue() : a((f) dqiVar);
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public final O i(dqi dqiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (O) ipChange.ipc$dispatch("465affce", new Object[]{this, dqiVar}) : b((f) dqiVar);
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public final Map<String, String> h(dqi dqiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("c3eb3e58", new Object[]{this, dqiVar}) : c((f) dqiVar);
    }
}

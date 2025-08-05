package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.solution.BHRSolution;
import com.taobao.android.fluid.business.intelligence.IIntelligenceService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.layoutmanager.module.BehaviXModule;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import java.util.Map;

/* loaded from: classes5.dex */
public class jcq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private jck f29457a;

    static {
        kge.a(-581063785);
    }

    public void a(final FluidContext fluidContext, final ab abVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfd7d0f5", new Object[]{this, fluidContext, abVar, str, str2});
            return;
        }
        if (str != null && str.trim().length() > 0) {
            BehaviXModule.a(abVar, str, new BHRSolution() { // from class: tb.jcq.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.behavir.solution.BHRSolution
                public void a(dqi dqiVar, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9a96d8b8", new Object[]{this, dqiVar, obj});
                    }
                }

                @Override // com.taobao.android.behavir.solution.BHRSolution
                public boolean a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                    }
                    return true;
                }

                @Override // com.taobao.android.behavir.solution.BHRSolution
                public boolean c() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
                    }
                    return true;
                }

                @Override // com.taobao.android.behavir.solution.BHRSolution
                public boolean f(dqi dqiVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("8e31c865", new Object[]{this, dqiVar})).booleanValue();
                    }
                    return true;
                }

                @Override // com.taobao.android.behavir.solution.BHRSolution
                public Map<String, String> h(dqi dqiVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Map) ipChange2.ipc$dispatch("c3eb3e58", new Object[]{this, dqiVar});
                    }
                    return null;
                }

                @Override // com.taobao.android.behavir.solution.BHRSolution
                public Object i(dqi dqiVar) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("465affce", new Object[]{this, dqiVar}) : ((IIntelligenceService) fluidContext.getService(IIntelligenceService.class)).getBehaviorInput(true);
                }

                @Override // com.taobao.android.behavir.solution.BHRSolution
                public Context b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Context) ipChange2.ipc$dispatch("9ee3f7e1", new Object[]{this}) : abVar.l();
                }

                @Override // com.taobao.android.behavir.solution.BHRSolution
                public void a(dqi dqiVar, Runnable runnable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a2ab0c5a", new Object[]{this, dqiVar, runnable});
                    } else {
                        oec.a(runnable);
                    }
                }
            });
        }
        if (str2 != null && str2.trim().length() > 0) {
            BehaviXModule.a(abVar, str2, new BHRSolution() { // from class: tb.jcq.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.behavir.solution.BHRSolution
                public void a(dqi dqiVar, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9a96d8b8", new Object[]{this, dqiVar, obj});
                    }
                }

                @Override // com.taobao.android.behavir.solution.BHRSolution
                public boolean a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                    }
                    return true;
                }

                @Override // com.taobao.android.behavir.solution.BHRSolution
                public boolean c() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
                    }
                    return true;
                }

                @Override // com.taobao.android.behavir.solution.BHRSolution
                public boolean f(dqi dqiVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("8e31c865", new Object[]{this, dqiVar})).booleanValue();
                    }
                    return true;
                }

                @Override // com.taobao.android.behavir.solution.BHRSolution
                public Map<String, String> h(dqi dqiVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Map) ipChange2.ipc$dispatch("c3eb3e58", new Object[]{this, dqiVar});
                    }
                    return null;
                }

                @Override // com.taobao.android.behavir.solution.BHRSolution
                public Object i(dqi dqiVar) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("465affce", new Object[]{this, dqiVar}) : ((IIntelligenceService) fluidContext.getService(IIntelligenceService.class)).getBehaviorInput(false);
                }

                @Override // com.taobao.android.behavir.solution.BHRSolution
                public Context b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Context) ipChange2.ipc$dispatch("9ee3f7e1", new Object[]{this}) : abVar.l();
                }

                @Override // com.taobao.android.behavir.solution.BHRSolution
                public void a(dqi dqiVar, Runnable runnable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a2ab0c5a", new Object[]{this, dqiVar, runnable});
                    } else {
                        oec.a(runnable);
                    }
                }
            });
        }
        this.f29457a.b();
        ((sma) abVar.H()).registerMessageHandler(this.f29457a);
    }

    public void a(jck jckVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef1b5b46", new Object[]{this, jckVar});
        } else {
            this.f29457a = jckVar;
        }
    }
}

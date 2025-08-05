package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.bridge.MUSThreadStrategy;
import com.taobao.android.weex_framework.bridge.c;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.j;
import com.taobao.android.weex_framework.util.o;

/* loaded from: classes6.dex */
public final class jvc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jvb f29803a;

    static {
        kge.a(1087289122);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        }
    }

    public static /* synthetic */ jvb a(jvc jvcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvb) ipChange.ipc$dispatch("dd9e86af", new Object[]{jvcVar}) : jvcVar.f29803a;
    }

    public jvc(jvb jvbVar) {
        this.f29803a = jvbVar;
    }

    public <T extends MUSModule> Object a(final T t, final c<T> cVar, final MUSValue[] mUSValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dbfeead", new Object[]{this, t, cVar, mUSValueArr});
        }
        final Object executeContext = this.f29803a.getExecuteContext();
        if (cVar.a() == MUSThreadStrategy.JS) {
            if (j.a()) {
                throw new IllegalStateException("invokeModuleMethod from none-js thread");
            }
            try {
                return cVar.a((p) this.f29803a, executeContext, (Object) t, mUSValueArr);
            } catch (Exception e) {
                g.c(String.format("[CallMUSModule] call %s#%s() err", t.getModuleName(), cVar), e);
                return null;
            }
        }
        this.f29803a.postTaskToMain(new o() { // from class: tb.jvc.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                try {
                    cVar.a((p) jvc.a(jvc.this), executeContext, (Object) t, mUSValueArr);
                } catch (Exception e2) {
                    g.c(String.format("[CallMUSModule] call %s#%s() err", t.getModuleName(), cVar), e2);
                }
            }
        });
        return null;
    }
}

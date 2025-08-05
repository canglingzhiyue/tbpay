package tb;

import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.core.f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class knj implements juy, jwf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f30186a;
    private final Map<String, f<juy>> b = new HashMap();

    static {
        kge.a(254234290);
        kge.a(-1603213227);
        kge.a(-1582692462);
    }

    public knj(FluidContext fluidContext) {
        this.f30186a = fluidContext;
    }

    @Override // tb.jwf
    public void addMessageListener(String str, juy juyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd87fe2d", new Object[]{this, str, juyVar});
        } else if (str == null || juyVar == null) {
        } else {
            f<juy> fVar = this.b.get(str);
            if (fVar == null) {
                fVar = new f<>();
                this.b.put(str, fVar);
            }
            fVar.a(juyVar);
        }
    }

    @Override // tb.jwf
    public void removeMessageListener(String str, juy juyVar) {
        f<juy> fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c23732a", new Object[]{this, str, juyVar});
        } else if (str == null || juyVar == null || (fVar = this.b.get(str)) == null) {
        } else {
            fVar.c(juyVar);
        }
    }

    @Override // tb.juy
    public void a(spy spyVar) {
        List<juy> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff34879c", new Object[]{this, spyVar});
            return;
        }
        f<juy> fVar = this.b.get(spyVar.c);
        if (fVar == null || (a2 = fVar.a()) == null || a2.isEmpty()) {
            return;
        }
        spz.c("MessageListenerManager", "消息：" + spyVar.c + " 监听器数量：" + a2.size());
        for (juy juyVar : a2) {
            try {
                juyVar.a(spyVar);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f30186a, juyVar, b.c.EVENT_ON_MESSAGE, e);
            }
        }
    }
}

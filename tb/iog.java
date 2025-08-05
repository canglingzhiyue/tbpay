package tb;

import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.constant.a;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;

/* loaded from: classes4.dex */
public class iog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public q f29185a;

    static {
        kge.a(-410291569);
    }

    public iog(q qVar) {
        this.f29185a = qVar;
        emu.a("com.taobao.android.detail.core.standard.mainscreen.implementor.BaseImplementor");
    }

    public q a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("3c3eac17", new Object[]{this}) : this.f29185a;
    }

    public Object[] b(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("9b06e", new Object[]{this, runtimeAbilityParamArr});
        }
        if (runtimeAbilityParamArr == null) {
            return null;
        }
        for (RuntimeAbilityParam runtimeAbilityParam : runtimeAbilityParamArr) {
            if (a.DX_EVENT_EXTRA_ARGS.equals(runtimeAbilityParam.getKey())) {
                Object value = runtimeAbilityParam.getValue();
                if (value instanceof Object[]) {
                    return (Object[]) value;
                }
            }
        }
        return null;
    }
}

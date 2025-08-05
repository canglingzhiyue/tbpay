package tb;

import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.annotation.AURAInputField;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.umf.taobao.adapter.widget.floatview.NUTFloatViewManager;
import com.alibaba.android.umf.taobao.adapter.widget.floatview.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

@AURAExtensionImpl(code = "aura.impl.event.dismissFloat")
/* loaded from: classes2.dex */
public final class azo extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "dismissFloat";

    /* renamed from: a  reason: collision with root package name */
    private final String f25717a = "floatView";
    @AURAInputField(name = "floatView", required = false)
    private a b;

    static {
        kge.a(1272577004);
    }

    public static /* synthetic */ Object ipc$super(azo azoVar, String str, Object... objArr) {
        if (str.hashCode() == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : EVENT_TYPE;
    }

    @Override // tb.arv, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            super.onCreate(qVar, fVar);
        }
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        f();
        this.b = (a) c().a(this, "floatView", a.class);
        a aVar = this.b;
        if (aVar == null) {
            arc.a().c("AURADismissFloatEvent", "innerHandleEvent", "没有注入floatView参数");
        } else {
            aVar.a();
        }
    }

    private void f() {
        NUTFloatViewManager nUTFloatViewManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        AURAGlobalData d = d();
        if (d == null || (nUTFloatViewManager = (NUTFloatViewManager) d.get("auraFloatViewManager", NUTFloatViewManager.class)) == null) {
            return;
        }
        nUTFloatViewManager.a();
    }
}

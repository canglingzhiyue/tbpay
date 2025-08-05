package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* loaded from: classes.dex */
public class ley implements bn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final bn f30542a;

    static {
        kge.a(-1408685871);
        kge.a(600646234);
    }

    public ley(bn bnVar) {
        this.f30542a = bnVar;
    }

    @Override // com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            this.f30542a.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f30542a.handleEvent(dXEvent, objArr, dXRuntimeContext);
        ldf.e("Dx3EventHandlerWrapper", "Dx3 handleEvent ： " + this.f30542a.getClass().getSimpleName() + ", 耗时 ： " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
    }
}

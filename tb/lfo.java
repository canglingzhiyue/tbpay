package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes.dex */
public class lfo extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final fut f30546a;

    static {
        kge.a(-2017167199);
    }

    public lfo(fut futVar) {
        this.f30546a = futVar;
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Object evalWithArgs = this.f30546a.evalWithArgs(objArr, dXRuntimeContext);
        ldf.e("Dx3ParseWrapper", "Dx3 DataParser ： " + this.f30546a.getClass().getSimpleName() + ", 耗时 ： " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        return evalWithArgs;
    }
}

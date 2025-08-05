package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex.util.c;
import com.taobao.android.weex_framework.bridge.b;
import com.taobao.android.weex_framework.util.g;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public class jva implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<jvb> f29798a;
    private final int b;
    private volatile boolean d = false;

    static {
        kge.a(35707345);
        kge.a(230857286);
    }

    public jva(jvb jvbVar, int i, Object obj) {
        this.f29798a = new WeakReference<>(jvbVar);
        this.b = i;
    }

    @Override // com.taobao.android.weex_framework.bridge.b
    public void a(Object... objArr) {
        jvb jvbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63135c9", new Object[]{this, objArr});
        } else if (this.d || (jvbVar = this.f29798a.get()) == null || jvbVar.isDestroyed()) {
        } else {
            ((WeexInstanceImpl) jvbVar.a()).invokeCallback(this.b, c(objArr), false);
        }
    }

    @Override // com.taobao.android.weex_framework.bridge.b
    public void b(Object... objArr) {
        jvb b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b232c4a8", new Object[]{this, objArr});
        } else if (this.d || (b = b()) == null || b.isDestroyed()) {
        } else {
            ((WeexInstanceImpl) b.a()).invokeCallback(this.b, c(objArr), true);
        }
    }

    @Override // com.taobao.android.weex_framework.bridge.b
    public void a() {
        jvb b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.d || (b = b()) == null || b.isDestroyed()) {
        } else {
            ((WeexInstanceImpl) b.a()).removeCallback(this.b);
        }
    }

    private jvb b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvb) ipChange.ipc$dispatch("16b840a7", new Object[]{this});
        }
        jvb jvbVar = this.f29798a.get();
        if (jvbVar == null) {
            g.c("[MUSCallback] MUSCallback is not valid because it is not alive");
            return null;
        } else if (!jvbVar.isDestroyed()) {
            return jvbVar;
        } else {
            return null;
        }
    }

    private WeexValue[] c(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue[]) ipChange.ipc$dispatch("c5bb3e46", new Object[]{this, objArr});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        WeexValue[] weexValueArr = new WeexValue[objArr.length];
        int i = 0;
        for (Object obj : objArr) {
            if (obj == null) {
                weexValueArr[i] = null;
                i++;
            } else if (!c.a(obj)) {
                g.c("[WeexCallbackImpl] input data is not supported", new Exception());
                return new WeexValue[0];
            } else {
                weexValueArr[i] = WeexValueImpl.convert(obj);
                i++;
            }
        }
        return weexValueArr;
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        try {
            if (this.d || this.f29798a.get() == null) {
                return;
            }
            ((WeexInstanceImpl) this.f29798a.get().a()).removeCallback(this.b);
        } catch (Throwable unused) {
        }
    }
}

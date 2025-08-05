package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex.b;
import com.taobao.android.weex.util.c;
import com.taobao.android.weex_framework.util.g;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public class jur implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<WeexInstance> f29793a;
    private final int b;
    private volatile boolean c = false;

    static {
        kge.a(-90124210);
        kge.a(-744825759);
    }

    public jur(WeexInstance weexInstance, long j) {
        this.f29793a = new WeakReference<>(weexInstance);
        this.b = Long.valueOf(j).intValue();
    }

    @Override // com.taobao.android.weex.b, com.taobao.android.weex_framework.bridge.b
    public void a(Object... objArr) {
        WeexInstance weexInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63135c9", new Object[]{this, objArr});
        } else if (this.c || (weexInstance = this.f29793a.get()) == null || this.c) {
        } else {
            ((WeexInstanceImpl) weexInstance).invokeCallback(this.b, c(objArr), false);
        }
    }

    @Override // com.taobao.android.weex.b, com.taobao.android.weex_framework.bridge.b
    public void b(Object... objArr) {
        WeexInstance bl_;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b232c4a8", new Object[]{this, objArr});
        } else if (this.c || (bl_ = bl_()) == null) {
        } else {
            ((WeexInstanceImpl) bl_).invokeCallback(this.b, c(objArr), true);
        }
    }

    @Override // com.taobao.android.weex.b, com.taobao.android.weex_framework.bridge.b
    public void a() {
        WeexInstance bl_;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.c || (bl_ = bl_()) == null || this.c) {
        } else {
            ((WeexInstanceImpl) bl_).removeCallback(this.b);
        }
    }

    private WeexInstance bl_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("eb820198", new Object[]{this});
        }
        WeexInstance weexInstance = this.f29793a.get();
        if (weexInstance != null) {
            return weexInstance;
        }
        g.c("[WeexCallbackImpl] WeexCallbackImpl is not valid because it is not alive");
        return null;
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
            if (this.c || this.f29793a.get() == null) {
                return;
            }
            ((WeexInstanceImpl) this.f29793a.get()).removeCallback(this.b);
        } catch (Throwable unused) {
        }
    }
}

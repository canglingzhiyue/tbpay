package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.bridge.b;
import com.taobao.weex.bridge.JSCallback;

/* loaded from: classes2.dex */
public class bfn implements b, JSCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSCallback f25850a;
    private b b;

    @Override // com.taobao.android.weex_framework.bridge.b
    public void a(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63135c9", new Object[]{this, objArr});
        }
    }

    @Override // com.taobao.android.weex_framework.bridge.b
    public void b(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b232c4a8", new Object[]{this, objArr});
        }
    }

    public bfn(b bVar) {
        this.b = bVar;
    }

    public bfn(JSCallback jSCallback) {
        this.f25850a = jSCallback;
    }

    @Override // com.taobao.weex.bridge.JSCallback
    public void invoke(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5411b1b", new Object[]{this, obj});
            return;
        }
        JSCallback jSCallback = this.f25850a;
        if (jSCallback != null) {
            jSCallback.invoke(obj);
        }
        b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.a(obj);
    }

    @Override // com.taobao.weex.bridge.JSCallback
    public void invokeAndKeepAlive(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("119a8ac", new Object[]{this, obj});
            return;
        }
        JSCallback jSCallback = this.f25850a;
        if (jSCallback != null) {
            jSCallback.invokeAndKeepAlive(obj);
        }
        b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.b(obj);
    }

    @Override // com.taobao.android.weex_framework.bridge.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.a();
    }
}

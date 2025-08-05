package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.b;
import com.taobao.weex.bridge.JSCallback;

/* loaded from: classes5.dex */
public class aff implements b, com.taobao.android.weex_framework.bridge.b, JSCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSCallback f25307a;
    private com.taobao.android.weex_framework.bridge.b b;
    private b c;

    static {
        kge.a(-364095202);
        kge.a(-744825759);
        kge.a(157966937);
        kge.a(230857286);
    }

    public aff(com.taobao.android.weex_framework.bridge.b bVar) {
        this.b = bVar;
    }

    public aff(b bVar) {
        this.c = bVar;
    }

    @Override // com.taobao.weex.bridge.JSCallback
    public void invoke(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5411b1b", new Object[]{this, obj});
            return;
        }
        JSCallback jSCallback = this.f25307a;
        if (jSCallback != null) {
            jSCallback.invoke(obj);
        }
        com.taobao.android.weex_framework.bridge.b bVar = this.b;
        if (bVar != null) {
            bVar.a(obj);
        }
        b bVar2 = this.c;
        if (bVar2 == null) {
            return;
        }
        bVar2.a(obj);
    }

    @Override // com.taobao.weex.bridge.JSCallback
    public void invokeAndKeepAlive(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("119a8ac", new Object[]{this, obj});
            return;
        }
        JSCallback jSCallback = this.f25307a;
        if (jSCallback != null) {
            jSCallback.invokeAndKeepAlive(obj);
        }
        com.taobao.android.weex_framework.bridge.b bVar = this.b;
        if (bVar != null) {
            bVar.b(obj);
        }
        b bVar2 = this.c;
        if (bVar2 == null) {
            return;
        }
        bVar2.b(obj);
    }

    @Override // com.taobao.android.weex.b, com.taobao.android.weex_framework.bridge.b
    public void a(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63135c9", new Object[]{this, objArr});
            return;
        }
        com.taobao.android.weex_framework.bridge.b bVar = this.b;
        if (bVar != null) {
            bVar.a(objArr);
        }
        b bVar2 = this.c;
        if (bVar2 == null) {
            return;
        }
        bVar2.a(objArr);
    }

    @Override // com.taobao.android.weex.b, com.taobao.android.weex_framework.bridge.b
    public void b(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b232c4a8", new Object[]{this, objArr});
            return;
        }
        com.taobao.android.weex_framework.bridge.b bVar = this.b;
        if (bVar != null) {
            bVar.b(objArr);
        }
        b bVar2 = this.c;
        if (bVar2 == null) {
            return;
        }
        bVar2.b(objArr);
    }

    @Override // com.taobao.android.weex.b, com.taobao.android.weex_framework.bridge.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.bridge.b bVar = this.b;
        if (bVar != null) {
            bVar.a();
        }
        b bVar2 = this.c;
        if (bVar2 == null) {
            return;
        }
        bVar2.a();
    }
}

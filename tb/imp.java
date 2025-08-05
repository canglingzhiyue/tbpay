package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: classes6.dex */
public class imp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile imp f29158a;
    private Context b;
    private final Map<String, Object> c = new HashMap();
    private final ino<JsonRpcRequest> d = new inn();
    private final imr<JsonRpcRequest, JsonRpcResponse> e = new ims(this);
    private final imt f = new imu();

    static {
        kge.a(-488259284);
    }

    public static imp a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (imp) ipChange.ipc$dispatch("f0606d2", new Object[0]);
        }
        if (f29158a == null) {
            synchronized (imp.class) {
                if (f29158a == null) {
                    f29158a = new imp();
                }
            }
        }
        return f29158a;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.e.d();
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.e.e();
    }

    public void a(String str, inm<JsonRpcRequest> inmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dece3ba", new Object[]{this, str, inmVar});
        } else {
            this.d.a(str, inmVar);
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (this.b != null) {
        } else {
            this.b = context.getApplicationContext();
            this.e.c();
        }
    }

    public Future<JsonRpcResponse> a(JsonRpcRequest jsonRpcRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b82237fd", new Object[]{this, jsonRpcRequest}) : this.e.a((imr<JsonRpcRequest, JsonRpcResponse>) jsonRpcRequest);
    }

    public void b(JsonRpcRequest jsonRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b46d7106", new Object[]{this, jsonRpcRequest});
        } else {
            this.e.b(jsonRpcRequest);
        }
    }

    private imp() {
        h();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        a("get.appInfo", new ine());
        a("selectMock", new ini());
        a("removeMock", new inf());
        a("selectStrategy", new inj());
        a("removeStrategy", new ing());
        a("clearStrategy", new ind());
        a("selectABTest", new inh());
        a("clearABTest", new inc());
    }

    public Context d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f183c0e3", new Object[]{this}) : this.b;
    }

    public ino<JsonRpcRequest> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ino) ipChange.ipc$dispatch("2dcc9ff0", new Object[]{this}) : this.d;
    }

    public imt f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imt) ipChange.ipc$dispatch("357e4229", new Object[]{this}) : this.f;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.e.f();
    }
}

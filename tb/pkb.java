package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.single.a;
import com.taobao.taolive.room.utils.v;
import java.util.Map;

/* loaded from: classes8.dex */
public class pkb implements pjq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f32714a;

    static {
        kge.a(1372250200);
        kge.a(1263952868);
    }

    public pkb(a aVar) {
        this.f32714a = aVar;
    }

    @Override // tb.pjq
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        a aVar = this.f32714a;
        if (aVar == null) {
            return;
        }
        aVar.initParams(obj);
    }

    @Override // tb.pjq
    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
            return;
        }
        a aVar = this.f32714a;
        if (aVar == null) {
            return;
        }
        aVar.onWillAppear();
    }

    @Override // tb.pjq
    public void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8844c6", new Object[]{this, obj});
            return;
        }
        a aVar = this.f32714a;
        if (aVar == null) {
            return;
        }
        aVar.onDidAppear();
    }

    @Override // tb.pjq
    public void d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b9de07", new Object[]{this, obj});
            return;
        }
        a aVar = this.f32714a;
        if (aVar == null) {
            return;
        }
        aVar.onWillDisappear();
    }

    @Override // tb.pjq
    public void e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceeb7748", new Object[]{this, obj});
            return;
        }
        a aVar = this.f32714a;
        if (aVar == null) {
            return;
        }
        aVar.onDidDisappear();
    }

    @Override // tb.pjq
    public void f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("191d1089", new Object[]{this, obj});
            return;
        }
        a aVar = this.f32714a;
        if (aVar == null) {
            return;
        }
        aVar.onPause();
    }

    @Override // tb.pjq
    public void g(Object obj) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("634ea9ca", new Object[]{this, obj});
            return;
        }
        if (obj instanceof Map) {
            Object obj2 = ((Map) obj).get("showSmallWindow");
            if (obj2 instanceof String) {
                z = v.e((String) obj2);
            }
        }
        a aVar = this.f32714a;
        if (aVar == null) {
            return;
        }
        aVar.onStop(z);
    }

    @Override // tb.pjq
    public void h(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad80430b", new Object[]{this, obj});
            return;
        }
        a aVar = this.f32714a;
        if (aVar == null) {
            return;
        }
        aVar.onResume();
    }

    @Override // tb.pjq
    public void i(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7b1dc4c", new Object[]{this, obj});
            return;
        }
        a aVar = this.f32714a;
        if (aVar == null) {
            return;
        }
        aVar.onDestroy();
    }
}

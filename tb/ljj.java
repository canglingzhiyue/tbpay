package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.jsbridge.impl.bridge.b;
import tb.lji;

/* loaded from: classes7.dex */
public class ljj implements lji {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final b f30677a = new b();

    static {
        kge.a(-99492538);
        kge.a(1692056311);
    }

    public ljj(String str) {
        this.f30677a.a(str);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f30677a.a();
        }
    }

    @Override // tb.lji
    public void a(lji.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d32ae130", new Object[]{this, aVar});
        } else {
            this.f30677a.a(aVar);
        }
    }

    @Override // tb.lji
    public void b(lji.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d064b71", new Object[]{this, aVar});
        } else {
            this.f30677a.b(aVar);
        }
    }
}

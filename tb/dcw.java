package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.e;

/* loaded from: classes.dex */
public abstract class dcw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f26700a;
    private final int b;

    static {
        kge.a(-1367933322);
    }

    public abstract void a();

    public abstract void a(String str);

    public dcw(String str, int i) {
        this.f26700a = str;
        this.b = i;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            dcx.a(this.f26700a, this.b + 1);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        dcx.a(this.f26700a);
        e.b("Action", "finish action", "chainId", this.f26700a, "index", Integer.valueOf(this.b));
    }
}

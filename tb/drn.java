package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class drn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static drn f26926a;
    private Context b;

    static {
        kge.a(-529463506);
    }

    private drn() {
    }

    public static synchronized drn a() {
        synchronized (drn.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (drn) ipChange.ipc$dispatch("f03d37e", new Object[0]);
            }
            if (f26926a == null) {
                f26926a = new drn();
            }
            return f26926a;
        }
    }

    public Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[]{this});
        }
        Context context = this.b;
        return context == null ? dro.a() : context;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.b = context;
        }
    }
}

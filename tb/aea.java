package tb;

import android.content.Context;
import android.taobao.windvane.packageapp.adaptive.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.o;

/* loaded from: classes2.dex */
public class aea {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static aea f25279a;
    private a b;

    static {
        kge.a(-1553619229);
    }

    public static aea getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aea) ipChange.ipc$dispatch("200ca417", new Object[0]);
        }
        if (f25279a == null) {
            synchronized (aea.class) {
                if (f25279a == null) {
                    f25279a = new aea();
                }
            }
        }
        return f25279a;
    }

    public void init(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b35b22e3", new Object[]{this, context, new Boolean(z)});
            return;
        }
        try {
            if (!android.taobao.windvane.util.a.b(context)) {
                return;
            }
            o.a().b();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void registerUpdateFinishCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b59c7e", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public a getUpdateFinishCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("ac802497", new Object[]{this}) : this.b;
    }
}

package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.k;
import java.util.ArrayList;
import tb.sua;

/* loaded from: classes8.dex */
public class stz implements sua.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile stz f33900a;
    private ArrayList<sua> c = new ArrayList<>();
    private Handler b = new Handler(Looper.getMainLooper());

    /* loaded from: classes8.dex */
    public interface a {
        void a(String str);

        void b(String str);
    }

    static {
        kge.a(1171824060);
        kge.a(-1096069068);
    }

    private stz() {
    }

    public static stz a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (stz) ipChange.ipc$dispatch("f0aae05", new Object[0]);
        }
        if (f33900a == null) {
            synchronized (stz.class) {
                if (f33900a == null) {
                    f33900a = new stz();
                }
            }
        }
        return f33900a;
    }

    public String a(Context context, String str, k kVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("766443ce", new Object[]{this, context, str, kVar, aVar});
        }
        if (context == null || str == null || kVar == null || aVar == null) {
            return null;
        }
        prs.a("TBLVObjectSharedManager", "reuseAndReleasePlayer start playContextKey = " + str);
        sua suaVar = new sua(context, str, kVar, this.b, aVar, this);
        this.c.add(suaVar);
        return suaVar.a();
    }

    @Override // tb.sua.a
    public void a(sua suaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff701439", new Object[]{this, suaVar});
        } else if (suaVar == null) {
        } else {
            prs.a("TBLVObjectSharedManager", "onFinish start playContextKey = " + suaVar.b());
            this.c.remove(suaVar);
        }
    }
}

package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.analysis.v3.h;
import com.taobao.analysis.v3.n;
import com.taobao.analysis.v3.r;

/* loaded from: classes.dex */
public class mmz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final mmz DEFAULT = new mmz();

    /* renamed from: a  reason: collision with root package name */
    private static boolean f31125a;
    private n b;
    private long c;

    static {
        try {
            if (Class.forName("com.taobao.analysis.v3.n") == null) {
                return;
            }
            f31125a = true;
        } catch (Throwable unused) {
            f31125a = false;
        }
    }

    private mmz() {
    }

    public static mmz a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mmz) ipChange.ipc$dispatch("1a98a9da", new Object[]{str, new Long(j)});
        }
        if (!f31125a || TextUtils.isEmpty(str)) {
            return DEFAULT;
        }
        r rVar = FalcoGlobalTracer.get();
        if (rVar == null) {
            return DEFAULT;
        }
        r.a a2 = rVar.a(str, "Apm");
        a2.a(j);
        h b = a2.b();
        mmz mmzVar = new mmz();
        mmzVar.a(b);
        return mmzVar;
    }

    public mmz a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mmz) ipChange.ipc$dispatch("7c72827a", new Object[]{this, str}) : b(str, System.currentTimeMillis());
    }

    public mmz b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mmz) ipChange.ipc$dispatch("2f81721b", new Object[]{this, str, new Long(j)});
        }
        if (!f31125a || this.b == null || TextUtils.isEmpty(str)) {
            return DEFAULT;
        }
        r rVar = FalcoGlobalTracer.get();
        if (rVar == null) {
            return DEFAULT;
        }
        r.a a2 = rVar.a(str, "Apm");
        a2.a(j);
        a2.a(this.b);
        h b = a2.b();
        mmz mmzVar = new mmz();
        mmzVar.a(b);
        mmzVar.c = j;
        return mmzVar;
    }

    private void a(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d53277b", new Object[]{this, nVar});
        } else {
            this.b = nVar;
        }
    }

    public mmz a(long j) {
        n nVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mmz) ipChange.ipc$dispatch("daae3410", new Object[]{this, new Long(j)});
        }
        if (f31125a && (nVar = this.b) != null) {
            nVar.b(j);
        }
        return this;
    }

    public long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.c;
    }
}

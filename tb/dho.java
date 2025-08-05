package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;

/* loaded from: classes4.dex */
public abstract class dho {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f26762a;
    private final String b;
    private final dhm c;
    private final dhn d;
    private Looper e;
    private dhf f;

    static {
        kge.a(-1204936223);
    }

    public abstract boolean a(String str);

    public abstract boolean b(String str);

    public dho(String str, dhm dhmVar) {
        this.b = str;
        this.c = dhmVar == null ? dhm.DEFAULT_NO_RETRY : dhmVar;
        this.d = new dhn();
        this.f26762a = UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }

    public void a(Looper looper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efcf7f3d", new Object[]{this, looper});
        } else {
            this.e = looper;
        }
    }

    public void a(dhf dhfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5227736", new Object[]{this, dhfVar});
        } else {
            this.f = dhfVar;
        }
    }

    public Handler a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("b016d95e", new Object[]{this});
        }
        Looper looper = this.e;
        if (looper != null && looper.getThread().isAlive()) {
            return new Handler(this.e);
        }
        return null;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.e != null;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b;
    }

    public dhm d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dhm) ipChange.ipc$dispatch("26189df2", new Object[]{this}) : this.c;
    }

    public dhn e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dhn) ipChange.ipc$dispatch("2dca4370", new Object[]{this}) : this.d;
    }

    public dhf f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dhf) ipChange.ipc$dispatch("357be7d7", new Object[]{this}) : this.f;
    }
}

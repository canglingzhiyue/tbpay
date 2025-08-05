package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class ris {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f33170a;
    private final Context b;
    private rir c;
    private boolean d = true;

    public ris(Context context, String str, rir rirVar) {
        this.b = context;
        this.f33170a = str;
        this.c = rirVar;
        rit.a(context).a(this);
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            rit.a(this.b).a(this, obj);
        }
    }

    public final void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
            return;
        }
        rir rirVar = this.c;
        if (rirVar == null) {
            return;
        }
        rirVar.a(obj);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f33170a;
    }

    public void a(rir rirVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd19dbdd", new Object[]{this, rirVar});
        } else {
            this.c = rirVar;
        }
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        b();
        super.finalize();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.d) {
        } else {
            rit.a(this.b).b(this);
            this.d = false;
        }
    }
}

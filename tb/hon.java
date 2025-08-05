package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public abstract class hon {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Set<hon> f28746a;
    private Activity b;
    private Object c;

    static {
        kge.a(-976970965);
    }

    public void b(hon child) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dadf27b2", new Object[]{this, child});
        } else {
            q.c(child, "child");
        }
    }

    public void d(hon child) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7e534b4", new Object[]{this, child});
        } else {
            q.c(child, "child");
        }
    }

    public hon(Activity activity, Object obj) {
        q.c(activity, "activity");
        this.b = activity;
        this.c = obj;
        this.f28746a = new LinkedHashSet();
        Object obj2 = this.c;
        if (obj2 instanceof hon) {
            ((hon) obj2).a(this);
        }
    }

    public final Activity g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("2c7ab1fa", new Object[]{this}) : this.b;
    }

    public final void a(hon child) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5c2131", new Object[]{this, child});
            return;
        }
        q.c(child, "child");
        this.f28746a.add(child);
        b(child);
    }

    public final void c(hon child) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9622e33", new Object[]{this, child});
            return;
        }
        q.c(child, "child");
        this.f28746a.remove(child);
        d(child);
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
            return;
        }
        for (hon honVar : this.f28746a) {
            honVar.J();
        }
    }

    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
            return;
        }
        Object obj = this.c;
        if (obj instanceof hon) {
            ((hon) obj).c(this);
        }
        J();
    }

    public void ek_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9abc2880", new Object[]{this});
            return;
        }
        for (hon honVar : this.f28746a) {
            honVar.ek_();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (hon honVar : this.f28746a) {
            honVar.b();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (hon honVar : this.f28746a) {
            honVar.c();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        for (hon honVar : this.f28746a) {
            honVar.d();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        for (hon honVar : this.f28746a) {
            honVar.e();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        for (hon honVar : this.f28746a) {
            honVar.f();
        }
    }
}

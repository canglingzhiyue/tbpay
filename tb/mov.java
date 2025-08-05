package tb;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.impl.common.d;
import com.taobao.monitor.procedure.IPage;
import com.taobao.monitor.procedure.c;
import java.util.HashMap;

/* loaded from: classes.dex */
public class mov {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Activity f31177a;
    public Fragment b;
    private Window d;
    private View e;
    private Fragment f;
    private String g;
    private String h;
    private String k;
    private IPage l;
    private String m;
    private boolean c = true;
    private boolean i = true;
    private boolean j = true;

    public mov b(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mov) ipChange.ipc$dispatch("4385dbe9", new Object[]{this, fragment});
        }
        this.f = fragment;
        return this;
    }

    public mov c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mov) ipChange.ipc$dispatch("7dcbe0be", new Object[]{this, str});
        }
        this.g = str;
        return this;
    }

    public mov d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mov) ipChange.ipc$dispatch("7e788c5d", new Object[]{this, str});
        }
        this.h = str;
        return this;
    }

    public mov a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mov) ipChange.ipc$dispatch("1f454d06", new Object[]{this, new Boolean(z)});
        }
        this.c = z;
        return this;
    }

    public mov b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mov) ipChange.ipc$dispatch("dc85387", new Object[]{this, new Boolean(z)});
        }
        this.i = z;
        return this;
    }

    public mov c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mov) ipChange.ipc$dispatch("fc4b5a08", new Object[]{this, new Boolean(z)});
        }
        this.j = z;
        return this;
    }

    public mov a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mov) ipChange.ipc$dispatch("3970e348", new Object[]{this, view});
        }
        this.e = view;
        return this;
    }

    public mov a(Window window) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mov) ipChange.ipc$dispatch("42a65893", new Object[]{this, window});
        }
        this.d = window;
        return this;
    }

    public mov a(IPage iPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mov) ipChange.ipc$dispatch("2931c36f", new Object[]{this, iPage});
        }
        this.l = iPage;
        return this;
    }

    public mov a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mov) ipChange.ipc$dispatch("2d866f8", new Object[]{this, activity});
        }
        this.f31177a = activity;
        return this;
    }

    public mov a(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mov) ipChange.ipc$dispatch("a8e51968", new Object[]{this, fragment});
        }
        this.b = fragment;
        return this;
    }

    public mov a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mov) ipChange.ipc$dispatch("7c728980", new Object[]{this, str});
        }
        this.k = str;
        return this;
    }

    public mov b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mov) ipChange.ipc$dispatch("7d1f351f", new Object[]{this, str});
        }
        this.m = str;
        return this;
    }

    public IPage a() {
        mos motVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("5491f3a9", new Object[]{this});
        }
        if (!this.c) {
            return new c();
        }
        if (this.e == null && this.d == null) {
            mpi.c("CustomPageBuilder", "create error: page root view is null");
            return new c();
        }
        String b = b();
        if (d.b && mpe.c(b)) {
            mpi.c("CustomPageBuilder", "create error: " + b + " in black list.");
            return new c();
        }
        if (this.l == null) {
            this.l = ProcedureGlobal.PROCEDURE_MANAGER.a(b(this.e));
        }
        mou mouVar = new mou();
        mouVar.a(this.e);
        mouVar.a(this.d);
        mouVar.d(this.k);
        mouVar.a(this.l);
        mouVar.e(this.m);
        Activity activity = this.f31177a;
        if (activity != null) {
            mouVar.a(activity);
        } else {
            Fragment fragment = this.b;
            if (fragment != null) {
                mouVar.a(fragment);
            }
        }
        mouVar.b(b);
        if (this.j) {
            motVar = new mox(mouVar);
        } else {
            motVar = new mot(mouVar);
        }
        mouVar.a(this.i);
        mouVar.a(new mod(mouVar));
        mouVar.a(motVar);
        mouVar.a(new mph(mouVar));
        Fragment fragment2 = this.f;
        if (fragment2 != null) {
            mouVar.a(moe.a(fragment2));
            mouVar.d().a(this.g, this.h, new HashMap());
        }
        return mouVar;
    }

    private String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        Activity activity = this.f31177a;
        if (activity != null) {
            return com.taobao.monitor.impl.util.d.a((Object) activity);
        }
        Fragment fragment = this.b;
        if (fragment != null) {
            return com.taobao.monitor.impl.util.d.a(fragment);
        }
        return this.g;
    }

    private Activity b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("6259dfff", new Object[]{this, view});
        }
        if (view == null) {
            return null;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}

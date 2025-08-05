package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class lis implements llc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<llb> f30667a = new CopyOnWriteArrayList();

    static {
        kge.a(-2108990174);
        kge.a(-1424403303);
    }

    @Override // tb.llc
    public void a(llb llbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2ffc8b6", new Object[]{this, llbVar});
        } else {
            this.f30667a.add(llbVar);
        }
    }

    @Override // tb.llc
    public void b(llb llbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e182cf37", new Object[]{this, llbVar});
        } else {
            this.f30667a.remove(llbVar);
        }
    }

    public void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        for (llb llbVar : this.f30667a) {
            llbVar.onNewIntent(intent);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (llb llbVar : this.f30667a) {
            llbVar.onStart();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (llb llbVar : this.f30667a) {
            llbVar.onRestart();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (llb llbVar : this.f30667a) {
            llbVar.onResume();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        for (llb llbVar : this.f30667a) {
            llbVar.onPause();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        for (llb llbVar : this.f30667a) {
            llbVar.onStop();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        for (llb llbVar : this.f30667a) {
            llbVar.onDestroyView();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        for (llb llbVar : this.f30667a) {
            llbVar.onDestroy();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        for (llb llbVar : this.f30667a) {
            llbVar.onWillExit();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        for (llb llbVar : this.f30667a) {
            llbVar.onColdStartResume();
        }
    }

    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        try {
            for (llb llbVar : this.f30667a) {
                llbVar.onActivityResult(i, i2, intent);
            }
        } catch (AbstractMethodError e) {
            ldf.a("PageLifeCycleRegister", "onActivityResult方法找不到，请使用摩天轮打包", e);
        }
    }
}

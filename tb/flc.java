package tb;

import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.av;
import com.taobao.avplayer.common.z;
import java.util.Map;

/* loaded from: classes5.dex */
public class flc implements flb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private fjb f28025a;
    private fix b;

    static {
        kge.a(532944670);
        kge.a(1690946622);
    }

    public flc(fjb fjbVar) {
        this.f28025a = fjbVar;
        this.b = fjbVar.a();
    }

    @Override // tb.flb
    public Pair<Boolean, Map<String, String>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("dd4f14b2", new Object[]{this});
        }
        this.f28025a.b();
        return new Pair<>(true, null);
    }

    @Override // tb.flb
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b != null;
    }

    @Override // tb.flb
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        fjb fjbVar = this.f28025a;
        if (fjbVar == null) {
            return;
        }
        fjbVar.c();
    }

    @Override // tb.flb
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        fix fixVar = this.b;
        if (fixVar == null) {
            return;
        }
        fixVar.b();
    }

    @Override // tb.flb
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        fix fixVar = this.b;
        if (fixVar == null) {
            return;
        }
        fixVar.c();
    }

    @Override // tb.flb
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        fix fixVar = this.b;
        if (fixVar == null) {
            return;
        }
        fixVar.d();
    }

    @Override // tb.flb
    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        fix fixVar = this.b;
        if (fixVar == null) {
            return 0;
        }
        return fixVar.f();
    }

    @Override // tb.flb
    public View h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("20baeb71", new Object[]{this});
        }
        fix fixVar = this.b;
        if (fixVar == null) {
            return null;
        }
        return fixVar.g();
    }

    @Override // tb.flb
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        fix fixVar = this.b;
        if (fixVar == null) {
            return;
        }
        fixVar.a(i, i2);
    }

    @Override // tb.flb
    public void a(av avVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173676bc", new Object[]{this, avVar});
            return;
        }
        fix fixVar = this.b;
        if (fixVar == null) {
            return;
        }
        fixVar.a(avVar);
    }

    @Override // tb.flb
    public void a(z zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410de73b", new Object[]{this, zVar});
            return;
        }
        fix fixVar = this.b;
        if (fixVar == null) {
            return;
        }
        fixVar.a(zVar);
    }

    @Override // tb.flb
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        fix fixVar = this.b;
        if (fixVar == null) {
            return;
        }
        if (fixVar.f() == 1) {
            this.b.c();
        } else {
            this.b.b();
        }
    }

    @Override // tb.flb
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        fix fixVar = this.b;
        if (fixVar == null) {
            return;
        }
        fixVar.i();
    }
}

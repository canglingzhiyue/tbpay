package tb;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import tb.ofz;

/* loaded from: classes8.dex */
public abstract class oga<T extends ofz> implements ogc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ogb d;

    static {
        kge.a(-1027927302);
        kge.a(-525469409);
    }

    public abstract boolean a(Activity activity, int i);

    public abstract boolean a(f fVar, int i);

    public abstract T c();

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        }
    }

    public abstract boolean g();

    public abstract View j();

    public abstract boolean k();

    public static ogb a(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ogb) ipChange.ipc$dispatch("f334d45", new Object[]{cVar});
        }
        if (cVar.f19938a.g() instanceof ogb) {
            return (ogb) cVar.f19938a.g();
        }
        if (!(cVar.a() instanceof ogb)) {
            return null;
        }
        return (ogb) cVar.a();
    }

    public static boolean a(ogb ogbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f7d7dd12", new Object[]{ogbVar})).booleanValue() : (ogbVar == null || ogbVar.findSecPageWrapper() == null || !ogbVar.findSecPageWrapper().k()) ? false : true;
    }

    public static boolean a(Context context, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52827784", new Object[]{context, fVar})).booleanValue();
        }
        ogb ogbVar = null;
        if (context instanceof ogb) {
            ogbVar = (ogb) context;
        }
        if (ogbVar == null && (fVar instanceof ogb)) {
            ogbVar = (ogb) fVar;
        }
        if (!a(ogbVar)) {
            return false;
        }
        return ogbVar.findSecPageWrapper().g();
    }

    public final ogb l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogb) ipChange.ipc$dispatch("63aac3e9", new Object[]{this}) : this.d;
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            d();
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            e();
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            f();
        }
    }
}

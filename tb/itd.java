package tb;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.searchbaseframe.util.ListStyle;
import de.greenrobot.event.c;
import java.util.HashSet;
import java.util.Set;
import tb.iul;

/* loaded from: classes6.dex */
public abstract class itd<BEAN, MODEL> extends RecyclerView.ViewHolder implements iul {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ium f29305a;
    public final Activity b;
    public final Set<Object> c;
    public final int d;
    private final Set<String> e;
    private final ListStyle f;
    private BEAN g;
    private int h;
    private BEAN i;
    private int j;
    private imn k;
    private MODEL l;

    static {
        kge.a(202612056);
        kge.a(-969874032);
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
        }
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
        }
    }

    public abstract String a();

    public abstract void a(int i, BEAN bean);

    public void b(BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, bean});
        }
    }

    @Override // tb.iul
    public final String getScopeTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53eba25d", new Object[]{this});
        }
        return null;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.iul
    public final c obtainScopeEventBus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("cb3494d9", new Object[]{this});
        }
        return null;
    }

    @Override // tb.iul
    public void onCtxStopInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da57fdce", new Object[]{this});
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
        }
    }

    public itd(View view, Activity activity, ium iumVar, ListStyle listStyle, int i, MODEL model) {
        super(view);
        this.c = new HashSet();
        this.h = -1;
        this.j = -1;
        this.b = activity;
        this.f29305a = iumVar;
        this.d = i;
        this.f = listStyle;
        this.l = model;
        this.k = iumVar.getCore();
        ium iumVar2 = this.f29305a;
        boolean z = false;
        if (iumVar2 instanceof iut) {
            iut iutVar = (iut) iumVar2;
            iutVar.addChild(this);
            this.e = new HashSet(iutVar.getScopes().size());
            this.e.addAll(iutVar.getScopes());
        } else {
            this.e = new HashSet(0);
        }
        boolean z2 = this.f == ListStyle.LIST;
        StaggeredGridLayoutManager.LayoutParams layoutParams = new StaggeredGridLayoutManager.LayoutParams(view.getLayoutParams());
        layoutParams.setFullSpan((z2 || !k()) ? true : z);
        view.setLayoutParams(layoutParams);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.itemView.setAlpha(0.0f);
        this.itemView.invalidate();
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.itemView.setAlpha(1.0f);
        this.itemView.invalidate();
    }

    public MODEL j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MODEL) ipChange.ipc$dispatch("77e79761", new Object[]{this}) : this.l;
    }

    public final BEAN l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BEAN) ipChange.ipc$dispatch("84f30c9f", new Object[]{this}) : this.g;
    }

    public final int m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue() : this.h;
    }

    public BEAN n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BEAN) ipChange.ipc$dispatch("91fe81dd", new Object[]{this}) : this.i;
    }

    public int o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue() : this.j;
    }

    public final void b(int i, BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf718196", new Object[]{this, new Integer(i), bean});
            return;
        }
        this.i = this.g;
        this.j = this.h;
        this.g = bean;
        this.h = i;
        a(i, (int) bean);
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        r();
        this.g = null;
        this.h = -1;
        this.i = null;
        this.j = -1;
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else {
            p();
        }
    }

    public void a(BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, bean});
        } else {
            b(bean);
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else if (!(getParent() instanceof iob)) {
        } else {
            ((iob) getParent()).b(this, m());
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        } else if (!(getParent() instanceof iob)) {
        } else {
            ((iob) getParent()).a(this, m());
        }
    }

    public final ListStyle u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ListStyle) ipChange.ipc$dispatch("c297f879", new Object[]{this}) : this.f;
    }

    public final imn getCore() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("f78bd660", new Object[]{this}) : this.k;
    }

    public final imn v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("b098975f", new Object[]{this}) : this.k;
    }

    public boolean a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65cbb312", new Object[]{this, obj, str})).booleanValue();
        }
        iul a2 = a(str);
        if (a2 == null) {
            return false;
        }
        a2.obtainScopeEventBus().d(obj);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [tb.iul] */
    /* JADX WARN: Type inference failed for: r0v3, types: [tb.iul] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [tb.iul] */
    public iul a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iul) ipChange.ipc$dispatch("7c70cd54", new Object[]{this, str});
        }
        itd<BEAN, MODEL> itdVar = this;
        while (!TextUtils.equals(itdVar.getScopeTag(), str)) {
            ium parent = itdVar.getParent();
            if (parent instanceof iul) {
                itdVar = (iul) parent;
                continue;
            } else {
                itdVar = 0;
                continue;
            }
            if (itdVar == 0) {
                break;
            }
        }
        return itdVar;
    }

    public void postEvent(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e40efd", new Object[]{this, obj});
        } else {
            w().obtainScopeEventBus().d(obj);
        }
    }

    public void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8844c6", new Object[]{this, obj});
            return;
        }
        w().obtainScopeEventBus().a(obj);
        this.c.add(obj);
    }

    public iul w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iul) ipChange.ipc$dispatch("b84a5a88", new Object[]{this});
        }
        iul iulVar = this;
        while (true) {
            ium parent = iulVar.getParent();
            if (!(parent instanceof iul)) {
                return iulVar;
            }
            iulVar = (iul) parent;
        }
    }

    @Override // tb.iul
    public final <T> T searchWidgetInSubTree(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ac60b709", new Object[]{this, cls});
        }
        if (!cls.isInstance(this)) {
            return null;
        }
        return cls.cast(this);
    }

    @Override // tb.iul
    public final void destroyAndRemoveFromParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120cd83c", new Object[]{this});
            return;
        }
        x();
        ium iumVar = this.f29305a;
        if (!(iumVar instanceof iut)) {
            return;
        }
        ((iut) iumVar).removeChild(this);
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        c obtainScopeEventBus = w().obtainScopeEventBus();
        for (Object obj : this.c) {
            obtainScopeEventBus.c(obj);
        }
        y();
    }

    public final Activity getActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this}) : this.b;
    }

    @Override // tb.iul
    public final ium getParent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ium) ipChange.ipc$dispatch("5382cbde", new Object[]{this}) : this.f29305a;
    }

    @Override // tb.iul
    public final void onCtxPauseInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("690eaf2", new Object[]{this});
        } else {
            z();
        }
    }

    @Override // tb.iul
    public final void onCtxResumeInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd57b79", new Object[]{this});
        } else {
            A();
        }
    }

    @Override // tb.iul
    public final void onCtxDestroyInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f92298f6", new Object[]{this});
        } else {
            B();
        }
    }

    @Override // tb.iul
    public void printTree(StringBuilder sb, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85bc8aa", new Object[]{this, sb, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append(a());
        sb.append('\n');
    }

    @Override // tb.iul
    public final boolean travel(iul.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f64c3738", new Object[]{this, aVar})).booleanValue() : aVar.a(this);
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.itemView.getTop();
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.itemView.getBottom();
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
        } else {
            t();
        }
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
        } else {
            s();
        }
    }

    public int ak() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab7f6ba4", new Object[]{this})).intValue() : (ScreenType.IS_PAD || ScreenType.IS_FOLDABLE || this.f == ListStyle.LIST || (viewGroup = (ViewGroup) this.itemView.getParent()) == null || this.itemView.getLeft() + (this.itemView.getWidth() / 2) < viewGroup.getWidth() / 2) ? 0 : 1;
    }
}

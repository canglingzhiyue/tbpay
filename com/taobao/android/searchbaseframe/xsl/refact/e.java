package com.taobao.android.searchbaseframe.xsl.refact;

import android.app.Activity;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import java.util.ArrayList;
import kotlin.TypeCastException;
import tb.hte;
import tb.htf;
import tb.iru;
import tb.ite;
import tb.itk;
import tb.iuk;
import tb.ium;
import tb.iuo;
import tb.iur;
import tb.ius;
import tb.kge;

/* loaded from: classes6.dex */
public final class e extends com.taobao.android.meta.structure.childpage.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final l c;
    private ite d;
    private final l e;
    private final ArrayList<iuk<?, ?>> f;
    private ite g;
    private boolean h;
    private final k i;
    private final q j;
    private ite k;

    static {
        kge.a(11291650);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1495693223:
                super.a((iuk) objArr[0], (ite) objArr[1], (String) objArr[2]);
                return null;
            case -1303831088:
                super.bindWithData(objArr[0]);
                return null;
            case 102073972:
                super.m();
                return null;
            case 109462140:
                super.u();
                return null;
            case 111309182:
                super.w();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.iup, tb.iui
    public /* synthetic */ void bindWithData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, obj});
        } else {
            a((Void) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Activity activity, ium parent, iru<XslDataSource> model, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, model, viewGroup, iurVar);
        kotlin.jvm.internal.q.c(activity, "activity");
        kotlin.jvm.internal.q.c(parent, "parent");
        kotlin.jvm.internal.q.c(model, "model");
        this.c = new l(activity, parent, model, viewGroup, new iuo(), false);
        this.e = new l(activity, parent, model, viewGroup, new iuo(), false);
        this.j = new q(activity, parent, model, viewGroup, new iuo());
        this.f = new ArrayList<>();
        hte a2 = a();
        if (a2 != null) {
            this.i = new k(activity, (h) a2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.xsl.refact.XslConfig");
    }

    public final ArrayList<iuk<?, ?>> cP_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("60efe693", new Object[]{this}) : this.f;
    }

    @Override // com.taobao.android.meta.structure.childpage.g
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        ((com.taobao.android.meta.structure.childpage.c) J()).bJ_().addHeader(this.i);
        super.m();
        if (g().u().getChildCount() <= 0) {
            g().p();
        }
        ((h) ((iru) getModel()).a()).ao().a(new XslChildPageWidget$init$1(this));
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
        } else {
            this.j.a();
        }
    }

    @Override // com.taobao.android.meta.structure.childpage.g
    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        super.w();
        if (!(!kotlin.jvm.internal.q.a((Object) F().ap().a(), (Object) true))) {
            return;
        }
        y();
    }

    @Override // com.taobao.android.meta.structure.childpage.g
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        this.e.a();
        this.c.a();
        e().clear();
        if (this.h) {
            SparseArray<ite> e = e();
            int hashCode = this.e.hashCode();
            ite iteVar = this.g;
            if (iteVar == null) {
                kotlin.jvm.internal.q.b("foldHeader");
            }
            e.put(hashCode, iteVar);
            SparseArray<ite> e2 = e();
            int hashCode2 = this.c.hashCode();
            ite iteVar2 = this.d;
            if (iteVar2 == null) {
                kotlin.jvm.internal.q.b("stickyHeader");
            }
            e2.put(hashCode2, iteVar2);
            SparseArray<ite> e3 = e();
            int hashCode3 = this.j.hashCode();
            ite iteVar3 = this.k;
            if (iteVar3 == null) {
                kotlin.jvm.internal.q.b("refreshHeader");
            }
            e3.put(hashCode3, iteVar3);
        }
        b().clear();
        g().p();
        h().a();
        this.f.clear();
        A();
    }

    @Override // com.taobao.android.meta.structure.childpage.g
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        super.u();
        ((com.taobao.android.meta.structure.childpage.c) J()).bJ_().updateHeaderOffset();
    }

    public void a(Void r4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f8d528f", new Object[]{this, r4});
            return;
        }
        super.bindWithData(r4);
        iru model = (iru) getModel();
        kotlin.jvm.internal.q.a((Object) model, "model");
        if (((com.taobao.android.meta.data.b) model.d()).isFirstSearchDone()) {
            return;
        }
        iru model2 = (iru) getModel();
        kotlin.jvm.internal.q.a((Object) model2, "model");
        Object b = model2.e().b("controller");
        if (!(b instanceof i)) {
            b = null;
        }
        i iVar = (i) b;
        if (iVar == null) {
            return;
        }
        iru model3 = (iru) getModel();
        kotlin.jvm.internal.q.a((Object) model3, "model");
        com.taobao.android.searchbaseframe.datasource.impl.a d = model3.d();
        if (d != null) {
            iVar.a((XslDataSource) d, (com.taobao.android.meta.structure.childpage.g) this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.xsl.refact.XslDataSource");
    }

    @Override // com.taobao.android.meta.structure.childpage.g
    public void a(iuk<BaseTypedBean, ?> widget, ite header, String type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d98859", new Object[]{this, widget, header, type});
            return;
        }
        kotlin.jvm.internal.q.c(widget, "widget");
        kotlin.jvm.internal.q.c(header, "header");
        kotlin.jvm.internal.q.c(type, "type");
        int hashCode = type.hashCode();
        if (hashCode != -892259863) {
            if (hashCode == 3148801) {
                if (type.equals(itk.TYPE_FOLD)) {
                    E();
                    this.e.a(widget);
                    return;
                }
            } else if (hashCode == 3322014 && type.equals("list")) {
                this.f.add(widget);
                super.a(widget, header, type);
                return;
            }
        } else if (type.equals("sticky")) {
            E();
            this.c.a(widget);
            return;
        }
        super.a(widget, header, type);
    }

    private final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
        } else if (this.h) {
        } else {
            this.h = true;
            this.k = a(this.j, "list");
            ite iteVar = this.k;
            if (iteVar == null) {
                kotlin.jvm.internal.q.b("refreshHeader");
            }
            iteVar.o();
            this.g = a(this.e, itk.TYPE_FOLD);
            F().aj().a(new XslChildPageWidget$ensureContainers$1(this));
            F().ak().a(new XslChildPageWidget$ensureContainers$2(this));
            this.d = a(this.c, "sticky");
            ((com.taobao.android.meta.structure.childpage.c) J()).bJ_().commit();
        }
    }

    private final h F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("1872f99a", new Object[]{this});
        }
        hte a2 = a();
        if (a2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.xsl.refact.XslConfig");
        }
        return (h) a2;
    }

    private final ite a(ius<?, ?, ?> iusVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ite) ipChange.ipc$dispatch("19fa1c91", new Object[]{this, iusVar, str});
        }
        iusVar.ensureView();
        ite iteVar = new ite(iusVar);
        iteVar.a(str);
        e().put(iusVar.hashCode(), iteVar);
        ((com.taobao.android.meta.structure.childpage.c) J()).a(iteVar);
        return iteVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View] */
    public final void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        int paddingBottom = g().u().getPaddingBottom();
        int size = this.f.size();
        while (i < size) {
            iuk<?, ?> iukVar = this.f.get(i);
            kotlin.jvm.internal.q.a((Object) iukVar, "listHeaders[i]");
            ?? view = iukVar.getView();
            if (view != 0) {
                paddingBottom += view.getMeasuredHeight();
            }
            i++;
        }
        a(0, paddingBottom, z);
    }

    public final void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            a(this.e, z, z2);
        }
    }

    public final void b(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ff8829", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            a(this.c, z, z2);
        }
    }

    private final void a(l lVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28fcccb1", new Object[]{this, lVar, new Boolean(z), new Boolean(z2)});
            return;
        }
        g().r();
        if (z2) {
            p();
        }
        a(lVar, z, (htf) null);
    }
}

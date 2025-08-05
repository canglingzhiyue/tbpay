package com.taobao.android.searchbaseframe.xsl.refact;

import android.graphics.Rect;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.TypeCastException;
import tb.iru;
import tb.itm;
import tb.iuk;
import tb.ium;
import tb.kge;

/* loaded from: classes6.dex */
public final class m extends com.taobao.android.meta.structure.list.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final e f15041a;
    private final HashMap<Integer, Boolean> b;
    private final Rect c;

    static {
        kge.a(-215469698);
    }

    public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 92838762:
                super.c();
                return null;
            case 94685804:
                super.e();
                return null;
            case 95609325:
                super.f();
                return null;
            case 96532846:
                super.g();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.taobao.android.meta.structure.list.h widget) {
        super(widget);
        kotlin.jvm.internal.q.c(widget, "widget");
        ium parent = widget.getParent();
        if (parent == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.xsl.refact.XslChildPageWidget");
        }
        this.f15041a = (e) parent;
        this.b = new HashMap<>();
        this.c = new Rect();
    }

    @Override // com.taobao.android.meta.structure.list.e
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        j();
    }

    @Override // com.taobao.android.meta.structure.list.e
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        j();
    }

    @Override // com.taobao.android.meta.structure.list.e
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        super.g();
        j();
    }

    @Override // com.taobao.android.meta.structure.list.e
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        this.b.clear();
        j();
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    private final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        iru iruVar = (iru) i().getModel();
        kotlin.jvm.internal.q.a((Object) iruVar, "widget.model");
        if (iruVar.g()) {
            Iterator<iuk<?, ?>> it = this.f15041a.cP_().iterator();
            while (it.hasNext()) {
                iuk<?, ?> widget = it.next();
                kotlin.jvm.internal.q.a((Object) widget, "widget");
                ?? view = widget.getView();
                if (view != 0) {
                    view.getGlobalVisibleRect(this.c);
                    if (this.c.width() > 0 && this.c.height() > 0) {
                        a(widget, true);
                    } else {
                        a(widget, false);
                    }
                }
            }
            return;
        }
        Iterator<iuk<?, ?>> it2 = this.f15041a.cP_().iterator();
        while (it2.hasNext()) {
            iuk<?, ?> widget2 = it2.next();
            kotlin.jvm.internal.q.a((Object) widget2, "widget");
            a(widget2, false);
        }
    }

    private final void a(iuk<?, ?> iukVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de21c03b", new Object[]{this, iukVar, new Boolean(z)});
            return;
        }
        this.b.put(Integer.valueOf(iukVar.hashCode()), Boolean.valueOf(z));
        if (!(!kotlin.jvm.internal.q.a(this.b.get(Integer.valueOf(iukVar.hashCode())), Boolean.valueOf(z)))) {
            return;
        }
        if (z) {
            if (!(iukVar instanceof itm)) {
                return;
            }
            ((itm) iukVar).k();
        } else if (!(iukVar instanceof itm)) {
        } else {
            ((itm) iukVar).l();
        }
    }
}

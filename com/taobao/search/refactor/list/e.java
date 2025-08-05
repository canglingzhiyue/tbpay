package com.taobao.search.refactor.list;

import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.list.h;
import com.taobao.search.common.util.r;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.iru;
import tb.kge;
import tb.ntk;

/* loaded from: classes7.dex */
public final class e extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ntk f19319a;
    private DynamicCardBean b;

    /* loaded from: classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DynamicCardBean f19320a;
        public final /* synthetic */ e b;

        public a(DynamicCardBean dynamicCardBean, e eVar) {
            this.f19320a = dynamicCardBean;
            this.b = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ntk a2 = e.a(this.b);
            if (a2 == null) {
                return;
            }
            a2.a(this.f19320a);
        }
    }

    static {
        kge.a(-121871446);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        if (str.hashCode() == 95609325) {
            super.f();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h widget) {
        super(widget);
        q.c(widget, "widget");
    }

    public static final /* synthetic */ ntk a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ntk) ipChange.ipc$dispatch("64e03d75", new Object[]{eVar}) : eVar.f19319a;
    }

    public final void onEventMainThread(DynamicCardBean dynamicCardBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7bf57a6", new Object[]{this, dynamicCardBean});
            return;
        }
        q.c(dynamicCardBean, "dynamicCardBean");
        if (!r.H() && !j()) {
            this.b = dynamicCardBean;
            return;
        }
        ntk ntkVar = this.f19319a;
        if (ntkVar == null) {
            return;
        }
        ntkVar.a(dynamicCardBean);
    }

    @Override // com.taobao.search.refactor.list.b
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!z) {
        } else {
            iru iruVar = (iru) i().getModel();
            q.a((Object) iruVar, "widget.model");
            iruVar.d().subscribe(this);
            if (k()) {
                return;
            }
            h i = i();
            iru iruVar2 = (iru) i().getModel();
            q.a((Object) iruVar2, "widget.model");
            com.taobao.android.searchbaseframe.datasource.impl.a d = iruVar2.d();
            if (d == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonBaseDatasource");
            }
            this.f19319a = new ntk(i, (com.taobao.search.sf.datasource.c) d);
        }
    }

    @Override // com.taobao.search.refactor.list.b, com.taobao.android.meta.structure.list.e
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        DynamicCardBean dynamicCardBean = this.b;
        if (dynamicCardBean == null) {
            return;
        }
        this.b = null;
        FrameLayout frameLayout = (FrameLayout) i().getView();
        if (frameLayout == null) {
            q.a();
        }
        frameLayout.post(new a(dynamicCardBean, this));
    }
}

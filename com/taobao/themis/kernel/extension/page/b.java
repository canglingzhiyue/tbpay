package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IGlobalMenuAdapter;
import com.taobao.themis.kernel.adapter.IShareAdapter;
import com.taobao.themis.kernel.container.ui.titlebar.IMenuAction;
import com.taobao.themis.kernel.container.ui.titlebar.d;
import com.taobao.themis.kernel.extension.page.h;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.qpm;
import tb.qpt;

/* loaded from: classes9.dex */
public final class b implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IShareAdapter.a f22517a;
    private final ITMSPage b;
    private final AtomicBoolean c;
    private d.a d;

    static {
        kge.a(948762846);
        kge.a(1048136198);
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c_(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4ed18e", new Object[]{this, page});
        } else {
            kotlin.jvm.internal.q.d(page, "page");
        }
    }

    public b(ITMSPage page) {
        kotlin.jvm.internal.q.d(page, "page");
        this.b = page;
        this.c = new AtomicBoolean(false);
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            h.a.a(this);
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.h
    public void a(IShareAdapter.a params) {
        qpm f;
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar;
        IMenuAction iMenuAction;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2543d3d", new Object[]{this, params});
            return;
        }
        kotlin.jvm.internal.q.d(params, "params");
        this.f22517a = params;
        if (this.c.get()) {
            return;
        }
        this.c.set(true);
        IGlobalMenuAdapter iGlobalMenuAdapter = (IGlobalMenuAdapter) qpt.b(IGlobalMenuAdapter.class);
        this.d = iGlobalMenuAdapter != null ? iGlobalMenuAdapter.createMenuItem(this.b, IMenuAction.MenuType.SHARE) : null;
        if (this.d == null || (f = this.b.f()) == null || (titleBar = f.getTitleBar()) == null || (iMenuAction = (IMenuAction) titleBar.getAction(IMenuAction.class)) == null) {
            return;
        }
        d.a aVar = this.d;
        kotlin.jvm.internal.q.a(aVar);
        iMenuAction.a(aVar);
    }

    @Override // com.taobao.themis.kernel.extension.page.h
    public IShareAdapter.a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IShareAdapter.a) ipChange.ipc$dispatch("57129103", new Object[]{this}) : this.f22517a;
    }

    @Override // com.taobao.themis.kernel.extension.page.h
    public void b() {
        qpm f;
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar;
        IMenuAction iMenuAction;
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar2;
        IMenuAction iMenuAction2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        qpm f2 = this.b.f();
        if (f2 != null && (titleBar2 = f2.getTitleBar()) != null && (iMenuAction2 = (IMenuAction) titleBar2.getAction(IMenuAction.class)) != null) {
            iMenuAction2.eH_();
        }
        d.a aVar = this.d;
        if (aVar == null || (f = this.b.f()) == null || (titleBar = f.getTitleBar()) == null || (iMenuAction = (IMenuAction) titleBar.getAction(IMenuAction.class)) == null) {
            return;
        }
        iMenuAction.a(aVar);
    }
}

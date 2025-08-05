package com.taobao.android.searchbaseframe.xsl.refact;

import android.app.Activity;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;
import com.taobao.android.searchbaseframe.xsl.page.uikit.XslPageLayout;
import tb.itk;
import tb.kge;

/* loaded from: classes6.dex */
public final class k implements itk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.android.searchbaseframe.meta.uikit.header.behavior.d f15039a;
    private final View b;
    private XslPageLayout.a c;

    static {
        kge.a(-1447790081);
        kge.a(-1925021278);
    }

    @Override // tb.itj
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.itj
    public void a(MetaLayout metaLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b8809f", new Object[]{this, metaLayout});
        }
    }

    @Override // tb.itj
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.itj
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.itk
    public boolean bw_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10839e35", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.itj
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.itk
    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.itk
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.itk
    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        return 0;
    }

    public k(Activity activity, h config) {
        kotlin.jvm.internal.q.c(activity, "activity");
        kotlin.jvm.internal.q.c(config, "config");
        this.f15039a = new com.taobao.android.searchbaseframe.meta.uikit.header.behavior.d(3100, 1000);
        this.b = new View(activity);
        config.am().a(new XslDelegateHeader$1(this));
    }

    public static final /* synthetic */ void a(k kVar, XslPageLayout.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ac969", new Object[]{kVar, aVar});
        } else {
            kVar.c = aVar;
        }
    }

    @Override // tb.itj
    public int a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        XslPageLayout.a aVar = this.c;
        if (aVar == null) {
            return 0;
        }
        return aVar.consumePageScroll(i);
    }

    @Override // tb.itj
    public com.taobao.android.searchbaseframe.meta.uikit.header.behavior.d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.meta.uikit.header.behavior.d) ipChange.ipc$dispatch("8db2ad19", new Object[]{this}) : this.f15039a;
    }

    @Override // tb.itk
    public View d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f7f4866d", new Object[]{this}) : this.b;
    }
}

package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import tb.kge;

/* loaded from: classes3.dex */
public final class r extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f4020a;
    private final com.alibaba.triver.triver_shop.newShop.data.g b;
    private final FrameLayout c;
    private WeexInstance d;

    static {
        kge.a(-843421253);
    }

    public static /* synthetic */ Object ipc$super(r rVar, String str, Object... objArr) {
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
    public r(Context context, com.alibaba.triver.triver_shop.newShop.data.g tabBarItemDataModel) {
        super(context, tabBarItemDataModel);
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(tabBarItemDataModel, "tabBarItemDataModel");
        this.f4020a = context;
        this.b = tabBarItemDataModel;
        this.c = new FrameLayout(this.f4020a);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.j(this.c);
        com.alibaba.triver.triver_shop.newShop.ext.o.k(this.c);
        return this.c;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        if (this.d != null) {
            return;
        }
        a();
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        String h = this.b.h();
        this.d = com.taobao.android.weex.e.a(this.f4020a, h, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, null);
        FrameLayout frameLayout = this.c;
        WeexInstance weexInstance = this.d;
        kotlin.jvm.internal.q.a(weexInstance);
        frameLayout.addView(weexInstance.getRootView());
        WeexInstance weexInstance2 = this.d;
        kotlin.jvm.internal.q.a(weexInstance2);
        weexInstance2.initWithURL(h);
        WeexInstance weexInstance3 = this.d;
        kotlin.jvm.internal.q.a(weexInstance3);
        weexInstance3.render(null);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        WeexInstance weexInstance = this.d;
        if (weexInstance == null) {
            return;
        }
        weexInstance.onActivityPause();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        WeexInstance weexInstance = this.d;
        if (weexInstance == null) {
            return;
        }
        weexInstance.onActivityResume();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        super.g();
        WeexInstance weexInstance = this.d;
        if (weexInstance == null) {
            return;
        }
        weexInstance.destroy();
    }
}

package com.alibaba.triver.triver_shop.container.shopLoft;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class WidgetLoftView$onRenderError$2 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetLoftView$onRenderError$2(i iVar) {
        super(0);
        this.this$0 = iVar;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        i iVar = this.this$0;
        if (i.$ipChange != null) {
            return;
        }
        i iVar2 = this.this$0;
        if (i.$ipChange == null) {
            return;
        }
        i iVar3 = this.this$0;
        try {
            Result.a aVar = Result.Companion;
            View view = null;
            i.a(iVar3, LayoutInflater.from(i.$ipChange).inflate(R.layout.view_shop_loft_common_error, (ViewGroup) null));
            if (i.$ipChange == null) {
                return;
            }
            TRWidgetInstance tRWidgetInstance = i.$ipChange;
            if (tRWidgetInstance != null) {
                view = tRWidgetInstance.getRootView();
            }
            View view2 = i.$ipChange;
            if (view2 != null && (findViewById = view2.findViewById(R.id.shop_loft_no_data_image)) != null && (findViewById instanceof TUrlImageView)) {
                ((TUrlImageView) findViewById).setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN012ByUmB1g6BZhIrRaa_!!6000000004092-0-tps-480-480.jpg");
            }
            if (view instanceof ViewGroup) {
                View view3 = i.$ipChange;
                q.a(view3);
                o.a((ViewGroup) view, view3);
            }
            Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
    }
}

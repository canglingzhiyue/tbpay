package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.shop2023.nativeview.e;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public final class Shop2023CategoryNativeComponent$initView$1$2 extends Lambda implements rul<RecyclerView, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shop2023CategoryNativeComponent$initView$1$2(e eVar) {
        super(1);
        this.this$0 = eVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(RecyclerView recyclerView) {
        invoke2(recyclerView);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(RecyclerView RecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ee232d", new Object[]{this, RecyclerView});
            return;
        }
        q.d(RecyclerView, "$this$RecyclerView");
        e.a(this.this$0, RecyclerView);
        RecyclerView recyclerView = RecyclerView;
        o.h(recyclerView, o.d((Number) 6));
        e eVar = this.this$0;
        RecyclerView.setBackgroundColor(e.$ipChange);
        o.i(recyclerView, o.d(Integer.valueOf((int) Result.ALIPAY_GENERATE_UNREG_NODE_FAILED)));
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.width = -1;
            layoutParams2.height = -1;
        } else {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.width = -1;
            layoutParams3.height = -1;
            t tVar = t.INSTANCE;
            recyclerView.setLayoutParams(layoutParams3);
        }
        RecyclerView.setAdapter(new e.c(this.this$0));
    }
}

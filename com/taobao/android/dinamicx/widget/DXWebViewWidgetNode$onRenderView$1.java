package com.taobao.android.dinamicx.widget;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.component.DXWebView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes5.dex */
public final class DXWebViewWidgetNode$onRenderView$1 extends Lambda implements ruk<kotlin.t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ah this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXWebViewWidgetNode$onRenderView$1(ah ahVar) {
        super(0);
        this.this$0 = ahVar;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ kotlin.t mo2427invoke() {
        mo2427invoke();
        return kotlin.t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ah ahVar = this.this$0;
        DXWebView dXWebView = ah.$ipChange;
        if (dXWebView != null) {
            dXWebView.resetRequestStatus();
        }
        ah ahVar2 = this.this$0;
        DXWebView dXWebView2 = ah.$ipChange;
        if (dXWebView2 != null) {
            ah ahVar3 = this.this$0;
            dXWebView2.setScrollConfig(ah.$ipChange, this.this$0);
        }
        ah ahVar4 = this.this$0;
        DXWebView dXWebView3 = ah.$ipChange;
        if (dXWebView3 != null) {
            dXWebView3.resetAnchorState();
        }
        ah ahVar5 = this.this$0;
        DXWebView dXWebView4 = ah.$ipChange;
        if (dXWebView4 != null) {
            ah ahVar6 = this.this$0;
            dXWebView4.setEnableInterceptTopScroll(ah.$ipChange);
        }
        ah ahVar7 = this.this$0;
        if (!ah.$ipChange) {
            return;
        }
        ah.a(this.this$0, null, 1, null);
    }
}

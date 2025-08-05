package com.taobao.themis.widget.platformview;

import com.alibaba.ariver.integration.embedview.BaseEmbedView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.widget.platformview.TMSWidgetEmbedInnerFrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/taobao/themis/widget/platformview/TMSWidgetEmbedInnerFrameLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSBasePlatformView$mRootView$2 extends Lambda implements ruk<TMSWidgetEmbedInnerFrameLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSBasePlatformView$mRootView$2(c cVar) {
        super(0);
        this.this$0 = cVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final TMSWidgetEmbedInnerFrameLayout mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSWidgetEmbedInnerFrameLayout) ipChange.ipc$dispatch("c637008", new Object[]{this}) : new TMSWidgetEmbedInnerFrameLayout(this.this$0.a()).whenSizeChanged(new TMSWidgetEmbedInnerFrameLayout.a() { // from class: com.taobao.themis.widget.platformview.TMSBasePlatformView$mRootView$2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.themis.widget.platformview.TMSWidgetEmbedInnerFrameLayout.a
            public final void a(int i, int i2, int i3, int i4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                    return;
                }
                c cVar = TMSBasePlatformView$mRootView$2.this.this$0;
                BaseEmbedView baseEmbedView = c.$ipChange;
                if (baseEmbedView == null) {
                    return;
                }
                baseEmbedView.onEmbedViewSizeChanged(i, i2);
            }
        }).whenWindowVisibilityChanged(new TMSWidgetEmbedInnerFrameLayout.b() { // from class: com.taobao.themis.widget.platformview.TMSBasePlatformView$mRootView$2.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.themis.widget.platformview.TMSWidgetEmbedInnerFrameLayout.b
            public final void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                } else if (i == 0) {
                    c cVar = TMSBasePlatformView$mRootView$2.this.this$0;
                    BaseEmbedView baseEmbedView = c.$ipChange;
                    if (baseEmbedView == null) {
                        return;
                    }
                    baseEmbedView.onWebViewResume();
                } else if (i != 8 && i != 4) {
                } else {
                    c cVar2 = TMSBasePlatformView$mRootView$2.this.this$0;
                    BaseEmbedView baseEmbedView2 = c.$ipChange;
                    if (baseEmbedView2 == null) {
                        return;
                    }
                    baseEmbedView2.onWebViewPause();
                }
            }
        });
    }
}

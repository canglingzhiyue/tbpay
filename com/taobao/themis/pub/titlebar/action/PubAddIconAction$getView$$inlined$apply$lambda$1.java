package com.taobao.themis.pub.titlebar.action;

import android.content.Context;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ood;
import tb.qrc;
import tb.qrd;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/widget/FrameLayout;", "invoke", "com/taobao/themis/pub/titlebar/action/PubAddIconAction$getView$1$2"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class PubAddIconAction$getView$$inlined$apply$lambda$1 extends Lambda implements rul<FrameLayout, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Context $context$inlined;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubAddIconAction$getView$$inlined$apply$lambda$1(a aVar, Context context) {
        super(1);
        this.this$0 = aVar;
        this.$context$inlined = context;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(FrameLayout frameLayout) {
        invoke2(frameLayout);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(FrameLayout it) {
        com.taobao.themis.kernel.f b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1280c02", new Object[]{this, it});
            return;
        }
        q.d(it, "it");
        ITMSPage a2 = a.a(this.this$0);
        if (a2 != null && (b = a2.b()) != null) {
            qrc.a(b, new qrd.b() { // from class: com.taobao.themis.pub.titlebar.action.PubAddIconAction$getView$$inlined$apply$lambda$1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.qrd.b
                public void onResult(PubUserGuideModule pubUserGuideModule) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6fdbe268", new Object[]{this, pubUserGuideModule});
                    } else if (pubUserGuideModule == null) {
                    } else {
                        ITMSPage a3 = a.a(PubAddIconAction$getView$$inlined$apply$lambda$1.this.this$0);
                        q.a(a3);
                        ITMSPage a4 = a.a(PubAddIconAction$getView$$inlined$apply$lambda$1.this.this$0);
                        q.a(a4);
                        ITMSPage a5 = a.a(PubAddIconAction$getView$$inlined$apply$lambda$1.this.this$0);
                        q.a(a5);
                        com.taobao.themis.pub_kit.utils.f.b("Page_MiniApp_Button-NavBar-2", ai.b(kotlin.j.a("miniapp_id", a3.b().h()), kotlin.j.a(ood.HOME_BUCKETS, com.taobao.themis.pub_kit.guide.model.a.a(pubUserGuideModule)), kotlin.j.a("spm", "Page_MiniApp.1.NavBar.2"), kotlin.j.a("pageId", a4.c().e().a()), kotlin.j.a("pageUrl", a5.e())));
                    }
                }
            });
        }
        a aVar = this.this$0;
        PubUserGuideModule pubUserGuideModule = a.$ipChange;
        if (pubUserGuideModule == null) {
            return;
        }
        this.this$0.a(pubUserGuideModule);
    }
}

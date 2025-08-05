package com.taobao.themis.pub.titlebar;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.pub.titlebar.action.j;
import com.taobao.themis.pub_kit.config.PubContainerContext;
import com.taobao.themis.pub_kit.guide.PubAddIconGuide;
import com.taobao.themis.pub_kit.guide.model.PubNavBarModel;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.aem;
import tb.qqc;
import tb.qrc;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class PubTitleBar$initTitleBarActions$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ITMSPage $page;
    public final /* synthetic */ PubUserGuideModule $pubUserGuideModule;
    public final /* synthetic */ PubTitleBar this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubTitleBar$initTitleBarActions$1(PubTitleBar pubTitleBar, PubUserGuideModule pubUserGuideModule, ITMSPage iTMSPage) {
        super(0);
        this.this$0 = pubTitleBar;
        this.$pubUserGuideModule = pubUserGuideModule;
        this.$page = iTMSPage;
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
        PubContainerContext c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        PubUserGuideModule pubUserGuideModule = this.$pubUserGuideModule;
        PubAddIconGuide pubAddIconGuide = null;
        if (pubUserGuideModule == null) {
            PubTitleBar.access$addRightAction(this.this$0, new j(null));
            for (com.taobao.themis.kernel.container.ui.titlebar.a aVar : PubTitleBar.access$getMTitleView$p(this.this$0).getActions()) {
                aVar.a(this.$page);
            }
            return;
        }
        PubTitleBar.access$addRightAction(this.this$0, new j(pubUserGuideModule));
        PubNavBarModel navbar = this.$pubUserGuideModule.getNavbar();
        if (navbar == null) {
            navbar = new PubNavBarModel();
        }
        if (navbar.getEnableAddIconButton()) {
            PubTitleBar.access$initAddIconAction(this.this$0, this.$page, this.$pubUserGuideModule);
        }
        PubTitleBar.access$initRecommendGuide(this.this$0, this.$page, this.$pubUserGuideModule);
        aem a2 = aem.a();
        PubTitleBar pubTitleBar = this.this$0;
        a2.a(PubTitleBar.$ipChange);
        if (qqc.a(this.$page)) {
            PubTitleBar.access$initPopWindows(this.this$0, this.$page, this.$pubUserGuideModule);
            PubTitleBar.access$registerBackGuide(this.this$0, this.$page);
        } else {
            PubContainerContext c2 = qrc.c(this.$page.b());
            if (c2 != null) {
                pubAddIconGuide = c2.getPubAddIconGuide();
            }
            if (pubAddIconGuide == null && (c = qrc.c(this.$page.b())) != null) {
                Context access$getMContext$p = PubTitleBar.access$getMContext$p(this.this$0);
                PubUserGuideModule pubUserGuideModule2 = this.$pubUserGuideModule;
                PubTitleBar pubTitleBar2 = this.this$0;
                c.setPubAddIconGuide(new PubAddIconGuide(access$getMContext$p, pubUserGuideModule2, PubTitleBar.$ipChange, new PubAddIconGuide.b() { // from class: com.taobao.themis.pub.titlebar.PubTitleBar$initTitleBarActions$1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.themis.pub_kit.guide.PubAddIconGuide.b
                    public final void onDismiss() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                            return;
                        }
                        j jVar = (j) PubTitleBar$initTitleBarActions$1.this.this$0.getAction(j.class);
                        if (jVar != null) {
                            jVar.l();
                        }
                        PubContainerContext c3 = qrc.c(PubTitleBar$initTitleBarActions$1.this.$page.b());
                        if (c3 == null) {
                            return;
                        }
                        c3.setAddIconGuideIsShowing(false);
                    }
                }));
            }
        }
        for (com.taobao.themis.kernel.container.ui.titlebar.a aVar2 : PubTitleBar.access$getMTitleView$p(this.this$0).getActions()) {
            aVar2.a(this.$page);
        }
    }
}

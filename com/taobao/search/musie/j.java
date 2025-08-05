package com.taobao.search.musie;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_uikit.UIKitEngine;
import com.taobao.android.weex_uikit.widget.img.Image;
import com.taobao.downgrade.Downgrade;
import com.taobao.search.jarvis.JarvisKitModule;
import com.taobao.search.jarvis.MUSJarvisKitModule;
import com.taobao.search.jarvis.rcmd.SearchXslSdk;
import com.taobao.search.musie.component.MusShopInfo;
import com.taobao.search.musie.component.MusTheme;
import com.taobao.search.musie.component.audio.Audio;
import com.taobao.search.musie.component.filter.TbFilter;
import com.taobao.search.musie.component.shadow.TbShadow;
import com.taobao.search.musie.component.tbscroll.TbScroller;
import com.taobao.search.musie.component.tbscroll.TbScrollerFoot;
import com.taobao.search.musie.img.BlurImage;
import com.taobao.search.musie.img.FilterImage;
import com.taobao.search.musie.img.LowDeviceImage;
import com.taobao.search.musie.img.MUSImage;
import com.taobao.search.musie.livevideo.video.MUSLiveVideoView;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.search.musie.lottie.MUSLottie;
import com.taobao.search.musie.pager.TbSlide;
import com.taobao.search.musie.pager.TbSlideFooter;
import com.taobao.search.musie.pager.TbSlideItem;
import com.taobao.search.musie.stack.MUStack;
import com.taobao.search.musie.stack.MUStackItem;
import com.taobao.search.musie.taowise.MUSMarkDown;
import com.taobao.search.musie.videoscroll.MUSVideoScroll;
import com.taobao.search.musie.videoscroll.VideoScrollNode;
import com.taobao.search.musie.web.MusWeb;
import com.taobao.search.musie.weex.MusWeex;
import com.taobao.search.weex.module.SearchFestivalModule;
import com.taobao.search.weex.module.SearchTimeModule;
import tb.cri;
import tb.ivn;
import tb.kge;

/* loaded from: classes7.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f19253a;

    static {
        kge.a(-1452554586);
        f19253a = false;
    }

    public static synchronized void a(Application application) {
        String str;
        com.taobao.android.weex_framework.ui.d aVar;
        synchronized (j.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75c56f77", new Object[]{application});
                return;
            }
            e eVar = null;
            if (f19253a) {
                if (!(com.taobao.android.weex_framework.l.a().f() instanceof e)) {
                    if (com.taobao.search.common.util.r.cj()) {
                        eVar = new e();
                    }
                    if (eVar != null) {
                        com.taobao.android.weex_framework.l.a().a(eVar);
                    }
                }
                return;
            }
            f19253a = true;
            System.loadLibrary("c++_shared");
            com.taobao.search.common.util.n.INSTANCE.h();
            MUSEngine.registerModule("xsearchEvent", MUSXSearchEventModule.class);
            MUSEngine.registerModule("categoryEvent", MUSCategoryModule.class);
            MUSEngine.registerModule("SearchOpen", MUSSearchOpenModule.class);
            MUSEngine.registerModule(SearchStdReportModule.MODULE_NAME, SearchStdReportModule.class);
            MUSEngine.registerModule("TBSearchHistory", MUSSearchHistoryModule.class);
            MUSEngine.registerModule(JarvisKitModule.MODULE_NAME, MUSJarvisKitModule.class);
            MUSEngine.registerModule(SearchFestivalModule.MODULE_NAME, MUSSearchFestivalModule.class);
            MUSEngine.registerModule(SearchTimeModule.MODULE_NAME, MUSSearchTimeModule.class);
            MUSEngine.registerModule("ObservableMemCache", MUSObservableValueModule.class);
            MUSEngine.registerModule("ObservablePageStorage", MUSObservablePageStorageModule.class);
            MUSEngine.registerUINode(VideoScrollNode.TAG, new MUSVideoScroll.a());
            MUSEngine.registerUINode(MUSLiveVideoView.TAG_NAME, MusLiveVideo.class);
            MUSEngine.registerUINode("mus-stack-item", MUStackItem.class);
            MUSEngine.registerUINode("tb-audio", Audio.class);
            MUSEngine.registerUINode("tb-filter", TbFilter.class);
            MUSEngine.registerUINode("tb-shadow", TbShadow.class);
            MUSEngine.registerUINode("tb-blur-img", BlurImage.class);
            MUSEngine.registerUINode("tb-slide", TbSlide.class);
            MUSEngine.registerUINode("tb-slide-item", TbSlideItem.class);
            MUSEngine.registerUINode("tb-slide-footer", TbSlideFooter.class);
            if (!"degrade".equals(Downgrade.getInstance().getDowngradeStrategy("search").getTacticsPerformance())) {
                str = "tb-img";
                aVar = new MUSImage.a();
            } else if (com.taobao.search.common.util.n.INSTANCE.g()) {
                str = "tb-img";
                aVar = new LowDeviceImage.a();
            } else {
                str = "tb-img";
                aVar = new Image.a();
            }
            MUSEngine.registerUINode(str, aVar);
            MUSEngine.registerUINode("mus-web", MusWeb.class);
            MUSEngine.registerUINode("mus-weex", MusWeex.class, true);
            MUSEngine.registerUINode("tb-shop-info", MusShopInfo.class);
            MUSEngine.registerUINode("mus-stack", MUStack.class);
            MUSEngine.registerUINode("tb-filter-img", new FilterImage.a());
            MUSEngine.registerUINode("tb-theme", MusTheme.class);
            MUSEngine.registerUINode("tb-scroll", TbScroller.class);
            MUSEngine.registerUINode("tb-scroll-footer", TbScrollerFoot.class);
            MUSEngine.registerUINode("mus-lottie", MUSLottie.class);
            MUSEngine.registerUINode("mus-markdown", MUSMarkDown.class, true);
            ivn.f29334a = com.taobao.search.common.util.r.bf();
            ivn.b = com.taobao.search.common.util.r.bg();
            UIKitEngine.registerVideoCreator(new com.taobao.search.musie.video.b());
            SearchXslSdk.install();
            cri.a();
            if (com.taobao.search.common.util.r.cj()) {
                eVar = new e();
            }
            if (eVar != null) {
                com.taobao.android.weex_framework.l.a().a(eVar);
            }
        }
    }
}

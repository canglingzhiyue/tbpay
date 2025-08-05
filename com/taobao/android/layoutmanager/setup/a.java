package com.taobao.android.layoutmanager.setup;

import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.AnimationViewComponent;
import com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent;
import com.taobao.tao.flexbox.layoutmanager.component.ae;
import com.taobao.tao.flexbox.layoutmanager.component.af;
import com.taobao.tao.flexbox.layoutmanager.component.y;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.log.TLog;
import tb.kge;
import tb.sgm;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-698720305);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        ab.a("tbplayer", TBVideoComponent.class);
        ab.a("lottie", AnimationViewComponent.class);
        ab.a("weex", ae.class);
        ab.a("web", sgm.class);
        ab.a("webview", sgm.class);
        ab.a("theme", y.class);
        ab.a("dx", af.class);
        try {
            ab.a("liveroom", com.taobao.android.tab2liveroom.liveroom.a.class);
        } catch (Throwable th) {
            TLog.loge("ComponentRegister", "注册直播组件异常，throwable=" + th);
        }
        try {
            Class<?> a2 = com.taobao.android.fluid.c.a(ab.a());
            if (a2 != null) {
                ab.a("fullpageplayer", (Class<? extends Component>) a2);
            }
        } catch (Throwable th2) {
            TLog.loge("ComponentRegister", th2.getMessage());
        }
        try {
            ab.a("interactContainer", (Class<? extends Component>) Class.forName("com.taobao.tab2interact.pageadapter.guangguang.GGInteractContainerComponent"));
        } catch (Throwable th3) {
            TLog.loge("ComponentRegister", "注册互动容器组件异常，throwable=" + th3);
        }
        ab.a("bottomsheet", "com.taobao.tao.flexbox.layoutmanager.component.BottomSheetComponent");
        ab.a("imagescanner", "com.taobao.tao.flexbox.layoutmanager.component.ImageScannerComponent");
        ab.a("opacityView", "com.taobao.tao.flexbox.layoutmanager.component.OpacityComponent");
        ab.a("photoView", "com.taobao.tao.flexbox.layoutmanager.component.PhotoViewComponent");
        ab.a("nav", "com.taobao.tao.flexbox.layoutmanager.component.NavComponent");
        ab.a("gotop", "com.taobao.tao.flexbox.layoutmanager.component.GoTopComponent");
        ab.a("exposureView", "com.taobao.tao.flexbox.layoutmanager.component.ExposureComponent");
        ab.a("dragButton", "com.taobao.tao.flexbox.layoutmanager.component.DragButtonComponent");
        ab.a(UiUtil.INPUT_TYPE_VALUE_CHECKBOX, "com.taobao.tao.flexbox.layoutmanager.component.CheckBoxComponent");
        ab.a("livephoto", "com.taobao.tao.flexbox.layoutmanager.component.LivePhotoComponent");
        ab.a("viewpager", "com.taobao.tao.flexbox.layoutmanager.component.ViewPagerComponent");
        ab.a(com.taobao.mmad.data.b.TYPE_BANNER, "com.taobao.tao.flexbox.layoutmanager.component.BannerComponent");
    }
}

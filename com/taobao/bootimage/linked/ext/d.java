package com.taobao.bootimage.linked.ext;

import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.bootimage.linked.b;
import com.taobao.bootimage.linked.f;
import com.taobao.bootimage.linked.h;
import com.taobao.tao.infoflow.multitab.e;
import com.ut.share.business.ShareBusiness;
import tb.kej;
import tb.keo;
import tb.kge;
import tb.lsk;
import tb.tiq;

/* loaded from: classes6.dex */
public class d implements com.taobao.bootimage.linked.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private LinkedSplashData f16708a;
    private final f b;
    private boolean c = false;

    static {
        kge.a(656155494);
        kge.a(924978914);
    }

    @Override // com.taobao.bootimage.linked.b
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "popView";
    }

    @Override // com.taobao.bootimage.linked.b
    public void a(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee262b0", new Object[]{this, linkedSplashData});
        }
    }

    public d(f fVar) {
        this.b = fVar;
    }

    @Override // com.taobao.bootimage.linked.b
    public boolean b(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("526d8075", new Object[]{this, linkedSplashData})).booleanValue() : a(linkedSplashData, false);
    }

    @Override // com.taobao.bootimage.linked.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            kej.a("LinkedSplashPopImpl", "onShown");
        }
    }

    @Override // com.taobao.bootimage.linked.b
    public boolean a(b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b396a9b", new Object[]{this, aVar})).booleanValue();
        }
        String b = h.a(lsk.BIZ_NAME).d().b();
        if (ShareBusiness.getInstance().hasTaoPassword()) {
            kej.a("LinkedSplashPopImpl", "shouldAnimate false，hasTaoPassword = true");
            a("PopShouldAnimate", "POP_HAS_TAO_PASSWORD_FAIL");
            return false;
        }
        if (a(b)) {
            kej.a("LinkedSplashPopImpl", "shouldAnimate false. hasOtherLevelRequestingPop = true");
        }
        if (b.a.FROM_CLOSE.equals(aVar.f16704a)) {
            kej.a("LinkedSplashPopImpl", "shouldAnimate, false, fromAction =  user skip");
            a("PopShouldAnimate", "POP_FROM_CLOSE_FAIL");
            return false;
        }
        String d = com.taobao.bootimage.interact.pop.d.d(b);
        if (!"".equals(d)) {
            kej.a("LinkedSplashPopImpl", "shouldAnimate, false, isPopReadyToDisplay = " + d + ", popIndexId = " + b);
        }
        LinkedSplashData linkedSplashData = this.f16708a;
        if (linkedSplashData == null) {
            kej.a("LinkedSplashPopImpl", "shouldAnimate, false, currentData = null");
            a("PopShouldAnimate", "POP_DATA_FAIL");
            return false;
        }
        JSONObject a2 = c.a(linkedSplashData.getLinkedData("popView"), "item", "render", e.KEY_SMART_CONTENT, "position");
        if (a2 == null) {
            kej.a("LinkedSplashPopImpl", "shouldAnimate, false, positionObj = null");
            a("PopShouldAnimate", "POP_POSITION_FAIL");
            return false;
        }
        aVar.c = a2.getIntValue("height");
        aVar.b = a2.getIntValue("width");
        aVar.d = a2.getIntValue("right");
        aVar.e = a2.getIntValue("tabBarBottom");
        b(aVar);
        kej.a("LinkedSplashPopImpl", "shouldAnimate, options = " + aVar);
        return true;
    }

    @Override // com.taobao.bootimage.linked.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            kej.a("LinkedSplashPopImpl", "onAnimationStart");
        }
    }

    @Override // com.taobao.bootimage.linked.b
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            kej.a("LinkedSplashPopImpl", "onAnimationEnd");
        }
    }

    @Override // com.taobao.bootimage.linked.b
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        String b = h.a(lsk.BIZ_NAME).d().b();
        if (ShareBusiness.getInstance().hasTaoPassword()) {
            kej.a("LinkedSplashPopImpl", "onTerminate，return, isTaoPasswordShown = true");
            a("PopOnTerminate", "POP_HAS_TAO_PASSWORD_FAIL");
            return;
        }
        if (a(b)) {
            kej.a("LinkedSplashPopImpl", "onTerminate return. hasOtherLevelRequestingPop = true");
        }
        if (StringUtils.isEmpty(b)) {
            kej.a("LinkedSplashPopImpl", "onTerminate, return, StringUtils.isEmpty(popIndexId), popIndexId = " + b);
            a("PopOnTerminate", "POP_INDEX_ID_FAIL");
            return;
        }
        String c = com.taobao.bootimage.interact.pop.d.c(b);
        a("PopOnTerminate", "POP_NOTIFY_DISPLAY" + c);
        kej.a("LinkedSplashPopImpl", "onTerminate, finish, PopNativeApi.notifyPopToDisplay = " + b);
    }

    @Override // com.taobao.bootimage.linked.b
    public boolean c(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("95f89e36", new Object[]{this, linkedSplashData})).booleanValue() : a(linkedSplashData, true);
    }

    private void b(b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc8c0736", new Object[]{this, aVar});
            return;
        }
        DisplayMetrics displayMetrics = com.taobao.bootimage.f.b().getResources().getDisplayMetrics();
        double d = displayMetrics.widthPixels / 750.0d;
        aVar.b = (int) (aVar.b * d);
        aVar.c = (int) (aVar.c * d);
        aVar.d = (displayMetrics.widthPixels - aVar.b) - ((int) (aVar.d * d));
        aVar.e = (displayMetrics.heightPixels - aVar.c) - ((int) (aVar.e * d));
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        String b = com.taobao.bootimage.interact.pop.d.b(str);
        if (StringUtils.equals("NO_OTHER_LAYER_POP", b)) {
            kej.a("LinkedSplashPopImpl", "hasOtherLevelRequestingPop true, reason:NO_OTHER_LAYER_POP");
            return false;
        }
        if (StringUtils.equals("", b)) {
            b = "has other level requesting pop.";
        }
        kej.a("LinkedSplashPopImpl", "hasOtherLevelRequestingPop true, reason:" + b);
        return true;
    }

    private boolean a(LinkedSplashData linkedSplashData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd6aa628", new Object[]{this, linkedSplashData, new Boolean(z)})).booleanValue();
        }
        this.f16708a = linkedSplashData;
        this.c = z;
        a("PopShouldShow", "POP_START");
        String b = h.a(lsk.BIZ_NAME).d().b();
        if (StringUtils.isEmpty(b)) {
            kej.a("LinkedSplashPopImpl", "shouldShow popIndexId is null");
            a("PopShouldShow", "POP_INDEX_ID_FAIL");
            return false;
        } else if (ShareBusiness.getInstance().hasTaoPassword()) {
            kej.a("LinkedSplashPopImpl", "shouldShow,false，hasTaoPassword = true");
            a("PopShouldShow", "POP_HAS_TAO_PASSWORD_FAIL");
            return false;
        } else if (!this.b.a() && !z) {
            kej.a("LinkedSplashPopImpl", "shouldShow,false, isAtHomepage = false");
            a("PopShouldShow", "POP_NOT_HOMEPAGE_FAIL");
            return false;
        } else {
            String a2 = com.taobao.bootimage.interact.pop.d.a();
            if (!"".equals(a2)) {
                kej.a("LinkedSplashPopImpl", "shouldShow,false, checkMamaCommercialSplashCanStart = " + a2);
                a("PopShouldShow", "POP_SDK_INIT_FAIL");
                return false;
            }
            com.taobao.bootimage.interact.pop.d.a(b, this.f16708a);
            return true;
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            h.a(lsk.BIZ_NAME).h().a(tiq.BIZ_CODE, keo.i(), "PopError", str, str2, null);
        }
    }
}

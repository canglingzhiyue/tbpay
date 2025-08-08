package com.taobao.performance;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.home.component.utils.j;
import com.taobao.android.home.component.utils.m;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.homepage.utils.n;
import com.taobao.tao.Globals;
import tb.kge;
import tb.lcx;
import tb.oqc;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MULTI_TAB_OPT = "enableMultiTabOpt";
    private static Boolean e;
    private static Boolean f;

    /* renamed from: a  reason: collision with root package name */
    private Boolean f18678a;
    private Boolean b;
    private Boolean c;
    private Boolean d;

    static {
        kge.a(1640940446);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f18678a == null) {
            this.f18678a = Boolean.valueOf(ABGlobal.isFeatureOpened(Globals.getApplication(), "enableHomeOptExperimentV2"));
        }
        com.taobao.android.home.component.utils.e.e("HomepageOptUtils", "enableHomeOpt  = " + this.f18678a + " ,time: " + (System.currentTimeMillis() - currentTimeMillis));
        return this.f18678a.booleanValue();
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (this.b == null) {
            this.b = Boolean.valueOf(ABGlobal.isFeatureOpened(Globals.getApplication(), "offlineHomeLauncherMeasureSwitch"));
        }
        com.taobao.android.home.component.utils.e.e("HomepageOptUtils", "offlineOptMeasureSwitch  = " + this.b);
        return this.b.booleanValue();
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        boolean a2 = j.a("disableOptTools", true);
        com.taobao.android.home.component.utils.e.e("HomepageOptUtils", "disableOptTools  = " + a2);
        return a2;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        JSONObject c = oqc.a().b().c();
        if (c != null) {
            return "TRUE".equalsIgnoreCase(c.getString(str));
        }
        return false;
    }

    private boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : a("enablePowerOptimization");
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : k();
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        if (this.d == null) {
            if (BootstrapMode.b() || BootstrapMode.c()) {
                z = true;
            }
            this.d = Boolean.valueOf(z);
        }
        return this.d.booleanValue();
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : com.taobao.homepage.utils.b.c() && j.a("enableFoldDeviceDelayColdStartReq", true);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        boolean a2 = lcx.a(null, null, "disable_out_link_delay_cold_start");
        com.taobao.android.home.component.utils.e.e("HomepageOptUtils", "disable_out_link_delay_cold_start: " + a2);
        return a2;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue();
        }
        boolean z = BootstrapMode.c() && ABGlobal.isFeatureOpened(Globals.getApplication(), "disableIconPreRender");
        com.taobao.android.home.component.utils.e.e("HomepageOptUtils", "disableIconPreRender  = " + z);
        return z;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue();
        }
        boolean z = BootstrapMode.c() && ABGlobal.isFeatureOpened(Globals.getApplication(), "disableGongGePreRender");
        com.taobao.android.home.component.utils.e.e("HomepageOptUtils", "disableGongGePreRender  = " + z);
        return z;
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue();
        }
        boolean c = c();
        com.taobao.android.home.component.utils.e.e("HomepageOptUtils", "disableInfoFlowPreRender  = " + c);
        return c;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue();
        }
        boolean c = c();
        com.taobao.android.home.component.utils.e.e("HomepageOptUtils", "enableAsyncBinderMethodByCreateView: " + c);
        return c;
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue();
        }
        boolean c = c();
        com.taobao.android.home.component.utils.e.e("HomepageOptUtils", "enableMoreThreadLoadCache: " + c);
        return c;
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue();
        }
        boolean z = BootstrapMode.c() && ABGlobal.isFeatureOpened(Globals.getApplication(), "enablePreCreateNativeView");
        com.taobao.android.home.component.utils.e.e("HomepageOptUtils", "enablePreCreateNativeView: " + z);
        return z;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue();
        }
        boolean c = c();
        com.taobao.android.home.component.utils.e.e("HomepageOptUtils", "enableDiscardEmptyTheme: " + c);
        return c;
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue();
        }
        boolean c = c();
        com.taobao.android.home.component.utils.e.e("HomepageOptUtils", "enableResetSlider: " + c);
        return c;
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue();
        }
        boolean c = c();
        com.taobao.android.home.component.utils.e.e("HomepageOptUtils", "enableClipIconSecondScreenForCache: " + c);
        return c;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(Globals.getApplication(), "home_second_disable_pre_create_task_number");
        com.taobao.android.home.component.utils.e.e("HomepageOptUtils", "enableAsyncLeaveProcess: " + isFeatureOpened);
        return isFeatureOpened;
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue();
        }
        boolean c = n.c();
        com.taobao.android.home.component.utils.e.e("HomepageOptUtils", "closeNetworkDataUploadByLowDevice: " + c);
        return c;
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue();
        }
        boolean z = n.c() || (!n.c() && j.a("enableMHRemoveUnusedLayout", true));
        com.taobao.android.home.component.utils.e.e("HomepageOptUtils", "closeUnusedLayout: " + z);
        return z;
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[]{this})).booleanValue();
        }
        boolean z = n.c() || (!n.c() && j.a("enableMHSimpleDownTemplate", true));
        com.taobao.android.home.component.utils.e.e("HomepageOptUtils", "simpleDownloadTemplate: " + z);
        return z;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : BootstrapMode.c();
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (com.taobao.homepage.utils.b.d()) {
            return false;
        }
        if (this.c == null) {
            this.c = (Boolean) m.a().a("disableHomepageUIRefreshOnPagePause", Boolean.class);
        }
        Boolean bool = this.c;
        boolean z = bool != null && bool.booleanValue();
        com.taobao.android.home.component.utils.e.e("HomepageOptUtils", "disableUIRefreshOnPagePause: " + z);
        return z;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (e == null) {
            e = (Boolean) m.a().a(MULTI_TAB_OPT, Boolean.class);
        }
        Boolean bool = e;
        e = Boolean.valueOf(bool != null && bool.booleanValue());
        com.taobao.android.home.component.utils.e.e("HomepageOptUtils", "enableMultiTabOpt: " + e);
        Boolean bool2 = e;
        return bool2 != null && bool2.booleanValue();
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        String a2 = m.a().a(MULTI_TAB_OPT);
        com.taobao.android.home.component.utils.e.e("HomepageOptUtils", "MultiTabBucketId: " + a2);
        return StringUtils.isEmpty(a2) ? "" : a2;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        if (f == null) {
            f = (Boolean) m.a().a("enableOptEditionSwitch", Boolean.class);
        }
        Boolean bool = f;
        f = Boolean.valueOf(bool != null && bool.booleanValue());
        com.taobao.android.home.component.utils.e.e("HomepageOptUtils", "enableOptEditionSwitch: " + f);
        return f.booleanValue();
    }
}

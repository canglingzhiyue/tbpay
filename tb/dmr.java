package tb;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.text.n;

/* loaded from: classes.dex */
public final class dmr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final dmr INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f26861a;
    private static boolean b;

    static {
        kge.a(444263198);
        INSTANCE = new dmr();
    }

    private dmr() {
    }

    @JvmStatic
    public static final String L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6fe962d", new Object[0]);
        }
        if (!INSTANCE.p()) {
            return "";
        }
        String config = OrangeConfig.getInstance().getConfig("ability_kit", "singleWeexPanelFragmentList", "");
        q.b(config, "OrangeConfig.getInstance…exPanelFragmentList\", \"\")");
        return config;
    }

    @JvmStatic
    public static final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue();
        }
        if (!INSTANCE.p()) {
            return false;
        }
        return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "loadingCancelable", "false"));
    }

    @JvmStatic
    public static final boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4366756", new Object[0])).booleanValue();
        }
        if (!INSTANCE.p()) {
            return false;
        }
        return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "disableWeex2OverScroll", "true"));
    }

    @JvmStatic
    public static final boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[0])).booleanValue();
        }
        if (!INSTANCE.p()) {
            return false;
        }
        return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "enablePadAutoOrientation", "true"));
    }

    @JvmStatic
    public static final boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[0])).booleanValue();
        }
        if (!INSTANCE.p()) {
            return false;
        }
        return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "enablePopUxAbGlobal", "true"));
    }

    @JvmStatic
    public static final long E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e1da40", new Object[0])).longValue();
        }
        try {
            if (!INSTANCE.p()) {
                return 50L;
            }
            String config = OrangeConfig.getInstance().getConfig("ability_kit", "padTranslucentFullTime", "50");
            q.b(config, "OrangeConfig.getInstance…anslucentFullTime\", \"50\")");
            return Long.parseLong(config);
        } catch (NumberFormatException unused) {
            return 50L;
        }
    }

    @JvmStatic
    public static final boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[0])).booleanValue();
        }
        if (!INSTANCE.p()) {
            return true;
        }
        return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "translucentFullScreenPadDrawer", "true")) && Build.VERSION.SDK_INT >= 30;
    }

    @JvmStatic
    public static final boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[0])).booleanValue();
        }
        if (!INSTANCE.p()) {
            return true;
        }
        return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "downgradeListenWeex1", "false"));
    }

    @JvmStatic
    public static final boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[0])).booleanValue();
        }
        if (INSTANCE.p()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "stdGroupRequestOrientationOnO", "false"));
        }
        return true;
    }

    @JvmStatic
    public static final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue();
        }
        if (INSTANCE.p()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "callStdGroupBackPress", "true"));
        }
        return true;
    }

    @JvmStatic
    public static final boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[0])).booleanValue();
        }
        if (INSTANCE.p()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "downgradeDisPatchKeyDown", "false"));
        }
        return true;
    }

    @JvmStatic
    public static final boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[0])).booleanValue();
        }
        if (INSTANCE.p()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "downgradeToOriginIntent", "false"));
        }
        return true;
    }

    @JvmStatic
    public static final boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[0])).booleanValue();
        }
        if (INSTANCE.p()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "enableEnterAnim", "true"));
        }
        return true;
    }

    @JvmStatic
    public static final boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue();
        }
        if (INSTANCE.p()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "notModalDrawerAutoFullScreen", "true"));
        }
        return true;
    }

    @JvmStatic
    public static final boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[0])).booleanValue();
        }
        if (INSTANCE.p()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "updateSubActivityParams", "true"));
        }
        return true;
    }

    @JvmStatic
    public static final float u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("686426c", new Object[0])).floatValue();
        }
        if (!INSTANCE.p()) {
            return 0.44f;
        }
        String config = OrangeConfig.getInstance().getConfig("ability_kit", "defaultLargeScreenRatio", "0.44");
        q.b(config, "OrangeConfig.getInstance…argeScreenRatio\", \"0.44\")");
        Float b2 = n.b(config);
        if (b2 == null) {
            return 0.44f;
        }
        return b2.floatValue();
    }

    @JvmStatic
    public static final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue();
        }
        if (INSTANCE.p()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "useWindowMetricsCalculator", "true"));
        }
        return true;
    }

    @JvmStatic
    public static final boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[0])).booleanValue();
        }
        if (INSTANCE.p()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "useWeexContainerFragment", "false"));
        }
        return true;
    }

    @JvmStatic
    public static final boolean a(Context ctx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{ctx})).booleanValue();
        }
        q.d(ctx, "ctx");
        if (!INSTANCE.p()) {
            return true;
        }
        return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "onlyCalScreenRatioWhenLand", "true")) && dms.b(ctx);
    }

    @JvmStatic
    public static final boolean b(Context ctx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{ctx})).booleanValue();
        }
        q.d(ctx, "ctx");
        if (!INSTANCE.p()) {
            return true;
        }
        return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "localActStartErrorDowngradeToNav", "true")) && dms.b(ctx);
    }

    @JvmStatic
    public static final boolean c(Context ctx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{ctx})).booleanValue();
        }
        q.d(ctx, "ctx");
        if (!INSTANCE.p()) {
            return true;
        }
        return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "downgradeToNav", "false")) && dms.b(ctx);
    }

    @JvmStatic
    public static final boolean d(Context ctx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{ctx})).booleanValue();
        }
        q.d(ctx, "ctx");
        if (!INSTANCE.p()) {
            return true;
        }
        return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "padHandleSplitWindow", "true")) && dms.b(ctx);
    }

    @JvmStatic
    public static final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue();
        }
        if (INSTANCE.p()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "nativePopDismissWhenFinish", "true"));
        }
        return true;
    }

    @JvmStatic
    public static final boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[0])).booleanValue();
        }
        if (INSTANCE.p()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "stdGroupEnableBindService", "true"));
        }
        return true;
    }

    @JvmStatic
    public static final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue();
        }
        if (INSTANCE.p()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "requestDisAllowParentIntercept", "true"));
        }
        return true;
    }

    @JvmStatic
    public static final boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue();
        }
        if (INSTANCE.p()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "recoverSubActivityDecorRootSpaceAndTheme", "true"));
        }
        return true;
    }

    @JvmStatic
    public static final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (INSTANCE.p()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "enableCbCloseWhenRmPop", "true"));
        }
        return true;
    }

    @JvmStatic
    public static final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue();
        }
        if (INSTANCE.p()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "popUseCurrentActWindow", "false"));
        }
        return true;
    }

    @JvmStatic
    public static final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (INSTANCE.p()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "rollBackDisableCloseWhenAnim", "false"));
        }
        return true;
    }

    @JvmStatic
    public static final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if (INSTANCE.p()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "defaultPanEnable", "true"));
        }
        return true;
    }

    @JvmStatic
    public static final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        if (INSTANCE.p()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "rollBackWeexViewReport", "false"));
        }
        return true;
    }

    @JvmStatic
    public static final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        if (INSTANCE.p()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "dxModalDegrade", "false"));
        }
        return true;
    }

    @JvmStatic
    public static final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
        }
        if (INSTANCE.p()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "dxToastDegrade", "false"));
        }
        return true;
    }

    @JvmStatic
    public static final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue();
        }
        if (INSTANCE.p()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "dxLoadingTokenDegrade", "false"));
        }
        return true;
    }

    @JvmStatic
    public static final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]);
        }
        if (INSTANCE.p()) {
            return OrangeConfig.getInstance().getConfig("ability_kit", "dxToastTemplate", "https://dinamicx.alibabausercontent.com/pub/toast_ability/1713778277014/toast_ability.zip,3");
        }
        return null;
    }

    @JvmStatic
    public static final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[0]);
        }
        if (INSTANCE.p()) {
            return OrangeConfig.getInstance().getConfig("ability_kit", "dxLoadingTemplate", "https://dinamicx.alibabausercontent.com/l_pub/loading_ability_ui/1724385361512/loading_ability_ui.zip,2");
        }
        return null;
    }

    @JvmStatic
    public static final String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6aaa74cf", new Object[0]);
        }
        if (INSTANCE.p()) {
            return OrangeConfig.getInstance().getConfig("ability_kit", "alert_ability_ui", "https://dinamicx.alibabausercontent.com/pub/alert_ability_ui/1695111595547/alert_ability_ui.zip,3");
        }
        return null;
    }

    @JvmStatic
    public static final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue();
        }
        if (INSTANCE.p()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "fixPopBack", "true"));
        }
        return true;
    }

    @JvmStatic
    public static final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue();
        }
        if (INSTANCE.p()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "std_pop_mode_opt", "true"));
        }
        return true;
    }

    public final String a(String name, String defaultValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, name, defaultValue});
        }
        q.d(name, "name");
        q.d(defaultValue, "defaultValue");
        if (!p()) {
            return defaultValue;
        }
        String config = OrangeConfig.getInstance().getConfig("ability_kit", name, defaultValue);
        q.b(config, "OrangeConfig.getInstance…ltValue\n                )");
        return config;
    }

    @JvmStatic
    public static final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue();
        }
        if (INSTANCE.p()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("mega_analysis", "enableExecuteCount", "false"));
        }
        return false;
    }

    @JvmStatic
    public static final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue();
        }
        if (INSTANCE.p()) {
            return q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig("ability_kit", "isPopCbActivityLifeCycleEv", "true"));
        }
        return false;
    }

    private final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        if (b) {
            return f26861a;
        }
        f26861a = true;
        b = true;
        return f26861a;
    }
}

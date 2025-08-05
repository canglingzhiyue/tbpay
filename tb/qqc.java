package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.extension.page.e;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.page.a;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.k;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.utils.f;
import kotlin.jvm.internal.q;

/* loaded from: classes9.dex */
public final class qqc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1886353719);
    }

    public static final int o(ITMSPage getSafeAreaBottom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("701f3514", new Object[]{getSafeAreaBottom})).intValue();
        }
        q.d(getSafeAreaBottom, "$this$getSafeAreaBottom");
        return 0;
    }

    public static final int p(ITMSPage getSafeAreaLeft) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abff795", new Object[]{getSafeAreaLeft})).intValue();
        }
        q.d(getSafeAreaLeft, "$this$getSafeAreaLeft");
        return 0;
    }

    public static final int q(ITMSPage getSafeAreaRight) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a560ba16", new Object[]{getSafeAreaRight})).intValue();
        }
        q.d(getSafeAreaRight, "$this$getSafeAreaRight");
        return 0;
    }

    public static final boolean a(ITMSPage isHomePage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb549217", new Object[]{isHomePage})).booleanValue();
        }
        q.d(isHomePage, "$this$isHomePage");
        return isHomePage.c().b();
    }

    public static final boolean b(ITMSPage getNavBarImmersive) {
        Boolean f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95f55498", new Object[]{getNavBarImmersive})).booleanValue();
        }
        q.d(getNavBarImmersive, "$this$getNavBarImmersive");
        Window c = getNavBarImmersive.c().e().c();
        if (c != null && (f = c.f()) != null) {
            return f.booleanValue();
        }
        return false;
    }

    public static final Window.Theme c(ITMSPage getNavBarTheme) {
        Window.Theme g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Window.Theme) ipChange.ipc$dispatch("8ab31387", new Object[]{getNavBarTheme});
        }
        q.d(getNavBarTheme, "$this$getNavBarTheme");
        Window c = getNavBarTheme.c().e().c();
        return (c == null || (g = c.g()) == null) ? Window.Theme.LIGHT : g;
    }

    public static final boolean d(ITMSPage getHideNavBar) {
        Boolean h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb36d99a", new Object[]{getHideNavBar})).booleanValue();
        }
        q.d(getHideNavBar, "$this$getHideNavBar");
        Window c = getHideNavBar.c().e().c();
        if (c != null && (h = c.h()) != null) {
            return h.booleanValue();
        }
        return false;
    }

    public static final boolean e(ITMSPage getInheritDocumentTitle) {
        Boolean d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d79c1b", new Object[]{getInheritDocumentTitle})).booleanValue();
        }
        q.d(getInheritDocumentTitle, "$this$getInheritDocumentTitle");
        Window c = getInheritDocumentTitle.c().e().c();
        if (c != null && (d = c.d()) != null) {
            return d.booleanValue();
        }
        return false;
    }

    public static final String f(ITMSPage getNavBarTitle) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f679908", new Object[]{getNavBarTitle});
        }
        q.d(getNavBarTitle, "$this$getNavBarTitle");
        Window c = getNavBarTitle.c().e().c();
        String a2 = c != null ? c.a() : null;
        if (n.aZ()) {
            if (a2 == null) {
                a2 = k.j(getNavBarTitle.b());
            }
            return a2 == null ? "" : a2;
        }
        String str = a2;
        if (str == null || str.length() == 0) {
            z = true;
        }
        if (z) {
            a2 = k.j(getNavBarTitle.b());
        }
        return a2 == null ? "" : a2;
    }

    public static final Integer g(ITMSPage getNavBarTitleColor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("8180c00", new Object[]{getNavBarTitleColor});
        }
        q.d(getNavBarTitleColor, "$this$getNavBarTitleColor");
        Window c = getNavBarTitleColor.c().e().c();
        if (c == null) {
            return null;
        }
        return c.c();
    }

    public static final String h(ITMSPage getNavBarTitleImage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7e47846", new Object[]{getNavBarTitleImage});
        }
        q.d(getNavBarTitleImage, "$this$getNavBarTitleImage");
        Window c = getNavBarTitleImage.c().e().c();
        if (c == null) {
            return null;
        }
        return c.b();
    }

    public static final int i(ITMSPage getNavBarBgColor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d05aa60e", new Object[]{getNavBarBgColor})).intValue();
        }
        q.d(getNavBarBgColor, "$this$getNavBarBgColor");
        Window c = getNavBarBgColor.c().e().c();
        Integer e = c != null ? c.e() : null;
        if (e != null) {
            return e.intValue();
        }
        if (b(getNavBarBgColor)) {
            return Color.parseColor("#00FFFFFF");
        }
        if (n.bS() || c(getNavBarBgColor) == Window.Theme.LIGHT) {
            return -1;
        }
        return Color.parseColor("#333333");
    }

    public static final Integer j(ITMSPage getPageBgColor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("e2c698c3", new Object[]{getPageBgColor});
        }
        q.d(getPageBgColor, "$this$getPageBgColor");
        Window c = getPageBgColor.c().e().c();
        if (c == null) {
            return null;
        }
        return c.j();
    }

    public static final Window.Orientation k(ITMSPage getOrientation) {
        Window.Orientation k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Window.Orientation) ipChange.ipc$dispatch("5dd4c6a8", new Object[]{getOrientation});
        }
        q.d(getOrientation, "$this$getOrientation");
        Window c = getOrientation.c().e().c();
        return (c == null || (k = c.k()) == null) ? Window.Orientation.PORTRAIT : k;
    }

    public static final boolean l(ITMSPage getStatusBarHide) {
        Boolean i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a03ceda2", new Object[]{getStatusBarHide})).booleanValue();
        }
        q.d(getStatusBarHide, "$this$getStatusBarHide");
        Window c = getStatusBarHide.c().e().c();
        if (c != null && (i = c.i()) != null) {
            return i.booleanValue();
        }
        return false;
    }

    public static final boolean u(ITMSPage getHideHomeIndicator) {
        Boolean l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe3c42b", new Object[]{getHideHomeIndicator})).booleanValue();
        }
        q.d(getHideHomeIndicator, "$this$getHideHomeIndicator");
        Window c = getHideHomeIndicator.c().e().c();
        if (c != null && (l = c.l()) != null) {
            return l.booleanValue();
        }
        return false;
    }

    public static final boolean m(ITMSPage isForceWindowRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3addb023", new Object[]{isForceWindowRatio})).booleanValue();
        }
        q.d(isForceWindowRatio, "$this$isForceWindowRatio");
        IEnvironmentService iEnvironmentService = (IEnvironmentService) qpt.b(IEnvironmentService.class);
        Window.WindowRatioConfig windowRatioConfig = null;
        if (!f.b(iEnvironmentService != null ? iEnvironmentService.getApplicationContext() : null)) {
            return false;
        }
        Window c = isForceWindowRatio.c().e().c();
        if (c != null) {
            windowRatioConfig = c.n();
        }
        if (windowRatioConfig != null) {
            int i = sgv.$EnumSwitchMapping$0[windowRatioConfig.ordinal()];
            if (i == 1) {
                return true;
            }
            return i != 2 ? i == 3 && k(isForceWindowRatio) == Window.Orientation.PORTRAIT : k(isForceWindowRatio) == Window.Orientation.LANDSCAPE;
        }
        return false;
    }

    public static final int n(ITMSPage getSafeAreaTop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d57e7293", new Object[]{getSafeAreaTop})).intValue();
        }
        q.d(getSafeAreaTop, "$this$getSafeAreaTop");
        boolean g = getSafeAreaTop.c().g();
        Activity o = getSafeAreaTop.b().o();
        if (!g) {
            return 0;
        }
        Activity activity = o;
        return com.taobao.themis.utils.k.a((Context) activity, com.taobao.themis.utils.k.b(activity));
    }

    public static final int r(ITMSPage getTabBarHeight) {
        suj v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40017c97", new Object[]{getTabBarHeight})).intValue();
        }
        q.d(getTabBarHeight, "$this$getTabBarHeight");
        if (getTabBarHeight.c().j() && (v = v(getTabBarHeight)) != null) {
            return v.j();
        }
        return 0;
    }

    public static final int s(ITMSPage getNavBarHeight) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("daa23f18", new Object[]{getNavBarHeight})).intValue();
        }
        q.d(getNavBarHeight, "$this$getNavBarHeight");
        qpm f = getNavBarHeight.f();
        return (f == null || f.getTitleBar() == null) ? 0 : 44;
    }

    public static final a t(ITMSPage getPageProperties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("abf8adda", new Object[]{getPageProperties});
        }
        q.d(getPageProperties, "$this$getPageProperties");
        String a2 = getPageProperties.c().e().a();
        e eVar = (e) getPageProperties.a(e.class);
        return new a(a2, eVar != null ? eVar.a() : null, getPageProperties.c().h());
    }

    private static final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        return '\'' + str + '\'';
    }

    public static final String a(ITMSPage getInjectEarlyScript, boolean z) {
        AppManifest v;
        AppManifest.AppInfo appInfo;
        AppManifest v2;
        AppManifest.Container container;
        AppManifest.Solution solution;
        AppManifest v3;
        AppManifest.AppInfo appInfo2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3efc179f", new Object[]{getInjectEarlyScript, new Boolean(z)});
        }
        q.d(getInjectEarlyScript, "$this$getInjectEarlyScript");
        int r = r(getInjectEarlyScript);
        TMSMetaInfoWrapper v4 = getInjectEarlyScript.b().v();
        String str = null;
        String appId = (v4 == null || (v3 = v4.v()) == null || (appInfo2 = v3.getAppInfo()) == null) ? null : appInfo2.getAppId();
        String name = getInjectEarlyScript.b().j().name();
        TMSMetaInfoWrapper v5 = getInjectEarlyScript.b().v();
        String type = (v5 == null || (v2 = v5.v()) == null || (container = v2.getContainer()) == null || (solution = container.getSolution()) == null) ? null : solution.getType();
        TMSMetaInfoWrapper v6 = getInjectEarlyScript.b().v();
        JSONObject bizInfo = (v6 == null || (v = v6.v()) == null || (appInfo = v.getAppInfo()) == null) ? null : appInfo.getBizInfo();
        a t = t(getInjectEarlyScript);
        String a2 = t.a();
        String b = t.b();
        Activity o = getInjectEarlyScript.b().o();
        String str2 = "document.documentElement.style.setProperty('--safe-area-inset-top', '" + n(getInjectEarlyScript) + "px');\n            document.documentElement.style.setProperty('--safe-area-inset-left', '" + p(getInjectEarlyScript) + "px');\n            document.documentElement.style.setProperty('--safe-area-inset-right', '" + q(getInjectEarlyScript) + "px');\n            document.documentElement.style.setProperty('--safe-area-inset-bottom', '" + o(getInjectEarlyScript) + "px');\n            document.documentElement.style.setProperty('--tabbar-height', '" + r + "px');\n            document.documentElement.style.setProperty('--navbar-height', '" + s(getInjectEarlyScript) + "px');\n            document.documentElement.style.setProperty('--statusbar-height', '" + com.taobao.themis.utils.k.a((Context) o, com.taobao.themis.utils.k.b(o)) + "px');";
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:(function() {\n            var appContext = {\n                appId: ");
        sb.append(a(appId));
        sb.append(",\n                solution: ");
        sb.append(a(name));
        sb.append(",\n                UIMode: ");
        sb.append(a(type));
        sb.append(",\n                bizInfo: ");
        if (bizInfo != null) {
            str = bizInfo.toJSONString();
        }
        sb.append(str);
        sb.append("\n            };\n            \n            var pageContext = {\n                id: ");
        sb.append(a(a2));
        sb.append(",\n                fromURL: ");
        sb.append(a(b));
        sb.append(",\n                tabBarHeight: ");
        sb.append(r);
        sb.append(",\n                preRender: ");
        sb.append(t.c());
        sb.append("\n            };\n\n            window.themis = {\n                appContext: appContext,\n                pageContext: pageContext\n            };\n            \n            ");
        if (z) {
            str2 = "!(function(){var style=document.createElement(\"style\");style.setAttribute(\"type\",\"text/css\");style.textContent=\":root{--safe-area-inset-top:env(safe-area-inset-top);--safe-area-inset-left:env(safe-area-inset-left);--safe-area-inset-right:env(safe-area-inset-right);--safe-area-inset-bottom:env(safe-area-inset-bottom);--tabbar-height:env(tabbar-height);--navbar-height:env(navbar-height);--statusbar-height:env(statusbar-height)}\";document.head.appendChild(style)})();";
        }
        sb.append(str2);
        sb.append("\n        })();");
        return sb.toString();
    }

    public static final void a(ITMSPage updatePageContextVariable, boolean z, qqq render) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc578a0", new Object[]{updatePageContextVariable, new Boolean(z), render});
            return;
        }
        q.d(updatePageContextVariable, "$this$updatePageContextVariable");
        q.d(render, "render");
        int r = r(updatePageContextVariable);
        String b = t(updatePageContextVariable).b();
        if (z) {
            render.a("tabBarHeight", Integer.valueOf(r));
        } else {
            render.a("--tabbar-height", (Object) (r + "px"));
        }
        render.a(kotlin.text.n.a("\n        if (window.themis && window.themis.pageContext) {\n            window.themis.pageContext.tabBarHeight = " + r + ";\n            window.themis.pageContext.fromURL = " + a(b) + ";\n        }\n    "), "updatePageContextVariable");
    }

    public static final suj v(ITMSPage getTabPageExtension) {
        ITMSPage a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (suj) ipChange.ipc$dispatch("d5cc8d96", new Object[]{getTabPageExtension});
        }
        q.d(getTabPageExtension, "$this$getTabPageExtension");
        sui suiVar = (sui) getTabPageExtension.a(sui.class);
        if (suiVar != null && (a2 = suiVar.a()) != null) {
            return (suj) a2.a(suj.class);
        }
        return null;
    }

    public static final String w(ITMSPage getBusinessId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("678d0297", new Object[]{getBusinessId});
        }
        q.d(getBusinessId, "$this$getBusinessId");
        TMSSolutionType j = getBusinessId.b().j();
        if (j == null) {
            return null;
        }
        int i = sgv.$EnumSwitchMapping$1[j.ordinal()];
        if (i == 1) {
            return getBusinessId.b().e();
        }
        if (i == 2) {
            return "canvas_" + getBusinessId.b().h();
        } else if (i != 3 && i != 4) {
            return null;
        } else {
            return "widget_" + getBusinessId.b().h();
        }
    }
}

package com.taobao.themis.ability.basic.navbar;

import android.view.View;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.abilityidl.ability.AbsNavBarAbility;
import com.taobao.android.abilityidl.ability.cb;
import com.taobao.android.abilityidl.ability.cc;
import com.taobao.android.abilityidl.ability.df;
import com.taobao.android.abilityidl.ability.dg;
import com.taobao.android.abilityidl.ability.dh;
import com.taobao.android.abilityidl.ability.di;
import com.taobao.android.abilityidl.ability.dj;
import com.taobao.android.abilityidl.ability.dk;
import com.taobao.android.abilityidl.ability.dl;
import com.taobao.android.abilityidl.ability.dm;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.taobao.themis.container.title.action.base.e;
import com.taobao.themis.kernel.adapter.IShareAdapter;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.container.ui.titlebar.NavigatorBarAnimType;
import com.taobao.themis.kernel.extension.page.h;
import com.taobao.themis.kernel.extension.page.i;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.utils.f;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.als;
import tb.bip;
import tb.gml;
import tb.kge;
import tb.qpm;
import tb.rnc;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0017H\u0016J \u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006#"}, d2 = {"Lcom/taobao/themis/ability/basic/navbar/TMSNavBarAbility;", "Lcom/taobao/android/abilityidl/ability/AbsNavBarAbility;", "()V", "hide", "", "context", "Lcom/alibaba/ability/env/IAbilityContext;", "params", "Lcom/taobao/android/abilityidl/ability/NavBarToggleNavBarVisibilityParams;", "callback", "Lcom/taobao/android/abilityidl/callback/IAbilityCallback;", "hideBackButton", "hideRightItem", "hideStatusBar", "setBgColor", "Lcom/taobao/android/abilityidl/ability/NavBarColor;", "setImmersive", "Lcom/taobao/android/abilityidl/ability/NavBarImmersiveParams;", "setRightItem", "Lcom/taobao/android/abilityidl/ability/NavBarSetRightItemParams;", "Lcom/taobao/android/abilityidl/ability/INavBarSetRightItemEvents;", "setShareConfig", "Lcom/taobao/android/abilityidl/ability/NavBarShareParams;", "Lcom/taobao/android/abilityidl/ability/INavBarSetShareConfigEvents;", "setTheme", "Lcom/taobao/android/abilityidl/ability/NavBarTheme;", "setTitle", "Lcom/taobao/android/abilityidl/ability/NavBarTitle;", "setTitleColor", "setTitleImage", "Lcom/taobao/android/abilityidl/ability/NavBarTitleImage;", "show", "showBackButton", DxContainerActivity.PARAMS_SHOW_STATUS_BAR, "Companion", "themis_ability_basic_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSNavBarAbility extends AbsNavBarAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cb f22292a;

        public b(cb cbVar) {
            this.f22292a = cbVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.f22292a.a();
            }
        }
    }

    static {
        kge.a(1023958531);
        Companion = new a(null);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void setShareConfig(als context, di params, cc callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c366b3", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        if (com.taobao.themis.kernel.utils.a.b(context) == null) {
            callback.a(false);
            return;
        }
        String str = params.f8814a;
        q.b(str, "params.businessId");
        String str2 = params.e;
        q.b(str2, "params.url");
        IShareAdapter.a aVar = new IShareAdapter.a(str, str2, params.b, params.c, params.d, null, null, null, 224, null);
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            callback.a(a$a.d(null));
            return;
        }
        h hVar = (h) a2.a(h.class);
        if (hVar == null) {
            callback.a(a$a.g(null));
            return;
        }
        hVar.a(aVar);
        callback.a(true);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void setTheme(als context, dj params, gml callback) {
        Window.Theme theme;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ddc46cf", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        if (com.taobao.themis.kernel.utils.a.b(context) == null) {
            callback.a(a$a.f("容器实例未找到"));
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            callback.a(a$a.d("容器页面未找到"));
            return;
        }
        String str = params.f8815a;
        q.b(str, "params.theme");
        Locale locale = Locale.ROOT;
        q.b(locale, "Locale.ROOT");
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = str.toLowerCase(locale);
        q.b(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        int hashCode = lowerCase.hashCode();
        com.taobao.themis.kernel.container.ui.titlebar.b bVar = null;
        if (hashCode == 3005871) {
            if (lowerCase.equals("auto")) {
                theme = Window.Theme.AUTO;
            }
            theme = null;
        } else if (hashCode != 3075958) {
            if (hashCode == 102970646 && lowerCase.equals("light")) {
                theme = Window.Theme.LIGHT;
            }
            theme = null;
        } else {
            if (lowerCase.equals("dark")) {
                theme = Window.Theme.DARK;
            }
            theme = null;
        }
        if (theme == null) {
            callback.a(a$a.b("theme is invalid"));
            return;
        }
        i iVar = (i) a2.a(i.class);
        qpm f = a2.f();
        if (f != null) {
            bVar = f.getTitleBar();
        }
        if (bVar == null && iVar == null) {
            callback.a(a$a.g("容器能力未实现"));
            return;
        }
        Window c = a2.c().e().c();
        if (c != null) {
            c.a(theme);
        }
        if (iVar != null) {
            if (theme != Window.Theme.LIGHT) {
                z = false;
            }
            iVar.b(z);
        }
        if (bVar == null) {
            return;
        }
        bVar.setStyle(theme);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void setTitle(als context, dk params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef94787d", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        if (com.taobao.themis.kernel.utils.a.b(context) == null) {
            callback.a(a$a.f("容器实例未找到"));
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            callback.a(a$a.d("容器页面未找到"));
            return;
        }
        qpm f = a2.f();
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar = f != null ? f.getTitleBar() : null;
        if (titleBar == null) {
            callback.a(a$a.g("容器能力未实现"));
            return;
        }
        a2.c().f().put((JSONObject) com.taobao.themis.kernel.entity.a.KEY_CUSTOM_SET_TITLE, (String) true);
        Window c = a2.c().e().c();
        if (c != null) {
            c.a(params.f8816a);
        }
        Window c2 = a2.c().e().c();
        if (c2 != null) {
            c2.b((String) null);
        }
        if (titleBar.setTitle(params.f8816a, (String) null)) {
            return;
        }
        callback.a(a$a.g("容器能力未实现"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void setTitleColor(als context, df params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861ec639", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        if (com.taobao.themis.kernel.utils.a.b(context) == null) {
            callback.a(a$a.f("容器实例未找到"));
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            callback.a(a$a.d("容器页面未找到"));
            return;
        }
        qpm f = a2.f();
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar = f != null ? f.getTitleBar() : null;
        if (titleBar == null) {
            callback.a(a$a.g("容器能力未实现"));
            return;
        }
        Integer a3 = f.a(params.f8811a);
        if (a3 == null) {
            callback.a(a$a.b("color is invalid"));
            return;
        }
        Window c = a2.c().e().c();
        if (c != null) {
            c.a(a3);
        }
        if (titleBar.setTitleColor(a3)) {
            return;
        }
        callback.a(a$a.g("容器能力未实现"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void setTitleImage(als context, dl params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5de67e6b", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        if (com.taobao.themis.kernel.utils.a.b(context) == null) {
            callback.a(a$a.f("容器实例未找到"));
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            callback.a(a$a.d("容器页面未找到"));
            return;
        }
        qpm f = a2.f();
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar = f != null ? f.getTitleBar() : null;
        if (titleBar == null) {
            callback.a(a$a.g("容器能力未实现"));
            return;
        }
        a2.c().f().put((JSONObject) com.taobao.themis.kernel.entity.a.KEY_CUSTOM_SET_TITLE, (String) true);
        Window c = a2.c().e().c();
        if (c != null) {
            c.b(params.f8817a);
        }
        Window c2 = a2.c().e().c();
        if (c2 != null) {
            c2.a((String) null);
        }
        if (titleBar.setTitle((String) null, params.f8817a)) {
            return;
        }
        callback.a(a$a.g("容器能力未实现"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void setBgColor(als context, df params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac22368", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        if (com.taobao.themis.kernel.utils.a.b(context) == null) {
            callback.a(a$a.f("容器实例未找到"));
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            callback.a(a$a.d("容器页面未找到"));
            return;
        }
        qpm f = a2.f();
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar = f != null ? f.getTitleBar() : null;
        if (titleBar == null) {
            callback.a(a$a.g("容器能力未实现"));
            return;
        }
        Integer a3 = f.a(params.f8811a);
        if (a3 == null) {
            callback.a(a$a.b("color is invalid"));
            return;
        }
        Window c = a2.c().e().c();
        if (c != null) {
            c.b(a3);
        }
        titleBar.setTitleBarBgColor(a3.intValue());
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void hide(als context, dm params, gml callback) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b39f867", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        if (com.taobao.themis.kernel.utils.a.b(context) == null) {
            callback.a(a$a.f("容器实例未找到"));
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            callback.a(a$a.d("容器页面未找到"));
            return;
        }
        qpm f = a2.f();
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar = f != null ? f.getTitleBar() : null;
        if (titleBar == null) {
            callback.a(a$a.g("容器能力未实现"));
            return;
        }
        a aVar = Companion;
        if (params.f8818a) {
            z = true;
        }
        NavigatorBarAnimType a3 = aVar.a(z, params.b);
        Window c = a2.c().e().c();
        if (c != null) {
            c.b((Boolean) true);
        }
        if (titleBar.hideTitleBar(a3)) {
            return;
        }
        callback.a(a$a.g("容器能力未实现"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void show(als context, dm params, gml callback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bc7d0e2", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        if (com.taobao.themis.kernel.utils.a.b(context) == null) {
            callback.a(a$a.f("容器实例未找到"));
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            callback.a(a$a.d("容器页面未找到"));
            return;
        }
        qpm f = a2.f();
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar = f != null ? f.getTitleBar() : null;
        if (titleBar == null) {
            callback.a(a$a.g("容器能力未实现"));
            return;
        }
        a aVar = Companion;
        if (!params.f8818a) {
            z = false;
        }
        NavigatorBarAnimType a3 = aVar.a(z, params.b);
        Window c = a2.c().e().c();
        if (c != null) {
            c.b((Boolean) false);
        }
        if (titleBar.showTitleBar(a3)) {
            return;
        }
        callback.a(a$a.g("容器能力未实现"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void showStatusBar(als context, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50908fd", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        if (com.taobao.themis.kernel.utils.a.b(context) == null) {
            callback.a(a$a.f("容器实例未找到"));
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            callback.a(a$a.d("容器页面未找到"));
            return;
        }
        i iVar = (i) a2.a(i.class);
        if (iVar == null) {
            callback.a(a$a.g("容器能力未实现"));
            return;
        }
        Window c = a2.c().e().c();
        if (c != null) {
            c.c(false);
        }
        iVar.a(false);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void hideStatusBar(als context, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32cf88d8", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        if (com.taobao.themis.kernel.utils.a.b(context) == null) {
            callback.a(a$a.f("容器实例未找到"));
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            callback.a(a$a.d("容器页面未找到"));
            return;
        }
        i iVar = (i) a2.a(i.class);
        if (iVar == null) {
            callback.a(a$a.g("容器能力未实现"));
            return;
        }
        Window c = a2.c().e().c();
        if (c != null) {
            c.c(true);
        }
        iVar.a(true);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void setRightItem(als context, dh params, cb callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f88db83", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        if (com.taobao.themis.kernel.utils.a.b(context) == null) {
            callback.a(a$a.f(null));
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            callback.a(a$a.d(null));
            return;
        }
        qpm f = a2.f();
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar = f != null ? f.getTitleBar() : null;
        if (titleBar == null) {
            callback.a(a$a.g(null));
            return;
        }
        b bVar = new b(callback);
        a2.c().f().put((JSONObject) bip.KEY_ACTIONBAR_RIGHT_INFO, (String) ai.a(j.a(com.taobao.themis.kernel.entity.a.KEY_RIGHT_ITEM_LIGHT_IMAGE_URL, params.f8813a), j.a(com.taobao.themis.kernel.entity.a.KEY_RIGHT_ITEM_DARK_IMAGE_URL, params.b), j.a("onClick", bVar)));
        titleBar.addRightButton(params.f8813a, params.b, bVar);
        e eVar = (e) titleBar.getAction(e.class);
        if (eVar == null) {
            return;
        }
        eVar.b();
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void hideRightItem(als context, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e932266", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        if (com.taobao.themis.kernel.utils.a.b(context) == null) {
            callback.a(a$a.f("容器实例未找到"));
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            callback.a(a$a.d("容器页面未找到"));
            return;
        }
        qpm f = a2.f();
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar = f != null ? f.getTitleBar() : null;
        if (titleBar == null) {
            callback.a(a$a.g("容器能力未实现"));
            return;
        }
        e eVar = (e) titleBar.getAction(e.class);
        if (eVar == null) {
            callback.a(a$a.g("容器能力未实现"));
        } else if (eVar.a()) {
        } else {
            callback.a(a$a.g("容器能力未实现"));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void showBackButton(als context, gml callback) {
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16b4d18f", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            callback.a(a$a.d("容器页面未找到"));
            return;
        }
        qpm f = a2.f();
        com.taobao.themis.container.title.action.base.b bVar = (f == null || (titleBar = f.getTitleBar()) == null) ? null : (com.taobao.themis.container.title.action.base.b) titleBar.getAction(com.taobao.themis.container.title.action.base.b.class);
        if (bVar == null) {
            callback.a(a$a.g("容器能力未实现"));
            return;
        }
        Window c = a2.c().e().c();
        if (c != null) {
            c.d(true);
        }
        if (bVar.b()) {
            return;
        }
        callback.a(a$a.g("容器能力未实现"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void hideBackButton(als context, gml callback) {
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1be4d14", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            callback.a(a$a.d("容器页面未找到"));
            return;
        }
        qpm f = a2.f();
        com.taobao.themis.container.title.action.base.b bVar = (f == null || (titleBar = f.getTitleBar()) == null) ? null : (com.taobao.themis.container.title.action.base.b) titleBar.getAction(com.taobao.themis.container.title.action.base.b.class);
        if (bVar == null) {
            callback.a(a$a.g("容器能力未实现"));
            return;
        }
        Window c = a2.c().e().c();
        if (c != null) {
            c.d(false);
        }
        if (bVar.a()) {
            return;
        }
        callback.a(a$a.g("容器能力未实现"));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsNavBarAbility
    public void setImmersive(als context, dg params, gml callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94804124", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        if (com.taobao.themis.kernel.utils.a.b(context) == null) {
            callback.a(a$a.f("容器实例未找到"));
            return;
        }
        ITMSPage a2 = com.taobao.themis.kernel.utils.a.a(context);
        if (a2 == null) {
            callback.a(a$a.d("容器页面未找到"));
            return;
        }
        qpm f = a2.f();
        if (f == null) {
            callback.a(a$a.g("容器能力未实现"));
            return;
        }
        boolean z = params.f8812a;
        Window c = a2.c().e().c();
        if (c != null) {
            c.a(Boolean.valueOf(z));
        }
        com.taobao.themis.kernel.container.ui.titlebar.b titleBar = f.getTitleBar();
        if (titleBar != null) {
            titleBar.setTranslucent(z);
        }
        rnc pageContainer = f.getPageContainer();
        if (pageContainer == null) {
            return;
        }
        pageContainer.a(z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/taobao/themis/ability/basic/navbar/TMSNavBarAbility$Companion;", "", "()V", "parseAnimType", "Lcom/taobao/themis/kernel/container/ui/titlebar/NavigatorBarAnimType;", "useAnim", "", "animationType", "", "themis_ability_basic_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-924262005);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final NavigatorBarAnimType a(boolean z, String str) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NavigatorBarAnimType) ipChange.ipc$dispatch("190891d", new Object[]{this, new Boolean(z), str});
            }
            if (z) {
                if (str != null) {
                    Locale locale = Locale.ROOT;
                    q.b(locale, "Locale.ROOT");
                    if (str == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    str2 = str.toLowerCase(locale);
                    q.b(str2, "(this as java.lang.String).toLowerCase(locale)");
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    int hashCode = str2.hashCode();
                    if (hashCode == 92909918) {
                        if (str2.equals("alpha")) {
                            return NavigatorBarAnimType.ALPHA;
                        }
                    } else if (hashCode == 1052832078 && str2.equals("translate")) {
                        return NavigatorBarAnimType.TRANS;
                    }
                }
                return NavigatorBarAnimType.OTHER;
            }
            return NavigatorBarAnimType.NULL;
        }
    }
}

package com.taobao.themis.kernel.entity;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.b;
import com.taobao.themis.kernel.i;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import tb.bip;
import tb.kge;

/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final C0942a Companion;
    public static final String KEY_CUSTOM_SET_TITLE = "customSetTitle";
    public static final String KEY_IS_HEADER_PAGE = "isHeaderPage";
    public static final String KEY_IS_HOME_PAGE = "isHomePage";
    public static final String KEY_IS_PRE_RENDER = "isPreRender";
    public static final String KEY_IS_PUSH_PAGE = "isPushPage";
    public static final String KEY_IS_TAB_ITEM_PAGE = "isTabItemPage";
    public static final String KEY_IS_VIRTUAL_TAB_PAGE = "isVirtualTabPage";
    public static final String KEY_PAGE_PROPS = "pageProps";
    public static final String KEY_RIGHT_ITEM_DARK_IMAGE_URL = "darkImageUrl";
    public static final String KEY_RIGHT_ITEM_LIGHT_IMAGE_URL = "lightImageUrl";
    public static final String KEY_RIGHT_ITEM_ON_CLICK = "onClick";
    public static final String KEY_STATUS_BAR_IMMERSIVE_ENABLE = "statusBarImmersiveEnable";
    public static final String KEY_WEEX_INIT_DATA = "weexInitData";

    /* renamed from: a  reason: collision with root package name */
    private final b f22511a;
    private final JSONObject b;

    static {
        kge.a(2085867039);
        Companion = new C0942a(null);
    }

    public a(b pageModel, JSONObject extraParams) {
        q.d(pageModel, "pageModel");
        q.d(extraParams, "extraParams");
        this.f22511a = pageModel;
        this.b = extraParams;
    }

    public final b e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("be64d901", new Object[]{this}) : this.f22511a;
    }

    public final JSONObject f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this}) : this.b;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b.getString(i.MIX_RENDER_TYPE);
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : C0942a.a(Companion, this.b, KEY_IS_HOME_PAGE, false);
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : C0942a.a(Companion, this.b, "isPreRender", false);
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : C0942a.a(Companion, this.b, KEY_CUSTOM_SET_TITLE, false);
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : C0942a.a(Companion, this.b, KEY_STATUS_BAR_IMMERSIVE_ENABLE, false);
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.b.getString("navigationBarBackgroundBg");
    }

    public final Map<String, Object> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d67b6a5", new Object[]{this});
        }
        Object obj = this.b.get(KEY_PAGE_PROPS);
        if (!x.h(obj)) {
            obj = null;
        }
        return (Map) obj;
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : C0942a.a(Companion, this.b, KEY_IS_TAB_ITEM_PAGE, false);
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : C0942a.a(Companion, this.b, KEY_IS_HEADER_PAGE, false);
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : C0942a.a(Companion, this.b, KEY_IS_PUSH_PAGE, false);
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : C0942a.a(Companion, this.b, KEY_IS_VIRTUAL_TAB_PAGE, false);
    }

    public final Object n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("91fe81dd", new Object[]{this}) : this.b.get(bip.KEY_ACTIONBAR_RIGHT_INFO);
    }

    /* renamed from: com.taobao.themis.kernel.entity.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0942a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-39067993);
        }

        private C0942a() {
        }

        public /* synthetic */ C0942a(o oVar) {
            this();
        }

        public static final /* synthetic */ boolean a(C0942a c0942a, JSONObject jSONObject, String str, boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("657d5989", new Object[]{c0942a, jSONObject, str, new Boolean(z)})).booleanValue() : c0942a.a(jSONObject, str, z);
        }

        private final boolean a(JSONObject jSONObject, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b8e3c9c6", new Object[]{this, jSONObject, str, new Boolean(z)})).booleanValue();
            }
            Boolean valueOf = jSONObject != null ? Boolean.valueOf(jSONObject.getBooleanValue(str)) : null;
            if (valueOf == null) {
                return z;
            }
            if (!q.a((Object) "false", (Object) String.valueOf(valueOf.booleanValue()))) {
                return q.a((Object) "true", (Object) String.valueOf(valueOf.booleanValue()));
            }
            return false;
        }
    }
}

package com.taobao.search.sf.weex.module;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.xsearchplugin.weex.weex.d;
import com.taobao.android.xsearchplugin.weex.weex.h;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.nva;
import tb.nvb;

/* loaded from: classes8.dex */
public final class SearchOpenModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String EVENT_CLOSE_DROP_LAYER = "closeDropLayer";
    public static final String EVENT_CLOSE_FILTER = "closeFilter";
    public static final String EVENT_OPEN_DROP_LAYER = "openDropLayer";
    public static final String EVENT_OPEN_FILTER = "openFilter";

    static {
        kge.a(389264443);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(SearchOpenModule searchOpenModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(-1889021501);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @JSMethod
    public final void openDropLayer(JSONObject options) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad2edd1", new Object[]{this, options});
            return;
        }
        q.c(options, "options");
        WXSDKInstance mWXSDKInstance = this.mWXSDKInstance;
        q.a((Object) mWXSDKInstance, "mWXSDKInstance");
        performAction(mWXSDKInstance, "openDropLayer", options);
    }

    @JSMethod
    public final void closeDropLayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fc35c11", new Object[]{this});
            return;
        }
        WXSDKInstance mWXSDKInstance = this.mWXSDKInstance;
        q.a((Object) mWXSDKInstance, "mWXSDKInstance");
        performAction(mWXSDKInstance, "closeDropLayer", null);
    }

    @JSMethod
    public final void openFilter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("660601e9", new Object[]{this});
            return;
        }
        WXSDKInstance mWXSDKInstance = this.mWXSDKInstance;
        q.a((Object) mWXSDKInstance, "mWXSDKInstance");
        performAction(mWXSDKInstance, "openFilter", null);
    }

    @JSMethod
    public final void closeFilter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1707817", new Object[]{this});
            return;
        }
        WXSDKInstance mWXSDKInstance = this.mWXSDKInstance;
        q.a((Object) mWXSDKInstance, "mWXSDKInstance");
        performAction(mWXSDKInstance, "closeFilter", null);
    }

    @JSMethod(uiThread = false)
    public final boolean isDropLayerOpen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b61eb78d", new Object[]{this})).booleanValue() : nvb.b || nva.b;
    }

    private final void performAction(WXSDKInstance wXSDKInstance, String str, JSONObject jSONObject) {
        h b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f98d036", new Object[]{this, wXSDKInstance, str, jSONObject});
        } else if (!(wXSDKInstance instanceof d) || (b = ((d) wXSDKInstance).b()) == null) {
        } else {
            b.b(str, jSONObject, null, null);
        }
    }
}

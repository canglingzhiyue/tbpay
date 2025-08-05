package com.taobao.search.musie;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.xsearchplugin.muise.SFMuiseSDK;
import tb.kge;
import tb.nva;
import tb.nvb;

/* loaded from: classes7.dex */
public final class MUSSearchOpenModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String EVENT_CLOSE_DROP_LAYER = "closeDropLayer";
    public static final String EVENT_CLOSE_FILTER = "closeFilter";
    public static final String EVENT_OPEN_DROP_LAYER = "openDropLayer";
    public static final String EVENT_OPEN_FILTER = "openFilter";

    static {
        kge.a(896253837);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(MUSSearchOpenModule mUSSearchOpenModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public MUSSearchOpenModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-863019371);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    @MUSMethod
    public final void openDropLayer(JSONObject options) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad2edd1", new Object[]{this, options});
            return;
        }
        kotlin.jvm.internal.q.c(options, "options");
        com.taobao.android.weex_framework.p instance = getInstance();
        kotlin.jvm.internal.q.a((Object) instance, "instance");
        performAction(instance, "openDropLayer", options);
    }

    @MUSMethod
    public final void closeDropLayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fc35c11", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.p instance = getInstance();
        kotlin.jvm.internal.q.a((Object) instance, "instance");
        performAction(instance, "closeDropLayer", null);
    }

    @MUSMethod
    public final void openFilter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("660601e9", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.p instance = getInstance();
        kotlin.jvm.internal.q.a((Object) instance, "instance");
        performAction(instance, "openFilter", null);
    }

    @MUSMethod
    public final void closeFilter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1707817", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.p instance = getInstance();
        kotlin.jvm.internal.q.a((Object) instance, "instance");
        performAction(instance, "closeFilter", null);
    }

    @MUSMethod(uiThread = false)
    public final boolean isDropLayerOpen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b61eb78d", new Object[]{this})).booleanValue() : nva.b || nvb.b;
    }

    private final com.taobao.android.xsearchplugin.weex.weex.h getActionPerformer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.xsearchplugin.weex.weex.h) ipChange.ipc$dispatch("1f0fdec3", new Object[]{this});
        }
        Object tag = getInstance().getTag(SFMuiseSDK.MUISE_EVENT_LISTENER);
        if (tag instanceof com.taobao.android.xsearchplugin.weex.weex.h) {
            return (com.taobao.android.xsearchplugin.weex.weex.h) tag;
        }
        return null;
    }

    private final void performAction(com.taobao.android.weex_framework.p pVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33a24b7", new Object[]{this, pVar, str, jSONObject});
            return;
        }
        com.taobao.android.xsearchplugin.weex.weex.h actionPerformer = getActionPerformer();
        if (actionPerformer == null) {
            return;
        }
        actionPerformer.b(str, jSONObject, null, null);
    }
}

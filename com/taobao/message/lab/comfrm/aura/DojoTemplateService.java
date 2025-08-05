package com.taobao.message.lab.comfrm.aura;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.inner2.LayoutProtocol;
import com.taobao.message.lab.comfrm.inner2.Plugin;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.util.MessageNavProcessorV2;
import tb.kge;

/* loaded from: classes7.dex */
public final class DojoTemplateService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final DojoContext mDojoContext;
    private final Plugin mPlugin;

    static {
        kge.a(-984219279);
    }

    public DojoTemplateService(DojoContext dojoContext, Plugin plugin) {
        this.mDojoContext = dojoContext;
        this.mPlugin = plugin;
    }

    public ViewObject onExecute(SharedState sharedState, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewObject) ipChange.ipc$dispatch("f11f8ffa", new Object[]{this, sharedState, str});
        }
        if (ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "debugConversationTabSnapshot") && this.mDojoContext.bizConfigCode.equals("conversationTab")) {
            return null;
        }
        TraceUtil.beginSection("DojoTemplateService-onExecute");
        long currentTimeMillis = System.currentTimeMillis();
        Plugin plugin = this.mPlugin;
        if (plugin != null) {
            plugin.onBuildViewObjectStart(this.mDojoContext.configInfo.layout, sharedState);
        }
        ViewObject buildViewObject = LayoutProtocol.buildViewObject(this.mDojoContext.configInfo.layout, sharedState, null, false);
        if (sharedState.getDiff() != null) {
            ((JSONObject) buildViewObject.data).put("__Diff", (Object) sharedState.getDiff().toJSON());
        } else {
            ((JSONObject) buildViewObject.data).put("__Diff", new Object());
        }
        if (sharedState.getOriginalDataSize() > 0) {
            buildViewObject.isStateLoadSourceReady = true;
        }
        if (str != null) {
            buildViewObject.traceId = str;
        }
        buildViewObject.sharedState = sharedState;
        Plugin plugin2 = this.mPlugin;
        if (plugin2 != null) {
            plugin2.onBuildViewObjectEnd(buildViewObject);
        }
        Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1010).ext(MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, this.mDojoContext.bizConfigCode, "layoutBindTime", String.valueOf(System.currentTimeMillis() - currentTimeMillis)).build());
        TraceUtil.endTrace();
        return buildViewObject;
    }
}

package com.taobao.mytaobao.basement.Bridge;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.mytaobao.basement.BasementConstants;
import com.taobao.mytaobao.ut.c;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import tb.kge;
import tb.mtr;
import tb.mtx;
import tb.mtz;
import tb.mua;
import tb.mxe;
import tb.mxj;

/* loaded from: classes7.dex */
public class MtbBasementWeexApiPlugin extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static WeakReference<b> abilityRef;

    public static /* synthetic */ Object ipc$super(MtbBasementWeexApiPlugin mtbBasementWeexApiPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @MUSMethod(uiThread = false)
    public void onScrollEnd(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0c3cfa", new Object[]{this, jSONObject});
        }
    }

    public static /* synthetic */ String access$000(MtbBasementWeexApiPlugin mtbBasementWeexApiPlugin, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5b7dd34c", new Object[]{mtbBasementWeexApiPlugin, jSONObject}) : mtbBasementWeexApiPlugin.getSorceFromFeedData(jSONObject);
    }

    static {
        kge.a(1048909514);
        abilityRef = null;
    }

    public static void setBasementWeexBridgeAbility(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b65c6f1", new Object[]{bVar});
        } else {
            abilityRef = new WeakReference<>(bVar);
        }
    }

    public static void commitWeexEventTrace(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13f4605c", new Object[]{str, jSONObject});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", (Object) str);
            jSONObject2.put("uuid", (Object) (jSONObject == null ? null : jSONObject.getString("uuid")));
            com.taobao.mytaobao.basement.monitor.b.a().a("TBBridgeEvent_Weex", jSONObject2, 1.0d, false);
            mua.a(com.taobao.mytaobao.basement.monitor.b.MODULE_NAME, 19997, "TBBridgeEvent", null, null, jSONObject2);
        }
    }

    public MtbBasementWeexApiPlugin(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = false)
    public void startPerformanceMonitor(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21023fbd", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("node");
        TLog.loge(BasementConstants.TAG, String.format("MtbBasementWeexApiPlugin.startPerformanceMonitor:%s", string));
        mtx.c().a(string);
        commitWeexEventTrace("startPerformanceMonitor", jSONObject);
    }

    @MUSMethod(uiThread = false)
    public void endPerformanceMonitor(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64ec2724", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("node");
        JSONObject jSONObject2 = null;
        try {
            jSONObject2 = jSONObject.getJSONObject("args");
        } catch (Throwable unused) {
        }
        TLog.loge(BasementConstants.WEEX_TAG, String.format("MtbBasementWeexApiPlugin.endPointWithNodeType:%s", string));
        mtx.c().a(string, jSONObject2);
        commitWeexEventTrace("endPerformanceMonitor", jSONObject);
    }

    @MUSMethod(uiThread = true)
    public void openWindowFromEmbedView(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12bbdfaf", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("url");
        TLog.loge(BasementConstants.WEEX_TAG, String.format("MtbBasementWeexApiPlugin.openWindowFromEmbedView url:%s", string));
        if (!TextUtils.isEmpty(string)) {
            String queryParameter = Uri.parse(string).getQueryParameter("spm");
            WeakReference<b> weakReference = abilityRef;
            b bVar = weakReference == null ? null : weakReference.get();
            if (bVar != null) {
                bVar.a(string, queryParameter);
            }
        }
        commitWeexEventTrace("openWindowFromEmbedView", jSONObject);
    }

    @MUSMethod(uiThread = false)
    public void renderSuccess(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb76c5dc", new Object[]{this, jSONObject});
            return;
        }
        p mtbBasementWeexApiPlugin = getInstance();
        if (mtbBasementWeexApiPlugin != null) {
            mtbBasementWeexApiPlugin.setTag("mtbRenderSuccess", "true");
        }
        TLog.loge("mtbMainLink", "MtbBasementWeexApiPlugin.renderSuccess");
        WeakReference<b> weakReference = abilityRef;
        final b bVar = weakReference == null ? null : weakReference.get();
        if (bVar != null) {
            mtz.a(new Runnable() { // from class: com.taobao.mytaobao.basement.Bridge.MtbBasementWeexApiPlugin.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        bVar.a();
                    }
                }
            });
        }
        commitWeexEventTrace("renderSuccess", jSONObject);
        c.a("Page_MyTaobao", "Page_MyTaobao_Basement-RenderSuccess", "a2141.7631743.67.1", (String) null, jSONObject);
    }

    @MUSMethod(uiThread = false)
    public JSONObject getPreloadData(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3091283", new Object[]{this, jSONObject, bVar});
        }
        if (jSONObject != null && "fetchFirstFeedData".equals(jSONObject.getString("action"))) {
            return fetchFirstFeedData(jSONObject, bVar);
        }
        if (jSONObject != null && "fetchSecondFeedData".equals(jSONObject.getString("action"))) {
            return fetchSecondFeedData(jSONObject, bVar);
        }
        TLog.loge("mtbMainLink", "MtbBasementWeexApiPlugin.getPreloadData");
        commitWeexEventTrace("getPreloadData", jSONObject);
        WeakReference<b> weakReference = abilityRef;
        b bVar2 = weakReference == null ? null : weakReference.get();
        if (bVar2 != null) {
            return bVar2.a(bVar);
        }
        if (!mxj.b("fixMtbPreloadFeedBug", true)) {
            return null;
        }
        return com.taobao.mytaobao.basement.weex.a.INSTANCE.a(bVar);
    }

    private JSONObject fetchFirstFeedData(JSONObject jSONObject, final com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("20918422", new Object[]{this, jSONObject, bVar});
        }
        TLog.loge(com.taobao.mytaobao.base.a.TAG, "前端要一刷数据");
        JSONObject b = mxe.INSTANCE.b(new mtr<JSONObject>() { // from class: com.taobao.mytaobao.basement.Bridge.MtbBasementWeexApiPlugin.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.mtr
            public /* synthetic */ void onResult(boolean z, String str, JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cc0b3077", new Object[]{this, new Boolean(z), str, jSONObject2});
                } else {
                    a(z, str, jSONObject2);
                }
            }

            public void a(boolean z, String str, JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("86df5f7a", new Object[]{this, new Boolean(z), str, jSONObject2});
                    return;
                }
                TLog.loge(com.taobao.mytaobao.base.a.TAG, "前端获取一刷数据成功， source=" + MtbBasementWeexApiPlugin.access$000(MtbBasementWeexApiPlugin.this, jSONObject2));
                if (Versions.isDebug()) {
                    TLog.loge(com.taobao.mytaobao.base.a.TAG, "data=" + jSONObject2);
                }
                bVar.a(jSONObject2);
            }
        });
        if (b != null) {
            TLog.loge(com.taobao.mytaobao.base.a.TAG, "【同步】前端获取一刷数据成功， source=" + getSorceFromFeedData(b));
            if (Versions.isDebug()) {
                TLog.loge(com.taobao.mytaobao.base.a.TAG, "data=" + b);
            }
        }
        return b;
    }

    private JSONObject fetchSecondFeedData(JSONObject jSONObject, final com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("53b97f6a", new Object[]{this, jSONObject, bVar});
        }
        TLog.loge(com.taobao.mytaobao.base.a.TAG, "前端要二刷数据");
        JSONObject c = mxe.INSTANCE.c(new mtr<JSONObject>() { // from class: com.taobao.mytaobao.basement.Bridge.MtbBasementWeexApiPlugin.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.mtr
            public /* synthetic */ void onResult(boolean z, String str, JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cc0b3077", new Object[]{this, new Boolean(z), str, jSONObject2});
                } else {
                    a(z, str, jSONObject2);
                }
            }

            public void a(boolean z, String str, JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("86df5f7a", new Object[]{this, new Boolean(z), str, jSONObject2});
                    return;
                }
                TLog.loge(com.taobao.mytaobao.base.a.TAG, "前端获取二刷数据成功， source=" + MtbBasementWeexApiPlugin.access$000(MtbBasementWeexApiPlugin.this, jSONObject2));
                if (Versions.isDebug()) {
                    TLog.loge(com.taobao.mytaobao.base.a.TAG, "data=" + jSONObject2);
                }
                bVar.a(jSONObject2);
            }
        });
        if (c != null) {
            TLog.loge(com.taobao.mytaobao.base.a.TAG, "【同步】前端获取二刷数据成功， source=" + getSorceFromFeedData(c));
            if (Versions.isDebug()) {
                TLog.loge(com.taobao.mytaobao.base.a.TAG, "data=" + c);
            }
        }
        return c;
    }

    private String getSorceFromFeedData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a489f58b", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject == null ? null : jSONObject.getJSONObject("preloadData");
        if (jSONObject2 != null) {
            return jSONObject2.getString("source");
        }
        return null;
    }

    @MUSMethod(uiThread = false)
    public void verifyFirstCardExpose(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa184e1e", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        TLog.loge(BasementConstants.WEEX_TAG, "TLModule verifyFirstCardExpose params:" + jSONObject.toJSONString());
        WeakReference<b> weakReference = abilityRef;
        b bVar = weakReference == null ? null : weakReference.get();
        if (bVar == null) {
            return;
        }
        bVar.a(jSONObject);
    }

    @MUSMethod(uiThread = false)
    public void verifyFirstCardExposeV2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8e93c2", new Object[]{this, jSONObject});
            return;
        }
        try {
            String string = jSONObject.getString("uuid");
            TLog.loge(BasementConstants.WEEX_TAG, "verifyFirstCardExposeV2 uuid:" + string);
            b bVar = abilityRef == null ? null : abilityRef.get();
            if (bVar == null) {
                return;
            }
            bVar.a(getInstance(), jSONObject);
        } catch (Throwable unused) {
        }
    }

    @MUSMethod(uiThread = false)
    public void changeTaoFriendArrowHiddenStatus(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bebb0b4", new Object[]{this, jSONObject});
            return;
        }
        try {
            String string = jSONObject.getString("uuid");
            boolean booleanValue = jSONObject.getBooleanValue("isHidden");
            TLog.loge(BasementConstants.WEEX_TAG, "changeTaoFriendArrowHiddenStatus uuid:" + string + " isHidden:" + booleanValue);
            b bVar = abilityRef == null ? null : abilityRef.get();
            if (bVar == null) {
                return;
            }
            bVar.a(booleanValue);
        } catch (Throwable unused) {
        }
    }

    @MUSMethod(uiThread = false)
    public void secScreenCeiling(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc501569", new Object[]{this, jSONObject});
            return;
        }
        try {
            String string = jSONObject.getString("uuid");
            TLog.loge(BasementConstants.WEEX_TAG, "secScreenCeiling uuid:" + string);
            b bVar = abilityRef == null ? null : abilityRef.get();
            if (bVar == null) {
                return;
            }
            bVar.b();
        } catch (Throwable unused) {
        }
    }
}

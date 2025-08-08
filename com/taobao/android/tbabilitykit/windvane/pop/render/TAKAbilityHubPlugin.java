package com.taobao.android.tbabilitykit.windvane.pop.render;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.webview.IWVWebView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.alr;
import tb.dkt;
import tb.dkv;
import tb.dkw;
import tb.dkx;
import tb.dla;
import tb.dlh;
import tb.dll;
import tb.dlr;
import tb.dms;
import tb.jal;
import tb.kge;

/* loaded from: classes6.dex */
public class TAKAbilityHubPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ABILITY_DEFAULT_TYPE = "unknownType";
    private static final String TAG = "TAKAbilityHubPlugin";
    private static final int WV_PLUGIN_ERROR_CODE = 20001;

    static {
        kge.a(-1560255420);
    }

    public static /* synthetic */ Object ipc$super(TAKAbilityHubPlugin tAKAbilityHubPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(TAKAbilityHubPlugin tAKAbilityHubPlugin, dkx dkxVar, WVCallBackContext wVCallBackContext, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("516413e8", new Object[]{tAKAbilityHubPlugin, dkxVar, wVCallBackContext, str, new Boolean(z)});
        } else {
            tAKAbilityHubPlugin.wvCallBack(dkxVar, wVCallBackContext, str, z);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"dispatch".equals(str)) {
            failCallback(ABILITY_DEFAULT_TYPE, 20001, "unsupported " + str, wVCallBackContext);
            return false;
        }
        IWVWebView webview = wVCallBackContext.getWebview();
        if (!(webview instanceof IWVWebView) || (view = webview.getView()) == null) {
            failCallback(ABILITY_DEFAULT_TYPE, 20001, "WebView is not view", wVCallBackContext);
            return false;
        }
        Object tag = view.getTag(R.id.tak_pop_ability_engine_tag);
        JSONObject jSONObject = null;
        dkt dktVar = tag instanceof dkt ? (dkt) tag : null;
        if (dktVar == null) {
            dktVar = new dkt(new alr("AbilityKit", "windvane_hub"), null);
            view.setTag(R.id.tak_pop_ability_engine_tag, dktVar);
        }
        dlr dlrVar = new dlr();
        dlrVar.a(dms.a(view.getContext()));
        dlrVar.a(view);
        dlrVar.a(dktVar);
        if (!StringUtils.isEmpty(str2)) {
            try {
                jSONObject = JSONObject.parseObject(str2);
            } catch (Exception unused) {
            }
        }
        if (jSONObject == null) {
            failCallback(ABILITY_DEFAULT_TYPE, 20001, "params parse error :" + str2, wVCallBackContext);
            return false;
        }
        wvCallBack(dktVar.a(new dlh(jSONObject), dlrVar, new dll() { // from class: com.taobao.android.tbabilitykit.windvane.pop.render.TAKAbilityHubPlugin.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.dll
            public void callback(String str3, dkx dkxVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("398d9b15", new Object[]{this, str3, dkxVar});
                } else {
                    TAKAbilityHubPlugin.access$000(TAKAbilityHubPlugin.this, dkxVar, wVCallBackContext, str3, false);
                }
            }

            public void finalize() throws Throwable {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a35321a5", new Object[]{this});
                    return;
                }
                wVCallBackContext.success();
                super.finalize();
            }
        }), wVCallBackContext, "default", true);
        return true;
    }

    private void wvCallBack(dkx dkxVar, WVCallBackContext wVCallBackContext, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d436ccc3", new Object[]{this, dkxVar, wVCallBackContext, str, new Boolean(z)});
        } else if (dkxVar instanceof dkw) {
            if (dkxVar != null && (dkxVar.c() instanceof dkv)) {
                dkv dkvVar = (dkv) dkxVar.c();
                failCallback(str, dkvVar.a(), dkvVar.b(), wVCallBackContext);
                return;
            }
            failCallback(str, 20001, "未知错误", wVCallBackContext);
        } else if (dkxVar instanceof dla) {
            successCallback(str, dkxVar.c(), wVCallBackContext, z);
        } else {
            successCallback(str, dkxVar != null ? dkxVar.c() : null, wVCallBackContext, true);
        }
    }

    private static void successCallback(String str, Object obj, WVCallBackContext wVCallBackContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cbf4c2", new Object[]{str, obj, wVCallBackContext, new Boolean(z)});
        } else if (z) {
            wVCallBackContext.successAndKeepAlive(jal.a(str, obj).toJSONString());
        } else {
            wVCallBackContext.success(jal.a(str, obj).toJSONString());
        }
    }

    private static void failCallback(String str, int i, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96a29276", new Object[]{str, new Integer(i), str2, wVCallBackContext});
        } else {
            wVCallBackContext.error(jal.a(str, i, str2).toJSONString());
        }
    }
}

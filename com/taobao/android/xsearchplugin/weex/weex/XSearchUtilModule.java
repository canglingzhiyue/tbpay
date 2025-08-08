package com.taobao.android.xsearchplugin.weex.weex;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXException;
import com.taobao.weex.common.WXModule;
import tb.iml;
import tb.isr;
import tb.kge;

/* loaded from: classes6.dex */
public class XSearchUtilModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String METHOD_COMMIT_CLICK = "commitClick";
    public static final String METHOD_COMMIT_EXPOSE = "commitExpose";
    public static final String METHOD_REQUEST_LOST_FOCUS = "requestLostFocus";
    public static final String METHOD_UPDATE_STORAGE = "updateStorage";
    public static final String MODULE_NAME = "xsearchUtil";
    public static boolean REGISTERED = false;
    private static final String TAG = "XSearchUtilModule";
    public static volatile iml sConstantAdapter;

    static {
        kge.a(-1851757985);
        REGISTERED = false;
    }

    public static void install(iml imlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c742004a", new Object[]{imlVar});
        } else if (REGISTERED) {
        } else {
            REGISTERED = true;
            sConstantAdapter = imlVar;
            try {
                WXSDKEngine.registerModule("xsearchUtil", XSearchUtilModule.class);
            } catch (WXException e) {
                e.printStackTrace();
            }
        }
    }

    @JSMethod(uiThread = true)
    public void updateStorage(JSONObject jSONObject) {
        h b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2b3a517", new Object[]{this, jSONObject});
        } else if (!(this.mWXSDKInstance instanceof d) || (b = ((d) this.mWXSDKInstance).b()) == null) {
        } else {
            b.b("updateStorage", jSONObject, null, null);
        }
    }

    @JSMethod(uiThread = true)
    public void requestLostFocus(JSCallback jSCallback) {
        h b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c2d00bc", new Object[]{this, jSCallback});
        } else if (!(this.mWXSDKInstance instanceof d) || (b = ((d) this.mWXSDKInstance).b()) == null) {
        } else {
            b.b("updateStorage", null, b.a(jSCallback), null);
        }
    }

    @JSMethod(uiThread = false)
    public JSONObject getLocalParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b66d71c2", new Object[]{this});
        }
        String e = sConstantAdapter.e();
        String b = sConstantAdapter.b();
        String a2 = sConstantAdapter.a();
        JSONObject jSONObject = new JSONObject();
        if (!StringUtils.isEmpty(e)) {
            jSONObject.put("sversion", (Object) e);
            jSONObject.put("utd_id", (Object) b);
            jSONObject.put("ttid", (Object) a2);
        }
        return jSONObject;
    }

    private void performAction(String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        h b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1840d900", new Object[]{this, str, jSONObject, aVar, aVar2});
        } else if (!(this.mWXSDKInstance instanceof d) || (b = ((d) this.mWXSDKInstance).b()) == null) {
        } else {
            b.b(str, jSONObject, aVar, aVar2);
        }
    }
}

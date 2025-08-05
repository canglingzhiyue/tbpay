package com.taobao.android.searchbaseframe.chitu;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.chitu.lib.RequestInfoBean;
import com.taobao.android.searchbaseframe.util.n;
import com.ut.device.UTDevice;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.imm;
import tb.imn;
import tb.imo;
import tb.kge;

/* loaded from: classes6.dex */
public class TBSearchChiTuJSBridge extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ABTEST = "abtest";
    public static final String CHITU_CONFIG = "config";
    private static final String LAWFUL_HOST = "taobao.com";
    public static final String SERVER_REWRITE = "serverRewrite";
    private static final String TAG = "ChitujsBridge";

    static {
        kge.a(1462832457);
    }

    public static /* synthetic */ Object ipc$super(TBSearchChiTuJSBridge tBSearchChiTuJSBridge, String str, Object... objArr) {
        if (str.hashCode() == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        this.mContext = context;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (wVCallBackContext != null && isLawful(wVCallBackContext.getWebview().getUrl())) {
            if ("setChituStorage".equals(str)) {
                setChituStorage(str2, wVCallBackContext);
            } else if ("getChituStorage".equals(str)) {
                getChituStorage(str2, wVCallBackContext);
            } else if ("closeChituPanel".equals(str)) {
                closeChituPanel(wVCallBackContext);
            } else if ("getUtdId".equals(str)) {
                getUtdId(wVCallBackContext);
            } else if ("getRequestInfo".equals(str)) {
                getRequestInfo(wVCallBackContext);
            } else if ("openChituWindow".equals(str)) {
                openChituWindow(str2, wVCallBackContext);
            }
            wVCallBackContext.error("MSG_RET_NO_HANDLER");
        }
        return false;
    }

    private void setChituStorage(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fcddb66", new Object[]{this, str, wVCallBackContext});
            return;
        }
        imn core = getCore(wVCallBackContext);
        if (core == null) {
            wVCallBackContext.error("no core");
            return;
        }
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject("serverRewrite");
                JSONObject optJSONObject2 = jSONObject.optJSONObject(ABTEST);
                JSONObject optJSONObject3 = jSONObject.optJSONObject("config");
                SharedPreferences.Editor edit = core.j().a().edit();
                if (optJSONObject != null) {
                    edit.putString("serverRewrite", optJSONObject.toString());
                }
                if (optJSONObject2 != null) {
                    edit.putString(ABTEST, optJSONObject2.toString());
                }
                if (optJSONObject3 != null) {
                    edit.putString("config", optJSONObject3.toString());
                }
                if (edit.commit()) {
                    wVCallBackContext.success();
                    if (optJSONObject2 == null) {
                        return;
                    }
                    com.taobao.search.rainbow.a.d(optJSONObject2.toString());
                    return;
                }
            } catch (JSONException unused) {
                wVCallBackContext.error("json解析异常");
                return;
            }
        }
        wVCallBackContext.error("本地保存失败");
    }

    private imn getCore(WVCallBackContext wVCallBackContext) {
        imn imnVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (imn) ipChange.ipc$dispatch("852c9683", new Object[]{this, wVCallBackContext});
        }
        try {
            imnVar = ((imm) wVCallBackContext.getWebview().getContext()).a();
        } catch (Exception e) {
            e.printStackTrace();
            imnVar = null;
        }
        return imnVar != null ? imnVar : imo.b();
    }

    private void getChituStorage(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73709f5a", new Object[]{this, str, wVCallBackContext});
            return;
        }
        imn core = getCore(wVCallBackContext);
        if (core == null) {
            wVCallBackContext.error("no core");
            return;
        }
        if (str != null) {
            HashMap hashMap = new HashMap();
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("key");
                SharedPreferences a2 = core.j().a();
                if (jSONArray != null) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String optString = jSONArray.optString(i, "");
                        if (!TextUtils.isEmpty(optString)) {
                            String string = a2.getString(optString, "");
                            if (!TextUtils.isEmpty(string)) {
                                JSONObject jSONObject = null;
                                try {
                                    jSONObject = new JSONObject(string);
                                } catch (JSONException e) {
                                    core.b().b(TAG, "读取本地改写策略失败", e);
                                }
                                if (jSONObject != null) {
                                    hashMap.put(optString, jSONObject);
                                }
                            }
                        }
                    }
                    wVCallBackContext.success(new JSONObject(hashMap).toString());
                    return;
                }
            } catch (JSONException unused) {
                wVCallBackContext.error("Json解析异常");
                return;
            }
        }
        wVCallBackContext.error();
    }

    private void closeChituPanel(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("828c0c3b", new Object[]{this, wVCallBackContext});
            return;
        }
        if (this.mContext instanceof Activity) {
            ((Activity) this.mContext).finish();
        }
        wVCallBackContext.success();
    }

    private void getUtdId(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b12a602e", new Object[]{this, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("utdid", UTDevice.getUtdid(imo.c()));
            wVCallBackContext.success(jSONObject.toString());
        } catch (Exception unused) {
            wVCallBackContext.error();
        }
    }

    private void getRequestInfo(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66b097eb", new Object[]{this, wVCallBackContext});
            return;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, RequestInfoBean> entry : a.c.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        wVCallBackContext.success(new JSONObject(hashMap) + "");
    }

    private void openChituWindow(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c18a2f59", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            String optString = new JSONObject(str).optString("url");
            if (isLawful(optString)) {
                n.a(this.mContext, optString);
            }
        } catch (JSONException e) {
            wVCallBackContext.error(e + "");
            e.printStackTrace();
        }
        wVCallBackContext.success();
    }

    private boolean isLawful(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e33e133a", new Object[]{this, str})).booleanValue();
        }
        if (str != null) {
            String str2 = "";
            if (!str.trim().equals(str2)) {
                try {
                    str2 = new URL(str).getHost();
                } catch (MalformedURLException unused) {
                }
                return str2.endsWith(LAWFUL_HOST);
            }
        }
        return false;
    }
}

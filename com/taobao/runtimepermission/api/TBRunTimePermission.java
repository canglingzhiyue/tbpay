package com.taobao.runtimepermission.api;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.AttributionReporter;
import com.taobao.runtimepermission.d;
import com.taobao.runtimepermission.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.nml;

/* loaded from: classes7.dex */
public class TBRunTimePermission extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_NAME_PARAM_NAME = "bizName";
    public static final String CHECK_PERMISSION_API_NAME = "checkBizPermission";
    public static final String EXPLAIN_PARAM_NAME = "explain";
    public static final String PERMISSIONS_ANDROID_PARAM_NAME = "permissions4Android";
    public static final String PERMISSIONS_PARAM_NAME = "permissions";
    public static final String REQUEST_BIZ_PERMISSION_API_NAME = "requestBizPermission";
    public static final String REQUEST_PERMISSION_API_NAME = "requestPermission";
    public static final String SILENCE_INTERVAL_NAME = "silenceInterval";

    public static /* synthetic */ Object ipc$super(TBRunTimePermission tBRunTimePermission, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ JSONObject access$000(TBRunTimePermission tBRunTimePermission, d dVar) throws JSONException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("f56cd331", new Object[]{tBRunTimePermission, dVar}) : tBRunTimePermission.ConvertPermissionResult2JsonObj(dVar);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.equals(str, REQUEST_PERMISSION_API_NAME)) {
            requestPermission(str2, wVCallBackContext);
            return true;
        } else if (TextUtils.equals(str, REQUEST_BIZ_PERMISSION_API_NAME)) {
            requestBizPermission(str2, wVCallBackContext);
            return true;
        } else if (!TextUtils.equals(str, CHECK_PERMISSION_API_NAME)) {
            return false;
        } else {
            checkPermission(str2, wVCallBackContext);
            return true;
        }
    }

    private void requestBizPermission(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("318a0081", new Object[]{this, str, wVCallBackContext});
            return;
        }
        final r rVar = new r();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("bizName");
            JSONArray jSONArray = jSONObject.getJSONArray(PERMISSIONS_ANDROID_PARAM_NAME);
            String string2 = jSONObject.getString(EXPLAIN_PARAM_NAME);
            long optLong = jSONObject.optLong(SILENCE_INTERVAL_NAME, -1L);
            if (jSONArray != null && jSONArray.length() != 0) {
                String[] strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = jSONArray.getString(i);
                }
                IWVWebView webview = wVCallBackContext.getWebview();
                if (webview == null) {
                    rVar.a("errMsg", "error: webview is empty!");
                    wVCallBackContext.error(rVar);
                    return;
                }
                f.a(webview.getContext(), strArr).a(true).b(true).a(string2).b(string).a(optLong).a(new nml() { // from class: com.taobao.runtimepermission.api.TBRunTimePermission.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.nml
                    public void a(d dVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("c1d4ff8e", new Object[]{this, dVar});
                            return;
                        }
                        try {
                            JSONObject access$000 = TBRunTimePermission.access$000(TBRunTimePermission.this, dVar);
                            if (access$000 == null) {
                                rVar.a("errMsg", "result json is empty.");
                                wVCallBackContext.error(rVar);
                            }
                            rVar.a("result", access$000);
                            wVCallBackContext.success(rVar);
                        } catch (JSONException e) {
                            r rVar2 = rVar;
                            rVar2.a("errMsg", "failed: occur exception " + e);
                            wVCallBackContext.error(rVar);
                        }
                    }
                }).a();
                return;
            }
            rVar.a("errMsg", "error: permissions are empty!");
            wVCallBackContext.error(rVar);
        } catch (Throwable th) {
            rVar.a("errMsg", "failed: occur exception " + th);
            wVCallBackContext.error(rVar);
        }
    }

    private void requestPermission(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3457938c", new Object[]{this, str, wVCallBackContext});
            return;
        }
        final r rVar = new r();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("bizName");
            JSONArray jSONArray = jSONObject.getJSONArray("permissions");
            String string2 = jSONObject.getString(EXPLAIN_PARAM_NAME);
            long optLong = jSONObject.optLong(SILENCE_INTERVAL_NAME, -1L);
            if (jSONArray != null && jSONArray.length() != 0) {
                String[] strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = jSONArray.getString(i);
                }
                IWVWebView webview = wVCallBackContext.getWebview();
                if (webview == null) {
                    rVar.a("errMsg", "error: webview is empty!");
                    wVCallBackContext.error(rVar);
                    return;
                }
                f.a(webview.getContext(), strArr).a(true).b(false).a(string2).b(string).a(optLong).b(new Runnable() { // from class: com.taobao.runtimepermission.api.TBRunTimePermission.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        rVar.a("msg", "failed: permissions are denied.");
                        wVCallBackContext.error(rVar);
                    }
                }).a(new Runnable() { // from class: com.taobao.runtimepermission.api.TBRunTimePermission.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            wVCallBackContext.success();
                        }
                    }
                }).a();
                return;
            }
            rVar.a("errMsg", "error: permissions are empty!");
            wVCallBackContext.error(rVar);
        } catch (Throwable th) {
            rVar.a("errMsg", "error: occur exception " + th);
            wVCallBackContext.error(rVar);
        }
    }

    private void checkPermission(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54ef4785", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("bizName", "");
            JSONArray jSONArray = jSONObject.getJSONArray(PERMISSIONS_ANDROID_PARAM_NAME);
            if (jSONArray.length() <= 0) {
                wVCallBackContext.error("HY_PARAM_ERR");
                return;
            }
            String[] strArr = new String[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                strArr[i] = (String) jSONArray.get(i);
            }
            IWVWebView webview = wVCallBackContext.getWebview();
            if (webview == null) {
                rVar.a("errMsg", "error: webview is empty!");
                wVCallBackContext.error(rVar);
                return;
            }
            d a2 = f.a(webview.getContext(), optString, strArr);
            if (a2 == null) {
                rVar.a("errMsg", "error: check with empty result!");
                wVCallBackContext.error(rVar);
                return;
            }
            JSONObject ConvertPermissionResult2JsonObj = ConvertPermissionResult2JsonObj(a2);
            if (ConvertPermissionResult2JsonObj == null) {
                rVar.a("errMsg", "result json is empty.");
                wVCallBackContext.error(rVar);
            }
            rVar.a("result", ConvertPermissionResult2JsonObj);
            wVCallBackContext.success(rVar);
        } catch (Throwable th) {
            rVar.a("errMsg", "error: occur exception " + th);
            wVCallBackContext.error(rVar);
        }
    }

    private JSONObject ConvertPermissionResult2JsonObj(d dVar) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cfb331f7", new Object[]{this, dVar});
        }
        if (dVar == null || dVar.f18987a == null || dVar.b == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < dVar.f18987a.length; i++) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AttributionReporter.SYSTEM_PERMISSION, dVar.f18987a[i]);
            jSONObject2.put("grantStatus", dVar.b[i]);
            jSONObject2.put("msg", dVar.c[i]);
            jSONObject.put(dVar.f18987a[i], jSONObject2);
        }
        return jSONObject;
    }
}

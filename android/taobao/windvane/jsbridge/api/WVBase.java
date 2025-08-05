package android.taobao.windvane.jsbridge.api;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.taobao.windvane.config.EnvEnum;
import android.taobao.windvane.config.j;
import android.taobao.windvane.jsbridge.IJsApiFailedCallBack;
import android.taobao.windvane.jsbridge.IJsApiSucceedCallBack;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.h;
import android.taobao.windvane.jsbridge.l;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.util.m;
import android.taobao.windvane.webview.WVWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class WVBase extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(562735550);
    }

    public static /* synthetic */ Object ipc$super(WVBase wVBase, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("isWindVaneSDK".equals(str)) {
            isWindVaneSDK(wVCallBackContext, str2);
        } else if ("plusUT".equals(str)) {
            plusUT(wVCallBackContext, str2);
        } else if ("commitUTEvent".equals(str)) {
            commitUTEvent(wVCallBackContext, str2);
        } else if ("isInstall".equals(str)) {
            isInstall(wVCallBackContext, str2);
        } else if ("isAppsInstalled".equals(str)) {
            isAppsInstalled(wVCallBackContext, str2);
        } else if ("copyToClipboard".equals(str)) {
            copyToClipboard(wVCallBackContext, str2);
        } else if ("addTailJSBridge".equals(str)) {
            addTailJSBridge(wVCallBackContext, str2);
        } else if ("checkPermissions".equals(str)) {
            checkPermissions(wVCallBackContext, str2);
        } else if (!com.taobao.tmgcashier.constant.a.BRIDGE_ACTION_OPENBROWSER.equals(str)) {
            return false;
        } else {
            openBrowser(wVCallBackContext, str2);
        }
        return true;
    }

    public void addTailJSBridge(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b748fd11", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("className");
            String string2 = jSONObject.getString("handlerName");
            String string3 = jSONObject.getString("params");
            h hVar = new h();
            hVar.d = string;
            hVar.e = string2;
            hVar.f = string3;
            hVar.f1664a = this.mWebView;
            hVar.i = new IJsApiSucceedCallBack() { // from class: android.taobao.windvane.jsbridge.api.WVBase.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.taobao.windvane.jsbridge.IJsApiSucceedCallBack
                public void succeed(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e5b77b53", new Object[]{this, str2});
                    }
                }
            };
            hVar.h = new IJsApiFailedCallBack() { // from class: android.taobao.windvane.jsbridge.api.WVBase.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.taobao.windvane.jsbridge.IJsApiFailedCallBack
                public void fail(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("534fc72f", new Object[]{this, str2});
                    }
                }
            };
            if (l.b().f1666a == null) {
                l.b().f1666a = new ArrayList<>();
            }
            l.b().f1666a.add(hVar);
            m.c("Base", "addTailJSBridge : " + str);
        } catch (Exception unused) {
        }
    }

    public void isWindVaneSDK(WVCallBackContext wVCallBackContext, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f579a14", new Object[]{this, wVCallBackContext, str});
            return;
        }
        r rVar = new r();
        rVar.a("os", "android");
        rVar.a("version", android.taobao.windvane.config.a.VERSION);
        rVar.a("debug", Boolean.valueOf(android.taobao.windvane.util.e.b()));
        if (m.a()) {
            m.b("Base", "isWindVaneSDK: version=8.5.0");
        }
        if (EnvEnum.DAILY.equals(android.taobao.windvane.config.a.f1556a)) {
            str2 = "daily";
        } else {
            str2 = EnvEnum.PRE.equals(android.taobao.windvane.config.a.f1556a) ? "pre" : "release";
        }
        rVar.a("env", str2);
        rVar.a("container", this.mWebView instanceof WVWebView ? "WVWebView" : "WVUCWebView");
        wVCallBackContext.success(rVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void plusUT(android.taobao.windvane.jsbridge.WVCallBackContext r17, java.lang.String r18) {
        /*
            r16 = this;
            r1 = r17
            r2 = r18
            java.lang.String r0 = "args"
            com.android.alibaba.ip.runtime.IpChange r3 = android.taobao.windvane.jsbridge.api.WVBase.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L1e
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r7] = r16
            r0[r6] = r1
            r0[r5] = r2
            java.lang.String r1 = "ada16587"
            r3.ipc$dispatch(r1, r0)
            return
        L1e:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L8c
            r3.<init>(r2)     // Catch: org.json.JSONException -> L8c
            java.lang.String r4 = "eid"
            int r4 = r3.getInt(r4)     // Catch: org.json.JSONException -> L8c
            java.lang.String r8 = "a1"
            java.lang.String r8 = r3.getString(r8)     // Catch: org.json.JSONException -> L8c
            java.lang.String r9 = "a2"
            java.lang.String r9 = r3.getString(r9)     // Catch: org.json.JSONException -> L8c
            java.lang.String r10 = "a3"
            java.lang.String r10 = r3.getString(r10)     // Catch: org.json.JSONException -> L8c
            java.lang.String[] r11 = new java.lang.String[r7]     // Catch: org.json.JSONException -> L8c
            boolean r12 = r3.has(r0)     // Catch: org.json.JSONException -> L8c
            if (r12 == 0) goto L77
            org.json.JSONObject r0 = r3.getJSONObject(r0)     // Catch: org.json.JSONException -> L8c
            if (r0 == 0) goto L77
            int r3 = r0.length()     // Catch: org.json.JSONException -> L8c
            java.lang.String[] r11 = new java.lang.String[r3]     // Catch: org.json.JSONException -> L8c
            java.util.Iterator r3 = r0.keys()     // Catch: org.json.JSONException -> L8c
            r12 = 0
        L54:
            boolean r13 = r3.hasNext()     // Catch: org.json.JSONException -> L8c
            if (r13 == 0) goto L77
            java.lang.Object r13 = r3.next()     // Catch: org.json.JSONException -> L8c
            java.lang.String r13 = (java.lang.String) r13     // Catch: org.json.JSONException -> L8c
            java.lang.String r14 = r0.getString(r13)     // Catch: org.json.JSONException -> L8c
            java.lang.String r15 = "%s=%s"
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: org.json.JSONException -> L8c
            r6[r7] = r13     // Catch: org.json.JSONException -> L8c
            r13 = 1
            r6[r13] = r14     // Catch: org.json.JSONException -> L8c
            java.lang.String r6 = java.lang.String.format(r15, r6)     // Catch: org.json.JSONException -> L8c
            r11[r12] = r6     // Catch: org.json.JSONException -> L8c
            int r12 = r12 + 1
            r6 = 1
            goto L54
        L77:
            r13 = 1
            r0 = 9100(0x238c, float:1.2752E-41)
            if (r4 < r0) goto L80
            r0 = 9200(0x23f0, float:1.2892E-41)
            if (r4 < r0) goto L84
        L80:
            r0 = 19999(0x4e1f, float:2.8025E-41)
            if (r4 != r0) goto L8a
        L84:
            android.taobao.windvane.monitor.b.commitEvent(r4, r8, r9, r10, r11)     // Catch: org.json.JSONException -> L88
            goto L91
        L88:
            r0 = move-exception
            goto L8e
        L8a:
            r13 = 0
            goto L91
        L8c:
            r0 = move-exception
            r13 = 0
        L8e:
            r0.printStackTrace()
        L91:
            android.taobao.windvane.jsbridge.r r0 = new android.taobao.windvane.jsbridge.r
            r0.<init>()
            java.lang.String r3 = "Base"
            if (r13 == 0) goto Lb8
            r1.success(r0)
            boolean r0 = android.taobao.windvane.util.m.a()
            if (r0 == 0) goto Ld4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "plusUT: param="
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.taobao.windvane.util.m.b(r3, r0)
            return
        Lb8:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "plusUT: parameter error, param="
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.taobao.windvane.util.m.e(r3, r2)
            java.lang.String r2 = "HY_PARAM_ERR"
            r0.a(r2)
            r1.error(r0)
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.jsbridge.api.WVBase.plusUT(android.taobao.windvane.jsbridge.WVCallBackContext, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void commitUTEvent(android.taobao.windvane.jsbridge.WVCallBackContext r17, java.lang.String r18) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            com.android.alibaba.ip.runtime.IpChange r2 = android.taobao.windvane.jsbridge.api.WVBase.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L1c
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r6] = r16
            r3[r5] = r0
            r3[r4] = r1
            java.lang.String r0 = "908e4832"
            r2.ipc$dispatch(r0, r3)
            return
        L1c:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7a
            r2.<init>(r1)     // Catch: org.json.JSONException -> L7a
            java.lang.String r3 = "eventId"
            int r3 = r2.getInt(r3)     // Catch: org.json.JSONException -> L7a
            java.lang.String r7 = "arg1"
            java.lang.String r7 = r2.getString(r7)     // Catch: org.json.JSONException -> L7a
            java.lang.String r8 = "arg2"
            java.lang.String r8 = r2.getString(r8)     // Catch: org.json.JSONException -> L7a
            java.lang.String r9 = "arg3"
            java.lang.String r9 = r2.getString(r9)     // Catch: org.json.JSONException -> L7a
            java.lang.String r10 = "args"
            org.json.JSONObject r2 = r2.getJSONObject(r10)     // Catch: org.json.JSONException -> L7a
            r10 = 0
            if (r2 == 0) goto L70
            int r10 = r2.length()     // Catch: org.json.JSONException -> L7a
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch: org.json.JSONException -> L7a
            java.util.Iterator r11 = r2.keys()     // Catch: org.json.JSONException -> L7a
            r12 = 0
        L4d:
            boolean r13 = r11.hasNext()     // Catch: org.json.JSONException -> L7a
            if (r13 == 0) goto L70
            java.lang.Object r13 = r11.next()     // Catch: org.json.JSONException -> L7a
            java.lang.String r13 = (java.lang.String) r13     // Catch: org.json.JSONException -> L7a
            java.lang.String r14 = r2.getString(r13)     // Catch: org.json.JSONException -> L7a
            java.lang.String r15 = "%s=%s"
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: org.json.JSONException -> L7a
            r5[r6] = r13     // Catch: org.json.JSONException -> L7a
            r13 = 1
            r5[r13] = r14     // Catch: org.json.JSONException -> L7a
            java.lang.String r5 = java.lang.String.format(r15, r5)     // Catch: org.json.JSONException -> L7a
            r10[r12] = r5     // Catch: org.json.JSONException -> L7a
            int r12 = r12 + 1
            r5 = 1
            goto L4d
        L70:
            r13 = 1
            r2 = 64403(0xfb93, float:9.0248E-41)
            if (r2 != r3) goto L7a
            android.taobao.windvane.monitor.b.commitEvent(r3, r7, r8, r9, r10)     // Catch: org.json.JSONException -> L7b
            goto L7b
        L7a:
            r13 = 0
        L7b:
            android.taobao.windvane.jsbridge.r r2 = new android.taobao.windvane.jsbridge.r
            r2.<init>()
            java.lang.String r3 = "Base"
            if (r13 == 0) goto La2
            r0.success(r2)
            boolean r0 = android.taobao.windvane.util.m.a()
            if (r0 == 0) goto Lbe
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "commitUTEvent: param="
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.taobao.windvane.util.m.b(r3, r0)
            return
        La2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "commitUTEvent: parameter error, param="
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            android.taobao.windvane.util.m.e(r3, r1)
            java.lang.String r1 = "HY_PARAM_ERR"
            r2.a(r1)
            r0.error(r2)
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.jsbridge.api.WVBase.commitUTEvent(android.taobao.windvane.jsbridge.WVCallBackContext, java.lang.String):void");
    }

    public void isInstall(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72d42adf", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String str2 = null;
        try {
            reportJSAPIParams("isInstall", str);
            str2 = new JSONObject(str).getString("android");
        } catch (JSONException unused) {
            m.e("Base", "isInstall parse params error, params: " + str);
        }
        r rVar = new r();
        boolean a2 = android.taobao.windvane.util.a.a(this.mWebView.getContext(), str2);
        if (m.a()) {
            m.b("Base", "isInstall " + a2 + " for package " + str2);
        }
        if (a2) {
            rVar.a("version", android.taobao.windvane.util.a.b(this.mWebView.getContext(), str2));
            wVCallBackContext.success(rVar);
            return;
        }
        wVCallBackContext.error(rVar);
    }

    public void isAppsInstalled(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7aadac", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            reportJSAPIParams("isAppsInstalled", str);
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            r rVar = new r();
            PackageManager packageManager = this.mWebView.getContext().getPackageManager();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    PackageInfo packageInfo = null;
                    try {
                        packageInfo = packageManager.getPackageInfo(jSONObject.getJSONObject(next).optString("android"), 0);
                    } catch (Exception unused) {
                    }
                    rVar.a(next, packageInfo == null ? "0" : "1");
                } catch (JSONException e) {
                    e.printStackTrace();
                    rVar.a(next, "0");
                }
            }
            rVar.b();
            wVCallBackContext.success(rVar);
        } catch (JSONException e2) {
            e2.printStackTrace();
            wVCallBackContext.error();
        }
    }

    private void copyToClipboard(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac239634", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String str2 = "HY_PARAM_ERR";
        r rVar = new r(str2);
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("text")) {
                    String string = jSONObject.getString("text");
                    if (Build.VERSION.SDK_INT >= 11) {
                        ((ClipboardManager) this.mWebView.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(string, string));
                        r rVar2 = new r("HY_SUCCESS");
                        try {
                            wVCallBackContext.success(rVar2);
                            return;
                        } catch (JSONException e) {
                            e = e;
                            rVar = rVar2;
                            e.printStackTrace();
                            rVar.a("msg", str2);
                            wVCallBackContext.error(rVar);
                        }
                    }
                    rVar = new r("HY_FAILED");
                    str2 = "HY_FAILED";
                }
            } catch (JSONException e2) {
                e = e2;
            }
        }
        rVar.a("msg", str2);
        wVCallBackContext.error(rVar);
    }

    public void checkPermissions(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ea1c66a", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("permissions");
                if (jSONArray.length() <= 0) {
                    wVCallBackContext.error("HY_PARAM_ERR");
                    return;
                }
                String[] strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = (String) jSONArray.get(i);
                }
                Map<String, String> b = android.taobao.windvane.runtimepermission.a.b(this.mContext, strArr);
                if (b != null && b.size() > 0) {
                    r rVar = new r("HY_SUCCESS");
                    rVar.a("result", new JSONObject(b));
                    wVCallBackContext.success(rVar);
                    return;
                }
                wVCallBackContext.error(new r("HY_FAILED"));
            } catch (JSONException e) {
                e.printStackTrace();
                r rVar2 = new r("HY_PARAM_ERR");
                rVar2.a("reason", "JSONException: " + e);
                wVCallBackContext.error(rVar2);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
            r rVar3 = new r("HY_PARAM_ERR");
            rVar3.a("reason", "JSONException: " + e2);
            wVCallBackContext.error(rVar3);
        }
    }

    public void openBrowser(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("237ec70c", new Object[]{this, wVCallBackContext, str});
        } else if (!j.commonConfig.bN) {
            r rVar = new r("HY_FAILED");
            rVar.a("reason", "disable openBrowser");
            wVCallBackContext.error(rVar);
        } else {
            try {
                String string = new JSONObject(str).getString("url");
                if (!TextUtils.isEmpty(string)) {
                    this.mContext.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string)));
                    wVCallBackContext.success();
                    return;
                }
                r rVar2 = new r("HY_PARAM_ERR");
                rVar2.a("reason", "url is null");
                wVCallBackContext.error(rVar2);
            } catch (Exception e) {
                e.printStackTrace();
                r rVar3 = new r("HY_PARAM_ERR");
                rVar3.a("reason", "JSONException: " + e);
                wVCallBackContext.error(rVar3);
            }
        }
    }

    private void reportJSAPIParams(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2adfe5e", new Object[]{this, str, str2});
        } else if (!j.commonConfig.cy) {
        } else {
            com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
            jSONObject.put("apiName", (Object) str);
            jSONObject.put("params", (Object) str2);
            android.taobao.windvane.monitor.a.commitSuccess("baseIsInstalled", jSONObject.toJSONString());
        }
    }
}

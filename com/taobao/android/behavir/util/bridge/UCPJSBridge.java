package com.taobao.android.behavir.util.bridge;

import android.content.Intent;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfsadapter.g;
import com.taobao.android.behavir.fatigue.FatigueManager;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.behavir.util.i;
import com.taobao.android.behavix.d;
import com.taobao.android.testutils.a;
import com.taobao.android.ucp.bridge.NativeDelegate;
import com.taobao.weex.common.WXConfig;
import java.io.Serializable;
import java.util.Map;
import tb.dqq;
import tb.kge;

/* loaded from: classes4.dex */
public class UCPJSBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "UCP";

    static {
        kge.a(21938236);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r8.equals("uploadDB") != false) goto L14;
     */
    @Override // android.taobao.windvane.jsbridge.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r8, java.lang.String r9, android.taobao.windvane.jsbridge.WVCallBackContext r10) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.behavir.util.bridge.UCPJSBridge.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 3
            r3 = 2
            r4 = 4
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L22
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r6] = r7
            r1[r5] = r8
            r1[r3] = r9
            r1[r2] = r10
            java.lang.String r8 = "bcd41fd1"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L22:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L29
            return r6
        L29:
            r0 = -1
            int r1 = r8.hashCode()
            switch(r1) {
                case -1376771198: goto L86;
                case -584166313: goto L7a;
                case 72419466: goto L70;
                case 94627080: goto L66;
                case 1336114674: goto L5b;
                case 1563990591: goto L51;
                case 1564116395: goto L47;
                case 1710176880: goto L3d;
                case 2051041975: goto L32;
                default: goto L31;
            }
        L31:
            goto L90
        L32:
            java.lang.String r1 = "tryDecision"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L90
            r2 = 0
            goto L91
        L3d:
            java.lang.String r1 = "changeLogLevel"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L90
            r2 = 5
            goto L91
        L47:
            java.lang.String r1 = "postNotification"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L90
            r2 = 2
            goto L91
        L51:
            java.lang.String r1 = "uploadDB"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L90
            goto L91
        L5b:
            java.lang.String r1 = "triggerServiceRequest"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L90
            r2 = 4
            goto L91
        L66:
            java.lang.String r1 = "check"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L90
            r2 = 6
            goto L91
        L70:
            java.lang.String r1 = "reportAction"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L90
            r2 = 7
            goto L91
        L7a:
            java.lang.String r1 = "updateUCPDB"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L90
            r2 = 8
            goto L91
        L86:
            java.lang.String r1 = "previewPlans"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L90
            r2 = 1
            goto L91
        L90:
            r2 = -1
        L91:
            switch(r2) {
                case 0: goto Lba;
                case 1: goto Lb6;
                case 2: goto Lb1;
                case 3: goto Lad;
                case 4: goto La9;
                case 5: goto La4;
                case 6: goto L9b;
                case 7: goto L9a;
                case 8: goto L95;
                default: goto L94;
            }
        L94:
            return r6
        L95:
            boolean r8 = b(r9, r10)
            return r8
        L9a:
            return r6
        L9b:
            com.alibaba.fastjson.JSONObject r8 = com.alibaba.fastjson.JSON.parseObject(r9)
            boolean r8 = com.taobao.android.behavir.util.bridge.b.a(r8, r10)
            return r8
        La4:
            boolean r8 = applyLogLevelChange(r9, r10)
            return r8
        La9:
            b(r10)
            return r5
        Lad:
            a(r10)
            return r5
        Lb1:
            boolean r8 = a(r9, r10)
            return r8
        Lb6:
            tb.jmm.a(r9, r10)
            return r5
        Lba:
            android.taobao.windvane.webview.IWVWebView r8 = r7.mWebView
            boolean r8 = com.taobao.android.behavir.util.bridge.b.a(r7, r8, r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.behavir.util.bridge.UCPJSBridge.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }

    private static boolean b(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26c8934", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        String string = JSON.parseObject(str).getString(g.CACHE_SQL);
        int updateUCPDBByJSBridge = FatigueManager.updateUCPDBByJSBridge(string);
        if (updateUCPDBByJSBridge >= 0) {
            r rVar = new r();
            rVar.a("result", Integer.valueOf(updateUCPDBByJSBridge));
            wVCallBackContext.success(rVar);
        } else {
            wVCallBackContext.error();
        }
        UtUtils.a("UCP", (int) UtUtils.CHANGED_UPP_EVENT_ID, "Log", "updateUCPDB", string, "");
        return true;
    }

    public static boolean a(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cebe5e73", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null) {
            return false;
        }
        String string = parseObject.getString("name");
        JSONObject jSONObject = parseObject.getJSONObject("userInfo");
        if (TextUtils.isEmpty(string) || jSONObject == null) {
            wVCallBackContext.error("name为空");
            return false;
        } else if (d.b() == null) {
            return false;
        } else {
            Intent intent = new Intent(string);
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    intent.putExtra(key, (String) value);
                } else if (value instanceof Integer) {
                    intent.putExtra(key, (Integer) value);
                } else if (value instanceof Double) {
                    intent.putExtra(key, (Double) value);
                } else if (value instanceof JSONObject) {
                    intent.putExtra(key, (Serializable) value);
                }
            }
            wVCallBackContext.success();
            dqq.a(intent);
            return true;
        }
    }

    public static void a(final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca15efa5", new Object[]{wVCallBackContext});
        } else {
            i.a(new i.a() { // from class: com.taobao.android.behavir.util.bridge.UCPJSBridge.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.behavix.utils.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    try {
                        a.a();
                        WVCallBackContext.this.success();
                    } catch (Exception e) {
                        WVCallBackContext.this.error(e.getMessage());
                    }
                }
            });
        }
    }

    public static void b(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efa9f8a6", new Object[]{wVCallBackContext});
            return;
        }
        NativeDelegate.triggerServiceRequest(null);
        wVCallBackContext.success();
    }

    public static boolean applyLogLevelChange(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95b8a750", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null) {
            return false;
        }
        String string = parseObject.getString(WXConfig.logLevel);
        if (TextUtils.isEmpty(string)) {
            wVCallBackContext.error("logLevel can not be null");
            return false;
        }
        a.C0599a.a(string);
        wVCallBackContext.success();
        return true;
    }
}

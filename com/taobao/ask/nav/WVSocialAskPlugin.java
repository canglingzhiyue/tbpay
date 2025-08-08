package com.taobao.ask.nav;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ask.ASK_CONST;
import com.taobao.ask.AskToast;
import com.taobao.tao.log.TLog;
import tb.jyx;
import tb.kge;

/* loaded from: classes6.dex */
public class WVSocialAskPlugin extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(127799659);
    }

    public static /* synthetic */ Object ipc$super(WVSocialAskPlugin wVSocialAskPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        TLog.loge(ASK_CONST.LOG_TAG, "WVSocialAskPlugin:" + str + "," + str2);
        if ("openPublish".equals(str)) {
            openPublish(str2, wVCallBackContext);
            return true;
        } else if ("toast".equals(str)) {
            toast(str2, wVCallBackContext);
            return true;
        } else if (!"checkPublisherAvailable".equals(str)) {
            return false;
        } else {
            checkPublisherAvailable(str2, wVCallBackContext);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void openPublish(java.lang.String r11, android.taobao.windvane.jsbridge.WVCallBackContext r12) {
        /*
            r10 = this;
            java.lang.String r0 = "itemInfo"
            java.lang.String r1 = "ASK"
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.ask.nav.WVSocialAskPlugin.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            r4 = 0
            if (r3 == 0) goto L1c
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r4] = r10
            r1 = 1
            r0[r1] = r11
            r11 = 2
            r0[r11] = r12
            java.lang.String r11 = "814f9073"
            r2.ipc$dispatch(r11, r0)
            return
        L1c:
            if (r11 != 0) goto L20
            java.lang.String r11 = ""
        L20:
            com.alibaba.fastjson.JSONObject r11 = com.alibaba.fastjson.JSON.parseObject(r11)
            r2 = 0
            java.lang.String r3 = "https://h5.m.taobao.com/ask-everyone/publish.htm?"
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Exception -> L7a
            android.net.Uri$Builder r3 = r3.buildUpon()     // Catch: java.lang.Exception -> L7a
            java.util.Set r11 = r11.entrySet()     // Catch: java.lang.Exception -> L7a
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Exception -> L7a
            r5 = r2
            r6 = r5
        L39:
            boolean r7 = r11.hasNext()     // Catch: java.lang.Exception -> L78
            if (r7 == 0) goto L6b
            java.lang.Object r7 = r11.next()     // Catch: java.lang.Exception -> L78
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Exception -> L78
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Exception -> L78
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Exception -> L78
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Exception -> L78
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Exception -> L78
            java.lang.String r9 = "type"
            boolean r9 = r9.equals(r8)     // Catch: java.lang.Exception -> L78
            if (r9 == 0) goto L5f
            r5 = r7
        L5f:
            boolean r9 = r0.equals(r8)     // Catch: java.lang.Exception -> L78
            if (r9 == 0) goto L67
            r6 = r7
            goto L39
        L67:
            r3.appendQueryParameter(r8, r7)     // Catch: java.lang.Exception -> L78
            goto L39
        L6b:
            java.lang.String r11 = "callFromWindvane"
            java.lang.String r7 = "true"
            r3.appendQueryParameter(r11, r7)     // Catch: java.lang.Exception -> L78
            android.net.Uri r2 = r3.build()     // Catch: java.lang.Exception -> L78
            goto L98
        L78:
            r11 = move-exception
            goto L7d
        L7a:
            r11 = move-exception
            r5 = r2
            r6 = r5
        L7d:
            r11.printStackTrace()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "WVSocialAskPlugin openPublish error "
            r3.append(r7)
            java.lang.String r11 = r11.getMessage()
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            com.taobao.tao.log.TLog.loge(r1, r11)
        L98:
            android.util.Pair r11 = com.taobao.social.sdk.jsbridge.a.sureSessionId(r2)
            java.lang.Object r2 = r11.first
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r11 = r11.second
            android.net.Uri r11 = (android.net.Uri) r11
            com.taobao.social.sdk.jsbridge.a.registerListener(r2, r12)
            if (r11 == 0) goto Le9
            boolean r12 = android.text.StringUtils.isEmpty(r6)
            if (r12 != 0) goto Ldf
            java.lang.String r12 = "question"
            boolean r12 = r12.equals(r5)
            if (r12 == 0) goto Ldf
            com.alibaba.fastjson.JSONObject r12 = new com.alibaba.fastjson.JSONObject     // Catch: java.lang.Exception -> Ldb
            r12.<init>()     // Catch: java.lang.Exception -> Ldb
            com.alibaba.fastjson.JSONObject r1 = com.alibaba.fastjson.JSON.parseObject(r6)     // Catch: java.lang.Exception -> Ldb
            r12.put(r0, r1)     // Catch: java.lang.Exception -> Ldb
            com.taobao.ask.b r0 = com.taobao.ask.b.a()     // Catch: java.lang.Exception -> Ldb
            java.lang.String r12 = r0.a(r12)     // Catch: java.lang.Exception -> Ldb
            android.net.Uri$Builder r0 = r11.buildUpon()     // Catch: java.lang.Exception -> Ldb
            java.lang.String r1 = "cacheDataId"
            android.net.Uri$Builder r12 = r0.appendQueryParameter(r1, r12)     // Catch: java.lang.Exception -> Ldb
            android.net.Uri r11 = r12.build()     // Catch: java.lang.Exception -> Ldb
            goto Ldf
        Ldb:
            r12 = move-exception
            r12.printStackTrace()
        Ldf:
            android.content.Context r12 = r10.mContext
            com.taobao.android.nav.Nav r12 = com.taobao.android.nav.Nav.from(r12)
            r12.toUri(r11)
            return
        Le9:
            com.taobao.ask.ASK_CONST$ERROR r11 = com.taobao.ask.ASK_CONST.ERROR.INVALID_PARAMS
            com.alibaba.fastjson.JSONObject r11 = r11.toJSONObject()
            com.taobao.social.sdk.jsbridge.a.callback(r2, r4, r4, r11)
            java.lang.String r11 = "WVSocialAskPlugin openPublish failed"
            com.taobao.tao.log.TLog.loge(r1, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.ask.nav.WVSocialAskPlugin.openPublish(java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):void");
    }

    private void toast(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b96bc4b5", new Object[]{this, str, wVCallBackContext});
            return;
        }
        if (str == null) {
            str = "";
        }
        JSONObject parseObject = JSON.parseObject(str);
        String string = parseObject.getString("type");
        String string2 = parseObject.getString("imageUrl");
        String string3 = parseObject.getString("text");
        String string4 = parseObject.getString("androidDuration");
        float f = -1.0f;
        if (parseObject.containsKey("bottom")) {
            f = parseObject.getFloatValue("bottom");
        }
        boolean showToast = AskToast.showToast(this.mContext, string, string2, string3, f > 0.0f ? com.taobao.ask.utils.d.b(f) : f, "LONG".equals(string4) ? 1 : 0);
        r rVar = new r();
        rVar.a(showToast ? "HY_SUCCESS" : "HY_FAILED");
        if (showToast) {
            wVCallBackContext.success(rVar);
            TLog.loge(ASK_CONST.LOG_TAG, "WVSocialAskPlugin toast success");
            return;
        }
        wVCallBackContext.error(rVar);
        TLog.loge(ASK_CONST.LOG_TAG, "WVSocialAskPlugin toast failed");
    }

    private void checkPublisherAvailable(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d29063", new Object[]{this, str, wVCallBackContext});
            return;
        }
        if (str == null) {
            str = "";
        }
        JSONObject parseObject = JSON.parseObject(str);
        String string = parseObject.getString("type");
        String string2 = parseObject.getString("scene");
        if ("answer".equals(string) || "question".equals(string)) {
            boolean a2 = d.a(string, string2);
            r rVar = new r();
            rVar.a("HY_SUCCESS");
            rVar.a(jyx.a.POINT_NAME, Boolean.valueOf(a2));
            wVCallBackContext.success(rVar);
            return;
        }
        r rVar2 = new r();
        rVar2.a("HY_FAILED");
        rVar2.a("code", ASK_CONST.ERROR.INVALID_PARAMS.getCode());
        wVCallBackContext.error(rVar2);
    }
}

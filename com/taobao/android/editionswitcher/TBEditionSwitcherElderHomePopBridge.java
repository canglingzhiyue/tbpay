package com.taobao.android.editionswitcher;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import tb.ghj;
import tb.gho;
import tb.ghp;
import tb.kge;

/* loaded from: classes5.dex */
public class TBEditionSwitcherElderHomePopBridge extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_SETTING_RECEIVER = "com.taobao.option.checkoption";
    private static final String PAGE_HOME = "Page_Home";
    private static final String TAG = "EditionPositionSwitcher";

    static {
        kge.a(1753323615);
    }

    public static /* synthetic */ Object ipc$super(TBEditionSwitcherElderHomePopBridge tBEditionSwitcherElderHomePopBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        TLog.logd("Edition_Switcher", "TBEditionSwitcherElderHomePopBridge; bridge: action" + str + "params:" + str2);
        if ("enterElderHome".equals(str)) {
            return enterElderHome(str2, wVCallBackContext);
        }
        if ("exitElderHome".equals(str)) {
            return exitElderHome(str2, wVCallBackContext);
        }
        r rVar = new r();
        rVar.a("errorMsg", "no matched method");
        wVCallBackContext.error(rVar);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean enterElderHome(java.lang.String r9, android.taobao.windvane.jsbridge.WVCallBackContext r10) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.editionswitcher.TBEditionSwitcherElderHomePopBridge.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1f
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r8
            r1[r4] = r9
            r1[r2] = r10
            java.lang.String r9 = "e4240423"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L1f:
            com.taobao.android.revisionswitch.TBRevisionSwitchManager r0 = com.taobao.android.revisionswitch.TBRevisionSwitchManager.i()
            java.lang.String r1 = "elderHome"
            java.lang.String r0 = r0.c(r1)
            java.lang.String r1 = "1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L32
            return r4
        L32:
            java.lang.String r0 = "unknown"
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto L5d
            com.alibaba.fastjson.JSONObject r9 = com.alibaba.fastjson.JSONObject.parseObject(r9)     // Catch: java.lang.Exception -> L5d
            java.lang.String r1 = "backHome"
            java.lang.String r1 = r9.getString(r1)     // Catch: java.lang.Exception -> L5d
            java.lang.String r5 = "true"
            boolean r1 = r5.equals(r1)     // Catch: java.lang.Exception -> L5d
            java.lang.String r5 = "source"
            java.lang.String r9 = r9.getString(r5)     // Catch: java.lang.Exception -> L5b
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L5b
            if (r5 != 0) goto L5e
            r0 = r9
            goto L5e
        L5b:
            goto L5e
        L5d:
            r1 = 0
        L5e:
            tb.ghj r9 = tb.ghj.a()
            java.lang.String r5 = "ElderHomePopBridge"
            tb.ghj r9 = r9.a(r5)
            tb.ghp r5 = tb.ghp.a()
            java.lang.String r6 = "elder_version"
            tb.ghp r5 = r5.c(r6)
            java.lang.String r7 = "switcherVersion"
            tb.ghp r5 = r5.a(r7, r6)
            tb.ghj r9 = r9.a(r5)
            com.taobao.android.editionswitcher.core.b r5 = com.taobao.android.editionswitcher.core.b.a()
            tb.gho r6 = new tb.gho
            java.lang.String r7 = "triggerRequest"
            r6.<init>(r7)
            r5.a(r9, r6)
            if (r1 == 0) goto L99
            android.content.Context r9 = r8.mContext
            com.taobao.android.nav.Nav r9 = com.taobao.android.nav.Nav.from(r9)
            java.lang.String r1 = "http://m.taobao.com/index.htm"
            r9.toUri(r1)
        L99:
            r9 = 2101(0x835, float:2.944E-42)
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.String r2 = "action=enterElderHome"
            r1[r3] = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "source="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1[r4] = r2
            java.lang.String r2 = "Page_Home"
            java.lang.String r3 = "button-elder—change"
            commitEvent(r2, r9, r3, r1)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "action=enterElderHome,source="
            r9.append(r1)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "EditionPositionSwitcher"
            com.taobao.tao.log.TLog.loge(r2, r0, r9)
            r10.success()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.editionswitcher.TBEditionSwitcherElderHomePopBridge.enterElderHome(java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }

    private boolean exitElderHome(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9a9e01d", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (!isElder()) {
            return true;
        }
        String str2 = "unknown";
        if (!TextUtils.isEmpty(str)) {
            try {
                String string = JSONObject.parseObject(str).getString("source");
                if (!TextUtils.isEmpty(str2)) {
                    str2 = string;
                }
            } catch (Exception unused) {
            }
        }
        Intent intent = new Intent(ACTION_SETTING_RECEIVER);
        intent.putExtra("TaoOptionKey", "switcherVersion");
        intent.putExtra("switcherVersion", "standard_version");
        LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(intent);
        com.taobao.android.editionswitcher.core.b.a().a(ghj.a().a("ElderHomePopBridge").a(ghp.a().c("standard_version").a("switcherVersion", "standard_version")), new gho(com.taobao.android.editionswitcher.core.b.TRIGGER_REQUEST));
        commitEvent("Page_Home", 2101, "button-elder—change", "action=exitElderHome", "source=" + str2);
        TLog.loge("Page_Home", TAG, "action=exitElderHome,source=" + str2);
        wVCallBackContext.success();
        return true;
    }

    public static void commitEvent(String str, int i, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb96d94", new Object[]{str, new Integer(i), obj, strArr});
            return;
        }
        try {
            TBS.Ext.commitEvent(str, i, obj, null, null, strArr);
        } catch (Exception unused) {
        }
    }

    private boolean isElder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f4e0938b", new Object[]{this})).booleanValue() : "1".equals(TBRevisionSwitchManager.i().c("elderHome"));
    }
}

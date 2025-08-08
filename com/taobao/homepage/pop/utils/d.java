package com.taobao.homepage.pop.utils;

import mtopsdk.common.util.StringUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.AlarmObject;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)}) : i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN_EVENT" : "PopViewBack" : "PopViewEnter" : "PopViewRemoveByDataRefresh" : "PopViewTimeFinish" : "PopViewCancel" : "PopViewConfirm";
    }

    public static String a(boolean z, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("93d7d869", new Object[]{new Boolean(z), new Integer(i)}) : z ? i != 1 ? (i == 3 || i == 4) ? "PopViewResumeByTabSwitch" : "PopViewResumeByPageSwitch" : "PopViewResumeByPopLayer" : i != 1 ? (i == 3 || i == 4) ? "PopViewPauseByTabSwitch" : "PopViewPauseByPageSwitch" : "PopViewPauseByPopLayer";
    }

    public static void a(String str, IPopData iPopData) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5713a94e", new Object[]{str, iPopData});
        } else if (StringUtils.isEmpty(str) || iPopData == null || iPopData.isResetShowCount()) {
        } else {
            String businessID = iPopData.getBusinessID();
            AlarmObject alarmObject = new AlarmObject();
            alarmObject.module = "Page_Home";
            alarmObject.modulePoint = "pop_monitor";
            if (iPopData.getUCPConfig() != null && iPopData.getUCPConfig().enable()) {
                z = true;
            }
            alarmObject.arg = a(str, businessID, z);
            alarmObject.isSuccess = true;
            AppMonitor.getInstance().commitAlarm(alarmObject);
            c.a("monitor success", "point=" + str + ", businessId=" + businessID);
        }
    }

    public static void a(String str, IPopData iPopData, String str2, String str3) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1b8cf62", new Object[]{str, iPopData, str2, str3});
        } else if (StringUtils.isEmpty(str) || iPopData == null || iPopData.isResetShowCount()) {
        } else {
            String businessID = iPopData.getBusinessID();
            AlarmObject alarmObject = new AlarmObject();
            alarmObject.module = "Page_Home";
            alarmObject.modulePoint = "pop_monitor";
            if (iPopData.getUCPConfig() == null || !iPopData.getUCPConfig().enable()) {
                z = false;
            }
            alarmObject.arg = a(str, businessID, z);
            alarmObject.isSuccess = false;
            alarmObject.errorCode = str2;
            alarmObject.errorMsg = str3;
            AppMonitor.getInstance().commitAlarm(alarmObject);
            c.a("monitor failed", "point=" + str + ", businessId=" + businessID);
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            return;
        }
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "Page_Home";
        alarmObject.modulePoint = "pop_monitor";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", (Object) str);
        jSONObject.put("businessId", (Object) str2);
        jSONObject.put("code", (Object) str3);
        jSONObject.put("msg", (Object) str4);
        alarmObject.arg = jSONObject.toJSONString();
        alarmObject.isSuccess = true;
        AppMonitor.getInstance().commitAlarm(alarmObject);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "Page_Home";
        alarmObject.modulePoint = "pop_monitor";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", (Object) "UcpSendEvent");
        jSONObject.put("actionType", (Object) str);
        jSONObject.put("actionName", (Object) str2);
        alarmObject.arg = jSONObject.toJSONString();
        alarmObject.isSuccess = true;
        AppMonitor.getInstance().commitAlarm(alarmObject);
    }

    public static void b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb13311", new Object[]{str, str2, str3, str4});
            return;
        }
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "Page_Home";
        alarmObject.modulePoint = "pop_monitor";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", (Object) str);
        jSONObject.put("businessId", (Object) str2);
        jSONObject.put("code", (Object) str3);
        jSONObject.put("msg", (Object) str4);
        alarmObject.arg = jSONObject.toJSONString();
        alarmObject.isSuccess = false;
        alarmObject.errorCode = str3;
        alarmObject.errorMsg = str4;
        AppMonitor.getInstance().commitAlarm(alarmObject);
    }

    private static String a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91186ac8", new Object[]{str, str2, new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("businessId", (Object) str2);
        jSONObject.put("stage", (Object) str);
        jSONObject.put("isUcp", (Object) Boolean.valueOf(z));
        return jSONObject.toJSONString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
        if (r4.equals("cancel") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.homepage.pop.utils.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r4
            java.lang.String r4 = "9f352ae"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L15:
            r0 = -1
            int r1 = r4.hashCode()
            switch(r1) {
                case -1607243192: goto L80;
                case -1367724422: goto L77;
                case -935651083: goto L6c;
                case -907680051: goto L61;
                case -906021636: goto L56;
                case 106069776: goto L4a;
                case 951117504: goto L40;
                case 1282360109: goto L35;
                case 1340673488: goto L29;
                case 1842531918: goto L1f;
                default: goto L1d;
            }
        L1d:
            goto L8a
        L1f:
            java.lang.String r1 = "netWork"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L8a
            r2 = 5
            goto L8b
        L29:
            java.lang.String r1 = "refreshCardView"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L8a
            r2 = 8
            goto L8b
        L35:
            java.lang.String r1 = "removePop"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L8a
            r2 = 6
            goto L8b
        L40:
            java.lang.String r1 = "confirm"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L8a
            r2 = 1
            goto L8b
        L4a:
            java.lang.String r1 = "other"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L8a
            r2 = 9
            goto L8b
        L56:
            java.lang.String r1 = "select"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L8a
            r2 = 3
            goto L8b
        L61:
            java.lang.String r1 = "scroll"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L8a
            r2 = 7
            goto L8b
        L6c:
            java.lang.String r1 = "unSelect"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L8a
            r2 = 4
            goto L8b
        L77:
            java.lang.String r1 = "cancel"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L8a
            goto L8b
        L80:
            java.lang.String r1 = "endTime"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L8a
            r2 = 2
            goto L8b
        L8a:
            r2 = -1
        L8b:
            switch(r2) {
                case 0: goto Lac;
                case 1: goto La9;
                case 2: goto La6;
                case 3: goto La3;
                case 4: goto La0;
                case 5: goto L9d;
                case 6: goto L9a;
                case 7: goto L97;
                case 8: goto L94;
                case 9: goto L91;
                default: goto L8e;
            }
        L8e:
            java.lang.String r4 = "UNKNOWN_MESSAGE"
            return r4
        L91:
            java.lang.String r4 = "MESSAGE_TYPE_OTHER"
            return r4
        L94:
            java.lang.String r4 = "MESSAGE_TYPE_REFRESH_VIEW"
            return r4
        L97:
            java.lang.String r4 = "MESSAGE_TYPE_SCROLL"
            return r4
        L9a:
            java.lang.String r4 = "MESSAGE_TYPE_REMOVE_POP_VIEW"
            return r4
        L9d:
            java.lang.String r4 = "PopViewReqSendSuccess"
            return r4
        La0:
            java.lang.String r4 = "PopViewBack"
            return r4
        La3:
            java.lang.String r4 = "PopViewEnter"
            return r4
        La6:
            java.lang.String r4 = "PopViewTimeFinish"
            return r4
        La9:
            java.lang.String r4 = "PopViewConfirm"
            return r4
        Lac:
            java.lang.String r4 = "PopViewCancel"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.homepage.pop.utils.d.a(java.lang.String):java.lang.String");
    }
}

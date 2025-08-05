package com.taobao.calendar.bridge.jsbridge;

import android.content.Context;
import android.os.RemoteException;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.calendar.bridge.listener.CalendarListener;
import com.taobao.calendar.bridge.model.ScheduleDTOModule;
import com.taobao.calendar.exception.CalendarResult;
import com.taobao.calendar.permission.LifePermissionFragment;
import com.taobao.calendar.permission.a;
import org.json.JSONException;
import tb.kff;
import tb.kfn;
import tb.kge;

/* loaded from: classes6.dex */
public class CalendarJsBridge extends e {
    public static final String PLUGIN_NAME = "TBCalendar";

    static {
        kge.a(-78093595);
    }

    private void addCalendarPlan(WVCallBackContext wVCallBackContext, String str) {
        JSONObject parseObject = JSONObject.parseObject(str);
        if (parseObject == null) {
            wVCallBackContext.error(getFailedData(CalendarResult.KTCALENDAR_INVALID_PARAM.getCode(), CalendarResult.KTCALENDAR_INVALID_PARAM.getMessage()));
        }
        ScheduleDTOModule a2 = kfn.a(parseObject);
        if (a2 == null) {
            wVCallBackContext.error(getFailedData(CalendarResult.KTCALENDAR_INVALID_PARAM.getCode(), CalendarResult.KTCALENDAR_INVALID_PARAM.getMessage()));
        }
        kff a3 = kff.a();
        if (a3 != null) {
            addQueryListener(a3, wVCallBackContext);
            a3.a(a2);
        }
    }

    private void addQueryListener(kff kffVar, final WVCallBackContext wVCallBackContext) {
        if (kffVar != null) {
            kffVar.a(new CalendarListener.Stub() { // from class: com.taobao.calendar.bridge.jsbridge.CalendarJsBridge.2
                @Override // com.taobao.calendar.bridge.listener.CalendarListener
                public void onError(String str, String str2) throws RemoteException {
                    wVCallBackContext.error(CalendarJsBridge.this.getFailedData(str, str2));
                }

                @Override // com.taobao.calendar.bridge.listener.CalendarListener
                public void onSuccess(boolean z, String str) throws RemoteException {
                    if (z) {
                        wVCallBackContext.success(str);
                    } else {
                        wVCallBackContext.error(CalendarJsBridge.this.getFailedData(CalendarResult.KTCALENDAR_INVALID_PARAM.getCode(), CalendarResult.KTCALENDAR_INVALID_PARAM.getMessage()));
                    }
                }
            });
        }
    }

    private void cancelCalendarPlan(WVCallBackContext wVCallBackContext, String str) {
        r failedData;
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null) {
            failedData = getFailedData(CalendarResult.KTCALENDAR_INVALID_PARAM.getCode(), CalendarResult.KTCALENDAR_INVALID_PARAM.getMessage());
        } else {
            try {
                String string = parseObject.getString("bizId");
                String string2 = parseObject.getString("outId");
                kff a2 = kff.a();
                if (a2 == null) {
                    return;
                }
                addQueryListener(a2, wVCallBackContext);
                a2.a(string, string2);
                return;
            } catch (Exception unused) {
                failedData = getFailedData(CalendarResult.KTCALENDAR_INVALID_PARAM.getCode(), CalendarResult.KTCALENDAR_INVALID_PARAM.getMessage(), null, null);
            }
        }
        wVCallBackContext.error(failedData);
    }

    private void checkCalendarPlanIsExist(WVCallBackContext wVCallBackContext, String str) {
        if (TextUtils.isEmpty(str) || wVCallBackContext == null) {
            wVCallBackContext.error(getFailedData(CalendarResult.KTCALENDAR_INVALID_PARAM.getCode(), CalendarResult.KTCALENDAR_INVALID_PARAM.getMessage()));
            return;
        }
        JSONArray jSONArray = null;
        try {
            jSONArray = JSON.parseObject(str).getJSONArray("calendarPlanList");
        } catch (Exception e) {
            wVCallBackContext.error(getFailedData(CalendarResult.KTCALENDAR_INVALID_PARAM.getCode(), e.getMessage()));
        }
        if (jSONArray == null || jSONArray.isEmpty()) {
            wVCallBackContext.error(getFailedData(CalendarResult.KTCALENDAR_INVALID_PARAM.getCode(), CalendarResult.KTCALENDAR_INVALID_PARAM.getMessage()));
            return;
        }
        kff a2 = kff.a();
        addQueryListener(a2, wVCallBackContext);
        a2.a(str);
    }

    private void checkPermission(String str, String str2, WVCallBackContext wVCallBackContext, a aVar) {
        Context context;
        if (wVCallBackContext.getWebview() == null || (context = wVCallBackContext.getWebview().getContext()) == null || !(context instanceof FragmentActivity)) {
            return;
        }
        boolean z = false;
        boolean z2 = ContextCompat.checkSelfPermission(context, "android.permission.WRITE_CALENDAR") == 0;
        if ("checkCalendarPermission".equals(str)) {
            JSONObject jSONObject = new JSONObject();
            if (z2) {
                jSONObject.put("status", (Object) "1");
                wVCallBackContext.success(jSONObject.toJSONString());
                return;
            }
            jSONObject.put("status", (Object) "0");
            wVCallBackContext.error(jSONObject.toJSONString());
        } else if (z2) {
            excuteAction(str, str2, wVCallBackContext);
        } else {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    JSONObject parseObject = JSONObject.parseObject(str2);
                    if (parseObject != null) {
                        z = parseObject.getBooleanValue("checkOnce");
                    }
                } catch (Throwable unused) {
                }
            }
            LifePermissionFragment lifePermissionFragment = new LifePermissionFragment();
            lifePermissionFragment.setCheckOnce(z);
            lifePermissionFragment.setPermissionLisener(aVar);
            ((FragmentActivity) context).getSupportFragmentManager().beginTransaction().add(lifePermissionFragment, LifePermissionFragment.TAG).commitAllowingStateLoss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void excuteAction(String str, String str2, WVCallBackContext wVCallBackContext) {
        if ("addCalendarPlan".equals(str)) {
            addCalendarPlan(wVCallBackContext, str2);
        } else if ("cancelCalendarPlan".equals(str)) {
            cancelCalendarPlan(wVCallBackContext, str2);
        } else if (!"checkCalendarPlanIsExist".equals(str)) {
        } else {
            checkCalendarPlanIsExist(wVCallBackContext, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r getFailedData(String str, String str2) {
        return getFailedData(str, str2, "", "");
    }

    private r getFailedData(String str, String str2, String str3, String str4) {
        r rVar = new r();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errCode", str);
            jSONObject.put("errMsg", str2);
            jSONObject.put("bizId", str3);
            jSONObject.put("outId", str4);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        rVar.a(jSONObject);
        return rVar;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(final String str, final String str2, final WVCallBackContext wVCallBackContext) {
        checkPermission(str, str2, wVCallBackContext, new a() { // from class: com.taobao.calendar.bridge.jsbridge.CalendarJsBridge.1
            @Override // com.taobao.calendar.permission.a
            public void a() {
                CalendarJsBridge.this.excuteAction(str, str2, wVCallBackContext);
            }

            @Override // com.taobao.calendar.permission.a
            public void b() {
                wVCallBackContext.error(CalendarJsBridge.this.getFailedData(CalendarResult.kTCALENDAR_NO_PERMISSION.getCode(), CalendarResult.kTCALENDAR_NO_PERMISSION.getMessage()));
            }
        });
        return true;
    }
}

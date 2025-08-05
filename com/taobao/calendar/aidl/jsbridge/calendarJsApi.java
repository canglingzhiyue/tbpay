package com.taobao.calendar.aidl.jsbridge;

import android.content.Intent;
import android.os.RemoteException;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.calendar.aidl.business.CalendarAidlAdapter;
import com.taobao.calendar.aidl.listener.CalendarListener;
import com.taobao.calendar.aidl.model.ScheduleDTO;
import org.json.JSONException;

/* loaded from: classes6.dex */
public class calendarJsApi extends e {
    public static final String BROADCAST_ACTIVITY = "Broadcast_Activity";

    private ScheduleDTO getScheduleDOFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("eventId");
            String string2 = jSONObject.getString("sourceId");
            String string3 = jSONObject.getString("title");
            String string4 = jSONObject.getString("startTime");
            String string5 = jSONObject.getString("endTime");
            String string6 = jSONObject.getString("link");
            String string7 = jSONObject.getString("remind");
            String string8 = jSONObject.getString("description");
            if (!TextUtils.isEmpty(string4) && !TextUtils.isEmpty(string5)) {
                String string9 = jSONObject.getString("isAllDay");
                ScheduleDTO scheduleDTO = new ScheduleDTO();
                scheduleDTO.setEventId(string);
                scheduleDTO.setSourceId(Integer.valueOf(string2).intValue());
                scheduleDTO.setTitle(string3);
                if (!TextUtils.isEmpty(string4)) {
                    scheduleDTO.setStartTime(string4);
                }
                if (!TextUtils.isEmpty(string5)) {
                    scheduleDTO.setEndTime(string5);
                }
                scheduleDTO.setLink(string6);
                scheduleDTO.setDescription(string8);
                setRemindTime(scheduleDTO, string7);
                if (!TextUtils.isEmpty(string9) && !TextUtils.equals("0", string9)) {
                    scheduleDTO.setIsallday(1);
                    return scheduleDTO;
                }
                scheduleDTO.setIsallday(0);
                return scheduleDTO;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private void setRemindTime(ScheduleDTO scheduleDTO, String str) {
        int i;
        if (TextUtils.isEmpty(str) || !TextUtils.isDigitsOnly(str)) {
            scheduleDTO.setRemind(600);
            return;
        }
        try {
            i = Integer.valueOf(str).intValue();
        } catch (Exception unused) {
            i = 600;
        }
        if (i > 0) {
            scheduleDTO.setRemind(i);
        } else {
            scheduleDTO.setRemind(600);
        }
    }

    private boolean validateSchedule(ScheduleDTO scheduleDTO) {
        return scheduleDTO != null && !TextUtils.isEmpty(scheduleDTO.getEventId()) && scheduleDTO.getSourceId() > 0 && !TextUtils.isEmpty(scheduleDTO.getLink());
    }

    @WindVaneInterface
    public void addCalendarPlan(final WVCallBackContext wVCallBackContext, String str) {
        ScheduleDTO scheduleDOFromJson = getScheduleDOFromJson(JSONObject.parseObject(str));
        if (!validateSchedule(scheduleDOFromJson)) {
            wVCallBackContext.error();
            return;
        }
        CalendarAidlAdapter calendarAidlAdapter = CalendarAidlAdapter.getInstance();
        if (calendarAidlAdapter == null) {
            wVCallBackContext.error();
            return;
        }
        calendarAidlAdapter.registerListener(new CalendarListener.Stub() { // from class: com.taobao.calendar.aidl.jsbridge.calendarJsApi.8
            @Override // com.taobao.calendar.aidl.listener.CalendarListener
            public void onError(String str2, String str3) throws RemoteException {
                wVCallBackContext.error();
            }

            @Override // com.taobao.calendar.aidl.listener.CalendarListener
            public void onSuccess(boolean z, String str2, String[] strArr) throws RemoteException {
                wVCallBackContext.success();
            }
        });
        calendarAidlAdapter.setReminder(scheduleDOFromJson);
    }

    @WindVaneInterface
    public void addCalendarPlanByBatch(WVCallBackContext wVCallBackContext, String str) {
        if (TextUtils.isEmpty(str)) {
            wVCallBackContext.error();
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            if (parseObject == null) {
                return;
            }
            JSONArray jSONArray = parseObject.getJSONArray("data");
            CalendarAidlAdapter calendarAidlAdapter = CalendarAidlAdapter.getInstance();
            if (jSONArray == null || jSONArray.size() <= 0 || calendarAidlAdapter == null) {
                wVCallBackContext.error();
                return;
            }
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                final JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("eventId", (Object) jSONObject.getString("eventId"));
                jSONObject2.put("sourceId", (Object) jSONObject.getString("sourceId"));
                ScheduleDTO scheduleDOFromJson = getScheduleDOFromJson(jSONObject);
                if (validateSchedule(scheduleDOFromJson)) {
                    calendarAidlAdapter.registerListener(new CalendarListener.Stub() { // from class: com.taobao.calendar.aidl.jsbridge.calendarJsApi.9
                        @Override // com.taobao.calendar.aidl.listener.CalendarListener
                        public void onError(String str2, String str3) throws RemoteException {
                            jSONObject2.put("success", (Object) "false");
                        }

                        @Override // com.taobao.calendar.aidl.listener.CalendarListener
                        public void onSuccess(boolean z, String str2, String[] strArr) throws RemoteException {
                            jSONObject2.put("success", (Object) "true");
                        }
                    });
                    calendarAidlAdapter.setReminder(scheduleDOFromJson);
                } else {
                    jSONObject2.put("success", (Object) "false");
                }
                jSONArray2.put(jSONObject2);
            }
            if (jSONArray2.length() <= 0) {
                wVCallBackContext.error();
                return;
            }
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("result", jSONArray2);
            r rVar = new r();
            rVar.a(jSONObject3);
            wVCallBackContext.success(rVar);
        } catch (Exception unused) {
            wVCallBackContext.error();
        }
    }

    @WindVaneInterface
    public void cancelCalendarPlan(final WVCallBackContext wVCallBackContext, String str) {
        JSONObject parseObject = JSONObject.parseObject(str);
        if (parseObject == null) {
            wVCallBackContext.error();
            return;
        }
        try {
            String string = parseObject.getString("eventId");
            int intValue = Integer.valueOf(parseObject.getString("sourceId")).intValue();
            CalendarAidlAdapter calendarAidlAdapter = CalendarAidlAdapter.getInstance();
            if (calendarAidlAdapter == null) {
                wVCallBackContext.error();
                return;
            }
            calendarAidlAdapter.registerListener(new CalendarListener.Stub() { // from class: com.taobao.calendar.aidl.jsbridge.calendarJsApi.1
                @Override // com.taobao.calendar.aidl.listener.CalendarListener
                public void onError(String str2, String str3) throws RemoteException {
                    wVCallBackContext.error();
                }

                @Override // com.taobao.calendar.aidl.listener.CalendarListener
                public void onSuccess(boolean z, String str2, String[] strArr) throws RemoteException {
                    if (z) {
                        wVCallBackContext.success();
                    } else {
                        wVCallBackContext.error();
                    }
                }
            });
            calendarAidlAdapter.cancelReminder(intValue, string);
        } catch (Exception unused) {
            wVCallBackContext.error();
        }
    }

    @WindVaneInterface
    public void cancelCalendarPlanByBatch(WVCallBackContext wVCallBackContext, String str) {
        if (TextUtils.isEmpty(str)) {
            wVCallBackContext.error();
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            if (parseObject == null) {
                return;
            }
            JSONArray jSONArray = parseObject.getJSONArray("data");
            CalendarAidlAdapter calendarAidlAdapter = CalendarAidlAdapter.getInstance();
            if (jSONArray == null || jSONArray.size() <= 0 || calendarAidlAdapter == null) {
                wVCallBackContext.error();
                return;
            }
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                final JSONObject jSONObject2 = new JSONObject();
                String string = jSONObject.getString("eventId");
                String string2 = jSONObject.getString("sourceId");
                int intValue = Integer.valueOf(string2).intValue();
                jSONObject2.put("eventId", (Object) string);
                jSONObject2.put("sourceId", (Object) string2);
                calendarAidlAdapter.registerListener(new CalendarListener.Stub() { // from class: com.taobao.calendar.aidl.jsbridge.calendarJsApi.2
                    @Override // com.taobao.calendar.aidl.listener.CalendarListener
                    public void onError(String str2, String str3) throws RemoteException {
                        jSONObject2.put("success", (Object) "false");
                    }

                    @Override // com.taobao.calendar.aidl.listener.CalendarListener
                    public void onSuccess(boolean z, String str2, String[] strArr) throws RemoteException {
                        jSONObject2.put("success", (Object) "true");
                    }
                });
                calendarAidlAdapter.cancelReminder(intValue, string);
                jSONArray2.put(jSONObject2);
            }
            if (jSONArray2.length() <= 0) {
                wVCallBackContext.error();
                return;
            }
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("result", jSONArray2);
            r rVar = new r();
            rVar.a(jSONObject3);
            wVCallBackContext.success(rVar);
        } catch (Exception unused) {
            wVCallBackContext.error();
        }
    }

    @WindVaneInterface
    public void checkCalendarPlanIsExist(final WVCallBackContext wVCallBackContext, String str) {
        JSONObject parseObject = JSONObject.parseObject(str);
        if (parseObject == null) {
            wVCallBackContext.error();
            return;
        }
        try {
            String string = parseObject.getString("eventId");
            int intValue = Integer.valueOf(parseObject.getString("sourceId")).intValue();
            CalendarAidlAdapter calendarAidlAdapter = CalendarAidlAdapter.getInstance();
            if (calendarAidlAdapter == null) {
                wVCallBackContext.error();
                return;
            }
            calendarAidlAdapter.registerListener(new CalendarListener.Stub() { // from class: com.taobao.calendar.aidl.jsbridge.calendarJsApi.3
                @Override // com.taobao.calendar.aidl.listener.CalendarListener
                public void onError(String str2, String str3) throws RemoteException {
                    wVCallBackContext.error();
                }

                @Override // com.taobao.calendar.aidl.listener.CalendarListener
                public void onSuccess(boolean z, String str2, String[] strArr) throws RemoteException {
                    if (z) {
                        wVCallBackContext.success();
                    } else {
                        wVCallBackContext.error();
                    }
                }
            });
            calendarAidlAdapter.checkReminderExist(intValue, string);
        } catch (Exception unused) {
            wVCallBackContext.error();
        }
    }

    @WindVaneInterface
    public void checkCalendarPlanIsExistByBatch(WVCallBackContext wVCallBackContext, String str) {
        if (TextUtils.isEmpty(str)) {
            wVCallBackContext.error();
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            if (parseObject == null) {
                return;
            }
            JSONArray jSONArray = parseObject.getJSONArray("data");
            CalendarAidlAdapter calendarAidlAdapter = CalendarAidlAdapter.getInstance();
            if (jSONArray == null || jSONArray.size() <= 0 || calendarAidlAdapter == null) {
                wVCallBackContext.error();
                return;
            }
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                final JSONObject jSONObject2 = new JSONObject();
                String string = jSONObject.getString("eventId");
                String string2 = jSONObject.getString("sourceId");
                int intValue = Integer.valueOf(string2).intValue();
                jSONObject2.put("eventId", (Object) string);
                jSONObject2.put("sourceId", (Object) string2);
                calendarAidlAdapter.registerListener(new CalendarListener.Stub() { // from class: com.taobao.calendar.aidl.jsbridge.calendarJsApi.4
                    @Override // com.taobao.calendar.aidl.listener.CalendarListener
                    public void onError(String str2, String str3) throws RemoteException {
                        jSONObject2.put("success", (Object) "false");
                    }

                    @Override // com.taobao.calendar.aidl.listener.CalendarListener
                    public void onSuccess(boolean z, String str2, String[] strArr) throws RemoteException {
                        jSONObject2.put("success", (Object) Boolean.valueOf(z));
                    }
                });
                calendarAidlAdapter.checkReminderExist(intValue, string);
                jSONArray2.put(jSONObject2);
            }
            if (jSONArray2.length() <= 0) {
                wVCallBackContext.error();
                return;
            }
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("result", jSONArray2);
            r rVar = new r();
            rVar.a(jSONObject3);
            wVCallBackContext.success(rVar);
        } catch (Exception unused) {
            wVCallBackContext.error();
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        if ("setRemindFinish".equals(str)) {
            setRemindFinish(wVCallBackContext, str2);
            return true;
        } else if ("addCalendarPlan".equals(str)) {
            addCalendarPlan(wVCallBackContext, str2);
            return true;
        } else if ("cancelCalendarPlan".equals(str)) {
            cancelCalendarPlan(wVCallBackContext, str2);
            return true;
        } else if ("checkCalendarPlanIsExist".equals(str)) {
            checkCalendarPlanIsExist(wVCallBackContext, str2);
            return true;
        } else if ("getCalendarPlansBySourceId".equals(str)) {
            getReminds(wVCallBackContext, str2);
            return true;
        } else if ("addCalendarPlanByBatch".equals(str)) {
            addCalendarPlanByBatch(wVCallBackContext, str2);
            return true;
        } else if ("cancelCalendarPlanByBatch".equals(str)) {
            cancelCalendarPlanByBatch(wVCallBackContext, str2);
            return true;
        } else if ("checkCalendarPlanIsExistByBatch".equals(str)) {
            checkCalendarPlanIsExistByBatch(wVCallBackContext, str2);
            return true;
        } else if ("queryRemindList".equals(str)) {
            queryRemindList(wVCallBackContext, str2);
            return true;
        } else if (!"queryRemindCount".equals(str)) {
            return false;
        } else {
            queryRemindCount(wVCallBackContext, str2);
            return true;
        }
    }

    @WindVaneInterface
    public void getReminds(final WVCallBackContext wVCallBackContext, String str) {
        JSONObject parseObject = JSONObject.parseObject(str);
        if (parseObject == null) {
            return;
        }
        try {
            int intValue = Integer.valueOf(parseObject.getString("sourceId")).intValue();
            String string = parseObject.getString("startDate");
            String string2 = parseObject.getString("endDate");
            String string3 = parseObject.getString("order");
            CalendarAidlAdapter calendarAidlAdapter = CalendarAidlAdapter.getInstance();
            if (calendarAidlAdapter == null) {
                wVCallBackContext.error();
                return;
            }
            calendarAidlAdapter.registerListener(new CalendarListener.Stub() { // from class: com.taobao.calendar.aidl.jsbridge.calendarJsApi.5
                @Override // com.taobao.calendar.aidl.listener.CalendarListener
                public void onError(String str2, String str3) throws RemoteException {
                    wVCallBackContext.error();
                }

                @Override // com.taobao.calendar.aidl.listener.CalendarListener
                public void onSuccess(boolean z, String str2, String[] strArr) throws RemoteException {
                    wVCallBackContext.success();
                }
            });
            calendarAidlAdapter.getReminds(intValue, string, string2, string3);
        } catch (Exception unused) {
            wVCallBackContext.error();
        }
    }

    @WindVaneInterface
    public void queryRemindCount(WVCallBackContext wVCallBackContext, String str) {
        try {
            CalendarAidlAdapter calendarAidlAdapter = CalendarAidlAdapter.getInstance();
            final org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (calendarAidlAdapter == null) {
                wVCallBackContext.error();
                return;
            }
            calendarAidlAdapter.registerListener(new CalendarListener.Stub() { // from class: com.taobao.calendar.aidl.jsbridge.calendarJsApi.7
                @Override // com.taobao.calendar.aidl.listener.CalendarListener
                public void onError(String str2, String str3) throws RemoteException {
                    try {
                        jSONObject.put("success", "false");
                        org.json.JSONObject jSONObject2 = jSONObject;
                        jSONObject2.put("errorMsg", str2 + "||" + str3);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }

                @Override // com.taobao.calendar.aidl.listener.CalendarListener
                public void onSuccess(boolean z, String str2, String[] strArr) throws RemoteException {
                    try {
                        if (strArr == null) {
                            jSONObject.put("success", "false");
                            jSONObject.put("errorMsg", "result data is null");
                            return;
                        }
                        jSONObject.put("success", "true");
                        JSONObject jSONObject2 = new JSONObject();
                        new JSONObject();
                        int i = 0;
                        for (String str3 : strArr) {
                            JSONObject parseObject = JSONObject.parseObject(str3);
                            if (parseObject != null) {
                                jSONObject2.put(parseObject.getString("key"), (Object) parseObject.getString("value"));
                                i += parseObject.getIntValue("count");
                            }
                        }
                        jSONObject.put("datas", jSONObject2);
                        jSONObject.put("totalCount", i);
                    } catch (Exception unused) {
                    }
                }
            });
            calendarAidlAdapter.queryAllRemindsCount(str);
            r rVar = new r();
            rVar.a(jSONObject);
            wVCallBackContext.success(rVar);
        } catch (Exception unused) {
            wVCallBackContext.error();
        }
    }

    @WindVaneInterface
    public void queryRemindList(WVCallBackContext wVCallBackContext, String str) {
        try {
            CalendarAidlAdapter calendarAidlAdapter = CalendarAidlAdapter.getInstance();
            final org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (calendarAidlAdapter == null) {
                wVCallBackContext.error();
                return;
            }
            calendarAidlAdapter.registerListener(new CalendarListener.Stub() { // from class: com.taobao.calendar.aidl.jsbridge.calendarJsApi.6
                @Override // com.taobao.calendar.aidl.listener.CalendarListener
                public void onError(String str2, String str3) throws RemoteException {
                    try {
                        jSONObject.put("success", "false");
                        org.json.JSONObject jSONObject2 = jSONObject;
                        jSONObject2.put("errorMsg", str2 + "||" + str3);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }

                @Override // com.taobao.calendar.aidl.listener.CalendarListener
                public void onSuccess(boolean z, String str2, String[] strArr) throws RemoteException {
                    try {
                        if (strArr == null) {
                            jSONObject.put("success", "false");
                            jSONObject.put("errorMsg", "result data is null");
                            return;
                        }
                        jSONObject.put("success", "true");
                        org.json.JSONArray jSONArray = new org.json.JSONArray();
                        for (String str3 : strArr) {
                            jSONArray.put(new org.json.JSONObject(str3));
                        }
                        jSONObject.put("datas", jSONArray);
                    } catch (Exception unused) {
                    }
                }
            });
            calendarAidlAdapter.queryAllReminds(str);
            r rVar = new r();
            rVar.a(jSONObject);
            wVCallBackContext.success(rVar);
        } catch (Exception unused) {
            wVCallBackContext.error();
        }
    }

    @WindVaneInterface
    public void setRemindFinish(WVCallBackContext wVCallBackContext, String str) {
        Intent intent = new Intent();
        intent.setAction("Broadcast_Activity");
        intent.putExtra("alarmSetChange", true);
        this.mContext.sendBroadcast(intent);
        wVCallBackContext.success();
    }
}

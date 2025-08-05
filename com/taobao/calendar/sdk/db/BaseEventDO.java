package com.taobao.calendar.sdk.db;

import com.alibaba.fastjson.JSON;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public class BaseEventDO {
    public long endTime;
    public long startTime;
    public String theDate;
    public String title;
    public String uid;
    public long sourceId = 0;
    public boolean isAllDay = false;
    public boolean isEditable = false;
    public boolean isDeleted = false;
    public int sync = 0;
    public boolean isOnclickEventMark = false;

    static {
        kge.a(-1465063626);
    }

    public BaseEventDO() {
        Calendar calendar = Calendar.getInstance();
        this.startTime = calendar.getTimeInMillis();
        calendar.add(12, 30);
        this.endTime = calendar.getTimeInMillis();
    }

    public String formatDate(Long l) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l.longValue());
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime());
    }

    public String getLable() {
        String str = this.title;
        return (str == null || str.equals("")) ? "无标题" : this.title;
    }

    public boolean isOnclickEventMark() {
        return this.isOnclickEventMark;
    }

    public Calendar parseDate(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.applyPattern("yyyy-MM-dd HH:mm:ss");
        try {
            Date parse = simpleDateFormat.parse(str.trim());
            Calendar calendar = Calendar.getInstance();
            try {
                calendar.setTime(parse);
                return calendar;
            } catch (ParseException unused) {
                return calendar;
            }
        } catch (ParseException unused2) {
            return null;
        }
    }

    public JSONArray parseJSONArrayFromString(String str) {
        try {
            return new JSONArray(str);
        } catch (JSONException unused) {
            return new JSONArray();
        }
    }

    public JSONObject parseJSONObjectFromString(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public void setOnclickEventMark(boolean z) {
        this.isOnclickEventMark = z;
    }

    public String toString() {
        return JSON.toJSONString(this);
    }
}

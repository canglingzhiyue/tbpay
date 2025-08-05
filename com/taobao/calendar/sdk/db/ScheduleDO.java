package com.taobao.calendar.sdk.db;

import com.taobao.calendar.sdk.db.schedule.KeyValue;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class ScheduleDO extends BaseEventDO {
    public static final List<KeyValue> REMIND_ITEMS;
    public static final List<KeyValue> REMIND_ITEMS_ALLDAY;
    public static final List<KeyValue> RPEAT_ITEMS;
    public long alartTime;
    public String description;
    public String eventId;
    public String link;
    public String type;
    public String userId;
    public long remind = a.DEF_MAX_ASYNC_SECONDS;
    public boolean isRepeat = false;
    public Repeat repeat = new Repeat();

    static {
        kge.a(1036959360);
        RPEAT_ITEMS = new ArrayList();
        REMIND_ITEMS = new ArrayList();
        REMIND_ITEMS_ALLDAY = new ArrayList();
        RPEAT_ITEMS.addAll(Arrays.asList(new KeyValue(new Repeat(1, "n"), "仅一次"), new KeyValue(new Repeat(1, Repeat.D), "每天"), new KeyValue(new Repeat(1, "w"), "每周"), new KeyValue(new Repeat(2, "w"), "每两周"), new KeyValue(new Repeat(1, "m"), "每月"), new KeyValue(new Repeat(1, "y"), "一年一次")));
        REMIND_ITEMS_ALLDAY.addAll(Arrays.asList(new KeyValue(-1L, "不提醒"), new KeyValue(54000L, "前一天早上 (09:00)"), new KeyValue(43200L, "前一天中午 (12:00)"), new KeyValue(10800L, "前一天晚上 (21:00)")));
        REMIND_ITEMS.addAll(Arrays.asList(new KeyValue(-1L, "不提醒"), new KeyValue(0L, "准点提醒"), new KeyValue(600L, "10分钟"), new KeyValue(900L, "15分钟"), new KeyValue(Long.valueOf((long) a.DEF_MAX_ASYNC_SECONDS), "30分钟"), new KeyValue(3600L, "1小时"), new KeyValue(7200L, "2小时"), new KeyValue(86400L, "一天")));
    }

    public ScheduleDO() {
        Calendar calendar = Calendar.getInstance();
        this.startTime = calendar.getTimeInMillis();
        calendar.add(11, 1);
        this.endTime = calendar.getTimeInMillis();
    }

    private String calculateTimeOffset() {
        int rint = (int) Math.rint(this.remind / 60);
        int floor = (int) Math.floor(rint / 60);
        if (floor <= 0) {
            return rint + "分钟";
        }
        return floor + "小时" + (rint % 60) + "分钟";
    }

    public String genRemindStr() {
        StringBuilder sb;
        String calculateTimeOffset;
        KeyValue next;
        if (this.isAllDay) {
            Iterator<KeyValue> it = REMIND_ITEMS_ALLDAY.iterator();
            while (it.hasNext()) {
                next = it.next();
                String str = next.getKey() + " :: " + this.remind;
                if (next.getKey().equals(Long.valueOf(this.remind))) {
                    long j = this.remind;
                    if (j == 0 || j == -1) {
                        return next.getValue();
                    }
                    sb = new StringBuilder();
                }
            }
            return null;
        }
        Iterator<KeyValue> it2 = REMIND_ITEMS.iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (next.getKey().equals(Long.valueOf(this.remind))) {
                long j2 = this.remind;
                if (j2 == 0 || j2 == -1) {
                    return next.getValue();
                }
                sb = new StringBuilder();
                sb.append("提前");
            }
        }
        sb = new StringBuilder();
        sb.append("提前");
        calculateTimeOffset = calculateTimeOffset();
        sb.append(calculateTimeOffset);
        sb.append("提醒");
        return sb.toString();
        calculateTimeOffset = next.getValue();
        sb.append(calculateTimeOffset);
        sb.append("提醒");
        return sb.toString();
    }

    public boolean isRemindExpire() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.startTime;
        long j2 = this.remind;
        return j2 != -1 && j - (1000 * j2) <= currentTimeMillis;
    }

    public String origEventId() {
        if (this.eventId == null) {
            return null;
        }
        return this.eventId.substring(String.valueOf(this.sourceId).length());
    }

    public void processRepeat(long j) {
        if (!this.repeat.unit.equals("n") && this.startTime < j) {
            Calendar calendar = Calendar.getInstance();
            int calendarFlag = this.repeat.getCalendarFlag();
            if (calendarFlag == 0) {
                return;
            }
            calendar.setTimeInMillis(this.startTime);
            while (calendar.getTimeInMillis() < j) {
                calendar.add(calendarFlag, this.repeat.interval);
            }
            this.startTime = calendar.getTimeInMillis();
        }
    }

    public void setStartTime(Long l) {
        this.startTime = l.longValue();
        Date date = new Date();
        date.setTime(l.longValue());
        this.theDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
    }

    @Override // com.taobao.calendar.sdk.db.BaseEventDO
    public String toString() {
        return "ScheduleDO [userId=" + this.userId + ", eventId=" + this.eventId + ", type=" + this.type + ", remind=" + this.remind + ", alartTime=" + this.alartTime + ", isRepeat=" + this.isRepeat + ", repeat=" + this.repeat + ", description=" + this.description + ", link=" + this.link + ", uid=" + this.uid + ", sourceId=" + this.sourceId + ", title=" + this.title + ", theDate=" + this.theDate + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", isAllDay=" + this.isAllDay + ", isEditable=" + this.isEditable + ", isDeleted=" + this.isDeleted + ", sync=" + this.sync + ", isOnclickEventMark=" + this.isOnclickEventMark + riy.ARRAY_END_STR;
    }
}

package com.taobao.calendar.aidl.business.db;

import android.database.Cursor;
import com.taobao.calendar.aidl.model.ScheduleDTO;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes6.dex */
public class TableSchedule {
    private static final String COL_ALARM_TIME = "alarm_time";
    private static final String COL_EVENT_ID = "event_id";
    private static final String TABLE_NAME = "tsic_schedule";

    public static List<ScheduleDTO> getRecentRemindSchedule() {
        Cursor cursor;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        String[] strArr = {"event_id", COL_ALARM_TIME};
        String[] strArr2 = {timeInMillis + ""};
        ArrayList arrayList = new ArrayList();
        try {
            cursor = DBase.getReadableDatabase(Globals.getApplication()).query(TABLE_NAME, strArr, "alarm_time >= ? AND isrepeat = 0 AND deleted = 0", strArr2, null, null, "start_time ASC", AgooConstants.ACK_PACK_ERROR);
            while (cursor.moveToNext()) {
                try {
                    ScheduleDTO scheduleDTO = new ScheduleDTO();
                    scheduleDTO.setEventId(cursor.getString(0));
                    scheduleDTO.setAlartTime(cursor.getLong(1));
                    arrayList.add(scheduleDTO);
                } catch (Exception unused) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (Exception unused2) {
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }
}

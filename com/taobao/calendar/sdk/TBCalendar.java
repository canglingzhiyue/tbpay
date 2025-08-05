package com.taobao.calendar.sdk;

import android.content.Context;
import com.taobao.calendar.sdk.common.Dp2PxUtil;
import com.taobao.calendar.sdk.common.Utils;
import com.taobao.calendar.sdk.db.ScheduleDO;
import com.taobao.calendar.sdk.db.TableSchedule;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class TBCalendar extends TBCalendarBase {
    public static boolean isInited;
    public static int smallIcon;
    public static String ttid;

    static {
        kge.a(854093855);
        isInited = false;
        ttid = null;
    }

    public static void getAlarms(String[] strArr, String str, TableSchedule.QueryHandler queryHandler) {
        TableSchedule.getSchedule(Utils.join(strArr, ","), str, queryHandler);
    }

    public static void getLatestAlarm(final TableSchedule.QueryHandler queryHandler, String str) {
        TableSchedule.getCommingSchedule(new TableSchedule.QueryHandler() { // from class: com.taobao.calendar.sdk.TBCalendar.1
            @Override // com.taobao.calendar.sdk.db.TableSchedule.QueryHandler
            public void callback(int i, List<ScheduleDO> list) {
                TableSchedule.QueryHandler.this.callback(i, list.size() > 0 ? list.subList(0, 1) : new ArrayList<>());
            }
        }, str);
    }

    public static void init(Context context) {
        if (!isInited) {
            Dp2PxUtil.init(context);
            Preferences.init(context);
            TableSchedule.init(context);
            TBCalendarConfig.init();
            isInited = true;
        }
    }

    public static void newSchedule(ScheduleDO scheduleDO, TableSchedule.QueryHandler queryHandler, String str) {
        scheduleDO.eventId = scheduleDO.sourceId + scheduleDO.eventId;
        TableSchedule.newSchedule(scheduleDO, queryHandler, str);
    }
}

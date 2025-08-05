package com.taobao.calendar.sdk.alarm;

import com.taobao.calendar.sdk.db.ScheduleDO;
import java.util.Comparator;
import tb.kge;

/* loaded from: classes6.dex */
class a implements Comparator {
    static {
        kge.a(27867774);
        kge.a(-2099169482);
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        ScheduleDO scheduleDO = (ScheduleDO) obj;
        ScheduleDO scheduleDO2 = (ScheduleDO) obj2;
        if (scheduleDO.alartTime > scheduleDO2.alartTime) {
            return 1;
        }
        return scheduleDO.alartTime < scheduleDO2.alartTime ? -1 : 0;
    }
}

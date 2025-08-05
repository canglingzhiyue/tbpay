package com.taobao.calendar.sdk;

import android.content.Context;
import com.taobao.calendar.sdk.common.Dp2PxUtil;
import com.taobao.calendar.sdk.db.TableSchedule;
import tb.kge;

/* loaded from: classes6.dex */
public class TBCalendarBase {
    static {
        kge.a(-1425751152);
    }

    public static void destroy() {
    }

    public static void init(Context context) {
        if (context == null) {
            return;
        }
        Dp2PxUtil.init(context);
        Preferences.init(context);
        TableSchedule.init(context);
        TBCalendarConfig.init();
    }
}

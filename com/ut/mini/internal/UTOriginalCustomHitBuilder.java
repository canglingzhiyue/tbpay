package com.ut.mini.internal;

import com.ut.mini.UTHitBuilders;
import java.util.HashMap;
import java.util.Map;
import tb.aqc;
import tb.kge;

/* loaded from: classes.dex */
public class UTOriginalCustomHitBuilder extends UTHitBuilders.a {
    static {
        kge.a(349193029);
    }

    public UTOriginalCustomHitBuilder(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        if (!aqc.e(str)) {
            super.setProperty(UTHitBuilders.a.FIELD_PAGE, str);
        }
        if (i == 1010 || i == 1023) {
            map = map == null ? new HashMap<>() : map;
            map.put("_original_eid", "" + i);
        }
        super.setProperty(UTHitBuilders.a.FIELD_EVENT_ID, "" + i);
        if (!aqc.e(str2)) {
            super.setProperty(UTHitBuilders.a.FIELD_ARG1, str2);
        }
        if (!aqc.e(str3)) {
            super.setProperty(UTHitBuilders.a.FIELD_ARG2, str3);
        }
        if (!aqc.e(str4)) {
            super.setProperty(UTHitBuilders.a.FIELD_ARG3, str4);
        }
        super.setProperties(map);
    }
}

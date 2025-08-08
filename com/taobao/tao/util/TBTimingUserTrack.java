package com.taobao.tao.util;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class TBTimingUserTrack {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENTTYPE_CLICK = "click";
    public static final String EVENTTYPE_LOAD = "load";
    private static final String TAG = "TBTimingUserTrack";
    private static TBTimingUserTrack s_TBTimingUserTrack;
    private HashMap<String, Long> mHash = new HashMap<>();

    static {
        kge.a(-1339347077);
    }

    public static synchronized TBTimingUserTrack instance() {
        synchronized (TBTimingUserTrack.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBTimingUserTrack) ipChange.ipc$dispatch("eb390932", new Object[0]);
            }
            if (s_TBTimingUserTrack == null) {
                s_TBTimingUserTrack = new TBTimingUserTrack();
            }
            return s_TBTimingUserTrack;
        }
    }

    public void start(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4e7c7d", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            this.mHash.put(str + "_" + str2, Long.valueOf(System.currentTimeMillis()));
            String str3 = "[TimingStart]:" + str + " tyep:" + str2;
        }
    }

    public void end(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f6593f6", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            String str3 = str + "_" + str2;
            if (!this.mHash.containsKey(str3)) {
                return;
            }
            long longValue = this.mHash.get(str3).longValue();
            if (longValue == 0) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - longValue;
            TBS.Ext.commitEvent(str, Constants.EventID_EVENT_TIME, str2, Long.valueOf(currentTimeMillis), "");
            String str4 = "[TimingEnd]:" + str + " time:" + currentTimeMillis;
            this.mHash.remove(str3);
        }
    }
}

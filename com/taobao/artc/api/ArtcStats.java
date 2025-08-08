package com.taobao.artc.api;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class ArtcStats {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARTC_POINT_EVENT = "ArtcEvent";
    public static final String ARTC_POINT_INFO = "ArtcInfo";
    public static final String STAT_RETRYCOUNT = "retryCount";
    private static final String STAT_ROOM_ID = "room_id";
    private static final String STAT_TURNSPEED = "turnSpeed";
    private static final String STAT_USER_ID = "user_id";
    public int duration;
    public long rxBytes;
    public int rxKBitRate;
    public long txBytes;
    public int txKBitRate;
    public LocalVideoStats localVideoStats = new LocalVideoStats();
    public RemoteVideoStats remoteVideoStats = new RemoteVideoStats();
    public NetworkStats networkStats = new NetworkStats();

    static {
        kge.a(846560846);
    }

    public static void formatExtInfoMap(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b977bd24", new Object[]{map, str});
        } else if (map == null) {
        } else {
            if (StringUtils.isEmpty(str)) {
                str = "";
            }
            map.put("user_id", str);
        }
    }

    public static void addRetryCountExtInfoMap(Map<String, String> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50e7037a", new Object[]{map, new Integer(i)});
        } else if (map == null) {
        } else {
            map.put(STAT_RETRYCOUNT, String.valueOf(i));
        }
    }
}

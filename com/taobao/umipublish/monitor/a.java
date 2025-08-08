package com.taobao.umipublish.monitor;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import com.taobao.vpm.publish.contentDO.ContentMetaInfo;
import com.taobao.vpm.publish.contentDO.b;
import java.util.HashMap;
import java.util.Map;
import tb.ios;
import tb.kge;
import tb.rio;
import tb.rip;
import tb.tek;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VPM_TRACK_ID = "vpmTrackId";

    static {
        kge.a(1708377838);
    }

    public static void a(Context context, IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db191c5e", new Object[]{context, iUGCMedia});
        } else if (iUGCMedia.getMeta(VPM_TRACK_ID) != null || !a()) {
        } else {
            iUGCMedia.setMeta(VPM_TRACK_ID, a(context));
        }
    }

    private static String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context}) : new rip().a(context);
    }

    public static Map<String, String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{map});
        }
        HashMap hashMap = new HashMap();
        String str = map == null ? null : map.get(VPM_TRACK_ID);
        if (a() && !StringUtils.isEmpty(str)) {
            hashMap.put("EagleEye-UserData", "cqp_track_id=" + map.get(VPM_TRACK_ID));
        }
        return hashMap;
    }

    public static void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{map});
        } else if (!a() || map == null) {
        } else {
            rio.a(d(map), (HashMap) map);
        }
    }

    public static void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{map});
        } else if (!a() || map == null) {
        } else {
            rio.b(d(map), (HashMap) map);
        }
    }

    public static void a(Map<String, String> map, UmiPublishMonitor.UmiPublishTracker umiPublishTracker, String str, boolean z) {
        UmiPublishMonitor.UmiPublishTracker.VideoMetaInfo a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("801ba285", new Object[]{map, umiPublishTracker, str, new Boolean(z)});
        } else if (!a() || map == null || umiPublishTracker == null) {
        } else {
            String str2 = map.get(ios.KEY_BIZ_LINE);
            String e = e(map);
            String str3 = map.get("biz_scene");
            String str4 = map.get(VPM_TRACK_ID);
            b bVar = null;
            if (umiPublishTracker.videos != null && !umiPublishTracker.videos.isEmpty() && (a2 = a(umiPublishTracker.videos.get(0))) != null) {
                bVar = new b(a2.fps, a2.resolution, a2.file_size, String.valueOf(a2.duration), a2.video_bps);
            }
            rio.a(new ContentMetaInfo(str2, e, str3, str4, z ? ContentMetaInfo.PublishState.SUCCESS : ContentMetaInfo.PublishState.ERROR, umiPublishTracker.umimonitor_error_code, null, null, str, umiPublishTracker.extra == null ? "unkonwn" : umiPublishTracker.extra.postType), bVar, (HashMap<String, String>) map);
        }
    }

    private static UmiPublishMonitor.UmiPublishTracker.VideoMetaInfo a(UmiPublishMonitor.UmiPublishTracker.VideoMeta videoMeta) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UmiPublishMonitor.UmiPublishTracker.VideoMetaInfo) ipChange.ipc$dispatch("29a2b146", new Object[]{videoMeta});
        }
        if (videoMeta.edit_meta != null) {
            return videoMeta.edit_meta;
        }
        return videoMeta.origin_meta;
    }

    public static void a(Map<String, String> map, UmiPublishMonitor.UmiPublishTracker umiPublishTracker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ee6ba5", new Object[]{map, umiPublishTracker});
        } else if (!a() || map == null || umiPublishTracker == null || umiPublishTracker.videos == null || umiPublishTracker.videos.isEmpty()) {
        } else {
            UmiPublishMonitor.UmiPublishTracker.VideoMetaInfo a2 = a(umiPublishTracker.videos.get(0));
            b bVar = null;
            if (a2 != null) {
                bVar = new b(a2.fps, a2.resolution, a2.file_size, String.valueOf(a2.duration), a2.video_bps);
            }
            rio.a(d(map), bVar, (HashMap) map);
        }
    }

    public static void b(Map<String, String> map, UmiPublishMonitor.UmiPublishTracker umiPublishTracker, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed885fa4", new Object[]{map, umiPublishTracker, str, new Boolean(z)});
        } else if (!a() || map == null || umiPublishTracker == null || umiPublishTracker.videos == null || umiPublishTracker.videos.isEmpty()) {
        } else {
            String str2 = map.get(ios.KEY_BIZ_LINE);
            String e = e(map);
            String str3 = map.get("biz_scene");
            String str4 = map.get(VPM_TRACK_ID);
            UmiPublishMonitor.UmiPublishTracker.VideoMetaInfo a2 = a(umiPublishTracker.videos.get(0));
            b bVar = null;
            if (a2 != null) {
                bVar = new b(a2.fps, a2.resolution, a2.file_size, String.valueOf(a2.duration), a2.video_bps);
            }
            rio.b(new ContentMetaInfo(str2, e, str3, str4, z ? ContentMetaInfo.PublishState.SUCCESS : ContentMetaInfo.PublishState.ERROR, umiPublishTracker.umimonitor_error_code, null, null, str, umiPublishTracker.extra == null ? "unkonwn" : umiPublishTracker.extra.postType), bVar, (HashMap<String, String>) map);
        }
    }

    private static com.taobao.vpm.publish.contentDO.a d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.vpm.publish.contentDO.a) ipChange.ipc$dispatch("69058dc4", new Object[]{map}) : new com.taobao.vpm.publish.contentDO.a(map.get(ios.KEY_BIZ_LINE), e(map), map.get("biz_scene"), map.get(VPM_TRACK_ID));
    }

    private static String e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50440e27", new Object[]{map});
        }
        String str = map.get(ios.URL_KEY_PHOTO_BIZ_CODE);
        return StringUtils.isEmpty(str) ? map.get(ios.URL_KEY_VIDEO_BIZ_CODE) : str;
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : tek.f();
    }
}

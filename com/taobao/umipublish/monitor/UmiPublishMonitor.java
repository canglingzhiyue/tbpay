package com.taobao.umipublish.monitor;

import android.text.TextUtils;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.android.litecreator.base.data.UGCImage;
import com.taobao.android.litecreator.base.data.UGCVideo;
import com.taobao.android.litecreator.util.at;
import com.taobao.android.litecreator.util.k;
import com.taobao.android.litecreator.util.u;
import com.taobao.statistic.TBS;
import com.taobao.tao.flexbox.layoutmanager.container.i;
import com.taobao.tao.log.TLog;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.hdx;
import tb.ios;
import tb.kge;
import tb.rcx;

/* loaded from: classes9.dex */
public class UmiPublishMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UT_PAGE_NAME = "PublishFullChainMonitor";

    /* renamed from: a  reason: collision with root package name */
    private static final String f23362a = "PublishFullChainMonitor_error";
    private static final String b = "PublishFullChainMonitor_warning";
    private static final List<String> c;
    private static final List<String> d;
    private Map<String, UmiPublishTracker> e;
    private Map<String, Map<String, String>> f;
    private String g;

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static UmiPublishMonitor f23363a;

        static {
            kge.a(-23885403);
            f23363a = new UmiPublishMonitor();
        }

        public static /* synthetic */ UmiPublishMonitor a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (UmiPublishMonitor) ipChange.ipc$dispatch("f423e5d0", new Object[0]) : f23363a;
        }
    }

    static {
        kge.a(-404156439);
        c = Arrays.asList("draft");
        d = Arrays.asList("3006", "3007", "3008", "4005", "5001");
    }

    public static <T> void a(String str, T... tArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c81dbf", new Object[]{str, tArr});
        } else {
            TLog.loge(UT_PAGE_NAME, str, u.e(str, tArr));
        }
    }

    private UmiPublishMonitor() {
        this.e = new HashMap();
        this.f = new HashMap();
    }

    public static UmiPublishMonitor a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UmiPublishMonitor) ipChange.ipc$dispatch("f423e5d0", new Object[0]) : a.a();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        UmiPublishTracker b2 = b(str);
        if (b2.extra == null) {
            b2.extra = new UmiPublishTracker.ExtraInfo();
        }
        b2.extra.contentId = str2;
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        UmiPublishTracker b2 = b(str);
        if (b2.videos == null || b2.videos.isEmpty()) {
            return;
        }
        for (UmiPublishTracker.VideoMeta videoMeta : b2.videos) {
            if (videoMeta.origin_meta != null && TextUtils.equals(videoMeta.origin_meta.file_path, str2)) {
                videoMeta.publish_meta = new UmiPublishTracker.PublishMetaInfo(str3);
            }
        }
    }

    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
            return;
        }
        UmiPublishTracker b2 = b(str);
        if (b2.photos == null || b2.photos.isEmpty()) {
            return;
        }
        for (UmiPublishTracker.ImageMeta imageMeta : b2.photos) {
            if (imageMeta.origin_meta != null && TextUtils.equals(imageMeta.origin_meta.file_path, str2)) {
                imageMeta.publish_meta = new UmiPublishTracker.PublishMetaInfo();
                imageMeta.publish_meta.remote_url = str3;
            }
        }
    }

    public void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
        } else {
            a(this.g, str, str2, null, str3, str4, null, false);
        }
    }

    public void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
        } else {
            a(this.g, str, str2, str3, str4, str5, null, false);
        }
    }

    public void b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb13311", new Object[]{this, str, str2, str3, str4});
        } else {
            a(this.g, str, str2, null, str3, str4, null, true);
        }
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2562e1a4", new Object[]{this, str, str2, str3, str4, str5, str6});
        } else {
            a(str, str2, str3, str6, str4, str5, null, true);
        }
    }

    public void b(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2001a9b", new Object[]{this, str, str2, str3, str4, str5});
        } else {
            a(str, str2, str3, str5, str4, null, null, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0095 A[Catch: all -> 0x00a9, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0033, B:10:0x003b, B:11:0x0042, B:15:0x0058, B:17:0x0075, B:19:0x007d, B:21:0x0085, B:28:0x0095, B:30:0x009a, B:29:0x0098, B:14:0x0050), top: B:36:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098 A[Catch: all -> 0x00a9, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0033, B:10:0x003b, B:11:0x0042, B:15:0x0058, B:17:0x0075, B:19:0x007d, B:21:0x0085, B:28:0x0095, B:30:0x009a, B:29:0x0098, B:14:0x0050), top: B:36:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void a(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.umipublish.monitor.UmiPublishMonitor.$ipChange     // Catch: java.lang.Throwable -> La9
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: java.lang.Throwable -> La9
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L33
            java.lang.String r1 = "42559626"
            r4 = 9
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> La9
            r4[r3] = r5     // Catch: java.lang.Throwable -> La9
            r4[r2] = r6     // Catch: java.lang.Throwable -> La9
            r6 = 2
            r4[r6] = r7     // Catch: java.lang.Throwable -> La9
            r6 = 3
            r4[r6] = r8     // Catch: java.lang.Throwable -> La9
            r6 = 4
            r4[r6] = r9     // Catch: java.lang.Throwable -> La9
            r6 = 5
            r4[r6] = r10     // Catch: java.lang.Throwable -> La9
            r6 = 6
            r4[r6] = r11     // Catch: java.lang.Throwable -> La9
            r6 = 7
            r4[r6] = r12     // Catch: java.lang.Throwable -> La9
            r6 = 8
            java.lang.Boolean r7 = new java.lang.Boolean     // Catch: java.lang.Throwable -> La9
            r7.<init>(r13)     // Catch: java.lang.Throwable -> La9
            r4[r6] = r7     // Catch: java.lang.Throwable -> La9
            r0.ipc$dispatch(r1, r4)     // Catch: java.lang.Throwable -> La9
            monitor-exit(r5)
            return
        L33:
            com.taobao.umipublish.monitor.UmiPublishMonitor$UmiPublishTracker r0 = r5.b(r6)     // Catch: java.lang.Throwable -> La9
            com.alibaba.fastjson.JSONObject r1 = r0.biz     // Catch: java.lang.Throwable -> La9
            if (r1 != 0) goto L42
            java.util.Map r1 = r5.n(r6)     // Catch: java.lang.Throwable -> La9
            r5.a(r6, r1)     // Catch: java.lang.Throwable -> La9
        L42:
            r0.location = r7     // Catch: java.lang.Throwable -> La9
            r0.umimonitor_error_code = r8     // Catch: java.lang.Throwable -> La9
            r0.umimonitor_error_msg = r10     // Catch: java.lang.Throwable -> La9
            boolean r1 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> La9
            if (r1 == 0) goto L50
            r1 = r9
            goto L58
        L50:
            java.lang.String r1 = ","
            java.lang.String r4 = " "
            java.lang.String r1 = r9.replace(r1, r4)     // Catch: java.lang.Throwable -> La9
        L58:
            r0.umimonitor_error_subcode = r1     // Catch: java.lang.Throwable -> La9
            r0.umimonitor_video_biz_code = r12     // Catch: java.lang.Throwable -> La9
            r12 = 0
            r0.umimonitor_info_node = r12     // Catch: java.lang.Throwable -> La9
            com.taobao.umipublish.monitor.UmiPublishMonitor$UmiPublishTracker$ErrorMeta r12 = new com.taobao.umipublish.monitor.UmiPublishMonitor$UmiPublishTracker$ErrorMeta     // Catch: java.lang.Throwable -> La9
            r12.<init>(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> La9
            r0.error = r12     // Catch: java.lang.Throwable -> La9
            java.util.Map r6 = r5.n(r6)     // Catch: java.lang.Throwable -> La9
            java.lang.String r9 = "biz_scene"
            java.lang.Object r6 = r6.get(r9)     // Catch: java.lang.Throwable -> La9
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> La9
            if (r13 != 0) goto L8e
            java.util.List<java.lang.String> r6 = com.taobao.umipublish.monitor.UmiPublishMonitor.c     // Catch: java.lang.Throwable -> La9
            boolean r6 = r6.contains(r7)     // Catch: java.lang.Throwable -> La9
            if (r6 != 0) goto L8e
            java.util.List<java.lang.String> r6 = com.taobao.umipublish.monitor.UmiPublishMonitor.d     // Catch: java.lang.Throwable -> La9
            boolean r6 = r6.contains(r8)     // Catch: java.lang.Throwable -> La9
            if (r6 != 0) goto L8e
            boolean r6 = tb.tek.e(r8)     // Catch: java.lang.Throwable -> La9
            if (r6 == 0) goto L8c
            goto L8e
        L8c:
            r6 = 0
            goto L8f
        L8e:
            r6 = 1
        L8f:
            java.lang.String r7 = "PublishFullChainMonitor"
            r8 = 19999(0x4e1f, float:2.8025E-41)
            if (r6 == 0) goto L98
            java.lang.String r6 = com.taobao.umipublish.monitor.UmiPublishMonitor.b     // Catch: java.lang.Throwable -> La9
            goto L9a
        L98:
            java.lang.String r6 = com.taobao.umipublish.monitor.UmiPublishMonitor.f23362a     // Catch: java.lang.Throwable -> La9
        L9a:
            r9 = r6
            r11 = 0
            java.lang.String[] r12 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> La9
            java.lang.String r6 = r0.toErrorString()     // Catch: java.lang.Throwable -> La9
            r12[r3] = r6     // Catch: java.lang.Throwable -> La9
            com.taobao.statistic.TBS.Ext.commitEvent(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> La9
            monitor-exit(r5)
            return
        La9:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.umipublish.monitor.UmiPublishMonitor.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    private Map<String, String> n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bec3dc74", new Object[]{this, str});
        }
        if (this.f.get(str) == null) {
            this.f.put(str, new HashMap());
        }
        return this.f.get(str);
    }

    public UmiPublishTracker b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UmiPublishTracker) ipChange.ipc$dispatch("893bb905", new Object[]{this, str});
        }
        if (this.e.get(str) == null) {
            this.e.put(str, new UmiPublishTracker());
        }
        return this.e.get(str);
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        UmiPublishTracker b2 = b(str);
        if (b2.extra == null) {
            b2.extra = new UmiPublishTracker.ExtraInfo();
        }
        b2.extra.postType = str2;
    }

    public UmiPublishTracker.ExtraInfo c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UmiPublishTracker.ExtraInfo) ipChange.ipc$dispatch("97ab26c", new Object[]{this, str});
        }
        UmiPublishTracker b2 = b(str);
        if (b2.extra == null) {
            b2.extra = new UmiPublishTracker.ExtraInfo();
        }
        return b2.extra;
    }

    public void a(String str, UmiPublishTracker.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed893816", new Object[]{this, str, extraInfo});
            return;
        }
        UmiPublishTracker b2 = b(str);
        if (extraInfo == null) {
            return;
        }
        b2.extra = extraInfo;
    }

    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
            return;
        }
        UmiPublishTracker b2 = b(str);
        if (b2.extra == null) {
            b2.extra = new UmiPublishTracker.ExtraInfo();
        }
        b2.extra.videoExportEncodeType = str2;
    }

    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
            return;
        }
        UmiPublishTracker b2 = b(str);
        if (b2.extra == null) {
            b2.extra = new UmiPublishTracker.ExtraInfo();
        }
        b2.extra.videoImportEncodeType = str2;
    }

    public void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40669c8", new Object[]{this, str, str2, str3});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str3)) {
            jSONObject.put(i.FEATURE_LOCAL_URL, (Object) str3);
            jSONObject.put("file_size", (Object) Long.valueOf(k.b(str3)));
        }
        a(str, hdx.PAGE_PUBLISH, str2, jSONObject);
    }

    public void a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba98c8", new Object[]{this, str, str2, new Long(j)});
        } else {
            a(str, str2, j, (Map<String, String>) null);
        }
    }

    public void a(String str, String str2, long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("550999bd", new Object[]{this, str, str2, new Long(j), map});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", (Object) Long.valueOf(j));
        if (map != null) {
            for (String str3 : map.keySet()) {
                jSONObject.put(str3, (Object) map.get(str3));
            }
        }
        a(str, hdx.PAGE_PUBLISH, str2, jSONObject);
    }

    public void a(String str, String str2, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bfaf3e", new Object[]{this, str, str2, str3, new Long(j)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", (Object) Long.valueOf(j));
        jSONObject.put("url", (Object) str3);
        a(str, hdx.PAGE_PUBLISH, str2, jSONObject);
    }

    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{this, str, str2});
        } else {
            a(str, hdx.PAGE_PUBLISH, str2, (JSONObject) null);
        }
    }

    public void c(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a465adc", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
            jSONObject.put(str4, (Object) str5);
        }
        a(str, str2, str3, jSONObject);
    }

    public synchronized void a(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5d0b6a", new Object[]{this, str, str2, str3, jSONObject});
            return;
        }
        UmiPublishTracker b2 = b(str);
        if (b2.biz == null) {
            a(str, n(str));
        }
        b2.location = str2;
        b2.info = new UmiPublishTracker.NodeInfo(str3, jSONObject);
        b2.umimonitor_error_msg = null;
        b2.umimonitor_error_code = null;
        b2.umimonitor_error_subcode = null;
        b2.error = null;
        b2.umimonitor_info_node = str3;
        b2.umimonitor_video_biz_code = n(str).get(ios.URL_KEY_VIDEO_BIZ_CODE);
        TBS.Ext.commitEvent(UT_PAGE_NAME, 19999, "PublishFullChainMonitor_info", n(str).get("biz_scene"), null, b2.toInfoString());
    }

    public synchronized void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
        } else {
            a(this.g, str, str2, jSONObject);
        }
    }

    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        n(str).clear();
        n(str).putAll(map);
        UmiPublishTracker b2 = b(str);
        b2.biz = (JSONObject) JSONObject.toJSON(map);
        b2.publish_id = map.get("umi_pub_session");
    }

    public void a(IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c849b066", new Object[]{this, iUGCMedia});
        } else if (iUGCMedia != null) {
            try {
                UmiPublishTracker b2 = b(iUGCMedia.getPublishSessionId());
                b2.photos.clear();
                b2.videos.clear();
                if (iUGCMedia.getImages() != null && iUGCMedia.getImages().size() > 0) {
                    for (UGCImage uGCImage : iUGCMedia.getImages()) {
                        UmiPublishTracker.ImageMeta imageMeta = new UmiPublishTracker.ImageMeta();
                        if (uGCImage.origin != null) {
                            imageMeta.origin_meta = new UmiPublishTracker.ImageMetaInfo();
                            imageMeta.origin_meta.file_path = uGCImage.origin.path;
                            UmiPublishTracker.ImageMetaInfo imageMetaInfo = imageMeta.origin_meta;
                            imageMetaInfo.resolution = uGCImage.origin.width + "," + uGCImage.origin.height;
                            imageMeta.origin_meta.format = uGCImage.origin.toString();
                        }
                        if (uGCImage.compress != null) {
                            imageMeta.edit_meta = new UmiPublishTracker.ImageMetaInfo();
                            imageMeta.edit_meta.file_path = uGCImage.compress.path;
                            UmiPublishTracker.ImageMetaInfo imageMetaInfo2 = imageMeta.edit_meta;
                            imageMetaInfo2.resolution = uGCImage.compress.width + "," + uGCImage.compress.height;
                            imageMeta.edit_meta.format = uGCImage.compress.toString();
                            imageMeta.edit_meta.stat_info = (JSONObject) JSON.toJSON(uGCImage.getMeta("mediaStatInfo"));
                        }
                        b2.photos.add(imageMeta);
                    }
                }
                if (iUGCMedia.getVideos() == null || iUGCMedia.getVideos().size() <= 0) {
                    return;
                }
                UGCVideo uGCVideo = iUGCMedia.getVideos().get(0);
                UmiPublishTracker.VideoMeta videoMeta = new UmiPublishTracker.VideoMeta();
                if (uGCVideo.origin != null) {
                    videoMeta.origin_meta = new UmiPublishTracker.VideoMetaInfo();
                    videoMeta.origin_meta.file_path = uGCVideo.origin.path;
                    UmiPublishTracker.VideoMetaInfo videoMetaInfo = videoMeta.origin_meta;
                    videoMetaInfo.resolution = uGCVideo.origin.width + "," + uGCVideo.origin.height;
                    videoMeta.origin_meta.video_format = uGCVideo.origin.toString();
                    videoMeta.origin_meta.file_size = String.valueOf(uGCVideo.origin.fileSize);
                    videoMeta.origin_meta.fps = String.valueOf(uGCVideo.origin.framerate);
                    videoMeta.origin_meta.video_bps = String.valueOf(uGCVideo.origin.bitRate);
                    videoMeta.origin_meta.duration = uGCVideo.origin.duration;
                    if (uGCVideo.compress == null) {
                        videoMeta.origin_meta.stat_info = (JSONObject) JSON.toJSON(uGCVideo.getMeta("mediaStatInfo"));
                    }
                }
                if (uGCVideo.compress != null) {
                    videoMeta.edit_meta = new UmiPublishTracker.VideoMetaInfo();
                    videoMeta.edit_meta.file_path = uGCVideo.compress.path;
                    UmiPublishTracker.VideoMetaInfo videoMetaInfo2 = videoMeta.edit_meta;
                    videoMetaInfo2.resolution = uGCVideo.compress.width + "," + uGCVideo.compress.height;
                    videoMeta.edit_meta.video_format = uGCVideo.compress.toString();
                    videoMeta.edit_meta.file_size = String.valueOf(uGCVideo.compress.fileSize);
                    videoMeta.edit_meta.fps = String.valueOf(uGCVideo.compress.framerate);
                    videoMeta.edit_meta.video_bps = String.valueOf(uGCVideo.compress.bitRate);
                    videoMeta.edit_meta.duration = uGCVideo.compress.duration;
                    videoMeta.edit_meta.stat_info = (JSONObject) JSON.toJSON(uGCVideo.getMeta("mediaStatInfo"));
                    if (uGCVideo.compress.cover != null) {
                        videoMeta.edit_meta.cover_meta = new UmiPublishTracker.ImageMetaInfo();
                        videoMeta.edit_meta.cover_meta.file_path = uGCVideo.compress.cover.path;
                        UmiPublishTracker.ImageMetaInfo imageMetaInfo3 = videoMeta.edit_meta.cover_meta;
                        imageMetaInfo3.resolution = uGCVideo.compress.cover.width + "," + uGCVideo.compress.cover.height;
                        videoMeta.edit_meta.cover_meta.format = uGCVideo.compress.cover.toString();
                        videoMeta.edit_meta.cover_meta.stat_info = (JSONObject) JSON.toJSON(uGCVideo.getMeta("video_cover_stat_info"));
                    }
                }
                b2.videos.add(videoMeta);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        UmiPublishTracker b2 = b(rcx.a().d());
        try {
            b2.photos.clear();
            b2.videos.clear();
            if ("image".equals(jSONObject.getString("type")) && jSONObject.containsKey("images") && jSONObject.getJSONArray("images") != null && jSONObject.getJSONArray("images").size() > 0) {
                JSONArray jSONArray = jSONObject.getJSONArray("images");
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    UmiPublishTracker.ImageMeta imageMeta = new UmiPublishTracker.ImageMeta();
                    imageMeta.origin_meta = new UmiPublishTracker.ImageMetaInfo();
                    imageMeta.origin_meta.file_path = jSONObject2.getString("path");
                    UmiPublishTracker.ImageMetaInfo imageMetaInfo = imageMeta.origin_meta;
                    imageMetaInfo.resolution = jSONObject2.getString("width") + "," + jSONObject2.getString("height");
                    imageMeta.origin_meta.format = jSONObject2.getString("type");
                    b2.photos.add(imageMeta);
                }
            }
            if (!("video".equals(jSONObject.getString("type")) && jSONObject.containsKey("taopai_document"))) {
                return;
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("taopai_document");
            String string = jSONObject.getString("clip_output_path");
            if (TextUtils.isEmpty(string)) {
                string = jSONObject.getString("record_output_path");
            }
            if (TextUtils.isEmpty(string) && jSONObject.containsKey("taopai_enter_param") && jSONObject.getJSONObject("taopai_enter_param").getJSONArray("elements") != null && jSONObject.getJSONObject("taopai_enter_param").getJSONArray("elements").size() > 0) {
                string = jSONObject.getJSONObject("taopai_enter_param").getJSONArray("elements").getJSONObject(0).getString("fileUrl");
            }
            UmiPublishTracker.VideoMeta videoMeta = new UmiPublishTracker.VideoMeta();
            videoMeta.origin_meta = new UmiPublishTracker.VideoMetaInfo();
            videoMeta.origin_meta.file_path = string;
            JSONArray jSONArray2 = jSONObject3.getJSONArray("canvasSize");
            UmiPublishTracker.VideoMetaInfo videoMetaInfo = videoMeta.origin_meta;
            videoMetaInfo.resolution = jSONArray2.getInteger(0) + "," + jSONArray2.getInteger(1);
            JSONObject jSONObject4 = jSONObject3.getJSONObject("root").getJSONArray(ExperimentDO.COLUMN_TRACKS).getJSONObject(0).getJSONArray(ExperimentDO.COLUMN_TRACKS).getJSONObject(0).getJSONObject("metadata");
            videoMeta.origin_meta.video_format = jSONObject4.toJSONString();
            videoMeta.origin_meta.video_bps = jSONObject4.getString("bitRate");
            videoMeta.origin_meta.fps = jSONObject4.getString("frameRate");
            videoMeta.origin_meta.file_size = jSONObject4.getString("fileSize");
            videoMeta.origin_meta.duration = jSONObject4.getFloat("duration").floatValue() * 1000.0f;
            b2.videos.add(videoMeta);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        UmiPublishTracker b2 = b(rcx.a().d());
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("deleteItems");
            if (jSONArray != null && jSONArray.size() != 0) {
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    String string = jSONObject2.getString("type");
                    String string2 = jSONObject2.getString("path");
                    if (!TextUtils.isEmpty(string2)) {
                        if (TextUtils.equals(string, "video") && b2.videos.size() > 0) {
                            b2.videos.clear();
                        } else if (TextUtils.equals(string, "image") && b2.photos.size() > 0) {
                            Iterator<UmiPublishTracker.ImageMeta> it = b2.photos.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                } else if (TextUtils.equals(it.next().origin_meta.file_path, string2)) {
                                    it.remove();
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98586481", new Object[]{this, str, str2});
            return;
        }
        c(str, "start", "publish_start", "type", str2);
        com.taobao.umipublish.monitor.a.b(this.f.get(str));
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            a(hdx.PAGE_PUBLISH, "2103", "video_exported_fail", str);
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            a(hdx.PAGE_PUBLISH, "3001", "form_render_fail", str);
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            a(hdx.PAGE_PUBLISH, "3001", "form_render_error", str);
        }
    }

    public void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f88f82", new Object[]{this, str, str2});
        } else {
            a(str, hdx.PAGE_PUBLISH, "3002", str2, "video_upload_error", null, n(str).get(ios.URL_KEY_VIDEO_BIZ_CODE), false);
        }
    }

    public void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b198ba83", new Object[]{this, str, str2});
        } else {
            b(str, hdx.PAGE_PUBLISH, "3002", "video_cover_upload_error", str2);
        }
    }

    public void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{this, str, str2});
        } else {
            b(str, hdx.PAGE_PUBLISH, "3002", "picture_upload_error", str2);
        }
    }

    public void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cad91085", new Object[]{this, str, str2});
        } else {
            b(str, hdx.PAGE_PUBLISH, "3006", "single_picture_upload_error", str2);
        }
    }

    public void k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57793b86", new Object[]{this, str, str2});
            return;
        }
        b(str, hdx.PAGE_PUBLISH, "3007", "single_video_upload_error", str2);
        com.taobao.umipublish.monitor.a.b(this.f.get(str), b(str), null, false);
    }

    public void l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4196687", new Object[]{this, str, str2});
        } else {
            b(str, hdx.PAGE_PUBLISH, "3008", "single_video_cover_upload_error", str2);
        }
    }

    public void d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4bc3689", new Object[]{this, str, str2, str3});
            return;
        }
        a(str, hdx.PAGE_PUBLISH, "3004", str2, "form_submit_fail", str2 + "," + str3, "", false);
        com.taobao.umipublish.monitor.a.a(this.f.get(str), b(str), "", false);
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else {
            a("onion_album", "1205", "native_onion_album_tab_list_fetch_fail", str);
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else {
            a("onion_album", "1206", "native_onion_album_single_template_list_fetch_fail", str);
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
        } else {
            a("draft", "4001", "open_draft_db_failed", str);
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
        } else {
            a("draft", "4003", "fetch_drafts_failed", str);
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99648bc", new Object[]{this, str});
        } else {
            a("draft", "4003", "fetch_single_draft_failed", str);
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c7e1fd", new Object[]{this, str});
        } else {
            a("draft", "4003", "save_draft_failed", str);
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df97b3e", new Object[]{this, str});
        } else {
            a("draft", "4003", "delete_drafts_failed", str);
        }
    }

    /* loaded from: classes9.dex */
    public static class UmiPublishTracker implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public JSONObject biz;
        public ErrorMeta error;
        public ExtraInfo extra;
        public NodeInfo info;
        public String location;
        public String publish_id;
        public String umimonitor_error_code;
        public String umimonitor_error_msg;
        public String umimonitor_error_subcode;
        public String umimonitor_info_node;
        public String umimonitor_video_biz_code;
        public List<VideoMeta> videos = new ArrayList();
        public List<ImageMeta> photos = new ArrayList();

        /* loaded from: classes9.dex */
        public static class ImageMeta implements Serializable {
            public ImageMetaInfo edit_meta;
            public ImageMetaInfo origin_meta;
            public PublishMetaInfo publish_meta;

            static {
                kge.a(1022429627);
                kge.a(1028243835);
            }
        }

        /* loaded from: classes9.dex */
        public static class ImageMetaInfo implements Serializable {
            public String file_path;
            public String format;
            public String resolution;
            public JSONObject stat_info;

            static {
                kge.a(-441283319);
                kge.a(1028243835);
            }
        }

        /* loaded from: classes9.dex */
        public static class NodeInfo implements Serializable {
            public JSONObject data;
            public String node;

            static {
                kge.a(-2002528587);
                kge.a(1028243835);
            }

            public NodeInfo(String str, JSONObject jSONObject) {
                this.node = str;
                this.data = jSONObject;
            }
        }

        /* loaded from: classes9.dex */
        public static class VideoMeta implements Serializable {
            public VideoMetaInfo edit_meta;
            public VideoMetaInfo origin_meta;
            public PublishMetaInfo publish_meta;

            static {
                kge.a(-1061428005);
                kge.a(1028243835);
            }
        }

        /* loaded from: classes9.dex */
        public static class VideoMetaInfo implements Serializable {
            public String audio_bps;
            public String audio_format;
            public ImageMetaInfo cover_meta;
            public long duration;
            public String file_path;
            public String file_size;
            public String fps;
            public String resolution;
            public JSONObject stat_info;
            public String video_bps;
            public String video_format;

            static {
                kge.a(-2074421207);
                kge.a(1028243835);
            }
        }

        static {
            kge.a(471430719);
            kge.a(1028243835);
        }

        @JSONField(serialize = false)
        public String toErrorString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1988aafb", new Object[]{this});
            }
            String jSONString = JSON.toJSONString(this);
            HashMap hashMap = new HashMap();
            hashMap.put("umimonitor_error_code", this.umimonitor_error_code);
            hashMap.put("umimonitor_error_msg", this.umimonitor_error_msg);
            hashMap.put("umimonitor_error_subcode", this.umimonitor_error_subcode);
            hashMap.put("umimonitor_video_biz_code", this.umimonitor_video_biz_code);
            hashMap.put("umi_pub_session", this.publish_id);
            try {
                hashMap.put("umimonitor_full_message", URLEncoder.encode(jSONString, "UTF-8"));
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return at.a(hashMap, "=", ",");
        }

        @JSONField(serialize = false)
        public String toInfoString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("920813ff", new Object[]{this});
            }
            String jSONString = JSON.toJSONString(this);
            HashMap hashMap = new HashMap();
            hashMap.put("umimonitor_info_node", this.umimonitor_info_node);
            hashMap.put("umimonitor_video_biz_code", this.umimonitor_video_biz_code);
            hashMap.put("umi_pub_session", this.publish_id);
            try {
                hashMap.put("umimonitor_full_message", URLEncoder.encode(jSONString, "UTF-8"));
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return at.a(hashMap, "=", ",");
        }

        /* loaded from: classes9.dex */
        public static class ExtraInfo implements Serializable {
            public String contentId;
            public String postType;
            public String uploadMode = "ASYNC";
            public String videoExportEncodeType = "none";
            public String videoImportEncodeType = "none";

            static {
                kge.a(1647173785);
                kge.a(1028243835);
            }

            public ExtraInfo(String str) {
                this.contentId = str;
            }

            public ExtraInfo() {
            }
        }

        /* loaded from: classes9.dex */
        public static class PublishMetaInfo implements Serializable {
            public String remote_url;
            public String upload_id;

            static {
                kge.a(2019224061);
                kge.a(1028243835);
            }

            public PublishMetaInfo(String str) {
                this.upload_id = str;
            }

            public PublishMetaInfo() {
            }
        }

        /* loaded from: classes9.dex */
        public static class ErrorMeta implements Serializable {
            public String code;
            public String info;
            public String msg;
            public String subcode;

            static {
                kge.a(-2064837656);
                kge.a(1028243835);
            }

            public ErrorMeta(String str, String str2, String str3) {
                this.code = str;
                this.msg = str2;
                this.info = str3;
            }

            public ErrorMeta(String str, String str2, String str3, String str4) {
                this.code = str;
                this.subcode = str2;
                this.msg = str3;
                this.info = str4;
            }
        }
    }
}

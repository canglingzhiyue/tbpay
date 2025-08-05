package com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.c;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.i;
import com.taobao.login4android.api.Coordinator;
import com.taobao.tao.Globals;
import java.io.File;
import java.util.ArrayList;
import tb.keu;
import tb.kge;
import tb.kml;
import tb.kmm;
import tb.kmo;
import tb.kmq;
import tb.ldf;
import tb.ldk;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ASPECT_RATIO = "aspectRatio";
    public static final String FIRST_FRAME_IMAGE_URL = "firstFrameImageUrl";
    public static final String HOME_PAGE = "homepage";
    public static final String VIDEO_ANIMATION = "videoAnimation";
    public static final String VIDEO_ANIMATION_BIZ_NAME = "videoAnimationMonitor";
    public static final String VIDEO_TIME = "videoTime";
    public static final String VIDEO_URL = "videoUrl";

    static {
        kge.a(-1527035822);
    }

    public static /* synthetic */ String a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c56b8346", new Object[]{dVar}) : dVar.a();
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (!i.a(Globals.getApplication())) {
            ldf.d("VideoAnimationCardHelper", "downloadVideo:未开启自动播放不下载视频");
        } else {
            String string = jSONObject.getString("videoUrl");
            ArrayList arrayList = new ArrayList();
            if (b(string, true)) {
                ldk.a(VIDEO_ANIMATION, "videoDownLoadStart", "", VIDEO_ANIMATION_BIZ_NAME, "", null);
                arrayList.add(new kmo(string));
            }
            String string2 = jSONObject.getString(FIRST_FRAME_IMAGE_URL);
            if (b(string2, false)) {
                arrayList.add(new kmo(string2));
            }
            if (arrayList.isEmpty()) {
                return;
            }
            kmm kmmVar = new kmm();
            kmmVar.f30166a = arrayList;
            kmmVar.b = new kmq();
            kmmVar.b.f30169a = "homepage";
            kmmVar.b.h = a();
            kmmVar.b.j = false;
            com.taobao.downloader.b.a().a(kmmVar, new kml() { // from class: com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.kml
                public void onDownloadProgress(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // tb.kml
                public void onDownloadStateChange(String str, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
                    }
                }

                @Override // tb.kml
                public void onFinish(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                    }
                }

                @Override // tb.kml
                public void onNetworkLimit(int i, kmq kmqVar, kml.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6919023a", new Object[]{this, new Integer(i), kmqVar, aVar});
                    }
                }

                @Override // tb.kml
                public void onDownloadError(String str, int i, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                        return;
                    }
                    ldk.a(d.VIDEO_ANIMATION, "videoDownLoadError", "", d.VIDEO_ANIMATION_BIZ_NAME, "", null);
                    ldf.d("VideoAnimationCardHelper", "download error url：" + str + "，path" + str2);
                }

                @Override // tb.kml
                public void onDownloadFinish(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                        return;
                    }
                    ldk.a(d.VIDEO_ANIMATION, "videoDownLoadSuccess", "", d.VIDEO_ANIMATION_BIZ_NAME, "", null);
                    ldf.d("VideoAnimationCardHelper", "download finish url：" + str + "，path" + str2);
                }
            });
        }
    }

    public JSONObject a(IContainerDataModel<?> iContainerDataModel) {
        IContainerInnerDataModel<?> base;
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("42e64ef3", new Object[]{this, iContainerDataModel});
        }
        if (iContainerDataModel == null || (base = iContainerDataModel.getBase()) == null || (ext = base.getExt()) == null) {
            return null;
        }
        String string = ext.getString(VIDEO_ANIMATION);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return JSON.parseObject(string);
        } catch (Exception e) {
            ldf.a("VideoAnimationCardHelper", "getVideoAnimation parse error：", e);
            return null;
        }
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        File filesDir = Globals.getApplication().getFilesDir();
        if (filesDir == null) {
            ldf.d("VideoAnimationCardHelper", "localVideoPath: cache null");
            return null;
        }
        File file = new File(filesDir, File.separator + "homepage");
        if (!file.exists()) {
            boolean mkdirs = file.mkdirs();
            ldf.d("VideoAnimationCardHelper", "localVideoPath createFile: " + mkdirs);
        }
        return file.getAbsolutePath();
    }

    public void a(final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String a2 = d.a(d.this);
                    if (TextUtils.isEmpty(a2)) {
                        return;
                    }
                    File file = new File(a2);
                    if (!file.exists()) {
                        return;
                    }
                    boolean a3 = d.a(str, keu.SUFFIX_MP4);
                    File[] listFiles = file.listFiles();
                    String a4 = d.this.a(str);
                    for (File file2 : listFiles) {
                        if (z || (a3 && d.a(file2.getAbsolutePath(), keu.SUFFIX_MP4) && !TextUtils.equals(a4, file2.getAbsolutePath())) || (!a3 && !d.a(file2.getAbsolutePath(), keu.SUFFIX_MP4) && !TextUtils.equals(a4, file2.getAbsolutePath()))) {
                            ldf.d("VideoAnimationCardHelper", "delete file:" + file2.getAbsolutePath() + ",delete:" + file2.delete());
                        }
                    }
                }
            });
        }
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String a2 = a();
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        String substring = str.substring(str.lastIndexOf("/") + 1);
        ldf.d("VideoAnimationCardHelper", "getUrlFleName " + substring);
        File file = new File(a2, substring);
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        ldf.d("VideoAnimationCardHelper", "getLocalUrlPath: " + file + " ,no exist");
        return null;
    }

    public boolean b(JSONObject jSONObject) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{this, jSONObject})).booleanValue();
        }
        long longValue = jSONObject.getLongValue("effectiveStartTime");
        long longValue2 = jSONObject.getLongValue("effectiveEndTime");
        String string = jSONObject.getString("videoUrl");
        String a2 = a(string);
        a(longValue, longValue2, string, a2);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < longValue || currentTimeMillis > longValue2) {
            ldf.d("VideoAnimationCardHelper", "isInAvailablePeriod:not in period");
            return false;
        } else if (TextUtils.isEmpty(a2)) {
            return false;
        } else {
            try {
                i = Integer.parseInt(jSONObject.getString("fatigueMaxCount"));
            } catch (Exception e) {
                ldf.a("VideoAnimationCardHelper", "isInAvailablePeriod error", e);
                i = 0;
            }
            try {
                i2 = Integer.parseInt(c.a.a("homepage_switch", a2, "0"));
            } catch (Exception e2) {
                ldf.a("VideoAnimationCardHelper", "isInAvailablePeriod error", e2);
                i2 = 0;
            }
            ldf.d("VideoAnimationCardHelper", "isInAvailablePeriod:fatigueMaxCount:" + i + ",fatigue:" + i2);
            return i2 < i;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                int parseInt = Integer.parseInt(c.a.a("homepage_switch", str, "0"));
                int i = parseInt + 1;
                ldf.d("VideoAnimationCardHelper", "recordFatigue fatigue:" + parseInt + ",newFatigue:" + i);
                c.a.b("homepage_switch", str, String.valueOf(i));
            } catch (Exception e) {
                ldf.a("VideoAnimationCardHelper", "recordFatigue error", e);
            }
        }
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return str.split("\\?")[0].endsWith(str2);
        }
        return false;
    }

    private void a(long j, long j2, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4efabfc", new Object[]{this, new Long(j), new Long(j2), str, str2});
            return;
        }
        String a2 = c.a.a("homepage_switch", "localRecord", "");
        if (TextUtils.isEmpty(a2)) {
            ldf.d("VideoAnimationCardHelper", "checkAndResetLocalFatigue 本地无疲劳度:");
            b(j, j2, str, str2);
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(a2);
            if (parseObject.getLongValue("startTime") == j && parseObject.getLongValue("endTime") == j2 && TextUtils.equals(parseObject.getString("videoUrl"), str)) {
                return;
            }
            ldf.d("VideoAnimationCardHelper", "checkAndResetLocalFatigue 数据更新:");
            b(j, j2, str, str2);
        } catch (Exception e) {
            ldf.a("VideoAnimationCardHelper", "checkAndResetLocalFatigue 解析异常:", e);
            b(j, j2, str, str2);
        }
    }

    private void b(long j, long j2, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da311abd", new Object[]{this, new Long(j), new Long(j2), str, str2});
            return;
        }
        ldf.d("VideoAnimationCardHelper", "resetLocalFatigue 本地疲劳度:");
        c.a.b("homepage_switch", str2, "0");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("startTime", (Object) Long.valueOf(j));
        jSONObject.put("endTime", (Object) Long.valueOf(j2));
        jSONObject.put("videoUrl", (Object) str);
        c.a.b("homepage_switch", "localRecord", jSONObject.toJSONString());
    }

    private boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d257bc5", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        String a2 = a(str);
        a(str, false);
        if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(a2)) {
            if (!z || a(str, keu.SUFFIX_MP4)) {
                return true;
            }
            ldf.d("VideoAnimationCardHelper", "downloadVideo:非mp4后缀不下载");
            return false;
        }
        ldf.d("VideoAnimationCardHelper", "checkDownload:url：" + str + "，不下载");
        return false;
    }
}

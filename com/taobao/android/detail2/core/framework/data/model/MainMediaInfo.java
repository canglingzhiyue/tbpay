package com.taobao.android.detail2.core.framework.data.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.weex.common.Constants;
import java.io.Serializable;
import tb.fjt;
import tb.kge;
import tb.oyw;
import tb.sku;

/* loaded from: classes5.dex */
public class MainMediaInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Config config;
    public Data data;
    public String type;

    static {
        kge.a(-603888466);
        kge.a(1028243835);
    }

    public static MainMediaInfo transformToMainMediaInfo(JSONObject jSONObject) {
        MainMediaInfo mainMediaInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainMediaInfo) ipChange.ipc$dispatch("91c418e0", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            mainMediaInfo = new MainMediaInfo();
        } catch (Throwable th) {
            th = th;
            mainMediaInfo = null;
        }
        try {
            mainMediaInfo.type = jSONObject.getString("type");
            mainMediaInfo.config = Config.transformToConfigInfo(jSONObject.getJSONObject("config"));
            mainMediaInfo.data = Data.transformToDataInfo(jSONObject.getJSONObject("data"));
            return mainMediaInfo;
        } catch (Throwable th2) {
            th = th2;
            fjt.a("new_detail异常", "解析视频数据异常", th);
            return mainMediaInfo;
        }
    }

    /* loaded from: classes5.dex */
    public static class Config implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean autoPlay;
        public boolean enablePreDownload;
        public boolean enableStreamOpti;
        public boolean muted;
        public boolean p2ff;

        static {
            kge.a(1249337368);
            kge.a(1028243835);
        }

        public static Config transformToConfigInfo(JSONObject jSONObject) {
            Config config;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Config) ipChange.ipc$dispatch("1a88ad4b", new Object[]{jSONObject});
            }
            if (jSONObject == null) {
                return null;
            }
            try {
                config = new Config();
            } catch (Throwable th) {
                th = th;
                config = null;
            }
            try {
                config.autoPlay = jSONObject.getBooleanValue(Constants.Name.AUTO_PLAY);
                config.muted = jSONObject.getBooleanValue(MusLiveVideo.ATTR_MUTE);
                config.p2ff = jSONObject.getBooleanValue("p2ff");
                config.enablePreDownload = jSONObject.getBooleanValue("enablePreDownload");
                config.enableStreamOpti = jSONObject.getBooleanValue("enableStreamOpti");
                return config;
            } catch (Throwable th2) {
                th = th2;
                fjt.a("new_detail异常", "解析视频数据config异常", th);
                return config;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class Data implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String bottomAreaHeight;
        public String contentId;
        public String dimension;
        public String interactiveId;
        public boolean isPosterFirstFrame;
        public String source;
        public String type;
        public String url;
        public String userId;
        public JSONObject utParams;
        public String videoId;
        public String videoPlayScenes;
        public String videoResourceStr;
        public String videoSource;
        public String videoThumbnailURL;

        static {
            kge.a(1279527424);
            kge.a(1028243835);
        }

        public static Data transformToDataInfo(JSONObject jSONObject) {
            Data data;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Data) ipChange.ipc$dispatch("fc56653b", new Object[]{jSONObject});
            }
            if (jSONObject == null) {
                return null;
            }
            try {
                data = new Data();
                try {
                    data.dimension = jSONObject.getString("dimension");
                    JSONObject jSONObject2 = jSONObject.getJSONArray("data").getJSONObject(0);
                    data.videoThumbnailURL = jSONObject2.getString("videoThumbnailURL");
                    data.isPosterFirstFrame = jSONObject2.getBooleanValue("isPosterFirstFrame");
                    data.videoId = jSONObject2.getString("videoId");
                    data.videoResourceStr = jSONObject2.getString("videoResourceStr");
                    data.url = jSONObject2.getString("url");
                    data.videoSource = jSONObject2.getString(sku.KEY_VIDEO_SOURCE);
                    data.videoPlayScenes = jSONObject2.getString(oyw.VIDEO_PLAY_SCENES);
                    data.source = jSONObject2.getString("source");
                    data.type = jSONObject2.getString("type");
                    data.contentId = jSONObject2.getString("contentId");
                    data.interactiveId = jSONObject2.getString("interactiveId");
                    data.userId = jSONObject2.getString("userId");
                    data.utParams = jSONObject.getJSONObject("extra");
                    data.bottomAreaHeight = jSONObject.getString("bottomAreaHeight");
                    return data;
                } catch (Throwable th) {
                    th = th;
                    fjt.a("new_detail异常", "解析视频数据data异常", th);
                    return data;
                }
            } catch (Throwable th2) {
                th = th2;
                data = null;
            }
        }
    }
}

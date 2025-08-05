package com.taobao.umipublish.draft;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class DraftModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODE_LITE = "lite";
    public static final String MODE_MAIN = "main";
    public static final String MODE_QUICK_PUBLISH = "quick";
    public boolean autoSave;
    public String biz;
    public long creationTimestamp;
    public String draftId;
    public String draftOriginBiz;
    public String draftOriginId;
    public UmiPublishMonitor.UmiPublishTracker.ExtraInfo extraInfo;
    public String failedCode;
    public Meta meta;
    public long modificationTimestamp;
    public String rawJson;
    public String userId;
    public Map<String, String> urlParams = new HashMap();
    public String version = "3";
    public Map<String, String> localPathToCdnUrl = new HashMap();

    /* loaded from: classes9.dex */
    public static class Content implements Serializable {
        public String text;

        static {
            kge.a(1217976265);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes9.dex */
    public static class Photo implements Serializable {
        public JSONObject extra_info;
        public String height;
        public String localUrl;
        public String originFilePath;
        public JSONObject stat_info;
        public List<UGCLabel> tags;
        public String taopaiDraftId;
        public String width;
        public String xgcImageDraft;

        static {
            kge.a(-1309837950);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes9.dex */
    public static class UGCLabel implements Serializable {
        public float posX;
        public float posY;
        public String tagName;
        public int type = 0;
        public int direction = 0;

        static {
            kge.a(-2000160749);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes9.dex */
    public static class Video implements Serializable {
        public int coverHeight;
        public String coverLocalUrl;
        public String coverOriginFile;
        public int coverWidth;
        public JSONObject cover_stat_info;
        public JSONObject extra_info;
        public String videoLocalUrl;
        public String videoOriginFile;
        public JSONObject video_stat_info;
        public String xgcVideoDraft;

        static {
            kge.a(-1304278069);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(1253445652);
        kge.a(1028243835);
    }

    /* loaded from: classes9.dex */
    public static class Meta implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Content content;
        public String draftId;
        public Content shortTitle;
        public String type;
        public String mode = "main";
        public List<Video> videos = new ArrayList();
        public List<Photo> photos = new ArrayList();

        static {
            kge.a(1758770357);
            kge.a(1028243835);
        }

        public Meta(String str) {
            this.type = str;
        }

        public Meta() {
        }

        @JSONField(serialize = false)
        public JSONObject toJson() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("705c882a", new Object[]{this}) : (JSONObject) JSON.toJSON(this);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : JSON.toJSONString(this);
    }

    public static DraftModel parseFromJsonString(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DraftModel) ipChange.ipc$dispatch("81b61e0a", new Object[]{str}) : (DraftModel) JSON.parseObject(str, DraftModel.class);
    }
}

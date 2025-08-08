package com.taobao.android.fluid.framework.preload.cache;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.avplayer.TBPlayerConst;
import com.taobao.tao.timestamp.TimeStampManager;
import java.io.Serializable;
import java.util.Objects;
import tb.kge;
import tb.sjt;
import tb.soo;
import tb.sop;
import tb.soq;
import tb.spz;

/* loaded from: classes5.dex */
public class DetailCacheData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DetailCacheData";
    public String contentId;
    public JSONObject detailResponseData;
    public String enableVerticalLayout;
    public String firstFrameUrl;
    public boolean hasVideoCached;
    public boolean isValid;
    public JSONObject mediaContentDetailData;
    public JSONObject mediaContentDetailJson;
    @JSONField(deserialize = false, serialize = false)
    private com.taobao.android.fluid.framework.data.datamodel.a mediaSetData;
    public String mixCacheType;
    public String sceneName;
    public long timeStamp;
    public String version;
    public String videoResourceStr;
    public long lastCheckVideoCacheTime = 0;
    public int hasVideoDownloadSize = 0;
    public String hasVideoDownloadUrl = "";
    public long hasVideoDownloadTime = 0;
    public boolean hasDownLoadError = false;

    static {
        kge.a(475627839);
        kge.a(1028243835);
    }

    private String varValueExist(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a0219330", new Object[]{this, obj}) : obj == null ? "false" : "true";
    }

    public DetailCacheData() {
    }

    public static DetailCacheData parseFromJson(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailCacheData) ipChange.ipc$dispatch("28de1f42", new Object[]{jSONObject});
        }
        DetailCacheData detailCacheData = new DetailCacheData();
        if (jSONObject.containsKey("timeStamp")) {
            detailCacheData.timeStamp = jSONObject.getLong("timeStamp").longValue();
        }
        if (jSONObject.containsKey("videoResourceStr")) {
            detailCacheData.videoResourceStr = jSONObject.getString("videoResourceStr");
        }
        if (jSONObject.containsKey("detailResponseData")) {
            detailCacheData.detailResponseData = jSONObject.getJSONObject("detailResponseData");
        }
        if (jSONObject.containsKey("contentId")) {
            detailCacheData.contentId = jSONObject.getString("contentId");
        }
        if (jSONObject.containsKey("mixCacheType")) {
            detailCacheData.mixCacheType = jSONObject.getString("mixCacheType");
        }
        if (jSONObject.containsKey("version")) {
            detailCacheData.version = jSONObject.getString("version");
        }
        if (jSONObject.containsKey("firstFrameUrl")) {
            detailCacheData.firstFrameUrl = jSONObject.getString("firstFrameUrl");
        }
        if (jSONObject.containsKey(TBPlayerConst.TBPlayerMethodSwitchPlayerScene_SceneName)) {
            detailCacheData.sceneName = jSONObject.getString(TBPlayerConst.TBPlayerMethodSwitchPlayerScene_SceneName);
        }
        if (jSONObject.containsKey("isValid")) {
            detailCacheData.isValid = jSONObject.getBooleanValue("isValid");
        }
        if (jSONObject.containsKey("hasVideoCached")) {
            detailCacheData.hasVideoCached = jSONObject.getBooleanValue("hasVideoCached");
        }
        if (jSONObject.containsKey("hasVideoDownloadSize")) {
            detailCacheData.hasVideoDownloadSize = jSONObject.getIntValue("hasVideoDownloadSize");
        }
        if (jSONObject.containsKey("hasVideoDownloadUrl")) {
            detailCacheData.hasVideoDownloadUrl = jSONObject.getString("hasVideoDownloadUrl");
        }
        if (jSONObject.containsKey("hasVideoDownloadTime")) {
            detailCacheData.hasVideoDownloadTime = jSONObject.getLongValue("hasVideoDownloadTime");
        }
        if (jSONObject.containsKey(com.taobao.android.fluid.framework.data.remote.c.KEY_VERTICAL_LAYOUT)) {
            detailCacheData.enableVerticalLayout = jSONObject.getString(com.taobao.android.fluid.framework.data.remote.c.KEY_VERTICAL_LAYOUT);
        }
        if (jSONObject.containsKey("mediaContentDetailData")) {
            detailCacheData.mediaContentDetailData = jSONObject.getJSONObject("mediaContentDetailData");
        }
        if (jSONObject.containsKey("mediaContentDetailJson")) {
            detailCacheData.mediaContentDetailJson = jSONObject.getJSONObject("mediaContentDetailJson");
        }
        if (jSONObject.containsKey("hasDownLoadError")) {
            detailCacheData.hasDownLoadError = jSONObject.getBooleanValue("hasDownLoadError");
        }
        return detailCacheData;
    }

    public int dataState() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17fec801", new Object[]{this})).intValue();
        }
        if (StringUtils.equals("1", getVersion())) {
            if (!StringUtils.equals(getMixCacheType(), "1")) {
                i = 2;
            } else {
                z = true;
                i = -1;
            }
        }
        boolean equals = StringUtils.equals(getSceneName(), IDetailCache.SCENE_NAME_SHORT_VIDEO_INTERNAL_EXPOSED);
        if (z && !equals && isExpired()) {
            return 3;
        }
        return i;
    }

    public boolean isExpired() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a65eada6", new Object[]{this})).booleanValue();
        }
        soo b = sop.a().b();
        long j = b.d;
        if (j < 0) {
            j = 216000000;
        }
        long currentTimeStamp = TimeStampManager.instance().getCurrentTimeStamp();
        if (currentTimeStamp - getTimeStamp() > j) {
            return true;
        }
        if (b.o == null) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i < b.o.length) {
                if (currentTimeStamp > b.o[i] && b.o[i] > getTimeStamp()) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        spz.c(TAG, "isExpired(),detailCache expiredAfterTimeStamp:" + z);
        return z;
    }

    public DetailCacheData(a aVar) {
        this.timeStamp = a.a(aVar);
        this.videoResourceStr = a.b(aVar);
        this.detailResponseData = a.c(aVar);
        this.contentId = a.d(aVar);
        this.mixCacheType = a.e(aVar);
        this.enableVerticalLayout = a.f(aVar);
        this.version = a.g(aVar);
        this.firstFrameUrl = a.h(aVar);
        this.sceneName = a.i(aVar);
        this.mediaSetData = a.j(aVar);
        this.mediaContentDetailData = a.k(aVar);
        this.mediaContentDetailJson = a.l(aVar);
    }

    public long getTimeStamp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aeaa0ebb", new Object[]{this})).longValue() : this.timeStamp;
    }

    public String getVideoResourceStr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12f8727b", new Object[]{this});
        }
        if (!StringUtils.equals(this.videoResourceStr, "null")) {
            return this.videoResourceStr;
        }
        return null;
    }

    public JSONObject getDetailResponseData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c3f2cf19", new Object[]{this});
        }
        if (!soq.b() && StringUtils.isEmpty(this.enableVerticalLayout)) {
            this.detailResponseData = null;
        } else if (!StringUtils.isEmpty(this.enableVerticalLayout) && !StringUtils.equals(this.enableVerticalLayout, String.valueOf(sjt.u()))) {
            this.detailResponseData = null;
        }
        return this.detailResponseData;
    }

    public String getContentId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8392bcfb", new Object[]{this}) : this.contentId;
    }

    public String getMixCacheType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43736b63", new Object[]{this}) : this.mixCacheType;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : this.version;
    }

    public String getFirstFrameUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6bb29c9d", new Object[]{this}) : this.firstFrameUrl;
    }

    public String getSceneName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8ab72718", new Object[]{this}) : this.sceneName;
    }

    public JSONObject getMediaContentDetailData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("68559d0d", new Object[]{this}) : this.mediaContentDetailData;
    }

    public JSONObject getMediaContentDetailJson() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ae03534b", new Object[]{this}) : this.mediaContentDetailJson;
    }

    public com.taobao.android.fluid.framework.data.datamodel.a getMediaSetData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.fluid.framework.data.datamodel.a) ipChange.ipc$dispatch("614152a1", new Object[]{this}) : this.mediaSetData;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DetailCacheData{contentId='" + this.contentId + "', cacheSceneName='" + this.sceneName + "', isValid='" + this.isValid + "', hasVideoCached='" + this.hasVideoCached + "', hasVideoDownloadSize='" + this.hasVideoDownloadSize + "', hasVideoDownloadTime='" + this.hasVideoDownloadTime + "', timeStamp=" + this.timeStamp + ", videoResourceStr='" + varValueExist(this.videoResourceStr) + "', detailResponseData=" + varValueExist(this.detailResponseData) + ", mixCacheType='" + this.mixCacheType + "', enableVerticalLayout='" + this.enableVerticalLayout + "', cacheVersion='" + this.version + "', firstFrameUrl='" + varValueExist(this.firstFrameUrl) + "', hasVideoDownloadUrl='" + this.hasVideoDownloadUrl + "'}";
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailCacheData)) {
            return false;
        }
        DetailCacheData detailCacheData = (DetailCacheData) obj;
        return Objects.equals(this.contentId, detailCacheData.contentId) && Objects.equals(this.sceneName, detailCacheData.sceneName) && this.isValid == detailCacheData.isValid;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(this.contentId, this.sceneName, Boolean.valueOf(this.isValid));
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private long f12623a;
        private String b;
        private JSONObject c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private com.taobao.android.fluid.framework.data.datamodel.a i;
        private JSONObject j;
        private JSONObject k;
        private String l;

        static {
            kge.a(-1194940138);
        }

        public static /* synthetic */ long a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("78786fcf", new Object[]{aVar})).longValue() : aVar.f12623a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("718ab144", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ JSONObject c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("c9d834fd", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ String d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e16c6782", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ String e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("195d42a1", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ String f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("514e1dc0", new Object[]{aVar}) : aVar.l;
        }

        public static /* synthetic */ String g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("893ef8df", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ String h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c12fd3fe", new Object[]{aVar}) : aVar.g;
        }

        public static /* synthetic */ String i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f920af1d", new Object[]{aVar}) : aVar.h;
        }

        public static /* synthetic */ com.taobao.android.fluid.framework.data.datamodel.a j(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.fluid.framework.data.datamodel.a) ipChange.ipc$dispatch("9e18d960", new Object[]{aVar}) : aVar.i;
        }

        public static /* synthetic */ JSONObject k(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e6154d05", new Object[]{aVar}) : aVar.j;
        }

        public static /* synthetic */ JSONObject l(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e99cf006", new Object[]{aVar}) : aVar.k;
        }

        public a a(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("feb8ce5", new Object[]{this, aVar});
            }
            this.i = aVar;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fe7db857", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("34357141", new Object[]{this, jSONObject});
            }
            this.c = jSONObject;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("366e9376", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6e5f6e95", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a65049b4", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public a a(MediaContentDetailData mediaContentDetailData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b708682e", new Object[]{this, mediaContentDetailData});
            }
            this.j = (JSONObject) JSON.toJSON(mediaContentDetailData);
            return this;
        }

        public a b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("37bd1442", new Object[]{this, jSONObject});
            }
            this.k = jSONObject;
            return this;
        }

        public a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3db6d461", new Object[]{this});
            }
            this.f12623a = TimeStampManager.instance().getCurrentTimeStamp();
            this.f = "1";
            this.e = "1";
            this.l = String.valueOf(sjt.u());
            return this;
        }

        public DetailCacheData b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DetailCacheData) ipChange.ipc$dispatch("baac16dd", new Object[]{this}) : new DetailCacheData(this);
        }
    }
}

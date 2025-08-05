package com.taobao.cus.config.model;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class CusContentModel implements Serializable {
    @JSONField(name = "downloadApk")
    public CusFileInfo downloadApk;
    @JSONField(name = "freqIntervalSecs")
    public long freqIntervalSecs;
    @JSONField(name = "hitAbConfig")
    public String hitAbConfig;
    @JSONField(name = "hitGroupMode")
    public String hitGroupMode;
    @JSONField(name = "hitType")
    public String hitType;
    @JSONField(name = "hitVersionRange")
    public String hitVersionRange;
    @JSONField(name = "id")
    public String id;
    @JSONField(name = "localAppVersion")
    public String localAppVersion;
    @JSONField(name = "matchResConfig")
    public JSONObject matchResConfig;
    @JSONField(name = "msgCode")
    public String msgCode;
    @JSONField(name = "msgInfo")
    public String msgInfo;
    @JSONField(name = "needUpdate")
    public boolean needUpdate;
    @JSONField(name = "nextRefreshTime")
    public long nextRefreshTime;
    @JSONField(name = "serverTimestamp")
    public long serverTimestamp;
    @JSONField(name = "success")
    public boolean success;
    @JSONField(name = "updateAppVersion")
    public String updateAppVersion;
    @JSONField(name = "updateStrategy")
    public String updateStrategy;

    /* loaded from: classes7.dex */
    public static class CusFileInfo implements Serializable {
        @JSONField(name = "fileSize")
        public String fileSize;
        @JSONField(name = "md5")
        public String md5;
        @JSONField(name = "url")
        public String url;

        static {
            kge.a(-923201370);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(17025087);
        kge.a(1028243835);
    }
}

package com.flybird.deploy.model;

import com.alipay.birdnest.platform.ConnectionUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import org.json.JSONObject;
import tb.idx;
import tb.idy;

/* loaded from: classes4.dex */
public class FBFullTplInfo implements IFBTplInfo, Serializable, idx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 8168785519973035345L;
    public String crossTime;
    public String crossVersion;
    public String data;
    public String expId;
    public String expInfo;
    public String expLog;
    public String format;
    public String gray;
    public JSONObject metaInfo;
    public String mobiletmsConfigKey;
    public String needRes;
    public String platform;
    public String publishVersion;
    public String requireTime;
    public String resInfo;
    public String rollBack;
    public String tag;
    public String time;
    public String tplHash;
    public String tplId;
    public String tplTrace;
    public String tplUrl;
    public String tplVersion;
    public boolean triedLoadCompatMetaInfoOnUsage = false;
    public String userId;

    public static void _fromJSONObject(JSONObject jSONObject, FBFullTplInfo fBFullTplInfo) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4df5ea0", new Object[]{jSONObject, fBFullTplInfo});
            return;
        }
        fBFullTplInfo.tag = jSONObject.optString("tag", null);
        fBFullTplInfo.tplId = jSONObject.optString("tplId", null);
        fBFullTplInfo.tplVersion = jSONObject.optString("tplVersion", null);
        fBFullTplInfo.publishVersion = jSONObject.optString("publishVersion", null);
        fBFullTplInfo.time = jSONObject.optString("time", null);
        fBFullTplInfo.platform = jSONObject.optString("platform", null);
        fBFullTplInfo.format = jSONObject.optString("format", null);
        fBFullTplInfo.data = jSONObject.optString("data", null);
        fBFullTplInfo.userId = jSONObject.optString("userId", null);
        fBFullTplInfo.gray = jSONObject.optString(com.taobao.android.weex_framework.util.a.ATOM_EXT_gray, null);
        fBFullTplInfo.rollBack = jSONObject.optString("rollBack", null);
        fBFullTplInfo.tplUrl = jSONObject.optString("tplUrl", null);
        fBFullTplInfo.tplHash = jSONObject.optString("tplHash", null);
        fBFullTplInfo.resInfo = jSONObject.optString("resInfo", null);
        fBFullTplInfo.needRes = jSONObject.optString("needRes", null);
        fBFullTplInfo.expId = jSONObject.optString("expId", null);
        fBFullTplInfo.expInfo = jSONObject.optString("expInfo", null);
        fBFullTplInfo.expLog = jSONObject.optString("expLog", null);
        fBFullTplInfo.crossVersion = jSONObject.optString("crossVersion", null);
        fBFullTplInfo.crossTime = jSONObject.optString("crossTime", null);
        fBFullTplInfo.requireTime = jSONObject.optString("requireTime", null);
        fBFullTplInfo.mobiletmsConfigKey = jSONObject.optString("mobiletmsConfigKey", null);
        fBFullTplInfo.metaInfo = jSONObject.optJSONObject("metaInfo");
        fBFullTplInfo.tplTrace = jSONObject.optString("tplTraceId", null);
    }

    public static void _toJSONObject(FBFullTplInfo fBFullTplInfo, JSONObject jSONObject) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2764ffdd", new Object[]{fBFullTplInfo, jSONObject});
        } else {
            jSONObject.put("tag", fBFullTplInfo.tag).put("tplId", fBFullTplInfo.tplId).put("tplVersion", fBFullTplInfo.tplVersion).put("publishVersion", fBFullTplInfo.publishVersion).put("time", fBFullTplInfo.time).put("platform", fBFullTplInfo.platform).put("format", fBFullTplInfo.format).put("data", fBFullTplInfo.data).put("userId", fBFullTplInfo.userId).put(com.taobao.android.weex_framework.util.a.ATOM_EXT_gray, fBFullTplInfo.gray).put("rollBack", fBFullTplInfo.rollBack).put("tplUrl", fBFullTplInfo.tplUrl).put("tplHash", fBFullTplInfo.tplHash).put("resInfo", fBFullTplInfo.resInfo).put("needRes", fBFullTplInfo.needRes).put("expId", fBFullTplInfo.expId).put("expInfo", fBFullTplInfo.expInfo).put("expLog", fBFullTplInfo.expLog).put("crossVersion", fBFullTplInfo.crossVersion).put("crossTime", fBFullTplInfo.crossTime).put("requireTime", fBFullTplInfo.requireTime).put("mobiletmsConfigKey", fBFullTplInfo.mobiletmsConfigKey).put("metaInfo", fBFullTplInfo.metaInfo).put("tplTraceId", fBFullTplInfo.tplTrace);
        }
    }

    public static FBFullTplInfo fromJSONObject(JSONObject jSONObject) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBFullTplInfo) ipChange.ipc$dispatch("855533e9", new Object[]{jSONObject});
        }
        FBFullTplInfo fBFullTplInfo = new FBFullTplInfo();
        _fromJSONObject(jSONObject, fBFullTplInfo);
        return fBFullTplInfo;
    }

    public static FBFullTplInfo fromJSONString(String str) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FBFullTplInfo) ipChange.ipc$dispatch("547d6adb", new Object[]{str}) : fromJSONObject(ConnectionUtils.d(str));
    }

    public static JSONObject toJSONObject(FBFullTplInfo fBFullTplInfo) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("34dbf110", new Object[]{fBFullTplInfo});
        }
        JSONObject jSONObject = new JSONObject();
        _toJSONObject(fBFullTplInfo, jSONObject);
        return jSONObject;
    }

    public static String toJSONString(FBFullTplInfo fBFullTplInfo) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d4d8c2c", new Object[]{fBFullTplInfo}) : toJSONObject(fBFullTplInfo).toString();
    }

    public String getCrossTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("856b3ee2", new Object[]{this}) : this.crossTime;
    }

    public String getCrossVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("524288cb", new Object[]{this}) : this.crossVersion;
    }

    public String getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f6b2ad9", new Object[]{this}) : this.data;
    }

    public String getExpId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bceb39d7", new Object[]{this}) : this.expId;
    }

    public String getExpInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("90e289e4", new Object[]{this}) : this.expInfo;
    }

    public String getExpLog() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a9a0d83c", new Object[]{this}) : this.expLog;
    }

    public String getFormat() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1cf61a2c", new Object[]{this}) : this.format;
    }

    public String getGray() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a2f1adc0", new Object[]{this}) : this.gray;
    }

    public JSONObject getMetaInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("5d1a82be", new Object[]{this}) : this.metaInfo;
    }

    public String getMobiletmsConfigKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("71a7167e", new Object[]{this}) : this.mobiletmsConfigKey;
    }

    public String getNeedRes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e3b2cb85", new Object[]{this}) : this.needRes;
    }

    public String getPlatform() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("611384b0", new Object[]{this}) : this.platform;
    }

    public String getPublishVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b85ea69a", new Object[]{this}) : this.publishVersion;
    }

    public String getRequireTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5c193dd", new Object[]{this}) : this.requireTime;
    }

    public String getResInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9007a4c1", new Object[]{this}) : this.resInfo;
    }

    public String getRollBack() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("29036ebf", new Object[]{this}) : this.rollBack;
    }

    public String getTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this}) : this.tag;
    }

    public String getTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("75382b96", new Object[]{this}) : this.time;
    }

    public String getTplHash() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a1cc4591", new Object[]{this}) : this.tplHash;
    }

    public String getTplId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c71e7524", new Object[]{this}) : this.tplId;
    }

    public String getTplTrace() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e20084ae", new Object[]{this}) : this.tplTrace;
    }

    public String getTplUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("41147d44", new Object[]{this}) : this.tplUrl;
    }

    public String getTplVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4df7547b", new Object[]{this}) : this.tplVersion;
    }

    public String getUserId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this}) : this.userId;
    }

    @Override // tb.idx
    public long toChecksum() throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f76d8959", new Object[]{this})).longValue() : idy.a(this.tag, this.tplId, this.tplVersion, this.publishVersion, this.time, this.platform, this.format, this.data, this.userId, this.gray, this.rollBack, this.tplUrl, this.tplHash, this.resInfo, this.needRes, this.expId, this.expInfo, this.expLog, this.crossVersion, this.crossTime, this.requireTime);
    }

    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FBFullTplInfo{tag='");
        sb.append(this.tag);
        sb.append('\'');
        sb.append(", tplId='");
        sb.append(this.tplId);
        sb.append('\'');
        sb.append(", tplVersion='");
        sb.append(this.tplVersion);
        sb.append('\'');
        sb.append(", publishVersion='");
        sb.append(this.publishVersion);
        sb.append('\'');
        sb.append(", time='");
        sb.append(this.time);
        sb.append('\'');
        sb.append(", configKey'");
        sb.append(this.mobiletmsConfigKey);
        sb.append('\'');
        sb.append(", data='");
        String str2 = "null";
        if (this.data == null) {
            str = str2;
        } else {
            str = this.data.length() + "chars";
        }
        sb.append(str);
        sb.append('\'');
        sb.append(", metaInfo='");
        if (this.metaInfo != null) {
            str2 = this.metaInfo.length() + "items";
        }
        sb.append(str2);
        sb.append('\'');
        sb.append(", ... }");
        return sb.toString();
    }
}

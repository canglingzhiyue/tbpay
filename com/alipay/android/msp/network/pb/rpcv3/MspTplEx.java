package com.alipay.android.msp.network.pb.rpcv3;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.utils.JsonUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes3.dex */
public final class MspTplEx extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_EXTINFO = "";
    public static final String DEFAULT_FORMAT = "";
    public static final String DEFAULT_PLATFORM = "";
    public static final String DEFAULT_PUBLISHVERSION = "";
    public static final String DEFAULT_TAG = "";
    public static final String DEFAULT_TIME = "";
    public static final String DEFAULT_TPLID = "";
    public static final String DEFAULT_TPLVERSION = "";
    public static final int TAG_EXTINFO = 8;
    public static final int TAG_FORMAT = 1;
    public static final int TAG_PLATFORM = 2;
    public static final int TAG_PUBLISHVERSION = 3;
    public static final int TAG_TAG = 4;
    public static final int TAG_TIME = 5;
    public static final int TAG_TPLID = 6;
    public static final int TAG_TPLVERSION = 7;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public String extinfo;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String format;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String platform;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public String publishVersion;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public String tag;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public String time;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public String tplId;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public String tplVersion;

    public MspTplEx(MspTplEx mspTplEx) {
        super(mspTplEx);
        if (mspTplEx == null) {
            return;
        }
        this.format = mspTplEx.format;
        this.platform = mspTplEx.platform;
        this.publishVersion = mspTplEx.publishVersion;
        this.tag = mspTplEx.tag;
        this.time = mspTplEx.time;
        this.tplId = mspTplEx.tplId;
        this.tplVersion = mspTplEx.tplVersion;
        this.extinfo = mspTplEx.extinfo;
    }

    public MspTplEx() {
    }

    public final MspTplEx fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspTplEx) ipChange.ipc$dispatch("4f6cc7e1", new Object[]{this, new Integer(i), obj});
        }
        switch (i) {
            case 1:
                this.format = (String) obj;
                break;
            case 2:
                this.platform = (String) obj;
                break;
            case 3:
                this.publishVersion = (String) obj;
                break;
            case 4:
                this.tag = (String) obj;
                break;
            case 5:
                this.time = (String) obj;
                break;
            case 6:
                this.tplId = (String) obj;
                break;
            case 7:
                this.tplVersion = (String) obj;
                break;
            case 8:
                this.extinfo = (String) obj;
                break;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MspTplEx)) {
            return false;
        }
        MspTplEx mspTplEx = (MspTplEx) obj;
        return equals(this.format, mspTplEx.format) && equals(this.platform, mspTplEx.platform) && equals(this.publishVersion, mspTplEx.publishVersion) && equals(this.tag, mspTplEx.tag) && equals(this.time, mspTplEx.time) && equals(this.tplId, mspTplEx.tplId) && equals(this.tplVersion, mspTplEx.tplVersion) && equals(this.extinfo, mspTplEx.extinfo);
    }

    public final int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        String str = this.format;
        int hashCode = (str != null ? str.hashCode() : 0) * 37;
        String str2 = this.platform;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.publishVersion;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.tag;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.time;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.tplId;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.tplVersion;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.extinfo;
        if (str8 != null) {
            i = str8.hashCode();
        }
        int i3 = hashCode7 + i;
        this.hashCode = i3;
        return i3;
    }

    public final String format(String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27a69e58", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(this.time)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("platform", (Object) (!TextUtils.isEmpty(this.platform) ? this.platform : "common"));
        jSONObject.put("format", (Object) (!TextUtils.isEmpty(this.format) ? this.format : "JSON"));
        jSONObject.put("tag", (Object) (!TextUtils.isEmpty(this.tag) ? this.tag : "QUICKPAY"));
        jSONObject.put("publishVersion", (Object) this.publishVersion);
        jSONObject.put("tplVersion", (Object) this.tplVersion);
        jSONObject.put("time", (Object) this.time);
        if (!TextUtils.isEmpty(this.tplId)) {
            str = this.tplId;
        } else if (str == null) {
            str = "";
        }
        jSONObject.put("tplId", (Object) str);
        JsonUtil.addExtInfo(this.extinfo, jSONObject);
        return jSONObject.toString() + " ";
    }
}

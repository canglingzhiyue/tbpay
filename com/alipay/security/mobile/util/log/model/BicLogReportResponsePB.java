package com.alipay.security.mobile.util.log.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes3.dex */
public final class BicLogReportResponsePB extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_ERRCODE = "";
    public static final String DEFAULT_ERRMSG = "";
    public static final Boolean DEFAULT_SUCCESS = false;
    public static final int TAG_ERRCODE = 2;
    public static final int TAG_ERRMSG = 3;
    public static final int TAG_EXTINFO = 4;
    public static final int TAG_SUCCESS = 1;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String errCode;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public String errMsg;
    @ProtoField(tag = 4)
    public MapStringString extInfo;
    @ProtoField(tag = 1, type = Message.Datatype.BOOL)
    public Boolean success;

    public BicLogReportResponsePB(BicLogReportResponsePB bicLogReportResponsePB) {
        super(bicLogReportResponsePB);
        if (bicLogReportResponsePB == null) {
            return;
        }
        this.success = bicLogReportResponsePB.success;
        this.errCode = bicLogReportResponsePB.errCode;
        this.errMsg = bicLogReportResponsePB.errMsg;
        this.extInfo = bicLogReportResponsePB.extInfo;
    }

    public BicLogReportResponsePB() {
    }

    public BicLogReportResponsePB fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BicLogReportResponsePB) ipChange.ipc$dispatch("e48708af", new Object[]{this, new Integer(i), obj});
        }
        if (i == 1) {
            this.success = (Boolean) obj;
        } else if (i == 2) {
            this.errCode = (String) obj;
        } else if (i == 3) {
            this.errMsg = (String) obj;
        } else if (i == 4) {
            this.extInfo = (MapStringString) obj;
        }
        return this;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BicLogReportResponsePB)) {
            return false;
        }
        BicLogReportResponsePB bicLogReportResponsePB = (BicLogReportResponsePB) obj;
        return equals(this.success, bicLogReportResponsePB.success) && equals(this.errCode, bicLogReportResponsePB.errCode) && equals(this.errMsg, bicLogReportResponsePB.errMsg) && equals(this.extInfo, bicLogReportResponsePB.extInfo);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        Boolean bool = this.success;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 37;
        String str = this.errCode;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.errMsg;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        MapStringString mapStringString = this.extInfo;
        if (mapStringString != null) {
            i = mapStringString.hashCode();
        }
        int i3 = hashCode3 + i;
        this.hashCode = i3;
        return i3;
    }
}

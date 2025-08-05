package com.alipay.android.msp.network.pb.v3;

import com.alipay.android.msp.framework.wire.Message;
import com.alipay.android.msp.framework.wire.ProtoField;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class MspReqV3 extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_ACTION = "";
    public static final String DEFAULT_API_NM = "";
    public static final String DEFAULT_API_NSP = "";
    public static final String DEFAULT_APP_KEY = "";
    public static final String DEFAULT_DECAY = "";
    public static final String DEFAULT_EXTERNAL_INFO = "";
    public static final String DEFAULT_EXTINFO = "";
    public static final String DEFAULT_SECDATA = "";
    public static final String DEFAULT_SESSION = "";
    public static final String DEFAULT_SUBUA1 = "";
    public static final String DEFAULT_SUBUA2 = "";
    public static final String DEFAULT_SUBUA3 = "";
    public static final String DEFAULT_SYNCH = "";
    public static final String DEFAULT_TRID = "";
    public static final String DEFAULT_USER_ID = "";
    public static final int TAG_ACTION = 3;
    public static final int TAG_API_NM = 2;
    public static final int TAG_API_NSP = 1;
    public static final int TAG_APP_KEY = 14;
    public static final int TAG_CERTPAY = 19;
    public static final int TAG_DECAY = 5;
    public static final int TAG_EXTERNAL_INFO = 6;
    public static final int TAG_EXTINFO = 18;
    public static final int TAG_HASALIPAY = 13;
    public static final int TAG_LOCLOGINONCE = 12;
    public static final int TAG_SECDATA = 7;
    public static final int TAG_SESSION = 9;
    public static final int TAG_SUBUA1 = 15;
    public static final int TAG_SUBUA2 = 16;
    public static final int TAG_SUBUA3 = 17;
    public static final int TAG_SYNCH = 4;
    public static final int TAG_TRDFROM = 11;
    public static final int TAG_TRID = 10;
    public static final int TAG_USER_ID = 8;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public String action;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String api_nm;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String api_nsp;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public String app_key;
    @ProtoField(tag = 19, type = Message.Datatype.INT32)
    public Integer certpay;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public String decay;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public String external_info;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public String extinfo;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public Integer hasAlipay;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public Integer locLoginOnce;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public String secData;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public String session;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public String subua1;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public String subua2;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public String subua3;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public String synch;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public Integer trdfrom;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public String trid;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public String user_id;
    public static final Integer DEFAULT_TRDFROM = 0;
    public static final Integer DEFAULT_LOCLOGINONCE = 0;
    public static final Integer DEFAULT_HASALIPAY = 0;
    public static final Integer DEFAULT_CERTPAY = 0;

    public MspReqV3(MspReqV3 mspReqV3) {
        super(mspReqV3);
        if (mspReqV3 == null) {
            return;
        }
        this.api_nsp = mspReqV3.api_nsp;
        this.api_nm = mspReqV3.api_nm;
        this.action = mspReqV3.action;
        this.synch = mspReqV3.synch;
        this.decay = mspReqV3.decay;
        this.external_info = mspReqV3.external_info;
        this.secData = mspReqV3.secData;
        this.user_id = mspReqV3.user_id;
        this.session = mspReqV3.session;
        this.trid = mspReqV3.trid;
        this.trdfrom = mspReqV3.trdfrom;
        this.locLoginOnce = mspReqV3.locLoginOnce;
        this.hasAlipay = mspReqV3.hasAlipay;
        this.app_key = mspReqV3.app_key;
        this.subua1 = mspReqV3.subua1;
        this.subua2 = mspReqV3.subua2;
        this.subua3 = mspReqV3.subua3;
        this.extinfo = mspReqV3.extinfo;
        this.certpay = mspReqV3.certpay;
    }

    public MspReqV3() {
    }

    public final MspReqV3 fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspReqV3) ipChange.ipc$dispatch("241b8e2c", new Object[]{this, new Integer(i), obj});
        }
        switch (i) {
            case 1:
                this.api_nsp = (String) obj;
                break;
            case 2:
                this.api_nm = (String) obj;
                break;
            case 3:
                this.action = (String) obj;
                break;
            case 4:
                this.synch = (String) obj;
                break;
            case 5:
                this.decay = (String) obj;
                break;
            case 6:
                this.external_info = (String) obj;
                break;
            case 7:
                this.secData = (String) obj;
                break;
            case 8:
                this.user_id = (String) obj;
                break;
            case 9:
                this.session = (String) obj;
                break;
            case 10:
                this.trid = (String) obj;
                break;
            case 11:
                this.trdfrom = (Integer) obj;
                break;
            case 12:
                this.locLoginOnce = (Integer) obj;
                break;
            case 13:
                this.hasAlipay = (Integer) obj;
                break;
            case 14:
                this.app_key = (String) obj;
                break;
            case 15:
                this.subua1 = (String) obj;
                break;
            case 16:
                this.subua2 = (String) obj;
                break;
            case 17:
                this.subua3 = (String) obj;
                break;
            case 18:
                this.extinfo = (String) obj;
                break;
            case 19:
                this.certpay = (Integer) obj;
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
        if (!(obj instanceof MspReqV3)) {
            return false;
        }
        MspReqV3 mspReqV3 = (MspReqV3) obj;
        return a(this.api_nsp, mspReqV3.api_nsp) && a(this.api_nm, mspReqV3.api_nm) && a(this.action, mspReqV3.action) && a(this.synch, mspReqV3.synch) && a(this.decay, mspReqV3.decay) && a(this.external_info, mspReqV3.external_info) && a(this.secData, mspReqV3.secData) && a(this.user_id, mspReqV3.user_id) && a(this.session, mspReqV3.session) && a(this.trid, mspReqV3.trid) && a(this.trdfrom, mspReqV3.trdfrom) && a(this.locLoginOnce, mspReqV3.locLoginOnce) && a(this.hasAlipay, mspReqV3.hasAlipay) && a(this.app_key, mspReqV3.app_key) && a(this.subua1, mspReqV3.subua1) && a(this.subua2, mspReqV3.subua2) && a(this.subua3, mspReqV3.subua3) && a(this.extinfo, mspReqV3.extinfo) && a(this.certpay, mspReqV3.certpay);
    }

    public final int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i2 = this.b;
        if (i2 != 0) {
            return i2;
        }
        String str = this.api_nsp;
        int hashCode = (str != null ? str.hashCode() : 0) * 37;
        String str2 = this.api_nm;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.action;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.synch;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.decay;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.external_info;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.secData;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.user_id;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.session;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.trid;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 37;
        Integer num = this.trdfrom;
        int hashCode11 = (hashCode10 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.locLoginOnce;
        int hashCode12 = (hashCode11 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.hasAlipay;
        int hashCode13 = (hashCode12 + (num3 != null ? num3.hashCode() : 0)) * 37;
        String str11 = this.app_key;
        int hashCode14 = (hashCode13 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.subua1;
        int hashCode15 = (hashCode14 + (str12 != null ? str12.hashCode() : 0)) * 37;
        String str13 = this.subua2;
        int hashCode16 = (hashCode15 + (str13 != null ? str13.hashCode() : 0)) * 37;
        String str14 = this.subua3;
        int hashCode17 = (hashCode16 + (str14 != null ? str14.hashCode() : 0)) * 37;
        String str15 = this.extinfo;
        int hashCode18 = (hashCode17 + (str15 != null ? str15.hashCode() : 0)) * 37;
        Integer num4 = this.certpay;
        if (num4 != null) {
            i = num4.hashCode();
        }
        int i3 = hashCode18 + i;
        this.b = i3;
        return i3;
    }
}

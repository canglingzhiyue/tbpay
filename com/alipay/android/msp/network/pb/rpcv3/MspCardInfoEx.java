package com.alipay.android.msp.network.pb.rpcv3;

import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes3.dex */
public final class MspCardInfoEx extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_BANKNAME = "";
    public static final String DEFAULT_CARDNO = "";
    public static final String DEFAULT_EXTINFO = "";
    public static final String DEFAULT_INSTID = "";
    public static final String DEFAULT_PRINCIPALID = "";
    public static final String DEFAULT_SIGNID = "";
    public static final String DEFAULT_USERNAME = "";
    public static final int TAG_BANKNAME = 1;
    public static final int TAG_CARDNO = 2;
    public static final int TAG_EXTINFO = 7;
    public static final int TAG_INSTID = 3;
    public static final int TAG_PRINCIPALID = 4;
    public static final int TAG_SIGNID = 5;
    public static final int TAG_USERNAME = 6;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String bankName;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String cardNo;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public String extinfo;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public String instId;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public String principalId;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public String signId;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public String userName;

    public MspCardInfoEx(MspCardInfoEx mspCardInfoEx) {
        super(mspCardInfoEx);
        if (mspCardInfoEx == null) {
            return;
        }
        this.bankName = mspCardInfoEx.bankName;
        this.cardNo = mspCardInfoEx.cardNo;
        this.instId = mspCardInfoEx.instId;
        this.principalId = mspCardInfoEx.principalId;
        this.signId = mspCardInfoEx.signId;
        this.userName = mspCardInfoEx.userName;
        this.extinfo = mspCardInfoEx.extinfo;
    }

    public MspCardInfoEx() {
    }

    public final MspCardInfoEx fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspCardInfoEx) ipChange.ipc$dispatch("95eb141", new Object[]{this, new Integer(i), obj});
        }
        switch (i) {
            case 1:
                this.bankName = (String) obj;
                break;
            case 2:
                this.cardNo = (String) obj;
                break;
            case 3:
                this.instId = (String) obj;
                break;
            case 4:
                this.principalId = (String) obj;
                break;
            case 5:
                this.signId = (String) obj;
                break;
            case 6:
                this.userName = (String) obj;
                break;
            case 7:
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
        if (!(obj instanceof MspCardInfoEx)) {
            return false;
        }
        MspCardInfoEx mspCardInfoEx = (MspCardInfoEx) obj;
        return equals(this.bankName, mspCardInfoEx.bankName) && equals(this.cardNo, mspCardInfoEx.cardNo) && equals(this.instId, mspCardInfoEx.instId) && equals(this.principalId, mspCardInfoEx.principalId) && equals(this.signId, mspCardInfoEx.signId) && equals(this.userName, mspCardInfoEx.userName) && equals(this.extinfo, mspCardInfoEx.extinfo);
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
        String str = this.bankName;
        int hashCode = (str != null ? str.hashCode() : 0) * 37;
        String str2 = this.cardNo;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.instId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.principalId;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.signId;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.userName;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.extinfo;
        if (str7 != null) {
            i = str7.hashCode();
        }
        int i3 = hashCode6 + i;
        this.hashCode = i3;
        return i3;
    }
}

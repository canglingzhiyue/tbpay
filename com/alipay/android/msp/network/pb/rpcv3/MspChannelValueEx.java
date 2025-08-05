package com.alipay.android.msp.network.pb.rpcv3;

import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes3.dex */
public final class MspChannelValueEx extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_ASSIGNEDCHANNEL = "";
    public static final String DEFAULT_AVAILABLEAMOUNT = "";
    public static final String DEFAULT_CHANNELFULLNAME = "";
    public static final String DEFAULT_CHANNELINDEX = "";
    public static final String DEFAULT_CHANNELNAME = "";
    public static final String DEFAULT_CHANNELTYPE = "";
    public static final String DEFAULT_EXTINFO = "";
    public static final Integer DEFAULT_LARGELIMITSIGNABLE = 0;
    public static final int TAG_ASSIGNEDCHANNEL = 1;
    public static final int TAG_AVAILABLEAMOUNT = 2;
    public static final int TAG_CARDINFO = 3;
    public static final int TAG_CHANNELFULLNAME = 4;
    public static final int TAG_CHANNELINDEX = 5;
    public static final int TAG_CHANNELNAME = 6;
    public static final int TAG_CHANNELTYPE = 7;
    public static final int TAG_EXTINFO = 9;
    public static final int TAG_LARGELIMITSIGNABLE = 8;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String assignedChannel;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String availableAmount;
    @ProtoField(tag = 3)
    public MspCardInfoEx cardInfo;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public String channelFullName;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public String channelIndex;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public String channelName;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public String channelType;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public String extinfo;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public Integer largeLimitSignable;

    public MspChannelValueEx(MspChannelValueEx mspChannelValueEx) {
        super(mspChannelValueEx);
        if (mspChannelValueEx == null) {
            return;
        }
        this.assignedChannel = mspChannelValueEx.assignedChannel;
        this.availableAmount = mspChannelValueEx.availableAmount;
        this.cardInfo = mspChannelValueEx.cardInfo;
        this.channelFullName = mspChannelValueEx.channelFullName;
        this.channelIndex = mspChannelValueEx.channelIndex;
        this.channelName = mspChannelValueEx.channelName;
        this.channelType = mspChannelValueEx.channelType;
        this.largeLimitSignable = mspChannelValueEx.largeLimitSignable;
        this.extinfo = mspChannelValueEx.extinfo;
    }

    public MspChannelValueEx() {
    }

    public final MspChannelValueEx fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspChannelValueEx) ipChange.ipc$dispatch("8aaa6971", new Object[]{this, new Integer(i), obj});
        }
        switch (i) {
            case 1:
                this.assignedChannel = (String) obj;
                break;
            case 2:
                this.availableAmount = (String) obj;
                break;
            case 3:
                this.cardInfo = (MspCardInfoEx) obj;
                break;
            case 4:
                this.channelFullName = (String) obj;
                break;
            case 5:
                this.channelIndex = (String) obj;
                break;
            case 6:
                this.channelName = (String) obj;
                break;
            case 7:
                this.channelType = (String) obj;
                break;
            case 8:
                this.largeLimitSignable = (Integer) obj;
                break;
            case 9:
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
        if (!(obj instanceof MspChannelValueEx)) {
            return false;
        }
        MspChannelValueEx mspChannelValueEx = (MspChannelValueEx) obj;
        return equals(this.assignedChannel, mspChannelValueEx.assignedChannel) && equals(this.availableAmount, mspChannelValueEx.availableAmount) && equals(this.cardInfo, mspChannelValueEx.cardInfo) && equals(this.channelFullName, mspChannelValueEx.channelFullName) && equals(this.channelIndex, mspChannelValueEx.channelIndex) && equals(this.channelName, mspChannelValueEx.channelName) && equals(this.channelType, mspChannelValueEx.channelType) && equals(this.largeLimitSignable, mspChannelValueEx.largeLimitSignable) && equals(this.extinfo, mspChannelValueEx.extinfo);
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
        String str = this.assignedChannel;
        int hashCode = (str != null ? str.hashCode() : 0) * 37;
        String str2 = this.availableAmount;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 37;
        MspCardInfoEx mspCardInfoEx = this.cardInfo;
        int hashCode3 = (hashCode2 + (mspCardInfoEx != null ? mspCardInfoEx.hashCode() : 0)) * 37;
        String str3 = this.channelFullName;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.channelIndex;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.channelName;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.channelType;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Integer num = this.largeLimitSignable;
        int hashCode8 = (hashCode7 + (num != null ? num.hashCode() : 0)) * 37;
        String str7 = this.extinfo;
        if (str7 != null) {
            i = str7.hashCode();
        }
        int i3 = hashCode8 + i;
        this.hashCode = i3;
        return i3;
    }
}

package com.alipay.android.msp.network.pb.v3;

import com.alipay.android.msp.framework.wire.Message;
import com.alipay.android.msp.framework.wire.ProtoField;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class MspChannelValue extends Message {
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
    public MspCardInfo cardInfo;
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

    public MspChannelValue(MspChannelValue mspChannelValue) {
        super(mspChannelValue);
        if (mspChannelValue == null) {
            return;
        }
        this.assignedChannel = mspChannelValue.assignedChannel;
        this.availableAmount = mspChannelValue.availableAmount;
        this.cardInfo = mspChannelValue.cardInfo;
        this.channelFullName = mspChannelValue.channelFullName;
        this.channelIndex = mspChannelValue.channelIndex;
        this.channelName = mspChannelValue.channelName;
        this.channelType = mspChannelValue.channelType;
        this.largeLimitSignable = mspChannelValue.largeLimitSignable;
        this.extinfo = mspChannelValue.extinfo;
    }

    public MspChannelValue() {
    }

    public final MspChannelValue fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspChannelValue) ipChange.ipc$dispatch("af3de001", new Object[]{this, new Integer(i), obj});
        }
        switch (i) {
            case 1:
                this.assignedChannel = (String) obj;
                break;
            case 2:
                this.availableAmount = (String) obj;
                break;
            case 3:
                this.cardInfo = (MspCardInfo) obj;
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
        if (!(obj instanceof MspChannelValue)) {
            return false;
        }
        MspChannelValue mspChannelValue = (MspChannelValue) obj;
        return a(this.assignedChannel, mspChannelValue.assignedChannel) && a(this.availableAmount, mspChannelValue.availableAmount) && a(this.cardInfo, mspChannelValue.cardInfo) && a(this.channelFullName, mspChannelValue.channelFullName) && a(this.channelIndex, mspChannelValue.channelIndex) && a(this.channelName, mspChannelValue.channelName) && a(this.channelType, mspChannelValue.channelType) && a(this.largeLimitSignable, mspChannelValue.largeLimitSignable) && a(this.extinfo, mspChannelValue.extinfo);
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
        String str = this.assignedChannel;
        int hashCode = (str != null ? str.hashCode() : 0) * 37;
        String str2 = this.availableAmount;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 37;
        MspCardInfo mspCardInfo = this.cardInfo;
        int hashCode3 = (hashCode2 + (mspCardInfo != null ? mspCardInfo.hashCode() : 0)) * 37;
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
        this.b = i3;
        return i3;
    }
}

package com.alipay.android.msp.network.pb.rpcv3;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.utils.JsonUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import com.taobao.android.detail.wrapper.ext.floatview.c;
import com.taobao.weex.common.Constants;
import tb.jyx;

/* loaded from: classes3.dex */
public final class MspPaymentEx extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_AVAILABLETITLE = "";
    public static final String DEFAULT_CHILDREN = "";
    public static final String DEFAULT_CLOSEMSG = "";
    public static final String DEFAULT_DETAIL = "";
    public static final String DEFAULT_DETAILACTION = "";
    public static final String DEFAULT_DISCOUNTTITLE = "";
    public static final String DEFAULT_DLG = "";
    public static final String DEFAULT_ENDCODE = "";
    public static final String DEFAULT_EXTINFO = "";
    public static final String DEFAULT_FANTITLE = "";
    public static final String DEFAULT_HUITITLE = "";
    public static final String DEFAULT_LOGO = "";
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_PAYMENTFLAG = 0;
    public static final String DEFAULT_TAIL = "";
    public static final String DEFAULT_VALUE = "";
    public static final int TAG_AVAILABLETITLE = 11;
    public static final int TAG_CHANNELVALUE = 16;
    public static final int TAG_CHILDREN = 9;
    public static final int TAG_CLOSEMSG = 10;
    public static final int TAG_DETAIL = 7;
    public static final int TAG_DETAILACTION = 5;
    public static final int TAG_DISCOUNTTITLE = 12;
    public static final int TAG_DLG = 8;
    public static final int TAG_ENDCODE = 15;
    public static final int TAG_EXTINFO = 17;
    public static final int TAG_FANTITLE = 13;
    public static final int TAG_HUITITLE = 14;
    public static final int TAG_LOGO = 2;
    public static final int TAG_NAME = 3;
    public static final int TAG_PAYMENTFLAG = 1;
    public static final int TAG_TAIL = 4;
    public static final int TAG_VALUE = 6;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public String availableTitle;
    @ProtoField(tag = 16)
    public MspChannelValueEx channelValue;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public String children;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public String closeMsg;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public String detail;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public String detailAction;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public String discountTitle;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public String dlg;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public String endCode;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public String extinfo;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public String fanTitle;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public String huiTitle;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public String logo;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public String name;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public Integer paymentFlag;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public String tail;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public String value;

    public MspPaymentEx(MspPaymentEx mspPaymentEx) {
        super(mspPaymentEx);
        if (mspPaymentEx == null) {
            return;
        }
        this.paymentFlag = mspPaymentEx.paymentFlag;
        this.logo = mspPaymentEx.logo;
        this.name = mspPaymentEx.name;
        this.tail = mspPaymentEx.tail;
        this.detailAction = mspPaymentEx.detailAction;
        this.value = mspPaymentEx.value;
        this.detail = mspPaymentEx.detail;
        this.dlg = mspPaymentEx.dlg;
        this.children = mspPaymentEx.children;
        this.closeMsg = mspPaymentEx.closeMsg;
        this.availableTitle = mspPaymentEx.availableTitle;
        this.discountTitle = mspPaymentEx.discountTitle;
        this.fanTitle = mspPaymentEx.fanTitle;
        this.huiTitle = mspPaymentEx.huiTitle;
        this.endCode = mspPaymentEx.endCode;
        this.channelValue = mspPaymentEx.channelValue;
        this.extinfo = mspPaymentEx.extinfo;
    }

    public MspPaymentEx() {
    }

    public final MspPaymentEx fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspPaymentEx) ipChange.ipc$dispatch("a5ec9b0b", new Object[]{this, new Integer(i), obj});
        }
        switch (i) {
            case 1:
                this.paymentFlag = (Integer) obj;
                break;
            case 2:
                this.logo = (String) obj;
                break;
            case 3:
                this.name = (String) obj;
                break;
            case 4:
                this.tail = (String) obj;
                break;
            case 5:
                this.detailAction = (String) obj;
                break;
            case 6:
                this.value = (String) obj;
                break;
            case 7:
                this.detail = (String) obj;
                break;
            case 8:
                this.dlg = (String) obj;
                break;
            case 9:
                this.children = (String) obj;
                break;
            case 10:
                this.closeMsg = (String) obj;
                break;
            case 11:
                this.availableTitle = (String) obj;
                break;
            case 12:
                this.discountTitle = (String) obj;
                break;
            case 13:
                this.fanTitle = (String) obj;
                break;
            case 14:
                this.huiTitle = (String) obj;
                break;
            case 15:
                this.endCode = (String) obj;
                break;
            case 16:
                this.channelValue = (MspChannelValueEx) obj;
                break;
            case 17:
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
        if (!(obj instanceof MspPaymentEx)) {
            return false;
        }
        MspPaymentEx mspPaymentEx = (MspPaymentEx) obj;
        return equals(this.paymentFlag, mspPaymentEx.paymentFlag) && equals(this.logo, mspPaymentEx.logo) && equals(this.name, mspPaymentEx.name) && equals(this.tail, mspPaymentEx.tail) && equals(this.detailAction, mspPaymentEx.detailAction) && equals(this.value, mspPaymentEx.value) && equals(this.detail, mspPaymentEx.detail) && equals(this.dlg, mspPaymentEx.dlg) && equals(this.children, mspPaymentEx.children) && equals(this.closeMsg, mspPaymentEx.closeMsg) && equals(this.availableTitle, mspPaymentEx.availableTitle) && equals(this.discountTitle, mspPaymentEx.discountTitle) && equals(this.fanTitle, mspPaymentEx.fanTitle) && equals(this.huiTitle, mspPaymentEx.huiTitle) && equals(this.endCode, mspPaymentEx.endCode) && equals(this.channelValue, mspPaymentEx.channelValue) && equals(this.extinfo, mspPaymentEx.extinfo);
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
        Integer num = this.paymentFlag;
        int hashCode = (num != null ? num.hashCode() : 0) * 37;
        String str = this.logo;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.tail;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.detailAction;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.value;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.detail;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.dlg;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.children;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.closeMsg;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.availableTitle;
        int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.discountTitle;
        int hashCode12 = (hashCode11 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.fanTitle;
        int hashCode13 = (hashCode12 + (str12 != null ? str12.hashCode() : 0)) * 37;
        String str13 = this.huiTitle;
        int hashCode14 = (hashCode13 + (str13 != null ? str13.hashCode() : 0)) * 37;
        String str14 = this.endCode;
        int hashCode15 = (hashCode14 + (str14 != null ? str14.hashCode() : 0)) * 37;
        MspChannelValueEx mspChannelValueEx = this.channelValue;
        int hashCode16 = (hashCode15 + (mspChannelValueEx != null ? mspChannelValueEx.hashCode() : 0)) * 37;
        String str15 = this.extinfo;
        if (str15 != null) {
            i = str15.hashCode();
        }
        int i3 = hashCode16 + i;
        this.hashCode = i3;
        return i3;
    }

    public final JSONObject formatPayChannel() throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8d895539", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        Integer num = this.paymentFlag;
        if (num != null) {
            if ((num.intValue() & 1) != 0) {
                jSONObject.put("hui", (Object) Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 2) != 0) {
                jSONObject.put("fan", (Object) Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 4) != 0) {
                jSONObject.put("busy", (Object) Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 8) != 0) {
                jSONObject.put("disable", (Object) Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 16) != 0) {
                jSONObject.put(Constants.Name.CHECKED, (Object) Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 32) != 0) {
                jSONObject.put("add", (Object) Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 64) != 0) {
                jSONObject.put("chargeFree", (Object) Boolean.TRUE);
            }
        }
        jSONObject.put(MspFlybirdDefine.FLYBIRD_DIALOG_LOGO, (Object) this.logo);
        jSONObject.put("name", (Object) this.name);
        jSONObject.put("tail", (Object) this.tail);
        jSONObject.put("detailAction", (Object) this.detailAction);
        jSONObject.put("value", (Object) this.value);
        jSONObject.put("detail", (Object) this.detail);
        jSONObject.put(MspFlybirdDefine.FLYBIRD_WIN_TYPE_DIALOG, (Object) JSON.parseObject(this.dlg));
        jSONObject.put("children", (Object) JSON.parseArray(this.children));
        JsonUtil.addExtInfo(this.extinfo, jSONObject);
        return jSONObject;
    }

    public final JSONObject formatPreChannel() throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97be045e", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        Integer num = this.paymentFlag;
        if (num != null) {
            if ((num.intValue() & 1) != 0) {
                jSONObject.put(jyx.a.POINT_NAME, Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 2) != 0) {
                jSONObject.put("busy", Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 4) != 0) {
                jSONObject.put(Constants.Name.CHECKED, Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 8) != 0) {
                jSONObject.put("discount", Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 16) != 0) {
                jSONObject.put("fan", Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 32) != 0) {
                jSONObject.put("hui", Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 64) != 0) {
                jSONObject.put("new_card", Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 128) != 0) {
                jSONObject.put("togo", Boolean.TRUE);
            }
            if ((this.paymentFlag.intValue() & 256) != 0) {
                jSONObject.put("usable", Boolean.TRUE);
            }
        }
        jSONObject.put(MspFlybirdDefine.FLYBIRD_DIALOG_LOGO, this.logo);
        jSONObject.put("name", this.name);
        jSONObject.put("tail", this.tail);
        jSONObject.put("detailAction", this.detailAction);
        jSONObject.put("close_msg", this.closeMsg);
        jSONObject.put("available_title", this.availableTitle);
        jSONObject.put("discount_title", this.discountTitle);
        jSONObject.put("fan_title", this.fanTitle);
        jSONObject.put("hui_title", this.huiTitle);
        jSONObject.put("end_code", this.endCode);
        if (this.channelValue != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assignedChannel", (Object) this.channelValue.assignedChannel);
            jSONObject2.put("availableAmount", (Object) this.channelValue.availableAmount);
            jSONObject2.put("channelFullName", (Object) this.channelValue.channelFullName);
            jSONObject2.put("channelIndex", (Object) this.channelValue.channelIndex);
            jSONObject2.put(c.CHANNEL_NAME, (Object) this.channelValue.channelName);
            jSONObject2.put("channelType", (Object) this.channelValue.channelType);
            if (this.channelValue.largeLimitSignable != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.channelValue.largeLimitSignable);
                jSONObject2.put("largeLimitSignable", (Object) sb.toString());
            }
            if (this.channelValue.cardInfo != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("bankName", (Object) this.channelValue.cardInfo.bankName);
                jSONObject3.put("cardNo", (Object) this.channelValue.cardInfo.cardNo);
                jSONObject3.put("instId", (Object) this.channelValue.cardInfo.instId);
                jSONObject3.put("principalId", (Object) this.channelValue.cardInfo.principalId);
                jSONObject3.put("signId", (Object) this.channelValue.cardInfo.signId);
                jSONObject3.put("userName", (Object) this.channelValue.cardInfo.userName);
                JsonUtil.addExtInfo(this.channelValue.cardInfo.extinfo, jSONObject3);
                jSONObject2.put("cardInfo", (Object) jSONObject3);
            }
            JsonUtil.addExtInfo(this.channelValue.extinfo, jSONObject2);
            jSONObject.put("value", (Object) jSONObject2);
        }
        JsonUtil.addExtInfo(this.extinfo, jSONObject);
        return jSONObject;
    }
}

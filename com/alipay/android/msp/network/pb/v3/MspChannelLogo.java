package com.alipay.android.msp.network.pb.v3;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.wire.Message;
import com.alipay.android.msp.framework.wire.ProtoField;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.sdk.sys.BizContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.core.b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class MspChannelLogo extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_BIZTYPE = "";
    public static final String DEFAULT_EXTINFO = "";
    public static final String DEFAULT_NEWCARDCHANNEL = "";
    public static final int TAG_BIZTYPE = 3;
    public static final int TAG_EXIT = 1;
    public static final int TAG_EXTINFO = 6;
    public static final int TAG_NEWCARDCHANNEL = 5;
    public static final int TAG_PAYMENTS = 4;
    public static final int TAG_SETTING = 2;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public String biztype;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public Integer exit;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public String extinfo;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public String newCardChannel;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public List<MspPayment> payments;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public Integer setting;
    public static final Integer DEFAULT_EXIT = 0;
    public static final Integer DEFAULT_SETTING = 0;
    public static final List<MspPayment> DEFAULT_PAYMENTS = Collections.emptyList();

    public MspChannelLogo(MspChannelLogo mspChannelLogo) {
        super(mspChannelLogo);
        if (mspChannelLogo == null) {
            return;
        }
        this.exit = mspChannelLogo.exit;
        this.setting = mspChannelLogo.setting;
        this.biztype = mspChannelLogo.biztype;
        this.payments = a(mspChannelLogo.payments);
        this.newCardChannel = mspChannelLogo.newCardChannel;
        this.extinfo = mspChannelLogo.extinfo;
    }

    public MspChannelLogo() {
    }

    public final MspChannelLogo fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspChannelLogo) ipChange.ipc$dispatch("78bd6df9", new Object[]{this, new Integer(i), obj});
        }
        switch (i) {
            case 1:
                this.exit = (Integer) obj;
                break;
            case 2:
                this.setting = (Integer) obj;
                break;
            case 3:
                this.biztype = (String) obj;
                break;
            case 4:
                this.payments = b((List) obj);
                break;
            case 5:
                this.newCardChannel = (String) obj;
                break;
            case 6:
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
        if (!(obj instanceof MspChannelLogo)) {
            return false;
        }
        MspChannelLogo mspChannelLogo = (MspChannelLogo) obj;
        return a(this.exit, mspChannelLogo.exit) && a(this.setting, mspChannelLogo.setting) && a(this.biztype, mspChannelLogo.biztype) && a((List<?>) this.payments, (List<?>) mspChannelLogo.payments) && a(this.newCardChannel, mspChannelLogo.newCardChannel) && a(this.extinfo, mspChannelLogo.extinfo);
    }

    public final int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 1;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i3 = this.b;
        if (i3 != 0) {
            return i3;
        }
        Integer num = this.exit;
        int hashCode = (num != null ? num.hashCode() : 0) * 37;
        Integer num2 = this.setting;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 37;
        String str = this.biztype;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        List<MspPayment> list = this.payments;
        if (list != null) {
            i = list.hashCode();
        }
        int i4 = (hashCode3 + i) * 37;
        String str2 = this.newCardChannel;
        int hashCode4 = (i4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.extinfo;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        int i5 = hashCode4 + i2;
        this.b = i5;
        return i5;
    }

    public final String format(boolean z) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d93069ca", new Object[]{this, new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        if (this.exit != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.exit);
            jSONObject.put("exit", (Object) Boolean.valueOf(TextUtils.equals("1", sb.toString())));
        }
        if (this.setting != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.setting);
            jSONObject.put(BizContext.KEY_SETTING_FILTER, (Object) Boolean.valueOf(TextUtils.equals("1", sb2.toString())));
        }
        jSONObject.put(b.ACTIVITY_KEY_BIZ_TYPE, (Object) this.biztype);
        jSONObject.put("newCardChannel", (Object) JSON.parseObject(this.newCardChannel));
        if (this.payments != null) {
            JSONArray jSONArray = new JSONArray();
            for (MspPayment mspPayment : this.payments) {
                if (z) {
                    jSONArray.add(mspPayment.formatPreChannel());
                } else {
                    jSONArray.add(mspPayment.formatPayChannel());
                }
            }
            if (z) {
                jSONObject.put("channels", (Object) jSONArray);
            } else {
                jSONObject.put("payments", (Object) jSONArray);
            }
        }
        JsonUtil.addExtInfo(this.extinfo, jSONObject);
        return jSONObject.toString();
    }
}

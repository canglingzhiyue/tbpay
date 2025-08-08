package com.alipay.android.msp.core.model;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.birdnest.api.MspConstants;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BirdNestFrameEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f4550a;
    private String b;
    private String c;
    private String d;
    private JSONObject e;

    public BirdNestFrameEvent(JSONObject jSONObject) {
        this.f4550a = jSONObject.getString("type");
        this.b = jSONObject.getString("key");
        this.c = jSONObject.getString(MspConstants.bannerKey.MQP_TOKEN);
        this.d = jSONObject.getString("id");
        this.e = jSONObject.getJSONObject("args");
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : this.f4550a;
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16c52370", new Object[]{this}) : this.b;
    }

    public String getMqpToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("317bff56", new Object[]{this}) : this.c;
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("81e05888", new Object[]{this}) : this.d;
    }

    public JSONObject getArgs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("7c869f7a", new Object[]{this}) : this.e;
    }

    public boolean isOnEvent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abebf37c", new Object[]{this})).booleanValue() : StringUtils.equals(MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT, this.f4550a);
    }

    public boolean isOnEventResult() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2338879", new Object[]{this})).booleanValue() : StringUtils.equals(MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT_RESULT, this.f4550a);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "BirdNestFrameEvent{type='" + this.f4550a + "', key='" + this.b + "', mqpToken='" + this.c + "', id='" + this.d + "', args=" + this.e + '}';
    }
}

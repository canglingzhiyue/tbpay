package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.utils.c;
import mtopsdk.mtop.global.SDKUtils;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class HotNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long activityEndTime;
    public long activityStartTime;
    public String answerApiUrl;
    public long payAttentionTime;
    public String questionApiUrl;
    public long saleStartTime;

    /* loaded from: classes4.dex */
    public enum HotItemState {
        NORMAL,
        REMIND,
        WARM,
        SECKILL,
        FINISH
    }

    static {
        kge.a(529317736);
    }

    public HotNode(JSONObject jSONObject) {
        super(jSONObject);
        this.activityStartTime = jSONObject.getLong("activityStartTime").longValue();
        this.payAttentionTime = jSONObject.getLong("payAttentionTime").longValue();
        this.saleStartTime = jSONObject.getLong("saleStartTime").longValue();
        this.activityEndTime = jSONObject.getLong("activityEndTime").longValue();
        this.questionApiUrl = c.a(jSONObject.getString("questionApiUrl"));
        this.answerApiUrl = c.a(jSONObject.getString("answerApiUrl"));
        tpc.a("com.taobao.android.detail.sdk.model.node.HotNode");
    }

    public HotItemState getCurState(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HotItemState) ipChange.ipc$dispatch("3bc3215a", new Object[]{this, new Long(j)});
        }
        long j2 = this.activityStartTime;
        if (j < j2) {
            return HotItemState.NORMAL;
        }
        if (j2 <= j && j < this.payAttentionTime) {
            return HotItemState.REMIND;
        }
        if (this.payAttentionTime <= j && j < this.saleStartTime) {
            return HotItemState.WARM;
        }
        if (this.saleStartTime <= j && j <= this.activityEndTime) {
            return HotItemState.SECKILL;
        }
        return HotItemState.FINISH;
    }

    public HotItemState getCurState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HotItemState) ipChange.ipc$dispatch("b69bcc32", new Object[]{this}) : getCurState(SDKUtils.getCorrectionTimeMillis());
    }
}

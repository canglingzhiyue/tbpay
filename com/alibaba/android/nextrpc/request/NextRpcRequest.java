package com.alibaba.android.nextrpc.request;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.io.Serializable;
import tb.mto;

/* loaded from: classes2.dex */
public class NextRpcRequest implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1;
    private double allTimeOutSeconds;
    private AttachedResponseStrategy attachedResponseStrategy;
    private JSONObject clientPerformance;
    private MtopBusiness mtopBusiness;

    /* loaded from: classes2.dex */
    public enum AttachedResponseStrategy {
        IMMEDIATELY,
        FULL;

        public static AttachedResponseStrategy getStrategyByOrdinal(int i) {
            AttachedResponseStrategy[] values;
            for (AttachedResponseStrategy attachedResponseStrategy : values()) {
                if (i == attachedResponseStrategy.ordinal()) {
                    return attachedResponseStrategy;
                }
            }
            return IMMEDIATELY;
        }
    }

    public NextRpcRequest(MtopBusiness mtopBusiness, AttachedResponseStrategy attachedResponseStrategy) {
        this.allTimeOutSeconds = 30.0d;
        this.attachedResponseStrategy = AttachedResponseStrategy.IMMEDIATELY;
        this.mtopBusiness = mtopBusiness;
        if (attachedResponseStrategy != null) {
            this.attachedResponseStrategy = attachedResponseStrategy;
        }
    }

    public NextRpcRequest(MtopBusiness mtopBusiness, double d, AttachedResponseStrategy attachedResponseStrategy) {
        this.allTimeOutSeconds = 30.0d;
        this.attachedResponseStrategy = AttachedResponseStrategy.IMMEDIATELY;
        this.mtopBusiness = mtopBusiness;
        if (d > mto.a.GEO_NOT_SUPPORT) {
            this.allTimeOutSeconds = d;
        }
        if (attachedResponseStrategy != null) {
            this.attachedResponseStrategy = attachedResponseStrategy;
        }
    }

    public double getAllTimeOutSeconds() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("806693e", new Object[]{this})).doubleValue() : this.allTimeOutSeconds;
    }

    public void setAllTimeOutSeconds(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0abcfa", new Object[]{this, new Double(d)});
        } else {
            this.allTimeOutSeconds = d;
        }
    }

    public AttachedResponseStrategy getAttachedResponseStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AttachedResponseStrategy) ipChange.ipc$dispatch("e6dec6a5", new Object[]{this}) : this.attachedResponseStrategy;
    }

    public void setAttachedResponseStrategy(AttachedResponseStrategy attachedResponseStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c95b0cdf", new Object[]{this, attachedResponseStrategy});
        } else {
            this.attachedResponseStrategy = attachedResponseStrategy;
        }
    }

    public MtopBusiness getMtopBusiness() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("7f3ef02f", new Object[]{this}) : this.mtopBusiness;
    }

    public void setMtopBusiness(MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("811e5e0f", new Object[]{this, mtopBusiness});
        } else {
            this.mtopBusiness = mtopBusiness;
        }
    }

    public JSONObject getClientPerformance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b3f976d6", new Object[]{this}) : this.clientPerformance;
    }

    public void setClientPerformance(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed3d5206", new Object[]{this, jSONObject});
        } else {
            this.clientPerformance = jSONObject;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "NextRpcRequest [allTimeOutSeconds=" + this.allTimeOutSeconds + ", attachedResponseStrategy=" + this.attachedResponseStrategy + ']';
    }
}

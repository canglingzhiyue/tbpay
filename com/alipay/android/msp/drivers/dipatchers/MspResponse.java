package com.alipay.android.msp.drivers.dipatchers;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.Action;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MspResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Action f4579a;
    public JSONObject b;

    public MspResponse(Builder builder) {
        this.f4579a = builder.f4580a;
        this.b = builder.b;
    }

    public Action getMspRequest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Action) ipChange.ipc$dispatch("5a64ea4b", new Object[]{this}) : this.f4579a;
    }

    public JSONObject getResponseBody() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e06ed720", new Object[]{this}) : this.b;
    }

    public Builder newBuilder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("d89b54bd", new Object[]{this}) : new Builder(this);
    }

    /* loaded from: classes3.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Action f4580a;
        public JSONObject b;

        public Builder() {
        }

        public Builder(MspResponse mspResponse) {
            this.f4580a = mspResponse.f4579a;
            this.b = mspResponse.b;
        }

        public Builder request(Action action) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9b28fd3e", new Object[]{this, action});
            }
            this.f4580a = action;
            return this;
        }

        public Builder body(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ac74a802", new Object[]{this, jSONObject});
            }
            this.b = jSONObject;
            return this;
        }

        public MspResponse build() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MspResponse) ipChange.ipc$dispatch("7e4e6887", new Object[]{this}) : new MspResponse(this);
        }
    }
}

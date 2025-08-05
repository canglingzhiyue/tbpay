package com.alipay.android.msp.drivers.actions;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class NetAction implements Action {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ActionTypes f4574a;
    public int retryCount = 0;
    private final DataBundle<DataKeys, Object> b = new DataBundle<>();

    /* loaded from: classes3.dex */
    public enum DataKeys implements DataKey {
        actionJson,
        contentData,
        isFirstRequest,
        statistic,
        callback
    }

    public NetAction(ActionTypes actionTypes) {
        this.f4574a = actionTypes;
    }

    @Override // com.alipay.android.msp.drivers.actions.Action
    public ActionTypes getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActionTypes) ipChange.ipc$dispatch("9edfc33d", new Object[]{this}) : this.f4574a;
    }

    @Override // com.alipay.android.msp.drivers.actions.Action
    public DataBundle<DataKeys, Object> getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataBundle) ipChange.ipc$dispatch("d3409a3a", new Object[]{this}) : this.b;
    }

    public <V> NetAction put(DataKeys dataKeys, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetAction) ipChange.ipc$dispatch("b9ed105e", new Object[]{this, dataKeys, v});
        }
        this.b.put(dataKeys, v);
        return this;
    }

    public <V> V get(DataKeys dataKeys, Class<V> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("bf351e38", new Object[]{this, dataKeys, cls});
        }
        Object obj = this.b.get(dataKeys, null);
        if (!cls.isInstance(obj)) {
            return null;
        }
        return cls.cast(obj);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : String.format("<NetAction@%d with type: %s bundle: %s>", Integer.valueOf(hashCode()), this.f4574a, this.b);
    }
}

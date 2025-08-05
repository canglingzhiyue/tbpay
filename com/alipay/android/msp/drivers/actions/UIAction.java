package com.alipay.android.msp.drivers.actions;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class UIAction implements Action {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ActionTypes f4575a;
    private DataBundle<DataKeys, Object> b;

    /* loaded from: classes3.dex */
    public enum DataKeys implements DataKey {
        isFirstEnter,
        renderData,
        fromSync,
        data,
        action,
        exception,
        statistic
    }

    public UIAction(ActionTypes actionTypes, DataBundle<DataKeys, Object> dataBundle) {
        this.f4575a = actionTypes;
        this.b = dataBundle;
    }

    @Override // com.alipay.android.msp.drivers.actions.Action
    public ActionTypes getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActionTypes) ipChange.ipc$dispatch("9edfc33d", new Object[]{this}) : this.f4575a;
    }

    @Override // com.alipay.android.msp.drivers.actions.Action
    public DataBundle<DataKeys, Object> getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataBundle) ipChange.ipc$dispatch("d3409a3a", new Object[]{this}) : this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : String.format("<UIAction@%d with type: %s bundle: %s>", Integer.valueOf(hashCode()), this.f4575a, this.b);
    }
}

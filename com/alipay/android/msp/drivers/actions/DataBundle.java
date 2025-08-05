package com.alipay.android.msp.drivers.actions;

import com.alipay.android.msp.drivers.actions.DataKey;
import com.alipay.android.msp.drivers.actions.UIAction;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class DataBundle<T extends DataKey, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<T, Object> f4570a = new HashMap<>();

    public void put(T t, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184e31fe", new Object[]{this, t, v});
        } else {
            this.f4570a.put(t, v);
        }
    }

    public Object get(T t, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("90fb5ccd", new Object[]{this, t, v});
        }
        Object obj = this.f4570a.get(t);
        return obj == null ? v : obj;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (this.f4570a != null) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<T, Object> entry : this.f4570a.entrySet()) {
                if (entry.getKey() != UIAction.DataKeys.statistic) {
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(entry.getValue());
                    sb.append(" ");
                }
            }
            return sb.toString();
        }
        return super.toString();
    }
}

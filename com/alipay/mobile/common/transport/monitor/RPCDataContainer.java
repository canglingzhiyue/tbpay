package com.alipay.mobile.common.transport.monitor;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class RPCDataContainer implements DataContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f5600a = new HashMap();
    private Map<String, DateModel> b = new HashMap();

    @Override // com.alipay.mobile.common.transport.monitor.DataContainer
    public void putDataItem(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aa8d827", new Object[]{this, str, str2});
        } else {
            this.f5600a.put(str, str2);
        }
    }

    @Override // com.alipay.mobile.common.transport.monitor.DataContainer
    public String getDataItem(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f7980f7c", new Object[]{this, str}) : a(this.f5600a.get(str));
    }

    @Override // com.alipay.mobile.common.transport.monitor.DataContainer
    public void removeDataItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d48652", new Object[]{this, str});
        } else {
            this.f5600a.remove(str);
        }
    }

    @Override // com.alipay.mobile.common.transport.monitor.DataContainer
    public void timeItemDot(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a1ef7a", new Object[]{this, str});
        } else {
            this.b.put(str, new DateModel());
        }
    }

    @Override // com.alipay.mobile.common.transport.monitor.DataContainer
    public void timeItemDot(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e39c768a", new Object[]{this, str, new Long(j)});
        } else {
            this.b.put(str, new DateModel(j));
        }
    }

    @Override // com.alipay.mobile.common.transport.monitor.DataContainer
    public void timeItemRelease(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2df69fb8", new Object[]{this, str});
            return;
        }
        DateModel dateModel = this.b.get(str);
        if (dateModel == null || dateModel.mRequestTime == -1) {
            putDataItem(str, "-1");
            return;
        }
        putDataItem(str, "" + dateModel.getCost());
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (str != null) {
            return str.replaceAll(",", "*").replaceAll("=", "*");
        }
        return null;
    }

    /* loaded from: classes3.dex */
    public class DateModel {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long mRequestTime;

        public DateModel() {
            this.mRequestTime = -1L;
            this.mRequestTime = System.currentTimeMillis();
        }

        public DateModel(long j) {
            this.mRequestTime = -1L;
            this.mRequestTime = j;
        }

        public long getCost() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6277c33e", new Object[]{this})).longValue() : System.currentTimeMillis() - this.mRequestTime;
        }
    }
}

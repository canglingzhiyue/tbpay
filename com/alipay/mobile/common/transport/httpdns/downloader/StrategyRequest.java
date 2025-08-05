package com.alipay.mobile.common.transport.httpdns.downloader;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes3.dex */
public class StrategyRequest extends StrategyRequestItem {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<String> f5593a;
    private String b;
    private String c;
    private String d;
    private int e = 4;

    public StrategyRequest() {
    }

    public StrategyRequest(List<String> list) {
        this.f5593a = list;
    }

    public StrategyRequest(String str, List<String> list) {
        super.setUid(str);
        this.f5593a = list;
    }

    public List<String> getDomains() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("14e2f247", new Object[]{this}) : this.f5593a;
    }

    public void setDomains(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a4d7865", new Object[]{this, list});
        } else {
            this.f5593a = list;
        }
    }

    public String getS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8f2c7b5c", new Object[]{this}) : this.b;
    }

    public void setS(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f2525cb", new Object[]{this, new Integer(i)});
        } else {
            this.b = String.valueOf(i);
        }
    }

    public String getLat_lng() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8938fe0a", new Object[]{this}) : this.c;
    }

    public void setLat_lng(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4ea4c14", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public String getDg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a2798a20", new Object[]{this}) : this.d;
    }

    public void setDg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1450d56", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public int getIpType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d9c8f8f1", new Object[]{this})).intValue() : this.e;
    }

    public void setIpType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5bc0d39", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }
}

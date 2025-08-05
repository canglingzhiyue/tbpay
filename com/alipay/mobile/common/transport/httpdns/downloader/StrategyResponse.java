package com.alipay.mobile.common.transport.httpdns.downloader;

import com.alipay.mobile.common.transport.httpdns.HttpDns;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class StrategyResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f5595a;
    private Map<String, HttpDns.HttpdnsIP> b;
    private String c;
    private String d;
    private boolean e;
    private int f;

    public long getCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("480bb15e", new Object[]{this})).longValue() : this.f5595a;
    }

    public Map<String, HttpDns.HttpdnsIP> getDns() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("95055daf", new Object[]{this}) : this.b;
    }

    public String getConf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("66c3bb9f", new Object[]{this}) : this.c;
    }

    public String getClientIp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5fb6831", new Object[]{this}) : this.d;
    }

    public boolean isOversea() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b708a7c", new Object[]{this})).booleanValue() : this.e;
    }

    public int getTtd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1a8f028", new Object[]{this})).intValue() : this.f;
    }

    public StrategyResponse(long j, Map<String, HttpDns.HttpdnsIP> map, String str, String str2, boolean z, int i) {
        this.f5595a = j;
        this.b = map;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = i;
    }
}

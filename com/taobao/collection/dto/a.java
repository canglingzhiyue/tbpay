package com.taobao.collection.dto;

import android.net.wifi.ScanResult;
import com.alipay.android.msp.framework.dns.DnsValue;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.cew;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Set<String> b;
    private long c;

    /* renamed from: a  reason: collision with root package name */
    private Map<Long, Set<String>> f16916a = new HashMap();
    private final int d = DnsValue.UPDATE_INTERVAL_DEFAULT;

    static {
        kge.a(-2055554348);
    }

    public void a(List<ScanResult> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.c = System.currentTimeMillis();
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        for (ScanResult scanResult : list) {
            hashSet.add(scanResult.BSSID);
            hashMap.put(scanResult.BSSID, Integer.valueOf(scanResult.level));
        }
        HashSet<Long> hashSet2 = new HashSet();
        for (Long l : this.f16916a.keySet()) {
            if (this.c - l.longValue() > cew.a.CONFIG_TRACK_1022_INTERVAL_TIME) {
                hashSet2.add(l);
            }
        }
        for (Long l2 : hashSet2) {
            this.f16916a.remove(l2);
        }
        this.f16916a.put(Long.valueOf(this.c), hashSet);
        this.b = hashSet;
    }

    public Set<String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("a0177257", new Object[]{this}) : this.b;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.c;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.c = j;
        }
    }
}

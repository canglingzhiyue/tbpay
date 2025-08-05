package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.client.smart.core.algo.ClientAlgoResult;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class O implements Delayed {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final int f3263a = 10;
    public final int d;
    public final String e;
    public CcrcService.Config f;
    public boolean g;
    public final SampleData h;
    public final long c = System.currentTimeMillis();
    public final ConcurrentHashMap<String, Object> b = new ConcurrentHashMap<>();

    public O(CcrcService.Config config, ClientAlgoResult clientAlgoResult, int i, String str) {
        this.b.put(clientAlgoResult.algoCode, clientAlgoResult.result);
        this.d = i;
        this.f = config;
        this.e = str;
        this.h = clientAlgoResult.mSampleData;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public CcrcService.Config b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CcrcService.Config) ipChange.ipc$dispatch("6e3f20d0", new Object[]{this}) : this.f;
    }

    public SampleData c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SampleData) ipChange.ipc$dispatch("2e14dadf", new Object[]{this}) : this.h;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Delayed delayed) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, delayed})).intValue() : a(delayed);
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.h.metaId;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.h.sampleId;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.e;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.g;
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("12d66bd8", new Object[]{this, timeUnit})).longValue();
        }
        if (this.b.size() != this.d) {
            return 10 - TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - this.c);
        }
        return 0L;
    }

    public void a(ClientAlgoResult clientAlgoResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88b88a74", new Object[]{this, clientAlgoResult});
        } else {
            this.b.put(clientAlgoResult.algoCode, clientAlgoResult.result);
        }
    }

    public void a(CcrcService.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b8a3eb", new Object[]{this, config});
        } else {
            this.f = config;
        }
    }

    public ConcurrentHashMap<String, Object> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("f779de7e", new Object[]{this}) : this.b;
    }

    public int a(Delayed delayed) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("66690360", new Object[]{this, delayed})).intValue() : Long.compare(getDelay(TimeUnit.MICROSECONDS), delayed.getDelay(TimeUnit.MICROSECONDS));
    }
}

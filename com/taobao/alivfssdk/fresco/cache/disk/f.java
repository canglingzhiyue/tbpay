package com.taobao.alivfssdk.fresco.cache.disk;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.fresco.cache.common.CacheEventListener;
import java.io.IOException;
import tb.kge;

/* loaded from: classes.dex */
public class f implements com.taobao.alivfssdk.fresco.cache.common.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.alivfssdk.fresco.cache.common.b f8514a;
    private String b;
    private long c;
    private long d;
    private long e;
    private long f;
    private IOException g;
    private CacheEventListener.EvictionReason h;

    static {
        kge.a(-1534834067);
        kge.a(-1721065773);
    }

    public f a(com.taobao.alivfssdk.fresco.cache.common.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("36f95df8", new Object[]{this, bVar});
        }
        this.f8514a = bVar;
        return this;
    }

    public f a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("2d03b7b6", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public f a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("5c1383cc", new Object[]{this, new Long(j)});
        }
        this.c = j;
        return this;
    }

    public f b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("d18daa0d", new Object[]{this, new Long(j)});
        }
        this.e = j;
        return this;
    }

    public f c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("4707d04e", new Object[]{this, new Long(j)});
        }
        this.d = j;
        return this;
    }

    @Override // com.taobao.alivfssdk.fresco.cache.common.a
    public long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.f;
    }

    public void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad402139", new Object[]{this, new Long(j)});
        } else {
            this.f = j;
        }
    }

    @Override // com.taobao.alivfssdk.fresco.cache.common.a
    public IOException b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IOException) ipChange.ipc$dispatch("103c5a4d", new Object[]{this}) : this.g;
    }

    public f a(IOException iOException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("7914945c", new Object[]{this, iOException});
        }
        this.g = iOException;
        return this;
    }

    public f a(CacheEventListener.EvictionReason evictionReason) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("1ea404f1", new Object[]{this, evictionReason});
        }
        this.h = evictionReason;
        return this;
    }
}

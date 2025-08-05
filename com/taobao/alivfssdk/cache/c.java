package com.taobao.alivfssdk.cache;

import com.alibaba.ability.impl.file.FileAbility;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dio;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Long f8483a = -1L;
    public long b = -1;
    public long c = -1;

    static {
        kge.a(1345628488);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuffer stringBuffer = new StringBuffer("AVFSCacheConfig{");
        stringBuffer.append("limitSize=");
        stringBuffer.append(dio.a(this.f8483a.longValue()));
        stringBuffer.append(", fileMemMaxSize=");
        stringBuffer.append(dio.a(this.b));
        stringBuffer.append(", sqliteMemMaxSize=");
        stringBuffer.append(dio.a(this.c));
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("2f1a01d4", new Object[0]);
        }
        c cVar = new c();
        cVar.f8483a = Long.valueOf((long) FileAbility.MAX_FILE_SIZE);
        cVar.b = 0L;
        cVar.c = 0L;
        return cVar;
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32c1964e", new Object[]{this, cVar});
            return;
        }
        if (cVar.f8483a.longValue() >= 0) {
            this.f8483a = cVar.f8483a;
        }
        long j = cVar.b;
        if (j >= 0) {
            this.b = j;
        }
        long j2 = cVar.c;
        if (j2 < 0) {
            return;
        }
        this.c = j2;
    }
}

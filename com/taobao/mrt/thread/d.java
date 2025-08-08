package com.taobao.mrt.thread;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.f;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;
import tb.msn;
import tb.mso;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f18265a;
    private int b;
    private int c;
    private mso d;
    private Map<String, b> e = new HashMap();
    private AtomicInteger f = new AtomicInteger(0);
    private String g;
    private int h;

    static {
        kge.a(1038225027);
    }

    public d(int i, int i2, String str) {
        this.f18265a = 0;
        this.b = 0;
        this.c = 0;
        this.d = null;
        this.h = 1;
        this.b = i;
        this.c = i2;
        this.g = str;
        this.f18265a = 0;
        this.h = ((i + i2) + 1) / 2;
        this.d = new msn();
        a("mrt_", i, MRTThreadPriority.HIGH);
        a("mrt_", i2, MRTThreadPriority.LOW);
    }

    private void a(String str, int i, MRTThreadPriority mRTThreadPriority) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc8cf465", new Object[]{this, str, new Integer(i), mRTThreadPriority});
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            String str2 = this.g + "-" + this.f.incrementAndGet();
            b bVar = new b(this.d, mRTThreadPriority, this, str2);
            bVar.start();
            this.e.put(str2, bVar);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            synchronized (this.d.b()) {
                b remove = this.e.remove(str);
                if (remove == null) {
                    return;
                }
                if (this.f18265a < this.h) {
                    a("mrt_", 1, remove.c());
                    this.f18265a++;
                }
                remove.a();
            }
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.e.isEmpty();
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("849d73ca", new Object[]{this, fVar});
        } else if (fVar == null) {
        } else {
            this.d.a(fVar);
        }
    }
}

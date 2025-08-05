package com.taobao.android.ultron.datamodel.imp;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public final class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f15787a;
    private long b;
    private com.alibaba.android.nextrpc.stream.internal.response.b c;

    static {
        kge.a(1925902535);
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.f15787a = j;
        }
    }

    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else {
            this.b = j;
        }
    }

    public void a(com.alibaba.android.nextrpc.stream.internal.response.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9621a0c2", new Object[]{this, bVar});
        } else {
            this.c = bVar;
        }
    }
}

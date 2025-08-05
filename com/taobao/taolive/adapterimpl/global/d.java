package com.taobao.taolive.adapterimpl.global;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.core.j;
import tb.ibs;
import tb.kge;

/* loaded from: classes8.dex */
public class d implements ibs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1427537492);
        kge.a(10760186);
    }

    @Override // tb.ibs
    public Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bd3407ca", new Object[]{this});
        }
        if (j.c(n.a()) == null) {
            return null;
        }
        return j.c(n.a()).mVideoInfo;
    }

    @Override // tb.ibs
    public Object b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("43b9c269", new Object[]{this});
        }
        if (j.c(n.a()) == null) {
            return null;
        }
        return j.c(n.a()).mFandomInfo;
    }

    @Override // tb.ibs
    public Object c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ca3f7d08", new Object[]{this}) : j.c(n.a());
    }
}

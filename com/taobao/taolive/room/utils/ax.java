package com.taobao.taolive.room.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import tb.kge;
import tb.ppq;
import tb.ppr;
import tb.thi;

/* loaded from: classes8.dex */
public class ax implements thi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-166345670);
        kge.a(1055919744);
    }

    @Override // tb.thi
    public void a(com.taobao.alilive.aliliveframework.frame.a aVar, com.taobao.taolive.sdk.core.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbabed88", new Object[]{this, aVar, cVar});
        } else {
            com.taobao.taolive.sdk.core.j.a(aVar, cVar);
        }
    }

    @Override // tb.thi
    public void a(com.taobao.alilive.aliliveframework.frame.a aVar, com.taobao.taolive.sdk.core.c cVar, MessageTypeFilter messageTypeFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("138218b5", new Object[]{this, aVar, cVar, messageTypeFilter});
        } else {
            com.taobao.taolive.sdk.core.j.a(aVar, cVar, messageTypeFilter);
        }
    }

    @Override // tb.thi
    public void a(com.taobao.alilive.aliliveframework.frame.a aVar, ppr pprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18b6131b", new Object[]{this, aVar, pprVar});
        } else {
            com.taobao.taolive.sdk.playcontrol.c.a(aVar, pprVar);
        }
    }

    @Override // tb.thi
    public void b(com.taobao.alilive.aliliveframework.frame.a aVar, ppr pprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5a32a3a", new Object[]{this, aVar, pprVar});
        } else {
            com.taobao.taolive.sdk.playcontrol.c.c(aVar, pprVar);
        }
    }

    @Override // tb.thi
    public ppq a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ppq) ipChange.ipc$dispatch("f0940cd", new Object[]{this}) : com.taobao.taolive.sdk.core.f.a().c();
    }
}

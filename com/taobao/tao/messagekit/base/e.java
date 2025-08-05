package com.taobao.tao.messagekit.base;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import tb.kge;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(228203745);
    }

    public static boolean a(com.taobao.tao.messagekit.core.model.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da6724ef", new Object[]{bVar})).booleanValue();
        }
        if (bVar.f20780a.type() != 5 || !bVar.f20780a.needACK()) {
            return false;
        }
        com.taobao.tao.messagekit.core.model.b bVar2 = new com.taobao.tao.messagekit.core.model.b(bVar);
        bVar2.f20780a = new Ack(bVar.f20780a);
        MsgLog.b("ReplyManager", "reply ack >", bVar.f20780a.routerId());
        MsgLog.a("ReplyManager", bVar2);
        tao.reactivex.e.a(bVar2).b(d.a().b());
        return true;
    }
}

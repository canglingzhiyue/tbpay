package com.taobao.android.remoteso.component;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import tb.ikq;

/* loaded from: classes6.dex */
public final class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile j f14807a;

    public j a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("62c4709b", new Object[]{this}) : this.f14807a;
    }

    public boolean a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcb98df", new Object[]{this, jVar})).booleanValue();
        }
        j jVar2 = this.f14807a;
        if (jVar2 == null) {
            this.f14807a = jVar;
            RSoLog.c("remo,holder-> current == null, set success, req = " + jVar);
            return true;
        } else if (jVar2.a() == jVar.a()) {
            this.f14807a = jVar;
            RSoLog.c("remo,holder-> current == request, set success, req = " + jVar);
            return true;
        } else {
            ikq.a("remo,holder-> setCurrent(), failed", "current=" + jVar2 + ", req=" + jVar);
            return false;
        }
    }

    public void b(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c943267a", new Object[]{this, jVar});
            return;
        }
        j jVar2 = this.f14807a;
        if (jVar2 == null) {
            ikq.a("remo,holder-> clear(), current already null", "curr=null, req=" + jVar);
        } else if (jVar2.a() == jVar.a()) {
            this.f14807a = null;
            RSoLog.c("remo,holder-> clear(), success, request=" + jVar);
        } else {
            RSoLog.c("remo,holder-> clear(), skip this clear, current = " + jVar2 + ", request = " + jVar);
        }
    }
}

package com.taobao.android.virtual_thread.adapter.tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.jqp;
import tb.jqq;
import tb.jqs;
import tb.jqw;
import tb.jqx;
import tb.jrd;
import tb.jrj;
import tb.jrk;
import tb.kge;
import tb.src;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-709370819);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3d2da1f", new Object[0]) : new a();
    }

    private a() {
    }

    public void a(jrj jrjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efee4776", new Object[]{this, jrjVar});
            return;
        }
        try {
            jqp jqpVar = new jqp(jrjVar);
            new jqs().a(new jrd(jrjVar, jqpVar)).a(new jqq(jrjVar, jqpVar)).a(new src(jrjVar, new HashMap())).a(new jqw(jrjVar, jqpVar)).a(new jqx(jrjVar, jqpVar)).a();
        } catch (Throwable th) {
            jrk.a(th);
        }
    }
}

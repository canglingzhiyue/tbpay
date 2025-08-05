package com.taobao.android.layoutmanager.adapter.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.a;
import com.taobao.tao.flexbox.layoutmanager.adapter.d;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import tb.kge;

/* loaded from: classes5.dex */
public class j implements com.taobao.tao.flexbox.layoutmanager.adapter.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f13119a = com.taobao.application.common.c.a().a("isApm", true);

    /* loaded from: classes5.dex */
    public class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public a.d f13121a;
        public long b;

        static {
            kge.a(-1211734460);
            kge.a(598121204);
        }

        public a() {
        }
    }

    static {
        kge.a(574233594);
        kge.a(715806172);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.d
    public void a(d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11381ddf", new Object[]{this, aVar});
        } else if (!this.f13119a) {
        } else {
            com.taobao.application.common.c.a(((a) aVar).f13121a);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.d
    public void b(d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8c7320", new Object[]{this, aVar});
        } else if (!this.f13119a) {
        } else {
            com.taobao.application.common.c.b(((a) aVar).f13121a);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.d
    public d.a a(final ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d.a) ipChange.ipc$dispatch("242d0cbe", new Object[]{this, abVar});
        }
        final a aVar = new a();
        final long nanoTime = System.nanoTime() / 1000000;
        if (this.f13119a) {
            aVar.f13121a = new a.d() { // from class: com.taobao.android.layoutmanager.adapter.impl.j.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.application.common.IPageListener
                public void a(String str, int i, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a3526bd3", new Object[]{this, str, new Integer(i), new Long(j)});
                        return;
                    }
                    try {
                        if (abVar == null || abVar.g() == null || abVar.g().getClass() == null || abVar.g().getClass().getName() == null || !abVar.g().getClass().getName().equals(str) || i != 0) {
                            return;
                        }
                        aVar.b = j;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
        }
        return aVar;
    }
}

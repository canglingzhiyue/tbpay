package com.taobao.android.detail.sdk.event.params;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.evc;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f10240a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public int g;
    public double h;
    public Map<String, String> i;

    static {
        kge.a(1912896101);
    }

    public a(C0393a c0393a) {
        this.f10240a = c0393a.f10241a;
        this.b = c0393a.b;
        this.c = c0393a.c;
        this.d = c0393a.d;
        this.e = c0393a.e;
        this.f = c0393a.f;
        this.g = c0393a.g;
        this.h = c0393a.h;
        this.i = c0393a.i;
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        tpc.a("com.taobao.android.detail.sdk.event.params.BaseTradeParams");
        if (this.i == null) {
            this.i = new HashMap();
        }
        if (this.g <= 0) {
            return;
        }
        this.i.put("installmentPay", "true");
        Map<String, String> map = this.i;
        map.put("installmentNum", "" + this.g);
        Map<String, String> map2 = this.i;
        String str = evc.f27594a;
        map2.put(str, "" + this.h);
    }

    /* renamed from: com.taobao.android.detail.sdk.event.params.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0393a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f10241a;
        public String b;
        public long c;
        public long d;
        public String e;
        public String f;
        public int g;
        public double h;
        public Map<String, String> i;

        static {
            kge.a(1452350524);
        }

        public C0393a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0393a) ipChange.ipc$dispatch("3d7f5769", new Object[]{this, str});
            }
            this.f10241a = str;
            return this;
        }

        public C0393a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0393a) ipChange.ipc$dispatch("765fb808", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public C0393a a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0393a) ipChange.ipc$dispatch("a84f3aff", new Object[]{this, new Long(j)});
            }
            this.c = j;
            return this;
        }

        public C0393a a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0393a) ipChange.ipc$dispatch("15178a1e", new Object[]{this, map});
            }
            this.i = map;
            return this;
        }

        public a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("5b4f1ad0", new Object[]{this}) : new a(this);
        }
    }
}

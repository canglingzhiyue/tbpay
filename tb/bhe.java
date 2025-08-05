package tb;

import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bhc;

/* loaded from: classes2.dex */
public class bhe extends bhc<cak> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private bhc.b f25898a;

    static {
        kge.a(811896097);
    }

    @Override // tb.bhc
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : bgp.INITIAL;
    }

    public bhe(Context context, String str, Bundle bundle, bhc.b bVar) {
        super(context, str, bundle);
        this.f25898a = bVar;
    }

    public static a a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("88b1fe80", new Object[]{context, str}) : new a(context, str);
    }

    @Override // tb.bhc
    public bhc.b<cak> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bhc.b) ipChange.ipc$dispatch("c2b5f57e", new Object[]{this}) : this.f25898a;
    }

    /* loaded from: classes2.dex */
    public static class a extends bhc.a<bhe, a, cak> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private bhc.b d;

        static {
            kge.a(1728099064);
        }

        @Override // tb.bhc.a
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            }
        }

        public a f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c2b6de1d", new Object[]{this}) : this;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [tb.bhc, tb.bhe] */
        @Override // tb.bhc.a
        public /* synthetic */ bhe b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bhc) ipChange.ipc$dispatch("16b46940", new Object[]{this}) : e();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [tb.bhe$a, tb.bhc$a] */
        @Override // tb.bhc.a
        public /* synthetic */ a d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bhc.a) ipChange.ipc$dispatch("fefa6221", new Object[]{this}) : f();
        }

        private a(Context context, String str) {
            super(context, str);
        }

        public bhe e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bhe) ipChange.ipc$dispatch("2dc9599b", new Object[]{this}) : new bhe(this.f25896a, this.b, this.c, this.d);
        }

        public a a(bhc.b<cak> bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2b9e7b6d", new Object[]{this, bVar});
            }
            this.d = bVar;
            return f();
        }
    }
}

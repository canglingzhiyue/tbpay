package com.taobao.android.weex;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.j;
import tb.dpl;
import tb.jvm;
import tb.kge;

/* loaded from: classes6.dex */
public class k implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    public static class a {
        public static final k INS;

        static {
            kge.a(-896668492);
            INS = new k();
        }
    }

    static {
        kge.a(-173123908);
        kge.a(-612950404);
    }

    public static k a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("85e6daa9", new Object[0]) : a.INS;
    }

    /* loaded from: classes6.dex */
    public static class b implements j.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f15873a;
        private final String b;
        private final boolean c;

        static {
            kge.a(-1088702114);
            kge.a(2096951902);
        }

        public b(byte[] bArr, String str, boolean z) {
            this.f15873a = bArr;
            this.b = str;
            this.c = z;
        }

        @Override // com.taobao.android.weex.j.c
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
        }
    }

    @Override // com.taobao.android.weex.j
    public void a(j.b bVar, final j.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed1f289", new Object[]{this, bVar, aVar});
        } else {
            dpl.a().a(bVar.b(), null, bVar.c(), bVar.a(), null, new jvm.a() { // from class: com.taobao.android.weex.k.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.jvm.a
                public void a(jvm.c cVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("850799b8", new Object[]{this, cVar});
                    } else {
                        aVar.a(cVar == null ? null : new b(cVar.a(), cVar.b(), cVar.d()));
                    }
                }

                @Override // tb.jvm.a
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    } else {
                        aVar.a(str, str2);
                    }
                }
            });
        }
    }
}

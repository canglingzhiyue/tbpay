package com.meizu.cloud.pushsdk.e.d;

import com.alipay.mobile.common.transport.utils.HeaderConstant;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class b extends j {

    /* renamed from: a  reason: collision with root package name */
    private static final g f7909a = g.a(HeaderConstant.HEADER_VALUE_OLD_TYPE);
    private final List<String> b;
    private final List<String> c;

    /* renamed from: com.meizu.cloud.pushsdk.e.d.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0279b {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f7910a = new ArrayList();
        private final List<String> b = new ArrayList();

        public C0279b a(String str, String str2) {
            this.f7910a.add(f.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
            this.b.add(f.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
            return this;
        }

        public b a() {
            return new b(this.f7910a, this.b);
        }

        public C0279b b(String str, String str2) {
            this.f7910a.add(f.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true));
            this.b.add(f.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true));
            return this;
        }
    }

    private b(List<String> list, List<String> list2) {
        this.b = m.a(list);
        this.c = m.a(list2);
    }

    private long a(com.meizu.cloud.pushsdk.e.h.c cVar, boolean z) {
        com.meizu.cloud.pushsdk.e.h.b bVar = z ? new com.meizu.cloud.pushsdk.e.h.b() : cVar.c();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                bVar.b(38);
            }
            bVar.a(this.b.get(i));
            bVar.b(61);
            bVar.a(this.c.get(i));
        }
        if (z) {
            long k = bVar.k();
            bVar.e();
            return k;
        }
        return 0L;
    }

    @Override // com.meizu.cloud.pushsdk.e.d.j
    public long a() {
        return a((com.meizu.cloud.pushsdk.e.h.c) null, true);
    }

    @Override // com.meizu.cloud.pushsdk.e.d.j
    public void a(com.meizu.cloud.pushsdk.e.h.c cVar) {
        a(cVar, false);
    }

    @Override // com.meizu.cloud.pushsdk.e.d.j
    public g b() {
        return f7909a;
    }
}

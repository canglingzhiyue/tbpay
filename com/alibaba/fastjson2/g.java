package com.alibaba.fastjson2;

import com.alibaba.fastjson2.d;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a extends g {

        /* renamed from: a  reason: collision with root package name */
        static final a f2945a;

        static {
            kge.a(-1993434585);
            f2945a = new a();
        }

        protected a() {
        }

        @Override // com.alibaba.fastjson2.g
        public void a(d.a aVar) {
            aVar.g = aVar.b == null ? aVar.f : aVar.b.g;
        }
    }

    static {
        kge.a(-523129692);
    }

    public abstract void a(d.a aVar);
}

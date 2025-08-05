package com.alibaba.triver.triver_shop.shop2023;

import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.rul;

/* loaded from: classes3.dex */
public final class Default2023Shop$initTemplateComponent$6$1 extends Lambda implements rul<com.alibaba.triver.triver_shop.shop2023.template.a, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ com.alibaba.triver.triver_shop.shop2023.a this$0;

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.alibaba.triver.triver_shop.shop2023.template.a f4034a;
        public final /* synthetic */ com.alibaba.triver.triver_shop.shop2023.a b;

        public a(com.alibaba.triver.triver_shop.shop2023.template.a aVar, com.alibaba.triver.triver_shop.shop2023.a aVar2) {
            this.f4034a = aVar;
            this.b = aVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            o.a(this.f4034a.f(), 0);
            com.alibaba.triver.triver_shop.shop2023.a aVar = this.b;
            com.alibaba.triver.triver_shop.shop2023.a.$ipChange.c(0);
            com.alibaba.triver.triver_shop.shop2023.a aVar2 = this.b;
            com.alibaba.triver.triver_shop.shop2023.template.c cVar = com.alibaba.triver.triver_shop.shop2023.a.$ipChange;
            if (cVar != null) {
                cVar.o();
            }
            com.alibaba.triver.triver_shop.shop2023.a.j(this.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Default2023Shop$initTemplateComponent$6$1(com.alibaba.triver.triver_shop.shop2023.a aVar) {
        super(1);
        this.this$0 = aVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(com.alibaba.triver.triver_shop.shop2023.template.a aVar) {
        invoke2(aVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(com.alibaba.triver.triver_shop.shop2023.template.a it) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f2ee270", new Object[]{this, it});
            return;
        }
        q.d(it, "it");
        a aVar = new a(it, this.this$0);
        com.alibaba.triver.triver_shop.shop2023.a aVar2 = this.this$0;
        if (!com.alibaba.triver.triver_shop.shop2023.a.$ipChange) {
            com.alibaba.triver.triver_shop.shop2023.a aVar3 = this.this$0;
            if (!com.alibaba.triver.triver_shop.shop2023.a.$ipChange) {
                com.alibaba.triver.triver_shop.shop2023.a aVar4 = this.this$0;
                if (!com.alibaba.triver.triver_shop.shop2023.a.$ipChange) {
                    aVar.run();
                    return;
                }
            }
        }
        com.alibaba.triver.triver_shop.shop2023.a.a(this.this$0, aVar);
    }
}

package com.taobao.android.sku.presenter;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.presenter.b;
import tb.kge;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f15202a;
    private com.taobao.android.sku.presenter.a b;

    /* loaded from: classes6.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(298073069);
        }

        public abstract void a(com.taobao.android.sku.presenter.a aVar);
    }

    static {
        kge.a(-992558052);
    }

    public com.taobao.android.sku.presenter.a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.sku.presenter.a) ipChange.ipc$dispatch("72a74c28", new Object[]{this}) : this.b;
    }

    public f(Context context) {
        this.f15202a = context;
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b = new b(this.f15202a);
        }
    }

    public void a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ffa48a0", new Object[]{this, aVar});
            return;
        }
        com.taobao.android.sku.presenter.a aVar2 = this.b;
        if (!(aVar2 instanceof b)) {
            return;
        }
        ((b) aVar2).a(new b.a() { // from class: com.taobao.android.sku.presenter.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.sku.presenter.b.a
            public void a(b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("de477a41", new Object[]{this, bVar});
                    return;
                }
                a aVar3 = aVar;
                if (aVar3 == null) {
                    return;
                }
                aVar3.a(bVar);
            }
        });
    }
}

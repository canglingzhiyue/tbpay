package com.taobao.android.litecreator.sdk.framework.container.loading;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class d implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f13454a;

    static {
        kge.a(1452077369);
        kge.a(-236705915);
    }

    @Override // com.taobao.android.litecreator.sdk.framework.container.loading.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    public d(c cVar) {
        this.f13454a = cVar;
    }

    public d() {
    }

    @Override // com.taobao.android.litecreator.sdk.framework.container.loading.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c cVar = this.f13454a;
        if (cVar == null) {
            return;
        }
        cVar.a(0);
    }

    @Override // com.taobao.android.litecreator.sdk.framework.container.loading.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        c cVar = this.f13454a;
        if (cVar == null) {
            return;
        }
        cVar.dismiss();
    }
}

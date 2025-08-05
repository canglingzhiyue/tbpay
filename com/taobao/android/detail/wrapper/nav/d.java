package com.taobao.android.detail.wrapper.nav;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class d extends com.taobao.android.nav.f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1759966805);
    }

    @Override // com.taobao.android.nav.f
    public boolean addSchemaWhenDeficiency() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd2dd70", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public d(com.taobao.android.nav.e eVar) {
        super(eVar);
        addUriFilterItem(new g());
        addUriFilterItem(new h());
        addUriFilterItem(new i());
        addUriFilterItem(new j());
        addUriFilterItem(new l());
        addUriFilterItem(new m());
    }
}

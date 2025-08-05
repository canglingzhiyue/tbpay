package com.taobao.search.searchdoor.activate.hotspot;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.musie.l;
import tb.kge;

/* loaded from: classes7.dex */
public final class e extends l {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final e INSTANCE;

    @Override // com.taobao.search.musie.l
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        return true;
    }

    static {
        kge.a(1157590788);
        INSTANCE = new e();
    }

    private e() {
    }
}

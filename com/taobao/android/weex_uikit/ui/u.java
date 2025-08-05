package com.taobao.android.weex_uikit.ui;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class u extends h<u> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2025175811);
    }

    public static /* synthetic */ Object ipc$super(u uVar, String str, Object... objArr) {
        if (str.hashCode() == 1514279453) {
            super.a((Map) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public u(UINode uINode) {
        super(uINode);
    }

    @Override // com.taobao.android.weex_uikit.ui.h
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        super.a(map);
        if (map.isEmpty()) {
            return;
        }
        this.b.refreshAttribute(map);
    }
}

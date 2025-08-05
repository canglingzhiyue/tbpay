package com.taobao.search.mmd.uikit.shopinfo;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import tb.rul;

/* loaded from: classes7.dex */
public final class ShopInfoItemBean$refs$1 extends Lambda implements rul<String, String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ShopInfoItemBean$refs$1 INSTANCE = new ShopInfoItemBean$refs$1();

    public ShopInfoItemBean$refs$1() {
        super(1);
    }

    @Override // tb.rul
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final String mo2421invoke(String it) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bed32b7", new Object[]{this, it});
        }
        q.c(it, "it");
        return "";
    }
}

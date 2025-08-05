package com.alibaba.triver.triver_shop.newShop.manager;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.t;
import tb.kge;
import tb.ruw;

/* loaded from: classes3.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.alibaba.triver.triver_shop.newShop.data.d f3870a;
    private final int b;
    private final ruw<Integer, Boolean, t> c;
    private int d;

    static {
        kge.a(-738337686);
    }

    public static final /* synthetic */ void a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfcb580a", new Object[]{aVar, new Integer(i)});
        } else {
            aVar.d = i;
        }
    }
}

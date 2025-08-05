package com.taobao.android.behavir.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class b extends com.taobao.android.behavix.utils.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FATIGUE = "fatigue";

    /* renamed from: a  reason: collision with root package name */
    private static b f9153a;

    @Override // com.taobao.android.behavix.utils.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "behavir";
    }

    static {
        kge.a(2051772438);
        f9153a = new b();
    }

    private b() {
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("6c381f05", new Object[0]) : f9153a;
    }
}

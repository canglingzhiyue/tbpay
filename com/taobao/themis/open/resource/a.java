package com.taobao.themis.open.resource;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"globalResourcePool", "Lcom/taobao/themis/open/resource/ResourcePool;", "getGlobalResourcePool", "()Lcom/taobao/themis/open/resource/ResourcePool;", "themis_open_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final f f22718a;

    static {
        kge.a(313347816);
        f22718a = new f();
    }

    public static final f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("3eaa45e5", new Object[0]) : f22718a;
    }
}

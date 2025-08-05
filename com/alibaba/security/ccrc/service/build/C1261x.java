package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.alibaba.security.ccrc.common.http.model.BaseResponse;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.alibaba.security.ccrc.service.build.x  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1261x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Set<InterfaceC1258w> f3334a = new HashSet();

    public static void a(InterfaceC1258w interfaceC1258w) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4229dd6d", new Object[]{interfaceC1258w});
        } else {
            f3334a.add(interfaceC1258w);
        }
    }

    public static void a(BaseRequest baseRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd6a974", new Object[]{baseRequest});
            return;
        }
        for (InterfaceC1258w interfaceC1258w : f3334a) {
            interfaceC1258w.a(baseRequest);
        }
    }

    public static void a(BaseResponse baseResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49cd6ac", new Object[]{baseResponse});
            return;
        }
        for (InterfaceC1258w interfaceC1258w : f3334a) {
            interfaceC1258w.a(baseResponse);
        }
    }
}

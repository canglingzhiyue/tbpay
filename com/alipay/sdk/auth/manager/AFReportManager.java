package com.alipay.sdk.auth.manager;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AFReportManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static IReportProvider f6144a = new a();

    /* loaded from: classes3.dex */
    public static class a implements IReportProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.sdk.auth.manager.IReportProvider
        public void report(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb4f1a72", new Object[]{this, new Integer(i), str});
            }
        }
    }

    public static IReportProvider getProvider() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IReportProvider) ipChange.ipc$dispatch("6315e44e", new Object[0]) : f6144a;
    }

    public static void setProvider(IReportProvider iReportProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d8c2ef6", new Object[]{iReportProvider});
        } else {
            f6144a = iReportProvider;
        }
    }
}

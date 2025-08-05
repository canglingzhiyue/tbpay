package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.service.build.C1236oa;
import com.alibaba.security.client.smart.core.core.WukongNativeDownloaderImpl;
import com.android.alibaba.ip.runtime.IpChange;

/* renamed from: com.alibaba.security.ccrc.service.build.ra  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1244ra implements C1236oa.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f3324a;
    public final /* synthetic */ long b;
    public final /* synthetic */ WukongNativeDownloaderImpl c;

    public C1244ra(WukongNativeDownloaderImpl wukongNativeDownloaderImpl, String str, long j) {
        this.c = wukongNativeDownloaderImpl;
        this.f3324a = str;
        this.b = j;
    }

    @Override // com.alibaba.security.ccrc.service.build.C1236oa.a
    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        StringBuilder a2 = Yb.a("download ");
        a2.append(this.f3324a);
        a2.append(" fail cost time ");
        a2.append(System.currentTimeMillis() - this.b);
        a2.append(" errorMsg: ");
        a2.append(str);
        Logging.e(WukongNativeDownloaderImpl.TAG, a2.toString());
    }

    @Override // com.alibaba.security.ccrc.service.build.C1236oa.a
    public void onSuccess(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631dc082", new Object[]{this, new Integer(i), str});
            return;
        }
        StringBuilder a2 = Yb.a("download ");
        a2.append(this.f3324a);
        a2.append(" success cost time ");
        a2.append(System.currentTimeMillis() - this.b);
        a2.append(" filePath: ");
        a2.append(str);
        Logging.d(WukongNativeDownloaderImpl.TAG, a2.toString());
    }
}

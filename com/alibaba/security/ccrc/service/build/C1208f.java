package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.interfaces.Uploader;
import com.alibaba.security.client.smart.core.model.InferContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.alibaba.security.ccrc.service.build.f  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1208f implements Uploader.UploadFinishListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InferContext f3302a;
    public final /* synthetic */ long b;
    public final /* synthetic */ CountDownLatch c;
    public final /* synthetic */ String[] d;

    public C1208f(InferContext inferContext, long j, CountDownLatch countDownLatch, String[] strArr) {
        this.f3302a = inferContext;
        this.b = j;
        this.c = countDownLatch;
        this.d = strArr;
    }

    @Override // com.alibaba.security.ccrc.interfaces.Uploader.UploadFinishListener
    public void onFail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
            return;
        }
        C1211g.b(this.f3302a, false, str, this.b);
        this.c.countDown();
    }

    @Override // com.alibaba.security.ccrc.interfaces.Uploader.UploadFinishListener
    public void onSuccess(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
            return;
        }
        C1211g.b(this.f3302a, true, str, this.b);
        this.c.countDown();
        this.d[0] = str;
    }
}

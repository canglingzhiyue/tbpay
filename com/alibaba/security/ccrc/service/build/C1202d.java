package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.alibaba.security.client.smart.core.model.InferContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* renamed from: com.alibaba.security.ccrc.service.build.d  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1202d implements InterfaceC1226l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f3297a;
    public final /* synthetic */ InferContext b;
    public final /* synthetic */ SampleData c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ List e;
    public final /* synthetic */ C1205e f;

    public C1202d(C1205e c1205e, long j, InferContext inferContext, SampleData sampleData, boolean z, List list) {
        this.f = c1205e;
        this.f3297a = j;
        this.b = inferContext;
        this.c = sampleData;
        this.d = z;
        this.e = list;
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1226l
    public void a(BaseRequest baseRequest, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3756a450", new Object[]{this, baseRequest, obj});
            return;
        }
        C1205e.a(this.f, this.b, true, obj, (String) null, System.currentTimeMillis() - this.f3297a);
        C1205e c1205e = this.f;
        SampleData sampleData = this.c;
        C1205e.a(c1205e, sampleData, W.a(sampleData, this.d, this.e, this.b.getAlgoResults()));
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1226l
    public void a(BaseRequest baseRequest, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afe53488", new Object[]{this, baseRequest, str, str2});
            return;
        }
        C1205e.a(this.f, this.b, false, (Object) null, str2, System.currentTimeMillis() - this.f3297a);
        C1205e c1205e = this.f;
        SampleData sampleData = this.c;
        C1205e.b(c1205e, sampleData, W.a(str2, sampleData));
    }
}

package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.wukong.model.multi.file.AudioFileRiskSample;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes3.dex */
public class Qb implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CcrcService f3271a;
    public final /* synthetic */ AudioFileRiskSample b;
    public final /* synthetic */ File c;
    public final /* synthetic */ Rb d;

    public Qb(Rb rb, CcrcService ccrcService, AudioFileRiskSample audioFileRiskSample, File file) {
        this.d = rb;
        this.f3271a = ccrcService;
        this.b = audioFileRiskSample;
        this.c = file;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        Rb rb = this.d;
        Rb.a(rb, this.f3271a, this.b, this.c, rb.e);
    }
}

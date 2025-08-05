package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.wukong.model.multi.file.FileRiskSample;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class Gb implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f3242a;
    public final /* synthetic */ FileRiskSample b;

    public Gb(FileRiskSample fileRiskSample, Runnable runnable) {
        this.b = fileRiskSample;
        this.f3242a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            this.f3242a.run();
        } catch (Throwable th) {
            th.printStackTrace();
            Logging.e(FileRiskSample.c, "file process error", th);
        }
    }
}

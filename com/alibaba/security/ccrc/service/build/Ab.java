package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.log.Logging;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.mrt.task.MRTRuntimeException;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public class Ab implements MNNCVExecutor.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Fb f3228a;
    public final /* synthetic */ CountDownLatch b;
    public final /* synthetic */ Bb c;

    public Ab(Bb bb, Fb fb, CountDownLatch countDownLatch) {
        this.c = bb;
        this.f3228a = fb;
        this.b = countDownLatch;
    }

    @Override // com.taobao.android.mnncv.MNNCVExecutor.b
    public void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
            return;
        }
        if (mRTRuntimeException != null) {
            StringBuilder a2 = Yb.a("[onCompletion] e:");
            a2.append(mRTRuntimeException.errorCode);
            Logging.e(Bb.f3233a, a2.toString(), mRTRuntimeException);
        }
        Fb fb = this.f3228a;
        fb.f3239a = mRTRuntimeException;
        fb.b = map;
        this.b.countDown();
    }
}

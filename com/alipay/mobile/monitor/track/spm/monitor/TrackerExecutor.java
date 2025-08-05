package com.alipay.mobile.monitor.track.spm.monitor;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.mobile.monitor.track.spm.monitor.tracker.BaseTracker;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
/* loaded from: classes3.dex */
public class TrackerExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ThreadPoolExecutor f5770a = new ThreadPoolExecutor(1, 1, 3, TimeUnit.SECONDS, new PriorityBlockingQueue());

    public TrackerExecutor() {
        this.f5770a.setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
        this.f5770a.allowCoreThreadTimeOut(true);
    }

    public void commitTracker(BaseTracker baseTracker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d472f64c", new Object[]{this, baseTracker});
        } else {
            this.f5770a.execute(new TrackerDispatcher(baseTracker));
        }
    }
}

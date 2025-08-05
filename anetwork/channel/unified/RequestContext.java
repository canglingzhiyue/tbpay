package anetwork.channel.unified;

import anetwork.channel.entity.RequestConfig;
import anetwork.channel.interceptor.Callback;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public class RequestContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Callback callback;
    public final RequestConfig config;
    public final String seqNum;
    public volatile AtomicBoolean isDone = new AtomicBoolean();
    public volatile IUnifiedTask runningTask = null;
    public volatile MultiPathTask multiPathTask = null;
    public volatile MultiPathTask vpnFastDegradeTask = null;
    public volatile Future timeoutTask = null;
    public volatile boolean isHoldOnDone = false;
    public volatile FragmentationAggregator fragmentationAggregator = null;

    static {
        kge.a(-934958965);
    }

    public RequestContext(RequestConfig requestConfig, Callback callback) {
        this.config = requestConfig;
        this.seqNum = requestConfig.seqNo;
        this.callback = callback;
    }

    public void cancelTimeoutTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("990b633", new Object[]{this});
            return;
        }
        Future future = this.timeoutTask;
        if (future == null) {
            return;
        }
        future.cancel(true);
        this.timeoutTask = null;
    }

    public void cancelRunningTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d294091", new Object[]{this});
        } else if (this.runningTask == null) {
        } else {
            this.runningTask.cancel();
            this.runningTask = null;
        }
    }

    public void cancelMultiPathTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d312f350", new Object[]{this});
        } else if (this.multiPathTask == null) {
        } else {
            this.multiPathTask.cancel();
            this.multiPathTask = null;
        }
    }

    public void cancelVpnFastDegradeTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82172b2c", new Object[]{this});
        } else if (this.vpnFastDegradeTask == null) {
        } else {
            this.vpnFastDegradeTask.cancel();
            this.vpnFastDegradeTask = null;
        }
    }
}

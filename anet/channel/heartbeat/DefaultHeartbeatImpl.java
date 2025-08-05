package anet.channel.heartbeat;

import anet.channel.Constants;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.Session;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes2.dex */
public class DefaultHeartbeatImpl implements IHeartbeat, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.DefaultHeartbeatImpl";
    private Session session;
    private volatile long executeTime = 0;
    private volatile boolean isCancelled = false;
    private long interval = 0;

    static {
        kge.a(1159655981);
        kge.a(-1681044795);
        kge.a(-1390502639);
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void start(Session session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6af21441", new Object[]{this, session});
        } else if (session == null) {
            throw new NullPointerException("session is null");
        } else {
            this.session = session;
            this.interval = session.getConnStrategy().getHeartbeat();
            if (this.interval <= 0) {
                this.interval = Constants.MAX_SESSION_IDLE_TIME;
            }
            submit(this.interval);
        }
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else if (this.session == null) {
        } else {
            this.isCancelled = true;
        }
    }

    @Override // anet.channel.heartbeat.IHeartbeat
    public void reSchedule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd73a171", new Object[]{this});
        } else {
            this.executeTime = System.currentTimeMillis() + this.interval;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.isCancelled) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis < this.executeTime - 1000) {
                submit(this.executeTime - currentTimeMillis);
            } else if (!GlobalAppRuntimeInfo.isAppBackground()) {
                this.session.ping(true);
                submit(this.interval);
            } else {
                ALog.e(TAG, "close session in background", this.session.mSeq, MspGlobalDefine.SESSION, this.session);
                this.session.close(false, "background close");
            }
        }
    }

    private void submit(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b9205", new Object[]{this, new Long(j)});
            return;
        }
        try {
            this.executeTime = System.currentTimeMillis() + j;
            ThreadPoolExecutorFactory.submitScheduledTask(this, j + 50, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            ALog.e(TAG, "Submit heartbeat task failed.", this.session.mSeq, e, new Object[0]);
        }
    }
}

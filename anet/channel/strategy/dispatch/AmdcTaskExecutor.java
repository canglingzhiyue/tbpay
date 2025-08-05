package anet.channel.strategy.dispatch;

import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.statist.AmdcStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.utils.AmdcThreadPoolExecutor;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public class AmdcTaskExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "awcn.AmdcThreadPoolExecutor";
    private static Random random;
    private Map<String, Object> cachedParams;
    private AtomicBoolean firstRequest = new AtomicBoolean(true);

    public static /* synthetic */ Map access$000(AmdcTaskExecutor amdcTaskExecutor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3ce6e24", new Object[]{amdcTaskExecutor}) : amdcTaskExecutor.cachedParams;
    }

    public static /* synthetic */ Map access$002(AmdcTaskExecutor amdcTaskExecutor, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("658efcad", new Object[]{amdcTaskExecutor, map});
        }
        amdcTaskExecutor.cachedParams = map;
        return map;
    }

    static {
        kge.a(-1207876837);
        random = new Random();
    }

    public void addTask(boolean z, Map<String, Object> map, boolean z2, boolean z3) {
        int nextInt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1ffa7e", new Object[]{this, new Boolean(z), map, new Boolean(z2), new Boolean(z3)});
            return;
        }
        try {
            map.put("Env", GlobalAppRuntimeInfo.getEnv());
            synchronized (this) {
                if (!z3 && !z2 && (!AwcnConfig.isAmdcFirstRequestOptEnable() || !this.firstRequest.compareAndSet(true, false))) {
                    if (this.cachedParams == null) {
                        this.cachedParams = map;
                        AmdcTask amdcTask = new AmdcTask(z);
                        if (this.firstRequest.compareAndSet(true, false)) {
                            amdcTask.isForceUpdate.set(true);
                            nextInt = 0;
                        } else {
                            nextInt = random.nextInt(3000) + 2000;
                        }
                        ALog.e(TAG, "[ap] merge amdc first amdc request", null, "delay", Integer.valueOf(nextInt));
                        AmdcThreadPoolExecutor.scheduleTask(amdcTask, nextInt);
                    } else {
                        Set set = (Set) this.cachedParams.get("hosts");
                        Set set2 = (Set) map.get("hosts");
                        if (map.get("Env") != this.cachedParams.get("Env")) {
                            this.cachedParams = map;
                        } else if (set.size() + set2.size() <= 40) {
                            set2.addAll(set);
                            this.cachedParams = map;
                        } else {
                            ALog.e(TAG, "[ap] merge amdc not first amdc request", null, new Object[0]);
                            AmdcThreadPoolExecutor.submitTask(new AmdcTask(z, map));
                        }
                    }
                }
                AmdcTask amdcTask2 = new AmdcTask(z, map);
                amdcTask2.isVpnProxy.set(z2);
                amdcTask2.isForceSend.set(z3);
                amdcTask2.isForceUpdate.set(true);
                AmdcThreadPoolExecutor.submitTask(amdcTask2);
                ALog.e(TAG, "[ap] addTask, first or vpn amdc request! ", null, "params", map, "isVpnProxy", Boolean.valueOf(z2), "isForceSend", Boolean.valueOf(z3), "isAmdcFirstRequestOptEnable", Boolean.valueOf(AwcnConfig.isAmdcFirstRequestOptEnable()));
            }
        } catch (Exception unused) {
        }
    }

    /* loaded from: classes.dex */
    public class AmdcTask implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Map<String, Object> params;
        private AtomicBoolean isForceCellular = new AtomicBoolean();
        public AtomicBoolean isVpnProxy = new AtomicBoolean();
        public AtomicBoolean isForceSend = new AtomicBoolean();
        public AtomicBoolean isForceUpdate = new AtomicBoolean();

        static {
            kge.a(629908825);
            kge.a(-1390502639);
        }

        public AmdcTask(boolean z, Map<String, Object> map) {
            this.params = map;
            this.isForceCellular.set(z);
        }

        public AmdcTask(boolean z) {
            this.isForceCellular.set(z);
        }

        @Override // java.lang.Runnable
        public void run() {
            Map<String, Object> access$000;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ALog.e(AmdcTaskExecutor.TAG, "[ap] amdc task run, isVpnProxy=" + this.isVpnProxy.get(), null, new Object[0]);
                Map<String, Object> map = this.params;
                if (map == null) {
                    synchronized (AmdcTaskExecutor.class) {
                        access$000 = AmdcTaskExecutor.access$000(AmdcTaskExecutor.this);
                        AmdcTaskExecutor.access$002(AmdcTaskExecutor.this, null);
                    }
                    map = access$000;
                }
                if (!NetworkStatusHelper.isConnected()) {
                    ALog.e(AmdcTaskExecutor.TAG, "amdc task not isConnected", null, new Object[0]);
                } else if (GlobalAppRuntimeInfo.getEnv() != map.get("Env")) {
                    ALog.w(AmdcTaskExecutor.TAG, "task's env changed", null, new Object[0]);
                } else {
                    AmdcStatistic amdcStatistic = new AmdcStatistic();
                    amdcStatistic.startTime = System.currentTimeMillis();
                    amdcStatistic.seqNo = "AMDC" + DispatchCore.seq.incrementAndGet();
                    Map buildParamMap = DispatchParamBuilder.buildParamMap(map, amdcStatistic);
                    amdcStatistic.buildParamEndTime = System.currentTimeMillis();
                    amdcStatistic.buildParamTime = System.currentTimeMillis() - amdcStatistic.startTime;
                    amdcStatistic.isForceCellular = this.isForceCellular.get();
                    amdcStatistic.isVpnProxy = this.isVpnProxy.get();
                    amdcStatistic.isForceSend = this.isForceSend.get();
                    amdcStatistic.isForceUpdate = this.isForceUpdate.get();
                    DispatchCore.sendRequest(buildParamMap, amdcStatistic);
                }
            } catch (Exception e) {
                ALog.e(AmdcTaskExecutor.TAG, "[ap] exec amdc task failed.", null, e, new Object[0]);
            }
        }
    }
}

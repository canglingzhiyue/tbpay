package com.alipay.mobile.common.transportext.biz.diagnose.network;

import android.text.TextUtils;
import com.alipay.mobile.common.amnet.api.AmnetNetworkDiagnoseListener;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Traceroute;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class NetworkDiagnoseManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f5668a = new HashMap();
    private Configuration.DetectInf[] b;
    private Traceroute.PingInf[] c;
    private AmnetNetworkDiagnoseListener d = null;
    private DiagnoseStateManager e = null;
    private ResultCount f = null;
    private int g = 0;
    private long h = 0;

    /* loaded from: classes3.dex */
    public interface ResultCount {
        void addCount();

        void addTotal();
    }

    public static /* synthetic */ Configuration.DetectInf[] access$200(NetworkDiagnoseManager networkDiagnoseManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Configuration.DetectInf[]) ipChange.ipc$dispatch("7a305beb", new Object[]{networkDiagnoseManager}) : networkDiagnoseManager.b;
    }

    public static /* synthetic */ int access$300(NetworkDiagnoseManager networkDiagnoseManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bb0364c", new Object[]{networkDiagnoseManager})).intValue() : networkDiagnoseManager.g;
    }

    public static /* synthetic */ Map access$400() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("fb521370", new Object[0]) : f5668a;
    }

    public static /* synthetic */ long access$500(NetworkDiagnoseManager networkDiagnoseManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7b91ec8b", new Object[]{networkDiagnoseManager})).longValue() : networkDiagnoseManager.h;
    }

    public static /* synthetic */ AmnetNetworkDiagnoseListener access$600(NetworkDiagnoseManager networkDiagnoseManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AmnetNetworkDiagnoseListener) ipChange.ipc$dispatch("3a2a72d7", new Object[]{networkDiagnoseManager}) : networkDiagnoseManager.d;
    }

    public static /* synthetic */ ResultCount access$700(NetworkDiagnoseManager networkDiagnoseManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ResultCount) ipChange.ipc$dispatch("c96f572a", new Object[]{networkDiagnoseManager}) : networkDiagnoseManager.f;
    }

    public NetworkDiagnoseManager(Configuration.DetectInf[] detectInfArr, Traceroute.PingInf[] pingInfArr) {
        this.b = null;
        this.c = null;
        this.b = detectInfArr;
        this.c = pingInfArr;
    }

    public void register(AmnetNetworkDiagnoseListener amnetNetworkDiagnoseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74afe47", new Object[]{this, amnetNetworkDiagnoseListener});
        } else {
            this.d = amnetNetworkDiagnoseListener;
        }
    }

    public void register(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fee4b4b", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        this.g = i;
        this.h = j;
        f5668a.put(String.valueOf(i), String.valueOf(j));
    }

    public void start() {
        Traceroute.PingInf[] pingInfArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        this.f = new ResultCountImpl();
        this.e = new DiagnoseStateManagerImpl();
        Configuration.DetectInf[] detectInfArr = this.b;
        if ((detectInfArr == null || detectInfArr.length <= 0) && ((pingInfArr = this.c) == null || pingInfArr.length <= 0)) {
            AmnetNetworkDiagnoseListener amnetNetworkDiagnoseListener = this.d;
            if (amnetNetworkDiagnoseListener != null) {
                amnetNetworkDiagnoseListener.report(true, false, true, "");
            }
            LogCatUtil.warn("DIAGNOSE-MANAGER", "all input is null");
            return;
        }
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Configuration.DetectInf[] detectInfArr = this.b;
        if (detectInfArr == null || detectInfArr.length <= 0) {
            LogCatUtil.warn("DIAGNOSE-MANAGER", "detectInfs is null.");
            return;
        }
        int length = detectInfArr.length;
        for (final int i = 0; i < length; i++) {
            if (this.b[i] != null) {
                this.f.addTotal();
                final SpeedTestManager speedTestManager = new SpeedTestManager();
                speedTestManager.register(this.f);
                speedTestManager.register(this.e);
                NetworkAsyncTaskExecutor.executeLazy(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.diagnose.network.NetworkDiagnoseManager.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            speedTestManager.diagnose(NetworkDiagnoseManager.access$200(NetworkDiagnoseManager.this)[i]);
                        }
                    }
                });
            }
        }
    }

    /* loaded from: classes3.dex */
    public class DiagnoseStateManagerImpl implements DiagnoseStateManager {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.mobile.common.transportext.biz.diagnose.network.DiagnoseStateManager
        public void notify(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b32c451a", new Object[]{this, str});
            }
        }

        private DiagnoseStateManagerImpl() {
        }

        @Override // com.alipay.mobile.common.transportext.biz.diagnose.network.DiagnoseStateManager
        public void report(boolean z, boolean z2, boolean z3, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10057843", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3), str});
                return;
            }
            if (1 == NetworkDiagnoseManager.access$300(NetworkDiagnoseManager.this)) {
                String str2 = (String) NetworkDiagnoseManager.access$400().get(String.valueOf(NetworkDiagnoseManager.access$300(NetworkDiagnoseManager.this)));
                if (TextUtils.isEmpty(str2) || !str2.equals(String.valueOf(NetworkDiagnoseManager.access$500(NetworkDiagnoseManager.this)))) {
                    LogCatUtil.warn("DIAGNOSE-MANAGER", "not the same diagnose, ignose result.");
                    return;
                }
            }
            if (NetworkDiagnoseManager.access$600(NetworkDiagnoseManager.this) != null) {
                NetworkDiagnoseManager.access$600(NetworkDiagnoseManager.this).report(z, z2, z3, str);
            }
            if (NetworkDiagnoseManager.access$700(NetworkDiagnoseManager.this) == null) {
                return;
            }
            NetworkDiagnoseManager.access$700(NetworkDiagnoseManager.this).addCount();
        }
    }

    /* loaded from: classes3.dex */
    public class ResultCountImpl implements ResultCount {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f5669a;
        private int b;

        private ResultCountImpl() {
            this.f5669a = 0;
            this.b = 0;
        }

        @Override // com.alipay.mobile.common.transportext.biz.diagnose.network.NetworkDiagnoseManager.ResultCount
        public void addTotal() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d54cea2a", new Object[]{this});
                return;
            }
            synchronized (this) {
                this.f5669a++;
            }
        }

        @Override // com.alipay.mobile.common.transportext.biz.diagnose.network.NetworkDiagnoseManager.ResultCount
        public void addCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48478275", new Object[]{this});
                return;
            }
            synchronized (this) {
                this.b++;
                if (this.b >= this.f5669a && NetworkDiagnoseManager.access$600(NetworkDiagnoseManager.this) != null) {
                    NetworkDiagnoseManager.access$600(NetworkDiagnoseManager.this).report(true, false, true, "");
                }
            }
        }
    }
}

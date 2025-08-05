package com.alipay.mobile.common.amnet.biz;

import com.alipay.mobile.common.amnet.api.AmnetEnvHelper;
import com.alipay.mobile.common.amnet.api.AmnetResult;
import com.alipay.mobile.common.amnet.api.AmnetStorageListener;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetBeanFactory;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transportext.amnet.AmnetUtil;
import com.android.alibaba.ip.runtime.IpChange;
import tb.orq;

/* loaded from: classes3.dex */
public class AmnetTunnelManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_KEY_ACTIVATE_NUM = "activate_fc";
    public static final String LOG_KEY_IS_PUSH_PROC = "isPush";
    public static final String LOG_KEY_NEW_LIB = "newTun";
    public static final String LOG_KEY_OLD_LIB = "oldTun";
    public static final String LOG_KEY_REASON = "reason";
    public static final String LOG_KEY_RPC_FAILED_NUM = "rpc_fc";
    public static final String LOG_PARAM3 = "soLib";
    public static final String LOG_REASON_ACTIVATE_COUNT = "ACTIVATE_COUNT_LIMIT";
    public static final String LOG_REASON_RPC_FAILED = "RPC_FAILED_LIMIT";
    public static final String LOG_REASON_RPC_FAILED_TO_SUCCESS = "RPC_FAILED_TO_SUCCESS";
    public static final String LOG_REASON_SWITCH = "SWITCH_CHANGE";
    public static final String LOG_SUBTYPE = "TunnelChange";
    public static final String LOG_VAL_BIFROST_LIB = "BIFROST";
    public static final String LOG_VAL_NO_LIB = "NOLIB";
    public static final String LOG_VAL_OLD_LIB = "OLDLIB";
    public static final int PROTOCOL_BIFROST_HTTP2 = 1;
    public static final int PROTOCOL_BIFROST_MMTP = 0;
    public static final int PROTOCOL_BIFROST_MQTT = 2;
    public static final int STATE_BIFROST_LIB = 2;
    public static final int STATE_NO_LIB = 0;
    public static final int STATE_OLD_LIB = 1;
    public static final int ST_DOWNGRADE = 99;
    public static final int ST_IDLE = 0;
    public static final int ST_UPGRADE = 98;

    /* renamed from: a  reason: collision with root package name */
    private static AmnetTunnelManager f5365a = null;
    private static boolean b = true;
    private static long c = 7200;
    private static long d = 1000;
    private static long e = 30;
    private static int f = 3;
    private static int g = 6;
    private static boolean h = false;
    private static boolean i = false;
    private static boolean j = false;
    private static boolean k = false;
    private boolean A;
    private boolean y;
    private volatile int l = 0;
    private volatile int m = 0;
    private volatile int n = 0;
    private int o = 0;
    private int p = 0;
    private long q = 0;
    private long r = 0;
    private long s = 0;
    private long t = 0;
    private boolean u = false;
    private boolean v = false;
    private boolean w = true;
    private Boolean x = null;
    private boolean z = false;

    public static /* synthetic */ int access$000(AmnetTunnelManager amnetTunnelManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("671d5161", new Object[]{amnetTunnelManager})).intValue() : amnetTunnelManager.m;
    }

    public static /* synthetic */ int access$102(AmnetTunnelManager amnetTunnelManager, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e508148b", new Object[]{amnetTunnelManager, new Integer(i2)})).intValue();
        }
        amnetTunnelManager.n = i2;
        return i2;
    }

    public static /* synthetic */ void access$200(AmnetTunnelManager amnetTunnelManager, String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71d3aa8a", new Object[]{amnetTunnelManager, str, str2, str3, new Boolean(z)});
        } else {
            amnetTunnelManager.a(str, str2, str3, z);
        }
    }

    private AmnetTunnelManager() {
        this.y = false;
        this.A = false;
        c();
        this.y = TransportStrategy.isEnabledOnlyUseBifrostH2(AmnetEnvHelper.getAppContext());
        this.A = TransportStrategy.isEnableOnlyBifrostStdH2(AmnetEnvHelper.getAppContext());
    }

    public static AmnetTunnelManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetTunnelManager) ipChange.ipc$dispatch("ee4ed007", new Object[0]);
        }
        AmnetTunnelManager amnetTunnelManager = f5365a;
        if (amnetTunnelManager != null) {
            return amnetTunnelManager;
        }
        synchronized (AmnetTunnelManager.class) {
            if (f5365a != null) {
                return f5365a;
            }
            f5365a = new AmnetTunnelManager();
            return f5365a;
        }
    }

    public boolean isNowUseBifrost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a128e14d", new Object[]{this})).booleanValue() : 2 == this.l;
    }

    public boolean canUseBifrost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("17fc8cd1", new Object[]{this})).booleanValue() : this.y || this.z || (h && !isBifrostInDowngrade() && this.n != 99);
    }

    public boolean isNowUseBifrostH2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("27623cb7", new Object[]{this})).booleanValue() : isNowUseBifrost() && 1 == this.m;
    }

    public boolean canUseBifrostH2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("37f9173b", new Object[]{this})).booleanValue() : this.y || (i && !isBifrostInDowngrade());
    }

    public boolean isInBifrostStdH2Model() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("93fc2f5", new Object[]{this})).booleanValue() : this.A;
    }

    public boolean isBifrostInDowngrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("490a1288", new Object[]{this})).booleanValue();
        }
        if (!j || TransportStrategy.isDisableBifrostRpcDowngrade()) {
            return false;
        }
        return a();
    }

    public boolean isBifrostLocalInDowngrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbaa0963", new Object[]{this})).booleanValue();
        }
        if (this.w) {
            updateBifrostSwitch();
        }
        if (!AmnetSwitchManagerImpl.getInstance().enableBifrostLocalDowngrade()) {
            return false;
        }
        boolean a2 = a();
        Boolean bool = this.x;
        if (bool == null || bool.booleanValue() != a2) {
            this.x = a2 ? Boolean.TRUE : Boolean.FALSE;
            LogCatUtil.info("AMNETTunnelManager", "[isBifrostLocalInDowngrade] Downgrade state change to " + a2);
        }
        return a2;
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.r > 0 && !this.y && !this.z) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis < this.r) {
                this.r = currentTimeMillis;
                a(true, false);
            }
            if (currentTimeMillis - this.r <= c * 1000) {
                return true;
            }
        }
        return false;
    }

    public void procActivateTick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29cad12d", new Object[]{this});
            return;
        }
        boolean z = b;
        if (!z) {
            return;
        }
        if (z) {
            b = false;
        }
        updateBifrostSwitch();
        if (!b() || !h) {
            return;
        }
        if (!this.u) {
            c();
        }
        boolean isRealPushProcess = MiscUtils.isRealPushProcess(AmnetEnvHelper.getAppContext());
        if (isRealPushProcess) {
            if (isBifrostInDowngrade()) {
                LogCatUtil.warn("AMNETTunnelManager", "[procActivateTick] bifrost is in downgrade period, do not use.");
                return;
            }
        } else if (isBifrostLocalInDowngrade()) {
            LogCatUtil.warn("AMNETTunnelManager", "[procActivateTick] bifrost is in downgrade period, do not use.");
            return;
        }
        this.r = 0L;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - this.s;
        long j3 = e * 1000;
        LogCatUtil.info("AMNETTunnelManager", "procActivateTick, now = " + currentTimeMillis + ", diffDate = " + j2 + ", activateTimeLimit = " + j3);
        if (j2 > j3) {
            this.p = 0;
            this.s = currentTimeMillis;
        } else {
            this.p++;
        }
        if (this.p >= f) {
            LogCatUtil.warn("AMNETTunnelManager", "AMNET active times overflow. consider downgrade to use old amnet lib");
            a(LOG_REASON_ACTIVATE_COUNT, LOG_VAL_BIFROST_LIB, LOG_VAL_NO_LIB, isRealPushProcess);
            this.p = 0;
            this.s = 0L;
            this.r = currentTimeMillis;
        }
        a(true, true);
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (MiscUtils.isRealPushProcess(AmnetEnvHelper.getAppContext())) {
            if (TransportStrategy.isDisableBifrostRpcDowngrade() || !j) {
                return false;
            }
        } else if (!k) {
            return false;
        }
        return true;
    }

    public int getState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue() : this.l;
    }

    public void setState(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfef36d", new Object[]{this, new Integer(i2)});
        } else {
            this.l = i2;
        }
    }

    public boolean isStateIdle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c49e1906", new Object[]{this})).booleanValue() : this.n == 0;
    }

    public void setBifrostProtocol(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4802d369", new Object[]{this, new Integer(i2)});
        } else {
            this.m = i2;
        }
    }

    public void updateBifrostSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1b26af", new Object[]{this});
            return;
        }
        try {
            if (this.w) {
                this.w = false;
            }
            this.y = TransportStrategy.isEnabledOnlyUseBifrostH2(AmnetEnvHelper.getAppContext());
            this.A = TransportStrategy.isEnableOnlyBifrostStdH2(AmnetEnvHelper.getAppContext());
            h = AmnetSwitchManagerImpl.getInstance().useBifrost();
            i = AmnetSwitchManagerImpl.getInstance().enableBifrostHttp2();
            j = AmnetSwitchManagerImpl.getInstance().enableBifrostDowngrade();
            k = AmnetSwitchManagerImpl.getInstance().enableBifrostLocalDowngrade();
            c = TransportConfigureManager.getInstance().getLongValue(AmnetConfigureItem.BIFROST_DOWNGRADE_PERIOD);
            d = TransportConfigureManager.getInstance().getLongValue(AmnetConfigureItem.BIFROST_IGNORE_FAILED_RPC_TIME);
            e = TransportConfigureManager.getInstance().getLongValue(AmnetConfigureItem.BIFROST_ACTIVATE_TIME);
            f = TransportConfigureManager.getInstance().getIntValue(AmnetConfigureItem.BIFROST_ACTIVATE_NUM);
            g = TransportConfigureManager.getInstance().getIntValue(AmnetConfigureItem.BIFROST_FAILED_RPC_NUM);
            int intValue = TransportConfigureManager.getInstance().getIntValue(AmnetConfigureItem.LONGLINK_CONN_MAX);
            boolean isNetworkRunInSingleProcess = TransportStrategy.isNetworkRunInSingleProcess(AmnetEnvHelper.getAppContext());
            LogCatUtil.info("AMNETTunnelManager", "updateBifrostSwitch ok, enableBifrost:" + h + ", bifrost_http2:" + i + ", am_bde:" + j + ", b_dp:" + c + ", b_ift:" + d + ", b_at:" + e + ", b_an:" + f + ", b_frn:" + g + ",longconnmax:" + intValue + ", isOnlyUseBifrostH2:" + this.y + ", isNetworkRunSingleProcess:" + isNetworkRunInSingleProcess);
        } catch (Throwable th) {
            LogCatUtil.error("AMNETTunnelManager", "updateBifrostSwitch ", th);
        }
    }

    public synchronized void processRpcResult(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c053a5a", new Object[]{this, new Boolean(z)});
            return;
        }
        if (isNowUseBifrost() && !isBifrostInDowngrade()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (z) {
                this.o = 0;
                this.q = 0L;
                return;
            }
            if (currentTimeMillis < this.q) {
                currentTimeMillis = this.q;
            }
            if (currentTimeMillis - this.q < d) {
                return;
            }
            if (!NetworkUtils.isNetworkAvailable(AmnetEnvHelper.getAppContext())) {
                return;
            }
            this.o++;
            this.q = currentTimeMillis;
            LogCatUtil.warn("AMNETTunnelManager", "add rpc failed num, num=" + this.o);
            if (this.o < g) {
                return;
            }
            LogCatUtil.warn("AMNETTunnelManager", "the continuous failed rpc is out of range, num=" + this.o);
            if (TransportStrategy.isDisableBifrostRpcDowngrade()) {
                this.o = 0;
                this.q = 0L;
                LogCatUtil.warn("AMNETTunnelManager", "DisableBifrostRpcDowngrade, reset the failed num, continue to count");
                return;
            }
            a(true, LOG_REASON_RPC_FAILED);
            return;
        }
        a(z);
    }

    public void considerTunnelChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5766ea98", new Object[]{this});
        } else if (getState() == 0) {
            LogCatUtil.warn("AMNETTunnelManager", "now no lib, do not consider change tunnel");
        } else if (isNowUseBifrost() && !h) {
            LogCatUtil.warn("AMNETTunnelManager", "The bifrost switch is off, consider to downgrade.");
            a(false, LOG_REASON_SWITCH);
        } else if (isNowUseBifrostH2() && !i) {
            LogCatUtil.warn("AMNETTunnelManager", "The bifrost http2 switch is off, consider to downgrade.");
            a(false, LOG_REASON_SWITCH);
        } else if (1 == getState() && h && !isBifrostInDowngrade()) {
            LogCatUtil.warn("AMNETTunnelManager", "The bifrost switch is on, consider to upgrade.");
            a(LOG_REASON_SWITCH);
        } else {
            LogCatUtil.info("AMNETTunnelManager", "considerTunnelChange end.");
        }
    }

    private synchronized void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z && isBifrostInDowngrade() && !this.v) {
            this.v = true;
            if (System.currentTimeMillis() - this.r >= orq.FRAME_CHECK_TIMEOUT) {
                LogCatUtil.warn("AMNETTunnelManager", "rpc success's time bigger than 20000");
            } else {
                a(LOG_REASON_RPC_FAILED_TO_SUCCESS, LOG_VAL_BIFROST_LIB, LOG_VAL_OLD_LIB, MiscUtils.isRealPushProcess(AmnetEnvHelper.getAppContext()));
            }
        }
    }

    private synchronized void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
        } else if (!j) {
        } else {
            if (!isNowUseBifrost()) {
                return;
            }
            if (getState() != 0 && this.n == 0) {
                a(str, LOG_VAL_BIFROST_LIB, LOG_VAL_OLD_LIB, MiscUtils.isRealPushProcess(AmnetEnvHelper.getAppContext()));
                ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).getRpcidSet().clear();
                this.o = 0;
                this.p = 0;
                this.q = 0L;
                this.s = 0L;
                this.r = 0L;
                if (z) {
                    this.r = System.currentTimeMillis();
                    this.v = false;
                }
                a(true, true);
                this.t = System.currentTimeMillis();
                if (this.y) {
                    LogCatUtil.warn("AMNETTunnelManager", "Do not downgrade, because of onlyUseBifrostH2.");
                } else if (this.z) {
                    LogCatUtil.warn("AMNETTunnelManager", "Do not downgrade, because of onlyUseBifrostMqtt.");
                } else {
                    this.n = 99;
                    ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).shutdownAmnet(new AmnetResult() { // from class: com.alipay.mobile.common.amnet.biz.AmnetTunnelManager.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.mobile.common.amnet.api.AmnetResult
                        public void notifyResult(boolean z2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("be5d5a27", new Object[]{this, new Boolean(z2)});
                                return;
                            }
                            LogCatUtil.info("AMNETTunnelManager", "downgrade bifrost " + AmnetTunnelManager.access$000(AmnetTunnelManager.this) + ", first shutdown, reuslt=" + z2);
                            if (AmnetTunnelManager.this.getState() != 0) {
                                AmnetTunnelManager.access$102(AmnetTunnelManager.this, 0);
                                return;
                            }
                            ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).activateAmnet(new AmnetResult() { // from class: com.alipay.mobile.common.amnet.biz.AmnetTunnelManager.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.alipay.mobile.common.amnet.api.AmnetResult
                                public void notifyResult(boolean z3) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("be5d5a27", new Object[]{this, new Boolean(z3)});
                                        return;
                                    }
                                    LogCatUtil.info("AMNETTunnelManager", "downgrade bifrost, second activate, result=" + z3);
                                }
                            });
                            AmnetTunnelManager.access$102(AmnetTunnelManager.this, 0);
                        }
                    });
                    LogCatUtil.info("AMNETTunnelManager", "downgrade bifrost done.");
                }
            }
        }
    }

    private synchronized void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (1 != getState()) {
        } else {
            if (((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).isInForegound()) {
                LogCatUtil.info("AMNETTunnelManager", "in foregound, do not to upgrade bifrost.");
                return;
            }
            int size = ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).getRpcidSet().size();
            if (size > 0) {
                LogCatUtil.warn("AMNETTunnelManager", "there is rpc on road,do not upgrade bifrost,size: " + size);
            } else if (!canUseBifrost()) {
            } else {
                if (getState() != 0 && this.n == 0) {
                    if (System.currentTimeMillis() - this.t < 3000) {
                        LogCatUtil.warn("AMNETTunnelManager", "time limit, do not upgrade");
                        return;
                    }
                    this.o = 0;
                    this.p = 0;
                    this.q = 0L;
                    this.s = 0L;
                    this.r = 0L;
                    a(true, true);
                    this.n = 98;
                    ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).shutdownAmnet(new AmnetResult() { // from class: com.alipay.mobile.common.amnet.biz.AmnetTunnelManager.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.mobile.common.amnet.api.AmnetResult
                        public void notifyResult(boolean z) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("be5d5a27", new Object[]{this, new Boolean(z)});
                                return;
                            }
                            LogCatUtil.info("AMNETTunnelManager", "upgrade bifrost, first shutdown, reuslt=" + z);
                            if (AmnetTunnelManager.this.getState() != 0) {
                                AmnetTunnelManager.access$102(AmnetTunnelManager.this, 0);
                                return;
                            }
                            ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).activateAmnet(new AmnetResult() { // from class: com.alipay.mobile.common.amnet.biz.AmnetTunnelManager.2.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.alipay.mobile.common.amnet.api.AmnetResult
                                public void notifyResult(boolean z2) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("be5d5a27", new Object[]{this, new Boolean(z2)});
                                        return;
                                    }
                                    LogCatUtil.info("AMNETTunnelManager", "upgrade bifrost " + AmnetTunnelManager.access$000(AmnetTunnelManager.this) + ", second activate, result=" + z2);
                                    AmnetTunnelManager.access$200(AmnetTunnelManager.this, str, AmnetTunnelManager.LOG_VAL_OLD_LIB, AmnetTunnelManager.LOG_VAL_BIFROST_LIB, MiscUtils.isRealPushProcess(AmnetEnvHelper.getAppContext()));
                                }
                            });
                            AmnetTunnelManager.access$102(AmnetTunnelManager.this, 0);
                        }
                    });
                    LogCatUtil.info("AMNETTunnelManager", "upgrade bifrost done.");
                }
            }
        }
    }

    private void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (z) {
            try {
                AmnetStorageListener.getInstance().putCommon("bifrost_dg_tm", AmnetUtil.convert(String.valueOf(this.r)));
            } catch (Throwable th) {
                LogCatUtil.error("AMNETTunnelManager", "saveStorageTickTime error: ", th);
                return;
            }
        }
        if (!z2) {
            return;
        }
        AmnetStorageListener.getInstance().putCommon("bifrost_start_tm", AmnetUtil.convert(String.valueOf(this.s)));
        AmnetStorageListener.getInstance().putCommon("bifrost_start_num", AmnetUtil.convert(String.valueOf(this.p)));
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            if (this.u) {
                return;
            }
            byte[] common = AmnetStorageListener.getInstance().getCommon("bifrost_dg_tm");
            byte[] common2 = AmnetStorageListener.getInstance().getCommon("bifrost_start_tm");
            byte[] common3 = AmnetStorageListener.getInstance().getCommon("bifrost_start_num");
            if (common != null && common.length > 0) {
                this.r = Long.parseLong(AmnetUtil.convert(common));
            }
            if (common2 != null && common2.length > 0) {
                this.s = Long.parseLong(AmnetUtil.convert(common2));
            }
            if (common3 != null && common3.length > 0) {
                this.p = Integer.parseInt(AmnetUtil.convert(common3));
            }
            LogCatUtil.info("AMNETTunnelManager", "stampDownGrade=" + this.r + ", stampActivateAmnet=" + this.s + ", cntActivateAmnetNum=" + this.p);
            this.u = true;
        } catch (Throwable th) {
            LogCatUtil.error("AMNETTunnelManager", th);
        }
    }

    private void a(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bfeb4e", new Object[]{this, str, str2, str3, new Boolean(z)});
            return;
        }
        try {
            MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
            monitorLoggerModel.setSubType(LOG_SUBTYPE);
            monitorLoggerModel.setParam1(MonitorLoggerUtils.getLogBizType(LOG_SUBTYPE));
            monitorLoggerModel.setParam2("INFO");
            monitorLoggerModel.setParam3(LOG_PARAM3);
            monitorLoggerModel.getExtPramas().put(LOG_KEY_OLD_LIB, str2);
            monitorLoggerModel.getExtPramas().put(LOG_KEY_NEW_LIB, str3);
            monitorLoggerModel.getExtPramas().put("reason", str);
            monitorLoggerModel.getExtPramas().put(LOG_KEY_ACTIVATE_NUM, String.valueOf(this.p));
            monitorLoggerModel.getExtPramas().put(LOG_KEY_RPC_FAILED_NUM, String.valueOf(this.o));
            if (isNowUseBifrostH2()) {
                monitorLoggerModel.getExtPramas().put(MonitorLoggerUtils.LIB_VERSION, MonitorLoggerUtils.LIB_VERSION_BIFROST_HTTP2);
                monitorLoggerModel.getExtPramas().put("NETTUNNEL", MonitorLoggerUtils.NETTUNNEL_ULib_h2);
            } else {
                monitorLoggerModel.getExtPramas().put(MonitorLoggerUtils.LIB_VERSION, MonitorLoggerUtils.LIB_VERSION_BIFROST);
            }
            monitorLoggerModel.getExtPramas().put(LOG_KEY_IS_PUSH_PROC, String.valueOf(z));
            MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
            LogCatUtil.info("AMNETTunnelManager", "networkTunnel switch perflog:" + monitorLoggerModel.toString());
        } catch (Throwable th) {
            LogCatUtil.error("AMNETTunnelManager", "perfLog exception", th);
        }
    }
}

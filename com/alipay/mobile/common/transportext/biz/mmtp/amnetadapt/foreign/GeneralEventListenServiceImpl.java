package com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.foreign;

import android.os.Build;
import com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager;
import com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcGeneralListenService;
import com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.transport.strategy.ExtTransportTunnelWatchdog;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transportext.amnet.Initialization;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.AmnetHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.riy;

/* loaded from: classes3.dex */
public class GeneralEventListenServiceImpl implements MainProcGeneralListenService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static GeneralEventListenServiceImpl b;

    /* renamed from: a  reason: collision with root package name */
    private AmnetGeneralEventManager f5680a;
    private byte c;

    public static final MainProcGeneralListenService getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainProcGeneralListenService) ipChange.ipc$dispatch("120514d3", new Object[0]);
        }
        if (b == null) {
            synchronized (MainProcGeneralListenService.class) {
                if (b == null) {
                    b = new GeneralEventListenServiceImpl();
                }
            }
        }
        return b;
    }

    private GeneralEventListenServiceImpl() {
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcGeneralListenService
    public void change(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a8d39ac", new Object[]{this, new Integer(i)});
        } else {
            NetworkAsyncTaskExecutor.executeDispatch(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.foreign.GeneralEventListenServiceImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        GeneralEventListenServiceImpl.this.getAmnetGeneralEventManager().notifyConnStateChange(i);
                    }
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcGeneralListenService
    public void panic(final int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f5029cf", new Object[]{this, new Integer(i), str});
        } else {
            NetworkAsyncTaskExecutor.executeDispatch(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.foreign.GeneralEventListenServiceImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        GeneralEventListenServiceImpl.this.getAmnetGeneralEventManager().notifyError(i, str);
                    }
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcGeneralListenService
    public Map<Byte, Map<String, String>> collect(Map<Byte, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ad8d49e9", new Object[]{this, map});
        }
        getAmnetGeneralEventManager().notifyCollectInitInfo(map);
        Map<String, String> map2 = map.get((byte) 0);
        if (map2 == null) {
            map2 = new HashMap<>();
            map.put((byte) 0, map2);
        }
        map2.put("imei", DeviceInfoUtil.getImei());
        map2.put("imsi", DeviceInfoUtil.getImsi());
        map2.put("utdid", DeviceInfoUtil.getDeviceId());
        try {
            map2.put("vmType", DeviceInfoUtil.getVmType());
            map2.put("apiLevel", String.valueOf(Build.VERSION.SDK_INT));
            map2.put("releaseVersion", AppInfoUtil.getReleaseCode());
        } catch (Throwable th) {
            LogCatUtil.error("amnet_MainProcGeneralListenService", "[collect] Exception: " + th.toString(), th);
        }
        LogCatUtil.info("amnet_MainProcGeneralListenService", "main process init info = [" + map.toString() + riy.ARRAY_END_STR);
        return map;
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcGeneralListenService
    public void report(final String str, final double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b818819", new Object[]{this, str, new Double(d)});
        } else {
            NetworkAsyncTaskExecutor.executeDispatch(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.foreign.GeneralEventListenServiceImpl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        GeneralEventListenServiceImpl.this.getAmnetGeneralEventManager().notifyReport(str, d);
                    }
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcGeneralListenService
    public void notifyInitOk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("febd35bc", new Object[]{this});
        } else {
            NetworkAsyncTaskExecutor.executeDispatch(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.foreign.GeneralEventListenServiceImpl.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        GeneralEventListenServiceImpl.this.getAmnetGeneralEventManager().notifyInitOk();
                    }
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcGeneralListenService
    public void touch(final String str, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f93e466e", new Object[]{this, str, str2, str3, str4});
        } else {
            NetworkAsyncTaskExecutor.executeDispatch(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.foreign.GeneralEventListenServiceImpl.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        GeneralEventListenServiceImpl.this.getAmnetGeneralEventManager().notifyReportIpPort(str, str2, str3, str4);
                    }
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcGeneralListenService
    public void restrict(final int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d5cfbea", new Object[]{this, new Integer(i), str});
        } else {
            NetworkAsyncTaskExecutor.executeDispatch(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.foreign.GeneralEventListenServiceImpl.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        GeneralEventListenServiceImpl.this.getAmnetGeneralEventManager().notifyRestrict(i, str);
                    }
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcGeneralListenService
    public void listenSessionInvalid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c7df4af", new Object[]{this});
        } else {
            NetworkAsyncTaskExecutor.executeDispatch(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.foreign.GeneralEventListenServiceImpl.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        GeneralEventListenServiceImpl.this.getAmnetGeneralEventManager().notifySessionInvalid();
                    }
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcGeneralListenService
    public void resendSessionid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80e3e1bd", new Object[]{this});
        } else {
            NetworkAsyncTaskExecutor.executeDispatch(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.foreign.GeneralEventListenServiceImpl.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        GeneralEventListenServiceImpl.this.getAmnetGeneralEventManager().notifyResendSessionid();
                    }
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcGeneralListenService
    public void notifyAmnetLifeChanged(byte b2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29b7ac45", new Object[]{this, new Byte(b2)});
            return;
        }
        synchronized (this) {
            this.c = b2;
        }
        if (b2 == 2) {
            ExtTransportTunnelWatchdog.getInstance().mrpcFailureRest();
        }
        LogCatUtil.info("amnet_MainProcGeneralListenService", "====notifyAmnetLifeChanged ,Amnet change to==== " + ((int) b2));
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcGeneralListenService
    public void onFinalErrorEvent(final long j, final int i, final String str, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a4b5ec", new Object[]{this, new Long(j), new Integer(i), str, map});
        } else {
            NetworkAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.foreign.GeneralEventListenServiceImpl.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        GeneralEventListenServiceImpl.this.getAmnetGeneralEventManager().notifyFinalError(j, i, str, map);
                    }
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcGeneralListenService
    public void notifyGift(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50ee1d34", new Object[]{this, str, str2});
        } else {
            NetworkAsyncTaskExecutor.executeDispatch(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.foreign.GeneralEventListenServiceImpl.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        GeneralEventListenServiceImpl.this.getAmnetGeneralEventManager().notifyGift(str, str2);
                    }
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcGeneralListenService
    public void notifyInitResponse(final Initialization.RspInit rspInit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b845a7ee", new Object[]{this, rspInit});
        } else {
            NetworkAsyncTaskExecutor.executeDispatch(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.foreign.GeneralEventListenServiceImpl.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        GeneralEventListenServiceImpl.this.getAmnetGeneralEventManager().notifyInitResponse(rspInit);
                    }
                }
            });
        }
    }

    public AmnetGeneralEventManager getAmnetGeneralEventManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetGeneralEventManager) ipChange.ipc$dispatch("dd0d982d", new Object[]{this});
        }
        if (this.f5680a == null) {
            this.f5680a = AmnetHelper.getAmnetManager().getAmnetGeneralEventManager();
        }
        return this.f5680a;
    }

    public void setAmnetLifeState(byte b2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1a9fcf", new Object[]{this, new Byte(b2)});
            return;
        }
        synchronized (this) {
            this.c = b2;
        }
        LogCatUtil.info("amnet_MainProcGeneralListenService", "[setAmnetLifeState] Amnet state change to " + ((int) b2));
    }

    public boolean isAmnetActived() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2cfc7e42", new Object[]{this})).booleanValue() : this.c == 2;
    }
}

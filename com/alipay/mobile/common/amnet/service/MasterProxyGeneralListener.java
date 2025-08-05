package com.alipay.mobile.common.amnet.service;

import com.alipay.mobile.common.amnet.api.AmnetListenerAdpter;
import com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcGeneralListenService;
import com.alipay.mobile.common.amnet.ipcapi.pushproc.AmnetClientService;
import com.alipay.mobile.common.amnet.service.ipcservice.AmnetClientServiceImpl;
import com.alipay.mobile.common.amnet.service.util.HoldOnTask;
import com.alipay.mobile.common.amnet.service.util.PushIpcHelper;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.amnet.Initialization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class MasterProxyGeneralListener extends AmnetListenerAdpter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static MasterProxyGeneralListener f5379a;
    private MainProcGeneralListenService b = null;

    public static /* synthetic */ Object ipc$super(MasterProxyGeneralListener masterProxyGeneralListener, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ MainProcGeneralListenService access$000(MasterProxyGeneralListener masterProxyGeneralListener) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MainProcGeneralListenService) ipChange.ipc$dispatch("94ddda95", new Object[]{masterProxyGeneralListener}) : masterProxyGeneralListener.a();
    }

    private MasterProxyGeneralListener() {
    }

    public static final MasterProxyGeneralListener getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MasterProxyGeneralListener) ipChange.ipc$dispatch("21c758ed", new Object[0]);
        }
        MasterProxyGeneralListener masterProxyGeneralListener = f5379a;
        if (masterProxyGeneralListener != null) {
            return masterProxyGeneralListener;
        }
        synchronized (MasterProxyGeneralListener.class) {
            if (f5379a != null) {
                return f5379a;
            }
            f5379a = new MasterProxyGeneralListener();
            return f5379a;
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void change(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a8d39ac", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            if (!PushIpcHelper.hasRegister()) {
                return;
            }
            a().change(i);
        } catch (Exception e) {
            LogCatUtil.error("MasterProxyGeneralListener", e);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void panic(final int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f5029cf", new Object[]{this, new Integer(i), str});
            return;
        }
        try {
            new HoldOnTask().execute(new Runnable() { // from class: com.alipay.mobile.common.amnet.service.MasterProxyGeneralListener.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MasterProxyGeneralListener.access$000(MasterProxyGeneralListener.this).panic(i, str);
                    }
                }
            });
        } catch (Exception e) {
            LogCatUtil.error("MasterProxyGeneralListener", e);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public Map<Byte, Map<String, String>> collect(Map<Byte, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ad8d49e9", new Object[]{this, map}) : AmnetInitInfosHelper.collectFacade(map);
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void report(final String str, final double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b818819", new Object[]{this, str, new Double(d)});
            return;
        }
        try {
            new HoldOnTask().execute(new Runnable() { // from class: com.alipay.mobile.common.amnet.service.MasterProxyGeneralListener.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MasterProxyGeneralListener.access$000(MasterProxyGeneralListener.this).report(str, d);
                    }
                }
            });
        } catch (Exception e) {
            LogCatUtil.error("MasterProxyGeneralListener", e);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void notifyInitOk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("febd35bc", new Object[]{this});
            return;
        }
        try {
            if (!PushIpcHelper.hasRegister()) {
                return;
            }
            a().notifyInitOk();
        } catch (Exception e) {
            LogCatUtil.error("MasterProxyGeneralListener", e);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void touch(final String str, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f93e466e", new Object[]{this, str, str2, str3, str4});
            return;
        }
        try {
            new HoldOnTask().execute(new Runnable() { // from class: com.alipay.mobile.common.amnet.service.MasterProxyGeneralListener.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MasterProxyGeneralListener.access$000(MasterProxyGeneralListener.this).touch(str, str2, str3, str4);
                    }
                }
            });
        } catch (Exception e) {
            LogCatUtil.error("MasterProxyGeneralListener", e);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void restrict(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d5cfbea", new Object[]{this, new Integer(i), str});
            return;
        }
        try {
            if (!PushIpcHelper.hasRegister()) {
                return;
            }
            a().restrict(i, str);
        } catch (Exception e) {
            LogCatUtil.error("MasterProxyGeneralListener", e);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void listenSessionInvalid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c7df4af", new Object[]{this});
            return;
        }
        try {
            if (!PushIpcHelper.hasRegister()) {
                return;
            }
            a().listenSessionInvalid();
        } catch (Exception e) {
            LogCatUtil.error("MasterProxyGeneralListener", e);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void notifyResendSessionid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28c8d3b4", new Object[]{this});
            return;
        }
        try {
            if (!PushIpcHelper.hasRegister()) {
                return;
            }
            a().resendSessionid();
        } catch (Exception e) {
            LogCatUtil.error("MasterProxyGeneralListener", e);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void onFinalErrorEvent(long j, int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a4b5ec", new Object[]{this, new Long(j), new Integer(i), str, map});
            return;
        }
        try {
            if (!PushIpcHelper.hasRegister()) {
                return;
            }
            a().onFinalErrorEvent(j, i, str, map);
        } catch (Exception e) {
            LogCatUtil.error("MasterProxyGeneralListener", e);
        }
    }

    public void notifyAmnetLifeChange(byte b) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac04981", new Object[]{this, new Byte(b)});
            return;
        }
        try {
            AmnetClientService amnetClientServiceImpl = AmnetClientServiceImpl.getInstance();
            if (b != 2) {
                z = false;
            }
            amnetClientServiceImpl.setAmnetActiveted(z);
            if (!PushIpcHelper.hasRegister()) {
                return;
            }
            LogCatUtil.info("MasterProxyGeneralListener", "=======notifyAmnetLifeChange======= : " + ((int) b));
            a().notifyAmnetLifeChanged(b);
        } catch (Exception e) {
            LogCatUtil.error("MasterProxyGeneralListener", e);
        }
    }

    private MainProcGeneralListenService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainProcGeneralListenService) ipChange.ipc$dispatch("b54b2729", new Object[]{this});
        }
        if (this.b == null) {
            this.b = (MainProcGeneralListenService) PushIpcHelper.getIpcProxy(MainProcGeneralListenService.class);
        }
        return this.b;
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void notifyGift(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50ee1d34", new Object[]{this, str, str2});
            return;
        }
        try {
            if (!PushIpcHelper.hasRegister()) {
                return;
            }
            a().notifyGift(str, str2);
        } catch (Exception e) {
            LogCatUtil.error("MasterProxyGeneralListener", e);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void notifyInitResponse(Initialization.RspInit rspInit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b845a7ee", new Object[]{this, rspInit});
            return;
        }
        try {
            if (!PushIpcHelper.hasRegister()) {
                return;
            }
            a().notifyInitResponse(rspInit);
        } catch (Throwable th) {
            LogCatUtil.error("MasterProxyGeneralListener", th);
        }
    }
}

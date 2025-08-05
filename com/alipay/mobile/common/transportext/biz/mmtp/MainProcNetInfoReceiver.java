package com.alipay.mobile.common.transportext.biz.mmtp;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.mobile.common.amnet.ipcapi.pushproc.OutEventNotifyService;
import com.alipay.mobile.common.ipc.api.IPCApiFactory;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.transport.TransportNetInfoReceiver;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.httpdns.HttpDns;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.monitor.SignalStateHelper;
import com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetlocaladapt.AmnetLocalAppEventListener;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportEnv;
import com.alipay.mobile.common.transportext.util.NwRigorousNetworkConnReceiver;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import mtopsdk.mtop.util.ErrorConstant;
import tb.riy;

/* loaded from: classes3.dex */
public class MainProcNetInfoReceiver extends NwRigorousNetworkConnReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static MainProcNetInfoReceiver f5676a = null;
    public static final long changeInterval = 3600000;
    private boolean b;
    private byte c;
    private String d;
    private String e;
    private int f;
    private int g;
    private long h;

    public static /* synthetic */ Object ipc$super(MainProcNetInfoReceiver mainProcNetInfoReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(MainProcNetInfoReceiver mainProcNetInfoReceiver, Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b438b115", new Object[]{mainProcNetInfoReceiver, context, new Boolean(z)});
        } else {
            mainProcNetInfoReceiver.a(context, z);
        }
    }

    public static /* synthetic */ boolean access$100(MainProcNetInfoReceiver mainProcNetInfoReceiver) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c9a8ac8e", new Object[]{mainProcNetInfoReceiver})).booleanValue() : mainProcNetInfoReceiver.b;
    }

    public static MainProcNetInfoReceiver getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainProcNetInfoReceiver) ipChange.ipc$dispatch("3b668ab2", new Object[]{context});
        }
        MainProcNetInfoReceiver mainProcNetInfoReceiver = f5676a;
        if (mainProcNetInfoReceiver != null) {
            return mainProcNetInfoReceiver;
        }
        synchronized (MainProcNetInfoReceiver.class) {
            if (f5676a == null) {
                f5676a = new MainProcNetInfoReceiver(context);
            }
        }
        return f5676a;
    }

    private MainProcNetInfoReceiver(Context context) {
        super(context);
        this.g = 30;
        this.b = true;
        this.c = (byte) -1;
        this.d = "";
        this.e = "";
        this.f = 0;
        this.h = System.currentTimeMillis();
        LogCatUtil.verbose("MainProcNetInfoReceiver", "MainProcNetInfoReceiver init");
    }

    @Override // com.alipay.mobile.common.transportext.util.NwRigorousNetworkConnReceiver
    public void onReceivee(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30528f9d", new Object[]{this, context, intent});
        } else if (context == null || intent == null) {
        } else {
            try {
                TransportNetInfoReceiver.getInstance().onReceive(context, intent);
                a(intent);
                a(context);
                HttpDns.getInstance().getGetAllByNameHelper().clearCache();
                AlipayQosService.getInstance().resetRtoWhenNetchange();
            } catch (Throwable th) {
                LogCatUtil.error("MainProcNetInfoReceiver", "onReceivee exception", th);
            }
        }
    }

    private void a(final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        try {
            LogCatUtil.debug("MainProcNetInfoReceiver", "==notifyNetInfo==");
            NetworkAsyncTaskExecutor.executeLowPri(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.MainProcNetInfoReceiver.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (!TransportStrategy.isNetworkRunInSingleProcess(ExtTransportEnv.getAppContext())) {
                            ((OutEventNotifyService) IPCApiFactory.getSingletonIPCContextManager().getIpcCallManager().getIpcProxy(OutEventNotifyService.class)).receiveNetInfo(intent);
                        }
                    } catch (Throwable th) {
                        LogCatUtil.error("MainProcNetInfoReceiver", "notifyNetInfo inner exception", th);
                    }
                    AmnetLocalAppEventListener.getInstance().onNetworkChanged(intent);
                }
            });
        } catch (Exception e) {
            LogCatUtil.error("MainProcNetInfoReceiver", "notifyNetInfo exception", e);
        }
    }

    private void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (this.b) {
            LogCatUtil.debug("MainProcNetInfoReceiver", "first receive,record after 10s");
            this.b = false;
            NetworkAsyncTaskExecutor.schedule(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.MainProcNetInfoReceiver.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MainProcNetInfoReceiver.access$000(MainProcNetInfoReceiver.this, context, true);
                    }
                }
            }, 10L, TimeUnit.SECONDS);
        } else {
            NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.MainProcNetInfoReceiver.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MainProcNetInfoReceiver mainProcNetInfoReceiver = MainProcNetInfoReceiver.this;
                    MainProcNetInfoReceiver.access$000(mainProcNetInfoReceiver, context, MainProcNetInfoReceiver.access$100(mainProcNetInfoReceiver));
                }
            });
        }
    }

    private void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{this, context, new Boolean(z)});
            return;
        }
        String b = b(context);
        if (TextUtils.isEmpty(b) || !a()) {
            return;
        }
        a(b, z, c(context));
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        this.f++;
        if (this.f > this.g) {
            if (this.h + 3600000 < System.currentTimeMillis()) {
                this.f = 0;
                this.h = System.currentTimeMillis();
            } else {
                LogCatUtil.debug("MainProcNetInfoReceiver", "netchange count is out " + this.g + ",don't report any more");
                return false;
            }
        }
        return true;
    }

    private String b(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{this, context});
        }
        try {
            NetworkInfo activeNetworkInfo = NetworkUtils.getActiveNetworkInfo(context);
            if (activeNetworkInfo == null) {
                if (this.c == 1) {
                    LogCatUtil.debug("MainProcNetInfoReceiver", "network is not available,repeat broadcast,ignore");
                    return null;
                }
                this.c = (byte) 1;
                this.d = this.e;
                this.e = ErrorConstant.ERRMSG_NO_NETWORK;
                str = "当前无网络";
            } else {
                this.c = (byte) 2;
                this.d = this.e;
                this.e = activeNetworkInfo.getTypeName();
                String networkInfo = activeNetworkInfo.toString();
                if (activeNetworkInfo.getType() == 1) {
                    MiscUtils.isAtFrontDesk(TransportEnvUtil.getContext());
                }
                str = networkInfo;
            }
            if (TextUtils.isEmpty(this.d)) {
                return str;
            }
            return str + " lastTypeName=[" + this.d + riy.ARRAY_END_STR;
        } catch (Throwable th) {
            LogCatUtil.error("MainProcNetInfoReceiver", "getNetinfoDetail ex:" + th.toString());
            return "";
        }
    }

    private Boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("3d1f619b", new Object[]{this, context});
        }
        return false;
    }

    private void a(String str, boolean z, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb9ba32b", new Object[]{this, str, new Boolean(z), bool});
            return;
        }
        MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
        monitorLoggerModel.setSubType("NetChange");
        monitorLoggerModel.setParam1(MonitorLoggerUtils.getLogBizType("NetChange"));
        monitorLoggerModel.setParam2(this.d);
        monitorLoggerModel.setParam3(this.e);
        monitorLoggerModel.getExtPramas().put(RPCDataItems.NetInfo, str);
        if (MiscUtils.isAtFrontDesk(ExtTransportEnv.getAppContext())) {
            monitorLoggerModel.getExtPramas().put("Ground", "Fg");
        } else {
            monitorLoggerModel.getExtPramas().put("Ground", "Bg");
        }
        String b = b();
        if (!TextUtils.isEmpty(b)) {
            monitorLoggerModel.getExtPramas().put("Loc", b);
        }
        String str2 = "T";
        if (NetworkUtils.isVpnUsed()) {
            monitorLoggerModel.getExtPramas().put("VPN", str2);
        }
        if (z) {
            monitorLoggerModel.getExtPramas().put("First", str2);
        }
        if (bool != null) {
            Map<String, String> extPramas = monitorLoggerModel.getExtPramas();
            if (!bool.booleanValue()) {
                str2 = UTConstant.Args.UT_SUCCESS_F;
            }
            extPramas.put("BTOpen", str2);
        }
        String localIPv6Address = NetworkUtils.getLocalIPv6Address();
        if (!TextUtils.isEmpty(localIPv6Address)) {
            monitorLoggerModel.getExtPramas().put("localIPv6", localIPv6Address);
        }
        String gateWayAddress = NetworkUtils.getGateWayAddress();
        if (!TextUtils.isEmpty(gateWayAddress)) {
            monitorLoggerModel.getExtPramas().put("gateway", gateWayAddress);
        }
        MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
        LogCatUtil.debug("MainProcNetInfoReceiver", monitorLoggerModel.toString());
        SignalStateHelper.getInstance().reportNetStateInfo();
    }

    private String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        try {
            String latitude = DeviceInfoUtil.getLatitude();
            String longitude = DeviceInfoUtil.getLongitude();
            if (!TextUtils.isEmpty(latitude) && !TextUtils.isEmpty(longitude)) {
                return latitude + "_" + longitude;
            }
            return "";
        } catch (Throwable th) {
            LogCatUtil.error("MainProcNetInfoReceiver", th);
            return "";
        }
    }
}

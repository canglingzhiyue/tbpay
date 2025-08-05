package com.alipay.mobile.common.netsdkextdependapi.network;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.monitor.Performance;
import com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoManagerAdapter;
import com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoManagerFactory;
import com.alipay.mobile.common.netsdkextdependapi.configservice.NwConfigServiceFactory;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoManagerFactory;
import com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManagerAdapter;
import com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManagerFactory;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManagerFactory;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.TraficConsumeModel;
import com.alipay.mobile.common.netsdkextdependapi.security.SecurityManagerAdapter;
import com.alipay.mobile.common.netsdkextdependapi.security.SecurityManagerFactory;
import com.alipay.mobile.common.netsdkextdependapi.security.SignRequest;
import com.alipay.mobile.common.netsdkextdependapi.security.SignResult;
import com.alipay.mobile.common.transport.utils.APNetworkStartupListener;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import tb.riy;

/* loaded from: classes3.dex */
public class NetworkStartupListener implements APNetworkStartupListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ void access$100(NetworkStartupListener networkStartupListener, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6644d00", new Object[]{networkStartupListener, str, str2});
        } else {
            networkStartupListener.a(str, str2);
        }
    }

    public static /* synthetic */ SignResult access$200(NetworkStartupListener networkStartupListener, SignRequest signRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SignResult) ipChange.ipc$dispatch("61144441", new Object[]{networkStartupListener, signRequest}) : networkStartupListener.a(signRequest);
    }

    @Override // com.alipay.mobile.common.transport.utils.APNetworkStartupListener
    public void onNetworkStartup(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e94d3bb3", new Object[]{this, context});
            return;
        }
        try {
            a("mynet_NetworkStartup", "=====network init start=====");
            d();
            LoggerManagerFactory.getInstance().setDefaultBean(a());
            SecurityManagerFactory.getInstance().setDefaultBean(b());
            AppInfoManagerFactory.getInstance().setDefaultBean(new CustNetworkAppInfoManager());
            DeviceInfoManagerFactory.getInstance().setDefaultBean(new CustDeviceInfoManager());
            MonitorInfoManagerFactory.getInstance().setDefaultBean(c());
            NwConfigServiceFactory.getInstance().setDefaultBean(new TbNwConfigServiceManager(context));
            a("mynet_NetworkStartup", "=====network init end=====");
        } catch (Throwable th) {
            a("mynet_NetworkStartup", "onNetworkStartup:" + th.toString());
        }
    }

    private LoggerManagerAdapter a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LoggerManagerAdapter) ipChange.ipc$dispatch("195ef25f", new Object[]{this}) : new LoggerManagerAdapter() { // from class: com.alipay.mobile.common.netsdkextdependapi.network.NetworkStartupListener.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManagerAdapter, com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManager
            public void info(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f161e0c9", new Object[]{this, str, str2});
                } else {
                    NetworkStartupListener.access$100(NetworkStartupListener.this, str, str2);
                }
            }

            @Override // com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManagerAdapter, com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManager
            public void verbose(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("921d919d", new Object[]{this, str, str2});
                } else {
                    NetworkStartupListener.access$100(NetworkStartupListener.this, str, str2);
                }
            }

            @Override // com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManagerAdapter, com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManager
            public void debug(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9757c96e", new Object[]{this, str, str2});
                } else {
                    NetworkStartupListener.access$100(NetworkStartupListener.this, str, str2);
                }
            }

            @Override // com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManagerAdapter, com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManager
            public void warn(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c21b56a1", new Object[]{this, str, str2});
                } else {
                    NetworkStartupListener.access$100(NetworkStartupListener.this, str, str2);
                }
            }

            @Override // com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManagerAdapter, com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManager
            public void warn(String str, Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a1c403be", new Object[]{this, str, th});
                } else {
                    NetworkStartupListener.access$100(NetworkStartupListener.this, str, th.toString());
                }
            }

            @Override // com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManagerAdapter, com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManager
            public void warn(String str, String str2, Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c808bbf4", new Object[]{this, str, str2, th});
                } else {
                    NetworkStartupListener.access$100(NetworkStartupListener.this, str, th.toString());
                }
            }

            @Override // com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManagerAdapter, com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManager
            public void error(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4a936c23", new Object[]{this, str, str2});
                } else {
                    NetworkStartupListener.access$100(NetworkStartupListener.this, str, str2);
                }
            }

            @Override // com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManagerAdapter, com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManager
            public void error(String str, Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b012e6fc", new Object[]{this, str, th});
                } else {
                    NetworkStartupListener.access$100(NetworkStartupListener.this, str, th.toString());
                }
            }

            @Override // com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManagerAdapter, com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManager
            public void error(String str, String str2, Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c88bb2", new Object[]{this, str, str2, th});
                    return;
                }
                NetworkStartupListener networkStartupListener = NetworkStartupListener.this;
                NetworkStartupListener.access$100(networkStartupListener, str, str2 + th.toString());
            }

            @Override // com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManagerAdapter, com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManager
            public void printInfo(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d94d816", new Object[]{this, str, str2});
                } else {
                    NetworkStartupListener.access$100(NetworkStartupListener.this, str, str2);
                }
            }

            @Override // com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManagerAdapter, com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManager
            public void printError(String str, Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2f6fc9", new Object[]{this, str, th});
                } else {
                    NetworkStartupListener.access$100(NetworkStartupListener.this, str, th.toString());
                }
            }
        };
    }

    private SecurityManagerAdapter b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SecurityManagerAdapter) ipChange.ipc$dispatch("85620ba0", new Object[]{this}) : new SecurityManagerAdapter() { // from class: com.alipay.mobile.common.netsdkextdependapi.network.NetworkStartupListener.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.common.netsdkextdependapi.security.SecurityManagerAdapter, com.alipay.mobile.common.netsdkextdependapi.security.SecurityManager
            public SignResult signature(SignRequest signRequest) {
                NetworkStartupListener networkStartupListener;
                StringBuilder sb;
                String th;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (SignResult) ipChange2.ipc$dispatch("6e8c9153", new Object[]{this, signRequest});
                }
                try {
                    return NetworkStartupListener.access$200(NetworkStartupListener.this, signRequest);
                } catch (SecException e) {
                    networkStartupListener = NetworkStartupListener.this;
                    sb = new StringBuilder();
                    sb.append("[signature] Exception: ");
                    th = e.toString();
                    sb.append(th);
                    NetworkStartupListener.access$100(networkStartupListener, "mynet_NetworkStartup", sb.toString());
                    return SignResult.newEmptySignData();
                } catch (Throwable th2) {
                    networkStartupListener = NetworkStartupListener.this;
                    sb = new StringBuilder();
                    sb.append("[signature] Exception: ");
                    th = th2.toString();
                    sb.append(th);
                    NetworkStartupListener.access$100(networkStartupListener, "mynet_NetworkStartup", sb.toString());
                    return SignResult.newEmptySignData();
                }
            }
        };
    }

    private SignResult a(SignRequest signRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SignResult) ipChange.ipc$dispatch("d36b463c", new Object[]{this, signRequest});
        }
        SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(TransportEnvUtil.getContext());
        if (securityGuardManager == null) {
            a("mynet_NetworkStartup", "[doSignature] request data sign fail, sgMng is null");
            return SignResult.newEmptySignData();
        }
        ISecureSignatureComponent secureSignatureComp = securityGuardManager.getSecureSignatureComp();
        if (secureSignatureComp == null) {
            a("mynet_NetworkStartup", "[doSignature] request data sign fail, ssComp is null");
            return SignResult.newEmptySignData();
        }
        SignResult signResult = new SignResult();
        HashMap hashMap = new HashMap();
        hashMap.put("INPUT", signRequest.content);
        SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
        securityGuardParamContext.paramMap = hashMap;
        securityGuardParamContext.appKey = signRequest.appkey;
        if (signRequest.isSignTypeMD5()) {
            securityGuardParamContext.requestType = 4;
        } else if (signRequest.isSignTypeHmacSha1()) {
            securityGuardParamContext.requestType = 3;
            signResult.signType = SignRequest.SIGN_TYPE_HMAC_SHA1;
        } else if (signRequest.isSignTypeAtlas()) {
            hashMap.put("ATLAS", "a");
            securityGuardParamContext.requestType = 5;
            signResult.signType = SignRequest.SIGN_TYPE_ATLAS;
        }
        signResult.sign = secureSignatureComp.signRequest(securityGuardParamContext, getAuthCode());
        signResult.setSuccess(true);
        a("mynet_NetworkStartup", "[doSignature] Get security signed string: " + signResult.sign + ",  requestType: " + securityGuardParamContext.requestType + ",  appKey: " + securityGuardParamContext.appKey);
        return signResult;
    }

    public static String getAuthCode() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4213feae", new Object[0]);
        }
        try {
            context = TransportEnvUtil.getContext();
        } catch (Throwable th) {
            LogCatUtil.warn("mynet_NetworkStartup", "getAuthCode ex=" + th.toString());
        }
        if (context == null) {
            LogCatUtil.debug("mynet_NetworkStartup", "mContext is null");
            return "";
        }
        Object obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("net_authCode");
        String obj2 = obj != null ? obj.toString() : null;
        if (!TextUtils.isEmpty(obj2)) {
            LogCatUtil.info("mynet_NetworkStartup", "getAuthCode. authCode=[" + obj2 + riy.ARRAY_END_STR);
            return obj2;
        }
        return "";
    }

    private MonitorInfoManager c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MonitorInfoManager) ipChange.ipc$dispatch("42baa798", new Object[]{this}) : new MonitorInfoManager() { // from class: com.alipay.mobile.common.netsdkextdependapi.network.NetworkStartupListener.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
            public void doUploadMonitorLog() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ce69389d", new Object[]{this});
                }
            }

            @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
            public void endLinkRecordPhase(String str, String str2, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("aea2c375", new Object[]{this, str, str2, map});
                }
            }

            @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
            public void flushMonitorLog() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2205735", new Object[]{this});
                }
            }

            @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
            public void footprint(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3202200d", new Object[]{this, str, str2, str3, str4, str5, map});
                }
            }

            @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
            public boolean isTraficConsumeAccept(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("f297ccf2", new Object[]{this, str})).booleanValue();
                }
                return true;
            }

            @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
            public void kickOnNetworkBindService(String str, boolean z, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("154435fe", new Object[]{this, str, new Boolean(z), str2});
                }
            }

            @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
            public void kickOnNetworkDiagnose(boolean z, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d6188750", new Object[]{this, new Boolean(z), str});
                }
            }

            @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
            public void noteTraficConsume(TraficConsumeModel traficConsumeModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4e3dd93b", new Object[]{this, traficConsumeModel});
                }
            }

            @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
            public void recordException(Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4ab4c490", new Object[]{this, th});
                }
            }

            @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
            public void recordUnavailable(String str, String str2, String str3, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("29f79961", new Object[]{this, str, str2, str3, map});
                }
            }

            @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
            public void setUploadSizeOfFootprint(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bbd99d38", new Object[]{this, new Integer(i)});
                }
            }

            @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
            public void startLinkRecordPhase(String str, String str2, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c745bc", new Object[]{this, str, str2, map});
                }
            }

            @Override // com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoManager
            public void record(MonitorLoggerModel monitorLoggerModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f949696a", new Object[]{this, monitorLoggerModel});
                } else if (monitorLoggerModel == null) {
                } else {
                    try {
                        Performance performance = new Performance();
                        performance.setLoggerLevel(monitorLoggerModel.getLoggerLevel());
                        performance.setSubType(monitorLoggerModel.getSubType());
                        performance.setParam1(monitorLoggerModel.getParam1());
                        performance.setParam2(monitorLoggerModel.getParam2());
                        performance.setParam3(monitorLoggerModel.getParam3());
                        performance.getExtPramas().putAll(monitorLoggerModel.getExtParams());
                        LoggerFactory.getMonitorLogger().performance(monitorLoggerModel.getBizType(), performance);
                    } catch (Throwable th) {
                        LogCatUtil.error("mynet_NetworkStartup", "record ex:" + th.toString());
                    }
                }
            }
        };
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            LoggerFactory.init(TransportEnvUtil.getContext());
        } catch (Throwable th) {
            a("mynet_NetworkStartup", "initAlipayLogging ex:" + th.toString());
        }
    }

    /* loaded from: classes3.dex */
    public class CustNetworkAppInfoManager extends AppInfoManagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private CustNetworkAppInfoManager() {
        }

        @Override // com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoManagerAdapter, com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoManager
        public String getAppIdForMPaaS() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ca24750c", new Object[]{this});
            }
            try {
                String appId = MiscNetUtils.getAppId();
                NetworkStartupListener networkStartupListener = NetworkStartupListener.this;
                NetworkStartupListener.access$100(networkStartupListener, "mynet_NetworkStartup", "getAppIdForMPaaS,appid= " + appId);
                if (!TextUtils.isEmpty(appId) || !MiscNetUtils.isInTaobaoApp(TransportEnvUtil.getContext())) {
                    return appId;
                }
                NetworkStartupListener networkStartupListener2 = NetworkStartupListener.this;
                NetworkStartupListener.access$100(networkStartupListener2, "mynet_NetworkStartup", "no value in RVProxy.get, use default appid= TAOBAO_AND");
                return "TAOBAO_AND";
            } catch (Throwable th) {
                NetworkStartupListener networkStartupListener3 = NetworkStartupListener.this;
                NetworkStartupListener.access$100(networkStartupListener3, "mynet_NetworkStartup", "getAppIdForMPaaS. ex=" + th.toString());
                return "";
            }
        }

        @Override // com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoManagerAdapter, com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoManager
        public String getAppKeyForMPaaS() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ff13adbe", new Object[]{this});
            }
            try {
                String appKey = MiscNetUtils.getAppKey();
                NetworkStartupListener networkStartupListener = NetworkStartupListener.this;
                NetworkStartupListener.access$100(networkStartupListener, "mynet_NetworkStartup", "getAppKeyForMPaaS,appKey= " + appKey);
                if (!TextUtils.isEmpty(appKey) || !MiscNetUtils.isInTaobaoApp(TransportEnvUtil.getContext())) {
                    return appKey;
                }
                NetworkStartupListener networkStartupListener2 = NetworkStartupListener.this;
                NetworkStartupListener.access$100(networkStartupListener2, "mynet_NetworkStartup", "no value in RVProxy.get, use default appKey= 23699722");
                return "23699722";
            } catch (Throwable th) {
                NetworkStartupListener networkStartupListener3 = NetworkStartupListener.this;
                NetworkStartupListener.access$100(networkStartupListener3, "mynet_NetworkStartup", "getAppKeyForMPaaS. ex=" + th.toString());
                return "";
            }
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        try {
            if (MiscNetUtils.isTLogBuiltIn()) {
                TLog.loge(str, "", str2);
            } else {
                Log.e(str, str2);
            }
        } catch (Throwable th) {
            Log.e("mynet_NetworkStartup", "printLog ex=" + th.toString());
        }
    }
}

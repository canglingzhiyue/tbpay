package com.alipay.mobile.common.transportext.biz.rpctest;

import com.alipay.mobile.common.amnet.biz.AmnetOperationManager;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.rpc.RpcInvokeContext;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.httpdns.AlipayHttpDnsClient;
import com.alipay.mobile.common.transport.httpdns.HttpDns;
import com.alipay.mobile.common.transport.httpdns.HttpdnsIPEntry;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportEnv;
import com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl;
import com.alipay.mobile.framework.service.ext.SimpleRpcService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import java.util.Map;

/* loaded from: classes3.dex */
public class RpcTestService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static RpcTestService c;

    /* renamed from: a  reason: collision with root package name */
    private String f5692a = "RpcTestService";
    private String b = AmnetOperationManager.AMNET_HOST_SHORT;
    private int d;

    public static /* synthetic */ String access$000(RpcTestService rpcTestService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d121255", new Object[]{rpcTestService}) : rpcTestService.f5692a;
    }

    public static /* synthetic */ String access$100(RpcTestService rpcTestService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9502ed74", new Object[]{rpcTestService}) : rpcTestService.b;
    }

    public static /* synthetic */ String access$200(RpcTestService rpcTestService, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("902e3549", new Object[]{rpcTestService, str}) : rpcTestService.a(str);
    }

    public static RpcTestService getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcTestService) ipChange.ipc$dispatch("2c42f478", new Object[0]);
        }
        RpcTestService rpcTestService = c;
        if (rpcTestService != null) {
            return rpcTestService;
        }
        synchronized (RpcTestService.class) {
            if (c != null) {
                return c;
            }
            c = new RpcTestService();
            return c;
        }
    }

    private RpcTestService() {
        this.d = 0;
        this.d = 0;
    }

    public void sendTestRpc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96f38252", new Object[]{this});
            return;
        }
        try {
            if (!MiscUtils.isInAlipayClient(TransportEnvUtil.getContext()) || !MiscUtils.isMainProcessRuning(TransportEnvUtil.getContext())) {
                return;
            }
            if (!MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.IPV6_TEST_RPC))) {
                LogCatUtil.debug(this.f5692a, "IPV6_TEST_RPC switch off");
            } else if (!TransportStrategy.isEnableBifrost()) {
                LogCatUtil.debug(this.f5692a, "can not use bifrost,don't send test rpc");
            } else {
                boolean b = b(this.b);
                if (!MiscUtils.isDebugger(ExtTransportEnv.getAppContext()) && !b) {
                    LogCatUtil.debug(this.f5692a, "no ipv6 address,don't send test rpc");
                } else if (this.d >= 5) {
                } else {
                    this.d++;
                    NetworkAsyncTaskExecutor.executeLowPri(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.rpctest.RpcTestService.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            LogCatUtil.debug(RpcTestService.access$000(RpcTestService.this), "=======sendTestRpc==========");
                            MpaasRpcServiceImpl mpaasRpcServiceImpl = new MpaasRpcServiceImpl(TransportEnvUtil.getContext());
                            SimpleRpcService simpleRpcService = (SimpleRpcService) mpaasRpcServiceImpl.getRpcProxy(SimpleRpcService.class);
                            RpcInvokeContext rpcInvokeContext = mpaasRpcServiceImpl.getRpcInvokeContext(simpleRpcService);
                            rpcInvokeContext.setRpcLoggerLevel(1);
                            rpcInvokeContext.setShortLinkOnly(true);
                            RpcTestService rpcTestService = RpcTestService.this;
                            rpcInvokeContext.setShortLinkIPList(RpcTestService.access$200(rpcTestService, RpcTestService.access$100(rpcTestService)));
                            LogCatUtil.info(RpcTestService.access$000(RpcTestService.this), simpleRpcService.executeRPC("apple.go.go", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264, (Map<String, String>) null));
                        }
                    });
                }
            }
        } catch (Throwable th) {
            LogCatUtil.error(this.f5692a, "sendTestRpc ex:" + th.toString());
        }
    }

    private String a(String str) {
        HttpDns.HttpdnsIP queryLocalIPByHost;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        AlipayHttpDnsClient dnsClient = AlipayHttpDnsClient.getDnsClient();
        if (dnsClient == null) {
            LogCatUtil.info(this.f5692a, "getAmnetDnsInfos. dnsClient is null.");
            return "";
        }
        try {
            queryLocalIPByHost = dnsClient.queryLocalIPByHost(str);
        } catch (Throwable th) {
            LogCatUtil.warn(this.f5692a, th);
        }
        if (queryLocalIPByHost == null) {
            LogCatUtil.info(this.f5692a, "getAmnetDnsInfos.  ipInfoByHost is null.");
            return "";
        }
        if (queryLocalIPByHost.getIpEntries() != null) {
            StringBuilder sb = new StringBuilder();
            for (HttpdnsIPEntry httpdnsIPEntry : queryLocalIPByHost.getIpEntries()) {
                sb.append(httpdnsIPEntry.getIpWithPort());
                sb.append(",");
            }
            LogCatUtil.debug(this.f5692a, "getAmnetDnsInfos,host:" + str + " ,ips: " + sb.toString());
            return sb.toString();
        }
        return "";
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        try {
            AlipayHttpDnsClient dnsClient = AlipayHttpDnsClient.getDnsClient();
            if (dnsClient == null) {
                LogCatUtil.info(this.f5692a, "hasIPv6Address. dnsClient is null.");
                return false;
            }
            HttpDns.HttpdnsIP queryLocalIPByHost = dnsClient.queryLocalIPByHost(str);
            if (queryLocalIPByHost == null) {
                LogCatUtil.info(this.f5692a, "hasIPv6Address. ipInfoByHost is null.");
                return false;
            }
            return queryLocalIPByHost.isHasIPv6();
        } catch (Throwable th) {
            String str2 = this.f5692a;
            LogCatUtil.error(str2, "hasIPv6Address ex:" + th.toString());
            return false;
        }
    }
}

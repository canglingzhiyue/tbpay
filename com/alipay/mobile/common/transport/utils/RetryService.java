package com.alipay.mobile.common.transport.utils;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.strategy.StrategyUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class RetryService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static RetryService c;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f5633a;
    private ArrayList<String> b = new ArrayList<>(5);

    public static /* synthetic */ Map access$000(RetryService retryService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6df72d60", new Object[]{retryService}) : retryService.f5633a;
    }

    public static synchronized RetryService getInstance() {
        RetryService retryService;
        synchronized (RetryService.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RetryService) ipChange.ipc$dispatch("1c4ecc44", new Object[0]);
            } else if (c != null) {
                return c;
            } else {
                synchronized (RetryService.class) {
                    if (c == null) {
                        c = new RetryService();
                    }
                    retryService = c;
                }
                return retryService;
            }
        }
    }

    private RetryService() {
        this.f5633a = new ConcurrentHashMap();
        b();
        if (c() != null) {
            this.f5633a = c();
            a();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (MiscUtils.isOtherProcess(TransportEnvUtil.getContext())) {
                return;
            }
            NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transport.utils.RetryService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    int i = 0;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int size = RetryService.access$000(RetryService.this).size();
                    for (Map.Entry entry : RetryService.access$000(RetryService.this).entrySet()) {
                        if (StringUtils.equals((CharSequence) entry.getValue(), "1")) {
                            i++;
                        }
                    }
                    MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
                    monitorLoggerModel.setSubType("RetryList");
                    monitorLoggerModel.getExtPramas().put("totalSize", String.valueOf(size));
                    monitorLoggerModel.getExtPramas().put("retrySize", String.valueOf(i));
                    MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
                    LogCatUtil.debug("RetryService", "retrylist perf:" + monitorLoggerModel.toString());
                    if (size <= 500) {
                        return;
                    }
                    MonitorInfoUtil.recordUnavailable("BIZ_NETWORK", "RETRYLIST", "size:" + size, null);
                }
            });
        } catch (Throwable th) {
            LogCatUtil.error("RetryService", th);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b.add("alipay.client.getRSAKey");
        this.b.add("alipay.mobile.transfer.queryHistoryRecord");
        this.b.add("alipay.mobile.transfer.checkCertify");
        this.b.add("alipay.mobile.transfer.queryHistoryRecord");
    }

    public boolean isSupportResend(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e210f687", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        try {
            if (StringUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.RETRY_CAPTAIN), "T")) {
                return StrategyUtil.isSwitchRpc(str) || MiscUtils.isLoginRpc(str) || this.b.contains(str) || isOperationTypeInRetryList(str, z);
            }
            LogCatUtil.debug("RetryService", "captain don't allow retry");
            return false;
        } catch (Throwable th) {
            LogCatUtil.error("RetryService", th);
            return false;
        }
    }

    public boolean isOperationTypeInRetryList(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef56b41d", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        if (StringUtils.equals(this.f5633a.get(str), "1")) {
            return true;
        }
        return !StringUtils.equals(this.f5633a.get(str), "0") && z;
    }

    private Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        try {
            Context context = TransportEnvUtil.getContext();
            if (context != null) {
                return context.getSharedPreferences("net_retry", 0).getAll();
            }
            return null;
        } catch (Throwable th) {
            LogCatUtil.error("RetryService", th);
            return null;
        }
    }

    public void addOperationTypeToRetryList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af6d893c", new Object[]{this, str});
            return;
        }
        try {
            this.f5633a.put(str, "1");
            a(str, "1");
        } catch (Throwable th) {
            LogCatUtil.error("RetryService", th);
        }
    }

    public void removeOpetationTypeFromRetryList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3573d12", new Object[]{this, str});
            return;
        }
        try {
            this.f5633a.put(str, "0");
            a(str, "0");
        } catch (Throwable th) {
            LogCatUtil.error("RetryService", th);
        }
    }

    private void a(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transport.utils.RetryService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Context context = TransportEnvUtil.getContext();
                    if (context == null) {
                        return;
                    }
                    SharedPreferences.Editor edit = context.getSharedPreferences("net_retry", 0).edit();
                    edit.putString(str, str2);
                    edit.commit();
                }
            });
        }
    }
}

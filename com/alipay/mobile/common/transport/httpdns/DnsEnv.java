package com.alipay.mobile.common.transport.httpdns;

import android.text.TextUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.SharedPreUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DnsEnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static DnsEnv f5578a;
    private String b = "";
    private String c = "";
    private boolean d = false;

    public static DnsEnv getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DnsEnv) ipChange.ipc$dispatch("4b47b17d", new Object[0]);
        }
        DnsEnv dnsEnv = f5578a;
        if (dnsEnv != null) {
            return dnsEnv;
        }
        synchronized (DnsEnv.class) {
            if (f5578a != null) {
                return f5578a;
            }
            f5578a = new DnsEnv();
            return f5578a;
        }
    }

    private DnsEnv() {
    }

    public String getAmdcUid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("288973ea", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.b)) {
            this.b = SharedPreUtils.getStringData(TransportEnvUtil.getContext(), "httpdns_uid");
        }
        return this.b;
    }

    public void setAmdcUid(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efa89234", new Object[]{this, str});
            return;
        }
        this.b = str;
        NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.DnsEnv.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    SharedPreUtils.putData(TransportEnvUtil.getContext(), "httpdns_uid", str);
                }
            }
        });
    }

    public String getTradeNo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59e3704a", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.c)) {
            this.c = SharedPreUtils.getStringData(TransportEnvUtil.getContext(), "httpdns_tradeNo");
        }
        return this.c;
    }

    public void setTradeNo(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98e21d4", new Object[]{this, str});
            return;
        }
        this.c = str;
        NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.DnsEnv.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    SharedPreUtils.putData(TransportEnvUtil.getContext(), "httpdns_tradeNo", str);
                }
            }
        });
    }

    public boolean isDisableHttpDNS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fb4d664e", new Object[]{this})).booleanValue() : this.d;
    }

    public void setDisableHttpDNS(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91b0eb92", new Object[]{this, new Boolean(z)});
            return;
        }
        this.d = z;
        LogCatUtil.info("DnsEnv", "setDisableHttpDNS value= " + z);
        if (!z) {
            return;
        }
        TransportConfigureManager.getInstance().setValue(TransportConfigureItem.DNS_SWITCH, UTConstant.Args.UT_SUCCESS_F);
    }
}

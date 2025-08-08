package com.alipay.mobile.framework.service.common.impl;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoUtil;
import com.alipay.mobile.common.rpc.RpcDefaultConfig;
import com.alipay.mobile.common.transport.Transport;
import com.alipay.mobile.common.transport.http.HttpUrlHeader;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.ReadSettingServerUrl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MpaasDefaultConfig extends RpcDefaultConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f5710a;

    public static /* synthetic */ Object ipc$super(MpaasDefaultConfig mpaasDefaultConfig, String str, Object... objArr) {
        if (str.hashCode() == 1669530992) {
            super.giveResponseHeader((String) objArr[0], (HttpUrlHeader) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public MpaasDefaultConfig(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context parameter can't be null ");
        }
        this.f5710a = context;
    }

    @Override // com.alipay.mobile.common.rpc.RpcDefaultConfig, com.alipay.mobile.common.rpc.Config
    public String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : ReadSettingServerUrl.getInstance().getGWFURL(this.f5710a);
    }

    @Override // com.alipay.mobile.common.rpc.RpcDefaultConfig, com.alipay.mobile.common.rpc.Config
    public Transport getTransport() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Transport) ipChange.ipc$dispatch("de392016", new Object[]{this}) : MpaasHttpTransportSevice.getInstance(this.f5710a);
    }

    @Override // com.alipay.mobile.common.rpc.RpcDefaultConfig, com.alipay.mobile.common.rpc.Config
    public String getAppKey() {
        String obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49079005", new Object[]{this});
        }
        String appKeyForMPaaS = AppInfoUtil.getAppKeyForMPaaS();
        if (!StringUtils.isEmpty(appKeyForMPaaS)) {
            LogCatUtil.info("MpaasDefaultConfig", "Get appkey=[" + appKeyForMPaaS + "] from AppInfoUtil");
            return appKeyForMPaaS;
        }
        try {
            Object obj2 = this.f5710a.getPackageManager().getApplicationInfo(this.f5710a.getPackageName(), 128).metaData.get("appkey");
            obj = obj2 != null ? obj2.toString() : "";
        } catch (Exception e) {
            LogCatUtil.warn("MpaasDefaultConfig", e);
        }
        if (!StringUtils.isEmpty(obj)) {
            LogCatUtil.info("MpaasDefaultConfig", "Get appkey=[" + obj + "] from metaData.");
            return obj;
        }
        LogCatUtil.info("MpaasDefaultConfig", "Get appkey, Not exist appkey in metaData, return null");
        return "";
    }

    @Override // com.alipay.mobile.common.rpc.RpcDefaultConfig, com.alipay.mobile.common.rpc.Config
    public void giveResponseHeader(String str, HttpUrlHeader httpUrlHeader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63830570", new Object[]{this, str, httpUrlHeader});
        } else {
            super.giveResponseHeader(str, httpUrlHeader);
        }
    }
}

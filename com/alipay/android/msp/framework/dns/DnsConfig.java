package com.alipay.android.msp.framework.dns;

import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DnsConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int getUpdateInterval() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bcf881e", new Object[0])).intValue();
        }
        LogUtil.record(2, "", "DnsValue::getUpdateInterval", "interval:600000");
        return DnsValue.UPDATE_INTERVAL_DEFAULT;
    }

    public static String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[0]);
        }
        LogUtil.record(2, "", "DnsValue::getUrl", "url:".concat(DnsValue.URL));
        return DnsValue.URL;
    }

    public static String getDg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2798a20", new Object[0]);
        }
        LogUtil.record(2, "", "DnsValue::getDg", "dg:".concat(DnsValue.DG_DEFAULT));
        return DnsValue.DG_DEFAULT;
    }
}

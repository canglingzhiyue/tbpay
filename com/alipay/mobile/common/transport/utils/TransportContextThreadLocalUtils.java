package com.alipay.mobile.common.transport.utils;

import android.text.TextUtils;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class TransportContextThreadLocalUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ThreadLocal<TransportContext> f5638a = new ThreadLocal<>();

    public static TransportContext getValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TransportContext) ipChange.ipc$dispatch("413ea739", new Object[0]) : f5638a.get();
    }

    public static void setValue(TransportContext transportContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8892791", new Object[]{transportContext});
        } else {
            f5638a.set(transportContext);
        }
    }

    public static void addDnsType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae5cb933", new Object[]{str});
            return;
        }
        TransportContext value = getValue();
        if (value == null) {
            return;
        }
        value.getCurrentDataContainer().putDataItem(RPCDataItems.DT, str);
    }

    public static void setTargetHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a06052c", new Object[]{str});
            return;
        }
        TransportContext value = getValue();
        if (value == null) {
            return;
        }
        value.getCurrentDataContainer().putDataItem("TARGET_HOST", str);
    }

    public static boolean isFromLocalDns() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b31e15d", new Object[0])).booleanValue();
        }
        TransportContext value = getValue();
        if (value != null) {
            return TextUtils.equals(value.getCurrentDataContainer().getDataItem(RPCDataItems.DT), RPCDataItems.VALUE_DT_LOCALDNS);
        }
        return false;
    }

    public static boolean isFromLocalCacheDns() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f59bbcc9", new Object[0])).booleanValue();
        }
        TransportContext value = getValue();
        if (value != null) {
            return TextUtils.equals(value.getCurrentDataContainer().getDataItem(RPCDataItems.DT), RPCDataItems.VALUE_DT_LOCAL_CACHE_DNS);
        }
        return false;
    }

    public static boolean isFromIpRank() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30b6a412", new Object[0])).booleanValue();
        }
        TransportContext value = getValue();
        if (value != null) {
            return TextUtils.equals(value.getCurrentDataContainer().getDataItem(RPCDataItems.DT), RPCDataItems.VALUE_DT_IPRANK);
        }
        return false;
    }

    public static boolean isFromHttpDns() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44cf26f8", new Object[0])).booleanValue();
        }
        TransportContext value = getValue();
        if (value != null) {
            return TextUtils.equals(value.getCurrentDataContainer().getDataItem(RPCDataItems.DT), "httpdns");
        }
        return false;
    }
}

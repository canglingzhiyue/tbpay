package com.alipay.mobile.common.transport.utils;

import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.transport.monitor.DataContainer;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DataItemsUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void putDataItem2DataContainer(DataContainer dataContainer, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd8d18d", new Object[]{dataContainer, str, str2});
        } else if (dataContainer == null || !StringUtils.isEmpty(dataContainer.getDataItem(str))) {
        } else {
            dataContainer.putDataItem(str, str2);
        }
    }

    public static void putDataItem2ContainerAnyway(DataContainer dataContainer, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1627e93a", new Object[]{dataContainer, str, str2});
        } else if (dataContainer == null) {
        } else {
            dataContainer.putDataItem(str, str2);
        }
    }

    public static String getDataItem2DataContainer(DataContainer dataContainer, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("143f2056", new Object[]{dataContainer, str}) : dataContainer == null ? "" : dataContainer.getDataItem(str);
    }

    public static void removeFromDataContainer(DataContainer dataContainer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315b50db", new Object[]{dataContainer, str});
        } else if (dataContainer == null) {
        } else {
            dataContainer.removeDataItem(str);
        }
    }
}

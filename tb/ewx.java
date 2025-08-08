package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.ServiceNode;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class ewx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(529695212);
        tpc.a("com.taobao.android.detail.sdk.utils.sku.ServiceUtils");
    }

    public static ServiceNode.ServiceItem.SubServiceItem a(String str, List<ServiceNode.ServiceItem.SubServiceItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServiceNode.ServiceItem.SubServiceItem) ipChange.ipc$dispatch("840fc87c", new Object[]{str, list});
        }
        if (!StringUtils.isEmpty(str) && list != null && !list.isEmpty()) {
            for (ServiceNode.ServiceItem.SubServiceItem subServiceItem : list) {
                if (str.equals(subServiceItem.id)) {
                    return subServiceItem;
                }
            }
        }
        return null;
    }

    public static ServiceNode.ServicePrice b(String str, List<ServiceNode.ServicePrice> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServiceNode.ServicePrice) ipChange.ipc$dispatch("ac46548d", new Object[]{str, list});
        }
        if (ewu.a(list) || StringUtils.isEmpty(str)) {
            return null;
        }
        for (ServiceNode.ServicePrice servicePrice : list) {
            if (str.equals(servicePrice.serviceId)) {
                return servicePrice;
            }
        }
        return null;
    }

    public static ServiceNode.ServicePrice.SubServicePrice a(String str, ServiceNode.ServicePrice servicePrice) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServiceNode.ServicePrice.SubServicePrice) ipChange.ipc$dispatch("12e3cec0", new Object[]{str, servicePrice});
        }
        if (servicePrice != null && !ewu.a(servicePrice.subServicePrices)) {
            Iterator<ServiceNode.ServicePrice.SubServicePrice> it = servicePrice.subServicePrices.iterator();
            while (it.hasNext()) {
                ServiceNode.ServicePrice.SubServicePrice next = it.next();
                if (ewu.a(next.uniqueId, str)) {
                    return next;
                }
            }
        }
        return null;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        int indexOf = str.indexOf("|");
        if (indexOf < 0) {
            indexOf = str.length();
        }
        return str.substring(0, indexOf);
    }

    public static String b(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (StringUtils.isEmpty(str) || (indexOf = str.indexOf("|")) < 0) {
            return "0";
        }
        String substring = str.substring(indexOf + 1);
        return StringUtils.isEmpty(substring) ? "0" : substring;
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        if (StringUtils.isEmpty(str2)) {
            return str + "|0";
        }
        return str + "|" + str2;
    }

    public static String a(List<String> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("80c38867", new Object[]{list}) : ewu.a(list) ? "" : ewv.a(list, "-");
    }

    public static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{str, str2})).booleanValue();
        }
        if (ewu.a(str, str2)) {
            return true;
        }
        return (ewu.a(str, "0") || StringUtils.isEmpty(str)) && (ewu.a(str2, "0") || StringUtils.isEmpty(str2));
    }
}

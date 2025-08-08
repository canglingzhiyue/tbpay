package com.alipay.mobile.common.transport.httpdns;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.framework.dns.DnsValue;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.netsdkextdependapi.security.SecurityUtil;
import com.alipay.mobile.common.netsdkextdependapi.security.SignRequest;
import com.alipay.mobile.common.netsdkextdependapi.security.SignResult;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.httpdns.HttpDns;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.MpaasPropertiesUtil;
import com.alipay.mobile.common.transport.utils.ReadSettingServerUrl;
import com.alipay.mobile.common.transport.utils.SharedPreUtils;
import com.alipay.mobile.common.transport.utils.TransportContextThreadLocalUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import tb.riy;

/* loaded from: classes3.dex */
public class DnsUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AMDC_DOMAIN = "amdc.alipay.com";
    public static final String DOMAIN_GROUP = "a4";
    public static final String EGG_PAIN_IP = "0.0.0.0";
    public static final String TAG = "HDNS_DnsUtil";

    public static String getAmdcBackupHost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("46d9a84e", new Object[0]) : "amdc-sibling.alipay.com.cn";
    }

    public static String getAmdcBackupHttpsServerUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("654694d5", new Object[0]) : "https://amdc-sibling.alipay.com.cn/query";
    }

    public static String getAmdcHttpsServerUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c35bd37", new Object[0]) : DnsValue.URL;
    }

    public static String getDomainGroup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39878d34", new Object[0]);
        }
        try {
            Context context = TransportEnvUtil.getContext();
            String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("amdc.dg");
            return !StringUtils.isEmpty(string) ? string : DOMAIN_GROUP;
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "getDomainGroup ex:" + th.toString());
            return DOMAIN_GROUP;
        }
    }

    public static String getAmdcHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eceb8330", new Object[0]);
        }
        try {
            Context context = TransportEnvUtil.getContext();
            String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("amdc.host");
            return !StringUtils.isEmpty(string) ? string : AMDC_DOMAIN;
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "getAmdcHost ex: " + th.toString());
            return AMDC_DOMAIN;
        }
    }

    public static boolean isLogicIP(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62a0bcd0", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if (!"0.0.0.0".equals(str.trim())) {
            return Pattern.compile("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$").matcher(str).matches();
        }
        return true;
    }

    public static boolean isLogicIPv6(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56774890", new Object[]{str})).booleanValue();
        }
        try {
            if (!StringUtils.isEmpty(str)) {
                return Pattern.compile("^([\\dA-F]{1,4}:|((?=.*(::))(?!.*\\3.+\\3))\\3?)([\\dA-F]{1,4}(\\3|:\\b)|\\2){5}(([\\dA-F]{1,4}(\\3|:\\b|$)|\\2){2}|(((2[0-4]|1\\d|[1-9])?\\d|25[0-5])\\.?\\b){4})\\z").matcher(str).matches();
            }
            return false;
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "isLogicIPv6 ex:" + th.toString());
            return false;
        }
    }

    public static boolean isIPv6Address(String str) {
        int i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29c2eaf8", new Object[]{str})).booleanValue();
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return false;
            }
            char[] charArray = str.toCharArray();
            if (charArray.length < 2) {
                return false;
            }
            if (charArray[0] != ':') {
                i = 0;
                i2 = 0;
                i3 = 0;
            } else if (charArray[1] != ':') {
                return false;
            } else {
                i = 1;
                i2 = 0;
                i3 = 1;
            }
            boolean z = true;
            boolean z2 = false;
            while (i < charArray.length) {
                char c = charArray[i];
                int digit = Character.digit(c, 16);
                if (digit != -1) {
                    i2 = (i2 << 4) + digit;
                    if (i2 > 65535) {
                        return false;
                    }
                    z = false;
                } else if (c != ':' || (i3 = i3 + 1) > 7) {
                    return false;
                } else {
                    if (!z) {
                        i2 = 0;
                        z = true;
                    } else if (z2) {
                        return false;
                    } else {
                        z2 = true;
                    }
                }
                i++;
            }
            return true;
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "isIPv6Address ex:" + th.toString());
            return false;
        }
    }

    public static boolean isNumeric(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b5c88d8", new Object[]{str})).booleanValue() : Pattern.compile("[0-9]*").matcher(str).matches();
    }

    public static boolean isLogicHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a75b9b1", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        if (charArray.length <= 0) {
            return false;
        }
        for (int i = 0; i < charArray.length; i++) {
            if ((charArray[i] < 'A' || charArray[i] > 'Z') && ((charArray[i] < 'a' || charArray[i] > 'z') && !((charArray[i] >= '0' && charArray[i] <= '9') || charArray[i] == '.' || charArray[i] == '-'))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAmdcHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf510012", new Object[]{str})).booleanValue();
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return false;
            }
            if (!StringUtils.equals(str, getAmdcHost())) {
                if (!StringUtils.equals(str, getAmdcBackupHost())) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "isAmdcHost ex= " + th.toString());
            return false;
        }
    }

    public static byte[] ipToBytesByReg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("9d5a8738", new Object[]{str});
        }
        byte[] bArr = new byte[4];
        try {
            String[] split = str.split("\\.");
            bArr[0] = (byte) Integer.parseInt(split[0]);
            bArr[1] = (byte) Integer.parseInt(split[1]);
            bArr[2] = (byte) Integer.parseInt(split[2]);
            bArr[3] = (byte) Integer.parseInt(split[3]);
            return bArr;
        } catch (Exception unused) {
            throw new IllegalArgumentException(str + " is invalid IP");
        }
    }

    public static String bytesToIp(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("29de2425", new Object[]{bArr});
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(bArr[0] & 255);
        stringBuffer.append('.');
        stringBuffer.append(bArr[1] & 255);
        stringBuffer.append('.');
        stringBuffer.append(bArr[2] & 255);
        stringBuffer.append('.');
        stringBuffer.append(bArr[3] & 255);
        return stringBuffer.toString();
    }

    public static int getFlag(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("770dd872", new Object[]{context})).intValue();
        }
        if (TransportStrategy.isNetworkRunInSingleProcess(context)) {
            return 0;
        }
        return ((MiscUtils.isInAlipayClient(context) || TransportStrategy.isEnabledEnhanceNetworkModule()) && !MiscUtils.isRealPushProcess(context)) ? 1 : 0;
    }

    public static String getHttpdnsServerUrl(Context context) {
        Exception e;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0a0f3e0", new Object[]{context});
        }
        try {
            if (!MiscUtils.isDebugger(context)) {
                return null;
            }
            str = ReadSettingServerUrl.getInstance().getHttpdnsServerUrl(context);
            try {
                if (StringUtils.isEmpty(str)) {
                    return "";
                }
                LogCatUtil.debug(TAG, "get httpdns url from setting,dnsUrl=[" + str + riy.ARRAY_END_STR);
                return str;
            } catch (Exception e2) {
                e = e2;
                LogCatUtil.error(TAG, "getHttpdnsServerUrl exception", e);
                return str;
            }
        } catch (Exception e3) {
            e = e3;
            str = null;
        }
    }

    public static HttpDns.HttpdnsIP mergerHttpdnsIp(HttpDns.HttpdnsIP httpdnsIP, HttpDns.HttpdnsIP httpdnsIP2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpDns.HttpdnsIP) ipChange.ipc$dispatch("39408d15", new Object[]{httpdnsIP, httpdnsIP2});
        }
        if (httpdnsIP == null || httpdnsIP2 == null) {
            LogCatUtil.warn(TAG, "HttpdnsIp is null");
            return null;
        }
        try {
            List asList = Arrays.asList(httpdnsIP.getIpEntries());
            List asList2 = Arrays.asList(httpdnsIP2.getIpEntries());
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(asList);
            arrayList.addAll(asList2);
            httpdnsIP.setIpEntries((HttpdnsIPEntry[]) arrayList.toArray(new HttpdnsIPEntry[arrayList.size()]));
            return httpdnsIP;
        } catch (Exception unused) {
            LogCatUtil.debug(TAG, "mergerHttpdnsIp exception");
            return null;
        }
    }

    public static final InetAddress[] getAllByName(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (InetAddress[]) ipChange.ipc$dispatch("a258dab1", new Object[]{str});
        }
        TransportContextThreadLocalUtils.addDnsType(RPCDataItems.VALUE_DT_LOCALDNS);
        InetAddress[] allByName = InetAddress.getAllByName(str);
        if (allByName != null && allByName.length > 0) {
            while (true) {
                if (i >= allByName.length) {
                    break;
                } else if ("0.0.0.0".equals(allByName[i].getHostAddress())) {
                    a(str, allByName);
                    break;
                } else {
                    i++;
                }
            }
        }
        return allByName;
    }

    private static void a(String str, InetAddress[] inetAddressArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b1992f1", new Object[]{str, inetAddressArr});
            return;
        }
        try {
            MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
            monitorLoggerModel.setSubType("ISP_DNS");
            monitorLoggerModel.setParam2("FATAL");
            monitorLoggerModel.getExtPramas().put("host", str);
            monitorLoggerModel.getExtPramas().put(DnsPreference.KEY_IPS, Arrays.toString(inetAddressArr));
            MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
            LogCatUtil.debug(TAG, "PERF:" + monitorLoggerModel.toString());
            MonitorInfoUtil.recordUnavailable("BIZ_NETWORK", str, Arrays.toString(inetAddressArr), null);
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "perfLog ex:" + th.toString());
        }
    }

    public static boolean isUseSign() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ace8ae5", new Object[0])).booleanValue();
        }
        if (StringUtils.isEmpty(DeviceInfoUtil.getDeviceId())) {
            return false;
        }
        return MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.DNS_USE_SIGN));
    }

    public static String getSignData(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ba83f74", new Object[]{str, str2, str3, str4});
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str2);
        stringBuffer.append(str4);
        stringBuffer.append(str3);
        return a(str, stringBuffer.toString());
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        try {
            SignRequest signRequest = new SignRequest();
            signRequest.appkey = a(str);
            signRequest.signType = SignRequest.SIGN_TYPE_HMAC_SHA1;
            signRequest.content = str2;
            SignResult signature = SecurityUtil.signature(signRequest);
            if (!signature.isSuccess()) {
                LogCatUtil.debug(TAG, "[signature] Signed fail, requestType: HMAC_SHA1, appKey:" + signRequest.appkey);
                return "";
            }
            LogCatUtil.debug(TAG, "[signature] Get security signed string: " + signature.sign + ", requestType: HMAC_SHA1, appKey:" + signRequest.appkey);
            return signature.sign;
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, th);
            return "";
        }
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : MpaasPropertiesUtil.getAppkey(MpaasPropertiesUtil.getAppKeyFromMetaData(TransportEnvUtil.getContext()), b(str), TransportEnvUtil.getContext());
    }

    private static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (!MiscUtils.isDebugger(TransportEnvUtil.getContext())) {
            return true;
        }
        return !StringUtils.isEmpty(str) && str.contains(".com");
    }

    public static String getAppId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94038553", new Object[0]);
        }
        try {
            return MpaasPropertiesUtil.getAppId(TransportEnvUtil.getContext());
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "getAppId ex:" + th.toString());
            return AppInfoUtil.getProductId();
        }
    }

    public static String getWsid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8c87ac", new Object[0]);
        }
        try {
            String workspaceId = MpaasPropertiesUtil.getWorkspaceId(TransportEnvUtil.getContext());
            LogCatUtil.info(TAG, "Mpaas properties loaded, wsid:" + workspaceId);
            return workspaceId;
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "getWsid ex:" + th.toString());
            return "";
        }
    }

    public static String getConfigVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("738fbf79", new Object[0]) : SharedPreUtils.getStringData(TransportEnvUtil.getContext(), "httpdns_configversion");
    }

    public static void putConfigVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("498d73b8", new Object[]{str});
        } else {
            SharedPreUtils.putData(TransportEnvUtil.getContext(), "httpdns_configversion", str);
        }
    }

    public static boolean amdcUp2Https() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d850a0a", new Object[0])).booleanValue();
        }
        try {
            return SharedPreUtils.getBooleanData(TransportEnvUtil.getContext(), "amdc_https");
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "amdcUp2Https ex= " + th.toString());
            return false;
        }
    }
}

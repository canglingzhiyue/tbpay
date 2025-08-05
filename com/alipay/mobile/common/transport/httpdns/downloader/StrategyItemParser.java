package com.alipay.mobile.common.transport.httpdns.downloader;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.alipay.mobile.common.transport.httpdns.AlipayHttpDnsClient;
import com.alipay.mobile.common.transport.httpdns.DnsUtil;
import com.alipay.mobile.common.transport.httpdns.HttpDns;
import com.alipay.mobile.common.transport.httpdns.HttpdnsIPEntry;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NwSharedSwitchUtil;
import com.alipay.mobile.common.transport.utils.SharedPreUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.network.diagnosis.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.riy;

/* loaded from: classes3.dex */
public class StrategyItemParser {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "HDNS_StrategyItemParser";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f5592a = false;

    public static /* synthetic */ boolean access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue() : f5592a;
    }

    public static boolean isOversea() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b708a7c", new Object[0])).booleanValue() : f5592a;
    }

    public static String generateStrategyReq(StrategyRequest strategyRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a40c0", new Object[]{strategyRequest});
        }
        if (strategyRequest == null) {
            LogCatUtil.info(TAG, "request 为null");
            return null;
        }
        try {
            String jSONString = JSON.toJSONString(strategyRequest);
            LogCatUtil.info(TAG, "请求体: " + jSONString);
            return jSONString;
        } catch (JSONException e) {
            LogCatUtil.error(TAG, "JSONException", e);
            return null;
        }
    }

    public static StrategyResponse parseStrategyContent(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StrategyResponse) ipChange.ipc$dispatch("a77d3d75", new Object[]{str}) : parseStrategyContent(str, false);
    }

    public static StrategyResponse parseStrategyContent(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StrategyResponse) ipChange.ipc$dispatch("fce969e9", new Object[]{str, new Boolean(z)});
        }
        LogCatUtil.info(TAG, "result: " + str);
        HashMap hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            if (parseObject == null) {
                LogCatUtil.info(TAG, "jsonResult is null");
                return null;
            }
            long longValue = parseObject.getLong("code").longValue();
            String string = parseObject.getString("clientIp");
            b(parseObject);
            a(parseObject);
            int intValue = parseObject.getIntValue("ttd");
            int i = intValue <= 0 ? 3 : intValue;
            JSONArray jSONArray = parseObject.getJSONArray("dns");
            if (jSONArray != null && !jSONArray.isEmpty()) {
                a(hashMap, currentTimeMillis, jSONArray, i);
                return new StrategyResponse(longValue, hashMap, a(z, parseObject), string, f5592a, i);
            }
            return null;
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "parseStrategyContent", th);
            return null;
        }
    }

    private static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
            return;
        }
        try {
            final Boolean bool = jSONObject.getBoolean("amdc_https");
            if (bool != null) {
                LogCatUtil.info(TAG, "amdcHttpsValue=[" + bool.booleanValue() + riy.ARRAY_END_STR);
                NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.downloader.StrategyItemParser.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            SharedPreUtils.putData(TransportEnvUtil.getContext(), "amdc_https", bool.booleanValue());
                        }
                    }
                });
                return;
            }
            NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.downloader.StrategyItemParser.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    LogCatUtil.info(StrategyItemParser.TAG, "no amdc_https parameter, try remove");
                    SharedPreUtils.removeData(TransportEnvUtil.getContext(), "amdc_https");
                }
            });
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "resolveAmdcHttps ex= " + th.toString());
        }
    }

    private static void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{jSONObject});
            return;
        }
        try {
            Boolean bool = jSONObject.getBoolean("oversea");
            if (bool != null) {
                f5592a = bool.booleanValue();
                LogCatUtil.debug(TAG, "mOversea=[" + f5592a + riy.ARRAY_END_STR);
                MiscUtils.setOversea(f5592a);
                NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.downloader.StrategyItemParser.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            SharedPreUtils.putData(TransportEnvUtil.getContext(), "oversea", StrategyItemParser.access$000());
                        }
                    }
                });
                return;
            }
            f5592a = false;
            MiscUtils.setOversea(false);
            NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.downloader.StrategyItemParser.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        SharedPreUtils.removeData(TransportEnvUtil.getContext(), "oversea");
                    }
                }
            });
        } catch (Throwable th) {
            LogCatUtil.error(TAG, th);
        }
    }

    private static String a(boolean z, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4862981c", new Object[]{new Boolean(z), jSONObject});
        }
        String str2 = null;
        if (!z) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("conf");
            if (jSONObject2 != null) {
                String string = jSONObject2.getString(NwSharedSwitchUtil.KEY_NET_SWITCH_TWO);
                String string2 = jSONObject2.getString("configVersion");
                if (!TextUtils.isEmpty(string2)) {
                    DnsUtil.putConfigVersion(string2);
                }
                str = string2;
                str2 = string;
            } else {
                str = null;
            }
            LogCatUtil.info(TAG, "ANC Config Str: " + str2 + " ,configVersion: " + str);
        }
        return str2;
    }

    private static void a(Map<String, HttpDns.HttpdnsIP> map, long j, JSONArray jSONArray, int i) {
        HttpdnsIPEntry[] a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11017b74", new Object[]{map, new Long(j), jSONArray, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < jSONArray.size(); i2++) {
            HttpDns.HttpdnsIP httpdnsIP = new HttpDns.HttpdnsIP();
            httpdnsIP.setNetType(AlipayHttpDnsClient.getDnsClient().getNetworkType());
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            String string = jSONObject.getString("domain");
            httpdnsIP.setTtl((jSONObject.getLong(RemoteMessageConst.TTL).longValue() * 1000) + j);
            httpdnsIP.setTime(j);
            httpdnsIP.setTtd(i);
            String string2 = jSONObject.getString("cname");
            if (!TextUtils.isEmpty(string2)) {
                httpdnsIP.setCname(string2);
                map.put(string, httpdnsIP);
            } else {
                JSONArray jSONArray2 = jSONObject.getJSONArray(DnsPreference.KEY_IPS);
                if (jSONArray2 != null && !jSONArray2.isEmpty() && a(httpdnsIP, jSONArray2)) {
                    map.put(string, httpdnsIP);
                    JSONArray jSONArray3 = jSONObject.getJSONArray("ipsv6");
                    if (jSONArray3 != null && !jSONArray3.isEmpty() && (a2 = a(jSONArray3)) != null && a2.length != 0) {
                        httpdnsIP.setIpEntries(a(a2, httpdnsIP.getIpEntries()));
                        map.put(string, httpdnsIP);
                    }
                }
            }
        }
    }

    private static boolean a(HttpDns.HttpdnsIP httpdnsIP, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcbfb6e0", new Object[]{httpdnsIP, jSONArray})).booleanValue();
        }
        ArrayList arrayList = new ArrayList(jSONArray.size());
        String str = "";
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            HttpdnsIPEntry httpdnsIPEntry = new HttpdnsIPEntry(jSONObject.getString(c.IP), HttpDns.IP_TYPE_V4, jSONObject.getIntValue("port"));
            if (DnsUtil.isLogicIP(httpdnsIPEntry.ip)) {
                arrayList.add(httpdnsIPEntry);
                if (TextUtils.isEmpty(str)) {
                    str = httpdnsIPEntry.ip;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        httpdnsIP.setIp(str);
        httpdnsIP.setIpEntries((HttpdnsIPEntry[]) arrayList.toArray(new HttpdnsIPEntry[arrayList.size()]));
        return true;
    }

    private static HttpdnsIPEntry[] a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpdnsIPEntry[]) ipChange.ipc$dispatch("7872fe06", new Object[]{jSONArray});
        }
        try {
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                arrayList.add(new HttpdnsIPEntry(jSONObject.getString(c.IP), HttpDns.IP_TYPE_V6, jSONObject.getIntValue("port")));
            }
            return (HttpdnsIPEntry[]) arrayList.toArray(new HttpdnsIPEntry[arrayList.size()]);
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "getHttpdnsIPEntryV6 ex:" + th.toString());
            return null;
        }
    }

    private static HttpdnsIPEntry[] a(HttpdnsIPEntry[] httpdnsIPEntryArr, HttpdnsIPEntry[] httpdnsIPEntryArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpdnsIPEntry[]) ipChange.ipc$dispatch("3c45d62e", new Object[]{httpdnsIPEntryArr, httpdnsIPEntryArr2});
        }
        HttpdnsIPEntry[] httpdnsIPEntryArr3 = new HttpdnsIPEntry[httpdnsIPEntryArr.length + httpdnsIPEntryArr2.length];
        int length = httpdnsIPEntryArr.length <= httpdnsIPEntryArr2.length ? httpdnsIPEntryArr.length : httpdnsIPEntryArr2.length;
        int length2 = httpdnsIPEntryArr.length >= httpdnsIPEntryArr2.length ? httpdnsIPEntryArr.length : httpdnsIPEntryArr2.length;
        HttpdnsIPEntry[] httpdnsIPEntryArr4 = httpdnsIPEntryArr.length >= httpdnsIPEntryArr2.length ? httpdnsIPEntryArr : httpdnsIPEntryArr2;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            httpdnsIPEntryArr3[i] = httpdnsIPEntryArr[i2];
            i = i3 + 1;
            httpdnsIPEntryArr3[i3] = httpdnsIPEntryArr2[i2];
        }
        while (length < length2) {
            httpdnsIPEntryArr3[i] = httpdnsIPEntryArr4[length];
            length++;
            i++;
        }
        return httpdnsIPEntryArr3;
    }
}

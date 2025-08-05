package com.alipay.mobile.common.transport.httpdns;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.httpdns.HttpDns;
import com.alipay.mobile.common.transport.httpdns.db.HttpdnsDBService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class HttpdnsStorage {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "HDNS_Storage";
    private static HttpdnsStorage d;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, HttpDns.HttpdnsIP> f5585a;
    private HttpdnsDBService b;
    private Context c;

    public static HttpdnsStorage getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpdnsStorage) ipChange.ipc$dispatch("93ba368b", new Object[]{context});
        }
        HttpdnsStorage httpdnsStorage = d;
        if (httpdnsStorage != null) {
            return httpdnsStorage;
        }
        synchronized (HttpdnsStorage.class) {
            if (d == null) {
                d = new HttpdnsStorage(context);
            }
        }
        return d;
    }

    private HttpdnsStorage(Context context) {
        this.f5585a = null;
        this.b = null;
        this.c = context;
        this.f5585a = new HashMap();
        this.b = new HttpdnsDBService(this.c);
    }

    public Map<String, HttpDns.HttpdnsIP> getCache() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("497e9948", new Object[]{this}) : this.f5585a;
    }

    public HttpDns.HttpdnsIP getIpInfoByHttpdns(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpDns.HttpdnsIP) ipChange.ipc$dispatch("3c81a8b2", new Object[]{this, str});
        }
        int networkType = AlipayHttpDnsClient.getDnsClient().getNetworkType();
        if (networkType == -1 || networkType == 0) {
            LogCatUtil.warn(TAG, "getIpInfoByHttpdns, netType= " + networkType + ",host= " + str);
        }
        HttpDns.HttpdnsIP ipFromCache = getIpFromCache(str, networkType);
        if (ipFromCache != null) {
            return ipFromCache;
        }
        HttpDns.HttpdnsIP ipFromDB = getIpFromDB(str, networkType);
        if (ipFromDB != null) {
            this.f5585a.put(str, ipFromDB);
        }
        return ipFromDB;
    }

    public HttpDns.HttpdnsIP getIpFromCache(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpDns.HttpdnsIP) ipChange.ipc$dispatch("5a4124ab", new Object[]{this, str, new Integer(i)});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HttpDns.HttpdnsIP httpdnsIP = this.f5585a.get(str);
        if (httpdnsIP == null) {
            LogCatUtil.debug(TAG, "getIpFromCache netType: " + i + ",no ipinfo in cache,domain:" + str);
            return null;
        } else if (httpdnsIP.getNetType() == i) {
            LogCatUtil.debug(TAG, "getIpFromCache netType: " + i + ",hit it, domain: " + str);
            return httpdnsIP;
        } else {
            LogCatUtil.debug(TAG, "getIpFromCache ,netType is different,will get from DB, domain : " + str);
            return null;
        }
    }

    public HttpDns.HttpdnsIP getIpFromDB(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpDns.HttpdnsIP) ipChange.ipc$dispatch("a5e24f75", new Object[]{this, str, new Integer(i)});
        }
        if (!TextUtils.isEmpty(str)) {
            return this.b.queryIpInfoFromDB(str, i);
        }
        return null;
    }

    public Map<String, HttpDns.HttpdnsIP> getAllIpInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c3c433c", new Object[]{this});
        }
        int networkType = AlipayHttpDnsClient.getDnsClient().getNetworkType();
        Map<String, HttpDns.HttpdnsIP> a2 = a(networkType);
        return a2 != null ? a2 : getAllIpFromDB(networkType);
    }

    private Map<String, HttpDns.HttpdnsIP> a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("35efba90", new Object[]{this, new Integer(i)});
        }
        try {
            if (this.f5585a.size() > 0) {
                Iterator<Map.Entry<String, HttpDns.HttpdnsIP>> it = this.f5585a.entrySet().iterator();
                if ((it.hasNext() ? it.next().getValue() : null).getNetType() == i) {
                    return this.f5585a;
                }
            }
            return null;
        } catch (Exception e) {
            LogCatUtil.warn(TAG, "getAllIpFromCache exception" + e.toString());
            return null;
        }
    }

    public Map<String, HttpDns.HttpdnsIP> getAllIpFromDB(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("818e6117", new Object[]{this, new Integer(i)}) : this.b.getAllIPFromDB(i);
    }

    public void deleteIpByHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ebe142", new Object[]{this, str});
            return;
        }
        int networkType = AlipayHttpDnsClient.getDnsClient().getNetworkType();
        a(str);
        a(str, networkType);
    }

    public void deleteSingleIpFromDB(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fc40bd", new Object[]{this, str, str2});
            return;
        }
        int networkType = AlipayHttpDnsClient.getDnsClient().getNetworkType();
        a(str);
        a(str, str2, networkType);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || !this.f5585a.containsKey(str)) {
        } else {
            this.f5585a.remove(str);
        }
    }

    private void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.b.removeIpInfoFromDB(str, i);
        }
    }

    private void a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba9507", new Object[]{this, str, str2, new Integer(i)});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.b.removeSingleIpInfoFromDB(str, str2, i);
        }
    }

    public void updateIp2CacheAndDB(Map<String, HttpDns.HttpdnsIP> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be0bfc9", new Object[]{this, map});
            return;
        }
        int networkType = AlipayHttpDnsClient.getDnsClient().getNetworkType();
        a(map, networkType);
        a(map);
        b(map, networkType);
    }

    private void a(Map<String, HttpDns.HttpdnsIP> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee00a486", new Object[]{this, map, new Integer(i)});
        } else if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, HttpDns.HttpdnsIP> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().setNetType(i);
                }
            }
        }
    }

    private void a(Map<String, HttpDns.HttpdnsIP> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || map.size() == 0) {
        } else {
            try {
                this.f5585a.putAll(map);
            } catch (Exception e) {
                LogCatUtil.error(TAG, "updateIPInfo2Cache Exception", e);
            }
        }
    }

    private void b(Map<String, HttpDns.HttpdnsIP> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa999a07", new Object[]{this, map, new Integer(i)});
        } else if (map == null || map.size() == 0) {
        } else {
            this.b.updateIp2DB(map, i);
        }
    }

    public void storeIp2CacheAndDB(Map<String, HttpDns.HttpdnsIP> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45a51fe1", new Object[]{this, map});
            return;
        }
        int networkType = AlipayHttpDnsClient.getDnsClient().getNetworkType();
        a(map, networkType);
        storeIp2Cache(map);
        storeIp2DB(map, networkType);
    }

    public void storeIp2Cache(Map<String, HttpDns.HttpdnsIP> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808a7ac6", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
            LogCatUtil.debug(TAG, "putIpInfo2Cache param is null");
        } else {
            this.f5585a.clear();
            this.f5585a.putAll(map);
        }
    }

    public void storeIp2DB(Map<String, HttpDns.HttpdnsIP> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4462f7ed", new Object[]{this, map, new Integer(i)});
        } else if (map == null || map.isEmpty()) {
            LogCatUtil.debug(TAG, "putIpInfo2DB param is null");
        } else {
            this.b.storeIp2DB(map, i);
        }
    }

    public void putSingleIp2CacheAndDB(String str, HttpDns.HttpdnsIP httpdnsIP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf10224", new Object[]{this, str, httpdnsIP});
            return;
        }
        int networkType = AlipayHttpDnsClient.getDnsClient().getNetworkType();
        httpdnsIP.setNetType(networkType);
        a(str, httpdnsIP);
        a(str, httpdnsIP, networkType);
    }

    private void a(String str, HttpDns.HttpdnsIP httpdnsIP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9b1a7fe", new Object[]{this, str, httpdnsIP});
        } else if (TextUtils.isEmpty(str) || httpdnsIP == null) {
            LogCatUtil.debug(TAG, "putSingleIp2Cache param is null");
        } else {
            this.f5585a.put(str, httpdnsIP);
        }
    }

    private void a(String str, HttpDns.HttpdnsIP httpdnsIP, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c83cac5", new Object[]{this, str, httpdnsIP, new Integer(i)});
        } else if (TextUtils.isEmpty(str) || httpdnsIP == null) {
            LogCatUtil.debug(TAG, "putSingleIp2DB param is null");
        } else {
            this.b.insertIpinfo2DB(str, httpdnsIP, i);
        }
    }
}

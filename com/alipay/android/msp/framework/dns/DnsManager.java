package com.alipay.android.msp.framework.dns;

import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.dns.model.CashierDns;
import com.alipay.android.msp.framework.dns.storage.DnsCache;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.preload.PreloadManager;
import com.alipay.android.msp.framework.statistics.NetworkHandler;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspSwitchUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.network.diagnosis.c;
import com.taobao.accs.common.Constants;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class DnsManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f4692a = false;

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        f4692a = z;
        return z;
    }

    public static synchronized InetAddress[] getInetAddresses(String str) {
        synchronized (DnsManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InetAddress[]) ipChange.ipc$dispatch("549a6e1c", new Object[]{str});
            } else if (!MspSwitchUtil.isDnsEnabled()) {
                return null;
            } else {
                List<String> ips = DnsCache.getIps(str);
                if (ips != null && ips.size() > 0) {
                    if (DnsCache.isTtdTimeout(str)) {
                        LogUtil.record(2, "", "isTtdTimeout", str + ips.toString());
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < ips.size(); i++) {
                        arrayList.add(InetAddress.getByName(ips.get(i)));
                    }
                    return (InetAddress[]) arrayList.toArray(new InetAddress[0]);
                }
                return null;
            }
        }
    }

    public static synchronized void resetHeadIndex() {
        synchronized (DnsManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9184d4a", new Object[0]);
                return;
            }
            LogUtil.record(2, "", "DnsManager::resetHeadIndex()", "");
            Collection<CashierDns> cashierDns = DnsCache.getCashierDns();
            if (cashierDns != null) {
                for (CashierDns cashierDns2 : cashierDns) {
                    cashierDns2.resetHeadIndex();
                }
            }
        }
    }

    public static synchronized void inscHeadIndex() {
        synchronized (DnsManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5352a24", new Object[0]);
                return;
            }
            LogUtil.record(2, "", "DnsManager::inscHeadIndex()", "");
            Collection<CashierDns> cashierDns = DnsCache.getCashierDns();
            if (cashierDns != null) {
                for (CashierDns cashierDns2 : cashierDns) {
                    cashierDns2.inscHeadIndex();
                }
            }
        }
    }

    public static synchronized void clearCache() {
        synchronized (DnsManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8aded33c", new Object[0]);
            } else {
                DnsCache.clearCache();
            }
        }
    }

    public static synchronized void updateDns() {
        synchronized (DnsManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12e3e827", new Object[0]);
            } else if (f4692a) {
                LogUtil.record(2, "", "DnsManager::updateDns", "mIsUpdatingDns=true");
            } else {
                f4692a = true;
                TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.dns.DnsManager.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (!DnsManager.a()) {
                            LogUtil.record(2, "", "DnsManager::updateDns", "don't need update dns");
                        } else {
                            LogUtil.record(2, "", "DnsManager::updateDns", "start update dns.");
                            try {
                                DnsManager.b();
                                DnsPreference.putLong(DnsPreference.KEY_LAST_SYNC_TIME, Long.valueOf(System.currentTimeMillis()));
                            } catch (Throwable th) {
                                try {
                                    StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.NETWORK, "DnsCacheUpdateEx", th);
                                } finally {
                                    DnsManager.a(false);
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    private static List<CashierDns> a(byte[] bArr) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("29594738", new Object[]{bArr});
        }
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject(new String(bArr));
        int i = -1;
        if (jSONObject.optInt("code", -1) == 1000) {
            JSONArray optJSONArray = jSONObject.optJSONArray("dns");
            if (jSONObject.has("ttd")) {
                i = jSONObject.optInt("ttd");
            }
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                String optString = optJSONObject.optString("domain", null);
                int optInt = optJSONObject.optInt(RemoteMessageConst.TTL, 300);
                CashierDns cashierDns = new CashierDns(optString);
                cashierDns.setTtl(optInt);
                if (i > 0) {
                    cashierDns.setTtd(i);
                }
                JSONArray optJSONArray2 = optJSONObject.optJSONArray(DnsPreference.KEY_IPS);
                if (optJSONArray2 != null) {
                    for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                        cashierDns.addIp(optJSONArray2.optJSONObject(i3).optString(c.IP, null));
                    }
                }
                arrayList.add(cashierDns);
            }
        } else {
            Object obj = StatisticCollector.GLOBAL_AGENT;
            StatisticCollector.addError(obj, ErrorType.NETWORK, "DnsCacheUpdateCodeErr", "res data:" + Base64.encodeToString(bArr, 2));
        }
        return arrayList;
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (!MspSwitchUtil.isDnsEnabled()) {
            LogUtil.record(2, "", "CashierDns::needUpdate", "dns switch disabled, don't need update dns");
            return false;
        } else if (StringUtils.isEmpty(DnsCache.getTradeNo())) {
            LogUtil.record(2, "", "DnsManager::needUpdate", "tradeNo is empty, don't update dns");
            return false;
        } else {
            Long valueOf = Long.valueOf(System.currentTimeMillis() - DnsPreference.getLong(DnsPreference.KEY_LAST_SYNC_TIME, -1L).longValue());
            if (valueOf.longValue() >= DnsConfig.getUpdateInterval()) {
                z = true;
            }
            LogUtil.record(2, "", "CashierDns::needUpdate", "check dns update interval, timespan:" + valueOf + ", result:" + z);
            return z;
        }
    }

    public static /* synthetic */ void b() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        NetworkHandler networkHandler = new NetworkHandler();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.KEY_OS_TYPE, "Android");
        jSONObject.put("s", "1");
        jSONObject.put("utdid", GlobalHelper.getInstance().getUtdid(GlobalHelper.getInstance().getContext()));
        jSONObject.put("dg", DnsConfig.getDg());
        jSONObject.put(MspGlobalDefine.UA, PreloadManager.getPreloadCache().getCachedUserAgentByTypeV2(null, false, null));
        jSONObject.put("tradeNo", DnsCache.getTradeNo());
        String jSONObject2 = jSONObject.toString();
        LogUtil.record(2, "", "DnsManager::buildRequestData", "req info:".concat(String.valueOf(jSONObject2)));
        byte[] fetch = networkHandler.fetch(DnsConfig.getUrl(), jSONObject2.getBytes(), null, null);
        if (fetch == null) {
            throw new RuntimeException("fetch resData is null!!");
        }
        DnsCache.putCashierDns(a(fetch));
    }
}

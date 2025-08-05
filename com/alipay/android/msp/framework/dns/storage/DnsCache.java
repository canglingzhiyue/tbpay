package com.alipay.android.msp.framework.dns.storage;

import android.text.TextUtils;
import com.alipay.android.msp.framework.dns.model.CashierDns;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class DnsCache {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, CashierDns> f4693a = new HashMap();

    public static void saveTradeNo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("376a5699", new Object[]{str});
            return;
        }
        LogUtil.record(2, "", "DnsManager::saveTradeNo", "tradeNo:".concat(String.valueOf(str)));
        DnsPreference.putString("trade", str);
    }

    public static String getTradeNo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59e3704a", new Object[0]);
        }
        String string = DnsPreference.getString("trade", null);
        LogUtil.record(2, "", "DnsManager::getTradeNo", "tradeNo:".concat(String.valueOf(string)));
        return string;
    }

    public static Collection<CashierDns> getCashierDns() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("829da2c4", new Object[0]);
        }
        b();
        Map<String, CashierDns> map = f4693a;
        if (map == null) {
            return null;
        }
        return map.values();
    }

    public static CashierDns getCashierDns(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CashierDns) ipChange.ipc$dispatch("4ec3e05f", new Object[]{str});
        }
        b();
        Map<String, CashierDns> map = f4693a;
        if (map != null && map.containsKey(str)) {
            return f4693a.get(str);
        }
        return null;
    }

    public static void clearCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[0]);
            return;
        }
        Map<String, CashierDns> map = f4693a;
        if (map != null) {
            map.clear();
        }
        DnsPreference.remove(DnsPreference.KEY_LAST_SYNC_TIME);
        DnsPreference.remove(DnsPreference.KEY_IPS);
    }

    public static List<String> getIps(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a9153c60", new Object[]{str});
        }
        CashierDns cashierDns = getCashierDns(str);
        if (cashierDns == null) {
            return null;
        }
        return cashierDns.getIps();
    }

    public static boolean isTtdTimeout(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fe4eafc", new Object[]{str})).booleanValue();
        }
        CashierDns cashierDns = getCashierDns(str);
        if (cashierDns == null || cashierDns.mTtd < 0) {
            return false;
        }
        Long valueOf = Long.valueOf(System.currentTimeMillis() - DnsPreference.getLong(DnsPreference.KEY_LAST_SYNC_TIME, -1L).longValue());
        return cashierDns.mTtd == 0 ? valueOf.longValue() >= 604800000 : valueOf.longValue() >= ((long) ((((cashierDns.mTtd * 24) * 60) * 60) * 1000));
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        Map<String, CashierDns> map = f4693a;
        if (map != null && !map.isEmpty()) {
            return;
        }
        try {
            a();
        } catch (Throwable unused) {
        }
    }

    private static void a() throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        f4693a = new HashMap();
        String string = DnsPreference.getString(DnsPreference.KEY_IPS, null);
        LogUtil.record(2, "", "DnsCache::initializeIps", "dnsList:".concat(String.valueOf(string)));
        if (TextUtils.isEmpty(string)) {
            return;
        }
        JSONArray jSONArray = new JSONArray(string);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i);
            String optString = jSONObject.optString("domain", null);
            CashierDns cashierDns = new CashierDns(optString, jSONObject.optInt(RemoteMessageConst.TTL, 300));
            if (jSONObject.has("ttd")) {
                cashierDns.setTtd(jSONObject.getInt("ttd"));
            }
            JSONArray optJSONArray = jSONObject.optJSONArray(DnsPreference.KEY_IPS);
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                String optString2 = optJSONArray.optString(i2, null);
                if (!TextUtils.isEmpty(optString2)) {
                    cashierDns.addIp(optString2);
                }
            }
            if (!TextUtils.isEmpty(optString)) {
                f4693a.put(optString, cashierDns);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[Catch: Throwable -> 0x00c7, TRY_ENTER, TryCatch #0 {Throwable -> 0x00c7, blocks: (B:8:0x0017, B:11:0x001e, B:12:0x0027, B:14:0x002d, B:18:0x0046, B:21:0x004d, B:22:0x0053, B:25:0x005c, B:28:0x0080, B:30:0x0088, B:31:0x0094, B:32:0x00ba, B:34:0x00c2, B:15:0x003b), top: B:37:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void putCashierDns(java.util.List<com.alipay.android.msp.framework.dns.model.CashierDns> r12) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.msp.framework.dns.storage.DnsCache.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L12
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r12
            java.lang.String r12 = "5f8236cd"
            r0.ipc$dispatch(r12, r1)
            return
        L12:
            java.lang.String r0 = ""
            r1 = 2
            if (r12 == 0) goto L3b
            int r3 = r12.size()     // Catch: java.lang.Throwable -> Lc7
            if (r3 > 0) goto L1e
            goto L3b
        L1e:
            java.util.Map<java.lang.String, com.alipay.android.msp.framework.dns.model.CashierDns> r3 = com.alipay.android.msp.framework.dns.storage.DnsCache.f4693a     // Catch: java.lang.Throwable -> Lc7
            r3.clear()     // Catch: java.lang.Throwable -> Lc7
            java.util.Iterator r3 = r12.iterator()     // Catch: java.lang.Throwable -> Lc7
        L27:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Lc7
            if (r4 == 0) goto L42
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Lc7
            com.alipay.android.msp.framework.dns.model.CashierDns r4 = (com.alipay.android.msp.framework.dns.model.CashierDns) r4     // Catch: java.lang.Throwable -> Lc7
            java.util.Map<java.lang.String, com.alipay.android.msp.framework.dns.model.CashierDns> r5 = com.alipay.android.msp.framework.dns.storage.DnsCache.f4693a     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r6 = r4.mDomain     // Catch: java.lang.Throwable -> Lc7
            r5.put(r6, r4)     // Catch: java.lang.Throwable -> Lc7
            goto L27
        L3b:
            java.lang.String r3 = "DnsManager::saveDnsListCache"
            java.lang.String r4 = "dnsList is empty"
            com.alipay.android.msp.utils.LogUtil.record(r1, r0, r3, r4)     // Catch: java.lang.Throwable -> Lc7
        L42:
            java.lang.String r3 = "DnsManager::saveDnsListImpl"
            if (r12 == 0) goto Lc2
            int r4 = r12.size()     // Catch: java.lang.Throwable -> Lc7
            if (r4 > 0) goto L4d
            goto Lc2
        L4d:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lc7
            r4.<init>()     // Catch: java.lang.Throwable -> Lc7
            r5 = 0
        L53:
            int r6 = r12.size()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r7 = "ips"
            if (r5 >= r6) goto Lba
            java.lang.Object r6 = r12.get(r5)     // Catch: java.lang.Throwable -> Lc7
            com.alipay.android.msp.framework.dns.model.CashierDns r6 = (com.alipay.android.msp.framework.dns.model.CashierDns) r6     // Catch: java.lang.Throwable -> Lc7
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lc7
            r8.<init>()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r9 = "domain"
            java.lang.String r10 = r6.mDomain     // Catch: java.lang.Throwable -> Lc7
            r8.put(r9, r10)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r9 = "ttl"
            int r10 = r6.mTtl     // Catch: java.lang.Throwable -> Lc7
            r8.put(r9, r10)     // Catch: java.lang.Throwable -> Lc7
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lc7
            r9.<init>()     // Catch: java.lang.Throwable -> Lc7
            java.util.List<java.lang.String> r10 = r6.mIps     // Catch: java.lang.Throwable -> Lc7
            if (r10 == 0) goto L94
            r10 = 0
        L80:
            java.util.List<java.lang.String> r11 = r6.mIps     // Catch: java.lang.Throwable -> Lc7
            int r11 = r11.size()     // Catch: java.lang.Throwable -> Lc7
            if (r10 >= r11) goto L94
            java.util.List<java.lang.String> r11 = r6.mIps     // Catch: java.lang.Throwable -> Lc7
            java.lang.Object r11 = r11.get(r10)     // Catch: java.lang.Throwable -> Lc7
            r9.put(r11)     // Catch: java.lang.Throwable -> Lc7
            int r10 = r10 + 1
            goto L80
        L94:
            r8.put(r7, r9)     // Catch: java.lang.Throwable -> Lc7
            r4.put(r8)     // Catch: java.lang.Throwable -> Lc7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r7 = "dns index:"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lc7
            r6.append(r5)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r7 = ", value:"
            r6.append(r7)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> Lc7
            r6.append(r7)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lc7
            com.alipay.android.msp.utils.LogUtil.record(r1, r0, r3, r6)     // Catch: java.lang.Throwable -> Lc7
            int r5 = r5 + 1
            goto L53
        Lba:
            java.lang.String r12 = r4.toString()     // Catch: java.lang.Throwable -> Lc7
            com.alipay.android.msp.framework.dns.storage.DnsPreference.putString(r7, r12)     // Catch: java.lang.Throwable -> Lc7
            return
        Lc2:
            java.lang.String r12 = "dnses is empty"
            com.alipay.android.msp.utils.LogUtil.record(r1, r0, r3, r12)     // Catch: java.lang.Throwable -> Lc7
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.dns.storage.DnsCache.putCashierDns(java.util.List):void");
    }
}

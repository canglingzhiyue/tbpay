package com.alipay.android.msp.drivers.stores.store.events;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes3.dex */
public class WifiInfoStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public WifiInfoStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        WifiManager wifiManager;
        List<ScanResult> scanResults;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.c == null || this.c.getCurrentPresenter() == null) {
            return null;
        }
        try {
            if (this.d == null || PhoneCashierMspEngine.getMspWallet().isBackgroundRunning(this.d) || (wifiManager = PhoneCashierMspEngine.getMspWallet().getWifiManager(this.d.getApplicationContext())) == null || (scanResults = wifiManager.getScanResults()) == null || scanResults.isEmpty()) {
                return "";
            }
            if (scanResults.size() >= 2) {
                Collections.sort(scanResults, new Comparator<ScanResult>() { // from class: com.alipay.android.msp.drivers.stores.store.events.WifiInfoStore.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.util.Comparator
                    public int compare(ScanResult scanResult, ScanResult scanResult2) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("3f57943f", new Object[]{this, scanResult, scanResult2})).intValue() : scanResult2.level - scanResult.level;
                    }
                });
            }
            int i = 10;
            if (scanResults.size() <= 10) {
                i = scanResults.size();
            }
            StringBuilder sb = new StringBuilder();
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo != null) {
                sb.append(Base64.encodeToString(connectionInfo.getSSID().getBytes(), 2));
                sb.append("#");
                sb.append(connectionInfo.getBSSID());
                sb.append("#");
                sb.append(connectionInfo.getRssi());
                sb.append("#true");
            }
            for (int i2 = 0; i2 < i; i2++) {
                ScanResult scanResult = scanResults.get(i2);
                if (!(connectionInfo != null && !TextUtils.isEmpty(connectionInfo.getBSSID()) && connectionInfo.getBSSID().equals(scanResult.BSSID))) {
                    sb.append("|");
                    sb.append(Base64.encodeToString(scanResult.SSID.getBytes(), 2));
                    sb.append("#");
                    sb.append(scanResult.BSSID);
                    sb.append("#");
                    sb.append(scanResult.level);
                    sb.append("#");
                    sb.append("false");
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MspEventTypes.ACTION_INVOKE_WIFI_INFO, (Object) sb.toString());
            return jSONObject.toJSONString();
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return "";
        }
    }
}

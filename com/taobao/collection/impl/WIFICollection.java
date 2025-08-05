package com.taobao.collection.impl;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.common.Code;
import com.taobao.collection.common.SwitchOption;
import com.taobao.collection.common.b;
import com.taobao.collection.common.d;
import com.taobao.collection.dto.a;
import com.taobao.collection.receiver.WifiScanReceiver;
import com.taobao.tao.Globals;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.kge;
import tb.kgf;
import tb.kgg;
import tb.nea;

/* loaded from: classes7.dex */
public class WIFICollection implements kgf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTIVE_SCAN = "active_scan";
    private static final String TAG = "lbs_sdk.coll_WFIColl";
    private kgg in;
    private BroadcastReceiver receiver;
    private Set<Code> codes = new CopyOnWriteArraySet();
    private Map<Integer, SwitchOption> options = new HashMap();
    private boolean isValid = false;
    private a wr = new a();

    static {
        kge.a(879525220);
        kge.a(1624861641);
    }

    public WIFICollection(kgg kggVar) {
        this.in = kggVar;
        AppMonitor.Counter.commit("passivelocation", "WIFICollection", 1.0d);
    }

    @Override // tb.kgf
    public synchronized void modifiy(Code code, SwitchOption switchOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7548037a", new Object[]{this, code, switchOption});
            return;
        }
        if (switchOption.getIsOpen()) {
            for (Code code2 : find(code)) {
                this.codes.remove(code2);
            }
            this.codes.add(code);
            this.options.put(Integer.valueOf(code.getModuleToken()), switchOption);
            if (switchOption.getInterval() > 0) {
                nea.c(TAG, "********** wifi set alarm " + b.a(code, switchOption) + " **********");
                com.taobao.collection.common.a.a(0, switchOption.getInterval(), code, switchOption);
            }
        } else {
            for (Code code3 : find(code)) {
                this.codes.remove(code3);
            }
        }
        nea.d(TAG, "modifiy codes" + this.codes);
        if (this.codes.size() == 0) {
            if (this.receiver != null) {
                Globals.getApplication().unregisterReceiver(this.receiver);
                nea.c(TAG, "unRegister Wifi !" + JSON.toJSONString(code));
                this.isValid = false;
                this.receiver = null;
            } else {
                nea.c(TAG, "receiver null");
            }
        } else if (this.receiver == null) {
            nea.c(TAG, "Register Wifi !" + JSON.toJSONString(code));
            this.isValid = true;
            this.receiver = new WifiScanReceiver(this.codes, this.in, this.wr, this.options);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            Globals.getApplication().registerReceiver(this.receiver, intentFilter);
        }
        if (switchOption.getIsOpen()) {
            Map<String, Object> feature = switchOption.getFeature();
            if (feature == null) {
                return;
            }
            Object obj = feature.get("active_scan");
            if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                WifiManager wifiManager = (WifiManager) Globals.getApplication().getSystemService("wifi");
                if (!wifiManager.isWifiEnabled()) {
                    nea.c(TAG, "Ignore wifi alarm receiver!\u3000wifiEnable = " + wifiManager.isWifiEnabled());
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Wifi start scan! LRT = ");
                sb.append(this.wr == null ? "NULL" : new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date(this.wr.b())));
                nea.c(TAG, sb.toString());
                try {
                    wifiManager.startScan();
                } catch (Throwable unused) {
                }
            } else {
                nea.c(TAG, "scan not set Boolean");
            }
        }
    }

    private List<Code> find(Code code) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a0506d59", new Object[]{this, code});
        }
        ArrayList arrayList = new ArrayList();
        for (Code code2 : this.codes) {
            if (code2.getModuleToken() == code.getModuleToken()) {
                arrayList.add(code2);
            }
        }
        return arrayList;
    }

    @Override // tb.kgf
    public void remove(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebab3958", new Object[]{this, new Integer(i)});
            return;
        }
        for (Code code : this.codes) {
            if (code.getModuleToken() == i) {
                this.codes.remove(code);
            }
        }
    }

    @Override // tb.kgf
    public d collect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("82d631f6", new Object[]{this});
        }
        d dVar = new d();
        dVar.a(SwitchOption.CollectionType.WIFI);
        dVar.a(this.wr);
        return dVar;
    }

    @Override // tb.kgf
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : this.isValid;
    }
}

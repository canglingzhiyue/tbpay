package com.taobao.collection.receiver;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.support.v4.content.WakefulBroadcastReceiver;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.common.Code;
import com.taobao.collection.common.SwitchOption;
import com.taobao.tao.Globals;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import tb.kge;
import tb.kgh;
import tb.nea;

/* loaded from: classes7.dex */
public class AlarmReceiver extends WakefulBroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.collection.manager.a f16918a = kgh.b();

    static {
        kge.a(43243998);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            AppMonitor.Counter.commit("passivelocation", "collectionAlarmReceiver", 1.0d);
            Code code = (Code) JSON.parseObject(intent.getStringExtra("com.taobao.collection.common.Code"), Code.class);
            SwitchOption switchOption = (SwitchOption) JSON.parseObject(intent.getStringExtra("com.taobao.collection.common.SwitchOption"), SwitchOption.class);
            long longExtra = intent.getLongExtra("com.taobao.collection.common.timestamp", 0L);
            nea.c("lbs_sdk.coll_AlarmReceiver", "Receiver alarm successful ***********************! Code = " + code + "; SO = " + switchOption + ";timstamp=" + longExtra);
            if (!this.f16918a.a(code.getModuleToken())) {
                nea.d("lbs_sdk.coll_AlarmReceiver", "moduleToken=" + code.getModuleToken() + " not exsit listener");
                return;
            }
            nea.d("lbs_sdk.coll_AlarmReceiver", "CollectionManager listener=" + this.f16918a.a());
            if (intent.getAction().equals(SwitchOption.CollectionType.WIFI.name())) {
                WifiManager wifiManager = (WifiManager) Globals.getApplication().getSystemService("wifi");
                switchOption.setType(SwitchOption.CollectionType.WIFI);
                if (!wifiManager.isWifiEnabled()) {
                    nea.c("lbs_sdk.coll_AlarmReceiver", "Ignore wifi alarm receiver!\u3000wifiEnable = " + wifiManager.isWifiEnabled());
                    return;
                }
                com.taobao.collection.dto.a aVar = (com.taobao.collection.dto.a) this.f16918a.a(SwitchOption.CollectionType.WIFI).c();
                if (aVar != null && (System.currentTimeMillis() - aVar.b()) + 10000 < switchOption.getInterval() * 1000) {
                    nea.c("lbs_sdk.coll_AlarmReceiver", "Wifi do nothing! LRT = " + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date(aVar.b())));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Wifi start scan! LRT = ");
                    sb.append(aVar == null ? "NULL" : new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date(aVar.b())));
                    nea.c("lbs_sdk.coll_AlarmReceiver", sb.toString());
                    wifiManager.startScan();
                }
                this.f16918a.a(code, switchOption);
            } else if (!intent.getAction().equals(SwitchOption.CollectionType.BEACON.name())) {
            } else {
                Object obj = switchOption.getFeature().get("uuid");
                if (obj instanceof JSONArray) {
                    String[] strArr = new String[((JSONArray) obj).size()];
                    Iterator<Object> it = ((JSONArray) obj).iterator();
                    HashSet hashSet = new HashSet();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof String) {
                            hashSet.add((String) next);
                        }
                    }
                    ((JSONArray) obj).toArray(strArr);
                    new a(Globals.getApplication(), hashSet).a(switchOption.getTimeRange());
                }
                this.f16918a.a(code, switchOption);
            }
        } catch (Exception unused) {
            nea.a("lbs_sdk.coll_AlarmReceiver", "Receiver alarm, but process error!");
        }
    }
}

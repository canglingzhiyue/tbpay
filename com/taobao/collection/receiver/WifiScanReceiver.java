package com.taobao.collection.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.common.Code;
import com.taobao.collection.common.SwitchOption;
import com.taobao.collection.common.d;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.kge;
import tb.kgg;
import tb.kgh;
import tb.ndz;
import tb.nea;

/* loaded from: classes7.dex */
public class WifiScanReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Set<Code> f16920a;
    private kgg b;
    private com.taobao.collection.dto.a c;
    private Map<Integer, SwitchOption> d;

    static {
        kge.a(1316579331);
    }

    public WifiScanReceiver(Set<Code> set, kgg kggVar, com.taobao.collection.dto.a aVar, Map<Integer, SwitchOption> map) {
        this.f16920a = set;
        this.b = kggVar;
        this.c = aVar;
        this.d = map;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            AppMonitor.Counter.commit("passivelocation", "WifiScanReceiver", 1.0d);
            nea.c("lbs_sdk.coll_WifiScanRcv", "receive wifi scan! codes = " + JSON.toJSONString(this.f16920a));
            List<ScanResult> d = ndz.d();
            this.c.a(System.currentTimeMillis());
            this.c.a(d);
            kgh b = kgh.b();
            for (Code code : this.f16920a) {
                d dVar = new d();
                dVar.a(SwitchOption.CollectionType.WIFI);
                dVar.a(code);
                dVar.a(this.c);
                this.b.a(dVar);
                SwitchOption switchOption = this.d.get(Integer.valueOf(code.getModuleToken()));
                if (switchOption != null && switchOption.getInterval() > 0) {
                    b.a(code, switchOption);
                }
            }
        } catch (Exception e) {
            nea.a("lbs_sdk.coll_WifiScanRcv", "Wifi receiver process error!", e);
        }
    }
}

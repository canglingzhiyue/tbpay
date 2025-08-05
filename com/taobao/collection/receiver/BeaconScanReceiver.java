package com.taobao.collection.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.common.Code;
import com.taobao.collection.common.SwitchOption;
import com.taobao.collection.common.d;
import com.taobao.collection.dto.BeaconRecord;
import java.util.List;
import java.util.Set;
import tb.kge;
import tb.kgg;
import tb.nea;

/* loaded from: classes7.dex */
public class BeaconScanReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Set<Code> f16919a;
    private kgg b;
    private BeaconRecord c;

    static {
        kge.a(1746013746);
    }

    public BeaconScanReceiver(Set<Code> set, kgg kggVar, BeaconRecord beaconRecord) {
        this.f16919a = set;
        this.b = kggVar;
        this.c = beaconRecord;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            AppMonitor.Counter.commit("passivelocation", "BeaconScanReceiver", 1.0d);
            nea.c("lbs_sdk.coll_BeaconScanReceiver", "receive ibeacon scan! codes = " + JSON.toJSONString(this.f16919a));
            List<BeaconRecord.IBeacon> parseArray = JSON.parseArray(intent.getStringExtra(a.BROAD_CAST_IBEACON_KEY), BeaconRecord.IBeacon.class);
            if (this.c == null) {
                this.c = new BeaconRecord();
            }
            this.c.a(parseArray);
            this.c.a(System.currentTimeMillis());
            for (Code code : this.f16919a) {
                d dVar = new d();
                dVar.a(SwitchOption.CollectionType.BEACON);
                dVar.a(code);
                dVar.a(this.c);
                this.b.a(dVar);
            }
        } catch (Exception e) {
            nea.a("lbs_sdk.coll_BeaconScanReceiver", "ibeacon receiver process error!", e);
        }
    }
}

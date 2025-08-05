package com.taobao.collection.impl;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.common.Code;
import com.taobao.collection.common.SwitchOption;
import com.taobao.collection.common.a;
import com.taobao.collection.common.d;
import com.taobao.collection.dto.BeaconRecord;
import com.taobao.collection.receiver.BeaconScanReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.kfs;
import tb.kge;
import tb.kgf;
import tb.kgg;
import tb.nea;

/* loaded from: classes7.dex */
public class BeaconCollection implements kgf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTIVE_SCAN = "active_scan";
    private static final String TAG = "lbs_sdk.coll_BeaconCollection";
    private kgg in;
    private BroadcastReceiver receiver;
    private Set<Code> codes = new CopyOnWriteArraySet();
    private boolean isValid = false;
    private BeaconRecord br = new BeaconRecord();

    static {
        kge.a(503400371);
        kge.a(1624861641);
    }

    public BeaconCollection(kgg kggVar) {
        this.in = kggVar;
        AppMonitor.Counter.commit("passivelocation", "BeaconCollection", 1.0d);
    }

    @Override // tb.kgf
    public void modifiy(Code code, SwitchOption switchOption) {
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
            if (switchOption.getInterval() > 0) {
                nea.c(TAG, "**********  set alarm " + code + ":" + switchOption + " **********");
                a.a(0, switchOption.getInterval(), code, switchOption);
            }
        } else {
            for (Code code3 : find(code)) {
                this.codes.remove(code3);
            }
        }
        nea.d(TAG, "modifiy codes" + this.codes);
        if (this.codes.size() == 0) {
            if (this.receiver != null) {
                kfs.a().unregisterReceiver(this.receiver);
                this.isValid = false;
                this.receiver = null;
                nea.c(TAG, "unRegister beacon !" + JSON.toJSONString(code));
            } else {
                nea.c(TAG, "receiver null");
            }
        } else if (this.receiver == null) {
            this.isValid = true;
            nea.c(TAG, "Register beacon !" + JSON.toJSONString(code));
            this.receiver = new BeaconScanReceiver(this.codes, this.in, this.br);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(com.taobao.collection.receiver.a.BROAD_CAST_ACTION);
            kfs.a().registerReceiver(this.receiver, intentFilter);
        } else {
            nea.c(TAG, "receiver not null");
        }
        if (!switchOption.getIsOpen()) {
            return;
        }
        Map<String, Object> feature = switchOption.getFeature();
        if (feature == null) {
            nea.c(TAG, "feature null");
            return;
        }
        Object obj = feature.get("active_scan");
        if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
            Object obj2 = feature.get("uuid");
            if (obj2 instanceof Set) {
                new com.taobao.collection.receiver.a(kfs.a(), (Set) obj2).a(switchOption.getTimeRange());
                return;
            } else {
                nea.c(TAG, "uuid not set object");
                return;
            }
        }
        nea.c(TAG, "scan not set Boolean");
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
        dVar.a(SwitchOption.CollectionType.BEACON);
        dVar.a(this.br);
        return dVar;
    }

    @Override // tb.kgf
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : this.isValid;
    }
}

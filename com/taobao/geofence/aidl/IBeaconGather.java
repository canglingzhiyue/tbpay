package com.taobao.geofence.aidl;

import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.common.Code;
import com.taobao.collection.common.SwitchOption;
import com.taobao.collection.common.c;
import com.taobao.collection.manager.a;
import com.taobao.fence.client.TBFenceClient;
import com.taobao.fence.common.ResultEnums;
import java.util.HashMap;
import java.util.HashSet;
import tb.kge;
import tb.ksu;
import tb.ksv;
import tb.nea;

/* loaded from: classes7.dex */
public class IBeaconGather {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long IBEACON_TIME_RANGE = 2000;
    private static final String LOG = "lbs_sdk.fence_IBeaconGather";
    private static a collectionManager;
    private GatherManager gatherManager;

    static {
        kge.a(-344941051);
        collectionManager = ksu.a();
    }

    public IBeaconGather(GatherManager gatherManager) {
        this.gatherManager = gatherManager;
        AppMonitor.Counter.commit("passivelocation", "IBeaconGather", 1.0d);
    }

    public ResultEnums check() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultEnums) ipChange.ipc$dispatch("d8c6307e", new Object[]{this});
        }
        if (!c.a()) {
            return ResultEnums.NOT_SUPPORT_IBEACON;
        }
        if (c.b()) {
            return null;
        }
        return ResultEnums.IBEACON_NOT_OPEN;
    }

    public void startGather(String str) {
        int scanTime;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("886a6bce", new Object[]{this, str});
            return;
        }
        ksv ksvVar = new ksv(this.gatherManager, SwitchOption.CollectionType.BEACON);
        int a2 = collectionManager.a(ksvVar);
        ksvVar.a(a2);
        HashSet hashSet = new HashSet(JSON.parseArray(str, String.class));
        Code code = new Code();
        code.setModuleToken(a2);
        SwitchOption switchOption = new SwitchOption(SwitchOption.CollectionType.BEACON, true);
        HashMap hashMap = new HashMap();
        hashMap.put("uuid", hashSet);
        hashMap.put("active_scan", Boolean.TRUE);
        switchOption.setFeature(hashMap);
        switchOption.setInterval(0);
        switchOption.setTimeRange(2000L);
        if (TBFenceClient.getFenceClient() != null && (scanTime = TBFenceClient.getFenceClient().getScanTime()) > 0) {
            switchOption.setTimeRange(scanTime);
        }
        nea.d(LOG, "[startGather] " + code + ";" + switchOption);
        collectionManager.a(code, switchOption);
    }
}

package com.taobao.geofence.aidl;

import android.net.wifi.WifiManager;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.common.Code;
import com.taobao.collection.common.SwitchOption;
import com.taobao.collection.manager.a;
import com.taobao.fence.common.ResultEnums;
import java.util.HashMap;
import tb.kfs;
import tb.kge;
import tb.ksu;
import tb.ksw;
import tb.nea;

/* loaded from: classes7.dex */
public class WifiGather {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG = "lbs_sdk.fence_WifiGather";
    private static a collectionManager;
    private GatherManager gatherManager;

    static {
        kge.a(1529919219);
        collectionManager = ksu.a();
    }

    public WifiGather(GatherManager gatherManager) {
        this.gatherManager = gatherManager;
        AppMonitor.Counter.commit("passivelocation", "WifiGather", 1.0d);
    }

    public ResultEnums check() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultEnums) ipChange.ipc$dispatch("d8c6307e", new Object[]{this});
        }
        if (((WifiManager) kfs.a().getSystemService("wifi")).isWifiEnabled()) {
            return null;
        }
        nea.d(LOG, "wifi disable");
        return ResultEnums.WIFI_NOT_OPEN;
    }

    public void startGather() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b047b04", new Object[]{this});
            return;
        }
        ksw kswVar = new ksw(this.gatherManager, SwitchOption.CollectionType.WIFI);
        int a2 = collectionManager.a(kswVar);
        kswVar.a(a2);
        Code code = new Code();
        code.setModuleToken(a2);
        SwitchOption switchOption = new SwitchOption(SwitchOption.CollectionType.WIFI, true);
        switchOption.setInterval(0);
        HashMap hashMap = new HashMap();
        hashMap.put("active_scan", Boolean.TRUE);
        switchOption.setFeature(hashMap);
        nea.d(LOG, "[startGather] " + code + ";" + switchOption);
        collectionManager.a(code, switchOption);
    }
}

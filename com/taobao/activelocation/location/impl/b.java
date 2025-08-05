package com.taobao.activelocation.location.impl;

import android.os.Handler;
import android.taobao.util.g;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.aidl.ITBLocationCallback;
import com.taobao.location.common.LocationTypeEnum;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.tao.Globals;
import java.util.HashMap;
import tb.dcr;
import tb.dcs;
import tb.kge;

/* loaded from: classes4.dex */
public class b extends dcr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private dcs c;
    private TBLocationOption d;

    static {
        kge.a(-1177343188);
    }

    public b(Handler handler, TBLocationOption tBLocationOption, ITBLocationCallback iTBLocationCallback, dcs dcsVar, HashMap<String, String> hashMap) {
        super(handler, tBLocationOption, iTBLocationCallback, LocationTypeEnum.MEMORYLOCATION, hashMap);
        this.d = tBLocationOption;
        this.c = dcsVar;
    }

    @Override // tb.dcr
    public void a() {
        TBLocationOption tBLocationOption;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        TBLocationDTO a2 = this.c.a();
        if (a2 != null && (tBLocationOption = this.d) != null && tBLocationOption.getTimeLimit().matchTimeLimit(a2.getTimeStamp().longValue(), System.currentTimeMillis()) && this.d.getAccuracy().matchAccuray(a2.getAccuracy().intValue()) && this.d.getDataModel().matchAddressModel(a2) && this.d.getDataModel().matchPoiModel(a2)) {
            a(a2);
            AppMonitor.Counter.commit("passivelocation", "MemoryLocation", 1.0d);
            return;
        }
        b();
    }

    @Override // tb.dcr
    public LocationTypeEnum c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocationTypeEnum) ipChange.ipc$dispatch("9e2d796e", new Object[]{this});
        }
        if (!g.a(Globals.getApplication())) {
            return null;
        }
        return LocationTypeEnum.GDLOCATION;
    }
}

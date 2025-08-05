package com.taobao.passivelocation.gathering.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.passivelocation.gathering.service.LocationGatheringService;
import tb.kge;
import tb.ndr;
import tb.ndv;
import tb.ndw;
import tb.ndz;
import tb.nea;

/* loaded from: classes7.dex */
public class PassiveLocationChangedReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-150046695);
    }

    public static /* synthetic */ Object ipc$super(PassiveLocationChangedReceiver passiveLocationChangedReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        nea.c("lbs_passive.loc_PASSLCRE", "[onReceive] begin");
        AppMonitor.Counter.commit("passivelocation", "PassiveLocationChangedReceiver", 1.0d);
        String str = null;
        if (intent != null) {
            if (intent.hasExtra(ndv.REQUEST_PASSIVE)) {
                str = intent.getStringExtra(ndv.REQUEST_PASSIVE);
                nea.c("lbs_passive.loc_PASSLCRE", "[onReceive] location source: " + str);
            }
            if (intent.hasExtra("location")) {
                a(context, (Location) intent.getExtras().get("location"), str);
                return;
            } else {
                nea.c("lbs_passive.loc_PASSLCRE", "intent has not location, cannot to fatch location data from passive provider");
                return;
            }
        }
        nea.c("lbs_passive.loc_PASSLCRE", "intent is null");
    }

    private void a(Context context, Location location, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7443bc", new Object[]{this, context, location, str});
            return;
        }
        Context applicationContext = context.getApplicationContext();
        ndr ndrVar = new ndr(applicationContext);
        nea.d("lbs_passive.loc_PASSLCRE", "config.canSampling()=" + ndrVar.a() + ",LocationConstants.sFirstStart=" + ndw.c);
        if (ndrVar.a() || (ndw.c && !ndz.a(ndw.f31376a, LocationGatheringService.class.getName()))) {
            nea.d("lbs_passive.loc_PASSLCRE", "[PassiveLocationChangedReceiver.onReceive] start LocationGatheringService begin");
            Intent intent = new Intent(LocationGatheringService.LOCATION_CHANGED_ACTION);
            intent.putExtra(ndw.EXTRA_KEY_LOCATION, location);
            intent.putExtra("location_source_key", str);
            intent.setPackage(applicationContext.getPackageName());
            applicationContext.startService(intent);
            nea.d("lbs_passive.loc_PASSLCRE", "[PassiveLocationChangedReceiver.onReceive] start LocationGatheringService end");
            return;
        }
        nea.d("lbs_passive.loc_PASSLCRE", "[PassiveLocationChangedReceiver.onReceive] start LocationGatheringService end");
    }
}

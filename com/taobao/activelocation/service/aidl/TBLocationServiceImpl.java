package com.taobao.activelocation.service.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.aidl.ITBLocationCallback;
import com.taobao.location.aidl.ITBLocationService;
import com.taobao.location.common.TBLocationOption;
import tb.dct;
import tb.kge;

/* loaded from: classes4.dex */
public class TBLocationServiceImpl extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private dct locationManager;

    static {
        kge.a(-986960978);
    }

    public static /* synthetic */ Object ipc$super(TBLocationServiceImpl tBLocationServiceImpl, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ dct access$000(TBLocationServiceImpl tBLocationServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dct) ipChange.ipc$dispatch("70277319", new Object[]{tBLocationServiceImpl}) : tBLocationServiceImpl.locationManager;
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        this.locationManager = dct.b();
        this.locationManager.a(getApplicationContext());
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent}) : new TBLocationServiceBinder();
    }

    /* loaded from: classes4.dex */
    final class TBLocationServiceBinder extends ITBLocationService.Stub {
        static {
            kge.a(1253898822);
        }

        TBLocationServiceBinder() {
        }

        @Override // com.taobao.location.aidl.ITBLocationService
        public void onLocationChanged(TBLocationOption tBLocationOption, ITBLocationCallback iTBLocationCallback) throws RemoteException {
            if (TBLocationServiceImpl.access$000(TBLocationServiceImpl.this) != null) {
                TBLocationServiceImpl.access$000(TBLocationServiceImpl.this).a(tBLocationOption, iTBLocationCallback);
                AppMonitor.Counter.commit("passivelocation", "TBLocationService", 1.0d);
            }
        }
    }
}

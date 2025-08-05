package com.alibaba.openid.device;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import tb.bzi;
import tb.kge;

/* loaded from: classes.dex */
public class HuaweiDeviceIdSupplier implements bzi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1796576268);
        kge.a(981749981);
    }

    @Override // tb.bzi
    public String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        a aVar = new a();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        if (context.bindService(intent, aVar, 1)) {
            try {
                return new AdvertisingInterface(aVar.a()).a();
            } catch (Exception unused) {
            } finally {
                context.unbindService(aVar);
            }
        }
        return null;
    }

    /* loaded from: classes.dex */
    public static final class a implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f3167a;
        private final LinkedBlockingQueue<IBinder> b;

        static {
            kge.a(-725852078);
            kge.a(808545181);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            }
        }

        private a() {
            this.f3167a = false;
            this.b = new LinkedBlockingQueue<>();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            try {
                this.b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public IBinder a() throws InterruptedException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IBinder) ipChange.ipc$dispatch("a817e655", new Object[]{this});
            }
            if (this.f3167a) {
                throw new IllegalStateException();
            }
            this.f3167a = true;
            return this.b.poll(5L, TimeUnit.SECONDS);
        }
    }

    /* loaded from: classes.dex */
    private static final class AdvertisingInterface implements IInterface {

        /* renamed from: a  reason: collision with root package name */
        private IBinder f3166a;

        static {
            kge.a(-327054011);
            kge.a(-1327527845);
        }

        public AdvertisingInterface(IBinder iBinder) {
            this.f3166a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f3166a;
        }

        public String a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                this.f3166a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
}

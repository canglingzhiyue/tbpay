package com.alibaba.analytics.core.logbuilder;

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
import tb.apr;
import tb.kge;

/* loaded from: classes.dex */
public class GoogleAdvertisingIdClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f2078a;

    static {
        kge.a(-257216737);
        f2078a = null;
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2c8df87d", new Object[0]) : f2078a;
    }

    /* loaded from: classes.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f2080a;
        private final boolean b;

        static {
            kge.a(-647643978);
        }

        public a(String str, boolean z) {
            this.f2080a = str;
            this.b = z;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f2080a;
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
        }
    }

    public static synchronized void a(Context context) {
        synchronized (GoogleAdvertisingIdClient.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            } else if (f2078a != null) {
            } else {
                try {
                    b bVar = new b();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    if (context.bindService(intent, bVar, 1)) {
                        try {
                            IBinder a2 = bVar.a();
                            if (a2 != null) {
                                AdvertisingInterface advertisingInterface = new AdvertisingInterface(a2);
                                f2078a = new a(advertisingInterface.a(), advertisingInterface.a(true));
                            }
                        } catch (Exception e) {
                            apr.a("GoogleAdvertisingIdClient", e, new Object[0]);
                        }
                        context.unbindService(bVar);
                    }
                } catch (Throwable unused) {
                }
                if (f2078a == null) {
                    f2078a = new a("", true);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2081a;
        private final LinkedBlockingQueue<IBinder> b;

        static {
            kge.a(512598333);
            kge.a(808545181);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            }
        }

        private b() {
            this.f2081a = false;
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
            if (this.f2081a) {
                throw new IllegalStateException();
            }
            this.f2081a = true;
            return this.b.poll(5L, TimeUnit.SECONDS);
        }
    }

    /* loaded from: classes.dex */
    private static final class AdvertisingInterface implements IInterface {

        /* renamed from: a  reason: collision with root package name */
        private IBinder f2079a;

        static {
            kge.a(-564198662);
            kge.a(-1327527845);
        }

        public AdvertisingInterface(IBinder iBinder) {
            this.f2079a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f2079a;
        }

        public String a() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f2079a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public boolean a(boolean z) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z2 = true;
                obtain.writeInt(z ? 1 : 0);
                this.f2079a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z2 = false;
                }
                return z2;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
}

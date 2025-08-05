package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class ao implements ar {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f24354a;

    /* renamed from: a  reason: collision with other field name */
    private Context f102a;

    /* renamed from: a  reason: collision with other field name */
    private ServiceConnection f103a;

    /* renamed from: a  reason: collision with other field name */
    private volatile int f101a = 0;

    /* renamed from: a  reason: collision with other field name */
    private volatile String f105a = null;

    /* renamed from: b  reason: collision with other field name */
    private volatile boolean f106b = false;
    private volatile String b = null;

    /* renamed from: a  reason: collision with other field name */
    private final Object f104a = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public class a implements ServiceConnection {
        private a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            new Thread(new aq(this, iBinder)).start();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class b {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static String a(IBinder iBinder) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                iBinder.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a  reason: collision with other method in class */
        public static boolean m1705a(IBinder iBinder) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                boolean z = false;
                iBinder.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() != 0) {
                    z = true;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public ao(Context context) {
        this.f102a = context;
        a();
    }

    private void a() {
        boolean z;
        this.f103a = new a();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        int i = 1;
        try {
            z = this.f102a.bindService(intent, this.f103a, 1);
        } catch (Exception unused) {
            z = false;
        }
        if (!z) {
            i = 2;
        }
        this.f101a = i;
    }

    private void a(String str) {
        if (this.f101a != 1 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.f104a) {
            try {
                com.xiaomi.channel.commonutils.logger.b.m1616a("huawei's " + str + " wait...");
                this.f104a.wait(3000L);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(Context context) {
        boolean z;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.huawei.hwid", 128);
            z = (packageInfo.applicationInfo.flags & 1) != 0;
            f24354a = packageInfo.versionCode >= 20602000;
        } catch (Exception unused) {
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ServiceConnection serviceConnection = this.f103a;
        if (serviceConnection != null) {
            try {
                this.f102a.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a  reason: collision with other method in class */
    public String mo1730a() {
        a("getOAID");
        return this.f105a;
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a */
    public boolean mo1730a() {
        return f24354a;
    }
}

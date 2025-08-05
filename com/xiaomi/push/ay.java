package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import java.security.MessageDigest;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class ay implements ar {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f24363a;

    /* renamed from: a  reason: collision with other field name */
    private Context f124a;

    /* renamed from: a  reason: collision with other field name */
    private ServiceConnection f125a;

    /* renamed from: a  reason: collision with other field name */
    private volatile int f123a = 0;

    /* renamed from: a  reason: collision with other field name */
    private volatile a f126a = null;

    /* renamed from: a  reason: collision with other field name */
    private final Object f127a = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public class a {

        /* renamed from: a  reason: collision with other field name */
        String f128a;
        String b;
        String c;
        String d;

        private a() {
            this.f128a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public class b implements ServiceConnection {
        private b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (ay.this.f126a != null) {
                return;
            }
            new Thread(new ba(this, iBinder)).start();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class c {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static String a(IBinder iBinder, String str, String str2, String str3) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                obtain.writeString(str);
                obtain.writeString(str2);
                obtain.writeString(str3);
                iBinder.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public ay(Context context) {
        this.f124a = context;
        a();
    }

    private void a() {
        boolean z;
        this.f125a = new b();
        Intent intent = new Intent();
        intent.setClassName("com.heytap.openid", "com.heytap.openid.IdentifyService");
        intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
        int i = 1;
        try {
            z = this.f124a.bindService(intent, this.f125a, 1);
        } catch (Exception unused) {
            z = false;
        }
        if (!z) {
            i = 2;
        }
        this.f123a = i;
    }

    private void a(String str) {
        if (this.f123a != 1 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.f127a) {
            try {
                com.xiaomi.channel.commonutils.logger.b.m1616a("oppo's " + str + " wait...");
                this.f127a.wait(3000L);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 128);
            if (packageInfo != null) {
                long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
                boolean z = (packageInfo.applicationInfo.flags & 1) != 0;
                f24363a = longVersionCode >= 1;
                if (z) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        try {
            Signature[] signatureArr = this.f124a.getPackageManager().getPackageInfo(this.f124a.getPackageName(), 64).signatures;
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            StringBuilder sb = new StringBuilder();
            for (byte b2 : messageDigest.digest(signatureArr[0].toByteArray())) {
                sb.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3));
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b  reason: collision with other method in class */
    public void m1713b() {
        ServiceConnection serviceConnection = this.f125a;
        if (serviceConnection != null) {
            try {
                this.f124a.unbindService(serviceConnection);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a */
    public String mo1730a() {
        a("getOAID");
        if (this.f126a == null) {
            return null;
        }
        return this.f126a.b;
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a  reason: collision with other method in class */
    public boolean mo1730a() {
        return f24363a;
    }
}

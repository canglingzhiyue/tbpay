package com.taobao.share.wvapi.servicebrige;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.service.Services;
import com.taobao.share.aidl.IShareCopy;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static IShareCopy f19689a;
    private static String b;
    private static Context c;
    private static String d;
    private static String e;
    private static String f;
    private static String g;
    private static ServiceConnection h;

    public static /* synthetic */ Context a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("a75aa358", new Object[]{context});
        }
        c = context;
        return context;
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : d;
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : e;
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : f;
    }

    public static /* synthetic */ String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : g;
    }

    public static /* synthetic */ String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : b;
    }

    public static /* synthetic */ ServiceConnection f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ServiceConnection) ipChange.ipc$dispatch("a1e8b161", new Object[0]) : h;
    }

    public static /* synthetic */ Context g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("6d736e66", new Object[0]) : c;
    }

    static {
        kge.a(590279806);
        b = "ShareCopy";
        f19689a = null;
        c = null;
        h = new ServiceConnection() { // from class: com.taobao.share.wvapi.servicebrige.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v2, types: [com.taobao.share.wvapi.servicebrige.a$1$1] */
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                    return;
                }
                a.f19689a = IShareCopy.Stub.asInterface(iBinder);
                new AsyncTask<Void, Void, Void>() { // from class: com.taobao.share.wvapi.servicebrige.a.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
                    @Override // android.os.AsyncTask
                    public /* synthetic */ Void doInBackground(Void[] voidArr) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                    }

                    @Override // android.os.AsyncTask
                    public /* synthetic */ void onPostExecute(Void r4) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b105c779", new Object[]{this, r4});
                        } else {
                            a(r4);
                        }
                    }

                    public Void a(Void... voidArr) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                        }
                        try {
                            a.f19689a.copyToClipboard(a.a(), a.b(), a.c(), a.d());
                            return null;
                        } catch (RemoteException e2) {
                            a.e();
                            e2.printStackTrace();
                            return null;
                        }
                    }

                    public void a(Void r4) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6f8d528f", new Object[]{this, r4});
                            return;
                        }
                        a.g().unbindService(a.f());
                        a.e();
                    }
                }.execute(new Void[0]);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                    return;
                }
                a.f19689a = null;
                a.a(null);
                a.e();
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.share.wvapi.servicebrige.a$2] */
    public static boolean a(final Context context, final String str, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6fc748c", new Object[]{context, str, str2, str3, str4})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        String str5 = "copyToClipboard sourceType=" + str4 + " title=" + str2 + " url=" + str3;
        c = context;
        d = str;
        f = str3;
        e = str2;
        g = str4;
        new AsyncTask<Void, Void, Void>() { // from class: com.taobao.share.wvapi.servicebrige.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
            @Override // android.os.AsyncTask
            public /* synthetic */ Void doInBackground(Void[] voidArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
            }

            public Void a(Void... voidArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                }
                if (context instanceof Activity) {
                    try {
                        try {
                            a.f19689a = (IShareCopy) Services.get(a.g(), IShareCopy.class);
                            if (a.f19689a == null) {
                                a.g().getApplicationContext().bindService(new Intent(IShareCopy.class.getName()), a.f(), 1);
                                a.e();
                            } else {
                                a.f19689a.copyToClipboard(str, str2, str3, str4);
                            }
                        } catch (Exception e2) {
                            a.e();
                            e2.printStackTrace();
                        }
                    } finally {
                        a.a(null);
                    }
                } else if (a.g() instanceof Application) {
                    a.g().bindService(new Intent(IShareCopy.class.getName()), a.f(), 1);
                } else {
                    a.e();
                    return null;
                }
                return null;
            }
        }.execute(new Void[0]);
        return true;
    }
}

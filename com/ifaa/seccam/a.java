package com.ifaa.seccam;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.IpChange;
import com.ifaa.seccam.IFAASecCamInterface;
import tb.cyx;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static IFAASecCamInterface f7623a = null;
    private static long b = 0;
    private static cyx c = null;
    private static String d = "SecCam BindAidlService";
    private static ServiceConnection e = new ServiceConnection() { // from class: com.ifaa.seccam.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            String a2 = a.a();
            f.a(a2, "Try connect miseccam aidl time = " + (System.currentTimeMillis() - a.b()));
            a.a(IFAASecCamInterface.Stub.asInterface(iBinder));
            if (a.c() == null) {
                f.a(a.a(), "Try connect seccam aidl fail!");
                a.d().a(null);
                return;
            }
            f.a(a.a(), "Try connect seccam aidl success!");
            g.a().f7634a = a.c();
            a.d().a(a.c());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            String a2 = a.a();
            f.a(a2, "Try connect onServiceDisconnected, time = " + (System.currentTimeMillis() - a.b()));
        }
    };

    public static /* synthetic */ IFAASecCamInterface a(IFAASecCamInterface iFAASecCamInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IFAASecCamInterface) ipChange.ipc$dispatch("f4d3d8a8", new Object[]{iFAASecCamInterface});
        }
        f7623a = iFAASecCamInterface;
        return iFAASecCamInterface;
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : d;
    }

    public static /* synthetic */ long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[0])).longValue() : b;
    }

    public static /* synthetic */ IFAASecCamInterface c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IFAASecCamInterface) ipChange.ipc$dispatch("c024f4a", new Object[0]) : f7623a;
    }

    public static /* synthetic */ cyx d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cyx) ipChange.ipc$dispatch("26186ab9", new Object[0]) : c;
    }

    public static boolean a(Context context, cyx cyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("767adcd2", new Object[]{context, cyxVar})).booleanValue();
        }
        try {
            f.a("BindAidlService", "bindSecCamService!");
            c = cyxVar;
            b = System.currentTimeMillis();
            Intent intent = new Intent();
            intent.setAction("com.ifaa.seccam.IFAASecCamService");
            intent.setPackage("com.ifaa.seccam");
            return context.getApplicationContext().bindService(intent, e, 1);
        } catch (Exception e2) {
            String str = d;
            f.a(str, "bind service error.e = " + e2.toString());
            return false;
        }
    }
}

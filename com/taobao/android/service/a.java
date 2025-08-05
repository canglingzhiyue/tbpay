package com.taobao.android.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeoutException;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class a implements ServiceConnection {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile IBinder f15061a;
    private final Object b = new Object();
    private String c;
    private ComponentName d;

    static {
        kge.a(-2098461023);
        kge.a(808545181);
    }

    public IBinder a(long j) throws InterruptedException, TimeoutException {
        IBinder iBinder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("aaaecee1", new Object[]{this, new Long(j)});
        }
        try {
            IBinder iBinder2 = this.f15061a;
            if (iBinder2 != null) {
                return iBinder2;
            }
            synchronized (this.b) {
                long uptimeMillis = SystemClock.uptimeMillis();
                while (this.f15061a == null) {
                    this.b.wait(j);
                    if (SystemClock.uptimeMillis() - uptimeMillis > j) {
                        throw new TimeoutException();
                    }
                }
                iBinder = this.f15061a;
            }
            return iBinder;
        } finally {
            this.f15061a = null;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
            return;
        }
        String str = "onServiceConnected: " + componentName;
        synchronized (this.b) {
            this.d = componentName;
            this.f15061a = iBinder;
            this.b.notifyAll();
        }
        try {
            this.c = iBinder.getInterfaceDescriptor();
        } catch (RemoteException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            return;
        }
        String str = "onServiceDisconnected: " + componentName;
        synchronized (this.b) {
            this.f15061a = null;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ManagedServiceConnection[");
        sb.append(this.c);
        sb.append(":");
        ComponentName componentName = this.d;
        sb.append(componentName == null ? "not connected" : componentName.flattenToShortString());
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }
}

package com.taobao.login4android.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeoutException;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public class LoginTrackableServiceConnection implements ServiceConnection {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ManagedServiceConnection";
    private volatile IBinder mBinder;
    private ComponentName mComponentName;
    public Throwable mCreationPoint;
    private String mInterfaceDescriptor;
    private final Object mLock = new Object();

    static {
        kge.a(-931823932);
        kge.a(808545181);
    }

    public IBinder waitUntilConnected(long j) throws InterruptedException, TimeoutException {
        IBinder iBinder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("8a9f6ba0", new Object[]{this, new Long(j)});
        }
        try {
            IBinder iBinder2 = this.mBinder;
            if (iBinder2 != null) {
                return iBinder2;
            }
            synchronized (this.mLock) {
                long uptimeMillis = SystemClock.uptimeMillis();
                while (this.mBinder == null) {
                    this.mLock.wait(j);
                    if (SystemClock.uptimeMillis() - uptimeMillis > j) {
                        throw new TimeoutException();
                    }
                }
                iBinder = this.mBinder;
            }
            return iBinder;
        } finally {
            this.mBinder = null;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
            return;
        }
        synchronized (this.mLock) {
            this.mComponentName = componentName;
            this.mBinder = iBinder;
            this.mLock.notifyAll();
        }
        try {
            this.mInterfaceDescriptor = iBinder.getInterfaceDescriptor();
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
        synchronized (this.mLock) {
            this.mBinder = null;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ManagedServiceConnection[");
        sb.append(this.mInterfaceDescriptor);
        sb.append(":");
        ComponentName componentName = this.mComponentName;
        sb.append(componentName == null ? "not connected" : componentName.flattenToShortString());
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }
}

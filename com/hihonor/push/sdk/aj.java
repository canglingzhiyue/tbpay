package com.hihonor.push.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;

/* loaded from: classes4.dex */
public class aj implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public Messenger f7267a;
    public Bundle b;
    public Context c;

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f7267a = new Messenger(iBinder);
        Message obtain = Message.obtain();
        obtain.setData(this.b);
        try {
            this.f7267a.send(obtain);
        } catch (Exception e) {
            String str = "message sending failed. " + e.getMessage();
        }
        try {
            this.c.unbindService(this);
        } catch (Exception unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f7267a = null;
        this.b = null;
        this.c = null;
    }
}

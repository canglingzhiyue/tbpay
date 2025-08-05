package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class bv implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ServiceClient f24681a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bv(ServiceClient serviceClient) {
        this.f24681a = serviceClient;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        List<Message> list;
        List list2;
        Messenger messenger;
        synchronized (this.f24681a) {
            this.f24681a.f865b = new Messenger(iBinder);
            this.f24681a.f866b = false;
            list = this.f24681a.f863a;
            for (Message message : list) {
                try {
                    messenger = this.f24681a.f865b;
                    messenger.send(message);
                } catch (RemoteException e) {
                    com.xiaomi.channel.commonutils.logger.b.a(e);
                }
            }
            list2 = this.f24681a.f863a;
            list2.clear();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f24681a.f865b = null;
        this.f24681a.f866b = false;
    }
}

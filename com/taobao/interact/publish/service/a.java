package com.taobao.interact.publish.service;

import android.os.RemoteException;
import com.taobao.interact.publish.service.IServiceCallBack;

/* loaded from: classes7.dex */
public interface a {
    void a() throws RemoteException;

    void a(IServiceCallBack.Stub stub) throws RemoteException;

    void a(PublishConfig publishConfig) throws RemoteException;

    void b() throws RemoteException;

    void c() throws RemoteException;
}

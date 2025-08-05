package com.taobao.android.ugc.service;

import android.content.Intent;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public interface b {
    void a();

    void a(int i, int i2, Intent intent) throws RemoteException;

    void a(String str, String str2, ICallback iCallback) throws RemoteException;
}

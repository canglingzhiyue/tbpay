package com.taobao.android.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import com.ali.user.mobile.ITBLoginService;
import com.ali.user.mobile.base.helper.CPHelper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class TBLoginService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    class MyTBLoginService extends ITBLoginService.Stub {
        MyTBLoginService() {
        }

        @Override // com.ali.user.mobile.ITBLoginService
        public String getLoginInfo() throws RemoteException {
            return CPHelper.getAccountInfo(TBLoginService.this.getApplicationContext());
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        if (!b.a(getApplicationContext(), getPackageManager().getNameForUid(Binder.getCallingUid()))) {
            return null;
        }
        return new MyTBLoginService();
    }
}

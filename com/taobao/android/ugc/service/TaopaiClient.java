package com.taobao.android.ugc.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ugc.service.ITaopai;
import tb.kge;

/* loaded from: classes6.dex */
public class TaopaiClient implements ServiceConnection {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SERVICE_ACTION_NAME = "com.taobao.android.taopai.invoke";
    private Context mContext;
    private Intent mIntent = new Intent(SERVICE_ACTION_NAME);
    private ITaopai mTaopaiService;

    static {
        kge.a(652784492);
        kge.a(808545181);
        kge.a(-15270081);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
        }
    }

    public TaopaiClient(Context context) {
        this.mContext = context;
        this.mIntent.setPackage(this.mContext.getPackageName());
        this.mContext.bindService(this.mIntent, this, 1);
    }

    public boolean isPhoneSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44699bd6", new Object[]{this})).booleanValue();
        }
        try {
            if (this.mTaopaiService != null) {
                return this.mTaopaiService.isPhoneSupport();
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.mContext.unbindService(this);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
        } else {
            this.mTaopaiService = ITaopai.Stub.asInterface(iBinder);
        }
    }
}

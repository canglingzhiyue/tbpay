package com.alipay.security.mobile.agent.managerservice;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.util.TrackEvent;
import com.android.alibaba.ip.runtime.IpChange;
import org.ifaa.aidl.manager.IfaaManagerService;

/* loaded from: classes3.dex */
public class ConnectService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ConnectService";
    private static Context mConText;
    public static ConnectService mInstance;
    private static ConnectionListener mListner;
    private Intent mServiceIntent;
    private IfaaManagerService mBinder = null;
    public ServiceConnection connection = new ServiceConnection() { // from class: com.alipay.security.mobile.agent.managerservice.ConnectService.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            try {
                TrackEvent.getIns().event(null, "aidl onServiceConnected.");
                AuthenticatorLOG.fpInfo("ConnectService aidl :: onServiceConnected start");
                ConnectService.access$002(ConnectService.this, IfaaManagerService.Stub.asInterface(iBinder));
                ConnectService.access$000(ConnectService.this).asBinder().linkToDeath(ConnectService.this.deathRecipient, 0);
                ConnectService.access$100().binderCnnected(ConnectService.access$000(ConnectService.this));
                AuthenticatorLOG.fpInfo("ConnectService aidl :: onServiceConnected end");
            } catch (Exception e) {
                TrackEvent ins = TrackEvent.getIns();
                ins.event(null, "aidl ConnectService connection error：" + e);
                AuthenticatorLOG.error("ConnectService aidl :: connection e = " + e);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            AuthenticatorLOG.fpInfo("ConnectService aidl :: onServiceDisconnected");
            TrackEvent.getIns().event(null, "aidl ConnectService onServiceDisconnected");
        }
    };
    public IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: com.alipay.security.mobile.agent.managerservice.ConnectService.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25f12e35", new Object[]{this});
                return;
            }
            AuthenticatorLOG.fpInfo("ConnectService aidl :: deathReciptient binderDied");
            TrackEvent.getIns().event(null, "aidl ConnectService deathRecipient");
            if (ConnectService.access$000(ConnectService.this) != null) {
                ConnectService.access$000(ConnectService.this).asBinder().unlinkToDeath(this, 0);
                ConnectService.access$002(ConnectService.this, null);
            }
            if (ConnectService.access$200() == null) {
                return;
            }
            ConnectService.access$200().bindService(ConnectService.access$300(ConnectService.this), ConnectService.this.connection, 1);
            ServiceImpl.getInstance(ConnectService.access$200()).bindService();
        }
    };

    public static /* synthetic */ IfaaManagerService access$000(ConnectService connectService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IfaaManagerService) ipChange.ipc$dispatch("1bb0b73", new Object[]{connectService}) : connectService.mBinder;
    }

    public static /* synthetic */ IfaaManagerService access$002(ConnectService connectService, IfaaManagerService ifaaManagerService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IfaaManagerService) ipChange.ipc$dispatch("1a4e3bc1", new Object[]{connectService, ifaaManagerService});
        }
        connectService.mBinder = ifaaManagerService;
        return ifaaManagerService;
    }

    public static /* synthetic */ ConnectionListener access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConnectionListener) ipChange.ipc$dispatch("2a6d05f3", new Object[0]) : mListner;
    }

    public static /* synthetic */ Context access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e942c1f1", new Object[0]) : mConText;
    }

    public static /* synthetic */ Intent access$300(ConnectService connectService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("ab5d961d", new Object[]{connectService}) : connectService.mServiceIntent;
    }

    public static ConnectService getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConnectService) ipChange.ipc$dispatch("63f2c7c0", new Object[0]);
        }
        if (mInstance == null) {
            mInstance = new ConnectService();
        }
        return mInstance;
    }

    public void bindSysService(Context context, ConnectionListener connectionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85560ad1", new Object[]{this, context, connectionListener});
            return;
        }
        AuthenticatorLOG.fpInfo("ConnectService aidl :: bind system service");
        mConText = context;
        mListner = connectionListener;
        this.mServiceIntent = new Intent();
        this.mServiceIntent.setAction("org.ifaa.aidl.manager.IfaaManagerService");
        this.mServiceIntent.setPackage("org.ifaa.aidl.manager");
        mConText.bindService(this.mServiceIntent, this.connection, 1);
    }
}

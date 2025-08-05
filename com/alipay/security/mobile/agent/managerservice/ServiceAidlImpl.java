package com.alipay.security.mobile.agent.managerservice;

import android.content.Context;
import android.os.RemoteException;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.util.TrackEvent;
import com.android.alibaba.ip.runtime.IpChange;
import org.ifaa.aidl.manager.IfaaManagerService;

/* loaded from: classes3.dex */
public class ServiceAidlImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ServiceAidlImpl";
    private static IfaaManagerService mBinder;
    private static ServiceAidlImpl mIns;

    public static synchronized void createInstance(IfaaManagerService ifaaManagerService) {
        synchronized (ServiceAidlImpl.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17c066e8", new Object[]{ifaaManagerService});
                return;
            }
            AuthenticatorLOG.fpInfo("ServiceAidlImpl aidl :: ServiceAidlImpl create");
            TrackEvent.getIns().event(null, "aidl ServiceAidlImpl createInstance");
            if (mIns == null) {
                mIns = new ServiceAidlImpl();
            }
            mBinder = ifaaManagerService;
        }
    }

    public static synchronized ServiceAidlImpl getInstance() {
        synchronized (ServiceAidlImpl.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ServiceAidlImpl) ipChange.ipc$dispatch("b6493386", new Object[0]);
            }
            AuthenticatorLOG.fpInfo("ServiceAidlImpl aidl :: ServiceAidlImpl getInstance");
            return mIns;
        }
    }

    public int getSupportBIOTypes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95dbba84", new Object[]{this})).intValue();
        }
        AuthenticatorLOG.fpInfo("ServiceAidlImpl aidl :: getSupportBIOTypes");
        try {
            return mBinder.getSupportBIOTypes();
        } catch (RemoteException e) {
            AuthenticatorLOG.fpInfo("ServiceAidlImpl aidl :: " + e.toString());
            return 0;
        }
    }

    public int startBIOManager(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59501828", new Object[]{this, new Integer(i)})).intValue();
        }
        AuthenticatorLOG.fpInfo("ServiceAidlImpl aidl :: startBIOManager");
        try {
            return mBinder.startBIOManager(i);
        } catch (RemoteException e) {
            AuthenticatorLOG.fpInfo("ServiceAidlImpl aidl :: " + e.toString());
            return 0;
        }
    }

    public String getDeviceModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd868ddc", new Object[]{this});
        }
        AuthenticatorLOG.fpInfo("ServiceAidlImpl aidl :: getDeviceModel");
        try {
            return mBinder.getDeviceModel();
        } catch (RemoteException e) {
            AuthenticatorLOG.fpInfo("ServiceAidlImpl aidl :: " + e.toString());
            return null;
        }
    }

    public byte[] processCmd(Context context, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3b3b5c80", new Object[]{this, context, bArr});
        }
        AuthenticatorLOG.fpInfo("ServiceAidlImpl aidl :: processCmd");
        try {
            return mBinder.processCmd(bArr);
        } catch (RemoteException e) {
            AuthenticatorLOG.fpInfo("ServiceAidlImpl aidl :: " + e.toString());
            return null;
        }
    }

    public int getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d6bc1c", new Object[]{this})).intValue();
        }
        AuthenticatorLOG.fpInfo("ServiceAidlImpl aidl :: getVersion");
        try {
            AuthenticatorLOG.fpInfo("ServiceAidlImpl aidl :: getVersion = " + mBinder.getVersion());
            return mBinder.getVersion();
        } catch (RemoteException e) {
            AuthenticatorLOG.fpInfo("ServiceAidlImpl aidl :: " + e.toString());
            return 0;
        }
    }

    public String getExtInfo(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f15f473", new Object[]{this, new Integer(i), str});
        }
        AuthenticatorLOG.fpInfo("ServiceAidlImpl aidl :: getExtInfo authType = " + i + "keyExtInfo = " + str);
        try {
            return mBinder.getExtInfo(i, str);
        } catch (RemoteException e) {
            AuthenticatorLOG.fpInfo("ServiceAidlImpl aidl :: " + e.toString());
            return null;
        }
    }

    public void setExtInfo(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ee8963", new Object[]{this, new Integer(i), str, str2});
            return;
        }
        AuthenticatorLOG.fpInfo("ServiceAidlImpl aidl :: setExtInfo authType = " + i + "keyExtInfo = " + str);
        try {
            mBinder.setExtInfo(i, str, str2);
        } catch (RemoteException e) {
            AuthenticatorLOG.fpInfo("ServiceAidlImpl aidl :: " + e.toString());
        }
    }

    public int getEnabled(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15686724", new Object[]{this, new Integer(i)})).intValue();
        }
        AuthenticatorLOG.fpInfo("ServiceAidlImpl aidl :: getEnabled bioType = " + i);
        try {
            return mBinder.getEnabled(i);
        } catch (RemoteException e) {
            AuthenticatorLOG.fpInfo("ServiceAidlImpl aidl :: " + e.toString());
            return 0;
        }
    }

    public int[] getIDList(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("5ebc6cf7", new Object[]{this, new Integer(i)});
        }
        AuthenticatorLOG.fpInfo("ServiceAidlImpl aidl :: getIDList bioType = " + i);
        try {
            return mBinder.getIDList(i);
        } catch (RemoteException e) {
            AuthenticatorLOG.fpInfo("ServiceAidlImpl aidl :: " + e.toString());
            return null;
        }
    }
}

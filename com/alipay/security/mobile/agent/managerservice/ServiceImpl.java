package com.alipay.security.mobile.agent.managerservice;

import android.content.Context;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.util.ConfigServiceUtil;
import com.alipay.security.mobile.util.TrackEvent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import org.ifaa.aidl.manager.IfaaManagerService;
import org.ifaa.android.manager.IFAAManager;
import org.ifaa.android.manager.fingerprint.IFAAManagerImpl;
import org.ifaa.android.manager.fingerprint.IFAAManagerImplV2;
import org.ifaa.android.manager.fingerprint.IFAAManagerImplV3;
import org.ifaa.android.manager.fingerprint.IFAAManagerImplV4;

/* loaded from: classes3.dex */
public class ServiceImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ServiceImpl";
    private static Context mContext = null;
    public static ServiceImpl mInstance = null;
    private static long mWaitTime = 600;
    private IfaaManagerService mBinder;
    private final Object mLock = new Object();

    public static /* synthetic */ IfaaManagerService access$002(ServiceImpl serviceImpl, IfaaManagerService ifaaManagerService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IfaaManagerService) ipChange.ipc$dispatch("c8a9c13b", new Object[]{serviceImpl, ifaaManagerService});
        }
        serviceImpl.mBinder = ifaaManagerService;
        return ifaaManagerService;
    }

    public static /* synthetic */ Object access$100(ServiceImpl serviceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("235f6656", new Object[]{serviceImpl}) : serviceImpl.mLock;
    }

    public ServiceImpl(Context context) {
        AuthenticatorLOG.fpInfo("ServiceImpl aidl :: servicesImpl");
        TrackEvent.getIns().event(null, "aidl ServiceImpl initialization");
        mContext = context;
        updateWaitTime();
        bindService();
    }

    public static synchronized ServiceImpl getInstance(Context context) {
        synchronized (ServiceImpl.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ServiceImpl) ipChange.ipc$dispatch("4837bdba", new Object[]{context});
            }
            AuthenticatorLOG.fpInfo("ServiceImpl aidl :: get instance.");
            if (mInstance == null) {
                mInstance = new ServiceImpl(context);
            }
            return mInstance;
        }
    }

    public synchronized void bindService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("780e543f", new Object[]{this});
        } else {
            ConnectService.getInstance().bindSysService(mContext, new ConnectionListener() { // from class: com.alipay.security.mobile.agent.managerservice.ServiceImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.security.mobile.agent.managerservice.ConnectionListener
                public void binderCnnected(IfaaManagerService ifaaManagerService) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2518f3", new Object[]{this, ifaaManagerService});
                        return;
                    }
                    TrackEvent.getIns().event(null, "aidl ServiceImpl binderCnonected");
                    AuthenticatorLOG.fpInfo("ServiceImpl aidl :: binderCnonected start");
                    ServiceImpl.access$002(ServiceImpl.this, ifaaManagerService);
                    ServiceAidlImpl.createInstance(ifaaManagerService);
                    synchronized (ServiceImpl.access$100(ServiceImpl.this)) {
                        ServiceImpl.access$100(ServiceImpl.this).notifyAll();
                    }
                    AuthenticatorLOG.fpInfo("ServiceImpl aidl :: binderCnonected end.");
                }
            });
        }
    }

    private IfaaManagerService binderPrepare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IfaaManagerService) ipChange.ipc$dispatch("9de53902", new Object[]{this});
        }
        IfaaManagerService ifaaManagerService = this.mBinder;
        if (ifaaManagerService != null && ifaaManagerService.asBinder().isBinderAlive()) {
            AuthenticatorLOG.fpInfo("ServiceImpl aidl :: return binder.");
            return this.mBinder;
        }
        synchronized (this.mLock) {
            try {
                try {
                    AuthenticatorLOG.fpInfo("ServiceImpl aidl :: wait start");
                    this.mLock.wait(mWaitTime);
                    AuthenticatorLOG.fpInfo("ServiceImpl aidl :: wait end");
                    if (this.mBinder != null && this.mBinder.asBinder().isBinderAlive()) {
                        return this.mBinder;
                    }
                } catch (Exception e) {
                    TrackEvent ins = TrackEvent.getIns();
                    ins.event(null, "aidl ServiceImpl binderPrepare error：" + e);
                    AuthenticatorLOG.error("ServiceImpl aidl :: binderPrepare e = " + e);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized IFAAManager getIFAAManager() {
        IFAAManager iFAAManagerImpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IFAAManager) ipChange.ipc$dispatch("5a97f97d", new Object[]{this});
        }
        try {
            TrackEvent.getIns().event(null, "aidl ServiceImpl getIFAAManager");
            AuthenticatorLOG.fpInfo("ServiceImpl aidl :: get ifaa manager.");
            if (binderPrepare() == null) {
                return null;
            }
            int version = this.mBinder.getVersion();
            AuthenticatorLOG.fpInfo("ServiceImpl aidl :: version = " + version);
            if (version == 1) {
                iFAAManagerImpl = IFAAManagerImpl.getInstance();
            } else if (version == 2) {
                iFAAManagerImpl = IFAAManagerImplV2.getInstance();
            } else if (version == 3) {
                iFAAManagerImpl = IFAAManagerImplV3.getInstance();
            } else if (version == 4) {
                iFAAManagerImpl = IFAAManagerImplV4.getInstance();
            } else {
                iFAAManagerImpl = IFAAManagerImplV4.getInstance();
            }
            return iFAAManagerImpl;
        } catch (Exception e) {
            AuthenticatorLOG.error("ServiceImpl aidl :: e = " + e);
            TrackEvent ins = TrackEvent.getIns();
            ins.event(null, "aidl ServiceImpl getIFAAManager error: " + e);
            return null;
        }
    }

    private void updateWaitTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6b00d2", new Object[]{this});
            return;
        }
        Map<String, Object> config = ConfigServiceUtil.getConfig(ConfigServiceUtil.KEY_AIDL_WAIT_TIME_CONFIG);
        if (config == null || config.size() == 0) {
            return;
        }
        try {
            mWaitTime = Long.valueOf((String) config.get("time")).longValue();
        } catch (Exception e) {
            AuthenticatorLOG.error("ServiceImpl aidl :: getWaitTime e = " + e);
            AuthenticatorLOG.fpInfo("ConfigServiceUtil :: json2Map error e = " + e);
        }
    }
}

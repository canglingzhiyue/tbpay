package com.taobao.dp;

import android.content.Context;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.compat.ICompatComponent;
import com.alibaba.wireless.security.open.umid.IUMIDComponent;
import com.alibaba.wireless.security.open.umid.IUMIDInitListenerEx;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dp.client.IInitResultListener;
import com.taobao.dp.http.IUrlRequestService;
import tb.kge;

@Deprecated
/* loaded from: classes.dex */
public final class DeviceSecuritySDK {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ENVIRONMENT_DAILY = 2;
    public static final int ENVIRONMENT_ONLINE = 0;
    public static final int ENVIRONMENT_PRE = 1;
    private static DeviceSecuritySDK instance;
    private ICompatComponent mCompatComponent;
    private IUMIDComponent mUmidComponent;
    private String mVersion;

    @Deprecated
    public void sendLoginResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61475c4f", new Object[]{this, str});
        }
    }

    static {
        kge.a(1906563188);
        instance = null;
    }

    private DeviceSecuritySDK(Context context) {
        this.mUmidComponent = null;
        this.mCompatComponent = null;
        try {
            SecurityGuardManager securityGuardManager = SecurityGuardManager.getInstance(context);
            this.mUmidComponent = (IUMIDComponent) securityGuardManager.getInterface(IUMIDComponent.class);
            if (this.mUmidComponent == null) {
                this.mCompatComponent = (ICompatComponent) securityGuardManager.getInterface(ICompatComponent.class);
            }
            this.mVersion = securityGuardManager.getSDKVerison();
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    public static DeviceSecuritySDK getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceSecuritySDK) ipChange.ipc$dispatch("2c84b133", new Object[]{context});
        }
        if (instance == null) {
            synchronized (DeviceSecuritySDK.class) {
                if (instance == null) {
                    instance = new DeviceSecuritySDK(context);
                }
            }
        }
        return instance;
    }

    public int initSync(String str, int i, IUrlRequestService iUrlRequestService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("437521ca", new Object[]{this, str, new Integer(i), iUrlRequestService})).intValue() : initSync(str, "", i, iUrlRequestService);
    }

    public int initSync(String str, String str2, int i, IUrlRequestService iUrlRequestService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfd9ea94", new Object[]{this, str, str2, new Integer(i), iUrlRequestService})).intValue();
        }
        try {
            if (this.mUmidComponent == null) {
                return -1;
            }
            return this.mUmidComponent.initUMIDSync(i);
        } catch (SecException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public void initAsync(String str, int i, IUrlRequestService iUrlRequestService, IInitResultListener iInitResultListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d684ab1", new Object[]{this, str, new Integer(i), iUrlRequestService, iInitResultListener});
        } else {
            initAsync(str, "", i, iUrlRequestService, iInitResultListener);
        }
    }

    public void initAsync(String str, String str2, int i, IUrlRequestService iUrlRequestService, final IInitResultListener iInitResultListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564838bb", new Object[]{this, str, str2, new Integer(i), iUrlRequestService, iInitResultListener});
            return;
        }
        IUMIDInitListenerEx iUMIDInitListenerEx = iInitResultListener != null ? new IUMIDInitListenerEx() { // from class: com.taobao.dp.DeviceSecuritySDK.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.wireless.security.open.umid.IUMIDInitListenerEx
            public void onUMIDInitFinishedEx(String str3, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1c2fc40b", new Object[]{this, str3, new Integer(i2)});
                } else {
                    iInitResultListener.onInitFinished(str3, i2);
                }
            }
        } : null;
        try {
            if (this.mUmidComponent == null) {
                return;
            }
            this.mUmidComponent.initUMID(i, iUMIDInitListenerEx);
        } catch (SecException e) {
            e.printStackTrace();
            if (iInitResultListener == null) {
                return;
            }
            iInitResultListener.onInitFinished(null, -1);
        }
    }

    @Deprecated
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        try {
            if (this.mUmidComponent == null) {
                return;
            }
            this.mUmidComponent.initUMID();
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public void init(IUrlRequestService iUrlRequestService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("907114a7", new Object[]{this, iUrlRequestService});
            return;
        }
        try {
            if (this.mUmidComponent == null) {
                return;
            }
            this.mUmidComponent.initUMID();
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public String getSecurityToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("900fd3f6", new Object[]{this});
        }
        String str = "000000000000000000000000";
        try {
            if (this.mUmidComponent != null) {
                str = this.mUmidComponent.getSecurityToken();
            } else if (this.mCompatComponent != null) {
                str = this.mCompatComponent.getCachedSecurityToken(0);
            }
        } catch (SecException e) {
            e.printStackTrace();
        }
        return str;
    }

    public String getSecurityToken(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b3699367", new Object[]{this, new Integer(i)});
        }
        String str = "000000000000000000000000";
        try {
            if (this.mUmidComponent != null) {
                str = this.mUmidComponent.getSecurityToken(i);
            } else if (this.mCompatComponent != null) {
                str = this.mCompatComponent.getCachedSecurityToken(i);
            }
        } catch (SecException e) {
            e.printStackTrace();
        }
        return str;
    }

    public void setEnvironment(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aea9dab", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            if (this.mUmidComponent == null) {
                return;
            }
            this.mUmidComponent.setEnvironment(i);
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    public synchronized void setOnlineHost(OnlineHost onlineHost) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bfa90e8", new Object[]{this, onlineHost});
        } else if (onlineHost == null) {
            throw new IllegalArgumentException("host is null");
        } else {
            try {
                if (this.mUmidComponent != null) {
                    this.mUmidComponent.setOnlineHost(onlineHost.getHost());
                }
            } catch (SecException e) {
                e.printStackTrace();
            }
        }
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : this.mVersion;
    }
}

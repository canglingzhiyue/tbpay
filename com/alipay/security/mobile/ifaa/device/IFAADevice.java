package com.alipay.security.mobile.ifaa.device;

import android.content.Context;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.ifaa.adapter.IFAAManagerAdapter;
import com.alipay.security.mobile.util.AsyncCall;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import tb.riy;

/* loaded from: classes3.dex */
public class IFAADevice implements IDevice {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static IFAADevice sDevice;
    private String deviceId;
    private String deviceModel;
    private IFAAManagerAdapter ifaaManagerAdapter;
    private final boolean isAsyncCall = true;

    public static /* synthetic */ IFAAManagerAdapter access$000(IFAADevice iFAADevice) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IFAAManagerAdapter) ipChange.ipc$dispatch("72bf1f0e", new Object[]{iFAADevice}) : iFAADevice.ifaaManagerAdapter;
    }

    public static synchronized IFAADevice getInstance(Context context) {
        synchronized (IFAADevice.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IFAADevice) ipChange.ipc$dispatch("bcf9dcb8", new Object[]{context});
            }
            if (sDevice == null) {
                sDevice = new IFAADevice(context);
            }
            return sDevice;
        }
    }

    private IFAADevice(Context context) {
        this.ifaaManagerAdapter = IFAAManagerAdapter.getInstance(context);
    }

    @Override // com.alipay.security.mobile.ifaa.device.IDevice
    public String getDeviceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this});
        }
        AuthenticatorLOG.devInfo("ifaa getDeviceId enter []");
        if (this.deviceId != null) {
            AuthenticatorLOG.devInfo("ifaa getDeviceId cach exit [deviceId :" + this.deviceId + "] [timecost:]");
            return this.deviceId;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.ifaaManagerAdapter == null) {
            return null;
        }
        this.deviceId = (String) new AsyncCall().callFunc(new FutureTask(new Callable<String>() { // from class: com.alipay.security.mobile.ifaa.device.IFAADevice.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.Callable
            public String call() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("5fe77b5b", new Object[]{this});
                }
                try {
                    AuthenticatorLOG.devInfo("IFAADevice getDeviceId async call");
                    return IFAADevice.access$000(IFAADevice.this).getDeviceID();
                } catch (Throwable th) {
                    AuthenticatorLOG.devInfo("IFAADevice getDeviceId " + th.toString());
                    return null;
                }
            }
        }));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        AuthenticatorLOG.devInfo("ifaa getDeviceId exit [deviceId:" + this.deviceId + "] [timecost:" + currentTimeMillis2 + riy.ARRAY_END_STR);
        return this.deviceId;
    }

    @Override // com.alipay.security.mobile.ifaa.device.IDevice
    public String getDeviceToken(final byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df79825", new Object[]{this, bArr});
        }
        AuthenticatorLOG.devInfo("ifaa getTrustDeviceToken enter []");
        long currentTimeMillis = System.currentTimeMillis();
        if (this.ifaaManagerAdapter == null) {
            return null;
        }
        String str = (String) new AsyncCall().callFunc(new FutureTask(new Callable<String>() { // from class: com.alipay.security.mobile.ifaa.device.IFAADevice.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.Callable
            public String call() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("5fe77b5b", new Object[]{this});
                }
                try {
                    AuthenticatorLOG.devInfo("IFAADevice getTrustDeviceToken async call");
                    return IFAADevice.access$000(IFAADevice.this).getTrustDeviceToken(bArr);
                } catch (Throwable th) {
                    AuthenticatorLOG.devInfo("IFAADevice getTrustDeviceToken " + th.toString());
                    return null;
                }
            }
        }));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        AuthenticatorLOG.devInfo("ifaa getTrustDeviceToken exit [token:" + str + "] [timecost:" + currentTimeMillis2 + riy.ARRAY_END_STR);
        return str;
    }

    @Override // com.alipay.security.mobile.ifaa.device.IDevice
    public String getDeviceModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd868ddc", new Object[]{this});
        }
        AuthenticatorLOG.devInfo("ifaa getDeviceModel enter []");
        if (this.deviceModel != null) {
            AuthenticatorLOG.devInfo("ifaa getDeviceModel cach exit [deviceModel:" + this.deviceModel + "] [timecost:]");
            return this.deviceModel;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (this.ifaaManagerAdapter != null) {
                this.deviceModel = this.ifaaManagerAdapter.getDeviceModel();
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                AuthenticatorLOG.devInfo("ifaa getDeviceModel exit [deviceModel:" + this.deviceModel + "] [timecost:" + currentTimeMillis2 + riy.ARRAY_END_STR);
            }
        } catch (Throwable th) {
            AuthenticatorLOG.devErr(th.getMessage());
        }
        return this.deviceModel;
    }
}

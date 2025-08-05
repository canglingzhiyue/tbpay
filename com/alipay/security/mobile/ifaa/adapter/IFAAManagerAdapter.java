package com.alipay.security.mobile.ifaa.adapter;

import android.content.Context;
import android.util.Base64;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.cache.AuthenticatorModel;
import com.alipay.security.mobile.ifaa.adapter.ta.TACommands;
import com.alipay.security.mobile.ifaa.adapter.ta.TAInterationV1;
import com.alipay.security.mobile.util.ByteUtils;
import com.alipay.security.mobile.util.CommonUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.ifaa.android.manager.IFAAManager;
import org.ifaa.android.manager.IFAAManagerV2;
import org.ifaa.android.manager.IFAAManagerV3;
import org.ifaa.android.manager.IFAAManagerV4;

/* loaded from: classes3.dex */
public class IFAAManagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static IFAAManagerAdapter sInstance;
    private static final Object sTaLock = new Object();
    private Context mContext;
    private IFAAManager mIFAAManager;

    private IFAAManagerAdapter(Context context) {
        this.mContext = context;
        this.mIFAAManager = IFAAManagerFactoryAdapter.getIFAAManager(context);
    }

    public static synchronized IFAAManagerAdapter getInstance(Context context) {
        synchronized (IFAAManagerAdapter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IFAAManagerAdapter) ipChange.ipc$dispatch("c92f8633", new Object[]{context});
            }
            if (sInstance == null) {
                sInstance = new IFAAManagerAdapter(context);
            }
            return sInstance;
        }
    }

    public boolean isSupportIFAAManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9cad596", new Object[]{this})).booleanValue() : this.mIFAAManager != null;
    }

    public byte[] invokeCmd(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("cb3f32d", new Object[]{this, bArr});
        }
        synchronized (sTaLock) {
            if (this.mIFAAManager.getVersion() >= 2) {
                return ((IFAAManagerV2) this.mIFAAManager).processCmdV2(this.mContext, bArr);
            }
            return this.mIFAAManager.processCmd(this.mContext, bArr);
        }
    }

    public synchronized boolean startBIOManager(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59501839", new Object[]{this, new Integer(i)})).booleanValue();
        }
        System.currentTimeMillis();
        int startBIOManager = this.mIFAAManager.startBIOManager(this.mContext, i);
        System.currentTimeMillis();
        return startBIOManager == 0;
    }

    public synchronized String getDeviceModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd868ddc", new Object[]{this});
        }
        System.currentTimeMillis();
        String deviceModel = this.mIFAAManager.getDeviceModel();
        System.currentTimeMillis();
        if (!CommonUtils.isBlank(deviceModel)) {
            deviceModel = deviceModel.replace(" ", "_");
        }
        return deviceModel;
    }

    public int getUserStatus(String str) {
        Result sendCommandAndData;
        int status;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c85f15d7", new Object[]{this, str})).intValue();
        }
        if (CommonUtils.isBlank(str)) {
            return -1;
        }
        try {
            System.currentTimeMillis();
            sendCommandAndData = TAInterationV1.sendCommandAndData(this.mContext, TACommands.COMMAND_GET_USERSTATUS, str.getBytes());
            System.currentTimeMillis();
            status = sendCommandAndData.getStatus();
        } catch (Throwable th) {
            AuthenticatorLOG.error(th);
        }
        if (status == 0) {
            AuthenticatorLOG.fpInfo("ifaa original user status: " + ByteUtils.toInt(sendCommandAndData.getData()));
            AuthenticatorModel.saveClientStatus(this.mContext, "2", str);
            return 2;
        } else if (status == 2046820364) {
            AuthenticatorModel.saveClientStatus(this.mContext, "0", str);
            return 0;
        } else if (status != 2046820367) {
            return -1;
        } else {
            AuthenticatorModel.saveClientStatus(this.mContext, "1", str);
            return 1;
        }
    }

    public String getTrustDeviceToken(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b62f9a71", new Object[]{this, bArr});
        }
        try {
            Result sendCommandAndData = TAInterationV1.sendCommandAndData(this.mContext, TACommands.COMMAND_GET_TRUST_DEVICETOKEN, bArr);
            if (sendCommandAndData.getStatus() != 0) {
                return null;
            }
            return Base64.encodeToString(sendCommandAndData.getData(), 10);
        } catch (Throwable th) {
            AuthenticatorLOG.error(th);
            return null;
        }
    }

    public String getDeviceID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8f07df2", new Object[]{this});
        }
        try {
            System.currentTimeMillis();
            Result sendCommand = TAInterationV1.sendCommand(this.mContext, TACommands.COMMAND_GETDEVICEID);
            System.currentTimeMillis();
            if (sendCommand.getStatus() == 0 && !sendCommand.isEmpty()) {
                return Base64.encodeToString(sendCommand.getData(), 8).replace("\n", "");
            }
            return null;
        } catch (Throwable th) {
            AuthenticatorLOG.error(th);
            return null;
        }
    }

    public int getTaVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("477874ef", new Object[]{this})).intValue();
        }
        try {
            System.currentTimeMillis();
            Result sendCommand = TAInterationV1.sendCommand(this.mContext, TACommands.COMMAND_GET_TA_VERSION);
            System.currentTimeMillis();
            if (sendCommand.getStatus() != 0) {
                return -1;
            }
            return ByteUtils.toInt(sendCommand.getData());
        } catch (Throwable th) {
            AuthenticatorLOG.error(th);
            return -1;
        }
    }

    public String getExtInfo(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f15f473", new Object[]{this, new Integer(i), str});
        }
        try {
            if (this.mIFAAManager.getVersion() < 3) {
                return null;
            }
            return ((IFAAManagerV3) this.mIFAAManager).getExtInfo(i, str);
        } catch (Throwable th) {
            AuthenticatorLOG.error(th);
            return null;
        }
    }

    public void setExtInfo(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ee8963", new Object[]{this, new Integer(i), str, str2});
            return;
        }
        try {
            if (this.mIFAAManager.getVersion() < 3) {
                return;
            }
            ((IFAAManagerV3) this.mIFAAManager).setExtInfo(i, str, str2);
        } catch (Throwable th) {
            AuthenticatorLOG.error(th);
        }
    }

    public int getEnabled(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15686724", new Object[]{this, new Integer(i)})).intValue();
        }
        try {
            if (this.mIFAAManager.getVersion() < 4) {
                return -1;
            }
            return ((IFAAManagerV4) this.mIFAAManager).getEnabled(i);
        } catch (Throwable th) {
            AuthenticatorLOG.error(th);
            return -1;
        }
    }

    public int[] getIDList(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("5ebc6cf7", new Object[]{this, new Integer(i)});
        }
        try {
            if (this.mIFAAManager.getVersion() < 4) {
                return null;
            }
            return ((IFAAManagerV4) this.mIFAAManager).getIDList(i);
        } catch (Throwable th) {
            AuthenticatorLOG.error(th);
            return null;
        }
    }
}

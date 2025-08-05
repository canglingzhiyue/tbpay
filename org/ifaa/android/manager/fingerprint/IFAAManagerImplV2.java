package org.ifaa.android.manager.fingerprint;

import android.content.Context;
import android.util.Log;
import com.alipay.security.mobile.agent.managerservice.ServiceAidlImpl;
import org.ifaa.android.manager.IFAAManagerV2;

/* loaded from: classes9.dex */
public class IFAAManagerImplV2 extends IFAAManagerV2 {
    private static final String TAG = "IFAAManagerImplV2";
    private static IFAAManagerImplV2 mIns;

    public static IFAAManagerImplV2 getInstance() {
        if (mIns == null) {
            mIns = new IFAAManagerImplV2();
        }
        return mIns;
    }

    @Override // org.ifaa.android.manager.IFAAManager
    public String getDeviceModel() {
        try {
            return ServiceAidlImpl.getInstance().getDeviceModel();
        } catch (Exception e) {
            Log.e(TAG, e.toString());
            return null;
        }
    }

    @Override // org.ifaa.android.manager.IFAAManager
    public int getSupportBIOTypes(Context context) {
        try {
            return ServiceAidlImpl.getInstance().getSupportBIOTypes();
        } catch (Exception e) {
            Log.e(TAG, e.toString());
            return 0;
        }
    }

    @Override // org.ifaa.android.manager.IFAAManager
    public int getVersion() {
        try {
            return ServiceAidlImpl.getInstance().getVersion();
        } catch (Exception e) {
            Log.e(TAG, e.toString());
            return 0;
        }
    }

    @Override // org.ifaa.android.manager.IFAAManagerV2
    public byte[] processCmdV2(Context context, byte[] bArr) {
        try {
            return ServiceAidlImpl.getInstance().processCmd(context, bArr);
        } catch (Exception e) {
            Log.e(TAG, e.toString());
            return new byte[0];
        }
    }

    @Override // org.ifaa.android.manager.IFAAManager
    public int startBIOManager(Context context, int i) {
        try {
            return ServiceAidlImpl.getInstance().startBIOManager(i);
        } catch (Exception e) {
            Log.e(TAG, e.toString());
            return 0;
        }
    }
}

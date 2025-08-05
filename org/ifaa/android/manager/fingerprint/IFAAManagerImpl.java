package org.ifaa.android.manager.fingerprint;

import android.content.Context;
import android.util.Log;
import com.alipay.security.mobile.agent.managerservice.ServiceAidlImpl;
import org.ifaa.android.manager.IFAAManager;

/* loaded from: classes9.dex */
public class IFAAManagerImpl extends IFAAManager {
    private static final String TAG = "IFAAManagerImpl";
    private static IFAAManagerImpl mIns;

    public static IFAAManagerImpl getInstance() {
        if (mIns == null) {
            mIns = new IFAAManagerImpl();
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

package com.alibaba.security.client.smart.core;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.client.smart.core.model.BaseNativeInitModel;
import com.alibaba.security.client.smart.core.model.BaseNativePredictModel;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.easy.EasyTracker;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class BasePluginNative<N extends BaseNativeInitModel, P extends BaseNativePredictModel, Result> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BasePluginNative";
    public static boolean isTestMode;
    public String mCcrcCode;
    public Context mContext;
    public boolean mIsSoLoadSuccess;
    public EasyTracker mLrcEasyTrack = EasyTracker.getInstance();
    public String mPid;

    public BasePluginNative(Context context, String str, String str2) {
        this.mContext = context;
        this.mCcrcCode = str;
        this.mPid = str2;
        if (isTestMode) {
            this.mIsSoLoadSuccess = true;
        } else if (StringUtils.isEmpty(libName())) {
            this.mIsSoLoadSuccess = true;
        } else {
            try {
                System.loadLibrary(libName());
                this.mIsSoLoadSuccess = true;
            } catch (UnsatisfiedLinkError e) {
                this.mIsSoLoadSuccess = false;
                Logging.e(TAG, "so load fail", e);
                trackLibraryLoadFail("libName is: " + libName() + " System.load exception is: " + e.getMessage());
            }
        }
    }

    public static void setIsTestMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("490cb52c", new Object[]{new Boolean(z)});
        } else {
            isTestMode = z;
        }
    }

    private void trackLibraryLoadFail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d7a4dc5", new Object[]{this, str});
        } else {
            TrackManager.track(TrackLog.newBuilder().setPhase("error").setOperation("error").addParam("subModule", "plugin_native").addParam("errorMsg", str).build());
        }
    }

    public abstract Object init(N n);

    public boolean isSoLoadSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b2d39442", new Object[]{this})).booleanValue() : this.mIsSoLoadSuccess;
    }

    public abstract String libName();

    public abstract Result predict(P p);

    public abstract boolean release();

    public abstract void setParams(String str);
}

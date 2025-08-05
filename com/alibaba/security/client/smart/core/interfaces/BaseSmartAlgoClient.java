package com.alibaba.security.client.smart.core.interfaces;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.ccrc.service.build.AbstractC1227la;
import com.alibaba.security.client.smart.core.BasePluginNative;
import com.alibaba.security.client.smart.core.algo.AlgoInitResult;
import com.alibaba.security.client.smart.core.algo.ClientAlgoResult;
import com.alibaba.security.client.smart.core.constants.BaseConfigKey;
import com.alibaba.security.client.smart.core.interfaces.ISmartAlgoClient;
import com.alibaba.security.client.smart.core.model.BaseNativeInitModel;
import com.alibaba.security.client.smart.core.model.BaseNativePredictModel;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alibaba.security.wukong.interfaces.IContentRiskPlatform;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class BaseSmartAlgoClient<T extends BasePluginNative<? extends BaseNativeInitModel, ? extends BaseNativePredictModel, ?>, P extends CCRCRiskSample> extends AbstractC1227la implements ISmartAlgoClient<P> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BaseSmartAlgoClient";
    public String mCcrcCode;
    public Bundle mConfigBundle;
    public Context mContext;
    public String mDataId;
    public long mDetectNumbers;
    public long mDetectTimes;
    public IContentRiskPlatform mIContentRiskPlatform;
    public volatile boolean mInit;
    public String mModelPath;
    public ISmartAlgoClient.OnAlgoResultListener mOnAlgoResultListener;
    public HashMap<String, Object> mParams = new HashMap<>();
    public String mPid;
    public T mPluginNative;
    public String mSdkVersion;

    private AlgoInitResult initClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlgoInitResult) ipChange.ipc$dispatch("c451313b", new Object[]{this});
        }
        AlgoInitResult algoInitResult = new AlgoInitResult();
        if (!this.mPluginNative.isSoLoadSuccess()) {
            new Exception(pluginName() + "#init exception by client have init").printStackTrace();
            algoInitResult.code = -4;
            algoInitResult.msg = pluginName() + " SoLoad失败";
            return algoInitResult;
        } else if (this.mInit) {
            algoInitResult.code = 0;
            return algoInitResult;
        } else {
            return doInit();
        }
    }

    public static /* synthetic */ Object ipc$super(BaseSmartAlgoClient baseSmartAlgoClient, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private void resetDetectData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eddba23", new Object[]{this});
            return;
        }
        this.mDetectNumbers = 0L;
        this.mDetectTimes = 0L;
    }

    private void uploadTraceLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea9ed67", new Object[]{this});
        }
    }

    public void callbackHearBeat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b73c6630", new Object[]{this});
            return;
        }
        IContentRiskPlatform iContentRiskPlatform = this.mIContentRiskPlatform;
        if (iContentRiskPlatform == null) {
            return;
        }
        iContentRiskPlatform.addAlgoHeartBeat(algoCode());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.security.client.smart.core.interfaces.ISmartAlgoClient
    public /* bridge */ /* synthetic */ ClientAlgoResult detect(Object obj) {
        return detect((BaseSmartAlgoClient<T, P>) ((CCRCRiskSample) obj));
    }

    public abstract ClientAlgoResult doDetect(P p);

    public abstract AlgoInitResult doInit();

    public abstract void doRelease();

    public void genArguments(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77192647", new Object[]{this, bundle});
            return;
        }
        try {
            this.mPid = bundle.getString(BaseConfigKey.KEY_CURRENT_PID, "");
            this.mModelPath = bundle.getString(BaseConfigKey.KEY_ALGO_MODEL_PATH, "");
            this.mCcrcCode = bundle.getString(BaseConfigKey.KEY_SDK_CCRC_CODE, "");
            this.mSdkVersion = bundle.getString(BaseConfigKey.KEY_SDK_VERSION, "");
        } catch (Throwable th) {
            Logging.e(TAG, "genArguments fail", th);
        }
    }

    public String getAppKeyFromSecurityGuard() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("87048ab2", new Object[]{this}) : CcrcContextImpl.getInstance().getAppKey();
    }

    public String getDataId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6bbd4c7e", new Object[]{this}) : this.mDataId;
    }

    public boolean heartbeatTriggerByDetect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d887ca1", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.alibaba.security.client.smart.core.interfaces.ISmartAlgoClient
    public int init(Context context, Bundle bundle, ISmartAlgoClient.OnAlgoResultListener onAlgoResultListener, IContentRiskPlatform iContentRiskPlatform) {
        int i;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5de5501d", new Object[]{this, context, bundle, onAlgoResultListener, iContentRiskPlatform})).intValue();
        }
        synchronized (this) {
            this.mAlgoInitTime = System.currentTimeMillis();
            this.mContext = context;
            this.mConfigBundle = bundle;
            this.mParams.clear();
            this.mOnAlgoResultListener = onAlgoResultListener;
            this.mIContentRiskPlatform = iContentRiskPlatform;
            genArguments(bundle);
            resetDetectData();
            initNativeWrapper();
            AlgoInitResult initClient = initClient();
            if (initClient.code != 0) {
                z = false;
            }
            this.mInit = z;
            notifyInitResult(initClient);
            i = initClient.code;
        }
        return i;
    }

    public abstract void initNativeWrapper();

    public abstract boolean isDetectSync();

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1227la
    public boolean loggable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19954f88", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void notifyAlgoResult(CCRCRiskSample cCRCRiskSample, ClientAlgoResult clientAlgoResult, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6202dbf", new Object[]{this, cCRCRiskSample, clientAlgoResult, new Long(j)});
            return;
        }
        if (clientAlgoResult != null) {
            reportAlgoDetectEnd(cCRCRiskSample, this.mPid, this.mCcrcCode, algoCode(), clientAlgoResult.result, System.currentTimeMillis() - j, version());
        }
        ISmartAlgoClient.OnAlgoResultListener onAlgoResultListener = this.mOnAlgoResultListener;
        if (onAlgoResultListener == null || clientAlgoResult == null) {
            return;
        }
        onAlgoResultListener.onResult(clientAlgoResult);
    }

    public void notifyInitResult(AlgoInitResult algoInitResult) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9265a1a4", new Object[]{this, algoInitResult});
            return;
        }
        if (algoInitResult.code != 0) {
            z = false;
        }
        this.mInit = z;
        reportAlgoInitEnd(this.mPid, this.mCcrcCode, algoCode(), algoInitResult.msg, this.mInit, version());
        ISmartAlgoClient.OnAlgoResultListener onAlgoResultListener = this.mOnAlgoResultListener;
        if (onAlgoResultListener == null) {
            return;
        }
        onAlgoResultListener.onInit(algoInitResult);
    }

    public abstract String pluginName();

    @Override // com.alibaba.security.client.smart.core.interfaces.ISmartAlgoClient
    public boolean release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca55112", new Object[]{this})).booleanValue();
        }
        synchronized (this) {
            if (!this.mInit) {
                StringBuilder sb = new StringBuilder();
                sb.append(pluginName());
                sb.append("#release exception by algo client is not init");
                new Exception(sb.toString()).printStackTrace();
                return false;
            }
            doRelease();
            boolean release = this.mPluginNative.release();
            if (release) {
                this.mInit = false;
            }
            return release;
        }
    }

    public void reportLog(TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86be22f3", new Object[]{this, trackLog});
        } else {
            TrackManager.track(trackLog);
        }
    }

    @Override // com.alibaba.security.client.smart.core.interfaces.ISmartAlgoClient
    public void setParams(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8430b5", new Object[]{this, str, obj});
            return;
        }
        this.mParams.put(str, obj);
        if (!this.mInit) {
            return;
        }
        this.mPluginNative.setParams(JsonUtils.toJSONString(this.mParams));
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1227la
    public String type() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("426047ff", new Object[]{this}) : "cpp";
    }

    public abstract String version();

    public ClientAlgoResult detect(P p) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClientAlgoResult) ipChange.ipc$dispatch("b5872bbf", new Object[]{this, p});
        }
        synchronized (this) {
            long currentTimeMillis = System.currentTimeMillis();
            this.mDataId = p.getMetaId();
            if (!this.mInit) {
                Logging.e(TAG, String.format("%s algo has not init yet", algoCode()));
                return null;
            }
            this.mDetectNumbers++;
            ClientAlgoResult doDetect = doDetect(p);
            this.mDetectTimes = (System.currentTimeMillis() - currentTimeMillis) + this.mDetectTimes;
            if (heartbeatTriggerByDetect()) {
                callbackHearBeat();
            }
            if (isDetectSync()) {
                notifyAlgoResult(p, doDetect, currentTimeMillis);
            }
            return doDetect;
        }
    }

    @Override // com.alibaba.security.client.smart.core.interfaces.ISmartAlgoClient
    public void setParams(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70906a96", new Object[]{this, map});
            return;
        }
        this.mParams.putAll(map);
        if (!this.mInit) {
            return;
        }
        this.mPluginNative.setParams(JsonUtils.toJSONString(this.mParams));
    }
}

package com.alibaba.security.client.smart.core.wukong.action;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.enums.Mode;
import com.alibaba.security.ccrc.model.Label;
import com.alibaba.security.ccrc.service.BaseCcrcDetectResult;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.B;
import com.alibaba.security.ccrc.service.build.C1220j;
import com.alibaba.security.ccrc.service.build.InterfaceC1223k;
import com.alibaba.security.ccrc.service.build.Ma;
import com.alibaba.security.ccrc.service.build.Mb;
import com.alibaba.security.ccrc.service.build.W;
import com.alibaba.security.ccrc.service.build.Yb;
import com.alibaba.security.client.smart.core.algo.SampleData;
import com.alibaba.security.client.smart.core.model.InferContext;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class BaseActionPerform {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BaseActionPerform";
    public String mCcrcCode;
    public CcrcService.Config mConfig;
    public Context mContext;
    public Mb mDataPipeAbility;
    public InterfaceC1223k mHttp;
    public B mOnCcrcLifeCallback;

    public BaseActionPerform(Context context) {
        this.mContext = context;
    }

    public /* synthetic */ void a(InferContext inferContext, String str, long j, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc8116ba", new Object[]{this, inferContext, str, new Long(j), str2, str3, str4});
            return;
        }
        TrackLog.Builder phase = TrackLog.newBuilder().setpId(getPid()).setCcrcCode(getCcrcCode()).setMetaId(inferContext.getMetaId()).setSampleId(inferContext.getSampleID()).setPhase("detect");
        StringBuilder a2 = Yb.a("action_");
        a2.append(actionPerformCode());
        TrackManager.track(phase.setOperation(a2.toString()).setStatus(0).addParam("context", str).addParam("costTime", Long.valueOf(System.currentTimeMillis() - j)).addParam("params", str2).addParam("sign", str3).addParam("riskData", str4).build());
    }

    public static <T> T getSafely(JSONArray jSONArray, int i, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("d40b90f9", new Object[]{jSONArray, new Integer(i), cls});
        }
        if (jSONArray == null) {
            return null;
        }
        try {
            if (jSONArray.size() > i) {
                return (T) jSONArray.getObject(i, cls);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static /* synthetic */ void lambda$EHeQ47uEgZh05uZX7OsL_3tSX4I(BaseActionPerform baseActionPerform, InferContext inferContext, String str, long j, String str2, String str3, String str4) {
        baseActionPerform.a(inferContext, str, j, str2, str3, str4);
    }

    private void reportActionPerform(final String str, final InferContext inferContext, final String str2, final String str3, final long j, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c861efc", new Object[]{this, str, inferContext, str2, str3, new Long(j), str4});
        } else {
            TrackManager.getExecutor().execute(new Runnable() { // from class: com.alibaba.security.client.smart.core.wukong.action.-$$Lambda$BaseActionPerform$EHeQ47uEgZh05uZX7OsL_3tSX4I
                @Override // java.lang.Runnable
                public final void run() {
                    BaseActionPerform.lambda$EHeQ47uEgZh05uZX7OsL_3tSX4I(BaseActionPerform.this, inferContext, str, j, str2, str3, str4);
                }
            });
        }
    }

    public void accept(String str, InferContext inferContext, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0ad29eb", new Object[]{this, str, inferContext, str2, str3, str4});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            doAccept(str, inferContext, str2, str3, Ma.a(inferContext.ccrcCode, inferContext.sceneName, inferContext.getMetaId()), str4);
            reportActionPerform(str, inferContext, str2, str3, currentTimeMillis, str4);
        } catch (Exception e) {
            Logging.e(TAG, "", e);
        }
    }

    public void actionCallbackFail(SampleData sampleData, BaseCcrcDetectResult baseCcrcDetectResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4fab4b6", new Object[]{this, sampleData, baseCcrcDetectResult});
            return;
        }
        B b = this.mOnCcrcLifeCallback;
        if (b == null) {
            return;
        }
        b.a(actionPerformCode(), false, this.mConfig, sampleData, baseCcrcDetectResult);
    }

    public void actionCallbackSuccess(SampleData sampleData, BaseCcrcDetectResult baseCcrcDetectResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6baa07c5", new Object[]{this, sampleData, baseCcrcDetectResult});
            return;
        }
        B b = this.mOnCcrcLifeCallback;
        if (b == null) {
            return;
        }
        b.a(actionPerformCode(), true, this.mConfig, sampleData, baseCcrcDetectResult);
    }

    public abstract String actionPerformCode();

    public void activate(String str, CcrcService.Config config, B b, Mb mb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc23f012", new Object[]{this, str, config, b, mb});
            return;
        }
        this.mOnCcrcLifeCallback = b;
        this.mDataPipeAbility = mb;
        this.mConfig = config;
        this.mCcrcCode = str;
    }

    public void callbackFail(SampleData sampleData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ddbcbd", new Object[]{this, sampleData});
            return;
        }
        B b = this.mOnCcrcLifeCallback;
        if (b == null) {
            return;
        }
        b.a(this.mConfig, sampleData, "risk upload fail", true, 1);
    }

    public void callbackSuccess(SampleData sampleData, boolean z, List<Label> list, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2d4ea58", new Object[]{this, sampleData, new Boolean(z), list, map});
            return;
        }
        B b = this.mOnCcrcLifeCallback;
        if (b == null) {
            return;
        }
        b.a(this.mConfig, sampleData, W.a(sampleData, z, list, map));
    }

    public abstract void doAccept(String str, InferContext inferContext, String str2, String str3, SampleData sampleData, String str4);

    public String getCcrcCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a2081e5", new Object[]{this}) : this.mCcrcCode;
    }

    public synchronized InterfaceC1223k getHttpManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InterfaceC1223k) ipChange.ipc$dispatch("2f01ace7", new Object[]{this});
        }
        if (this.mHttp == null) {
            this.mHttp = new C1220j(this.mContext);
        }
        return this.mHttp;
    }

    public String getPid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("229b03c4", new Object[]{this}) : this.mConfig.getPid();
    }

    public boolean needRiskUpload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7649071", new Object[]{this})).booleanValue();
        }
        CcrcService.Config config = this.mConfig;
        return config == null || config.getMode() != Mode.LOCAL;
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        }
    }
}

package com.alibaba.security.wukong.plugin;

import android.content.Context;
import com.alibaba.security.ccrc.common.keep.IKeep;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.A;
import com.alibaba.security.ccrc.service.build.Ba;
import com.alibaba.security.ccrc.service.build.G;
import com.alibaba.security.ccrc.service.build.Yb;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alibaba.security.wukong.interfaces.IContentRiskPlatform;
import com.alibaba.security.wukong.interfaces.IContentRiskPlugin;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class BaseWuKongContentRiskPlugin implements IKeep, IContentRiskPlatform, IContentRiskPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BaseWuKongContentRiskPlugin";
    public final Map<String, Boolean> mAlgoCodeSwitches = new HashMap();
    public G mAlgoResultWatcher;
    public String mCcrcCode;
    public CcrcService.Config mConfig;
    public A mContentRiskListener;
    public final Context mContext;

    public BaseWuKongContentRiskPlugin(Context context) {
        this.mContext = context;
        onCreate(this.mContext);
        Logging.d(TAG, String.format("plugin %s onCreate", name()));
    }

    private void reportPluginActivateLog(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00d9e0f", new Object[]{this, str, str2, new Boolean(z)});
        } else {
            trackLog(TrackLog.newBuilder().setpId(str).setCcrcCode(str2).setPhase("init").setOperation(String.format(Ba.a.l, name())).setStatus(z ? 0 : -1).build(), false);
        }
    }

    public boolean activate(String str, CcrcService.Config config, A a2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4cb36a8", new Object[]{this, str, config, a2})).booleanValue();
        }
        this.mCcrcCode = str;
        this.mConfig = config;
        this.mContentRiskListener = a2;
        boolean onActivate = onActivate(config);
        reportPluginActivateLog(this.mConfig.getPid(), this.mCcrcCode, onActivate);
        StringBuilder a3 = Yb.a("plugin ");
        a3.append(name());
        a3.append(" activate result: ");
        a3.append(onActivate ? "success" : "fail");
        Logging.d(TAG, a3.toString());
        return onActivate;
    }

    @Override // com.alibaba.security.wukong.interfaces.IContentRiskPlatform
    public void addAlgoHeartBeat(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2165d979", new Object[]{this, str});
            return;
        }
        A a2 = this.mContentRiskListener;
        if (a2 == null) {
            return;
        }
        a2.a(str);
    }

    public void deactivate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0bfafb", new Object[]{this});
            return;
        }
        Logging.d(TAG, String.format("%s plugin deactivate", name()));
        onDeActivate();
    }

    public void detect(CCRCRiskSample cCRCRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2425b203", new Object[]{this, cCRCRiskSample});
        } else {
            onDetectSample(cCRCRiskSample);
        }
    }

    @Override // com.alibaba.security.wukong.interfaces.IContentRiskPlatform
    public String getCcrcCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a2081e5", new Object[]{this}) : this.mCcrcCode;
    }

    public CcrcService.Config getConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CcrcService.Config) ipChange.ipc$dispatch("3cc16fba", new Object[]{this}) : this.mConfig;
    }

    @Override // com.alibaba.security.wukong.interfaces.IContentRiskPlatform
    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.mContext;
    }

    @Override // com.alibaba.security.wukong.interfaces.IContentRiskPlugin
    public IContentRiskPlatform getPlatform() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContentRiskPlatform) ipChange.ipc$dispatch("c7895e0", new Object[]{this}) : this;
    }

    public boolean inputConfig(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82de60ac", new Object[]{this, str, map})).booleanValue();
        }
        this.mCcrcCode = str;
        return onInputConfig(map);
    }

    @Override // com.alibaba.security.wukong.interfaces.IContentRiskPlatform
    public void inputInferData(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("755e4cf0", new Object[]{this, map});
        } else if (map == null) {
            Logging.e(TAG, "notifyWukongEngine fail,AlgoResult is null");
        } else {
            G g = this.mAlgoResultWatcher;
            if (g != null) {
                g.a(map);
            }
            A a2 = this.mContentRiskListener;
            if (a2 == null) {
                return;
            }
            a2.a(this.mConfig, name(), map);
        }
    }

    public boolean isAlgoOpen(String str) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("242325dc", new Object[]{this, str})).booleanValue();
        }
        if (this.mAlgoCodeSwitches.isEmpty() || !this.mAlgoCodeSwitches.containsKey(str) || (bool = this.mAlgoCodeSwitches.get(str)) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void setAlgoWatcher(G g) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0fe117", new Object[]{this, g});
        } else {
            this.mAlgoResultWatcher = g;
        }
    }

    public void switchAlgo(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54cc72dc", new Object[]{this, str, new Boolean(z)});
        } else {
            this.mAlgoCodeSwitches.put(str, Boolean.valueOf(z));
        }
    }

    @Override // com.alibaba.security.wukong.interfaces.IContentRiskPlatform
    public void trackLog(TrackLog trackLog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8a5808a", new Object[]{this, trackLog, new Boolean(z)});
        } else {
            TrackManager.track(trackLog);
        }
    }
}

package com.alibaba.security.ccrc.service;

import android.text.TextUtils;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.enums.Mode;
import com.alibaba.security.ccrc.interfaces.OnAlgoResultCallback;
import com.alibaba.security.ccrc.interfaces.OnCcrcCallback;
import com.alibaba.security.ccrc.interfaces.OnDetectRiskListener;
import com.alibaba.security.ccrc.interfaces.Uploader;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.ccrc.service.build.C;
import com.alibaba.security.ccrc.service.build.E;
import com.alibaba.security.ccrc.service.build.M;
import com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.alibaba.security.wukong.plugin.BaseWuKongContentRiskPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class CcrcService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CcrcService";
    public static final Map<String, CcrcService> mServiceMap = new HashMap();
    public final M mCcrcServiceManager;

    /* loaded from: classes3.dex */
    public static class Config implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Map<String, Object> extras;
        public final Mode mode;
        public final String pid;

        /* loaded from: classes3.dex */
        public static class Builder implements Serializable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public Map<String, Object> extras;
            public Mode mode = Mode.DEFAULT;
            public String pid;

            public Config build() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Config) ipChange.ipc$dispatch("4033044", new Object[]{this}) : new Config(this.pid, this.extras, this.mode);
            }

            @Deprecated
            public Builder setCcrcCode(String str) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("b1de3391", new Object[]{this, str}) : this;
            }

            public Builder setExtras(Map<String, Object> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("be43b29", new Object[]{this, map});
                }
                this.extras = map;
                return this;
            }

            public Builder setMode(Mode mode) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("3cac1317", new Object[]{this, mode});
                }
                this.mode = mode;
                return this;
            }

            public Builder setPid(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("5bdbf9c8", new Object[]{this, str});
                }
                this.pid = str;
                return this;
            }
        }

        public Config(String str, Map<String, Object> map, Mode mode) {
            this.pid = str;
            this.extras = map;
            this.mode = mode;
        }

        public Map<String, Object> getExtras() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("cf016b95", new Object[]{this});
            }
            if (this.extras == null) {
                this.extras = new HashMap();
            }
            return this.extras;
        }

        public Mode getMode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Mode) ipChange.ipc$dispatch("8128d435", new Object[]{this}) : this.mode;
        }

        public String getPid() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("229b03c4", new Object[]{this}) : this.pid;
        }
    }

    public CcrcService(String str) {
        this.mCcrcServiceManager = new M(str);
    }

    public static synchronized CcrcService getService(String str) {
        synchronized (CcrcService.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CcrcService) ipChange.ipc$dispatch("78168fe7", new Object[]{str});
            } else if (TextUtils.isEmpty(str)) {
                Logging.e(TAG, "ccrcCode is null");
                return null;
            } else if (CcrcContextImpl.getContext() == null) {
                Logging.w(TAG, "ccrc context is not init yet");
                return null;
            } else if (mServiceMap.get(str) != null) {
                return mServiceMap.get(str);
            } else {
                CcrcService ccrcService = new CcrcService(str);
                mServiceMap.put(str, ccrcService);
                return ccrcService;
            }
        }
    }

    public void activate(Config config, OnCcrcCallback onCcrcCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0404ca", new Object[]{this, config, onCcrcCallback});
        } else {
            this.mCcrcServiceManager.a(config, onCcrcCallback);
        }
    }

    public void deActivate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d74f1b", new Object[]{this});
        } else {
            this.mCcrcServiceManager.f();
        }
    }

    @Deprecated
    public void detect(CCRCRiskSample cCRCRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2425b203", new Object[]{this, cCRCRiskSample});
        } else {
            detect(cCRCRiskSample, true);
        }
    }

    public void enableHeartBeat(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e3e3bf4", new Object[]{this, new Boolean(z)});
        } else {
            this.mCcrcServiceManager.a(z);
        }
    }

    public void enableLowDevice(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc511f06", new Object[]{this, new Boolean(z)});
        } else {
            this.mCcrcServiceManager.b(z);
        }
    }

    public String getCcrcCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a2081e5", new Object[]{this}) : this.mCcrcServiceManager.getCcrcCode();
    }

    public M getCcrcServiceManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (M) ipChange.ipc$dispatch("5fe25a95", new Object[]{this}) : this.mCcrcServiceManager;
    }

    public int getDetectFrequency() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("417902bd", new Object[]{this})).intValue() : this.mCcrcServiceManager.g();
    }

    public Uploader getFileUploader() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uploader) ipChange.ipc$dispatch("f47b19c5", new Object[]{this}) : this.mCcrcServiceManager.i();
    }

    public String getPid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("229b03c4", new Object[]{this}) : this.mCcrcServiceManager.e();
    }

    public boolean isActivate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8b569a48", new Object[]{this})).booleanValue() : this.mCcrcServiceManager.a();
    }

    public boolean isSwitchClosed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ed76af95", new Object[]{this})).booleanValue() : this.mCcrcServiceManager.l();
    }

    public void prepare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1afb60e", new Object[]{this});
        } else {
            this.mCcrcServiceManager.m();
        }
    }

    public void registerAction(BaseActionPerform baseActionPerform) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("383d604e", new Object[]{this, baseActionPerform});
        } else {
            this.mCcrcServiceManager.a(baseActionPerform);
        }
    }

    public void registerAlgoCallback(OnAlgoResultCallback onAlgoResultCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c3de186", new Object[]{this, onAlgoResultCallback});
        } else {
            this.mCcrcServiceManager.a(onAlgoResultCallback);
        }
    }

    public void registerBizFeature(String str, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33e8d5a1", new Object[]{this, str, obj, new Boolean(z)});
        } else {
            this.mCcrcServiceManager.a(str, obj, z);
        }
    }

    public void registerPlugin(BaseWuKongContentRiskPlugin baseWuKongContentRiskPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fae6ed93", new Object[]{this, baseWuKongContentRiskPlugin});
        } else {
            this.mCcrcServiceManager.a(baseWuKongContentRiskPlugin);
        }
    }

    public void setActionDetectCallback(C c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ad04142", new Object[]{this, c});
        } else {
            this.mCcrcServiceManager.a(c);
        }
    }

    public void setFileUploader(Uploader uploader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcff859b", new Object[]{this, uploader});
        } else {
            this.mCcrcServiceManager.a(uploader);
        }
    }

    public void setRiskCallback(OnDetectRiskListener onDetectRiskListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbf0669a", new Object[]{this, onDetectRiskListener});
        } else {
            this.mCcrcServiceManager.a(onDetectRiskListener);
        }
    }

    public void setRuleNotHitCallback(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8602cbd", new Object[]{this, e});
        } else {
            this.mCcrcServiceManager.a(e);
        }
    }

    public void switchWithCode(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da2075c", new Object[]{this, str, new Boolean(z)});
        } else {
            this.mCcrcServiceManager.a(str, z);
        }
    }

    public void updateHeartBeatInfo(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8f274dd", new Object[]{this, map});
        } else {
            this.mCcrcServiceManager.a(map);
        }
    }

    @Deprecated
    public void detect(CCRCRiskSample cCRCRiskSample, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60914131", new Object[]{this, cCRCRiskSample, new Boolean(z)});
        } else {
            this.mCcrcServiceManager.a(cCRCRiskSample, z);
        }
    }

    public void registerBizFeature(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9651cf93", new Object[]{this, str, obj});
        } else {
            registerBizFeature(str, obj, false);
        }
    }
}

package com.taobao.message.lab.comfrm.aura;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.inner2.Plugin;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.lab.comfrm.inner2.StateManager;
import com.taobao.message.lab.comfrm.inner2.config.ConfigInfo;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.util.MessageNavProcessorV2;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public final class DojoStateService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final StateManager mStateManager;

    static {
        kge.a(27537422);
    }

    public DojoStateService(DojoContext dojoContext, Plugin plugin, final StateManager.StateListener stateListener) {
        TraceUtil.beginSection("AURA-C-dojo.service.state");
        ConfigInfo configInfo = dojoContext.configInfo;
        Map<String, Object> map = dojoContext.props;
        final String str = dojoContext.bizConfigCode;
        this.mStateManager = new StateManager(dojoContext.identifier, dojoContext.containerKey, configInfo.transformer, map, dojoContext.useRemote, plugin, dojoContext.classNamespace);
        if ("messagePlatformV2".equals(dojoContext.bizConfigCode) && "1".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "strictImmediateMessagePlatformV2", "1"))) {
            this.mStateManager.strictImmediate();
        }
        if ("messagePlatform".equals(dojoContext.bizConfigCode) && "1".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "strictImmediateMessagePlatform", "0"))) {
            this.mStateManager.strictImmediate();
        }
        this.mStateManager.strictMerge();
        this.mStateManager.setStateListener(new StateManager.StateListener() { // from class: com.taobao.message.lab.comfrm.aura.DojoStateService.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.inner2.StateManager.StateListener
            public void onChanged(Action action, SharedState sharedState) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("587fd455", new Object[]{this, action, sharedState});
                    return;
                }
                Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1008).ext(MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, str, "propsSize", String.valueOf(sharedState.getPropsSize()), "runtimeDataSize", String.valueOf(sharedState.getRuntimeDataSize()), "jsRuntimeDataSize", String.valueOf(sharedState.getJsRuntimeDataSize()), "originalDataSize", String.valueOf(sharedState.getOriginalDataSize()), "runtimeDiffSize", String.valueOf(sharedState.getDiff().getRuntimeDiffSize()), "originalDiffSize", String.valueOf(sharedState.getDiff().getOriginalDiffSize())).build());
                StateManager.StateListener stateListener2 = stateListener;
                if (stateListener2 == null) {
                    return;
                }
                stateListener2.onChanged(action, sharedState);
            }
        });
        this.mStateManager.initJSEnv(ApplicationUtil.getApplication(), dojoContext.resourceManager, plugin);
        TraceUtil.endTrace();
    }

    public void dispatch(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("865d606c", new Object[]{this, action});
        } else {
            this.mStateManager.dispatch(action);
        }
    }

    public StateManager getStateManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StateManager) ipChange.ipc$dispatch("37df392d", new Object[]{this}) : this.mStateManager;
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.mStateManager.dispose();
        }
    }
}

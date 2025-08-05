package com.taobao.message.lab.comfrm.inner2;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.inner2.EventManager;
import com.taobao.message.lab.comfrm.inner2.SourceManager;
import com.taobao.message.lab.comfrm.inner2.StateManager;
import com.taobao.message.lab.comfrm.inner2.config.ConfigInfo;
import com.taobao.message.lab.comfrm.inner2.config.LayoutInfo;
import com.taobao.message.lab.comfrm.inner2.config.SourceItem;
import com.taobao.message.lab.comfrm.inner2.config.TransformerItem;
import com.taobao.message.lab.comfrm.inner2.event.EventHandleRuntime;
import com.taobao.message.lab.comfrm.render.RenderRuntimeInfo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;

/* loaded from: classes7.dex */
public class Plugins implements Plugin {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mBizConfigCode;
    private final ConfigInfo mConfigInfo;
    private final String mContainerKey;
    private final String mIdentifier;
    private final String mVersion;
    private List<Plugin> plugins = new CopyOnWriteArrayList();

    static {
        kge.a(-1057119201);
        kge.a(-1003931948);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerBasicInfo(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a38695f", new Object[]{this, str, str2, str3});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerConfigInfo(ConfigInfo configInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a058ccc", new Object[]{this, configInfo});
        }
    }

    public Plugins(String str, String str2, String str3, String str4, ConfigInfo configInfo) {
        this.mContainerKey = str;
        this.mIdentifier = str2;
        this.mBizConfigCode = str3;
        this.mVersion = str4;
        this.mConfigInfo = configInfo;
    }

    public void addPlugin(Plugin plugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8e2512", new Object[]{this, plugin});
            return;
        }
        this.plugins.add(plugin);
        plugin.onContainerBasicInfo(this.mContainerKey, this.mBizConfigCode, this.mVersion);
        plugin.onContainerConfigInfo(this.mConfigInfo);
    }

    public void removePlugin(Plugin plugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e6d41cf", new Object[]{this, plugin});
        } else {
            this.plugins.remove(plugin);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerStartStart(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ee7cc7", new Object[]{this, str, str2, str3});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onContainerStartStart(str, str2, str3);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onAwaitFinished(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8883884", new Object[]{this, new Boolean(z)});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onAwaitFinished(z);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerStartEnd(ConfigInfo configInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f9b7d5", new Object[]{this, configInfo});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onContainerStartEnd(configInfo);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onEventReceived(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e5ba16", new Object[]{this, event});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onEventReceived(event);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderBefore(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425782a4", new Object[]{this, viewObject});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onRenderBefore(viewObject);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderAfter(ViewObject viewObject, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec26feb0", new Object[]{this, viewObject, viewGroup});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onRenderAfter(viewObject, viewGroup);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onTransformerStart(Action action, TransformerItem transformerItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae452f4d", new Object[]{this, action, transformerItem, str});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onTransformerStart(action, transformerItem, str);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onTransformerEnd(Action action, TransformerItem transformerItem, String str, Dependecy dependecy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68509707", new Object[]{this, action, transformerItem, str, dependecy});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onTransformerEnd(action, transformerItem, str, dependecy);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onJSTransformerStart(Action action, TransformerItem transformerItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d1a4c", new Object[]{this, action, transformerItem});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onJSTransformerStart(action, transformerItem);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onJSTransformerEnd(Action action, TransformerItem transformerItem, Dependecy dependecy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e335a286", new Object[]{this, action, transformerItem, dependecy});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onJSTransformerEnd(action, transformerItem, dependecy);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onStateRuntimeChanged(StateManager.StateRuntimeInfo stateRuntimeInfo, StateManager.StateTraceSpan stateTraceSpan) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41fec3d2", new Object[]{this, stateRuntimeInfo, stateTraceSpan});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onStateRuntimeChanged(stateRuntimeInfo, stateTraceSpan);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceStart(SourceItem sourceItem, Command command) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39200349", new Object[]{this, sourceItem, command});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onSourceStart(sourceItem, command);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceEnd(SourceItem sourceItem, Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("693b6090", new Object[]{this, sourceItem, action});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onSourceEnd(sourceItem, action);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceTimeout(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300e271f", new Object[]{this, list});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onSourceTimeout(list);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceRuntimeChanged(Map<String, SourceManager.SourceRuntimeInfo> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f88c328", new Object[]{this, map});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onSourceRuntimeChanged(map);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderRuntimeChanged(RenderRuntimeInfo renderRuntimeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8352d31e", new Object[]{this, renderRuntimeInfo});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onRenderRuntimeChanged(renderRuntimeInfo);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBuildViewObjectStart(LayoutInfo layoutInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("689c1901", new Object[]{this, layoutInfo});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onBuildViewObjectStart(layoutInfo);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBuildViewObjectStart(LayoutInfo layoutInfo, SharedState sharedState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28490da5", new Object[]{this, layoutInfo, sharedState});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onBuildViewObjectStart(layoutInfo, sharedState);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBuildViewObjectEnd(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b66a91f0", new Object[]{this, viewObject});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onBuildViewObjectEnd(viewObject);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerDisposeFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f56faef6", new Object[]{this});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onContainerDisposeFinished();
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onEventHandelerExecuted(EventManager.EventRuntimeInfo eventRuntimeInfo, Action action, EventHandleRuntime eventHandleRuntime, EventManager.TraceSpan traceSpan) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bbfa513", new Object[]{this, eventRuntimeInfo, action, eventHandleRuntime, traceSpan});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onEventHandelerExecuted(eventRuntimeInfo, action, eventHandleRuntime, traceSpan);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onEventHandleAwaitDependenceStart(Action action, EventHandler eventHandler, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511ae6ec", new Object[]{this, action, eventHandler, str});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onEventHandleAwaitDependenceStart(action, eventHandler, str);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onEventHandleAwaitDependenceEnd(Action action, EventHandler eventHandler, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6cc110f", new Object[]{this, action, eventHandler, str, new Boolean(z)});
            return;
        }
        for (Plugin plugin : this.plugins) {
            plugin.onEventHandleAwaitDependenceEnd(action, eventHandler, str, z);
        }
    }
}

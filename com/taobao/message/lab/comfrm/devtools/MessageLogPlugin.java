package com.taobao.message.lab.comfrm.devtools;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.Dependecy;
import com.taobao.message.lab.comfrm.inner2.EventHandler;
import com.taobao.message.lab.comfrm.inner2.PluginAdapter;
import com.taobao.message.lab.comfrm.inner2.config.ConfigInfo;
import com.taobao.message.lab.comfrm.inner2.config.SourceItem;
import com.taobao.message.lab.comfrm.inner2.config.TransformerItem;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.util.MessageNavProcessorV2;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J&\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0016J.\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J&\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u0016J$\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001c\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010%\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010)\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010*\u001a\u00020+H\u0016J*\u0010,\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010-\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\"\u0010.\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010-\u001a\u00020\u0003H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/taobao/message/lab/comfrm/devtools/MessageLogPlugin;", "Lcom/taobao/message/lab/comfrm/inner2/PluginAdapter;", "containerKey", "", "(Ljava/lang/String;)V", "initSourceItemMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "transformerStartTime", "", "onContainerStartEnd", "", "configInfo", "Lcom/taobao/message/lab/comfrm/inner2/config/ConfigInfo;", "onContainerStartStart", MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, "version", "onEventHandleAwaitDependenceEnd", "action", "Lcom/taobao/message/lab/comfrm/core/Action;", "eventHandler", "Lcom/taobao/message/lab/comfrm/inner2/EventHandler;", "runtimeType", "awaitResult", "", "onEventHandleAwaitDependenceStart", "onJSTransformerEnd", "transformerItem", "Lcom/taobao/message/lab/comfrm/inner2/config/TransformerItem;", "runtimeDep", "Lcom/taobao/message/lab/comfrm/inner2/Dependecy;", "onJSTransformerStart", "onRenderAfter", "viewObject", "Lcom/taobao/message/lab/comfrm/core/ViewObject;", "wrapperLayout", "Landroid/view/ViewGroup;", "onRenderBefore", "onSourceEnd", "sourceItem", "Lcom/taobao/message/lab/comfrm/inner2/config/SourceItem;", "onSourceStart", "command", "Lcom/taobao/message/lab/comfrm/inner2/Command;", "onTransformerEnd", "dispatcherType", "onTransformerStart", "message_comfrm_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class MessageLogPlugin extends PluginAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String containerKey;
    private ConcurrentHashMap<String, Integer> initSourceItemMap = new ConcurrentHashMap<>();
    private long transformerStartTime;

    static {
        kge.a(269066535);
    }

    public MessageLogPlugin(String str) {
        this.containerKey = str;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onTransformerStart(Action action, TransformerItem transformerItem, String dispatcherType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae452f4d", new Object[]{this, action, transformerItem, dispatcherType});
            return;
        }
        q.d(action, "action");
        q.d(dispatcherType, "dispatcherType");
        if (ApplicationUtil.isDebug()) {
            this.transformerStartTime = System.currentTimeMillis();
        }
        TraceUtil.beginSection(transformerItem != null ? transformerItem.name : null);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onTransformerEnd(Action action, TransformerItem transformerItem, String dispatcherType, Dependecy runtimeDep) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68509707", new Object[]{this, action, transformerItem, dispatcherType, runtimeDep});
            return;
        }
        q.d(action, "action");
        q.d(dispatcherType, "dispatcherType");
        q.d(runtimeDep, "runtimeDep");
        if (ApplicationUtil.isDebug()) {
            long currentTimeMillis = System.currentTimeMillis() - this.transformerStartTime;
            Logger.FormatLog.Builder point = new Logger.FormatLog.Builder().type(0).module(16).point(1016);
            String[] strArr = new String[6];
            strArr[0] = "containerKey";
            strArr[1] = this.containerKey;
            strArr[2] = "transformerItem";
            strArr[3] = transformerItem != null ? transformerItem.name : null;
            strArr[4] = "time";
            strArr[5] = String.valueOf(currentTimeMillis);
            Logger.ftl(point.ext(strArr).build());
        }
        TraceUtil.endTrace();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onJSTransformerStart(Action action, TransformerItem transformerItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d1a4c", new Object[]{this, action, transformerItem});
            return;
        }
        q.d(action, "action");
        TraceUtil.beginSection(transformerItem != null ? transformerItem.name : null);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onJSTransformerEnd(Action action, TransformerItem transformerItem, Dependecy dependecy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e335a286", new Object[]{this, action, transformerItem, dependecy});
            return;
        }
        q.d(action, "action");
        TraceUtil.endTrace();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderBefore(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425782a4", new Object[]{this, viewObject});
        } else {
            TraceUtil.beginSection("RenderVO");
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderAfter(ViewObject viewObject, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec26feb0", new Object[]{this, viewObject, viewGroup});
        } else {
            TraceUtil.endTrace();
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerStartStart(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ee7cc7", new Object[]{this, str, str2, str3});
        } else {
            TraceUtil.beginSection("ContainerStart");
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerStartEnd(ConfigInfo configInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f9b7d5", new Object[]{this, configInfo});
        } else {
            TraceUtil.endTrace();
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceStart(SourceItem sourceItem, Command command) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39200349", new Object[]{this, sourceItem, command});
            return;
        }
        q.d(command, "command");
        if (!TraceUtil.isEnableTrace()) {
            return;
        }
        q.a(sourceItem);
        if (!sourceItem.defaultLoad) {
            return;
        }
        int hashCode = sourceItem.hashCode();
        String str = sourceItem.name;
        q.b(str, "sourceItem.name");
        this.initSourceItemMap.put(str, Integer.valueOf(hashCode));
        TraceUtil.asyncTraceBegin("AURA-DefaultLoad-" + sourceItem.name, hashCode);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceEnd(SourceItem sourceItem, Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("693b6090", new Object[]{this, sourceItem, action});
            return;
        }
        q.d(action, "action");
        if (!TraceUtil.isEnableTrace()) {
            return;
        }
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.initSourceItemMap;
        q.a(sourceItem);
        Integer num = concurrentHashMap.get(sourceItem.name);
        if (num != null) {
            TraceUtil.asyncTraceEnd("AURA-DefaultLoad-" + sourceItem.name, num.intValue());
        }
        TraceUtil.asyncTraceBegin("AURA-" + sourceItem.name, action.hashCode());
        TraceUtil.asyncTraceEnd("AURA-" + sourceItem.name, action.hashCode());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onEventHandleAwaitDependenceStart(Action action, EventHandler eventHandler, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511ae6ec", new Object[]{this, action, eventHandler, str});
            return;
        }
        StringBuilder sb = new StringBuilder();
        q.a(action);
        sb.append(action.getName());
        sb.append("|WeakDependence|start");
        Logger.e("EventManager", sb.toString());
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onEventHandleAwaitDependenceEnd(Action action, EventHandler eventHandler, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6cc110f", new Object[]{this, action, eventHandler, str, new Boolean(z)});
            return;
        }
        StringBuilder sb = new StringBuilder();
        q.a(action);
        sb.append(action.getName());
        sb.append("|WeakDependence|end");
        sb.append(z);
        Logger.e("EventManager", sb.toString());
    }
}

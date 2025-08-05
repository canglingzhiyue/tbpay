package com.taobao.message.sp.category;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.chat.compat.tree.TreeQueryResult;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.Dependecy;
import com.taobao.message.lab.comfrm.inner2.config.ConfigInfo;
import com.taobao.message.lab.comfrm.inner2.config.SourceItem;
import com.taobao.message.lab.comfrm.inner2.config.TransformerItem;
import com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance;
import com.taobao.message.lab.comfrm.support.trace.PageLoadPlugin;
import com.taobao.message.uikit.util.ApmTraceUtil;
import com.taobao.monitor.procedure.g;
import com.taobao.monitor.procedure.s;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.orq;

/* loaded from: classes7.dex */
public class SimpleMessageTabLoadMonitorPlugin extends PageLoadPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SimpleMsgTabLoadMonitorPlugin";
    public static long sGlobalFirstClickTime;
    public static boolean sGlobalFirstCreateContainer;
    private String apmPageSession;
    private Bundle args;
    private String bizConfigCode;
    private int firstSize;
    private boolean isAddSnapshotFlag;
    private long lastRenderTime;
    private int lastSize;
    private String mActivityName;
    private long mInitEndTime;
    private long mInitStartTime;
    private long mOnHostCreateTime;
    private long mOnHostCreateViewTime;

    public static /* synthetic */ Object ipc$super(SimpleMessageTabLoadMonitorPlugin simpleMessageTabLoadMonitorPlugin, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1371197619:
                super.onTransformerStart((Action) objArr[0], (TransformerItem) objArr[1], (String) objArr[2]);
                return null;
            case -483024250:
                super.onJSTransformerEnd((Action) objArr[0], (TransformerItem) objArr[1], (Dependecy) objArr[2]);
                return null;
            case -332988752:
                super.onRenderAfter((ViewObject) objArr[0], (ViewGroup) objArr[1]);
                return null;
            case -101811001:
                super.onContainerStartStart((String) objArr[0], (String) objArr[1], (String) objArr[2]);
                return null;
            case 27073100:
                super.onJSTransformerStart((Action) objArr[0], (TransformerItem) objArr[1]);
                return null;
            case 958399305:
                super.onSourceStart((SourceItem) objArr[0], (Command) objArr[1]);
                return null;
            case 1113031332:
                super.onRenderBefore((ViewObject) objArr[0]);
                return null;
            case 1392097237:
                super.onContainerStartEnd((ConfigInfo) objArr[0]);
                return null;
            case 1750112007:
                super.onTransformerEnd((Action) objArr[0], (TransformerItem) objArr[1], (String) objArr[2], (Dependecy) objArr[3]);
                return null;
            case 1765499024:
                super.onSourceEnd((SourceItem) objArr[0], (Action) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.message.lab.comfrm.support.trace.PageLoadPlugin
    public boolean checkVO(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8e98bfb", new Object[]{this, viewObject})).booleanValue();
        }
        return true;
    }

    static {
        kge.a(162553357);
        sGlobalFirstCreateContainer = true;
        sGlobalFirstClickTime = -1L;
    }

    public SimpleMessageTabLoadMonitorPlugin(Activity activity, long j, long j2, Bundle bundle) {
        super(activity, j, j2);
        this.firstSize = -1;
        this.lastSize = -1;
        this.lastRenderTime = 0L;
        this.isAddSnapshotFlag = false;
        this.args = bundle;
        this.apmPageSession = bundle.getString("ampPageSession");
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceStart(SourceItem sourceItem, Command command) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39200349", new Object[]{this, sourceItem, command});
            return;
        }
        super.onSourceStart(sourceItem, command);
        this.lastRenderTime = System.currentTimeMillis();
        String str = this.apmPageSession;
        ApmTraceUtil.onSubTaskBegin(str, "source-" + sourceItem.name);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceEnd(SourceItem sourceItem, Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("693b6090", new Object[]{this, sourceItem, action});
            return;
        }
        super.onSourceEnd(sourceItem, action);
        if ("treeSource".equals(sourceItem.name) && TextUtils.equals(action.getName(), StdActions.UPDATE_ORIGINAL_DATA) && (action.getData() instanceof TreeQueryResult)) {
            TreeQueryResult treeQueryResult = (TreeQueryResult) action.getData();
            if (this.firstSize < 0 && treeQueryResult.list != null) {
                this.firstSize = treeQueryResult.list.size();
            }
            if (treeQueryResult.list != null) {
                this.lastSize = treeQueryResult.list.size();
            }
        }
        String str = this.apmPageSession;
        ApmTraceUtil.onSubTaskSuccess(str, "source-" + sourceItem.name, (Map<String, Object>) null);
    }

    @Override // com.taobao.message.lab.comfrm.support.trace.PageLoadPlugin
    public boolean checkView(WeakReference<Activity> weakReference) {
        TRecyclerView tRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d339d4e", new Object[]{this, weakReference})).booleanValue();
        }
        Activity activity = weakReference.get();
        if (activity == null || (tRecyclerView = (TRecyclerView) activity.findViewById(R.id.viewCenterSectionList)) == null) {
            return false;
        }
        if (this.firstSize == 0) {
            return true;
        }
        if (tRecyclerView.getRawAdapter() != null && tRecyclerView.getRawAdapter().getItemCount() > 0 && tRecyclerView.getChildCount() > 0) {
            if (!(tRecyclerView.getRawAdapter() instanceof AbsListWidgetInstance.SectionAdapter)) {
                return true;
            }
            AbsListWidgetInstance.SectionAdapter sectionAdapter = (AbsListWidgetInstance.SectionAdapter) tRecyclerView.getRawAdapter();
            for (int i = 0; i < tRecyclerView.getItemCount(); i++) {
                ViewObject findViewObject = sectionAdapter.findViewObject(i);
                if (findViewObject != null && findViewObject.info != null && findViewObject.info.renderTemplate != null && TextUtils.equals(findViewObject.info.renderTemplate.name, "widget.message.common.itemwrapper")) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.taobao.message.lab.comfrm.support.trace.PageLoadPlugin
    public Map<String, String> getCustomDimension() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a302f7b", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("activityName", this.mActivityName);
        hashMap.put("firstSize", String.valueOf(this.firstSize));
        hashMap.put("lastSize", String.valueOf(this.lastSize));
        hashMap.put("globalFirst", sGlobalFirstCreateContainer ? "1" : "0");
        hashMap.put("globalFirstClickTime", String.valueOf(sGlobalFirstClickTime));
        hashMap.put("initStartTime", String.valueOf(this.mInitStartTime));
        hashMap.put("initEndTime", String.valueOf(this.mInitEndTime));
        hashMap.put("onHostCreateTime", String.valueOf(this.mOnHostCreateTime));
        hashMap.put("onHostCreateViewTime", String.valueOf(this.mOnHostCreateViewTime));
        try {
            if (this.args != null) {
                if (this.args.containsKey("mptl_onCreate")) {
                    hashMap.put("mptl_onCreate", String.valueOf(this.args.get("mptl_onCreate")));
                }
                if (this.args.containsKey("mptl_onAfterLoad")) {
                    hashMap.put("mptl_onAfterLoad", String.valueOf(this.args.get("mptl_onAfterLoad")));
                }
                if (this.args.containsKey("mptl_onCreateView")) {
                    hashMap.put("mptl_onCreateView", String.valueOf(this.args.get("mptl_onCreateView")));
                }
                if (this.args.containsKey("mptl_onAfterResInject")) {
                    hashMap.put("mptl_onAfterResInject", String.valueOf(this.args.get("mptl_onAfterResInject")));
                }
                if (this.args.containsKey("mptl_onShowLoading")) {
                    hashMap.put("mptl_onShowLoading", String.valueOf(this.args.get("mptl_onShowLoading")));
                }
                if (this.args.containsKey("CLICK_TIME")) {
                    hashMap.put("CLICK_TIME", String.valueOf(this.args.get("CLICK_TIME")));
                }
                if (this.args.containsKey("CONSTRUCT_PAGE_TIME")) {
                    hashMap.put("CONSTRUCT_PAGE_TIME", String.valueOf(this.args.get("CONSTRUCT_PAGE_TIME")));
                }
            }
        } catch (Throwable th) {
            TLog.loge(TAG, th.getMessage());
        }
        return hashMap;
    }

    @Override // com.taobao.message.lab.comfrm.support.trace.PageLoadPlugin, com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerStartStart(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ee7cc7", new Object[]{this, str, str2, str3});
            return;
        }
        super.onContainerStartStart(str, str2, str3);
        this.bizConfigCode = str2;
        String str4 = this.apmPageSession;
        ApmTraceUtil.onSubTaskBegin(str4, "container-" + str2);
        g a2 = s.f18233a.a(this.apmPageSession);
        if (a2 == null) {
            return;
        }
        a2.a("containerKey", str2);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerStartEnd(ConfigInfo configInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f9b7d5", new Object[]{this, configInfo});
            return;
        }
        super.onContainerStartEnd(configInfo);
        String str = this.apmPageSession;
        ApmTraceUtil.onSubTaskSuccess(str, "container-" + this.bizConfigCode, (Map<String, Object>) null);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onTransformerStart(Action action, TransformerItem transformerItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae452f4d", new Object[]{this, action, transformerItem, str});
            return;
        }
        super.onTransformerStart(action, transformerItem, str);
        if (!isRecorder()) {
            return;
        }
        String str2 = this.apmPageSession;
        ApmTraceUtil.onSubTaskBegin(str2, "transformer-" + transformerItem.name);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onTransformerEnd(Action action, TransformerItem transformerItem, String str, Dependecy dependecy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68509707", new Object[]{this, action, transformerItem, str, dependecy});
            return;
        }
        super.onTransformerEnd(action, transformerItem, str, dependecy);
        if (!isRecorder()) {
            return;
        }
        String str2 = this.apmPageSession;
        ApmTraceUtil.onSubTaskSuccess(str2, "transformer-" + transformerItem.name, (Map<String, Object>) null);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onJSTransformerStart(Action action, TransformerItem transformerItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d1a4c", new Object[]{this, action, transformerItem});
            return;
        }
        super.onJSTransformerStart(action, transformerItem);
        if (!isRecorder()) {
            return;
        }
        String str = this.apmPageSession;
        ApmTraceUtil.onSubTaskBegin(str, "jstransformer-" + transformerItem.name);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onJSTransformerEnd(Action action, TransformerItem transformerItem, Dependecy dependecy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e335a286", new Object[]{this, action, transformerItem, dependecy});
            return;
        }
        super.onJSTransformerEnd(action, transformerItem, dependecy);
        if (!isRecorder()) {
            return;
        }
        String str = this.apmPageSession;
        ApmTraceUtil.onSubTaskSuccess(str, "jstransformer-" + transformerItem.name, (Map<String, Object>) null);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderBefore(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425782a4", new Object[]{this, viewObject});
            return;
        }
        super.onRenderBefore(viewObject);
        if (!isRecorder()) {
            return;
        }
        if (!this.isAddSnapshotFlag) {
            g a2 = s.f18233a.a(this.apmPageSession);
            if (viewObject != null && a2 != null) {
                a2.a("snapshot", Boolean.valueOf(viewObject.isSnapshot));
                this.isAddSnapshotFlag = true;
            }
        }
        ApmTraceUtil.onSubTaskBegin(this.apmPageSession, viewObject.info.renderTemplate.name);
    }

    @Override // com.taobao.message.lab.comfrm.support.trace.PageLoadPlugin, com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderAfter(ViewObject viewObject, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec26feb0", new Object[]{this, viewObject, viewGroup});
            return;
        }
        super.onRenderAfter(viewObject, viewGroup);
        if (!isRecorder()) {
            return;
        }
        ApmTraceUtil.onSubTaskSuccess(this.apmPageSession, viewObject.info.renderTemplate.name, (Map<String, Object>) null);
        this.lastRenderTime = System.currentTimeMillis();
    }

    private boolean isRecorder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5ef29093", new Object[]{this})).booleanValue() : System.currentTimeMillis() - this.lastRenderTime <= orq.FRAME_CHECK_TIMEOUT;
    }
}

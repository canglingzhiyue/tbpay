package com.taobao.android.detail.sdk.vmodel.main;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ActionModel;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.vmodel.widget.WidgetViewModel;
import com.taobao.android.trade.event.Event;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.jjv;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public abstract class MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<WidgetViewModel> children;
    public ComponentModel component;
    public List<Event> events;
    public String mLocatorId;
    public NodeBundle mNodeBundle;
    public boolean needOpenGradient;
    public String themeGroup;

    static {
        kge.a(511766897);
    }

    public abstract int getViewModelType();

    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public MainViewModel(ComponentModel componentModel) {
        this.events = new ArrayList();
        this.component = componentModel;
        this.children = new ArrayList();
        if (componentModel != null) {
            this.mLocatorId = componentModel.locatorId;
        }
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.MainViewModel");
    }

    public MainViewModel(ComponentModel componentModel, NodeBundle nodeBundle) {
        this(componentModel);
        if (componentModel == null || nodeBundle == null) {
            return;
        }
        this.mNodeBundle = nodeBundle;
        this.themeGroup = nodeBundle.itemNode.themeType;
        this.needOpenGradient = nodeBundle.featureNode.needOpenGradient;
        buildChildren();
        parseMapping();
        initEvents();
        initStyle();
    }

    public void initStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c821ce88", new Object[]{this});
            return;
        }
        ComponentModel componentModel = this.component;
        if (componentModel == null || TextUtils.isEmpty(componentModel.style)) {
            return;
        }
        this.component.style = jjv.a((Object) this.mNodeBundle.root, this.component.style).toString();
    }

    public void initEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72395e50", new Object[]{this});
            return;
        }
        ComponentModel componentModel = this.component;
        if (componentModel == null || componentModel.actionModelList == null || this.component.actionModelList.isEmpty()) {
            return;
        }
        for (ActionModel actionModel : this.component.actionModelList) {
            JSONObject jSONObject = actionModel.params;
            if (jSONObject != null) {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    entry.setValue(com.taobao.android.detail.sdk.utils.h.a(this.mNodeBundle.root, entry.getValue()));
                }
            }
            this.events.add(com.taobao.android.detail.sdk.factory.manager.a.a().a(actionModel, this.mNodeBundle));
        }
    }

    public void parseMapping() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba075a2", new Object[]{this});
            return;
        }
        ComponentModel componentModel = this.component;
        if (componentModel == null || componentModel.mapping == null || this.component.mapping.isEmpty()) {
            return;
        }
        for (Map.Entry<String, Object> entry : this.component.mapping.entrySet()) {
            entry.setValue(com.taobao.android.detail.sdk.utils.h.a(this.mNodeBundle.root, entry.getValue()));
        }
    }

    public void buildChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ccdb094", new Object[]{this});
            return;
        }
        ComponentModel componentModel = this.component;
        if (componentModel == null || componentModel.children == null) {
            return;
        }
        for (ComponentModel componentModel2 : this.component.children) {
            WidgetViewModel widgetViewModel = null;
            try {
                widgetViewModel = com.taobao.android.detail.sdk.factory.manager.b.a().b(componentModel2, this.mNodeBundle);
            } catch (Exception unused) {
            }
            if (widgetViewModel != null) {
                this.children.add(widgetViewModel);
            }
        }
    }
}

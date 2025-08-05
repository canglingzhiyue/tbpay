package com.taobao.android.detail.industry.ablility.trwidget;

import android.view.View;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.c;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.scene.trwidget.TTDetailTriverWidgetComponent;
import com.taobao.android.detail.industry.tool.a;
import com.taobao.android.detail.industry.tool.b;
import com.taobao.taobao.R;
import tb.ekb;
import tb.eke;
import tb.kge;

/* loaded from: classes4.dex */
public class DITriverWidgetBridgeExtend implements BridgeExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1651883928);
        kge.a(1806634212);
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.security.Guard
    public Permission permit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Permission) ipChange.ipc$dispatch("edbd77f9", new Object[]{this});
        }
        return null;
    }

    private TTDetailTriverWidgetComponent a(@BindingNode(App.class) App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailTriverWidgetComponent) ipChange.ipc$dispatch("980f6241", new Object[]{this, app});
        }
        Object tag = ((TRWidgetInstance) app.getData(TRWidgetInstance.class)).getRootView().getTag(R.id.industry_triver_widget_tt_detail_component_instance);
        if (!(tag instanceof TTDetailTriverWidgetComponent)) {
            return null;
        }
        return (TTDetailTriverWidgetComponent) tag;
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    @AutoCallback
    public BridgeResponse expendDetailGallery(@BindingNode(App.class) App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("ad58e", new Object[]{this, app});
        }
        if (app != null && app.getData(TRWidgetInstance.class) != null) {
            TRWidgetInstance tRWidgetInstance = (TRWidgetInstance) app.getData(TRWidgetInstance.class);
            if (!b.c()) {
                a.b("TriverWidgetBridge", "expendDetailGallery orange false");
                return BridgeResponse.FORBIDDEN_ERROR;
            } else if (tRWidgetInstance == null || tRWidgetInstance.getRootView() == null) {
                a.b("TriverWidgetBridge", "expendDetailGallery instance null");
                return BridgeResponse.FORBIDDEN_ERROR;
            } else {
                View rootView = tRWidgetInstance.getRootView();
                Object tag = rootView.getTag(R.id.detail_industry_aura_user_context);
                Object tag2 = rootView.getTag(R.id.detail_industry_aura_component);
                if (tag == null || tag2 == null) {
                    TTDetailTriverWidgetComponent a2 = a(app);
                    if (a2 != null) {
                        a2.expandComponent();
                        return BridgeResponse.SUCCESS;
                    }
                    a.b("TriverWidgetBridge", "expendDetailGallery userContext or auraRenderComponent null");
                    return BridgeResponse.FORBIDDEN_ERROR;
                }
                d dVar = new d();
                dVar.a((AURARenderComponent) tag2);
                c.a(((q) tag).b(), eke.EVENT_TYPE, dVar);
                a.a("TriverWidgetBridge", "expendDetailGallery send auraEvent");
                return BridgeResponse.SUCCESS;
            }
        }
        return BridgeResponse.FORBIDDEN_ERROR;
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    @AutoCallback
    public BridgeResponse shrinkDetailGallery(@BindingNode(App.class) App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("9421fdc3", new Object[]{this, app});
        }
        if (app != null && app.getData(TRWidgetInstance.class) != null) {
            TRWidgetInstance tRWidgetInstance = (TRWidgetInstance) app.getData(TRWidgetInstance.class);
            if (tRWidgetInstance == null || tRWidgetInstance.getRootView() == null) {
                a.b("TriverWidgetBridge", "shrinkDetailGallery instance null");
                return BridgeResponse.FORBIDDEN_ERROR;
            }
            View rootView = tRWidgetInstance.getRootView();
            Object tag = rootView.getTag(R.id.detail_industry_aura_user_context);
            Object tag2 = rootView.getTag(R.id.detail_industry_aura_component);
            if (tag == null || tag2 == null) {
                TTDetailTriverWidgetComponent a2 = a(app);
                if (a2 != null) {
                    a2.shrinkComponent();
                    return BridgeResponse.SUCCESS;
                }
                a.b("TriverWidgetBridge", "shrinkDetailGallery userContext or auraRenderComponent null");
                return BridgeResponse.FORBIDDEN_ERROR;
            }
            d dVar = new d();
            dVar.a((AURARenderComponent) tag2);
            c.a(((q) tag).b(), ekb.EVENT_TYPE, dVar);
            a.a("TriverWidgetBridge", "shrinkDetailGallery send auraEvent");
            return BridgeResponse.SUCCESS;
        }
        return BridgeResponse.FORBIDDEN_ERROR;
    }
}

package com.taobao.android.detail.sdk.vmodel.main;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.network.combo.QueryComboData;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.node.WeAppNode;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.request.MtopRequestListener;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SDKConfig;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class c extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K_API_NAME = "API_NAME";
    public static final String K_API_VERSION = "VERSION";
    public static final String K_JUMPURL = "jumpUrl";

    /* renamed from: a  reason: collision with root package name */
    public String f10422a;
    public String b;
    public String c;
    public QueryComboData d;
    public WeAppNode.WeAppItem e;
    public MtopRequestListener<QueryComboData> f;
    public WeakReference<MtopRequestListener<QueryComboData>> g;
    private final String h;
    private String i;
    private String j;

    static {
        kge.a(359246512);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_COMBO;
    }

    public c(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.ComboViewModel");
        JSONObject jSONObject = componentModel.mapping;
        if (jSONObject != null && !StringUtils.isEmpty(jSONObject.getString("comboKey"))) {
            this.e = nodeBundle.weappNode.weappList.get(jSONObject.getString("comboKey"));
            try {
                this.i = (String) this.e.mtopModel.get(K_API_NAME);
                this.j = (String) this.e.mtopModel.get(K_API_VERSION);
                this.c = (String) this.e.params.get("jumpUrl");
            } catch (Exception unused) {
            }
        }
        this.h = SDKConfig.getInstance().getGlobalTtid();
        this.f10422a = nodeBundle.itemNode.itemId;
        this.b = nodeBundle.sellerNode.userId;
        this.f = new MtopRequestListener<QueryComboData>() { // from class: com.taobao.android.detail.sdk.vmodel.main.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.sdk.request.e
            public /* synthetic */ void b(MtopResponse mtopResponse) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f056ab85", new Object[]{this, mtopResponse});
                } else {
                    a(mtopResponse);
                }
            }

            @Override // com.taobao.android.detail.sdk.request.e
            public void a(QueryComboData queryComboData) {
                MtopRequestListener<QueryComboData> mtopRequestListener;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ba7c2b3f", new Object[]{this, queryComboData});
                } else if (c.this.d != null) {
                } else {
                    c cVar = c.this;
                    cVar.d = queryComboData;
                    if (cVar.g == null || (mtopRequestListener = c.this.g.get()) == null) {
                        return;
                    }
                    mtopRequestListener.a(queryComboData);
                }
            }

            public void a(MtopResponse mtopResponse) {
                MtopRequestListener<QueryComboData> mtopRequestListener;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                } else if (c.this.g == null || (mtopRequestListener = c.this.g.get()) == null) {
                } else {
                    mtopRequestListener.b(mtopResponse);
                }
            }
        };
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : this.e != null || !StringUtils.isEmpty(this.i);
    }
}

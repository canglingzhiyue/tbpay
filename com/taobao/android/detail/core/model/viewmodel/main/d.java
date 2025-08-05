package com.taobao.android.detail.core.model.viewmodel.main;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.p;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class d extends com.taobao.android.detail.datasdk.model.viewmodel.main.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f9767a;
    public int b;

    static {
        kge.a(-415249673);
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.main.H5ViewModel";
    }

    public d(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(componentModel, bVar);
        JSONObject jSONObject = componentModel.mapping;
        if (jSONObject == null || jSONObject.isEmpty()) {
            return;
        }
        this.f9767a = jSONObject.getString("url");
        this.b = jSONObject.getIntValue("height");
        JSONObject jSONObject2 = jSONObject.getJSONObject(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            return;
        }
        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                this.f9767a = p.a(this.f9767a, key, value.toString());
            }
        }
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.f9767a);
    }

    public d(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(iDMComponent, bVar);
        JSONObject fields = iDMComponent.getFields();
        if (fields == null || fields.isEmpty()) {
            return;
        }
        this.f9767a = fields.getString("url");
        this.b = fields.getIntValue("height");
        JSONObject jSONObject = fields.getJSONObject(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        if (jSONObject == null || jSONObject.isEmpty()) {
            return;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                this.f9767a = p.a(this.f9767a, key, value.toString());
            }
        }
    }
}

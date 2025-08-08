package com.taobao.android.detail.sdk.vmodel.desc;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import java.io.Serializable;
import java.util.List;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class QualityViewModel extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<String> f10357a;
    public List<QualityContentModel> b;
    public String c;
    public String d;
    public String e;

    /* loaded from: classes4.dex */
    public static class QualityContentModel implements Serializable {
        public String desc;
        public List<String> images;

        static {
            kge.a(-1743992174);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(2112806407);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public g c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("a34cd836", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_QUALITY;
    }

    public QualityViewModel(ComponentModel componentModel) {
        super(componentModel);
        tpc.a("com.taobao.android.detail.sdk.vmodel.desc.QualityViewModel");
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject.containsKey("componentTitle")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("componentTitle");
            if (jSONObject2.containsKey("text")) {
                this.c = jSONObject2.getString("text");
            }
        }
        if (StringUtils.isEmpty(this.c)) {
            this.c = "品质组件";
        }
        this.d = jSONObject.getString("titleColor");
        this.e = jSONObject.getString("iconType");
        String string = jSONObject.getString("imageTags");
        if (!StringUtils.isEmpty(string)) {
            this.f10357a = JSONObject.parseArray(string, String.class);
        }
        String string2 = jSONObject.getString("content");
        if (StringUtils.isEmpty(string2)) {
            return;
        }
        this.b = JSONObject.parseArray(string2, QualityContentModel.class);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        List<QualityContentModel> list = this.b;
        return list == null || list.isEmpty();
    }
}

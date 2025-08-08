package com.taobao.android.detail.core.model.viewmodel.desc;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import java.io.Serializable;
import java.util.List;
import tb.epf;
import tb.eph;
import tb.kge;

/* loaded from: classes4.dex */
public class QualityViewModel extends epf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<String> f9742a;
    public List<QualityContentModel> b;
    public String c;
    public String d;
    public String e;

    /* loaded from: classes4.dex */
    public static class QualityContentModel implements Serializable {
        public String desc;
        public List<String> images;

        static {
            kge.a(868373304);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-909724243);
    }

    @Override // tb.epf
    public eph b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eph) ipChange.ipc$dispatch("16b5e500", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.desc.QualityViewModel";
    }

    public QualityViewModel(ComponentModel componentModel) {
        super(componentModel);
    }

    @Override // tb.epf
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
            this.f9742a = JSONObject.parseArray(string, String.class);
        }
        String string2 = jSONObject.getString("content");
        if (StringUtils.isEmpty(string2)) {
            return;
        }
        this.b = JSONObject.parseArray(string2, QualityContentModel.class);
    }

    @Override // tb.epf
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        List<QualityContentModel> list = this.b;
        return list == null || list.isEmpty();
    }
}

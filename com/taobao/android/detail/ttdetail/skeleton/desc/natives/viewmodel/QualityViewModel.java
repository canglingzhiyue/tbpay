package com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class QualityViewModel extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<String> f10866a;
    public List<QualityContentModel> b;
    public String c;
    public String d;
    public String e;

    /* loaded from: classes5.dex */
    public static class QualityContentModel implements Serializable {
        public String desc;
        public List<String> images;

        static {
            kge.a(1451947709);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(938380722);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public g g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("4487d8dd", new Object[]{this});
        }
        return null;
    }

    public QualityViewModel(ComponentModel componentModel) {
        super(componentModel);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
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
            this.f10866a = JSONObject.parseArray(string, String.class);
        }
        String string2 = jSONObject.getString("content");
        if (StringUtils.isEmpty(string2)) {
            return;
        }
        this.b = JSONObject.parseArray(string2, QualityContentModel.class);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        List<QualityContentModel> list = this.b;
        return list == null || list.isEmpty();
    }
}

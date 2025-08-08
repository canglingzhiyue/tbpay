package com.taobao.android.detail.sdk.vmodel.desc;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import java.util.Map;
import tb.euz;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class af extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10363a;
    public Map<String, String> b;
    public Map<String, String> c;
    public int d;

    static {
        kge.a(310183681);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_WEEX;
    }

    public af(ComponentModel componentModel) {
        super(componentModel);
        tpc.a("com.taobao.android.detail.sdk.vmodel.desc.WeexViewModel");
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject.containsKey("url")) {
            this.f10363a = jSONObject.getString("url");
        }
        if (jSONObject.containsKey("data")) {
            this.b = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getJSONObject("data"), new com.taobao.android.detail.sdk.utils.g<String>() { // from class: com.taobao.android.detail.sdk.vmodel.desc.af.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                @Override // com.taobao.android.detail.sdk.utils.g
                public /* synthetic */ String b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                }

                public String a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : String.valueOf(obj);
                }
            });
        }
        if (!jSONObject.containsKey("config")) {
            return;
        }
        this.c = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getJSONObject("config"), new com.taobao.android.detail.sdk.utils.g<String>() { // from class: com.taobao.android.detail.sdk.vmodel.desc.af.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ String b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public String a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : String.valueOf(obj);
            }
        });
        try {
            this.d = euz.a(Integer.valueOf(this.c.get("height")).intValue());
        } catch (Throwable unused) {
            this.d = euz.a(100);
        }
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : StringUtils.isEmpty(this.f10363a);
    }
}

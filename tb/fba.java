package tb;

import android.graphics.Color;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;

/* loaded from: classes5.dex */
public class fba extends epf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27731a;
    public String b;
    public String c;
    public String d;
    public String e;
    public JSONObject f;
    public int g;
    public int h;

    static {
        kge.a(1204627592);
    }

    public fba(ComponentModel componentModel) {
        super(componentModel);
        this.g = Color.parseColor("#333333".trim());
        this.h = Color.parseColor("#ffffff");
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewmodel.CharityrViewModel");
    }

    @Override // tb.epf
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        if (this.component != null && this.component.mapping != null) {
            JSONObject jSONObject2 = this.component.mapping;
            try {
                this.c = jSONObject2.getString("icon");
                this.f27731a = jSONObject2.getString("title");
                this.b = jSONObject2.getString("text");
                this.d = jSONObject2.getString("jumpUrl");
                this.e = jSONObject2.getString("spm");
                this.f = jSONObject2.getJSONObject("utParams");
            } catch (Exception e) {
                i.a("CharityrViewModel", "fail to parse data", e);
            }
        }
        if (this.component == null || this.component.otherMapping == null) {
            return;
        }
        JSONObject jSONObject3 = this.component.otherMapping;
        try {
            String string = jSONObject3.getString("titleColor");
            String string2 = jSONObject3.getString("backgroundColor");
            this.g = Color.parseColor(string);
            this.h = Color.parseColor(string2);
        } catch (Exception e2) {
            i.a("CharityrViewModel", "fail to parse titleColor or backgroundColor", e2);
        }
    }

    @Override // tb.epf
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : TextUtils.isEmpty(this.f27731a) && TextUtils.isEmpty(this.b);
    }
}

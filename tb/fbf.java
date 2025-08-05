package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;

/* loaded from: classes5.dex */
public class fbf extends epf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27741a;
    public String b;
    public float c;
    public float d;
    public String e;
    public String f;
    public String g;

    static {
        kge.a(-913894492);
    }

    public fbf(ComponentModel componentModel) {
        super(componentModel);
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewmodel.NBVideoModel");
    }

    @Override // tb.epf
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : TextUtils.isEmpty(this.b) || !ecu.d;
    }

    @Override // tb.epf
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.f27741a = jSONObject.getString("thumbnail");
        this.b = jSONObject.getString("videoUrl");
        this.e = jSONObject.getString("videoId");
        this.f = jSONObject.getString("title");
        this.g = jSONObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE);
        JSONObject jSONObject2 = jSONObject.getJSONObject("size");
        if (jSONObject2 != null) {
            try {
                this.c = jSONObject2.getFloatValue("height");
                this.d = jSONObject2.getFloatValue("width");
            } catch (Exception unused) {
            }
        }
        if (this.c != 0.0f && this.d != 0.0f) {
            return;
        }
        this.c = 9.0f;
        this.d = 16.0f;
    }
}

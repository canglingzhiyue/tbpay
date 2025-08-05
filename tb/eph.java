package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;

/* loaded from: classes4.dex */
public class eph extends epf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27506a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public boolean i;

    static {
        kge.a(1386725436);
    }

    public eph(ComponentModel componentModel) {
        super(componentModel);
        emu.a("com.taobao.android.detail.datasdk.model.viewmodel.desc.DivisionTitleViewModel");
    }

    @Override // tb.epf
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.c = jSONObject.getString("text");
        this.f27506a = jSONObject.getString("titleColor");
        this.b = jSONObject.getString("lineColor");
        this.f = jSONObject.getString("linkText");
        this.g = jSONObject.getString("linkUrl");
        this.d = jSONObject.getString("backgroundColor");
        this.e = jSONObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_LOGO);
        this.h = jSONObject.getString("paddingBottom");
        this.i = jSONObject.getBooleanValue("isHLine");
    }

    @Override // tb.epf
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : TextUtils.isEmpty(this.c);
    }

    @Override // tb.epf
    public String E_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a249be7f", new Object[]{this}) : this.u;
    }
}

package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes5.dex */
public class fbj extends epf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27747a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public String g;
    public String h;

    static {
        kge.a(854850348);
    }

    public fbj(ComponentModel componentModel) {
        super(componentModel);
        i.d("MyLog", "DescViewModelFactory--创建Vessel");
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewmodel.VesselViewModel");
    }

    public fbj(IDMComponent iDMComponent, b bVar) {
        super(iDMComponent, bVar);
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewmodel.VesselViewModel");
    }

    @Override // tb.epf
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.b = jSONObject.getString("bizType");
        this.f = jSONObject.getIntValue("height");
        this.e = jSONObject.getIntValue("loadMode");
        if (this.f < 0) {
            this.f = 0;
        }
        if (this.e < 0) {
            this.e = 0;
        }
        this.f27747a = jSONObject.getString("url");
        this.c = jSONObject.getString("md5");
        this.d = jSONObject.getString("spm");
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        this.g = jSONObject2.getString("itemId");
        this.h = jSONObject2.getString("sellerId");
    }

    @Override // tb.epf
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : TextUtils.isEmpty(this.f27747a);
    }

    @Override // tb.epf
    public String E_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a249be7f", new Object[]{this}) : this.u;
    }
}

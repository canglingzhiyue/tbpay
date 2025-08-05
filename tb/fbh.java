package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;

/* loaded from: classes5.dex */
public class fbh extends epf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27745a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public String h;
    public String i;

    static {
        kge.a(1448932005);
    }

    @Override // tb.epf
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public fbh(ComponentModel componentModel) {
        super(componentModel);
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewmodel.StoreViewModel");
    }

    @Override // tb.epf
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.f27745a = jSONObject.getString("desc");
        this.b = jSONObject.getString("imgUrl");
        this.c = jSONObject.getString("name");
        this.d = jSONObject.getString("storeId");
        this.e = jSONObject.getString("jumpUrl");
        this.g = jSONObject.getInteger("number").intValue();
        this.f = jSONObject.getString("maskImg");
        this.h = jSONObject.getString("btnIcon");
        this.i = jSONObject.getString("btnText");
    }
}

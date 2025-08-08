package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.vmodel.desc.e;

/* loaded from: classes4.dex */
public class exs extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27633a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;

    static {
        kge.a(687713596);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_PICTURE_3D;
    }

    public exs(ComponentModel componentModel) {
        super(componentModel);
        this.f = 0;
        tpc.a("com.taobao.android.detail.sdk.vmodel.desc.content.PicFor3DViewModel");
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public void a(JSONObject jSONObject) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.c = jSONObject.getString("icon");
        this.b = jSONObject.getString("jumpUrl");
        this.f27633a = jSONObject.getString(eby.KEY_PIC_URL);
        this.d = jSONObject.getString("tips");
        try {
            this.f = Integer.parseInt(c.a("threeDType", "0"));
        } catch (Throwable unused) {
            this.f = 0;
        }
        String string = jSONObject.getString("componentTitle");
        if (StringUtils.isEmpty(string) || (parseObject = JSON.parseObject(string)) == null) {
            return;
        }
        this.e = parseObject.getString("text");
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : StringUtils.isEmpty(this.f27633a);
    }
}

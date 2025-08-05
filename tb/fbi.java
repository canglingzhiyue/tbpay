package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.model.StWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;

/* loaded from: classes5.dex */
public class fbi extends epf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27746a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    static {
        kge.a(-1411187733);
    }

    public fbi(ComponentModel componentModel) {
        super(componentModel);
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewmodel.UserTalkViewModel");
    }

    @Override // tb.epf
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.f27746a = jSONObject.getString("thumbnails");
        this.b = jSONObject.getString("title");
        this.c = jSONObject.getString("author");
        this.d = jSONObject.getString("authorAvatar");
        this.e = jSONObject.getString("tagUrl");
        this.f = jSONObject.getString(StWindow.UPDATE_TIME);
        this.g = jSONObject.getString("likeCount");
    }

    @Override // tb.epf
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : TextUtils.isEmpty(this.f27746a) || TextUtils.isEmpty(this.b);
    }
}

package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;

/* loaded from: classes4.dex */
public class epg extends epf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_BLANK = 100;
    public static final int TYPE_NO_LINE_TEXT = 102;
    public static final int TYPE_TEXT = 101;

    /* renamed from: a  reason: collision with root package name */
    public String f27505a;
    public int b;
    public int c;
    public String d;

    static {
        kge.a(811164878);
    }

    public static /* synthetic */ Object ipc$super(epg epgVar, String str, Object... objArr) {
        if (str.hashCode() == -1572225409) {
            return super.E_();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.epf
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public epg() {
        super(null);
        this.f27505a = "#eeeeee";
        this.b = 9;
        this.c = 100;
        emu.a("com.taobao.android.detail.datasdk.model.viewmodel.desc.DividerViewModel");
    }

    public epg(ComponentModel componentModel) {
        super(componentModel);
        emu.a("com.taobao.android.detail.datasdk.model.viewmodel.desc.DividerViewModel");
    }

    @Override // tb.epf
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject.containsKey("bgcolor")) {
            this.f27505a = jSONObject.getString("bgcolor");
        } else {
            this.f27505a = "#eeeeee";
        }
        if (jSONObject.containsKey("height")) {
            this.b = jSONObject.getIntValue("height");
        } else {
            this.b = 0;
        }
        if (jSONObject.containsKey("text")) {
            this.d = jSONObject.getString("text");
        }
        String string = jSONObject.getString("type");
        if (noa.VALUE_CLICK_AREA_BLANK.equals(string)) {
            this.c = 100;
        } else if ("text".equals(string)) {
            this.c = 101;
        } else if ("noLineText".equals(string)) {
            this.c = 102;
        } else {
            this.c = 100;
        }
    }

    @Override // tb.epf
    public String E_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a249be7f", new Object[]{this});
        }
        if (this.c == 100) {
            return this.u;
        }
        return super.E_();
    }
}

package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class ezc extends ezg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FRAME_TYPE = "_tt_detail_header_frame_";
    private String g;

    static {
        kge.a(1385664268);
    }

    public ezc(JSONObject jSONObject, ezo ezoVar) {
        super(jSONObject, ezoVar);
        b(jSONObject, ezoVar);
    }

    private void b(JSONObject jSONObject, ezo ezoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6da0afd", new Object[]{this, jSONObject, ezoVar});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("content");
        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
            a(new eyy(jSONObject2, ezoVar));
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("floatContent");
        if (jSONObject3 != null && !jSONObject3.isEmpty()) {
            a(new eyy(jSONObject3, ezoVar));
        }
        this.g = n();
        this.c = "native$_tt_detail_header_frame_";
    }

    public <T extends eyy> T h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("44dfe912", new Object[]{this});
        }
        if (this.k != null && this.k.size() > 0) {
            return (T) a(0);
        }
        return null;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.g;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.f27665a.getString("tagName");
    }

    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : this.f27665a.getString("dimension");
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : Boolean.parseBoolean(this.f27665a.getString("enableLightOff"));
    }
}

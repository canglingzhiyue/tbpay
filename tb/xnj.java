package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int c;

    /* renamed from: a  reason: collision with root package name */
    private final String f34401a = "edgeClickBackConfig";
    private boolean b = true;
    private int d = -1;
    private int e = -1;
    private String f = null;

    static {
        kge.a(311362509);
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.f = jSONObject.getString("clickRefreshTrigger");
        JSONObject jSONObject2 = jSONObject.getJSONObject("edgeClickBackConfig");
        if (jSONObject2 == null) {
            return;
        }
        this.b = jSONObject2.getBooleanValue("isOpen");
        this.c = jSONObject2.getIntValue("reservedCnt");
        this.d = jSONObject2.getIntValue("execThreshold");
        this.e = jSONObject2.getIntValue("posThreshold");
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.c;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.d;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.e;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : TextUtils.equals("clickAiRefresh", this.f);
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : TextUtils.equals(Constant.KEY_PAGEBACK, this.f);
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.f;
    }
}

package tb;

import android.support.v4.util.ArrayMap;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.mainpic.g;
import com.taobao.android.detail.mainpic.h;
import com.taobao.android.detail.mainpic.holder.n;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes4.dex */
public class etu extends etr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private g f27572a;
    private int b;
    private int c;

    public etu(g gVar, View view) {
        this.b = -1;
        this.c = -1;
        this.f27572a = gVar;
        if (view != null) {
            this.b = view.getWidth();
            this.c = view.getHeight();
        }
    }

    @Override // tb.etr
    public String b(String str, IDMComponent iDMComponent, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4403e4", new Object[]{this, str, iDMComponent, nVar});
        }
        JSONObject jSONObject = new JSONObject();
        int i = -1;
        ArrayMap<String, Object> extMap = iDMComponent.getExtMap();
        if (extMap != null) {
            Object obj = extMap.get("ultronDMComponentIndex");
            if (obj instanceof Integer) {
                i = ((Integer) obj).intValue();
            }
        }
        jSONObject.put("mh_frameIndex", (Object) Integer.valueOf(i));
        h k = this.f27572a.k();
        if (k != null) {
            jSONObject.put("mh_token", (Object) k.i());
        }
        jSONObject.put("mh_itemId", (Object) this.f27572a.y());
        if (!str.contains("MAINPIC_WIDTH")) {
            jSONObject.put("MAINPIC_WIDTH", (Object) Integer.valueOf(this.b));
        }
        if (!str.contains("MAINPIC_HEIGHT")) {
            jSONObject.put("MAINPIC_HEIGHT", (Object) Integer.valueOf(this.c));
        }
        return nVar.a(str, jSONObject);
    }
}

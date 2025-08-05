package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.taolive.room.dx.b;
import tb.phj;

/* loaded from: classes8.dex */
public class plq implements phj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-305916265);
        kge.a(270655386);
    }

    @Override // tb.phj
    public void a(Context context, String str, phj.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c549f60b", new Object[]{this, context, str, aVar});
            return;
        }
        DXRootView a2 = b.c().a(context, str);
        if (aVar == null) {
            return;
        }
        aVar.onCreateView(a2);
    }

    @Override // tb.phj
    public void a(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeb8c227", new Object[]{this, dXRootView, jSONObject});
        } else {
            b.c().a(dXRootView, jSONObject);
        }
    }

    @Override // tb.phj
    public DinamicXEngine a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("4d3f629f", new Object[]{this}) : b.c().d();
    }
}

package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.c;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bd;
import java.util.List;

/* loaded from: classes4.dex */
public class eje {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-880427910);
        emu.a("com.taobao.android.detail.core.standard.base.api.aurasupport.AuraUIApi");
    }

    public static DetailCoreActivity a(q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailCoreActivity) ipChange.ipc$dispatch("2b5632dc", new Object[]{qVar});
        }
        Context e = qVar.e();
        if (!(e instanceof DetailCoreActivity)) {
            return null;
        }
        return (DetailCoreActivity) e;
    }

    public static String b(q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f481bce", new Object[]{qVar});
        }
        DetailCoreActivity a2 = a(qVar);
        if (a2 == null) {
            return null;
        }
        return a2.h;
    }

    public static RecyclerView c(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("3468de51", new Object[]{qVar}) : (RecyclerView) qVar.a("mainRecyclerView", RecyclerView.class, null);
    }

    public static List<AURARenderComponent> a(AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("29ace189", new Object[]{aURAGlobalData}) : (List) aURAGlobalData.get("render_view_item_models", List.class);
    }

    public static DinamicXEngine b(AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("8857bd4a", new Object[]{aURAGlobalData});
        }
        bd bdVar = (bd) aURAGlobalData.get("auraRenderDxEngine", bd.class);
        if (bdVar != null) {
            return bdVar.d();
        }
        return null;
    }

    public static void a(q qVar, String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97e8eea1", new Object[]{qVar, str, str2, str3, jSONObject});
            return;
        }
        d dVar = new d();
        dVar.a(str3);
        dVar.b(str2);
        dVar.a(jSONObject);
        c.a(qVar.b(), str, dVar);
    }
}

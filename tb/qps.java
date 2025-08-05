package tb;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.alibaba.android.aura.datamodel.parse.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.arc;

/* loaded from: classes6.dex */
public class qps {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1475841035);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (!(context instanceof Activity)) {
            return false;
        }
        return Boolean.parseBoolean(((Activity) context).getIntent().getStringExtra("needNativeContainer"));
    }

    public static void a(FragmentActivity fragmentActivity, List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d80cac", new Object[]{fragmentActivity, list});
        } else if (list == null) {
            arc.a().b("cacheBuildData,protocolModels is null");
        } else {
            JSONObject a2 = list.remove(0).a();
            ArrayList arrayList = new ArrayList();
            for (a aVar : list) {
                JSONObject a3 = aVar.a();
                if (a3 != null) {
                    arrayList.add(a3);
                }
            }
            arc.a().b("cacheBuildData", arc.a.a().a("LightBuy/common").a("info", "cacheBuildData").b());
            afa.a().a(fragmentActivity);
            afa.a().a(fragmentActivity, a2, arrayList);
        }
    }
}

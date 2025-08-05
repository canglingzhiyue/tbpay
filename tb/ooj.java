package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.homepage.utils.b;
import com.taobao.tao.log.TLog;

/* loaded from: classes8.dex */
public class ooj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f32227a;

    static {
        kge.a(-633173104);
        f32227a = b.c() || b.b();
    }

    public static DXResult<DXRootView> a(DinamicXEngine dinamicXEngine, DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXResult) ipChange.ipc$dispatch("16f4d8b", new Object[]{dinamicXEngine, dXRootView, jSONObject}) : dinamicXEngine.a(dXRootView, jSONObject);
    }

    public static DXResult<DXRootView> a(DinamicXEngine dinamicXEngine, DXRootView dXRootView, JSONObject jSONObject, ba baVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("19c5ceb1", new Object[]{dinamicXEngine, dXRootView, jSONObject, baVar, new Integer(i)});
        }
        int a2 = gbg.a();
        Activity N = dinamicXEngine.N();
        if (N != null && f32227a) {
            if (i <= 0) {
                i = b.a(N);
            }
            a2 = DXWidgetNode.DXMeasureSpec.a(i, 1073741824);
        }
        DXResult<DXRootView> a3 = dinamicXEngine.a(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), jSONObject, -1, new DXRenderOptions.a().a(a2).b(gbg.b()).a(baVar).a());
        try {
            if (a3.b()) {
                ora.a(jSONObject, a3.a());
            }
        } catch (Throwable th) {
            TLog.loge("AdMonitorHelper", "checkLunBoSection error.", th);
        }
        return a3;
    }
}

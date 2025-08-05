package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.model.viewmodel.main.c;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.ag;
import com.taobao.android.dinamic.dinamic.a;
import com.taobao.android.trade.event.f;

/* loaded from: classes4.dex */
public class eas extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TAG = "xCopy";

    static {
        kge.a(-873785553);
    }

    public static /* synthetic */ Object ipc$super(eas easVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamic.dinamic.a, com.taobao.android.dinamic.dinamic.d
    public void a(View view, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c001722", new Object[]{this, view, obj, obj2});
        }
    }

    public eas() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic.eventhandler.DetailDinamicCopyEventHandler");
    }

    @Override // com.taobao.android.dinamic.dinamic.a, com.taobao.android.dinamic.dinamic.d
    public void a(View view, String str, Object obj, Object obj2, Object obj3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e48a48", new Object[]{this, view, str, obj, obj2, obj3});
        } else if (!(obj instanceof JSONObject)) {
        } else {
            try {
                JSONObject jSONObject = (JSONObject) obj2;
                efq efqVar = new efq();
                efqVar.f27283a = view;
                efqVar.b = a(jSONObject);
                efqVar.c = b(jSONObject);
                f.a(fpz.b(view.getContext()), efqVar);
                if (!(obj3 instanceof c)) {
                    return;
                }
                c cVar = (c) obj3;
                if (view == null || cVar.dmComponent == null) {
                    return;
                }
                ecg.d(view.getContext(), ag.EVENT_TYPE, cVar.dmComponent.getKey(), "touch", jSONObject);
            } catch (Throwable unused) {
                i.b("detail_dinamic", "handle dinamic tab event onFailure!");
            }
        }
    }

    private String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject});
        }
        try {
            return jSONObject.getJSONObject("data").getString("itemId");
        } catch (Exception unused) {
            i.a("xCopy", "获取宝贝id失败");
            return "";
        }
    }

    private String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{this, jSONObject});
        }
        try {
            return jSONObject.getJSONObject("data").getString("title");
        } catch (Exception unused) {
            i.a("xCopy", "获取宝贝标题失败");
            return "";
        }
    }
}

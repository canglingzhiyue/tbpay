package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.h;
import com.taobao.tao.homepage.launcher.g;
import com.taobao.tao.recommend3.util.b;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class osa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private transient WeakReference<ory> f32356a;

    static {
        kge.a(-523607841);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (b.a("home_guess_tips_shown", true)) {
                return;
            }
            b.b("home_guess_tips_shown", true);
            TBToast makeText = TBToast.makeText(g.a(), com.alibaba.ability.localization.b.a(R.string.taobao_app_1000_1_16143));
            makeText.setTextSize(15);
            makeText.show();
        } catch (Exception e) {
            ooa.a("Something wrong while trying to show the item delete tip.", e);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        b();
        this.f32356a = new WeakReference<>(new ory(this, z));
    }

    public void a(Context context, View view, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, JSONObject jSONObject) {
        ory oryVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11774de", new Object[]{this, context, view, onClickListener, onClickListener2, jSONObject});
            return;
        }
        WeakReference<ory> weakReference = this.f32356a;
        if (weakReference == null || (oryVar = weakReference.get()) == null) {
            return;
        }
        oryVar.a(context, view, onClickListener, onClickListener2, jSONObject);
        oryVar.a(oryVar, jSONObject, onClickListener);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        WeakReference<ory> weakReference = this.f32356a;
        if (weakReference == null) {
            return;
        }
        ory oryVar = weakReference.get();
        if (oryVar != null) {
            oryVar.a();
        }
        this.f32356a = null;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.getJSONObject(h.TRACK_EXPOSURE_PARAM) == null) {
        } else {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("arg1", (Object) "Page_Home_Show-guessitem_del");
            jSONObject2.put("skipCheck", (Object) true);
            kss.a(jSONObject, jSONObject2);
        }
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.getJSONObject("item") == null || jSONObject.getJSONObject("item").getJSONObject("0") == null || jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam") == null) {
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("item").getJSONObject("0");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("arg1", (Object) "Page_Home_Button-guessitem-del");
            kss.a(jSONObject, jSONObject2, jSONObject3);
        }
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.getJSONObject(h.TRACK_EXPOSURE_PARAM) == null) {
        } else {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("arg1", (Object) "Page_Home_Show-guessitem_delreason");
            jSONObject2.put("skipCheck", (Object) true);
            kss.a(jSONObject, jSONObject2);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else if (jSONObject == null || jSONObject.getJSONObject("item") == null || jSONObject.getJSONObject("item").getJSONObject("0") == null || jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam") == null) {
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("item").getJSONObject("0");
            jSONObject2.getJSONObject("clickParam").getJSONObject("args").put("reasontype", (Object) str);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("arg1", (Object) "Page_Home_Button-guessitem_delreason");
            kss.a(jSONObject, jSONObject2, jSONObject3);
        }
    }
}

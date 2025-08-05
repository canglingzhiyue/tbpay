package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.home.component.utils.h;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class orv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private transient WeakReference<oru> f32338a;

    static {
        kge.a(-561895755);
    }

    public void a(Context context, View view, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, JSONObject jSONObject) {
        oru oruVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11774de", new Object[]{this, context, view, onClickListener, onClickListener2, jSONObject});
            return;
        }
        WeakReference<oru> weakReference = this.f32338a;
        if (weakReference == null || (oruVar = weakReference.get()) == null) {
            return;
        }
        oruVar.a(context, view, onClickListener, onClickListener2, jSONObject);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        WeakReference<oru> weakReference = this.f32338a;
        if (weakReference == null) {
            return;
        }
        oru oruVar = weakReference.get();
        if (oruVar != null) {
            oruVar.a();
        }
        this.f32338a = null;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        a();
        this.f32338a = new WeakReference<>(new oru(this, null, null));
    }

    public void a(DinamicXEngine dinamicXEngine, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fce4f323", new Object[]{this, dinamicXEngine, str});
            return;
        }
        a();
        this.f32338a = new WeakReference<>(new oru(this, dinamicXEngine, str));
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.getJSONObject(h.TRACK_EXPOSURE_PARAM) == null) {
        } else {
            kss.a(jSONObject, (JSONObject) null);
        }
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{this, jSONObject, jSONObject2});
        } else if (jSONObject == null || jSONObject2 == null || jSONObject2.getJSONObject("clickParam") == null) {
        } else {
            kss.a(jSONObject, jSONObject2, (JSONObject) null);
        }
    }
}

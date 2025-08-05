package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.a;
import com.taobao.android.home.component.utils.i;
import com.taobao.android.home.component.utils.k;
import com.taobao.android.tschedule.c;

/* loaded from: classes.dex */
public class gmo extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2114117388);
    }

    public static /* synthetic */ Object ipc$super(gmo gmoVar, String str, Object... objArr) {
        if (str.hashCode() == 1642367560) {
            super.a((View) objArr[0], (String) objArr[1], objArr[2], objArr[3], objArr[4]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamic.dinamic.a, com.taobao.android.dinamic.dinamic.d
    public void a(View view, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c001722", new Object[]{this, view, obj, obj2});
        } else if (obj == null || !(obj instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) obj;
            try {
                c.a(jSONObject.getString("itemBizCode"), jSONObject.getString("targetUrl"));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.taobao.android.dinamic.dinamic.a, com.taobao.android.dinamic.dinamic.d
    public void a(View view, String str, Object obj, Object obj2, Object obj3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e48a48", new Object[]{this, view, str, obj, obj2, obj3});
            return;
        }
        super.a(view, str, obj, obj2, obj3);
        if (!(obj instanceof JSONObject)) {
            return;
        }
        JSONObject jSONObject = (JSONObject) obj;
        i.a(jSONObject);
        gmq.a(jSONObject);
        if (obj2 instanceof JSONObject) {
            k.a((JSONObject) obj2, jSONObject);
        }
        gmp.a(view.getContext(), jSONObject);
    }
}

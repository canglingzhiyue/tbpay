package tb;

import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.common.a;
import com.taobao.android.artry.common.b;
import com.taobao.android.artry.common.c;
import com.taobao.android.artry.constants.ResultCode;
import com.taobao.android.artry.utils.d;
import java.util.Map;

/* loaded from: classes4.dex */
public class dpv<T> implements a<T>, b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String b;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f26899a;
    public dpx c;

    public void a(c<T> cVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c34b91ce", new Object[]{this, cVar, jSONObject});
        }
    }

    public void b(c<T> cVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a5778cf", new Object[]{this, cVar, jSONObject});
        }
    }

    static {
        kge.a(-1541044907);
        kge.a(547807985);
        kge.a(823402558);
        b = dpv.class.getSimpleName();
    }

    public void a(dpx dpxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e59b61ec", new Object[]{this, dpxVar});
        } else {
            this.c = dpxVar;
        }
    }

    public dpx getResultSender() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dpx) ipChange.ipc$dispatch("f08d840b", new Object[]{this}) : this.c;
    }

    public dpv a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dpv) ipChange.ipc$dispatch("2f84af0e", new Object[]{this, str, obj});
        }
        if (this.f26899a == null) {
            this.f26899a = new JSONObject();
        }
        this.f26899a.put(str, obj);
        return this;
    }

    @Override // com.taobao.android.artry.common.a
    public final void a(c<T> cVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d2b5d62", new Object[]{this, cVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (b(cVar)) {
            jSONObject.put("resultCode", (Object) ResultCode.SUCCESS.name());
            b(cVar, jSONObject);
        } else {
            String name = (cVar == null ? ResultCode.FAILURE_NULL_RESULT : cVar.b).name();
            jSONObject.put("resultCode", (Object) name);
            String str = "the result is false, because of [" + name + riy.ARRAY_END_STR;
            a(cVar, jSONObject);
            z = false;
        }
        if ((cVar.c instanceof JSONObject) && !d.a((Map) ((JSONObject) cVar.c))) {
            jSONObject.put("extra", (Object) cVar.c);
        }
        if (!d.a((Map) this.f26899a)) {
            jSONObject.put("extra", (Object) this.f26899a);
        }
        a(z, jSONObject);
    }

    public boolean b(c<T> cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("84494e45", new Object[]{this, cVar})).booleanValue() : cVar != null && cVar.f9050a;
    }

    private void a(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        dpx dpxVar = this.c;
        if (dpxVar == null) {
            return;
        }
        try {
            dpxVar.a(z, jSONObject);
        } catch (Throwable th) {
            Log.e(b, "some exceptions happened...", th);
        }
    }

    @Override // com.taobao.android.artry.common.b
    public void a(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e86c6b5", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        dpx dpxVar = this.c;
        if (!(dpxVar instanceof b)) {
            return;
        }
        ((b) dpxVar).a(i, jSONObject);
    }
}

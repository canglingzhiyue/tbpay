package tb;

import android.content.Context;
import com.alibaba.android.ultron.ext.vlayout.c;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public abstract class blg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1571790835);
    }

    public abstract c a();

    public abstract void a(Context context, c cVar, JSONObject jSONObject);

    public abstract String b();

    public c a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("3c2f9cc9", new Object[]{this, context, jSONObject});
        }
        c a2 = a();
        a(context, a2, jSONObject);
        return a2;
    }
}

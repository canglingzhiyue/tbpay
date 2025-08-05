package tb;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliNavServiceInterface;
import com.taobao.android.nav.Nav;
import com.taobao.android.t;

/* loaded from: classes.dex */
public class jag implements jae {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1064198161);
        kge.a(432287693);
    }

    @Override // tb.jae
    public void a(Context context, String str, JSONObject jSONObject, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c8e1c1a", new Object[]{this, context, str, jSONObject, str2, str3});
            return;
        }
        Bundle a2 = hsu.a(new Bundle(), jSONObject);
        if (Boolean.parseBoolean(str3)) {
            Nav.from(context).withExtras(a2).allowEscape().toUri(str);
            return;
        }
        AliNavServiceInterface a3 = t.a();
        if (a3 == null) {
            return;
        }
        a3.a(context).a(a2).a(str);
    }
}

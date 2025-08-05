package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliNavServiceInterface;
import com.taobao.android.t;

/* loaded from: classes.dex */
public class jah implements jae {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-918882566);
        kge.a(432287693);
    }

    @Override // tb.jae
    public void a(Context context, String str, JSONObject jSONObject, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c8e1c1a", new Object[]{this, context, str, jSONObject, str2, str3});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Uri parse = Uri.parse(str);
            try {
                AliNavServiceInterface a2 = t.a();
                if (a2 == null) {
                    return;
                }
                a2.a(context).a(parse);
            } catch (Throwable unused) {
            }
        }
    }
}

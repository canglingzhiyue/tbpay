package tb;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.t;

/* loaded from: classes.dex */
public class jaf implements jae {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1767320007);
        kge.a(432287693);
    }

    @Override // tb.jae
    public void a(Context context, String str, JSONObject jSONObject, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c8e1c1a", new Object[]{this, context, str, jSONObject, str2, str3});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            String str4 = null;
            if (jSONObject != null) {
                str4 = jSONObject.toJSONString();
            }
            if ("post".equals(str2)) {
                Bundle bundle = new Bundle();
                if (!StringUtils.isEmpty(str4)) {
                    try {
                        bundle.putString("postdata", Uri.encode(str4));
                    } catch (Exception unused) {
                    }
                }
                bundle.putBoolean("isPostUrl", true);
                t.a().a(context).a(bundle).a(t.a().a(context).a(str, jSONObject));
                return;
            }
            t.a().a(context).a(str);
        }
    }
}

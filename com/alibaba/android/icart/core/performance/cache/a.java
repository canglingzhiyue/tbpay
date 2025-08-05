package com.alibaba.android.icart.core.performance.cache;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;
import tb.bmi;
import tb.jqd;
import tb.jqg;
import tb.jqi;
import tb.kge;

/* loaded from: classes2.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int sDefaultMaxPreloadItemImageCount = 5;

    static {
        kge.a(1256881535);
    }

    public static void a(bmi bmiVar, Context context) {
        List<IDMComponent> b;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c4f46e", new Object[]{bmiVar, context});
        } else if (bmiVar != null && context != null && (b = bmiVar.b()) != null) {
            int a2 = jqi.a("iCart", "maxPreloadItemImageCount", 5);
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (int i2 = 0; i2 < b.size(); i2++) {
                IDMComponent iDMComponent = b.get(i2);
                if (iDMComponent != null) {
                    JSONObject data = iDMComponent.getData();
                    if ("item".equalsIgnoreCase(data.getString("tag")) && (jSONObject = data.getJSONObject("fields")) != null) {
                        if (a(sb, jSONObject)) {
                            i++;
                        }
                        if (a2 <= i) {
                            break;
                        }
                    }
                }
            }
            jqg.b("CartFirstPageItemImageViewCache", "保存首屏三张商品图片");
            jqd.a("iCart").a("firstScreenItemImageUrls", sb.toString());
        }
    }

    private static boolean a(StringBuilder sb, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6664ae91", new Object[]{sb, jSONObject})).booleanValue();
        }
        String string = jSONObject.getString("pic");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        sb.append(string);
        sb.append(",");
        return true;
    }
}

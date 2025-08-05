package com.taobao.search.common.util;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.model.RecommendedAddress;
import java.util.Map;
import tb.kge;
import tb.noa;

/* loaded from: classes7.dex */
public final class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final o INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static String f19041a;
    private static String b;

    static {
        kge.a(1827526062);
        INSTANCE = new o();
    }

    private o() {
    }

    public final void a(Context context, com.taobao.android.address.a addressCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2334dc5c", new Object[]{this, context, addressCallback});
            return;
        }
        kotlin.jvm.internal.q.c(context, "context");
        kotlin.jvm.internal.q.c(addressCallback, "addressCallback");
        com.taobao.android.address.b.a(context, noa.RUNTIME_PERMISSION_REQUEST_BIZ_NAME, "", "local_life", "TB_SHOPPING_PROCESS", addressCallback);
    }

    public final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        kotlin.jvm.internal.q.c(context, "context");
        com.taobao.android.address.b.a(context, noa.RUNTIME_PERMISSION_REQUEST_BIZ_NAME, "", "", "TB_SHOPPING_PROCESS");
    }

    public final RecommendedAddress b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecommendedAddress) ipChange.ipc$dispatch("5d6eee3", new Object[]{this, context});
        }
        kotlin.jvm.internal.q.c(context, "context");
        return com.taobao.android.address.b.a(context, noa.RUNTIME_PERMISSION_REQUEST_BIZ_NAME, "TB_SHOPPING_PROCESS");
    }

    public final String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{this, context});
        }
        kotlin.jvm.internal.q.c(context, "context");
        String b2 = com.taobao.android.address.b.b(context, noa.RUNTIME_PERMISSION_REQUEST_BIZ_NAME, "TB_SHOPPING_PROCESS");
        if (kotlin.jvm.internal.q.a((Object) b2, (Object) f19041a)) {
            return b;
        }
        try {
            JSONObject parseObject = JSON.parseObject(b2);
            if (parseObject != null) {
                for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
                    if (!kotlin.jvm.internal.q.a((Object) entry.getKey(), (Object) "biz_common") && !kotlin.jvm.internal.q.a((Object) entry.getKey(), (Object) "tb_search_b2c")) {
                        Object value = entry.getValue();
                        if (!(value instanceof JSONObject)) {
                            value = null;
                        }
                        JSONObject jSONObject = (JSONObject) value;
                        if (jSONObject != null) {
                            jSONObject.remove("recommendedAddress");
                        }
                    }
                }
                b = parseObject.toString();
                f19041a = b2;
            }
            return b;
        } catch (Throwable unused) {
            return b;
        }
    }

    public final void b(Context context, com.taobao.android.address.a addressCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2938a7bb", new Object[]{this, context, addressCallback});
            return;
        }
        kotlin.jvm.internal.q.c(context, "context");
        kotlin.jvm.internal.q.c(addressCallback, "addressCallback");
        com.taobao.android.address.b.a(context, noa.RUNTIME_PERMISSION_REQUEST_BIZ_NAME, "tb_search_change_diff_city", true, "TB_SHOPPING_PROCESS", addressCallback);
    }
}

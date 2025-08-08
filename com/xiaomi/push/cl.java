package com.xiaomi.push;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import java.text.SimpleDateFormat;

/* loaded from: classes9.dex */
public class cl {

    /* renamed from: a  reason: collision with root package name */
    private static String f24401a;

    /* renamed from: a  reason: collision with other field name */
    private static SimpleDateFormat f172a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        f172a = simpleDateFormat;
        f24401a = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    public static ig a(Context context, String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        ig igVar = new ig();
        igVar.d("category_push_stat");
        igVar.a("push_sdk_stat_channel");
        igVar.a(1L);
        igVar.b(str);
        igVar.a(true);
        igVar.b(System.currentTimeMillis());
        igVar.g(bu.a(context).m1752a());
        igVar.e("com.xiaomi.xmsf");
        igVar.f("");
        igVar.c("push_stat");
        return igVar;
    }
}

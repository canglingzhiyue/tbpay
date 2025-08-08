package com.taobao.themis.kernel.solution;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.i;
import com.taobao.themis.utils.o;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes9.dex */
public enum TMSSolutionType {
    MIX,
    MINIGAME,
    WEB_SINGLE_PAGE,
    WIDGET,
    CLUSTER_WIDGET,
    UNIAPP,
    WEEX;

    public static TMSSolutionType getType(Uri uri) {
        if (uri == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter(i.APP_ID);
        String queryParameter2 = uri.getQueryParameter(i.CONTAINER_TYPE);
        String queryParameter3 = uri.getQueryParameter(i.IS_CLUSTER_WIDGET);
        String queryParameter4 = uri.getQueryParameter(i.IS_WIDGET);
        ArrayList arrayList = new ArrayList(Arrays.asList("3000000064426654", "3000000060917022", "3000000074071555", "3000000074598201"));
        if (com.taobao.themis.kernel.utils.i.a(uri)) {
            return UNIAPP;
        }
        if (com.taobao.themis.kernel.utils.i.c(uri.toString())) {
            return WEEX;
        }
        if (StringUtils.isEmpty(queryParameter)) {
            return WEB_SINGLE_PAGE;
        }
        if (!StringUtils.equals(queryParameter2, "gm") && !arrayList.contains(queryParameter)) {
            return "true".equals(queryParameter3) ? CLUSTER_WIDGET : "true".equals(queryParameter4) ? WIDGET : MIX;
        }
        return MINIGAME;
    }

    public static TMSSolutionType getType(f fVar) {
        String g = fVar.g();
        return StringUtils.isEmpty(g) ? MIX : getType(o.b(g));
    }
}

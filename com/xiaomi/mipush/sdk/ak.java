package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.l;
import com.xiaomi.push.bh;

/* loaded from: classes9.dex */
public class ak {
    public static AbstractPushManager a(Context context, e eVar) {
        return b(context, eVar);
    }

    private static AbstractPushManager b(Context context, e eVar) {
        l.a m1691a = l.m1691a(eVar);
        if (m1691a == null || TextUtils.isEmpty(m1691a.f24330a) || TextUtils.isEmpty(m1691a.b)) {
            return null;
        }
        return (AbstractPushManager) bh.a(m1691a.f24330a, m1691a.b, context);
    }
}

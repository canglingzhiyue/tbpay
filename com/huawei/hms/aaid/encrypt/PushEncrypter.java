package com.huawei.hms.aaid.encrypt;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.huawei.hms.opendevice.o;
import tb.cyc;

/* loaded from: classes4.dex */
public class PushEncrypter {
    public static String decrypter(Context context, String str) {
        return StringUtils.isEmpty(str) ? "" : cyc.b(str, o.b(context));
    }

    public static String encrypter(Context context, String str) {
        return StringUtils.isEmpty(str) ? "" : cyc.a(str, o.b(context));
    }

    public static String encrypterOld(Context context, String str) {
        return StringUtils.isEmpty(str) ? "" : cyc.a(str, o.a(context));
    }
}

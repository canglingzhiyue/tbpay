package com.taobao.android.layoutmanager.container.containerlifecycle;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.e;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import tb.kge;
import tb.ogg;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(718593922);
    }

    public static f a(Context context, e eVar, String str, boolean z, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("be6a422b", new Object[]{context, eVar, str, new Boolean(z), bundle});
        }
        f fVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            fVar = (!com.taobao.android.layoutmanager.a.b(parse) || !com.taobao.android.layoutmanager.a.a(parse)) ? com.taobao.android.fluid.c.a(context, eVar, str, z, bundle) : new b(context, eVar, str, z, bundle);
        } catch (Throwable unused) {
            ogg.a("PageFactory", "createPage error:" + str);
        }
        return fVar;
    }
}

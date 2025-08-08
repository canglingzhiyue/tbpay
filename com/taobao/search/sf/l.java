package com.taobao.search.sf;

import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.r;
import com.taobao.search.musie.MUSXSearchEventModule;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes8.dex */
public final class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1492719516);
    }

    public static final boolean a(Intent intent) {
        Bundle extras;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{intent})).booleanValue();
        }
        q.c(intent, "intent");
        if (r.cu() && (extras = intent.getExtras()) != null) {
            String params = extras.getString(MUSXSearchEventModule.KEY_OPEN_URL_EXTRAS);
            String str = params;
            if (!StringUtils.isEmpty(str)) {
                q.a((Object) params, "params");
                if (kotlin.text.n.b((CharSequence) str, (CharSequence) "topHeader", false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }
}

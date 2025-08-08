package com.taobao.search.sf.remote;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.split.core.splitinstall.g;
import com.alibaba.android.split.k;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.r;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes8.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a INSTANCE;

    static {
        kge.a(-354737599);
        INSTANCE = new a();
    }

    private a() {
    }

    @JvmStatic
    public static final boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        q.c(context, "context");
        if (str != null && !StringUtils.isEmpty(str)) {
            return INSTANCE.b(context, str);
        }
        return false;
    }

    private final boolean b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b80d80d", new Object[]{this, context, str})).booleanValue();
        }
        if (r.cp()) {
            try {
                k.a().a(context, false, str);
            } catch (Exception unused) {
            }
        }
        try {
            g c = com.taobao.appbundle.c.Companion.a().c();
            if (c != null && com.android.tools.bundleInfo.b.a().c(str) != null) {
                if (c.a().contains(str)) {
                    return true;
                }
            }
        } catch (Exception unused2) {
        }
        return false;
    }
}

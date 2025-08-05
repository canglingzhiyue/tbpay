package com.taobao.themis.taobao.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.n;
import com.taobao.zcache.r;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/taobao/utils/TMSInitUtils;", "", "()V", "checkAndInitZCache", "", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a INSTANCE;

    static {
        kge.a(913635952);
        INSTANCE = new a();
    }

    private a() {
    }

    @JvmStatic
    public static final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (n.a() != null) {
        } else {
            r.a();
        }
    }
}

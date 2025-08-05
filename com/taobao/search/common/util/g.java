package com.taobao.search.common.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes7.dex */
public final class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final g INSTANCE;

    static {
        kge.a(630166772);
        INSTANCE = new g();
    }

    private g() {
    }

    public final String a(Collection<String> collection, String delimiter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79dedd5d", new Object[]{this, collection, delimiter});
        }
        kotlin.jvm.internal.q.c(collection, "collection");
        kotlin.jvm.internal.q.c(delimiter, "delimiter");
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = collection.iterator();
        if (it.hasNext()) {
            sb.append(it.next());
            while (it.hasNext()) {
                sb.append(delimiter);
                sb.append(it.next());
            }
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.q.a((Object) sb2, "builder.toString()");
        return sb2;
    }
}

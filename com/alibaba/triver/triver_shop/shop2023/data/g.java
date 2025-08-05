package com.alibaba.triver.triver_shop.shop2023.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class<? extends g>, Set<h<g>>> f4070a;

    public /* synthetic */ g(o oVar) {
        this();
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1424090063);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }

        public final Map<Class<? extends g>, Set<h<g>>> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : g.c();
        }
    }

    private g() {
    }

    public static final /* synthetic */ Map c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[0]) : f4070a;
    }

    static {
        kge.a(-2043763385);
        Companion = new a(null);
        f4070a = new LinkedHashMap();
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Set<h<g>> set = f4070a.get(getClass());
        if (set == null) {
            return;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            ((h) it.next()).onEvent(this);
        }
    }
}

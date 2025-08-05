package com.taobao.search.m3.icons;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class a extends com.taobao.search.m3.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final C0764a Companion;
    private static final float b;
    private static final float c;
    private static final int d;
    private static final float e;

    /* renamed from: a  reason: collision with root package name */
    private final View f19098a;
    private final c f;

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        return false;
    }

    /* renamed from: com.taobao.search.m3.icons.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0764a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-347077367);
        }

        private C0764a() {
        }

        public /* synthetic */ C0764a(o oVar) {
            this();
        }

        public final float a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : a.e();
        }

        public final float b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue() : a.f();
        }

        public final int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : a.g();
        }

        public final float d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue() : a.h();
        }
    }

    public a(c itemInfo, View view) {
        q.c(itemInfo, "itemInfo");
        q.c(view, "view");
        this.f = itemInfo;
        this.f19098a = view;
    }

    public static final /* synthetic */ float e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[0])).floatValue() : b;
    }

    public static final /* synthetic */ float f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1dd", new Object[0])).floatValue() : c;
    }

    public static final /* synthetic */ int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[0])).intValue() : d;
    }

    public static final /* synthetic */ float h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10df", new Object[0])).floatValue() : e;
    }

    public final c i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("b2fecbc", new Object[]{this}) : this.f;
    }

    static {
        kge.a(-1985992959);
        Companion = new C0764a(null);
        b = l.a(2.0f);
        c = l.a(10.0f);
        d = l.a(3.0f);
        e = l.a(0.5f);
    }
}

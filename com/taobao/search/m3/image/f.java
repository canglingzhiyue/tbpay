package com.taobao.search.m3.image;

import android.graphics.Color;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class f extends com.taobao.search.m3.image.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static final float f19111a;
    private static final float b;
    private static final float c;
    private static final int d;
    private static final float e;
    private static final int f;
    private static final int g;
    private static final int h;
    private static final float j;
    private final boolean i;

    @Override // com.taobao.search.m3.image.a
    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // com.taobao.search.m3.image.a
    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.search.m3.image.a
    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        return true;
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-299549706);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final float a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : f.q();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View view, boolean z, boolean z2) {
        super(view, z);
        q.c(view, "view");
        this.i = z2;
    }

    public static final /* synthetic */ float q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64de468", new Object[0])).floatValue() : j;
    }

    static {
        kge.a(2129900078);
        Companion = new a(null);
        f19111a = l.a(6.0f);
        b = l.a(6.0f);
        c = l.a(10.0f);
        d = l.a(16.0f);
        e = l.a(8.0f);
        j = l.a(4.0f);
        f = Color.parseColor("#80000000");
        g = l.a(3.0f);
        h = l.a(6.0f);
    }

    @Override // com.taobao.search.m3.image.a
    public float a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : this.i ? j : e;
    }

    @Override // com.taobao.search.m3.image.a
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : d;
    }

    @Override // com.taobao.search.m3.image.a
    public float c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue() : f19111a;
    }

    @Override // com.taobao.search.m3.image.a
    public float d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue() : b;
    }

    @Override // com.taobao.search.m3.image.a
    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : g;
    }

    @Override // com.taobao.search.m3.image.a
    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : h;
    }

    @Override // com.taobao.search.m3.image.a
    public float h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10df", new Object[]{this})).floatValue() : c;
    }

    @Override // com.taobao.search.m3.image.a
    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : f;
    }

    @Override // com.taobao.search.m3.image.a
    public int a(c info) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("513b0e90", new Object[]{this, info})).intValue();
        }
        q.c(info, "info");
        return (int) ((info.d() / info.e()) * d);
    }

    @Override // com.taobao.search.m3.image.a
    public int b(c info) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b813ce51", new Object[]{this, info})).intValue();
        }
        q.c(info, "info");
        return d;
    }
}

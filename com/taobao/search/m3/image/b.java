package com.taobao.search.m3.image;

import android.graphics.Color;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class b extends com.taobao.search.m3.image.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static final int f19108a;
    private static final float b;
    private static final int c;
    private static final float d;
    private static final float e;
    private static final float f;
    private static final float g;
    private static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    private static final int l;
    private static final float m;
    private final boolean n;

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == -702056489) {
            super.a((c) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.search.m3.image.a
    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // com.taobao.search.m3.image.a
    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        return false;
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-997488875);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, boolean z, boolean z2) {
        super(view, z);
        q.c(view, "view");
        this.n = z2;
    }

    static {
        kge.a(443058189);
        Companion = new a(null);
        f19108a = l.a(16.0f);
        b = l.a(7.5f);
        c = l.a(4.0f);
        d = l.a(8.0f);
        e = l.a(5.0f);
        f = l.a(8.0f);
        g = l.a(5.0f);
        h = l.a(11.0f);
        i = l.a(8.0f);
        j = Color.parseColor("#4d000000");
        k = l.a(1.0f);
        l = l.a(4.0f);
        m = l.a(10.0f);
    }

    @Override // com.taobao.search.m3.image.a, com.taobao.search.m3.image.d
    public void a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62777d7", new Object[]{this, cVar, new Boolean(z)});
            return;
        }
        if (cVar != null) {
            cVar.a("https://gw.alicdn.com/mt/TB1OEU_7hD1gK0jSZFsXXbldVXa-30-38.png");
        }
        super.a(cVar, z);
    }

    @Override // com.taobao.search.m3.image.a
    public float a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : this.n ? f.Companion.a() : b;
    }

    @Override // com.taobao.search.m3.image.a
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : f19108a;
    }

    @Override // com.taobao.search.m3.image.a
    public float c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue() : p() ? d : e;
    }

    @Override // com.taobao.search.m3.image.a
    public float d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue() : p() ? f : g;
    }

    @Override // com.taobao.search.m3.image.a
    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : k;
    }

    @Override // com.taobao.search.m3.image.a
    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : l;
    }

    @Override // com.taobao.search.m3.image.a
    public float h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10df", new Object[]{this})).floatValue() : m;
    }

    @Override // com.taobao.search.m3.image.a
    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : j;
    }

    @Override // com.taobao.search.m3.image.a
    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : c;
    }

    @Override // com.taobao.search.m3.image.a
    public int a(c info) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("513b0e90", new Object[]{this, info})).intValue();
        }
        q.c(info, "info");
        return i;
    }

    @Override // com.taobao.search.m3.image.a
    public int b(c info) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b813ce51", new Object[]{this, info})).intValue();
        }
        q.c(info, "info");
        return h;
    }
}

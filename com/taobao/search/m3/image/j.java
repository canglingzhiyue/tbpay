package com.taobao.search.m3.image;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class j extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f19115a;
    private int b;
    private float c;
    private float d;

    static {
        kge.a(760462440);
    }

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
        if (str.hashCode() == -702056489) {
            super.a((c) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.search.m3.image.a
    public float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue();
        }
        return 0.0f;
    }

    @Override // com.taobao.search.m3.image.a
    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.search.m3.image.a
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.search.m3.image.a
    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.search.m3.image.a
    public float h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10df", new Object[]{this})).floatValue();
        }
        return 0.0f;
    }

    @Override // com.taobao.search.m3.image.a
    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue();
        }
        return 0;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(View view, boolean z) {
        super(view, z);
        q.c(view, "view");
    }

    @Override // com.taobao.search.m3.image.a, com.taobao.search.m3.image.d
    public void a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62777d7", new Object[]{this, cVar, new Boolean(z)});
            return;
        }
        this.f19115a = 0;
        this.b = 0;
        if (cVar != null) {
            this.f19115a = l.a(cVar.d());
            this.b = l.a(cVar.e());
            this.c = l.a(p() ? cVar.i() : cVar.g());
            this.d = l.a(p() ? cVar.j() : cVar.h());
        }
        super.a(cVar, z);
    }

    @Override // com.taobao.search.m3.image.a
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    @Override // com.taobao.search.m3.image.a
    public float c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue() : this.c;
    }

    @Override // com.taobao.search.m3.image.a
    public float d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue() : this.d;
    }

    @Override // com.taobao.search.m3.image.a
    public int a(c info) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("513b0e90", new Object[]{this, info})).intValue();
        }
        q.c(info, "info");
        return this.f19115a;
    }

    @Override // com.taobao.search.m3.image.a
    public int b(c info) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b813ce51", new Object[]{this, info})).intValue();
        }
        q.c(info, "info");
        return this.b;
    }
}

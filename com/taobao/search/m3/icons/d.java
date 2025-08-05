package com.taobao.search.m3.icons;

import android.graphics.Canvas;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class d extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f19101a;
    private final com.taobao.search.m3.d b;
    private final c c;

    static {
        kge.a(749699370);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c iconInfo, View view) {
        super(iconInfo, view);
        q.c(iconInfo, "iconInfo");
        q.c(view, "view");
        this.c = iconInfo;
        this.b = new com.taobao.search.m3.d(view, null, 2, null);
    }

    @Override // com.taobao.search.m3.c
    public void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        this.b.a(canvas);
    }

    @Override // com.taobao.search.m3.icons.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.b.a(this.c.b().image, this.f19101a, IconView.Companion.a());
        }
    }

    @Override // com.taobao.search.m3.b, com.taobao.search.m3.c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.a();
        }
    }

    @Override // com.taobao.search.m3.c
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        if (this.f19101a == 0) {
            this.f19101a = (int) ((this.c.b().width / this.c.b().height) * IconView.Companion.a());
        }
        return this.f19101a;
    }
}

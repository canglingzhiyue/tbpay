package com.taobao.android.detail.core.detail.kit.view.widget.base.photo;

import android.content.Context;
import android.widget.OverScroller;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(121253964);
    }

    public abstract void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    public abstract void a(boolean z);

    public abstract boolean a();

    public abstract int b();

    public abstract int c();

    public static c a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("520dc90a", new Object[]{context}) : new a(context);
    }

    /* loaded from: classes4.dex */
    public static class a extends c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private OverScroller f9614a;

        static {
            kge.a(1396119514);
        }

        public a(Context context) {
            this.f9614a = new OverScroller(context);
        }

        @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.photo.c
        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f9614a.computeScrollOffset();
        }

        @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.photo.c
        public void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b35ffc48", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Integer(i9), new Integer(i10)});
            } else {
                this.f9614a.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
            }
        }

        @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.photo.c
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.f9614a.forceFinished(z);
            }
        }

        @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.photo.c
        public int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f9614a.getCurrX();
        }

        @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.photo.c
        public int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f9614a.getCurrY();
        }
    }
}

package com.taobao.android.detail.core.standard.widget.anchor;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.bay;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NO_LIMIT_WIDTH = -1;
    private int b;
    private float c;
    private String d;
    private String e;
    private int f;
    private boolean g;
    private String i;
    private int j;
    private String k;

    /* renamed from: a  reason: collision with root package name */
    private int f9890a = -1;
    private int h = R.drawable.pic_gallery_anchor_view_item_selected_bg_bottom;
    private int l = 4;

    static {
        kge.a(520521594);
    }

    public static /* synthetic */ int a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7abce564", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.f9890a = i;
        return i;
    }

    public static /* synthetic */ int b(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e4c69a5", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.l = i;
        return i;
    }

    public c(boolean z) {
        this.g = z;
        if (z) {
            this.b = bay.a(34.0f);
            this.c = 17.0f;
            this.d = "#FFFFFF";
            this.e = "#CCFFFFFF";
            this.f = bay.a(9.0f);
            this.i = "#FFFFFFFF";
            this.j = R.drawable.pic_gallery_anchor_view_immersive_bg_bottom;
            this.k = "#00000000";
        } else {
            this.b = bay.a(32.0f);
            this.c = 12.5f;
            this.d = "#000000";
            this.e = "#FFFFFF";
            this.f = bay.a(12.5f);
            this.i = "#FFFFFF";
            this.j = R.drawable.pic_gallery_anchor_view_bg_bottom;
            this.k = "#4D242424";
        }
        emu.a("com.taobao.android.detail.core.standard.widget.anchor.PicGalleryAnchorStyleConfig");
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.b;
    }

    public float b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue() : this.c;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.d;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.e;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.f;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.i;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.j;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.l;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.k;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.g;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue() : this.f9890a;
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private c f9891a;

        static {
            kge.a(-2066529199);
        }

        public a(boolean z) {
            this.f9891a = new c(z);
        }

        public static a a(boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("36b4fa79", new Object[]{new Boolean(z)}) : new a(z);
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d4e551e8", new Object[]{this, new Integer(i)});
            }
            c.a(this.f9891a, i);
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("534655c7", new Object[]{this, new Integer(i)});
            }
            c.b(this.f9891a, i);
            return this;
        }

        public c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("d227f752", new Object[]{this}) : this.f9891a;
        }
    }
}

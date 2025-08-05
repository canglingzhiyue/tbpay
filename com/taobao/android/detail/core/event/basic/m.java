package com.taobao.android.detail.core.event.basic;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.enn;
import tb.kge;

/* loaded from: classes4.dex */
public class m extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f9708a;

    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f9709a;
        public String b;
        public View c;
        public float d;
        public float e;
        public boolean f;
        public String g;
        public String h;
        public String i;
        public String j;

        static {
            kge.a(-399164824);
        }

        public a(int i, String str, String str2, View view, float f, float f2) {
            this.f9709a = i;
            this.b = str;
            this.j = str2;
            this.c = view;
            this.d = f;
            this.e = f2;
        }
    }

    static {
        kge.a(1046457582);
    }

    public m(int i, String str, String str2, View view, float f, float f2) {
        this.f9708a = new a(i, str, str2, view, f, f2);
        emu.a("com.taobao.android.detail.core.event.basic.PlayVideoEvent");
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f9708a.f = z;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f9708a.g = str;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.f9708a.h = str;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.f9708a.i = str;
        }
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f9708a;
    }
}

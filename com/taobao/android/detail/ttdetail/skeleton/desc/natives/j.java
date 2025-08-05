package com.taobao.android.detail.ttdetail.skeleton.desc.natives;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f10839a;

    /* loaded from: classes5.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f10840a;
        public String b;
        public View c;
        public float d;
        public float e;
        public boolean f;
        public String g;
        public String h;

        static {
            kge.a(56034145);
        }

        public a(int i, String str, String str2, View view, float f, float f2) {
            this.f10840a = i;
            this.b = str;
            this.h = str2;
            this.c = view;
            this.d = f;
            this.e = f2;
        }
    }

    static {
        kge.a(-1704868459);
    }

    public j(int i, String str, String str2, View view, float f, float f2) {
        this.f10839a = new a(i, str, str2, view, f, f2);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f10839a.f = z;
        }
    }

    public Object a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : this.f10839a;
    }
}

package com.etao.feimagesearch.util;

import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.android.weex_framework.adapter.d;
import com.taobao.tao.Globals;
import kotlin.jvm.JvmStatic;
import tb.kge;

/* loaded from: classes4.dex */
public final class an {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final an INSTANCE;

    static {
        kge.a(1710435885);
        INSTANCE = new an();
    }

    private an() {
    }

    @JvmStatic
    public static final void a(String str, int i, int i2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fb01ee", new Object[]{str, new Integer(i), new Integer(i2), new Float(f)});
        } else if (str == null || StringUtils.isEmpty(str)) {
        } else {
            com.taobao.android.weex_framework.l a2 = com.taobao.android.weex_framework.l.a();
            kotlin.jvm.internal.q.a((Object) a2, "MUSDKManager.getInstance()");
            com.taobao.android.weex_framework.adapter.d f2 = a2.f();
            if (!(f2 instanceof com.taobao.search.musie.e)) {
                return;
            }
            ((com.taobao.search.musie.e) f2).b(Globals.getApplication(), str, new a(i, f, i2), MUSImageQuality.AUTO);
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7018a;
        public final /* synthetic */ float b;
        public final /* synthetic */ int c;
        private Object d;

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public void a(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
            } else {
                kotlin.jvm.internal.q.c(drawable, "drawable");
            }
        }

        public a(int i, float f, int i2) {
            this.f7018a = i;
            this.b = f;
            this.c = i2;
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public void a(Object tag) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, tag});
                return;
            }
            kotlin.jvm.internal.q.c(tag, "tag");
            this.d = tag;
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public Object b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("43b9c269", new Object[]{this});
            }
            Object obj = this.d;
            if (obj == null) {
                kotlin.jvm.internal.q.a();
            }
            return obj;
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : (int) (this.f7018a * this.b);
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public int d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : (int) (this.c * this.b);
        }
    }
}

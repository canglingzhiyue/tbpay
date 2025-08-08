package com.alibaba.flexa.compat;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.split.core.splitinstall.t;
import com.alibaba.android.split.j;
import com.alibaba.android.split.n;
import com.alibaba.android.split.s;
import com.alibaba.android.split.scene.e;
import com.alibaba.android.split.scene.k;
import com.alibaba.android.split.scene.l;
import com.alibaba.android.split.scene.m;
import com.android.alibaba.ip.runtime.IpChange;
import tb.asi;
import tb.bgi;
import tb.bgt;
import tb.bgu;
import tb.cam;
import tb.cao;
import tb.fkv;
import tb.ocm;
import tb.xil;
import tb.xim;
import tb.xin;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f3102a;
    private boolean b;
    private boolean c;
    private Context d;
    private boolean e;
    private String f;

    public Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this.d;
    }

    public b(Context context, bgi bgiVar, s sVar, bgu bguVar, j jVar, boolean z, boolean z2, boolean z3, boolean z4, String str) {
        this.f3102a = false;
        this.b = true;
        this.c = true;
        if (context == null) {
            throw new IllegalStateException("Context can not be null!");
        }
        this.d = context;
        this.e = z;
        this.f3102a = z2;
        this.b = z3;
        this.c = z4;
        if (StringUtils.isEmpty(str)) {
            this.f = "212200";
        } else {
            this.f = str;
        }
        if (bgiVar == null) {
            com.alibaba.android.split.a.a(bgi.class, cam.class, Context.class);
        } else {
            com.alibaba.android.split.a.a(bgi.class, bgiVar);
        }
        if (sVar == null) {
            com.alibaba.android.split.a.a(s.class, new n());
        } else {
            com.alibaba.android.split.a.a(s.class, sVar);
        }
        if (bguVar == null) {
            try {
                com.alibaba.android.split.a.a(bgu.class, bgt.class, String.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            com.alibaba.android.split.a.a(bgu.class, bguVar);
        }
        if (jVar == null) {
            try {
                com.alibaba.android.split.a.a(j.class, cao.class, new Class[0]);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            com.alibaba.android.split.a.a(j.class, jVar);
        }
        com.alibaba.android.split.a.a(xil.class, ocm.class, new Class[0]);
        com.alibaba.android.split.a.a(com.alibaba.android.split.assets.a.class, fkv.class, new Class[0]);
        com.alibaba.android.split.a.a(asi.class, t.class, new Class[0]);
        l.a(e.a());
        m.a(new com.alibaba.android.split.scene.c());
        com.alibaba.android.split.scene.j.a(new k());
        com.taobao.android.split.a aVar = new com.taobao.android.split.a();
        aVar.a((xin) new xim());
        com.alibaba.android.split.a.a(xin.class, aVar);
        com.alibaba.android.split.core.splitcompat.j.a(context, z, z2, z3, z4);
    }

    public static a a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7fa48a4b", new Object[]{context}) : new a(context);
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f3103a;
        private bgi b;
        private s c;
        private bgu d;
        private boolean e;
        private j f;
        private boolean g;
        private boolean h;
        private String i;
        private boolean j;

        private a(Context context) {
            this.g = true;
            this.f3103a = context;
        }

        public a a(s sVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7af1544f", new Object[]{this, sVar});
            }
            this.c = sVar;
            return this;
        }

        public a a(j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e5bb846", new Object[]{this, jVar});
            }
            this.f = jVar;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4aa286bf", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b17b4680", new Object[]{this, new Boolean(z)});
            }
            this.j = z;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("18540641", new Object[]{this, new Boolean(z)});
            }
            this.g = z;
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7f2cc602", new Object[]{this, new Boolean(z)});
            }
            this.h = z;
            return this;
        }

        public b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("aeb611a0", new Object[]{this}) : new b(this.f3103a, this.b, this.c, this.d, this.f, this.e, this.h, this.g, this.j, this.i);
        }
    }
}

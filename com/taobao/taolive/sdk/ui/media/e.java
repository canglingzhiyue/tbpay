package com.taobao.taolive.sdk.ui.media;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.ui.media.g;
import tb.kge;

/* loaded from: classes8.dex */
public class e extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String h;
    public boolean i;
    public int j = 2;

    static {
        kge.a(-2045580453);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 92838762) {
            super.c();
            return null;
        } else if (hashCode != 96532846) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.g();
            return null;
        }
    }

    public void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d90e9a", new Object[]{this, new Boolean(z)});
        }
    }

    public e() {
        k("MediaPlayController2");
        this.f21925a = new Handler(Looper.getMainLooper());
    }

    public e(String str) {
        k("MediaPlayController2");
        this.h = str;
        this.f21925a = new Handler(Looper.getMainLooper());
    }

    public String L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a6fe962d", new Object[]{this}) : this.h;
    }

    @Override // com.taobao.taolive.sdk.ui.media.d, com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        k("createInstance");
        this.d = context;
        this.b = new FrameLayout(context);
        g.a a2 = g.a().a(context, this.h, !this.i);
        if (a2 != null) {
            this.c = a2.f21932a;
            a(a2);
            if (this.c != null) {
                this.f.a(this.c);
            }
        }
        if (this.c != null) {
            this.i = true;
        }
        M();
        if (this.c == null) {
            return;
        }
        this.c.a(this);
    }

    public void M() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
        } else if (this.c == null || this.c.r() == null || (viewGroup = (ViewGroup) this.c.r().getParent()) == this.b) {
        } else {
            if (viewGroup != null) {
                viewGroup.removeView(this.c.r());
            }
            this.b.addView(this.c.r(), 0, new FrameLayout.LayoutParams(-1, -1, 17));
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.d, com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        M();
        super.g();
    }

    @Override // com.taobao.taolive.sdk.ui.media.d
    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
            return;
        }
        k("releaseByToken");
        if (!TextUtils.isEmpty(this.h)) {
            if (this.i) {
                g.a().a(this.h);
                this.i = false;
            }
        } else if (this.c != null) {
            this.c.o();
        }
        s();
    }

    @Override // com.taobao.taolive.sdk.ui.media.d, com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        k("pause");
        if (this.c == null) {
            return;
        }
        if ((this.d instanceof Activity) && ((Activity) this.d).isFinishing() && !com.taobao.taolive.sdk.utils.o.o()) {
            return;
        }
        this.c.i();
    }

    @Override // com.taobao.taolive.sdk.ui.media.d
    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
            return;
        }
        k("releaseAndDestroy");
        if (!TextUtils.isEmpty(this.h)) {
            if (this.i) {
                g.a().b(this.h);
                this.i = false;
            }
        } else if (this.c != null) {
            this.c.o();
            this.c.c();
        }
        E();
    }

    @Override // com.taobao.taolive.sdk.ui.media.d, com.taobao.taolive.sdk.ui.media.IMediaPlayer
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        if (TextUtils.isEmpty(this.h)) {
            return;
        }
        g.a().c(this.h);
    }

    @Override // com.taobao.taolive.sdk.ui.media.d
    public int J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4284fc4", new Object[]{this})).intValue() : this.j;
    }

    public void a(g.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4985432", new Object[]{this, aVar});
            return;
        }
        int i = aVar.b;
        if (i == 0) {
            this.j = 0;
        } else if (i == 1) {
            this.j = 1;
        } else if (i != 2) {
        } else {
            this.j = 2;
        }
    }
}

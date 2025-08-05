package com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.secondpage.biz.GGSecTNodePage;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import tb.kge;
import tb.ofz;
import tb.oga;

/* loaded from: classes5.dex */
public class a extends ofz implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private f f13221a;
    private Context b;
    private GGSecTNodePage c;
    private d d;

    static {
        kge.a(-665974600);
        kge.a(-1969929256);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ofz
    public boolean dH_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a1c4f86", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.ofz
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        this.b = context;
        if (c.a()) {
            return h().a(context);
        }
        return g().b(context);
    }

    @Override // tb.ofz
    public void a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{this, obj, str});
        } else if (c.a()) {
            h().a(obj instanceof String ? Uri.parse((String) obj) : null, str);
        } else {
            g().a(obj, str);
        }
    }

    @Override // tb.ofz
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (c.a()) {
            h().a();
        } else {
            g().b();
        }
    }

    @Override // tb.ofz
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (c.a()) {
            h().d();
        } else {
            g().c();
        }
    }

    @Override // tb.ofz
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (c.a()) {
            h().b();
        } else {
            g().d();
        }
    }

    @Override // tb.ofz
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (c.a()) {
            h().c();
        } else {
            g().e();
        }
    }

    @Override // tb.ofz
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        if (c.a()) {
            return null;
        }
        return g().a();
    }

    @Override // com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter.b
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            oga.a(this.b, this.f13221a);
        }
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d586d88", new Object[]{this, fVar});
            return;
        }
        this.f13221a = fVar;
        if (c.a()) {
            return;
        }
        g().a(fVar);
    }

    private GGSecTNodePage g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GGSecTNodePage) ipChange.ipc$dispatch("3b5d5f08", new Object[]{this});
        }
        if (this.c == null) {
            this.c = new GGSecTNodePage();
        }
        return this.c;
    }

    private d h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("b427e7f8", new Object[]{this});
        }
        if (this.d == null) {
            this.d = new d(this);
        }
        return this.d;
    }
}

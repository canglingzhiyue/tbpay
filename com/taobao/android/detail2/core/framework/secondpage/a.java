package com.taobao.android.detail2.core.framework.secondpage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.mini.l;
import java.util.HashMap;
import java.util.Map;
import tb.fjt;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f11564a;
    public View b;
    public Uri c;
    public Activity d = new Activity();
    public String e;
    public Map<String, String> f;
    public InterfaceC0462a g;

    /* renamed from: com.taobao.android.detail2.core.framework.secondpage.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0462a {
        void a();
    }

    static {
        kge.a(353940312);
        kge.a(930045196);
        kge.a(-641968098);
    }

    public abstract c a(b bVar);

    public abstract void a(Uri uri, View view);

    public abstract View b();

    public void b(Uri uri, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d5fb94", new Object[]{this, uri, view});
        }
    }

    public a(Context context) {
        this.f11564a = context;
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        if (this.b == null) {
            this.b = b();
        }
        return this.b;
    }

    public void a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a285df", new Object[]{this, uri});
        } else {
            this.c = uri;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        fjt.a(fjt.TAG_SECOND_PAGE, "二级页start");
        a(this.c, this.b);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        fjt.a(fjt.TAG_SECOND_PAGE, "二级页resume");
        h();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        fjt.a(fjt.TAG_SECOND_PAGE, "二级页pause");
        i();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        fjt.a(fjt.TAG_SECOND_PAGE, "二级页stop");
        b(this.c, this.b);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            l.getInstance().pageDestroyed(this.d);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (StringUtils.isEmpty(this.e)) {
        } else {
            fjt.a(fjt.TAG_SECOND_PAGE, "二级页appear页面埋点");
            UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
            defaultTracker.pageAppear(this.d);
            defaultTracker.updatePageName(this.d, this.e);
            defaultTracker.updatePageProperties(this.d, this.f);
            HashMap hashMap = new HashMap();
            Map<String, String> map = this.f;
            if (map != null) {
                hashMap.put("spm-url", map.get("spm-cnt"));
            }
            defaultTracker.updateNextPageProperties(hashMap);
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        fjt.a(fjt.TAG_SECOND_PAGE, "二级页disappear页面埋点");
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this.d);
    }

    public void a(InterfaceC0462a interfaceC0462a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d2ead25", new Object[]{this, interfaceC0462a});
        } else {
            this.g = interfaceC0462a;
        }
    }

    public InterfaceC0462a j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InterfaceC0462a) ipChange.ipc$dispatch("f4f10482", new Object[]{this}) : this.g;
    }
}

package com.taobao.android.detail.ttdetail;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.component.module.h;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.bd;
import java.util.List;
import tb.eyq;
import tb.eyx;
import tb.iyw;
import tb.kge;
import tb.lpe;
import tb.odg;

/* loaded from: classes4.dex */
public class e extends d implements Application.ActivityLifecycleCallbacks, com.taobao.android.detail.ttdetail.communication.g<com.taobao.android.detail.ttdetail.bizmessage.c> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TTGalleryContainer";
    private eyq b;
    private a c;

    /* loaded from: classes4.dex */
    public interface a {
        void a(com.taobao.android.detail.ttdetail.bizmessage.c cVar);
    }

    static {
        kge.a(-1711595198);
        kge.a(-1894394539);
        kge.a(-767194759);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        if (str.hashCode() == 91915241) {
            super.b();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    public static /* synthetic */ eyq a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyq) ipChange.ipc$dispatch("6a49064", new Object[]{eVar}) : eVar.b;
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public /* synthetic */ boolean receiveMessage(com.taobao.android.detail.ttdetail.bizmessage.c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("318750e6", new Object[]{this, cVar})).booleanValue() : a(cVar);
    }

    public e(Context context, String str, eyx eyxVar) {
        super(context, str, eyxVar);
        iyw a2;
        a(eyxVar);
        this.b = new eyq(context, a());
        odg.t r = odg.r();
        if (r != null && (a2 = r.a(context, a(), this.b)) != null) {
            this.b.a(a2);
        }
        a(context);
        com.taobao.android.detail.ttdetail.communication.c.a(context, com.taobao.android.detail.ttdetail.bizmessage.c.class, this);
    }

    private void a(eyx eyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cf0e14", new Object[]{this, eyxVar});
        } else if (eyxVar != null) {
        } else {
            bd.a(a(), a().g());
        }
    }

    public <C extends com.taobao.android.detail.ttdetail.component.module.d> C a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C) ipChange.ipc$dispatch("dfbaff7d", new Object[]{this, str}) : (C) this.b.d(str);
    }

    public <C extends com.taobao.android.detail.ttdetail.component.module.d> C d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C) ipChange.ipc$dispatch("e2267b00", new Object[]{this, str}) : (C) this.b.j(str);
    }

    public List<h> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.b.g();
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            a().a().a(jSONObject);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            this.b.e();
        } else {
            a().b().a(new Runnable() { // from class: com.taobao.android.detail.ttdetail.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        e.a(e.this).e();
                    }
                }
            });
        }
    }

    public void a(eyq.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2326e4de", new Object[]{this, aVar});
        } else {
            this.b.a(aVar);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.b.a(str);
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.b.c(str);
        }
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else {
            this.b.a(viewGroup);
        }
    }

    public void b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3684528", new Object[]{this, viewGroup});
        } else {
            lpe.a().a(viewGroup);
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c355ac8", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    public boolean a(com.taobao.android.detail.ttdetail.bizmessage.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79fe6442", new Object[]{this, cVar})).booleanValue();
        }
        a aVar = this.c;
        if (aVar != null) {
            aVar.a(cVar);
        } else {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("url", (Object) cVar.a());
            jSONObject.put("image", (Object) jSONObject2);
            jSONObject.put("bizId", (Object) "blacklight");
            com.taobao.android.detail.ttdetail.communication.c.a(this.f10595a, new com.taobao.android.detail.ttdetail.bizmessage.h("share", jSONObject, new RuntimeAbilityParam("shareFromSku", true), new RuntimeAbilityParam("shareContainer", cVar.b())));
        }
        return true;
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public ThreadMode onRunThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this}) : ThreadMode.MainThread;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        f();
        if (!z) {
            return;
        }
        h();
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        g();
        if (!z) {
            return;
        }
        i();
    }

    public View e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("42261fae", new Object[]{this}) : this.b.d();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.b.a();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.b.b();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.b.c().b();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            this.b.c().c();
        }
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.b.b(f);
        }
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        } else {
            this.b.c(f);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.b.a(i);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.android.detail.ttdetail.communication.c.a(this.f10595a, this);
        b(this.f10595a);
        this.b.f();
        super.b();
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        b(context);
        ((Activity) context).getApplication().registerActivityLifecycleCallbacks(this);
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else {
            ((Activity) context).getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f10595a == activity) {
            com.taobao.android.detail.ttdetail.widget.video.a.a().d(activity);
            this.b.c().g();
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "biz.onActivityResumed(): " + (currentTimeMillis2 - currentTimeMillis));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f10595a == activity) {
            com.taobao.android.detail.ttdetail.widget.video.a.a().c(activity);
            this.b.c().h();
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "biz.onActivityPaused(): " + (currentTimeMillis2 - currentTimeMillis));
    }
}

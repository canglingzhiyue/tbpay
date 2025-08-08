package com.taobao.android.icart.shake;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Vibrator;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.icart.core.data.model.CartGlobal;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shake.api.c;
import com.taobao.android.t;
import com.taobao.tao.Globals;
import java.lang.ref.WeakReference;
import tb.bbz;
import tb.bcb;
import tb.bex;
import tb.kge;
import tb.mxo;
import tb.spk;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile ShakeControl f12852a;
    private Activity b;
    private bbz c;
    private com.taobao.android.icart.shake.a e = new com.taobao.android.icart.shake.a() { // from class: com.taobao.android.icart.shake.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.icart.shake.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            String d = b.this.d();
            if (StringUtils.isEmpty(d)) {
                return;
            }
            bbz a2 = b.a(b.this);
            bex.c(a2, "Page_ShoppingCart_Shake", "count=" + b.this.e(), "interval=" + b.this.f(), "url=" + b.this.d());
            t.a().a(b.b(b.this)).a(d);
        }
    };
    private c.b d = new a(this);

    static {
        kge.a(-483995415);
    }

    public static /* synthetic */ bbz a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("926cd0f5", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ Activity b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("32ba69b0", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ com.taobao.android.icart.shake.a c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.icart.shake.a) ipChange.ipc$dispatch("4ad6cc2d", new Object[]{bVar}) : bVar.e;
    }

    public b(bbz bbzVar) {
        this.c = bbzVar;
        this.b = bbzVar.m();
    }

    public void a(bcb bcbVar) {
        CartGlobal m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1707ef7", new Object[]{this, bcbVar});
        } else if (bcbVar == null || !b() || (m = bcbVar.m()) == null) {
        } else {
            CartGlobal.ControlParas controlParas = m.getControlParas();
            if (controlParas != null && controlParas.getShake() != null) {
                this.f12852a = (ShakeControl) JSONObject.toJavaObject(controlParas.getShake(), ShakeControl.class);
            } else {
                this.f12852a = null;
            }
        }
    }

    @Deprecated
    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : spk.a("cart_switch", "cart_shake_enable", false);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : a();
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : b() && this.f12852a != null && this.f12852a.isEnable() && !StringUtils.isEmpty(this.f12852a.getUrl()) && h();
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        if (this.f12852a != null) {
            return this.f12852a.getUrl();
        }
        return null;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        if (this.f12852a != null) {
            return this.f12852a.getCount();
        }
        return 0;
    }

    public float f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1dd", new Object[]{this})).floatValue();
        }
        if (this.f12852a != null) {
            return this.f12852a.getInterval();
        }
        return 0.0f;
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else if (activity == null) {
        } else {
            c a2 = c.a();
            c.a aVar = new c.a();
            int i2 = 1000;
            if (this.f12852a != null) {
                i = Math.max(this.f12852a.getCount(), 2);
                i2 = (int) (this.f12852a.getInterval() * 1000.0f);
            }
            aVar.d = i2;
            aVar.f15065a = i;
            a2.a(activity, this.d, aVar);
            a2.c();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            c.a().b();
        }
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        SharedPreferences sharedPreferences = (this.b.getApplication() == null ? this.b : this.b.getApplication()).getSharedPreferences(mxo.JSON_SHAREDPREFERENCES, 0);
        if (sharedPreferences != null) {
            return "true".equals(sharedPreferences.getString(mxo.CART_SWITCH_NAME, "true"));
        }
        return false;
    }

    /* loaded from: classes5.dex */
    public static class a implements c.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<b> f12854a;

        static {
            kge.a(-1384809264);
            kge.a(-847846697);
        }

        public a(b bVar) {
            this.f12854a = new WeakReference<>(bVar);
        }

        @Override // com.taobao.android.shake.api.c.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            final b bVar = this.f12854a.get();
            if (bVar == null || b.b(bVar) == null) {
                return;
            }
            Activity b = b.b(bVar);
            if (b.getWindow() == null || b.getWindow().getDecorView() == null || !b.a(bVar).u().isResumed() || !bVar.c()) {
                return;
            }
            Vibrator vibrator = (Vibrator) Globals.getApplication().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(500L);
            }
            b.getWindow().getDecorView().post(new Runnable() { // from class: com.taobao.android.icart.shake.b.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    c.a().c();
                    b.c(bVar).a();
                }
            });
        }
    }
}

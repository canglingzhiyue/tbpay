package com.taobao.themis.canvas.canvas;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fcanvas.integration.FCanvas;
import com.taobao.android.themis.graphics.d;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.e;
import com.taobao.themis.kernel.i;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.utils.f;
import com.taobao.themis.utils.k;
import com.taobao.themis.utils.o;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.ilb;
import tb.ild;
import tb.iwj;
import tb.kge;
import tb.qpt;
import tb.qqn;
import tb.qqo;

/* loaded from: classes9.dex */
public class TMSCanvasRender extends qqn implements iwj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ONLINE_HOST_ONLY_FILENAME = "https://hybrid.miniapp.taobao.com/";
    private static AtomicInteger e;
    private com.taobao.themis.open.extension.b c;
    private String d;
    private com.taobao.android.themis.graphics.d m;
    private InnerFrameLayout o;
    private b p;
    private final AtomicBoolean s;

    /* loaded from: classes9.dex */
    public interface c {
        void a(int i, int i2, int i3, int i4);
    }

    /* loaded from: classes9.dex */
    public interface d {
    }

    public static /* synthetic */ Object ipc$super(TMSCanvasRender tMSCanvasRender, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -69967319:
                super.a((qqo) objArr[0]);
                return null;
            case 90991720:
                super.a();
                return null;
            case 94685804:
                super.e();
                return null;
            case 95609325:
                super.f();
                return null;
            case 1914437276:
                super.b((String) objArr[0], (JSON) objArr[1]);
                return null;
            case 2045969029:
                super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c_(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4ed18e", new Object[]{this, iTMSPage});
        }
    }

    @Override // tb.qqq
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : "FANVAS";
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        }
    }

    public static /* synthetic */ com.taobao.android.themis.graphics.d a(TMSCanvasRender tMSCanvasRender) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.themis.graphics.d) ipChange.ipc$dispatch("246aa2e8", new Object[]{tMSCanvasRender}) : tMSCanvasRender.m;
    }

    static {
        kge.a(137124786);
        kge.a(251914830);
        e = new AtomicInteger(100);
    }

    private String dK_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d00f2521", new Object[]{this}) : String.valueOf(e.incrementAndGet());
    }

    /* loaded from: classes9.dex */
    public static class InnerFrameLayout extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private c mSizeChangedListener;
        private d mVisibilityChangedListener;

        static {
            kge.a(-2027819629);
        }

        public static /* synthetic */ Object ipc$super(InnerFrameLayout innerFrameLayout, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 348684699) {
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            } else if (hashCode != 1389530587) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            }
        }

        public InnerFrameLayout(Context context) {
            super(context);
        }

        @Override // android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            super.onSizeChanged(i, i2, i3, i4);
            c cVar = this.mSizeChangedListener;
            if (cVar == null) {
                return;
            }
            cVar.a(i, i2, i3, i4);
        }

        @Override // android.view.View
        public void onVisibilityChanged(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            } else {
                super.onVisibilityChanged(view, i);
            }
        }

        public InnerFrameLayout whenSizeChanged(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InnerFrameLayout) ipChange.ipc$dispatch("b1b8fc2", new Object[]{this, cVar});
            }
            this.mSizeChangedListener = cVar;
            return this;
        }

        public InnerFrameLayout whenVisibilityChanged(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InnerFrameLayout) ipChange.ipc$dispatch("cf13a192", new Object[]{this, dVar});
            }
            this.mVisibilityChangedListener = dVar;
            return this;
        }
    }

    private InnerFrameLayout a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InnerFrameLayout) ipChange.ipc$dispatch("27c29b72", new Object[]{this, context}) : new InnerFrameLayout(context).whenSizeChanged(new c() { // from class: com.taobao.themis.canvas.canvas.TMSCanvasRender.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.themis.canvas.canvas.TMSCanvasRender.c
            public void a(int i, int i2, int i3, int i4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                } else if (TMSCanvasRender.a(TMSCanvasRender.this) == null) {
                } else {
                    TMSCanvasRender.a(TMSCanvasRender.this).a(i, i2, i3, i4);
                }
            }
        }).whenVisibilityChanged(new d() { // from class: com.taobao.themis.canvas.canvas.TMSCanvasRender.1
        });
    }

    /* loaded from: classes9.dex */
    public static class b implements ilb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<com.taobao.android.themis.graphics.d> f22321a;
        private String b;

        static {
            kge.a(1595811946);
            kge.a(-485676334);
        }

        @Override // tb.ilb
        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
            }
            return 101;
        }

        @Override // tb.ilb
        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
            }
            return 1;
        }

        @Override // tb.ilb
        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : FCanvas.TAG;
        }

        public b(com.taobao.android.themis.graphics.d dVar, String str) {
            this.f22321a = new WeakReference<>(dVar);
            this.b = str;
        }

        @Override // tb.ilb
        public boolean a(com.taobao.android.resourceguardian.data.model.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("733ff0c7", new Object[]{this, bVar})).booleanValue();
            }
            WeakReference<com.taobao.android.themis.graphics.d> weakReference = this.f22321a;
            if (weakReference != null && weakReference.get() != null) {
                this.f22321a.get().a(true);
            }
            return false;
        }

        @Override // tb.ilb
        public String d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.b;
        }
    }

    public TMSCanvasRender(ITMSPage iTMSPage) {
        super(iTMSPage);
        this.s = new AtomicBoolean(false);
        this.d = dK_();
        this.o = a(this.f33035a.o());
        this.o.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // tb.qqn, tb.qqq
    public void a(qqo qqoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd46229", new Object[]{this, qqoVar});
            return;
        }
        super.a(qqoVar);
        final com.taobao.themis.open.extension.b bVar = (com.taobao.themis.open.extension.b) this.b.a(com.taobao.themis.open.extension.b.class);
        if (bVar == null) {
            this.f33035a.a(e.g);
            return;
        }
        TMSLogger.d("TMSCanvasRender", "runtime: " + bVar.getClass().getName());
        this.c = bVar;
        bVar.c(this.d);
        this.o.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.themis.canvas.canvas.TMSCanvasRender.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue() : bVar.a(motionEvent);
            }
        });
        if (this.r || this.f33035a == null || this.c == null) {
            return;
        }
        b(qqoVar);
        if (f.a(this.b.b().o())) {
            TextView textView = new TextView(this.b.b().o());
            if (this.c instanceof com.taobao.themis.canvas.extension.page.c) {
                textView.setText("Runtime: V8");
            } else {
                textView.setText("Runtime: Qking");
            }
            textView.setTextSize(k.a((Context) this.b.b().o(), 8.0f));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388659;
            layoutParams.leftMargin = k.a((Context) this.b.b().o(), 10.0f);
            textView.setTextColor(-65536);
            this.o.addView(textView, layoutParams);
        }
        this.c.d();
        a(this.c, qqoVar);
    }

    /* loaded from: classes9.dex */
    public static class a implements d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<ITMSPage> f22320a;
        private qqo b;

        static {
            kge.a(458597563);
            kge.a(-538290410);
        }

        public a(ITMSPage iTMSPage, qqo qqoVar) {
            this.f22320a = new WeakReference<>(iTMSPage);
            this.b = qqoVar;
        }

        @Override // com.taobao.android.themis.graphics.d.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            WeakReference<ITMSPage> weakReference = this.f22320a;
            if (weakReference == null || weakReference.get() == null || this.f22320a.get().b() == null) {
                return;
            }
            qqo qqoVar = this.b;
            if (qqoVar != null) {
                qqoVar.b();
                this.b = null;
            }
            this.f22320a.get().b().k().a("Canvas_FirstFrameTime");
        }
    }

    private void b(qqo qqoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea5768aa", new Object[]{this, qqoVar});
            return;
        }
        DisplayMetrics displayMetrics = this.f33035a.o().getResources().getDisplayMetrics();
        this.m = new com.taobao.android.themis.graphics.b(this.d, this.f33035a.o(), com.taobao.themis.canvas.canvas.c.a());
        if (com.taobao.themis.canvas.canvas.d.b()) {
            this.p = new b(this.m, this.f33035a.g());
            ild.a(this.p);
        }
        d.b bVar = new d.b();
        bVar.f15557a = 1;
        bVar.b = 1;
        bVar.c = displayMetrics.density;
        bVar.e = new a(this.b, qqoVar);
        try {
            bVar.g = com.taobao.themis.canvas.canvas.d.a(this.f33035a.h());
            Map<String, String> configs = ((IConfigAdapter) qpt.a(IConfigAdapter.class)).getConfigs(i.ORANGE_GROUP_THEMIS_GRAPHICS_COMMON);
            if (configs != null && !configs.isEmpty()) {
                bVar.f = JSON.toJSONString(configs);
            } else {
                bVar.f = "";
            }
        } catch (Throwable th) {
            TMSLogger.d("TMSCanvasRender", "unexpected error because of " + th.getMessage());
        }
        this.m.a(bVar);
        this.o.addView(this.m.a());
        try {
            j();
        } catch (Throwable th2) {
            TMSLogger.d("TMSCanvasRender", "unexpected error when call setProfileEnabled because of " + th2.getMessage());
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (!this.f33035a.q().isMiniAppDebug()) {
        } else {
            boolean equals = TextUtils.equals("true", o.a(this.f33035a.g(), "enable_profile_memory"));
            boolean equals2 = TextUtils.equals("true", o.a(this.f33035a.g(), "enableProfileFrame"));
            com.taobao.android.themis.graphics.d dVar = this.m;
            if (dVar == null || !(dVar instanceof com.taobao.android.themis.graphics.b)) {
                return;
            }
            ((com.taobao.android.themis.graphics.b) dVar).a(equals, equals2);
        }
    }

    private void a(com.taobao.themis.open.extension.b bVar, qqo qqoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e79915", new Object[]{this, bVar, qqoVar});
            return;
        }
        bVar.g();
        this.s.set(true);
        m();
        this.f33035a.k().a("Canvas_finishLoad");
        if (qqoVar == null) {
            return;
        }
        qqoVar.a();
    }

    private void m() {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        try {
            String a3 = o.a(this.f33035a.g(), "query");
            if (TextUtils.isEmpty(a3)) {
                a2 = new HashMap();
            } else {
                a2 = o.a("https://huodong.com/index.html?" + URLDecoder.decode(a3));
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", (Object) "onShow");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("query", a2);
            jSONObject.put("data", (Object) jSONObject2);
            a("gm_global_event", (JSON) jSONObject);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", (Object) "onHide");
            a("gm_global_event", (JSON) jSONObject);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // tb.qqq
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.o;
    }

    @Override // tb.qqq
    public void a(String str, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8072587d", new Object[]{this, str, json});
            return;
        }
        com.taobao.themis.open.extension.b bVar = this.c;
        if (bVar == null || !this.s.get()) {
            return;
        }
        if (json == null) {
            try {
                json = new JSONObject();
            } catch (Throwable th) {
                TMSLogger.b("TMSCanvasRender", th.getMessage(), th);
                return;
            }
        }
        bVar.a(str, (JSONObject) json, true);
    }

    @Override // tb.qqn, tb.qqq
    public void b(String str, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("721bfe9c", new Object[]{this, str, json});
        } else {
            super.b(str, json);
        }
    }

    @Override // tb.qqq
    public void a(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba3ac339", new Object[]{this, bArr, str});
            return;
        }
        com.taobao.themis.open.extension.b bVar = this.c;
        if (bVar == null) {
            return;
        }
        if (n.bm() && !TextUtils.isEmpty(str) && str.endsWith("gm.v20.wlm") && this.f33035a.v() != null) {
            bVar.a(bArr, ONLINE_HOST_ONLY_FILENAME + str, com.taobao.themis.kernel.metaInfo.appinfo.b.a(this.f33035a.v().z(), str.replace("gm.v20.wlm", "gm.js.map")));
            return;
        }
        bVar.a(bArr, ONLINE_HOST_ONLY_FILENAME + str, (String) null);
    }

    @Override // tb.qqq
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        com.taobao.themis.open.extension.b bVar = this.c;
        if (bVar == null) {
            return;
        }
        bVar.a(str, ONLINE_HOST_ONLY_FILENAME + str2);
    }

    @Override // tb.qqq
    public Bitmap di_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("db94d7df", new Object[]{this}) : this.m.b();
    }

    @Override // tb.iwj
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        InnerFrameLayout innerFrameLayout = this.o;
        if (innerFrameLayout == null) {
            return;
        }
        innerFrameLayout.requestLayout();
    }

    @Override // tb.qqn, tb.qqq
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        com.taobao.android.themis.graphics.d dVar = this.m;
        if (dVar != null) {
            dVar.d();
        }
        m();
    }

    @Override // tb.qqn, tb.qqq
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        com.taobao.android.themis.graphics.d dVar = this.m;
        if (dVar != null) {
            dVar.c();
        }
        n();
    }

    @Override // tb.qqn, tb.qqq
    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            super.a(i, i2, intent);
        }
    }

    @Override // tb.qqn, tb.qqq
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        b bVar = this.p;
        if (bVar != null) {
            ild.b(bVar);
            this.p = null;
        }
        com.taobao.android.themis.graphics.d dVar = this.m;
        if (dVar != null) {
            dVar.e();
            this.m = null;
        }
        com.taobao.themis.open.extension.b bVar2 = this.c;
        if (bVar2 == null) {
            return;
        }
        bVar2.h();
    }
}

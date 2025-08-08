package com.taobao.android.searchbaseframe.chitu;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.android.searchbaseframe.ace.AcePanelActivity;
import com.taobao.android.searchbaseframe.net.b;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.searchbaseframe.util.r;
import com.taobao.tao.Globals;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.io.UnsupportedEncodingException;
import tb.imn;
import tb.imp;
import tb.isa;
import tb.kge;

/* loaded from: classes6.dex */
public class e implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SIGNAL = ":ChiTu";

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.android.searchbaseframe.chitu.b f14960a;
    private TUrlImageView b;
    private TUrlImageView c;
    private View d;
    private Activity e;
    private String f;
    private int g;
    private int h;
    private GestureDetector i;
    private a j;
    private imn k;

    /* loaded from: classes6.dex */
    public interface a {
        void a(View view);

        void b();

        void d();
    }

    static {
        kge.a(-1169785670);
        kge.a(-468432129);
    }

    public static /* synthetic */ View a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("511aec", new Object[]{eVar}) : eVar.d;
    }

    public static /* synthetic */ void a(e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da97ac74", new Object[]{eVar, str});
        } else {
            eVar.a(str);
        }
    }

    public static /* synthetic */ TUrlImageView b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("214b7ef1", new Object[]{eVar}) : eVar.b;
    }

    public static /* synthetic */ Activity c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("a65420fc", new Object[]{eVar}) : eVar.e;
    }

    public static /* synthetic */ String d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aba60d13", new Object[]{eVar}) : eVar.f;
    }

    public static /* synthetic */ imn e(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("63c7870e", new Object[]{eVar}) : eVar.k;
    }

    public static /* synthetic */ TUrlImageView f(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("37e806d", new Object[]{eVar}) : eVar.c;
    }

    public static /* synthetic */ a g(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("98eac44b", new Object[]{eVar}) : eVar.j;
    }

    public e(com.taobao.android.searchbaseframe.chitu.b bVar, imn imnVar) {
        this.k = imnVar;
        this.f14960a = bVar;
    }

    public void a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bb1504", new Object[]{this, activity, str});
            return;
        }
        this.e = activity;
        this.f = str;
        if (this.i == null) {
            this.i = new GestureDetector(activity, new b());
        }
        if (this.k.l().a()) {
            c();
        } else if (this.k.l().c() || !this.k.l().d()) {
        } else {
            b();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        String str = this.k.n().d;
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("debugApp", "android");
        arrayMap.put("serviceType", ThemisConfig.SCENE_SELECT);
        arrayMap.put("utdid", this.k.a().b());
        com.taobao.android.searchbaseframe.net.b.a(this.k, new com.taobao.android.searchbaseframe.net.a(r.a(str, (ArrayMap<String, String>) arrayMap)), new b.AbstractC0575b() { // from class: com.taobao.android.searchbaseframe.chitu.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.searchbaseframe.net.b.AbstractC0575b
            public void a(com.taobao.android.searchbaseframe.net.e eVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("828c1bf2", new Object[]{this, eVar});
                    return;
                }
                String str2 = "";
                try {
                    if (eVar.a() != null) {
                        str2 = new String(eVar.a(), "utf-8");
                    }
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                e.a(e.this, isa.a(str2));
            }
        });
        this.k.b().f("ChituToolBarModule", "check chitu white list");
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        k b2 = this.k.b();
        b2.f("ChituToolBarModule", "chitu white list:" + str);
        if ("success".equals(str)) {
            this.k.l().a(true);
            this.k.l().b(true);
            c();
            return;
        }
        this.k.l().b();
        Toast.makeText(this.e, str, 0).show();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (StringUtils.isEmpty(this.f)) {
        } else {
            imp.a().a(Globals.getApplication());
            com.taobao.android.searchbaseframe.ace.a.b(this.e);
            if (this.b == null) {
                this.b = new TUrlImageView(this.e);
                this.b.setLayoutParams(new FrameLayout.LayoutParams(j.a(43.0f), j.a(43.0f)));
                this.b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                this.b.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01VDnCo422H6YnGF25K_!!6000000007094-2-tps-36-36.png");
                ((FrameLayout.LayoutParams) this.b.getLayoutParams()).gravity = 80;
                ((FrameLayout.LayoutParams) this.b.getLayoutParams()).setMargins(j.a(8.0f), 0, 0, j.a(48.0f));
                this.b.setOnTouchListener(this);
            }
            this.b.setVisibility(0);
            if (this.c == null) {
                this.c = new TUrlImageView(this.e);
                this.c.setLayoutParams(new FrameLayout.LayoutParams(j.a(43.0f), j.a(43.0f)));
                this.c.setScaleType(ImageView.ScaleType.CENTER_CROP);
                this.c.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01F0qr7R1ckFl46yRb5_!!6000000003638-2-tps-61-60.png");
                ((FrameLayout.LayoutParams) this.c.getLayoutParams()).gravity = 80;
                ((FrameLayout.LayoutParams) this.c.getLayoutParams()).setMargins(j.a(8.0f), 0, 0, j.a(100.0f));
                this.c.setOnTouchListener(this);
            }
            this.c.setVisibility(0);
            a aVar = this.j;
            if (aVar != null) {
                aVar.b();
                this.j.a(this.c);
            }
            com.taobao.search.rainbow.a.d(this.k.j().a().getString(TBSearchChiTuJSBridge.ABTEST, ""));
        }
    }

    public ImageView a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("3a195828", new Object[]{this}) : this.b;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        int height = ((View) view.getParent()).getHeight();
        int width = ((View) view.getParent()).getWidth();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.g = (int) motionEvent.getRawX();
            this.h = (int) motionEvent.getRawY();
        } else if (action == 1) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).setMargins(view.getLeft(), 0, 0, height - (view.getTop() + view.getHeight()));
        } else if (action == 2) {
            int rawY = ((int) (motionEvent.getRawY() - this.h)) + view.getTop();
            int rawX = ((int) (motionEvent.getRawX() - this.g)) + view.getLeft();
            if (rawY <= 0) {
                rawY = 0;
            }
            if (rawY >= height - view.getHeight()) {
                rawY = height - view.getHeight();
            }
            if (rawX <= 0) {
                rawX = 0;
            }
            if (rawX >= width - view.getWidth()) {
                rawX = width - view.getWidth();
            }
            view.layout(rawX, rawY, view.getWidth() + rawX, view.getHeight() + rawY);
            this.g = (int) motionEvent.getRawX();
            this.h = (int) motionEvent.getRawY();
        }
        this.d = view;
        this.i.onTouchEvent(motionEvent);
        return true;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ec60ecd", new Object[]{this, aVar});
        } else {
            this.j = aVar;
        }
    }

    /* loaded from: classes6.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-204033505);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 1575121015) {
                return new Boolean(super.onSingleTapUp((MotionEvent) objArr[0]));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
            }
            if (e.a(e.this) == e.b(e.this)) {
                Intent intent = new Intent(e.c(e.this), ChituPanelActivity.class);
                intent.putExtra("chituBiz", e.d(e.this));
                ChituPanelActivity.f14955a = e.e(e.this);
                e.c(e.this).startActivity(intent);
            } else if (e.a(e.this) == e.f(e.this)) {
                e.c(e.this).startActivity(new Intent(e.c(e.this), AcePanelActivity.class));
            }
            return super.onSingleTapUp(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
            } else if (!e.e(e.this).l().a() || e.g(e.this) == null) {
            } else {
                e.g(e.this).d();
            }
        }
    }
}

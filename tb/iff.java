package tb;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.layoutmanager.module.NavigationTabHelper;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes6.dex */
public class iff {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private b A;
    private Context B;

    /* renamed from: a  reason: collision with root package name */
    private ife f28986a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private int l = 1;
    private int m = 1;
    private int n = 1;
    private int o = 1;
    private int p = 1;
    private int q = 1;
    private TextView r;
    private TextView s;
    private TextView t;
    private TextView u;
    private TextView v;
    private TextView w;
    private TUrlImageView x;
    private FrameLayout y;
    private a z;

    /* loaded from: classes6.dex */
    public interface a {
        void a(iff iffVar);
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a(iff iffVar);
    }

    static {
        kge.a(-1988314958);
    }

    public static /* synthetic */ a a(iff iffVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("4153dcb1", new Object[]{iffVar}) : iffVar.z;
    }

    public static /* synthetic */ b b(iff iffVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("c7d9976f", new Object[]{iffVar}) : iffVar.A;
    }

    public static /* synthetic */ Context c(iff iffVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("2d394c49", new Object[]{iffVar}) : iffVar.B;
    }

    private iff() {
    }

    public iff(Context context) {
        if (context != null) {
            this.B = context;
            this.f28986a = new ife(context, R.style.Dialog_Error_Alert);
            this.f28986a.a(R.layout.purchase_new_dialog, -1, -1, 17);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            f();
            e();
            g();
            h();
            d();
        } catch (Throwable unused) {
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        int a2 = com.taobao.android.purchase.core.utils.b.a(this.i, 1);
        if (a2 != 1) {
            a(this.y, a2, a2);
        }
        int a3 = com.taobao.android.purchase.core.utils.b.a(this.j, 1);
        if (a3 != 1) {
            a(this.v, a3, a3);
        }
        int a4 = com.taobao.android.purchase.core.utils.b.a(this.k, 1);
        if (a4 == 1) {
            return;
        }
        a(this.w, a4, a4);
    }

    private void e() {
        int i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.l = FestivalMgr.a().a("trade", "titleBgColorStart", 1);
        this.m = FestivalMgr.a().a("trade", "titleBgColorEnd", 1);
        this.n = FestivalMgr.a().a("trade", "leftButtonColorStart", 1);
        this.o = FestivalMgr.a().a("trade", "leftButtonColorEnd", 1);
        this.p = FestivalMgr.a().a("trade", "rightButtonColorStart", 1);
        this.q = FestivalMgr.a().a("trade", "rightButtonColorEnd", 1);
        String a2 = FestivalMgr.a().a("trade", NavigationTabHelper.b.PHASE_ICONIMAGE);
        if (this.x != null && !TextUtils.isEmpty(a2)) {
            this.x.setImageUrl(a2);
        }
        int i4 = this.l;
        if (i4 != 1 && (i3 = this.m) != 1) {
            a(this.y, i4, i3);
        }
        int i5 = this.n;
        if (i5 != 1 && (i2 = this.o) != 1) {
            a(this.v, i5, i2);
        }
        int i6 = this.p;
        if (i6 == 1 || (i = this.q) == 1) {
            return;
        }
        a(this.w, i6, i);
    }

    private void a(View view, int... iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c2d3ff8", new Object[]{this, view, iArr});
        } else if (view == null || iArr == null || iArr.length <= 0) {
        } else {
            Drawable background = view.getBackground();
            if (!(background instanceof GradientDrawable)) {
                return;
            }
            GradientDrawable gradientDrawable = (GradientDrawable) background;
            if (Build.VERSION.SDK_INT >= 16) {
                gradientDrawable.setColors(iArr);
            } else {
                gradientDrawable.setColor(iArr[0]);
            }
        }
    }

    private void f() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        ife ifeVar = this.f28986a;
        if (ifeVar == null) {
            return;
        }
        this.y = (FrameLayout) ifeVar.findViewById(R.id.purchase_new_dialog_title_bg);
        this.r = (TextView) this.f28986a.findViewById(R.id.purchase_new_dialog_title);
        this.s = (TextView) this.f28986a.findViewById(R.id.purchase_new_dialog_desc);
        this.t = (TextView) this.f28986a.findViewById(R.id.purchase_new_dialog_msg);
        this.u = (TextView) this.f28986a.findViewById(R.id.purchase_new_dialog_error_code);
        this.x = (TUrlImageView) this.f28986a.findViewById(R.id.purchase_new_dialog_error_image);
        this.v = (TextView) this.f28986a.findViewById(R.id.purchase_new_dialog_left_btn);
        this.w = (TextView) this.f28986a.findViewById(R.id.purchase_new_dialog_right_btn);
        if (this.z == null) {
            this.v.setVisibility(8);
            this.w.setText(com.alibaba.ability.localization.b.a(R.string.app_i_know));
        }
        if (this.A != null) {
            return;
        }
        this.w.setVisibility(8);
    }

    private void g() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        if (this.r != null && !TextUtils.isEmpty(this.b)) {
            this.r.setText(this.b);
        }
        if (this.s != null && !TextUtils.isEmpty(this.c)) {
            this.s.setText(this.c);
            this.s.setVisibility(0);
        }
        if (this.t != null && !TextUtils.isEmpty(this.d)) {
            this.t.setText(this.d);
            this.t.setVisibility(0);
        }
        if (this.x != null && !TextUtils.isEmpty(this.f)) {
            this.x.setImageUrl(this.f);
        }
        if (this.u != null && !TextUtils.isEmpty(this.e)) {
            this.u.setText(this.e);
        }
        if (this.v != null && !TextUtils.isEmpty(this.g)) {
            this.v.setText(this.g);
        }
        if (this.w == null || TextUtils.isEmpty(this.h)) {
            return;
        }
        this.w.setText(this.h);
    }

    private void h() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.f28986a == null) {
        } else {
            this.v.setOnClickListener(new View.OnClickListener() { // from class: tb.iff.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (iff.a(iff.this) == null) {
                    } else {
                        iff.a(iff.this).a(iff.this);
                    }
                }
            });
            this.w.setOnClickListener(new View.OnClickListener() { // from class: tb.iff.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (iff.b(iff.this) == null) {
                    } else {
                        iff.b(iff.this).a(iff.this);
                    }
                }
            });
            this.f28986a.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: tb.iff.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                        return;
                    }
                    dialogInterface.dismiss();
                    fke.a(iff.c(iff.this));
                }
            });
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2cfe3b2", new Object[]{this, aVar});
        } else {
            this.z = aVar;
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d05811", new Object[]{this, bVar});
        } else {
            this.A = bVar;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ife ifeVar = this.f28986a;
        if (ifeVar == null || ifeVar.isShowing()) {
            return;
        }
        c();
        this.f28986a.show();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ife ifeVar = this.f28986a;
        if (ifeVar == null) {
            return;
        }
        ifeVar.dismiss();
    }
}

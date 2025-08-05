package tb;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.q;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.s;
import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public class lcp extends lcn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout c;
    private lpa d;
    private lpa e;
    private lpc f;
    private lpc g;
    private lpa h;
    private lpc i;

    static {
        kge.a(1608881224);
    }

    public lcp(lcm lcmVar, loz lozVar) {
        super(lcmVar, lozVar);
        emu.a("com.taobao.android.detail.core.pagemanager.layout.DoubleColumnPageManager");
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : s.b();
    }

    @Override // tb.lcn
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        DetailCoreActivity a2 = this.b.a();
        int a3 = gbg.a((Context) a2, 16.0f);
        FrameLayout frameLayout = this.c;
        if (frameLayout == null) {
            this.c = new FrameLayout(a2);
            this.c.setBackgroundColor(-1);
        } else {
            frameLayout.removeAllViews();
        }
        iuy.c = a(a2);
        this.c.setPadding(a3, this.f30474a.b().a().getMeasuredHeight(), 0, 0);
        this.d = this.f30474a.a();
        String a4 = q.a("DoubleColumnPageManager");
        i.a(a4, "onBuild: mHeaderPicViewController = " + this.d);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b(this.b.a()), -2);
        layoutParams.rightMargin = a3;
        layoutParams.gravity = 19;
        this.c.addView(this.d.a(), layoutParams);
        this.d.a(this.b);
        FrameLayout frameLayout2 = new FrameLayout(a2);
        this.e = this.f30474a.d();
        View a5 = this.e.a();
        this.f = new lpc(a5);
        this.f.a(this.c);
        frameLayout2.addView(a5, new FrameLayout.LayoutParams(-1, -1));
        this.e.a(this.b);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iuy.c, -2);
        layoutParams2.gravity = 53;
        layoutParams2.rightMargin = a3;
        this.c.addView(frameLayout2, layoutParams2);
        View a6 = this.f30474a.c().a();
        this.g = new lpc(a6);
        this.g.a();
        if (Math.round(gbg.a((Context) a2) * 375.0f) <= iuy.c) {
            a3 = 0;
        }
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(12);
        this.h = this.f30474a.e();
        View a7 = this.h.a();
        this.i = new lpc(a7);
        this.i.a();
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(2, a6.getId());
        RelativeLayout relativeLayout = new RelativeLayout(a2);
        relativeLayout.addView(a6, layoutParams3);
        relativeLayout.addView(a7, layoutParams4);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((iuy.f29328a / 2) + a3, -2);
        layoutParams5.gravity = 85;
        this.c.addView(relativeLayout, layoutParams5);
        try {
            if (this.b == null || this.b.a() == null || this.b.a().findViewById(R.id.mainpage2) == null) {
                return;
            }
            Drawable background = this.b.a().findViewById(R.id.mainpage2).getBackground();
            if (!(background instanceof ColorDrawable)) {
                return;
            }
            this.c.setBackgroundColor(((ColorDrawable) background).getColor());
        } catch (Throwable th) {
            th.printStackTrace();
            String a8 = q.a("DoubleColumnPageManager");
            i.a(a8, "onBuild color error: " + th.getMessage());
        }
    }

    @Override // tb.lcn
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        lpc lpcVar = this.f;
        if (lpcVar != null) {
            lpcVar.b();
        }
        lpc lpcVar2 = this.g;
        if (lpcVar2 != null) {
            lpcVar2.b();
        }
        lpc lpcVar3 = this.i;
        if (lpcVar3 == null) {
            return;
        }
        lpcVar3.b();
    }

    @Override // tb.lcn
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        lpa lpaVar = this.d;
        if (lpaVar != null) {
            lpaVar.b();
        }
        lpa lpaVar2 = this.e;
        if (lpaVar2 != null) {
            lpaVar2.b();
        }
        lpa lpaVar3 = this.h;
        if (lpaVar3 == null) {
            return;
        }
        lpaVar3.b();
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue() : (iuy.f29328a / 2) - gbg.a(context, 16.0f);
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue() : (iuy.f29328a / 2) - (gbg.a(context, 16.0f) << 1);
    }
}

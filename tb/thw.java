package tb;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.GravityCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.h;
import com.taobao.tao.infoflow.multitab.g;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.f;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.PanelStyleModel;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* loaded from: classes8.dex */
public class thw implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TextView f34101a;
    private boolean b;
    private final a c;
    private FrameLayout d;
    private PanelStyleModel e;
    private final View.OnClickListener f = new View.OnClickListener() { // from class: tb.thw.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            thw.a(thw.this).i();
            if (!TextUtils.equals("editTvTag", String.valueOf(view.getTag()))) {
                g.a("PanelBaseViewProvider", "onClose click:");
                thw.c(thw.this);
            } else if (thw.b(thw.this)) {
                thw.a(thw.this).b();
            } else {
                thw.a(thw.this).a();
            }
        }
    };

    static {
        kge.a(1275531605);
        kge.a(1717401112);
    }

    public static /* synthetic */ a a(thw thwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c4404979", new Object[]{thwVar}) : thwVar.c;
    }

    public static /* synthetic */ boolean b(thw thwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("eefac1fa", new Object[]{thwVar})).booleanValue() : thwVar.b;
    }

    public static /* synthetic */ void c(thw thwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd7dc877", new Object[]{thwVar});
        } else {
            thwVar.e();
        }
    }

    public thw(a aVar) {
        this.c = aVar;
    }

    public ViewGroup a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("d01cc9b5", new Object[]{this, context});
        }
        this.d = b(context);
        return this.d;
    }

    private FrameLayout b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("de12f17a", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(Color.parseColor("#B3000000"));
        frameLayout.setOnClickListener(this.f);
        frameLayout.setLongClickable(false);
        frameLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: tb.thw.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                return true;
            }
        });
        return frameLayout;
    }

    public View a(Context context, PanelStyleModel panelStyleModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5e335b3b", new Object[]{this, context, panelStyleModel});
        }
        this.e = panelStyleModel;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(c(context));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = GravityCompat.END;
        layoutParams.rightMargin = f.a(context, 30.0f);
        this.f34101a = new TextView(context);
        this.f34101a.setOnClickListener(this.f);
        this.f34101a.setTag("editTvTag");
        this.f34101a.setLayoutParams(layoutParams);
        f();
        frameLayout.addView(this.f34101a);
        FrameLayout.LayoutParams d = d(context);
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        tUrlImageView.setLayoutParams(d);
        tUrlImageView.setTag("closeIvTag");
        onq.a(tUrlImageView, this.e.closeButtonImg, "homepage-ads", h.IMAGE_STRATEGY_CONFIG);
        tUrlImageView.setImageUrl(this.e.closeButtonImg);
        tUrlImageView.setOnClickListener(this.f);
        frameLayout.addView(tUrlImageView);
        return frameLayout;
    }

    private FrameLayout.LayoutParams c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("7a0408e7", new Object[]{this, context});
        }
        int a2 = f.a(context, 96.0f);
        int a3 = f.a(context, 13.0f);
        int a4 = f.a(context, 6.0f);
        int a5 = f.a(context, 8.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, -2);
        layoutParams.gravity = GravityCompat.END;
        layoutParams.topMargin = a3;
        layoutParams.rightMargin = a4;
        layoutParams.bottomMargin = a5;
        return layoutParams;
    }

    private FrameLayout.LayoutParams d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("b2e46986", new Object[]{this, context});
        }
        int a2 = f.a(context, 18.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
        layoutParams.gravity = 8388629;
        layoutParams.rightMargin = f.a(context, 3.0f);
        return layoutParams;
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = true;
        f();
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b = false;
        f();
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.b;
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        g.a("PanelBaseViewProvider", "onClose :");
        e();
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            this.c.i();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.b = false;
        f();
        FrameLayout frameLayout = this.d;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        this.c.d();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        TextView textView = this.f34101a;
        if (textView == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.gravity = GravityCompat.END;
        if (this.f34101a.getText() != null && this.f34101a.getText().length() < 4) {
            z = true;
        }
        layoutParams.rightMargin = f.a(this.f34101a.getContext(), (!this.b || !z) ? 30.0f : 44.0f);
        this.f34101a.setLayoutParams(layoutParams);
        this.f34101a.setTextColor(this.b ? Color.parseColor(this.e.completeTextColor) : Color.parseColor(this.e.channelManagerTextColor));
        this.f34101a.setTextSize(this.b ? this.e.completeTextSize : this.e.channelManagerTextSize);
        this.f34101a.setText(this.b ? this.e.completeText : this.e.channelManagerText);
    }
}

package tb;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.j;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import kotlin.t;

/* loaded from: classes3.dex */
public final class ifw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Activity f29001a;
    private ruk<t> b;

    /* loaded from: classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ruk<t> b = ifw.this.b();
            if (b == null) {
                return;
            }
            b.mo2427invoke();
        }
    }

    static {
        kge.a(499308546);
    }

    public ifw(Activity activity, ruk<t> rukVar) {
        q.c(activity, "activity");
        this.f29001a = activity;
        this.b = rukVar;
    }

    public final ruk<t> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruk) ipChange.ipc$dispatch("16bbe0f5", new Object[]{this}) : this.b;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        TextView textView = new TextView(this.f29001a);
        textView.setText("上报\n数据");
        textView.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#FF8903"));
        textView.setBackground(gradientDrawable);
        textView.setOnClickListener(new a());
        Window window = this.f29001a.getWindow();
        q.a((Object) window, "activity.window");
        View decorView = window.getDecorView();
        if (decorView == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        int a2 = j.a(50.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
        layoutParams.gravity = 85;
        int a3 = j.a(10.0f);
        layoutParams.setMargins(0, 0, a3, a3);
        ((ViewGroup) decorView).addView(textView, layoutParams);
    }
}

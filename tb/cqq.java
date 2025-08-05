package tb;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.monitor.procedure.v;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import kotlin.t;

/* loaded from: classes3.dex */
public final class cqq extends cqn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f26435a;
    private final ruk<t> b;

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
            ruk a2 = cqq.a(cqq.this);
            if (a2 == null) {
                return;
            }
            a2.mo2427invoke();
        }
    }

    static {
        kge.a(-1862979613);
    }

    public static final /* synthetic */ ruk a(cqq cqqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruk) ipChange.ipc$dispatch("56168529", new Object[]{cqqVar}) : cqqVar.b;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, android.view.ViewGroup] */
    @Override // tb.igj
    public /* synthetic */ ViewGroup k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ff4fb734", new Object[]{this}) : em_();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqq(Activity activity, hon parent, IrpDatasource irpDatasource, igi setter, ruk<t> rukVar) {
        super(activity, parent, irpDatasource, setter);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(irpDatasource, "irpDatasource");
        q.c(setter, "setter");
        this.b = rukVar;
    }

    public FrameLayout em_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("e896085b", new Object[]{this});
        }
        View inflate = LayoutInflater.from(g()).inflate(R.layout.feis_view_irp_loading, P(), false);
        if (inflate == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f26435a = (FrameLayout) inflate;
        FrameLayout frameLayout = this.f26435a;
        if (frameLayout == null) {
            q.b("mLoadingContainer");
        }
        TUrlImageView mLoadingView = (TUrlImageView) frameLayout.findViewById(R.id.ilv_loading);
        mLoadingView.setSkipAutoSize(true);
        q.a((Object) mLoadingView, "mLoadingView");
        mLoadingView.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01i7c9kO27C8CVPSGi0_!!6000000007760-54-tps-748-808.apng");
        FrameLayout frameLayout2 = this.f26435a;
        if (frameLayout2 == null) {
            q.b("mLoadingContainer");
        }
        TextView textView = (TextView) frameLayout2.findViewById(R.id.cancel_btn);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(j.b(12.0f));
        gradientDrawable.setStroke(j.a(2.0f), Color.parseColor("#FFFFFF"));
        textView.setBackground(gradientDrawable);
        textView.setOnClickListener(new a());
        FrameLayout frameLayout3 = this.f26435a;
        if (frameLayout3 == null) {
            q.b("mLoadingContainer");
        }
        frameLayout3.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_IGNORE);
        FrameLayout frameLayout4 = this.f26435a;
        if (frameLayout4 == null) {
            q.b("mLoadingContainer");
        }
        return frameLayout4;
    }

    @Override // tb.cqn
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ViewGroup O = O();
        if (O == null) {
            return;
        }
        O.setVisibility(0);
    }

    @Override // tb.cqn
    public void el_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c71011f", new Object[]{this});
            return;
        }
        ViewGroup O = O();
        if (O == null) {
            return;
        }
        O.setVisibility(8);
    }
}

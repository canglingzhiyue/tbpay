package tb;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.k;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.util.g;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class cqo extends igj<View, IrpDatasource> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private TextView f26432a;
    private TUrlImageView b;
    private TextView c;

    /* loaded from: classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                cqo.a(cqo.this);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewParent parent;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            View O = cqo.this.O();
            if (O == null || (parent = O.getParent()) == null) {
                return;
            }
            if (parent == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            ((ViewGroup) parent).removeView(cqo.this.O());
        }
    }

    static {
        kge.a(-1856872984);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(cqo cqoVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ void a(cqo cqoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f08977", new Object[]{cqoVar});
        } else {
            cqoVar.eL_();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqo(Activity activity, hon parent, IrpDatasource irpDatasource, igi setter) {
        super(activity, parent, irpDatasource, setter);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(irpDatasource, "irpDatasource");
        q.c(setter, "setter");
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(345245488);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // tb.igj
    public View k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ff4fb734", new Object[]{this});
        }
        View rootView = LayoutInflater.from(g()).inflate(R.layout.feis_irp_crop_guide, P(), false);
        View findViewById = rootView.findViewById(R.id.tv_title);
        q.a((Object) findViewById, "rootView.findViewById(R.id.tv_title)");
        this.f26432a = (TextView) findViewById;
        View findViewById2 = rootView.findViewById(R.id.iv_logo);
        q.a((Object) findViewById2, "rootView.findViewById(R.id.iv_logo)");
        this.b = (TUrlImageView) findViewById2;
        View findViewById3 = rootView.findViewById(R.id.btn_next_step);
        q.a((Object) findViewById3, "rootView.findViewById(R.id.btn_next_step)");
        this.c = (TextView) findViewById3;
        q.a((Object) rootView, "rootView");
        return rootView;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!com.etao.feimagesearch.config.b.aU() || com.r() || com.s() || m().z() || cuj.b((Context) g(), "crop_guide", false)) {
        } else {
            k.a((Context) g(), "crop_guide", true);
            igj.a(this, null, 1, null);
            eK_();
        }
    }

    private final void eK_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("642114a0", new Object[]{this});
            return;
        }
        TextView textView = this.c;
        if (textView == null) {
            q.b("nextView");
        }
        textView.setOnClickListener(new b());
        TextView textView2 = this.f26432a;
        if (textView2 == null) {
            q.b("titleView");
        }
        textView2.setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19006));
        TextView textView3 = this.c;
        if (textView3 == null) {
            q.b("nextView");
        }
        textView3.setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_next_step));
        TUrlImageView tUrlImageView = this.b;
        if (tUrlImageView == null) {
            q.b("logoView");
        }
        tUrlImageView.getLayoutParams().width = g.a(180.0f);
        TUrlImageView tUrlImageView2 = this.b;
        if (tUrlImageView2 == null) {
            q.b("logoView");
        }
        tUrlImageView2.getLayoutParams().height = g.a(180.0f);
        TUrlImageView tUrlImageView3 = this.b;
        if (tUrlImageView3 == null) {
            q.b("logoView");
        }
        tUrlImageView3.setPadding(g.a(37.5f), 0, 0, 0);
        TUrlImageView tUrlImageView4 = this.b;
        if (tUrlImageView4 == null) {
            q.b("logoView");
        }
        tUrlImageView4.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01tWf46u1HCijuHsOXu_!!6000000000722-2-tps-720-720.png");
    }

    private final void eL_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d5ed3f", new Object[]{this});
            return;
        }
        TextView textView = this.c;
        if (textView == null) {
            q.b("nextView");
        }
        textView.setOnClickListener(new c());
        TextView textView2 = this.f26432a;
        if (textView2 == null) {
            q.b("titleView");
        }
        textView2.setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19011));
        TextView textView3 = this.c;
        if (textView3 == null) {
            q.b("nextView");
        }
        textView3.setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_close));
        TUrlImageView tUrlImageView = this.b;
        if (tUrlImageView == null) {
            q.b("logoView");
        }
        tUrlImageView.getLayoutParams().width = g.a(200.0f);
        TUrlImageView tUrlImageView2 = this.b;
        if (tUrlImageView2 == null) {
            q.b("logoView");
        }
        tUrlImageView2.setPadding(g.a(25.5f), 0, 0, 0);
        TUrlImageView tUrlImageView3 = this.b;
        if (tUrlImageView3 == null) {
            q.b("logoView");
        }
        tUrlImageView3.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01bWd6Op1u7TDJOaew5_!!6000000005990-2-tps-800-720.png");
    }
}

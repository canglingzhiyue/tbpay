package com.taobao.search.jarvis.rcmd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.hto;
import tb.htp;
import tb.iuf;
import tb.kge;

/* loaded from: classes7.dex */
public final class f extends iuf<FrameLayout, hto> implements htp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f19069a;
    private View b;
    private TextView c;
    private boolean d;

    /* loaded from: classes7.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (!f.a(f.this)) {
            } else {
                f.this.q().b();
            }
        }
    }

    static {
        kge.a(-1017881888);
        kge.a(2007911709);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ boolean a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83b9dce8", new Object[]{fVar})).booleanValue() : fVar.d;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.FrameLayout, java.lang.Object] */
    @Override // tb.iuj
    public /* synthetic */ FrameLayout b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : e();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.widget.FrameLayout, java.lang.Object] */
    @Override // tb.iuj
    public /* synthetic */ FrameLayout b(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c01d4bb4", new Object[]{this, context, viewGroup}) : a(context, viewGroup);
    }

    @Override // tb.htp
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        String a2 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16670);
        q.a((Object) a2, "Localization.localizedSt….taobao_app_1005_1_16670)");
        a(a2);
        this.d = false;
    }

    @Override // tb.htp
    public void cY_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("123876d0", new Object[]{this});
            return;
        }
        String a2 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16677);
        q.a((Object) a2, "Localization.localizedSt….taobao_app_1005_1_16677)");
        a(a2);
        this.d = true;
    }

    private final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        View view = this.b;
        if (view == null) {
            q.b("progressBar");
        }
        view.setVisibility(8);
        TextView textView = this.c;
        if (textView == null) {
            q.b("textView");
        }
        textView.setVisibility(0);
        TextView textView2 = this.c;
        if (textView2 == null) {
            q.b("textView");
        }
        textView2.setText(str);
    }

    @Override // tb.htp
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        View view = this.b;
        if (view == null) {
            q.b("progressBar");
        }
        view.setVisibility(0);
        TextView textView = this.c;
        if (textView == null) {
            q.b("textView");
        }
        textView.setVisibility(4);
        this.d = false;
    }

    @Override // tb.htp
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            FrameLayout frameLayout = this.f19069a;
            if (frameLayout == null) {
                q.b("rootView");
            }
            frameLayout.setVisibility(0);
        } else {
            i = 4;
        }
        View view = this.b;
        if (view == null) {
            q.b("progressBar");
        }
        view.setVisibility(i);
        TextView textView = this.c;
        if (textView == null) {
            q.b("textView");
        }
        textView.setVisibility(i);
    }

    public FrameLayout a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("8d96acda", new Object[]{this, context, viewGroup});
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.sf_tbsearch_ms_footer, viewGroup, false);
        if (inflate == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f19069a = (FrameLayout) inflate;
        FrameLayout frameLayout = this.f19069a;
        if (frameLayout == null) {
            q.b("rootView");
        }
        View findViewById = frameLayout.findViewById(R.id.loading_progress_bar);
        q.a((Object) findViewById, "rootView.findViewById(R.id.loading_progress_bar)");
        this.b = findViewById;
        FrameLayout frameLayout2 = this.f19069a;
        if (frameLayout2 == null) {
            q.b("rootView");
        }
        View findViewById2 = frameLayout2.findViewById(R.id.tv_content);
        q.a((Object) findViewById2, "rootView.findViewById(R.id.tv_content)");
        this.c = (TextView) findViewById2;
        FrameLayout frameLayout3 = this.f19069a;
        if (frameLayout3 == null) {
            q.b("rootView");
        }
        frameLayout3.setOnClickListener(new a());
        FrameLayout frameLayout4 = this.f19069a;
        if (frameLayout4 == null) {
            q.b("rootView");
        }
        return frameLayout4;
    }

    public FrameLayout e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("67541aed", new Object[]{this});
        }
        FrameLayout frameLayout = this.f19069a;
        if (frameLayout == null) {
            q.b("rootView");
        }
        return frameLayout;
    }
}

package com.etao.feimagesearch.newresult.widget.titlebar;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.newresult.widget.preview.a;
import com.etao.feimagesearch.newresult.widget.titlebar.c;
import com.etao.feimagesearch.result.d;
import com.etao.feimagesearch.view.ContentOffsetView;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.LinkedList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.cox;
import tb.hon;
import tb.igi;
import tb.kge;

/* loaded from: classes3.dex */
public final class g extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ContentOffsetView f6876a;
    private TUrlImageView b;
    private TUrlImageView c;
    private TextView d;
    private final int e;
    private boolean f;

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
            c.a eG_ = g.this.eG_();
            if (eG_ != null) {
                eG_.t();
            }
            cox.a("Page_PhotoSearchResult", "clickBackBtn", "pssource", g.this.m().r());
        }
    }

    static {
        kge.a(-269639959);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void a(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ec1379", new Object[]{this, rectF});
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void a(RectF rectF, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8970e7b", new Object[]{this, rectF, new Boolean(z)});
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void a(List<a.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void a(List<a.b> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a074ca", new Object[]{this, list, new Integer(i)});
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public int b(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee3bf7ed", new Object[]{this, rectF})).intValue();
        }
        return -1;
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void eC_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("567a4fa8", new Object[]{this});
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void eD_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("582f2847", new Object[]{this});
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public boolean eE_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59e400ea", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public Bitmap eF_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d8e22963", new Object[]{this});
        }
        return null;
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        }
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public LinkedList<d> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("60f0e959", new Object[]{this});
        }
        return null;
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue();
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, com.etao.feimagesearch.view.ContentOffsetView] */
    @Override // tb.igj
    public /* synthetic */ ContentOffsetView k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ff4fb734", new Object[]{this}) : a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Activity activity, hon parent, IrpDatasource irpDatasource, igi setter) {
        super(activity, parent, irpDatasource, setter);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(irpDatasource, "irpDatasource");
        q.c(setter, "setter");
        this.e = j.a(51.0f);
        this.f = q();
    }

    public ContentOffsetView a() {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentOffsetView) ipChange.ipc$dispatch("e3cb5c43", new Object[]{this});
        }
        View inflate = LayoutInflater.from(g()).inflate(R.layout.feis_irp_titlebar_text_2024, P(), false);
        if (inflate == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.etao.feimagesearch.view.ContentOffsetView");
        }
        this.f6876a = (ContentOffsetView) inflate;
        ContentOffsetView contentOffsetView = this.f6876a;
        if (contentOffsetView == null) {
            q.b("mRootView");
        }
        View findViewById = contentOffsetView.findViewById(R.id.tiv_scan_hint);
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById;
        tUrlImageView.setImageUrl(this.f ? "https://gw.alicdn.com/imgextra/i1/O1CN01G0d6mE1rQlEVY7dMZ_!!6000000005626-2-tps-500-500.png" : "https://gw.alicdn.com/imgextra/i2/O1CN01MuKMFl1fWSm53sqkF_!!6000000004014-2-tps-500-500.png");
        q.a((Object) findViewById, "mRootView.findViewById<T…-2-tps-500-500.png\"\n    }");
        this.c = tUrlImageView;
        ContentOffsetView contentOffsetView2 = this.f6876a;
        if (contentOffsetView2 == null) {
            q.b("mRootView");
        }
        View findViewById2 = contentOffsetView2.findViewById(R.id.btn_back);
        TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById2;
        q.a((Object) tUrlImageView2, "this");
        tUrlImageView2.setContentDescription(b.a(R.string.taobao_app_1007_close) + (char) 65292 + b.a(R.string.taobao_app_1007_button));
        tUrlImageView2.setOnClickListener(new a());
        tUrlImageView2.setImageUrl(this.f ? "https://gw.alicdn.com/imgextra/i3/O1CN019FT1zf1Cv5D0XeaPJ_!!6000000000142-2-tps-500-500.png" : "https://gw.alicdn.com/imgextra/i1/O1CN012Hy4Xd1DBZSpD0i0o_!!6000000000178-49-tps-500-500.webp");
        q.a((Object) findViewById2, "mRootView.findViewById<T…9-tps-500-500.webp\"\n    }");
        this.b = tUrlImageView2;
        ContentOffsetView contentOffsetView3 = this.f6876a;
        if (contentOffsetView3 == null) {
            q.b("mRootView");
        }
        View findViewById3 = contentOffsetView3.findViewById(R.id.tv_content);
        TextView textView = (TextView) findViewById3;
        if (m().m()) {
            a2 = b.a(R.string.taobao_app_1007_1_18958);
        } else {
            a2 = b.a(R.string.taobao_app_1007_1_19009);
        }
        textView.setText(a2);
        textView.setTextColor(Color.parseColor(this.f ? "#AAAAAA" : "#50607A"));
        textView.setTextSize(1, m().U() ? 19.0f : 16.0f);
        q.a((Object) findViewById3, "mRootView.findViewById<T…de()) 19f else 16f)\n    }");
        this.d = textView;
        ContentOffsetView contentOffsetView4 = this.f6876a;
        if (contentOffsetView4 == null) {
            q.b("mRootView");
        }
        return contentOffsetView4;
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public int eB_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("54c576fc", new Object[]{this})).intValue() : this.e;
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        ContentOffsetView contentOffsetView = this.f6876a;
        if (contentOffsetView == null) {
            q.b("mRootView");
        }
        contentOffsetView.setOffset(i);
    }

    private final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        boolean q = q();
        if (this.f == q) {
            return;
        }
        this.f = q;
        TUrlImageView tUrlImageView = this.c;
        if (tUrlImageView == null) {
            q.b("scanHintIv");
        }
        tUrlImageView.setImageUrl(this.f ? "https://gw.alicdn.com/imgextra/i1/O1CN01G0d6mE1rQlEVY7dMZ_!!6000000005626-2-tps-500-500.png" : "https://gw.alicdn.com/imgextra/i2/O1CN01MuKMFl1fWSm53sqkF_!!6000000004014-2-tps-500-500.png");
        TUrlImageView tUrlImageView2 = this.b;
        if (tUrlImageView2 == null) {
            q.b("closeBtn");
        }
        tUrlImageView2.setImageUrl(this.f ? "https://gw.alicdn.com/imgextra/i3/O1CN019FT1zf1Cv5D0XeaPJ_!!6000000000142-2-tps-500-500.png" : "https://gw.alicdn.com/imgextra/i1/O1CN012Hy4Xd1DBZSpD0i0o_!!6000000000178-49-tps-500-500.webp");
        TextView textView = this.d;
        if (textView == null) {
            q.b("contentTv");
        }
        textView.setTextColor(Color.parseColor(this.f ? "#AAAAAA" : "#11192D"));
    }

    @Override // com.etao.feimagesearch.newresult.widget.titlebar.c
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            i();
        }
    }
}

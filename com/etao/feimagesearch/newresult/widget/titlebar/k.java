package com.etao.feimagesearch.newresult.widget.titlebar;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.result.d;
import com.etao.feimagesearch.ui.CornerImageView;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.android.xsearchplugin.muise.f;
import com.taobao.taobao.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.fhs;
import tb.kge;

/* loaded from: classes3.dex */
public final class k extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f6883a;
    private final CornerImageView b;
    private final ImageView c;
    private final View d;
    private final int e;
    private final Context f;
    private final ViewGroup g;
    private final boolean h;

    static {
        kge.a(-835696024);
    }

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context ctx, ViewGroup parent, boolean z) {
        super(LayoutInflater.from(ctx).inflate(R.layout.feis_view_title_bar_object_2024, parent, false));
        q.c(ctx, "ctx");
        q.c(parent, "parent");
        this.f = ctx;
        this.g = parent;
        this.h = z;
        Context context = this.f;
        this.f6883a = context instanceof f ? ((f) context).g() : false;
        View findViewById = this.itemView.findViewById(R.id.iv_object);
        CornerImageView cornerImageView = (CornerImageView) findViewById;
        cornerImageView.setRadius(j.b(6.5f));
        cornerImageView.setBackgroundColor(Color.parseColor("#222222"));
        q.a((Object) findViewById, "itemView.findViewById<Co…seColor(\"#222222\"))\n    }");
        this.b = cornerImageView;
        View findViewById2 = this.itemView.findViewById(R.id.iv_region_hint);
        q.a((Object) findViewById2, "itemView.findViewById(R.id.iv_region_hint)");
        this.c = (ImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.fl_scan_hint);
        q.a((Object) findViewById3, "itemView.findViewById<View>(R.id.fl_scan_hint)");
        this.d = findViewById3;
        this.e = j.a(fhs.i(this.h));
        this.c.setBackgroundResource(this.f6883a ? R.drawable.feis_ic_region_change_hint_dark : R.drawable.feis_ic_region_change_hint);
        View findViewById4 = this.itemView.findViewById(R.id.view_hint_bg);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(j.b(6.5f));
        gradientDrawable.setColor(Color.parseColor("#9911192D"));
        findViewById4.setBackground(gradientDrawable);
        ((CornerImageView) this.itemView.findViewById(R.id.iv_scan_hint)).setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01MPy4DH1vVZrP9vbtD_!!6000000006178-49-tps-571-571.webp");
    }

    public final void a(d bean) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99421f18", new Object[]{this, bean});
            return;
        }
        q.c(bean, "bean");
        b();
        this.b.setImageBitmap(bean.e);
        if (bean.a()) {
            this.d.setVisibility(0);
            this.c.setVisibility(0);
            View itemView = this.itemView;
            q.a((Object) itemView, "itemView");
            itemView.setContentDescription(b.a(R.string.taobao_app_1007_item_image) + ',' + b.a(R.string.taobao_app_1007_button));
        } else {
            this.d.setVisibility(8);
            if (bean.g) {
                this.itemView.setBackgroundResource(this.h ? R.drawable.feis_ic_header_object_select_single_2024 : R.drawable.feis_ic_header_object_select_2024);
                this.c.setVisibility(8);
                View itemView2 = this.itemView;
                q.a((Object) itemView2, "itemView");
                itemView2.setContentDescription(b.a(R.string.taobao_app_1007_item_image) + ',' + b.a(R.string.taobao_app_1007_selected) + ',' + b.a(R.string.taobao_app_1007_button));
            } else {
                this.itemView.setBackgroundDrawable(null);
                ImageView imageView = this.c;
                if (this.h) {
                    i = 8;
                }
                imageView.setVisibility(i);
                View itemView3 = this.itemView;
                q.a((Object) itemView3, "itemView");
                itemView3.setContentDescription(b.a(R.string.taobao_app_1007_item_image) + ',' + b.a(R.string.taobao_app_1007_button));
            }
        }
        this.itemView.invalidate();
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.e;
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int i = this.e;
        layoutParams2.width = i;
        layoutParams2.height = i;
        int a2 = j.a(fhs.e(this.h));
        layoutParams2.leftMargin = a2;
        layoutParams2.topMargin = a2;
        FrameLayout.LayoutParams layoutParams3 = layoutParams2;
        this.b.setLayoutParams(layoutParams3);
        ViewGroup.LayoutParams layoutParams4 = this.d.getLayoutParams();
        if (layoutParams4 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
        int i2 = this.e;
        layoutParams5.width = i2;
        layoutParams5.height = i2;
        layoutParams5.leftMargin = a2;
        layoutParams5.topMargin = a2;
        this.d.setLayoutParams(layoutParams3);
        View itemView = this.itemView;
        q.a((Object) itemView, "itemView");
        ViewGroup.LayoutParams layoutParams6 = itemView.getLayoutParams();
        layoutParams6.width = j.a(fhs.g(this.h));
        layoutParams6.height = j.a(fhs.h(this.h));
        View itemView2 = this.itemView;
        q.a((Object) itemView2, "itemView");
        itemView2.setLayoutParams(layoutParams6);
    }
}

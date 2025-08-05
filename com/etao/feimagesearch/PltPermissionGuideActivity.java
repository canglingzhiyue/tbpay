package com.etao.feimagesearch;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.com;
import tb.kge;

/* loaded from: classes3.dex */
public final class PltPermissionGuideActivity extends FEISBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

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
            } else {
                PltPermissionGuideActivity.this.finish();
            }
        }
    }

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
                return;
            }
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            Application b = com.b();
            q.a((Object) b, "GlobalAdapter.getCtx()");
            intent.setData(Uri.fromParts("package", b.getPackageName(), null));
            PltPermissionGuideActivity.this.getActivity().startActivity(intent);
            PltPermissionGuideActivity.this.finish();
        }
    }

    static {
        kge.a(-1859193709);
    }

    public static /* synthetic */ Object ipc$super(PltPermissionGuideActivity pltPermissionGuideActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        com.alibaba.android.split.core.splitcompat.j.b(context);
    }

    @Override // com.etao.feimagesearch.FEISBaseActivity, com.etao.feimagesearch.ISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.feis_activity_permission_guide);
        j.INSTANCE.c();
        int b2 = com.taobao.android.searchbaseframe.util.g.b(com.taobao.android.searchbaseframe.util.f.a(getIntent()).get("permissionType"), 0);
        View findViewById = findViewById(R.id.fl_container);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float b3 = com.taobao.android.searchbaseframe.util.j.b(6.5f);
        gradientDrawable.setCornerRadii(new float[]{b3, b3, b3, b3, 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setColor(Color.parseColor("#FFFFFF"));
        findViewById.setBackground(gradientDrawable);
        View findViewById2 = findViewById(R.id.btn_close);
        if (findViewById2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.uikit.extend.feature.view.TUrlImageView");
        }
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById2;
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01zcYkvd21JZ8qUmvWf_!!6000000006964-49-tps-384-384.webp");
        tUrlImageView.setOnClickListener(new a());
        View findViewById3 = findViewById(R.id.tv_title);
        if (findViewById3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) findViewById3).setText(com.alibaba.ability.localization.b.a(b2 == 1 ? R.string.plt_permission_media_guide_title : R.string.plt_permission_camera_guide_title));
        View findViewById4 = findViewById(R.id.tv_content);
        if (findViewById4 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) findViewById4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(com.alibaba.ability.localization.b.a(b2 == 1 ? R.string.plt_permission_media_guide_content : R.string.plt_permission_camera_guide_content));
        int i = 15;
        if (b2 == 1) {
            if (com.alibaba.ability.localization.b.c()) {
                i = 81;
            }
        } else if (com.alibaba.ability.localization.b.c()) {
            i = 71;
        }
        int i2 = 27;
        if (b2 == 1) {
            if (com.alibaba.ability.localization.b.c()) {
                i2 = 114;
            }
        } else if (com.alibaba.ability.localization.b.c()) {
            i2 = 104;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FF6200")), i, i2, 18);
        textView.setText(spannableStringBuilder);
        if (b2 == 1) {
            View findViewById5 = findViewById(R.id.tv_sub_content);
            if (findViewById5 == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView2 = (TextView) findViewById5;
            textView2.setVisibility(0);
            textView2.setText(com.alibaba.ability.localization.b.a(R.string.plt_permission_media_guide_sub_content));
        }
        View findViewById6 = findViewById(R.id.tiv_content);
        if (findViewById6 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.uikit.extend.feature.view.TUrlImageView");
        }
        ((TUrlImageView) findViewById6).setImageUrl(com.alibaba.ability.localization.b.b() ? b2 == 1 ? "https://gw.alicdn.com/imgextra/i1/O1CN016YFQ8s27Dy194VFBP_!!6000000007764-49-tps-1000-1340.webp" : "https://gw.alicdn.com/imgextra/i4/O1CN01OZ8LD91NO4QfH5TX3_!!6000000001559-49-tps-1000-1340.webp" : b2 == 1 ? "https://gw.alicdn.com/imgextra/i2/O1CN011WNN6y1iKVHEGhhKt_!!6000000004394-49-tps-1000-1340.webp" : "https://gw.alicdn.com/imgextra/i1/O1CN01oiDha71Pgy0HUDFRp_!!6000000001871-49-tps-1000-1340.webp");
        View findViewById7 = findViewById(R.id.btn_setting);
        if (findViewById7 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView3 = (TextView) findViewById7;
        textView3.setText(com.alibaba.ability.localization.b.a(R.string.plt_jump_setting_permission));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(Color.parseColor("#FF6200"));
        gradientDrawable2.setCornerRadius(com.taobao.android.searchbaseframe.util.j.b(6.0f));
        textView3.setBackground(gradientDrawable2);
        textView3.setOnClickListener(new b());
    }
}

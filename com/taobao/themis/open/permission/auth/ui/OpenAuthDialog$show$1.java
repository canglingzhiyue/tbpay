package com.taobao.themis.open.permission.auth.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.utils.o;
import com.taobao.themis.open.permission.auth.model.AuthAgreementModel;
import com.taobao.themis.open.permission.auth.model.AuthTextModel;
import com.taobao.themis.utils.k;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.RoundFeature;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class OpenAuthDialog$show$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenAuthDialog$show$1(e eVar) {
        super(0);
        this.this$0 = eVar;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        e eVar = this.this$0;
        if (e.$ipChange.isFinishing()) {
            return;
        }
        e eVar2 = this.this$0;
        View inflate = View.inflate(e.$ipChange, R.layout.tms_dialog_auth, null);
        RecyclerView authRecyclerView = (RecyclerView) inflate.findViewById(R.id.rv_auth_list);
        q.b(authRecyclerView, "authRecyclerView");
        e eVar3 = this.this$0;
        List<AuthTextModel> a2 = e.$ipChange.a();
        if (a2 == null) {
            a2 = p.a();
        }
        authRecyclerView.setAdapter(new g(a2));
        e eVar4 = this.this$0;
        authRecyclerView.setLayoutManager(new LinearLayoutManager(e.$ipChange));
        View findViewById = inflate.findViewById(R.id.layout_auth_positive);
        TextView tvUserProtocol = (TextView) inflate.findViewById(R.id.tv_use_protocol);
        final LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.layout_auth);
        final RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.layout_auth_detail);
        ((ImageView) inflate.findViewById(R.id.iv_detail_back)).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.themis.open.permission.auth.ui.OpenAuthDialog$show$1.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                LinearLayout layoutAuth = linearLayout;
                q.b(layoutAuth, "layoutAuth");
                layoutAuth.setVisibility(0);
                RelativeLayout layoutAuthDetail = relativeLayout;
                q.b(layoutAuthDetail, "layoutAuthDetail");
                layoutAuthDetail.setVisibility(8);
            }
        });
        SpannableString spannableString = new SpannableString("同意《用户授权协议》");
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#131415")), 2, 10, 18);
        q.b(tvUserProtocol, "tvUserProtocol");
        tvUserProtocol.setText(spannableString);
        tvUserProtocol.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.themis.open.permission.auth.ui.OpenAuthDialog$show$1.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                e eVar5 = OpenAuthDialog$show$1.this.this$0;
                List<AuthAgreementModel> e = e.$ipChange.e();
                if (e != null && !e.isEmpty()) {
                    z = false;
                }
                if (z) {
                    return;
                }
                e eVar6 = OpenAuthDialog$show$1.this.this$0;
                e eVar7 = OpenAuthDialog$show$1.this.this$0;
                e eVar8 = OpenAuthDialog$show$1.this.this$0;
                e.a(eVar6, e.$ipChange, e.$ipChange.e());
            }
        });
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.themis.open.permission.auth.ui.OpenAuthDialog$show$1.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                e eVar5 = OpenAuthDialog$show$1.this.this$0;
                AlertDialog alertDialog = e.$ipChange;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                e eVar6 = OpenAuthDialog$show$1.this.this$0;
                b bVar = e.$ipChange;
                e eVar7 = OpenAuthDialog$show$1.this.this$0;
                bVar.a(e.$ipChange);
            }
        });
        inflate.findViewById(R.id.open_auth_btn_grant_cancel).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.themis.open.permission.auth.ui.OpenAuthDialog$show$1.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                e eVar5 = OpenAuthDialog$show$1.this.this$0;
                AlertDialog alertDialog = e.$ipChange;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                e eVar6 = OpenAuthDialog$show$1.this.this$0;
                b bVar = e.$ipChange;
                e eVar7 = OpenAuthDialog$show$1.this.this$0;
                bVar.b(e.$ipChange);
                if (!o.a(e.f(OpenAuthDialog$show$1.this.this$0))) {
                    return;
                }
                e.g(OpenAuthDialog$show$1.this.this$0);
            }
        });
        e.a(this.this$0, new AlertDialog.Builder(e.$ipChange, R.style.tms_wopc_dialog_new).create());
        View findViewById2 = inflate.findViewById(R.id.open_auth_app_icon);
        q.b(findViewById2, "view.findViewById(R.id.open_auth_app_icon)");
        final TUrlImageView tUrlImageView = (TUrlImageView) findViewById2;
        tUrlImageView.addFeature(new RoundFeature());
        e eVar5 = this.this$0;
        tUrlImageView.setImageUrl(e.$ipChange.c());
        View findViewById3 = inflate.findViewById(R.id.open_auth_grant_title);
        q.b(findViewById3, "view.findViewById(R.id.open_auth_grant_title)");
        final TextView textView = (TextView) findViewById3;
        e eVar6 = this.this$0;
        String d = e.$ipChange.d();
        if (d == null) {
            e eVar7 = this.this$0;
            d = e.$ipChange.b();
        }
        textView.setText(d);
        final TextView textView2 = (TextView) inflate.findViewById(R.id.tv_text_hint);
        final LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.grant_layout);
        textView.post(new Runnable() { // from class: com.taobao.themis.open.permission.auth.ui.OpenAuthDialog$show$1.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                LinearLayout grantLayout = linearLayout2;
                q.b(grantLayout, "grantLayout");
                int measuredWidth = grantLayout.getMeasuredWidth();
                TextView mTvHint = textView2;
                q.b(mTvHint, "mTvHint");
                int measuredWidth2 = mTvHint.getMeasuredWidth();
                if (measuredWidth2 == 0) {
                    textView2.measure(-2, -2);
                    TextView mTvHint2 = textView2;
                    q.b(mTvHint2, "mTvHint");
                    measuredWidth2 = mTvHint2.getMeasuredWidth();
                }
                int measuredWidth3 = (measuredWidth - tUrlImageView.getMeasuredWidth()) - measuredWidth2;
                e eVar8 = OpenAuthDialog$show$1.this.this$0;
                textView.setMaxWidth(measuredWidth3 - k.a((Context) e.$ipChange, 45.0f));
            }
        });
        e eVar8 = this.this$0;
        AlertDialog alertDialog = e.$ipChange;
        q.a(alertDialog);
        alertDialog.setCancelable(false);
        e eVar9 = this.this$0;
        AlertDialog alertDialog2 = e.$ipChange;
        q.a(alertDialog2);
        if (alertDialog2.isShowing()) {
            return;
        }
        e eVar10 = this.this$0;
        AlertDialog alertDialog3 = e.$ipChange;
        q.a(alertDialog3);
        alertDialog3.show();
        e eVar11 = this.this$0;
        AlertDialog alertDialog4 = e.$ipChange;
        q.a(alertDialog4);
        Window window = alertDialog4.getWindow();
        if (window != null) {
            window.setContentView(inflate);
        }
        e eVar12 = this.this$0;
        AlertDialog alertDialog5 = e.$ipChange;
        q.a(alertDialog5);
        Window window2 = alertDialog5.getWindow();
        if (window2 != null) {
            window2.setGravity(80);
        }
        e eVar13 = this.this$0;
        AlertDialog alertDialog6 = e.$ipChange;
        q.a(alertDialog6);
        Window window3 = alertDialog6.getWindow();
        if (window3 != null) {
            window3.setWindowAnimations(R.style.tms_wopc_dialog_anim);
        }
        e eVar14 = this.this$0;
        AlertDialog alertDialog7 = e.$ipChange;
        q.a(alertDialog7);
        Window window4 = alertDialog7.getWindow();
        if (window4 == null) {
            return;
        }
        window4.setLayout(-1, -2);
    }
}

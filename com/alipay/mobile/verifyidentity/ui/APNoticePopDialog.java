package com.alipay.mobile.verifyidentity.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.alipay.mobile.verifyidentity.ui.VIDialogButtonListView;
import com.alipay.mobile.verifyidentity.ui.utils.DensityUtil;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.taobao.R;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class APNoticePopDialog extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f6075a;
    private LayoutInflater b;
    private View c;
    private Button d;
    private Button e;
    private APTextView f;
    private APTextView g;
    private CharSequence h;
    private CharSequence i;
    private OnClickPositiveListener j;
    private OnClickNegativeListener k;
    private String l;
    private String m;
    private RelativeLayout n;
    private LinearLayout o;
    private boolean p;
    private boolean q;
    private View r;
    private ScrollView s;

    /* loaded from: classes3.dex */
    public interface OnClickNegativeListener {
        void onClick();
    }

    /* loaded from: classes3.dex */
    public interface OnClickPositiveListener {
        void onClick();
    }

    public static /* synthetic */ Object ipc$super(APNoticePopDialog aPNoticePopDialog, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != -340027132) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.show();
            return null;
        }
    }

    public static /* synthetic */ OnClickPositiveListener access$000(APNoticePopDialog aPNoticePopDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OnClickPositiveListener) ipChange.ipc$dispatch("583ffd97", new Object[]{aPNoticePopDialog}) : aPNoticePopDialog.j;
    }

    public static /* synthetic */ OnClickNegativeListener access$100(APNoticePopDialog aPNoticePopDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OnClickNegativeListener) ipChange.ipc$dispatch("2e3f043a", new Object[]{aPNoticePopDialog}) : aPNoticePopDialog.k;
    }

    public APNoticePopDialog(Context context, CharSequence charSequence, Spanned spanned, String str, String str2) {
        this(context, charSequence, spanned, str, str2, false);
    }

    public APNoticePopDialog(Context context, CharSequence charSequence, Spanned spanned, String str, String str2, boolean z) {
        super(context, R.style.dialog_with_no_title_style_trans_bg);
        this.p = false;
        this.q = false;
        a(context, charSequence, spanned, str, str2, z, null);
    }

    public APNoticePopDialog(Context context, String str, String str2, String str3, String str4, Bundle bundle) {
        this(context, str, str2, str3, str4, false, bundle);
    }

    public APNoticePopDialog(Context context, String str, String str2, String str3, String str4, boolean z) {
        super(context, R.style.dialog_with_no_title_style_trans_bg);
        this.p = false;
        this.q = false;
        a(context, str, str2, str3, str4, z, null);
    }

    public APNoticePopDialog(Context context, String str, String str2, String str3, String str4, boolean z, Bundle bundle) {
        super(context, R.style.dialog_with_no_title_style_trans_bg);
        this.p = false;
        this.q = false;
        a(context, str, str2, str3, str4, z, bundle);
    }

    private void a(Context context, CharSequence charSequence, CharSequence charSequence2, String str, String str2, boolean z, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42c4063c", new Object[]{this, context, charSequence, charSequence2, str, str2, new Boolean(z), bundle});
            return;
        }
        this.f6075a = context;
        this.h = charSequence;
        this.i = charSequence2;
        this.l = str;
        this.m = str2;
        this.b = LayoutInflater.from(context);
        this.p = z;
        if (bundle == null) {
            return;
        }
        this.q = bundle.getBoolean(CommonConstant.alertTextColor);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.c = this.b.inflate(R.layout.notice_new_dialog, (ViewGroup) null);
        this.e = (Button) this.c.findViewById(R.id.ensure);
        this.d = (Button) this.c.findViewById(R.id.cancel);
        this.f = (APTextView) this.c.findViewById(R.id.titleTip);
        this.g = (APTextView) this.c.findViewById(R.id.message);
        this.n = (RelativeLayout) this.c.findViewById(R.id.button_ll);
        this.o = (LinearLayout) this.c.findViewById(R.id.dialog_bg);
        this.r = this.c.findViewById(R.id.viDialogDivider);
        this.s = (ScrollView) this.c.findViewById(R.id.textscroll);
        this.d.setTextColor(Color.parseColor("#333333"));
        this.f.setTextSize(1, 18.0f);
        this.g.setTextSize(1, 15.0f);
        this.g.setTextColor(Color.parseColor("#333333"));
        a(this.f, this.h);
        a(this.g, this.i);
        if (this.g.getVisibility() == 8) {
            this.s.setVisibility(8);
        }
        if (this.f.getVisibility() == 0 && this.g.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.s.getLayoutParams();
            layoutParams.topMargin = 0;
            this.s.setLayoutParams(layoutParams);
        } else if (this.f.getVisibility() == 0 && this.g.getVisibility() == 8) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f.getLayoutParams();
            layoutParams2.bottomMargin = DensityUtil.dip2px(this.f6075a, 20.0f);
            this.f.setLayoutParams(layoutParams2);
        }
        setCanceledOnTouchOutside(this.p);
        if (!StringUtils.isEmpty(this.m) && !StringUtils.isEmpty(this.l)) {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(getContext().getResources().getDimensionPixelSize(R.dimen.vi_model_footer_frontsize));
            float measureText = textPaint.measureText(this.m);
            float measureText2 = textPaint.measureText(this.l);
            float a2 = ((a(this.f6075a) - this.f6075a.getResources().getDimensionPixelSize(R.dimen.notice_dialog_width_margin_window)) - 1) / 2;
            if (measureText > a2 || measureText2 > a2) {
                z = false;
            }
        }
        if (z) {
            if (StringUtils.isEmpty(this.m) && StringUtils.isEmpty(this.l)) {
                this.n.setVisibility(8);
                return;
            }
            this.n.setVisibility(0);
            this.d.setText(this.m);
            if (StringUtils.isEmpty(this.m)) {
                this.d.setVisibility(8);
            }
            this.d.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.ui.APNoticePopDialog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    APNoticePopDialog.this.cancel();
                    if (APNoticePopDialog.access$100(APNoticePopDialog.this) == null) {
                        return;
                    }
                    APNoticePopDialog.access$100(APNoticePopDialog.this).onClick();
                }
            });
            this.e.setText(this.l);
            if (StringUtils.isEmpty(this.l)) {
                this.e.setVisibility(8);
            }
            this.e.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.ui.APNoticePopDialog.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    APNoticePopDialog.this.dismiss();
                    if (APNoticePopDialog.access$000(APNoticePopDialog.this) == null) {
                        return;
                    }
                    APNoticePopDialog.access$000(APNoticePopDialog.this).onClick();
                }
            });
            if (this.e.getVisibility() != 0 || this.d.getVisibility() != 0) {
                return;
            }
            this.r.setVisibility(0);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.l);
        arrayList.add(this.m);
        LinearLayout linearLayout = (LinearLayout) this.c.findViewById(R.id.viDialogOperation);
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        VIDialogButtonListView vIDialogButtonListView = new VIDialogButtonListView(getContext());
        vIDialogButtonListView.setButtonList(arrayList, new VIDialogButtonListView.OnItemClickListener() { // from class: com.alipay.mobile.verifyidentity.ui.APNoticePopDialog.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.ui.VIDialogButtonListView.OnItemClickListener
            public void onClick(View view, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("31a17f61", new Object[]{this, view, new Integer(i)});
                } else if (i == 0) {
                    APNoticePopDialog.this.dismiss();
                    if (APNoticePopDialog.access$000(APNoticePopDialog.this) == null) {
                        return;
                    }
                    APNoticePopDialog.access$000(APNoticePopDialog.this).onClick();
                } else if (i != 1) {
                } else {
                    APNoticePopDialog.this.cancel();
                    if (APNoticePopDialog.access$100(APNoticePopDialog.this) == null) {
                        return;
                    }
                    APNoticePopDialog.access$100(APNoticePopDialog.this).onClick();
                }
            }
        }, this.q);
        linearLayout.addView(vIDialogButtonListView);
    }

    public void setPositiveTextColor(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e575d480", new Object[]{this, colorStateList});
            return;
        }
        Button button = this.e;
        if (button == null || colorStateList == null) {
            return;
        }
        button.setTextColor(colorStateList);
    }

    public void setNegativeTextColor(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd5e91c4", new Object[]{this, colorStateList});
            return;
        }
        Button button = this.d;
        if (button == null || colorStateList == null) {
            return;
        }
        button.setTextColor(colorStateList);
    }

    private static void a(APTextView aPTextView, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("610cbce1", new Object[]{aPTextView, charSequence});
        } else if (StringUtils.isEmpty(charSequence)) {
            aPTextView.setVisibility(8);
        } else {
            aPTextView.setVisibility(0);
            aPTextView.setText(charSequence);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        setContentView(this.c);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = a(this.f6075a) - this.f6075a.getResources().getDimensionPixelSize(R.dimen.notice_dialog_width_margin_window);
        getWindow().setAttributes(attributes);
    }

    public void updateLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7c7485a", new Object[]{this});
            return;
        }
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = a(this.f6075a) - this.f6075a.getResources().getDimensionPixelSize(R.dimen.notice_dialog_width_margin_window);
        getWindow().setAttributes(attributes);
    }

    private static int a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue() : ((WindowManager) context.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getWidth();
    }

    public Button getCancelBtn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("e5795a87", new Object[]{this}) : this.d;
    }

    public Button getEnsureBtn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("e17c7343", new Object[]{this}) : this.e;
    }

    public TextView getTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("680f299d", new Object[]{this}) : this.f;
    }

    public TextView getMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("51c711c6", new Object[]{this}) : this.g;
    }

    public void setPositiveListener(OnClickPositiveListener onClickPositiveListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b71b0f20", new Object[]{this, onClickPositiveListener});
        } else {
            this.j = onClickPositiveListener;
        }
    }

    public void setNegativeListener(OnClickNegativeListener onClickNegativeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539c07a8", new Object[]{this, onClickNegativeListener});
        } else {
            this.k = onClickNegativeListener;
        }
    }

    public LinearLayout getDialogBg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("8529ba81", new Object[]{this}) : this.o;
    }
}

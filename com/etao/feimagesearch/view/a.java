package com.etao.feimagesearch.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.k;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.cox;
import tb.cuj;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_RETAIN_FLAG = "retain:show";

    /* renamed from: a  reason: collision with root package name */
    private final View f7098a;
    private final Handler b;

    static {
        kge.a(-527914968);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1608dcf3", new Object[]{aVar});
        } else {
            aVar.a();
        }
    }

    public static /* synthetic */ Handler b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("fdf82434", new Object[]{aVar}) : aVar.b;
    }

    public a(final Context context) {
        super(context, R.style.popupDialog);
        this.b = new Handler(Looper.getMainLooper()) { // from class: com.etao.feimagesearch.view.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                } else if (message.what != 1) {
                } else {
                    a.a(a.this);
                    cox.a("AutoCloseRetainDialog", new String[0]);
                }
            }
        };
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        this.f7098a = LayoutInflater.from(context).inflate(R.layout.feis_view_retain_dialog, (ViewGroup) null, false);
        a(this.f7098a);
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.etao.feimagesearch.view.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d64de6c3", new Object[]{this, dialogInterface});
                    return;
                }
                a.b(a.this).removeMessages(1);
                a.b(a.this).sendEmptyMessageDelayed(1, 5000L);
                cox.c("PhotoSearchTake", "RetainDialog", new String[0]);
                k.a(context, a.KEY_RETAIN_FLAG, true);
            }
        });
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        getWindow().requestFeature(1);
        setContentView(this.f7098a);
        getWindow().setLayout(-1, -1);
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        ((TUrlImageView) view.findViewById(R.id.iv_background)).setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01ZgKvPl21aVXaRgVZM_!!6000000007001-2-tps-1000-1202.png");
        ((TUrlImageView) view.findViewById(R.id.iv_close)).setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01Rmuu6D1NXE4QHiz8P_!!6000000001579-2-tps-160-160.png");
        SpannableString spannableString = new SpannableString(b.a(R.string.taobao_app_1007_1_19022));
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FF5B00")), 1, 9, 33);
        ((TextView) view.findViewById(R.id.tv_title)).setText(spannableString);
        view.findViewById(R.id.btn_confirm).setOnClickListener(new View.OnClickListener() { // from class: com.etao.feimagesearch.view.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                cox.a("CloseRetainDialog", new String[0]);
                a.a(a.this);
            }
        });
        view.findViewById(R.id.iv_close).setOnClickListener(new View.OnClickListener() { // from class: com.etao.feimagesearch.view.a.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                cox.a("CancelRetainDialog", new String[0]);
                a.this.setOnDismissListener(null);
                a.a(a.this);
            }
        });
        view.setOnClickListener(new View.OnClickListener() { // from class: com.etao.feimagesearch.view.a.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                } else {
                    a.a(a.this);
                }
            }
        });
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        dismiss();
        this.b.removeMessages(1);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : !cuj.b(context, KEY_RETAIN_FLAG, false);
    }
}

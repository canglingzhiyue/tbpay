package com.alipay.android.msp.ui.widget.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.HtmlParse;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.ResUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class FlybirdDialogDoubleBtn extends AlertDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f5071a;
    private String b;
    private String c;
    private String d;
    private DialogInterface.OnClickListener e;
    private DialogInterface.OnClickListener f;
    private TextView g;
    private TextView h;
    private Button i;
    private Button j;
    private LinearLayout k;
    private long l;
    private boolean m;
    private Context n;

    public static /* synthetic */ Object ipc$super(FlybirdDialogDoubleBtn flybirdDialogDoubleBtn, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    public static /* synthetic */ long a(FlybirdDialogDoubleBtn flybirdDialogDoubleBtn) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("50c8f0f9", new Object[]{flybirdDialogDoubleBtn})).longValue() : flybirdDialogDoubleBtn.l;
    }

    public static /* synthetic */ long a(FlybirdDialogDoubleBtn flybirdDialogDoubleBtn, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c855a653", new Object[]{flybirdDialogDoubleBtn, new Long(j)})).longValue();
        }
        flybirdDialogDoubleBtn.l = j;
        return j;
    }

    public static /* synthetic */ DialogInterface.OnClickListener b(FlybirdDialogDoubleBtn flybirdDialogDoubleBtn) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DialogInterface.OnClickListener) ipChange.ipc$dispatch("a374bbc3", new Object[]{flybirdDialogDoubleBtn}) : flybirdDialogDoubleBtn.f;
    }

    public static /* synthetic */ DialogInterface.OnClickListener d(FlybirdDialogDoubleBtn flybirdDialogDoubleBtn) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DialogInterface.OnClickListener) ipChange.ipc$dispatch("3cd10ec5", new Object[]{flybirdDialogDoubleBtn}) : flybirdDialogDoubleBtn.e;
    }

    public static /* synthetic */ Button e(FlybirdDialogDoubleBtn flybirdDialogDoubleBtn) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("919a7fbd", new Object[]{flybirdDialogDoubleBtn}) : flybirdDialogDoubleBtn.j;
    }

    public static /* synthetic */ Button f(FlybirdDialogDoubleBtn flybirdDialogDoubleBtn) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("57c5087e", new Object[]{flybirdDialogDoubleBtn}) : flybirdDialogDoubleBtn.i;
    }

    public static /* synthetic */ LinearLayout g(FlybirdDialogDoubleBtn flybirdDialogDoubleBtn) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("f57c10e2", new Object[]{flybirdDialogDoubleBtn}) : flybirdDialogDoubleBtn.k;
    }

    public static /* synthetic */ String h(FlybirdDialogDoubleBtn flybirdDialogDoubleBtn) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5936094", new Object[]{flybirdDialogDoubleBtn}) : flybirdDialogDoubleBtn.c;
    }

    public FlybirdDialogDoubleBtn(Context context) {
        super(context);
        this.n = context;
        this.m = FlybirdDialogImpl.antDialogEnable(context);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (getWindow() != null) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        setContentView(R.layout.flybird_dialog_double_btn);
        setCancelable(false);
        this.h = (TextView) findViewById(R.id.flybird_dialog_double_btn_title);
        this.g = (TextView) findViewById(R.id.flybird_dialog_double_btn_text);
        this.j = (Button) findViewById(R.id.flybird_dialog_double_left_btn);
        this.i = (Button) findViewById(R.id.flybird_dialog_double_right_btn);
        this.k = (LinearLayout) findViewById(R.id.flybird_dialog_two_btn_layout);
        LogUtil.record(2, "FlybirdDialogDoubleBtn:initializeView", " mLeftBtn" + this.j + " ,mRightBtn" + this.i + " ,buttonContainer=" + this.k);
        a();
        b();
        c();
        d();
        e();
        f();
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            return;
        }
        this.f5071a = str;
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.h == null) {
        } else {
            if (!TextUtils.isEmpty(this.f5071a)) {
                this.h.setVisibility(0);
                CharSequence charSequence = null;
                try {
                    if (this.m) {
                        charSequence = HtmlParse.parseHtml(this.n, this.f5071a);
                    }
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
                TextView textView = this.h;
                if (charSequence == null) {
                    charSequence = this.f5071a;
                }
                textView.setText(charSequence);
                return;
            }
            this.h.setText("");
            this.h.setVisibility(8);
        }
    }

    public void setOneMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38960714", new Object[]{this, str});
            return;
        }
        this.b = str;
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.g == null) {
        } else {
            CharSequence charSequence = null;
            try {
                if (this.m) {
                    charSequence = HtmlParse.parseHtml(this.n, this.b);
                } else {
                    charSequence = Html.fromHtml(this.b);
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
            TextView textView = this.g;
            if (charSequence == null) {
                charSequence = this.b;
            }
            textView.setText(charSequence);
        }
    }

    public void setLeftOnClickText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c62b3e", new Object[]{this, str});
            return;
        }
        this.d = str;
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        LogUtil.record(2, "FlybirdDialogTwoBtn:setLeftOnClickText", "text=" + this.d + ", mBtnConfirm" + this.j + " ,msg=" + this.b);
        if (this.j == null) {
            return;
        }
        CharSequence charSequence = null;
        try {
            if (this.m) {
                charSequence = HtmlParse.parseHtml(this.n, this.d);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        Button button = this.j;
        if (charSequence == null) {
            charSequence = this.d;
        }
        button.setText(charSequence);
    }

    public void setLeftOnClickListener(DialogInterface.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8894cb2", new Object[]{this, onClickListener});
            return;
        }
        this.f = onClickListener;
        d();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        Button button = this.j;
        if (button == null) {
            return;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (System.currentTimeMillis() - FlybirdDialogDoubleBtn.a(FlybirdDialogDoubleBtn.this) < 3000) {
                } else {
                    FlybirdDialogDoubleBtn.a(FlybirdDialogDoubleBtn.this, System.currentTimeMillis());
                    if (FlybirdDialogDoubleBtn.b(FlybirdDialogDoubleBtn.this) != null) {
                        FlybirdDialogDoubleBtn.b(FlybirdDialogDoubleBtn.this).onClick(FlybirdDialogDoubleBtn.this, 0);
                    }
                    FlybirdDialogDoubleBtn.c(FlybirdDialogDoubleBtn.this);
                }
            }
        });
    }

    public void setRightOnClickText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("975ee60d", new Object[]{this, str});
            return;
        }
        this.c = str;
        e();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        LogUtil.record(2, "FlybirdDialogTwoBtn:setRightOnClickText", "text=" + this.c + ", mBtnConfirm" + this.i + " ,msg=" + this.b);
        if (this.i == null) {
            return;
        }
        CharSequence charSequence = null;
        try {
            if (this.m) {
                charSequence = HtmlParse.parseHtml(this.n, this.c);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        Button button = this.i;
        if (charSequence == null) {
            charSequence = this.c;
        }
        button.setText(charSequence);
    }

    public void setRightOnClickListener(DialogInterface.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd04e783", new Object[]{this, onClickListener});
            return;
        }
        this.e = onClickListener;
        f();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        Button button = this.i;
        if (button == null) {
            return;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (System.currentTimeMillis() - FlybirdDialogDoubleBtn.a(FlybirdDialogDoubleBtn.this) < 3000) {
                } else {
                    FlybirdDialogDoubleBtn.a(FlybirdDialogDoubleBtn.this, System.currentTimeMillis());
                    if (FlybirdDialogDoubleBtn.d(FlybirdDialogDoubleBtn.this) != null) {
                        FlybirdDialogDoubleBtn.d(FlybirdDialogDoubleBtn.this).onClick(FlybirdDialogDoubleBtn.this, 1);
                    }
                    FlybirdDialogDoubleBtn.c(FlybirdDialogDoubleBtn.this);
                }
            }
        });
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.widget.dialog.FlybirdDialogDoubleBtn.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if ((FlybirdDialogDoubleBtn.e(FlybirdDialogDoubleBtn.this) != null && FlybirdDialogDoubleBtn.e(FlybirdDialogDoubleBtn.this).getVisibility() != 0) || ((FlybirdDialogDoubleBtn.f(FlybirdDialogDoubleBtn.this) != null && FlybirdDialogDoubleBtn.f(FlybirdDialogDoubleBtn.this).getVisibility() != 0) || ((FlybirdDialogDoubleBtn.g(FlybirdDialogDoubleBtn.this) != null && FlybirdDialogDoubleBtn.g(FlybirdDialogDoubleBtn.this).getVisibility() != 0) || (FlybirdDialogDoubleBtn.g(FlybirdDialogDoubleBtn.this) != null && FlybirdDialogDoubleBtn.g(FlybirdDialogDoubleBtn.this).getHeight() < ResUtils.dip2px(FlybirdDialogDoubleBtn.this.getContext(), 24.0f))))) {
                        Object obj = StatisticCollector.GLOBAL_AGENT;
                        StatisticCollector.addError(obj, ErrorType.WARNING, "DlgDoubleBtnGone", "mRightText=" + FlybirdDialogDoubleBtn.h(FlybirdDialogDoubleBtn.this));
                    }
                    LogUtil.record(2, "FlybirdDialogOneBtn:onAttachedToWindow", "mBtnConfirm=" + FlybirdDialogDoubleBtn.f(FlybirdDialogDoubleBtn.this) + " buttonContainer=" + FlybirdDialogDoubleBtn.g(FlybirdDialogDoubleBtn.this).getVisibility() + " buttonContainer:" + FlybirdDialogDoubleBtn.g(FlybirdDialogDoubleBtn.this).getHeight());
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
        }, 1500L);
    }

    public static /* synthetic */ void c(FlybirdDialogDoubleBtn flybirdDialogDoubleBtn) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("336c1007", new Object[]{flybirdDialogDoubleBtn});
            return;
        }
        try {
            flybirdDialogDoubleBtn.dismiss();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }
}

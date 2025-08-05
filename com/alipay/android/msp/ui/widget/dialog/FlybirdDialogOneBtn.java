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
public class FlybirdDialogOneBtn extends AlertDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f5079a;
    private String b;
    private String c;
    private DialogInterface.OnClickListener d;
    private TextView e;
    private TextView f;
    private Button g;
    private LinearLayout h;
    private Context i;
    private boolean j;
    private long k;

    public static /* synthetic */ Object ipc$super(FlybirdDialogOneBtn flybirdDialogOneBtn, String str, Object... objArr) {
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

    public static /* synthetic */ long a(FlybirdDialogOneBtn flybirdDialogOneBtn) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("730162fe", new Object[]{flybirdDialogOneBtn})).longValue() : flybirdDialogOneBtn.k;
    }

    public static /* synthetic */ long a(FlybirdDialogOneBtn flybirdDialogOneBtn, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed2b74ee", new Object[]{flybirdDialogOneBtn, new Long(j)})).longValue();
        }
        flybirdDialogOneBtn.k = j;
        return j;
    }

    public static /* synthetic */ DialogInterface.OnClickListener b(FlybirdDialogOneBtn flybirdDialogOneBtn) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DialogInterface.OnClickListener) ipChange.ipc$dispatch("28ec3466", new Object[]{flybirdDialogOneBtn}) : flybirdDialogOneBtn.d;
    }

    public static /* synthetic */ Button d(FlybirdDialogOneBtn flybirdDialogOneBtn) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("5170919b", new Object[]{flybirdDialogOneBtn}) : flybirdDialogOneBtn.g;
    }

    public static /* synthetic */ LinearLayout e(FlybirdDialogOneBtn flybirdDialogOneBtn) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("96ba8fdd", new Object[]{flybirdDialogOneBtn}) : flybirdDialogOneBtn.h;
    }

    public static /* synthetic */ String f(FlybirdDialogOneBtn flybirdDialogOneBtn) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("75e9079b", new Object[]{flybirdDialogOneBtn}) : flybirdDialogOneBtn.c;
    }

    public FlybirdDialogOneBtn(Context context) {
        super(context);
        this.i = context;
        this.j = FlybirdDialogImpl.antDialogEnable(context);
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
        setContentView(R.layout.flybird_dialog_one_btn);
        setCancelable(false);
        this.f = (TextView) findViewById(R.id.flybird_dialog_one_btn_title);
        this.e = (TextView) findViewById(R.id.flybird_dialog_one_btn_text);
        this.g = (Button) findViewById(R.id.flybird_dialog_one_btn_confirm);
        this.h = (LinearLayout) findViewById(R.id.flybird_dialog_one_btn_layout);
        LogUtil.record(2, "FlybirdDialogOneBtn:initializeView", " mBtnConfirm" + this.g + " ,buttonContainer=" + this.h);
        a();
        b();
        c();
        d();
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            return;
        }
        this.f5079a = str;
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f == null) {
        } else {
            if (!TextUtils.isEmpty(this.f5079a)) {
                this.f.setVisibility(0);
                CharSequence charSequence = null;
                try {
                    if (this.j) {
                        charSequence = HtmlParse.parseHtml(this.i, this.f5079a);
                    }
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
                TextView textView = this.f;
                if (charSequence == null) {
                    charSequence = this.f5079a;
                }
                textView.setText(charSequence);
                return;
            }
            this.f.setText("");
            this.f.setVisibility(8);
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
        } else if (this.e == null) {
        } else {
            CharSequence charSequence = null;
            try {
                if (this.j) {
                    charSequence = HtmlParse.parseHtml(this.i, this.b);
                } else {
                    charSequence = Html.fromHtml(this.b);
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
            TextView textView = this.e;
            if (charSequence == null) {
                charSequence = this.b;
            }
            textView.setText(charSequence);
        }
    }

    public void setOnClickText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa4bfd85", new Object[]{this, str});
            return;
        }
        this.c = str;
        LogUtil.record(2, "FlybirdDialogOneBtn:setOnClickText", "text=" + str + ", mBtnConfirm" + this.g + " ,msg=" + this.b);
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.g == null) {
        } else {
            CharSequence charSequence = null;
            try {
                if (this.j) {
                    charSequence = HtmlParse.parseHtml(this.i, this.c);
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
            Button button = this.g;
            if (charSequence == null) {
                charSequence = this.c;
            }
            button.setText(charSequence);
        }
    }

    public void setOnClickListener(DialogInterface.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6aadd0b", new Object[]{this, onClickListener});
            return;
        }
        this.d = onClickListener;
        d();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        Button button = this.g;
        if (button == null) {
            return;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.ui.widget.dialog.FlybirdDialogOneBtn.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (System.currentTimeMillis() - FlybirdDialogOneBtn.a(FlybirdDialogOneBtn.this) < 3000) {
                } else {
                    FlybirdDialogOneBtn.a(FlybirdDialogOneBtn.this, System.currentTimeMillis());
                    if (FlybirdDialogOneBtn.b(FlybirdDialogOneBtn.this) != null) {
                        FlybirdDialogOneBtn.b(FlybirdDialogOneBtn.this).onClick(FlybirdDialogOneBtn.this, 0);
                    }
                    FlybirdDialogOneBtn.c(FlybirdDialogOneBtn.this);
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
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.widget.dialog.FlybirdDialogOneBtn.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (FlybirdDialogOneBtn.d(FlybirdDialogOneBtn.this).getVisibility() != 0 || FlybirdDialogOneBtn.e(FlybirdDialogOneBtn.this).getVisibility() != 0 || FlybirdDialogOneBtn.e(FlybirdDialogOneBtn.this).getHeight() < ResUtils.dip2px(FlybirdDialogOneBtn.this.getContext(), 24.0f)) {
                        Object obj = StatisticCollector.GLOBAL_AGENT;
                        StatisticCollector.addError(obj, ErrorType.WARNING, "DlgBtnGone", "text=" + FlybirdDialogOneBtn.f(FlybirdDialogOneBtn.this));
                    }
                    LogUtil.record(2, "FlybirdDialogOneBtn:onAttachedToWindow", "mBtnConfirm=" + FlybirdDialogOneBtn.d(FlybirdDialogOneBtn.this).getVisibility() + " buttonContainer=" + FlybirdDialogOneBtn.e(FlybirdDialogOneBtn.this).getVisibility() + " buttonContainer:" + FlybirdDialogOneBtn.e(FlybirdDialogOneBtn.this).getHeight());
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
        }, 1500L);
    }

    public static /* synthetic */ void c(FlybirdDialogOneBtn flybirdDialogOneBtn) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47607348", new Object[]{flybirdDialogOneBtn});
            return;
        }
        try {
            if (!flybirdDialogOneBtn.isShowing()) {
                return;
            }
            flybirdDialogOneBtn.dismiss();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }
}

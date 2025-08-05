package com.alipay.android.msp.ui.widget.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
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
import java.util.List;

/* loaded from: classes3.dex */
public class FlybirdDialogMultiBtn extends AlertDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f5076a;
    private String b;
    private List<FlybirdDialogEventDesc> c;
    private ViewGroup d;
    private TextView e;
    private TextView f;
    private long g;
    private Context h;
    private boolean i;

    public static /* synthetic */ Object ipc$super(FlybirdDialogMultiBtn flybirdDialogMultiBtn, String str, Object... objArr) {
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

    public static /* synthetic */ long a(FlybirdDialogMultiBtn flybirdDialogMultiBtn) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("68fb991", new Object[]{flybirdDialogMultiBtn})).longValue() : flybirdDialogMultiBtn.g;
    }

    public static /* synthetic */ long a(FlybirdDialogMultiBtn flybirdDialogMultiBtn, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb67f0bb", new Object[]{flybirdDialogMultiBtn, new Long(j)})).longValue();
        }
        flybirdDialogMultiBtn.g = j;
        return j;
    }

    public static /* synthetic */ ViewGroup c(FlybirdDialogMultiBtn flybirdDialogMultiBtn) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("248ef15a", new Object[]{flybirdDialogMultiBtn}) : flybirdDialogMultiBtn.d;
    }

    public FlybirdDialogMultiBtn(Context context) {
        super(context);
        this.h = context;
        this.i = FlybirdDialogImpl.antDialogEnable(this.h);
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
        setContentView(R.layout.flybird_dialog_multi_btn);
        setCancelable(false);
        this.d = (ViewGroup) findViewById(R.id.flybird_dialog_layout);
        this.f = (TextView) findViewById(R.id.flybird_dialog_multi_btn_title);
        this.e = (TextView) findViewById(R.id.flybird_dialog_multi_btn_text);
        b();
        c();
        a();
    }

    private void a() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Context context = getContext();
        int size = this.c.size();
        for (final int i2 = 0; i2 < size; i2++) {
            Button button = new Button(new ContextThemeWrapper(context, R.style.DialogButtonFullLine));
            if (i2 == 0) {
                i = R.drawable.flybird_dialog_button_bg_full_line_first;
            } else if (i2 == size - 1) {
                i = R.drawable.flybird_dialog_button_bg_full_line_last;
            } else {
                i = R.drawable.flybird_dialog_button_bg_full_line_middle;
            }
            button.setBackgroundResource(i);
            int dip2px = ResUtils.dip2px(context, 26.0f);
            int dip2px2 = ResUtils.dip2px(context, 14.0f);
            button.setPadding(dip2px, dip2px2, dip2px, dip2px2);
            button.setGravity(19);
            final FlybirdDialogEventDesc flybirdDialogEventDesc = this.c.get(i2);
            CharSequence charSequence = null;
            try {
                if (this.i) {
                    charSequence = HtmlParse.parseHtml(this.h, flybirdDialogEventDesc.mText);
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
            if (charSequence == null) {
                charSequence = flybirdDialogEventDesc.mText;
            }
            button.setText(charSequence);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.ui.widget.dialog.FlybirdDialogMultiBtn.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (System.currentTimeMillis() - FlybirdDialogMultiBtn.a(FlybirdDialogMultiBtn.this) < 3000) {
                    } else {
                        FlybirdDialogMultiBtn.a(FlybirdDialogMultiBtn.this, System.currentTimeMillis());
                        if (flybirdDialogEventDesc.mListener != null) {
                            flybirdDialogEventDesc.mListener.onClick(FlybirdDialogMultiBtn.this, i2);
                        }
                        FlybirdDialogMultiBtn.b(FlybirdDialogMultiBtn.this);
                    }
                }
            });
            this.d.addView(button, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    public void setOnClickEvents(List<FlybirdDialogEventDesc> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc01cb98", new Object[]{this, list});
        } else {
            this.c = list;
        }
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            return;
        }
        this.f5076a = str;
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f == null) {
        } else {
            if (!TextUtils.isEmpty(this.f5076a)) {
                this.f.setVisibility(0);
                this.f.setVisibility(0);
                CharSequence charSequence = null;
                try {
                    if (this.i) {
                        charSequence = HtmlParse.parseHtml(this.h, this.f5076a);
                    }
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
                TextView textView = this.f;
                if (charSequence == null) {
                    charSequence = this.f5076a;
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
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.e == null) {
        } else {
            CharSequence charSequence = null;
            try {
                if (this.i) {
                    charSequence = HtmlParse.parseHtml(this.h, this.b);
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

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.widget.dialog.FlybirdDialogMultiBtn.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (FlybirdDialogMultiBtn.c(FlybirdDialogMultiBtn.this).getVisibility() == 0 && FlybirdDialogMultiBtn.c(FlybirdDialogMultiBtn.this).getHeight() >= ResUtils.dip2px(FlybirdDialogMultiBtn.this.getContext(), 24.0f)) {
                        return;
                    }
                    StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.WARNING, "DlgMultiBtnGone", "MultiButton");
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
        }, 600L);
    }

    public static /* synthetic */ void b(FlybirdDialogMultiBtn flybirdDialogMultiBtn) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2fdb5fc", new Object[]{flybirdDialogMultiBtn});
            return;
        }
        try {
            flybirdDialogMultiBtn.dismiss();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }
}

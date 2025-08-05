package com.alipay.android.msp.ui.widget.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class ThirdH5PageExitDialog extends AlertDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f5082a;
    private DialogInterface.OnClickListener b;
    private DialogInterface.OnClickListener c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private Button h;
    private Button i;
    private long j;
    private String k;
    private Activity l;

    public static /* synthetic */ Object ipc$super(ThirdH5PageExitDialog thirdH5PageExitDialog, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ long a(ThirdH5PageExitDialog thirdH5PageExitDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a81553f", new Object[]{thirdH5PageExitDialog})).longValue() : thirdH5PageExitDialog.j;
    }

    public static /* synthetic */ long a(ThirdH5PageExitDialog thirdH5PageExitDialog, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45a9cacd", new Object[]{thirdH5PageExitDialog, new Long(j)})).longValue();
        }
        thirdH5PageExitDialog.j = j;
        return j;
    }

    public static /* synthetic */ DialogInterface.OnClickListener b(ThirdH5PageExitDialog thirdH5PageExitDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DialogInterface.OnClickListener) ipChange.ipc$dispatch("d65d34e7", new Object[]{thirdH5PageExitDialog}) : thirdH5PageExitDialog.c;
    }

    public static /* synthetic */ Activity c(ThirdH5PageExitDialog thirdH5PageExitDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("1c92dc3f", new Object[]{thirdH5PageExitDialog}) : thirdH5PageExitDialog.l;
    }

    public static /* synthetic */ DialogInterface.OnClickListener e(ThirdH5PageExitDialog thirdH5PageExitDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DialogInterface.OnClickListener) ipChange.ipc$dispatch("389f9c04", new Object[]{thirdH5PageExitDialog}) : thirdH5PageExitDialog.b;
    }

    public ThirdH5PageExitDialog(Activity activity, String str) {
        super(activity);
        this.k = str;
        this.l = activity;
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        TextView textView;
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
        setContentView(R.layout.third_h5page_exit_dialog);
        setCancelable(false);
        this.d = (TextView) findViewById(R.id.third_h5page_exit_dialog_title);
        this.f = (TextView) findViewById(R.id.third_h5page_exit_dialog_text_top);
        this.g = (TextView) findViewById(R.id.third_h5page_exit_dialog_text_middle);
        this.e = (TextView) findViewById(R.id.third_h5page_exit_dialog_text_bottom);
        this.i = (Button) findViewById(R.id.third_h5page_exit_dialog_left_btn);
        this.h = (Button) findViewById(R.id.third_h5page_exit_dialog_right_btn);
        a();
        if (this.f != null && this.g != null && (textView = this.e) != null) {
            textView.setVisibility(8);
            this.f.setText(LanguageHelper.localizedStringForKey("flybird_thirdwap_tips", getContext().getString(R.string.flybird_thirdwap_tips), new Object[0]));
            if (TextUtils.isEmpty(this.k)) {
                this.f.setText(LanguageHelper.localizedStringForKey("flybird_thirdwap_text", getContext().getString(R.string.flybird_thirdwap_text), new Object[0]));
                this.g.setVisibility(8);
            } else {
                this.f.setText(LanguageHelper.localizedStringForKey("flybird_thirdwap_tips", getContext().getString(R.string.flybird_thirdwap_tips), new Object[0]));
                this.g.setText(this.k);
            }
        }
        EventLogUtil.walletSpmTrack(this.l, "pay", null, "", "a283.b2979.c14592", null, "exposure");
        EventLogUtil.walletSpmTrack(this.l, "pay", null, "", "a283.b2979.c14592.d27158", null, "exposure");
        EventLogUtil.walletSpmTrack(this.l, "pay", null, "", "a283.b2979.c14592.d27159", null, "exposure");
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            return;
        }
        this.f5082a = str;
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.d == null) {
        } else {
            if (!TextUtils.isEmpty(this.f5082a)) {
                this.d.setVisibility(0);
                this.d.setText(this.f5082a);
                return;
            }
            this.d.setText(this.f5082a);
            this.d.setVisibility(8);
        }
    }

    public void setLeftOnClickListener(DialogInterface.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8894cb2", new Object[]{this, onClickListener});
            return;
        }
        this.c = onClickListener;
        Button button = this.i;
        if (button == null) {
            return;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.ui.widget.dialog.ThirdH5PageExitDialog.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (System.currentTimeMillis() - ThirdH5PageExitDialog.a(ThirdH5PageExitDialog.this) < 3000) {
                } else {
                    ThirdH5PageExitDialog.a(ThirdH5PageExitDialog.this, System.currentTimeMillis());
                    if (ThirdH5PageExitDialog.b(ThirdH5PageExitDialog.this) != null) {
                        ThirdH5PageExitDialog.b(ThirdH5PageExitDialog.this).onClick(ThirdH5PageExitDialog.this, 0);
                        EventLogUtil.walletSpmTrack(ThirdH5PageExitDialog.c(ThirdH5PageExitDialog.this), "pay", null, "", "a283.b2979.c14592.d27159", null, "click");
                    }
                    ThirdH5PageExitDialog.d(ThirdH5PageExitDialog.this);
                }
            }
        });
    }

    public void setRightOnClickListener(DialogInterface.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd04e783", new Object[]{this, onClickListener});
            return;
        }
        this.b = onClickListener;
        Button button = this.h;
        if (button == null) {
            return;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.ui.widget.dialog.ThirdH5PageExitDialog.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (System.currentTimeMillis() - ThirdH5PageExitDialog.a(ThirdH5PageExitDialog.this) < 3000) {
                } else {
                    ThirdH5PageExitDialog.a(ThirdH5PageExitDialog.this, System.currentTimeMillis());
                    if (ThirdH5PageExitDialog.e(ThirdH5PageExitDialog.this) != null) {
                        ThirdH5PageExitDialog.e(ThirdH5PageExitDialog.this).onClick(ThirdH5PageExitDialog.this, 1);
                        EventLogUtil.walletSpmTrack(ThirdH5PageExitDialog.c(ThirdH5PageExitDialog.this), "pay", null, "", "a283.b2979.c14592.d27158", null, "click");
                    }
                    ThirdH5PageExitDialog.d(ThirdH5PageExitDialog.this);
                }
            }
        });
    }

    public static /* synthetic */ void d(ThirdH5PageExitDialog thirdH5PageExitDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfcb4a68", new Object[]{thirdH5PageExitDialog});
            return;
        }
        try {
            thirdH5PageExitDialog.dismiss();
            thirdH5PageExitDialog.l = null;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }
}

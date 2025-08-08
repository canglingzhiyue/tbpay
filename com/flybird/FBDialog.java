package com.flybird;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alipay.birdnest.util.FBLogger;
import com.alipay.birdnest.util.ResUtils;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class FBDialog extends FBView implements DialogInterface.OnKeyListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public AlertDialog A;
    public FrameLayout B;
    public LinearLayout C;
    public boolean D;
    public String E;

    public FBDialog(Context context, View view, FBDocument fBDocument) {
        super(context, null, fBDocument);
        this.B = null;
        this.C = null;
        this.D = false;
        FrameLayout frameLayout = new FrameLayout(context);
        this.B = frameLayout;
        this.v.gravity = 17;
        frameLayout.addView(getInnerView());
    }

    public static /* synthetic */ Object ipc$super(FBDialog fBDialog, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1807346616:
                super.updateFunc((String) objArr[0], (String) objArr[1]);
                return null;
            case 663633004:
                super.updateEvent((String) objArr[0], (String) objArr[1]);
                return null;
            case 1244158581:
                super.updateAttr((String) objArr[0], (String) objArr[1]);
                return null;
            case 1852014070:
                super.doDestroy();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            if (!this.A.isShowing()) {
                return;
            }
            Context context = this.A.getContext();
            if (!(context instanceof ContextThemeWrapper) || !(((ContextThemeWrapper) context).getBaseContext() instanceof Activity)) {
                return;
            }
            Activity activity = (Activity) ((ContextThemeWrapper) context).getBaseContext();
            if (activity.isFinishing() || Build.VERSION.SDK_INT <= 17 || activity.isDestroyed()) {
                return;
            }
            this.A.dismiss();
        } catch (Throwable th) {
            FBLogger.e(FBView.TAG, th);
        }
    }

    @Override // com.flybird.FBView
    public void doDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637df6", new Object[]{this});
            return;
        }
        if (this.A != null) {
            d();
            this.A = null;
            this.mDoc.X = null;
        }
        this.B = null;
        this.C = null;
        super.doDestroy();
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (getInnerView() == null || getInnerView().getContext() == null) {
        } else {
            Context context = getInnerView().getContext();
            if (!StringUtils.isEmpty(this.E)) {
                FBLogger.w(FBView.TAG, "showDialog: dlgType is not empty, not for shown. dlgType=" + this.E);
            } else if (this.A != null) {
                if (!(context instanceof Activity) || ((Activity) context).isFinishing() || this.A.isShowing()) {
                    return;
                }
                this.A.show();
            } else {
                if (!(context instanceof Activity)) {
                    Context context2 = this.mDoc.getContext();
                    if (context2 instanceof Activity) {
                        context = context2;
                    }
                }
                LinearLayout linearLayout = new LinearLayout(context);
                this.C = linearLayout;
                linearLayout.setOrientation(1);
                this.C.setId(ResUtils.getId(this.mDoc.k, "dialog_linear_layout"));
                this.B.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
                this.C.addView(this.B);
                if (UiUtil.isOppoDevice()) {
                    AlertDialog create = new AlertDialog.Builder(context, 16973940).create();
                    this.A = create;
                    create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                } else {
                    this.A = new AlertDialog.Builder(context).create();
                }
                if (this.D) {
                    this.A.setOnKeyListener(this);
                }
                this.A.setCanceledOnTouchOutside(false);
                this.A.show();
                this.A.getWindow().setSoftInputMode(3);
                this.A.getWindow().clearFlags(131080);
                this.A.getWindow().setLayout(-1, -1);
                this.A.getWindow().setGravity(17);
                this.A.setContentView(this.C);
                this.mDoc.X = this.A;
            }
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("196ae81c", new Object[]{this, dialogInterface, new Integer(i), keyEvent})).booleanValue() : isDestroyed() || onKey(getInnerView(), i, keyEvent);
    }

    @Override // com.flybird.FBView
    public void updateAttr(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a285a75", new Object[]{this, str, str2});
        } else if (str == null || isDestroyed()) {
        } else {
            super.updateAttr(str, str2);
            if (!str.equals("type")) {
                return;
            }
            this.E = str2;
        }
    }

    @Override // com.flybird.FBView
    public void updateEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("278e3c6c", new Object[]{this, str, str2});
            return;
        }
        super.updateEvent(str, str2);
        if (!StringUtils.equals(str, "event") || !StringUtils.equals(str2, "onkeydown")) {
            return;
        }
        this.D = true;
        AlertDialog alertDialog = this.A;
        if (alertDialog == null) {
            return;
        }
        alertDialog.setOnKeyListener(this);
    }

    @Override // com.flybird.FBView
    public void updateFunc(String str, String str2) {
        AlertDialog alertDialog;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94461448", new Object[]{this, str, str2});
        } else if (str == null || isDestroyed()) {
        } else {
            super.updateFunc(str, str2);
            char c = 65535;
            try {
                int hashCode = str.hashCode();
                if (hashCode != -1920105040) {
                    if (hashCode == 94756344 && str.equals("close")) {
                        c = 1;
                    }
                } else if (str.equals("showModal")) {
                    c = 0;
                }
                if (c == 0) {
                    e();
                } else if (c != 1 || (alertDialog = this.A) == null || !alertDialog.isShowing() || this.C == null || this.B == null || this.mDoc == null) {
                } else {
                    d();
                    this.C.removeView(this.B);
                    this.mDoc.X = null;
                    this.C = null;
                    this.A = null;
                }
            } catch (Throwable th) {
                FBLogger.e(FBView.TAG, th);
            }
        }
    }
}

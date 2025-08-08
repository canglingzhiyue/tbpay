package com.alipay.android.phone.seauthenticator.iotauth.fingerprint;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.PreDataHelper;
import com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog;
import com.alipay.security.mobile.api.AuthenticatorApi;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.util.CommonUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class FpFullViewCompatDialog extends IBiometricValidateNewDialog implements ViewTreeObserver.OnGlobalLayoutListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Rect mAppRect;
    private TextView mBtn;
    private View mClose;
    private Context mContext;
    private Rect mFingerprintRect;
    private View mFpIcon;
    private View mFpRect;
    private boolean mIsDismissed;
    private ViewGroup mLayout;
    private IBiometricValidateNewDialog.IDialogActionListener mListener;
    private ViewGroup mScreen;
    private final Specs mSpecs;
    private TextView mTips;

    /* loaded from: classes3.dex */
    public static class Specs {

        /* renamed from: a  reason: collision with root package name */
        public final int f5195a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;
        public final float l;

        private Specs(Context context) {
            this.l = 0.38f;
            float f = context.getResources().getDisplayMetrics().density;
            this.f5195a = (int) (34.0f * f);
            this.c = (int) (60.0f * f);
            this.e = (int) (13.0f * f);
            int i = (int) (55.0f * f);
            this.d = i;
            this.f = (int) (65.0f * f);
            this.b = i;
            this.g = (int) (f * 47.5d);
            this.h = (int) (10.0f * f);
            int i2 = (int) (20.0f * f);
            this.i = i2;
            this.j = (int) (f * 40.0f);
            this.k = i2;
        }
    }

    public static /* synthetic */ Object ipc$super(FpFullViewCompatDialog fpFullViewCompatDialog, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -340027132:
                super.show();
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ TextView access$1000(FpFullViewCompatDialog fpFullViewCompatDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("bd2104bd", new Object[]{fpFullViewCompatDialog}) : fpFullViewCompatDialog.mTips;
    }

    public static /* synthetic */ Rect access$200(FpFullViewCompatDialog fpFullViewCompatDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("b029c49f", new Object[]{fpFullViewCompatDialog}) : fpFullViewCompatDialog.getFingerprintRect();
    }

    public static /* synthetic */ void access$300(FpFullViewCompatDialog fpFullViewCompatDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d716a735", new Object[]{fpFullViewCompatDialog});
        } else {
            fpFullViewCompatDialog.backupLayout();
        }
    }

    public static /* synthetic */ Rect access$400(FpFullViewCompatDialog fpFullViewCompatDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("277c20dd", new Object[]{fpFullViewCompatDialog}) : fpFullViewCompatDialog.getAppRect();
    }

    public static /* synthetic */ void access$500(FpFullViewCompatDialog fpFullViewCompatDialog, Rect rect, Rect rect2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("857b7893", new Object[]{fpFullViewCompatDialog, rect, rect2});
        } else {
            fpFullViewCompatDialog.debugLayout(rect, rect2);
        }
    }

    public static /* synthetic */ Specs access$600(FpFullViewCompatDialog fpFullViewCompatDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Specs) ipChange.ipc$dispatch("b0e739d", new Object[]{fpFullViewCompatDialog}) : fpFullViewCompatDialog.mSpecs;
    }

    public static /* synthetic */ void access$700(FpFullViewCompatDialog fpFullViewCompatDialog, Rect rect, Rect rect2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62c7ad1", new Object[]{fpFullViewCompatDialog, rect, rect2});
        } else {
            fpFullViewCompatDialog.regularLayout(rect, rect2);
        }
    }

    public static /* synthetic */ IBiometricValidateNewDialog.IDialogActionListener access$800(FpFullViewCompatDialog fpFullViewCompatDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBiometricValidateNewDialog.IDialogActionListener) ipChange.ipc$dispatch("fecf4fc5", new Object[]{fpFullViewCompatDialog}) : fpFullViewCompatDialog.mListener;
    }

    public static /* synthetic */ boolean access$900(FpFullViewCompatDialog fpFullViewCompatDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1fe0373", new Object[]{fpFullViewCompatDialog})).booleanValue() : fpFullViewCompatDialog.mIsDismissed;
    }

    public FpFullViewCompatDialog(Context context) {
        super(context, R.style.bio_TransparentTheme);
        this.mSpecs = new Specs(context);
        this.mContext = context;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        setContentView(R.layout.fp_auth_compat_dialog_layout);
        window.setLayout(-1, -1);
        if (Build.VERSION.SDK_INT >= 29) {
            window.getDecorView().setForceDarkAllowed(false);
        }
        this.mScreen = (ViewGroup) findViewById(R.id.screen);
        this.mLayout = (ViewGroup) findViewById(R.id.layout);
        this.mClose = findViewById(R.id.close);
        this.mFpRect = findViewById(R.id.fp_rect);
        this.mBtn = (TextView) findViewById(R.id.btn);
        this.mTips = (TextView) findViewById(R.id.tips);
        this.mFpIcon = findViewById(R.id.fp_icon);
        this.mFpRect.setVisibility(8);
        this.mLayout.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.mLayout.requestFocus();
        this.mLayout.requestFocusFromTouch();
        setCancelable(false);
        resetLayout();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        Window window = getWindow();
        if (window == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            window.getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        } else {
            window.getDecorView().getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    private void resetLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50e5bd60", new Object[]{this});
        } else {
            waitForLaidOut(this.mScreen, new Callback() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewCompatDialog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewCompatDialog.Callback
                public void onLaidOut(boolean z) {
                    Rect access$200;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3ffaa18e", new Object[]{this, new Boolean(z)});
                    } else if (!z || (access$200 = FpFullViewCompatDialog.access$200(FpFullViewCompatDialog.this)) == null) {
                        FpFullViewCompatDialog.access$300(FpFullViewCompatDialog.this);
                    } else {
                        Rect access$400 = FpFullViewCompatDialog.access$400(FpFullViewCompatDialog.this);
                        FpFullViewCompatDialog.access$500(FpFullViewCompatDialog.this, access$400, access$200);
                        if (!access$400.contains(access$200) || Math.abs(access$400.centerX() - access$200.centerX()) >= FpFullViewCompatDialog.access$600(FpFullViewCompatDialog.this).k) {
                            FpFullViewCompatDialog.access$300(FpFullViewCompatDialog.this);
                        } else {
                            FpFullViewCompatDialog.access$700(FpFullViewCompatDialog.this, access$400, access$200);
                        }
                    }
                }
            });
        }
    }

    private void regularLayout(Rect rect, Rect rect2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("430c308d", new Object[]{this, rect, rect2});
            return;
        }
        this.mFpIcon.setVisibility(8);
        int height = this.mTips.getHeight();
        if ((rect.height() + rect.top) - rect2.bottom < this.mSpecs.c + height + this.mSpecs.f5195a) {
            this.mLayout.setBackgroundResource(R.drawable.fp_radius_corner_8_top);
            updateLayoutLp(81, rect.width(), (((((height + this.mSpecs.c) + this.mSpecs.f5195a) + this.mSpecs.b) + rect.height()) + rect.top) - rect2.top, 0, 0, 0);
            updateTipsLp(this.mSpecs.c + this.mSpecs.b);
            return;
        }
        Objects.requireNonNull(this.mSpecs);
        if ((rect.height() + rect.top) * 0.38f > (rect2.top - this.mSpecs.d) - this.mSpecs.b) {
            this.mLayout.setBackgroundResource(R.drawable.fp_radius_corner_8);
            updateLayoutLp(49, rect.width() - (this.mSpecs.g << 1), this.mSpecs.f + rect2.height() + this.mSpecs.f5195a + height + this.mSpecs.e + this.mSpecs.b, this.mSpecs.g, this.mSpecs.g, ((((rect2.top - rect.top) - this.mSpecs.f5195a) - height) - this.mSpecs.e) - this.mSpecs.b);
            updateTipsLp(this.mSpecs.e + this.mSpecs.b);
            return;
        }
        this.mLayout.setBackgroundResource(R.drawable.fp_radius_corner_8_top);
        updateLayoutLp(81, rect.width(), (((this.mSpecs.b + this.mSpecs.d) + rect.height()) + rect.top) - rect2.top, 0, 0, 0);
        updateTipsLp(this.mSpecs.b + this.mSpecs.d + rect2.height() + this.mSpecs.f5195a);
    }

    private void backupLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2de6213", new Object[]{this});
            return;
        }
        int height = this.mTips.getHeight();
        this.mFpIcon.setVisibility(0);
        this.mLayout.setBackgroundResource(R.drawable.fp_radius_corner_8);
        updateLayoutLp(17, -1, -2, this.mSpecs.g, this.mSpecs.g, 0);
        updateTipsLp(this.mSpecs.b + this.mSpecs.h + this.mFpIcon.getHeight() + this.mSpecs.i);
        updateFpIconLp(this.mSpecs.b + this.mSpecs.h, this.mSpecs.j + height + this.mSpecs.i);
    }

    private void debugLayout(Rect rect, Rect rect2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef31644", new Object[]{this, rect, rect2});
        } else if (this.mFpRect.getVisibility() != 0) {
        } else {
            updateFpLp(rect2.top - rect.top, rect2.left - rect.left, rect2.width(), rect2.height());
        }
    }

    private void updateLayoutLp(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8deaa9de", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mLayout.getLayoutParams();
        if (layoutParams.gravity == i && layoutParams.width == i2 && layoutParams.height == i3 && layoutParams.leftMargin == i4 && layoutParams.rightMargin == i5 && layoutParams.topMargin == i6) {
            return;
        }
        layoutParams.gravity = i;
        layoutParams.width = i2;
        layoutParams.height = i3;
        layoutParams.leftMargin = i4;
        layoutParams.rightMargin = i5;
        layoutParams.topMargin = i6;
        this.mLayout.setLayoutParams(layoutParams);
    }

    private void updateTipsLp(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fd4177", new Object[]{this, new Integer(i)});
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mTips.getLayoutParams();
        if (layoutParams.topMargin == i) {
            return;
        }
        layoutParams.topMargin = i;
        this.mTips.setLayoutParams(layoutParams);
    }

    private void updateFpLp(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdd3f71e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mFpRect.getLayoutParams();
        if (layoutParams.topMargin == i && layoutParams.leftMargin == i2 && layoutParams.width == i3 && layoutParams.height == i4) {
            return;
        }
        layoutParams.topMargin = i;
        layoutParams.leftMargin = i2;
        layoutParams.width = i3;
        layoutParams.height = i4;
        this.mFpRect.setLayoutParams(layoutParams);
    }

    private void updateFpIconLp(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3dc457", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mFpIcon.getLayoutParams();
        if (layoutParams.topMargin == i && layoutParams.bottomMargin == i2) {
            return;
        }
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i2;
        this.mFpIcon.setLayoutParams(layoutParams);
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog
    public Dialog showDialog(int i, String str, final int i2, IBiometricValidateNewDialog.IDialogActionListener iDialogActionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("fe889eae", new Object[]{this, new Integer(i), str, new Integer(i2), iDialogActionListener});
        }
        if (isShowing()) {
            dismiss();
        }
        super.show();
        this.mListener = iDialogActionListener;
        try {
            if (CommonUtils.isBlank(str)) {
                this.mTips.setText(this.mContext.getString(R.string.fp_auth_start_title));
            } else {
                this.mTips.setText(str);
            }
            this.mClose.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewCompatDialog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (FpFullViewCompatDialog.access$800(FpFullViewCompatDialog.this) != null) {
                        FpFullViewCompatDialog.access$800(FpFullViewCompatDialog.this).onAction(1);
                    }
                    FpFullViewCompatDialog.this.dismiss();
                }
            });
            String clientText = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_TITLE);
            if (!StringUtils.isEmpty(clientText)) {
                this.mTips.setText(clientText);
            }
            String clientText2 = PreDataHelper.getInstance().getClientText(Constants.STRING_AUTH_SWITCH);
            if (!StringUtils.isEmpty(clientText2)) {
                this.mBtn.setText(clientText2);
                i2 = 1;
            } else if (i2 == 1) {
                this.mBtn.setText(this.mContext.getResources().getText(R.string.fp_auth_switch_other));
            } else if (i2 == 3) {
                this.mBtn.setText(this.mContext.getResources().getText(R.string.fp_auth_input_pwd));
            }
            this.mBtn.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewCompatDialog.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    int i3;
                    IBiometricValidateNewDialog.IDialogActionListener access$800;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    int i4 = i2;
                    if (i4 == 1) {
                        if (FpFullViewCompatDialog.access$800(FpFullViewCompatDialog.this) != null && !FpFullViewCompatDialog.access$900(FpFullViewCompatDialog.this)) {
                            access$800 = FpFullViewCompatDialog.access$800(FpFullViewCompatDialog.this);
                            i3 = 4;
                            access$800.onAction(i3);
                        }
                        FpFullViewCompatDialog.this.dismiss();
                    }
                    i3 = 3;
                    if (i4 == 3) {
                        if (FpFullViewCompatDialog.access$800(FpFullViewCompatDialog.this) != null && !FpFullViewCompatDialog.access$900(FpFullViewCompatDialog.this)) {
                            access$800 = FpFullViewCompatDialog.access$800(FpFullViewCompatDialog.this);
                            access$800.onAction(i3);
                        }
                    } else if (FpFullViewCompatDialog.access$800(FpFullViewCompatDialog.this) != null && !FpFullViewCompatDialog.access$900(FpFullViewCompatDialog.this)) {
                        FpFullViewCompatDialog.access$800(FpFullViewCompatDialog.this).onAction(1);
                    }
                    FpFullViewCompatDialog.this.dismiss();
                }
            });
        } catch (Exception e) {
            AuthenticatorLOG.fpInfo(e.toString());
        }
        show();
        return this;
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog
    public void updateMsg(final String str, int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3228a9", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (this.mTips == null || StringUtils.isEmpty(str)) {
        } else {
            this.mTips.postDelayed(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewCompatDialog.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FpFullViewCompatDialog.access$1000(FpFullViewCompatDialog.this).setText(str);
                    FpFullViewCompatDialog.access$1000(FpFullViewCompatDialog.this).setTextColor(i2);
                }
            }, i);
        }
    }

    @Override // com.alipay.android.phone.seauthenticator.iotauth.fingerprint.IBiometricValidateNewDialog
    public void dismiss(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f3d312", new Object[]{this, new Integer(i)});
        } else if (!isShowing()) {
        } else {
            this.mIsDismissed = true;
            this.mTips.postDelayed(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewCompatDialog.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        FpFullViewCompatDialog.this.dismiss();
                    } catch (Exception e) {
                        AuthenticatorLOG.fpInfo(e.toString());
                    }
                }
            }, i);
        }
    }

    private void waitForLaidOut(final View view, final Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4876fd9", new Object[]{this, view, callback});
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger(50);
        view.post(new Runnable() { // from class: com.alipay.android.phone.seauthenticator.iotauth.fingerprint.FpFullViewCompatDialog.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (atomicInteger.decrementAndGet() < 0) {
                    callback.onLaidOut(false);
                } else if (ViewCompat.isLaidOut(view)) {
                    callback.onLaidOut(true);
                } else {
                    view.post(this);
                }
            }
        });
    }

    private Rect getFingerprintRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("1c75c2c2", new Object[]{this});
        }
        if (this.mFingerprintRect == null) {
            try {
                JSONObject jSONObject = new JSONObject(AuthenticatorApi.getFingerprintExtInfo(getContext())).getJSONObject("fullView");
                int i = jSONObject.getInt("startX");
                int i2 = jSONObject.getInt("startY");
                this.mFingerprintRect = new Rect(i, i2, jSONObject.getInt("width") + i, jSONObject.getInt("height") + i2);
            } catch (Throwable unused) {
            }
        }
        return this.mFingerprintRect;
    }

    private Rect getAppRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("8ef9353f", new Object[]{this});
        }
        if (this.mAppRect == null) {
            this.mAppRect = new Rect();
        }
        int[] iArr = new int[2];
        this.mScreen.getLocationOnScreen(iArr);
        this.mAppRect.set(iArr[0], iArr[1], iArr[0] + this.mScreen.getWidth(), iArr[1] + this.mScreen.getHeight());
        return this.mAppRect;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
        } else {
            resetLayout();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public abstract void onLaidOut(boolean z);

        private Callback() {
        }
    }
}

package com.alipay.mobile.verifyidentity.module.password.pay.customized.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface;
import com.alipay.mobile.verifyidentity.module.password.pay.customized.utils.EditTextManager;
import com.alipay.mobile.verifyidentity.module.password.pay.customized.utils.EditTextUtil;
import com.alipay.mobile.verifyidentity.safepaybase.EncryptRandomType;
import com.alipay.mobile.verifyidentity.safepaybase.OnConfirmListener;
import com.alipay.mobile.verifyidentity.ui.APButton;
import com.alipay.mobile.verifyidentity.ui.utils.ResUtils;
import com.alipay.mobile.verifyidentity.ui.utils.SecureAccessibilityDelegate;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class LongPwdInputWidget implements View.OnTouchListener, VISafeInputInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Activity f5922a;
    private int b;
    private APButton e;
    private Drawable h;
    private String k;
    private int n;
    private int o;
    private int p;
    private int q;
    private View c = null;
    private EditText d = null;
    private View.OnFocusChangeListener f = null;
    private OnConfirmListener g = null;
    private boolean i = false;
    private EditTextUtil j = EditTextManager.getEditTextUtils();
    private String l = "";
    private EncryptRandomType m = EncryptRandomType.randomafter;

    public static /* synthetic */ View.OnFocusChangeListener access$000(LongPwdInputWidget longPwdInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnFocusChangeListener) ipChange.ipc$dispatch("8c63dfdf", new Object[]{longPwdInputWidget}) : longPwdInputWidget.f;
    }

    public static /* synthetic */ OnConfirmListener access$100(LongPwdInputWidget longPwdInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OnConfirmListener) ipChange.ipc$dispatch("babfd020", new Object[]{longPwdInputWidget}) : longPwdInputWidget.g;
    }

    public static /* synthetic */ int access$200(LongPwdInputWidget longPwdInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("667eda47", new Object[]{longPwdInputWidget})).intValue() : longPwdInputWidget.b;
    }

    public static /* synthetic */ String access$300(LongPwdInputWidget longPwdInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77d02b0d", new Object[]{longPwdInputWidget}) : longPwdInputWidget.k;
    }

    public static /* synthetic */ String access$400(LongPwdInputWidget longPwdInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("46b7c94e", new Object[]{longPwdInputWidget}) : longPwdInputWidget.l;
    }

    public static /* synthetic */ EncryptRandomType access$500(LongPwdInputWidget longPwdInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EncryptRandomType) ipChange.ipc$dispatch("89724497", new Object[]{longPwdInputWidget}) : longPwdInputWidget.m;
    }

    public static /* synthetic */ EditTextUtil access$600(LongPwdInputWidget longPwdInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditTextUtil) ipChange.ipc$dispatch("4f1f4daa", new Object[]{longPwdInputWidget}) : longPwdInputWidget.j;
    }

    public static /* synthetic */ APButton access$700(LongPwdInputWidget longPwdInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (APButton) ipChange.ipc$dispatch("3e03f7dc", new Object[]{longPwdInputWidget}) : longPwdInputWidget.e;
    }

    public LongPwdInputWidget(Activity activity) {
        this.b = -1;
        this.h = null;
        VerifyLogCat.d("PwdInputAdapter", "进入自定义密码页面");
        this.f5922a = activity;
        this.b = hashCode();
        initView(activity);
        this.h = ResUtils.getPaddingDrawable(-1, R.drawable.input_clean_icon, this.f5922a);
        this.d.setVisibility(0);
        this.d.setAccessibilityDelegate(new SecureAccessibilityDelegate());
        this.d.addTextChangedListener(new TextWatcher() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.customized.ui.LongPwdInputWidget.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                }
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                    return;
                }
                LongPwdInputWidget.access$600(LongPwdInputWidget.this).OnTextChanged(LongPwdInputWidget.access$200(LongPwdInputWidget.this), charSequence.toString(), i, i2, i3);
                if (LongPwdInputWidget.access$700(LongPwdInputWidget.this) != null) {
                    if (TextUtils.isEmpty(charSequence)) {
                        LongPwdInputWidget.access$700(LongPwdInputWidget.this).setEnabled(false);
                    } else {
                        LongPwdInputWidget.access$700(LongPwdInputWidget.this).setEnabled(true);
                    }
                }
                LongPwdInputWidget.access$800(LongPwdInputWidget.this);
            }
        });
    }

    public void initView(Context context) {
        this.c = View.inflate(context, R.layout.safe_pwd_input_widget_long, null);
        this.d = (EditText) this.c.findViewById(R.id.input_et_password);
        this.d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.customized.ui.LongPwdInputWidget.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                } else if (LongPwdInputWidget.access$000(LongPwdInputWidget.this) == null) {
                } else {
                    LongPwdInputWidget.access$000(LongPwdInputWidget.this).onFocusChange(view, z);
                }
            }
        });
        this.d.setSelection(0);
        this.d.setCursorVisible(true);
        EditText editText = this.d;
        if (Build.VERSION.SDK_INT >= 26 && editText != null) {
            try {
                Method method = View.class.getMethod("setImportantForAutofill", Integer.TYPE);
                method.setAccessible(true);
                method.invoke(editText, 8);
            } catch (Throwable th) {
                VerifyLogCat.printStackTraceAndMore(th);
            }
        }
        this.e = (APButton) this.c.findViewById(R.id.button_ok);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.customized.ui.LongPwdInputWidget.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (LongPwdInputWidget.access$100(LongPwdInputWidget.this) == null) {
                } else {
                    LongPwdInputWidget.access$100(LongPwdInputWidget.this).onUserConfirm(LongPwdInputWidget.access$600(LongPwdInputWidget.this).getText(LongPwdInputWidget.access$200(LongPwdInputWidget.this), LongPwdInputWidget.access$300(LongPwdInputWidget.this), LongPwdInputWidget.access$400(LongPwdInputWidget.this), LongPwdInputWidget.access$500(LongPwdInputWidget.this)));
                }
            }
        });
        this.e.setEnabled(false);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (this.i && this.h != null) {
            int width = this.d.getWidth();
            int height = this.d.getHeight();
            int intrinsicWidth = this.h.getIntrinsicWidth();
            int intrinsicHeight = this.h.getIntrinsicHeight();
            this.n = (width - intrinsicWidth) - (intrinsicWidth / 4);
            this.p = (height - intrinsicHeight) / 2;
            this.o = this.n + intrinsicWidth;
            this.q = this.p + intrinsicHeight;
        }
        if (this.n > 0 && this.i) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x >= this.n && x <= this.o && y >= this.p && y <= this.q) {
                if (motionEvent.getAction() == 1) {
                    clearText();
                }
                return true;
            }
        }
        return this.d.onTouchEvent(motionEvent);
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public void setOnConfirmListener(OnConfirmListener onConfirmListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a628919", new Object[]{this, onConfirmListener});
        } else {
            this.g = onConfirmListener;
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public void setNeedConfirmButton(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59e1ee93", new Object[]{this, new Boolean(z)});
        } else if (z) {
        } else {
            this.e.setVisibility(8);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c66528b7", new Object[]{this, onFocusChangeListener});
        } else {
            this.f = onFocusChangeListener;
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else {
            this.d.setOnClickListener(onClickListener);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public void setRsaPublicKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab3d2e9", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public void setEncryptRandomStringAndType(String str, EncryptRandomType encryptRandomType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("950c571d", new Object[]{this, str, encryptRandomType});
            return;
        }
        this.l = str;
        this.m = encryptRandomType;
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public String getEditContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ef64dac0", new Object[]{this}) : this.j.getText(this.b, this.k, this.l, this.m);
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public EditText getEditText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditText) ipChange.ipc$dispatch("b520b203", new Object[]{this}) : this.d;
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public View getContentView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ce219891", new Object[]{this}) : this.c;
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public void clearText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("981ae8a1", new Object[]{this});
            return;
        }
        this.d.setText("");
        this.j.clear(this.b);
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public void setOkButtonText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6af3ace", new Object[]{this, str});
            return;
        }
        APButton aPButton = this.e;
        if (aPButton == null) {
            return;
        }
        aPButton.setText(str);
    }

    public static /* synthetic */ void access$800(LongPwdInputWidget longPwdInputWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4500100e", new Object[]{longPwdInputWidget});
        } else if (!longPwdInputWidget.d.isEnabled()) {
        } else {
            if (!TextUtils.isEmpty(longPwdInputWidget.d.getText()) && longPwdInputWidget.h != null && longPwdInputWidget.d.isFocused()) {
                longPwdInputWidget.i = true;
                longPwdInputWidget.d.setOnTouchListener(longPwdInputWidget);
                longPwdInputWidget.d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, longPwdInputWidget.h, (Drawable) null);
                return;
            }
            longPwdInputWidget.i = false;
            longPwdInputWidget.d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }
}

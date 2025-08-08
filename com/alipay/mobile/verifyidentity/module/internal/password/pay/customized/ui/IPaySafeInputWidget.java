package com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import mtopsdk.common.util.StringUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.utils.EditTextManager;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.utils.EditTextUtil;
import com.alipay.mobile.verifyidentity.safepaybase.EncryptRandomType;
import com.alipay.mobile.verifyidentity.safepaybase.OnConfirmListener;
import com.alipay.mobile.verifyidentity.ui.APButton;
import com.alipay.mobile.verifyidentity.ui.utils.ResUtils;
import com.alipay.mobile.verifyidentity.ui.utils.SecureAccessibilityDelegate;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class IPaySafeInputWidget implements View.OnTouchListener, VISafeInputInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Activity f5906a;
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
    private EditTextUtil j = EditTextManager.getEditStringUtils();
    private String l = "";
    private EncryptRandomType m = EncryptRandomType.randomafter;

    public static /* synthetic */ View.OnFocusChangeListener access$000(IPaySafeInputWidget iPaySafeInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnFocusChangeListener) ipChange.ipc$dispatch("c1167268", new Object[]{iPaySafeInputWidget}) : iPaySafeInputWidget.f;
    }

    public static /* synthetic */ OnConfirmListener access$100(IPaySafeInputWidget iPaySafeInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OnConfirmListener) ipChange.ipc$dispatch("e9e38637", new Object[]{iPaySafeInputWidget}) : iPaySafeInputWidget.g;
    }

    public static /* synthetic */ int access$200(IPaySafeInputWidget iPaySafeInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("42c3f450", new Object[]{iPaySafeInputWidget})).intValue() : iPaySafeInputWidget.b;
    }

    public static /* synthetic */ String access$300(IPaySafeInputWidget iPaySafeInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("87e726e4", new Object[]{iPaySafeInputWidget}) : iPaySafeInputWidget.k;
    }

    public static /* synthetic */ String access$400(IPaySafeInputWidget iPaySafeInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1672a7e5", new Object[]{iPaySafeInputWidget}) : iPaySafeInputWidget.l;
    }

    public static /* synthetic */ EncryptRandomType access$500(IPaySafeInputWidget iPaySafeInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EncryptRandomType) ipChange.ipc$dispatch("e7aa45ae", new Object[]{iPaySafeInputWidget}) : iPaySafeInputWidget.m;
    }

    public static /* synthetic */ EditTextUtil access$600(IPaySafeInputWidget iPaySafeInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditTextUtil) ipChange.ipc$dispatch("79bad3cf", new Object[]{iPaySafeInputWidget}) : iPaySafeInputWidget.j;
    }

    public static /* synthetic */ APButton access$700(IPaySafeInputWidget iPaySafeInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (APButton) ipChange.ipc$dispatch("fb5e6633", new Object[]{iPaySafeInputWidget}) : iPaySafeInputWidget.e;
    }

    public IPaySafeInputWidget(Activity activity) {
        this.b = -1;
        this.h = null;
        VerifyLogCat.d("PwdInputAdapter", "进入自定义密码页面");
        this.f5906a = activity;
        this.b = hashCode();
        initView(activity);
        this.h = ResUtils.getPaddingDrawable(-1, R.drawable.input_clean_icon, this.f5906a);
        this.d.setVisibility(0);
        this.d.setAccessibilityDelegate(new SecureAccessibilityDelegate());
        this.d.addTextChangedListener(new TextWatcher() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.ui.IPaySafeInputWidget.3
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
                IPaySafeInputWidget.access$600(IPaySafeInputWidget.this).OnTextChanged(IPaySafeInputWidget.access$200(IPaySafeInputWidget.this), charSequence.toString(), i, i2, i3);
                if (IPaySafeInputWidget.access$700(IPaySafeInputWidget.this) != null) {
                    if (StringUtils.isEmpty(charSequence)) {
                        IPaySafeInputWidget.access$700(IPaySafeInputWidget.this).setEnabled(false);
                    } else {
                        IPaySafeInputWidget.access$700(IPaySafeInputWidget.this).setEnabled(true);
                    }
                }
                IPaySafeInputWidget.access$800(IPaySafeInputWidget.this);
            }
        });
    }

    public void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        this.c = View.inflate(context, R.layout.ipay_safe_pwd_input_widget_internal, null);
        this.d = (EditText) this.c.findViewById(R.id.input_et_password);
        this.d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.ui.IPaySafeInputWidget.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                } else if (IPaySafeInputWidget.access$000(IPaySafeInputWidget.this) == null) {
                } else {
                    IPaySafeInputWidget.access$000(IPaySafeInputWidget.this).onFocusChange(view, z);
                }
            }
        });
        this.d.setSelection(0);
        this.d.setCursorVisible(true);
        this.e = (APButton) this.c.findViewById(R.id.button_ok);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.ui.IPaySafeInputWidget.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (IPaySafeInputWidget.access$100(IPaySafeInputWidget.this) == null) {
                } else {
                    IPaySafeInputWidget.access$100(IPaySafeInputWidget.this).onUserConfirm(IPaySafeInputWidget.access$600(IPaySafeInputWidget.this).getText(IPaySafeInputWidget.access$200(IPaySafeInputWidget.this), IPaySafeInputWidget.access$300(IPaySafeInputWidget.this), IPaySafeInputWidget.access$400(IPaySafeInputWidget.this), IPaySafeInputWidget.access$500(IPaySafeInputWidget.this)));
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

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void setOnConfirmListener(OnConfirmListener onConfirmListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a628919", new Object[]{this, onConfirmListener});
        } else {
            this.g = onConfirmListener;
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void setNeedConfirmButton(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59e1ee93", new Object[]{this, new Boolean(z)});
        } else if (z) {
        } else {
            this.e.setVisibility(8);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c66528b7", new Object[]{this, onFocusChangeListener});
        } else {
            this.f = onFocusChangeListener;
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else {
            this.d.setOnClickListener(onClickListener);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void setRsaPublicKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab3d2e9", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void setEncryptRandomStringAndType(String str, EncryptRandomType encryptRandomType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("950c571d", new Object[]{this, str, encryptRandomType});
            return;
        }
        this.l = str;
        this.m = encryptRandomType;
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public String getEditContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ef64dac0", new Object[]{this}) : this.j.getText(this.b, this.k, this.l, this.m);
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public EditText getEditText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditText) ipChange.ipc$dispatch("b520b203", new Object[]{this}) : this.d;
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public View getContentView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ce219891", new Object[]{this}) : this.c;
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void clearText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("981ae8a1", new Object[]{this});
            return;
        }
        this.d.setText("");
        this.j.clear(this.b);
    }

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
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

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface
    public void setEditTextHint(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d79e991", new Object[]{this, str});
        } else {
            this.d.setHint(str);
        }
    }

    public static /* synthetic */ void access$800(IPaySafeInputWidget iPaySafeInputWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b30c997", new Object[]{iPaySafeInputWidget});
        } else if (!iPaySafeInputWidget.d.isEnabled()) {
        } else {
            if (!StringUtils.isEmpty(iPaySafeInputWidget.d.getText()) && iPaySafeInputWidget.h != null && iPaySafeInputWidget.d.isFocused()) {
                iPaySafeInputWidget.i = true;
                iPaySafeInputWidget.d.setOnTouchListener(iPaySafeInputWidget);
                iPaySafeInputWidget.d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, iPaySafeInputWidget.h, (Drawable) null);
                return;
            }
            iPaySafeInputWidget.i = false;
            iPaySafeInputWidget.d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }
}

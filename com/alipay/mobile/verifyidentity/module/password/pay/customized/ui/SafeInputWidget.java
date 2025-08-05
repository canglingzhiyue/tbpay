package com.alipay.mobile.verifyidentity.module.password.pay.customized.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface;
import com.alipay.mobile.verifyidentity.module.password.pay.customized.utils.EditTextManager;
import com.alipay.mobile.verifyidentity.module.password.pay.customized.utils.EditTextUtil;
import com.alipay.mobile.verifyidentity.safepaybase.EncryptRandomType;
import com.alipay.mobile.verifyidentity.safepaybase.OnConfirmListener;
import com.alipay.mobile.verifyidentity.ui.utils.ResUtils;
import com.alipay.mobile.verifyidentity.ui.utils.SecureAccessibilityDelegate;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class SafeInputWidget implements View.OnTouchListener, VISafeInputInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Activity f5923a;
    private Button d;
    private boolean h;
    private int i;
    private Drawable m;
    private int n;
    private int o;
    private int p;
    private int q;
    private EditText b = null;
    private SimplePassword c = null;
    private View e = null;
    private EditTextUtil f = EditTextManager.getEditTextUtils();
    private View g = null;
    private OnConfirmListener j = null;
    private View.OnFocusChangeListener k = null;
    private boolean l = false;

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public void setEncryptRandomStringAndType(String str, EncryptRandomType encryptRandomType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("950c571d", new Object[]{this, str, encryptRandomType});
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public void setRsaPublicKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab3d2e9", new Object[]{this, str});
        }
    }

    public static /* synthetic */ int access$000(SafeInputWidget safeInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b556cbdf", new Object[]{safeInputWidget})).intValue() : safeInputWidget.i;
    }

    public static /* synthetic */ EditTextUtil access$100(SafeInputWidget safeInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditTextUtil) ipChange.ipc$dispatch("d2fc3aad", new Object[]{safeInputWidget}) : safeInputWidget.f;
    }

    public static /* synthetic */ Button access$200(SafeInputWidget safeInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("dbf22462", new Object[]{safeInputWidget}) : safeInputWidget.d;
    }

    public static /* synthetic */ View.OnFocusChangeListener access$400(SafeInputWidget safeInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnFocusChangeListener) ipChange.ipc$dispatch("9e73f9b9", new Object[]{safeInputWidget}) : safeInputWidget.k;
    }

    public static /* synthetic */ OnConfirmListener access$500(SafeInputWidget safeInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OnConfirmListener) ipChange.ipc$dispatch("fa78cfa4", new Object[]{safeInputWidget}) : safeInputWidget.j;
    }

    public SafeInputWidget(Activity activity, boolean z) {
        this.h = false;
        this.i = -1;
        this.m = null;
        VerifyLogCat.d("PwdInputAdapter", "进入自定义密码页面");
        this.f5923a = activity;
        this.i = hashCode();
        this.h = z;
        initView(activity);
        if (this.h) {
            this.b.setVisibility(8);
            this.g.findViewById(R.id.common_input_item).setVisibility(8);
            this.c.setVisibility(0);
            this.c.setBizId(this.i);
            return;
        }
        this.m = ResUtils.getPaddingDrawable(-1, R.drawable.input_clean_icon, this.f5923a);
        this.b.setVisibility(0);
        this.b.setAccessibilityDelegate(new SecureAccessibilityDelegate());
        this.c.setVisibility(8);
        this.b.addTextChangedListener(new TextWatcher() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.customized.ui.SafeInputWidget.1
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
                SafeInputWidget.access$100(SafeInputWidget.this).OnTextChanged(SafeInputWidget.access$000(SafeInputWidget.this), charSequence.toString(), i, i2, i3);
                if (SafeInputWidget.access$200(SafeInputWidget.this) != null) {
                    if (TextUtils.isEmpty(charSequence)) {
                        SafeInputWidget.access$200(SafeInputWidget.this).setTextColor(-7829368);
                        SafeInputWidget.access$200(SafeInputWidget.this).setClickable(false);
                    } else {
                        SafeInputWidget.access$200(SafeInputWidget.this).setTextColor(Color.parseColor("#1677ff"));
                        SafeInputWidget.access$200(SafeInputWidget.this).setClickable(true);
                    }
                }
                SafeInputWidget.access$300(SafeInputWidget.this);
            }
        });
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public void setOnConfirmListener(OnConfirmListener onConfirmListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a628919", new Object[]{this, onConfirmListener});
            return;
        }
        this.j = onConfirmListener;
        if (!this.h) {
            return;
        }
        this.c.setmSubmitInterface(this.j);
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public EditText getEditText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("b520b203", new Object[]{this});
        }
        if (this.h) {
            return this.c.getEditText();
        }
        return this.b;
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public View getContentView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ce219891", new Object[]{this}) : this.g;
    }

    public void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        this.g = View.inflate(context, R.layout.custom_safe_pwd_input_widget, null);
        this.b = (EditText) this.g.findViewById(R.id.input_et_password);
        this.b.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.customized.ui.SafeInputWidget.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                } else if (SafeInputWidget.access$400(SafeInputWidget.this) == null) {
                } else {
                    SafeInputWidget.access$400(SafeInputWidget.this).onFocusChange(view, z);
                }
            }
        });
        this.c = (SimplePassword) this.g.findViewById(R.id.spwd_input);
        this.c.setmSubmitInterface(this.j);
        this.d = (Button) this.g.findViewById(R.id.button_ok);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.customized.ui.SafeInputWidget.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (SafeInputWidget.access$500(SafeInputWidget.this) == null) {
                } else {
                    SafeInputWidget.access$500(SafeInputWidget.this).onUserConfirm(SafeInputWidget.access$100(SafeInputWidget.this).getText(SafeInputWidget.access$000(SafeInputWidget.this)));
                }
            }
        });
        this.d.setTextColor(-7829368);
        this.d.setClickable(false);
        this.e = this.g.findViewById(R.id.button_ok_verticalline);
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c66528b7", new Object[]{this, onFocusChangeListener});
        } else if (this.h) {
            this.c.setOnFocusChangeListener(onFocusChangeListener);
        } else {
            this.k = onFocusChangeListener;
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else if (this.h) {
            this.c.setOnClickListener(onClickListener);
        } else {
            this.b.setOnClickListener(onClickListener);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public String getEditContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ef64dac0", new Object[]{this}) : this.f.getText(this.i);
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public void clearText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("981ae8a1", new Object[]{this});
            return;
        }
        if (this.h) {
            this.c.clearText();
        } else {
            this.b.setText("");
        }
        this.f.clear(this.i);
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public void setNeedConfirmButton(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59e1ee93", new Object[]{this, new Boolean(z)});
        } else if (z) {
        } else {
            this.d.setVisibility(8);
            this.e.setVisibility(8);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface
    public void setOkButtonText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6af3ace", new Object[]{this, str});
            return;
        }
        Button button = this.d;
        if (button == null) {
            return;
        }
        button.setText(str);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (this.l && this.m != null) {
            int width = this.b.getWidth();
            int height = this.b.getHeight();
            int intrinsicWidth = this.m.getIntrinsicWidth();
            int intrinsicHeight = this.m.getIntrinsicHeight();
            this.n = (width - intrinsicWidth) - (intrinsicWidth / 4);
            this.p = (height - intrinsicHeight) / 2;
            this.o = this.n + intrinsicWidth;
            this.q = this.p + intrinsicHeight;
        }
        if (this.n > 0 && this.l) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x >= this.n && x <= this.o && y >= this.p && y <= this.q) {
                if (motionEvent.getAction() == 1) {
                    clearText();
                }
                return true;
            }
        }
        return this.b.onTouchEvent(motionEvent);
    }

    public static /* synthetic */ void access$300(SafeInputWidget safeInputWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d6662f", new Object[]{safeInputWidget});
        } else if (!safeInputWidget.b.isEnabled()) {
        } else {
            if (!TextUtils.isEmpty(safeInputWidget.b.getText()) && safeInputWidget.m != null && safeInputWidget.b.isFocused()) {
                safeInputWidget.l = true;
                safeInputWidget.b.setOnTouchListener(safeInputWidget);
                safeInputWidget.b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, safeInputWidget.m, (Drawable) null);
                return;
            }
            safeInputWidget.l = false;
            safeInputWidget.b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }
}

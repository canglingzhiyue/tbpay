package com.alipay.mobile.verifyidentity.safepaybase.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.mobile.verifyidentity.safepaybase.EncryptRandomType;
import com.alipay.mobile.verifyidentity.safepaybase.OnConfirmListener;
import com.alipay.mobile.verifyidentity.safepaybase.TextWatcherListener;
import com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.SecureAccessbilityDelegate;
import com.alipay.mobile.verifyidentity.safepaybase.util.EditTextManager;
import com.alipay.mobile.verifyidentity.safepaybase.util.EditTextUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class SimplePassword extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mBizId;
    private List<ImageView> mBlackPointList;
    private EditText mEditText;
    private String mEncryptRandomString;
    private LinearLayout mLayout;
    private View.OnFocusChangeListener mOnFocusChangeListener;
    private TextWatcherListener mProxyWatcher;
    private String mRsaPublicKey;
    private String mSimplePassword;
    private OnConfirmListener mSubmitInterface;
    private EncryptRandomType mType;
    private EditTextUtil util;

    public static /* synthetic */ Object ipc$super(SimplePassword simplePassword, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ View.OnFocusChangeListener access$000(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnFocusChangeListener) ipChange.ipc$dispatch("beafb5c", new Object[]{simplePassword}) : simplePassword.mOnFocusChangeListener;
    }

    public static /* synthetic */ String access$100(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8358accc", new Object[]{simplePassword}) : simplePassword.mSimplePassword;
    }

    public static /* synthetic */ TextWatcherListener access$1000(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextWatcherListener) ipChange.ipc$dispatch("51ed0885", new Object[]{simplePassword}) : simplePassword.mProxyWatcher;
    }

    public static /* synthetic */ String access$102(SimplePassword simplePassword, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f5c000", new Object[]{simplePassword, str});
        }
        simplePassword.mSimplePassword = str;
        return str;
    }

    public static /* synthetic */ EditText access$200(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditText) ipChange.ipc$dispatch("a159fe44", new Object[]{simplePassword}) : simplePassword.mEditText;
    }

    public static /* synthetic */ void access$300(SimplePassword simplePassword, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec3b5ded", new Object[]{simplePassword, new Integer(i)});
        } else {
            simplePassword.setPointView(i);
        }
    }

    public static /* synthetic */ OnConfirmListener access$400(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OnConfirmListener) ipChange.ipc$dispatch("e14847fe", new Object[]{simplePassword}) : simplePassword.mSubmitInterface;
    }

    public static /* synthetic */ int access$500(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9003654b", new Object[]{simplePassword})).intValue() : simplePassword.mBizId;
    }

    public static /* synthetic */ String access$600(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7f1979a7", new Object[]{simplePassword}) : simplePassword.mRsaPublicKey;
    }

    public static /* synthetic */ String access$700(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7e400906", new Object[]{simplePassword}) : simplePassword.mEncryptRandomString;
    }

    public static /* synthetic */ EncryptRandomType access$800(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EncryptRandomType) ipChange.ipc$dispatch("88416eed", new Object[]{simplePassword}) : simplePassword.mType;
    }

    public static /* synthetic */ EditTextUtil access$900(SimplePassword simplePassword) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditTextUtil) ipChange.ipc$dispatch("a4009f48", new Object[]{simplePassword}) : simplePassword.util;
    }

    public SimplePassword(Context context) {
        super(context);
        this.mBizId = 0;
        this.util = EditTextManager.a();
        this.mRsaPublicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDENksAVqDoz5SMCZq0bsZwE+I3NjrANyTTwUVSf1+ec1PfPB4tiocEpYJFCYju9MIbawR8ivECbUWjpffZq5QllJg+19CB7V5rYGcEnb/M7CS3lFF2sNcRFJUtXUUAqyR3/l7PmpxTwObZ4DLG258dhE2vFlVGXjnuLs+FI2hg4QIDAQAB";
        this.mEncryptRandomString = "";
        this.mType = EncryptRandomType.randomafter;
    }

    public SimplePassword(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mBizId = 0;
        this.util = EditTextManager.a();
        this.mRsaPublicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDENksAVqDoz5SMCZq0bsZwE+I3NjrANyTTwUVSf1+ec1PfPB4tiocEpYJFCYju9MIbawR8ivECbUWjpffZq5QllJg+19CB7V5rYGcEnb/M7CS3lFF2sNcRFJUtXUUAqyR3/l7PmpxTwObZ4DLG258dhE2vFlVGXjnuLs+FI2hg4QIDAQAB";
        this.mEncryptRandomString = "";
        this.mType = EncryptRandomType.randomafter;
        LayoutInflater.from(context).inflate(R.layout.vi_safe_input_simple_password, (ViewGroup) this, true);
        initView();
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.mLayout = (LinearLayout) findViewById(R.id.mini_linSimplePwdComponent);
        this.mBlackPointList = new ArrayList();
        this.mBlackPointList.add((ImageView) findViewById(R.id.mini_spwd_iv_1));
        this.mBlackPointList.add((ImageView) findViewById(R.id.mini_spwd_iv_2));
        this.mBlackPointList.add((ImageView) findViewById(R.id.mini_spwd_iv_3));
        this.mBlackPointList.add((ImageView) findViewById(R.id.mini_spwd_iv_4));
        this.mBlackPointList.add((ImageView) findViewById(R.id.mini_spwd_iv_5));
        this.mBlackPointList.add((ImageView) findViewById(R.id.mini_spwd_iv_6));
        this.mEditText = (EditText) findViewById(R.id.mini_spwd_input);
        this.mEditText.setFocusable(true);
        this.mEditText.addTextChangedListener(new TextWatcherImpl());
        this.mEditText.setInputType(2);
        this.mEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.mEditText.setTypeface(Typeface.MONOSPACE);
        this.mEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.alipay.mobile.verifyidentity.safepaybase.widget.SimplePassword.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                } else if (SimplePassword.access$000(SimplePassword.this) == null) {
                } else {
                    SimplePassword.access$000(SimplePassword.this).onFocusChange(view, z);
                }
            }
        });
        this.mEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.alipay.mobile.verifyidentity.safepaybase.widget.SimplePassword.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i), keyEvent})).booleanValue() : i == 6;
            }
        });
        this.mEditText.setAccessibilityDelegate(new SecureAccessbilityDelegate());
    }

    public void setBizId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ca4090", new Object[]{this, new Integer(i)});
        } else {
            this.mBizId = i;
        }
    }

    /* loaded from: classes3.dex */
    public class TextWatcherImpl implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean b = false;
        private boolean c = false;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        public TextWatcherImpl() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                return;
            }
            try {
                int length = editable.length();
                for (int i = 0; i < length; i++) {
                    if (editable.charAt(i) != '0') {
                        this.b = true;
                        editable.replace(i, i + 1, "0");
                    }
                }
                SimplePassword.access$102(SimplePassword.this, SimplePassword.access$200(SimplePassword.this).getText().toString());
                SimplePassword.access$300(SimplePassword.this, SimplePassword.access$100(SimplePassword.this).length());
                if (SimplePassword.access$100(SimplePassword.this).length() == 6) {
                    if (SimplePassword.access$400(SimplePassword.this) != null && !this.c) {
                        SimplePassword.access$400(SimplePassword.this).onUserConfirm(SimplePassword.access$900(SimplePassword.this).a(SimplePassword.access$500(SimplePassword.this), SimplePassword.access$600(SimplePassword.this), SimplePassword.access$700(SimplePassword.this), SimplePassword.access$800(SimplePassword.this)));
                    }
                    if (this.c) {
                        return;
                    }
                    this.c = true;
                    return;
                }
                this.c = false;
            } catch (Exception unused) {
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            if (!this.b) {
                try {
                    SimplePassword.access$900(SimplePassword.this).a(SimplePassword.access$500(SimplePassword.this), charSequence.toString(), i, i2, i3);
                } catch (Throwable unused) {
                }
                if (SimplePassword.access$1000(SimplePassword.this) != null) {
                    SimplePassword.access$1000(SimplePassword.this).onTextChanged();
                }
            }
            this.b = false;
        }
    }

    public EditText getEditText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditText) ipChange.ipc$dispatch("b520b203", new Object[]{this}) : this.mEditText;
    }

    public void setmSubmitInterface(OnConfirmListener onConfirmListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e2745c", new Object[]{this, onConfirmListener});
        } else {
            this.mSubmitInterface = onConfirmListener;
        }
    }

    private void setPointView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dca96529", new Object[]{this, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < this.mBlackPointList.size(); i2++) {
            if (i2 < i) {
                this.mBlackPointList.get(i2).setVisibility(0);
            } else {
                this.mBlackPointList.get(i2).setVisibility(8);
            }
        }
    }

    public void clearText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("981ae8a1", new Object[]{this});
            return;
        }
        EditText editText = this.mEditText;
        if (editText == null) {
            return;
        }
        editText.setText("");
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else {
            this.mLayout.setOnClickListener(onClickListener);
        }
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c66528b7", new Object[]{this, onFocusChangeListener});
        } else {
            this.mOnFocusChangeListener = onFocusChangeListener;
        }
    }

    public void setTextWatcherListener(TextWatcherListener textWatcherListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff30b6d9", new Object[]{this, textWatcherListener});
        } else {
            this.mProxyWatcher = textWatcherListener;
        }
    }

    public void setRsaPublicKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab3d2e9", new Object[]{this, str});
        } else {
            this.mRsaPublicKey = str;
        }
    }

    public void setEncryptRandomStringAndType(String str, EncryptRandomType encryptRandomType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("950c571d", new Object[]{this, str, encryptRandomType});
            return;
        }
        this.mEncryptRandomString = str;
        this.mType = encryptRandomType;
    }
}

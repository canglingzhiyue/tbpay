package com.alipay.mobile.verifyidentity.safepaybase.widget;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import mtopsdk.common.util.StringUtils;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import com.alipay.mobile.verifyidentity.safepaybase.EncryptRandomType;
import com.alipay.mobile.verifyidentity.safepaybase.OnConfirmListener;
import com.alipay.mobile.verifyidentity.safepaybase.TextWatcherListener;
import com.alipay.mobile.verifyidentity.safepaybase.alikeyboard.SecureAccessbilityDelegate;
import com.alipay.mobile.verifyidentity.safepaybase.util.EditTextManager;
import com.alipay.mobile.verifyidentity.safepaybase.util.EditTextUtil;
import com.alipay.mobile.verifyidentity.safepaybase.util.LogUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class SafeInputWidget implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public EditText f6059a;
    public SimplePassword b;
    public Button c;
    public View d;
    public View f;
    public boolean g;
    public int h;
    public TextWatcherListener n;
    private Activity o;
    private Drawable q;
    private int r;
    private int s;
    private int t;
    private int u;
    public EditTextUtil e = EditTextManager.a();
    public OnConfirmListener i = null;
    public View.OnFocusChangeListener j = null;
    public String k = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDENksAVqDoz5SMCZq0bsZwE+I3NjrANyTTwUVSf1+ec1PfPB4tiocEpYJFCYju9MIbawR8ivECbUWjpffZq5QllJg+19CB7V5rYGcEnb/M7CS3lFF2sNcRFJUtXUUAqyR3/l7PmpxTwObZ4DLG258dhE2vFlVGXjnuLs+FI2hg4QIDAQAB";
    public String l = "";
    public EncryptRandomType m = EncryptRandomType.randomafter;
    private boolean p = false;

    public static /* synthetic */ int a(SafeInputWidget safeInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eeb56c91", new Object[]{safeInputWidget})).intValue() : safeInputWidget.h;
    }

    public static /* synthetic */ EditTextUtil b(SafeInputWidget safeInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditTextUtil) ipChange.ipc$dispatch("6d6221c7", new Object[]{safeInputWidget}) : safeInputWidget.e;
    }

    public static /* synthetic */ TextWatcherListener c(SafeInputWidget safeInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextWatcherListener) ipChange.ipc$dispatch("519b022b", new Object[]{safeInputWidget}) : safeInputWidget.n;
    }

    public static /* synthetic */ Button d(SafeInputWidget safeInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("6ba8872f", new Object[]{safeInputWidget}) : safeInputWidget.c;
    }

    public static /* synthetic */ View.OnFocusChangeListener f(SafeInputWidget safeInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnFocusChangeListener) ipChange.ipc$dispatch("6f529802", new Object[]{safeInputWidget}) : safeInputWidget.j;
    }

    public static /* synthetic */ OnConfirmListener g(SafeInputWidget safeInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OnConfirmListener) ipChange.ipc$dispatch("f6c52b1d", new Object[]{safeInputWidget}) : safeInputWidget.i;
    }

    public static /* synthetic */ String h(SafeInputWidget safeInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43bd5509", new Object[]{safeInputWidget}) : safeInputWidget.k;
    }

    public static /* synthetic */ String i(SafeInputWidget safeInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9e7ddca", new Object[]{safeInputWidget}) : safeInputWidget.l;
    }

    public static /* synthetic */ EncryptRandomType j(SafeInputWidget safeInputWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EncryptRandomType) ipChange.ipc$dispatch("a2966a93", new Object[]{safeInputWidget}) : safeInputWidget.m;
    }

    public SafeInputWidget(Activity activity, boolean z) {
        this.f6059a = null;
        this.b = null;
        this.d = null;
        this.f = null;
        this.g = false;
        this.h = -1;
        this.q = null;
        this.o = activity;
        this.h = hashCode();
        this.g = z;
        LogUtils.a("SafeInputWidget", "init");
        this.f = View.inflate(activity, R.layout.vi_safe_input_widget, null);
        this.f6059a = (EditText) this.f.findViewById(R.id.input_et_password);
        this.f6059a.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.alipay.mobile.verifyidentity.safepaybase.widget.SafeInputWidget.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z2)});
                } else if (SafeInputWidget.f(SafeInputWidget.this) == null) {
                } else {
                    SafeInputWidget.f(SafeInputWidget.this).onFocusChange(view, z2);
                }
            }
        });
        this.b = (SimplePassword) this.f.findViewById(R.id.spwd_input);
        this.b.setmSubmitInterface(this.i);
        this.c = (Button) this.f.findViewById(R.id.button_ok);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.safepaybase.widget.SafeInputWidget.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (SafeInputWidget.g(SafeInputWidget.this) == null) {
                } else {
                    SafeInputWidget.g(SafeInputWidget.this).onUserConfirm(SafeInputWidget.b(SafeInputWidget.this).a(SafeInputWidget.a(SafeInputWidget.this), SafeInputWidget.h(SafeInputWidget.this), SafeInputWidget.i(SafeInputWidget.this), SafeInputWidget.j(SafeInputWidget.this)));
                }
            }
        });
        this.c.setTextColor(-7829368);
        this.c.setClickable(false);
        this.d = this.f.findViewById(R.id.button_ok_verticalline);
        if (this.g) {
            this.f6059a.setVisibility(8);
            this.f.findViewById(R.id.common_input_item).setVisibility(8);
            this.b.setVisibility(0);
            this.b.setBizId(this.h);
            return;
        }
        int i = R.drawable.input_clean_icon;
        Activity activity2 = this.o;
        if (activity2 == null) {
            throw new IllegalArgumentException("Invalid context");
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) activity2.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
        Resources resources = activity2.getResources();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = 320;
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i, options);
        Bitmap createBitmap = Bitmap.createBitmap(decodeResource.getWidth() + ((int) (displayMetrics.density * 6.0f)), decodeResource.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect rect = new Rect(0, 0, decodeResource.getWidth(), decodeResource.getHeight());
        canvas.drawBitmap(decodeResource, rect, rect, (Paint) null);
        this.q = new BitmapDrawable(resources, createBitmap);
        this.f6059a.setVisibility(0);
        this.f6059a.setAccessibilityDelegate(new SecureAccessbilityDelegate());
        this.b.setVisibility(8);
        this.f6059a.addTextChangedListener(new TextWatcher() { // from class: com.alipay.mobile.verifyidentity.safepaybase.widget.SafeInputWidget.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                }
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i2), new Integer(i3), new Integer(i4)});
                }
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i2), new Integer(i3), new Integer(i4)});
                    return;
                }
                SafeInputWidget.b(SafeInputWidget.this).a(SafeInputWidget.a(SafeInputWidget.this), charSequence.toString(), i2, i3, i4);
                if (SafeInputWidget.c(SafeInputWidget.this) != null) {
                    SafeInputWidget.c(SafeInputWidget.this).onTextChanged();
                }
                if (SafeInputWidget.d(SafeInputWidget.this) != null) {
                    if (StringUtils.isEmpty(charSequence)) {
                        SafeInputWidget.d(SafeInputWidget.this).setTextColor(-7829368);
                        SafeInputWidget.d(SafeInputWidget.this).setClickable(false);
                    } else {
                        SafeInputWidget.d(SafeInputWidget.this).setTextColor(Color.parseColor("#108ee9"));
                        SafeInputWidget.d(SafeInputWidget.this).setClickable(true);
                    }
                }
                SafeInputWidget.e(SafeInputWidget.this);
            }
        });
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.g) {
            this.b.clearText();
        } else {
            this.f6059a.setText("");
        }
        this.e.f6058a.remove(Integer.valueOf(this.h));
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (this.p && this.q != null) {
            int width = this.f6059a.getWidth();
            int height = this.f6059a.getHeight();
            int intrinsicWidth = this.q.getIntrinsicWidth();
            int intrinsicHeight = this.q.getIntrinsicHeight();
            this.r = (width - intrinsicWidth) - (intrinsicWidth / 4);
            this.t = (height - intrinsicHeight) / 2;
            this.s = this.r + intrinsicWidth;
            this.u = this.t + intrinsicHeight;
        }
        if (this.r > 0 && this.p) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x >= this.r && x <= this.s && y >= this.t && y <= this.u) {
                if (motionEvent.getAction() == 1) {
                    a();
                }
                return true;
            }
        }
        return this.f6059a.onTouchEvent(motionEvent);
    }

    public static /* synthetic */ void e(SafeInputWidget safeInputWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5879511a", new Object[]{safeInputWidget});
        } else if (!safeInputWidget.f6059a.isEnabled()) {
        } else {
            if (!StringUtils.isEmpty(safeInputWidget.f6059a.getText()) && safeInputWidget.q != null && safeInputWidget.f6059a.isFocused()) {
                safeInputWidget.p = true;
                safeInputWidget.f6059a.setOnTouchListener(safeInputWidget);
                safeInputWidget.f6059a.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, safeInputWidget.q, (Drawable) null);
                return;
            }
            safeInputWidget.p = false;
            safeInputWidget.f6059a.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }
}

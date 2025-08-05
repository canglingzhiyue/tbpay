package com.flybird;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Html;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.NumberKeyListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alipay.android.app.template.FBFocusable;
import com.alipay.android.app.template.HtmlLite;
import com.alipay.android.app.template.TemplateKeyboardService;
import com.alipay.android.app.template.TemplatePasswordService;
import com.alipay.birdnest.platform.Platform;
import com.alipay.birdnest.util.FBLogger;
import com.alipay.birdnest.util.ResUtils;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.ui.engine.friend.a;
import com.taobao.weex.common.Constants;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class FBInput extends FBView implements View.OnFocusChangeListener, FBFocusable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final /* synthetic */ int A = 0;
    public EditText B;
    public CheckBox C;
    public Drawable D;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public String M;
    public String N;
    public boolean O;
    public String P;
    public String Q;
    public String[] R;
    public String S;
    public boolean T;
    public int U;
    public String V;
    public boolean W;

    /* loaded from: classes4.dex */
    public static class DecorViewInfo {

        /* renamed from: a  reason: collision with root package name */
        public View f7157a;
        public boolean b;
    }

    /* loaded from: classes4.dex */
    public static class NumberOnlyKeyListener extends NumberKeyListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static List<Character> f7158a;
        public static char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' '};

        public NumberOnlyKeyListener() {
            if (f7158a == null) {
                f7158a = new ArrayList();
                for (char c : b) {
                    f7158a.add(Character.valueOf(c));
                }
            }
        }

        @Override // android.text.method.NumberKeyListener, android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("cf65d449", new Object[]{this, charSequence, new Integer(i), new Integer(i2), spanned, new Integer(i3), new Integer(i4)});
            }
            String charSequence2 = charSequence.subSequence(i, i2).toString();
            for (char c : charSequence2.toCharArray()) {
                if (!f7158a.contains(Character.valueOf(c))) {
                    return "";
                }
            }
            return charSequence2;
        }

        @Override // android.text.method.NumberKeyListener
        public char[] getAcceptedChars() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (char[]) ipChange.ipc$dispatch("62d75077", new Object[]{this}) : b;
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b38bf4e8", new Object[]{this})).intValue();
            }
            return 2;
        }
    }

    public FBInput(Context context, FBDocument fBDocument) {
        super(context, new FBBorderInput(context), fBDocument);
        this.D = null;
        this.I = false;
        this.J = true;
        this.K = true;
        this.L = "";
        this.M = "";
        this.N = "";
        this.O = false;
        this.P = "";
        this.Q = "";
        this.R = null;
        this.S = null;
        this.T = false;
        this.U = 99;
        this.V = "";
        this.W = false;
        EditText editText = (EditText) getInnerView();
        this.B = editText;
        editText.setBackgroundDrawable(null);
        this.B.setCursorVisible(true);
        this.B.setSingleLine();
        this.B.setHorizontallyScrolling(true);
        this.B.setOnFocusChangeListener(this);
        this.B.setOnClickListener(this);
        this.mDoc.c0 = true;
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(this.B, 0);
        } catch (Throwable th) {
            FBLogger.e(FBView.TAG, th);
        }
        this.D = UiUtil.getPaddingDrawable(-1, ResUtils.getResourceId(context, "template_clean_icon", a.CONTACTS_INFO_NOT_EMPTY_STATUS, "com.alipay.android.app.template"), context);
        f();
        e();
        CheckBox checkBox = new CheckBox(context);
        this.C = checkBox;
        checkBox.setLayoutParams(this.v);
        this.C.setButtonDrawable(new ColorDrawable(0));
        this.C.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.flybird.FBInput.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                } else if (!FBInput.this.K) {
                } else {
                    final String valueOf = String.valueOf(z);
                    FBInput.this.C.post(new Runnable() { // from class: com.flybird.FBInput.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (FBInput.this.mDoc == null) {
                            } else {
                                FBView.nativePlatformOnChange(FBInput.this.mNode, valueOf);
                            }
                        }
                    });
                }
            }
        });
    }

    public static /* synthetic */ Object ipc$super(FBInput fBInput, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1912803358:
                super.onClick((View) objArr[0]);
                return null;
            case -1807346616:
                super.updateFunc((String) objArr[0], (String) objArr[1]);
                return null;
            case -1305055009:
                super.onLoadFinish();
                return null;
            case -1022301035:
                super.updateCSS((String) objArr[0], (String) objArr[1]);
                return null;
            case 371318674:
                super.onFocusChange((View) objArr[0], ((Boolean) objArr[1]).booleanValue());
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

    public final void a(EditText editText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe55bd7", new Object[]{this, editText});
        } else if (this.mDoc == null || this.mDoc.getTemplateKeyboardService() == null) {
        } else {
            UiUtil.disableSystemSoftInput(editText);
        }
    }

    public final DecorViewInfo d() {
        View decorView;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (DecorViewInfo) ipChange.ipc$dispatch("14205b8b", new Object[]{this});
        }
        DecorViewInfo decorViewInfo = new DecorViewInfo();
        if (isDestroyed()) {
            FBLogger.d(FBView.TAG, "页面已经析构了，不该有的异步逻辑");
            return decorViewInfo;
        }
        if (this.mDoc.getShowingDialog() != null && this.mDoc.getShowingDialog().isShowing()) {
            z = true;
        }
        if (!z) {
            decorView = ((Activity) this.mDoc.k).getWindow().getDecorView();
        } else {
            decorView = this.mDoc.getShowingDialog().getWindow().getDecorView();
        }
        decorViewInfo.f7157a = decorView;
        decorViewInfo.b = z;
        return decorViewInfo;
    }

    @Override // com.flybird.FBView
    public void doDestroy() {
        TemplatePasswordService templatePasswordService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637df6", new Object[]{this});
            return;
        }
        if (this.mDoc != null && (templatePasswordService = this.mDoc.Q) != null) {
            templatePasswordService.clear(hashCode());
        }
        super.doDestroy();
        this.B = null;
        this.C = null;
        this.D = null;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        EditText editText = this.B;
        if (editText == null) {
            return;
        }
        editText.setImeOptions(6);
        this.B.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.flybird.FBInput.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i), keyEvent})).booleanValue();
                }
                if (i == 6 && FBInput.this.mDoc != null && FBInput.this.mDoc.mo650getBodyView() != null) {
                    FBView.nativePlatformOnKeyDown(FBInput.this.mNode, 10);
                    if (FBInput.this.mDoc.mo650getBodyView().getInnerView() != null) {
                        if (FBInput.this.mDoc.getDefaultKeyboardService() != null) {
                            FBInput.this.mDoc.getDefaultKeyboardService().hideKeyboard(((Activity) FBInput.this.mDoc.k).getWindow().getDecorView());
                        }
                        textView.clearFocus();
                        return true;
                    }
                }
                return false;
            }
        });
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        EditText editText = this.B;
        if (editText == null) {
            return;
        }
        editText.addTextChangedListener(new TextWatcher() { // from class: com.flybird.FBInput.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                } else if (FBInput.this.isDestroyed()) {
                } else {
                    FBInput fBInput = FBInput.this;
                    if (fBInput.K) {
                        String obj = fBInput.B.getText().toString();
                        if (!TextUtils.equals(obj, FBInput.this.Q)) {
                            FBInput fBInput2 = FBInput.this;
                            fBInput2.Q = obj;
                            FBView.nativePlatformOnInput(fBInput2.mNode, obj);
                        }
                    }
                    FBInput.this.h();
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                }
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                }
            }
        });
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        try {
            getFBDocument().getClass();
        } catch (Exception unused) {
        }
        if (TextUtils.equals("number", this.N)) {
            if (this.mDoc != null && this.mDoc.getTemplateKeyboardService() != null && this.mDoc.getTemplateKeyboardService().getClass().getSimpleName().equals("FlybirdTemplateKeyboardService")) {
                return true;
            }
            return this.T;
        }
        return UiUtil.isUseDefaultKeyboard(this.N, this.P);
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        EditText editText = this.B;
        if (editText == null || !editText.isEnabled() || TextUtils.equals(this.N, UiUtil.INPUT_TYPE_VALUE_PAYSPWD)) {
            return;
        }
        if (!TextUtils.isEmpty(this.B.getText()) && this.D != null && this.B.isFocused()) {
            if (!this.J) {
                return;
            }
            this.I = true;
            this.B.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.D, (Drawable) null);
            return;
        }
        this.I = false;
        this.B.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void i() {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        try {
            if (this.mDoc == null || !getInnerView().isEnabled()) {
                return;
            }
            if (!this.mDoc.S && !g()) {
                DecorViewInfo d = d();
                final View view = d.f7157a;
                final boolean z = d.b;
                boolean z2 = (this.mDoc == null || this.mDoc.getDefaultKeyboardService() == null || !this.mDoc.getDefaultKeyboardService().hideKeyboard(view)) ? false : true;
                final boolean z3 = this.mDoc != null && !z && !this.mDoc.isFullscreen();
                if (!z) {
                    if (this.mDoc != null && this.mDoc.isFullscreen()) {
                        findViewById = this.mDoc.U;
                    } else {
                        findViewById = view.findViewById(16908290);
                    }
                } else {
                    findViewById = view.findViewById(ResUtils.getId(this.mDoc.k, "dialog_linear_layout"));
                }
                final View view2 = findViewById;
                if (this.mDoc != null && !this.mDoc.isOnloadFinish()) {
                    this.B.postDelayed(new Runnable() { // from class: com.flybird.FBInput.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            View view3 = view2;
                            if (!z3) {
                                FBInput fBInput = FBInput.this;
                                View view4 = view;
                                int i = FBInput.A;
                                view3 = fBInput.a(view3, view4);
                            }
                            View view5 = view3;
                            if (FBInput.this.mDoc == null || FBInput.this.mDoc.getTemplateKeyboardService() == null) {
                                return;
                            }
                            TemplateKeyboardService templateKeyboardService = FBInput.this.mDoc.getTemplateKeyboardService();
                            FBInput fBInput2 = FBInput.this;
                            templateKeyboardService.showKeyboard(fBInput2.B, UiUtil.getKeyboardType(fBInput2.N), view, view5, z, 0);
                        }
                    }, 600);
                    return;
                }
                int i = z2 ? 500 : 0;
                View a2 = !z3 ? a(view2, view) : view2;
                if (this.mDoc != null && this.mDoc.getTemplateKeyboardService() != null) {
                    this.mDoc.getTemplateKeyboardService().showKeyboard(this.B, UiUtil.getKeyboardType(this.N), view, a2, z, i);
                }
                if (!UiUtil.isGTP8600()) {
                    return;
                }
                this.B.postDelayed(new Runnable() { // from class: com.flybird.FBInput.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (FBInput.this.mDoc == null || FBInput.this.mDoc.getDefaultKeyboardService() == null) {
                        } else {
                            FBInput.this.mDoc.getDefaultKeyboardService().hideKeyboard(FBInput.this.B);
                        }
                    }
                }, 200L);
                return;
            }
            if (!this.mDoc.S && this.mDoc.getTemplateKeyboardService() != null) {
                this.mDoc.getTemplateKeyboardService().hideKeyboard(d().f7157a);
            }
            int i2 = !this.mDoc.isOnloadFinish() ? 600 : 0;
            if (this.mDoc.getDefaultKeyboardService() == null) {
                return;
            }
            this.mDoc.getDefaultKeyboardService().showKeyboard(this.B, null, null, null, false, i2);
        } catch (Throwable th) {
            FBLogger.e(FBView.TAG, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.flybird.FBView, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r9) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.flybird.FBInput.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r8
            r2 = 1
            r1[r2] = r9
            java.lang.String r9 = "8dfcefe2"
            r0.ipc$dispatch(r9, r1)
            return
        L15:
            boolean r0 = r8.isDestroyed()
            if (r0 == 0) goto L1c
            return
        L1c:
            java.lang.String r0 = r8.N
            java.lang.String r1 = "month"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L76
            java.lang.String r9 = r8.L
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            r0 = -1
            if (r9 != 0) goto L3b
            java.lang.String r9 = r8.L     // Catch: java.lang.Throwable -> L3b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L3b
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L3b
            r3 = r9
            goto L3c
        L3b:
            r3 = -1
        L3c:
            java.lang.String r9 = r8.M
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L50
            java.lang.String r9 = r8.M     // Catch: java.lang.Throwable -> L50
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L50
            int r0 = r9.intValue()     // Catch: java.lang.Throwable -> L50
            r4 = r0
            goto L51
        L50:
            r4 = -1
        L51:
            com.flybird.FBDocument r9 = r8.getFBDocument()
            com.alipay.birdnest.api.BirdNestEngine r9 = r9.getEngine()
            com.alipay.birdnest.api.BirdNestEngine$Config r9 = r9.getConfig()
            com.alipay.birdnest.api.BirdNestEngine$UiWidgetProvider r1 = r9.getUiWidgetProvider()
            com.flybird.FBDocument r9 = r8.mDoc
            android.content.Context r2 = r9.k
            int r5 = r8.U
            java.lang.String r6 = r8.V
            com.flybird.FBInput$6 r7 = new com.flybird.FBInput$6
            r7.<init>()
            android.app.Dialog r9 = r1.createYearMounthPickerDialog(r2, r3, r4, r5, r6, r7)
            r9.show()
            return
        L76:
            java.lang.String r0 = r8.N
            java.lang.String r1 = "checkbox"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L84
            r8.i()
            return
        L84:
            super.onClick(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flybird.FBInput.onClick(android.view.View):void");
    }

    @Override // com.flybird.FBView, android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
        } else if (isDestroyed() || this.mDoc.mRoot.getOpacity() <= 0.1d || !this.mDoc.isOnloadFinish()) {
        } else {
            if (z && view.isEnabled()) {
                try {
                    if (!g() && !this.mDoc.S) {
                        this.mDoc.getTemplateKeyboardService().hideKeyboard(d().f7157a);
                    }
                } catch (Throwable th) {
                    FBLogger.e(FBView.TAG, th);
                    if (isDestroyed()) {
                        return;
                    }
                }
                i();
            }
            h();
            super.onFocusChange(view, z);
        }
    }

    @Override // com.flybird.FBView
    public void onLoadFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23670df", new Object[]{this});
        } else if (isDestroyed()) {
        } else {
            super.onLoadFinish();
            h();
            this.B.setOnTouchListener(this);
            if (!TextUtils.equals(this.N, UiUtil.INPUT_TYPE_VALUE_CHECKBOX) && !TextUtils.equals(this.N, UiUtil.INPUT_TYPE_VALUE_MONTH)) {
                if (this.O) {
                    this.mDoc.getClass();
                    View view = (View) this.B.getParent();
                    view.setFocusable(true);
                    view.setFocusableInTouchMode(true);
                }
                Editable editableText = this.B.getEditableText();
                if (editableText == null) {
                    return;
                }
                String obj = editableText.toString();
                if (TextUtils.isEmpty(obj)) {
                    return;
                }
                this.B.setSelection(obj.length());
                return;
            }
            if (TextUtils.equals(this.N, UiUtil.INPUT_TYPE_VALUE_CHECKBOX) && this.R != null) {
                this.C.setButtonDrawable(UiUtil.genButtonSelector(this.mDoc.k, this.N, this.mWidth, this.mHeight, this.R));
                this.C.setBackgroundDrawable(null);
            }
            if (!TextUtils.equals(this.N, UiUtil.INPUT_TYPE_VALUE_MONTH)) {
                return;
            }
            this.K = false;
            String obj2 = this.B.getEditableText().toString();
            if (!TextUtils.isEmpty(obj2) && obj2.length() == 4) {
                EditText editText = this.B;
                editText.setText(obj2.substring(0, 2) + "/" + obj2.substring(2));
            }
            this.K = true;
        }
    }

    @Override // com.flybird.FBView, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (isDestroyed()) {
            return true;
        }
        if (this.behaviorInfoSet && this.fixUepInputClick && !this.W && motionEvent.getAction() == 1) {
            String str = Platform.f5257a;
            this.W = true;
        }
        if (!this.J) {
            return false;
        }
        if (this.I && (drawable = this.D) != null) {
            int i = this.mWidth;
            int i2 = this.mHeight;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.D.getIntrinsicHeight();
            int i3 = (i - intrinsicWidth) - (intrinsicWidth / 4);
            this.E = i3;
            int i4 = (i2 - intrinsicHeight) / 2;
            this.G = i4;
            this.F = i3 + intrinsicWidth;
            this.H = i4 + intrinsicHeight;
        }
        if (this.E > 0 && this.I) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x >= this.E && x <= this.F && y >= this.G && y <= this.H) {
                if (motionEvent.getAction() == 1) {
                    this.M = "";
                    this.L = "";
                    this.B.setText("");
                    TemplatePasswordService templatePasswordService = this.mDoc.Q;
                    if (templatePasswordService != null) {
                        templatePasswordService.clear(hashCode());
                    }
                }
                return true;
            }
        }
        try {
            EditText editText = this.B;
            if (editText == null) {
                return false;
            }
            return editText.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            FBLogger.e(FBView.TAG, th);
            return false;
        }
    }

    @Override // com.alipay.android.app.template.FBFocusable
    public void requestFocus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10da4b90", new Object[]{this});
            return;
        }
        EditText editText = this.B;
        if (editText != null) {
            editText.requestFocus();
        }
        i();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.flybird.FBView
    public void updateAttr(String str, String str2) {
        char c;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a285a75", new Object[]{this, str, str2});
        } else if (isDestroyed() || str == null) {
        } else {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1322658010:
                    if (str.equals("inputSetting")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -290991569:
                    if (str.equals("maxpickeryear")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -178324674:
                    if (str.equals("calendar")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 94746189:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_clear)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 111972721:
                    if (str.equals("value")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 124732746:
                    if (str.equals(Constants.Name.MAXLENGTH)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 270940796:
                    if (str.equals("disabled")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 503739367:
                    if (str.equals("keyboard")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 598246771:
                    if (str.equals("placeholder")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 742313895:
                    if (str.equals(Constants.Name.CHECKED)) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 913392732:
                    if (str.equals("singleLine")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 972131414:
                    if (str.equals("sysnumber")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1667607689:
                    if (str.equals(Constants.Name.AUTOFOCUS)) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    if (this.mDoc == null || this.mDoc.getTemplateKeyboardService() == null) {
                        return;
                    }
                    d();
                    String str3 = Platform.f5257a;
                    return;
                case 1:
                    this.U = Integer.valueOf(str2).intValue();
                    return;
                case 2:
                    this.V = str2;
                    return;
                case 3:
                    this.N = str2;
                    if (str2.equals(UiUtil.INPUT_TYPE_VALUE_CHECKBOX)) {
                        this.mDoc.c0 = false;
                        View view = this.mView;
                        if (view == this.C || (frameLayout2 = (FrameLayout) view.getParent()) == null) {
                            return;
                        }
                        frameLayout2.addView(this.C);
                        frameLayout2.removeView(this.mView);
                        this.mView = this.C;
                        return;
                    }
                    this.mDoc.c0 = true;
                    View view2 = this.mView;
                    if (view2 != this.B && (frameLayout = (FrameLayout) view2.getParent()) != null) {
                        frameLayout.addView(this.B);
                        frameLayout.removeView(this.mView);
                        this.mView = this.B;
                    }
                    switch (str2.hashCode()) {
                        case -2044506306:
                            if (str2.equals(UiUtil.INPUT_TYPE_VALUE_EXTERNALALPHABET)) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case -1820761141:
                            if (str2.equals(UiUtil.INPUT_TYPE_VALUE_EXTERNAL)) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case -1555781836:
                            if (str2.equals(UiUtil.INPUT_TYPE_VALUE_MONEYNOTOP)) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case -1422422604:
                            if (str2.equals(UiUtil.INPUT_TYPE_VALUE_STYLEPOINTPAD)) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case -1193508181:
                            if (str2.equals(UiUtil.INPUT_TYPE_VALUE_IDCARD)) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case -1034364087:
                            if (str2.equals("number")) {
                                c2 = 5;
                                break;
                            }
                            break;
                        case -891774745:
                            if (str2.equals(UiUtil.INPUT_TYPE_VALUE_STYLEX)) {
                                c2 = 6;
                                break;
                            }
                            break;
                        case 109446:
                            if (str2.equals(UiUtil.INPUT_TYPE_VALUE_NUM)) {
                                c2 = 7;
                                break;
                            }
                            break;
                        case 104079552:
                            if (str2.equals(UiUtil.INPUT_TYPE_VALUE_MONEY)) {
                                c2 = '\b';
                                break;
                            }
                            break;
                        case 104080000:
                            if (str2.equals(UiUtil.INPUT_TYPE_VALUE_MONTH)) {
                                c2 = '\t';
                                break;
                            }
                            break;
                        case 106642798:
                            if (str2.equals("phone")) {
                                c2 = '\n';
                                break;
                            }
                            break;
                        case 155453021:
                            if (str2.equals(UiUtil.INPUT_TYPE_VALUE_STYLEPHONE)) {
                                c2 = 11;
                                break;
                            }
                            break;
                        case 155655807:
                            if (str2.equals(UiUtil.INPUT_TYPE_VALUE_STYLEPOINT)) {
                                c2 = '\f';
                                break;
                            }
                            break;
                        case 311229140:
                            if (str2.equals(UiUtil.INPUT_TYPE_VALUE_EXTERNALNUMBER)) {
                                c2 = '\r';
                                break;
                            }
                            break;
                        case 867927466:
                            if (str2.equals(UiUtil.INPUT_TYPE_VALUE_TINYAPPNUMBER)) {
                                c2 = 14;
                                break;
                            }
                            break;
                        case 1126314262:
                            if (str2.equals(UiUtil.INPUT_TYPE_VALUE_STYLEPHONEPAD)) {
                                c2 = 15;
                                break;
                            }
                            break;
                        case 1216985755:
                            if (str2.equals("password")) {
                                c2 = 16;
                                break;
                            }
                            break;
                        case 1785683850:
                            if (str2.equals(UiUtil.INPUT_TYPE_VALUE_STYLENONEPAD)) {
                                c2 = 17;
                                break;
                            }
                            break;
                        case 1806077033:
                            if (str2.equals(UiUtil.INPUT_TYPE_VALUE_STYLENONE)) {
                                c2 = 18;
                                break;
                            }
                            break;
                        case 1806375500:
                            if (str2.equals(UiUtil.INPUT_TYPE_VALUE_STYLEXPAD)) {
                                c2 = 19;
                                break;
                            }
                            break;
                    }
                    switch (c2) {
                        case 0:
                        case 1:
                        case 4:
                        case 6:
                        case '\n':
                        case 11:
                        case '\r':
                        case 15:
                        case 19:
                            a(this.B);
                            return;
                        case 2:
                        case 3:
                        case '\b':
                        case '\f':
                        case 14:
                            this.B.setInputType(8194);
                            a(this.B);
                            return;
                        case 5:
                        case 7:
                        case 17:
                        case 18:
                            this.B.setInputType(2);
                            this.B.setKeyListener(new NumberOnlyKeyListener());
                            a(this.B);
                            return;
                        case '\t':
                            this.B.setCursorVisible(false);
                            this.B.setFocusable(false);
                            this.B.setClickable(true);
                            return;
                        case 16:
                            this.B.setInputType(129);
                            return;
                        default:
                            return;
                    }
                case 4:
                    if (str2.equals("disable")) {
                        this.J = false;
                        return;
                    } else if (!str2.equals("enable")) {
                        return;
                    } else {
                        this.J = true;
                        return;
                    }
                case 5:
                    this.K = false;
                    this.B.setText(str2);
                    Editable text = this.B.getText();
                    if (text instanceof Spannable) {
                        Selection.setSelection(text, text.length());
                    }
                    this.Q = this.B.getText().toString();
                    this.K = true;
                    if (!TextUtils.equals(str2, "")) {
                        return;
                    }
                    this.I = false;
                    return;
                case 6:
                    this.B.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Integer.parseInt(str2))});
                    return;
                case 7:
                    this.I = false;
                    EditText editText = this.B;
                    if (editText != null) {
                        editText.setEnabled(!Boolean.parseBoolean(str2));
                        this.B.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                    CheckBox checkBox = this.C;
                    if (checkBox == null) {
                        return;
                    }
                    checkBox.setEnabled(!Boolean.parseBoolean(str2));
                    return;
                case '\b':
                    this.P = str2;
                    return;
                case '\t':
                    if (UiUtil.isOppoDevice()) {
                        this.B.setHintTextColor(-3355444);
                    }
                    e(str2);
                    return;
                case '\n':
                    this.K = false;
                    this.C.setChecked(Boolean.parseBoolean(str2));
                    this.K = true;
                    return;
                case 11:
                    this.B.setSingleLine(Boolean.parseBoolean(str2));
                    return;
                case '\f':
                    this.T = Boolean.parseBoolean(str2);
                    return;
                case '\r':
                    this.O = Boolean.parseBoolean(str2);
                    this.mDoc.setAutoFocusable(this);
                    return;
                default:
                    super.updateAttr(str, str2);
                    return;
            }
        }
    }

    @Override // com.flybird.FBView
    public void updateCSS(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c310ec95", new Object[]{this, str, str2});
        } else if (str == null || isDestroyed()) {
        } else {
            char c = 65535;
            switch (str.hashCode()) {
                case -1586082113:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_font_size)) {
                        c = 0;
                        break;
                    }
                    break;
                case -611277766:
                    if (str.equals("background-image:disabled")) {
                        c = 1;
                        break;
                    }
                    break;
                case -140393755:
                    if (str.equals("placeholder-font-size")) {
                        c = 2;
                        break;
                    }
                    break;
                case 94842723:
                    if (str.equals("color")) {
                        c = 3;
                        break;
                    }
                    break;
                case 108532386:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_font_family)) {
                        c = 4;
                        break;
                    }
                    break;
                case 598800822:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_font_weight)) {
                        c = 5;
                        break;
                    }
                    break;
                case 610793468:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_background_image)) {
                        c = 6;
                        break;
                    }
                    break;
                case 746232421:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_text_align)) {
                        c = 7;
                        break;
                    }
                    break;
                case 2018420361:
                    if (str.equals("placeholder-color")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 2099328553:
                    if (str.equals("background-image:checked")) {
                        c = '\t';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.B.setTextSize(Platform.f, FBView.parseFontSize(str2));
                    return;
                case 1:
                    putThemeModeAssociatedActions(FBView.THEME_ASSOCIATED_TYPE_CSS, str, str2);
                    if (str2.startsWith("url")) {
                        str2 = str2.substring(4, str2.length() - 1);
                    }
                    if (this.R == null) {
                        this.R = new String[3];
                    }
                    this.R[2] = str2;
                    return;
                case 2:
                    this.S = str2;
                    EditText editText = this.B;
                    if (editText == null || editText.getHint() == null) {
                        return;
                    }
                    e(this.B.getHint().toString());
                    return;
                case 3:
                    putThemeModeAssociatedActions(FBView.THEME_ASSOCIATED_TYPE_CSS, str, str2);
                    this.B.setTextColor(FBTools.parseColor(str2, FBDocumentAssistor.c(this.mDoc), FBDocumentAssistor.b(this.mDoc), this.themeModeUseColorMapping));
                    return;
                case 4:
                    Typeface typeface = FontCache.getTypeface(this.mDoc.k, str2);
                    if (typeface != null) {
                        this.B.setTypeface(typeface);
                        return;
                    }
                    FBLogger.e(FBView.TAG, "typeface: " + str2 + " is not found!");
                    return;
                case 5:
                    this.B.getPaint().setFakeBoldText("bold".equals(str2));
                    return;
                case 6:
                    putThemeModeAssociatedActions(FBView.THEME_ASSOCIATED_TYPE_CSS, str, str2);
                    if (str2.startsWith("url")) {
                        str2 = str2.substring(4, str2.length() - 1);
                    }
                    if (this.R == null) {
                        this.R = new String[3];
                    }
                    this.R[0] = str2;
                    return;
                case 7:
                    if (str2.equals("center")) {
                        this.B.setGravity(17);
                        return;
                    } else if (str2.equals("right")) {
                        this.B.setGravity(21);
                        return;
                    } else if (TextUtils.equals("top", str2)) {
                        this.B.setGravity(48);
                        return;
                    } else if (TextUtils.equals("bottom", str2)) {
                        this.B.setGravity(80);
                        return;
                    } else {
                        this.B.setGravity(19);
                        return;
                    }
                case '\b':
                    putThemeModeAssociatedActions(FBView.THEME_ASSOCIATED_TYPE_CSS, str, str2);
                    this.B.setHintTextColor(FBTools.parseColor(str2, FBDocumentAssistor.c(this.mDoc), FBDocumentAssistor.b(this.mDoc), this.themeModeUseColorMapping));
                    return;
                case '\t':
                    putThemeModeAssociatedActions(FBView.THEME_ASSOCIATED_TYPE_CSS, str, str2);
                    if (str2.startsWith("url")) {
                        str2 = str2.substring(4, str2.length() - 1);
                    }
                    if (this.R == null) {
                        this.R = new String[3];
                    }
                    this.R[1] = str2;
                    return;
                default:
                    super.updateCSS(str, str2);
                    return;
            }
        }
    }

    @Override // com.flybird.FBView
    public void updateFunc(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94461448", new Object[]{this, str, str2});
        } else if (isDestroyed()) {
        } else {
            super.updateFunc(str, str2);
            if (TextUtils.equals(this.N, UiUtil.INPUT_TYPE_VALUE_CHECKBOX)) {
                return;
            }
            str.hashCode();
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1891770960) {
                if (hashCode != 3027047) {
                    if (hashCode == 97604824 && str.equals(Constants.Event.FOCUS)) {
                        c = 2;
                    }
                } else if (str.equals(Constants.Event.BLUR)) {
                    c = 1;
                }
            } else if (str.equals("blurForceLostFocus")) {
                c = 0;
            }
            if (c == 0) {
                this.O = false;
                this.B.clearFocus();
                this.B.postDelayed(new Runnable() { // from class: com.flybird.FBInput.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (FBInput.this.mDoc == null) {
                        } else {
                            FBDocument fBDocument = FBInput.this.mDoc;
                            FBInput fBInput = FBInput.this;
                            int i = FBInput.A;
                            fBDocument.hiddenKeyboardService(fBInput.d().f7157a, true);
                        }
                    }
                }, 200L);
            } else if (c == 1) {
                this.O = false;
                this.mDoc.hiddenKeyboardService(d().f7157a, true);
            } else if (c != 2) {
            } else {
                this.O = true;
                if (this.mDoc.isOnloadFinish()) {
                    this.B.requestFocus();
                    i();
                }
                if (!this.behaviorInfoSet || !this.fixUepInputClick) {
                    return;
                }
                String str3 = Platform.f5257a;
            }
        }
    }

    public final View a(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bf78576a", new Object[]{this, view, view2});
        }
        if (view != null) {
            return view;
        }
        this.mDoc.U = (ViewGroup) view2.findViewById(ResUtils.getResourceId(this.mDoc.k, "flybird_main_layout", "id", "com.alipay.android.app"));
        return this.mDoc.U;
    }

    public final void e(String str) {
        CharSequence charSequence;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        if (!TextUtils.isEmpty(this.S) && !TextUtils.isEmpty(str)) {
            String str2 = "<font size='" + this.S + "'>" + str + "</font>";
            try {
                charSequence = HtmlLite.fromHtml(this.mDoc.k, FBDocumentAssistor.getDp(), str2, null, FBDocumentAssistor.c(this.mDoc), FBDocumentAssistor.b(this.mDoc), this.themeModeUseColorMapping);
            } catch (Throwable unused) {
                charSequence = Html.fromHtml(str2);
            }
        } else {
            boolean isEmpty = TextUtils.isEmpty(str);
            charSequence = str;
            if (isEmpty) {
                charSequence = "";
            }
        }
        this.B.setHint(charSequence);
    }
}

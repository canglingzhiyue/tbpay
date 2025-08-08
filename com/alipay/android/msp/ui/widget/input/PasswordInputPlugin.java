package com.alipay.android.msp.ui.widget.input;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import mtopsdk.common.util.StringUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.alipay.android.app.template.AbsFBPlugin;
import com.alipay.android.app.template.FBFocusable;
import com.alipay.android.app.template.FBPluginCtx;
import com.alipay.android.app.template.TemplateKeyboardService;
import com.alipay.android.app.template.TemplatePasswordService;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.ResUtils;
import com.alipay.android.msp.utils.UIUtil;
import com.alipay.android.msp.utils.edit.EditTextManager;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public class PasswordInputPlugin extends AbsFBPlugin implements View.OnClickListener, View.OnFocusChangeListener, View.OnTouchListener, FBFocusable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context b;
    private FBPluginCtx c;
    private int d;
    private View f;
    private View g;
    private EditText h;
    private CheckBox i;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private Drawable j = null;
    private boolean q = false;
    private boolean r = true;
    private String s = "";
    private String t = "";
    private Dialog u = null;
    private String v = "";
    private boolean w = false;
    private String x = "";
    private View y = null;
    private String z = "";
    private String[] A = null;
    private TemplatePasswordService e = a();

    /* loaded from: classes3.dex */
    public class DecorViewInfo {

        /* renamed from: a  reason: collision with root package name */
        public View f5094a;
        public boolean b;

        private DecorViewInfo() {
        }
    }

    public static /* synthetic */ Object ipc$super(PasswordInputPlugin passwordInputPlugin, String str, Object... objArr) {
        if (str.hashCode() == -740778895) {
            return new Boolean(super.setRect(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue()));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ View a(PasswordInputPlugin passwordInputPlugin, View view, View view2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("be242ae8", new Object[]{passwordInputPlugin, view, view2}) : passwordInputPlugin.a(view, view2);
    }

    public static /* synthetic */ FBPluginCtx a(PasswordInputPlugin passwordInputPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FBPluginCtx) ipChange.ipc$dispatch("cd634f2f", new Object[]{passwordInputPlugin}) : passwordInputPlugin.c;
    }

    public static /* synthetic */ String a(PasswordInputPlugin passwordInputPlugin, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34cc8c70", new Object[]{passwordInputPlugin, str});
        }
        passwordInputPlugin.z = str;
        return str;
    }

    public static /* synthetic */ View b(PasswordInputPlugin passwordInputPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ad0ad669", new Object[]{passwordInputPlugin}) : passwordInputPlugin.c();
    }

    public static /* synthetic */ Context c(PasswordInputPlugin passwordInputPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("60ce8e0", new Object[]{passwordInputPlugin}) : passwordInputPlugin.b;
    }

    public static /* synthetic */ boolean d(PasswordInputPlugin passwordInputPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b4ed39ed", new Object[]{passwordInputPlugin})).booleanValue() : passwordInputPlugin.r;
    }

    public static /* synthetic */ EditText e(PasswordInputPlugin passwordInputPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditText) ipChange.ipc$dispatch("ff99dc19", new Object[]{passwordInputPlugin}) : passwordInputPlugin.h;
    }

    public static /* synthetic */ String f(PasswordInputPlugin passwordInputPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2d6f7e15", new Object[]{passwordInputPlugin}) : passwordInputPlugin.z;
    }

    public static /* synthetic */ String g(PasswordInputPlugin passwordInputPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5c20e834", new Object[]{passwordInputPlugin}) : passwordInputPlugin.v;
    }

    public static /* synthetic */ void h(PasswordInputPlugin passwordInputPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebeb19ed", new Object[]{passwordInputPlugin});
        } else {
            passwordInputPlugin.h();
        }
    }

    public static /* synthetic */ View i(PasswordInputPlugin passwordInputPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("416dcab0", new Object[]{passwordInputPlugin}) : passwordInputPlugin.y;
    }

    public static /* synthetic */ void j(PasswordInputPlugin passwordInputPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876a09ef", new Object[]{passwordInputPlugin});
        } else {
            passwordInputPlugin.f();
        }
    }

    public int getBusinessId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("544634eb", new Object[]{this})).intValue() : this.d;
    }

    public PasswordInputPlugin(Context context, FBPluginCtx fBPluginCtx, int i) {
        this.b = context;
        this.c = fBPluginCtx;
        this.d = i;
    }

    private TemplatePasswordService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplatePasswordService) ipChange.ipc$dispatch("c5fc6fa9", new Object[]{this});
        }
        if (this.e == null) {
            this.e = new TemplatePasswordService() { // from class: com.alipay.android.msp.ui.widget.input.PasswordInputPlugin.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.app.template.TemplatePasswordService
                public void onTextChanged(int i, String str, int i2, int i3, int i4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7b6a2a25", new Object[]{this, new Integer(i), str, new Integer(i2), new Integer(i3), new Integer(i4)});
                    } else {
                        EditTextManager.getEditStringUtils().OnTextChanged(i, str, i2, i3, i4);
                    }
                }

                @Override // com.alipay.android.app.template.TemplatePasswordService
                public String getText(int i) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("8f841a27", new Object[]{this, new Integer(i)}) : EditTextManager.getEditStringUtils().getText(i);
                }

                @Override // com.alipay.android.app.template.TemplatePasswordService
                public void clear(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d17cb12f", new Object[]{this, new Integer(i)});
                    } else {
                        EditTextManager.getEditStringUtils().clear(i);
                    }
                }
            };
        }
        return this.e;
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public View createView(Context context) {
        this.h = new EditText(context);
        this.h.setBackgroundDrawable(null);
        this.h.setCursorVisible(true);
        this.h.setPadding(0, 0, 0, 0);
        this.c.setHasInput(true);
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(this.h, 0);
        } catch (Exception unused) {
        }
        this.j = UIUtil.getPaddingDrawable(R.drawable.mini_template_clean_icon, context);
        d();
        b();
        EditText editText = this.h;
        this.f = editText;
        return editText;
    }

    public View getInnerView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("3a4c32ae", new Object[]{this}) : this.f;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        EditText editText = this.h;
        if (editText == null) {
            return;
        }
        editText.setImeOptions(6);
        this.h.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.alipay.android.msp.ui.widget.input.PasswordInputPlugin.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                View b;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i), keyEvent})).booleanValue();
                }
                if (i != 6 || PasswordInputPlugin.a(PasswordInputPlugin.this) == null || PasswordInputPlugin.a(PasswordInputPlugin.this).getBodyView() == null || (b = PasswordInputPlugin.b(PasswordInputPlugin.this)) == null) {
                    return false;
                }
                PasswordInputPlugin.a(PasswordInputPlugin.this).getDefaultKeyboardService().hideKeyboard(((Activity) PasswordInputPlugin.c(PasswordInputPlugin.this)).getWindow().getDecorView());
                b.setFocusable(true);
                b.setFocusableInTouchMode(true);
                b.requestFocus();
                return true;
            }
        });
    }

    private View c() {
        FBPluginCtx fBPluginCtx = this.c;
        if (fBPluginCtx != null && fBPluginCtx.getBodyView() != null) {
            Object bodyView = this.c.getBodyView();
            try {
                return (View) bodyView.getClass().getMethod("getInnerView", new Class[0]).invoke(bodyView, new Object[0]);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        EditText editText = this.h;
        if (editText == null) {
            return;
        }
        editText.addTextChangedListener(new TextWatcher() { // from class: com.alipay.android.msp.ui.widget.input.PasswordInputPlugin.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

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

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                    return;
                }
                if (PasswordInputPlugin.d(PasswordInputPlugin.this)) {
                    String obj = PasswordInputPlugin.e(PasswordInputPlugin.this).getText().toString();
                    if (!StringUtils.equals(obj, PasswordInputPlugin.f(PasswordInputPlugin.this))) {
                        PasswordInputPlugin.a(PasswordInputPlugin.this, obj);
                        if (StringUtils.equals(PasswordInputPlugin.g(PasswordInputPlugin.this), UiUtil.INPUT_TYPE_VALUE_MONTH)) {
                            PasswordInputPlugin.a(PasswordInputPlugin.this).deliverOnInput(PasswordInputPlugin.this.getNode(), obj.replaceAll("/", ""));
                        } else {
                            PasswordInputPlugin.a(PasswordInputPlugin.this).deliverOnInput(PasswordInputPlugin.this.getNode(), obj);
                        }
                    }
                }
                PasswordInputPlugin.h(PasswordInputPlugin.this);
            }
        });
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (StringUtils.isEmpty(str)) {
            str = "";
        }
        this.h.setHint(str);
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean setRect(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3d89c71", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)})).booleanValue();
        }
        this.o = (int) f3;
        this.p = (int) f4;
        return super.setRect(f, f2, f3, f4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateCSS(String str, String str2) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c310ec99", new Object[]{this, str, str2})).booleanValue();
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1586082113:
                if (str.equals(a.ATOM_EXT_UDL_font_size)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -611277766:
                if (str.equals("background-image:disabled")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 94842723:
                if (str.equals("color")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 598800822:
                if (str.equals(a.ATOM_EXT_UDL_font_weight)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 610793468:
                if (str.equals(a.ATOM_EXT_UDL_background_image)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 746232421:
                if (str.equals(a.ATOM_EXT_UDL_text_align)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2018420361:
                if (str.equals("placeholder-color")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2099328553:
                if (str.equals("background-image:checked")) {
                    c = 6;
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
                this.h.setTextSize(1, Float.parseFloat(str2.substring(0, str2.indexOf("px"))));
                break;
            case 1:
                this.h.setHintTextColor(UIUtil.parseColor(str2));
                break;
            case 2:
                this.h.setTextColor(UIUtil.parseColor(str2));
                break;
            case 3:
                if (str2.equals("bold")) {
                    this.h.getPaint().setFakeBoldText(true);
                    break;
                } else {
                    this.h.getPaint().setFakeBoldText(false);
                    break;
                }
            case 4:
                int hashCode = str2.hashCode();
                if (hashCode != -1364013995) {
                    if (hashCode == 108511772 && str2.equals("right")) {
                        c2 = 1;
                    }
                } else if (str2.equals("center")) {
                    c2 = 0;
                }
                if (c2 == 0) {
                    this.h.setGravity(17);
                    break;
                } else if (c2 == 1) {
                    this.h.setGravity(21);
                    break;
                } else {
                    this.h.setGravity(19);
                    break;
                }
                break;
            case 5:
                if (str2.startsWith("url")) {
                    str2 = str2.substring(4, str2.length() - 1);
                }
                if (this.A == null) {
                    this.A = new String[3];
                }
                this.A[0] = str2;
                break;
            case 6:
                if (str2.startsWith("url")) {
                    str2 = str2.substring(4, str2.length() - 1);
                }
                if (this.A == null) {
                    this.A = new String[3];
                }
                this.A[1] = str2;
                break;
            case 7:
                if (str2.startsWith("url")) {
                    str2 = str2.substring(4, str2.length() - 1);
                }
                if (this.A == null) {
                    this.A = new String[3];
                }
                this.A[2] = str2;
                break;
            default:
                return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r9.equals("placeholder") != false) goto L11;
     */
    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean updateAttr(java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.ui.widget.input.PasswordInputPlugin.updateAttr(java.lang.String, java.lang.String):boolean");
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean onLoadFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b23670e3", new Object[]{this})).booleanValue();
        }
        h();
        if (!StringUtils.equals(this.v, UiUtil.INPUT_TYPE_VALUE_CHECKBOX) && !StringUtils.equals(this.v, UiUtil.INPUT_TYPE_VALUE_MONTH)) {
            if (StringUtils.isEmpty(this.v)) {
                this.h.setSingleLine();
                this.h.setHorizontallyScrolling(true);
                UIUtil.setSafeKeyboardSoftInput(this.h);
                this.h.setOnFocusChangeListener(this);
                this.h.setOnClickListener(this);
            }
            if (this.w) {
                this.c.setAutoFocus(this);
                View view = (View) this.h.getParent();
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
            }
            Editable editableText = this.h.getEditableText();
            if (editableText != null) {
                String obj = editableText.toString();
                if (!StringUtils.isEmpty(obj)) {
                    this.h.setSelection(obj.length());
                }
            }
        } else if (StringUtils.equals(this.v, UiUtil.INPUT_TYPE_VALUE_MONTH)) {
            this.r = false;
            String obj2 = this.h.getEditableText().toString();
            if (!StringUtils.isEmpty(obj2) && obj2.length() == 4) {
                EditText editText = this.h;
                editText.setText(obj2.substring(0, 2) + "/" + obj2.substring(2));
            }
            this.r = true;
        }
        return false;
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.c.getTemplateKeyboardService() == null || this.c.getDefaultKeyboardService().equals(this.c.getTemplateKeyboardService());
    }

    private void f() {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.c == null || !getInnerView().isEnabled()) {
        } else {
            if (e() || UIUtil.isUseDefaultKeyboard(this.v, this.x)) {
                if (!e()) {
                    this.c.getTemplateKeyboardService().hideKeyboard(g().f5094a);
                }
                int i = !this.c.isOnloadFinish() ? 600 : 0;
                try {
                    TemplateKeyboardService defaultKeyboardService = this.c.getDefaultKeyboardService();
                    if (defaultKeyboardService == null) {
                        return;
                    }
                    defaultKeyboardService.showKeyboard(this.h, null, null, null, false, i);
                    return;
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace(e);
                    MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.d);
                    if (mspContextByBizId == null) {
                        return;
                    }
                    mspContextByBizId.getStatisticInfo().addError(ErrorType.DEFAULT, ErrorCode.DEFAULT_KEYBOARD_ERROR, ErrorCode.DEFAULT_KEYBOARD_ERROR);
                    return;
                }
            }
            DecorViewInfo g = g();
            final View view = g.f5094a;
            final boolean z = g.b;
            boolean hideKeyboard = this.c.getDefaultKeyboardService().hideKeyboard(view);
            final boolean z2 = !z && !this.c.isFullscreen();
            if (!z) {
                if (this.c.isFullscreen()) {
                    findViewById = j();
                } else {
                    findViewById = view.findViewById(16908290);
                }
            } else {
                findViewById = view.findViewById(ResUtils.getResourceId("dialog_linear_layout", "id", null));
            }
            final View view2 = findViewById;
            if (!this.c.isOnloadFinish()) {
                this.h.postDelayed(new Runnable() { // from class: com.alipay.android.msp.ui.widget.input.PasswordInputPlugin.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        View view3 = view2;
                        if (!z2) {
                            view3 = PasswordInputPlugin.a(PasswordInputPlugin.this, view3, view);
                        }
                        try {
                            PasswordInputPlugin.a(PasswordInputPlugin.this).getTemplateKeyboardService().showKeyboard(PasswordInputPlugin.e(PasswordInputPlugin.this), UIUtil.getKeyboardType(PasswordInputPlugin.g(PasswordInputPlugin.this)), view, view3, z, 0);
                        } catch (Exception e2) {
                            LogUtil.printExceptionStackTrace(e2);
                        }
                    }
                }, 600L);
                return;
            }
            try {
                this.c.getTemplateKeyboardService().showKeyboard(this.h, UIUtil.getKeyboardType(this.v), view, !z2 ? a(view2, view) : view2, z, hideKeyboard ? 500 : 0);
            } catch (Exception e2) {
                LogUtil.printExceptionStackTrace(e2);
            }
            if (!UIUtil.isGTP8600()) {
                return;
            }
            this.h.postDelayed(new Runnable() { // from class: com.alipay.android.msp.ui.widget.input.PasswordInputPlugin.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        PasswordInputPlugin.a(PasswordInputPlugin.this).getDefaultKeyboardService().hideKeyboard(PasswordInputPlugin.e(PasswordInputPlugin.this));
                    }
                }
            }, 200L);
        }
    }

    private View a(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bf78576a", new Object[]{this, view, view2});
        }
        if (view != null) {
            return view;
        }
        a(view2.findViewById(R.id.flybird_main_layout));
        return j();
    }

    private DecorViewInfo g() {
        View decorView;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (DecorViewInfo) ipChange.ipc$dispatch("a99fdaf2", new Object[]{this});
        }
        DecorViewInfo decorViewInfo = new DecorViewInfo();
        if (this.c.getShowingDialog() != null && this.c.getShowingDialog().isShowing()) {
            z = true;
        }
        if (!z) {
            decorView = ((Activity) this.b).getWindow().getDecorView();
        } else {
            decorView = this.c.getShowingDialog().getWindow().getDecorView();
        }
        decorViewInfo.f5094a = decorView;
        decorViewInfo.b = z;
        return decorViewInfo;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (StringUtils.equals(this.v, UiUtil.INPUT_TYPE_VALUE_MONTH)) {
        } else {
            if (!StringUtils.equals(this.v, UiUtil.INPUT_TYPE_VALUE_CHECKBOX)) {
                try {
                    f();
                    return;
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace(e);
                    return;
                }
            }
            this.c.deliverOnBlur(getNode());
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!this.h.isEnabled() || StringUtils.equals(this.v, UiUtil.INPUT_TYPE_VALUE_PAYSPWD)) {
        } else {
            if (!StringUtils.isEmpty(this.h.getText()) && this.j != null && this.h.isFocused()) {
                this.q = true;
                this.h.setOnTouchListener(this);
                this.h.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.j, (Drawable) null);
                return;
            }
            this.q = false;
            this.h.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (this.q && this.j != null) {
            int width = this.h.getWidth();
            int height = this.h.getHeight();
            int intrinsicWidth = this.j.getIntrinsicWidth();
            int intrinsicHeight = this.j.getIntrinsicHeight();
            this.k = (width - intrinsicWidth) - (intrinsicWidth / 4);
            this.m = (height - intrinsicHeight) / 2;
            this.l = this.k + intrinsicWidth;
            this.n = this.m + intrinsicHeight;
        }
        if (this.k > 0 && this.q) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x >= this.k && x <= this.l && y >= this.m && y <= this.n) {
                if (motionEvent.getAction() == 1) {
                    this.t = "";
                    this.s = "";
                    this.h.setText("");
                    TemplatePasswordService passwordService = getPasswordService();
                    if (passwordService != null) {
                        passwordService.clear(this.d);
                    }
                }
                return true;
            }
        }
        return this.h.onTouchEvent(motionEvent);
    }

    private float i() {
        Object bodyView = this.c.getBodyView();
        if (bodyView == null) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(bodyView.getClass().getMethod("getOpacity", new Class[0]).invoke(bodyView, new Object[0]).toString());
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return 1.0f;
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
        } else if (this.c == null || this.b == null || i() <= 0.1d || !this.c.isOnloadFinish()) {
        } else {
            if (z && view.isEnabled()) {
                if (StringUtils.equals(this.v, UiUtil.INPUT_TYPE_VALUE_PAYSPWD)) {
                    EditText editText = this.h;
                    editText.setSelection(editText.getEditableText().length());
                }
                if (this.c != null && !UIUtil.isUseDefaultKeyboard(this.v, this.x) && !e()) {
                    this.c.getTemplateKeyboardService().hideKeyboard(g().f5094a);
                }
                f();
            }
            h();
            if (z) {
                this.c.deliverOnFocus(getNode());
            } else {
                this.c.deliverOnBlur(getNode());
            }
        }
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateFunc(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9446144c", new Object[]{this, str, str2})).booleanValue();
        }
        if (!StringUtils.equals(this.v, UiUtil.INPUT_TYPE_VALUE_CHECKBOX)) {
            if (str.equals(Constants.Event.FOCUS)) {
                this.w = true;
                this.c.setAutoFocus(this);
                if (this.c.isOnloadFinish()) {
                    this.h.requestFocus();
                    f();
                }
                return true;
            } else if (str.equals(Constants.Event.BLUR)) {
                this.w = false;
                a(g().f5094a, true);
                return true;
            }
        }
        return false;
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public String getEncryptValue() {
        TemplatePasswordService passwordService;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("71c53bb7", new Object[]{this}) : ((StringUtils.equals(this.v, UiUtil.INPUT_TYPE_VALUE_PAYSPWD) || StringUtils.equals(this.v, UiUtil.INPUT_TYPE_VALUE_PAYPWD)) && (passwordService = getPasswordService()) != null) ? passwordService.getText(this.d) : "";
    }

    public void doDestroy() {
        TemplatePasswordService passwordService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637df6", new Object[]{this});
            return;
        }
        if (this.c != null && (passwordService = getPasswordService()) != null) {
            passwordService.clear(this.d);
        }
        this.y = null;
        this.h = null;
        this.i = null;
        this.j = null;
    }

    private View j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("b51e1df3", new Object[]{this}) : this.g;
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.g = view;
        }
    }

    public TemplatePasswordService getPasswordService() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplatePasswordService) ipChange.ipc$dispatch("32d3322c", new Object[]{this}) : this.e;
    }

    public void setPasswordService(TemplatePasswordService templatePasswordService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54586f52", new Object[]{this, templatePasswordService});
        } else {
            this.e = templatePasswordService;
        }
    }

    private boolean a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3b3cae", new Object[]{this, view, new Boolean(z)})).booleanValue();
        }
        boolean hideKeyboard = !e() ? this.c.getTemplateKeyboardService().hideKeyboard(view) : false;
        return z ? hideKeyboard || this.c.getDefaultKeyboardService().hideKeyboard(view) : hideKeyboard;
    }

    @Override // com.alipay.android.app.template.FBFocusable
    public void requestFocus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10da4b90", new Object[]{this});
            return;
        }
        View view = this.f;
        if (view == null) {
            return;
        }
        try {
            view.requestFocus();
            f();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }
}

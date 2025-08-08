package com.taobao.android.weex_uikit.widget.input;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.InputFilter;
import mtopsdk.common.util.StringUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.alibaba.analytics.core.sync.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.util.l;
import com.taobao.android.weex_framework.util.m;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.input.f;
import com.taobao.android.weex_uikit.widget.text.j;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.weex.common.Constants;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final int f16175a;

    /* renamed from: com.taobao.android.weex_uikit.widget.input.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0622a {

        /* renamed from: a  reason: collision with root package name */
        public g f16177a;

        static {
            kge.a(1060546385);
        }
    }

    static {
        kge.a(-912950052);
        f16175a = j.DEFAULT_FONT_SIZE;
    }

    public static EditText a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditText) ipChange.ipc$dispatch("ced80c8f", new Object[]{context}) : new EditText(context);
    }

    public static void a(UINode uINode, m<C0622a> mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d9b733", new Object[]{uINode, mVar});
        } else {
            mVar.a(new C0622a());
        }
    }

    public static void a(UINode uINode, MUSDKInstance mUSDKInstance, EditText editText, m<d> mVar, C0622a c0622a, m<f.c> mVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74b123b8", new Object[]{uINode, mUSDKInstance, editText, mVar, c0622a, mVar2});
            return;
        }
        editText.setBackgroundColor(0);
        CharSequence charSequence = (CharSequence) uINode.getExtra("value");
        if (charSequence != null) {
            uINode.setExtra("value", null);
            editText.setText(charSequence);
        } else {
            editText.setText("");
        }
        editText.setSingleLine(((Boolean) uINode.getAttribute(Constants.Name.SINGLELINE)).booleanValue());
        editText.setHintTextColor(((Integer) uINode.getAttribute(Constants.Name.PLACEHOLDER_COLOR)).intValue());
        editText.setHint((CharSequence) uINode.getAttribute("placeholder"));
        editText.setGravity(((Integer) uINode.getAttribute("textAlign")).intValue());
        a(uINode, editText, (String) uINode.getAttribute("type"));
        editText.setTextColor(((Integer) uINode.getAttribute("color")).intValue());
        Integer num = (Integer) uINode.getExtra(JarvisConstant.KEY_ACTION_ID);
        editText.setImeOptions(num == null ? 0 : num.intValue());
        editText.setTextSize(0, ((Integer) uINode.getAttribute("fontSize")).intValue());
        InputFilter inputFilter = (InputFilter) uINode.getAttribute("filter");
        if (inputFilter == null) {
            editText.setFilters(new InputFilter[0]);
        } else {
            editText.setFilters(new InputFilter[]{inputFilter});
        }
        if (((Boolean) uINode.getAttribute(Constants.Name.AUTOFOCUS)).booleanValue()) {
            editText.setFocusable(true);
            editText.requestFocus();
            editText.setFocusableInTouchMode(true);
            b(mUSDKInstance.getUIContext(), editText);
        } else {
            a(mUSDKInstance.getUIContext(), editText);
        }
        mVar.a(new d(uINode, c0622a));
        editText.addTextChangedListener(mVar.b());
        a(uINode, editText, mVar2);
    }

    private static void a(final UINode uINode, EditText editText, m<f.c> mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("813c1d72", new Object[]{uINode, editText, mVar});
        } else if (!uINode.hasEvent("keyboard")) {
        } else {
            final Context context = editText.getContext();
            if (!(context instanceof Activity)) {
                return;
            }
            mVar.a(f.a((Activity) context, new f.b() { // from class: com.taobao.android.weex_uikit.widget.input.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_uikit.widget.input.f.b
                public void a(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    } else if (!UINode.this.hasEvent("keyboard")) {
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("isShow", (Object) Boolean.valueOf(z));
                        if (z) {
                            Rect rect = new Rect();
                            ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                            Context context2 = context;
                            jSONObject.put("keyboardSize", (Object) Float.valueOf(com.taobao.android.weex_framework.util.i.a(context2, l.f(context2) - (rect.bottom - rect.top))));
                        }
                        UINode.this.fireEvent("keyboard", jSONObject);
                        if (z) {
                            return;
                        }
                        a.b(UINode.this);
                    }
                }
            }));
        }
    }

    private static void a(String str, EditText editText, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c94237db", new Object[]{str, editText, uINode});
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 3076014) {
            if (hashCode == 3560141 && str.equals("time")) {
                c = 1;
            }
        } else if (str.equals("date")) {
            c = 0;
        }
        if (c == 0) {
            editText.setOnClickListener(new b(uINode));
        } else if (c == 1) {
            editText.setOnClickListener(new h(uINode));
        } else {
            editText.setOnClickListener(null);
        }
    }

    private static void b(Context context, EditText editText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c452020", new Object[]{context, editText});
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.showSoftInput(editText, 1);
    }

    public static void a(Context context, EditText editText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f0cadf", new Object[]{context, editText});
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public static void a(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82939aea", new Object[]{uINode, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 2;
                    break;
                }
                break;
            case -1046836013:
                if (str.equals("allDirectionCenter")) {
                    c = 5;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c = 0;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c = 3;
                    break;
                }
                break;
            case 762737387:
                if (str.equals("centerVertical")) {
                    c = 4;
                    break;
                }
                break;
        }
        if (c == 2) {
            uINode.setAttribute("textAlign", 1);
        } else if (c == 3) {
            uINode.setAttribute("textAlign", 5);
        } else if (c == 4) {
            uINode.setAttribute("textAlign", 16);
        } else if (c != 5) {
            uINode.setAttribute("textAlign", 3);
        } else {
            uINode.setAttribute("textAlign", 17);
        }
    }

    public static void a(UINode uINode, EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5db5a8c4", new Object[]{uINode, editText, new Integer(i)});
        } else {
            editText.setGravity(i);
        }
    }

    public static void a(UINode uINode, EditText editText, String str, Object obj) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b6225c5", new Object[]{uINode, editText, str, obj});
        } else if (editText == null) {
        } else {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1656172047) {
                if (hashCode == 111972721 && str.equals("value")) {
                    c = 0;
                }
            } else if (str.equals(JarvisConstant.KEY_ACTION_ID)) {
                c = 1;
            }
            if (c != 0) {
                if (c != 1) {
                    return;
                }
                if (obj != null) {
                    i = ((Integer) obj).intValue();
                }
                editText.setImeOptions(i);
                return;
            }
            if (obj == null) {
                obj = "";
            }
            if (StringUtils.isEmpty(editText.getText())) {
                String valueOf = String.valueOf(obj);
                editText.setText(valueOf);
                editText.setSelection(valueOf.length());
                return;
            }
            int selectionStart = editText.getSelectionStart();
            int selectionEnd = editText.getSelectionEnd();
            String valueOf2 = String.valueOf(obj);
            editText.setText(valueOf2);
            if (valueOf2.length() < selectionStart || valueOf2.length() < selectionEnd) {
                editText.setSelection(valueOf2.length());
            } else {
                editText.setSelection(selectionStart, selectionEnd);
            }
        }
    }

    public static void a(UINode uINode, MUSDKInstance mUSDKInstance, EditText editText, d dVar, f.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89bd758e", new Object[]{uINode, mUSDKInstance, editText, dVar, cVar});
            return;
        }
        if (editText.getText() != null) {
            uINode.setExtra("value", editText.getText().subSequence(0, editText.getText().length()));
        }
        editText.removeTextChangedListener(dVar);
        editText.setOnEditorActionListener(null);
        if (cVar == null) {
            return;
        }
        cVar.a();
    }

    public static void b(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f49ec9", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("type", str);
        }
    }

    public static void a(UINode uINode, EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7c0e29", new Object[]{uINode, editText, str});
            return;
        }
        editText.setInputType(a(editText, str));
        a(str, editText, uINode);
    }

    public static void c(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f55a2a8", new Object[]{uINode, str});
        } else if (StringUtils.isEmpty(str)) {
            uINode.setAttribute("color", -16777216);
        } else {
            uINode.setAttribute("color", Integer.valueOf(com.taobao.android.weex_uikit.util.b.a(str)));
        }
    }

    public static void b(UINode uINode, EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0005da3", new Object[]{uINode, editText, new Integer(i)});
        } else {
            editText.setTextColor(i);
        }
    }

    public static void d(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdb6a687", new Object[]{uINode, str});
            return;
        }
        uINode.setAttribute("value", str);
        uINode.setExtra("value", str);
    }

    public static void e(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c17aa66", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("placeholder", str);
        }
    }

    public static void b(UINode uINode, EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f483d32a", new Object[]{uINode, editText, str});
        } else {
            editText.setHint(str);
        }
    }

    public static void a(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0015db4", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute(Constants.Name.AUTOFOCUS, Boolean.valueOf(z));
        }
    }

    public static void f(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa78ae45", new Object[]{uINode, str});
        } else if (StringUtils.isEmpty(str)) {
            uINode.setAttribute("fontSize", Float.valueOf(32.0f));
        } else {
            uINode.setAttribute("fontSize", Integer.valueOf(Math.round(com.taobao.android.weex_framework.util.i.a(com.taobao.android.weex_framework.util.i.b(str, uINode.getInstance().getRpxPerRem())))));
        }
    }

    public static void c(UINode uINode, EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("624b1282", new Object[]{uINode, editText, new Integer(i)});
        } else {
            editText.setTextSize(0, i);
        }
    }

    public static void g(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78d9b224", new Object[]{uINode, str});
        } else if (StringUtils.isEmpty(str)) {
            uINode.setAttribute("filter", null);
        } else {
            int i = Integer.MAX_VALUE;
            try {
                i = (int) com.taobao.android.weex_framework.util.i.a(str, uINode.getInstance().getRpxPerRem());
            } catch (Exception unused) {
            }
            uINode.setAttribute("filter", new InputFilter.LengthFilter(i));
        }
    }

    public static void h(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f73ab603", new Object[]{uINode, str});
        } else {
            g(uINode, str);
        }
    }

    public static void a(UINode uINode, EditText editText, InputFilter.LengthFilter lengthFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36212000", new Object[]{uINode, editText, lengthFilter});
        } else if (lengthFilter == null) {
            editText.setFilters(new InputFilter[0]);
        } else {
            editText.setFilters(new InputFilter[]{lengthFilter});
        }
    }

    public static void i(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("759bb9e2", new Object[]{uINode, str});
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -906336856:
                if (str.equals("search")) {
                    c = 2;
                    break;
                }
                break;
            case 3304:
                if (str.equals("go")) {
                    c = 0;
                    break;
                }
                break;
            case 3089282:
                if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_done)) {
                    c = 4;
                    break;
                }
                break;
            case 3377907:
                if (str.equals("next")) {
                    c = 1;
                    break;
                }
                break;
            case 3526536:
                if (str.equals("send")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            i = 2;
        } else if (c == 1) {
            i = 5;
        } else if (c == 2) {
            i = 3;
        } else if (c == 3) {
            i = 4;
        } else if (c == 4) {
            i = 6;
        }
        uINode.setAttribute(Constants.Name.RETURN_KEY_TYPE, str);
        uINode.setExtra(JarvisConstant.KEY_ACTION_ID, Integer.valueOf(i));
    }

    public static void b(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("557b83f5", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute(Constants.Name.SINGLELINE, Boolean.valueOf(z));
        }
    }

    public static void a(UINode uINode, EditText editText, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5db5e895", new Object[]{uINode, editText, new Boolean(z)});
        } else {
            editText.setSingleLine(z);
        }
    }

    public static void j(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3fcbdc1", new Object[]{uINode, str});
        } else if (StringUtils.isEmpty(str)) {
            uINode.setAttribute(Constants.Name.PLACEHOLDER_COLOR, -6710887);
        } else {
            uINode.setAttribute(Constants.Name.PLACEHOLDER_COLOR, Integer.valueOf(com.taobao.android.weex_uikit.util.b.a(str)));
        }
    }

    public static void d(UINode uINode, EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e495c761", new Object[]{uINode, editText, new Integer(i)});
        } else {
            editText.setHintTextColor(i);
        }
    }

    public static void k(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("725dc1a0", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("max", str);
        }
    }

    public static void l(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0bec57f", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("min", str);
        }
    }

    public static void a(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59ce7920", new Object[]{uINode});
        } else if (!uINode.isMounted()) {
        } else {
            EditText editText = (EditText) uINode.getMountContent();
            if (editText != null) {
                editText.requestFocus();
            }
            b(uINode.getInstance().getUIContext(), (EditText) uINode.getMountContent());
        }
    }

    public static void b(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134606bf", new Object[]{uINode});
        } else if (!uINode.isMounted()) {
        } else {
            EditText editText = (EditText) uINode.getMountContent();
            if (!editText.isFocused()) {
                return;
            }
            a(uINode.getInstance().getUIContext(), editText);
            editText.clearFocus();
        }
    }

    public static void c(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccbd945e", new Object[]{uINode});
        } else if (!uINode.isMounted()) {
        } else {
            ((EditText) uINode.getMountContent()).setText("");
        }
    }

    public static void a(UINode uINode, int i, int i2) {
        EditText editText;
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20231180", new Object[]{uINode, new Integer(i), new Integer(i2)});
        } else if (!uINode.isMounted() || i > (length = (editText = (EditText) uINode.getMountContent()).length()) || i2 > length) {
        } else {
            a(uINode);
            editText.setSelection(i, i2);
        }
    }

    public static void a(UINode uINode, com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d9c937", new Object[]{uINode, bVar});
        } else if (!uINode.isMounted()) {
        } else {
            EditText editText = (EditText) uINode.getMountContent();
            JSONObject jSONObject = new JSONObject();
            int selectionStart = editText.getSelectionStart();
            int selectionEnd = editText.getSelectionEnd();
            if (!editText.hasFocus()) {
                selectionStart = 0;
                selectionEnd = 0;
            }
            jSONObject.put(Constants.Name.SELECTION_START, (Object) Integer.valueOf(selectionStart));
            jSONObject.put(Constants.Name.SELECTION_END, (Object) Integer.valueOf(selectionEnd));
            bVar.a(jSONObject);
        }
    }

    public static void a(UINode uINode, JSONObject jSONObject, C0622a c0622a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51a62fb9", new Object[]{uINode, jSONObject, c0622a});
            return;
        }
        try {
            String string = jSONObject.getString("formatRule");
            String string2 = jSONObject.getString("formatReplace");
            String string3 = jSONObject.getString("recoverRule");
            String string4 = jSONObject.getString("recoverReplace");
            e a2 = a(string, string2);
            e a3 = a(string3, string4);
            if (a2 == null || a3 == null) {
                return;
            }
            c0622a.f16177a = new g(a2, a3);
        } catch (Throwable th) {
            com.taobao.android.weex_framework.util.g.a(th);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
        if (r8.equals("datetime") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(android.widget.EditText r7, java.lang.String r8) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.weex_uikit.widget.input.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r7
            r1[r3] = r8
            java.lang.String r7 = "5a41ddd4"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            return r7
        L1c:
            r0 = -1
            int r1 = r8.hashCode()
            r5 = 3
            r6 = 4
            switch(r1) {
                case -1034364087: goto L7c;
                case 114715: goto L71;
                case 116079: goto L66;
                case 3076014: goto L5c;
                case 3556653: goto L50;
                case 3560141: goto L45;
                case 96619420: goto L3b;
                case 1216985755: goto L30;
                case 1793702779: goto L27;
                default: goto L26;
            }
        L26:
            goto L86
        L27:
            java.lang.String r1 = "datetime"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L86
            goto L87
        L30:
            java.lang.String r1 = "password"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L86
            r2 = 4
            goto L87
        L3b:
            java.lang.String r1 = "email"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L86
            r2 = 3
            goto L87
        L45:
            java.lang.String r1 = "time"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L86
            r2 = 0
            goto L87
        L50:
            java.lang.String r1 = "text"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L86
            r2 = 8
            goto L87
        L5c:
            java.lang.String r1 = "date"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L86
            r2 = 1
            goto L87
        L66:
            java.lang.String r1 = "url"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L86
            r2 = 6
            goto L87
        L71:
            java.lang.String r1 = "tel"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L86
            r2 = 5
            goto L87
        L7c:
            java.lang.String r1 = "number"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L86
            r2 = 7
            goto L87
        L86:
            r2 = -1
        L87:
            switch(r2) {
                case 0: goto La2;
                case 1: goto La2;
                case 2: goto La0;
                case 3: goto L9d;
                case 4: goto L93;
                case 5: goto L91;
                case 6: goto L8e;
                case 7: goto L8b;
                default: goto L8a;
            }
        L8a:
            goto La6
        L8b:
            r3 = 8194(0x2002, float:1.1482E-41)
            goto La6
        L8e:
            r3 = 17
            goto La6
        L91:
            r3 = 3
            goto La6
        L93:
            r3 = 129(0x81, float:1.81E-43)
            android.text.method.PasswordTransformationMethod r8 = android.text.method.PasswordTransformationMethod.getInstance()
            r7.setTransformationMethod(r8)
            goto La6
        L9d:
            r3 = 33
            goto La6
        La0:
            r3 = 4
            goto La6
        La2:
            r7.setFocusable(r4)
            r3 = 0
        La6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.input.a.a(android.widget.EditText, java.lang.String):int");
    }

    private static e a(String str, String str2) {
        Pattern pattern;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("43172f1c", new Object[]{str, str2});
        }
        if (str == null || str2 == null) {
            return null;
        }
        if (!Pattern.compile("/[\\S]+/[i]?[m]?[g]?").matcher(str).matches()) {
            com.taobao.android.weex_framework.util.g.c("Illegal js pattern syntax: " + str);
            return null;
        }
        String substring = str.substring(str.lastIndexOf("/") + 1);
        String substring2 = str.substring(str.indexOf("/") + 1, str.lastIndexOf("/"));
        if (substring.contains(q.MSGTYPE_INTERVAL)) {
            i = 2;
        }
        if (substring.contains("m")) {
            i |= 32;
        }
        boolean contains = substring.contains(at.f);
        try {
            pattern = Pattern.compile(substring2, i);
        } catch (PatternSyntaxException unused) {
            com.taobao.android.weex_framework.util.g.c("Pattern syntax error: " + substring2);
            pattern = null;
        }
        if (pattern == null) {
            return null;
        }
        e eVar = new e();
        eVar.f16186a = contains;
        eVar.b = pattern;
        eVar.c = str2;
        return eVar;
    }
}

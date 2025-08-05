package com.taobao.android.icart.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import com.taobao.weex.common.Constants;
import tb.bbz;
import tb.bdn;
import tb.gbg;
import tb.jqg;
import tb.kge;

/* loaded from: classes5.dex */
public class e extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXCARTTEXTINPUT_CARTTEXTINPUT = 7725616973349109612L;
    public static final long DXCARTTEXTINPUT_FOCUS = 17608939249605L;
    public static final long DXCARTTEXTINPUT_KEYBOARD = 4100686809917705561L;
    public static final int DXCARTTEXTINPUT_KEYBOARD_DIGIT = 1;
    public static final int DXCARTTEXTINPUT_KEYBOARD_NORMAL = 0;
    public static final int DXCARTTEXTINPUT_KEYBOARD_PHONE = 2;
    public static final long DXCARTTEXTINPUT_MAXLENGTH = -2628107586387168847L;
    public static final long DXCARTTEXTINPUT_ONCHANGE = 5288679823228297259L;
    public static final long DXCARTTEXTINPUT_ONFINISH = 5288693272742377286L;
    public static final long DXCARTTEXTINPUT_PLACEHOLDER = 5980555813819279758L;
    public static final long DXCARTTEXTINPUT_PLACEHOLDERCOLOR = 1205272363096125842L;
    public static final long DXCARTTEXTINPUT_RETURNTYPE = -2488226218508878772L;
    public static final int DXCARTTEXTINPUT_RETURNTYPE_DONE = 2;
    public static final int DXCARTTEXTINPUT_RETURNTYPE_GO = 0;
    public static final int DXCARTTEXTINPUT_RETURNTYPE_SEARCH = 1;
    public static final long DXCARTTEXTINPUT_TEXT = 38178040921L;
    public static final long DXCARTTEXTINPUT_TEXTCOLOR = 5737767606580872653L;
    public static final long DXCARTTEXTINPUT_TEXTGRAVITY = -1564827143683948874L;
    public static final int DXCARTTEXTINPUT_TEXTGRAVITY_CENTER = 1;
    public static final int DXCARTTEXTINPUT_TEXTGRAVITY_LEFT = 0;
    public static final int DXCARTTEXTINPUT_TEXTGRAVITY_RIGHT = 2;
    public static final long DXCARTTEXTINPUT_TEXTSIZE = 6751005219504497256L;
    private int e;
    private int h;
    private int j;

    /* renamed from: a  reason: collision with root package name */
    private boolean f12875a = false;
    private int b = 0;
    private int c = 0;
    private String d = "null";
    private int f = 0;
    private String g = "";
    private int i = 0;

    static {
        kge.a(1030830397);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new e();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof e)) {
        } else {
            super.onClone(dXWidgetNode, z);
            e eVar = (e) dXWidgetNode;
            this.f12875a = eVar.f12875a;
            this.b = eVar.b;
            this.c = eVar.c;
            this.d = eVar.d;
            this.e = eVar.e;
            this.f = eVar.f;
            this.g = eVar.g;
            this.h = eVar.h;
            this.i = eVar.i;
            this.j = eVar.j;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        bbz a2 = a();
        LinearLayout linearLayout = new LinearLayout(context);
        final EditText editText = new EditText(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        editText.setLines(1);
        editText.setSingleLine();
        editText.setImeOptions(3);
        editText.setEllipsize(null);
        editText.setLayoutParams(layoutParams);
        editText.setBackgroundDrawable(null);
        editText.setPadding(0, 0, 0, 0);
        editText.setTextSize(a2 == null ? gbg.b(context, 15.0f) : a2.x().a(15.0f));
        editText.setTag("editText");
        final LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(a2 == null ? gbg.b(context, 36.0f) : a2.x().a(36.0f), -1));
        linearLayout2.setGravity(21);
        linearLayout2.setTag("iconFontRootView");
        TIconFontTextView tIconFontTextView = new TIconFontTextView(context);
        tIconFontTextView.setTextColor(Color.parseColor("#BBBBBB"));
        tIconFontTextView.setText(context.getString(R.string.clear_text_icon));
        tIconFontTextView.setGravity(17);
        int b2 = a2 == null ? gbg.b(context, 15.0f) : a2.x().a(15.0f);
        tIconFontTextView.setLayoutParams(new ViewGroup.LayoutParams(b2, b2));
        editText.addTextChangedListener(new TextWatcher() { // from class: com.taobao.android.icart.widget.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77fdbb29", new Object[]{this, editable});
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
                int i4 = 4;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                    return;
                }
                LinearLayout linearLayout3 = linearLayout2;
                if (editText.isFocused() && charSequence != null && charSequence.length() > 0) {
                    i4 = 0;
                }
                linearLayout3.setVisibility(i4);
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.icart.widget.e.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    editText.getText().clear();
                }
            }
        });
        linearLayout.addView(editText);
        linearLayout2.addView(tIconFontTextView);
        linearLayout.addView(linearLayout2);
        return linearLayout;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        EditText editText = (EditText) view.findViewWithTag("editText");
        editText.setHint(this.d);
        editText.setHintTextColor(tryFetchDarkModeColor(Constants.Name.PLACEHOLDER_COLOR, 0, this.e));
        editText.setText(this.g);
        editText.setTextSize(0, this.j);
        editText.setTextColor(tryFetchDarkModeColor("textColor", 0, this.h));
        a(editText, this.i);
        b(editText, this.b);
        int i = this.c;
        if (i <= 0) {
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Integer.MAX_VALUE)});
        } else {
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        }
        int i2 = this.f;
        if (i2 == 0) {
            editText.setImeOptions(2);
        } else if (i2 == 2) {
            editText.setImeOptions(6);
        } else {
            editText.setImeOptions(3);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
            return;
        }
        super.onBindEvent(context, view, j);
        final EditText editText = (EditText) view.findViewWithTag("editText");
        if (j == 5288693272742377286L) {
            editText.setOnFocusChangeListener(new a(view));
            editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.taobao.android.icart.widget.DXCartTextInputWidgetNode$3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.TextView.OnEditorActionListener
                public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i), keyEvent})).booleanValue();
                    }
                    if (i != 2 && i != 6 && i != 3) {
                        return false;
                    }
                    e.this.postEvent(new DXEvent(j));
                    editText.clearFocus();
                    return true;
                }
            });
        } else if (j != 5288679823228297259L) {
        } else {
            b bVar = (b) editText.getTag(com.taobao.android.dinamic.j.TEXT_WATCHER);
            if (bVar != null) {
                editText.removeTextChangedListener(bVar);
            }
            b bVar2 = new b(this);
            editText.setTag(com.taobao.android.dinamic.j.TEXT_WATCHER, bVar2);
            editText.addTextChangedListener(bVar2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXCARTTEXTINPUT_PLACEHOLDER) {
            this.d = str;
        } else if (j == 38178040921L) {
            this.g = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXCARTTEXTINPUT_FOCUS) {
            if (i == 0) {
                z = false;
            }
            this.f12875a = z;
        } else if (j == DXCARTTEXTINPUT_KEYBOARD) {
            this.b = i;
        } else if (j == DXCARTTEXTINPUT_MAXLENGTH) {
            this.c = i;
        } else if (j == DXCARTTEXTINPUT_PLACEHOLDERCOLOR) {
            this.e = i;
        } else if (j == DXCARTTEXTINPUT_RETURNTYPE) {
            this.f = i;
        } else if (j == 5737767606580872653L) {
            this.h = i;
        } else if (j == -1564827143683948874L) {
            this.i = i;
        } else if (j == 6751005219504497256L) {
            this.j = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)}) : j == DXCARTTEXTINPUT_PLACEHOLDER ? "null" : j == 38178040921L ? "" : super.getDefaultValueForStringAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j != DXCARTTEXTINPUT_FOCUS && j != DXCARTTEXTINPUT_KEYBOARD && j != DXCARTTEXTINPUT_MAXLENGTH && j != DXCARTTEXTINPUT_RETURNTYPE && j != -1564827143683948874L) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 0;
    }

    public void a(EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c6920c", new Object[]{this, editText, new Integer(i)});
        } else if (i == 0) {
            editText.setGravity(19);
        } else if (i == 1) {
            editText.setGravity(17);
        } else if (i == 2) {
            editText.setGravity(21);
        } else {
            editText.setGravity(16);
        }
    }

    public void b(EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5af5a4d", new Object[]{this, editText, new Integer(i)});
        } else if (i == 0) {
            editText.setInputType(1);
        } else if (i == 1) {
            editText.setInputType(2);
        } else if (i == 2) {
            editText.setInputType(3);
        } else {
            editText.setInputType(1);
        }
    }

    private bbz a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbz) ipChange.ipc$dispatch("f02b024", new Object[]{this});
        }
        bbz a2 = bdn.a(getDXRuntimeContext());
        if (a2 != null) {
            return a2;
        }
        jqg.a("iCart", "CartTextInput", "cartPresenter is null");
        return null;
    }

    /* loaded from: classes5.dex */
    public static class a implements View.OnFocusChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private View f12878a;

        static {
            kge.a(44830133);
            kge.a(632431720);
        }

        public a(View view) {
            this.f12878a = view;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                return;
            }
            EditText editText = (EditText) view;
            InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
            if (inputMethodManager == null) {
                return;
            }
            if (z) {
                inputMethodManager.toggleSoftInput(1, 2);
            } else {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            a(editText, z);
            editText.setCursorVisible(z);
        }

        private void a(EditText editText, boolean z) {
            View findViewWithTag;
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0c6d1dd", new Object[]{this, editText, new Boolean(z)});
                return;
            }
            View view = this.f12878a;
            if (view == null || (findViewWithTag = view.findViewWithTag("iconFontRootView")) == null) {
                return;
            }
            if (editText.getText().length() <= 0 || !z) {
                i = 4;
            }
            findViewWithTag.setVisibility(i);
        }
    }

    /* loaded from: classes5.dex */
    public static class b implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public DXEvent f12879a = new DXEvent(5288679823228297259L);
        private e b;

        static {
            kge.a(-1888673204);
            kge.a(1670231405);
        }

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

        public b(e eVar) {
            this.b = eVar;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            } else {
                this.b.postEvent(this.f12879a);
            }
        }
    }
}

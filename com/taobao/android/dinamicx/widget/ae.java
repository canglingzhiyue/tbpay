package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXTextInputEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.weex.common.Constants;
import tb.gbg;
import tb.kge;

/* loaded from: classes5.dex */
public class ae extends DXWidgetNode implements ak {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_TEXT_COLOR = -16777216;

    /* renamed from: a  reason: collision with root package name */
    public static int f12044a;
    public int c;
    public float d;
    public int e;
    public int f;
    public int g;
    public String h;
    public int i = -7829368;
    public CharSequence b = "";

    public static /* synthetic */ Object ipc$super(ae aeVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -857616453:
                super.setBackground((View) objArr[0]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
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

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int reusePoolMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184462af", new Object[]{this})).intValue();
        }
        return 3;
    }

    static {
        kge.a(1031890807);
        kge.a(349752956);
        f12044a = 0;
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1381968050);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new ae();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new ae();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        EditText editText = new EditText(context);
        editText.setLines(1);
        editText.setSingleLine();
        editText.setImeOptions(6);
        editText.setEllipsize(null);
        return editText;
    }

    public ae() {
        this.c = -16777216;
        this.e = 0;
        this.c = -16777216;
        if (f12044a == 0 && DinamicXEngine.i() != null) {
            f12044a = gbg.a(DinamicXEngine.i(), 12.0f);
        }
        this.d = f12044a;
        this.e = 0;
        setAccessibility(1);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int a2 = DXWidgetNode.DXMeasureSpec.a(i);
        int a3 = DXWidgetNode.DXMeasureSpec.a(i2);
        boolean z2 = a2 == 1073741824;
        if (a3 != 1073741824) {
            z = false;
        }
        int b2 = z2 ? DXWidgetNode.DXMeasureSpec.b(i) : 0;
        if (z) {
            i3 = DXWidgetNode.DXMeasureSpec.b(i2);
        }
        setMeasuredDimension(b2, i3);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof ae)) {
            return;
        }
        ae aeVar = (ae) dXWidgetNode;
        this.b = aeVar.b;
        this.c = aeVar.c;
        this.d = aeVar.d;
        this.e = aeVar.e;
        this.f = aeVar.f;
        this.h = aeVar.h;
        this.g = aeVar.g;
        this.i = aeVar.i;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 5737767606580872653L) {
            return -16777216;
        }
        if (j == 6751005219504497256L) {
            return f12044a;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (5737767606580872653L == j) {
            this.c = i;
        } else if (-1564827143683948874L == j) {
            this.e = i;
        } else if (com.taobao.android.icart.widget.e.DXCARTTEXTINPUT_MAXLENGTH == j) {
            this.g = i;
        } else if (com.taobao.android.icart.widget.e.DXCARTTEXTINPUT_PLACEHOLDERCOLOR == j) {
            this.i = i;
        } else if (6751005219504497256L == j) {
            this.d = i;
        } else if (com.taobao.android.icart.widget.e.DXCARTTEXTINPUT_KEYBOARD == j) {
            this.f = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (38178040921L == j) {
            this.b = str;
        } else if (com.taobao.android.icart.widget.e.DXCARTTEXTINPUT_PLACEHOLDER == j) {
            this.h = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void setBackground(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce1cfbb", new Object[]{this, view});
            return;
        }
        super.setBackground(view);
        if (this.needSetBackground) {
            return;
        }
        view.setBackgroundColor(0);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view == null || !(view instanceof EditText)) {
        } else {
            final EditText editText = (EditText) view;
            editText.setHint(this.h);
            editText.setHintTextColor(tryFetchDarkModeColor(Constants.Name.PLACEHOLDER_COLOR, 0, this.i));
            editText.setText(this.b);
            editText.setTextSize(0, this.d);
            editText.setTextColor(tryFetchDarkModeColor("textColor", 0, this.c));
            c(editText, this.e);
            b(editText, this.f);
            editText.setCursorVisible(false);
            editText.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.android.dinamicx.widget.ae.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view2, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view2, motionEvent})).booleanValue();
                    }
                    if (motionEvent.getActionMasked() == 1) {
                        editText.setCursorVisible(true);
                    }
                    return false;
                }
            });
            int i = this.g;
            if (i <= 0) {
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Integer.MAX_VALUE)});
            } else {
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else if (j == 5288679823228297259L) {
            b bVar = (b) view.getTag(com.taobao.android.dinamic.j.TEXT_WATCHER);
            if (bVar != null) {
                ((EditText) view).removeTextChangedListener(bVar);
            }
            b bVar2 = new b(this, view);
            view.setTag(com.taobao.android.dinamic.j.TEXT_WATCHER, bVar2);
            ((EditText) view).addTextChangedListener(bVar2);
        } else {
            super.onBindEvent(context, view, j);
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

    public void c(EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca98228e", new Object[]{this, editText, new Integer(i)});
        } else if (i == 0) {
            editText.setGravity(51);
        } else if (i == 1) {
            editText.setGravity(17);
        } else if (i == 2) {
            editText.setGravity(53);
        } else {
            editText.setGravity(16);
        }
    }

    /* loaded from: classes5.dex */
    public static class b implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public DXTextInputEvent f12046a = new DXTextInputEvent(5288679823228297259L);
        private ae b;
        private View c;

        static {
            kge.a(1896607570);
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

        public b(ae aeVar, View view) {
            this.b = aeVar;
            this.c = view;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            this.f12046a.setText(((EditText) this.c).getText());
            this.b.postEvent(this.f12046a);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue() : getClass() == ae.class;
    }
}

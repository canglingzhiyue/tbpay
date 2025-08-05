package com.taobao.android.dinamicx.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXTextInputEvent;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.lang.reflect.Field;
import tb.fuw;
import tb.kge;

/* loaded from: classes5.dex */
public class ad extends ae {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXORDERTEXTINPUTVIEWCHEN_CURSORCOLOR = -1990674490194665048L;
    public static final long DXTEXTINPUTVIEW_COUNTNUMCOLOR = 9071837297406208101L;
    public static final long DXTEXTINPUTVIEW_ISSHOWHINTNUM = 2472129721305181261L;
    public static final long DXTEXTINPUTVIEW_ISSINGLELINE = 9201315914461489362L;
    public static final long DXTEXTINPUTVIEW_MULTILINEMAXHEIGHT = 2175688563532828996L;
    public static final long DXTEXTINPUTVIEW_TEXTINPUTVIEW = -7398276613927103139L;
    public static final long DXTEXTINPUTVIEW_TOTALNUMCOLOR = 36296692771444064L;
    private int j;
    private int l;
    private int m;
    private int n;
    private boolean k = true;
    private boolean o = false;

    static {
        kge.a(1224885116);
    }

    public static /* synthetic */ Object ipc$super(ad adVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.ae, com.taobao.android.dinamicx.widget.DXWidgetNode
    public int reusePoolMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184462af", new Object[]{this})).intValue();
        }
        return 3;
    }

    public static /* synthetic */ void a(ad adVar, EditText editText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2148a8a1", new Object[]{adVar, editText});
        } else {
            adVar.a(editText);
        }
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-304357805);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new ad();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.ae, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new ad();
    }

    @Override // com.taobao.android.dinamicx.widget.ae, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        if (!this.k) {
            View a2 = com.taobao.android.dinamicx.widget.scroller.a.a(context, R.layout.multi_line_input_view);
            ((EditText) a2.findViewById(R.id.dx_multi_line_input)).setBackgroundColor(0);
            if (this.o) {
                ((TextView) a2.findViewById(R.id.tv_word_total)).setVisibility(0);
                ((TextView) a2.findViewById(R.id.tv_word_count)).setVisibility(0);
            }
            return a2;
        }
        return super.onCreateView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.ae, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!this.k) {
            setMeasuredDimension(i, this.j);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.ae, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof ad)) {
            return;
        }
        ad adVar = (ad) dXWidgetNode;
        this.j = adVar.j;
        this.k = adVar.k;
        this.l = adVar.l;
        this.o = adVar.o;
        this.m = adVar.m;
        this.n = adVar.n;
    }

    @Override // com.taobao.android.dinamicx.widget.ae, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXTEXTINPUTVIEW_MULTILINEMAXHEIGHT) {
            this.j = i;
        } else if (j == DXORDERTEXTINPUTVIEWCHEN_CURSORCOLOR) {
            this.l = i;
        } else if (j == DXTEXTINPUTVIEW_COUNTNUMCOLOR) {
            this.m = i;
        } else if (j == DXTEXTINPUTVIEW_TOTALNUMCOLOR) {
            this.n = i;
        } else if (j == DXTEXTINPUTVIEW_ISSINGLELINE) {
            if (i == 0) {
                z = false;
            }
            this.k = z;
        } else if (j == DXTEXTINPUTVIEW_ISSHOWHINTNUM) {
            if (i == 0) {
                z = false;
            }
            this.o = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.ae, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, final View view) {
        final EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view == null) {
        } else {
            if (!(view instanceof EditText) && !(view instanceof RelativeLayout)) {
                return;
            }
            if (!this.k) {
                editText = (EditText) view.findViewById(R.id.dx_multi_line_input);
                final TextView textView = (TextView) view.findViewById(R.id.tv_word_total);
                if (this.g > 0) {
                    textView.setText("/" + this.g);
                }
                int i = this.m;
                if (i != 0) {
                    ((TextView) view.findViewById(R.id.tv_word_count)).setTextColor(tryFetchDarkModeColor("textColor", 0, i));
                }
                int i2 = this.n;
                if (i2 != 0) {
                    textView.setTextColor(tryFetchDarkModeColor("textColor", 0, i2));
                }
                view.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.dinamicx.widget.ad.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                            return;
                        }
                        editText.requestFocus();
                        editText.setCursorVisible(true);
                        ad.a(ad.this, editText);
                    }
                });
                if (this.o) {
                    view.post(new Runnable() { // from class: com.taobao.android.dinamicx.widget.ad.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                editText.setMaxHeight((view.getHeight() - textView.getMeasuredHeight()) - ((RelativeLayout.LayoutParams) textView.getLayoutParams()).bottomMargin);
                            }
                        }
                    });
                }
            } else {
                editText = (EditText) view;
                b(editText, this.f);
            }
            editText.setHint(this.h);
            editText.setHintTextColor(tryFetchDarkModeColor(Constants.Name.PLACEHOLDER_COLOR, 0, this.i));
            editText.setText(this.b);
            editText.setTextSize(0, this.d);
            editText.setTextColor(tryFetchDarkModeColor("textColor", 0, this.c));
            c(editText, this.e);
            editText.setCursorVisible(false);
            int i3 = this.l;
            if (i3 != 0) {
                a(editText, i3);
            }
            editText.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.android.dinamicx.widget.ad.3
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
            if (this.g <= 0) {
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Integer.MAX_VALUE)});
            } else {
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.g)});
            }
        }
    }

    public void a(EditText editText, int i) {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                declaredField.setAccessible(true);
                int i2 = declaredField.getInt(editText);
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                declaredField2.setAccessible(true);
                Object obj = declaredField2.get(editText);
                Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
                declaredField3.setAccessible(true);
                Drawable[] drawableArr = {editText.getContext().getResources().getDrawable(i2), editText.getContext().getResources().getDrawable(i2)};
                drawableArr[0].setColorFilter(i, PorterDuff.Mode.SRC_IN);
                drawableArr[1].setColorFilter(i, PorterDuff.Mode.SRC_IN);
                declaredField3.set(obj, drawableArr);
                return;
            }
            editText.setTextCursorDrawable(new ColorDrawable(i));
        } catch (Throwable unused) {
            fuw.d("DinamicX", "textInput 游标颜色设置失败");
        }
    }

    private void a(EditText editText) {
        InputMethodManager inputMethodManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe55bd7", new Object[]{this, editText});
        } else if (editText == null || getDXRuntimeContext() == null || getDXRuntimeContext().m() == null) {
        } else {
            if (((getDXRuntimeContext().m() instanceof Activity) && ((Activity) getDXRuntimeContext().m()).isFinishing()) || (inputMethodManager = (InputMethodManager) getDXRuntimeContext().m().getSystemService("input_method")) == null) {
                return;
            }
            editText.requestFocus();
            editText.requestFocusFromTouch();
            inputMethodManager.showSoftInput(editText, 0);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.ae, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else if (j == 5288679823228297259L) {
            if (view instanceof EditText) {
                super.onBindEvent(context, view, j);
                return;
            }
            b bVar = (b) view.getTag(com.taobao.android.dinamic.j.TEXT_WATCHER);
            EditText editText = (EditText) view.findViewById(R.id.dx_multi_line_input);
            if (bVar != null) {
                editText.removeTextChangedListener(bVar);
            }
            b bVar2 = new b(this, view);
            view.setTag(com.taobao.android.dinamic.j.TEXT_WATCHER, bVar2);
            editText.addTextChangedListener(bVar2);
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    /* loaded from: classes5.dex */
    public static class b implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public DXTextInputEvent f12043a = new DXTextInputEvent(5288679823228297259L);
        private ad b;
        private View c;

        static {
            kge.a(179830253);
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

        public b(ad adVar, View view) {
            this.b = adVar;
            this.c = view;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            View view = this.c;
            if (view instanceof RelativeLayout) {
                ((TextView) view.findViewById(R.id.tv_word_count)).setText(String.valueOf(charSequence.length()));
                this.f12043a.setText(((EditText) this.c.findViewById(R.id.dx_multi_line_input)).getText());
                this.b.postEvent(this.f12043a);
                return;
            }
            this.f12043a.setText(((EditText) view).getText());
            this.b.postEvent(this.f12043a);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.ae, com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue() : getClass() == ad.class;
    }
}

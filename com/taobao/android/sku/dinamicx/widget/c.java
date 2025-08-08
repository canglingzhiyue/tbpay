package com.taobao.android.sku.dinamicx.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import mtopsdk.common.util.StringUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.af;
import com.taobao.android.sku.utils.f;
import com.taobao.android.sku.widget.c;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import tb.bpl;
import tb.fxa;
import tb.kge;

/* loaded from: classes6.dex */
public class c extends af {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_WIDGET_ID;
    public static final int ID_KEY_BOARD;
    public static final int ID_MAX_LENGTH;
    public static final int ID_PLACE_HOLDER;
    public static final int ID_PLACE_HOLDER_COLOR;
    public static final int ID_TV_TEXT;
    public static final String INPUT_TYPE_DIALOG = "dialog";
    public static final String INPUT_TYPE_INPUT = "input";

    /* renamed from: a  reason: collision with root package name */
    private static final long f15167a;
    private static final long b;
    private static final long c;
    private static final long d;
    private static final long e;
    private static final long f;
    private static final int g;
    private String h;
    private String i;
    private int j;
    private int k;
    private int l;
    private String m;

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -732824995:
                super.onBeforeMeasure((TextView) objArr[0]);
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
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

    public static /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : g;
    }

    public static /* synthetic */ long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[0])).longValue() : f;
    }

    static {
        kge.a(-1548652519);
        DX_WIDGET_ID = fxa.a("skuTextInput");
        f15167a = fxa.a("placeholder");
        b = fxa.a(Constants.Name.PLACEHOLDER_COLOR);
        c = fxa.a("keyboard");
        d = fxa.a(Constants.Name.MAX_LENGTH);
        e = fxa.a(RemoteMessageConst.INPUT_TYPE);
        f = fxa.a("onFinish");
        ID_TV_TEXT = R.id.sku_id_text;
        ID_KEY_BOARD = R.id.sku_id_key_board;
        ID_MAX_LENGTH = R.id.sku_id_max_length;
        ID_PLACE_HOLDER = R.id.sku_id_place_holder;
        ID_PLACE_HOLDER_COLOR = R.id.sku_id_place_holder_color;
        g = R.id.sku_text_watcher;
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        EditText editText = new EditText(context);
        editText.setPadding(0, 0, 0, 0);
        return editText;
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new c();
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        super.onSetStringAttribute(j, str);
        if (38178040921L == j) {
            this.h = str;
        } else if (f15167a == j) {
            this.i = str;
        } else if (e != j) {
        } else {
            this.m = str;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        super.onSetIntAttribute(j, i);
        if (b == j) {
            this.j = i;
        } else if (c == j) {
            this.k = i;
        } else if (d != j) {
        } else {
            this.l = i;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof c)) {
            return;
        }
        c cVar = (c) dXWidgetNode;
        this.h = cVar.h;
        this.i = cVar.i;
        this.j = cVar.j;
        this.k = cVar.k;
        this.l = cVar.l;
        this.m = cVar.m;
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (!(view instanceof EditText)) {
        } else {
            view.setTag(ID_TV_TEXT, this.h);
            EditText editText = (EditText) view;
            f.c(editText, this.j);
            view.setTag(ID_PLACE_HOLDER_COLOR, Integer.valueOf(this.j));
            f.a(editText, this.k);
            view.setTag(ID_KEY_BOARD, Integer.valueOf(this.k));
            f.b(editText, this.l);
            view.setTag(ID_MAX_LENGTH, Integer.valueOf(this.l));
            if (!StringUtils.isEmpty(this.i)) {
                f.a(editText, this.i);
                view.setTag(ID_PLACE_HOLDER, this.i);
            } else if (StringUtils.isEmpty(this.m)) {
            } else {
                a(editText, "input".equalsIgnoreCase(this.m));
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af
    public void onBeforeMeasure(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d451fa5d", new Object[]{this, textView});
            return;
        }
        super.onBeforeMeasure(textView);
        a(textView);
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        a(view);
    }

    private void a(EditText editText, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c6d1dd", new Object[]{this, editText, new Boolean(z)});
        } else if (editText == null) {
        } else {
            editText.setFocusable(z);
            editText.setFocusableInTouchMode(z);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
            return;
        }
        super.onBindEvent(context, view, j);
        if (f != j) {
            return;
        }
        new a(this.m).a(view);
    }

    /* loaded from: classes6.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String b;

        static {
            kge.a(387324077);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3e8859f", new Object[]{aVar}) : aVar.b;
        }

        public a(String str) {
            this.b = str;
        }

        public void a(final View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            } else if (!(view instanceof EditText)) {
            } else {
                b bVar = (b) view.getTag(c.a());
                if (bVar != null) {
                    ((EditText) view).removeTextChangedListener(bVar);
                }
                EditText editText = (EditText) view;
                b bVar2 = new b(editText, this.b);
                view.setTag(c.a(), bVar2);
                editText.addTextChangedListener(bVar2);
                view.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.sku.dinamicx.widget.c.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        } else if (view2.isFocusable()) {
                        } else {
                            com.taobao.android.sku.widget.c cVar = new com.taobao.android.sku.widget.c(view2.getContext());
                            cVar.a((EditText) view);
                            cVar.a(new c.a() { // from class: com.taobao.android.sku.dinamicx.widget.c.a.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.taobao.android.sku.widget.c.a
                                public void a(DialogInterface dialogInterface, CharSequence charSequence) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("14e7e1a2", new Object[]{this, dialogInterface, charSequence});
                                    } else {
                                        a.this.a(view, a.a(a.this), charSequence);
                                    }
                                }
                            });
                            cVar.show();
                        }
                    }
                });
            }
        }

        public void a(View view, String str, CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("524ccf58", new Object[]{this, view, str, charSequence});
            } else if (!"dialog".equals(str)) {
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(String.valueOf(charSequence));
                view.setTag(bpl.DINAMICX_3_CUSTOM_INPUT_KEY, arrayList);
                c.this.postEvent(new DXEvent(c.b()));
            }
        }
    }

    /* loaded from: classes6.dex */
    public class b implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private EditText b;
        private String c;

        static {
            kge.a(608042736);
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

        public b(EditText editText, String str) {
            this.b = editText;
            this.c = str;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            } else if (!this.b.isFocusable() || !"input".equals(this.c)) {
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(String.valueOf(this.b.getText()));
                this.b.setTag(bpl.DINAMICX_3_CUSTOM_INPUT_KEY, arrayList);
                c.this.postEvent(new DXEvent(c.b()));
            }
        }
    }
}

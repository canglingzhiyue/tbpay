package tb;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import mtopsdk.common.util.StringUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.af;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import tb.bmw;

/* loaded from: classes2.dex */
public class bmp extends af {
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
    private static final long f25981a;
    private static final long b;
    private static final long c;
    private static final long d;
    private static final long e;
    private static final long f;
    private static final long g;
    private static final int h;
    private String i;
    private String j;
    private int k;
    private int l;
    private int m;
    private String n;
    private String o;

    public static /* synthetic */ Object ipc$super(bmp bmpVar, String str, Object... objArr) {
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
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : h;
    }

    public static /* synthetic */ long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[0])).longValue() : g;
    }

    static {
        kge.a(-174919756);
        DX_WIDGET_ID = fxa.a(dtg.WIDGET_NAME);
        f25981a = fxa.a("placeholder");
        b = fxa.a(Constants.Name.PLACEHOLDER_COLOR);
        c = fxa.a("keyboard");
        d = fxa.a(Constants.Name.MAX_LENGTH);
        e = fxa.a(RemoteMessageConst.INPUT_TYPE);
        f = fxa.a("textUnit");
        g = fxa.a("onFinish");
        ID_TV_TEXT = R.id.trade_id_text;
        ID_KEY_BOARD = R.id.trade_id_key_board;
        ID_MAX_LENGTH = R.id.trade_id_max_length;
        ID_PLACE_HOLDER = R.id.trade_id_place_holder;
        ID_PLACE_HOLDER_COLOR = R.id.trade_id_place_holder_color;
        h = R.id.trade_text_watcher;
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
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new bmp();
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
            this.i = str;
        } else if (f25981a == j) {
            this.j = str;
        } else if (e == j) {
            this.o = str;
        } else if (f != j) {
        } else {
            this.n = str;
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
            this.k = i;
        } else if (c == j) {
            this.l = i;
        } else if (d != j) {
        } else {
            this.m = i;
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
        if (!(dXWidgetNode instanceof bmp)) {
            return;
        }
        bmp bmpVar = (bmp) dXWidgetNode;
        this.i = bmpVar.i;
        this.n = bmpVar.n;
        this.j = bmpVar.j;
        this.k = bmpVar.k;
        this.l = bmpVar.l;
        this.m = bmpVar.m;
        this.o = bmpVar.o;
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (!(view instanceof EditText)) {
        } else {
            view.setTag(ID_TV_TEXT, this.i);
            EditText editText = (EditText) view;
            bmu.c(editText, this.k);
            view.setTag(ID_PLACE_HOLDER_COLOR, Integer.valueOf(this.k));
            bmu.a(editText, this.l);
            view.setTag(ID_KEY_BOARD, Integer.valueOf(this.l));
            bmu.b(editText, this.m);
            view.setTag(ID_MAX_LENGTH, Integer.valueOf(this.m));
            if (!StringUtils.isEmpty(this.j)) {
                bmu.a(editText, this.j);
                view.setTag(ID_PLACE_HOLDER, this.j);
            } else if (StringUtils.isEmpty(this.o)) {
            } else {
                a(editText, "input".equalsIgnoreCase(this.o));
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
        if (!StringUtils.isEmpty(this.n)) {
            setText(this.i + this.n);
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
        if (g != j) {
            return;
        }
        new b(this.o).a(view);
    }

    /* loaded from: classes2.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1945686667);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new bmp();
        }
    }

    /* loaded from: classes2.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String b;

        static {
            kge.a(359216968);
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e07d6a4b", new Object[]{bVar}) : bVar.b;
        }

        public b(String str) {
            this.b = str;
        }

        public void a(final View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            } else if (!(view instanceof EditText)) {
            } else {
                c cVar = (c) view.getTag(bmp.a());
                if (cVar != null) {
                    ((EditText) view).removeTextChangedListener(cVar);
                }
                c cVar2 = new c(view, this.b);
                view.setTag(bmp.a(), cVar2);
                ((EditText) view).addTextChangedListener(cVar2);
                view.setOnTouchListener(new View.OnTouchListener() { // from class: tb.bmp.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view2, MotionEvent motionEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view2, motionEvent})).booleanValue();
                        }
                        if (motionEvent.getActionMasked() != 1 || view2.isFocusable()) {
                            return false;
                        }
                        Context context = view2.getContext();
                        if (jqi.a("ultron", "checkViewContextOnTextInput", true) && (context instanceof fpz)) {
                            fpz fpzVar = (fpz) context;
                            if (fpzVar.a() != null) {
                                context = fpzVar.a();
                            }
                        }
                        bmw bmwVar = new bmw(context);
                        bmwVar.a((EditText) view);
                        bmwVar.a(new bmw.a() { // from class: tb.bmp.b.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.bmw.a
                            public void a(DialogInterface dialogInterface, CharSequence charSequence) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("14e7e1a2", new Object[]{this, dialogInterface, charSequence});
                                } else {
                                    b.this.a(view, b.a(b.this));
                                }
                            }
                        });
                        bmwVar.show();
                        return true;
                    }
                });
            }
        }

        public void a(View view, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76c0c6b4", new Object[]{this, view, str});
            } else if (!"dialog".equals(str)) {
            } else {
                ArrayList arrayList = new ArrayList(5);
                arrayList.add("dialog");
                arrayList.add(((EditText) view).getText());
                view.setTag(bpl.DINAMICX_3_CUSTOM_INPUT_KEY, arrayList);
                bmp.this.postEvent(new DXEvent(bmp.b()));
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private View b;
        private String c;

        static {
            kge.a(335431861);
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

        public c(View view, String str) {
            this.b = view;
            this.c = str;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            } else if (!this.b.isFocusable() || !"input".equals(this.c)) {
            } else {
                ArrayList arrayList = new ArrayList(5);
                arrayList.add("input");
                arrayList.add(((EditText) this.b).getText());
                this.b.setTag(bpl.DINAMICX_3_CUSTOM_INPUT_KEY, arrayList);
                bmp.this.postEvent(new DXEvent(bmp.b()));
            }
        }
    }
}

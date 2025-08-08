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
import com.taobao.android.dinamicx.expression.event.DXTextInputEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.af;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import tb.dtf;

/* loaded from: classes4.dex */
public class dtg extends af {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_WIDGET_ID;
    public static final int ID_KEY_BOARD;
    public static final int ID_MAX_LENGTH;
    public static final int ID_PLACE_HOLDER;
    public static final int ID_PLACE_HOLDER_COLOR;
    public static final int ID_TV_TEXT;
    public static final String INPUT_TYPE_DIALOG = "dialog";
    public static final String INPUT_TYPE_INPUT = "input";
    public static final String WIDGET_NAME = "tdTextInput";

    /* renamed from: a  reason: collision with root package name */
    private static final int f26956a;
    private static final long b;
    private static final long c;
    private static final long d;
    private static final long e;
    private static final long f;
    private static final long g;
    private static final long h;
    private String i;
    private String j;
    private String k;
    private String l;
    private int m;
    private int n;
    private int o;

    public static /* synthetic */ Object ipc$super(dtg dtgVar, String str, Object... objArr) {
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
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : f26956a;
    }

    public static /* synthetic */ void a(dtg dtgVar, Editable editable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5babacfa", new Object[]{dtgVar, editable});
        } else {
            dtgVar.a(editable);
        }
    }

    static {
        kge.a(-300128014);
        DX_WIDGET_ID = fxa.a(WIDGET_NAME);
        ID_TV_TEXT = R.id.trade_id_text;
        ID_KEY_BOARD = R.id.trade_id_key_board;
        ID_MAX_LENGTH = R.id.trade_id_max_length;
        ID_PLACE_HOLDER = R.id.trade_id_place_holder;
        ID_PLACE_HOLDER_COLOR = R.id.trade_id_place_holder_color;
        f26956a = R.id.trade_id_text_watcher;
        b = fxa.a("placeholder");
        c = fxa.a(RemoteMessageConst.INPUT_TYPE);
        d = fxa.a("textUnit");
        e = fxa.a(Constants.Name.PLACEHOLDER_COLOR);
        f = fxa.a("keyboard");
        g = fxa.a(Constants.Name.MAX_LENGTH);
        h = fxa.a("onFinish");
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new dtg();
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        EditText editText = new EditText(context);
        editText.setPadding(0, 0, 0, 0);
        editText.setBackgroundDrawable(null);
        return editText;
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
        } else if (b == j) {
            this.j = str;
        } else if (c == j) {
            this.k = str;
        } else if (d != j) {
        } else {
            this.l = str;
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
        if (e == j) {
            this.m = i;
        } else if (f == j) {
            this.n = i;
        } else if (g != j) {
        } else {
            this.o = i;
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
        if (!(dXWidgetNode instanceof dtg)) {
            return;
        }
        dtg dtgVar = (dtg) dXWidgetNode;
        this.i = dtgVar.i;
        this.l = dtgVar.l;
        this.j = dtgVar.j;
        this.m = dtgVar.m;
        this.n = dtgVar.n;
        this.o = dtgVar.o;
        this.k = dtgVar.k;
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
        if (!StringUtils.isEmpty(this.l)) {
            setText(this.i + this.l);
        }
        super.onRenderView(context, view);
        a(view);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
            return;
        }
        super.onBindEvent(context, view, j);
        if (h != j) {
            return;
        }
        new b(context, this.k).a(view);
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (!(view instanceof EditText)) {
        } else {
            view.setTag(ID_TV_TEXT, this.i);
            EditText editText = (EditText) view;
            dte.a(editText, this.m);
            view.setTag(ID_PLACE_HOLDER_COLOR, Integer.valueOf(this.m));
            dte.b(editText, this.n);
            view.setTag(ID_KEY_BOARD, Integer.valueOf(this.n));
            dte.c(editText, this.o);
            view.setTag(ID_MAX_LENGTH, Integer.valueOf(this.o));
            if (!StringUtils.isEmpty(this.j)) {
                dte.a(editText, this.j);
                view.setTag(ID_PLACE_HOLDER, this.j);
            }
            if (StringUtils.isEmpty(this.k)) {
                return;
            }
            a(editText, "input".equalsIgnoreCase(this.k));
        }
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

    /* loaded from: classes4.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String b;
        private final Context c;

        static {
            kge.a(453662342);
        }

        public static /* synthetic */ Context a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("110033db", new Object[]{bVar}) : bVar.c;
        }

        public static /* synthetic */ String b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b95ac8fc", new Object[]{bVar}) : bVar.b;
        }

        public b(Context context, String str) {
            this.c = context;
            this.b = str;
        }

        public void a(final View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            } else if (!(view instanceof EditText)) {
            } else {
                b(view);
                view.setOnTouchListener(new View.OnTouchListener() { // from class: tb.dtg.b.1
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
                        dtf dtfVar = new dtf(b.a(b.this));
                        dtfVar.a((EditText) view);
                        dtfVar.a(new dtf.a() { // from class: tb.dtg.b.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.dtf.a
                            public void a(DialogInterface dialogInterface, CharSequence charSequence) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("14e7e1a2", new Object[]{this, dialogInterface, charSequence});
                                } else {
                                    b.this.a(view, b.b(b.this));
                                }
                            }
                        });
                        dtfVar.show();
                        return true;
                    }
                });
            }
        }

        private void b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91037249", new Object[]{this, view});
                return;
            }
            c cVar = (c) view.getTag(dtg.a());
            if (cVar != null) {
                ((EditText) view).removeTextChangedListener(cVar);
            }
            EditText editText = (EditText) view;
            c cVar2 = new c(editText, this.b);
            view.setTag(dtg.a(), cVar2);
            editText.addTextChangedListener(cVar2);
        }

        public void a(View view, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76c0c6b4", new Object[]{this, view, str});
            } else if (!"dialog".equals(str)) {
            } else {
                ArrayList arrayList = new ArrayList(5);
                arrayList.add("dialog");
                EditText editText = (EditText) view;
                arrayList.add(editText.getText());
                view.setTag(bpl.DINAMICX_3_CUSTOM_INPUT_KEY, arrayList);
                dtg.a(dtg.this, editText.getText());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(344731081);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new dtg();
        }
    }

    /* loaded from: classes4.dex */
    public class c implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final EditText b;
        private final String c;

        static {
            kge.a(-1379224777);
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

        public c(EditText editText, String str) {
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
                ArrayList arrayList = new ArrayList(5);
                arrayList.add("input");
                arrayList.add(this.b.getText());
                this.b.setTag(ban.ID_DX_INPUT_TAG, arrayList);
                dtg.a(dtg.this, this.b.getText());
            }
        }
    }

    private void a(Editable editable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c2e9653", new Object[]{this, editable});
            return;
        }
        DXTextInputEvent dXTextInputEvent = new DXTextInputEvent(h);
        dXTextInputEvent.setText(editable);
        postEvent(dXTextInputEvent);
    }
}

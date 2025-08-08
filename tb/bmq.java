package tb;

import android.content.Context;
import android.text.SpannableString;
import mtopsdk.common.util.StringUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.ultron.trade.dinamicx3.constructor.TradePriceTextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.af;
import com.taobao.android.dinamicx.widget.ak;

/* loaded from: classes2.dex */
public class bmq extends af {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_WIDGET_ID;
    public static final String NAME = "tdTradePriceView";

    /* renamed from: a  reason: collision with root package name */
    private static final long f25986a;
    private static final long b;
    private static final long c;
    private static final long d;
    private static final long e;
    private CharSequence f;
    private CharSequence g;
    private boolean k = false;
    private float h = 0.625f;
    private float i = 1.0f;
    private float j = 0.625f;
    private boolean l = jqi.a("ultron", "useEnhancedEditionDealPrice", true);

    public static /* synthetic */ Object ipc$super(bmq bmqVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -732824995:
                super.onBeforeMeasure((TextView) objArr[0]);
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1694530481:
                super.onSetObjAttribute(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    static {
        kge.a(-1459041830);
        DX_WIDGET_ID = fxa.a("tdTradePriceView");
        f25986a = fxa.a("richText");
        b = fxa.a("price");
        c = fxa.a("symbolScale");
        d = fxa.a("decimalScale");
        e = fxa.a("integerScale");
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new bmq();
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new TradePriceTextView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof bmq)) {
            return;
        }
        bmq bmqVar = (bmq) dXWidgetNode;
        this.f = bmqVar.f;
        this.g = bmqVar.g;
        this.h = bmqVar.h;
        this.j = bmqVar.j;
        this.k = bmqVar.k;
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d2)});
            return;
        }
        super.onSetDoubleAttribute(j, d2);
        if (c == j) {
            this.h = (float) d2;
        } else if (d == j) {
            this.j = (float) d2;
        } else if (e != j) {
        } else {
            this.i = (float) d2;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        super.onSetStringAttribute(j, str);
        if (b != j) {
            return;
        }
        this.g = str;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
            return;
        }
        super.onSetObjAttribute(j, obj);
        if (f25986a != j) {
            return;
        }
        if (obj instanceof CharSequence) {
            this.f = (CharSequence) obj;
        } else {
            this.f = "";
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (5559321398011072804L == j) {
            if (i == 0) {
                z = false;
            }
            this.k = z;
        } else {
            super.onSetIntAttribute(j, i);
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
        if (!StringUtils.isEmpty(this.f)) {
            textView.setText(this.f);
        } else if (StringUtils.isEmpty(this.g)) {
        } else {
            this.g = a(this.g);
            textView.setText(this.g);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (!(view instanceof TradePriceTextView)) {
            return;
        }
        TradePriceTextView tradePriceTextView = (TradePriceTextView) view;
        if (!StringUtils.isEmpty(this.f)) {
            tradePriceTextView.setText(this.f);
        } else if (!StringUtils.isEmpty(this.g)) {
            this.g = a(this.g);
            tradePriceTextView.setText(this.g);
        }
        tradePriceTextView.setHasDeleteLine(this.k);
    }

    private CharSequence a(CharSequence charSequence) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("f6c0212e", new Object[]{this, charSequence});
        }
        if (charSequence instanceof SpannableString) {
            return charSequence;
        }
        if (charSequence == null) {
            return "";
        }
        String charSequence2 = charSequence.toString();
        if (this.l) {
            indexOf = charSequence2.lastIndexOf(46);
        } else {
            indexOf = charSequence2.indexOf(46);
        }
        SpannableString spannableString = new SpannableString(charSequence2);
        int a2 = a(charSequence2);
        try {
            spannableString.setSpan(new RelativeSizeSpan(this.h), 0, a2, 33);
            int length = charSequence2.length();
            if (indexOf >= 0 && (!this.l || indexOf >= a2)) {
                spannableString.setSpan(new RelativeSizeSpan(this.i), a2, indexOf, 33);
                spannableString.setSpan(new RelativeSizeSpan(this.j), indexOf, length, 33);
                return spannableString;
            }
            spannableString.setSpan(new RelativeSizeSpan(this.i), a2, length, 33);
            return spannableString;
        } catch (Throwable unused) {
            return charSequence2;
        }
    }

    private int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return 0;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isDigit(charArray[i])) {
                return i;
            }
        }
        return 0;
    }

    public float a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : this.h;
    }

    public float b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue() : this.j;
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.h = f;
        }
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        } else {
            this.j = f;
        }
    }

    /* loaded from: classes2.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(723330737);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new bmq();
        }
    }
}

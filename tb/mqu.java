package tb;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.af;
import com.taobao.android.dinamicx.widget.ak;

/* loaded from: classes4.dex */
public class mqu extends af {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long WIDGET_ID;
    public static final String WIDGET_NAME = "tdTradePriceView";

    /* renamed from: a  reason: collision with root package name */
    private static final long f31207a;
    private static final long b;
    private static final long c;
    private static final long d;
    private CharSequence g;
    private CharSequence h;
    private float e = 0.625f;
    private float f = 0.625f;
    private boolean i = bar.a("useEnhancedEditionDealPrice", true);

    public static /* synthetic */ Object ipc$super(mqu mquVar, String str, Object... objArr) {
        switch (str.hashCode()) {
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
        kge.a(-1045530532);
        WIDGET_ID = fxa.a("tdTradePriceView");
        f31207a = fxa.a("symbolScale");
        b = fxa.a("decimalScale");
        c = fxa.a("price");
        d = fxa.a("richText");
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new mqu();
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof mqu)) {
            return;
        }
        mqu mquVar = (mqu) dXWidgetNode;
        this.g = mquVar.g;
        this.h = mquVar.h;
        this.e = mquVar.e;
        this.f = mquVar.f;
        this.i = mquVar.i;
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d2)});
            return;
        }
        super.onSetDoubleAttribute(j, d2);
        if (f31207a == j) {
            this.e = (float) d2;
        } else if (b != j) {
        } else {
            this.f = (float) d2;
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
        if (c != j) {
            return;
        }
        this.h = str;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
            return;
        }
        super.onSetObjAttribute(j, obj);
        if (d != j) {
            return;
        }
        if (obj instanceof CharSequence) {
            this.g = (CharSequence) obj;
        } else {
            this.g = "";
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
        if (!TextUtils.isEmpty(this.g)) {
            textView.setText(this.g);
        } else if (TextUtils.isEmpty(this.h)) {
        } else {
            this.h = b(this.h);
            textView.setText(this.h);
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
        if (!(view instanceof TextView)) {
            return;
        }
        TextView textView = (TextView) view;
        if (!TextUtils.isEmpty(this.g)) {
            textView.setText(this.g);
        } else if (TextUtils.isEmpty(this.h)) {
        } else {
            this.h = b(this.h);
            textView.setText(this.h);
        }
    }

    private CharSequence b(CharSequence charSequence) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("2498bb8d", new Object[]{this, charSequence});
        }
        if (charSequence instanceof SpannableString) {
            return charSequence;
        }
        if (charSequence == null) {
            return "";
        }
        String charSequence2 = charSequence.toString();
        if (this.i) {
            indexOf = charSequence2.lastIndexOf(46);
        } else {
            indexOf = charSequence2.indexOf(46);
        }
        SpannableString spannableString = new SpannableString(charSequence2);
        int a2 = a(charSequence2);
        try {
            spannableString.setSpan(new RelativeSizeSpan(this.e), 0, a2, 33);
            int length = charSequence2.length();
            if (indexOf >= 0 && (!this.i || indexOf >= a2)) {
                spannableString.setSpan(new RelativeSizeSpan(1.0f), a2, indexOf, 33);
                spannableString.setSpan(new RelativeSizeSpan(this.f), indexOf, length, 33);
                return spannableString;
            }
            spannableString.setSpan(new RelativeSizeSpan(1.0f), a2, length, 33);
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
        if (TextUtils.isEmpty(str)) {
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

    /* loaded from: classes4.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1661652173);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new mqu();
        }
    }
}

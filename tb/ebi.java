package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import mtopsdk.common.util.StringUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.XRichTextViewV3;
import com.taobao.android.detail.datasdk.protocol.adapter.core.c;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.af;
import com.taobao.android.dinamicx.widget.ak;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class ebi extends af {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static long f27168a;
    public static long b;
    public static long c;
    public static long d;
    private XRichTextViewV3 e;
    private int f;
    private int g;
    private String h = null;
    private String i = null;

    public static /* synthetic */ Object ipc$super(ebi ebiVar, String str, Object... objArr) {
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
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1184746505:
                return super.getDefaultValueForAttr(((Number) objArr[0]).longValue());
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    static {
        kge.a(831084668);
        f27168a = 7371053352943922572L;
        b = 4951885508200836195L;
        c = -1442719518478951523L;
        d = 9189277493022864799L;
    }

    public ebi() {
        this.f = epo.b(3);
        this.g = epo.b(1);
        this.f = epo.b(3);
        this.g = epo.b(1);
    }

    public ebi(Context context) {
        this.f = epo.b(3);
        this.g = epo.b(1);
        this.f = epo.b(3);
        this.g = epo.b(1);
    }

    /* loaded from: classes4.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-58854573);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new ebi();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new ebi();
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        this.e = new XRichTextViewV3(context);
        return this.e;
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view == null && (view instanceof XRichTextViewV3)) {
            return;
        }
        a((XRichTextViewV3) view);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
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
        if (dXWidgetNode == null || !(dXWidgetNode instanceof ebi)) {
            return;
        }
        ebi ebiVar = (ebi) dXWidgetNode;
        this.h = ebiVar.h;
        this.g = ebiVar.g;
        this.f = ebiVar.f;
        this.i = ebiVar.i;
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
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

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public Object getDefaultValueForAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("469dcc09", new Object[]{this, new Long(j)}) : super.getDefaultValueForAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d2)});
        } else {
            super.onSetDoubleAttribute(j, d2);
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
        if (d == j) {
            this.i = str;
        }
        if (b == j) {
            this.h = str;
        }
        if (c != j) {
            return;
        }
        this.f = epo.b(Integer.parseInt(str));
    }

    private void a(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92d3edc", new Object[]{this, textView});
        } else if (!(textView instanceof XRichTextViewV3)) {
        } else {
            XRichTextViewV3 xRichTextViewV3 = (XRichTextViewV3) textView;
            b(xRichTextViewV3, this.i);
            a((TextView) xRichTextViewV3, getText().toString());
            a(xRichTextViewV3, this.h);
        }
    }

    public void a(final XRichTextViewV3 xRichTextViewV3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f277e88", new Object[]{this, xRichTextViewV3, str});
        } else if (xRichTextViewV3 == null) {
        } else {
            xRichTextViewV3.setIcon(null);
            if (StringUtils.isEmpty(str)) {
                return;
            }
            dzv.a(str, xRichTextViewV3.getContext(), new c.a() { // from class: tb.ebi.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.c.a
                public void a(Drawable drawable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                    } else {
                        xRichTextViewV3.setIcon(drawable);
                    }
                }
            }, null);
        }
    }

    public void a(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ccae9a6", new Object[]{this, textView, str});
        } else if (textView != null && (textView instanceof XRichTextViewV3) && !StringUtils.isEmpty(str)) {
            XRichTextViewV3 xRichTextViewV3 = (XRichTextViewV3) textView;
            xRichTextViewV3.setSpannableStringBuilder(a(new SpannableStringBuilder(str), "#", "@", xRichTextViewV3.getSpanColorInt()));
        } else {
            textView.setText(str);
        }
    }

    public void b(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56958b85", new Object[]{this, textView, str});
        } else if (textView == null || !(textView instanceof XRichTextViewV3) || StringUtils.isEmpty(str)) {
        } else {
            ((XRichTextViewV3) textView).setSpanColor(str);
            a(textView, textView.getText().toString());
        }
    }

    private SpannableStringBuilder a(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("3195fb27", new Object[]{this, spannableStringBuilder, str, str2, new Integer(i)});
        }
        new ArrayList();
        do {
            indexOf = spannableStringBuilder.toString().indexOf(str, 0);
            if (indexOf != -1) {
                int a2 = a(spannableStringBuilder.toString(), indexOf, str2);
                if (-1 == a2) {
                    break;
                }
                spannableStringBuilder = a(spannableStringBuilder, indexOf, a2, i).delete(a2, a2 + 1).delete(indexOf, indexOf + 1);
                continue;
            }
        } while (indexOf != -1);
        return spannableStringBuilder;
    }

    private int a(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed88148e", new Object[]{this, str, new Integer(i), str2})).intValue();
        }
        int indexOf = str.indexOf(str2, i + 1);
        if (-1 == indexOf) {
            return -1;
        }
        return indexOf;
    }

    private SpannableStringBuilder a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("4a54c49b", new Object[]{this, spannableStringBuilder, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        if (spannableStringBuilder != null) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        }
        return spannableStringBuilder;
    }
}

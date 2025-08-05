package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.af;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.RRichTextView;
import tb.lfw;
import tb.mto;

/* loaded from: classes7.dex */
public class lge extends af {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_DETAIL_RICHTEXT_ICON_URL = 4951885508200836195L;
    public static final long DX_DETAIL_RICHTEXT_LINE_SPACE = -1442719518478951523L;
    public static final long DX_DETAIL_RRICHTEXT_ASPECTRATIO = 7594222789952419722L;
    public static final long VIEW_IDENTITY = 4851157142455218566L;

    /* renamed from: a  reason: collision with root package name */
    private int f30558a = 9;
    private String b = null;
    private double c = -1.0d;

    static {
        kge.a(608815274);
    }

    public static /* synthetic */ Object ipc$super(lge lgeVar, String str, Object... objArr) {
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
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1004907135);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new lge();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new lge();
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new RRichTextView(context);
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

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof lge)) {
            return;
        }
        lge lgeVar = (lge) dXWidgetNode;
        this.b = lgeVar.b;
        this.f30558a = lgeVar.f30558a;
        this.c = lgeVar.c;
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
        textView.setLineSpacing(this.f30558a, 1.0f);
    }

    private void a(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92d3edc", new Object[]{this, textView});
        } else if (this.c <= mto.a.GEO_NOT_SUPPORT || TextUtils.isEmpty(this.b)) {
        } else {
            float max = Math.max(textView.getPaint().getTextSize(), 1.0f);
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            shapeDrawable.setBounds(0, 0, (int) (max * this.c), (int) max);
            textView.setText(RRichTextView.insertDrawableToSsb(shapeDrawable, new SpannableStringBuilder(textView.getText())));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == 7594222789952419722L) {
            this.c = d;
        } else {
            super.onSetDoubleAttribute(j, d);
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
        if (4951885508200836195L == j) {
            this.b = str;
        }
        if (-1442719518478951523L != j) {
            return;
        }
        try {
            this.f30558a = Integer.parseInt(str);
        } catch (Exception unused) {
        }
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (!(view instanceof RRichTextView)) {
        } else {
            RRichTextView rRichTextView = (RRichTextView) view;
            if (qnl.g()) {
                rRichTextView.resetAutoLayoutFlag();
            }
            a(rRichTextView, this.b, getText().toString());
            a(rRichTextView, this.f30558a);
        }
    }

    public void a(final RRichTextView rRichTextView, String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("163f8f63", new Object[]{this, rRichTextView, str, str2});
        } else if (rRichTextView == null) {
        } else {
            rRichTextView.setText(str2);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            lfw.a(str, rRichTextView.getContext(), new lfw.a() { // from class: tb.lge.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.lfw.a
                public void a(Drawable drawable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                    } else if (!TextUtils.equals(str2, lge.this.getText())) {
                    } else {
                        rRichTextView.setIconToText(drawable);
                    }
                }
            }, null);
        }
    }

    public void a(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7b0fa7", new Object[]{this, textView, new Integer(i)});
        } else if (!(textView instanceof RRichTextView)) {
        } else {
            ((RRichTextView) textView).setLineSpace(i);
        }
    }
}

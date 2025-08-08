package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.af;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.mytaobao.basement.monitor.b;
import com.taobao.taobao.R;

/* loaded from: classes7.dex */
public class mwl extends af {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_MORDERNUMTEXTVIEW = 5695423697747060426L;
    public static final long DX_MORDERNUMTEXTVIEW_MFONTSIZE = -72610990342354008L;
    public static final long DX_MORDERNUMTEXTVIEW_MTEXT = 18601549934583L;

    /* renamed from: a  reason: collision with root package name */
    private double f31302a;

    static {
        kge.a(-728702269);
    }

    public static /* synthetic */ Object ipc$super(mwl mwlVar, String str, Object... objArr) {
        switch (str.hashCode()) {
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

    /* loaded from: classes7.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1420409190);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            b.a().a("XMOrderNumTextViewWidgetNode.build");
            return new mwl();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        b.a().a("XMOrderNumTextViewWidgetNode.build1");
        return new mwl();
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j != DX_MORDERNUMTEXTVIEW_MTEXT) {
            if (j == 38178040921L) {
                return;
            }
            super.onSetStringAttribute(j, str);
        } else if (!StringUtils.isEmpty(str) && mxs.a(str) > 0) {
            setText(a(str));
            setVisibility(0);
        } else {
            setVisibility(2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DX_MORDERNUMTEXTVIEW_MFONTSIZE) {
            this.f31302a = i;
        } else {
            super.onSetIntAttribute(j, i);
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
        if (!(dXWidgetNode instanceof mwl)) {
            return;
        }
        this.f31302a = ((mwl) dXWidgetNode).f31302a;
    }

    @Override // com.taobao.android.dinamicx.widget.af
    public void onBeforeMeasure(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d451fa5d", new Object[]{this, textView});
            return;
        }
        super.onBeforeMeasure(textView);
        textView.setTextSize(0, (float) this.f31302a);
        textView.setText(getText());
        textView.setMinWidth(gbg.a(textView.getContext(), "18ap", 18));
        textView.setGravity(17);
        textView.setBackgroundDrawable(a(textView, getDXRuntimeContext().m()));
        textView.setPadding(gbg.a(textView.getContext(), "5ap", 5), 0, fpr.a(textView.getContext(), "5ap", 5), 0);
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view == null || !(view instanceof TextView)) {
            return;
        }
        TextView textView = (TextView) view;
        textView.setText(getText());
        textView.setTextSize(0, (float) this.f31302a);
        textView.setTextColor(context.getResources().getColor(R.color.mytaobao_orange_color));
        textView.setMinWidth(gbg.a(textView.getContext(), "18ap", 18));
        textView.setPadding(gbg.a(textView.getContext(), "5ap", 5), 0, gbg.a(textView.getContext(), "5ap", 5), 0);
        textView.setGravity(17);
        if (getVisibility() == 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            textView.setTextAlignment(4);
        }
        textView.setBackgroundDrawable(a(textView, getDXRuntimeContext().m()));
    }

    private GradientDrawable a(TextView textView, Context context) {
        GradientDrawable gradientDrawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("7ba337e", new Object[]{this, textView, context});
        }
        Drawable background = textView.getBackground();
        if (background != null && (background instanceof GradientDrawable)) {
            gradientDrawable = (GradientDrawable) background;
        } else {
            gradientDrawable = new GradientDrawable();
        }
        gradientDrawable.setCornerRadius(fpr.a(context, String.valueOf(8.0d) + "ap", 8));
        gradientDrawable.setStroke(fpr.a(context, 1.5f), context.getResources().getColor(R.color.mytaobao_orange_color));
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(context.getResources().getColor(R.color.white));
        return gradientDrawable;
    }

    private String a(String str) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str) || (a2 = mxs.a(str, 0)) <= 0) {
            return "";
        }
        if (a2 > 99) {
            return "99+";
        }
        return a2 + "";
    }
}

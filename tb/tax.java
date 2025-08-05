package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailXSimpleTextViewConstructor;
import com.taobao.android.detail.ttdetail.transfer.widget.srich.XSimpleRichTextViewV3;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.af;
import com.taobao.android.dinamicx.widget.ak;
import java.util.ArrayList;
import java.util.Iterator;
import tb.tbj;

/* loaded from: classes5.dex */
public class tax extends af {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_ID;
    public static final long DX_SIMPLERICHTEXT_imageSpace = 2897545864002613241L;
    public static final long DX_SIMPLERICHTEXT_imageTextSpace = -6439738081440321374L;
    public static final long DX_SIMPLERICHTEXT_images = 9421717623643260L;
    public static final long DX_SIMPLERICHTEXT_text = 38178040921L;
    public static final long DX_SIMPLERICHTEXT_textColor = 5737767606580872653L;
    public static final long DX_SIMPLERICHTEXT_textSize = 6751005219504497256L;

    /* renamed from: a  reason: collision with root package name */
    public static long f34004a = 0;
    public static final String dImageSpace = "dImageSpace";
    public static final String dImageTextSpace = "dImageTextSpace";
    public static final String dImages = "dImages";
    public static final String dTextColor = "dTextColor";
    public static final String dTextSize = "dTextSize";
    private XSimpleRichTextViewV3 b;
    private JSONArray c;
    private int d;
    private int e;

    public static /* synthetic */ Object ipc$super(tax taxVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
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
        kge.a(1052148767);
        long a2 = fxa.a(DetailXSimpleTextViewConstructor.VIEW_TAG);
        DX_EVENT_ID = a2;
        f34004a = a2;
    }

    public tax() {
    }

    public tax(Context context) {
    }

    /* loaded from: classes5.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1927465974);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new tax();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new tax();
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        this.b = new XSimpleRichTextViewV3(context);
        return this.b;
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view == null && (view instanceof XSimpleRichTextViewV3)) {
            return;
        }
        a((XSimpleRichTextViewV3) view);
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof tax)) {
            return;
        }
        tax taxVar = (tax) dXWidgetNode;
        this.d = taxVar.d;
        this.e = taxVar.e;
        JSONArray jSONArray = taxVar.c;
        if (z && jSONArray != null) {
            this.c = (JSONArray) jSONArray.clone();
        } else {
            this.c = jSONArray;
        }
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
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        super.onSetStringAttribute(j, str);
        if (2897545864002613241L == j) {
            try {
                this.d = f.a(Integer.parseInt(str));
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        if (-6439738081440321374L != j) {
            return;
        }
        this.e = f.a(Integer.parseInt(str));
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
            return;
        }
        super.onSetDoubleAttribute(j, d);
        if (2897545864002613241L == j) {
            this.d = (int) d;
        }
        if (-6439738081440321374L != j) {
            return;
        }
        this.e = (int) d;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
            return;
        }
        super.onSetListAttribute(j, jSONArray);
        if (9421717623643260L != j) {
            return;
        }
        this.c = jSONArray;
    }

    private void a(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92d3edc", new Object[]{this, textView});
            return;
        }
        a(textView, this.c);
        a(textView, this.d);
        b(textView, this.e);
    }

    public void a(TextView textView, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f58a804", new Object[]{this, textView, jSONArray});
        } else if (textView instanceof XSimpleRichTextViewV3) {
            final XSimpleRichTextViewV3 xSimpleRichTextViewV3 = (XSimpleRichTextViewV3) textView;
            ArrayList arrayList = new ArrayList();
            ArrayList<XSimpleRichTextViewV3.DrawableHolder> drawableArrayList = xSimpleRichTextViewV3.getDrawableArrayList();
            if (jSONArray != null) {
                Iterator<Object> it = jSONArray.iterator();
                while (it != null && it.hasNext()) {
                    Object next = it.next();
                    if (next != null && (next instanceof String)) {
                        String str = (String) next;
                        if (!arrayList.contains(str)) {
                            Iterator<XSimpleRichTextViewV3.DrawableHolder> it2 = drawableArrayList.iterator();
                            boolean z = false;
                            while (it2.hasNext()) {
                                if (it2.next().url.equals(str)) {
                                    z = true;
                                }
                            }
                            if (!z) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
            }
            if (arrayList.size() <= 0) {
                return;
            }
            xSimpleRichTextViewV3.setDrawableCount(arrayList.size());
            for (int i = 0; i < arrayList.size(); i++) {
                final String str2 = (String) arrayList.get(i);
                xSimpleRichTextViewV3.setUrlIndex(str2, i);
                tbj.a(str2, y.a(xSimpleRichTextViewV3), new tbj.a() { // from class: tb.tax.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.tbj.a
                    public void a(Drawable drawable) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                        } else {
                            xSimpleRichTextViewV3.addIcon(drawable, str2);
                        }
                    }
                }, null);
            }
        }
    }

    public void a(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7b0fa7", new Object[]{this, textView, new Integer(i)});
        } else if (!(textView instanceof XSimpleRichTextViewV3)) {
        } else {
            ((XSimpleRichTextViewV3) textView).setImageSpace(i);
        }
    }

    public void b(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9163d7e8", new Object[]{this, textView, new Integer(i)});
        } else if (!(textView instanceof XSimpleRichTextViewV3)) {
        } else {
            ((XSimpleRichTextViewV3) textView).setImageTextSpace(i);
        }
    }
}

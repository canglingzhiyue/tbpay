package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.view.xwraptagview.b;
import com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.xwraptagview3.XWrapTagViewV3;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class ebl extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_XWRAPTAGVIEW = -4075912321947476299L;
    public static final long DX_XWRAPTAGVIEW_CONTENTPADDINGBOTTOM = 3025661776850183227L;
    public static final long DX_XWRAPTAGVIEW_CONTENTPADDINGLEFT = 4917383621104602703L;
    public static final long DX_XWRAPTAGVIEW_CONTENTPADDINGRIGHT = -3275682270152095037L;
    public static final long DX_XWRAPTAGVIEW_CONTENTPADDINGTOP = 2054806430728371190L;
    public static final long DX_XWRAPTAGVIEW_FIXEDTAG = 2632864218485020724L;
    public static final long DX_XWRAPTAGVIEW_IMAGEWIDTH = 2897563628546134541L;
    public static final long DX_XWRAPTAGVIEW_MAXTAGWIDTH = 6097268740828018797L;
    public static final long DX_XWRAPTAGVIEW_SPACEBETWEENTAGS = -4452763459394272907L;
    public static final long DX_XWRAPTAGVIEW_TAGBACKGROUNDCOLOR = -3490278586632980147L;
    public static final long DX_XWRAPTAGVIEW_TAGS = 38173475299L;
    public static final long DX_XWRAPTAGVIEW_TEXTCOLOR = 5737767606580872653L;
    public static final long DX_XWRAPTAGVIEW_TEXTSIZE = 6751005219504497256L;

    /* renamed from: a  reason: collision with root package name */
    public static long f27173a;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h = 0;
    private int i = 0;
    private int j = 0;
    private int k = -592138;
    private JSONArray l = null;
    private ArrayList<com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.xwraptagview3.a> m = null;
    private int n = 6;
    private String o;
    private XWrapTagViewV3 p;
    private XWrapTagViewV3 q;

    public static /* synthetic */ Object ipc$super(ebl eblVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
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
        kge.a(-248150578);
        f27173a = DX_XWRAPTAGVIEW;
    }

    public ebl() {
        if (this.p == null) {
            this.p = new XWrapTagViewV3(DinamicXEngine.i());
        }
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.widget.XWrapTagViewWidgetNode");
    }

    public ebl(Context context) {
        if (this.p == null) {
            this.p = new XWrapTagViewV3(DinamicXEngine.i());
        }
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.widget.XWrapTagViewWidgetNode");
    }

    /* loaded from: classes4.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-711414107);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new ebl();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new ebl();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        this.q = new XWrapTagViewV3(context);
        return this.q;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view == null || !(view instanceof XWrapTagViewV3)) {
            return;
        }
        a((XWrapTagViewV3) view);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof ebl)) {
            return;
        }
        ebl eblVar = (ebl) dXWidgetNode;
        this.c = eblVar.c;
        this.d = eblVar.d;
        this.e = eblVar.e;
        this.f = eblVar.f;
        this.g = eblVar.g;
        this.h = eblVar.h;
        this.k = eblVar.k;
        this.o = eblVar.o;
        this.i = eblVar.i;
        this.j = eblVar.j;
        if (z) {
            JSONArray jSONArray = eblVar.l;
            if (jSONArray == null) {
                return;
            }
            this.l = (JSONArray) jSONArray.clone();
            return;
        }
        this.l = eblVar.l;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        a(this.p);
        this.p.measure(i, i2);
        setMeasuredDimension(this.p.getMeasuredWidthAndState(), this.p.getMeasuredHeightAndState());
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public Object getDefaultValueForAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("469dcc09", new Object[]{this, new Long(j)}) : super.getDefaultValueForAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        super.onSetIntAttribute(j, i);
        if (DX_XWRAPTAGVIEW_CONTENTPADDINGBOTTOM == j) {
            this.f = i;
        }
        if (DX_XWRAPTAGVIEW_CONTENTPADDINGTOP == j) {
            this.e = i;
        }
        if (DX_XWRAPTAGVIEW_CONTENTPADDINGLEFT == j) {
            this.c = i;
        }
        if (DX_XWRAPTAGVIEW_CONTENTPADDINGRIGHT == j) {
            this.d = i;
        }
        if (DX_XWRAPTAGVIEW_MAXTAGWIDTH == j) {
            this.g = i;
        }
        if (5737767606580872653L == j) {
            this.j = i;
        }
        if (6751005219504497256L == j) {
            this.i = i;
        }
        if (DX_XWRAPTAGVIEW_SPACEBETWEENTAGS == j) {
            this.h = i;
        }
        if (DX_XWRAPTAGVIEW_TAGBACKGROUNDCOLOR != j) {
            return;
        }
        this.k = i;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
            return;
        }
        super.onSetListAttribute(j, jSONArray);
        if (DX_XWRAPTAGVIEW_TAGS != j) {
            return;
        }
        this.l = jSONArray;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        super.onSetStringAttribute(j, str);
        if (DX_XWRAPTAGVIEW_FIXEDTAG != j) {
            return;
        }
        this.o = str;
    }

    private void a(XWrapTagViewV3 xWrapTagViewV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2717afc", new Object[]{this, xWrapTagViewV3});
        } else if (xWrapTagViewV3 == null) {
        } else {
            try {
                this.b = getLayoutHeight();
                this.m = a(this.l);
                TextView textView = null;
                if (!StringUtils.isEmpty(this.o)) {
                    textView = a(getDXRuntimeContext().m(), this.o, (this.b - this.e) - this.f, this.i, this.j, this.k);
                }
                a(xWrapTagViewV3, textView);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void a(View view, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648e4e1a", new Object[]{this, view, textView});
        } else if (view == null || !(view instanceof XWrapTagViewV3)) {
        } else {
            XWrapTagViewV3 xWrapTagViewV3 = (XWrapTagViewV3) view;
            xWrapTagViewV3.setLineNumAndOpenSimplifiedMode("1");
            xWrapTagViewV3.setBackgroundColor(-1);
            xWrapTagViewV3.setLayoutParams(new FrameLayout.LayoutParams(-1, this.b));
            xWrapTagViewV3.setPadding(this.c, this.e, this.d, this.f);
            xWrapTagViewV3.setTextSizeInPixel(this.i);
            xWrapTagViewV3.setTextColor(this.j);
            xWrapTagViewV3.setTagHeightInPixel((this.b - this.e) - this.f);
            xWrapTagViewV3.setMaxTagWidth(this.g);
            ArrayList<com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.xwraptagview3.a> arrayList = this.m;
            if (arrayList != null && arrayList.size() > 0) {
                xWrapTagViewV3.setTagList(this.m);
                xWrapTagViewV3.setSpaceBetweenTags(this.h);
            } else {
                xWrapTagViewV3.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            }
            if (textView == null) {
                return;
            }
            xWrapTagViewV3.addLayoutEndView(textView);
        }
    }

    private TextView a(Context context, String str, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("e355445e", new Object[]{this, context, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        if (context == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, i);
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextColor(i3);
        textView.setTextSize(0, i2);
        textView.setPadding(b.TAG_LEFT_RIGHT_PADDING, b.TAG_TOP_BOTTOM_PADDING, b.TAG_LEFT_RIGHT_PADDING, b.TAG_TOP_BOTTOM_PADDING);
        textView.setBackgroundDrawable(b.a(this.n * ((int) epo.f27511a), i4));
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    private ArrayList<com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.xwraptagview3.a> a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("4ccf216a", new Object[]{this, jSONArray});
        }
        ArrayList<com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.xwraptagview3.a> arrayList = new ArrayList<>();
        if (jSONArray != null) {
            Iterator<Object> it = jSONArray.iterator();
            while (it != null && it.hasNext()) {
                Object next = it.next();
                if (next != null && (next instanceof JSONObject)) {
                    arrayList.add(new com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.xwraptagview3.a((JSONObject) next));
                }
            }
        }
        return arrayList;
    }
}

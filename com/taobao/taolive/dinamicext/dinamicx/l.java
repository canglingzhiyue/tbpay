package com.taobao.taolive.dinamicext.dinamicx;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.af;
import com.taobao.android.dinamicx.widget.ak;
import tb.kge;
import tb.pbh;
import tb.prk;
import tb.pro;

/* loaded from: classes8.dex */
public class l extends af {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBLTEXTVIEW_TBBACKGROUND = -6737373688188729886L;
    public static final long DXTBLTEXTVIEW_TBCURRENTLIVESTATE = -5287008133921364644L;
    public static final long DXTBLTEXTVIEW_TBFORMAT = 6747344829235899719L;
    public static final long DXTBLTEXTVIEW_TBGONEIFNULL = 1035483994773344437L;
    public static final long DXTBLTEXTVIEW_TBGRAVITY = 3862299103696272581L;
    public static final long DXTBLTEXTVIEW_TBID = 38174466807L;
    public static final long DXTBLTEXTVIEW_TBLTEXTVIEW = -751409426283369939L;
    public static final long DXTBLTEXTVIEW_TBMAXEMS = 6747375821444433961L;
    public static final long DXTBLTEXTVIEW_TBPADDINGBOTTOM = 7022375299976625425L;
    public static final long DXTBLTEXTVIEW_TBPADDINGLEFT = -6983831935715007195L;
    public static final long DXTBLTEXTVIEW_TBPADDINGRIGHT = -7076232766810975591L;
    public static final long DXTBLTEXTVIEW_TBPADDINGTOP = 3122016736477979084L;
    public static final long DXTBLTEXTVIEW_TBTEXT = 10220209854042305L;
    public static final long DXTBLTEXTVIEW_TBVISIBLESTATE = 5637158515563704755L;

    /* renamed from: a  reason: collision with root package name */
    private String f21420a;
    private String b;
    private String c;
    private Object d;
    private String e;
    private Object f;
    private int g = -1;
    private int h = 0;
    private int i = 0;
    private int j = 0;
    private int k = 0;
    private String l;
    private String m;

    static {
        kge.a(1259843717);
    }

    public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -732824995:
                super.onBeforeMeasure((TextView) objArr[0]);
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
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

    /* loaded from: classes8.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1687958108);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new l();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new l();
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (!(dXWidgetNode instanceof l)) {
        } else {
            super.onClone(dXWidgetNode, z);
            l lVar = (l) dXWidgetNode;
            this.f21420a = lVar.f21420a;
            this.b = lVar.b;
            this.c = lVar.c;
            this.d = lVar.d;
            this.e = lVar.e;
            this.f = lVar.f;
            this.g = lVar.g;
            this.h = lVar.h;
            this.i = lVar.i;
            this.j = lVar.j;
            this.k = lVar.k;
            this.l = lVar.l;
            this.m = lVar.m;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : super.onCreateView(context);
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
        b(textView);
        Object obj = this.f;
        if (obj != null) {
            textView.setTag(obj);
        }
        if (!TextUtils.isEmpty(this.f21420a)) {
            try {
                textView.setBackgroundResource(pbh.a(this.f21420a));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(this.e)) {
            textView.setGravity(pbh.b(this.e));
        }
        c(textView);
        textView.setPadding(this.i, this.k, this.j, this.h);
        a(textView);
    }

    private void a(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92d3edc", new Object[]{this, textView});
        } else if (this.g <= 0 || TextUtils.isEmpty(getText()) || getText().length() <= this.g) {
        } else {
            CharSequence subSequence = getText().subSequence(0, this.g);
            setText(subSequence);
            textView.setText(subSequence);
        }
    }

    private void b(TextView textView) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d9ea7b", new Object[]{this, textView});
        } else if (TextUtils.isEmpty(this.l)) {
        } else {
            if ("overTenMillion".equals(this.c)) {
                str = prk.a(pro.b(this.l));
            } else if ("onLineNumber".equals(this.c)) {
                str = prk.b(pro.b(this.l));
            } else {
                str = !TextUtils.isEmpty(this.l) ? this.l : (String) getText();
            }
            setText(str);
            textView.setText(str);
        }
    }

    private void c(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa86961a", new Object[]{this, textView});
        } else if (TextUtils.isEmpty(this.m) || TextUtils.isEmpty(this.b)) {
        } else {
            if (this.m.equals(this.b)) {
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
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
        b(textView);
        a(textView);
        if (!TextUtils.isEmpty(this.e)) {
            textView.setGravity(pbh.b(this.e));
        }
        if (!TextUtils.isEmpty(this.f21420a)) {
            try {
                textView.setBackgroundResource(pbh.a(this.f21420a));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        textView.setPadding(this.i, this.k, this.j, this.h);
        super.onBeforeMeasure(textView);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else if (j == 1035483994773344437L) {
            this.d = obj;
        } else if (j == 38174466807L) {
            this.f = obj;
        } else {
            super.onSetObjAttribute(j, obj);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == -6737373688188729886L) {
            this.f21420a = str;
        } else if (j == -5287008133921364644L) {
            this.b = str;
        } else if (j == DXTBLTEXTVIEW_TBFORMAT) {
            this.c = str;
        } else if (j == DXTBLTEXTVIEW_TBGRAVITY) {
            this.e = str;
        } else if (j == DXTBLTEXTVIEW_TBTEXT) {
            this.l = str;
        } else if (j == 5637158515563704755L) {
            this.m = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXTBLTEXTVIEW_TBMAXEMS) {
            this.g = i;
        } else if (j == DXTBLTEXTVIEW_TBPADDINGBOTTOM) {
            this.h = i;
        } else if (j == DXTBLTEXTVIEW_TBPADDINGLEFT) {
            this.i = i;
        } else if (j == DXTBLTEXTVIEW_TBPADDINGRIGHT) {
            this.j = i;
        } else if (j == DXTBLTEXTVIEW_TBPADDINGTOP) {
            this.k = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)}) : (j == -6737373688188729886L || j == -5287008133921364644L || j == DXTBLTEXTVIEW_TBFORMAT || j == DXTBLTEXTVIEW_TBGRAVITY || j == 5637158515563704755L) ? "" : super.getDefaultValueForStringAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXTBLTEXTVIEW_TBMAXEMS) {
            return -1;
        }
        if (j != DXTBLTEXTVIEW_TBPADDINGBOTTOM && j != DXTBLTEXTVIEW_TBPADDINGLEFT && j != DXTBLTEXTVIEW_TBPADDINGRIGHT && j != DXTBLTEXTVIEW_TBPADDINGTOP) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 0;
    }
}

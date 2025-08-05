package com.taobao.detail.rate.widget.delegate.tag;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.detail.rate.widget.XRateFlowLayout;
import com.taobao.detail.rate.widget.delegate.tag.bean.AssociationTagItem;
import com.taobao.detail.rate.widget.delegate.tag.bean.AssociationTagItemStyle;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.kil;
import tb.kio;
import tb.kqa;
import tb.kqb;
import tb.kqc;
import tb.kqe;
import tb.kqg;
import tb.kqh;

/* loaded from: classes7.dex */
public class a extends kqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View c;
    private InterfaceC0657a d;
    private c e;
    private kqh<AssociationTagItem> f;
    private kqg<AssociationTagItem> g;
    private int h;
    private boolean i;
    private boolean j;
    private XRateFlowLayout k;
    private View l;
    private View m;
    private b n;
    private kqc o;
    private boolean p;
    private View q;

    /* renamed from: com.taobao.detail.rate.widget.delegate.tag.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public interface InterfaceC0657a {
        void a(boolean z, int i, int i2, String str);
    }

    /* loaded from: classes7.dex */
    public static class b {
        public JSONArray b;
        public int c;
        public String e;
        public int h;
        public JSONObject i;
        public JSONObject j;
        public JSONObject k;

        /* renamed from: a  reason: collision with root package name */
        public boolean f17062a = true;
        public int d = 2;
        public boolean f = true;
        public int g = 12;
    }

    /* loaded from: classes7.dex */
    public interface c {
        void a(boolean z);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97588288", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.h = i;
        return i;
    }

    public static /* synthetic */ kqg a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kqg) ipChange.ipc$dispatch("f1a948f7", new Object[]{aVar}) : aVar.g;
    }

    public static /* synthetic */ void a(a aVar, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5255fd6", new Object[]{aVar, textView});
        } else {
            aVar.a(textView);
        }
    }

    public static /* synthetic */ void a(a aVar, TextView textView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf874dbe", new Object[]{aVar, textView, new Boolean(z)});
        } else {
            aVar.a(textView, z);
        }
    }

    public static /* synthetic */ void a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9758c266", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.a(z);
        }
    }

    public static /* synthetic */ boolean a(a aVar, List list, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8f1e2fc8", new Object[]{aVar, list, new Integer(i)})).booleanValue() : aVar.a(list, i);
    }

    public static /* synthetic */ float b(a aVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c5311ce4", new Object[]{aVar, new Integer(i)})).floatValue() : aVar.a(i);
    }

    public static /* synthetic */ View b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("44eaee71", new Object[]{aVar}) : aVar.l;
    }

    public static /* synthetic */ void b(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5315cc5", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.b(z);
        }
    }

    public static /* synthetic */ boolean c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ff94f1b4", new Object[]{aVar})).booleanValue() : aVar.j;
    }

    public static /* synthetic */ kqh d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kqh) ipChange.ipc$dispatch("98708e73", new Object[]{aVar}) : aVar.f;
    }

    public static /* synthetic */ void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86ab2d32", new Object[]{aVar});
        } else {
            aVar.d();
        }
    }

    public static /* synthetic */ boolean f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ca364af7", new Object[]{aVar})).booleanValue() : aVar.i;
    }

    public static /* synthetic */ XRateFlowLayout g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (XRateFlowLayout) ipChange.ipc$dispatch("d77d3e1c", new Object[]{aVar}) : aVar.k;
    }

    public static /* synthetic */ InterfaceC0657a h(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InterfaceC0657a) ipChange.ipc$dispatch("34448aaa", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ b i(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("fb73d6e8", new Object[]{aVar}) : aVar.n;
    }

    public a(Context context, b bVar, boolean z) {
        super(context);
        this.h = -1;
        this.i = true;
        this.n = bVar;
        this.p = z;
        b();
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.c;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c = LayoutInflater.from(this.f30232a).inflate(R.layout.rate_ugc_association_tag_flow_view, (ViewGroup) null);
        this.k = (XRateFlowLayout) this.c.findViewById(R.id.association_tag_content_view);
        this.l = this.c.findViewById(R.id.v_fold_view);
        this.m = this.c.findViewById(R.id.v_arrow);
        this.q = this.c.findViewById(R.id.v_fold_button);
        this.l.setVisibility(8);
        a(this.n);
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("527f4f30", new Object[]{this, bVar});
            return;
        }
        List<AssociationTagItem> a2 = a(bVar.b);
        this.i = bVar.f;
        if (bVar.k != null) {
            this.h = a(a2, bVar.k);
        } else {
            this.h = a(a2, bVar.e);
        }
        a(a2, bVar);
        b(bVar);
        c(bVar);
    }

    private void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfba00b1", new Object[]{this, bVar});
            return;
        }
        this.k.setInitParams(bVar.h, bVar.c, bVar.d, !bVar.f, this.h, this.p);
        this.k.setFlowViewOuterListener(new XRateFlowLayout.a() { // from class: com.taobao.detail.rate.widget.delegate.tag.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.detail.rate.widget.XRateFlowLayout.a
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                } else {
                    a.a(a.this, !z);
                }
            }

            @Override // com.taobao.detail.rate.widget.XRateFlowLayout.a
            public void a(int i, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
                } else if (!(obj instanceof AssociationTagItem) || a.a(a.this) == null) {
                } else {
                    a.a(a.this).a(i, (AssociationTagItem) obj);
                }
            }

            @Override // com.taobao.detail.rate.widget.XRateFlowLayout.a
            public void a(boolean z, boolean z2, boolean z3) {
                IpChange ipChange2 = $ipChange;
                int i = 0;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("271102ec", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
                    return;
                }
                View b2 = a.b(a.this);
                if (!z) {
                    i = 8;
                }
                b2.setVisibility(i);
                if (!z || !z3 || a.c(a.this)) {
                    return;
                }
                a.b(a.this, !z2);
            }
        });
    }

    private void a(List<AssociationTagItem> list, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21ba0621", new Object[]{this, list, bVar});
            return;
        }
        AssociationTagItemStyle associationTagItemStyle = (AssociationTagItemStyle) JSON.toJavaObject(bVar.j, AssociationTagItemStyle.class);
        if (associationTagItemStyle == null) {
            associationTagItemStyle = new AssociationTagItemStyle();
        }
        AssociationTagItemStyle associationTagItemStyle2 = (AssociationTagItemStyle) JSON.toJavaObject(bVar.i, AssociationTagItemStyle.class);
        if (associationTagItemStyle2 == null) {
            associationTagItemStyle2 = new AssociationTagItemStyle();
            associationTagItemStyle2.bgColor = "#1AFF6200";
            associationTagItemStyle2.titleColor = "#FF6200";
            associationTagItemStyle2.countColor = "#FF6200";
        }
        this.o = new kqc(this.f30232a, list, a(list, associationTagItemStyle, associationTagItemStyle2));
        this.o.a(new kqh<AssociationTagItem>() { // from class: com.taobao.detail.rate.widget.delegate.tag.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.kqh
            public void a(int i, AssociationTagItem associationTagItem) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b0fe11d7", new Object[]{this, new Integer(i), associationTagItem});
                    return;
                }
                a.a(a.this, i);
                if (a.d(a.this) == null) {
                    return;
                }
                String str = "ay onSelected index = " + i;
                a.d(a.this).a(i, associationTagItem);
            }
        });
    }

    private void c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf4b232", new Object[]{this, bVar});
            return;
        }
        this.m.setRotation(this.i ? 180.0f : 0.0f);
        this.l.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.detail.rate.widget.delegate.tag.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    a.e(a.this);
                }
            }
        });
    }

    private void a(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92d3edc", new Object[]{this, textView});
        } else if (!kio.INSTANCE.i()) {
        } else {
            try {
                Typeface createFromAsset = Typeface.createFromAsset(this.f30232a.getAssets(), "iconfonts/AlibabaSans102_v1_TaoBao-Rg.ttf");
                if (createFromAsset == null) {
                    return;
                }
                textView.setTypeface(createFromAsset);
            } catch (Exception unused) {
                textView.setTypeface(Typeface.DEFAULT);
            }
        }
    }

    private void a(TextView textView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7b4f78", new Object[]{this, textView, new Boolean(z)});
        } else if (textView == null || textView.getPaint() == null) {
        } else {
            textView.getPaint().setFakeBoldText(z);
        }
    }

    private boolean a(List<AssociationTagItem> list, int i) {
        AssociationTagItem associationTagItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19a074ce", new Object[]{this, list, new Integer(i)})).booleanValue();
        }
        if (list != null && i < list.size() && (associationTagItem = list.get(i)) != null && !TextUtils.isEmpty(associationTagItem.status)) {
            return TextUtils.equals(associationTagItem.status, "-1");
        }
        return false;
    }

    private kqe a(final List<AssociationTagItem> list, final AssociationTagItemStyle associationTagItemStyle, final AssociationTagItemStyle associationTagItemStyle2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kqe) ipChange.ipc$dispatch("6215200e", new Object[]{this, list, associationTagItemStyle, associationTagItemStyle2}) : new kqe() { // from class: com.taobao.detail.rate.widget.delegate.tag.a.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.kqe
            public GradientDrawable a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (GradientDrawable) ipChange2.ipc$dispatch("38e7c7e", new Object[]{this, new Boolean(z)});
                }
                int a2 = kqa.INSTANCE.a(z, associationTagItemStyle2.bgColor, associationTagItemStyle.bgColor);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(a.i(a.this).g);
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(a2);
                return gradientDrawable;
            }

            @Override // tb.kqe
            public void a(TextView textView, int i, boolean z) {
                a aVar;
                AssociationTagItemStyle associationTagItemStyle3;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("12e7980d", new Object[]{this, textView, new Integer(i), new Boolean(z)});
                    return;
                }
                a.a(a.this, textView, z);
                if (z) {
                    aVar = a.this;
                    associationTagItemStyle3 = associationTagItemStyle2;
                } else {
                    aVar = a.this;
                    associationTagItemStyle3 = associationTagItemStyle;
                }
                textView.setTextSize(0, a.b(aVar, associationTagItemStyle3.titleSize));
                textView.setTextColor(kqa.INSTANCE.a(z, associationTagItemStyle2.titleColor, a.a(a.this, list, i) ? associationTagItemStyle.countColor : associationTagItemStyle.titleColor));
            }

            @Override // tb.kqe
            public void b(TextView textView, int i, boolean z) {
                a aVar;
                AssociationTagItemStyle associationTagItemStyle3;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9b17d7ec", new Object[]{this, textView, new Integer(i), new Boolean(z)});
                    return;
                }
                a.a(a.this, textView);
                a.a(a.this, textView, z);
                if (z) {
                    aVar = a.this;
                    associationTagItemStyle3 = associationTagItemStyle2;
                } else {
                    aVar = a.this;
                    associationTagItemStyle3 = associationTagItemStyle;
                }
                textView.setTextSize(0, a.b(aVar, associationTagItemStyle3.countSize));
                textView.setTextColor(kqa.INSTANCE.a(z, associationTagItemStyle2.countColor, associationTagItemStyle.countColor));
            }

            @Override // tb.kqe
            public void a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    return;
                }
                int a2 = kil.a(11.52f);
                view.setPadding(a2, 0, a2, 0);
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, kil.a(34.56f)));
            }
        };
    }

    private float a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938b", new Object[]{this, new Integer(i)})).floatValue() : kqa.INSTANCE.a(i);
    }

    private List<AssociationTagItem> a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c9355ab7", new Object[]{this, jSONArray});
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.size() > 0) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    String string = jSONObject.getString("title");
                    String string2 = jSONObject.getString("fuzzyCount");
                    String string3 = jSONObject.getString("status");
                    String a2 = a(jSONObject);
                    if (TextUtils.isEmpty(string2)) {
                        string2 = jSONObject.getString("count");
                    }
                    String str = string2;
                    if (!TextUtils.isEmpty(string)) {
                        arrayList.add(new AssociationTagItem(string, str, string3, a2, jSONObject));
                    }
                }
            }
        }
        return arrayList;
    }

    private String a(JSONObject jSONObject) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("extraInfo");
        if (jSONObject2 == null || !jSONObject2.containsKey("labelType")) {
            return "-8";
        }
        String string2 = jSONObject2.getString("labelType");
        if (TextUtils.isEmpty(string2)) {
            string2 = "tab";
        }
        if (TextUtils.equals(string2, "tab")) {
            string = jSONObject2.getString("rateType");
            if (TextUtils.isEmpty(string)) {
                return "-8";
            }
        } else if (!TextUtils.equals(string2, "impr")) {
            return "-8";
        } else {
            string = jSONObject.getString("labelId");
            if (TextUtils.isEmpty(string)) {
                return "-8";
            }
        }
        return string;
    }

    private int a(List<AssociationTagItem> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c6e0ed6", new Object[]{this, list, str})).intValue();
        }
        if (list.size() > 0 && !TextUtils.isEmpty(str)) {
            for (int i = 0; i < list.size(); i++) {
                AssociationTagItem associationTagItem = list.get(i);
                if (associationTagItem != null && TextUtils.equals(associationTagItem.title, str)) {
                    return i;
                }
            }
        }
        return -1;
    }

    private int a(List<AssociationTagItem> list, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2bd60aa", new Object[]{this, list, jSONObject})).intValue();
        }
        if (list.size() > 0 && jSONObject != null) {
            for (int i = 0; i < list.size(); i++) {
                AssociationTagItem associationTagItem = list.get(i);
                String a2 = a(jSONObject);
                if (associationTagItem != null && TextUtils.equals(associationTagItem.id, a2)) {
                    return i;
                }
            }
        }
        return -1;
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.i = z;
        b bVar = this.n;
        boolean z2 = this.i;
        bVar.f = z2;
        this.m.setRotation(z2 ? 180.0f : 0.0f);
        if (this.d == null) {
            return;
        }
        String str = "ay onStateChanged flowViewForceChangeExpandStatus isExpanded = " + this.i;
        this.d.a(this.i, this.k.getShowLines(), this.k.getTotalLines(), "auto");
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        cVar.a(z);
        String str = "ay exposFoldButton isExpanded = " + z;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.k.setHasInit();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.j = true;
        this.i = !this.i;
        b bVar = this.n;
        boolean z = this.i;
        bVar.f = z;
        this.m.setRotation(z ? 180.0f : 0.0f);
        this.k.setFoldStatus(!this.i);
        if (this.d == null) {
            return;
        }
        this.k.post(new Runnable() { // from class: com.taobao.detail.rate.widget.delegate.tag.a.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String str = "ay onStateChanged switchFoldStatus isExpanded = " + a.f(a.this);
                a.h(a.this).a(a.f(a.this), a.g(a.this).getShowLines(), a.g(a.this).getTotalLines(), BizTaskData.MANUAL_TIME);
            }
        });
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.j) {
            this.j = false;
        } else {
            this.k.updateUIByAdapter(this.o);
            this.o.a(this.h);
        }
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("527fc38f", new Object[]{this, cVar});
        } else {
            this.e = cVar;
        }
    }

    public void a(InterfaceC0657a interfaceC0657a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("527edad1", new Object[]{this, interfaceC0657a});
        } else {
            this.d = interfaceC0657a;
        }
    }

    public void a(kqh<AssociationTagItem> kqhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1941fd6", new Object[]{this, kqhVar});
        } else {
            this.f = kqhVar;
        }
    }

    public void a(kqg<AssociationTagItem> kqgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f193ab77", new Object[]{this, kqgVar});
        } else {
            this.g = kqgVar;
        }
    }
}

package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableString;
import mtopsdk.common.util.StringUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.ext.view.widget.main.CountdownView;
import com.taobao.android.detail.core.detail.kit.utils.d;
import com.taobao.android.detail.core.detail.kit.view.holder.c;
import com.taobao.android.detail.core.detail.kit.view.widget.base.AutoWrapLineLayout;
import com.taobao.android.detail.core.detail.kit.view.widget.main.WidthVariableImageView;
import com.taobao.android.detail.core.model.viewmodel.main.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.j;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class ean extends c<i> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ViewGroup g;
    private LinearLayout h;
    private DetailImageView i;
    private View j;
    private View k;
    private DetailImageView l;
    private CountdownView m;
    private View n;
    private int o;
    private i p;
    private a q;
    private int r;

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public Class f27155a;
        public int b;
        public int c;
        public int d;
        public int e;

        static {
            kge.a(326888766);
        }

        public b(Class cls, int i, int i2, int i3, int i4) {
            this.f27155a = cls;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    static {
        kge.a(-512323887);
    }

    public static /* synthetic */ Object ipc$super(ean eanVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.main.UniformPriceViewHolder";
    }

    public static /* synthetic */ i a(ean eanVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("6017f04e", new Object[]{eanVar}) : eanVar.p;
    }

    public static /* synthetic */ LinearLayout b(ean eanVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("304be59e", new Object[]{eanVar}) : eanVar.h;
    }

    public ean(Context context) {
        super(context);
        this.o = -2;
        this.q = new a();
        this.r = epo.c().getColor(R.color.detail_main_price_fg);
        f.a(context).a(eno.a(eec.class), this.q);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        this.g = (ViewGroup) View.inflate(context, R.layout.x_detail_uniform_price, null);
        this.h = (LinearLayout) this.g.findViewById(R.id.detail_uniform_price_lt);
        this.i = (DetailImageView) this.g.findViewById(R.id.detail_uniform_price_bg);
        this.j = this.g.findViewById(R.id.detail_uniform_price_line);
        this.k = this.g.findViewById(R.id.detail_uniform_price_right);
        this.l = (DetailImageView) this.g.findViewById(R.id.detail_uniform_price_icon);
        this.m = (CountdownView) this.g.findViewById(R.id.detail_uniform_price_time);
        this.n = this.g.findViewById(R.id.detail_uniform_price_cutline);
        this.g.setTag(this);
        return this.g;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270dd2b0", new Object[]{this, iVar});
            return;
        }
        this.o = -2;
        if (this.h.getChildCount() > 0) {
            this.h.removeAllViews();
        }
        this.p = iVar;
        b(iVar);
        a(iVar, this.h);
    }

    private void b(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d119e0f", new Object[]{this, iVar});
        } else if (iVar.g != null) {
            a(this.i, iVar.g.b);
            this.j.setVisibility(0);
            this.k.setVisibility(0);
            a(this.l, iVar.g.c);
            if (!StringUtils.isEmpty(iVar.g.f)) {
                this.m.setText(iVar.g.f);
                if (!StringUtils.isEmpty(iVar.g.g)) {
                    this.m.setTextColor(com.taobao.android.detail.core.utils.c.a(iVar.g.g));
                }
                this.m.setVisibility(0);
            } else if (iVar.g.d != null && iVar.g.e != null) {
                this.m.setCountdown(iVar.g.d.longValue(), iVar.g.e.longValue());
                this.m.setVisibility(0);
            } else {
                this.m.setVisibility(8);
                ((LinearLayout.LayoutParams) this.l.getLayoutParams()).height = epo.b(42);
            }
            if (!StringUtils.isEmpty(iVar.g.f10000a)) {
                this.o = com.taobao.android.detail.core.utils.c.a(iVar.g.f10000a);
            }
            d.a(this.f9568a, this.c, this.k, ((i) this.c).events);
            this.b.setOnClickListener(null);
        } else {
            this.i.setVisibility(8);
            this.j.setVisibility(8);
            this.k.setVisibility(8);
        }
    }

    private void a(DetailImageView detailImageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28799cb3", new Object[]{this, detailImageView, str});
        } else if (!StringUtils.isEmpty(str)) {
            epj.b().a(str, detailImageView);
            detailImageView.setVisibility(0);
        } else {
            detailImageView.setVisibility(8);
        }
    }

    private void a(i iVar, LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcfff437", new Object[]{this, iVar, linearLayout});
            return;
        }
        b(iVar, linearLayout);
        c(iVar, linearLayout);
        d(iVar, linearLayout);
        e(iVar, linearLayout);
    }

    private void b(i iVar, LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e607b938", new Object[]{this, iVar, linearLayout});
        } else if (iVar.f9772a == null) {
        } else {
            AutoWrapLineLayout autoWrapLineLayout = new AutoWrapLineLayout(this.f9568a);
            autoWrapLineLayout.setSimplifiedMode(true, 1);
            autoWrapLineLayout.setLineGravity(80);
            autoWrapLineLayout.setItemSpacing(epo.e);
            TextView b2 = b(iVar.f9772a, 1);
            if (b2 != null) {
                b2.setPadding(0, (iVar.g == null || StringUtils.isEmpty(iVar.g.c)) ? epo.b(10) : 0, 0, -epo.e);
                autoWrapLineLayout.addView(b2);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = -epo.d;
            linearLayout.addView(autoWrapLineLayout, layoutParams);
            a(iVar, (ViewGroup) autoWrapLineLayout);
            b(iVar, autoWrapLineLayout);
        }
    }

    private void a(i iVar, ViewGroup viewGroup) {
        TextView b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94fd6eef", new Object[]{this, iVar, viewGroup});
        } else if (iVar.b == null || (b2 = b(iVar.b, 2)) == null) {
        } else {
            viewGroup.addView(b2);
        }
    }

    private void b(i iVar, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcfccd4e", new Object[]{this, iVar, viewGroup});
        } else if (iVar.d == null || iVar.d.isEmpty()) {
        } else {
            Iterator<PriceNode.b> it = iVar.d.iterator();
            while (it.hasNext()) {
                View a2 = a(it.next());
                if (a2 != null) {
                    viewGroup.addView(a2);
                    if (viewGroup instanceof AutoWrapLineLayout) {
                        ((AutoWrapLineLayout) viewGroup).adjustView(a2, 0, 0);
                    }
                }
            }
        }
    }

    private void c(i iVar, LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf0f7e39", new Object[]{this, iVar, linearLayout});
        } else if (iVar.c == null || iVar.c.isEmpty()) {
        } else {
            AutoWrapLineLayout autoWrapLineLayout = new AutoWrapLineLayout(this.f9568a);
            autoWrapLineLayout.setSimplifiedMode(true, 1);
            autoWrapLineLayout.setLineGravity(80);
            autoWrapLineLayout.setItemSpacing(epo.h);
            linearLayout.addView(autoWrapLineLayout, new LinearLayout.LayoutParams(-1, -2));
            Iterator<PriceNode.PriceData> it = iVar.c.iterator();
            while (it.hasNext()) {
                TextView b2 = b(it.next(), 3);
                if (b2 != null) {
                    autoWrapLineLayout.addView(b2);
                }
            }
        }
    }

    private void d(i iVar, LinearLayout linearLayout) {
        TextView b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b817433a", new Object[]{this, iVar, linearLayout});
        } else if (iVar.e == null || (b2 = b(iVar.e, 3)) == null) {
        } else {
            linearLayout.addView(b2);
        }
    }

    private void e(i iVar, LinearLayout linearLayout) {
        TextView b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a11f083b", new Object[]{this, iVar, linearLayout});
        } else if (iVar.f == null || (b2 = b(iVar.f, 4)) == null) {
        } else {
            linearLayout.addView(b2);
        }
    }

    private SpannableString a(PriceNode.PriceData priceData, int i) {
        String str;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("c715897f", new Object[]{this, priceData, new Integer(i)});
        }
        if (priceData == null) {
            return null;
        }
        if (StringUtils.isEmpty(priceData.priceText) && StringUtils.isEmpty(priceData.priceDesc) && StringUtils.isEmpty(priceData.priceTitle)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<b> arrayList = new ArrayList<>();
        int length = sb.length();
        if ((i != 1 || ecu.i) && !StringUtils.isEmpty(priceData.priceTitle)) {
            String str2 = priceData.priceTitle + " ";
            String str3 = priceData.priceTitleColor;
            sb.append(str2);
            int length2 = str2.length() + 0;
            if (i == 1) {
                arrayList.add(new b(ForegroundColorSpan.class, length, length + length2, StringUtils.isEmpty(str3) ? a(3) : com.taobao.android.detail.core.utils.c.a(str3), 0));
            } else {
                arrayList.add(new b(ForegroundColorSpan.class, length, length + length2, StringUtils.isEmpty(str3) ? a(i) : com.taobao.android.detail.core.utils.c.a(str3), 0));
            }
            str = " ";
            a(arrayList, length, length + length2, i, 1, priceData.priceTextSize);
        } else {
            str = " ";
        }
        int length3 = sb.length();
        if (!StringUtils.isEmpty(priceData.priceText)) {
            if (!StringUtils.isEmpty(priceData.priceChar)) {
                int length4 = sb.length();
                if (!priceData.priceChar.contains(str)) {
                    priceData.priceChar += str;
                }
                sb.append(priceData.priceChar);
                a(arrayList, length4, length4 + priceData.priceChar.length(), i, 1, priceData.priceTextSize);
                if (priceData.lineThrough) {
                    i2 = 0 + priceData.priceChar.length();
                }
            }
            a(sb, arrayList, priceData.priceText, i, priceData.priceTextSize);
            if (priceData.lineThrough) {
                arrayList.add(new b(StrikethroughSpan.class, length3, length3 + i2 + priceData.priceText.length(), 0, 0));
            }
        }
        if (!StringUtils.isEmpty(priceData.priceDesc)) {
            if (sb.length() > 0) {
                sb.append(str);
            }
            int length5 = sb.length();
            sb.append(priceData.priceDesc);
            int length6 = length5 + priceData.priceDesc.length();
            a(arrayList, length5, length6, i, 1, priceData.priceTextSize);
            arrayList.add(new b(ForegroundColorSpan.class, length5, length6, a(i), 0));
            sb.append("  ");
        }
        if (priceData.bold) {
            arrayList.add(new b(StyleSpan.class, 0, sb.length(), 1, 0));
        }
        SpannableString a2 = a(sb, arrayList);
        arrayList.clear();
        return a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
        if (r12 != 3) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.util.ArrayList<tb.ean.b> r8, int r9, int r10, int r11, int r12, java.lang.String r13) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ean.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 4
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L38
            r1 = 7
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r7
            r1[r6] = r8
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r9)
            r1[r5] = r8
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r10)
            r1[r4] = r8
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r11)
            r1[r2] = r8
            r8 = 5
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r12)
            r1[r8] = r9
            r8 = 6
            r1[r8] = r13
            java.lang.String r8 = "4f01234c"
            r0.ipc$dispatch(r8, r1)
            return
        L38:
            int r0 = tb.epo.k
            if (r6 != r11) goto L5e
            if (r12 == r6) goto L51
            if (r12 == r5) goto L43
            if (r12 == r4) goto L51
            goto L4f
        L43:
            android.content.Context r11 = r7.f9568a
            android.content.res.Resources r11 = r11.getResources()
            int r12 = com.taobao.taobao.R.dimen.detail_d20
            int r0 = r11.getDimensionPixelOffset(r12)
        L4f:
            r5 = r0
            goto La0
        L51:
            android.content.Context r11 = r7.f9568a
            android.content.res.Resources r11 = r11.getResources()
            int r12 = com.taobao.taobao.R.dimen.detail_d14
            int r0 = r11.getDimensionPixelOffset(r12)
            goto L4f
        L5e:
            if (r5 != r11) goto L81
            if (r12 == r6) goto L74
            if (r12 == r5) goto L74
            if (r12 == r4) goto L67
            goto L4f
        L67:
            android.content.Context r11 = r7.f9568a
            android.content.res.Resources r11 = r11.getResources()
            int r12 = com.taobao.taobao.R.dimen.detail_sub_price_text_size_small
            int r0 = r11.getDimensionPixelOffset(r12)
            goto L4f
        L74:
            android.content.Context r11 = r7.f9568a
            android.content.res.Resources r11 = r11.getResources()
            int r12 = com.taobao.taobao.R.dimen.detail_d14
            int r0 = r11.getDimensionPixelOffset(r12)
            goto L4f
        L81:
            if (r4 == r11) goto L87
            if (r2 != r11) goto L86
            goto L87
        L86:
            return
        L87:
            int r3 = java.lang.Integer.parseInt(r13)     // Catch: java.lang.NumberFormatException -> L8b
        L8b:
            if (r3 <= 0) goto L92
            int r11 = tb.epo.b(r3)
            goto L9e
        L92:
            android.content.Context r11 = r7.f9568a
            android.content.res.Resources r11 = r11.getResources()
            int r12 = com.taobao.taobao.R.dimen.detail_extra_price_text_size
            int r11 = r11.getDimensionPixelOffset(r12)
        L9e:
            r0 = r11
            goto L4f
        La0:
            tb.ean$b r11 = new tb.ean$b
            java.lang.Class<android.text.style.AbsoluteSizeSpan> r2 = android.text.style.AbsoluteSizeSpan.class
            r6 = 0
            r1 = r11
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r8.add(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ean.a(java.util.ArrayList, int, int, int, int, java.lang.String):void");
    }

    private void a(StringBuilder sb, ArrayList<b> arrayList, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cee54f9c", new Object[]{this, sb, arrayList, str, new Integer(i), str2});
        } else if (sb != null && arrayList != null && !StringUtils.isEmpty(str)) {
            String[] split = str.split("-");
            if (split.length <= 0) {
                return;
            }
            for (int i2 = 0; i2 < split.length; i2++) {
                if (i2 > 0) {
                    int length = sb.length();
                    sb.append("-");
                    int i3 = length + 1;
                    a(arrayList, length, i3, i, 1, str2);
                    if (i == 1) {
                        arrayList.add(new b(StyleSpan.class, length, i3, 0, 0));
                    }
                }
                if (!StringUtils.isEmpty(split[i2])) {
                    int length2 = sb.length();
                    sb.append(split[i2]);
                    a(arrayList, length2, length2 + split[i2].length(), i, 2, str2);
                    if (i == 1) {
                        arrayList.add(new b(StyleSpan.class, length2, length2 + split[i2].length(), 0, 0));
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
        r2 = r8.newInstance(new java.lang.Object[0]);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.text.SpannableString a(java.lang.StringBuilder r12, java.util.ArrayList<tb.ean.b> r13) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L8b
            int r1 = r12.length()
            if (r1 <= 0) goto L8b
            if (r13 == 0) goto L8b
            boolean r1 = r13.isEmpty()
            if (r1 == 0) goto L13
            goto L8b
        L13:
            android.text.SpannableString r1 = new android.text.SpannableString
            java.lang.String r12 = r12.toString()
            r1.<init>(r12)
            boolean r12 = r13.isEmpty()
            if (r12 != 0) goto L8a
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.Class r2 = java.lang.Integer.TYPE
            r12.add(r2)
            java.util.Iterator r13 = r13.iterator()
            r2 = r0
        L31:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L8a
            java.lang.Object r3 = r13.next()
            tb.ean$b r3 = (tb.ean.b) r3
            java.lang.Class r4 = r3.f27155a     // Catch: java.lang.Exception -> L7d
            java.lang.reflect.Constructor[] r4 = r4.getConstructors()     // Catch: java.lang.Exception -> L7d
            if (r4 == 0) goto L7e
            int r5 = r4.length     // Catch: java.lang.Exception -> L7d
            if (r5 <= 0) goto L7e
            int r5 = r4.length     // Catch: java.lang.Exception -> L7d
            r6 = 0
            r7 = 0
        L4b:
            if (r7 >= r5) goto L7e
            r8 = r4[r7]     // Catch: java.lang.Exception -> L7d
            java.lang.Class[] r9 = r8.getParameterTypes()     // Catch: java.lang.Exception -> L7d
            if (r9 == 0) goto L76
            int r10 = r9.length     // Catch: java.lang.Exception -> L7d
            if (r10 > 0) goto L59
            goto L76
        L59:
            java.util.List r9 = java.util.Arrays.asList(r9)     // Catch: java.lang.Exception -> L7d
            boolean r9 = r12.equals(r9)     // Catch: java.lang.Exception -> L7d
            if (r9 == 0) goto L73
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L7d
            int r4 = r3.d     // Catch: java.lang.Exception -> L7d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L7d
            r2[r6] = r4     // Catch: java.lang.Exception -> L7d
            java.lang.Object r2 = r8.newInstance(r2)     // Catch: java.lang.Exception -> L7d
            goto L7e
        L73:
            int r7 = r7 + 1
            goto L4b
        L76:
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L7d
            java.lang.Object r2 = r8.newInstance(r2)     // Catch: java.lang.Exception -> L7d
            goto L7e
        L7d:
            r2 = r0
        L7e:
            if (r2 == 0) goto L31
            int r4 = r3.b     // Catch: java.lang.Exception -> L8a
            int r3 = r3.c     // Catch: java.lang.Exception -> L8a
            r5 = 33
            r1.setSpan(r2, r4, r3, r5)     // Catch: java.lang.Exception -> L8a
            goto L31
        L8a:
            return r1
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ean.a(java.lang.StringBuilder, java.util.ArrayList):android.text.SpannableString");
    }

    private TextView b(PriceNode.PriceData priceData, int i) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("57f934c", new Object[]{this, priceData, new Integer(i)});
        }
        if (priceData == null) {
            return null;
        }
        SpannableString a3 = a(priceData, i);
        if (StringUtils.isEmpty(a3)) {
            return null;
        }
        TextView textView = new TextView(this.f9568a);
        textView.setText(a3);
        textView.setSingleLine();
        if (StringUtils.isEmpty(priceData.priceColor)) {
            a2 = a(i);
        } else {
            a2 = com.taobao.android.detail.core.utils.c.a(priceData.priceColor);
        }
        textView.setTextColor(a2);
        return textView;
    }

    private int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        int i2 = this.o;
        if (i2 != -2) {
            return i2;
        }
        if (i == 2) {
            return this.f9568a.getResources().getColor(R.color.detail_sub_price_fg);
        }
        if (i == 3) {
            return this.f9568a.getResources().getColor(R.color.detail_extra_price_fg);
        }
        if (i != 4) {
            return this.f9568a.getResources().getColor(R.color.detail_main_price_fg);
        }
        return this.f9568a.getResources().getColor(R.color.detail_theme_color);
    }

    private View a(PriceNode.b bVar) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4d8e8dbd", new Object[]{this, bVar});
        }
        if (bVar == null) {
            return null;
        }
        if (!StringUtils.isEmpty(bVar.f9987a)) {
            TextView textView = new TextView(this.f9568a);
            textView.setText(bVar.f9987a);
            textView.setTextSize(1, 9.0f);
            if (StringUtils.isEmpty(bVar.b)) {
                a2 = this.o;
                if (a2 == -2) {
                    a2 = this.r;
                }
            } else {
                a2 = com.taobao.android.detail.core.utils.c.a(bVar.b);
            }
            textView.setTextColor(a2);
            int parseColor = StringUtils.isEmpty(bVar.c) ? Color.parseColor("#FFF1EB") : com.taobao.android.detail.core.utils.c.a(bVar.c);
            textView.setBackgroundColor(parseColor);
            textView.setPadding(epo.d + 2, 2, epo.d + 2, 2);
            textView.setIncludeFontPadding(false);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(parseColor);
            gradientDrawable.setCornerRadius(18.0f);
            if (Build.VERSION.SDK_INT < 16) {
                textView.setBackgroundDrawable(gradientDrawable);
            } else {
                textView.setBackground(gradientDrawable);
            }
            return textView;
        } else if (StringUtils.isEmpty(bVar.d)) {
            return null;
        } else {
            WidthVariableImageView widthVariableImageView = new WidthVariableImageView(this.f9568a);
            int b2 = epo.b(12);
            widthVariableImageView.setLayoutParams(new ViewGroup.LayoutParams(-2, b2));
            widthVariableImageView.setWidthRange(epo.b(6), epo.b(60));
            widthVariableImageView.setHeight(b2);
            epm epmVar = new epm();
            epmVar.c = true;
            com.taobao.android.detail.core.detail.kit.utils.f.a(this.f9568a).a(widthVariableImageView, bVar.d, epmVar);
            return widthVariableImageView;
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        if (this.g == null) {
            return;
        }
        if (!com.taobao.android.detail.core.utils.i.a() && "com.taobao.taobao".equals(this.f9568a.getPackageName())) {
            this.g.setOnLongClickListener(null);
        }
        this.g.removeAllViews();
    }

    /* loaded from: classes4.dex */
    public class a implements j<eec> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(429146308);
            kge.a(-1453870097);
        }

        private a() {
        }

        @Override // com.taobao.android.trade.event.j
        public /* synthetic */ com.taobao.android.trade.event.i handleEvent(eec eecVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, eecVar}) : a(eecVar);
        }

        public com.taobao.android.trade.event.i a(eec eecVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("63162b9a", new Object[]{this, eecVar});
            }
            if (ean.a(ean.this) == null || ean.b(ean.this) == null || eecVar == null) {
                return com.taobao.android.detail.core.event.a.FAILURE;
            }
            if (eecVar.f27228a != null) {
                ean.a(ean.this).f9772a = eecVar.f27228a;
            }
            if (eecVar.f27228a != null) {
                ean.a(ean.this).b = eecVar.b;
            }
            ean eanVar = ean.this;
            eanVar.a(ean.a(eanVar));
            return com.taobao.android.detail.core.event.a.SUCCESS;
        }

        @Override // com.taobao.android.trade.event.j
        public ThreadMode getThreadMode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
        }
    }
}

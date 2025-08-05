package tb;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.c;
import com.taobao.android.detail.core.detail.kit.view.widget.base.AutoWrapLineLayout;
import com.taobao.android.detail.core.detail.kit.view.widget.main.WidthVariableImageView;
import com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class eai extends c<com.taobao.android.detail.datasdk.model.viewmodel.main.c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int g;
    private ViewGroup h;
    private LinearLayout i;
    private com.taobao.android.detail.datasdk.model.viewmodel.main.c j;
    private a k;

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public Class f27151a;
        public int b;
        public int c;
        public int d;
        public int e;

        static {
            kge.a(-753285412);
        }

        public b(Class cls, int i, int i2, int i3, int i4) {
            this.f27151a = cls;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    static {
        kge.a(-1582795537);
    }

    public static /* synthetic */ Object ipc$super(eai eaiVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.main.PriceViewHolder";
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.c a(eai eaiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.c) ipChange.ipc$dispatch("91fde852", new Object[]{eaiVar}) : eaiVar.j;
    }

    public static /* synthetic */ LinearLayout b(eai eaiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("875aa643", new Object[]{eaiVar}) : eaiVar.i;
    }

    public eai(Context context) {
        super(context);
        this.k = new a();
        g = epo.c().getColor(R.color.detail_main_price_fg);
        f.a(context).a(eno.a(eec.class), this.k);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        this.h = (ViewGroup) View.inflate(context, R.layout.x_detail_main_price, null);
        this.i = (LinearLayout) this.h.findViewById(R.id.detail_main_price_lt);
        this.h.setTag(this);
        return this.h;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a(com.taobao.android.detail.datasdk.model.viewmodel.main.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aab9af", new Object[]{this, cVar});
            return;
        }
        if (this.i.getChildCount() > 0) {
            this.i.removeAllViews();
        }
        this.j = cVar;
        a(cVar, this.i);
    }

    /* loaded from: classes4.dex */
    public class a implements j<eec> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1887804514);
            kge.a(-1453870097);
        }

        private a() {
        }

        @Override // com.taobao.android.trade.event.j
        public /* synthetic */ i handleEvent(eec eecVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, eecVar}) : a(eecVar);
        }

        public i a(eec eecVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i) ipChange.ipc$dispatch("63162b9a", new Object[]{this, eecVar});
            }
            if (eai.a(eai.this) == null || eai.b(eai.this) == null || eecVar == null) {
                return com.taobao.android.detail.core.event.a.FAILURE;
            }
            if (eecVar.f27228a != null) {
                eai.a(eai.this).f10066a = eecVar.f27228a;
            }
            if (eecVar.f27228a != null) {
                eai.a(eai.this).b = eecVar.b;
            }
            eai eaiVar = eai.this;
            eaiVar.a(eai.a(eaiVar));
            return com.taobao.android.detail.core.event.a.SUCCESS;
        }

        @Override // com.taobao.android.trade.event.j
        public ThreadMode getThreadMode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
        }
    }

    private void a(com.taobao.android.detail.datasdk.model.viewmodel.main.c cVar, LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4313c198", new Object[]{this, cVar, linearLayout});
            return;
        }
        b(cVar, linearLayout);
        d(cVar, linearLayout);
        c(cVar, linearLayout);
    }

    private void b(com.taobao.android.detail.datasdk.model.viewmodel.main.c cVar, LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("423a50f7", new Object[]{this, cVar, linearLayout});
        } else if (cVar.f10066a == null) {
        } else {
            AutoWrapLineLayout autoWrapLineLayout = new AutoWrapLineLayout(this.f9568a);
            autoWrapLineLayout.setLineGravity(80);
            autoWrapLineLayout.setItemSpacing(epo.e);
            TextView b2 = b(cVar.f10066a, 1);
            if (b2 != null) {
                b2.setPadding(0, 0, (int) (epo.f27511a * 5.0f), 0);
                autoWrapLineLayout.addView(b2);
            }
            linearLayout.addView(autoWrapLineLayout);
            a(cVar, (ViewGroup) autoWrapLineLayout);
            b(cVar, autoWrapLineLayout);
        }
    }

    private void a(com.taobao.android.detail.datasdk.model.viewmodel.main.c cVar, ViewGroup viewGroup) {
        TextView b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe508ee", new Object[]{this, cVar, viewGroup});
        } else if (cVar.b == null || (b2 = b(cVar.b, 2)) == null) {
        } else {
            viewGroup.addView(b2);
            if (!(viewGroup instanceof AutoWrapLineLayout)) {
                return;
            }
            ((AutoWrapLineLayout) viewGroup).adjustView(b2, 0, -((int) (epo.f27511a * 3.0f)));
        }
    }

    private void b(com.taobao.android.detail.datasdk.model.viewmodel.main.c cVar, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6c1a2f", new Object[]{this, cVar, viewGroup});
        } else if (cVar.d == null || cVar.d.isEmpty()) {
        } else {
            Iterator<PriceNode.b> it = cVar.d.iterator();
            while (it.hasNext()) {
                View a2 = a(it.next());
                if (a2 != null) {
                    viewGroup.addView(a2);
                    if (viewGroup instanceof AutoWrapLineLayout) {
                        ((AutoWrapLineLayout) viewGroup).adjustView(a2, 0, -((int) (epo.f27511a * 5.0f)));
                    }
                }
            }
        }
    }

    private void c(com.taobao.android.detail.datasdk.model.viewmodel.main.c cVar, LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4160e056", new Object[]{this, cVar, linearLayout});
        } else if (cVar.c == null || cVar.c.isEmpty()) {
        } else {
            AutoWrapLineLayout autoWrapLineLayout = new AutoWrapLineLayout(this.f9568a);
            autoWrapLineLayout.setLineGravity(80);
            autoWrapLineLayout.setItemSpacing(epo.h);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = epo.d;
            layoutParams.topMargin = epo.d;
            linearLayout.addView(autoWrapLineLayout, layoutParams);
            Iterator<PriceNode.PriceData> it = cVar.c.iterator();
            while (it.hasNext()) {
                TextView b2 = b(it.next(), 3);
                if (b2 != null) {
                    b2.setIncludeFontPadding(true);
                    b2.setTextSize(0, this.f9568a.getResources().getDimensionPixelOffset(R.dimen.detail_extra_price_text_size));
                    autoWrapLineLayout.addView(b2);
                }
            }
        }
    }

    private void d(com.taobao.android.detail.datasdk.model.viewmodel.main.c cVar, LinearLayout linearLayout) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40876fb5", new Object[]{this, cVar, linearLayout});
        } else if (cVar.e == null || cVar.e.isEmpty()) {
        } else {
            LinearLayout linearLayout2 = new LinearLayout(this.f9568a);
            linearLayout2.setOrientation(1);
            linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
            Iterator<PriceNode.a> it = cVar.e.iterator();
            while (it.hasNext()) {
                PriceNode.a next = it.next();
                if (next != null && !TextUtils.isEmpty(next.f9986a)) {
                    TextView textView = new TextView(this.f9568a);
                    textView.setMaxLines(1);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setText(next.f9986a);
                    textView.setTextSize(0, this.f9568a.getResources().getDimensionPixelOffset(R.dimen.detail_extra_price_descs_text_size));
                    if (TextUtils.isEmpty(next.b)) {
                        a2 = this.f9568a.getResources().getColor(R.color.detail_whole_price_desc_default_text_color);
                    } else {
                        a2 = com.taobao.android.detail.core.utils.c.a(next.b);
                    }
                    textView.setTextColor(a2);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.bottomMargin = epo.d;
                    layoutParams.topMargin = epo.d;
                    linearLayout2.addView(textView, layoutParams);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.text.SpannableString a(com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode.PriceData r19, int r20) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.eai.a(com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode$PriceData, int):android.text.SpannableString");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
        if (r12 != 3) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.util.ArrayList<tb.eai.b> r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.eai.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r5 = 0
            r1[r5] = r7
            r1[r4] = r8
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r9)
            r1[r3] = r8
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r10)
            r1[r2] = r8
            r8 = 4
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r11)
            r1[r8] = r9
            r8 = 5
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r12)
            r1[r8] = r9
            java.lang.String r8 = "9968b602"
            r0.ipc$dispatch(r8, r1)
            return
        L35:
            int r0 = tb.epo.k
            if (r4 != r11) goto L5b
            if (r12 == r4) goto L4e
            if (r12 == r3) goto L40
            if (r12 == r2) goto L4e
            goto L4c
        L40:
            android.content.Context r11 = r7.f9568a
            android.content.res.Resources r11 = r11.getResources()
            int r12 = com.taobao.taobao.R.dimen.detail_main_price_text_size_big
            int r0 = r11.getDimensionPixelOffset(r12)
        L4c:
            r5 = r0
            goto L8d
        L4e:
            android.content.Context r11 = r7.f9568a
            android.content.res.Resources r11 = r11.getResources()
            int r12 = com.taobao.taobao.R.dimen.detail_main_price_text_size_normal
            int r0 = r11.getDimensionPixelOffset(r12)
            goto L4c
        L5b:
            if (r3 != r11) goto L7e
            if (r12 == r4) goto L71
            if (r12 == r3) goto L71
            if (r12 == r2) goto L64
            goto L4c
        L64:
            android.content.Context r11 = r7.f9568a
            android.content.res.Resources r11 = r11.getResources()
            int r12 = com.taobao.taobao.R.dimen.detail_sub_price_text_size_small
            int r0 = r11.getDimensionPixelOffset(r12)
            goto L4c
        L71:
            android.content.Context r11 = r7.f9568a
            android.content.res.Resources r11 = r11.getResources()
            int r12 = com.taobao.taobao.R.dimen.detail_sub_price_text_size_normal
            int r0 = r11.getDimensionPixelOffset(r12)
            goto L4c
        L7e:
            if (r2 != r11) goto L9b
            android.content.Context r11 = r7.f9568a
            android.content.res.Resources r11 = r11.getResources()
            int r12 = com.taobao.taobao.R.dimen.detail_extra_price_text_size
            int r0 = r11.getDimensionPixelOffset(r12)
            goto L4c
        L8d:
            tb.eai$b r11 = new tb.eai$b
            java.lang.Class<android.text.style.AbsoluteSizeSpan> r2 = android.text.style.AbsoluteSizeSpan.class
            r6 = 0
            r1 = r11
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r8.add(r11)
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.eai.a(java.util.ArrayList, int, int, int, int):void");
    }

    private void a(StringBuilder sb, ArrayList<b> arrayList, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90365652", new Object[]{this, sb, arrayList, str, new Integer(i)});
        } else if (sb != null && arrayList != null && !TextUtils.isEmpty(str)) {
            String[] split = str.split("-");
            if (split.length <= 0) {
                return;
            }
            for (int i2 = 0; i2 < split.length; i2++) {
                if (i2 > 0) {
                    int length = sb.length();
                    sb.append("-");
                    a(arrayList, length, length + 1, i, 1);
                }
                if (!TextUtils.isEmpty(split[i2])) {
                    String[] split2 = split[i2].split(Pattern.quote("."));
                    if (split2.length > 0) {
                        int length2 = sb.length();
                        sb.append(split2[0]);
                        a(arrayList, length2, length2 + split2[0].length(), i, 2);
                        int length3 = sb.length();
                        sb.append(split[i2].substring(split2[0].length()));
                        a(arrayList, length3, (split[i2].length() + length3) - split2[0].length(), i, 1);
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
    private android.text.SpannableString a(java.lang.StringBuilder r12, java.util.ArrayList<tb.eai.b> r13) {
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
            tb.eai$b r3 = (tb.eai.b) r3
            java.lang.Class r4 = r3.f27151a     // Catch: java.lang.Exception -> L7d
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
        throw new UnsupportedOperationException("Method not decompiled: tb.eai.a(java.lang.StringBuilder, java.util.ArrayList):android.text.SpannableString");
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
        if (TextUtils.isEmpty(a3)) {
            return null;
        }
        TextView textView = new TextView(this.f9568a);
        textView.setText(a3);
        if (TextUtils.isEmpty(priceData.priceColor)) {
            a2 = a(i);
        } else {
            a2 = com.taobao.android.detail.core.utils.c.a(priceData.priceColor);
        }
        textView.setTextColor(a2);
        textView.setIncludeFontPadding(false);
        return textView;
    }

    private int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 2) {
            return this.f9568a.getResources().getColor(R.color.detail_sub_price_fg);
        }
        if (i != 3) {
            return this.f9568a.getResources().getColor(R.color.detail_main_price_fg);
        }
        return this.f9568a.getResources().getColor(R.color.detail_extra_price_fg);
    }

    private View a(PriceNode.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4d8e8dbd", new Object[]{this, bVar});
        }
        if (bVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(bVar.f9987a)) {
            TextView textView = new TextView(this.f9568a);
            textView.setText(bVar.f9987a);
            textView.setTextSize(1, 10.0f);
            if (com.taobao.android.detail.core.detail.kit.utils.c.b()) {
                textView.setBackgroundResource(R.drawable.detail_tag_border);
                textView.setPadding(epo.d, 0, epo.d, 0);
                textView.setTextColor(this.f9568a.getResources().getColor(R.color.detail_theme_color));
            } else {
                int a2 = TextUtils.isEmpty(bVar.c) ? g : com.taobao.android.detail.core.utils.c.a(bVar.c);
                textView.setTextColor(a2);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(-1);
                gradientDrawable.setCornerRadius(4.0f);
                gradientDrawable.setStroke(2, a2);
                if (Build.VERSION.SDK_INT < 16) {
                    textView.setBackgroundDrawable(gradientDrawable);
                } else {
                    textView.setBackground(gradientDrawable);
                }
                textView.setPadding(epo.d + 2, 2, epo.d + 2, 2);
                textView.setIncludeFontPadding(false);
            }
            return textView;
        } else if (TextUtils.isEmpty(bVar.d)) {
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
        if (this.h == null) {
            return;
        }
        if (!com.taobao.android.detail.core.utils.i.a() && "com.taobao.taobao".equals(this.f9568a.getPackageName())) {
            this.h.setOnLongClickListener(null);
        }
        this.h.removeAllViews();
    }
}

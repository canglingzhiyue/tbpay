package tb;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.async.d;
import com.taobao.android.detail.core.detail.kit.utils.h;
import com.taobao.android.detail.core.detail.kit.utils.k;
import com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.ChronometerView;
import com.taobao.android.detail.core.event.basic.p;
import com.taobao.android.detail.core.model.viewmodel.main.e;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.android.trade.event.f;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class ebm extends com.taobao.android.detail.core.detail.kit.view.holder.c<e> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "JhsPriceViewHolder";
    private TextView A;
    private TextView B;
    private TextView C;
    private TextView D;
    private TextView E;
    private ChronometerView F;
    private View G;
    private TextView H;
    private Handler I;
    public boolean g;
    private RelativeLayout h;
    private a i;
    private View j;
    private TextView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private TextView o;
    private LinearLayout p;
    private View q;
    private TextView r;
    private TextView s;
    private TextView t;
    private TextView u;
    private TextView v;
    private DetailImageView w;
    private TextView x;
    private View y;
    private TextView z;

    static {
        kge.a(893605066);
    }

    public static /* synthetic */ Object ipc$super(ebm ebmVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 90991720) {
            super.a();
            return null;
        } else if (hashCode == 1545161960) {
            super.a(((Boolean) objArr[0]).booleanValue(), ((Boolean) objArr[1]).booleanValue());
            return null;
        } else if (hashCode != 2121814399) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.G_();
            return null;
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.main.jhs.JhsPriceViewHolder";
    }

    public static /* synthetic */ Context a(ebm ebmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f3ae9860", new Object[]{ebmVar}) : ebmVar.f9568a;
    }

    public static /* synthetic */ void a(ebm ebmVar, e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("653b5d20", new Object[]{ebmVar, eVar, new Boolean(z)});
        } else {
            ebmVar.a(eVar, z);
        }
    }

    public static /* synthetic */ ChronometerView b(ebm ebmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ChronometerView) ipChange.ipc$dispatch("86417105", new Object[]{ebmVar}) : ebmVar.F;
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.b c(ebm ebmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("81d39b14", new Object[]{ebmVar}) : ebmVar.c;
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.b d(ebm ebmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("bab3fbb3", new Object[]{ebmVar}) : ebmVar.c;
    }

    public ebm(Context context) {
        super(context);
        this.g = true;
        this.I = new Handler() { // from class: tb.ebm.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                } else if (ebm.a(ebm.this) == null) {
                } else {
                    int i = message.what;
                    if (i != 1) {
                        if (i != 2) {
                            return;
                        }
                        ebm ebmVar = ebm.this;
                        ebm.a(ebmVar, (e) ebm.d(ebmVar), false);
                    } else if (ebm.b(ebm.this) == null) {
                    } else {
                        ebm.b(ebm.this).setVisibility(4);
                        ebm ebmVar2 = ebm.this;
                        ebm.a(ebmVar2, (e) ebm.c(ebmVar2), false);
                    }
                }
            }
        };
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        this.h = (RelativeLayout) d.b(context, R.layout.x_detail_jhs_priceinfo_layout);
        this.E = (TextView) this.h.findViewById(R.id.count_down_desc);
        this.F = (ChronometerView) this.h.findViewById(R.id.count_down_chronometer);
        this.G = this.h.findViewById(R.id.ll_count_down_container);
        this.H = (TextView) this.h.findViewById(R.id.layout_pintuan_extra);
        return this.h;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270c0134", new Object[]{this, eVar});
            return;
        }
        b(eVar);
        h(eVar);
        this.G.setVisibility(0);
        this.H.setVisibility(8);
        if (eVar.h == 6) {
            d();
            a(this.j);
            b(this.y);
            b(this.q);
            j(eVar);
            k(eVar);
            this.n.setTextColor(-1);
            this.m.setVisibility(8);
            this.o.setVisibility(0);
            this.o.setText(eVar.m);
            this.o.setTextColor(-1);
            this.o.setVisibility(0);
            if (!eVar.g || eVar.f <= 0) {
                if (!StringUtils.isEmpty(eVar.o)) {
                    this.H.setText(eVar.o);
                    this.H.setVisibility(0);
                    this.G.setVisibility(8);
                }
                i(eVar);
                return;
            }
            this.E.setTextColor(com.taobao.android.detail.core.utils.c.a("#ffffff"));
        } else if (eVar.k) {
            e();
            a(this.y);
            b(this.q);
            b(this.j);
            a(this.i);
            float f = f();
            a(f);
            a(eVar, this.B);
            this.B.setTextSize(0, f);
        } else if (eVar.h == 2 && !o(eVar)) {
            c();
            a(this.q);
            b(this.y);
            b(this.j);
            c(eVar);
            e(eVar);
            f(eVar);
            g(eVar);
        } else if (eVar.h == 4 || eVar.l) {
            d();
            a(this.j);
            b(this.y);
            b(this.q);
            j(eVar);
            l(eVar);
            d(eVar);
        } else {
            d();
            a(this.j);
            b(this.y);
            b(this.q);
            j(eVar);
            l(eVar);
            k(eVar);
        }
        a(eVar, true);
        i(eVar);
        if (eVar.h != 5) {
            return;
        }
        if (this.g) {
            this.h.setBackgroundColor(com.taobao.android.detail.core.utils.c.a("#27252b"));
        } else {
            this.h.setBackgroundResource(R.color.detail_jhs_not_start);
        }
        this.E.setTextColor(com.taobao.android.detail.core.utils.c.a("#27252b"));
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null || view.getVisibility() == 0) {
        } else {
            view.setVisibility(0);
        }
    }

    private void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else if (view == null || view.getVisibility() == 8) {
        } else {
            view.setVisibility(8);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.q != null) {
        } else {
            View inflate = ((ViewStub) this.h.findViewById(R.id.layout_jhs_qqjx_price)).inflate();
            this.q = inflate.findViewById(R.id.layout_jhs_qqjx_price);
            this.s = (TextView) inflate.findViewById(R.id.tv_jhs_qqjx_price);
            this.r = (TextView) inflate.findViewById(R.id.tv_jhs_qqjx_price_rmb);
            this.t = (TextView) inflate.findViewById(R.id.tv_qqjx_original_price);
            this.u = (TextView) inflate.findViewById(R.id.tv_qqjx_sold_count);
            this.v = (TextView) inflate.findViewById(R.id.tv_qqjx_original_price_label);
            this.w = (DetailImageView) inflate.findViewById(R.id.iv_qqjx_flag);
            this.x = (TextView) inflate.findViewById(R.id.tv_qqjx_goods_way);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.j != null) {
        } else {
            View inflate = ((ViewStub) this.h.findViewById(R.id.layout_jhs_common_price)).inflate();
            this.j = inflate.findViewById(R.id.layout_jhs_common_price);
            this.l = (TextView) inflate.findViewById(R.id.tv_jhs_common_price);
            this.k = (TextView) inflate.findViewById(R.id.tv_jhs_common_price_rmb);
            this.m = (TextView) inflate.findViewById(R.id.tv_common_original_price);
            this.n = (TextView) inflate.findViewById(R.id.tv_common_sold_count);
            this.o = (TextView) inflate.findViewById(R.id.tv_common_original_price_label);
            this.p = (LinearLayout) inflate.findViewById(R.id.tv_common_tag);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.y != null) {
        } else {
            View inflate = ((ViewStub) this.h.findViewById(R.id.layout_jhs_interval_price)).inflate();
            this.y = inflate.findViewById(R.id.layout_jhs_interval_price);
            this.z = (TextView) inflate.findViewById(R.id.detail_jhs_interval_price);
            this.A = (TextView) inflate.findViewById(R.id.detail_jhs_interval_price_rmb);
            this.B = (TextView) inflate.findViewById(R.id.detail_jhs_interval_sold_count);
            this.C = (TextView) inflate.findViewById(R.id.detail_jhs_interval_original_price);
            this.D = (TextView) inflate.findViewById(R.id.detail_jhs_interval_original_price_label);
        }
    }

    private void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ba42f8b", new Object[]{this, aVar});
            return;
        }
        String str = aVar.f27175a;
        if (StringUtils.isEmpty(str)) {
            return;
        }
        float f = epo.f27511a * 22.0f;
        this.z.setTextSize(0, f);
        float a2 = a(this.z, str, (int) (epo.b - (epo.f27511a * 130.0f)), f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        String[] split = str.split("-");
        if (split.length > 1 && !StringUtils.isEmpty(split[0]) && !StringUtils.isEmpty(split[1])) {
            int indexOf = split[0].indexOf(".");
            if (indexOf != -1) {
                int i = (int) a2;
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i), 0, indexOf, 17);
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan((i * 14) / 22), indexOf, split[0].length(), 18);
            } else {
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) a2), 0, split[0].length(), 17);
            }
            int indexOf2 = split[1].indexOf(".");
            if (indexOf2 != -1) {
                int i2 = (int) a2;
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i2), str.indexOf("-"), split[0].length() + indexOf2, 18);
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan((i2 * 14) / 22), indexOf2 + split[0].length() + 1, str.length(), 17);
            } else {
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) a2), str.indexOf("-"), str.length(), 17);
            }
        } else {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) a2), 0, str.length(), 17);
        }
        this.z.setText(spannableStringBuilder);
        if (((e) this.c).h != 5 || !this.g) {
            return;
        }
        this.z.setTextColor(this.f9568a.getResources().getColor(R.color.detail_jhs_jmp_price));
        this.A.setTextColor(this.f9568a.getResources().getColor(R.color.detail_jhs_jmp_price));
    }

    private float f() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1dd", new Object[]{this})).floatValue();
        }
        if (this.i.a()) {
            str = (StringUtils.isEmpty(this.i.d) ? "专柜价" : this.i.d) + this.i.c;
        } else {
            str = this.i.b;
        }
        float f = epo.f27511a * 12.0f;
        this.C.setTextSize(0, f);
        return a(this.C, str + " 人想买", (int) (epo.b - (epo.f27511a * 140.0f)), f);
    }

    private void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else if (rjq.a(this.i.d) && rjq.a(this.i.b)) {
            this.D.setVisibility(8);
            this.C.setVisibility(8);
        } else {
            this.C.setTextSize(0, f);
            if (this.i.a()) {
                this.D.setTextSize(0, f);
                if (StringUtils.isEmpty(this.i.d)) {
                    this.D.setText("专柜价");
                } else {
                    this.D.setText(this.i.d);
                }
                this.D.setVisibility(0);
                TextView textView = this.C;
                textView.setText("¥" + this.i.c + " ");
                this.C.getPaint().setFlags(16);
                return;
            }
            this.D.setVisibility(8);
            TextView textView2 = this.C;
            textView2.setText("¥" + this.i.b + " ");
            this.C.getPaint().setFlags(16);
        }
    }

    private void b(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0fcc93", new Object[]{this, eVar});
        } else if (eVar == null) {
        } else {
            this.i = n(eVar);
            this.g = eVar.g;
            i.c(TAG, "initData, isOnline:" + this.g);
        }
    }

    private void c(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("331397f2", new Object[]{this, eVar});
        } else if (eVar.i == null) {
        } else {
            if (!StringUtils.isEmpty(eVar.i.f9973a)) {
                epj.b().a(eVar.i.f9973a, this.w);
            }
            StringBuilder sb = new StringBuilder();
            if (!StringUtils.isEmpty(eVar.i.b)) {
                sb.append(eVar.i.b);
            }
            if (eVar.j != null && !eVar.j.isEmpty()) {
                Iterator<String> it = eVar.j.iterator();
                while (it.hasNext()) {
                    sb.append(" ");
                    sb.append(it.next());
                }
            }
            this.x.setText(sb.toString());
        }
    }

    private void d(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39176351", new Object[]{this, eVar});
            return;
        }
        this.n.setVisibility(8);
        if (eVar.j == null || eVar.j.isEmpty()) {
            return;
        }
        Iterator<String> it = eVar.j.iterator();
        while (it.hasNext()) {
            TextView textView = new TextView(this.f9568a);
            textView.setText(it.next());
            if (eVar.l) {
                textView.setBackgroundDrawable(this.f9568a.getResources().getDrawable(R.drawable.detail_meilihui_sold_bg));
                textView.setTextColor(com.taobao.android.detail.core.utils.c.a("#000000"));
                textView.setPadding(epo.f, 0, epo.f, 0);
            } else {
                textView.setBackgroundDrawable(this.f9568a.getResources().getDrawable(R.drawable.detail_jhs_sold_bg));
                textView.setTextColor(com.taobao.android.detail.core.utils.c.a("#b3ffffff"));
                textView.setPadding(0, 0, 0, 0);
            }
            textView.setTextSize(14.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.rightMargin = 10;
            this.p.addView(textView, layoutParams);
        }
        this.p.setVisibility(0);
    }

    private void e(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f1b2eb0", new Object[]{this, eVar});
            return;
        }
        i.b(TAG, "setupCommonPrice");
        a aVar = this.i;
        if (aVar == null || aVar.f27175a == null) {
            this.s.setVisibility(4);
            return;
        }
        this.s.setText(a(com.taobao.android.detail.core.detail.kit.utils.i.a(this.i.f27175a), (this.s.getContext().getApplicationContext().getResources().getDisplayMetrics().density * 24.0f) + 0.5f));
        this.s.setVisibility(0);
    }

    private void f(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("451efa0f", new Object[]{this, eVar});
        } else {
            a(eVar, this.v, this.t);
        }
    }

    private void g(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b22c56e", new Object[]{this, eVar});
        } else {
            a(eVar, this.u);
        }
    }

    private void h(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("512690cd", new Object[]{this, eVar});
        } else if (eVar.h == 6) {
            this.G.setBackgroundColor(-8362292);
        } else if (eVar.h == 2) {
            this.G.setBackgroundResource(R.drawable.jhs_bg_qqjx_detail_price_countdown);
        } else if (eVar.h == 3) {
            this.G.setBackgroundResource(R.drawable.jhs_bg_fcdp_detail_price_countdown);
        } else if (eVar.h == 4) {
            this.G.setBackgroundResource(R.drawable.detail_ladygo_bg);
        } else if (eVar.h == 5) {
            this.G.setBackgroundResource(R.drawable.jhs_bg_jmp_detail_price_countdown);
        } else if (eVar.l) {
            this.G.setBackgroundResource(R.drawable.jhs_bg_meilihui_detail_price_countdown);
        } else {
            this.G.setBackgroundResource(R.drawable.jhs_bg_common_detail_price_countdown);
        }
    }

    private void i(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("572a5c2c", new Object[]{this, eVar});
            return;
        }
        dzi.a(this.h, eVar, "JhsPriceBg");
        dzi.a(this.E, eVar, "JhsPriceCountDownText");
        Object a2 = dzi.a(eVar, "JhsPriceCountDownBg", "backgroundColor");
        if (a2 == null) {
            return;
        }
        int a3 = com.taobao.android.detail.core.utils.c.a(a2.toString());
        this.F.setBgColor(a3);
        Drawable background = this.G.getBackground();
        if (background == null) {
            return;
        }
        background.setColorFilter(a3, PorterDuff.Mode.SRC_IN);
    }

    private void j(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d2e278b", new Object[]{this, eVar});
            return;
        }
        i.b(TAG, "setupCommonPrice");
        a aVar = this.i;
        if (aVar == null || aVar.f27175a == null) {
            this.l.setVisibility(4);
            return;
        }
        String a2 = com.taobao.android.detail.core.detail.kit.utils.i.a(this.i.f27175a);
        int i = (int) (epo.f27511a * 110.0f);
        float f = epo.f27511a * 40.0f;
        this.l.setTextSize(0, f);
        this.l.setText(a(a2, a(this.l, a2, i, f)));
        if (((e) this.c).h == 5 && this.g) {
            this.l.setTextColor(this.f9568a.getResources().getColor(R.color.detail_jhs_jmp_price));
            this.k.setTextColor(this.f9568a.getResources().getColor(R.color.detail_jhs_jmp_price));
        }
        this.l.setVisibility(0);
    }

    private SpannableStringBuilder a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("92879cf1", new Object[]{this, str, new Float(f)});
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (!str.contains(".")) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) f), 0, str.length(), 17);
        } else {
            int i = (int) f;
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i), 0, str.indexOf("."), 17);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((i * 22) / 40), str.indexOf("."), str.length(), 18);
        }
        return spannableStringBuilder;
    }

    public float a(TextView textView, String str, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15c56d33", new Object[]{this, textView, str, new Integer(i), new Float(f)})).floatValue();
        }
        if (textView == null) {
            return f;
        }
        TextPaint paint = textView.getPaint();
        while (paint.measureText(str) > i - 30) {
            paint.setTextSize(paint.getTextSize() - epo.f27511a);
            a(textView, str, i, f);
        }
        return paint.getTextSize() > f ? f : paint.getTextSize();
    }

    private void k(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6331f2ea", new Object[]{this, eVar});
        } else {
            a(eVar, this.n);
        }
    }

    private void a(e eVar, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65aa6790", new Object[]{this, eVar, textView});
            return;
        }
        i.b(TAG, "setSoldCount");
        String r = r(eVar);
        if (StringUtils.isEmpty(r)) {
            textView.setVisibility(8);
        } else {
            boolean z = !this.g ? k.a(eVar.d) > 0 : k.a(eVar.c) > 0;
            if (((e) this.c).h == 5 && this.g) {
                z = false;
            }
            if (z && !eVar.k) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r);
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(14, true), 0, r.length() - 4, 17);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(com.taobao.android.detail.core.utils.c.a("#ffffff")), 0, r.length() - 4, 17);
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(12, true), r.length() - 4, r.length(), 17);
                textView.setText(spannableStringBuilder);
            } else {
                textView.setText(r);
                if (eVar.h == 5 && this.g) {
                    textView.setTextColor(this.f9568a.getResources().getColor(R.color.detail_jhs_jmp_origin_price));
                    textView.setBackgroundResource(R.drawable.detail_jhs_jmp_sold_bg);
                }
            }
        }
        textView.setVisibility(0);
    }

    private void l(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6935be49", new Object[]{this, eVar});
        } else {
            a(eVar, this.o, this.m);
        }
    }

    private void a(e eVar, TextView textView, TextView textView2) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7604a0b4", new Object[]{this, eVar, textView, textView2});
            return;
        }
        i.b(TAG, "setupCommonOriginalPrice");
        if (eVar == null || (aVar = this.i) == null) {
            return;
        }
        if (rjq.a(aVar.d) && rjq.a(this.i.b)) {
            textView.setVisibility(8);
            textView2.setVisibility(8);
            return;
        }
        if (this.i.a()) {
            if (StringUtils.isEmpty(this.i.d)) {
                textView.setText("专柜价");
            } else {
                textView.setText(this.i.d);
            }
            textView.setVisibility(0);
            if (!StringUtils.isEmpty(this.i.c)) {
                textView2.setText("¥" + this.i.c + " ");
                textView2.getPaint().setFlags(16);
            }
        } else {
            textView.setVisibility(8);
            if (!StringUtils.isEmpty(this.i.b)) {
                textView2.setText("¥" + this.i.b + " ");
                textView2.getPaint().setFlags(16);
            }
        }
        if (eVar.h != 5 || !this.g) {
            return;
        }
        textView2.setTextColor(this.f9568a.getResources().getColor(R.color.detail_jhs_jmp_origin_price));
        textView.setTextColor(this.f9568a.getResources().getColor(R.color.detail_jhs_jmp_origin_price));
    }

    private void a(e eVar, boolean z) {
        h.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba74d820", new Object[]{this, eVar, new Boolean(z)});
            return;
        }
        i.b(TAG, "setupCountDown");
        if (eVar == null) {
            return;
        }
        long j = eVar.e;
        long j2 = eVar.f;
        if (j <= 0 || j2 <= 0) {
            View view = this.G;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        if (this.g) {
            a2 = h.b(j2);
        } else {
            a2 = h.a(j);
        }
        i.b(TAG, "diffModel: " + a2.c + "," + a2.b + "," + a2.d + "," + a2.f9551a + "," + a2.e);
        if (eVar.h == 5) {
            this.E.setTextColor(com.taobao.android.detail.core.utils.c.a("#27252b"));
        }
        if (a2.f9551a != null) {
            this.E.setText(a2.f9551a);
            this.E.setVisibility(0);
        } else {
            this.E.setText("");
            this.E.setVisibility(8);
        }
        if (!z && a2.c <= 0 && eVar.h != 6) {
            i.b(TAG, "refesh page");
            p pVar = new p();
            com.taobao.android.detail.core.event.params.d dVar = new com.taobao.android.detail.core.event.params.d();
            if (!this.g) {
                dVar.f9717a = true;
                dVar.b = (short) 1;
                dVar.c = true;
                pVar.c = dVar;
            } else {
                dVar.c = false;
            }
            pVar.c = dVar;
            f.a(this.f9568a, pVar);
        } else if (this.F == null) {
        } else {
            if (a2.b && a2.d > 0) {
                this.F.setVisibility(4);
                this.F.setFutureTime(a2.d + h.a());
                i.b(TAG, "setFutureTime:" + a2.d + h.a());
                this.F.enableSubSecond(true);
                this.F.enableRefreshFilter(3);
                this.F.setTextSize(epo.j);
                if (z) {
                    m(eVar);
                }
                this.F.setTextPadding(2, 2);
                this.F.setDotPadding(1, 1);
                this.F.setOnCompleteListener(new b(this.I));
                this.F.setOnTimeChangeListener(new c(this.I));
                this.F.startTiming();
                this.F.setVisibility(0);
                return;
            }
            this.F.stopTiming();
            this.F.setVisibility(8);
        }
    }

    private void m(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f3989a8", new Object[]{this, eVar});
        } else if (eVar != null) {
            if (eVar.h == 6) {
                this.F.setTextColor(com.taobao.android.detail.core.utils.c.a("#ffffff"), com.taobao.android.detail.core.utils.c.a("#ff7f5fca"));
                this.F.setBgColor(com.taobao.android.detail.core.utils.c.a("#ff7f5fca"));
            } else if (eVar.h == 2) {
                this.F.setTextColor(com.taobao.android.detail.core.utils.c.a("#ffffff"), com.taobao.android.detail.core.utils.c.a("#000000"));
                this.F.setBgColor(com.taobao.android.detail.core.utils.c.a("#ffe857"));
            } else if (eVar.h == 3) {
                this.F.setTextColor(com.taobao.android.detail.core.utils.c.a("#ffffff"), com.taobao.android.detail.core.utils.c.a("#6b4dc0"));
                this.F.setBgColor(com.taobao.android.detail.core.utils.c.a("#a082ff"));
            } else if (eVar.h == 4) {
                this.F.setTextColor(com.taobao.android.detail.core.utils.c.a("#ffffff"), com.taobao.android.detail.core.utils.c.a("#5c3410"));
            } else if (eVar.h == 5) {
                this.F.setTextColor(com.taobao.android.detail.core.utils.c.a("#27252b"), com.taobao.android.detail.core.utils.c.a("#f1ca75"));
                this.F.setBgColor(com.taobao.android.detail.core.utils.c.a("#e3b95f"));
            } else if (eVar.l) {
                this.F.setTextColor(com.taobao.android.detail.core.utils.c.a("#ffffff"), com.taobao.android.detail.core.utils.c.a("#000000"));
                this.F.setBgColor(com.taobao.android.detail.core.utils.c.a("#ffe857"));
            } else {
                this.F.setTextColor(com.taobao.android.detail.core.utils.c.a("#ffffff"), com.taobao.android.detail.core.utils.c.a("#5c3410"));
                this.F.setBgColor(com.taobao.android.detail.core.utils.c.a("#ffe857"));
            }
        } else {
            this.F.setTextColor(com.taobao.android.detail.core.utils.c.a("#ffffff"), com.taobao.android.detail.core.utils.c.a("#5c3410"));
            this.F.setBgColor(com.taobao.android.detail.core.utils.c.a("#ffe857"));
        }
    }

    private a n(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("80e812", new Object[]{this, eVar});
        }
        if (eVar == null) {
            return null;
        }
        a aVar = new a();
        aVar.f27175a = a(eVar.f9768a, eVar.k);
        if (eVar.b != null && !eVar.b.isEmpty()) {
            PriceNode.PriceData priceData = eVar.b.get(0);
            if (priceData.priceTitle != null && priceData.priceTitle.startsWith("专柜价")) {
                aVar.c = priceData.priceText;
                aVar.d = priceData.priceTitle;
            } else {
                aVar.b = priceData.priceText;
            }
        }
        return aVar;
    }

    private static String a(PriceNode.PriceData priceData, boolean z) {
        char charAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("568c1156", new Object[]{priceData, new Boolean(z)});
        }
        if (priceData == null) {
            return null;
        }
        String str = priceData.priceText;
        if (StringUtils.isEmpty(str) || z) {
            return str;
        }
        int i = -1;
        for (int i2 = 0; i2 < str.length() && (((charAt = str.charAt(i2)) >= '0' && charAt <= '9') || charAt == '.'); i2++) {
            i = i2;
        }
        return i == -1 ? str : str.substring(0, i + 1).trim();
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f27175a;
        public String b;
        public String c;
        public String d;

        static {
            kge.a(-1649522491);
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.c != null;
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void G_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e78517f", new Object[]{this});
            return;
        }
        super.G_();
        if (this.F == null) {
            return;
        }
        a((e) this.c, false);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        super.a(z, z2);
        ChronometerView chronometerView = this.F;
        if (chronometerView == null) {
            return;
        }
        chronometerView.stopTiming();
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        ChronometerView chronometerView = this.F;
        if (chronometerView != null) {
            chronometerView.destroy();
        }
        Handler handler = this.I;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    /* loaded from: classes4.dex */
    public static class b implements ChronometerView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<Handler> f27176a;

        static {
            kge.a(-814262650);
            kge.a(-22991975);
        }

        public b(Handler handler) {
            this.f27176a = new WeakReference<>(handler);
        }

        @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.ChronometerView.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            Handler handler = this.f27176a.get();
            if (handler == null) {
                return;
            }
            handler.sendMessageDelayed(handler.obtainMessage(1), 100L);
            i.b(ebm.TAG, "COUNT_DOWNL_COMPLETE");
        }
    }

    /* loaded from: classes4.dex */
    public static class c implements ChronometerView.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<Handler> f27177a;

        static {
            kge.a(904890858);
            kge.a(-488773571);
        }

        public c(Handler handler) {
            this.f27177a = new WeakReference<>(handler);
        }

        @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.ChronometerView.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            Handler handler = this.f27177a.get();
            if (handler == null) {
                return;
            }
            handler.sendMessageDelayed(handler.obtainMessage(2), 100L);
            i.b(ebm.TAG, "COUNT_DOWNL_DAY_CHANGED");
        }
    }

    private boolean o(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7b41206a", new Object[]{this, eVar})).booleanValue() : !p(eVar) || !q(eVar);
    }

    private boolean p(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8144ebc9", new Object[]{this, eVar})).booleanValue();
        }
        float f = epo.f27511a;
        if (eVar.i == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        if (!StringUtils.isEmpty(eVar.i.b)) {
            sb.append(eVar.i.b);
        }
        if (eVar.j != null && !eVar.j.isEmpty()) {
            Iterator<String> it = eVar.j.iterator();
            while (it.hasNext()) {
                sb.append(" ");
                sb.append(it.next());
            }
        }
        return b(sb.toString(), 12.0f * f) + (f * 150.0f) <= ((float) epo.b);
    }

    private boolean q(e eVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8748b728", new Object[]{this, eVar})).booleanValue();
        }
        float f = epo.f27511a;
        a aVar = this.i;
        if (aVar == null) {
            return true;
        }
        String str2 = aVar.f27175a;
        String str3 = "";
        if (this.i.a()) {
            str3 = StringUtils.isEmpty(this.i.d) ? "专柜价" : this.i.d;
            str = "¥" + this.i.c;
        } else {
            str = str3;
        }
        float f2 = 12.0f * f;
        return (((b(str2, 24.0f * f) + b(str3, f2)) + b(str, f2)) + b(r(eVar), 14.0f * f)) + (f * 190.0f) <= ((float) epo.b);
    }

    private float b(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d25309d", new Object[]{this, str, new Float(f)})).floatValue();
        }
        TextPaint paint = new TextView(this.f9568a).getPaint();
        paint.setTextSize(f);
        return paint.measureText(str);
    }

    private String r(e eVar) {
        PriceNode.PriceData priceData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28e8687d", new Object[]{this, eVar});
        }
        if (eVar.h == 6) {
            if (eVar.b == null || eVar.b.isEmpty() || (priceData = eVar.b.get(0)) == null) {
                return null;
            }
            String priceText = priceData.getPriceText();
            if (StringUtils.isEmpty(priceText)) {
                return null;
            }
            return eVar.n + priceText;
        } else if (this.g) {
            if (k.a(eVar.c) <= 0) {
                return "赶快下单";
            }
            return eVar.c + " 件已售";
        } else if (k.a(eVar.d) <= 0) {
            return "即将开团";
        } else {
            return eVar.d + " 人想买";
        }
    }
}

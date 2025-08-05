package tb;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.ext.view.widget.main.PercentageView;
import com.taobao.android.detail.core.detail.kit.view.holder.c;
import com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.ChronometerView;
import com.taobao.android.detail.core.event.basic.p;
import com.taobao.android.detail.datasdk.model.datamodel.node.QiangGouNode;
import com.taobao.android.trade.event.f;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class fbv extends c<fcf> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private ChronometerView k;
    private PercentageView l;
    private TextView m;
    private fcf n;

    static {
        kge.a(-1998518400);
    }

    public static /* synthetic */ Object ipc$super(fbv fbvVar, String str, Object... objArr) {
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

    public static /* synthetic */ Context a(fbv fbvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("6bb48656", new Object[]{fbvVar}) : fbvVar.f9568a;
    }

    public fbv(Context context) {
        super(context);
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.QiangGouPriceViewHolder");
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        RelativeLayout relativeLayout = (RelativeLayout) View.inflate(this.f9568a, R.layout.x_detail_main_qianggou_price, null);
        this.g = (TextView) relativeLayout.findViewById(R.id.tvPrice1);
        this.h = (TextView) relativeLayout.findViewById(R.id.tvPrice2);
        this.i = (TextView) relativeLayout.findViewById(R.id.tvTip);
        this.j = (TextView) relativeLayout.findViewById(R.id.tvPercentage);
        this.l = (PercentageView) relativeLayout.findViewById(R.id.vPercentage);
        this.m = (TextView) relativeLayout.findViewById(R.id.tvN);
        this.k = (ChronometerView) relativeLayout.findViewById(R.id.vTimeCountDown);
        this.k.setTextSize(epo.h);
        return relativeLayout;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a(fcf fcfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e845b2ef", new Object[]{this, fcfVar});
            return;
        }
        this.n = fcfVar;
        if (fcfVar.h == null) {
            this.b.setVisibility(8);
            return;
        }
        a(fcfVar.h);
        this.g.setText(a(fcfVar.f27790a));
        this.h.setText(fcfVar.b);
        this.h.getPaint().setFlags(16);
        this.i.setText(fcfVar.c);
        if (fcfVar.f < 0.0f) {
            this.l.setVisibility(8);
        } else {
            this.l.setVisibility(0);
            this.j.setText(fcfVar.g);
            this.l.setPercentage(fcfVar.f);
        }
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.n.d > 0) {
            this.m.setText(this.n.e);
            this.k.setVisibility(4);
            this.k.setFutureTime(Math.abs(this.n.d));
            this.k.enableSubSecond(true);
            this.k.enableRefreshFilter(3);
            this.k.setTextPadding(1, 1);
            this.k.setDotPadding(1, 1);
            this.k.setOnCompleteListener(new ChronometerView.b() { // from class: tb.fbv.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.ChronometerView.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        f.a(fbv.a(fbv.this), new p());
                    }
                }
            });
            this.k.startTiming();
            this.k.setVisibility(0);
        } else {
            this.m.setVisibility(8);
            this.k.setVisibility(8);
            this.k.stopTiming();
        }
    }

    private void a(QiangGouNode.Status status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13da9b9b", new Object[]{this, status});
            return;
        }
        this.b.setBackgroundColor(com.taobao.android.detail.core.utils.c.a("#f22127"));
        this.k.setBgColor(com.taobao.android.detail.core.utils.c.a("#f22127"));
        this.k.setTextColor(com.taobao.android.detail.core.utils.c.a("#fbf000"), com.taobao.android.detail.core.utils.c.a("#f22127"));
        this.k.setDotColor(com.taobao.android.detail.core.utils.c.a("#fbf000"));
        this.h.setTextColor(com.taobao.android.detail.core.utils.c.a("#ff7e82"));
        this.m.setTextColor(com.taobao.android.detail.core.utils.c.a("#fbf000"));
        this.j.setTextColor(com.taobao.android.detail.core.utils.c.a("#fc353a"));
        this.l.setBackgroundColor(com.taobao.android.detail.core.utils.c.a("#f1c11b"));
        this.l.setFrontgroundColor(com.taobao.android.detail.core.utils.c.a("#fbf000"));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void G_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e78517f", new Object[]{this});
            return;
        }
        super.G_();
        if (this.n == null) {
            return;
        }
        c();
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        super.a(z, z2);
        ChronometerView chronometerView = this.k;
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
        ChronometerView chronometerView = this.k;
        if (chronometerView != null) {
            chronometerView.destroy();
        }
        super.a();
    }

    private SpannableString a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("e4e1c4a6", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return new SpannableString("");
        }
        int i = 42;
        int i2 = 24;
        int indexOf = str.indexOf(".");
        if (str.length() > 6) {
            if (epo.b < 1080) {
                i2 = 16;
                i = 21;
            } else {
                i = 28;
                i2 = 21;
            }
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new AbsoluteSizeSpan(i2, true), 0, 1, 33);
        if (indexOf > 0) {
            spannableString.setSpan(new AbsoluteSizeSpan(i, true), 1, indexOf, 33);
            spannableString.setSpan(new AbsoluteSizeSpan(i2, true), indexOf, str.length(), 33);
        } else {
            spannableString.setSpan(new AbsoluteSizeSpan(i, true), 1, str.length(), 33);
        }
        return spannableString;
    }
}

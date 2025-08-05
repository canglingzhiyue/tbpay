package tb;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.h;
import com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.ChronometerView;
import com.taobao.android.detail.core.event.basic.p;
import com.taobao.android.trade.event.f;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.global.SDKUtils;

/* loaded from: classes5.dex */
public class fbp extends com.taobao.android.detail.core.detail.kit.view.holder.c<fca> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ChronometerView g;
    public ProgressBar h;
    public View i;
    public View j;
    public TextView k;
    public TextView l;
    public TextView m;
    public com.taobao.android.detail.core.detail.kit.utils.a n;
    private ViewGroup o;
    private Handler p;

    /* loaded from: classes5.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public long f27755a;
        public long b;

        static {
            kge.a(-1119192044);
        }
    }

    static {
        kge.a(-2011173252);
    }

    public static /* synthetic */ Object ipc$super(fbp fbpVar, String str, Object... objArr) {
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.wrapper.ext.component.main.viewholder.CtPackTradeViewHolder";
    }

    public static /* synthetic */ Context a(fbp fbpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c6ce5a1c", new Object[]{fbpVar}) : fbpVar.f9568a;
    }

    public static /* synthetic */ void a(fbp fbpVar, fca fcaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85b8104", new Object[]{fbpVar, fcaVar, new Boolean(z)});
        } else {
            fbpVar.a(fcaVar, z);
        }
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.b b(fbp fbpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("6be3a039", new Object[]{fbpVar}) : fbpVar.c;
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.b c(fbp fbpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("a4c400d8", new Object[]{fbpVar}) : fbpVar.c;
    }

    public fbp(Context context) {
        super(context);
        this.p = new Handler() { // from class: tb.fbp.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                } else if (fbp.a(fbp.this) == null) {
                } else {
                    int i = message.what;
                    if (i != 1) {
                        if (i != 2) {
                            return;
                        }
                        fbp fbpVar = fbp.this;
                        fbp.a(fbpVar, (fca) fbp.c(fbpVar), false);
                    } else if (fbp.this.g == null) {
                    } else {
                        fbp.this.g.setVisibility(4);
                        fbp fbpVar2 = fbp.this;
                        fbp.a(fbpVar2, (fca) fbp.b(fbpVar2), false);
                    }
                }
            }
        };
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.CtPackTradeViewHolder");
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        this.o = (ViewGroup) View.inflate(context, R.layout.x_detail_ct_pack_trade_layout, null);
        this.g = (ChronometerView) this.o.findViewById(R.id.count_down_chronometer);
        this.h = (ProgressBar) this.o.findViewById(R.id.progress);
        this.i = this.o.findViewById(R.id.progress_zone);
        this.j = this.o.findViewById(R.id.count_down_zone);
        this.k = (TextView) this.o.findViewById(R.id.progress_text);
        this.l = (TextView) this.o.findViewById(R.id.time_text);
        this.m = (TextView) this.o.findViewById(R.id.time_text_2);
        this.n = new com.taobao.android.detail.core.detail.kit.utils.a();
        this.n.a(this.o);
        return this.o;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a(fca fcaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8436d14", new Object[]{this, fcaVar});
            return;
        }
        this.n.a(fcaVar.f);
        this.n.a(fcaVar.g);
        a(fcaVar, true);
        b(fcaVar);
    }

    private void b(fca fcaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6c67395", new Object[]{this, fcaVar});
        } else if (fcaVar.b > 0) {
            this.i.setVisibility(8);
        } else {
            this.i.setVisibility(0);
            this.k.setText(fcaVar.e);
            this.h.setMax(fcaVar.d);
            this.h.setProgress(fcaVar.c);
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
        if (this.g == null) {
            return;
        }
        a((fca) this.c, false);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        super.a(z, z2);
        ChronometerView chronometerView = this.g;
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
        ChronometerView chronometerView = this.g;
        if (chronometerView != null) {
            chronometerView.destroy();
        }
        Handler handler = this.p;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    private void a(fca fcaVar, boolean z) {
        c a2;
        String string;
        String string2;
        int parseColor;
        String string3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("202ae840", new Object[]{this, fcaVar, new Boolean(z)});
        } else if (fcaVar == null) {
        } else {
            if (fcaVar.b > 0) {
                a2 = a(fcaVar.b);
                string = this.f9568a.getString(R.string.ct_pack_trade_pre_time_text1);
                string2 = this.f9568a.getString(R.string.ct_pack_trade_pre_time_text2);
                this.j.setBackgroundResource(R.drawable.pack_trade_pre_sale_bg);
                parseColor = Color.parseColor("#B6E011");
            } else if (fcaVar.f27778a <= 0) {
                return;
            } else {
                a2 = a(fcaVar.f27778a);
                string = this.f9568a.getString(R.string.ct_pack_trade_time_text1);
                string2 = this.f9568a.getString(R.string.ct_pack_trade_time_text2);
                parseColor = Color.parseColor("#22C836");
            }
            if (a2.f27755a <= 0) {
                if (z) {
                    if (fcaVar.b > 0) {
                        string3 = this.f9568a.getString(R.string.ct_pack_trade_start_text);
                    } else {
                        string3 = this.f9568a.getString(R.string.ct_pack_trade_end_text);
                    }
                    this.l.setText(string3);
                    this.m.setVisibility(8);
                    ChronometerView chronometerView = this.g;
                    if (chronometerView == null) {
                        return;
                    }
                    chronometerView.stopTiming();
                    this.g.setVisibility(8);
                    return;
                }
                c();
            } else if (this.g == null) {
            } else {
                if (a2.b <= 0) {
                    this.g.setFutureTime(a2.f27755a + h.a());
                    this.g.enableSubSecond(false);
                    this.g.setTextSize(epo.j);
                    this.g.setTextColor(Color.parseColor("#47BC77"), Color.parseColor("#ffffff"));
                    this.g.setBgColor(parseColor);
                    this.g.setDotColor(Color.parseColor("#ffffff"));
                    this.g.setTextPadding(2, 0);
                    this.g.setDotPadding(1, 0);
                    this.g.setOnCompleteListener(new a(this.p));
                    this.g.setOnTimeChangeListener(new b(this.p));
                    this.g.startTiming();
                    this.g.setVisibility(0);
                    this.l.setVisibility(0);
                    this.l.setText(string);
                    this.m.setVisibility(0);
                    this.m.setText(string2);
                    return;
                }
                this.l.setText(string + a2.b + "天");
                this.m.setText(string2);
                this.g.stopTiming();
                this.g.setVisibility(8);
            }
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            f.a(this.f9568a, new p());
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements ChronometerView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<Handler> f27753a;

        static {
            kge.a(747893908);
            kge.a(-22991975);
        }

        public a(Handler handler) {
            this.f27753a = new WeakReference<>(handler);
        }

        @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.ChronometerView.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            Handler handler = this.f27753a.get();
            if (handler == null) {
                return;
            }
            handler.sendMessageDelayed(handler.obtainMessage(1), 100L);
        }
    }

    /* loaded from: classes5.dex */
    public static class b implements ChronometerView.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<Handler> f27754a;

        static {
            kge.a(-1101210504);
            kge.a(-488773571);
        }

        public b(Handler handler) {
            this.f27754a = new WeakReference<>(handler);
        }

        @Override // com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer.ChronometerView.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            Handler handler = this.f27754a.get();
            if (handler == null) {
                return;
            }
            handler.sendMessageDelayed(handler.obtainMessage(2), 100L);
        }
    }

    public static c a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("db5fab57", new Object[]{new Long(j)});
        }
        long timeOffset = (SDKUtils.getTimeOffset() * 1000) + System.currentTimeMillis();
        c cVar = new c();
        cVar.f27755a = j - timeOffset;
        if (cVar.f27755a > 0 && cVar.f27755a >= 259200000) {
            cVar.b = cVar.f27755a / 86400000;
        }
        return cVar;
    }
}

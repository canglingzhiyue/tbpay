package com.taobao.android.detail.wrapper.ext.component.bottombar.viewholder;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import mtopsdk.common.util.StringUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.DetailEvent;
import com.taobao.android.detail.core.utils.tstudio.TStudioHelper;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.global.SDKUtils;
import tb.eac;
import tb.eee;
import tb.eef;
import tb.egs;
import tb.egv;
import tb.emu;
import tb.eno;
import tb.epj;
import tb.epo;
import tb.fcu;
import tb.kge;

/* loaded from: classes5.dex */
public class b extends eac<egs> implements j<DetailEvent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView g;
    public TextView h;
    public TextView i;
    public LinearLayout j;
    private int k;
    private int l;
    private Handler m;
    private Runnable n;
    private View.OnClickListener o;
    private View.OnClickListener p;

    static {
        kge.a(2040205667);
        kge.a(-1453870097);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -422543804) {
            super.a((b) ((egv) objArr[0]));
            return null;
        } else if (hashCode != 90991720) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a();
            return null;
        }
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.b a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("74d1b4d9", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ Context b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("4663d07e", new Object[]{bVar}) : bVar.f9568a;
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.b c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("14698617", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.b d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("64356eb6", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.b e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("b4015755", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.b f(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("3cd3ff4", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.b g(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("53992893", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.b h(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("a3651132", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.b i(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("f330f9d1", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ Context j(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("ebe2c86", new Object[]{bVar}) : bVar.f9568a;
    }

    public static /* synthetic */ Context k(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("67c97807", new Object[]{bVar}) : bVar.f9568a;
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(DetailEvent detailEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, detailEvent}) : a(detailEvent);
    }

    public b(Context context) {
        super(context);
        this.o = new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.bottombar.viewholder.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (TStudioHelper.a().a(null, view, b.a(b.this), false)) {
                } else {
                    com.taobao.android.detail.datasdk.protocol.adapter.core.d c = epj.c();
                    if (!c.b()) {
                        c.a(true);
                        return;
                    }
                    b.this.g.setText("已设置提醒");
                    b.this.g.setTextColor(b.b(b.this).getResources().getColor(R.color.detail_bottom_presell_txt_invisable));
                    b.this.j.setClickable(false);
                    if (b.c(b.this) == null) {
                        return;
                    }
                    com.taobao.android.detail.core.event.params.f fVar = new com.taobao.android.detail.core.event.params.f(((egs) b.d(b.this)).n, ((egs) b.e(b.this)).h, ((egs) b.f(b.this)).i, null, ((egs) b.g(b.this)).c, ((egs) b.h(b.this)).d, 0L);
                    ((egs) b.i(b.this)).getClass();
                    fVar.h = 10019;
                    com.taobao.android.trade.event.f.a(b.j(b.this), new eef(fVar));
                }
            }
        };
        this.p = new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.bottombar.viewholder.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    com.taobao.android.trade.event.f.a(b.k(b.this), new fcu());
                }
            }
        };
        emu.a("com.taobao.android.detail.wrapper.ext.component.bottombar.viewholder.BottomBarPresaleViewHolder");
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        LinearLayout linearLayout = (LinearLayout) View.inflate(context, R.layout.x_detail_bottombar_presale, null);
        this.g = (TextView) linearLayout.findViewById(R.id.presell_btn);
        this.i = (TextView) linearLayout.findViewById(R.id.presell_price);
        this.h = (TextView) linearLayout.findViewById(R.id.presell_tips);
        this.j = (LinearLayout) linearLayout.findViewById(R.id.ll_presell_btn);
        return linearLayout;
    }

    @Override // tb.eac
    public void a(egs egsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6cf2127", new Object[]{this, egsVar});
            return;
        }
        super.a((b) egsVar);
        if (egsVar.needOpenGradient) {
            this.k = R.drawable.detail_bottombar_presale_buy_bg;
            this.l = R.drawable.detail_gradient_color_green;
        } else {
            this.k = R.drawable.detail_bottombar_presale_buy_bg_old;
            this.l = R.drawable.detail_bottombar_jhs_common_waiting_bg_old;
        }
        b(egsVar);
        com.taobao.android.trade.event.f.a(this.f9568a, new eee(egsVar));
    }

    private void b(egs egsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d55227a8", new Object[]{this, egsVar});
            return;
        }
        int i = ((egs) this.c).b;
        if (i == 1) {
            com.taobao.android.trade.event.f.a(this.f9568a).a(eno.a(DetailEvent.class), this);
            a(this.l);
            this.g.setText("设置提醒");
            this.j.setClickable(true);
            this.j.setOnClickListener(this.o);
            a(egsVar.e, egsVar.f);
            if (this.m != null) {
                return;
            }
            this.m = new Handler(Looper.getMainLooper());
            long timeOffset = egsVar.c - ((SDKUtils.getTimeOffset() * 1000) + System.currentTimeMillis());
            if (timeOffset <= 0) {
                return;
            }
            this.n = new a(this.f9568a);
            this.m.postDelayed(this.n, timeOffset);
        } else if (i != 2) {
            if (i != 3) {
                return;
            }
            a(this.k);
            this.g.setTextColor(this.f9568a.getResources().getColor(R.color.detail_bottom_presell_txt_invisable));
            this.g.setText("立刻购买");
            if (!StringUtils.isEmpty(egsVar.l)) {
                this.g.setText(egsVar.l);
            }
            this.j.setClickable(false);
            a(egsVar.e, egsVar.f);
        } else {
            a(this.k);
            this.g.setText("立刻购买");
            if (!StringUtils.isEmpty(egsVar.l)) {
                this.g.setText(egsVar.l);
            }
            if (!StringUtils.isEmpty(egsVar.g)) {
                this.i.setText(egsVar.g);
                this.i.setVisibility(0);
            }
            this.j.setClickable(true);
            this.j.setOnClickListener(this.p);
            a(egsVar.e, egsVar.f);
            if (this.m != null) {
                return;
            }
            this.m = new Handler(Looper.getMainLooper());
            long timeOffset2 = egsVar.d - ((SDKUtils.getTimeOffset() * 1000) + System.currentTimeMillis());
            if (timeOffset2 <= 0) {
                return;
            }
            this.n = new a(this.f9568a);
            this.m.postDelayed(this.n, timeOffset2);
        }
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (((egs) this.c).needOpenGradient) {
            this.j.setBackgroundResource(i);
        } else {
            this.g.setBackgroundResource(i);
            this.h.setBackgroundResource(i);
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str) && StringUtils.isEmpty(str2)) {
            this.h.setVisibility(8);
        } else if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            String str3 = str + "\n" + str2;
            SpannableString spannableString = new SpannableString(str3);
            spannableString.setSpan(new AbsoluteSizeSpan(epo.i), 0, str.length(), 33);
            spannableString.setSpan(new AbsoluteSizeSpan(epo.h), str.length() + 1, str3.length(), 33);
            this.h.setText(spannableString);
        } else if (!StringUtils.isEmpty(str) && StringUtils.isEmpty(str2)) {
            this.h.setTextSize(1, 12.0f);
            this.h.setText(str);
        } else if (!StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            this.h.setTextSize(1, 10.0f);
            this.h.setText(str2);
        }
    }

    public i a(DetailEvent detailEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("656af307", new Object[]{this, detailEvent});
        }
        if (detailEvent == null || detailEvent.getParam() == null || this.g == null) {
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
        if (detailEvent.getEventType() != 3) {
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
        if (Boolean.valueOf(detailEvent.getParam().toString()).booleanValue() && ((egs) this.c).b == 1) {
            this.g.setText("已设置提醒");
            this.g.setTextColor(this.f9568a.getResources().getColor(R.color.detail_bottom_presell_txt_invisable));
            this.j.setClickable(false);
        }
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    /* loaded from: classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<Context> f11151a;

        static {
            kge.a(-956796683);
            kge.a(-1390502639);
        }

        public a(Context context) {
            this.f11151a = new WeakReference<>(context);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                if (this.f11151a.get() == null) {
                }
            }
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
        Handler handler = this.m;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }
}

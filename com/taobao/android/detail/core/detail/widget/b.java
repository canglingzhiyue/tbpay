package com.taobao.android.detail.core.detail.widget;

import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.widget.b;
import com.taobao.android.trade.event.f;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.efx;
import tb.emu;
import tb.enp;
import tb.env;
import tb.eny;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MSG_DELAY_DISMISS_WW_TIP = 18941988;

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f9655a;
    private DetailCoreActivity b;
    private Handler c = new Handler(Looper.getMainLooper()) { // from class: com.taobao.android.detail.core.detail.widget.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            if (message.what != 18941988 || b.a(b.this) == null || b.a(b.this).getVisibility() != 0) {
                return;
            }
            efx efxVar = new efx();
            efxVar.f27289a = false;
            f.a(b.b(b.this)).a(efxVar);
            b.c(b.this).setVisibility(8);
        }
    };
    private View d;

    static {
        kge.a(1251502918);
    }

    public static /* synthetic */ FrameLayout a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("800a1a92", new Object[]{bVar}) : bVar.f9655a;
    }

    public static /* synthetic */ DetailCoreActivity b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("9c2d8573", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ View c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("81eb68eb", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ Handler d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("db4ba81c", new Object[]{bVar}) : bVar.c;
    }

    public b(FrameLayout frameLayout, DetailCoreActivity detailCoreActivity) {
        this.f9655a = frameLayout;
        this.b = detailCoreActivity;
        emu.a("com.taobao.android.detail.core.detail.widget.FloatController");
    }

    public void a(int i, int i2, final env envVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf66fe35", new Object[]{this, new Integer(i), new Integer(i2), envVar, str});
            return;
        }
        View view = this.d;
        if (view != null && view.getVisibility() == 0) {
            return;
        }
        View view2 = this.d;
        if (view2 != null && this.f9655a.indexOfChild(view2) != -1) {
            this.f9655a.removeView(this.d);
        }
        if (this.f9655a.getVisibility() == 8) {
            this.f9655a.setVisibility(0);
        }
        enp enpVar = new enp(null);
        enpVar.f27473a = new HashMap<>();
        enpVar.f27473a.put("trackPage", "Page_Detail_Show_Detail");
        enpVar.f27473a.put("spm", "a2141.7631564.4313380");
        f.a(this.b, enpVar);
        this.d = LayoutInflater.from(this.b).inflate(R.layout.x_float_ww_xundan_layout, (ViewGroup) null);
        this.f9655a.addView(this.d, new FrameLayout.LayoutParams(-2, -2));
        this.d.setX(i);
        float f = i2;
        this.d.setY(f);
        TextView textView = (TextView) this.d.findViewById(R.id.ww_xundan_tip_tv);
        View findViewById = this.d.findViewById(R.id.ww_xundan_close);
        textView.setText(str);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.widget.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                    return;
                }
                f.a(b.b(b.this)).a(new eny("Button-", "BarWangWangGuiding", new HashMap<String, String>() { // from class: com.taobao.android.detail.core.detail.widget.FloatController$2$1
                    {
                        b.AnonymousClass2.this = this;
                        put("spm", "a2141.7631564.4313380");
                    }
                }));
                f.a(b.b(b.this)).a(envVar);
                efx efxVar = new efx();
                efxVar.f27289a = false;
                f.a(b.b(b.this)).a(efxVar);
                b.a(b.this).setVisibility(8);
                b.d(b.this).removeMessages(b.MSG_DELAY_DISMISS_WW_TIP);
            }
        });
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.widget.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                    return;
                }
                efx efxVar = new efx();
                efxVar.f27289a = false;
                f.a(b.b(b.this)).a(efxVar);
                b.a(b.this).setVisibility(8);
                b.d(b.this).removeMessages(b.MSG_DELAY_DISMISS_WW_TIP);
            }
        });
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.d, "y", (float) (i2 - 50), f);
        ofFloat.setDuration(500L);
        ofFloat.start();
        efx efxVar = new efx();
        efxVar.f27289a = true;
        f.a(this.b).a(efxVar);
        this.c.sendMessageDelayed(Message.obtain(this.c, (int) MSG_DELAY_DISMISS_WW_TIP), 5000L);
    }
}

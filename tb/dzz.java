package tb;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.base.DetailIconFontTextView;
import com.taobao.android.detail.datasdk.event.params.d;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.taobao.R;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class dzz extends eac<egr> implements View.OnTouchListener, j<efx> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DetailIconFontTextView g;
    private TextView h;
    private String i;
    private d j;
    private ObjectAnimator k;

    static {
        kge.a(1634076224);
        kge.a(-468432129);
        kge.a(-1453870097);
    }

    public static /* synthetic */ Object ipc$super(dzz dzzVar, String str, Object... objArr) {
        if (str.hashCode() == -422543804) {
            super.a((dzz) ((egv) objArr[0]));
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.eac, com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.bottombar.BottomBarIconViewHolder";
    }

    public static /* synthetic */ DetailIconFontTextView a(dzz dzzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailIconFontTextView) ipChange.ipc$dispatch("c50ef", new Object[]{dzzVar}) : dzzVar.g;
    }

    public static /* synthetic */ d a(dzz dzzVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("a6f03402", new Object[]{dzzVar, dVar});
        }
        dzzVar.j = dVar;
        return dVar;
    }

    public static /* synthetic */ d b(dzz dzzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("dc80b96", new Object[]{dzzVar}) : dzzVar.j;
    }

    public static /* synthetic */ String c(dzz dzzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c5edb4aa", new Object[]{dzzVar}) : dzzVar.i;
    }

    public static /* synthetic */ Context d(dzz dzzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("4814332f", new Object[]{dzzVar}) : dzzVar.f9568a;
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(efx efxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, efxVar}) : a(efxVar);
    }

    public dzz(Context context) {
        super(context);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        View b = com.taobao.android.detail.core.async.d.b(context, R.layout.x_detail_bottombar_icon_view);
        this.g = (DetailIconFontTextView) b.findViewById(R.id.iftv_icon);
        this.h = (TextView) b.findViewById(R.id.tv_title);
        b.setOnTouchListener(this);
        return b;
    }

    @Override // tb.eac
    public void a(final egr egrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ceacc8", new Object[]{this, egrVar});
            return;
        }
        super.a((dzz) egrVar);
        if (egrVar == null) {
            return;
        }
        this.b.setEnabled(!egrVar.d);
        this.g.setText(egrVar.f27297a);
        this.g.setContentDescription(egrVar.c);
        this.h.setText(egrVar.c);
        this.h.setContentDescription(egrVar.c);
        if (egrVar.component != null && egrVar.component.mapping != null && !TextUtils.isEmpty(egrVar.component.mapping.getString("wangPromptMsg"))) {
            this.i = egrVar.component.mapping.getString("wangPromptMsg");
            f.a(this.f9568a).a(eno.a(efx.class), this);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: tb.dzz.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int[] iArr = new int[2];
                    dzz.a(dzz.this).getLocationOnScreen(iArr);
                    efw efwVar = new efw();
                    efwVar.f27288a = iArr[0];
                    efwVar.b = iArr[1];
                    if (egrVar.events != null) {
                        Iterator<Event> it = egrVar.events.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Event next = it.next();
                            if (next instanceof env) {
                                dzz.a(dzz.this, ((env) next).f27480a);
                                d dVar = new d(null, null, null);
                                if (dzz.b(dzz.this) != null) {
                                    dVar.f9952a = dzz.b(dzz.this).f9952a;
                                    dVar.b = dzz.b(dzz.this).b;
                                    dVar.d = dzz.b(dzz.this).d;
                                    dVar.c = dzz.b(dzz.this).c;
                                    dVar.e = dzz.c(dzz.this);
                                }
                                efwVar.c = new env(dVar);
                            }
                        }
                    }
                    f.a(dzz.d(dzz.this)).a(efwVar);
                }
            }, 1000L);
        }
        b(egrVar);
    }

    private void b(egr egrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d551b349", new Object[]{this, egrVar});
            return;
        }
        dzi.a(this.b, egrVar, "BtmBarIcon");
        dzi.a(this.g, egrVar, "BtmBarIconIcon");
        dzi.a(this.h, egrVar, "BtmBarIconText");
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.g.setText(((egr) this.c).b);
        } else if (action == 1) {
            this.g.setText(((egr) this.c).f27297a);
        }
        return false;
    }

    public i a(efx efxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("612d21ce", new Object[]{this, efxVar});
        }
        if (efxVar.f27289a) {
            d dVar = this.j;
            if (dVar != null) {
                dVar.e = this.i;
            }
            this.g.setText(((egr) this.c).b);
            this.g.setTextColor(Color.parseColor("#47b3f9"));
            if (this.k == null) {
                this.k = ObjectAnimator.ofFloat(this.g, "translationY", -5.0f, 5.0f, -5.0f, 5.0f, -5.0f, 5.0f, -5.0f, 5.0f, -5.0f, 5.0f, -5.0f, 5.0f, -5.0f, 5.0f, -5.0f, 5.0f, 0.0f);
                this.k.setInterpolator(new LinearInterpolator());
                this.k.setDuration(5000L);
            }
            this.k.start();
        } else {
            d dVar2 = this.j;
            if (dVar2 != null) {
                dVar2.e = null;
            }
            this.g.setText(((egr) this.c).f27297a);
            dzi.a(this.g, this.c, "BtmBarIconIcon");
            ObjectAnimator objectAnimator = this.k;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.g.setTranslationY(0.0f);
            }
        }
        return i.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}

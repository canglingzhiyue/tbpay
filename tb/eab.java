package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.c;
import com.taobao.android.detail.core.event.DetailEvent;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.core.event.params.f;
import com.taobao.android.detail.datasdk.model.viewmodel.main.b;
import com.taobao.android.detail.datasdk.protocol.adapter.core.d;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.android.weex_framework.common.expection.WXExceptionConfig;
import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public class eab extends c<egu> implements j<DetailEvent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TextView g;
    private TextView h;
    private LinearLayout i;
    private View.OnClickListener j;

    static {
        kge.a(714310453);
        kge.a(-1453870097);
    }

    public static /* synthetic */ Object ipc$super(eab eabVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.bottombar.BottomBarWaitForStartViewHolder";
    }

    public static /* synthetic */ Context a(eab eabVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("716362ca", new Object[]{eabVar}) : eabVar.f9568a;
    }

    public static /* synthetic */ TextView b(eab eabVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("de077fc7", new Object[]{eabVar}) : eabVar.g;
    }

    public static /* synthetic */ Context c(eab eabVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("98b309cc", new Object[]{eabVar}) : eabVar.f9568a;
    }

    public static /* synthetic */ b d(eab eabVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("2367a689", new Object[]{eabVar}) : eabVar.c;
    }

    public static /* synthetic */ b e(eab eabVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("5c480728", new Object[]{eabVar}) : eabVar.c;
    }

    public static /* synthetic */ b f(eab eabVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("952867c7", new Object[]{eabVar}) : eabVar.c;
    }

    public static /* synthetic */ b g(eab eabVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("ce08c866", new Object[]{eabVar}) : eabVar.c;
    }

    public static /* synthetic */ b h(eab eabVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("6e92905", new Object[]{eabVar}) : eabVar.c;
    }

    public static /* synthetic */ b i(eab eabVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3fc989a4", new Object[]{eabVar}) : eabVar.c;
    }

    public static /* synthetic */ b j(eab eabVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("78a9ea43", new Object[]{eabVar}) : eabVar.c;
    }

    public static /* synthetic */ Context k(eab eabVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("35f1a5d4", new Object[]{eabVar}) : eabVar.f9568a;
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(DetailEvent detailEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, detailEvent}) : a(detailEvent);
    }

    public eab(Context context) {
        super(context);
        this.j = new View.OnClickListener() { // from class: tb.eab.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                dzh.k(eab.a(eab.this));
                d c = epj.c();
                if (!c.b()) {
                    c.a(true);
                    return;
                }
                eab.b(eab.this).setText("已设置提醒");
                eab.b(eab.this).setTextColor(eab.c(eab.this).getResources().getColor(R.color.detail_bottom_presell_txt_invisable));
                eab.b(eab.this).setClickable(false);
                if (eab.d(eab.this) == null) {
                    return;
                }
                f fVar = new f(((egu) eab.e(eab.this)).n, ((egu) eab.f(eab.this)).e, ((egu) eab.g(eab.this)).f, null, ((egu) eab.h(eab.this)).b, ((egu) eab.i(eab.this)).c, 0L);
                ((egu) eab.j(eab.this)).getClass();
                fVar.h = WXExceptionConfig.EXCEPTION_JS_RUNTIME_ERROR;
                com.taobao.android.trade.event.f.a(eab.k(eab.this), new eef(fVar));
            }
        };
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        this.i = (LinearLayout) com.taobao.android.detail.core.async.d.b(context, R.layout.x_detail_bottombar_waitforstart);
        this.g = (TextView) this.i.findViewById(R.id.remind_btn);
        this.g.setText("设置提醒");
        this.h = (TextView) this.i.findViewById(R.id.tips);
        return this.i;
    }

    public i a(DetailEvent detailEvent) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("656af307", new Object[]{this, detailEvent});
        }
        if (detailEvent == null || detailEvent.getParam() == null) {
            return a.FAILURE;
        }
        if (detailEvent.getEventType() != 3) {
            return a.FAILURE;
        }
        if (Boolean.valueOf(detailEvent.getParam().toString()).booleanValue() && (textView = this.g) != null) {
            textView.setText("已设置提醒");
            this.g.setTextColor(this.f9568a.getResources().getColor(R.color.detail_bottom_presell_txt_invisable));
            this.g.setClickable(false);
        }
        return a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a(egu eguVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6d009e5", new Object[]{this, eguVar});
            return;
        }
        if (eguVar.g) {
            this.h.setVisibility(8);
            a(eguVar.h);
        } else if (!StringUtils.isEmpty(eguVar.d)) {
            this.h.setVisibility(0);
            this.h.setText(eguVar.d);
            this.g.setBackgroundResource(R.drawable.detail_bottombar_jhs_common_waiting_bg_old);
        }
        if (eguVar.needOpenGradient) {
            this.h.setBackgroundResource(0);
            this.g.setBackgroundResource(0);
            this.i.setBackgroundResource(R.drawable.detail_gradient_color_green);
        }
        com.taobao.android.trade.event.f.a(this.f9568a).a(eno.a(DetailEvent.class), this);
        this.g.setOnClickListener(this.j);
        com.taobao.android.trade.event.f.a(this.f9568a, new eee(eguVar));
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            this.g.setBackgroundColor(com.taobao.android.detail.core.utils.c.a(str));
        } catch (Exception e) {
            e.printStackTrace();
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
        com.taobao.android.trade.event.f.a(this.f9568a).b(eno.a(DetailEvent.class), this);
    }
}

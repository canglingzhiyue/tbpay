package tb;

import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.alibaba.android.aura.service.event.AURAEventKey;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.kit.utils.l;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.datasdk.model.datamodel.node.c;
import com.taobao.android.detail.datasdk.model.viewmodel.main.TitleViewModel;
import com.taobao.android.sku.utils.m;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.share.globalmodel.e;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.utils.DisplayUtil;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class efl implements j<efq> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f27273a;
    private PopupWindow b;
    private View c;
    private String d;
    private String e;
    private final int g;
    private final int h;
    private View f = null;
    private long i = 0;

    static {
        kge.a(2129366944);
        kge.a(-1453870097);
    }

    public static /* synthetic */ long a(efl eflVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0fdfd4b", new Object[]{eflVar, new Long(j)})).longValue();
        }
        eflVar.i = j;
        return j;
    }

    public static /* synthetic */ DetailCoreActivity a(efl eflVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("96c23bd8", new Object[]{eflVar}) : eflVar.f27273a;
    }

    public static /* synthetic */ PopupWindow b(efl eflVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("c3f03a66", new Object[]{eflVar}) : eflVar.b;
    }

    public static /* synthetic */ void c(efl eflVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3c3e80f", new Object[]{eflVar});
        } else {
            eflVar.c();
        }
    }

    public static /* synthetic */ void d(efl eflVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b246ee90", new Object[]{eflVar});
        } else {
            eflVar.d();
        }
    }

    public static /* synthetic */ long e(efl eflVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a0c9f505", new Object[]{eflVar})).longValue() : eflVar.i;
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(efq efqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, efqVar}) : a(efqVar);
    }

    public efl(DetailCoreActivity detailCoreActivity) {
        this.f27273a = detailCoreActivity;
        this.g = DisplayUtil.getScreenWidth(this.f27273a);
        this.h = DisplayUtil.getScreenHeight(this.f27273a);
        emu.a("com.taobao.android.detail.core.event.subscriber.title.TitleLongClickSubscriber");
    }

    public i a(efq efqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("d7965947", new Object[]{this, efqVar});
        }
        dya y = this.f27273a.y();
        if (y == null) {
            return a.FAILURE;
        }
        this.f = efqVar.f27283a;
        if (efqVar.d != null) {
            try {
                b(efqVar);
                return a.SUCCESS;
            } catch (Exception e) {
                com.taobao.android.detail.core.utils.i.a("TitleLongClickSubscriber", "showCopuViewV2 error", e);
                return a.FAILURE;
            }
        }
        c cVar = y.t;
        if (cVar == null) {
            return a.FAILURE;
        }
        this.d = StringUtils.isEmpty(efqVar.c) ? eqb.c(cVar.f10055a).title : efqVar.c;
        this.e = StringUtils.isEmpty(efqVar.b) ? cVar.i() : efqVar.b;
        try {
            a();
            return a.SUCCESS;
        } catch (Exception unused) {
            return a.FAILURE;
        }
    }

    private void b(efq efqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5432769", new Object[]{this, efqVar});
            return;
        }
        JSONArray jSONArray = efqVar.d;
        if (jSONArray == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(a(jSONArray.getJSONObject(i)));
        }
        if (this.b == null) {
            a(arrayList);
            this.c.measure(View.MeasureSpec.makeMeasureSpec(this.g, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.h / 3, Integer.MIN_VALUE));
            View view = this.c;
            this.b = new PopupWindow(view, view.getMeasuredWidth(), this.c.getMeasuredHeight());
        }
        if (this.b.isShowing()) {
            this.b.dismiss();
            this.b.setFocusable(false);
            return;
        }
        if (!this.f27273a.isFinishing() && !this.f27273a.Y()) {
            this.b.showAsDropDown(this.f, (this.g - this.b.getWidth()) / 2, -(this.f.getHeight() + this.b.getHeight()));
            this.b.setFocusable(true);
            this.b.update();
        }
        for (efm efmVar : arrayList) {
            if (efmVar.c != null && !efmVar.c.isEmpty()) {
                for (efh efhVar : efmVar.c) {
                    efhVar.a();
                }
            }
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        int i = (int) (epo.f27511a * 170.0f);
        int i2 = (((int) (epo.f27511a * 48.0f)) * 3) + (((int) ((epo.f27511a * 1.0f) + 0.5d)) << 1);
        int i3 = epo.d;
        if (this.b == null) {
            b();
            this.b = new PopupWindow(this.c, i, i2);
            this.b.setBackgroundDrawable(new BitmapDrawable());
        }
        if (this.b.isShowing()) {
            this.b.dismiss();
            this.b.setFocusable(false);
        } else if (this.f27273a.isFinishing() || this.f27273a.Y()) {
        } else {
            this.b.showAsDropDown(this.f, (this.f.getWidth() - i) / 2, i3);
            this.b.setFocusable(true);
            this.b.update();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c = View.inflate(this.f27273a, R.layout.x_detail_main_title_copypopup, null);
        this.c.findViewById(R.id.detail_main_title_copy_title).setOnClickListener(new View.OnClickListener() { // from class: tb.efl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                ecf.c(efl.a(efl.this));
                if (efl.b(efl.this).isShowing()) {
                    efl.b(efl.this).dismiss();
                    efl.b(efl.this).setFocusable(false);
                }
                efl.c(efl.this);
            }
        });
        this.c.findViewById(R.id.detail_main_title_copy_url).setOnClickListener(new View.OnClickListener() { // from class: tb.efl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                ecf.d(efl.a(efl.this));
                if (efl.b(efl.this).isShowing()) {
                    efl.b(efl.this).dismiss();
                    efl.b(efl.this).setFocusable(false);
                }
                efl.d(efl.this);
            }
        });
        this.c.findViewById(R.id.detail_main_title_pop_share).setOnClickListener(new View.OnClickListener() { // from class: tb.efl.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                ecf.e(efl.a(efl.this));
                if (efl.b(efl.this).isShowing()) {
                    efl.b(efl.this).dismiss();
                    efl.b(efl.this).setFocusable(false);
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - efl.e(efl.this) < 500) {
                    efl.a(efl.this, currentTimeMillis);
                    return;
                }
                efl.a(efl.this, currentTimeMillis);
                f.a(efl.a(efl.this), new eoi(TitleViewModel.ShareType.SHARE_TYPE_DEFAULT));
            }
        });
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (StringUtils.isEmpty(this.d)) {
        } else {
            l.a(this.f27273a, this.d);
            epo.a(R.string.clipboard_copied);
            if (!ecu.I) {
                return;
            }
            AlimamaAdvertising.instance().commitCpsInitiativeAction(this.e, "1", "1", null);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (StringUtils.isEmpty(this.e)) {
        } else {
            epr.a(this.f27273a, this.d, e.NAV_URL_DETAIL_BASE + this.e + ".htm?sourceType=item&ttid=" + epo.f());
            if (!ecu.I) {
                return;
            }
            AlimamaAdvertising.instance().commitCpsInitiativeAction(this.e, "1", "2", null);
        }
    }

    private void a(List<efm> list) {
        TextView a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.c = View.inflate(this.f27273a, R.layout.x_detail_main_title_copypopup_new, null);
        LinearLayout linearLayout = (LinearLayout) this.c.findViewById(R.id.ll_tab_container);
        this.c.findViewById(R.id.v_triangle).setBackgroundDrawable(new com.taobao.android.detail.core.detail.widget.a(Color.parseColor("#dd000000")));
        int size = list.size();
        for (int i = 0; i < size; i++) {
            efm efmVar = list.get(i);
            if (efmVar != null && (a2 = a(efmVar)) != null) {
                linearLayout.addView(a2);
                if (i != size - 1) {
                    linearLayout.addView(e());
                }
            }
        }
    }

    private View e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("42261fae", new Object[]{this});
        }
        View view = new View(this.f27273a);
        view.setLayoutParams(new LinearLayout.LayoutParams(1, -1));
        view.setBackgroundColor(-1);
        return view;
    }

    private TextView a(final efm efmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("f1ea73e0", new Object[]{this, efmVar});
        }
        if (efmVar == null || efmVar.f27278a == null) {
            return null;
        }
        TextView textView = new TextView(this.f27273a);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        int a2 = m.a(this.f27273a, 15.0f);
        int a3 = m.a(this.f27273a, 8.0f);
        textView.setPadding(a2, a3, a2, a3);
        textView.setText(efmVar.f27278a);
        textView.setOnClickListener(new View.OnClickListener() { // from class: tb.efl.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (efmVar.b == null) {
                    efl.b(efl.this).dismiss();
                } else {
                    for (efh efhVar : efmVar.b) {
                        efhVar.a();
                    }
                    efl.b(efl.this).dismiss();
                }
            }
        });
        return textView;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    private efm a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (efm) ipChange.ipc$dispatch("29004792", new Object[]{this, jSONObject});
        }
        efm efmVar = new efm();
        efmVar.f27278a = jSONObject.getString("actionTitle");
        efmVar.d = jSONObject.getString("actionType");
        efmVar.e = jSONObject.getString("itemId");
        efmVar.b = a(efmVar.d, efmVar.e, jSONObject.getJSONObject("events").getJSONArray("clickMenu"));
        efmVar.c = a(jSONObject.getJSONArray(AURAEventKey.exposureItem));
        return efmVar;
    }

    private List<efh> a(String str, String str2, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("94bcbf23", new Object[]{this, str, str2, jSONArray});
        }
        int size = jSONArray.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            efh a2 = a(str, str2, (JSONObject) jSONArray.get(i));
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    private List<efh> a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c9355ab7", new Object[]{this, jSONArray});
        }
        if (jSONArray == null) {
            return null;
        }
        int size = jSONArray.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            arrayList.add(new efj(this.f27273a, (JSONObject) jSONArray.get(i)));
        }
        return arrayList;
    }

    private efh a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (efh) ipChange.ipc$dispatch("b7d9c40b", new Object[]{this, str, str2, jSONObject});
        }
        String string = jSONObject.getString("type");
        char c = 65535;
        switch (string.hashCode()) {
            case -1263203643:
                if (string.equals("openUrl")) {
                    c = 2;
                    break;
                }
                break;
            case 109400031:
                if (string.equals("share")) {
                    c = 0;
                    break;
                }
                break;
            case 328712004:
                if (string.equals("copyContent")) {
                    c = 1;
                    break;
                }
                break;
            case 329301056:
                if (string.equals("userTrack")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            return new mqz(this.f27273a);
        }
        if (c == 1) {
            return new efi(this.f27273a, jSONObject.getJSONObject("fields").getString("content"), str, str2);
        }
        if (c == 2) {
            return new efk(this.f27273a, jSONObject.getJSONObject("fields").getString("url"));
        }
        if (c == 3) {
            return new efn(this.f27273a, jSONObject.getJSONObject("fields"));
        }
        return null;
    }
}

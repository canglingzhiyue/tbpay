package tb;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.android.ultron.vfw.weex2.b;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.order.core.dinamicX.parser.l;
import com.taobao.android.order.core.dinamicX.view.g;
import com.taobao.android.order.core.ui.viewpager.SimpleViewpager;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.hxg;
import tb.hzp;
import tb.hzr;
import tb.xpk;

/* loaded from: classes6.dex */
public class hzf extends hzp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f28848a;
    private final List<View> h = new ArrayList();
    private PagerAdapter j;
    private l o_;
    private ViewPager s_;

    /* loaded from: classes6.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(664613618);
    }

    public static /* synthetic */ Object ipc$super(hzf hzfVar, String str, Object... objArr) {
        if (str.hashCode() == -1642240928) {
            super.a((Context) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ l a(hzf hzfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("93d1160f", new Object[]{hzfVar}) : hzfVar.o_;
    }

    public static /* synthetic */ void a(hzf hzfVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f2a2c9", new Object[]{hzfVar, new Integer(i), str});
        } else {
            hzfVar.a(i, str);
        }
    }

    public static /* synthetic */ OrderConfigs b(hzf hzfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OrderConfigs) ipChange.ipc$dispatch("7485e3e1", new Object[]{hzfVar}) : hzfVar.b;
    }

    public static /* synthetic */ OrderConfigs c(hzf hzfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OrderConfigs) ipChange.ipc$dispatch("75bc36c0", new Object[]{hzfVar}) : hzfVar.b;
    }

    public static /* synthetic */ d d(hzf hzfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("2d245eac", new Object[]{hzfVar}) : hzfVar.f;
    }

    public static /* synthetic */ d e(hzf hzfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("5678b3ed", new Object[]{hzfVar}) : hzfVar.f;
    }

    public static /* synthetic */ d f(hzf hzfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("7fcd092e", new Object[]{hzfVar}) : hzfVar.f;
    }

    public hzf(OrderConfigs orderConfigs) {
        this.b = orderConfigs;
    }

    @Override // tb.hzp, tb.hzc
    public void a(Context context) {
        boolean c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        super.a(context);
        if (this.b == null || this.b.c() == null || this.b.d() == null) {
            return;
        }
        this.o_ = new l(this.b.f());
        this.f28848a = this.o_.b();
        this.o = this.o_.b(this.f28848a);
        a((Long) 7700670404894374791L, (DXWidgetNode) new g());
        a(Long.valueOf((long) l.DX_PARSER_TABINFO), this.o_);
        a("tabChangeV2", new iaq(this));
        a(hzr.ULTRONSEARCHTABCLICKV2, new hzr.a(this));
        a(hxg.ORDERIMAGELOADCOMPLETE, new hxg.a(this.b.q()));
        if (spk.a("babelorder", "tbTradeJSTrackerReportRegister", true)) {
            a(Long.toString(xpk.TBTRADEJSTRACKERREPORT), new xpk.a());
        }
        if (this.b.f().size() > 0) {
            c = g();
        } else {
            c = c(this.g);
        }
        if (!c) {
            jqg.b("OrderList createContainerView", "createContainerView failed");
        } else if (!this.b.c().containsKey(OrderConfigs.VIEWPAGER)) {
        } else {
            this.s_ = (SimpleViewpager) this.b.c().get(OrderConfigs.VIEWPAGER);
            this.j = new com.taobao.android.order.core.ui.viewpager.a(context, this.h);
            this.s_.setOffscreenPageLimit(0);
            this.s_.setAdapter(this.j);
            this.s_.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: tb.hzf.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                public void onPageScrolled(int i, float f, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                    }
                }

                @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                public void onPageSelected(int i) {
                    bny q;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                        return;
                    }
                    hzf.this.e = System.currentTimeMillis();
                    if (hzf.this.f28848a == i) {
                        return;
                    }
                    hzf hzfVar = hzf.this;
                    hzfVar.f28848a = Integer.MIN_VALUE;
                    hzf.a(hzfVar, i, hzf.a(hzfVar).b(i));
                    if (!ibl.u() || (q = hzf.this.d().q()) == null) {
                        return;
                    }
                    q.b();
                }

                @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                    } else {
                        hzf.b(hzf.this).d();
                    }
                }
            });
            this.s_.setCurrentItem(this.f28848a);
            a(this.h.get(this.f28848a));
        }
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        for (int i = 0; i < this.b.f().size(); i++) {
            if (this.f28848a == i) {
                if (!c(this.g)) {
                    return false;
                }
            } else {
                View view = new View(this.g);
                view.setTag(R.id.orderListTabPlaceholder, true);
                this.h.add(view);
            }
        }
        return true;
    }

    private boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{this, context})).booleanValue();
        }
        View a2 = this.b.d().a(context);
        if (a2 == null) {
            iaa.b(context, "UltronListProxy", "VIEW_NULL", "外部没有实现容器的view", null);
            return false;
        }
        this.h.add(a2);
        return true;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        l lVar = this.o_;
        if (lVar == null) {
            return;
        }
        int a2 = lVar.a(str);
        if (a2 < 0 || a2 >= this.o_.a()) {
            iaa.b(null, "UltronListProxy", "VIEW_NULL", "外部没有实现容器的view", null);
        } else if (this.s_ == null || b(a2) == null) {
        } else {
            this.s_.setCurrentItem(a2);
        }
    }

    private void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        this.o = str;
        l lVar = this.o_;
        if (lVar == null || i < 0 || i >= lVar.a()) {
            HashMap hashMap = new HashMap();
            hashMap.put("position", i + "");
            hashMap.put("tabCode", str);
            l lVar2 = this.o_;
            if (lVar2 != null) {
                hashMap.put("defaultTabInfo", lVar2.c().toJSONString());
            }
            iaa.b(null, "UltronListProxy", "position_error", "", null);
            return;
        }
        View b = b(i);
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if (i2 == i) {
                this.h.get(i2).setVisibility(0);
            } else {
                this.h.get(i2).setVisibility(8);
            }
        }
        a(b);
        this.o_.a(i);
        this.b.a(this.o_.c());
        d().b(1);
        this.b.d().a(b, i, str);
    }

    private View b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("42ac29fc", new Object[]{this, new Integer(i)});
        }
        View view = this.h.get(i);
        if (view == null) {
            return null;
        }
        Object tag = view.getTag(R.id.orderListTabPlaceholder);
        if (tag == null || !((Boolean) tag).booleanValue()) {
            return view;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        View a2 = this.b.d().a(this.g);
        this.h.set(i, a2);
        ((com.taobao.android.order.core.ui.viewpager.a) this.j).a(i, a2);
        return a2;
    }

    @Override // tb.hzp
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (this.h.isEmpty() || jSONObject == null || this.b.d() == null) {
        } else {
            String string = jSONObject.getString("notReload");
            this.b.d().a(jSONObject);
            if ("true".equals(string)) {
                return;
            }
            ViewPager viewPager = this.s_;
            if (viewPager != null) {
                i = viewPager.getCurrentItem();
            }
            if (i < 0 || i >= this.h.size()) {
                bkd.a("UltronListProxy", "refreshWithParams", "POSITION_ILLEGAL");
                return;
            }
            View view = this.h.get(i);
            a(view);
            this.b.d().b(view, i, null);
        }
    }

    private void a(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null || this.b.d() == null) {
        } else {
            RecyclerView b = this.b.d().b(view);
            if (b != null) {
                this.b.a((View) b);
            }
            LinearLayout c = this.b.d().c(view);
            if (c != null) {
                this.b.b((ViewGroup) c);
            }
            LinearLayout d = this.b.d().d(view);
            if (d != null) {
                this.b.a((ViewGroup) d);
            }
            ViewGroup e = this.b.d().e(view);
            if (e != null) {
                this.b.c(e);
                d().a(new b() { // from class: tb.hzf.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alibaba.android.ultron.vfw.weex2.b
                    public void a(ArrayList<MotionEvent> arrayList) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
                            return;
                        }
                        Iterator<MotionEvent> it = arrayList.iterator();
                        while (it.hasNext()) {
                            hzf.c(hzf.this).d().a(view).dispatchTouchEvent(it.next());
                        }
                    }
                });
            }
            f();
            a(this.b.c());
            a("receiveMsgV2", new iao());
        }
    }

    public void a(JSONObject jSONObject, boolean z, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d3986cb", new Object[]{this, jSONObject, new Boolean(z), aVar});
        } else if (this.f == null) {
        } else {
            try {
                this.d = this.b.p();
                this.f.a(jSONObject);
                this.f.a(new bor(new hzp.a(this.b)));
                Runnable runnable = new Runnable() { // from class: tb.hzf.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        d f;
                        IpChange ipChange2 = $ipChange;
                        int i = 1;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        brx brxVar = new brx();
                        brxVar.e(bxd.a("skipDownloadTemplates", false));
                        if (bxd.a("enableRebuildBodyFirst", false)) {
                            hzf.d(hzf.this).a(126, brxVar);
                            f = hzf.e(hzf.this);
                        } else {
                            f = hzf.f(hzf.this);
                            i = 127;
                        }
                        f.a(i, brxVar);
                        a aVar2 = aVar;
                        if (aVar2 == null) {
                            return;
                        }
                        aVar2.a();
                    }
                };
                if (z) {
                    jqh.a(runnable, 0L);
                } else {
                    runnable.run();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.b.a(false);
        }
    }

    @Override // tb.hzp
    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        boolean equals = "1".equals(e().l().get("page"));
        String str = e().l().get("condition");
        boolean z = !equals || (str != null && str.contains(CoreConstants.BATCH_CONFIRM_GOOD_ONLINE_ORDER_IDS));
        int i = 127;
        if (this.b.j() && this.b.l()) {
            this.b.a(false);
            i = 125;
            if (!spk.a(iro.ORANGE_KEY_MY_TAOBAO, "enableAdvanceLoadRefund", true)) {
                this.b.k();
            }
        } else if (z) {
            d().q().f(bxd.a("isRangeInsert", false));
            i = bxd.a("enableRebuildFoot", false) ? 6 : 2;
        }
        if (this.d && bxd.a("rebuildBodyOnlyWhenUseCache", false)) {
            i--;
        }
        this.d = false;
        d().a(i);
    }

    public long h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e3", new Object[]{this})).longValue() : this.e;
    }
}

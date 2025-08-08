package tb;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.base.uikit.TIconFontTextView;
import com.taobao.android.detail.datasdk.model.datamodel.node.VerticalNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.c;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.detail.wrapper.ext.component.actionbar.b;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.tao.adapter.biz.taomoment.DetailTaoMomentViewService;
import java.util.Map;

/* loaded from: classes5.dex */
public class feu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ JSONObject a(Context context, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("a05f9b92", new Object[]{context, view}) : b(context, view);
    }

    public static /* synthetic */ JSONObject a(DetailActivity detailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("c6cb2a0", new Object[]{detailActivity}) : b(detailActivity);
    }

    public static /* synthetic */ void a(Context context, Map map, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6251a98d", new Object[]{context, map, view});
        } else {
            b(context, map, view);
        }
    }

    static {
        kge.a(-1956447308);
        emu.a("com.taobao.android.detail.wrapper.ext.taomoments.TaoMomentsFacade");
    }

    public static b.C0438b a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b.C0438b) ipChange.ipc$dispatch("3ac0f2b", new Object[]{cVar});
        }
        JSONObject b = b(cVar);
        if (b != null) {
            return a(b);
        }
        return null;
    }

    public static View a(final Context context, final Map<String, String> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("13fa6140", new Object[]{context, map, new Integer(i)});
        }
        if (ecu.Z && (context instanceof DetailActivity)) {
            return new DetailTaoMomentViewService().a((DetailActivity) context, a(context), i, new DetailTaoMomentViewService.a() { // from class: tb.feu.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.adapter.biz.taomoment.DetailTaoMomentViewService.a
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                        return;
                    }
                    map.put("is_redpoint", "1");
                    feu.a(context, map, view);
                }
            });
        }
        return null;
    }

    private static void b(Context context, Map<String, String> map, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0b2ad6c", new Object[]{context, map, view});
            return;
        }
        eps.a(context, "taomoments-click", map);
        Activity a2 = com.taobao.prefork.a.a(context);
        if (!(a2 instanceof DetailActivity)) {
            return;
        }
        DetailActivity detailActivity = (DetailActivity) a2;
        com.taobao.android.detail.wrapper.ext.floatview.c ad = detailActivity.ad();
        if (ad != null) {
            ad.b("naviBarRightCustom", b(a2, view), b(detailActivity));
        }
        eps.a(context, "Page_Detail", 2201, "Page_Detail_Button-taomoments-click", null, null, ect.a(map));
    }

    public static View a(final Context context, final View view, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c5b19a55", new Object[]{context, view, map});
        }
        if (view instanceof TIconFontTextView) {
            map.put("is_redpoint", "0");
            view.setOnClickListener(new View.OnClickListener() { // from class: tb.feu.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    } else {
                        feu.a(context, map, view);
                    }
                }
            });
        } else {
            map.put("is_redpoint", "1");
        }
        if (ecu.a("Page_Detail_Button-taomoments-show")) {
            eps.a(context, "Page_Detail", 2201, "Page_Detail_Button-taomoments-show", null, null, ect.a(map));
        }
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: tb.feu.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                DetailActivity detailActivity;
                com.taobao.android.detail.wrapper.ext.floatview.c ad;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
                }
                Activity a2 = com.taobao.prefork.a.a(context);
                if ((a2 instanceof DetailActivity) && (ad = (detailActivity = (DetailActivity) a2).ad()) != null) {
                    ad.a("naviBarRightCustom", feu.a(a2, view), feu.a(detailActivity));
                }
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        });
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: tb.feu.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(final View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3d337638", new Object[]{this, view2});
                } else {
                    f.a(view2.getContext()).a(eno.a(a.class), new j<a>() { // from class: tb.feu.4.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.trade.event.j
                        public /* synthetic */ i handleEvent(a aVar) {
                            IpChange ipChange3 = $ipChange;
                            return ipChange3 instanceof IpChange ? (i) ipChange3.ipc$dispatch("caa7474e", new Object[]{this, aVar}) : a(aVar);
                        }

                        public i a(a aVar) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                return (i) ipChange3.ipc$dispatch("1127a2aa", new Object[]{this, aVar});
                            }
                            if (aVar.f27871a) {
                                view2.setVisibility(0);
                            } else {
                                view2.setVisibility(8);
                            }
                            return i.SUCCESS;
                        }

                        @Override // com.taobao.android.trade.event.j
                        public ThreadMode getThreadMode() {
                            IpChange ipChange3 = $ipChange;
                            return ipChange3 instanceof IpChange ? (ThreadMode) ipChange3.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
                        }
                    });
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7f64d55b", new Object[]{this, view2});
                } else {
                    f.a(view2.getContext()).a(eno.a(a.class));
                }
            }
        });
        return view;
    }

    /* loaded from: classes5.dex */
    public static class a extends enn {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f27871a;

        static {
            kge.a(208105180);
        }

        @Override // com.taobao.android.trade.event.Event
        public Object getParam() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
            }
            return null;
        }

        public a(boolean z) {
            this.f27871a = z;
        }
    }

    private static JSONObject b(DetailActivity detailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ecee7a7f", new Object[]{detailActivity});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject a2 = a((Context) detailActivity);
        if (a2 != null) {
            jSONObject.putAll(a2);
        }
        c C = detailActivity.C();
        if (C != null) {
            jSONObject.put("itemId", (Object) C.i());
        }
        return jSONObject;
    }

    private static JSONObject b(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("80d8f193", new Object[]{context, view});
        }
        int left = view.getLeft() + (view.getWidth() / 2);
        int bottom = view.getBottom();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x", (Object) Integer.valueOf(left));
        jSONObject.put("y", (Object) Integer.valueOf(bottom + ecr.b(context)));
        return jSONObject;
    }

    private static b.C0438b a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.C0438b) ipChange.ipc$dispatch("8f835912", new Object[]{jSONObject}) : new b.C0438b(3, "empty", "\uf83a");
    }

    public static void a(c cVar, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ec89", new Object[]{cVar, jSONArray});
            return;
        }
        JSONObject b = b(cVar);
        if (b == null) {
            return;
        }
        String string = b.getString("tipUrl");
        if (StringUtils.isEmpty(string)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) string);
        jSONArray.add(jSONObject);
    }

    public static JSONObject a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("58b28f80", new Object[]{context});
        }
        Activity a2 = com.taobao.prefork.a.a(context);
        if (!(a2 instanceof DetailActivity)) {
            return null;
        }
        return b(((DetailActivity) a2).C());
    }

    private static JSONObject b(c cVar) {
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar;
        VerticalNode g;
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f66cfec2", new Object[]{cVar});
        }
        if (cVar != null && (bVar = cVar.f10055a) != null && (g = eqb.g(bVar)) != null && (data = g.getData()) != null) {
            return data.getJSONObject("taoMoments");
        }
        return null;
    }
}

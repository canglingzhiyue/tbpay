package com.taobao.tao.topmultitab.view;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.j;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.ask.ASK_CONST;
import com.taobao.homepage.utils.n;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.topmultitab.c;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.ksr;
import tb.lap;
import tb.lbo;
import tb.lbq;
import tb.ohv;
import tb.oiy;
import tb.ovr;

/* loaded from: classes8.dex */
public class a extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ViewPager e;

    /* renamed from: a  reason: collision with root package name */
    public List<JSONObject> f21157a = new ArrayList();
    public String b = "home";
    private Map<String, View> c = new HashMap();
    private LinkedList<Integer> d = new LinkedList<>();
    private final List<String> f = new LinkedList();
    private List<String> g = new LinkedList();

    static {
        kge.a(-1480068196);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : view == obj;
    }

    public a(ViewPager viewPager) {
        this.e = viewPager;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<JSONObject> list = this.f21157a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
        } else if (!(obj instanceof View)) {
        } else {
            a(viewGroup, (View) obj);
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        com.taobao.tao.linklog.a.a("componentRender", "HomeViewPagerAdapter", "instantiateItem postion=" + i);
        String a2 = a(this.f21157a.get(i));
        e.e("HomeViewPagerAdapter", "instantiateItem : " + i + ", type : " + a2);
        View view = this.c.get(a2);
        if (view == null) {
            view = a(a(viewGroup), a2);
            if (view != null && view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            view.setTag(a2);
            this.c.put(a2, view);
        }
        View view2 = view;
        int intValue = this.d.size() > 0 ? this.d.get(0).intValue() : -1;
        int intValue2 = this.d.size() > 1 ? this.d.get(1).intValue() : -1;
        if (i < intValue) {
            this.d.add(0, Integer.valueOf(i));
        } else if (i > intValue && i < intValue2) {
            this.d.add(1, Integer.valueOf(i));
            i2 = 1;
        } else {
            this.d.add(Integer.valueOf(i));
            i2 = -1;
        }
        if (view2.getParent() != null) {
            try {
                ((ViewGroup) view2.getParent()).removeView(view2);
            } catch (Exception e) {
                String message = e.getMessage();
                ksr.b("HomeViewPagerAdapter", "2.0", "instantiateItem", " remove exception:" + message, "", "");
                lap.a("topMultiTab", "HomeViewPageAdapter", "HomeViewPagerAdapter.instantiateItem removeView exception: " + message);
            }
        }
        a(view2, a2);
        if (n.p() && (view2 instanceof WrapFrameLayout) && i == this.e.getCurrentItem()) {
            ((WrapFrameLayout) view2).addTabView();
        }
        try {
            viewGroup.addView(view2, i2);
        } catch (Exception e2) {
            String message2 = e2.getMessage();
            ksr.b("HomeViewPagerAdapter", "2.0", "instantiateItem", " addView exception:" + message2, "", "");
            lap.a("topMultiTab", "HomeViewPageAdapter", "HomeViewPagerAdapter.instantiateItem addView exception: " + message2);
        }
        return view2;
    }

    public void a(int i) {
        List<JSONObject> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (!n.p() || (list = this.f21157a) == null) {
        } else {
            if (i >= list.size() || i < 0) {
                e.e("HomeViewPagerAdapter", "tabItems size: " + this.f21157a.size() + "pos: " + i);
                return;
            }
            View view = this.c.get(a(this.f21157a.get(i)));
            if (!(view instanceof WrapFrameLayout)) {
                return;
            }
            e.e("HomeViewPagerAdapter", "创建视图 pos: " + i);
            ((WrapFrameLayout) view).addTabView();
        }
    }

    public String b(int i) {
        List<JSONObject> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da9643a6", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && (list = this.f21157a) != null && i < list.size()) {
            return a(this.f21157a.get(i));
        }
        return null;
    }

    public static String a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject});
        }
        if (jSONObject != null && !jSONObject.isEmpty() && (jSONObject2 = jSONObject.getJSONObject("content")) != null) {
            return ovr.a(jSONObject2.getString("type"), jSONObject2);
        }
        return null;
    }

    @Deprecated
    public static String b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{jSONObject});
        }
        if (jSONObject != null && !jSONObject.isEmpty() && (jSONObject2 = jSONObject.getJSONObject("content")) != null) {
            return jSONObject2.getString("type");
        }
        return null;
    }

    private View a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f74757ec", new Object[]{this, context, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        if (n.p()) {
            WrapFrameLayout wrapFrameLayout = new WrapFrameLayout(context);
            wrapFrameLayout.setType(str);
            wrapFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return wrapFrameLayout;
        }
        return c.a().b(str).createView(context);
    }

    public List<JSONObject> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f21157a;
    }

    public List<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        List<JSONObject> a2 = a();
        if (a2 == null || a2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (JSONObject jSONObject : a2) {
            String a3 = a(jSONObject);
            if (!StringUtils.isEmpty(a3)) {
                arrayList.add(a3);
            }
        }
        return arrayList;
    }

    public synchronized void a(List<JSONObject> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a0b49b", new Object[]{this, list, new Boolean(z)});
        } else if (list != null) {
            b(list);
            HashMap hashMap = new HashMap();
            for (int i = 0; i < list.size(); i++) {
                JSONObject jSONObject = list.get(i);
                JSONObject jSONObject2 = jSONObject.getJSONObject("content");
                if (jSONObject2 != null) {
                    String a2 = a(jSONObject);
                    View view = this.c.get(a2);
                    if (view != null) {
                        hashMap.put(a2, view);
                    }
                    if (jSONObject2.getBooleanValue(ASK_CONST.KEY_IS_IMMERSIVE)) {
                        this.g.add(a2);
                    }
                    if (jSONObject2.getBooleanValue("isDefault")) {
                        this.b = a2;
                    }
                    if (!j.a("fixViewPagerAdapter", true)) {
                        this.c = hashMap;
                    }
                    e.b("HomeViewPagerAdapter", "updateTabContainerData defaultPage : " + this.b);
                }
            }
            if (j.a("fixViewPagerAdapter", true)) {
                this.c = hashMap;
                if (z) {
                    this.c.remove("campaign");
                }
            }
            e.b("HomeViewPagerAdapter", "defaultPage : " + this.b);
            notifyDataSetChanged();
        }
    }

    public void b(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else {
            this.f21157a = list;
        }
    }

    public IHomeSubTabController c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("270d6cfb", new Object[]{this});
        }
        ViewPager viewPager = this.e;
        if (viewPager != null) {
            return c(viewPager.getCurrentItem());
        }
        return null;
    }

    public IHomeSubTabController c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("298e9daa", new Object[]{this, new Integer(i)});
        }
        List<JSONObject> list = this.f21157a;
        if (list == null || i >= list.size() || i < 0) {
            return null;
        }
        String a2 = a(this.f21157a.get(i));
        if (!StringUtils.isEmpty(a2)) {
            return c.a().b(a2);
        }
        return null;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        int count = getCount();
        if (count <= 0) {
            return;
        }
        for (int i = 0; i < count; i++) {
            IHomeSubTabController c = c(i);
            if (c != null) {
                c.onDestroy();
            }
        }
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else {
            a(a(jSONObject));
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        int b = b(str);
        e.e("HomeViewPagerAdapter", "setCurrentItem=" + str + ", pos=" + b);
        if (b == -1) {
            return;
        }
        this.e.setCurrentItem(b, false);
    }

    public int b(String str) {
        List<JSONObject> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, str})).intValue();
        }
        if (str != null && (list = this.f21157a) != null && !list.isEmpty()) {
            for (int i = 0; i < this.f21157a.size(); i++) {
                JSONObject jSONObject = this.f21157a.get(i).getJSONObject("content");
                if (jSONObject != null) {
                    String a2 = ovr.a(jSONObject.getString("type"), jSONObject);
                    if (str.equals(jSONObject.getString("type")) || str.equals(a2)) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str}) : d(b(str));
    }

    public String d(int i) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ef97628", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= this.f21157a.size() || (jSONObject = this.f21157a.get(i)) == null || jSONObject.getJSONObject("content") == null) {
            return "";
        }
        String string = jSONObject.getJSONObject("content").getString("title");
        return StringUtils.isEmpty(string) ? "" : string;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.f21157a.clear();
        this.c.clear();
        this.d.clear();
        this.f.clear();
        this.b = "home";
        e.e("HomeViewPagerAdapter", DMComponent.RESET);
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (!this.c.containsKey(str)) {
        } else {
            this.c.remove(str);
            this.f.add(str);
            e.e("HomeViewPagerAdapter", "reRenderItem： " + str);
            notifyDataSetChanged();
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getItemPosition(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue() : ((obj instanceof View) && !this.c.containsKey((String) ((View) obj).getTag())) ? -2 : -1;
    }

    private Context a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("52552462", new Object[]{this, view});
        }
        Context context = TBMainHost.a().getContext();
        e.e("HomeViewPagerAdapter", "getContext: " + context);
        if (context != null) {
            return context;
        }
        Activity h = h();
        e.e("HomeViewPagerAdapter", "getActivity: " + h);
        if (h != null) {
            return h;
        }
        Context context2 = view.getContext();
        e.e("HomeViewPagerAdapter", "getViewContainer: " + context2);
        return context2;
    }

    private void a(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c0c6b4", new Object[]{this, view, str});
        } else if (e(str)) {
            view.setPadding(0, 0, 0, 0);
        } else {
            e.e("HomeViewPagerAdapter", "tabViewPaddingProcess,type: " + str);
            b(view);
        }
    }

    private ohv g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ohv) ipChange.ipc$dispatch("3d328f3b", new Object[]{this});
        }
        lbq b = oiy.a().b();
        if (b == null) {
            e.e("HomeViewPagerAdapter", "setPadding pageProvider == null");
            return null;
        }
        lbo homePageManager = b.getHomePageManager();
        if (homePageManager == null) {
            e.e("HomeViewPagerAdapter", "setPadding homePageManager == null");
            return null;
        }
        return homePageManager.e();
    }

    private Activity h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("2e540519", new Object[]{this});
        }
        lbq b = oiy.a().b();
        if (b == null) {
            e.e("HomeViewPagerAdapter", "getActivity pageProvider == null");
            return null;
        }
        return b.getCurActivity();
    }

    public void f() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.f21157a.size(); i++) {
            String a2 = a(this.f21157a.get(i));
            if (a2 != null && (view = this.c.get(a2)) != null) {
                a(view, a2);
            }
        }
    }

    private void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        ohv g = g();
        if (g == null) {
            return;
        }
        int i = g.i();
        e.e("HomeViewPagerAdapter", "tabViewPaddingProcess,searchBarHeight: " + i);
        view.setPadding(0, i, 0, 0);
    }

    private boolean e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue() : StringUtils.equals("subscribe", str) || this.g.contains(str);
    }

    private void a(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f39d30cb", new Object[]{this, viewGroup, view});
            return;
        }
        boolean a2 = j.a("enableRemoveViewPagerViewWhenDestroyItem", true);
        e.e("HomeViewPagerAdapter", "enableRemoveView " + a2);
        if (!a2) {
            return;
        }
        Object tag = view.getTag();
        if (!(tag instanceof String) || !this.f.contains(tag)) {
            return;
        }
        viewGroup.removeView(view);
        this.f.remove(tag);
        e.e("HomeViewPagerAdapter", "重新render上屏销毁之前的，subTabType： " + tag);
    }
}

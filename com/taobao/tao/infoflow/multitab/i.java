package com.taobao.tao.infoflow.multitab;

import android.app.ActivityManager;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.n;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;
import com.taobao.tao.infoflow.multitab.viewprovider.IMultiTabStabilityListener;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.ojr;
import tb.ovn;
import tb.ovr;
import tb.qzk;
import tb.syd;

/* loaded from: classes8.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_ITEM_INDEX = -2;
    private final com.taobao.tao.topmultitab.protocol.c j;
    private IHomeSubTabController l;
    private final ovn.a m;
    private syd o;
    private IMultiTabPerformanceListener p;
    private IMultiTabStabilityListener r;
    private IHomeSubTabController s;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, IHomeSubTabController> f20645a = new ConcurrentHashMap();
    private final Map<String, View> b = new ConcurrentHashMap();
    private final Map<String, JSONObject> c = new ConcurrentHashMap();
    private final int d = com.taobao.android.home.component.utils.j.a("multiTabInstanceSize", 3);
    private final Map<String, String> f = new ConcurrentHashMap();
    private final Map<Integer, String> n = new ConcurrentHashMap();
    private int e = 1;
    private int g = -1;
    private String k = "recommend";
    private int h = -1;
    private int i = -1;
    private int q = -1;

    static {
        kge.a(1152887857);
    }

    public i(com.taobao.tao.topmultitab.protocol.c cVar, ovn.a aVar) {
        this.j = cVar;
        this.m = aVar;
    }

    public void a(IMultiTabPerformanceListener iMultiTabPerformanceListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e8b881", new Object[]{this, iMultiTabPerformanceListener});
        } else {
            this.p = iMultiTabPerformanceListener;
        }
    }

    public void a(IMultiTabStabilityListener iMultiTabStabilityListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fce8a3a6", new Object[]{this, iMultiTabStabilityListener});
        } else {
            this.r = iMultiTabStabilityListener;
        }
    }

    public void a(JSONObject jSONObject, IHomeSubTabController iHomeSubTabController) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a6a359", new Object[]{this, jSONObject, iHomeSubTabController});
            return;
        }
        d();
        List<JSONObject> a2 = e.a(jSONObject);
        if (a2 == null) {
            return;
        }
        this.n.clear();
        for (int i = 0; i < a2.size(); i++) {
            JSONObject jSONObject3 = a2.get(i);
            if (jSONObject3 != null && (jSONObject2 = a2.get(i).getJSONObject("content")) != null) {
                String string = jSONObject2.getString(e.KEY_TAB_ID);
                if (!StringUtils.isEmpty(string)) {
                    this.c.put(string, jSONObject3);
                    this.n.put(Integer.valueOf(i), string);
                    String string2 = jSONObject2.getString("containerType");
                    this.f.put(string, string2);
                    String string3 = jSONObject2.getString(e.KEY_IS_RECOMMEND_TAB);
                    if (!StringUtils.isEmpty(string3) && Boolean.parseBoolean(string3)) {
                        this.s = iHomeSubTabController;
                        if (this.s == null) {
                            this.s = new ojr(this.j, ovr.TAB_ID_MAINLAND_RECOMMEND_MICROSERVICES);
                        }
                    }
                    a(string2, i, string, jSONObject3);
                }
            }
        }
    }

    private void a(String str, int i, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfb465b5", new Object[]{this, str, new Integer(i), str2, jSONObject});
        } else if (StringUtils.isEmpty(str2) || this.f20645a.get(str2) != null) {
        } else {
            char c = 65535;
            switch (str.hashCode()) {
                case -139919088:
                    if (str.equals("campaign")) {
                        c = 2;
                        break;
                    }
                    break;
                case 514841930:
                    if (str.equals("subscribe")) {
                        c = 1;
                        break;
                    }
                    break;
                case 989204668:
                    if (str.equals("recommend")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1463130501:
                    if (str.equals(com.taobao.tao.topmultitab.c.HOME_TAB_ID_HOUR_DELIVERY)) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                if (this.s == null) {
                    this.s = new ojr(this.j, ovr.TAB_ID_MAINLAND_RECOMMEND_MICROSERVICES);
                }
                this.k = str2;
                this.e = i;
                this.f20645a.put(str2, this.s);
            } else if (c == 1) {
                if (this.l == null) {
                    this.l = new ovn(this.j, this.m);
                }
                this.g = i;
                this.f20645a.put(str2, this.l);
            } else if (c != 2) {
                if (c == 3) {
                    this.f20645a.put(str2, new com.taobao.android.detail.industry.hourlydelivery.c(this.j));
                } else {
                    this.f20645a.put(str2, new qzk(this.j, jSONObject, this.p, this.r, i));
                }
            } else {
                Map<String, IHomeSubTabController> map = this.f20645a;
                com.taobao.tao.topmultitab.protocol.c cVar = this.j;
                map.put(str2, new com.taobao.infoflow.a(cVar, str2 + "_" + i, this.p, this.r));
            }
        }
    }

    public IHomeSubTabController a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("2ccc95ec", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i > this.f20645a.size()) {
            return null;
        }
        String n = n(i);
        if (!StringUtils.isEmpty(n)) {
            return this.f20645a.get(n);
        }
        return null;
    }

    public IHomeSubTabController b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("b23069c4", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return this.f20645a.get(str);
        }
        return null;
    }

    public String n(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("54e972b2", new Object[]{this, new Integer(i)}) : this.n.get(Integer.valueOf(i));
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        for (Map.Entry<Integer, String> entry : this.n.entrySet()) {
            if (StringUtils.equals(str, entry.getValue())) {
                return entry.getKey().intValue();
            }
        }
        return -1;
    }

    public IHomeSubTabController a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IHomeSubTabController) ipChange.ipc$dispatch("3fee6479", new Object[]{this}) : a(this.e);
    }

    public View k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1eba2fd3", new Object[]{this, new Integer(i)});
        }
        String n = n(i);
        if (!StringUtils.isEmpty(n)) {
            return this.b.get(n);
        }
        return null;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.g;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.e;
    }

    public JSONObject c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b1984bf9", new Object[]{this, new Integer(i)});
        }
        if (i >= this.c.size() || i < 0) {
            g.a("SubMultiTabManager", "数组越界");
            return null;
        }
        String n = n(i);
        if (!StringUtils.isEmpty(n)) {
            return this.c.get(n);
        }
        return null;
    }

    public String a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f6ec727", new Object[]{this, new Integer(i), new Boolean(z)});
        }
        if (z) {
            return m(i);
        }
        return l(i);
    }

    private String l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0864030", new Object[]{this, new Integer(i)});
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            String j = e.j(c(i2));
            if (!StringUtils.isEmpty(j)) {
                g.a("SubMultiTabManager", "从右往左找，找到的链接是：" + j);
                return j;
            }
        }
        return null;
    }

    private String m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab7d971", new Object[]{this, new Integer(i)});
        }
        for (int i2 = i + 1; i2 < this.c.size(); i2++) {
            String j = e.j(c(i2));
            if (!StringUtils.isEmpty(j)) {
                g.a("SubMultiTabManager", "从左往右找，找到的链接是：" + j);
                return j;
            }
        }
        return null;
    }

    public JSONObject a(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("dbebad99", new Object[]{this, iHomeSubTabController});
        }
        g.a("SubMultiTabManager", "getTabSelfData");
        for (Map.Entry<String, IHomeSubTabController> entry : this.f20645a.entrySet()) {
            if (iHomeSubTabController == entry.getValue()) {
                int a2 = a(entry.getKey());
                JSONObject c = c(a2);
                g.a("SubMultiTabManager", "getTabSelfData，position:" + a2);
                return c;
            }
        }
        return null;
    }

    public boolean d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad401d7c", new Object[]{this, new Integer(i)})).booleanValue();
        }
        String n = n(i);
        return StringUtils.isEmpty(n) || !this.b.containsKey(n);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        for (Map.Entry<String, IHomeSubTabController> entry : this.f20645a.entrySet()) {
            if (!StringUtils.equals(entry.getKey(), this.k) && (a(entry.getKey()) != this.g || (entry.getValue() instanceof ovn))) {
                entry.getValue().onDestroy();
                this.f20645a.remove(entry.getKey());
            }
        }
        for (Map.Entry<String, View> entry2 : this.b.entrySet()) {
            if (!StringUtils.equals(entry2.getKey(), this.k)) {
                this.b.remove(entry2.getKey());
            }
        }
        for (Map.Entry<String, String> entry3 : this.f.entrySet()) {
            if (!StringUtils.equals(entry3.getKey(), this.k)) {
                this.f.remove(entry3.getKey());
            }
        }
        for (Map.Entry<String, JSONObject> entry4 : this.c.entrySet()) {
            if (!StringUtils.equals(entry4.getKey(), this.k)) {
                this.c.remove(entry4.getKey());
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        for (Map.Entry<String, IHomeSubTabController> entry : this.f20645a.entrySet()) {
            entry.getValue().onDestroy();
        }
        this.f20645a.clear();
        this.b.clear();
        this.f.clear();
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public boolean f(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b0a9ceba", new Object[]{this, new Integer(i)})).booleanValue() : i == this.h && i != this.e;
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.i;
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c85893", new Object[]{this, new Integer(i)});
            return;
        }
        String n = n(i);
        if (StringUtils.isEmpty(n)) {
            return;
        }
        this.f20645a.put(n, this.l);
    }

    public void b(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("552e2a58", new Object[]{this, iHomeSubTabController});
        } else {
            this.l = iHomeSubTabController;
        }
    }

    public String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da9643a6", new Object[]{this, new Integer(i)});
        }
        String n = n(i);
        return StringUtils.isEmpty(n) ? "" : this.f.get(n);
    }

    private void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0056c4d", new Object[]{this, new Integer(i)});
        } else {
            this.q = i;
        }
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue();
        }
        int i = this.q;
        this.q = -1;
        return i;
    }

    public View a(ViewGroup viewGroup, int i) {
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a545e87e", new Object[]{this, viewGroup, new Integer(i)});
        }
        String n = n(i);
        g.a("SubMultiTabManager", "createView: position " + i + ",tabId:" + n);
        if (StringUtils.isEmpty(n)) {
            return new SubWrapFrameLayout(viewGroup.getContext(), i);
        }
        View view = this.b.get(n);
        if (view != null) {
            g.a("SubMultiTabManager", "createView: position 存在 " + i);
            return view;
        }
        if (this.i != i && i != this.e) {
            g.a("SubMultiTabManager", "SubMultiTabManger -> createView SubWrapFrameLayout " + i);
            a2 = new SubWrapFrameLayout(viewGroup.getContext(), i);
        } else {
            a2 = a(i, viewGroup.getContext(), "tabSelected");
            g.a("SubMultiTabManager", "SubMultiTabManger -> createView: 创建真实视图  " + i + "， view " + a2);
        }
        a(i, a2);
        return a2;
    }

    public View a(int i, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8c23cd99", new Object[]{this, new Integer(i), context, str});
        }
        IHomeSubTabController a2 = a(i);
        if (a2 == null) {
            g.a("SubMultiTabManager", "SubMultiTabManger -> createView iHomeSubTabController null ");
            return new View(context);
        }
        String n = n(i);
        if (StringUtils.isEmpty(n)) {
            return new View(context);
        }
        o(i);
        this.p.a(n, System.currentTimeMillis(), str);
        View createView = a2.createView(context);
        this.p.b(n, System.currentTimeMillis(), str);
        this.o.a(i);
        return createView;
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4137ff4", new Object[]{this, new Integer(i)});
            return;
        }
        g.a("SubMultiTabManager", "removeTabView:  " + i);
        if (i == -1) {
            return;
        }
        String n = n(i);
        if (StringUtils.isEmpty(n)) {
            return;
        }
        this.b.remove(n);
    }

    public void a(syd sydVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffa9cf5a", new Object[]{this, sydVar});
        } else {
            this.o = sydVar;
        }
    }

    public com.taobao.infoflow.a f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.infoflow.a) ipChange.ipc$dispatch("4de1859d", new Object[]{this});
        }
        for (int i = 0; i < this.f20645a.size(); i++) {
            String n = n(i);
            if (!StringUtils.isEmpty(n)) {
                IHomeSubTabController iHomeSubTabController = this.f20645a.get(n);
                if (iHomeSubTabController instanceof com.taobao.infoflow.a) {
                    com.taobao.infoflow.a aVar = (com.taobao.infoflow.a) iHomeSubTabController;
                    g.a("SubMultiTabManager", "第一个web视图 position :  " + i);
                    return aVar;
                }
            }
        }
        return null;
    }

    public void a(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11131157", new Object[]{this, new Integer(i), view});
        } else if (!n.n().e()) {
            c(i, view);
        } else {
            d(i, view);
        }
    }

    private void c(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1973ab59", new Object[]{this, new Integer(i), view});
        } else if (i == this.e) {
            b(i, view);
        } else {
            int g = g();
            com.taobao.android.home.component.utils.e.e("SubMultiTabManager", "instanceViewCount: " + g);
            if (g <= this.d) {
                b(i, view);
                return;
            }
            b(i, view);
            j(i);
        }
    }

    private void d(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da3f85a", new Object[]{this, new Integer(i), view});
        } else if (a(view.getContext())) {
            g.a("SubMultiTabManager", "cacheViewByMemory memoryAvailable");
            b(i, view);
        } else {
            g.a("SubMultiTabManager", "cacheViewByMemory removeFarthestTab");
            j(i);
            b(i, view);
        }
    }

    private void j(int i) {
        int abs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d3132", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = Integer.MIN_VALUE;
        int i3 = -1;
        for (Map.Entry<String, View> entry : this.b.entrySet()) {
            int a2 = a(entry.getKey());
            if (a2 != this.e && a2 != this.i && (abs = Math.abs(i - a2)) > i2 && a(entry.getValue())) {
                i3 = a2;
                i2 = abs;
            }
        }
        String n = n(i3);
        if (StringUtils.isEmpty(n) || !this.b.containsKey(n)) {
            return;
        }
        View view = this.b.get(n);
        if (view != null && view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        this.b.remove(n);
        g.a("SubMultiTabManager", "移除 farthestTabId :  " + n);
    }

    private static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        double d = memoryInfo.availMem / memoryInfo.totalMem;
        g.a("SubMultiTabManager", "memoryAvailable availablePercent:" + d);
        return d > com.taobao.android.home.component.utils.j.a("MultiTabMemPercent", 0.1d);
    }

    private int g() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        for (Map.Entry<String, View> entry : this.b.entrySet()) {
            if (a(entry.getValue())) {
                i++;
            }
        }
        return i;
    }

    private boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        if (!(view instanceof SubWrapFrameLayout)) {
            return true;
        }
        return ((SubWrapFrameLayout) view).isRealView();
    }

    private void b(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95435e58", new Object[]{this, new Integer(i), view});
            return;
        }
        String n = n(i);
        if (StringUtils.isEmpty(n) || this.b.containsKey(n) || view == null) {
            return;
        }
        this.b.put(n, view);
        g.a("SubMultiTabManager", "cache position :  " + i + ",view:" + view);
    }

    public void a(String str, int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("649033ff", new Object[]{this, str, new Integer(i), jSONObject});
            return;
        }
        int a2 = a(str);
        if (a2 == this.e || StringUtils.equals(str, this.k)) {
            g.a("SubMultiTabManager", "updateTabCache recommend not update: ");
            return;
        }
        g.a("SubMultiTabManager", "updateTabCache tabId:" + str + ",originalPosition:" + a2 + ",newPosition:" + i);
        if (this.b.get(str) instanceof SubWrapFrameLayout) {
            this.b.remove(str);
        }
        this.n.remove(Integer.valueOf(i));
        this.n.put(Integer.valueOf(i), str);
        this.c.put(str, jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("content");
        if (jSONObject2 == null) {
            return;
        }
        String string = jSONObject2.getString("containerType");
        this.f.put(str, string);
        a(string, i, str, jSONObject);
    }
}

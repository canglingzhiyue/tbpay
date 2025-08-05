package com.taobao.homepage.view.manager.searchbar.impl.searchview;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import tb.kge;
import tb.law;
import tb.lbg;
import tb.ldf;
import tb.tgr;
import tb.tgs;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUB_SECTION_HOME = "home";

    /* renamed from: a  reason: collision with root package name */
    private final lbg f17327a;
    private final SearchBarView b;
    private tgs c;
    private JSONObject d;
    private tgr e;

    static {
        kge.a(-1374854667);
    }

    public static /* synthetic */ JSONObject a(b bVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f0063406", new Object[]{bVar, jSONObject});
        }
        bVar.d = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ JSONObject a(b bVar, tgr tgrVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("8e724275", new Object[]{bVar, tgrVar, jSONObject}) : bVar.a(tgrVar, jSONObject);
    }

    public static /* synthetic */ SearchBarView a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SearchBarView) ipChange.ipc$dispatch("6c335260", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ tgr a(b bVar, tgr tgrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tgr) ipChange.ipc$dispatch("4e83c6ac", new Object[]{bVar, tgrVar});
        }
        bVar.e = tgrVar;
        return tgrVar;
    }

    public b(law lawVar, SearchBarView searchBarView) {
        this.b = searchBarView;
        this.f17327a = a(lawVar);
        a(this.f17327a);
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        ldf.d("RefreshSearchBarComponent", "重新渲染搜索栏");
        this.d = a(this.e, jSONObject);
    }

    public void a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79284c", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        DXRootView dX3SearchView = this.b.getDX3SearchView();
        if (dX3SearchView == null) {
            ldf.d("RefreshSearchBarComponent", "refreshSearchBox dxSearchView == null");
            return;
        }
        if (z) {
            ldf.d("RefreshSearchBarComponent", "首页请求回来调用局部刷新,需要询问内部要数据");
            this.d = b(jSONObject, this.e, dX3SearchView.getData());
        } else {
            ldf.d("RefreshSearchBarComponent", "外部调用局部刷新");
            this.d = a(jSONObject, this.e, dX3SearchView.getData());
        }
        this.b.partialRefreshWidgetNode("searchContainer");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            b(this.f17327a);
        }
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.d;
    }

    private tgs c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tgs) ipChange.ipc$dispatch("1e6e3b7c", new Object[]{this}) : new tgs() { // from class: com.taobao.homepage.view.manager.searchbar.impl.searchview.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.tgs
            public void a(float f, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c0ff5ab", new Object[]{this, new Float(f), new Integer(i)});
                }
            }

            @Override // tb.tgs
            public void a(final String str, final tgr tgrVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4051d3e3", new Object[]{this, str, tgrVar});
                } else if (tgrVar == null) {
                    ldf.d("RefreshSearchBarComponent", "分类数据为空");
                } else {
                    b.a(b.this, tgrVar);
                    com.taobao.gateway.dispatch.a.b().a(new Runnable() { // from class: com.taobao.homepage.view.manager.searchbar.impl.searchview.b.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            DXRootView dX3SearchView = b.a(b.this).getDX3SearchView();
                            if (dX3SearchView == null) {
                                return;
                            }
                            b.a(b.this, b.a(b.this, tgrVar, dX3SearchView.getData()));
                            ldf.d("RefreshSearchBarComponent", "切tab局部刷新,currentType:" + str);
                            b.a(b.this).partialRefreshWidgetNode("searchContainer");
                        }
                    }, 0L);
                }
            }
        };
    }

    private JSONObject a(tgr tgrVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a0ddd317", new Object[]{this, tgrVar, jSONObject});
        }
        if (jSONObject == null) {
            return new JSONObject();
        }
        if (tgrVar == null || !tgrVar.f()) {
            z = false;
        }
        if (z) {
            ldf.d("RefreshSearchBarComponent", "切tab，需要组装自己的数据");
            return a(jSONObject, tgrVar);
        }
        return b(jSONObject, tgrVar);
    }

    private JSONObject a(JSONObject jSONObject, tgr tgrVar, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d66b47f7", new Object[]{this, jSONObject, tgrVar, jSONObject2});
        }
        if (jSONObject2 == null || jSONObject == null) {
            ldf.d("RefreshSearchBarComponent", "refreshSearchBoxBySelf dxSearchBarData == null || searchBoxDataFromSelf == null");
            return new JSONObject();
        }
        JSONObject b = b(JSON.parseObject(jSONObject2.toJSONString()), tgrVar);
        JSONObject jSONObject3 = b.getJSONObject("subSection");
        if (jSONObject3 == null) {
            ldf.d("RefreshSearchBarComponent", "refreshSearchBoxBySelf subSection == null");
            return b;
        }
        JSONObject jSONObject4 = jSONObject3.getJSONObject("searchBox");
        if (jSONObject4 != null) {
            ldf.d("RefreshSearchBarComponent", "更新搜索框数据");
            jSONObject4.putAll(jSONObject);
        }
        return b;
    }

    private JSONObject b(JSONObject jSONObject, tgr tgrVar, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a552e638", new Object[]{this, jSONObject, tgrVar, jSONObject2});
        }
        if (jSONObject2 == null) {
            ldf.d("RefreshSearchBarComponent", "refreshSearchBoxByHomeRequest dxSearchBarData == null");
            return new JSONObject();
        }
        if (tgrVar == null || !tgrVar.f()) {
            z = false;
        }
        if (z) {
            ldf.d("RefreshSearchBarComponent", "refreshSearchBoxByHomeRequest 需要组装自己的搜索框");
            return a(jSONObject2, tgrVar);
        }
        return a(tgrVar, jSONObject2, jSONObject);
    }

    private JSONObject a(JSONObject jSONObject, tgr tgrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("24c45459", new Object[]{this, jSONObject, tgrVar});
        }
        IHomeSubTabController z = com.taobao.tao.topmultitab.c.a().z();
        JSONObject jSONObject2 = null;
        if (z != null) {
            jSONObject2 = z.getSubTabSearchBoxData();
        }
        return a(tgrVar, JSON.parseObject(jSONObject.toJSONString()), jSONObject2);
    }

    private JSONObject a(tgr tgrVar, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("18d18f9", new Object[]{this, tgrVar, jSONObject, jSONObject2});
        }
        JSONObject b = b(jSONObject, tgrVar);
        JSONObject jSONObject3 = b.getJSONObject("subSection");
        if (jSONObject3 == null) {
            ldf.d("RefreshSearchBarComponent", "mergeSearchBoxAndComponentData subSection == null");
            return b;
        }
        JSONObject jSONObject4 = jSONObject3.getJSONObject("searchBox");
        if (jSONObject2 != null && jSONObject4 != null) {
            jSONObject4.putAll(jSONObject2);
        }
        return b;
    }

    private JSONObject b(JSONObject jSONObject, tgr tgrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3dc5a5f8", new Object[]{this, jSONObject, tgrVar});
        }
        if (jSONObject == null) {
            ldf.d("RefreshSearchBarComponent", "mergeTabComponentData searchBarData == null");
            return new JSONObject();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("subSection");
        if (jSONObject2 == null) {
            ldf.d("RefreshSearchBarComponent", "mergeTabComponentData subSection == null");
            return new JSONObject();
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("home");
        if (jSONObject3 == null) {
            ldf.d("RefreshSearchBarComponent", "mergeTabComponentData，合并数据失败");
            return new JSONObject();
        } else if (tgrVar == null) {
            ldf.d("RefreshSearchBarComponent", "mergeTabComponentData，不是分类tab，不需要处理左右图标");
            return jSONObject3;
        } else {
            return c(jSONObject3, tgrVar);
        }
    }

    private JSONObject c(JSONObject jSONObject, tgr tgrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("56c6f797", new Object[]{this, jSONObject, tgrVar});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("subSection");
        if (jSONObject2 == null) {
            ldf.d("RefreshSearchBarComponent", "mergeSearchHomeData，subSection为空");
            return jSONObject;
        }
        JSONObject a2 = tgrVar.a();
        JSONObject b = tgrVar.b();
        jSONObject2.put("leftComponent", (Object) a2);
        jSONObject2.put("rightComponent", (Object) b);
        return jSONObject;
    }

    private void a(lbg lbgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2752387", new Object[]{this, lbgVar});
        } else if (lbgVar == null) {
        } else {
            this.c = c();
            lbgVar.a(this.c);
        }
    }

    private void b(lbg lbgVar) {
        tgs tgsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0f82a08", new Object[]{this, lbgVar});
        } else if (lbgVar == null || (tgsVar = this.c) == null) {
        } else {
            this.f17327a.b(tgsVar);
        }
    }

    private lbg a(law lawVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lbg) ipChange.ipc$dispatch("baf0983f", new Object[]{this, lawVar});
        }
        if (lawVar != null) {
            return lawVar.d();
        }
        return null;
    }
}

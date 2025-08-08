package com.taobao.search.searchdoor.activate.hotspot;

import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.birdnest.api.BirdNestEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.nqr;

/* loaded from: classes7.dex */
public final class b extends nqr<HotSpots, com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String PRELOAD_KEY = "tbsearch_preload";
    private static int d = 0;
    private static int e = 0;
    private static int f = 0;
    private static int g = 0;
    private static int h = 0;
    public static final int limitRankNum = 3;

    /* renamed from: a  reason: collision with root package name */
    private final e f19347a = e.INSTANCE;
    private final HashSet<String> b = new HashSet<>();
    private boolean c = true;

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == -350917061) {
            super.a((JSONObject) objArr[0], (JSONObject) ((ActivateTypedBean) objArr[1]), (ActivateTypedBean) ((com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b) objArr[2]));
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "nt_hot_spots";
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1396970402);
        }

        private final String a(int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3d470151", new Object[]{this, new Integer(i), str, str2}) : i < 3 ? str2 : str;
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public static final /* synthetic */ int a(a aVar, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7abce5", new Object[]{aVar, new Integer(i)})).intValue() : aVar.a(i);
        }

        public static final /* synthetic */ String a(a aVar, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("312d805a", new Object[]{aVar, new Integer(i), str, str2}) : aVar.a(i, str, str2);
        }

        public static final /* synthetic */ int b(a aVar, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("260ec5e6", new Object[]{aVar, new Integer(i)})).intValue() : aVar.b(i);
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : b.e();
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : b.f();
        }

        public final int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : b.g();
        }

        public final int d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : b.h();
        }

        public final int e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : b.i();
        }

        private final int a(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue() : i >= 19 ? a() : b();
        }

        private final int b(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue() : i < 3 ? c() : d();
        }
    }

    public static final /* synthetic */ int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[0])).intValue() : d;
    }

    public static final /* synthetic */ int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[0])).intValue() : e;
    }

    public static final /* synthetic */ int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[0])).intValue() : f;
    }

    public static final /* synthetic */ int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[0])).intValue() : g;
    }

    public static final /* synthetic */ int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[0])).intValue() : h;
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : a();
    }

    static {
        kge.a(2116022490);
        Companion = new a(null);
        d = j.a(16.5f);
        e = j.a(14.0f);
        f = j.a(17.0f);
        g = j.a(14.0f);
        h = j.a(14.0f);
    }

    public HotSpots a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HotSpots) ipChange.ipc$dispatch("105284a2", new Object[]{this}) : new HotSpots(false, null, null, null, null, null, false, 126, null);
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public Class<HotSpots> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : HotSpots.class;
    }

    private final void a(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3526812", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (StringUtils.isEmpty(str) || p.a(this.b, str)) {
        } else {
            HashSet<String> hashSet = this.b;
            if (str == null) {
                q.a();
            }
            hashSet.add(str);
            this.f19347a.a(Globals.getApplication(), str, new C0779b(i, i2), MUSImageQuality.AUTO);
        }
    }

    /* renamed from: com.taobao.search.searchdoor.activate.hotspot.b$b  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0779b implements com.taobao.search.m3.j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f19348a;
        public final /* synthetic */ int b;
        private Object c;

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public void a(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
            }
        }

        public C0779b(int i, int i2) {
            this.f19348a = i;
            this.b = i2;
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            } else {
                this.c = obj;
            }
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public Object b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : this.c;
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f19348a;
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public int d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.b;
        }
    }

    @Override // tb.nqr, com.taobao.android.searchbaseframe.parse.b, com.taobao.android.searchbaseframe.parse.a
    public void a(JSONObject beanObject, HotSpots bean, com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar) {
        JSONObject jSONObject;
        String str;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1bd888", new Object[]{this, beanObject, bean, bVar});
            return;
        }
        q.c(beanObject, "beanObject");
        q.c(bean, "bean");
        super.a(beanObject, (JSONObject) bean, (HotSpots) bVar);
        if (bVar == null || !bVar.s) {
            z = false;
        }
        bean.setPreload(z);
        String str2 = "name";
        bean.setName(beanObject.getString(str2));
        bean.setTabKey(beanObject.getString("tabkey"));
        bean.traceBizType = beanObject.getString("traceBizType");
        bean.traceTmplType = beanObject.getString("traceTmplType");
        bean.setTrendRuleText(beanObject.getString("trendRuleText"));
        bean.setTrendRuleUrl(beanObject.getString("trendRuleUrl"));
        JSONArray jSONArray = beanObject.getJSONArray("data");
        if (jSONArray == null) {
            return;
        }
        int size = jSONArray.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 0;
        while (i < size) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            JSONObject jSONObject3 = jSONObject2.getJSONObject("tabStyle");
            int intValue = jSONObject2.getIntValue("deepColorSize");
            String string = jSONObject3.getString(str2);
            String string2 = jSONObject3.getString("titleImage");
            JSONArray jSONArray2 = jSONObject2.getJSONArray("tabData");
            int size2 = jSONArray2.size();
            ArrayList arrayList2 = new ArrayList(size2);
            int i2 = 0;
            while (i2 < size2) {
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                JSONArray jSONArray3 = jSONArray;
                String str3 = str2;
                String searchNum = jSONObject4.getString("searchNum");
                int i3 = size;
                JSONArray jSONArray4 = jSONArray2;
                String showText = jSONObject4.getString("showText");
                int i4 = size2;
                String string3 = jSONObject4.getString("tagIcon");
                int i5 = i;
                String markUrl = jSONObject4.getString("markUrl");
                ArrayList arrayList3 = arrayList;
                int intValue2 = jSONObject4.getIntValue("tagIconWidth");
                String str4 = string2;
                int intValue3 = jSONObject4.getIntValue("tagIconHeight");
                JSONObject jSONObject5 = jSONObject2;
                if (!this.c) {
                    jSONObject = jSONObject3;
                    str = string;
                } else if (intValue2 > 0 && intValue3 > 0) {
                    int i6 = h;
                    str = string;
                    jSONObject = jSONObject3;
                    a(string3, (int) ((i6 * intValue2) / intValue3), i6);
                } else {
                    jSONObject = jSONObject3;
                    str = string;
                    int i7 = h;
                    a(string3, i7, i7);
                }
                String indexUrl = jSONObject4.getString(BirdNestEngine.Params.KEY_INDEX_URL);
                if (this.c) {
                    a aVar = Companion;
                    q.a((Object) indexUrl, "indexUrl");
                    q.a((Object) markUrl, "markUrl");
                    a(a.a(aVar, i2, indexUrl, markUrl), a.a(Companion, i2), a.b(Companion, i2));
                }
                q.a((Object) showText, "showText");
                q.a((Object) searchNum, "searchNum");
                arrayList2.add(new com.taobao.search.searchdoor.activate.hotspot.a(showText, string3, searchNum, indexUrl, markUrl, jSONObject4.getString("arrowIcon"), jSONObject4.getString("itemJumpUrl"), jSONObject4.getJSONArray("searchParams"), jSONObject4.getString("searchText"), intValue2, intValue3, false, 2048, null));
                i2++;
                jSONArray = jSONArray3;
                str2 = str3;
                jSONArray2 = jSONArray4;
                size2 = i4;
                string2 = str4;
                jSONObject2 = jSONObject5;
                string = str;
                jSONObject3 = jSONObject;
                size = i3;
                i = i5;
                arrayList = arrayList3;
            }
            JSONArray jSONArray5 = jSONArray;
            String str5 = str2;
            int i8 = size;
            ArrayList arrayList4 = arrayList;
            int i9 = i;
            JSONObject jSONObject6 = jSONObject2;
            JSONObject jSONObject7 = jSONObject3;
            String tabTitle = string;
            String str6 = string2;
            this.c = false;
            String string4 = jSONObject7.getString("tabName");
            q.a((Object) string4, "tabStyle.getString(\"tabName\")");
            q.a((Object) tabTitle, "tabTitle");
            String string5 = jSONObject7.getString("selectedTitleImage");
            String string6 = jSONObject7.getString("titleWidth");
            Integer valueOf = string6 != null ? Integer.valueOf(Integer.parseInt(string6)) : null;
            String string7 = jSONObject7.getString("titleHeight");
            arrayList4.add(new c(string4, tabTitle, str6, string5, valueOf, string7 != null ? Integer.valueOf(Integer.parseInt(string7)) : null, arrayList2, intValue, jSONObject6.getJSONObject("tabTrace"), false, false, false, false, 7680, null));
            i = i9 + 1;
            jSONArray = jSONArray5;
            str2 = str5;
            arrayList = arrayList4;
            size = i8;
        }
        bean.setTabs(arrayList);
    }
}

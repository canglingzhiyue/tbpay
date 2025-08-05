package tb;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.LocalDataManager;
import com.taobao.android.searchbaseframe.datasource.b;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.android.xsearchplugin.jarvis.utils.a;
import com.taobao.android.xsearchplugin.jarvis.utils.c;
import com.taobao.android.xsearchplugin.jarvis.utils.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import tb.isr;
import tb.isu;
import tb.isv;

/* loaded from: classes6.dex */
public class jxs extends iut implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jyh f29854a;
    private final a b;
    private String c;
    private String d;
    private gse e;
    private jyc f;
    private final iru g;
    private final Map<String, Boolean> h;
    private final Runnable i;
    private final TreeSet<Integer> j;
    private int k;
    private jyq l;
    private String m;
    private boolean n;
    private final imn o;
    private String p;
    private Map<String, Object> q;
    private Map<String, String> r;
    private int s;
    private int t;
    private long u;
    private long v;
    private final Handler w;

    static {
        kge.a(-1507763302);
        kge.a(1316253846);
    }

    public static /* synthetic */ Object ipc$super(jxs jxsVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -211767613) {
            super.onComponentDestroy();
            return null;
        } else if (hashCode == 217607196) {
            super.onCtxResume();
            return null;
        } else if (hashCode != 299066517) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCtxPause();
            return null;
        }
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "JarvisKitWidget";
    }

    public jxs(Activity activity, ium iumVar, iru iruVar) {
        super(activity, iumVar);
        this.f29854a = new jyg(this, 50);
        this.b = new d();
        this.c = "";
        this.h = new HashMap();
        this.i = new jxq(this);
        this.j = new TreeSet<>();
        this.k = 0;
        this.m = "";
        this.n = false;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0L;
        this.v = 0L;
        this.w = new Handler(Looper.getMainLooper());
        this.o = iumVar.getCore();
        this.g = iruVar;
        try {
            this.f = ((jxp) this.o.c().g()).e().newInstance();
            this.e = j();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private gse j() throws Exception {
        return ((jxp) this.o.c().g()).h().getConstructor(jxs.class).newInstance(this);
    }

    public void onEventMainThread(isv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0bf04c", new Object[]{this, aVar});
        } else {
            a(aVar.b());
        }
    }

    public void onEventMainThread(isv.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a107c02", new Object[]{this, kVar});
        } else {
            a(true);
        }
    }

    public void onEventMainThread(jxz jxzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b60e09", new Object[]{this, jxzVar});
        } else {
            a(jxzVar.f29860a, jxzVar.b);
        }
    }

    public void onEventMainThread(isu.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4858e929", new Object[]{this, eVar});
        } else if (this.g.g()) {
            m();
            for (jye jyeVar : n()) {
                jyeVar.a(this, new jxy(eVar.f29289a));
            }
        }
    }

    public void onEventMainThread(isu.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48595d88", new Object[]{this, fVar});
        } else if (this.g.g()) {
            m();
            for (jye jyeVar : n()) {
                jyeVar.b(this, new jxy(fVar.f29290a));
            }
            List<String> b = b("stopScroll");
            if (b.isEmpty()) {
                return;
            }
            jyr jyrVar = this.l.d;
            long currentTimeMillis = System.currentTimeMillis();
            if (jyrVar.b > 0 && currentTimeMillis - this.u < jyrVar.b * 1000) {
                k.d("[XSearchJarvis]", "滚动停止触发时间间隔不满足，当前间隔" + (currentTimeMillis - this.u) + "ms, 触发间隔" + (jyrVar.b * 1000) + "ms", new Object[0]);
            } else if (jyrVar.c > 0 && this.t - this.v < jyrVar.c) {
                k.d("[XSearchJarvis]", "滚动停止触发曝光间隔不满足，当前间隔" + (this.t - this.v) + ", 触发间隔" + jyrVar.c, new Object[0]);
            } else {
                Map<String, Object> input = this.f.getInput("stopScroll", this);
                for (String str : b) {
                    if (k.a().c()) {
                        k.a("[XSearchJarvis]", "page:" + this.d + ", event:" + str + ", inputData:\n", new JSONObject(input));
                    }
                    com.taobao.android.jarviswe.a.a().a(this.d, str, input, this.e);
                }
                this.u = currentTimeMillis;
                this.v = this.t;
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        m();
        if (!this.g.g()) {
            return;
        }
        List<String> b = b("idle");
        if (b.isEmpty()) {
            return;
        }
        Map<String, Object> input = this.f.getInput("idle", this);
        for (String str : b) {
            com.taobao.android.jarviswe.a.a().a(this.d, str, input, this.e);
        }
    }

    @Override // tb.iut
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        this.w.removeCallbacksAndMessages(null);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.b
    public void a(int i, BaseTypedBean baseTypedBean, BaseSearchResult baseSearchResult, com.taobao.android.searchbaseframe.datasource.impl.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92aa8405", new Object[]{this, new Integer(i), baseTypedBean, baseSearchResult, aVar});
            return;
        }
        this.k = Math.max(this.k, i);
        if (baseTypedBean == null) {
            return;
        }
        this.j.add(Integer.valueOf(i));
        String a2 = com.taobao.android.xsearchplugin.jarvis.utils.b.a(baseTypedBean, this.o);
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        Boolean bool = this.h.get(a2);
        if (bool == null || !bool.booleanValue()) {
            this.t++;
        }
        this.h.put(a2, true);
        if (this.c.length() > 0) {
            this.c += ",";
        }
        this.c += a2;
        for (jye jyeVar : n()) {
            jyeVar.a(this, new jxv(baseTypedBean, i, this.r));
        }
        List<String> b = b("expose");
        if (b.isEmpty() || !k()) {
            return;
        }
        Map<String, Object> input = this.f.getInput("expose", this);
        for (String str : b) {
            if (k.a().c()) {
                k.a("[XSearchJarvis]", "page:" + this.d + ", event:" + str + ", inputData:\n", new JSONObject(input));
            }
            com.taobao.android.jarviswe.a.a().a(this.d, str, input, this.e);
        }
        this.c = "";
    }

    private boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        jyq jyqVar = this.l;
        int i = jyqVar != null ? jyqVar.f29863a.b : 0;
        if (i < 2) {
            return true;
        }
        this.s++;
        this.s %= i;
        return this.s == 0;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.b
    public void a(int i, BaseTypedBean baseTypedBean, long j, BaseSearchResult baseSearchResult, com.taobao.android.searchbaseframe.datasource.impl.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3136b669", new Object[]{this, new Integer(i), baseTypedBean, new Long(j), baseSearchResult, aVar});
            return;
        }
        this.j.remove(Integer.valueOf(i));
        for (jye jyeVar : n()) {
            jyeVar.a(this, new jxx(baseTypedBean, i));
        }
    }

    private List<String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89cdf874", new Object[]{this, str});
        }
        jyq jyqVar = this.l;
        if (jyqVar == null) {
            return Collections.emptyList();
        }
        jyj a2 = jyqVar.a(str);
        if (a2 == null) {
            return Collections.emptyList();
        }
        return a2.f29862a;
    }

    public void onEventMainThread(isr.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4339768e", new Object[]{this, cVar});
        } else if (this.g.g()) {
            JSONObject jSONObject = cVar.b;
            String str = cVar.f29283a;
            if (TextUtils.isEmpty(str) || jSONObject == null || !JarvisConstant.EVENT_RECORD_ITME_CLICk.equals(str)) {
                return;
            }
            String string = jSONObject.getString("itemId");
            ArrayMap arrayMap = new ArrayMap();
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            if (jSONObject2 != null) {
                for (String str2 : jSONObject2.keySet()) {
                    String string2 = jSONObject2.getString(str2);
                    if (!TextUtils.isEmpty(string2)) {
                        arrayMap.put(str2, string2);
                    }
                }
            }
            a(string, arrayMap);
        }
    }

    private void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (!TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(str)) {
            Map<String, String> map2 = this.r;
            if (map2 != null) {
                map.putAll(map2);
            }
            this.p = str;
            this.q = map;
            m();
            for (jye jyeVar : n()) {
                jyeVar.a(this, new jxw(str, map));
            }
            List<String> b = b("click");
            if (b == null || b.isEmpty()) {
                return;
            }
            Map<String, Object> input = this.f.getInput("click", this);
            if (map != null) {
                input.putAll(map);
            }
            for (String str2 : b) {
                if (k.a().c()) {
                    k.a("[XSearchJarvis]", "page:" + this.d + ", event:" + str2 + ", inputData:\n", new JSONObject(input));
                }
                com.taobao.android.jarviswe.a.a().a(this.d, str2, input, this.e);
            }
        }
    }

    @Override // tb.iut
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        m();
        if (!this.g.g() || TextUtils.isEmpty(this.p)) {
            return;
        }
        Iterator<jye> it = n().iterator();
        while (it.hasNext()) {
            it.next();
            new jxw(this.p, null);
        }
        List<String> b = b(JarvisConstant.TRIGGER_POINT_DETAIL_BACK);
        if (b.isEmpty()) {
            return;
        }
        Map<String, Object> input = this.f.getInput(JarvisConstant.TRIGGER_POINT_DETAIL_BACK, this);
        Map<String, Object> map = this.q;
        if (map != null) {
            input.putAll(map);
        }
        for (String str : b) {
            if (k.a().c()) {
                k.a("[XSearchJarvis]", "page:" + this.d + ", event:" + str + ", inputData:\n", new JSONObject(input));
            }
            com.taobao.android.jarviswe.a.a().a(this.d, str, input, this.e);
        }
        this.p = null;
        this.q = null;
    }

    public iru b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iru) ipChange.ipc$dispatch("16b7bf91", new Object[]{this}) : this.g;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.m;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.d;
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.r = map;
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.c = "";
        this.j.clear();
        this.h.clear();
        this.t = 0;
        this.k = 0;
        this.u = 0L;
        this.v = 0L;
        this.f29854a.c();
        this.b.a();
        this.l = null;
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, LocalDataManager> d = this.g.d();
        BaseSearchResult baseSearchResult = (BaseSearchResult) d.getLastSearchResult();
        if (baseSearchResult != null && baseSearchResult.isSuccess() && !baseSearchResult.getCells().isEmpty() && z) {
            l();
            b(baseSearchResult);
            m();
        }
        if (this.n) {
            this.b.a(d);
            a(baseSearchResult);
        }
        this.f29854a.a((List<String>) new ArrayList());
        this.f29854a.b((List<String>) new ArrayList());
        Iterator<jye> it = n().iterator();
        while (it.hasNext()) {
            it.next();
            new jxu(z);
        }
        List<String> b = b(JarvisConstant.TRIGGER_POINT_AFTER);
        if (b.isEmpty()) {
            return;
        }
        Map<String, Object> input = this.f.getInput(JarvisConstant.TRIGGER_POINT_AFTER, this);
        for (String str : b) {
            if (k.a().c()) {
                k.a("[XSearchJarvis]", "page:" + this.d + ", event:" + str + ", inputData:\n", new JSONObject(input));
            }
            com.taobao.android.jarviswe.a.a().a(this.d, str, input, this.e);
        }
    }

    public c a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("36f45de2", new Object[]{this, new Integer(i)}) : this.b.a(i);
    }

    private void a(BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee5bf110", new Object[]{this, baseSearchResult});
            return;
        }
        jyh h = h();
        ArrayList<BaseCellBean> arrayList = new ArrayList();
        ArrayList<BaseCellBean> arrayList2 = new ArrayList();
        for (int cellsCount = baseSearchResult.getCellsCount() - 1; cellsCount >= 0; cellsCount--) {
            BaseCellBean baseCellBean = baseSearchResult.getCells().get(cellsCount);
            if (TextUtils.equals(baseCellBean.cardType, "item")) {
                if (baseCellBean.isP4p) {
                    arrayList2.add(baseCellBean);
                } else {
                    arrayList.add(baseCellBean);
                }
            }
        }
        if (imp.a().c()) {
            StringBuilder sb = new StringBuilder();
            for (BaseCellBean baseCellBean2 : arrayList) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(baseCellBean2.itemId);
            }
            k.d("[XSearchJarvis]", "翻页追加buffer：" + sb.toString(), new Object[0]);
        }
        h.a((Collection<BaseCellBean>) arrayList);
        if (imp.a().c()) {
            StringBuilder sb2 = new StringBuilder();
            for (BaseCellBean baseCellBean3 : arrayList2) {
                if (sb2.length() > 0) {
                    sb2.append(',');
                }
                sb2.append(baseCellBean3.itemId);
            }
            k.d("[XSearchJarvis]", "翻页追加广告buffer：" + sb2.toString(), new Object[0]);
        }
        h.b((Collection<BaseCellBean>) arrayList2);
    }

    private void b(BaseSearchResult baseSearchResult) {
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ccea2f", new Object[]{this, baseSearchResult});
        } else if (baseSearchResult == null) {
        } else {
            String popExtMod = baseSearchResult.popExtMod(JarvisConstant.KEY_JARVIS_CONFIG);
            if (TextUtils.isEmpty(popExtMod)) {
                return;
            }
            try {
                JSONObject parseObject = JSON.parseObject(popExtMod);
                jyo i = ((jxp) this.o.c().g()).i();
                this.d = i.a(parseObject);
                this.l = i.b(parseObject);
                this.m = i.a(baseSearchResult);
                JSONObject jSONObject = parseObject.getJSONObject("ext");
                if (jSONObject != null && (intValue = jSONObject.getIntValue("max_buffer_size")) > 0) {
                    this.f29854a.a(intValue);
                }
                this.n = false;
                this.n = JSON.parseObject(this.m).getBooleanValue("isOpenClientResort");
            } catch (Throwable unused) {
            }
        }
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        if (!this.j.isEmpty()) {
            return this.j.last().intValue();
        }
        return -1;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        Boolean bool = this.h.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        this.w.removeCallbacks(this.i);
        jyq jyqVar = this.l;
        int i = jyqVar != null ? jyqVar.b.b : -1;
        if (b("idle").isEmpty() || i <= 0) {
            return;
        }
        this.w.postDelayed(this.i, i * 1000);
    }

    @Override // tb.iut
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        this.w.removeCallbacks(this.i);
    }

    private List<jye> n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("25adebb2", new Object[]{this}) : ((jxp) this.o.c().g()).g();
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.k;
    }

    public jyh h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jyh) ipChange.ipc$dispatch("44e22cde", new Object[]{this}) : this.f29854a;
    }

    public Map<String, Object> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d67b6a5", new Object[]{this}) : this.q;
    }
}

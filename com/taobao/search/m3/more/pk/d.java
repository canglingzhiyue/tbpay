package com.taobao.search.m3.more.pk;

import android.app.Activity;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.m3.price.e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.nog;
import tb.ntn;
import tb.ntr;

/* loaded from: classes7.dex */
public final class d implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final HashSet<c> f19123a;
    private boolean b;
    private final Observer c;
    private final Activity d;

    /* loaded from: classes7.dex */
    public static final class a implements Observer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
                return;
            }
            if (!(obj instanceof JSONObject)) {
                obj = null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject == null) {
                return;
            }
            d.a(d.this, jSONObject.getJSONObject("data").getBooleanValue("openPk"));
        }
    }

    static {
        kge.a(1304590413);
        kge.a(279820077);
    }

    public d(Activity activity) {
        q.c(activity, "activity");
        this.d = activity;
        this.f19123a = new HashSet<>();
        this.c = new a();
    }

    public static final /* synthetic */ void a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b3f1a72", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.a(z);
        }
    }

    @Override // com.taobao.search.m3.more.pk.b
    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.b;
    }

    @Override // com.taobao.search.m3.more.pk.b
    public void a(M3CellBean bean, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82965c8", new Object[]{this, bean, new Boolean(z)});
            return;
        }
        q.c(bean, "bean");
        if (z) {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "itemLabels", (String) jSONArray);
            List<SearchDomBean> titleIcons = bean.getTitleIcons();
            if (titleIcons != null) {
                for (SearchDomBean searchDomBean : titleIcons) {
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    JSONObject jSONObject5 = jSONObject4;
                    jSONObject5.put((JSONObject) "img", searchDomBean.image);
                    jSONObject5.put((JSONObject) "width", String.valueOf(searchDomBean.width));
                    jSONObject5.put((JSONObject) "height", String.valueOf(searchDomBean.height));
                    jSONObject3.put((JSONObject) "light", (String) jSONObject4);
                    jSONArray.add(jSONObject3);
                }
            }
            jSONObject2.put((JSONObject) nog.PRD_PICURL, bean.getPicPath());
            e priceInfo = bean.getPriceInfo();
            jSONObject2.put((JSONObject) "price", priceInfo != null ? priceInfo.c() : null);
            jSONObject2.put((JSONObject) "title", bean.getTitle());
            JSONArray extraParams = bean.getExtraParams();
            if (extraParams != null) {
                int size = extraParams.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    JSONObject jSONObject6 = extraParams.getJSONObject(i);
                    if (jSONObject6 != null) {
                        String string = jSONObject6.getString("key");
                        if (q.a((Object) string, (Object) "skuId")) {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put((JSONObject) string, jSONObject6.getString("value"));
                            jSONObject2.put((JSONObject) "extraParams", (String) jSONObject7);
                            break;
                        }
                    }
                    i++;
                }
            }
            if (bean.getWfTitleLines() > 1) {
                z2 = true;
            }
            jSONObject2.put((JSONObject) "wfTwoLineTitle", String.valueOf(z2));
            ntn ntnVar = ntn.INSTANCE;
            com.taobao.search.m3.more.pk.a pkInfo = bean.getPkInfo();
            if (pkInfo == null) {
                q.a();
            }
            String d = pkInfo.d();
            String str = bean.itemId;
            q.a((Object) str, "bean.itemId");
            ntnVar.a(d, str, jSONObject);
            return;
        }
        ntn ntnVar2 = ntn.INSTANCE;
        com.taobao.search.m3.more.pk.a pkInfo2 = bean.getPkInfo();
        if (pkInfo2 == null) {
            q.a();
        }
        String d2 = pkInfo2.d();
        String str2 = bean.itemId;
        q.a((Object) str2, "bean.itemId");
        ntnVar2.a(d2, str2);
    }

    private final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z == this.b) {
        } else {
            this.b = z;
            if (z) {
                b();
            } else {
                c();
            }
        }
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Iterator<c> it = this.f19123a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Iterator<c> it = this.f19123a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            ntr.INSTANCE.a(this.d, "pkSwitch", this.c);
        }
    }

    private final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            ntr.INSTANCE.b(this.d, "pkSwitch", this.c);
        }
    }

    @Override // com.taobao.search.m3.more.pk.b
    public void a(c observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9a6b843", new Object[]{this, observer});
            return;
        }
        q.c(observer, "observer");
        this.f19123a.add(observer);
        if (this.f19123a.size() != 1) {
            return;
        }
        d();
    }

    @Override // com.taobao.search.m3.more.pk.b
    public void b(c observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed4e8bc4", new Object[]{this, observer});
            return;
        }
        q.c(observer, "observer");
        this.f19123a.remove(observer);
        if (this.f19123a.size() != 0) {
            return;
        }
        e();
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            e();
        }
    }
}

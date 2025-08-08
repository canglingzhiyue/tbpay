package com.taobao.search.sf;

import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.android.weex_framework.adapter.d;
import com.taobao.downgrade.Downgrade;
import com.taobao.downgrade.DowngradeStrategy;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.u;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.sf.b;
import com.taobao.tao.Globals;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.kge;
import tb.nog;
import tb.ntx;

/* loaded from: classes8.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final float f19448a = r.ao();
    private final boolean b;
    private float c;
    private final boolean d;
    private Set<String> e;

    static {
        kge.a(-1474933418);
        kge.a(-1340810502);
    }

    public static /* synthetic */ float a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e2901e08", new Object[]{gVar})).floatValue() : gVar.f19448a;
    }

    public g() {
        this.b = r.bw() && r.e("cacheMainPic");
        this.c = 1.0f;
        this.d = u.s();
        this.e = new HashSet();
        DowngradeStrategy downgradeStrategy = Downgrade.getInstance().getDowngradeStrategy("search");
        if (downgradeStrategy != null && StringUtils.equals("degrade", downgradeStrategy.getTacticsPerformance())) {
            this.c = 1.0f / r.at();
        }
        this.e.add("ms_tb-webb-widget_tbs_widget_m3");
        if (this.d) {
            this.e.add("ms_tmall-ovs-rax_tmg_search_item_all_m1");
            this.e.add("ms_tmall-ovs-rax_tmg_search_item_local_m1");
        }
    }

    public void a(boolean z, ListStyle listStyle, List<BaseCellBean> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9ec5671", new Object[]{this, new Boolean(z), listStyle, list, new Integer(i)});
        } else if (list != null && !list.isEmpty() && z) {
            if (i == 0) {
                i = ntx.a();
            }
            int a2 = b.g.a(ListStyle.WATERFALL, i);
            int a3 = com.taobao.android.searchbaseframe.util.j.a(140.0f);
            for (int i2 = 0; i2 < list.size(); i2++) {
                BaseCellBean baseCellBean = list.get(i2);
                if (z && i2 >= 6) {
                    return;
                }
                if (baseCellBean instanceof M3CellBean) {
                    if (listStyle == ListStyle.WATERFALL) {
                        a((M3CellBean) baseCellBean, a2);
                        return;
                    } else {
                        b((M3CellBean) baseCellBean, a3);
                        return;
                    }
                }
                if (baseCellBean instanceof MuiseCellBean) {
                    try {
                        MuiseCellBean muiseCellBean = (MuiseCellBean) baseCellBean;
                        if (this.e.contains(muiseCellBean.type)) {
                            if (listStyle == ListStyle.WATERFALL) {
                                a(muiseCellBean.mMuiseBean.model, a2);
                            } else {
                                b(muiseCellBean.mMuiseBean.model, a3);
                            }
                        }
                    } catch (Exception e) {
                        com.taobao.android.searchbaseframe.util.k.f("ImagePreloadImpl", "图片预加载出错%s", e.getLocalizedMessage());
                    }
                }
            }
        }
    }

    private void a(M3CellBean m3CellBean, int i) {
        String picPath;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82925f7", new Object[]{this, m3CellBean, new Integer(i)});
            return;
        }
        int wfRatio = (int) (i / m3CellBean.getWfRatio());
        if (!StringUtils.isEmpty(m3CellBean.getUprightImage())) {
            picPath = m3CellBean.getUprightImage();
        } else {
            picPath = m3CellBean.getPicPath();
        }
        a(picPath, i, wfRatio, true);
    }

    private void b(M3CellBean m3CellBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b12a1d38", new Object[]{this, m3CellBean, new Integer(i)});
        } else {
            a(m3CellBean.getPicPath(), i, i, true);
        }
    }

    private void a(JSONObject jSONObject, int i) {
        String string;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a78e87b", new Object[]{this, jSONObject, new Integer(i)});
            return;
        }
        double d = 0.6666666666666666d;
        String string2 = jSONObject.getString("uprightImgAspectRatio");
        if (!StringUtils.isEmpty(string2)) {
            try {
                d = Double.parseDouble(string2);
            } catch (Throwable unused) {
            }
        }
        JSONArray jSONArray = jSONObject.getJSONArray("imageInfo");
        if (jSONArray != null && jSONArray.size() > 0) {
            string = jSONArray.getJSONObject(0).getString("uprightImgImage");
            if (StringUtils.isEmpty(string)) {
                string = jSONObject.getString("imageUrl");
                i2 = i;
            }
            i2 = (int) (i / d);
        } else {
            string = jSONObject.getString(nog.PRD_WF_PICURL);
            if (StringUtils.isEmpty(string)) {
                string = jSONObject.getString(nog.PRD_PICURL);
                i2 = i;
            }
            i2 = (int) (i / d);
        }
        a(string, i, i2, false);
    }

    private void b(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1379dfbc", new Object[]{this, jSONObject, new Integer(i)});
        } else {
            a(jSONObject.getString(nog.PRD_PICURL), i, i, false);
        }
    }

    private void a(String str, final int i, final int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fb4d02", new Object[]{this, str, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            com.taobao.android.weex_framework.adapter.d f = com.taobao.android.weex_framework.l.a().f();
            if ((f instanceof com.taobao.search.musie.e) && this.b) {
                ((com.taobao.search.musie.e) f).b(Globals.getApplication(), str, new a(i, i2, z ? this.c : 1.0f), MUSImageQuality.AUTO);
            } else {
                com.taobao.android.weex_framework.l.a().f().a(Globals.getApplication(), str, new d.a() { // from class: com.taobao.search.sf.g.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    private Object d = null;

                    @Override // com.taobao.android.weex_framework.adapter.d.a
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        }
                    }

                    @Override // com.taobao.android.weex_framework.adapter.d.a
                    public void a(Drawable drawable) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                        } else if (!(drawable instanceof com.taobao.search.musie.b)) {
                        } else {
                            ((com.taobao.search.musie.b) drawable).b();
                        }
                    }

                    @Override // com.taobao.android.weex_framework.adapter.d.a
                    public void a(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                        } else {
                            this.d = obj;
                        }
                    }

                    @Override // com.taobao.android.weex_framework.adapter.d.a
                    public Object b() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("43b9c269", new Object[]{this}) : this.d;
                    }

                    @Override // com.taobao.android.weex_framework.adapter.d.a
                    public int c() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : (int) (i * g.a(g.this));
                    }

                    @Override // com.taobao.android.weex_framework.adapter.d.a
                    public int d() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("596b2de", new Object[]{this})).intValue() : (int) (i2 * g.a(g.this));
                    }
                }, MUSImageQuality.AUTO);
            }
        }
    }

    /* loaded from: classes8.dex */
    public class a implements d.a, com.taobao.search.musie.img.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Object b = null;
        private int c;
        private int d;
        private float e;

        static {
            kge.a(1669736972);
            kge.a(1982418204);
            kge.a(-983160102);
        }

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

        public a(int i, int i2, float f) {
            this.c = i;
            this.d = i2;
            this.e = f;
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            } else {
                this.b = obj;
            }
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public Object b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : this.b;
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : (int) (this.c * g.a(g.this));
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public int d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : (int) (this.d * g.a(g.this));
        }

        @Override // com.taobao.search.musie.img.c
        public int l() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue() : (int) (this.c * this.e);
        }

        @Override // com.taobao.search.musie.img.c
        public int m() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue() : (int) (this.d * this.e);
        }
    }
}

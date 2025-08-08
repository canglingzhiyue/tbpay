package com.taobao.search.sf.widgets.headerskin;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.android.tbtheme.kit.f;
import com.taobao.android.tbtheme.kit.g;
import com.taobao.android.tbtheme.kit.j;
import com.taobao.monitor.procedure.v;
import com.taobao.search.common.uikit.SearchUrlImageView;
import com.taobao.search.common.util.l;
import com.taobao.search.common.util.r;
import com.taobao.search.mmd.datasource.bean.SFPromotionBean;
import com.taobao.search.mmd.util.k;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.uikit.TopCropImageView;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import tb.iru;
import tb.ium;
import tb.iur;
import tb.ius;
import tb.kge;
import tb.mxw;
import tb.nom;
import tb.nus;
import tb.nuu;
import tb.nvj;
import tb.nvk;

/* loaded from: classes8.dex */
public class a extends ius<Void, View, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>>> implements nvk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private SFPromotionBean f19494a;
    private d b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private String g;

    static {
        kge.a(157032617);
        kge.a(-608431992);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -211767613) {
            super.onComponentDestroy();
            return null;
        } else if (hashCode != 593843865) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCtxDestroy();
            return null;
        }
    }

    @Override // tb.iup, tb.iui
    public /* bridge */ /* synthetic */ void bindWithData(Object obj) {
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "HeaderSkinWidget";
    }

    public a(Activity activity, ium iumVar, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, iruVar, viewGroup, iurVar);
        boolean z = false;
        this.d = false;
        this.f = false;
        this.g = "search";
        nvj nvjVar = (nvj) getModel().e().b(nvj.CONFIG_KEY);
        if (nvjVar != null) {
            nvjVar.a(this);
        }
        this.c = (getActivity() instanceof nus) && ((nus) getActivity()).y();
        if (this.c && !r.br() && k.a(getActivity())) {
            this.c = false;
        }
        if (((CommonSearchContext) iruVar.f()).isPopupSrp() && r.bQ()) {
            z = true;
        }
        this.f = z;
        if (this.f) {
            a();
            this.g = "tb_mini_search";
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(f.b());
            String string = parseObject.getString(mxw.KEY_SKIN_PIC);
            ThemeData themeData = new ThemeData();
            themeData.skinPic = string;
            themeData.actionbarTextColor = parseObject.getString("actionBarTextColor");
            themeData.actionBarBackgroundColor = parseObject.getString("actionBarBackgroundColor");
            themeData.statusBarStyle = parseObject.getString("statusBarStyle");
            themeData.naviStyle = parseObject.getString(nom.KEY_NAVI_STYLE);
            j.a().a("tb_mini_search", themeData);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v16, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v17, types: [com.taobao.search.sf.uikit.TopCropImageView] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.taobao.search.common.uikit.SearchUrlImageView] */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.widget.FrameLayout] */
    @Override // tb.ius
    public View onCreateView() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        if ((getActivity() instanceof com.taobao.android.searchbaseframe.uikit.a) && ((com.taobao.android.searchbaseframe.uikit.a) getActivity()).aF_()) {
            i = SystemBarDecorator.getStatusBarHeight(getActivity());
        }
        int a2 = l.a(48) + i;
        ?? r1 = 0;
        if (nuu.INSTANCE.a(((CommonSearchContext) getModel().f()).getChannelSrp()) != null) {
            this.e = true;
            r1 = new TopCropImageView(getActivity());
        } else {
            if (this.c) {
                if (this.d) {
                    this.b = new d(a2, getActivity(), this.g);
                    this.b.a();
                    r1 = this.b.c();
                } else {
                    g gVar = new g(this.g, a2);
                    gVar.e = a2;
                    r1 = j.a().a(getActivity(), gVar);
                }
            }
            if (r1 == 0) {
                if (this.d) {
                    this.b = new d(a2, getActivity(), this.g);
                    this.b.b();
                    r1 = this.b.c();
                } else {
                    r1 = new SearchUrlImageView(getActivity());
                    r1.setScaleType(ImageView.ScaleType.CENTER_CROP);
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, a2);
        if (this.d) {
            layoutParams.height = -1;
        }
        r1.setLayoutParams(layoutParams);
        r1.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_IGNORE);
        return r1;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    @Override // tb.iut
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.d();
    }

    @Override // tb.iut
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        d dVar = this.b;
        if (dVar == null) {
            return;
        }
        dVar.d();
    }

    @Override // tb.ius, tb.iup
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
        } else {
            b();
        }
    }

    @Override // tb.nvk
    public void a(SFPromotionBean sFPromotionBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c019e54d", new Object[]{this, sFPromotionBean});
            return;
        }
        this.f19494a = sFPromotionBean;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    private void b() {
        SFPromotionBean sFPromotionBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ?? view = getView();
        if (view == 0 || (sFPromotionBean = this.f19494a) == null) {
            return;
        }
        if (this.e && (view instanceof TopCropImageView)) {
            TopCropImageView topCropImageView = (TopCropImageView) view;
            if (!StringUtils.isEmpty(sFPromotionBean.b)) {
                topCropImageView.setImageUrl(this.f19494a.b);
            } else {
                topCropImageView.setBackgroundColor(this.f19494a.c);
            }
        } else if ((getActivity() instanceof com.taobao.android.xsearchplugin.muise.f) && ((com.taobao.android.xsearchplugin.muise.f) getActivity()).g()) {
            view.setBackgroundResource(R.color.tbsearch_main_card_bg_night);
        } else if (this.b != null) {
            if (!StringUtils.isEmpty(this.f19494a.b)) {
                this.b.a(this.f19494a.b);
            } else if (this.c) {
            } else {
                this.b.a("");
                view.setBackgroundColor(this.f19494a.c);
            }
        } else if (!(view instanceof SearchUrlImageView)) {
        } else {
            SearchUrlImageView searchUrlImageView = (SearchUrlImageView) view;
            if (!StringUtils.isEmpty(this.f19494a.b)) {
                searchUrlImageView.setImageUrl(this.f19494a.b);
                return;
            }
            searchUrlImageView.setImageUrl(null);
            searchUrlImageView.setBackgroundColor(this.f19494a.c);
        }
    }
}

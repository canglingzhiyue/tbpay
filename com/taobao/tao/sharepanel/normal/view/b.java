package com.taobao.tao.sharepanel.normal.view;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.v7.widget.CardView;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.share.globalmodel.f;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.render.PanelWindow;
import com.taobao.share.ui.engine.weex.WeexBizView;
import com.taobao.statistic.TBS;
import com.taobao.tao.util.SpUtils;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import tb.kge;
import tb.nyq;
import tb.nzn;
import tb.nzo;
import tb.oaf;
import tb.obi;
import tb.oui;
import tb.ouk;
import tb.oul;

/* loaded from: classes8.dex */
public class b implements View.OnClickListener, com.taobao.share.ui.engine.render.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String c;

    /* renamed from: a  reason: collision with root package name */
    public PanelWindow.a f21059a;
    public boolean b = true;
    private View d;
    private WeexBizView e;
    private View f;
    private RelativeLayout g;
    private a h;
    private ouk i;
    private WeakReference<Activity> j;
    private LinearLayout k;
    private nzn l;

    public static /* synthetic */ WeexBizView a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexBizView) ipChange.ipc$dispatch("5b1e4bf6", new Object[]{bVar}) : bVar.e;
    }

    public static /* synthetic */ View b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("1c4cf0e4", new Object[]{bVar}) : bVar.f;
    }

    public static /* synthetic */ String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]) : c;
    }

    static {
        kge.a(2144247489);
        kge.a(-1201612728);
        kge.a(1001920456);
        c = b.class.getSimpleName();
    }

    public b(Activity activity, nzn nznVar) {
        this.d = a(activity);
        if (this.d == null) {
            throw new RuntimeException("please actualize menu view");
        }
        this.l = nznVar;
        this.j = new WeakReference<>(activity);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    @Override // com.taobao.share.ui.engine.render.a
    public void a(PanelWindow.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87d403ac", new Object[]{this, aVar});
        } else {
            this.f21059a = aVar;
        }
    }

    @Override // com.taobao.share.ui.engine.render.a
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        View view = this.d;
        if (view == null) {
            return null;
        }
        return view;
    }

    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        WeakReference<Activity> weakReference = this.j;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        Activity activity = this.j.get();
        this.i = oul.a(activity, str);
        ouk oukVar = this.i;
        if (oukVar != null) {
            this.g.addView(oukVar.a(activity));
            TBShareContent j = e.b().j();
            if (j != null) {
                TBS.Ext.commitEvent("Page_Share", 19999, "CardShow", j != null ? j.businessId : "", null, j.businessId + "," + j.templateId + "," + ShareBizAdapter.getInstance().getLogin().a());
            }
        }
        this.h = new a();
        a aVar = this.h;
        if (this.i == null) {
            z2 = false;
        }
        aVar.a(str, z, z2);
        this.h.a(this.l);
        View a2 = this.h.a(activity);
        this.k.removeAllViews();
        this.k.addView(a2);
        RelativeLayout relativeLayout = (RelativeLayout) this.d.findViewById(R.id.share_new_menu_container_layout);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams.setMargins(0, 0, 0, nyq.a(activity, !z ? 132 : 210));
        relativeLayout.setLayoutParams(layoutParams);
        a2.findViewById(R.id.tv_cancel_share_common).setOnClickListener(this);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) this.d.findViewById(R.id.share_new_menu_container_layout);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams.setMargins(0, 0, 0, nyq.a(com.taobao.tao.config.a.a(), 132));
        relativeLayout.setLayoutParams(layoutParams);
        this.h.c();
    }

    public View a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ee74837c", new Object[]{this, activity});
        }
        this.j = new WeakReference<>(activity);
        this.d = LayoutInflater.from(activity).inflate(R.layout.share_new_menu_layout, (ViewGroup) null);
        this.f = this.d.findViewById(R.id.share_new_menu_guide);
        this.g = (RelativeLayout) this.d.findViewById(R.id.share_template_merge_layout);
        this.k = (LinearLayout) this.d.findViewById(R.id.ll_share_bottom);
        return this.d;
    }

    public void a(oui ouiVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8a054b5", new Object[]{this, ouiVar});
            return;
        }
        WeakReference<Activity> weakReference = this.j;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        Activity activity = this.j.get();
        int width = ((WindowManager) activity.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)).getDefaultDisplay().getWidth();
        CardView cardView = (CardView) this.d.findViewById(R.id.share_new_menu_container);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardView.getLayoutParams();
        int i2 = (width * 70) / 375;
        if (!a((Context) activity)) {
            i = nyq.a(activity, 65.0f);
        }
        layoutParams.setMargins(i2, i, i2, 30);
        cardView.setLayoutParams(layoutParams);
    }

    private boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        try {
            if (!l.e(context)) {
                if (!l.f(context)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        PanelWindow.a aVar = this.f21059a;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    public void a(TBShareContent tBShareContent, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dfa34ba", new Object[]{this, tBShareContent, fVar});
            return;
        }
        WeakReference<Activity> weakReference = this.j;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        Activity activity = this.j.get();
        if (fVar == null || StringUtils.isEmpty(fVar.b)) {
            this.e.clear();
            this.e.setVisibility(8);
            return;
        }
        nzo shareWeexSdk = ShareBizAdapter.getInstance().getShareWeexSdk(tBShareContent != null ? tBShareContent.businessId : "");
        if (shareWeexSdk != null) {
            shareWeexSdk.b();
        }
        if (a((Context) activity)) {
            return;
        }
        this.e = new WeexBizView(activity);
        this.e.setLayoutParams(new FrameLayout.LayoutParams(-1, nyq.a(activity, 240.0f)));
        ((RelativeLayout) this.d.findViewById(R.id.share_new_menu_container_layout)).addView(this.e, 0);
        this.e.setVisibility(0);
        a(fVar.b, tBShareContent);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.sharepanel.normal.view.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    TBS.Ext.commitEvent("Button_ClickRules", (Properties) null);
                }
            }
        });
    }

    private void a(String str, TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c169bf7b", new Object[]{this, str, tBShareContent});
            return;
        }
        WeakReference<Activity> weakReference = this.j;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.e.init(this.j.get(), new WeexBizView.a() { // from class: com.taobao.tao.sharepanel.normal.view.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.share.ui.engine.weex.WeexBizView.a
            public void a(WeexBizView weexBizView, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("48e048d7", new Object[]{this, weexBizView, view});
                } else {
                    b.h();
                }
            }

            @Override // com.taobao.share.ui.engine.weex.WeexBizView.a
            public void a(WeexBizView weexBizView) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("98ac8c1b", new Object[]{this, weexBizView});
                    return;
                }
                b.h();
                b.a(b.this).setVisibility(4);
            }

            @Override // com.taobao.share.ui.engine.weex.WeexBizView.a
            public void a(String str2, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("20476513", new Object[]{this, str2, map});
                    return;
                }
                b.h();
                b.a(b.this).clear();
            }
        }, tBShareContent != null ? tBShareContent.businessId : "");
        this.e.setVisibility(0);
        HashMap hashMap = new HashMap();
        if (tBShareContent.extraParams != null) {
            hashMap.putAll(tBShareContent.extraParams);
        }
        hashMap.put("bizID", tBShareContent.businessId);
        hashMap.put("url", tBShareContent.url);
        hashMap.put("imageUrl", tBShareContent.imageUrl);
        hashMap.put("title", tBShareContent.title);
        hashMap.put("desc", tBShareContent.description);
        this.e.render(str, hashMap, null);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (SpUtils.getGuide(com.taobao.tao.config.a.a(), SpUtils.START_GUIDE_NEW) || StringUtils.equals("common", str)) {
            z = false;
        }
        if (!z) {
            return;
        }
        this.f.setVisibility(0);
        TUrlImageView tUrlImageView = (TUrlImageView) this.d.findViewById(R.id.share_new_menu_guide_img_view_new);
        ((LinearLayout) this.d.findViewById(R.id.share_ll_guide)).setVisibility(0);
        String e = obi.b.e();
        if (StringUtils.isEmpty(e)) {
            e = com.taobao.tao.config.a.a().getString(R.string.share_guide_tips);
        }
        tUrlImageView.setImageUrl(e);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.sharepanel.normal.view.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                b.b(b.this).setVisibility(8);
                SpUtils.cacheSaveGuide(SpUtils.START_GUIDE_NEW, true);
            }
        });
    }

    public void a(final oaf oafVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7852184", new Object[]{this, oafVar});
            return;
        }
        Application a2 = com.taobao.tao.config.a.a();
        this.f.setVisibility(0);
        TUrlImageView tUrlImageView = (TUrlImageView) this.d.findViewById(R.id.share_new_menu_guide_img_view);
        ((LinearLayout) this.d.findViewById(R.id.share_ll_guide)).setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) tUrlImageView.getLayoutParams();
        layoutParams.setMargins(nyq.a(a2, 30.0f), 0, nyq.a(a2, 50.0f), nyq.a(a2, 40.0f));
        tUrlImageView.setLayoutParams(layoutParams);
        String d = obi.b.d();
        if (StringUtils.isEmpty(d)) {
            d = "https://img.alicdn.com/tfs/TB1SKoBUG6qK1RjSZFmXXX0PFXa-879-482.png";
        }
        tUrlImageView.setImageUrl(d);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.sharepanel.normal.view.b.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                b.b(b.this).setVisibility(8);
                SpUtils.cacheSaveGuide(SpUtils.SHARE_GUIDE, true);
                oafVar.a();
            }
        });
    }

    public a e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7cfc7b28", new Object[]{this}) : this.h;
    }

    public ouk f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ouk) ipChange.ipc$dispatch("35811954", new Object[]{this}) : this.i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() != R.id.tv_cancel_share_common) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f21059a == null) {
                return;
            }
            d();
            TBShareContent j = e.b().j();
            if (j == null) {
                return;
            }
            String str = j != null ? j.businessId : "";
            TBS.Ext.commitEvent("Page_Share", 19999, "Cancel", str, null, j.businessId + "," + j.templateId + "," + (System.currentTimeMillis() - currentTimeMillis) + "," + ShareBizAdapter.getInstance().getLogin().a());
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        WeexBizView weexBizView = this.e;
        if (weexBizView == null) {
            return;
        }
        weexBizView.clear();
    }
}

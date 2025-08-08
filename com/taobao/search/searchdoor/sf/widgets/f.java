package com.taobao.search.searchdoor.sf.widgets;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.ViewCompat;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.task.Coordinator;
import com.taobao.android.tbtheme.kit.j;
import com.taobao.login4android.api.Login;
import com.taobao.monitor.procedure.o;
import com.taobao.monitor.procedure.s;
import com.taobao.monitor.procedure.v;
import com.taobao.search.common.util.i;
import com.taobao.search.common.util.k;
import com.taobao.search.common.util.l;
import com.taobao.search.common.util.p;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.u;
import com.taobao.search.common.util.x;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintBean;
import com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.uikit.TopCropImageView;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.search.sf.widgets.searchbar.SearchBarTagBean;
import com.taobao.tao.timestamp.TimeStampManager;
import com.taobao.tao.util.MyUrlEncoder;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ag;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.view.TRecyclerView;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tb.fgl;
import tb.fjp;
import tb.gbk;
import tb.ieu;
import tb.isr;
import tb.iud;
import tb.ium;
import tb.iur;
import tb.ius;
import tb.iut;
import tb.kge;
import tb.nnz;
import tb.noa;
import tb.npj;
import tb.npr;
import tb.nqd;
import tb.nqw;
import tb.nrb;
import tb.nrc;
import tb.nrd;
import tb.nre;
import tb.nri;
import tb.nrj;
import tb.nrk;
import tb.nrl;
import tb.nro;
import tb.nrw;
import tb.nsk;
import tb.ntg;
import tb.nul;
import tb.nuu;
import tb.poq;
import tb.tqn;

/* loaded from: classes7.dex */
public class f extends iut implements com.taobao.android.xsearchplugin.muise.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SearchDoorContext f19370a;
    private i b;
    public boolean c;
    public boolean d;
    public boolean e;
    private boolean f;
    private TUrlImageView g;
    private SearchBarWidget h;
    private nqd i;
    private nrl j;
    private nri k;
    private ius l;
    private ViewGroup m;
    private TUrlImageView n;
    private c o;
    private boolean p;
    private String q;
    private volatile List<com.taobao.search.mmd.datasource.bean.c> r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private View x;

    static {
        kge.a(-1729553199);
        kge.a(1351750140);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 217607196) {
            super.onCtxResume();
            return null;
        } else if (hashCode == 299066517) {
            super.onCtxPause();
            return null;
        } else if (hashCode != 593843865) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCtxDestroy();
            return null;
        }
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "SearchDoorWidget";
    }

    public static /* synthetic */ Activity a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("daf0a41e", new Object[]{fVar}) : fVar.mActivity;
    }

    public static /* synthetic */ View a(f fVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d90e9e0a", new Object[]{fVar, view});
        }
        fVar.x = view;
        return view;
    }

    public static /* synthetic */ String a(f fVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dfa85b0c", new Object[]{fVar, str});
        }
        fVar.q = str;
        return str;
    }

    public static /* synthetic */ List a(f fVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("71f3932c", new Object[]{fVar, list});
        }
        fVar.r = list;
        return list;
    }

    public static /* synthetic */ ius a(f fVar, ius iusVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ius) ipChange.ipc$dispatch("154ef42c", new Object[]{fVar, iusVar});
        }
        fVar.l = iusVar;
        return iusVar;
    }

    public static /* synthetic */ void a(f fVar, SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef29ff1", new Object[]{fVar, searchBarHintBean});
        } else {
            fVar.a(searchBarHintBean);
        }
    }

    public static /* synthetic */ ViewGroup b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("fd45114c", new Object[]{fVar}) : fVar.m;
    }

    public static /* synthetic */ void b(f fVar, ius iusVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1647a9f2", new Object[]{fVar, iusVar});
        } else {
            fVar.a(iusVar);
        }
    }

    public static /* synthetic */ boolean c(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9b44bc8c", new Object[]{fVar})).booleanValue() : fVar.v;
    }

    public static /* synthetic */ boolean d(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d50f5e6b", new Object[]{fVar})).booleanValue() : fVar.i();
    }

    public static /* synthetic */ Activity e(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("a036e222", new Object[]{fVar}) : fVar.mActivity;
    }

    public static /* synthetic */ TUrlImageView f(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("947b31b7", new Object[]{fVar}) : fVar.g;
    }

    public static /* synthetic */ TUrlImageView g(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("b3356978", new Object[]{fVar}) : fVar.n;
    }

    public static /* synthetic */ ius h(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ius) ipChange.ipc$dispatch("deff1b5c", new Object[]{fVar}) : fVar.l;
    }

    public static /* synthetic */ Activity i(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("657d2026", new Object[]{fVar}) : fVar.mActivity;
    }

    public static /* synthetic */ String j(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ce41211f", new Object[]{fVar}) : fVar.q;
    }

    public f(Activity activity, ium iumVar) {
        super(activity, iumVar);
        this.f = true;
        this.s = false;
        this.f19370a = new SearchDoorContext();
        this.q = "";
        this.e = false;
        this.t = r.P();
        this.u = false;
        this.v = poq.a(activity);
        this.f19370a.c(true);
        this.w = ((tqn) activity).A();
    }

    public boolean a(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45e4979c", new Object[]{this, handler})).booleanValue();
        }
        l();
        if (this.e) {
            return false;
        }
        this.p = true;
        final ViewGroup viewGroup = (ViewGroup) findView(R.id.tbsearch_searchbar_container);
        viewGroup.getLayoutParams().height = SystemBarDecorator.getStatusBarHeight(getActivity()) + l.a(48.0f);
        b(true);
        this.h = this.o.b(this.mActivity, this, this.f19370a, viewGroup, new iur() { // from class: com.taobao.search.searchdoor.sf.widgets.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iur
            public void b(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                }
            }

            @Override // tb.iur
            public void a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    return;
                }
                viewGroup.getLayoutParams().height = -2;
                viewGroup.addView(view, 0);
            }
        });
        this.h.ensureView();
        this.h.loadHint();
        a(this.h);
        handler.post(new com.taobao.android.searchbaseframe.util.i() { // from class: com.taobao.search.searchdoor.sf.widgets.f.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.searchbaseframe.util.i
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    f.this.b();
                }
            }
        });
        return true;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Activity activity = getActivity();
        this.m = (ViewGroup) findView(R.id.tbsearch_searchdoor);
        this.n = (TUrlImageView) this.m.findViewById(R.id.tbsearch_atmosphere_logo);
        if ((getActivity() instanceof a) && ((a) getActivity()).j()) {
            this.mActivity.runOnUiThread(new com.taobao.android.searchbaseframe.util.i() { // from class: com.taobao.search.searchdoor.sf.widgets.f.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.searchbaseframe.util.i
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (f.a(f.this).isFinishing()) {
                    } else {
                        f.b(f.this).getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.search.searchdoor.sf.widgets.f.5.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                            public void onGlobalLayout() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("df7e7eb3", new Object[]{this});
                                    return;
                                }
                                int width = f.b(f.this).getWidth();
                                int height = f.b(f.this).getHeight();
                                if (width == 0 || height == 0) {
                                    return;
                                }
                                Rect rect = new Rect();
                                f.b(f.this).getWindowVisibleDisplayFrame(rect);
                                int height2 = rect.height() + SystemBarDecorator.getStatusBarHeight(f.this.getActivity());
                                k.d("SearchDoorLayout", "height:" + height + ",visibleHeight:" + height2, new Object[0]);
                                if (height2 < height - 10) {
                                    f.this.f19370a.a(f.this.getActivity(), true);
                                } else {
                                    f.this.f19370a.a(f.this.getActivity(), false);
                                }
                            }
                        });
                    }
                }
            });
        }
        this.g = (TUrlImageView) findView(R.id.imv_searchdoor_header);
        this.g.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_IGNORE);
        this.d = r.aj();
        if (activity instanceof com.taobao.search.sf.c) {
            com.taobao.search.sf.c cVar = (com.taobao.search.sf.c) activity;
            if (cVar.h() && cVar.i()) {
                z = true;
            }
            this.c = z;
        }
        h();
        ntg g = g();
        if (g != null) {
            a(g);
        } else {
            final com.taobao.android.tbtheme.kit.g gVar = new com.taobao.android.tbtheme.kit.g("search", l.a(150));
            this.mActivity.runOnUiThread(new Runnable() { // from class: com.taobao.search.searchdoor.sf.widgets.f.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    final View a2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (!f.c(f.this) || j.e() || j.d()) {
                        a2 = j.a().a(f.this.getActivity(), gVar);
                    } else {
                        a2 = new View(f.this.getActivity());
                        a2.setBackgroundColor(-1);
                        a2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    }
                    if (a2 == null) {
                        return;
                    }
                    f.e(f.this).runOnUiThread(new com.taobao.android.searchbaseframe.util.i() { // from class: com.taobao.search.searchdoor.sf.widgets.f.6.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.searchbaseframe.util.i
                        public void a() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            f.a(f.this, a2);
                            if (f.d(f.this)) {
                                a2.setVisibility(4);
                            }
                            f.b(f.this).addView(a2, 0);
                        }
                    });
                }
            });
        }
        if (!(activity instanceof com.taobao.android.xsearchplugin.muise.f)) {
            return;
        }
        ((com.taobao.android.xsearchplugin.muise.f) activity).a(this);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : !"false".equals(this.f19370a.b("tbsearch_popup_animated"));
    }

    private void a(final ntg ntgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6dc7bd7", new Object[]{this, ntgVar});
            return;
        }
        this.f19370a.a(ntgVar);
        final TopCropImageView topCropImageView = new TopCropImageView(getActivity());
        topCropImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, l.a(150)));
        if (!StringUtils.isEmpty(ntgVar.c)) {
            topCropImageView.setImageUrl(ntgVar.c);
        } else if (!StringUtils.isEmpty(ntgVar.d)) {
            topCropImageView.setBackgroundColor(com.taobao.search.mmd.util.d.a(ntgVar.d, 0));
        }
        topCropImageView.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_IGNORE);
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.taobao.search.searchdoor.sf.widgets.f.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                f.b(f.this).addView(topCropImageView, 0);
                if (StringUtils.isEmpty(ntgVar.e)) {
                    return;
                }
                f.g(f.this).setImageUrl(ntgVar.e);
            }
        });
    }

    private ntg g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ntg) ipChange.ipc$dispatch("3d324617", new Object[]{this});
        }
        String f = this.f19370a.f();
        if (StringUtils.isEmpty(f)) {
            return null;
        }
        String a2 = this.f19370a.a("pageCfg");
        if (StringUtils.isEmpty(a2)) {
            a2 = this.f19370a.a("g_pageCfg");
        }
        if (StringUtils.isEmpty(a2)) {
            nuu.INSTANCE.b(f);
            return null;
        }
        JSONObject parseObject = JSON.parseObject(a2);
        if (parseObject == null) {
            nuu.INSTANCE.b(f);
            return null;
        }
        ntg a3 = ntg.a(parseObject.getJSONObject("tabAtmosphere"));
        if (a3 == null) {
            nuu.INSTANCE.b(f);
            return null;
        }
        nuu.INSTANCE.a(f, a3);
        return a3;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        subscribeEvent(this);
        l();
        j();
        postEvent(nre.c.a());
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        postEvent(nqw.c.a());
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (!this.p || this.o == null) {
        } else {
            if (this.i == null) {
                final ViewGroup viewGroup = (ViewGroup) findView(R.id.tbsearch_activate_container);
                if (i()) {
                    viewGroup.setBackgroundResource(R.drawable.tbsearch_activate_bg_night);
                }
                this.i = this.o.a(this.mActivity, this, this.f19370a, viewGroup, new iur() { // from class: com.taobao.search.searchdoor.sf.widgets.f.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.iur
                    public void a(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                        } else {
                            viewGroup.addView(view);
                        }
                    }

                    @Override // tb.iur
                    public void b(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                        } else {
                            viewGroup.removeView(view);
                        }
                    }
                });
                this.i.ensureView();
                this.i.d();
            }
            if (z) {
                this.i.h();
            } else {
                this.i.b();
            }
            nqd nqdVar = this.i;
            if (nqdVar == null) {
                return;
            }
            a(nqdVar);
        }
    }

    public void onEventMainThread(nqw.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e95b8fe1", new Object[]{this, dVar});
        } else if (!this.t) {
        } else {
            if (dVar.f31672a != null) {
                a(dVar.f31672a.o, dVar.f31672a.p, dVar.f31672a.q);
            } else {
                a(false, false, (JSONObject) null);
            }
        }
    }

    private void a(final ius iusVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee67ccb1", new Object[]{this, iusVar});
            return;
        }
        iusVar.ensureView();
        getActivity().runOnUiThread(new com.taobao.android.searchbaseframe.util.i() { // from class: com.taobao.search.searchdoor.sf.widgets.f.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.searchbaseframe.util.i
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    iusVar.attachToContainer();
                }
            }
        });
    }

    private boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : (getActivity() instanceof com.taobao.android.xsearchplugin.muise.f) && ((com.taobao.android.xsearchplugin.muise.f) getActivity()).g();
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        final ViewGroup viewGroup = (ViewGroup) findView(R.id.tbsearch_searchbar_container);
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.taobao.search.searchdoor.sf.widgets.f.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (f.d(f.this)) {
                    f.f(f.this).setBackgroundResource(R.color.tbsearch_main_card_bg_night);
                } else {
                    ViewCompat.setBackground(f.f(f.this), null);
                }
            }
        });
        if (this.h == null) {
            this.h = this.o.b(this.mActivity, this, this.f19370a, viewGroup, new iur() { // from class: com.taobao.search.searchdoor.sf.widgets.f.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iur
                public void b(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                    }
                }

                @Override // tb.iur
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    } else {
                        viewGroup.addView(view, 0);
                    }
                }
            });
            this.h.initSearchHint();
            a(this.h);
        }
        k();
        final ViewGroup viewGroup2 = (ViewGroup) findView(R.id.tbsearch_suggest_container);
        this.j = new nro(this.mActivity, this, this.f19370a, viewGroup2, new iur() { // from class: com.taobao.search.searchdoor.sf.widgets.f.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iur
            public void b(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                }
            }

            @Override // tb.iur
            public void a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    return;
                }
                viewGroup2.addView(view);
                if (!f.d(f.this)) {
                    return;
                }
                view.setBackgroundResource(R.color.tbsearch_main_card_bg_night);
            }
        });
        a(this.j);
        final ViewGroup viewGroup3 = (ViewGroup) findView(R.id.tbsearch_realtime_speech_container);
        if (!this.t) {
            a(false, false, (JSONObject) null);
        }
        this.k = new nri(getActivity(), this, this.f19370a, viewGroup3, new iur() { // from class: com.taobao.search.searchdoor.sf.widgets.f.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iur
            public void b(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                }
            }

            @Override // tb.iur
            public void a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    return;
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 8388693;
                layoutParams.bottomMargin = l.a(10);
                layoutParams.rightMargin = l.a(15);
                viewGroup3.addView(view, layoutParams);
            }
        });
        a(this.k);
        getActivity().runOnUiThread(new com.taobao.android.searchbaseframe.util.i() { // from class: com.taobao.search.searchdoor.sf.widgets.f.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.searchbaseframe.util.i
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    new com.taobao.android.searchbaseframe.chitu.b(f.this.getActivity(), f.this, viewGroup3, new iur() { // from class: com.taobao.search.searchdoor.sf.widgets.f.12.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.iur
                        public void b(View view) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("91037249", new Object[]{this, view});
                            }
                        }

                        @Override // tb.iur
                        public void a(View view) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("9501e36a", new Object[]{this, view});
                            } else {
                                viewGroup3.addView(view);
                            }
                        }
                    });
                }
            }
        });
    }

    private void a(boolean z, final boolean z2, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb82b08", new Object[]{this, new Boolean(z), new Boolean(z2), jSONObject});
        } else if (this.u) {
        } else {
            AccessibilityManager accessibilityManager = (AccessibilityManager) getActivity().getSystemService("accessibility");
            if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return;
            }
            this.u = true;
            final ViewGroup viewGroup = (ViewGroup) findView(R.id.tbsearch_realtime_speech_container);
            viewGroup.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_IGNORE);
            if (!com.alibaba.ability.localization.b.b()) {
                return;
            }
            if (this.c && this.d) {
                return;
            }
            if (z) {
                com.alibaba.android.split.k.a().c(getActivity(), "taowise_android_aar");
                com.taobao.search.sf.remote.c.INSTANCE.b("voice_search", new com.taobao.search.sf.remote.d(this.mActivity, this, this.f19370a.c(), viewGroup, new iur() { // from class: com.taobao.search.searchdoor.sf.widgets.f.13
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.iur
                    public void b(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                        }
                    }

                    @Override // tb.iur
                    public void a(final View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                        } else {
                            f.this.getActivity().runOnUiThread(new com.taobao.android.searchbaseframe.util.i() { // from class: com.taobao.search.searchdoor.sf.widgets.f.13.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.taobao.android.searchbaseframe.util.i
                                public void a() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                    } else {
                                        viewGroup.addView(view);
                                    }
                                }
                            });
                        }
                    }
                }), new com.taobao.search.sf.remote.b() { // from class: com.taobao.search.searchdoor.sf.widgets.f.14
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.search.sf.remote.b
                    public void a(ius<?, ? extends View, ?> iusVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ee67ccb1", new Object[]{this, iusVar});
                            return;
                        }
                        f.a(f.this, iusVar);
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("newEntrance", (Object) Boolean.valueOf(z2));
                            jSONObject2.put("pageInfo", (Object) jSONObject);
                            iusVar.bindWithData(jSONObject2);
                        } catch (Exception unused) {
                        }
                        f fVar = f.this;
                        f.b(fVar, f.h(fVar));
                    }
                });
                return;
            }
            com.taobao.search.sf.remote.c.INSTANCE.a(u.t() ? "voiceSearch" : ag.SOURCE_SPEECH, new com.taobao.search.sf.remote.d(this.mActivity, this, this.f19370a.c(), viewGroup, new iur() { // from class: com.taobao.search.searchdoor.sf.widgets.f.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iur
                public void b(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                    }
                }

                @Override // tb.iur
                public void a(final View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    } else {
                        f.this.getActivity().runOnUiThread(new com.taobao.android.searchbaseframe.util.i() { // from class: com.taobao.search.searchdoor.sf.widgets.f.15.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.android.searchbaseframe.util.i
                            public void a() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                } else {
                                    viewGroup.addView(view);
                                }
                            }
                        });
                    }
                }
            }), new com.taobao.search.sf.remote.b() { // from class: com.taobao.search.searchdoor.sf.widgets.f.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.search.sf.remote.b
                public void a(ius<?, ? extends View, ?> iusVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ee67ccb1", new Object[]{this, iusVar});
                        return;
                    }
                    f.a(f.this, iusVar);
                    iusVar.bindWithData(jSONObject);
                    f fVar = f.this;
                    f.b(fVar, f.h(fVar));
                }
            });
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        b(false);
        this.p = false;
    }

    private void l() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (this.o != null && this.w) {
        } else {
            this.f19370a.a(com.taobao.search.mmd.util.c.a(this.mActivity.getIntent()));
            this.f19370a.a(noa.KEY_TB_2024, String.valueOf(this.v));
            if (StringUtils.isEmpty(this.f19370a.a(noa.KEY_SEARCH_ELDER_HOME_OPEN))) {
                this.f19370a.a(noa.KEY_SEARCH_ELDER_HOME_OPEN, String.valueOf(com.taobao.search.mmd.util.j.INSTANCE.b()));
            }
            this.e = "true".equals(this.f19370a.a(noa.KEY_SEARCH_ELDER_HOME_OPEN));
            o();
            this.f19370a.a(noa.KEY_GRAY_HAIR, String.valueOf(this.e));
            c a2 = d.a(this.f19370a);
            if (this.o != a2) {
                z = true;
            }
            this.p = z;
            this.o = a2;
            if (r.cJ()) {
                this.f19370a.c("from");
            }
            o();
            m();
        }
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            this.mActivity.runOnUiThread(new Runnable() { // from class: com.taobao.search.searchdoor.sf.widgets.f.17
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        s.f18233a.a(o.f18229a.a(f.i(f.this)).c()).a(noa.KEY_GRAY_HAIR, String.valueOf(f.this.e));
                    }
                }
            });
        }
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        String n = this.f19370a.n();
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", n);
        hashMap.putAll(this.f19370a.o());
        hashMap.put("channelSrp", this.f19370a.f());
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getActivity(), hashMap);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.w) {
            this.o = null;
        }
        this.f19370a.d(true);
        UTAnalytics.getInstance().getDefaultTracker().skipPageBack(getActivity());
        l();
        this.f19370a.i("srp");
        this.f19370a.a(true);
        postEvent(nre.c.a());
    }

    public void onEventMainThread(nrj.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("813b3cd", new Object[]{this, fVar});
        } else {
            m();
        }
    }

    public void onEventMainThread(nrj.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("811e251", new Object[]{this, bVar});
        } else if (this.b == null) {
        } else {
            if (bVar.a()) {
                this.s = false;
                this.b.d();
                return;
            }
            this.s = true;
            this.b.b();
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            Coordinator.execute(new com.taobao.android.searchbaseframe.util.i() { // from class: com.taobao.search.searchdoor.sf.widgets.f.18
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.searchbaseframe.util.i
                public void a() {
                    com.taobao.search.mmd.datasource.bean.c a2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    String z = r.z();
                    if (StringUtils.equals(z, f.j(f.this))) {
                        return;
                    }
                    f.a(f.this, z);
                    ArrayList arrayList = new ArrayList();
                    JSONArray jSONArray = null;
                    try {
                        jSONArray = JSON.parseArray(f.j(f.this));
                    } catch (Throwable unused) {
                        q.b("SearchDoorWidget", "interceptConfigParseFailed:" + f.j(f.this));
                    }
                    if (jSONArray == null) {
                        return;
                    }
                    for (int i = 0; i < jSONArray.size(); i++) {
                        Object obj = jSONArray.get(i);
                        if ((obj instanceof JSONObject) && (a2 = com.taobao.search.mmd.datasource.bean.c.a((JSONObject) obj)) != null) {
                            arrayList.add(a2);
                        }
                    }
                    f.a(f.this, arrayList);
                }
            });
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
        destroyComponent();
        if (!(getActivity() instanceof com.taobao.android.xsearchplugin.muise.f)) {
            return;
        }
        ((com.taobao.android.xsearchplugin.muise.f) getActivity()).b(this);
    }

    @Override // tb.iut
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        n();
        m();
        if (this.f) {
            this.f19370a.i("homepage");
            this.f = false;
            return;
        }
        if (!this.f19370a.l()) {
            this.f19370a.i("srpBack");
            nrl nrlVar = this.j;
            if (nrlVar != null && nrlVar.getView() != 0 && ((TRecyclerView) this.j.getView()).getVisibility() == 0) {
                this.f19370a.a(true);
                this.j.a(this.h.getSearchEditContent(), this.f19370a.i());
            }
        }
        if (!StringUtils.isEmpty(this.f19370a.f())) {
            return;
        }
        f();
    }

    @Override // tb.iut
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
        } else {
            super.onCtxPause();
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        postEvent(nre.g.a(z, this.f19370a.j()));
        this.f19370a.c(false);
        this.f19370a.d(false);
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            q.f("SearchDoorWidget", "关键词为空，不进行操作");
            return false;
        } else if (x.a(str, this.mActivity)) {
            this.f19370a.d(str);
            return true;
        } else {
            return d(str);
        }
    }

    public Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        postEvent(nre.a.a());
        if (StringUtils.isEmpty(str)) {
            q.f("SearchDoorWidget", "要搜索的内容为空，不进行操作");
            return hashMap;
        }
        this.f19370a.d(str);
        hashMap.put("q", str);
        return hashMap;
    }

    public void a(String str, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a5f021", new Object[]{this, str, map, new Boolean(z)});
        } else {
            a(str, map, z, (JSONObject) null);
        }
    }

    private void p() {
        SharedPreferences a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        String nick = Login.getNick();
        if (StringUtils.isEmpty(nick) || (a2 = com.taobao.search.common.util.s.a()) == null) {
            return;
        }
        SharedPreferences.Editor edit = a2.edit();
        edit.putBoolean(nick + "_hintUsed", true).apply();
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        long s = this.f19370a.s();
        if (s == 0 || System.currentTimeMillis() - s > 10000) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("hintq", str);
        hashMap.put(com.taobao.search.common.util.k.KEY_SUGGEST_RN, this.f19370a.g("all"));
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(SearchDoorActivity.PAGE_NAME, 2101, "hintq_guide_click", "", "", hashMap).build());
    }

    public void a(String str, Map<String, String> map, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("979e92ef", new Object[]{this, str, map, new Boolean(z), jSONObject});
            return;
        }
        if (z) {
            p();
            c(str);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("query", str);
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getActivity(), hashMap);
        map.putAll(this.f19370a.c());
        map.put("search_action", noa.VALUE_SEARCH_ACTION_ZD);
        String i = r.m() ? this.f19370a.i() : this.f19370a.e("");
        if (!StringUtils.isEmpty(i)) {
            map.put("tab", i);
        }
        a(str, z, i);
        i.b.C0759b.c();
        i.b.C0759b.a(i.b.MEASURE_WHOLE);
        HashMap hashMap2 = new HashMap();
        if (e()) {
            map.put(noa.KEY_TB_2024, String.valueOf(this.v));
            a(map, z, i, hashMap2);
        }
        if (jSONObject != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.add(jSONObject);
            map.put(com.taobao.search.common.util.k.KEY_SEARCH_BAR_TAG, jSONArray.toJSONString());
        }
        String q = this.f19370a.q();
        if (!StringUtils.isEmpty(q)) {
            map.put("lastQ", q);
        }
        this.f19370a.j(str);
        hashMap2.put("spm", this.f19370a.n());
        if (!a(str, map)) {
            p.a(map, (Context) this.mActivity, i, true, (Map<String, String>) hashMap2, this.f19370a.t());
        }
        postEvent(nre.e.a(str));
    }

    private void a(Map<String, String> map, boolean z, String str, Map<String, String> map2) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f05e704", new Object[]{this, map, new Boolean(z), str, map2});
            return;
        }
        com.taobao.search.refactor.j b = b(map);
        b.addParam("schemaType", "auction");
        if (z) {
            SearchDoorContext searchDoorContext = this.f19370a;
            if (StringUtils.isEmpty(str)) {
                str = "all";
            }
            SearchBarHintBean f = searchDoorContext.f(str);
            if (f != null && f.isAdvHint()) {
                Map<String, String> clickUrlParams = f.advInfo.getClickUrlParams();
                if (clickUrlParams != null) {
                    map2.putAll(clickUrlParams);
                }
                if (f.advInfo.getRequestParams() != null && !f.advInfo.getRequestParams().isEmpty()) {
                    for (Map.Entry<String, String> entry : f.advInfo.getRequestParams().entrySet()) {
                        b.setParam(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
        if (!com.taobao.android.jarviswe.a.a().c()) {
            b.setParam(noa.KEY_JARVIS_DISABLED, String.valueOf(true));
            map.put(noa.KEY_JARVIS_DISABLED, String.valueOf(true));
        }
        b.doNewSearch();
        b.setParam("schemaType", "all");
        if (b instanceof com.taobao.search.refactor.j) {
            a2 = nnz.a().a(b);
        } else {
            a2 = nnz.a().a(b);
        }
        map.put(com.taobao.search.common.util.k.KEY_DATASOURCE_TOKEN, a2);
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : !"cart_search".equals(this.f19370a.f());
    }

    private boolean a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20476517", new Object[]{this, str, map})).booleanValue();
        }
        if (!"cart_search".equals(this.f19370a.f())) {
            return false;
        }
        if (!map.containsKey(ieu.sQueryParamsKeyDefaultFilterItem)) {
            map.put(ieu.sQueryParamsKeyDefaultFilterItem, "xsearch_kwd_" + str);
        }
        Nav.from(getActivity()).toUri(com.taobao.android.searchbaseframe.util.r.a("https://main.m.taobao.com/cart/index.html?feedFlowType=xsearch&hasback=true", map));
        return true;
    }

    private boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        List<com.taobao.search.mmd.datasource.bean.c> list = this.r;
        if (list != null && !list.isEmpty()) {
            long currentTimeStamp = TimeStampManager.instance().getCurrentTimeStamp();
            for (com.taobao.search.mmd.datasource.bean.c cVar : list) {
                if (currentTimeStamp >= cVar.f19163a && currentTimeStamp <= cVar.b) {
                    for (String str2 : cVar.c) {
                        if (StringUtils.equals(str2, str)) {
                            e(str);
                            Nav.from(getActivity()).toUri(cVar.d);
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    private void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("q", str);
        arrayMap.put("time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(new Date(TimeStampManager.instance().getCurrentTimeStamp())));
        com.taobao.search.mmd.util.e.a("QueryIntercept", (ArrayMap<String, String>) arrayMap);
    }

    private com.taobao.search.refactor.j b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.search.refactor.j) ipChange.ipc$dispatch("20c91f58", new Object[]{this, map});
        }
        CommonSearchContext fromMap = CommonSearchContext.fromMap(map);
        fromMap.init();
        return com.taobao.search.sf.datasource.e.a(true, fromMap, getCore());
    }

    private void a(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b0622c", new Object[]{this, str, new Boolean(z), str2});
            return;
        }
        if (StringUtils.isEmpty(str2)) {
            str2 = "all";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("use_hintq", z ? Constants.VAL_YES : "no");
        hashMap.put("search_text", str);
        hashMap.put("tab", str2);
        SearchBarHintBean f = this.f19370a.f(str2);
        if (f != null) {
            hashMap.put("display_text", f.displayText);
            if (!StringUtils.isEmpty(f.iconName)) {
                hashMap.put(ChangeAppIconBridge.KEY_ICONNAME, f.iconName);
            }
            if (f.utParams != null && !f.utParams.isEmpty()) {
                hashMap.putAll(f.utParams);
            }
        }
        hashMap.put(com.taobao.search.common.util.k.KEY_SUGGEST_RN, this.f19370a.g(str2));
        String f2 = this.f19370a.f();
        if (!StringUtils.isEmpty(f2)) {
            hashMap.put("channelSrp", f2);
        }
        hashMap.put("item_id", this.f19370a.a(fgl.TARGETITEMID));
        com.taobao.search.mmd.util.e.a(ag.SEARCH_START_SEARCH, hashMap);
        if (!z || f == null || !f.isAdvHint()) {
            return;
        }
        AlimamaAdvertising.instance().buildTanxClickTracking(getActivity().getApplication(), f.advInfo.getClickParams()).a(noa.RUNTIME_PERMISSION_REQUEST_BIZ_NAME).a();
    }

    private String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd890709", new Object[]{this, str});
        }
        String b = this.f19370a.b("from", "");
        if (StringUtils.isEmpty(b)) {
            return str;
        }
        if (StringUtils.isEmpty(str)) {
            return b;
        }
        return str + "-" + b;
    }

    private void a(String str, SearchBarHintBean searchBarHintBean) {
        String str2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d6ff89", new Object[]{this, str, searchBarHintBean});
            return;
        }
        StringUtils.equals(str, com.taobao.android.searchbaseframe.chitu.e.SIGNAL);
        String e = this.j.e();
        if (!StringUtils.isEmpty(e)) {
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("suggestRN", e);
            com.taobao.search.mmd.util.e.a(ag.SEARCH_ENTRANCE_CLICK, (ArrayMap<String, String>) arrayMap);
        } else {
            com.taobao.search.mmd.util.e.a(ag.SEARCH_ENTRANCE_CLICK);
        }
        if (!StringUtils.isEmpty(str) || searchBarHintBean == null || StringUtils.isEmpty(searchBarHintBean.searchText)) {
            z = false;
        } else {
            str = searchBarHintBean.searchText;
        }
        if (StringUtils.isEmpty(str) || b(str)) {
            return;
        }
        Map<String, String> a2 = a(str);
        if (z && searchBarHintBean.extraParams != null) {
            a2.putAll(searchBarHintBean.extraParams);
        }
        if (z) {
            str2 = searchBarHintBean.hasRefresh ? "hintq_search_door" : "hintq";
        } else {
            str2 = "input";
        }
        a2.put("from", f(str2));
        a(str, a2, z);
        com.taobao.search.mmd.util.e.a(noa.VALUE_SEARCH_ACTION_ZD);
    }

    public void a(nrw.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62036207", new Object[]{this, bVar});
        } else if (StringUtils.isEmpty(bVar.f31703a)) {
        } else {
            this.h.hideSoftKeyBoard();
            Nav.from(this.mActivity).toUri(bVar.f31703a);
        }
    }

    public void a(nrw.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6202eda8", new Object[]{this, aVar});
            return;
        }
        SearchBarWidget searchBarWidget = this.h;
        if (searchBarWidget == null) {
            return;
        }
        searchBarWidget.setSearchWord(aVar.f31702a);
        ArrayMap arrayMap = new ArrayMap(1);
        arrayMap.put("type", nsk.CONVERTER_NAME);
        com.taobao.search.mmd.util.e.a("AppendSuggest", (ArrayMap<String, String>) arrayMap);
    }

    private void a(nrk.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d88c634", new Object[]{this, aVar});
            return;
        }
        String str = aVar.f31692a;
        String str2 = aVar.b;
        if (b(str)) {
            return;
        }
        Map<String, String> a2 = a(str);
        a2.put("from", f(this.e ? k.b.TYPE_ELDER_OLD_VOICE : "voice"));
        a2.put("asrrn", str2);
        a(str, a2, false);
    }

    private void a(nqw.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1cb267", new Object[]{this, aVar});
            return;
        }
        ActivateBean activateBean = aVar.f31670a;
        int i = aVar.b;
        String str = activateBean.keyword;
        if (b(str)) {
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("tab", this.f19370a.i());
        arrayMap.put("q", str);
        if (!StringUtils.isEmpty(aVar.c)) {
            arrayMap.put(com.taobao.search.common.util.k.KEY_SUGGEST_RN, aVar.c);
        }
        arrayMap.put("channelSrp", this.f19370a.f());
        arrayMap.put("digou_flag", "true".equals(this.f19370a.b(noa.KEY_GOOD_PRICE)) ? "1" : "0");
        com.taobao.search.mmd.util.e.a("Activate_" + activateBean.groupType, (ArrayMap<String, String>) arrayMap);
        Map<String, String> a2 = a(str);
        a2.put("from", f(activateBean.groupType));
        a2.put("subtype", activateBean.subType);
        a2.put("index", String.valueOf(i));
        a2.put("sugg", MyUrlEncoder.encod(this.h.getSearchEditContent(), "utf-8") + "_" + i + "_1");
        if (!StringUtils.isEmpty(activateBean.suggestRn)) {
            a2.put(com.taobao.search.common.util.k.KEY_SUGGEST_RN, activateBean.suggestRn);
        }
        if (activateBean.searchparams != null) {
            a2.putAll(activateBean.searchparams);
        }
        a(str, a2, false);
    }

    public void onEventMainThread(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdad20cb", new Object[]{this, hVar});
            return;
        }
        Map<String, String> a2 = a(hVar.a());
        a2.put("from", "hintq_under_search_door");
        a(hVar.a(), a2, false);
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            q.b("SearchDoorWidget", "dynamicNavToSrp:paramsObject为空");
        } else {
            String string = jSONObject.getString("q");
            if (b(string)) {
                return;
            }
            Map<String, String> a2 = a(string);
            for (String str : jSONObject.keySet()) {
                if (!StringUtils.isEmpty(str)) {
                    String string2 = jSONObject.getString(str);
                    if (!StringUtils.isEmpty(string2)) {
                        a2.put(str, string2);
                    }
                }
            }
            a2.put("from", f(jSONObject.getString("from")));
            Object remove = jSONObject.remove("tag");
            JSONObject jSONObject2 = null;
            if (remove instanceof JSONObject) {
                jSONObject2 = (JSONObject) remove;
                SearchBarTagBean fromJson = SearchBarTagBean.fromJson(jSONObject2);
                for (Map.Entry<String, String> entry : fromJson.getParams().entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!StringUtils.isEmpty(key) && !StringUtils.isEmpty(value)) {
                        a2.put(key, value);
                    }
                }
                if (!StringUtils.isEmpty(fromJson.getQ())) {
                    string = string + " " + fromJson.getQ();
                    a2.put(noa.KEY_TAG_SEARCH_KEYWORD, string);
                }
            }
            a(string, a2, false, jSONObject2);
        }
    }

    private void a(nrw.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62044ac5", new Object[]{this, dVar});
            return;
        }
        String str = dVar.f31704a;
        String searchEditContent = this.h.getSearchEditContent();
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("query", searchEditContent);
        arrayMap.put(gbk.TYPE_SELECTED, str);
        arrayMap.put("sug_content", dVar.d);
        if (!StringUtils.isEmpty(dVar.b)) {
            arrayMap.put(com.taobao.search.common.util.k.KEY_SUGGEST_RN, dVar.b);
        }
        String b = this.f19370a.b("searchDoorFrom", "");
        if (StringUtils.isEmpty(b)) {
            b = "shouye";
        }
        arrayMap.put("stats_show", b);
        arrayMap.put("tab", this.f19370a.i());
        com.taobao.search.mmd.util.e.a("SearchSuggest", (ArrayMap<String, String>) arrayMap);
        if (b(str)) {
            return;
        }
        Map<String, String> a2 = a(str);
        if (!StringUtils.isEmpty(dVar.b)) {
            a2.put(com.taobao.search.common.util.k.KEY_SUGGEST_RN, dVar.b);
        }
        if (dVar.c != null) {
            a2.putAll(dVar.c);
        }
        a(str, a2, false);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!com.alibaba.ability.localization.b.b() || !r.aN()) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("access_from", "search_door");
            String f = this.f19370a.f();
            if (!StringUtils.isEmpty(f)) {
                hashMap.put("channelSrp", f);
            }
            String a2 = this.f19370a.a("searchBoxTestParam");
            if (!StringUtils.isEmpty(a2)) {
                hashMap.put("searchBoxTestParam", a2);
            }
            String nick = Login.getNick();
            if (!StringUtils.isEmpty(nick)) {
                hashMap.put(RVStartParams.KEY_URL_SHORT, nick);
            }
            String userId = Login.getUserId();
            if (!StringUtils.isEmpty(userId)) {
                hashMap.put("user_id", userId);
            }
            c(hashMap);
            hashMap.put(noa.KEY_GOOD_PRICE, this.f19370a.b(noa.KEY_GOOD_PRICE));
            new npr.b().a(new nrd(hashMap)).a(new nrc()).a(new nul("BGWords")).a().b().c().a(new iud<nrb>() { // from class: com.taobao.search.searchdoor.sf.widgets.f.19
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iud
                public void a(nrb nrbVar) {
                    SearchBarHintBean f2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f6be06fa", new Object[]{this, nrbVar});
                    } else if (nrbVar == null || nrbVar.a() == null || nrbVar.a().isEmpty() || nrbVar.a().get(0) == null || (f2 = f.this.f19370a.f("all")) == null) {
                    } else {
                        f2.updateHint(nrbVar);
                        f2.handleMultiHint();
                        f.this.postEvent(nrj.e.a(f2));
                        f.a(f.this, f2);
                    }
                }
            }, new npj("bgwords") { // from class: com.taobao.search.searchdoor.sf.widgets.f.20
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass20 anonymousClass20, String str, Object... objArr) {
                    if (str.hashCode() == -73738099) {
                        super.a((Throwable) objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // tb.npj, tb.iud
                public void a(Throwable th) throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                        return;
                    }
                    super.a(th);
                    TLogTracker.a("Unknown", "-1", th.getMessage());
                    AppMonitor.Alarm.commitFail("Page_SearchItemList", "SearchDoorMain", fjp.ERROR_CODE_CONTROL_SCROLL, th.getMessage());
                }
            });
        }
    }

    private void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
        } else if (map == null || !r.aL()) {
        } else {
            String a2 = com.taobao.search.common.util.b.c().a(com.taobao.search.common.util.b.INVOKE_ID_SEARCH_DOOR_BG_WORD, SearchDoorActivity.PAGE_NAME, Integer.valueOf(r.aM()));
            if (StringUtils.isEmpty(a2)) {
                return;
            }
            map.put("bxFeature", a2);
        }
    }

    public void onEventMainThread(nrj.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81256b0", new Object[]{this, cVar});
        } else {
            a(cVar.f31689a, cVar.b);
        }
    }

    public void onEventMainThread(nrw.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e406e05", new Object[]{this, aVar});
        } else {
            a(aVar);
        }
    }

    public void onEventMainThread(nrw.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e40e264", new Object[]{this, bVar});
        } else {
            a(bVar);
        }
    }

    public void onEventMainThread(nrk.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c64691", new Object[]{this, aVar});
        } else {
            a(aVar);
        }
    }

    public void onEventMainThread(nqw.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e95a32c4", new Object[]{this, aVar});
        } else {
            a(aVar);
        }
    }

    public void onEventMainThread(isr.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4339768e", new Object[]{this, cVar});
        } else if (!"goToSrp".equals(cVar.f29283a)) {
        } else {
            a(cVar.b);
        }
    }

    public void onEventMainThread(nrw.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e41cb22", new Object[]{this, dVar});
        } else {
            a(dVar);
        }
    }

    public void onEventMainThread(nrj.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("812cb0f", new Object[]{this, dVar});
        } else if (this.b != null) {
        } else {
            a(dVar.f31690a);
        }
    }

    private void a(SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e043b093", new Object[]{this, searchBarHintBean});
            return;
        }
        i iVar = this.b;
        if (iVar != null) {
            iVar.destroyAndRemoveFromParent();
        }
        if (searchBarHintBean.multiSearchText == null) {
            return;
        }
        final ViewGroup viewGroup = (ViewGroup) findView(R.id.tbsearch_searchbar_container);
        this.b = new i(getActivity(), this, this.f19370a, viewGroup, new iur() { // from class: com.taobao.search.searchdoor.sf.widgets.f.21
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iur
            public void a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                } else {
                    viewGroup.addView(view);
                }
            }

            @Override // tb.iur
            public void b(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                } else {
                    com.taobao.search.mmd.util.k.a(view);
                }
            }
        });
        this.b.attachToContainer();
        this.b.a(searchBarHintBean);
        if (!this.s) {
            return;
        }
        this.b.b();
    }

    @Override // com.taobao.android.xsearchplugin.muise.e
    public void onHitDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95f2594", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) findView(R.id.tbsearch_activate_container);
        if (viewGroup != null) {
            viewGroup.setBackgroundResource(R.drawable.tbsearch_activate_bg_night);
        }
        TUrlImageView tUrlImageView = this.g;
        if (tUrlImageView != null) {
            tUrlImageView.setBackgroundResource(R.color.tbsearch_main_card_bg_night);
        }
        nrl nrlVar = this.j;
        if (nrlVar != null && nrlVar.getView() != 0) {
            ((TRecyclerView) this.j.getView()).setBackgroundResource(R.color.tbsearch_main_card_bg_night);
        }
        View view = this.x;
        if (view == null) {
            return;
        }
        view.setVisibility(4);
    }
}

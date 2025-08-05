package tb;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.chitu.b;
import com.taobao.search.common.util.u;
import com.taobao.search.mmd.util.e;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.shop.widget.bar.d;
import com.taobao.search.sf.remote.c;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ag;
import com.ut.mini.UTAnalytics;
import java.util.Map;
import tb.nre;
import tb.nrj;
import tb.nrk;

/* loaded from: classes8.dex */
public class nsd extends iun<FrameLayout, nsc, nsb, Void, Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private d f31710a;
    private nrm b;
    private ius c;
    private nsh d;
    private b e;
    private boolean f;

    static {
        kge.a(-1375834873);
    }

    public static /* synthetic */ Object ipc$super(nsd nsdVar, String str, Object... objArr) {
        if (str.hashCode() == 299066517) {
            super.onCtxPause();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ ViewGroup.MarginLayoutParams a(nsd nsdVar, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.MarginLayoutParams) ipChange.ipc$dispatch("553f5ffa", new Object[]{nsdVar, new Boolean(z)}) : nsdVar.a(z);
    }

    public static /* synthetic */ ius a(nsd nsdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ius) ipChange.ipc$dispatch("1579ed46", new Object[]{nsdVar}) : nsdVar.c;
    }

    public static /* synthetic */ ius a(nsd nsdVar, ius iusVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ius) ipChange.ipc$dispatch("3fe2d9dd", new Object[]{nsdVar, iusVar});
        }
        nsdVar.c = iusVar;
        return iusVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [tb.nsb, tb.iuh] */
    @Override // tb.iun
    public /* synthetic */ nsb d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iuh) ipChange.ipc$dispatch("261b13ff", new Object[]{this}) : b();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [tb.iuj, tb.nsc] */
    @Override // tb.iun
    public /* synthetic */ nsc f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iuj) ipChange.ipc$dispatch("357e5efb", new Object[]{this}) : e();
    }

    public SearchDoorContext a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchDoorContext) ipChange.ipc$dispatch("30396e97", new Object[]{this});
        }
        nsh nshVar = this.d;
        if (nshVar == null) {
            return null;
        }
        return nshVar.f31721a;
    }

    public nsd(Activity activity, ium iumVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, null, viewGroup, iurVar);
        attachToContainer();
        j();
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.f31710a = new d(getActivity(), this, K(), null, new iur() { // from class: tb.nsd.1
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
                } else if (nsd.this.getView() == 0) {
                } else {
                    ((FrameLayout) nsd.this.getView()).addView(view, new FrameLayout.LayoutParams(-1, nsd.this.getActivity().getResources().getDimensionPixelSize(R.dimen.tbsearch_searchbar_height)));
                }
            }
        });
        this.d = new nsh(getActivity(), this, K(), null, new iur() { // from class: tb.nsd.2
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
                } else if (nsd.this.getView() == 0) {
                } else {
                    ((FrameLayout) nsd.this.getView()).addView(view, nsd.a(nsd.this, true));
                }
            }
        });
        this.b = new nrm(getActivity(), this, a(), (ViewGroup) getView(), new iur() { // from class: tb.nsd.3
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
                } else if (nsd.this.getView() == 0) {
                } else {
                    ((FrameLayout) nsd.this.getView()).addView(view, nsd.a(nsd.this, true));
                }
            }
        }, K());
        this.b.attachToContainer();
        c.INSTANCE.a(u.t() ? "voiceSearch" : ag.SOURCE_SPEECH, new com.taobao.search.sf.remote.d(getActivity(), this, nse.k(K()), null, new iur() { // from class: tb.nsd.4
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
                } else if (nsd.this.getView() == 0) {
                } else {
                    ((FrameLayout) nsd.this.getView()).addView(view, nsd.a(nsd.this, false));
                }
            }
        }), new com.taobao.search.sf.remote.b() { // from class: tb.nsd.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.search.sf.remote.b
            public void a(ius<?, ? extends View, ?> iusVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ee67ccb1", new Object[]{this, iusVar});
                    return;
                }
                nsd.a(nsd.this, iusVar);
                nsd.a(nsd.this).attachToContainer();
            }
        });
        if (c().l() != null && (c().l().a() || c().l().d())) {
            this.e = new b(getActivity(), this, null, new iur() { // from class: tb.nsd.6
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
                    } else if (nsd.this.getView() == 0) {
                    } else {
                        ((FrameLayout) nsd.this.getView()).addView(view);
                    }
                }
            });
        }
        subscribeEvent(this);
    }

    private ViewGroup.MarginLayoutParams a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.MarginLayoutParams) ipChange.ipc$dispatch("83a336b", new Object[]{this, new Boolean(z)});
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (z) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = getActivity().getResources().getDimensionPixelSize(R.dimen.tbsearch_searchbar_height);
        }
        return layoutParams;
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : getClass().getSimpleName();
    }

    public nsb b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nsb) ipChange.ipc$dispatch("16ba06e0", new Object[]{this}) : new nsb();
    }

    public nsc e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nsc) ipChange.ipc$dispatch("2dcef71c", new Object[]{this}) : new nsc();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getActivity(), K().a());
        }
    }

    public void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        K().a(intent);
        d dVar = this.f31710a;
        if (dVar != null) {
            dVar.a(intent);
        }
        nsh nshVar = this.d;
        if (nshVar == null) {
            return;
        }
        nshVar.a();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        d dVar = this.f31710a;
        if (dVar == null || this.f) {
            return;
        }
        dVar.e();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View] */
    public void onEventMainThread(nrj.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8116df2", new Object[]{this, aVar});
        } else {
            nse.a((View) getView());
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    @Override // tb.iut
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        nse.a((View) getView());
    }

    public void onEventMainThread(nre.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8a8ff4", new Object[]{this, dVar});
        } else {
            this.f = dVar.f31677a;
        }
    }

    public void onEventMainThread(nrk.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c64691", new Object[]{this, aVar});
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("query", aVar.f31692a);
        e.a("voice", (ArrayMap<String, String>) arrayMap);
        ArrayMap arrayMap2 = new ArrayMap();
        arrayMap2.put("from", "voice");
        arrayMap2.put("asrrn", aVar.b);
        nse.a(K(), getActivity(), aVar.f31692a, arrayMap2, this);
    }

    public Map<String, String> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d67b6a5", new Object[]{this});
        }
        nsh nshVar = this.d;
        if (nshVar != null) {
            return nshVar.d();
        }
        return null;
    }
}

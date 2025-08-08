package com.taobao.android.detail.wrapper.ext.component.actionbar;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.base.uikit.TIconFontTextView;
import com.taobao.taobao.R;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;
import tb.dwy;
import tb.ecg;
import tb.emu;
import tb.epj;
import tb.epo;
import tb.epp;
import tb.eps;
import tb.fgr;
import tb.kge;

/* loaded from: classes5.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COLLECTED_ICON_TEXT = "뀛";
    public static final String UNCOLLECTED_ICON_TEXT = "뀚";
    private Context f;
    private String g;
    private TIconFontTextView h;
    private TaoDetailActionBarV3 i;
    private Map<String, String> j;
    private String k = com.alibaba.ability.localization.b.a(R.string.x_detail_app_not_login);
    private String l = com.alibaba.ability.localization.b.a(R.string.x_detail_app_congratulations_collection_success);
    private String m = com.alibaba.ability.localization.b.a(R.string.x_detail_app_cancel_collection_success);

    /* renamed from: a  reason: collision with root package name */
    public dwy.c f11143a = new dwy.c() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.e.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dwy.c
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            if (e.a(e.this) != null) {
                e.a(e.this).setText(z ? "뀛" : "뀚");
            }
            e.this.a();
        }

        @Override // tb.dwy.c
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            epp.a("NavBarCollectHelper", "mQueryCollectOnClickCallback onQueryFailed onQueryFailed errorMsg" + str2);
        }
    };
    public dwy.c b = new dwy.c() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.e.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dwy.c
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            if (z) {
                dwy.a(e.b(e.this), e.this.d);
            } else {
                dwy.b(e.b(e.this), e.c(e.this), e.this.c);
            }
            Context d = e.d(e.this);
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("spm", "a2141.7631564.addfavorite");
            pairArr[1] = new Pair("position", "Navigation");
            pairArr[2] = new Pair("status", z ? "canceled" : "add");
            eps.a(d, "AddToFavorite", pairArr);
        }

        @Override // tb.dwy.c
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            epp.a("NavBarCollectHelper", "mQueryCollectOnClickCallback onQueryFailed errorMsg " + str2);
        }
    };
    public dwy.a c = new dwy.a() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.e.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dwy.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            epo.a(e.e(e.this));
            if (e.a(e.this) != null) {
                e.a(e.this).setText("뀛");
            }
            e.this.a();
            if (!fgr.a("enable_navbar_collect_category", false, true) || com.alibaba.ability.localization.b.c()) {
                return;
            }
            e.f(e.this);
        }

        @Override // tb.dwy.a
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            if (!ErrorConstant.isSessionInvalid(str) && !StringUtils.equals(str, "ANDROID_SYS_LOGIN_CANCEL")) {
                if (com.alibaba.ability.localization.b.c()) {
                    epo.a(com.alibaba.ability.localization.b.a(com.alibaba.ability.localization.b.a(R.string.x_detail_app_collect_fail)));
                } else {
                    epo.a(str2);
                }
            } else {
                epo.a(e.g(e.this));
            }
            ecg.j(e.d(e.this), e.b(e.this), str, str2);
            epp.a("NavBarCollectHelper", "mAddCollectCallback onAddFailed errorMsg:" + str2);
        }
    };
    public dwy.b d = new dwy.b() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.e.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dwy.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            epo.a(e.h(e.this));
            if (e.a(e.this) != null) {
                e.a(e.this).setText("뀚");
            }
            e.this.a();
        }

        @Override // tb.dwy.b
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            if (!ErrorConstant.isSessionInvalid(str) && !StringUtils.equals(str, "ANDROID_SYS_LOGIN_CANCEL")) {
                if (com.alibaba.ability.localization.b.c()) {
                    epo.a(com.alibaba.ability.localization.b.a(com.alibaba.ability.localization.b.a(R.string.x_detail_app_cancel_collect_fail)));
                } else {
                    epo.a(str2);
                }
            } else {
                epo.a(e.g(e.this));
            }
            ecg.j(e.d(e.this), e.b(e.this), str, str2);
            epp.a("NavBarCollectHelper", "mCancelCollectCallback onCancelFailed errorMsg:" + str2);
        }
    };
    public dwy.d e = new dwy.d() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.e.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dwy.d
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else if (StringUtils.isEmpty(str)) {
            } else {
                if ((e.d(e.this) instanceof Activity) && !((Activity) e.d(e.this)).hasWindowFocus()) {
                    return;
                }
                epj.f().navigateTo(e.d(e.this), str, null);
            }
        }

        @Override // tb.dwy.d
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            ecg.i(e.d(e.this), e.b(e.this), str, str2);
            epp.a("NavBarCollectHelper", "mShowCategoryListCallback onShowCategoryListFailed errorMsg" + str2);
        }
    };

    static {
        kge.a(-1276490573);
    }

    public static /* synthetic */ TIconFontTextView a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TIconFontTextView) ipChange.ipc$dispatch("ebd31b42", new Object[]{eVar}) : eVar.h;
    }

    public static /* synthetic */ String b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82d34", new Object[]{eVar}) : eVar.g;
    }

    public static /* synthetic */ Map c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("89e02800", new Object[]{eVar}) : eVar.j;
    }

    public static /* synthetic */ Context d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("1eaece22", new Object[]{eVar}) : eVar.f;
    }

    public static /* synthetic */ String e(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f72bba77", new Object[]{eVar}) : eVar.l;
    }

    public static /* synthetic */ void f(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("196bdd68", new Object[]{eVar});
        } else {
            eVar.d();
        }
    }

    public static /* synthetic */ String g(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("46236df9", new Object[]{eVar}) : eVar.k;
    }

    public static /* synthetic */ String h(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ed9f47ba", new Object[]{eVar}) : eVar.m;
    }

    public e(Context context, String str) {
        this.f = context;
        this.g = str;
        emu.a("com.taobao.android.detail.wrapper.ext.component.actionbar.CollectBarViewHolder");
    }

    public void a(TIconFontTextView tIconFontTextView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd2387c1", new Object[]{this, tIconFontTextView});
        } else {
            this.h = tIconFontTextView;
        }
    }

    public void a(TaoDetailActionBarV3 taoDetailActionBarV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e029abb7", new Object[]{this, taoDetailActionBarV3});
        } else {
            this.i = taoDetailActionBarV3;
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.j = map;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.g = str;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        TaoDetailActionBarV3 taoDetailActionBarV3 = this.i;
        if (taoDetailActionBarV3 == null) {
            return;
        }
        this.i.changeItemChildrenTran(taoDetailActionBarV3.getTransparency());
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            dwy.a(this.g, this.b);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            dwy.a(this.g, this.f11143a);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        int[] iArr = new int[2];
        this.h.getLocationOnScreen(iArr);
        dwy.a(this.g, iArr[0], iArr[1] + this.h.getHeight(), this.e);
    }
}

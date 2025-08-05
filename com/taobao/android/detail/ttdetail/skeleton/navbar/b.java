package com.taobao.android.detail.ttdetail.skeleton.navbar;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.ae;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.m;
import com.taobao.android.detail.ttdetail.widget.desc.TIconFontTextView;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;
import tb.kge;
import tb.odg;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COLLECTED_ICON_TEXT = "뀛";
    public static final String UNCOLLECTED_ICON_TEXT = "뀚";
    private Context e;
    private String f;
    private TIconFontTextView g;
    private TaoDetailActionBarV3 h;
    private Map<String, String> i;
    private String j = odg.o().a(R.string.tt_detail_not_login);
    private String k = odg.o().a(R.string.tt_detail_app_congratulations_collection_success);
    private String l = odg.o().a(R.string.tt_detail_app_cancel_collection_success);

    /* renamed from: a  reason: collision with root package name */
    public odg.i f10914a = new odg.i() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.odg.i
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            if (b.a(b.this) != null) {
                b.a(b.this).setText(z ? "뀛" : "뀚");
            }
            b.this.a();
        }

        @Override // tb.odg.i
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            i.a("CollectBarViewHolder", "mQueryCollectOnClickCallback onQueryFailed onQueryFailed errorMsg" + str2);
        }
    };
    public odg.i b = new odg.i() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.b.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.odg.i
        public void a(final boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            if (z) {
                odg.k().a(b.b(b.this), b.this.d);
            } else {
                odg.k().a(b.b(b.this), b.c(b.this), b.this.c);
            }
            m.b(2101, "Page_Detail_Button-AddToFavorite", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.CollectBarViewHolder$2$1
                {
                    put("spm", "a2141.7631564.addfavorite");
                    put("position", "Navigation");
                    put("status", (Object) (z ? "canceled" : "add"));
                }
            });
        }

        @Override // tb.odg.i
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            Toast.makeText(b.d(b.this), str2, 0).show();
            i.a("CollectBarViewHolder", "mQueryCollectOnClickCallback onQueryFailed errorMsg " + str2);
        }
    };
    public odg.g c = new odg.g() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.b.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.odg.g
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            b bVar = b.this;
            b.a(bVar, b.e(bVar));
            if (b.a(b.this) != null) {
                b.a(b.this).setText("뀛");
            }
            b.this.a();
        }

        @Override // tb.odg.g
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            if (!ErrorConstant.isSessionInvalid(str) && !TextUtils.equals(str, "ANDROID_SYS_LOGIN_CANCEL")) {
                if (odg.o().a()) {
                    b.a(b.this, odg.o().a(R.string.tt_detail_collet_failed));
                } else {
                    b.a(b.this, str2);
                }
            } else {
                b bVar = b.this;
                b.a(bVar, b.f(bVar));
            }
            HashMap hashMap = new HashMap();
            hashMap.put("errorCode", str);
            hashMap.put("errorMsg", str2);
            hashMap.put("itemId", b.b(b.this));
            ae.a(hashMap, -100012, "导航栏添加收藏失败");
            i.a("CollectBarViewHolder", "mAddCollectCallback onAddFailed errorMsg:" + str2);
        }
    };
    public odg.g d = new odg.g() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.b.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.odg.g
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            b bVar = b.this;
            b.a(bVar, b.g(bVar));
            if (b.a(b.this) != null) {
                b.a(b.this).setText("뀚");
            }
            b.this.a();
        }

        @Override // tb.odg.g
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            if (!ErrorConstant.isSessionInvalid(str) && !TextUtils.equals(str, "ANDROID_SYS_LOGIN_CANCEL")) {
                if (odg.o().a()) {
                    b.a(b.this, odg.o().a(R.string.tt_detail_cancel_collet_failed));
                } else {
                    b.a(b.this, str2);
                }
            } else {
                b bVar = b.this;
                b.a(bVar, b.f(bVar));
            }
            HashMap hashMap = new HashMap();
            hashMap.put("errorCode", str);
            hashMap.put("errorMsg", str2);
            hashMap.put("itemId", b.b(b.this));
            ae.a(hashMap, -100013, "导航栏取消收藏失败");
            i.a("CollectBarViewHolder", "mCancelCollectCallback onCancelFailed errorMsg:" + str2);
        }
    };

    static {
        kge.a(-546613078);
    }

    public static /* synthetic */ TIconFontTextView a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TIconFontTextView) ipChange.ipc$dispatch("53758a98", new Object[]{bVar}) : bVar.g;
    }

    public static /* synthetic */ void a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa52192f", new Object[]{bVar, str});
        } else {
            bVar.a(str);
        }
    }

    public static /* synthetic */ String b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("766631fa", new Object[]{bVar}) : bVar.f;
    }

    public static /* synthetic */ Map c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7e184a1c", new Object[]{bVar}) : bVar.i;
    }

    public static /* synthetic */ Context d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("4532fbe0", new Object[]{bVar}) : bVar.e;
    }

    public static /* synthetic */ String e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3cabba17", new Object[]{bVar}) : bVar.k;
    }

    public static /* synthetic */ String f(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7ec2e776", new Object[]{bVar}) : bVar.j;
    }

    public static /* synthetic */ String g(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c0da14d5", new Object[]{bVar}) : bVar.l;
    }

    public b(Context context, String str) {
        this.e = context;
        this.f = str;
    }

    public void a(TIconFontTextView tIconFontTextView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddd54aef", new Object[]{this, tIconFontTextView});
        } else {
            this.g = tIconFontTextView;
        }
    }

    public void a(TaoDetailActionBarV3 taoDetailActionBarV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe97ea2", new Object[]{this, taoDetailActionBarV3});
        } else {
            this.h = taoDetailActionBarV3;
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.i = map;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.f = str;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        TaoDetailActionBarV3 taoDetailActionBarV3 = this.h;
        if (taoDetailActionBarV3 == null) {
            return;
        }
        this.h.changeItemChildrenTran(taoDetailActionBarV3.getTransparency());
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            odg.k().a(this.f, this.b);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            odg.k().a(this.f, this.f10914a);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            Toast.makeText(this.e, str, 0).show();
        }
    }
}

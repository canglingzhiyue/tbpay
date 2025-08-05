package com.taobao.relationship.module;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.util.k;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.android.umbrella.link.export.UMLLCons;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.b;
import com.taobao.relationship.view.FollowButton;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Properties;
import tb.kge;
import tb.nly;
import tb.nlz;
import tb.nma;
import tb.nmb;
import tb.nmc;
import tb.nmd;
import tb.nme;
import tb.nmf;
import tb.nmg;
import tb.nmh;
import tb.nmi;
import tb.nmj;

/* loaded from: classes7.dex */
public class FollowModule implements View.OnClickListener, com.taobao.relationship.mtop.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FollowButton f18970a;
    private Activity b;
    private nme c;
    private nmd d;
    private a e;
    private boolean f;
    private nlz g;
    private nmc h;
    private nma i;
    private nmb j;
    private PopupWindow k;
    private ViewGroup l;
    private TextView m;
    private TIconFontTextView n;
    private TextView o;
    private RelativeLayout p;
    private boolean q;
    private SyncBroadcastReceiver r;

    static {
        kge.a(-1867251652);
        kge.a(-1201612728);
        kge.a(1807197753);
    }

    public static /* synthetic */ Activity a(FollowModule followModule) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("82c5b1ab", new Object[]{followModule}) : followModule.b;
    }

    public static /* synthetic */ void a(FollowModule followModule, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33f7e957", new Object[]{followModule, new Boolean(z)});
        } else {
            followModule.b(z);
        }
    }

    public static /* synthetic */ SyncBroadcastReceiver b(FollowModule followModule) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SyncBroadcastReceiver) ipChange.ipc$dispatch("d11a8ea0", new Object[]{followModule}) : followModule.r;
    }

    public static /* synthetic */ a c(FollowModule followModule) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e6859228", new Object[]{followModule}) : followModule.e;
    }

    public static /* synthetic */ boolean d(FollowModule followModule) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7bd35f7e", new Object[]{followModule})).booleanValue() : followModule.f;
    }

    public FollowModule(Activity activity, a aVar) {
        this(activity, aVar, new nme(), new nmd(), new FollowButton(activity));
    }

    public FollowModule(Activity activity, a aVar, FollowButton followButton) {
        this(activity, aVar, new nme(), new nmd(), followButton);
    }

    private FollowModule(Activity activity, a aVar, nme nmeVar, nmd nmdVar, FollowButton followButton) {
        this.q = false;
        this.b = activity;
        this.e = aVar;
        this.c = nmeVar;
        this.d = nmdVar;
        this.f18970a = followButton;
    }

    public void a(nme nmeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f678ee92", new Object[]{this, nmeVar});
        } else {
            this.c = nmeVar;
        }
    }

    public void a(nmd nmdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6787a33", new Object[]{this, nmdVar});
        } else {
            this.d = nmdVar;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        nmd nmdVar = this.d;
        if (nmdVar != null && nmdVar.j) {
            a(this.d.k);
            return;
        }
        this.f18970a.initWithConfig(this.c);
        this.f18970a.setOnClickListener(this);
        k();
        f();
        h();
        e();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f18970a.initWithConfig(this.c);
        this.f18970a.setOnClickListener(this);
        k();
        b(z);
        if (this.e != null) {
            nly.a().a(this.e.f18972a, this.e.b, z);
        }
        h();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.d == null || !nmg.a()) {
        } else {
            if (!TextUtils.isEmpty(this.d.g)) {
                b.h().a(this.d.g);
            }
            if (TextUtils.isEmpty(this.d.h)) {
                return;
            }
            b.h().a(this.d.h);
        }
    }

    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.f18970a;
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f = z;
        c(z);
        n();
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        FollowButton followButton = this.f18970a;
        if (followButton == null) {
            return;
        }
        followButton.refreshView(z);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1a8ccf5", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.e = aVar;
            c();
        }
    }

    public void a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5371847f", new Object[]{this, aVar, new Boolean(z)});
        } else if (aVar == null) {
        } else {
            this.e = aVar;
            String str = "updateDataWithState , accountId = " + aVar.f18972a + ", accountType = " + aVar.b + ", follow = " + z;
            b(z);
            nly.a().a(this.e.f18972a, this.e.b, z);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.e == null) {
        } else {
            if (!this.d.f31570a && nly.a().b(this.e.f18972a, this.e.b)) {
                b(nly.a().a(this.e.f18972a, this.e.b));
            } else if (!nmi.a()) {
            } else {
                com.taobao.relationship.mtop.b bVar = new com.taobao.relationship.mtop.b();
                bVar.b = this.e.f18972a;
                bVar.c = this.e.b;
                bVar.d = this.e.g;
                bVar.i = this.e.f;
                new com.taobao.relationship.mtop.isfollow.a(this).a(bVar);
            }
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.e == null || !nmi.a()) {
        } else {
            com.taobao.relationship.mtop.b bVar = new com.taobao.relationship.mtop.b();
            bVar.b = this.e.f18972a;
            bVar.c = this.e.b;
            bVar.d = this.e.g;
            bVar.i = this.e.f;
            new com.taobao.relationship.mtop.isfollow.a(this).a(bVar);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        a((nlz) null);
        a((nmc) null);
        a((nma) null);
        PopupWindow popupWindow = this.k;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.k.dismiss();
            this.k = null;
        }
        m();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (this.e == null || this.b == null) {
        } else {
            if (view == this.f18970a) {
                if (this.g != null) {
                    String str = "onFollowBtnClick, mIsFollow = " + this.f;
                    this.g.a(this.f, view);
                }
                if (!this.f) {
                    if (this.q) {
                        return;
                    }
                    this.q = true;
                    com.taobao.relationship.mtop.b bVar = new com.taobao.relationship.mtop.b();
                    bVar.b = this.e.f18972a;
                    bVar.c = this.e.b;
                    bVar.f = this.e.c;
                    bVar.g = this.e.d;
                    bVar.h = this.e.e;
                    bVar.d = this.e.g;
                    bVar.e = this.e.h;
                    bVar.f18974a = this.b;
                    bVar.i = this.e.f;
                    new com.taobao.relationship.mtop.addfollow.a(this).a(bVar);
                    TBS.Adv.ctrlClicked("Page_AttentionWeiTao", CT.Button, "Attention", i());
                    return;
                }
                nmd nmdVar = this.d;
                if (nmdVar != null && nmdVar.e) {
                    return;
                }
                nmd nmdVar2 = this.d;
                if (nmdVar2 != null && !nmdVar2.b) {
                    if (this.i != null) {
                        String str2 = "beforeShowUnFollowDialog, accountId = " + this.e.f18972a + ", accountType = " + this.e.b;
                    }
                    g();
                } else if (this.q) {
                    return;
                } else {
                    this.q = true;
                    com.taobao.relationship.mtop.b bVar2 = new com.taobao.relationship.mtop.b();
                    bVar2.b = this.e.f18972a;
                    bVar2.c = this.e.b;
                    bVar2.f = this.e.c;
                    bVar2.g = this.e.d;
                    bVar2.h = this.e.e;
                    bVar2.d = this.e.g;
                    bVar2.i = this.e.f;
                    new com.taobao.relationship.mtop.removefollow.a(this).a(bVar2);
                }
                TBS.Adv.ctrlClicked("Page_AttentionWeiTao", CT.Button, "CancelAttention", i());
                return;
            }
            int id = view.getId();
            if (id == R.id.relationship_followed_cancle_tv) {
                PopupWindow popupWindow = this.k;
                if (popupWindow == null || !popupWindow.isShowing()) {
                    return;
                }
                this.k.dismiss();
                if (this.i == null) {
                    return;
                }
                String str3 = "afterDismissUnFollowDialog, doUnFollow = false accountId = " + this.e.f18972a + ", accountType = " + this.e.b;
            } else if (id == R.id.relationship_followed_cancle_follow_tv) {
                if (this.q) {
                    return;
                }
                this.q = true;
                com.taobao.relationship.mtop.b bVar3 = new com.taobao.relationship.mtop.b();
                bVar3.b = this.e.f18972a;
                bVar3.c = this.e.b;
                bVar3.f = this.e.c;
                bVar3.g = this.e.d;
                bVar3.h = this.e.e;
                bVar3.d = this.e.g;
                bVar3.i = this.e.f;
                new com.taobao.relationship.mtop.removefollow.a(this).a(bVar3);
                PopupWindow popupWindow2 = this.k;
                if (popupWindow2 != null && popupWindow2.isShowing()) {
                    this.k.dismiss();
                }
                if (this.i == null) {
                    return;
                }
                String str4 = "afterDismissUnFollowDialog, doUnFollow = true accountId = " + this.e.f18972a + ", accountType = " + this.e.b;
            } else if (id != R.id.relationship_homepage_follow_popupwindow) {
            } else {
                PopupWindow popupWindow3 = this.k;
                if (popupWindow3 != null && popupWindow3.isShowing()) {
                    this.k.dismiss();
                }
                if (this.i == null) {
                    return;
                }
                String str5 = "afterDismissUnFollowDialog, doUnFollow = false accountId = " + this.e.f18972a + ", accountType = " + this.e.b;
            }
        }
    }

    @Override // com.taobao.relationship.mtop.a
    public void onBusSuccess(String str, long j, long j2, HashMap<String, Object> hashMap) {
        HashMap<String, Object> hashMap2;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d544e960", new Object[]{this, str, new Long(j), new Long(j2), hashMap});
            return;
        }
        this.q = false;
        String str2 = "onBusSuccess, api name = " + str;
        nmb nmbVar = this.j;
        if (nmbVar != null) {
            nmbVar.a(str, j, j2, hashMap);
        }
        if (TextUtils.equals(nmf.MTOP_ISFOLLOW, str)) {
            if (hashMap == null || (obj = hashMap.get(nmf.PARAMS_MTOP_RESULT_ISFOLLOW)) == null) {
                return;
            }
            boolean parseBoolean = Boolean.parseBoolean(obj.toString());
            String str3 = "onBusSuccess, api name = " + str + ", follow = " + parseBoolean;
            b(parseBoolean);
            if (this.h != null) {
                String str4 = "onCheckedState, follow = " + parseBoolean + ", accountId = " + j + ", accountType = " + j2;
                this.h.onCheckedState(parseBoolean, j, j2);
            }
            nly.a().a(j, j2, parseBoolean);
        } else if (TextUtils.equals(nmf.MTOP_ADDFOLLOW, str)) {
            if (this.h != null) {
                String str5 = "beforeStateChangedRefreshView, follow = true, accountId = " + j + ", accountType = " + j2;
                hashMap2 = hashMap;
                this.h.beforeStateChangedRefreshView(true, j, j2);
            } else {
                hashMap2 = hashMap;
            }
            nmd nmdVar = this.d;
            if (nmdVar != null && nmdVar.f) {
                return;
            }
            a(j, j2, (hashMap2 == null || !hashMap2.containsKey("toast") || hashMap2.get("toast") == null) ? "" : hashMap2.get("toast").toString());
        } else if (!TextUtils.equals(nmf.MTOP_REMOVEFOLLOW, str)) {
        } else {
            if (this.h != null) {
                String str6 = "beforeStateChangedRefreshView, follow = false, accountId = " + j + ", accountType = " + j2;
                this.h.beforeStateChangedRefreshView(false, j, j2);
            }
            nmd nmdVar2 = this.d;
            if (nmdVar2 != null && nmdVar2.f) {
                return;
            }
            b(j, j2, (hashMap == null || !hashMap.containsKey("toast") || hashMap.get("toast") == null) ? "" : hashMap.get("toast").toString());
        }
    }

    private void a(long j, long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30210ab2", new Object[]{this, new Long(j), new Long(j2), str});
            return;
        }
        b(true);
        nme nmeVar = this.c;
        if (nmeVar != null && !nmeVar.x) {
            if (!TextUtils.isEmpty(str)) {
                nmj.a(str);
            } else {
                nmj.a("关注成功，可以在微淘查看TA的动态啦~");
            }
        }
        nmd nmdVar = this.d;
        if (nmdVar != null && !nmdVar.c && nmg.a()) {
            if (this.i != null) {
                String str2 = "beforeShowFollowDialog, accountId = " + j + ", accountType = " + j2;
            }
            nme nmeVar2 = this.c;
            if (nmeVar2 != null) {
                if (!nmeVar2.y) {
                    nmh.a(this.b, j, j2, this.d.g, this.d.h, this.i, this.h);
                }
            } else {
                nmh.a(this.b, j, j2, this.d.g, this.d.h, this.i, this.h);
            }
        } else {
            if (this.i != null) {
                String str3 = "afterDismissFollowDialog, accountId = " + j + ", accountType = " + j2;
            }
            if (this.h != null) {
                String str4 = "afterStateChangedRefreshView, follow = true, accountId = " + j + ", accountType = " + j2;
                this.h.afterStateChangedRefreshView(true, j, j2);
            }
        }
        nly.a().a(j, j2, true);
    }

    private void b(long j, long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b45157b3", new Object[]{this, new Long(j), new Long(j2), str});
            return;
        }
        b(false);
        nme nmeVar = this.c;
        if (nmeVar != null && !nmeVar.x) {
            if (TextUtils.isEmpty(str)) {
                nmj.a("已取消关注");
            } else {
                nmj.a(str);
            }
        }
        if (this.h != null) {
            String str2 = "afterStateChangedRefreshView, follow = false, accountId = " + j + ", accountType = " + j2;
            this.h.afterStateChangedRefreshView(false, j, j2);
        }
        nly.a().a(j, j2, false);
    }

    @Override // com.taobao.relationship.mtop.a
    public void onBusFail(String str, long j, long j2, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0e9a303", new Object[]{this, str, new Long(j), new Long(j2), hashMap});
            return;
        }
        String str2 = "onBusSuccess, api name = " + str;
        this.q = false;
        nmb nmbVar = this.j;
        if (nmbVar != null) {
            nmbVar.b(str, j, j2, hashMap);
        }
        if (TextUtils.equals(nmf.MTOP_ISFOLLOW, str)) {
            return;
        }
        if (TextUtils.equals(nmf.MTOP_ADDFOLLOW, str)) {
            a(true, hashMap);
        } else if (!TextUtils.equals(nmf.MTOP_REMOVEFOLLOW, str)) {
        } else {
            a(false, hashMap);
        }
    }

    private void a(boolean z, HashMap<String, Object> hashMap) {
        nme nmeVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d05e4ec7", new Object[]{this, new Boolean(z), hashMap});
            return;
        }
        if (hashMap != null) {
            Object obj = hashMap.get("errorMsg");
            Object obj2 = hashMap.get("errorCode");
            if (obj != null) {
                if ((!nmi.a() && obj2 != null && TextUtils.equals(obj2.toString(), "ANDROID_SYS_LOGIN_CANCEL")) || (nmeVar = this.c) == null || nmeVar.x) {
                    return;
                }
                nmj.a(obj.toString());
                return;
            }
        }
        if (z) {
            nme nmeVar2 = this.c;
            if (nmeVar2 == null || nmeVar2.x) {
                return;
            }
            nmj.a("关注失败");
            return;
        }
        nme nmeVar3 = this.c;
        if (nmeVar3 == null || nmeVar3.x) {
            return;
        }
        nmj.a("取消关注失败");
    }

    public void a(nlz nlzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f67462dc", new Object[]{this, nlzVar});
        } else {
            this.g = nlzVar;
        }
    }

    public void a(nmc nmcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f67805d4", new Object[]{this, nmcVar});
        } else {
            this.h = nmcVar;
        }
    }

    public void a(nma nmaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6771d16", new Object[]{this, nmaVar});
        } else {
            this.i = nmaVar;
        }
    }

    public void a(nmb nmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6779175", new Object[]{this, nmbVar});
        } else {
            this.j = nmbVar;
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        if (this.k == null) {
            this.k = new PopupWindow(this.b.findViewById(16908290), -1, -1, true);
            this.k.setSoftInputMode(16);
            this.l = (ViewGroup) LayoutInflater.from(Globals.getApplication()).inflate(R.layout.relationship_follow_cancel_view, (ViewGroup) null);
            this.k.setContentView(this.l);
            this.m = (TextView) this.l.findViewById(R.id.relationship_followed_cancle_follow_tv);
            this.n = (TIconFontTextView) this.l.findViewById(R.id.relationship_followed_tips);
            TIconFontTextView tIconFontTextView = this.n;
            tIconFontTextView.setText("取消关注后将无法在 " + nmj.a(Globals.getApplication(), R.string.uik_icon_we) + "微淘 中查看TA的动态");
            this.o = (TextView) this.l.findViewById(R.id.relationship_followed_cancle_tv);
            this.p = (RelativeLayout) this.l.findViewById(R.id.relationship_homepage_follow_popupwindow);
            this.p.setOnClickListener(this);
            this.m.setOnClickListener(this);
            this.n.setOnClickListener(this);
            this.o.setOnClickListener(this);
            nme nmeVar = this.c;
            if (nmeVar != null && nmeVar.y) {
                TextView textView = this.m;
                if (textView != null) {
                    textView.setText("取消订阅");
                }
                TIconFontTextView tIconFontTextView2 = this.n;
                if (tIconFontTextView2 != null) {
                    tIconFontTextView2.setVisibility(8);
                }
            }
        }
        PopupWindow popupWindow = this.k;
        if (popupWindow == null) {
            return;
        }
        popupWindow.showAtLocation(this.b.findViewById(16908290), 0, 0, 0);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            TBS.Ext.commitEvent("Show_Attention", j());
        }
    }

    private String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        a aVar = this.e;
        String str = "";
        if (aVar == null) {
            return str;
        }
        String str2 = !TextUtils.isEmpty(aVar.c) ? this.e.c : str;
        String str3 = !TextUtils.isEmpty(this.e.d) ? this.e.d : str;
        if (!TextUtils.isEmpty(this.e.e)) {
            str = this.e.e;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("account_id=" + this.e.f18972a);
        sb.append(",Origin=" + str2);
        sb.append(",Page=" + str3);
        sb.append(",Extend=" + str);
        return sb.toString();
    }

    private Properties j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Properties) ipChange.ipc$dispatch("f9750181", new Object[]{this});
        }
        a aVar = this.e;
        if (aVar == null) {
            return null;
        }
        String str = "";
        String str2 = !TextUtils.isEmpty(aVar.c) ? this.e.c : str;
        String str3 = !TextUtils.isEmpty(this.e.d) ? this.e.d : str;
        if (!TextUtils.isEmpty(this.e.e)) {
            str = this.e.e;
        }
        Properties properties = new Properties();
        properties.put("account_id", Long.valueOf(this.e.f18972a));
        properties.put("Origin", str2);
        properties.put(UMLLCons.FEATURE_TYPE_PAGE, str3);
        properties.put("Extend", str);
        return properties;
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        nmd nmdVar = this.d;
        if (nmdVar == null || !nmdVar.i) {
            return;
        }
        l();
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.r = new SyncBroadcastReceiver(new WeakReference(this));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(nmf.ACTION_UPDATA_FOLLOW_STATE);
        LocalBroadcastManager.getInstance(this.b).registerReceiver(this.r, intentFilter);
        k.a("FollowModule", "registerReceiver");
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this.r);
        k.a("FollowModule", "unregisterReceiver");
    }

    private void n() {
        nmd nmdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (this.e == null || (nmdVar = this.d) == null || !nmdVar.i) {
        } else {
            Intent intent = new Intent(nmf.ACTION_UPDATA_FOLLOW_STATE);
            intent.putExtra("accountId", this.e.f18972a);
            intent.putExtra("accountType", this.e.b);
            intent.putExtra("followed", this.f);
            k.a("FollowModule", "sendSyncBroadcast , intent = " + intent.toString());
            LocalBroadcastManager.getInstance(this.b).sendBroadcast(intent);
        }
    }

    /* loaded from: classes7.dex */
    public class SyncBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<FollowModule> b;

        static {
            kge.a(-1376473619);
        }

        public SyncBroadcastReceiver(WeakReference<FollowModule> weakReference) {
            this.b = weakReference;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean booleanExtra;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            WeakReference<FollowModule> weakReference = this.b;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            k.a("FollowModule", "onReceive , intent = " + intent.toString());
            if (FollowModule.a(this.b.get()) == null) {
                if (Globals.getApplication() == null) {
                    return;
                }
                LocalBroadcastManager.getInstance(Globals.getApplication()).unregisterReceiver(FollowModule.b(FollowModule.this));
            } else if (FollowModule.c(this.b.get()) == null) {
            } else {
                try {
                    if (!TextUtils.equals(intent.getAction(), nmf.ACTION_UPDATA_FOLLOW_STATE)) {
                        return;
                    }
                    int intExtra = intent.getIntExtra("accountType", -1);
                    long longExtra = intent.getLongExtra("accountId", -1L);
                    if (longExtra == -1) {
                        String stringExtra = intent.getStringExtra("accountId");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            try {
                                longExtra = Long.parseLong(stringExtra);
                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    if (FollowModule.c(this.b.get()).f18972a != longExtra) {
                        return;
                    }
                    if ((FollowModule.c(this.b.get()).b != intExtra && intExtra != -1) || (booleanExtra = intent.getBooleanExtra("followed", false)) == FollowModule.d(FollowModule.this)) {
                        return;
                    }
                    FollowModule.a(this.b.get(), booleanExtra);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}

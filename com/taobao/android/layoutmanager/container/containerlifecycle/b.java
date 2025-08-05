package com.taobao.android.layoutmanager.container.containerlifecycle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ask.ASK_CONST;
import com.taobao.monitor.procedure.IPage;
import com.taobao.search.common.util.i;
import com.taobao.tao.flexbox.layoutmanager.animation.shareelement.CornerRadiusTransition;
import com.taobao.tao.flexbox.layoutmanager.component.z;
import com.taobao.tao.flexbox.layoutmanager.container.e;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import com.taobao.tao.flexbox.layoutmanager.container.h;
import com.taobao.tao.flexbox.layoutmanager.container.m;
import com.taobao.tao.flexbox.layoutmanager.container.n;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.ad;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.uc.webview.export.media.MessageID;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.mini.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.kge;
import tb.odx;
import tb.oeb;
import tb.oec;
import tb.oga;
import tb.ogb;
import tb.ogg;
import tb.ogt;
import tb.ohd;

/* loaded from: classes5.dex */
public class b extends f implements ogb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f13189a;
    private e b;
    private GestureLayout c;
    private LinearLayout d;
    private TNodeView e;
    private View f;
    private boolean g;
    private m.b h;
    private IPage i;
    private Activity j;
    private String k;
    private String l;

    static {
        kge.a(-1955395928);
        kge.a(-1007722434);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.oha.a
    public void onBack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9fc8977", new Object[]{this, str});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void onBackButtonClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767cf6b7", new Object[]{this});
        }
    }

    @Override // tb.oha.a
    public void onFinish(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("968e7fbd", new Object[]{this, str, new Float(f)});
        }
    }

    @Override // tb.oha.a
    public void onMove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2feb54e1", new Object[]{this, str});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void setNavigationBarColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56e885d6", new Object[]{this, new Integer(i)});
        }
    }

    public static /* synthetic */ m.b a(b bVar, m.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m.b) ipChange.ipc$dispatch("5ffa7a06", new Object[]{bVar, bVar2});
        }
        bVar.h = bVar2;
        return bVar2;
    }

    public static /* synthetic */ String a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a5a5d430", new Object[]{bVar}) : bVar.k;
    }

    public static /* synthetic */ String a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d41173a6", new Object[]{bVar, str});
        }
        bVar.k = str;
        return str;
    }

    public static /* synthetic */ void a(b bVar, ViewGroup viewGroup, Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6495435c", new Object[]{bVar, viewGroup, uri, new Boolean(z)});
        } else {
            bVar.a(viewGroup, uri, z);
        }
    }

    public static /* synthetic */ void a(b bVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52dd8b84", new Object[]{bVar, str, str2});
        } else {
            bVar.b(str, str2);
        }
    }

    public static /* synthetic */ String b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("142ce571", new Object[]{bVar}) : bVar.l;
    }

    public static /* synthetic */ String b(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d79916a7", new Object[]{bVar, str});
        }
        bVar.l = str;
        return str;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public /* synthetic */ View getContentView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ce219891", new Object[]{this}) : b();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public /* synthetic */ View getDecorView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6d69b8fd", new Object[]{this}) : a();
    }

    public b(Context context, e eVar, String str, final boolean z, Bundle bundle) {
        if (!str.contains(ASK_CONST.KEY_TNODE_TIME)) {
            str = str + "&tnodeTime=" + System.nanoTime();
        }
        String str2 = str + "&tnodeFragment=true";
        this.f13189a = context;
        this.b = eVar;
        this.url = str2;
        this.j = new Activity();
        GestureLayout gestureLayout = new GestureLayout(context);
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TNodeView create = TNodeView.create(context, this, null, str2, null, null, new TNodeView.c() { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.b
            public void onLayoutError() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("834776a6", new Object[]{this});
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.c
            public void onStartLayout(m.b bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f67932cf", new Object[]{this, bVar});
                    return;
                }
                b.a(b.this, bVar);
                b.a(b.this, linearLayout, bVar.b, z);
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.b
            public void onLayoutCompleted(aa aaVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3fb42811", new Object[]{this, aaVar});
                } else if (aaVar == null || b.a(b.this) == null || b.b(b.this) == null) {
                } else {
                    b bVar = b.this;
                    b.a(bVar, b.a(bVar), b.b(b.this));
                    b bVar2 = b.this;
                    b.a(bVar2, b.b(bVar2, (String) null));
                }
            }
        });
        linearLayout.addView(create, new FrameLayout.LayoutParams(-1, -1));
        this.d = linearLayout;
        this.e = create;
        this.c = gestureLayout;
        this.i = com.taobao.monitor.procedure.m.a().a(linearLayout, true);
        m.b bVar = this.h;
        if (bVar != null) {
            n a2 = n.a(context, bVar.d, this.h.b, bundle, z);
            a(a2, z);
            a(gestureLayout, a2);
            this.transition = a2;
        }
        gestureLayout.setContentView(linearLayout);
    }

    private void a(ViewGroup viewGroup, Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b3eb54", new Object[]{this, viewGroup, uri, new Boolean(z)});
            return;
        }
        boolean a2 = oec.a((Object) uri.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_IMMERSIVE), false);
        boolean a3 = oec.a((Object) uri.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_FULLTRANSPARENT), false);
        if (!a2) {
            String queryParameter = uri.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_NAVBAR_HIDE);
            String queryParameter2 = uri.getQueryParameter(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_STATUSBAR_COLOR);
            int i = a2 ? 0 : a3 ? 1 : -1;
            if (!TextUtils.isEmpty(queryParameter2)) {
                if (queryParameter2.length() >= 2) {
                    char charAt = queryParameter2.charAt(0);
                    char charAt2 = queryParameter2.charAt(1);
                    if (charAt >= '0' && charAt <= 'f' && charAt2 >= '0' && charAt2 <= 'f') {
                        queryParameter2 = "#" + queryParameter2;
                    }
                }
                i = odx.a(queryParameter2);
            }
            View a4 = a(this.f13189a, oec.a((Object) queryParameter, false), i);
            viewGroup.addView(a4, 0);
            this.f = a4;
        }
        if (a3) {
            return;
        }
        a(viewGroup);
    }

    private void a(n nVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e26b254", new Object[]{this, nVar, new Boolean(z)});
        } else if (z) {
            a(nVar);
        } else {
            startNormalTransition(nVar);
        }
    }

    private void a(n nVar) {
        String[] strArr;
        String[] strArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5c1080", new Object[]{this, nVar});
            return;
        }
        for (String str : nVar.f20267a) {
            Transition a2 = n.a(this.f13189a, str, nVar, false);
            if (a2 != null) {
                if (TextUtils.equals(str, "share") || TextUtils.equals(str, n.TRANSITION_TYPE_CORNER_RADIUS)) {
                    setSharedElementEnterTransition(a2);
                } else {
                    setEnterTransition(a2);
                }
            }
        }
        for (String str2 : nVar.b) {
            Transition a3 = n.a(this.f13189a, str2, nVar, true);
            if (a3 != null) {
                if (TextUtils.equals(str2, "share") || TextUtils.equals(str2, n.TRANSITION_TYPE_CORNER_RADIUS)) {
                    setSharedElementReturnTransition(a3);
                } else {
                    setExitTransition(a3);
                }
            }
        }
    }

    private void a(GestureLayout gestureLayout, n nVar) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e618d7", new Object[]{this, gestureLayout, nVar});
            return;
        }
        boolean a2 = nVar.a();
        boolean b = nVar.b();
        if (nVar.a(this.f13189a)) {
            int i2 = 4;
            if (nVar.b(n.TRANSITION_TYPE_SECONDPAGE)) {
                i2 = 12;
            }
            gestureLayout.setGestureSupportType(this, i2);
        } else if (a2) {
            if (nVar.b(n.TRANSITION_TYPE_SECONDPAGE)) {
                i = 9;
            }
            gestureLayout.setGestureSupportType(this, i);
        } else if (!b) {
        } else {
            gestureLayout.setGestureSupportType(this, 2);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        ogg.a("PageImpl", i.b.MEASURE_ONCREATE);
        this.i.d().a(ogt.b(this.url), this.url, null);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        ogg.a("PageImpl", "onStart");
        if (e()) {
            return;
        }
        g();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public ab getTNodeEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ab) ipChange.ipc$dispatch("11c783b4", new Object[]{this});
        }
        TNodeView tNodeView = this.e;
        if (tNodeView == null) {
            return null;
        }
        return tNodeView.getEngine();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        ogg.a("PageImpl", "onResume");
        this.i.d().a();
        ogg.a("PageImpl", com.alibaba.triver.triver_shop.newShop.ext.m.PAGE_APPEAR);
        UTAnalytics.getInstance().getDefaultTracker().pageAppear(getUTObject());
        com.taobao.android.layoutmanager.module.a.a(getUTObject(), true);
        if (e()) {
            findSecPageWrapper().m();
            return;
        }
        UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
        Object uTObject = getUTObject();
        m.b bVar = this.h;
        defaultTracker.updatePageUrl(uTObject, bVar != null ? bVar.d : Uri.parse(this.url));
        c();
        f();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        TNodeView tNodeView = this.e;
        if (tNodeView == null) {
            return;
        }
        tNodeView.onStart();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        TNodeView tNodeView = this.e;
        if (tNodeView == null) {
            return;
        }
        tNodeView.onResume();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        TNodeView tNodeView = this.e;
        if (tNodeView == null) {
            return;
        }
        tNodeView.onPause();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        TNodeView tNodeView = this.e;
        if (tNodeView == null) {
            return;
        }
        tNodeView.onStop();
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        oga<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper == null) {
            return false;
        }
        return findSecPageWrapper.k();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        ogg.a("PageImpl", "onPause");
        if (e()) {
            findSecPageWrapper().n();
        } else {
            d();
        }
        ogg.a("PageImpl", "pageDisAppear");
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(getUTObject());
        this.i.d().c();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        ogg.a("PageImpl", MessageID.onStop);
        if (e()) {
            return;
        }
        h();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ogg.a("PageImpl", MessageID.onDestroy);
        this.i.d().d();
        TNodeView tNodeView = this.e;
        if (tNodeView != null) {
            tNodeView.onDestroy();
        }
        oga<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper != null) {
            findSecPageWrapper.o();
        }
        l.getInstance().pageDestroyed(this.j);
        com.taobao.android.layoutmanager.module.a.b(getUTObject());
    }

    public ViewGroup a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("8c7138ad", new Object[]{this}) : this.c;
    }

    public ViewGroup b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("7d42400c", new Object[]{this}) : this.d;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void setIsFinishing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b09d5aa", new Object[]{this});
        } else {
            this.g = true;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public boolean isFinishing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1fd16a70", new Object[]{this})).booleanValue() : this.g;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void finish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d82167a", new Object[]{this, new Boolean(z)});
        } else {
            getPageContainer().a(this, z);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public boolean onBackPressed(boolean z) {
        TNodeView tNodeView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d542d5", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (oga.a((Context) null, this)) {
            return true;
        }
        if (z && (tNodeView = this.e) != null && tNodeView.getRenderIntercept().a(this.e)) {
            ab tNodeEngine = getTNodeEngine();
            if (tNodeEngine != null) {
                tNodeEngine.x();
            }
            return true;
        }
        ab tNodeEngine2 = getTNodeEngine();
        return tNodeEngine2 != null && tNodeEngine2.x();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void showActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("422f6807", new Object[]{this});
            return;
        }
        View view = this.f;
        if (view == null) {
            return;
        }
        view.findViewById(R.id.fake_actionbar).setVisibility(0);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void hideActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6efde2", new Object[]{this});
            return;
        }
        View view = this.f;
        if (view == null) {
            return;
        }
        view.findViewById(R.id.fake_actionbar).setVisibility(8);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            return;
        }
        View view = this.f;
        if (view == null) {
            return;
        }
        ((TextView) view.findViewById(R.id.title)).setText(str);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void onBeforeStartTransition(h hVar, boolean z) {
        aa b;
        aa aaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc4f976", new Object[]{this, hVar, new Boolean(z)});
        } else if (((d) hVar).a()) {
            if (z || this.transition == null || !this.transition.d()) {
                return;
            }
            View c = getTNodeEngine() != null ? getTNodeEngine().s().c() : null;
            if (c != null) {
                String transitionName = c.getTransitionName();
                this.c.setTransitionName(transitionName + "card");
                c.setTransitionName(null);
                this.c.setTag(R.id.layout_manager_transition_shared_view, c);
                return;
            }
            this.c.setTransitionName(getTransitionInfo().c() + "card");
        } else if (!z || !oeb.bp() || getTNodeEngine() == null || (b = getTNodeEngine().s().b()) == null) {
        } else {
            float f = -1.0f;
            float f2 = b.I().getViewParams().aJ;
            List<View> b2 = hVar.b();
            if (b2 != null && b2.size() > 0 && (aaVar = (aa) b2.get(0).getTag(R.id.layout_manager_tnode)) != null) {
                f = aaVar.I().getViewParams().aJ;
            }
            Transition sharedElementEnterTransition = getSharedElementEnterTransition();
            boolean a2 = d.a(sharedElementEnterTransition, "CornerRadiusTransition");
            boolean a3 = d.a(sharedElementEnterTransition, "MaterialContainerTransform");
            if (f == f2 || f < 0.0f || f2 < 0.0f || !(sharedElementEnterTransition instanceof TransitionSet) || a2 || a3) {
                return;
            }
            ((TransitionSet) sharedElementEnterTransition).addTransition(new CornerRadiusTransition(f, f2));
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void setStatusBarColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e14207b8", new Object[]{this, new Integer(i)});
            return;
        }
        View view = this.f;
        if (view == null) {
            return;
        }
        view.findViewById(R.id.fake_statusbar).setBackgroundColor(i);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public e getPageContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("95b48c34", new Object[]{this}) : this.b;
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            view.setBackgroundColor(-16777217);
        }
    }

    private View a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fd07be6c", new Object[]{this, view, new Boolean(z)});
        }
        if (getSharedElementEnterTransition() == null || !TextUtils.equals(getSharedElementEnterTransition().getClass().getSimpleName(), "MaterialContainerTransform")) {
            return view;
        }
        if (view != null) {
            this.c.setTransitionName(view.getTransitionName());
            view.setTransitionName(null);
            this.c.setTag(R.id.layout_manager_transition_shared_view, view);
        } else {
            this.c.setTransitionName(getTransitionInfo().c());
        }
        if (z) {
            getSharedElementEnterTransition().addTarget(this.c);
        }
        return this.c;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void startPostponedEnterTransition(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8977076a", new Object[]{this, view});
            return;
        }
        ogg.a("PageImpl startPostponedEnterTransition enterTransitionExecuted:" + this.enterTransitionExecuted + " sharedView:" + view);
        if (this.enterTransitionExecuted) {
            return;
        }
        if (getTNodeEngine() != null) {
            getTNodeEngine().c = true;
        }
        setExecutingEnterTransition();
        this.enterTransitionExecuted = true;
        h pageTransition = getPageTransition();
        final boolean[] zArr = {false};
        final Runnable runnable = new Runnable() { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                ogg.a("PageImpl startPostponedEnterTransition complete");
                b.this.setTransitionCompleted();
                View view2 = view;
                if (!(view2 instanceof TNodeImageView)) {
                    return;
                }
                ((TNodeImageView) view2).startPostponedSetImageDrawable();
            }
        };
        if (pageTransition != null) {
            pageTransition.a(a(view, false), new h.a() { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.container.h.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        runnable.run();
                    }
                }
            });
        } else if (!getPageContainer().a() && getPageContainer().h().size() == 1 && getPageContainer().h().get(0) == this) {
            a(view, true);
            Transition enterTransition = getEnterTransition();
            if (enterTransition == null) {
                enterTransition = getSharedElementEnterTransition();
            }
            if (enterTransition != null) {
                enterTransition.addListener(new Transition.TransitionListener() { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.b.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionCancel(Transition transition) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4f3bc7d", new Object[]{this, transition});
                        }
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionPause(Transition transition) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3df73669", new Object[]{this, transition});
                        }
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionResume(Transition transition) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d325edea", new Object[]{this, transition});
                        }
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionStart(Transition transition) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4ffba07d", new Object[]{this, transition});
                        }
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionEnd(Transition transition) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5f39e64", new Object[]{this, transition});
                        } else {
                            runnable.run();
                        }
                    }
                });
                if (oeb.a("fixTransitionCallback", true)) {
                    oec.a(new Runnable() { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.b.5
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                runnable.run();
                            }
                        }
                    }, 400L);
                }
            } else {
                runnable.run();
            }
            getActivity().startPostponedEnterTransition();
        } else {
            runnable.run();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public void postponedEnterTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef076e6", new Object[]{this});
        } else {
            this.c.setVisibility(4);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this}) : (Activity) this.f13189a;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.f
    public Object getUTObject() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("dbe25f7", new Object[]{this}) : this.j;
    }

    private View a(Context context, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("db5a7991", new Object[]{this, context, new Boolean(z), new Integer(i)});
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.layoutmanager_fake_actionbar, (ViewGroup) null, false);
        inflate.setId(R.id.layout_manager_fake_action_bar);
        View findViewById = inflate.findViewById(R.id.fake_statusbar);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, ohd.h(context));
        }
        layoutParams.height = ohd.h(context);
        findViewById.setLayoutParams(layoutParams);
        View findViewById2 = inflate.findViewById(R.id.fake_actionbar);
        if (z) {
            findViewById2.setVisibility(8);
        }
        if (i != 1) {
            findViewById.setBackgroundColor(i);
        }
        inflate.findViewById(R.id.back).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.b.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    b.this.finish(true);
                }
            }
        });
        inflate.findViewById(R.id.more).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.b.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    new TBPublicMenu((Activity) view.getContext()).show();
                }
            }
        });
        return inflate;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        Intent intent = new Intent(PopLayer.ACTION_FRAGMENT_SWITCH);
        m.b bVar = this.h;
        intent.putExtra(PopLayer.EXTRA_KEY_FRAGMENT_NAME, (bVar == null || TextUtils.isEmpty(bVar.i)) ? "TNodePage" : this.h.i);
        intent.putExtra(PopLayer.EXTRA_KEY_FRAGMENT_PARAM, this.url);
        LocalBroadcastManager.getInstance(this.f13189a).sendBroadcast(intent);
    }

    @Override // tb.ogb
    public oga<?> findSecPageWrapper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oga) ipChange.ipc$dispatch("b2df2c2a", new Object[]{this}) : this.c.mSecPageWrapper;
    }

    @Override // tb.ogb
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            c();
        } else {
            d();
        }
    }

    @Override // tb.ogb
    public void slideSecondPage(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f686d561", new Object[]{this, obj, str});
        } else {
            com.taobao.android.layoutmanager.container.secondpage.biz.a.a(this, obj, str);
        }
    }

    @Override // tb.ogb
    public Pair<Boolean, Pair<Boolean, aa>> supportSecondPage(MotionEvent motionEvent) {
        aa aaVar;
        boolean z;
        aa A;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("e6be4178", new Object[]{this, motionEvent});
        }
        ab tNodeEngine = getTNodeEngine();
        if (tNodeEngine == null || (A = tNodeEngine.A()) == null) {
            aaVar = null;
            z = false;
        } else {
            aaVar = ad.a(A, (int) motionEvent.getRawX(), (int) motionEvent.getRawY(), false);
            com.taobao.android.layoutmanager.container.secondpage.biz.b a2 = com.taobao.android.layoutmanager.container.secondpage.biz.a.a(this);
            if (a2 != null && aaVar != null) {
                a2.a(aaVar.e(z.KEY_TRACK_TARGET), (String) null);
            }
            z = true;
        }
        if (aaVar == null) {
            z2 = false;
        }
        return new Pair<>(Boolean.valueOf(z2), new Pair(Boolean.valueOf(z), aaVar));
    }

    @Override // tb.ogc
    public void setFirstPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76692fd9", new Object[]{this, str});
            return;
        }
        oga<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper == null) {
            return;
        }
        findSecPageWrapper.setFirstPageName(str);
    }

    @Override // tb.ogc
    public void setFirstPageProperty(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48f12cc", new Object[]{this, map});
            return;
        }
        oga<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper == null) {
            return;
        }
        findSecPageWrapper.setFirstPageProperty(map);
    }

    @Override // tb.ogc
    public String getFirstPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("232786a5", new Object[]{this});
        }
        oga<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper == null) {
            return null;
        }
        return findSecPageWrapper.getFirstPageName();
    }

    @Override // tb.ogc
    public Map getFirstPageProperty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8efdfe9a", new Object[]{this});
        }
        oga<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper == null) {
            return null;
        }
        return findSecPageWrapper.getFirstPageProperty();
    }

    @Override // tb.ogc
    public void setSecondPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e7e79e1", new Object[]{this, str});
            return;
        }
        oga<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper == null) {
            return;
        }
        findSecPageWrapper.setSecondPageName(str);
    }

    @Override // tb.ogc
    public void setSecondPageProperty(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2309c4", new Object[]{this, map});
            return;
        }
        oga<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper == null) {
            return;
        }
        findSecPageWrapper.setSecondPageProperty(map);
    }

    @Override // tb.ogc
    public String getSecondPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19bb6e35", new Object[]{this});
        }
        oga<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper == null) {
            return null;
        }
        return findSecPageWrapper.getSecondPageName();
    }

    @Override // tb.ogc
    public Map getSecondPageProperty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6ae7090a", new Object[]{this});
        }
        oga<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper == null) {
            return null;
        }
        return findSecPageWrapper.getSecondPageProperty();
    }

    @Override // tb.ogc
    public void setSecondPageUTObject(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9039d46", new Object[]{this, obj});
            return;
        }
        oga<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper == null) {
            return;
        }
        findSecPageWrapper.setSecondPageUTObject(obj);
    }

    @Override // tb.ogc
    public Object getSecondPageUTObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e1f89714", new Object[]{this});
        }
        oga<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper == null) {
            return null;
        }
        return findSecPageWrapper.getSecondPageUTObject();
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        ab tNodeEngine = getTNodeEngine();
        if (tNodeEngine != null && tNodeEngine.A() != null) {
            b(str, str2);
            return;
        }
        this.k = str;
        this.l = str2;
    }

    private void b(String str, String str2) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        if (str2 != null) {
            Uri parse = Uri.parse(str2);
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            HashMap hashMap2 = new HashMap();
            for (String str3 : queryParameterNames) {
                hashMap2.put(str3, parse.getQueryParameter(str3));
            }
            hashMap = hashMap2;
        } else {
            hashMap = null;
        }
        getTNodeEngine().b(0, getTNodeEngine().A(), str, null, hashMap, null);
    }
}

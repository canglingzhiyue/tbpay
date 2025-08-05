package com.taobao.android.detail.alittdetail;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Toast;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.security.ccrc.service.CcrcContext;
import com.alibaba.security.wukong.bx.CcrcBHService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.h;
import com.taobao.android.detail.alittdetail.share.b;
import com.taobao.android.detail.ttdetail.TTDetailBaseActivity;
import com.taobao.android.detail.ttdetail.behavior.c;
import com.taobao.android.detail.ttdetail.platformization.business.a;
import com.taobao.android.detail.ttdetail.utils.e;
import com.taobao.android.detail.ttdetail.utils.j;
import com.taobao.android.detail.ttdetail.utils.o;
import com.taobao.android.detail.ttdetail.widget.g;
import com.taobao.android.linkback.f;
import com.taobao.tao.m;
import com.taobao.uikit.actionbar.ShareContentCallBack;
import com.ut.share.business.ShareContent;
import com.ut.share.business.interf.IShareContainer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.kvr;
import tb.odg;
import tb.rih;

/* loaded from: classes4.dex */
public class TTDetailActivity extends TTDetailBaseActivity implements b.a, m, ShareContentCallBack, IShareContainer, kvr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f9350a;
    private List<rih> b;
    private CcrcBHService c;
    private boolean d;
    private OnScreenChangedListener e = new OnScreenChangedListener() { // from class: com.taobao.android.detail.alittdetail.TTDetailActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
            OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onScreenChanged(int i, Configuration configuration) {
            FragmentManager supportFragmentManager;
            Fragment findFragmentByTag;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            } else if (!j.ap() || (findFragmentByTag = (supportFragmentManager = TTDetailActivity.this.getSupportFragmentManager()).findFragmentByTag("DetailCommentFragment")) == null) {
            } else {
                FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                beginTransaction.remove(findFragmentByTag);
                beginTransaction.commitAllowingStateLoss();
            }
        }
    };

    static {
        kge.a(-1241044469);
        kge.a(477856532);
        kge.a(486007139);
        kge.a(321354641);
        kge.a(-72215967);
        kge.a(242491579);
    }

    public static /* synthetic */ Object ipc$super(TTDetailActivity tTDetailActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 93762283:
                super.d();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.detail.ttdetail.TTDetailBaseActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        com.alibaba.android.split.core.splitcompat.j.b(context);
    }

    @Override // com.taobao.tao.m
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ List a(TTDetailActivity tTDetailActivity, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5dd2ef8a", new Object[]{tTDetailActivity, list});
        }
        tTDetailActivity.b = list;
        return list;
    }

    public static /* synthetic */ void a(TTDetailActivity tTDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9c1b02c", new Object[]{tTDetailActivity});
        } else {
            tTDetailActivity.h();
        }
    }

    public static /* synthetic */ List b(TTDetailActivity tTDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("bc5771fa", new Object[]{tTDetailActivity}) : tTDetailActivity.b;
    }

    @Override // com.taobao.android.detail.ttdetail.TTDetailBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        TaobaoEvnInitializer.initialize();
        a(new g().b(QueryParamsManager.DEFAULT_CART_FROM).a("detail"));
        a(new a(this) { // from class: com.taobao.android.detail.alittdetail.TTDetailActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == -1474178196) {
                    super.a(((Boolean) objArr[0]).booleanValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // com.taobao.android.detail.ttdetail.platformization.business.a, tb.nup
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    return;
                }
                super.a(z);
                if (z) {
                    return;
                }
                TTDetailActivity.a(TTDetailActivity.this);
            }
        });
        i();
        super.onCreate(bundle);
        TaobaoEvnInitializer.overrideOrImplementDefaultBehaviors(this, g());
        if (o.a(this)) {
            Toast.makeText(this, "in TTD", 0).show();
        }
        h.a().c(this.e);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        if (this.b == null) {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.taobao.android.detail.alittdetail.TTDetailActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                    }
                    if (TTDetailActivity.b(TTDetailActivity.this) == null) {
                        TTDetailActivity.a(TTDetailActivity.this, new ArrayList());
                        rih rihVar = new rih(TTDetailActivity.this);
                        rihVar.a();
                        rih rihVar2 = new rih(TTDetailActivity.this);
                        rihVar2.a();
                        TTDetailActivity.b(TTDetailActivity.this).add(rihVar);
                        TTDetailActivity.b(TTDetailActivity.this).add(rihVar2);
                    }
                    return false;
                }
            });
        }
        CcrcBHService ccrcBHService = this.c;
        if (ccrcBHService == null || this.d) {
            return;
        }
        ccrcBHService.detect(null);
        this.d = true;
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.d = false;
        CcrcContext.init(this, e.c());
        if (!j.z()) {
            return;
        }
        this.c = CcrcBHService.getBHService("ccrc_taobao_crawler_risk");
        CcrcBHService ccrcBHService = this.c;
        if (ccrcBHService == null) {
            return;
        }
        ccrcBHService.activate();
    }

    @Override // com.taobao.android.detail.ttdetail.TTDetailBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        List<rih> list = this.b;
        if (list != null) {
            for (rih rihVar : list) {
                if (rihVar != null) {
                    rihVar.b();
                }
            }
        }
        CcrcBHService ccrcBHService = this.c;
        if (ccrcBHService != null) {
            ccrcBHService.deActivate();
        }
        h.a().d(this.e);
    }

    @Override // com.taobao.android.detail.ttdetail.TTDetailBaseActivity
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        f.a(getIntent(), this);
        super.d();
    }

    @Override // com.ut.share.business.interf.IShareContainer
    public View getShareContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f072ab61", new Object[]{this}) : this.f9350a;
    }

    @Override // com.taobao.android.detail.alittdetail.share.b.a
    public void onUpdateShareContainer(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfac20a1", new Object[]{this, view});
        } else {
            this.f9350a = view;
        }
    }

    @Override // com.taobao.uikit.actionbar.ShareContentCallBack
    public Object getQueryShareParameters() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("febe4434", new Object[]{this});
        }
        ShareContent a2 = b.a(g());
        if (odg.o().a()) {
            a2.businessId = "1_" + odg.o().b();
        } else {
            a2.businessId = "1";
        }
        com.taobao.android.detail.ttdetail.behavior.b.a((Context) this, c.COMPONENT_NAME_NAVI_BAR, c.ACTION_NAVI_BAR_MORE, (Map<String, String>) null);
        return a2;
    }

    @Override // tb.kvr
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        List<rih> list = this.b;
        return list != null && !list.isEmpty();
    }

    @Override // tb.kvr
    public List<rih> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this}) : this.b;
    }
}

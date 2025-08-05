package com.taobao.tao.adapter.biz;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.copy.a;
import com.taobao.share.multiapp.IShareBiz;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.Globals;
import com.taobao.tao.adapter.biz.friends.b;
import com.taobao.tao.adapter.biz.friends.c;
import com.taobao.tao.adapter.biz.plugins.SystemImageSharePlugin;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.interf.ILog;
import com.ut.share.utils.FlowOutFacade;
import tb.kge;
import tb.nyy;
import tb.nzg;
import tb.nzh;
import tb.nzi;
import tb.nzk;
import tb.nzl;
import tb.nzm;
import tb.nzo;
import tb.obh;
import tb.obk;
import tb.oco;
import tb.ocp;
import tb.ocq;
import tb.ocu;
import tb.ocy;
import tb.odb;
import tb.odc;
import tb.ode;
import tb.odk;
import tb.tjr;

/* loaded from: classes8.dex */
public class TBShareBiz implements IShareBiz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1594612734);
        kge.a(2081546873);
    }

    public TBShareBiz() {
        com.taobao.share.copy.a.a().a(new a.c() { // from class: com.taobao.tao.adapter.biz.TBShareBiz.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.share.copy.a.c
            public Activity a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Activity) ipChange.ipc$dispatch("2162bf40", new Object[]{this});
                }
                if (TBShareBiz.this.getAppEnv() != null) {
                    return TBShareBiz.this.getAppEnv().c();
                }
                return null;
            }
        });
        ShareBizAdapter.getInstance().setShareEngine(new ShareEngine());
        ShareBizAdapter.getInstance().setBackFlowEngine(odk.a());
        obk.a().a(new SystemImageSharePlugin());
        initInject();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public nzg getAppEnv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nzg) ipChange.ipc$dispatch("f1106422", new Object[]{this}) : ocp.i();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public nzm getShareChannel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nzm) ipChange.ipc$dispatch("b1410144", new Object[]{this}) : oco.g();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public nzk getLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nzk) ipChange.ipc$dispatch("ee8cc04d", new Object[]{this}) : ocq.d();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public nzi getFriendsProvider() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nzi) ipChange.ipc$dispatch("e4a60d32", new Object[]{this}) : c.c();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public nzo getShareWeexSdk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzo) ipChange.ipc$dispatch("5ae9c04c", new Object[]{this});
        }
        if (obh.e("")) {
            return tjr.e();
        }
        return ode.e();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public nzo getShareWeexSdk(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzo) ipChange.ipc$dispatch("7cadef02", new Object[]{this, str});
        }
        if (obh.e(str)) {
            return tjr.e();
        }
        return ode.e();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public nzo getShareBackWeexSdk(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzo) ipChange.ipc$dispatch("18b6b409", new Object[]{this, str});
        }
        if (obh.f(str)) {
            return tjr.e();
        }
        return ode.e();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public nzh getContactsInfoProvider() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nzh) ipChange.ipc$dispatch("be9bd5b", new Object[]{this}) : b.b();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public nzl getOrangeDefaultValueHelper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nzl) ipChange.ipc$dispatch("99f53efd", new Object[]{this}) : new odc();
    }

    @Override // com.taobao.share.multiapp.IShareBiz
    public void initShareMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca4bc35", new Object[]{this});
            return;
        }
        ocu.a().b();
        if (!ocy.a(Globals.getApplication())) {
        }
    }

    private boolean fixCrashIssue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8061072", new Object[]{this})).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "fixInitCrashIssue", "true"));
    }

    private void postMain(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8e0cfe", new Object[]{this, runnable});
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            new Handler(Looper.getMainLooper()).post(runnable);
        } else {
            runnable.run();
        }
    }

    private void initInject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af952ac8", new Object[]{this});
            return;
        }
        ShareBusiness.getInstance().setIHasTaoPassword(new a());
        ShareBusiness.getInstance().setILog(new ILog() { // from class: com.taobao.tao.adapter.biz.TBShareBiz.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ut.share.business.interf.ILog
            public void logr(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ccae41c9", new Object[]{this, str, str2});
                } else {
                    nyy.a(str, str2);
                }
            }

            @Override // com.ut.share.business.interf.ILog
            public void logd(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1bebe7bb", new Object[]{this, str, str2});
                } else {
                    nyy.b(str, str2);
                }
            }

            @Override // com.ut.share.business.interf.ILog
            public void loge(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a88c12bc", new Object[]{this, str, str2});
                } else {
                    nyy.c(str, str2);
                }
            }
        });
        FlowOutFacade.injectIFlowOutHelper(new odb());
    }
}

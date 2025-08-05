package tb;

import android.text.TextUtils;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.j;
import com.taobao.homepage.page.weexv2.a;
import com.taobao.infoflow.protocol.subservice.biz.IRocketSubService;
import com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class tin {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final List<String> b;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f34130a;
    private final pri c = new pri();
    private long d;

    static {
        kge.a(169273719);
        b = Arrays.asList(Constant.KEY_PAGEBACK, "homeTabAppear", "coldStart");
    }

    public tin(ljs ljsVar) {
        this.f34130a = ljsVar;
    }

    public Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        ISmartBackRefreshService iSmartBackRefreshService = (ISmartBackRefreshService) this.f34130a.a(ISmartBackRefreshService.class);
        if (iSmartBackRefreshService == null) {
            ldf.d("SmartBackRefresher", "Refresh Service is Null");
            return null;
        }
        boolean enableOutLinkBackRefresh = iSmartBackRefreshService.enableOutLinkBackRefresh();
        boolean z2 = TextUtils.equals(str, "coldStart") || iSmartBackRefreshService.isCurrentRefreshByOutLink();
        if (!a(str, enableOutLinkBackRefresh)) {
            ldf.d("SmartBackRefresher", "不允许携带 Bx 行为数据");
            return null;
        }
        String firstCompletelyVisibleBizCode = iSmartBackRefreshService.getFirstCompletelyVisibleBizCode();
        boolean enableSearchClickCheck = iSmartBackRefreshService.enableSearchClickCheck();
        boolean isDirectClickInInfoFlow = iSmartBackRefreshService.isDirectClickInInfoFlow();
        boolean enableIpvBackRefresh = iSmartBackRefreshService.enableIpvBackRefresh();
        boolean a2 = j.a("enableIpvBackRefresh", true);
        boolean enableSearchBackRefresh = iSmartBackRefreshService.enableSearchBackRefresh();
        iSmartBackRefreshService.resetStatus();
        boolean z3 = enableIpvBackRefresh && a2 && !isDirectClickInInfoFlow;
        pri priVar = this.c;
        long j = this.d;
        if (enableOutLinkBackRefresh && z2) {
            z = true;
        }
        Map<String, String> a3 = priVar.a(j, firstCompletelyVisibleBizCode, enableSearchBackRefresh, enableSearchClickCheck, z3, z);
        if (a3 != null && !a3.isEmpty()) {
            iSmartBackRefreshService.setRequestWithBxFeature(true);
        }
        return a3;
    }

    public Map<String, String> e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ddd6ceb", new Object[]{this, str});
        }
        if (!a(str, false)) {
            ldf.d("SmartBackRefresher", "不允许携带 Bx 行为数据");
            return null;
        }
        ISmartBackRefreshService iSmartBackRefreshService = (ISmartBackRefreshService) this.f34130a.a(ISmartBackRefreshService.class);
        if (iSmartBackRefreshService == null) {
            ldf.d("SmartBackRefresher", "Refresh Service is Null");
            return null;
        }
        boolean enableSearchClickCheck = iSmartBackRefreshService.enableSearchClickCheck();
        boolean isDirectClickInInfoFlowForCommon = iSmartBackRefreshService.isDirectClickInInfoFlowForCommon();
        boolean enableIpvBackRefresh = iSmartBackRefreshService.enableIpvBackRefresh();
        boolean enableNormalBackRefresh = iSmartBackRefreshService.enableNormalBackRefresh();
        boolean a2 = j.a("enableIpvBackRefresh", true);
        boolean enableSearchBackRefresh = iSmartBackRefreshService.enableSearchBackRefresh();
        boolean isBackgroundToFront = iSmartBackRefreshService.isBackgroundToFront();
        boolean z = iSmartBackRefreshService.enableBaseRefresh() && !isDirectClickInInfoFlowForCommon;
        iSmartBackRefreshService.resetCommonStatus();
        return this.c.a(this.d, enableSearchBackRefresh, enableSearchClickCheck, enableIpvBackRefresh && a2 && !isDirectClickInInfoFlowForCommon, enableNormalBackRefresh && !isDirectClickInInfoFlowForCommon, isBackgroundToFront, z);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        ldf.d("SmartBackRefresher", "onInfoFlowInVisible type : " + str);
        this.d = System.currentTimeMillis() - 1000;
    }

    private boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        if (!a() && !z) {
            ldf.d("SmartBackRefresher", "is not first screen");
            return false;
        } else if (!b() && !z) {
            ldf.d("SmartBackRefresher", "is not at recommend tab");
            return false;
        } else if (!d(str)) {
            ldf.d("SmartBackRefresher", "isAllowRequest is false， requestType： " + str);
            return false;
        } else if (!bxn.b(this.f34130a) || z) {
            return true;
        } else {
            ldf.d("SmartBackRefresher", "isDataAbandoned is true");
            return false;
        }
    }

    private boolean d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue() : b.contains(str);
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        IRocketSubService iRocketSubService = (IRocketSubService) this.f34130a.a(IRocketSubService.class);
        return iRocketSubService != null && !iRocketSubService.isOnRocketState();
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.c.a();
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : d() && c();
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        boolean z = !a.d();
        IHostService iHostService = (IHostService) this.f34130a.a(IHostService.class);
        if (iHostService == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "isHostPageOnStackTop-> hostService is null");
            return false;
        }
        lkc i = iHostService.getInvokeCallback().i();
        if (i == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "isHostPageOnStackTop-> pageCallback is null");
            return false;
        }
        boolean a2 = i.a();
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "isAtHome->： 不在二楼：" + z + " 是首页fragment：" + a2);
        return z && a2;
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) this.f34130a.a(IMainLifecycleService.class);
        boolean z = iMainLifecycleService != null && iMainLifecycleService.isSelect();
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "isAtRecommendHomeTab-> " + z);
        return z;
    }
}

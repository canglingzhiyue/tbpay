package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.interact.pop.d;
import com.taobao.homepage.page.weexv2.a;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.ut.share.business.ShareBusiness;

/* loaded from: classes7.dex */
public class kqo implements kqm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30238a;

    static {
        kge.a(-850794553);
        kge.a(-1937445498);
    }

    public kqo(ljs ljsVar) {
        this.f30238a = ljsVar;
    }

    @Override // tb.kqm
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : b() && a();
    }

    @Override // tb.kqm
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : b() && a();
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        IHostService iHostService = (IHostService) this.f30238a.a(IHostService.class);
        if (iHostService == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "isHostPageOnStackTop-> hostService is null");
            return false;
        }
        lkc i = iHostService.getInvokeCallback().i();
        if (i == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "isHostPageOnStackTop-> pageCallback is null");
            return false;
        }
        return i.a();
    }

    @Override // tb.kqm
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        boolean hasTaoPassword = ShareBusiness.getInstance().hasTaoPassword();
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("hasTaoPwd-> ");
        sb.append(hasTaoPassword ? "有" : "没有");
        sb.append("淘口令");
        strArr[0] = sb.toString();
        ldf.d(lsk.SPLASH_BUSINESS_TAG, strArr);
        return hasTaoPassword;
    }

    @Override // tb.kqm
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        boolean isEmpty = TextUtils.isEmpty(d.d());
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "isHasPop->：" + isEmpty);
        return isEmpty;
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        boolean z = !a.d();
        boolean i = i();
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "isAtHome->： 不在二楼：" + z + " 是首页fragment：" + i);
        return z && i;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) this.f30238a.a(IMainLifecycleService.class);
        boolean z = iMainLifecycleService != null && iMainLifecycleService.isSelect();
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "isAtRecommendHomeTab-> " + z);
        return z;
    }
}

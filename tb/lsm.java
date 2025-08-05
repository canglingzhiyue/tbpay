package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import java.util.Map;

/* loaded from: classes7.dex */
public class lsm extends kqo implements lsr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30896a;

    static {
        kge.a(723292730);
        kge.a(1084960235);
    }

    public static /* synthetic */ Object ipc$super(lsm lsmVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public lsm(ljs ljsVar) {
        super(ljsVar);
        this.f30896a = ljsVar;
    }

    private lkb f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lkb) ipChange.ipc$dispatch("357f9596", new Object[]{this});
        }
        IHostService iHostService = (IHostService) this.f30896a.a(IHostService.class);
        if (iHostService != null) {
            return iHostService.getInvokeCallback().c();
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "getNaviBarCallback-> 没有找到IHostService.");
        return null;
    }

    @Override // tb.lsr
    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        lkb f = f();
        if (f == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "updateSearchTextData-> 没有拿到要更新的底纹词数据或者没有拿到导航栏接口的实例，更新失败！");
            return null;
        }
        return f.c();
    }

    @Override // tb.lsr
    public JSONObject b() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this});
        }
        lkb f = f();
        if (f == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "updateSearchTextData-> 没有拿到要更新的底纹词数据或者没有拿到导航栏接口的实例，更新失败！");
            return null;
        }
        JSONObject c = f.c();
        if (c != null && c.containsKey("subSection") && (jSONObject = c.getJSONObject("subSection")) != null && jSONObject.containsKey("searchBox")) {
            return jSONObject.getJSONObject("searchBox");
        }
        return null;
    }

    @Override // tb.lsr
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        lkb f = f();
        if (f == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "refreshSearchBar-> 没有获取到INaviBarCallback ");
            return;
        }
        f.d();
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "refreshSearchBar-> 刷新导航栏 ");
    }

    @Override // tb.lsr
    public Map<String, Integer> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c27656b1", new Object[]{this, str, str2});
        }
        lkb f = f();
        if (f == null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "getNaviBarLocation-> 没有拿到导航栏接口的实例，更新失败！");
            return null;
        }
        return f.a("DXSearchBar", str2);
    }
}

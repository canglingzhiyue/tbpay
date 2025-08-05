package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.homepage.utils.HomePageUtility;

/* loaded from: classes7.dex */
public class sfl extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HSEARCHBARDATA = 6862667776971334459L;

    static {
        kge.a(-418772579);
    }

    public static /* synthetic */ Object ipc$super(sfl sflVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof String)) {
            ldf.d("DXDataParserHSearchBarData", "入参不是string");
            return null;
        }
        ohv a2 = a();
        if (a2 == null) {
            ldf.d("DXDataParserHSearchBarData", "homeSearchBarManager为空");
            return HomePageUtility.a(b(), (String) obj);
        }
        String str = (String) obj;
        Object a3 = a2.a(str);
        if (a3 != null) {
            return a3;
        }
        Object a4 = HomePageUtility.a(b(), str);
        AppMonitor.Alarm.commitFail("Page_Home", ssm.MONITOR_POINT, null, "getSearchBarDaraEmpty", "path: " + obj);
        return a4;
    }

    private ohv a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ohv) ipChange.ipc$dispatch("f08af01", new Object[]{this});
        }
        lbq b = oiy.a().b();
        if (b == null) {
            ldf.d("DXDataParserHSearchBarData", "pageProvider == null");
            return null;
        }
        lbo homePageManager = b.getHomePageManager();
        if (homePageManager == null) {
            ldf.d("DXDataParserHSearchBarData", "homePageManager == null");
            return null;
        }
        return homePageManager.e();
    }

    private JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this});
        }
        JSONObject c = sqg.c();
        if (c == null) {
            ldf.d("DXDataParserHSearchBarData", "searchBarData == null");
            return new JSONObject();
        }
        JSONObject jSONObject = c.getJSONObject("subSection");
        if (jSONObject == null) {
            ldf.d("DXDataParserHSearchBarData", "subSection == null");
            return new JSONObject();
        }
        return jSONObject.getJSONObject("home");
    }
}

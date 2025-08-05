package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.homepage.datasource.OnDataSourceUpdatedListener;
import com.taobao.homepage.utils.n;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import com.taobao.tao.recommend3.tracelog.a;
import com.taobao.themis.kernel.i;

/* loaded from: classes.dex */
public class oqp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f32306a;

    static {
        kge.a(-1288483873);
    }

    public oqp(String str) {
        this.f32306a = str;
    }

    public void a(ope opeVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a1b3bc", new Object[]{this, opeVar, jSONObject});
            return;
        }
        String string = jSONObject.getString(i.CDN_REQUEST_TYPE);
        String string2 = jSONObject.getString("dataSourceType");
        String string3 = jSONObject.getString("dataChangeType");
        if (TextUtils.isEmpty(string)) {
            AwesomeGetContainerInnerData c = opeVar.c(this.f32306a);
            string = (c == null || c.isCacheData) ? "loadCache" : "coldStart";
        }
        String str = string + "MainContainerUiRefresh";
        a.a(str, string, this.f32306a);
        com.taobao.android.home.component.utils.i.c(this.f32306a);
        OnDataSourceUpdatedListener.DataSourceType dataSourceType = OnDataSourceUpdatedListener.DataSourceType.DS_TYPE_REFRESH_CONTENT;
        if (TextUtils.equals(string2, "remote") && TextUtils.equals(string3, "base")) {
            dataSourceType = OnDataSourceUpdatedListener.DataSourceType.DS_TYPE_REMOTE_CONTENT;
        } else if (TextUtils.equals(string2, "local") && TextUtils.equals(string3, "base")) {
            dataSourceType = OnDataSourceUpdatedListener.DataSourceType.DS_TYPE_CACHED_CONTENT;
        } else if (TextUtils.equals(string2, "download")) {
            dataSourceType = OnDataSourceUpdatedListener.DataSourceType.DS_TYPE_TEMPLATE_UPDATE;
        }
        kwy kwyVar = new kwy(dataSourceType, true, com.taobao.android.home.component.utils.i.a());
        kwyVar.h = opeVar;
        kwyVar.c = 0;
        if (TextUtils.equals("delta", string3)) {
            kwyVar.c = 1;
        }
        ThreadMode threadMode = n.o() ? ThreadMode.CurrentThread : ThreadMode.MainThread;
        e.e("MainContainerUIRefreshProcess", "发送事件： " + kwyVar);
        com.taobao.homepage.speed.a.a().a(kwyVar, threadMode);
        a.a(str, true, string, this.f32306a);
    }
}

package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.loader.config.ConfigItem;
import com.taobao.alilive.aliliveframework.frame.loader.config.a;
import com.taobao.alilive.aliliveframework.frame.loader.config.b;
import com.taobao.taolive.sdk.utils.q;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class ddz implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR_CODE = "1";
    public static final String ERROR_MSG = "config is empty";

    /* renamed from: a  reason: collision with root package name */
    private static List<ConfigItem> f26714a;

    static {
        kge.a(-1895301028);
        kge.a(-379630840);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.loader.config.b
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3620c58e", new Object[]{this, aVar});
            return;
        }
        List<ConfigItem> list = f26714a;
        if (list != null && !list.isEmpty()) {
            aVar.a(f26714a);
            return;
        }
        String a2 = pmd.a().d().a("tblive", "componentStrategyConfig", "");
        if (!StringUtils.isEmpty(a2)) {
            try {
                JSONObject parseObject = JSON.parseObject(a2);
                if (parseObject == null) {
                    return;
                }
                JSONArray jSONArray = parseObject.getJSONArray("components");
                ArrayList arrayList = new ArrayList();
                if (jSONArray == null || jSONArray.isEmpty()) {
                    return;
                }
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    ConfigItem configItem = new ConfigItem();
                    configItem.component = jSONObject.getString("component");
                    configItem.delay = jSONObject.getLong("delay").longValue();
                    arrayList.add(configItem);
                }
                f26714a = arrayList;
                aVar.a(arrayList);
                return;
            } catch (Exception e) {
                q.b("OrangeStrategyConfig", "OrangeStrategyConfig.load : " + e.getMessage());
                aVar.a("1", e.getMessage());
                return;
            }
        }
        aVar.a("1", ERROR_MSG);
    }
}

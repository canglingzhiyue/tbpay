package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class iqy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DxShareDetailHelper";

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, com.taobao.android.fluid.framework.data.datamodel.a> f29241a = new HashMap<>();

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final iqy f29242a;

        static {
            kge.a(983069950);
            f29242a = new iqy();
        }

        public static /* synthetic */ iqy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (iqy) ipChange.ipc$dispatch("f0616ed", new Object[0]) : f29242a;
        }
    }

    static {
        kge.a(1036249804);
    }

    public static iqy a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iqy) ipChange.ipc$dispatch("f0616ed", new Object[0]) : a.a();
    }

    public HashMap<String, com.taobao.android.fluid.framework.data.datamodel.a> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("8adf10c", new Object[]{this}) : this.f29241a;
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : !StringUtils.isEmpty(str) && !StringUtils.isEmpty(Uri.parse(str).getQueryParameter("id"));
    }

    public String a(FluidContext fluidContext, String str, JSONObject jSONObject) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("711a3594", new Object[]{this, fluidContext, str, jSONObject});
        }
        if (!a(str) || (parse = Uri.parse(str)) == null) {
            return str;
        }
        String queryParameter = parse.getQueryParameter("id");
        String str2 = "snapshot" + queryParameter;
        String str3 = (str + "&dxShareData=" + str2) + "&showCollectionPopupPanel=" + jSONObject.getString("showCollectionPopupPanel");
        a(fluidContext, str2, queryParameter);
        return str3;
    }

    private void a(FluidContext fluidContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7e4f7ae", new Object[]{this, fluidContext, str, str2});
            return;
        }
        com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) fluidContext.getService(IDataService.class)).getCurrentMediaSetData();
        spz.c(TAG, "添加一跳Detail的key:" + str);
        if (currentMediaSetData == null || currentMediaSetData.a() == null || !StringUtils.equals(currentMediaSetData.a().I(), str2)) {
            return;
        }
        a(str, currentMediaSetData);
    }

    public void a(String str, com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee56cda", new Object[]{this, str, aVar});
            return;
        }
        HashMap<String, com.taobao.android.fluid.framework.data.datamodel.a> hashMap = this.f29241a;
        if (hashMap == null) {
            return;
        }
        hashMap.put(str, aVar);
    }
}

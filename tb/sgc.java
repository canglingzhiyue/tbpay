package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;

/* loaded from: classes7.dex */
public class sgc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1753943042);
    }

    public static boolean a(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2453afd7", new Object[]{iContainerDataModel})).booleanValue();
        }
        boolean a2 = ldj.a("enableDefaultOpenNDInstant", true);
        if (iContainerDataModel == null) {
            ldf.d("NewDetailPreLoaderSwitch", "enablePreLoadNewDetail containerDataModel is null");
            return a2;
        }
        JSONObject c = c(iContainerDataModel);
        if (!ObjectUtils.a(c)) {
            return c.getBoolean("enablePreLoadNewDetail") == null ? a2 : c.getBooleanValue("enablePreLoadNewDetail");
        }
        ldf.d("NewDetailPreLoaderSwitch", "enablePreLoadNewDetail homeGlobalAbTest is null");
        return a2;
    }

    public static String b(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2ceb92e", new Object[]{iContainerDataModel});
        }
        JSONObject c = c(iContainerDataModel);
        if (ObjectUtils.a(c)) {
            ldf.d("NewDetailPreLoaderSwitch", "getBucket homeGlobalAbTest is null");
            return null;
        }
        return c.getString("bucket");
    }

    public static JSONObject c(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5efea2b1", new Object[]{iContainerDataModel});
        }
        if (iContainerDataModel == null) {
            ldf.d("NewDetailPreLoaderSwitch", "containerDataModel == null");
            return null;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            ldf.d("NewDetailPreLoaderSwitch", "baseData == null");
            return null;
        }
        JSONObject ext = base.getExt();
        if (ext == null) {
            ldf.d("NewDetailPreLoaderSwitch", "ext == null");
            return null;
        }
        return ext.getJSONObject("homeGlobalABTest");
    }
}

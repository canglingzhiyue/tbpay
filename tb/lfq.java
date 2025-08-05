package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.ba;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.render.InfoFlowDxUserContext;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* loaded from: classes.dex */
public class lfq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DINAMIC_MODULE = "informationFlow";
    public static final int GUESS_BIZ_ID = 53;
    public static final String GUESS_BIZ_NAME = "guess";

    static {
        kge.a(801920034);
    }

    public static <T> T a(Object[] objArr, int i, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6ba1616f", new Object[]{objArr, new Integer(i), cls});
        }
        if (objArr.length <= i || objArr[i] == null || !objArr[i].getClass().equals(cls)) {
            return null;
        }
        return (T) objArr[i];
    }

    public static ljs a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ljs) ipChange.ipc$dispatch("6fc39e78", new Object[]{dXRuntimeContext});
        }
        InfoFlowDxUserContext c = c(dXRuntimeContext);
        if (c != null) {
            return c.getInfoFlowContext();
        }
        return null;
    }

    public static BaseSectionModel<?> b(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("ac1ce704", new Object[]{dXRuntimeContext});
        }
        InfoFlowDxUserContext c = c(dXRuntimeContext);
        if (c != null) {
            return c.getBaseSectionModel();
        }
        return null;
    }

    public static InfoFlowDxUserContext c(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InfoFlowDxUserContext) ipChange.ipc$dispatch("9e3a2498", new Object[]{dXRuntimeContext});
        }
        if (dXRuntimeContext == null) {
            return null;
        }
        ba b = dXRuntimeContext.b();
        if (b instanceof InfoFlowDxUserContext) {
            return (InfoFlowDxUserContext) b;
        }
        return null;
    }

    public static void a(BaseSectionModel<?> baseSectionModel, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4acac4", new Object[]{baseSectionModel, str, str2});
        } else if (str == null || str2 == null) {
        } else {
            JSONObject ext = baseSectionModel.getExt();
            if (ext == null) {
                ext = new JSONObject();
                baseSectionModel.put("ext", (Object) ext);
            }
            JSONObject jSONObject = ext.getJSONObject("clientCache");
            if (jSONObject == null) {
                jSONObject = new JSONObject();
                ext.put("clientCache", (Object) jSONObject);
            }
            jSONObject.put(str, (Object) str2);
        }
    }

    public static String a(BaseSectionModel<?> baseSectionModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("625f4c66", new Object[]{baseSectionModel, str});
        }
        if (str == null) {
            return null;
        }
        JSONObject ext = baseSectionModel.getExt();
        if (ext == null) {
            ext = new JSONObject();
            baseSectionModel.put("ext", (Object) ext);
        }
        JSONObject jSONObject = ext.getJSONObject("clientCache");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            ext.put("clientCache", (Object) jSONObject);
        }
        return jSONObject.getString(str);
    }
}

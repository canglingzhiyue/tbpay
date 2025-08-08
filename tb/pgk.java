package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.sdk.utils.l;

/* loaded from: classes8.dex */
public class pgk extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HIGHLIGHT_STRUCT_JSON_STR = -5424885194204731482L;

    static {
        kge.a(1247292894);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject parseObject;
        Object obj;
        LiveTimemovingModel liveTimemovingModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length != 0 && !StringUtils.isEmpty(String.valueOf(objArr[0])) && (parseObject = JSON.parseObject(String.valueOf(objArr[0]))) != null) {
            int a2 = l.a(parseObject.getString("selectedItemIndex"));
            JSONArray jSONArray = parseObject.getJSONObject("model").getJSONArray("timeMovingList");
            if (jSONArray != null && jSONArray.size() > a2 && (obj = jSONArray.get(a2)) != null && (liveTimemovingModel = (LiveTimemovingModel) JSON.parseObject(JSON.toJSONString(obj), LiveTimemovingModel.class)) != null && liveTimemovingModel.extendVal != null && liveTimemovingModel.extendVal.timeMovingPlayInfo != null) {
                return liveTimemovingModel.extendVal.timeMovingPlayInfo;
            }
        }
        return null;
    }
}

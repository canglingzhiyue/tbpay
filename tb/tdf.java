package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;
import com.taobao.android.xsearchplugin.debugger.ace.AceLifecycleListener;
import com.taobao.search.sf.BaseResultActivity;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.datasource.c;

/* loaded from: classes8.dex */
public class tdf extends ink {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-995813735);
    }

    @Override // tb.inl
    public Object a(JsonRpcRequest jsonRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c269392b", new Object[]{this, jsonRpcRequest});
        }
        Activity activity = (Activity) AceLifecycleListener.sCurrentActivity.get();
        if (activity == null) {
            throw new IllegalStateException("获取不到当前栈顶的Activity");
        }
        if (!(activity instanceof BaseResultActivity)) {
            throw new IllegalStateException("当前栈顶页面非XSearch容器，请确保当前处于搜索结果页");
        }
        JSONObject jSONObject = (JSONObject) jsonRpcRequest.getParams();
        int intValue = jSONObject.getIntValue("from");
        int intValue2 = jSONObject.getIntValue("to");
        c e = ((BaseResultActivity) activity).d.e();
        int size = ((CommonSearchResult) e.getTotalSearchResult()).getCells().size();
        if (intValue < 0 || intValue2 < 0 || intValue >= size || intValue2 >= size) {
            throw new IllegalArgumentException("参数不合法，当前cell个数" + size + ",from:" + intValue + ",to:" + intValue2);
        }
        e.moveCell(intValue, intValue2);
        return null;
    }
}

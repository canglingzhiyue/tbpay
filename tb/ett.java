package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.mainpic.holder.n;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes4.dex */
public class ett extends etr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.etr
    public String b(String str, IDMComponent iDMComponent, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4403e4", new Object[]{this, str, iDMComponent, nVar});
        }
        JSONObject fields = iDMComponent.getFields();
        return fields != null ? nVar.a(str, fields) : str;
    }
}

package tb;

import android.util.Log;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes4.dex */
public class tdd extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_EVENT_ID;
    public static final long DX_PARSER_KVSTORAGEGETITEM;

    static {
        kge.a(-805310914);
        long a2 = fxa.a("kvStorageGetItem");
        DX_EVENT_ID = a2;
        DX_PARSER_KVSTORAGEGETITEM = a2;
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0 || !(objArr[0] instanceof JSONObject)) {
            return null;
        }
        ExecuteResult a2 = new alu(new alr("detail", "detail").a(dXRuntimeContext.m())).a("kvStorage", "getItem", new alq().a(dXRuntimeContext.v()), (JSONObject) objArr[0], new alo() { // from class: tb.tdd.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.alo
            public void onCallback(ExecuteResult executeResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                }
            }
        });
        Log.e("DXDataParserKvStorageGetItem", "data : " + a2.e());
        if (a2.e() != null) {
            return a2.e().get("result");
        }
        return null;
    }
}

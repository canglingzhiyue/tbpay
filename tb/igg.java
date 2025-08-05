package tb;

import android.util.Log;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes4.dex */
public class igg extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_KVSTORAGEGETITEM = 4255344915554475637L;

    /* renamed from: a  reason: collision with root package name */
    private static final String f29009a;

    static {
        kge.a(1684953520);
        f29009a = igg.class.getSimpleName();
    }

    public igg() {
        emu.a("com.taobao.android.detail.core.aura.extension.event.floatView.DXDataParserKvStorageGetItem");
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
        ExecuteResult a2 = new alu(new alr("detail", "detail").a(dXRuntimeContext.m())).a("kvStorage", "getItem", new alq().a(dXRuntimeContext.v()), (JSONObject) objArr[0], new alo() { // from class: tb.igg.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.alo
            public void onCallback(ExecuteResult executeResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                }
            }
        });
        String str = f29009a;
        Log.e(str, "data : " + a2.e());
        if (a2.e() != null) {
            return a2.e().get("result");
        }
        return null;
    }
}

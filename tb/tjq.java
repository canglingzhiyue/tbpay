package tb;

import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.msoa.c;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class tjq extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_OPENRECSKU = 1829977483167961545L;

    public static /* synthetic */ Object ipc$super(tjq tjqVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length == 0) {
        } else {
            try {
                JSONObject parseObject = JSONObject.parseObject(objArr[0].toString());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bizName", (Object) "minidetail");
                jSONObject.put("skuId", (Object) "");
                jSONObject.put("from", (Object) "ovs");
                jSONObject.put("openFrom", (Object) "tmg-recommend-dx");
                HashMap hashMap = new HashMap(3);
                hashMap.put("itemId", parseObject.getString("itemId"));
                hashMap.put("sourceType", "0");
                hashMap.put("exParams", jSONObject);
                c.a().a(new com.taobao.android.msoa.h("msoa.taobao.cart.sdk", "msoa.taobao.detail.showsku", "2.0", "cart", hashMap), new MSOAServiceListener() { // from class: tb.tjq.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                    public void onSuccess(Map<String, Object> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                        } else {
                            Log.e("xiangzhi", "onSuccess");
                        }
                    }

                    @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                    public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                        } else {
                            Log.e("xiangzhi", "onFail");
                        }
                    }
                });
            } catch (Exception unused) {
                Log.e("xiangzhi", TLogTracker.SCENE_EXCEPTION);
            }
        }
    }
}

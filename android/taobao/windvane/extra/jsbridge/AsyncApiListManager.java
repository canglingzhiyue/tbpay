package android.taobao.windvane.extra.jsbridge;

import android.taobao.windvane.config.j;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.p;
import kotlin.i;
import kotlin.t;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/taobao/windvane/extra/jsbridge/AsyncApiListManager;", "", "()V", "apiListInjectionCode", "", "getApiListInjectionCode", "()Ljava/lang/String;", "windvane_core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class AsyncApiListManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AsyncApiListManager INSTANCE;

    static {
        kge.a(53327127);
        INSTANCE = new AsyncApiListManager();
    }

    private AsyncApiListManager() {
    }

    public final String getApiListInjectionCode() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("717e2f57", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.addAll(p.c("NShop.*", "WVMega.call", "Base.setInnerScrollViewProperty", "TBDeviceInfo.getUtdid", "MtopWVPlugin.send", "WVBroadcast.createChannel", "WVBroadcast.postMessage", "WVNative.openWindow", "WVNative.nativeBack", "WVNetwork.getNetworkType", "WVTBUserTrack.toUT2", "WVPopLayer.getTriggerEventInfo", "WVPopLayer.navigateBack", "WVPopLayer.display", "WVPopLayer.close"));
        String str = j.commonConfig.cS;
        try {
            Result.a aVar = Result.Companion;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z) {
                jSONArray.addAll(JSONArray.parseArray(str));
            }
            Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(i.a(th));
        }
        return "__windvane_async_APIList__=" + jSONArray.toJSONString() + ";";
    }
}

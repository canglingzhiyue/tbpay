package com.taobao.android.weex.bridge;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.inspector.a;
import com.taobao.android.weex.inspector.c;
import java.io.Serializable;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public class WeexPlatformInspectorBridge implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InspectorBridge";

    static {
        kge.a(-542051295);
        kge.a(1028243835);
    }

    private static native void callbackDOMStorageResultNative(long j, JSONObject jSONObject);

    public static native void networkDataReceived(int i, String str, double d, byte[] bArr);

    public static native void networkLoadingFailed(int i, String str, double d, int i2, String str2, boolean z);

    public static native void networkLoadingFinished(int i, String str, double d, int i2);

    public static native void networkRequestServedFromCache(int i, String str);

    public static native void networkRequestWillBeSent(int i, String str, String str2, String str3, JSONObject jSONObject, String str4, double d, double d2, int i2);

    public static native void networkResponseReceived(int i, String str, String str2, int i2, String str3, JSONObject jSONObject, boolean z, double d, int i3);

    public static /* synthetic */ void access$000(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e6061b1", new Object[]{new Long(j), jSONObject});
        } else {
            callbackDOMStorageResultNative(j, jSONObject);
        }
    }

    public static void getDOMStorageItems(WeexInstanceImpl weexInstanceImpl, String str, boolean z, String str2, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b512546", new Object[]{weexInstanceImpl, str, new Boolean(z), str2, new Long(j)});
        } else {
            a.a(str, z, new a.InterfaceC0613a() { // from class: com.taobao.android.weex.bridge.WeexPlatformInspectorBridge.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex.inspector.a.InterfaceC0613a
                public void a(JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("32861656", new Object[]{this, jSONObject});
                    } else {
                        WeexPlatformInspectorBridge.access$000(j, jSONObject);
                    }
                }
            });
        }
    }

    public static JSONObject getProcedure(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("25615ef0", new Object[]{weexInstanceImpl}) : c.a(weexInstanceImpl);
    }
}

package com.taobao.android.behavix.bhxbridge;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.behavixswitch.a;
import com.taobao.android.behavix.behavixswitch.j;
import com.taobao.android.behavix.i;
import com.taobao.android.behavix.utils.b;
import com.taobao.android.testutils.JsBridgeBehaviXConfig;
import java.util.ArrayList;
import java.util.Map;
import tb.drp;
import tb.dsc;
import tb.kge;

/* loaded from: classes.dex */
public class BHXCXXInnerBridge extends BHXCXXBaseBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile boolean sHasUpdateOrange;

    private static native void nativeDirectlySaveFeaturesToBUFS(String str);

    private static native void nativeExecMockInterface(String str);

    private static native String nativeGetMatchConditionConfig();

    private static native int nativeGetTid(String str);

    private static native void nativeNotifyNativeOrangeUpdate(String[] strArr, String[] strArr2);

    private static native void nativeTransferBaseNodeToBUFS(String str, String str2);

    private static native void nativeTransferFeatureToBUFS(String str, String str2);

    private static native void nativeUpdataFeatureByBUFSProtocol(String str, String str2);

    private static native void nativeUpdateCXXCttpUploadState(boolean z, String str);

    public static /* synthetic */ void access$000(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818c8bd7", new Object[]{strArr, strArr2});
        } else {
            nativeNotifyNativeOrangeUpdate(strArr, strArr2);
        }
    }

    public static /* synthetic */ void access$100(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2b2e82", new Object[]{str});
        } else {
            nativeExecMockInterface(str);
        }
    }

    static {
        kge.a(-62086239);
        sHasUpdateOrange = false;
    }

    public static void notifyOrangeUpdate(final Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f68254f6", new Object[]{map, new Boolean(z)});
            return;
        }
        sHasUpdateOrange = true;
        b bVar = new b("OrangeUpdate") { // from class: com.taobao.android.behavix.bhxbridge.BHXCXXInnerBridge.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.behavix.utils.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                BHXCXXBaseBridge.setupBHXCpp();
                if (!BHXCXXBaseBridge.isNativeLibraryLoaded) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (String str : map.keySet()) {
                    if (!j.allCppOrangeBlackKeys.contains(str)) {
                        arrayList.add(str);
                    }
                }
                int size = arrayList.size();
                if (size == 0) {
                    return;
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                String[] strArr2 = new String[size];
                for (int i = 0; i < size; i++) {
                    strArr2[i] = (String) map.get(strArr[i]);
                }
                try {
                    BHXCXXInnerBridge.access$000(strArr, strArr2);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        if (z && a.b(j.b.K_ENABLE_SWITCH_FIRST, false)) {
            bVar.run();
        } else {
            dsc.a(bVar);
        }
    }

    public static void initOrangeByCacheValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f4dfcb", new Object[0]);
        } else if (sHasUpdateOrange) {
        } else {
            notifyOrangeUpdate(a.g(), true);
        }
    }

    public static void transferBaseNodeToBUFS(drp drpVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a954dc58", new Object[]{drpVar, str});
        } else if (!isNativeLibraryLoaded || drpVar == null || TextUtils.isEmpty(str)) {
        } else {
            Map<String, Object> a2 = drpVar.a();
            if (a2.isEmpty()) {
                return;
            }
            JSONObject jSONObject = new JSONObject(a2);
            if (jSONObject.isEmpty()) {
                return;
            }
            String jSONString = jSONObject.toJSONString();
            if (TextUtils.isEmpty(jSONString)) {
                return;
            }
            nativeTransferBaseNodeToBUFS(jSONString, str);
        }
    }

    public static void transferFeatureToBUFS(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a3a004d", new Object[]{jSONObject, str});
        } else if (!isNativeLibraryLoaded || jSONObject.isEmpty() || TextUtils.isEmpty(str)) {
        } else {
            nativeTransferFeatureToBUFS(jSONObject.toJSONString(), str);
        }
    }

    public static void updateCXXCttpUploadState(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("997b4fee", new Object[]{new Boolean(z), str});
        } else if (!isNativeLibraryLoaded || TextUtils.isEmpty(str) || !JsBridgeBehaviXConfig.isEnableRealTimeMTopDebug()) {
        } else {
            nativeUpdateCXXCttpUploadState(z, str);
        }
    }

    public static void directlySaveFeaturesToBUFS(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("303dc4fc", new Object[]{str});
        } else if (!isNativeLibraryLoaded || TextUtils.isEmpty(str)) {
        } else {
            nativeDirectlySaveFeaturesToBUFS(str);
        }
    }

    public static void updataFeatureByBUFSProtocol(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99e33db", new Object[]{str, str2});
        } else if (!isNativeLibraryLoaded || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            nativeUpdataFeatureByBUFSProtocol(str, str2);
        }
    }

    public static void execMockInterface(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9751cf", new Object[]{str});
        } else if (!isNativeLibraryLoaded || TextUtils.isEmpty(str)) {
        } else {
            dsc.a(new Runnable() { // from class: com.taobao.android.behavix.bhxbridge.BHXCXXInnerBridge.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        BHXCXXInnerBridge.access$100(str);
                    }
                }
            }, i.TAG, "internal", "ExecMockInterface", (String[]) null);
        }
    }

    public static JSONObject getMatchConditionConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("33e9e8d5", new Object[0]);
        }
        try {
            return JSON.parseObject(nativeGetMatchConditionConfig());
        } catch (Exception unused) {
            return null;
        }
    }

    public static int getNativeThreadTidByName(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1672d63e", new Object[]{str})).intValue() : nativeGetTid(str);
    }
}

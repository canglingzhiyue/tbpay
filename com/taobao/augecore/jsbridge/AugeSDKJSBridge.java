package com.taobao.augecore.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
import tb.kay;
import tb.kaz;

/* loaded from: classes6.dex */
public class AugeSDKJSBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_GROUP = "getAllCrowdIdList";
    public static final String ACTION_GROUP_SYN = "getAllCrowdIdListSyn";
    public static final String ACTION_IN = "isInGroup";
    public static final String ACTION_IN_SYN = "isInGroupSyn";
    public static final String NAME = "AugeAndroidJs";

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (wVCallBackContext == null) {
            return false;
        }
        List<String> arrayList = new ArrayList<>();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.has("crowdIds")) {
                arrayList = Arrays.asList(((String) jSONObject.get("crowdIds")).split(","));
            }
            String str3 = jSONObject.has("crowdId") ? (String) jSONObject.get("crowdId") : "";
            String str4 = jSONObject.has("bizCode") ? (String) jSONObject.get("bizCode") : "unknown";
            String str5 = (String) jSONObject.get("token");
            final r rVar = new r();
            char c = 65535;
            switch (str.hashCode()) {
                case -1963277096:
                    if (str.equals(ACTION_IN_SYN)) {
                        c = 0;
                        break;
                    }
                    break;
                case -1952388915:
                    if (str.equals(ACTION_GROUP_SYN)) {
                        c = 2;
                        break;
                    }
                    break;
                case -504948741:
                    if (str.equals(ACTION_GROUP)) {
                        c = 3;
                        break;
                    }
                    break;
                case 1337110480:
                    if (str.equals(ACTION_IN)) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c != 0) {
                if (c == 1) {
                    kay.a().a(str4, str3, new kaz() { // from class: com.taobao.augecore.jsbridge.AugeSDKJSBridge.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.kaz
                        public void a(List<String> list) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("c7052959", new Object[]{this, list});
                            }
                        }

                        @Override // tb.kaz
                        public void a(boolean z) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                                return;
                            }
                            rVar.a("data", Boolean.valueOf(z));
                            wVCallBackContext.success(rVar);
                        }
                    }, str5);
                } else if (c == 2) {
                    valueOf = kay.a().a(str4, arrayList, str5);
                } else if (c == 3) {
                    kay.a().a(str4, arrayList, new kaz() { // from class: com.taobao.augecore.jsbridge.AugeSDKJSBridge.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.kaz
                        public void a(boolean z) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                            }
                        }

                        @Override // tb.kaz
                        public void a(List<String> list) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("c7052959", new Object[]{this, list});
                                return;
                            }
                            rVar.a("data", list);
                            wVCallBackContext.success(rVar);
                        }
                    }, str5);
                }
                return true;
            }
            valueOf = Boolean.valueOf(kay.a().a(str4, str3, str5));
            rVar.a("data", valueOf);
            wVCallBackContext.success(rVar);
            return true;
        } catch (Exception unused) {
            wVCallBackContext.error();
            return false;
        }
    }
}

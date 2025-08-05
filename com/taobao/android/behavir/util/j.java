package com.taobao.android.behavir.util;

import android.text.TextUtils;
import com.alibaba.analytics.core.model.LogField;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.UTMini;
import com.taobao.android.behavir.fatigue.FatigueManager;
import com.taobao.android.behavir.util.i;
import com.taobao.android.external.UCPManager;
import com.taobao.android.ucp.bridge.NativeBroadcast;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class j extends com.ut.mini.module.trackerlistener.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UCP_TRACK_INFO = "ucpTrackInfo";

    /* renamed from: a  reason: collision with root package name */
    private JSONArray f9158a;
    private List<String> b;

    static {
        kge.a(-1279785287);
    }

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
        if (str.hashCode() == 1613428460) {
            super.sendEvent((Map) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public String trackerListenerName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1d8246a2", new Object[]{this}) : "UCP";
    }

    public static /* synthetic */ List a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("41b2feaa", new Object[]{jVar}) : jVar.b();
    }

    public static /* synthetic */ JSONArray b(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("2eb0d3e2", new Object[]{jVar}) : jVar.a();
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public void sendEvent(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("602af6ec", new Object[]{this, map});
            return;
        }
        super.sendEvent(map);
        final String str = map.get(LogField.EVENTID.toString());
        final String str2 = map.get(LogField.ARG1.toString());
        if (!Arrays.asList("2201", "2101").contains(str)) {
            return;
        }
        final Map<String, String> a2 = a(map);
        if (a2 == null) {
            if (!"Page_Push_TBMSGPush_Show".equals(str2)) {
                return;
            }
            i.a(new i.a() { // from class: com.taobao.android.behavir.util.j.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.behavix.utils.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        FatigueManager.increaseCount(FatigueManager.FrequencyActionType.kExpose, 0L, 999999L, 0L, 0L, 0L, UTMini.PAGE_AGOO);
                    }
                }
            });
            return;
        }
        i.a(new i.a() { // from class: com.taobao.android.behavir.util.j.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str3, Object... objArr) {
                str3.hashCode();
                throw new InstantReloadException(String.format("String switch could not find '%s'", str3));
            }

            private NativeBroadcast.Callback c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (NativeBroadcast.Callback) ipChange2.ipc$dispatch("3cc80256", new Object[]{this});
                }
                String str3 = (String) a2.get(UCPManager.UCP_CALLBACK_ID);
                if (!TextUtils.isEmpty(str3)) {
                    return NativeBroadcast.Callback.recover(Integer.parseInt(str3));
                }
                return null;
            }

            @Override // com.taobao.android.behavix.utils.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (com.taobao.android.behavix.behavixswitch.a.a("enableUtPlugin", true) && !j.a(j.this).contains(str2)) {
                    try {
                        NativeBroadcast.Callback c = c();
                        JSONArray parseArray = JSON.parseArray(URLDecoder.decode((String) a2.get("ucpTrackInfo")));
                        if (parseArray == null) {
                            return;
                        }
                        FatigueManager.FrequencyActionType frequencyActionType = FatigueManager.FrequencyActionType.kExpose;
                        if ("2101".equals(str)) {
                            if (j.b(j.this).contains(str2)) {
                                frequencyActionType = FatigueManager.FrequencyActionType.kCancel;
                            } else {
                                frequencyActionType = FatigueManager.FrequencyActionType.kClick;
                            }
                        }
                        for (int i = 0; i < parseArray.size(); i++) {
                            JSONObject jSONObject = parseArray.getJSONObject(i);
                            if (c != null) {
                                jSONObject.put("actionType", (Object) Integer.valueOf(frequencyActionType.ordinal()));
                                c.callback(jSONObject, null);
                            } else {
                                FatigueManager.increaseCount(frequencyActionType, com.taobao.android.behavir.fatigue.a.a(jSONObject), FatigueManager.getIdentifierFromSchemeId(jSONObject.getString("schemeId")));
                            }
                        }
                        if (c == null) {
                            return;
                        }
                        if (frequencyActionType == FatigueManager.FrequencyActionType.kExpose) {
                            c.cache();
                        } else {
                            c.close();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        });
    }

    @Override // com.ut.mini.module.trackerlistener.a
    public int[] getAttentionEventIdsForSendEvent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("ec81ea0e", new Object[]{this}) : com.taobao.android.behavir.init.b.LISTEN_UT_IDS;
    }

    private Map<String, String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{this, map});
        }
        if (!TextUtils.isEmpty(map.get("ucpTrackInfo"))) {
            return map;
        }
        String str = map.get(LogField.ARGS.toString());
        if (str != null && str.contains("ucpTrackInfo")) {
            return com.taobao.android.behavix.j.a(str, ",", "=", false);
        }
        return null;
    }

    private JSONArray a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("dc1f20d6", new Object[]{this});
        }
        if (this.f9158a == null) {
            this.f9158a = Utils.a(JSON.parseArray(com.taobao.android.behavix.behavixswitch.a.a("cancelArg1List", "[\"Page_Push_TBMSGPush_Cancel\"]")));
        }
        return this.f9158a;
    }

    private List<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        List<String> list = this.b;
        if (list != null) {
            return list;
        }
        this.b = g.a(Utils.a(JSON.parseArray(com.taobao.android.behavix.behavixswitch.a.a("ucpBackflowArg1BlackList", "[\"Page_Push_TBMSGPush_Dismiss\", \"Page_Push_TBMSGPush_ActualShow\"]"))), String.class);
        return this.b;
    }
}

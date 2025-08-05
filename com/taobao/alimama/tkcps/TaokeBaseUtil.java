package com.taobao.alimama.tkcps;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.io.SharedPreferencesUtils;
import com.taobao.alimama.net.pojo.request.AlimamaCpsActionRequest;
import com.taobao.alimama.net.pojo.request.AlimamaCpsTraceSendRequest;
import com.taobao.alimama.net.pojo.response.AlimamaCpsActionResponse;
import com.taobao.alimama.net.pojo.response.AlimamaCpsTraceSendResponse;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.muniontaobaosdk.util.MunionDeviceUtil;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.utils.Global;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import tb.dhf;
import tb.dhg;
import tb.dhm;
import tb.dhq;
import tb.kge;
import tb.kuh;

/* loaded from: classes.dex */
public class TaokeBaseUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f8452a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public enum ITEM_TYPE {
        TAOBAO(0),
        TMALL(1);
        
        int value;

        ITEM_TYPE(int i) {
            this.value = i;
        }
    }

    static {
        kge.a(313654227);
    }

    @Deprecated
    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        }
    }

    public static void a(String str, long j, long j2, boolean z, Map<String, String> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9422e263", new Object[]{str, new Long(j), new Long(j2), new Boolean(z), map});
            return;
        }
        try {
            com.taobao.alimama.d.a().a(str, String.valueOf(j), String.valueOf(j2), z, JSONObject.toJSONString(map));
            com.taobao.alimama.utils.d c = com.taobao.alimama.utils.d.c("TaokeInfo");
            c.a("new_v2_precommit", new Object[0]);
            HashMap hashMap = new HashMap(4);
            String a2 = com.taobao.utils.a.a(str, "e");
            String a3 = com.taobao.utils.a.a(str, "type");
            String a4 = com.taobao.utils.a.a(str, "clickid");
            String a5 = com.taobao.utils.a.a(str, "packageName");
            String a6 = com.taobao.utils.a.a(str, kuh.ALI_TRACK_ID);
            String a7 = c.a().a(z);
            String b = e.a().b();
            if (TextUtils.isEmpty(a2) || !"2".equals(a3)) {
                str2 = a6;
            } else {
                str2 = a6;
                c.a("new_v2_get_page_e", new Object[0]);
                hashMap.put("pageE", a2);
            }
            if (!TextUtils.isEmpty(a7)) {
                c.a("new_v2_get_global_e", new Object[0]);
                hashMap.put("globalE", a7);
            }
            if (!TextUtils.isEmpty(b)) {
                c.a("new_v2_get_channel_e", new Object[0]);
                hashMap.put("channelE", b);
            }
            Map<String, String> hashMap2 = map == null ? new HashMap<>(2) : map;
            hashMap2.put("eclickid", a4);
            if (!TextUtils.isEmpty(a5)) {
                hashMap2.put("packageName", a5);
            }
            if (!hashMap.isEmpty()) {
                c.a("new_v2_commit_e", JSON.toJSONString(hashMap));
                a(hashMap, j, j2, z, hashMap2);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("eMap", JSON.toJSONString(hashMap));
                jSONObject.put("sellerId", j);
                jSONObject.put("itemId", j2);
                jSONObject.put("isMall", z);
                String str3 = str2;
                jSONObject.put("aliTrackId", str3);
                String str4 = "eMap=" + JSON.toJSONString(hashMap) + ",sellerId=" + j + ",itemId=" + j2 + ",isMall=" + z + ",alitrackid=" + str3 + ",url=" + str;
                if (!hashMap2.isEmpty()) {
                    jSONObject.put("extMap", JSON.toJSONString(hashMap2));
                    str4 = str4 + ",extMap=" + JSON.toJSONString(hashMap2) + ";";
                }
                UserTrackLogs.trackAdLog("Munion_Upload_Cps_E", str4);
                TaoLog.Logd("AlimamaSdk", "commit cps trace, para = " + jSONObject.toString());
                return;
            }
            c.a("new_v2_e_map_empty", new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void b(String str, long j, long j2, boolean z, Map<String, String> map) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20c30d64", new Object[]{str, new Long(j), new Long(j2), new Boolean(z), map});
            return;
        }
        try {
            com.taobao.alimama.utils.d c = com.taobao.alimama.utils.d.c("TaokeInfo");
            c.a("new_precommit", new Object[0]);
            HashMap hashMap2 = new HashMap(4);
            String a2 = com.taobao.utils.a.a(str, "e");
            String a3 = com.taobao.utils.a.a(str, "type");
            String c2 = f.a().c();
            String b = e.a().b();
            if (!TextUtils.isEmpty(a2) && "2".equals(a3)) {
                c.a("new_get_page_e", new Object[0]);
                hashMap2.put("pageE", a2);
            }
            if (!TextUtils.isEmpty(c2)) {
                c.a("new_get_global_e", new Object[0]);
                hashMap2.put("globalE", c2);
            }
            if (!TextUtils.isEmpty(b)) {
                c.a("new_get_channel_e", new Object[0]);
                hashMap2.put("channelE", b);
            }
            if (z) {
                if (hashMap2.isEmpty()) {
                    Map<String, String> c3 = d.a().c();
                    c.a("new_get_cache_e", new Object[0]);
                    TaoLog.Logd("AlimamaSdk", "get cached eMap");
                    hashMap = c3;
                    if (hashMap == null && !hashMap.isEmpty()) {
                        c.a("new_commit_e", JSON.toJSONString(hashMap));
                        a(hashMap, j, j2, z, map);
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("eMap", JSON.toJSONString(hashMap));
                        jSONObject.put("sellerId", j);
                        jSONObject.put("itemId", j2);
                        jSONObject.put("isMall", z);
                        String str2 = "eMap=" + JSON.toJSONString(hashMap) + ",sellerId=" + j + ",itemId=" + j2 + ",isMall=" + z;
                        if (map != null && !map.isEmpty()) {
                            jSONObject.put("extMap", JSON.toJSONString(map));
                            str2 = str2 + ",extMap=" + JSON.toJSONString(map);
                        }
                        UserTrackLogs.trackAdLog("Munion_Upload_Cps_E", str2);
                        TaoLog.Logd("AlimamaSdk", "commit cps trace, para = " + jSONObject.toString());
                        return;
                    }
                    c.a("new_e_map_empty", new Object[0]);
                }
                d.a().a(hashMap2);
                c.a("new_update_cache_e", new Object[0]);
                TaoLog.Logd("AlimamaSdk", "update cached eMap");
            }
            hashMap = hashMap2;
            if (hashMap == null) {
            }
            c.a("new_e_map_empty", new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        TaoLog.Logi("AlimamaSdk", "new taoke cps filter url = " + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String a2 = com.taobao.utils.a.a(str, "e");
        String a3 = com.taobao.utils.a.a(str, "tkFlag");
        String a4 = com.taobao.utils.a.a(str, "type");
        String a5 = com.taobao.utils.a.a(str, "tk_cps_ut");
        if (TextUtils.isEmpty(a2) || !"2".equals(a4) || TextUtils.isEmpty(a3)) {
            return;
        }
        if ("1".equals(a3)) {
            c.a().a(a2, a5, 50);
        } else if ("0".equals(a3)) {
            c.a().a(a5);
        }
        UserTrackLogs.trackAdLog("Munion_Url_Handle_GlobalE", "data=" + Global.getPackageName() + ",new_global_e=1,tk_flag=" + a3 + ",cps_ut_typ=" + a5);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        TaoLog.Logi("AlimamaSdk", "taoke cps filter url = " + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String a2 = com.taobao.utils.a.a(str, "e");
        String a3 = com.taobao.utils.a.a(str, "tkFlag");
        String a4 = com.taobao.utils.a.a(str, "type");
        if (TextUtils.isEmpty(a2) || !"2".equals(a4) || TextUtils.isEmpty(a3)) {
            return;
        }
        if ("1".equals(a3)) {
            f.a().a(a2);
        } else if ("0".equals(a3)) {
            f.a().b();
        }
        UserTrackLogs.trackAdLog("Munion_Url_Handle_GlobalE", "data=" + Global.getPackageName());
    }

    private static void a(Map<String, String> map, long j, long j2, boolean z, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929f238e", new Object[]{map, new Long(j), new Long(j2), new Boolean(z), map2});
            return;
        }
        final AlimamaCpsTraceSendRequest alimamaCpsTraceSendRequest = new AlimamaCpsTraceSendRequest();
        alimamaCpsTraceSendRequest.itemid = j2;
        alimamaCpsTraceSendRequest.sellerid = j;
        alimamaCpsTraceSendRequest.utdid = MunionDeviceUtil.getUtdid(Global.getApplication());
        alimamaCpsTraceSendRequest.emap = JSON.toJSONString(map);
        alimamaCpsTraceSendRequest.ismall = (z ? ITEM_TYPE.TMALL : ITEM_TYPE.TAOBAO).value;
        alimamaCpsTraceSendRequest.ext = (map2 == null || map2.isEmpty()) ? null : JSON.toJSONString(map2);
        RemoteBusiness.build((IMTOPDataObject) alimamaCpsTraceSendRequest).mo1337addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.alimama.tkcps.TaokeBaseUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                UserTrackLogs.trackAdLog("Munion_Upload_CpsE_Fail", "error_code=" + mtopResponse.getRetCode(), "error_msg=" + mtopResponse.getRetMsg(), "ismall=" + AlimamaCpsTraceSendRequest.this.ismall);
                StringBuilder sb = new StringBuilder();
                sb.append("Cps 请求失败！ result is :");
                sb.append(mtopResponse.toString());
                TaoLog.Logd("AlimamaSdk", sb.toString());
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                TaoLog.Logd("AlimamaSdk", "Cps 请求成功！ result is :" + mtopResponse.toString());
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                TaoLog.Logd("AlimamaSdk", "Cps 请求失败！ result is :" + mtopResponse.toString());
                UserTrackLogs.trackAdLog("Munion_Upload_CpsE_Fail", "error_code=" + mtopResponse.getRetCode(), "error_msg=" + mtopResponse.getRetMsg(), "ismall=" + AlimamaCpsTraceSendRequest.this.ismall);
            }
        }).startRequest(AlimamaCpsTraceSendResponse.class);
    }

    public static void a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{str, str2, str3, map});
            return;
        }
        final String str4 = "object_id=" + str + ",object_type=" + str2 + ",action_type=" + str3;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            com.taobao.alimama.utils.e.a("commit_cps_initiative_action_param_invalid", str4);
            UserTrackLogs.trackAdLog("commit_cps_initiative_action_param_invalid", str4);
            return;
        }
        AlimamaCpsActionRequest alimamaCpsActionRequest = new AlimamaCpsActionRequest();
        alimamaCpsActionRequest.actionObjectId = str;
        alimamaCpsActionRequest.actionObjectType = str2;
        alimamaCpsActionRequest.initiativeActionType = str3;
        alimamaCpsActionRequest.extraParams = (map == null || map.isEmpty()) ? null : JSON.toJSONString(map);
        dhq dhqVar = new dhq(null, dhm.RETRY_FIVE_TIMES, alimamaCpsActionRequest, AlimamaCpsActionResponse.class);
        dhqVar.a(new dhf() { // from class: com.taobao.alimama.tkcps.TaokeBaseUtil.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.dhf
            public void a(String str5, String str6) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str5, str6});
                }
            }

            @Override // tb.dhf
            public void a(String str5, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bb6538e", new Object[]{this, str5, obj});
                    return;
                }
                com.taobao.alimama.utils.e.a("commit_cps_initiative_action_success", new String[0]);
                UserTrackLogs.trackAdLog("commit_cps_initiative_action_success", new String[0]);
            }

            @Override // tb.dhf
            public void b(String str5, String str6) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("65d7b87d", new Object[]{this, str5, str6});
                    return;
                }
                com.taobao.alimama.utils.e.a("commit_cps_initiative_action_fail", str4, "error_code=" + str5, "error_msg=" + str6);
                UserTrackLogs.trackAdLog("commit_cps_initiative_action_fail", str4, "error_code=" + str5, "error_msg=" + str6);
            }
        });
        dhg.a().a(dhqVar);
    }

    public static Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[0]);
        }
        HashMap hashMap = new HashMap(2);
        String str = "1";
        OrangeConfig.getInstance().registerListener(new String[]{"alimama_ad"}, new com.taobao.orange.g() { // from class: com.taobao.alimama.tkcps.TaokeBaseUtil.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.g
            public void onConfigUpdate(String str2, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9458c0f9", new Object[]{this, str2, new Boolean(z)});
                } else {
                    SharedPreferencesUtils.putString("tk_cps_cross_e_config", OrangeConfig.getInstance().getConfig("alimama_ad", "tk_cps_cross_e_config", null));
                }
            }
        });
        String string = SharedPreferencesUtils.getString("tk_cps_cross_e_config", "");
        if (!TextUtils.isEmpty(string)) {
            JSONObject parseObject = JSONObject.parseObject(string);
            String string2 = parseObject.getString("enable_cross_e");
            if (!TextUtils.isEmpty(string2)) {
                str = string2;
            }
            String string3 = parseObject.getString("flux_disperse_config");
            if (!TextUtils.isEmpty(string3)) {
                hashMap.put("flux_disperse_config", string3);
            }
        }
        hashMap.put("enable_cross_e", str);
        com.taobao.alimama.utils.e.a("taoke_cross_e_config", "crossConfig=" + string);
        return hashMap;
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else {
            f8452a = str;
        }
    }
}

package android.taobao.windvane.ha;

import android.os.Message;
import android.taobao.windvane.c;
import android.taobao.windvane.config.f;
import android.taobao.windvane.config.j;
import android.taobao.windvane.util.m;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.extension.WpkUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class UCHAManager implements ValueCallback<Pair<Message, Message>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static UCHAManager INSTANCE = null;
    private static final String TAG = "UCHA";
    public static final int TYPE_BKPG = 0;
    public static final int TYPE_BLACK = 2;
    public static final int TYPE_HARLOG = 1;
    public static final int TYPE_MEM = 3;
    public static final int TYPE_NONE = -1;
    private List<String> mMemoryLogType = Arrays.asList("mapsgrp", "jsobjheap", "jsexalloc", "gltex");

    static {
        kge.a(-643320236);
        kge.a(2046855177);
    }

    public static UCHAManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UCHAManager) ipChange.ipc$dispatch("1314225f", new Object[0]);
        }
        if (INSTANCE == null) {
            synchronized (UCHAManager.class) {
                if (INSTANCE == null) {
                    INSTANCE = new UCHAManager();
                }
            }
        }
        return INSTANCE;
    }

    public void initHAParam(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1996c2fd", new Object[]{this, fVar});
            return;
        }
        try {
            if (c.a().b().f() && fVar != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("context", android.taobao.windvane.config.a.f.getApplicationContext());
                hashMap.put("appid", fVar.f1557a);
                hashMap.put("app_secret", fVar.b);
                hashMap.put("log_upload_mode", Integer.valueOf(fVar.d));
                hashMap.put("config_update_mode", Integer.valueOf(fVar.e));
                hashMap.put("debug", Boolean.valueOf(fVar.c));
                WpkUtils.initWpk(hashMap);
                if (fVar.d == 1) {
                    initCallBack();
                }
                if (fVar.e != 1) {
                    return;
                }
                setPubOption();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void initCallBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64a5ff9c", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("log_upload_callback", this);
        WpkUtils.setWpkCallback(hashMap);
    }

    private void setPubOption() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e4a417", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bver", android.taobao.windvane.config.a.a().i());
        WpkUtils.setWpkCommonCustomFields(hashMap);
        try {
            WpkUtils.setWpkConfigs(new JSONObject(getConfigsFromSomeWhere(android.taobao.windvane.config.a.a().s())));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(Pair<Message, Message> pair) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f72d3286", new Object[]{this, pair});
            return;
        }
        Map map = (Map) ((Message) pair.first).obj;
        String str = (String) map.get("log_type");
        String str2 = (String) map.get("log_data");
        String str3 = (String) map.get("link_key");
        String str4 = (String) map.get("link_id");
        if (StringUtils.isEmpty(str) || StringUtils.equals("pvuv", str)) {
            return;
        }
        int i = -1;
        if (StringUtils.equals("bkpg", str3)) {
            z = true;
            i = 0;
        } else if (StringUtils.equals("harLog", str)) {
            z = true;
            i = 1;
        } else if (StringUtils.equals("jssdkidx", str)) {
            z = true;
            i = 2;
        } else if (this.mMemoryLogType.contains(str)) {
            z = true;
            i = 3;
        } else {
            z = false;
        }
        if (z) {
            m.e(TAG, "collect log, type:[" + str + "]; linkID:[" + str4 + "]; logData:[" + str2 + riy.ARRAY_END_STR);
        } else {
            m.c(TAG, "need not collect log, type:[" + str + "]; linkID:[" + str4 + "];logData:[" + str2 + riy.ARRAY_END_STR);
        }
        if (c.a().b().g()) {
            return;
        }
        if (i == 2) {
            z = ((double) j.commonConfig.u.w) >= Math.random() * 100.0d;
            m.c(TAG, "webgl error report with " + j.commonConfig.u.w + "% sample rate");
        }
        if (!z) {
            return;
        }
        a.a().a(str2, i, str4);
    }

    public void initApmCallback(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a3cac6e", new Object[]{this, str, str2});
        } else if (!c.a().b().f()) {
        } else {
            a.a().a(str, str2);
        }
    }

    private String getConfigsFromSomeWhere(f.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e654db6", new Object[]{this, aVar});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cver", 1);
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("u4_collect_url_query", aVar.f1558a);
            jSONObject3.put("u4_collect_url_ref", aVar.b);
            jSONObject3.put("u4_bkpg_sampling_rate", aVar.c);
            jSONObject3.put("u4_t1t3detail_sampling_rate", aVar.d);
            jSONObject3.put("u4_resloadfail_sampling_rate", aVar.e);
            jSONObject3.put("u4_xhr_sampling_rate", aVar.f);
            jSONObject3.put("u4_jserr_sampling_rate", aVar.g);
            jSONObject3.put("u4_har_sampling_rate", aVar.h);
            jSONObject3.put("u4_interaction_js_error_sampling_rate", aVar.i);
            jSONObject3.put("u4_webgl_error_state_api_sampling_rate", aVar.j);
            jSONObject3.put("u4_maps_groups_sampling_rate", aVar.k);
            jSONObject3.put("u4_maps_groups_tpupload_define", aVar.l);
            jSONObject3.put("u4_maps_groups_max_script_memory", aVar.m);
            jSONObject3.put("u4_maps_groups_max_gl_memory", aVar.n);
            jSONObject3.put("u4_uc_large_alloc_size", aVar.o);
            jSONObject2.put("common", jSONObject3);
            jSONObject.put("config", jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}

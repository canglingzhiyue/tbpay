package com.taobao.taopai.material.config;

import android.os.Build;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai.material.config.MaterialConfig;
import java.util.HashMap;
import java.util.Map;
import tb.akt;
import tb.kge;
import tb.pzb;
import tb.qcf;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static b c;

    /* renamed from: a  reason: collision with root package name */
    private MaterialConfig f22063a;
    private Map<String, MaterialConfig> b;

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static b f22064a;

        static {
            kge.a(-125147595);
            f22064a = new b();
        }
    }

    static {
        kge.a(92910841);
    }

    private b() {
        this.b = new HashMap();
        b();
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("4aae96a2", new Object[0]);
        }
        if (c == null) {
            c = a.f22064a;
        }
        return c;
    }

    private MaterialConfig a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaterialConfig) ipChange.ipc$dispatch("8a36b77f", new Object[]{this, str});
        }
        try {
            return (MaterialConfig) JSONObject.parseObject(str, MaterialConfig.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        try {
            return b(i, i2);
        } catch (Exception e) {
            qcf.a(-4, i2, e.getMessage());
            return -4;
        }
    }

    private int b(int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90f78dfc", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        MaterialConfig materialConfig = this.b.get(c(i, i2));
        if (materialConfig == null) {
            materialConfig = this.f22063a;
        }
        if (materialConfig == null) {
            return -4;
        }
        JSONObject jSONObject = new JSONObject();
        if (!a(materialConfig.deviceLevels)) {
            i3 = -3;
            jSONObject.put("model_level", (Object) Integer.valueOf(akt.a()));
            jSONObject.put("level_list", (Object) JSON.toJSON(materialConfig.deviceLevels).toString());
        } else if (!b(materialConfig.deviceList)) {
            i3 = -1;
            jSONObject.put("model", (Object) Build.MODEL);
            jSONObject.put("model_list", (Object) JSON.toJSON(materialConfig.deviceList).toString());
        } else {
            com.taobao.taopai.material.config.a a2 = a(materialConfig);
            if (!a2.f22062a) {
                i3 = -2;
                jSONObject.put("net_strategies", (Object) a2.b);
            }
        }
        qcf.a(i3, i2, jSONObject.toJSONString());
        return i3;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        MaterialConfig a2 = a(pzb.f());
        if (a2 == null) {
            return;
        }
        this.f22063a = a2;
    }

    private String c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5b2a896", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return i + "_" + i2;
    }

    private boolean a(MaterialConfig.DeviceList deviceList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5e89f99", new Object[]{this, deviceList})).booleanValue();
        }
        if (deviceList != null) {
            return a(deviceList, String.valueOf(akt.a()));
        }
        return true;
    }

    private boolean b(MaterialConfig.DeviceList deviceList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("101827b8", new Object[]{this, deviceList})).booleanValue();
        }
        if (deviceList != null) {
            return a(deviceList, Build.MODEL);
        }
        return true;
    }

    private boolean a(MaterialConfig.DeviceList deviceList, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58eee23", new Object[]{this, deviceList, str})).booleanValue();
        }
        if (deviceList.enable == 0) {
            return true;
        }
        if (deviceList.enable == 1) {
            if (deviceList.list != null) {
                return deviceList.list.contains(str);
            }
        } else if (deviceList.enable == 2 && deviceList.list != null && !deviceList.list.contains(str)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x016d, code lost:
        if (r12 >= r14) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x017c, code lost:
        if (r12 != r14) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x018b, code lost:
        if (r12 == r14) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0193, code lost:
        r2.f22062a = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0195, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
        if (r5 > r15) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b4, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c4, code lost:
        if (r5 < r15) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
        if (r5 == r15) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
        if (r5 != r15) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015a, code lost:
        if (r12 <= r14) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x015d, code lost:
        r5 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.taobao.taopai.material.config.a a(com.taobao.taopai.material.config.MaterialConfig r17) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taopai.material.config.b.a(com.taobao.taopai.material.config.MaterialConfig):com.taobao.taopai.material.config.a");
    }

    private void a(com.taobao.taopai.material.config.a aVar, MaterialConfig.NetStrategy netStrategy, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("287ea0e", new Object[]{this, aVar, netStrategy, new Float(f)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("net_strategies", (Object) JSON.toJSON(netStrategy).toString());
        jSONObject.put("vpm_value", (Object) Float.valueOf(f));
        aVar.b = jSONObject.toJSONString();
    }
}

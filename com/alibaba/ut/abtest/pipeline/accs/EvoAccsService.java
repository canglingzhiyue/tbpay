package com.alibaba.ut.abtest.pipeline.accs;

import com.alibaba.evo.internal.bucketing.model.a;
import com.alibaba.evo.internal.event.e;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.config.model.keep.KeepModel;
import com.alibaba.ut.abtest.event.EventType;
import com.alibaba.ut.abtest.internal.bucketing.c;
import com.alibaba.ut.abtest.internal.util.b;
import com.alibaba.ut.abtest.internal.util.g;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.p;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import java.util.HashSet;
import tb.cex;
import tb.kge;

/* loaded from: classes3.dex */
public class EvoAccsService extends TaoBaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACCS_BETA_SINGLE = "accs_beta_single";
    public static final String SERVICE_ID = "evo-service";

    static {
        kge.a(1927062434);
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
        } else {
            a(bArr);
        }
    }

    public static void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{bArr});
        } else if (!cex.a().j().v() && !cex.a().j().w()) {
        } else {
            String str = new String(bArr);
            JSONObject jSONObject = null;
            try {
                jSONObject = JSONObject.parseObject(str);
            } catch (Exception unused) {
                h.f("EvoAccsService", "【ACCS数据】下发数据parseJson失败：" + str);
            }
            h.f("EvoAccsService", "【ACCS数据】本设备收到accs数据为：" + str);
            if (jSONObject == null) {
                return;
            }
            String string = jSONObject.getString("command");
            if (cex.a().j().v() && "syncWhiteList".equals(string)) {
                a(jSONObject.getJSONObject("parameter"));
            } else if (cex.a().j().w() && "syncBetaConfig".equals(string)) {
                a(jSONObject.getString("parameter"));
            } else if (!cex.a().j().D() || !"syncBetaAndReleaseConfig".equals(string)) {
            } else {
                b(jSONObject.getString("parameter"));
            }
        }
    }

    private static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else if (jSONObject != null) {
            jSONObject.getString("sign");
            JSONArray jSONArray = jSONObject.getJSONArray(KeepModel.STRATEGY_WHITE_LIST);
            if (jSONArray == null || jSONArray.size() == 0) {
                cex.a().n().a(new HashSet());
                return;
            }
            JSONObject jSONObject2 = jSONArray.getJSONObject(0);
            if (jSONObject2 == null) {
                cex.a().n().a(new HashSet());
                return;
            }
            JSONArray jSONArray2 = jSONObject2.getJSONArray("buckets");
            if (jSONArray2 == null) {
                cex.a().n().a(new HashSet());
                return;
            }
            HashSet hashSet = new HashSet();
            for (int i = 0; i < jSONArray2.size(); i++) {
                Long l = jSONArray2.getLong(i);
                if (l != null) {
                    hashSet.add(l);
                }
            }
            cex.a().n().a(hashSet);
        }
    }

    private static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (str == null) {
        } else {
            a a2 = com.alibaba.ut.abtest.internal.bucketing.a.a(str.getBytes(), ACCS_BETA_SINGLE);
            if (a2 != null && a2.c != null) {
                c.a().a(a2.c, 5);
            } else {
                h.f("EvoAccsService", "【ACCS数据】下发数据中，并未包含实验。");
            }
        }
    }

    private static void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (str == null) {
        } else {
            p.a(new Runnable() { // from class: com.alibaba.ut.abtest.pipeline.accs.EvoAccsService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        e eVar = (e) g.a(str, (Class<Object>) e.class);
                        if (eVar != null && eVar.f2930a != null) {
                            cex.a().o().a(new com.alibaba.ut.abtest.event.a(EventType.ExperimentV5Data, eVar.f2930a, "accs_sync_grey"));
                            return;
                        }
                        h.f("EvoAccsService", "实验数据索引数据为空或格式错误。");
                        b.a(b.SERVICE_ALARM, "experiment_index_json_illegal", "0", "accs_sync_grey", false);
                    } catch (Throwable th) {
                        b.a("EvoAccsService.syncGreyConfig", th);
                    }
                }
            });
        }
    }
}

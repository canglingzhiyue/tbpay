package com.taobao.android.dinamicx.eventchain;

import android.util.Log;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.dkx;
import tb.dla;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;
import tb.kge;

/* loaded from: classes5.dex */
public class n extends dlg implements com.alibaba.ability.b, dln {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f11863a;
    private static n b;

    static {
        kge.a(-1441616785);
        kge.a(-948502777);
        kge.a(-1749066050);
        f11863a = false;
        b = new n();
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String str, als alsVar, Map<String, ?> map, aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, str, alsVar, map, alnVar});
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 3327392:
                if (str.equals("logd")) {
                    c = 1;
                    break;
                }
                break;
            case 3327393:
                if (str.equals("loge")) {
                    c = 0;
                    break;
                }
                break;
            case 1955068171:
                if (str.equals("log_change")) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            Log.e("DXLogAbility", JSON.toJSONString(map));
        } else if (c == 1) {
            JSON.toJSONString(map);
        } else if (c == 2) {
            f11863a = !f11863a;
        }
        return new FinishResult();
    }

    @Override // tb.dln
    public dlg b(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : b;
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        String str = "onExecuteWithData" + JSON.toJSONString(dlhVar);
        return new dla(new JSONObject());
    }
}

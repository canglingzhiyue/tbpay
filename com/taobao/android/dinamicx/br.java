package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import java.util.HashMap;
import tb.alj;
import tb.ept;

/* loaded from: classes.dex */
public class br extends com.taobao.android.dinamic.dinamic.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.dinamic.dinamic.b
    public void a(String str, DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06ac53c", new Object[]{this, str, dinamicTemplate});
        } else if (dinamicTemplate == null) {
        } else {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("templateId", dinamicTemplate.name + "_" + dinamicTemplate.version);
            hashMap.put("module", str);
            hashMap.put("renderType", ept.SUB_CREATE_VIEW);
            alj.a().a(com.taobao.android.dinamic.e.TAG, hashMap);
        }
    }

    @Override // com.taobao.android.dinamic.dinamic.b
    public void b(String str, DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1418effd", new Object[]{this, str, dinamicTemplate});
        } else if (dinamicTemplate == null) {
        } else {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("templateId", dinamicTemplate.name + "_" + dinamicTemplate.version);
            hashMap.put("module", str);
            hashMap.put("renderType", ept.SUB_BIND_VIEW);
            alj.a().a(com.taobao.android.dinamic.e.TAG, hashMap);
        }
    }
}

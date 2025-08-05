package com.taobao.tbpoplayer.nativerender;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.DSLModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.kge;
import tb.qnt;

/* loaded from: classes8.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-834507190);
    }

    public static void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb7413a6", new Object[]{eVar});
            return;
        }
        try {
            DSLModel e = eVar.a().e();
            List<String> list = e.resPreLoad;
            if (list != null && list.contains("image")) {
                String m = eVar.a().m();
                HashSet hashSet = new HashSet();
                for (StateModel stateModel : e.component) {
                    if (stateModel != null && stateModel.isValid() && !TextUtils.isEmpty(m) && !m.equals(stateModel.id)) {
                        if (stateModel.isMultiVersion()) {
                            for (StateVersionModel stateVersionModel : stateModel.versions) {
                                a(stateVersionModel.children, hashSet);
                            }
                        } else {
                            a(stateModel.children, hashSet);
                        }
                    }
                }
                if (!hashSet.isEmpty()) {
                    com.taobao.phenix.intf.b.h().a("common", new ArrayList(hashSet)).a();
                }
                com.alibaba.poplayer.utils.c.a("ResPreLoader.startPreLoad.imageRes=%s", hashSet);
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("ResPreLoader.error", th);
        }
    }

    private static void a(List<JSONObject> list, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b962f846", new Object[]{list, set});
        } else if (list != null && !list.isEmpty()) {
            for (JSONObject jSONObject : list) {
                String string = jSONObject.getString("type");
                if (qnt.TYPE_CLOSE_BTN.equals(string) || qnt.TYPE_IMAGE.equals(string)) {
                    String string2 = jSONObject.getString("url");
                    if (!TextUtils.isEmpty(string2) && !p.a(string2)) {
                        set.add(string2);
                    }
                } else if (qnt.TYPE_BLOCK.equals(string)) {
                    a((List) JSON.parseObject(jSONObject.getString("children"), new TypeReference<ArrayList<JSONObject>>() { // from class: com.taobao.tbpoplayer.nativerender.q.1
                    }.getType(), new Feature[0]), set);
                }
            }
        }
    }
}

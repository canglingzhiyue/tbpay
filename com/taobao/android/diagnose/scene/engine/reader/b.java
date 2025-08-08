package com.taobao.android.diagnose.scene.engine.reader;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f11721a;

    static {
        kge.a(-1857837246);
        kge.a(-136928814);
    }

    public b() {
    }

    public b(String str) {
        this.f11721a = str;
    }

    public List<RuleDefine> a() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.f11721a)) {
            return Collections.emptyList();
        }
        try {
            JSONArray jSONArray2 = JSON.parseObject(this.f11721a).getJSONArray("updateInfo");
            if (jSONArray2 == null || jSONArray2.size() == 0 || (jSONObject = jSONArray2.getJSONObject(0)) == null || (jSONObject2 = jSONObject.getJSONObject("payload")) == null || (jSONArray = jSONObject2.getJSONArray("diagnoseSceneConfigModelList")) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.size(); i++) {
                RuleDefine ruleDefine = (RuleDefine) jSONArray.getJSONObject(i).toJavaObject(RuleDefine.class);
                if (ruleDefine != null) {
                    arrayList.add(ruleDefine);
                }
            }
            return arrayList;
        } catch (Exception e) {
            v.a("JsonRuleDefineReader", "read", e);
            return null;
        }
    }

    public RuleDefine b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RuleDefine) ipChange.ipc$dispatch("faa6a945", new Object[]{this});
        }
        try {
            if (StringUtils.isEmpty(this.f11721a)) {
                return null;
            }
            return (RuleDefine) JSON.parseObject(this.f11721a, RuleDefine.class);
        } catch (Exception e) {
            v.a("JsonRuleDefineReader", "readChannelRule", e);
            return null;
        }
    }
}

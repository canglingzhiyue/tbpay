package com.taobao.search.jarvis.rcmd;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.xsl.module.XslSearchResult;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import tb.imn;
import tb.kge;

/* loaded from: classes7.dex */
public class e extends com.taobao.android.searchbaseframe.xsl.module.f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(160703866);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        if (str.hashCode() == 967136246) {
            super.a((XslSearchResult) objArr[0], (JSONObject) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public e(imn imnVar) {
        super(imnVar);
    }

    @Override // com.taobao.android.searchbaseframe.xsl.module.f, com.taobao.android.meta.data.f, com.taobao.android.searchbaseframe.datasource.impl.b
    public void a(XslSearchResult xslSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39a553f6", new Object[]{this, xslSearchResult, jSONObject});
            return;
        }
        super.a(xslSearchResult, jSONObject);
        JSONArray a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "result");
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        JSONObject jSONObject2 = a2.getJSONObject(0);
        JSONObject jSONObject3 = jSONObject2.getJSONObject(JarvisConstant.KEY_JARVIS_CONFIG);
        if (jSONObject3 != null) {
            xslSearchResult.addExtMod(JarvisConstant.KEY_JARVIS_CONFIG, jSONObject3.toString());
        }
        String string = jSONObject2.getString(JarvisConstant.KEY_JARVIS_CONTEXT);
        if (!TextUtils.isEmpty(string)) {
            xslSearchResult.addExtMod(JarvisConstant.KEY_JARVIS_CONTEXT, string);
        } else {
            xslSearchResult.popExtMod(JarvisConstant.KEY_JARVIS_CONTEXT);
        }
    }
}

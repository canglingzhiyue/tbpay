package com.taobao.search.jarvis;

import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.i;
import com.taobao.android.searchbaseframe.util.r;
import com.taobao.android.task.Coordinator;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.mmd.util.e;
import kotlin.jvm.internal.q;
import tb.jxm;
import tb.jxs;
import tb.jxt;
import tb.kge;

/* loaded from: classes7.dex */
public final class SearchJarvisCallback extends jxm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes7.dex */
    public static final class a extends i {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ jxt b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jxt jxtVar, JSONObject jSONObject, String str, String str2) {
            super(str2);
            this.b = jxtVar;
            this.c = jSONObject;
            this.d = str;
        }

        @Override // com.taobao.android.searchbaseframe.util.i
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.b.processAction(SearchJarvisCallback.access$getMJarvisWidget$p(SearchJarvisCallback.this), this.c, this.d);
            }
        }
    }

    static {
        kge.a(-245943128);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchJarvisCallback(jxs widget) {
        super(widget);
        q.c(widget, "widget");
    }

    public static final /* synthetic */ jxs access$getMJarvisWidget$p(SearchJarvisCallback searchJarvisCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jxs) ipChange.ipc$dispatch("9d3b243b", new Object[]{searchJarvisCallback}) : searchJarvisCallback.mJarvisWidget;
    }

    public static final /* synthetic */ void access$setMJarvisWidget$p(SearchJarvisCallback searchJarvisCallback, jxs jxsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("325046bd", new Object[]{searchJarvisCallback, jxsVar});
        } else {
            searchJarvisCallback.mJarvisWidget = jxsVar;
        }
    }

    @Override // tb.jxm
    public void handleResult(JSONObject result) {
        jxt a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("246c0a04", new Object[]{this, result});
            return;
        }
        q.c(result, "result");
        JSONArray a3 = com.taobao.android.searchbaseframe.util.a.a(result, "results");
        if (SearchSdk.Companion.a()) {
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("result", r.c(result.toJSONString()));
            e.a("SearchJarvisCallback", (ArrayMap<String, String>) arrayMap);
        }
        if (a3 == null || a3.isEmpty()) {
            return;
        }
        int size = a3.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = a3.getJSONObject(i);
            String string = jSONObject.getString("action");
            String string2 = jSONObject.getString(JarvisConstant.KEY_ACTION_ID);
            if (!StringUtils.isEmpty(string) && (a2 = com.taobao.android.xsearchplugin.jarvis.utils.b.a(string, this.mJarvisWidget)) != null) {
                q.a((Object) a2, "JarvisKitUtils.getTarget…JarvisWidget) ?: continue");
                Coordinator.execute(new a(a2, jSONObject, string2, "JarvisActionProcessor"));
            }
        }
    }
}

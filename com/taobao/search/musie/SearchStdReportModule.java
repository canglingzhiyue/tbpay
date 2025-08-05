package com.taobao.search.musie;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.search.common.util.i;
import com.taobao.search.sf.util.tlog.TLogTracker;
import tb.kge;

/* loaded from: classes7.dex */
public final class SearchStdReportModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String MODULE_NAME = "search-std-report";

    static {
        kge.a(-217086145);
        Companion = new a(null);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(1751822279);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    public SearchStdReportModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod
    public final void tlog(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf6f6f9", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
        } else {
            String a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "content", "");
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            TLogTracker.a("Unknown", a2);
        }
    }

    @MUSMethod
    public final void dp2MonitorReport(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32c880a1", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            i.a.a().a(jSONObject);
        }
    }
}

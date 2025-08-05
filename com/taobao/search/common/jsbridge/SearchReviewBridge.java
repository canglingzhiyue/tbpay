package com.taobao.search.common.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.v;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class SearchReviewBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_NAME = "GetSrpResult";
    public static final String API_NAME = "TBSearchReview";
    public static final a Companion;

    static {
        kge.a(1625212118);
        Companion = new a(null);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(1895242910);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String action, String params, WVCallBackContext callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, action, params, callback})).booleanValue();
        }
        q.c(action, "action");
        q.c(params, "params");
        q.c(callback, "callback");
        if (!TextUtils.equals(action, ACTION_NAME)) {
            return false;
        }
        try {
            JSONObject parseObject = JSON.parseObject(params);
            if (parseObject == null) {
                return false;
            }
            String srpKey = parseObject.getString("srpKey");
            if (TextUtils.isEmpty(srpKey)) {
                return false;
            }
            r rVar = new r();
            v vVar = v.INSTANCE;
            q.a((Object) srpKey, "srpKey");
            rVar.a("data", vVar.b(srpKey));
            callback.success(rVar);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}

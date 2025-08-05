package com.tanx.exposer;

import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes4.dex */
public class c extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(543720682);
    }

    public c(a aVar) {
        try {
            put(MspDBHelper.BizEntry.COLUMN_NAME_PID, a.a(aVar));
            put(DxContainerActivity.PARAMS_NAMESPACE, a.b(aVar));
            put("macroArgs", a.c(aVar));
            put("utArgs", a.d(aVar));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public c(String str) throws JSONException {
        super(str);
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("69129956", new Object[]{this}) : optJSONObject("macroArgs");
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private JSONObject f8161a;
        private JSONObject b;
        private String c;
        private String d;

        static {
            kge.a(349753793);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("702c10de", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("33187a3d", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ JSONObject c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("bf895072", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ JSONObject d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("350376b3", new Object[]{aVar}) : aVar.f8161a;
        }

        public a a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b988aa5a", new Object[]{this, jSONObject});
            }
            this.f8161a = jSONObject;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("36f7f5fe", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("ec9bb325", new Object[]{this}) : new c(this);
        }
    }
}

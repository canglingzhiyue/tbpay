package com.alibaba.android.ultron.trade.event;

import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.t;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class o extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KET_OPEN_URL_H5_OLD_COMPONENT = "__oldComponent";
    public static final String KEY_H5_DATA_PREFIX = "data=";
    public static final String KEY_H5_POST_DATA = "postdata";
    public static final String KEY_H5_QUERY_DATA = "querydata";
    public static final String KEY_OPEN_URL_H5_IS_POST_URL = "isPostUrl";
    public static final String TYPE_OPEN_URL_H5 = "H5";
    public static final String TYPE_OPEN_URL_METHOD_GET = "get";
    public static final String TYPE_OPEN_URL_METHOD_POST = "post";
    public static final String TYPE_OPEN_URL_NATIVE = "Native";
    public static final String TYPE_OPEN_URL_WEEX = "Weex";

    /* renamed from: a  reason: collision with root package name */
    public int f2670a = 102;
    private int b = 204800;

    static {
        kge.a(2055490419);
    }

    public static /* synthetic */ Object ipc$super(o oVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public o() {
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    @Override // com.alibaba.android.ultron.trade.event.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(tb.bmz r12) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.trade.event.o.b(tb.bmz):void");
    }

    public void a(String str, JSONObject jSONObject, String str2) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d490e348", new Object[]{this, str, jSONObject, str2});
            return;
        }
        String str3 = null;
        if (jSONObject != null) {
            str3 = jSONObject.getString("__oldComponent");
        }
        if (StringUtils.isEmpty(str2)) {
            str2 = "post";
        }
        if (str3 == null || jSONObject == null) {
            str2 = "get";
        }
        if ("get".equals(str2)) {
            t.a().a(this.e).b(this.f2670a).a(str);
            return;
        }
        Bundle bundle = new Bundle();
        if (str3 != null) {
            try {
                String encode = Uri.encode(str3);
                bundle.putString("postdata", "data=" + encode);
            } catch (Exception unused) {
                UnifyLog.a(this.f.s(), "OpenUrlSubscriber", "oldComponent encode 失败", str3);
            }
        }
        bundle.putBoolean("isPostUrl", true);
        try {
            jSONObject2 = JSON.parseObject(str3);
        } catch (Throwable unused2) {
            jSONObject2 = new JSONObject();
        }
        t.a().a(this.e).b(this.f2670a).a(bundle).a(t.a().a(this.e).a(str, jSONObject2));
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            for (String str2 : jSONObject.keySet()) {
                if (!StringUtils.isEmpty(str2)) {
                    Object obj = jSONObject.get(str2);
                    if (obj instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str2, ((Integer) obj).intValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str2, ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str2, ((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        bundle.putString(str2, (String) obj);
                    }
                }
            }
        }
        if (str.contains("disableForResult=true")) {
            t.a().a(this.e).a(bundle).a(str);
        } else {
            t.a().a(this.e).b(this.f2670a).a(bundle).a(str);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (str == null || str.length() < this.b) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("intent_size", String.valueOf(str.length()));
            com.alibaba.android.ultron.trade.utils.j.a("FAIL_BINDER_TRANSATION", "intent has to many data in jump to native ", hashMap);
        }
    }
}

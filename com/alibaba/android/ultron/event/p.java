package com.alibaba.android.ultron.event;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.alibaba.android.ultron.event.model.OpenUrlEventModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliNavServiceInterface;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.t;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.Map;
import tb.bga;
import tb.jpx;
import tb.kge;

/* loaded from: classes2.dex */
public class p extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KET_OPEN_URL_H5_OLD_COMPONENT = "__oldComponent";
    public static final String KEY_H5_DATA_PREFIX = "data=";
    public static final String KEY_H5_POST_DATA = "postdata";
    public static final String KEY_H5_QUERY_DATA = "querydata";
    public static final String KEY_MAIN_BIZ_NAME = "ultronTrade";
    public static final String KEY_OPEN_URL_H5_IS_POST_URL = "isPostUrl";
    public static final String TYPE_OPEN_URL_H5 = "H5";
    public static final String TYPE_OPEN_URL_METHOD_GET = "get";
    public static final String TYPE_OPEN_URL_METHOD_POST = "post";
    public static final String TYPE_OPEN_URL_NATIVE = "Native";
    public static final String TYPE_OPEN_URL_POPLAYER = "PopLayer";
    public static final String TYPE_OPEN_URL_WEEX = "Weex";

    /* renamed from: a  reason: collision with root package name */
    public int f2607a = 100;
    private int b = 204800;

    static {
        kge.a(-488747106);
    }

    public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public p() {
        a();
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        OpenUrlEventModel openUrlEventModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        com.taobao.android.ultron.common.model.b b = b();
        if (b == null || b.getFields() == null) {
            return;
        }
        try {
            openUrlEventModel = (OpenUrlEventModel) JSON.parseObject(b.getFields().toJSONString(), OpenUrlEventModel.class);
        } catch (Exception e) {
            UnifyLog.a(this.f.h(), "OpenUrlSubscriber", "onHandleEvent JSON.parseObject failed", new String[0]);
            bga.a.a(this.f.h(), "OpenUrlSubscriber.onHandleEvent", e);
            openUrlEventModel = null;
        }
        if (openUrlEventModel == null) {
            return;
        }
        String pageType = openUrlEventModel.getPageType();
        String url = openUrlEventModel.getUrl();
        JSONObject queryParams = openUrlEventModel.getQueryParams();
        if (queryParams != null) {
            UnifyLog.a(this.f.h(), "OpenUrlSubscriber", "add queryParams before: " + url, new String[0]);
            url = c(url, queryParams);
            UnifyLog.a(this.f.h(), "OpenUrlSubscriber", "add queryParams after: " + url, new String[0]);
        }
        if (!TextUtils.isEmpty(url)) {
            Uri.Builder buildUpon = Uri.parse(url).buildUpon();
            buildUpon.appendQueryParameter(CoreConstants.IN_PARAMS_DETAILCLICK, String.valueOf(System.currentTimeMillis()));
            url = buildUpon.build().toString();
        }
        JSONObject params = openUrlEventModel.getParams();
        if (TextUtils.isEmpty(pageType)) {
            pageType = "H5";
        }
        if (url == null) {
            return;
        }
        this.f2607a++;
        eVar.a("activityRequestCode", Integer.valueOf(this.f2607a));
        char c = 65535;
        int hashCode = pageType.hashCode();
        if (hashCode != -1968751561) {
            if (hashCode != 2285) {
                if (hashCode != 2692129) {
                    if (hashCode == 699228576 && pageType.equals("PopLayer")) {
                        c = 3;
                    }
                } else if (pageType.equals("Weex")) {
                    c = 2;
                }
            } else if (pageType.equals("H5")) {
                c = 1;
            }
        } else if (pageType.equals("Native")) {
            c = 0;
        }
        if (c == 0) {
            UnifyLog.a(this.f.h(), "OpenUrlSubscriber", "跳转到native页面", url);
            a(url, params);
        } else if (c == 1) {
            UnifyLog.a(this.f.h(), "OpenUrlSubscriber", "跳转到h5页面", url);
            a(url, params, openUrlEventModel.getMethod());
        } else if (c == 2) {
            UnifyLog.a(this.f.h(), "OpenUrlSubscriber", "跳转到weex页面", url);
        } else if (c == 3) {
            UnifyLog.a(this.f.h(), "OpenUrlSubscriber", "跳转到poplayer页面", url);
            b(url, params);
        }
        this.e.d().b(eVar);
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
        if (TextUtils.isEmpty(str2)) {
            str2 = "post";
        }
        if (str3 == null || jSONObject == null) {
            str2 = "get";
        }
        if ("get".equals(str2)) {
            t.a().a(this.d).b(this.f2607a).a(str);
            return;
        }
        Bundle bundle = new Bundle();
        if (str3 != null) {
            try {
                String encode = Uri.encode(str3);
                bundle.putString("postdata", "data=" + encode);
            } catch (Exception e) {
                UnifyLog.a(this.f.h(), "OpenUrlSubscriber", "oldComponent encode 失败", str3);
                bga.a.a(this.f.h(), "OpenUrlSubscriber.jumpToH5", e);
            }
        }
        bundle.putBoolean("isPostUrl", true);
        try {
            jSONObject2 = JSON.parseObject(str3);
        } catch (Throwable unused) {
            jSONObject2 = new JSONObject();
        }
        t.a().a(this.d).b(this.f2607a).a(bundle).a(t.a().a(this.d).a(str, jSONObject2));
    }

    private String c(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c89e164", new Object[]{this, str, jSONObject});
        }
        if (TextUtils.isEmpty(str) || jSONObject == null || jSONObject.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (entry != null && !TextUtils.isEmpty(entry.getKey()) && entry.getValue() != null) {
                buildUpon.appendQueryParameter(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return buildUpon.build().toString();
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
                if (!TextUtils.isEmpty(str2)) {
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
                    } else if (obj instanceof Serializable) {
                        bundle.putSerializable(str2, (Serializable) obj);
                    }
                }
            }
        }
        AliNavServiceInterface a2 = t.a();
        if (a2 != null) {
            a2.a(this.d).b(this.f2607a).a(bundle).a(str);
        } else if (jpx.a(this.d)) {
            Toast.makeText(this.d, "com.taobao.android:alinavimp:xx.xx.xx 没有引入，请实现接口适配导航库", 0).show();
        }
    }

    public void b(String str, JSONObject jSONObject) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676c0fdd", new Object[]{this, str, jSONObject});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (Uri.parse(str).getScheme() == null) {
                str = com.taobao.search.common.util.k.HTTPS_PREFIX + parse.getSchemeSpecificPart();
            }
            try {
                String str2 = "poplayer://abcd?openType=directly&uuid=" + System.currentTimeMillis() + "&params=" + URLEncoder.encode(String.format("{\"url\":\"%s\"}", str), "UTF-8");
                AliNavServiceInterface a2 = t.a();
                if (a2 != null) {
                    a2.a(this.d).a(str2);
                } else if (!jpx.a(this.d)) {
                } else {
                    Toast.makeText(this.d, "com.taobao.android:alinavimp:xx.xx.xx 没有引入，请实现接口适配导航库", 0).show();
                }
            } catch (Throwable th) {
                UnifyLog.a(this.f.h(), "OpenUrlSubscriber", "jumpToPoplayer error: " + Log.getStackTraceString(th), new String[0]);
                bga.a.a(this.f.h(), "OpenUrlSubscriber.jumpToPoplayer", th);
            }
        }
    }
}

package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.HashMap;
import tb.eyx;
import tb.ezm;
import tb.fgl;
import tb.kge;

/* loaded from: classes5.dex */
public class OpenUrlImplementor implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openUrl";
    public static final String EVENT_TYPE_ALTERNATIVE = "open_url";
    public static final String PARAMS_PARAMS = "params";
    public static final String PARAMS_URL = "url";

    /* renamed from: a  reason: collision with root package name */
    private Context f10668a;
    private eyx b;

    /* loaded from: classes5.dex */
    public @interface PageType {
        public static final String H5 = "H5";
        public static final String NATIVE = "NATIVE";
        public static final String POPLAYER = "POPLAYER";
    }

    static {
        kge.a(180605964);
        kge.a(1967244270);
    }

    public static /* synthetic */ eyx a(OpenUrlImplementor openUrlImplementor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("17bbd895", new Object[]{openUrlImplementor}) : openUrlImplementor.b;
    }

    public OpenUrlImplementor(Context context, eyx eyxVar) {
        this.f10668a = context;
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        final JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null || (b = aVar.b()) == null) {
            return false;
        }
        final String string = b.getString("url");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        String a2 = com.taobao.android.detail.ttdetail.utils.l.a(string, new HashMap<String, Object>() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenUrlImplementor.1
            {
                if (string.contains("currentClickTime=")) {
                    put("currentClickTime", String.valueOf(System.currentTimeMillis()));
                }
                JSONObject jSONObject = b.getJSONObject("queryParams");
                if (jSONObject != null) {
                    putAll(jSONObject);
                }
                JSONObject jSONObject2 = b.getJSONObject(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
                if (jSONObject2 != null) {
                    putAll(jSONObject2);
                }
                String str = (String) OpenUrlImplementor.a(OpenUrlImplementor.this).e().a("requestItemId");
                if (str != null) {
                    put("pre_item_id", str);
                    put(fgl.TARGETITEMID, str);
                    put(fgl.ORIGINALITEMID, str);
                }
                put("token", OpenUrlImplementor.a(OpenUrlImplementor.this).e().a());
            }
        }, !com.taobao.android.detail.ttdetail.utils.l.a(runtimeAbilityParamArr));
        String string2 = b.getString("pageType");
        if (TextUtils.isEmpty(string2)) {
            string2 = "NATIVE";
        }
        String upperCase = string2.toUpperCase();
        char c = 65535;
        int hashCode = upperCase.hashCode();
        if (hashCode != -1999289321) {
            if (hashCode != 2285) {
                if (hashCode == 1446763936 && upperCase.equals("POPLAYER")) {
                    c = 0;
                }
            } else if (upperCase.equals("H5")) {
                c = 2;
            }
        } else if (upperCase.equals("NATIVE")) {
            c = 1;
        }
        if (c == 0) {
            a(a2);
        } else if (c == 1) {
            a(a2, b);
        } else {
            b(a2);
        }
        return true;
    }

    public void a(String str) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (Uri.parse(str).getScheme() == null) {
                str = com.taobao.search.common.util.k.HTTPS_PREFIX + parse.getSchemeSpecificPart();
            }
            try {
                com.taobao.android.detail.ttdetail.utils.l.a(this.f10668a, "poplayer://abcd?openType=directly&uuid=" + System.currentTimeMillis() + "&params=" + URLEncoder.encode(String.format("{\"url\":\"%s\"}", str), "UTF-8"));
            } catch (Throwable th) {
                com.taobao.android.detail.ttdetail.utils.i.a("OpenUrlHandler", "toPoplayer exception", th);
            }
        }
    }

    private Bundle a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("2604864c", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (String str : jSONObject.keySet()) {
            a(bundle, str, jSONObject.get(str));
        }
        return bundle;
    }

    private void a(Bundle bundle, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d3a4492", new Object[]{this, bundle, str, obj});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (!(obj instanceof Serializable)) {
            } else {
                bundle.putSerializable(str, (Serializable) obj);
            }
        }
    }

    private Bundle b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("273ad92b", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (String str : jSONObject.keySet()) {
            bundle.putString(str, String.valueOf(jSONObject.get(str)));
            a(bundle, str, jSONObject.get(str));
        }
        return bundle;
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        try {
            Bundle a2 = a(jSONObject.getJSONObject("params"));
            if (a2 == null) {
                a2 = b(jSONObject.getJSONObject("nativeParams"));
            }
            if (a2 == null) {
                com.taobao.android.detail.ttdetail.utils.l.a(this.f10668a, str);
            } else {
                com.taobao.android.detail.ttdetail.utils.l.a(this.f10668a, a2, str);
            }
        } catch (Throwable th) {
            com.taobao.android.detail.ttdetail.utils.i.a("OpenUrlHandler", "toNative exception: ", th);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        try {
            com.taobao.android.detail.ttdetail.utils.l.a(this.f10668a, str);
        } catch (Throwable th) {
            com.taobao.android.detail.ttdetail.utils.i.a("OpenUrlHandler", "toH5 exception: ", th);
        }
    }
}

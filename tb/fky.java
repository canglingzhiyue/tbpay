package tb;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.android.detail2.core.framework.data.model.c;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.android.detail2.core.framework.data.net.recommend.RecRequestParamsV2;
import com.taobao.android.detail2.core.rearrange.a;
import com.taobao.login4android.api.Login;
import com.taobao.weex.common.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/* loaded from: classes5.dex */
public class fky {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPTIMIZE_SP_NAME = "newDetailOptimize";
    public static final String ORANGE_SP_NAME = "newDetailOrange";
    public static final String PLACE_HOLDER_IMAGE_MODE_SP_NAME = "ndPlaceHolderImgMode";
    public static final String SP_KEY_AB_NEW_DETAIL_ROUTE = "abNewDetailRoute";
    public static final String SP_KEY_ALL_CHANNEL_NEW_DETAIL_ROUTE = "allChannelNewDetailRoute";
    public static final String SP_KEY_BX_CURRENT_SCENE = "bxFeatureCurrentScene";
    public static final String SP_KEY_BX_IDENTIFIER = "bxFeatureIdentifier";
    public static final String SP_KEY_BX_INVOKE_ID = "bxFeatureInvokeId";
    public static final String SP_KEY_ENTRY_EXP = "contentExp";
    public static final String SP_KEY_FIRST_CARD_TYPE = "firstCardType";
    public static final String SP_KEY_HALF_SCREEN_FEATURE = "halfScreenFeature";
    public static final String SP_KEY_HALF_SCREEN_FEATURE_NATIVE = "halfScreenFeatureNative";
    public static final String SP_KEY_HALF_SCREEN_GUIDE_LIST = "halfScreenGuideList";
    public static final String SP_KEY_HALF_SCREEN_SHOW_DATE = "halfScreenShowDate";
    public static final String SP_KEY_HALF_SCREEN_SHOW_TIME = "halfScreenShowTime";
    public static final String SP_KEY_IS_WHITE_MODE = "isWhiteMode";
    public static final String SP_KEY_MAIN_PIC_URL = "mainPicUrl";
    public static final String SP_KEY_ORANGE_CONFIG_VERSION = "orangeConfigVersion";
    public static final String SP_KEY_SCREEN_CONFIG_HALF_SCREEN_HEIGHT = "screenConfigHalfScreenHeight";
    public static final String SP_KEY_SCREEN_CONFIG_VALID_HEIGHT = "screenConfigValidHeight";
    public static final String SP_KEY_SCREEN_CONFIG_WIDTH = "screenConfigWidth";
    public static final String SP_KEY_SCREEN_TYPE = "screenType";
    public static final String SP_KEY_WEEX_BRANCH_WLM = "weexBranchWlm";
    public static final String SP_NAME = "ndUser";
    public static final String WEEX_BRANCH_SP_NAME = "newDetailWeexBranch";

    /* renamed from: a  reason: collision with root package name */
    public static String f28023a;
    public static String b;
    public static String c;
    public static String d;
    private static String e;
    private static String f;
    private static String g;
    private static String h;
    private static String i;
    private static String j;
    public static String k;
    public static String l;
    private static int m;
    private static int n;

    static {
        kge.a(-1058642158);
        m = -1;
        n = -1;
        e = "e328099167d6341e3343fe321cc9624ce5f901e0";
        f = "d50d64aaceb9deb7c8e7bf1b10fa95e205c28fe5";
        g = "b4a93f1f9ccd86db1c31761eed2960adbed559c2";
        f28023a = Constants.Name.RESIZE_MODE;
        b = "marginTop";
        c = "height";
        d = d.KEY_CONTEXT_DATA_HALF_HEIGHT;
        k = "width";
        l = "halfWidth";
        h = "sp_key_float_permission_deny_time";
        i = "sp_key_enable_preload_newdetail";
        j = "sp_key_enable_preload_newdetail_orange_1";
    }

    public static void a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb6e290", new Object[]{context, jSONObject});
            return;
        }
        SharedPreferences e2 = e(context, OPTIMIZE_SP_NAME);
        if (e2 == null) {
            return;
        }
        String userId = Login.getUserId();
        SharedPreferences.Editor edit = e2.edit();
        if (jSONObject == null) {
            edit.putString(userId, "");
        } else {
            edit.putString(userId, jSONObject.toJSONString());
        }
        edit.apply();
    }

    public static ctv k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ctv) ipChange.ipc$dispatch("f9504bab", new Object[]{context});
        }
        try {
            SharedPreferences e2 = e(context, OPTIMIZE_SP_NAME);
            if (e2 == null) {
                return new ctv();
            }
            String string = e2.getString(Login.getUserId(), "");
            if (!StringUtils.isEmpty(string)) {
                return new ctv(JSONObject.parseObject(string));
            }
            return new ctv();
        } catch (Exception e3) {
            fjt.a("new_detail异常", "getOptimizeFeature异常", e3);
            return new ctv();
        }
    }

    public static void i(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300b4522", new Object[]{context, str});
            return;
        }
        SharedPreferences e2 = e(context, SP_NAME);
        if (e2 == null) {
            return;
        }
        SharedPreferences.Editor edit = e2.edit();
        edit.putString(SP_KEY_ORANGE_CONFIG_VERSION, str);
        edit.apply();
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        SharedPreferences e2 = e(context, SP_NAME);
        return e2 == null ? "" : e2.getString(SP_KEY_ORANGE_CONFIG_VERSION, "");
    }

    public static void a(b bVar, fhi fhiVar) {
        SharedPreferences e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e14c2b80", new Object[]{bVar, fhiVar});
        } else if (bVar == null) {
        } else {
            String m2 = fhiVar.m();
            if (StringUtils.isEmpty(m2) || (e2 = e(bVar.g(), SP_NAME)) == null) {
                return;
            }
            SharedPreferences.Editor edit = e2.edit();
            String str = bVar.h().k().F;
            if (StringUtils.isEmpty(str)) {
                str = "";
            }
            edit.putString(fhiVar.g + str + SP_KEY_MAIN_PIC_URL, m2);
            edit.apply();
        }
    }

    public static void b(b bVar, fhi fhiVar) {
        SharedPreferences e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e39429f", new Object[]{bVar, fhiVar});
        } else if (bVar == null || (e2 = e(bVar.g(), SP_NAME)) == null) {
        } else {
            SharedPreferences.Editor edit = e2.edit();
            edit.putString(SP_KEY_FIRST_CARD_TYPE, fhiVar.g);
            String str = bVar.h().k().F;
            if (StringUtils.isEmpty(str)) {
                str = "";
            }
            edit.putString(SP_KEY_ENTRY_EXP, str);
            edit.apply();
        }
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        SharedPreferences e2 = e(context, SP_NAME);
        if (e2 == null) {
            return null;
        }
        String string = e2.getString(SP_KEY_FIRST_CARD_TYPE, "item");
        String string2 = e2.getString(SP_KEY_ENTRY_EXP, "");
        return string + string2;
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        SharedPreferences e2 = e(context, SP_NAME);
        if (e2 == null) {
            return null;
        }
        return e2.getString(str + SP_KEY_MAIN_PIC_URL, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r20, java.lang.String r21, com.alibaba.fastjson.JSONObject r22) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fky.a(android.content.Context, java.lang.String, com.alibaba.fastjson.JSONObject):void");
    }

    public static int a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d18de967", new Object[]{context, str, str2})).intValue();
        }
        if (StringUtils.isEmpty(str2)) {
            return -1;
        }
        SharedPreferences e2 = e(context, SP_NAME);
        e2.getAll();
        if (e2 == null) {
            return -1;
        }
        return e2.getInt(str + str2, -1);
    }

    public static Map<String, ?> f(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8c8964fa", new Object[]{context, str});
        }
        SharedPreferences e2 = e(context, str + PLACE_HOLDER_IMAGE_MODE_SP_NAME);
        if (e2 != null) {
            return e2.getAll();
        }
        return null;
    }

    public static void a(Context context, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82ca7b6", new Object[]{context, dVar});
            return;
        }
        SharedPreferences e2 = e(context, SP_NAME);
        if (e2 == null) {
            return;
        }
        SharedPreferences.Editor edit = e2.edit();
        edit.putString(SP_KEY_HALF_SCREEN_FEATURE_NATIVE, dVar.H().getString("enableNonFullScreenNative"));
        edit.putString(SP_KEY_HALF_SCREEN_FEATURE, dVar.H().getString("enableNonFullScreen"));
        edit.putString(SP_KEY_HALF_SCREEN_GUIDE_LIST, dVar.H().getString(RecRequestParamsV2.KEY_HALF_SCREEN_GUIDE_INDEX_LIST));
        edit.apply();
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context});
        }
        SharedPreferences e2 = e(context, SP_NAME);
        return e2 == null ? "false" : e2.getString(SP_KEY_HALF_SCREEN_FEATURE_NATIVE, "false");
    }

    public static String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c344f03", new Object[]{context});
        }
        SharedPreferences e2 = e(context, SP_NAME);
        return e2 == null ? "false" : e2.getString(SP_KEY_HALF_SCREEN_FEATURE, "false");
    }

    public static String e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ae7544", new Object[]{context});
        }
        SharedPreferences e2 = e(context, SP_NAME);
        return e2 == null ? "" : e2.getString(SP_KEY_HALF_SCREEN_GUIDE_LIST, "false");
    }

    public static void a(Context context, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9e64", new Object[]{context, new Long(j2)});
            return;
        }
        SharedPreferences e2 = e(context, SP_NAME);
        if (e2 == null) {
            return;
        }
        e2.edit().putLong(h, j2).apply();
    }

    public static long f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a17cbe6f", new Object[]{context})).longValue();
        }
        SharedPreferences e2 = e(context, SP_NAME);
        if (e2 != null) {
            return e2.getLong(h, 0L);
        }
        return 0L;
    }

    public static void a(Context context, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21de43", new Object[]{context, new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        SharedPreferences e2 = e(context, SP_NAME);
        if (e2 == null) {
            return;
        }
        SharedPreferences.Editor edit = e2.edit();
        edit.putInt(SP_KEY_SCREEN_CONFIG_VALID_HEIGHT, i2);
        edit.putInt(SP_KEY_SCREEN_CONFIG_HALF_SCREEN_HEIGHT, i4);
        edit.putInt(SP_KEY_SCREEN_CONFIG_WIDTH, i3);
        edit.apply();
    }

    public static c g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("f29d9f73", new Object[]{context});
        }
        c cVar = new c();
        SharedPreferences e2 = e(context, SP_NAME);
        if (e2 == null) {
            cVar.f11522a = -1;
            return cVar;
        }
        cVar.f11522a = e2.getInt(SP_KEY_SCREEN_CONFIG_VALID_HEIGHT, -1);
        cVar.b = e2.getInt(SP_KEY_SCREEN_CONFIG_HALF_SCREEN_HEIGHT, -1);
        cVar.c = e2.getInt(SP_KEY_SCREEN_CONFIG_WIDTH, -1);
        cVar.d = cVar.c / cVar.f11522a;
        return cVar;
    }

    public static String g(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a26267bc", new Object[]{context, str});
        }
        SharedPreferences e2 = e(context, SP_NAME);
        return e2 == null ? str : e2.getString(SP_KEY_SCREEN_TYPE, str);
    }

    public static void h(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f640a343", new Object[]{context, str});
            return;
        }
        SharedPreferences e2 = e(context, SP_NAME);
        if (e2 == null) {
            return;
        }
        SharedPreferences.Editor edit = e2.edit();
        edit.putString(SP_KEY_SCREEN_TYPE, str);
        edit.apply();
    }

    public static String h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f21ce807", new Object[]{context});
        }
        SharedPreferences e2 = e(context, SP_NAME);
        if (e2 != null) {
            return e2.getString(i, null);
        }
        return null;
    }

    public static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
            return;
        }
        SharedPreferences e2 = e(context, SP_NAME);
        if (e2 == null) {
            return;
        }
        SharedPreferences.Editor edit = e2.edit();
        edit.putString(i, str);
        edit.apply();
    }

    public static String b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3b17b6d", new Object[]{context, str, str2});
        }
        SharedPreferences e2 = e(context, ORANGE_SP_NAME);
        return e2 == null ? str2 : e2.getString(str, str2);
    }

    public static void c(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5ecf9b2", new Object[]{context, str, str2});
            return;
        }
        SharedPreferences e2 = e(context, ORANGE_SP_NAME);
        if (e2 == null) {
            return;
        }
        SharedPreferences.Editor edit = e2.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public static void d(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("101c81d1", new Object[]{context, str, str2});
            return;
        }
        SharedPreferences e2 = e(context, WEEX_BRANCH_SP_NAME);
        if (e2 == null) {
            return;
        }
        SharedPreferences.Editor edit = e2.edit();
        edit.putString(str + SP_KEY_WEEX_BRANCH_WLM, str2);
        edit.apply();
    }

    public static void a(Context context, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b06cf3e", new Object[]{context, new Boolean(z), str});
            return;
        }
        SharedPreferences e2 = e(context, WEEX_BRANCH_SP_NAME);
        if (e2 == null) {
            return;
        }
        SharedPreferences.Editor edit = e2.edit();
        if (z) {
            edit.clear();
        } else {
            edit.putString(str + SP_KEY_WEEX_BRANCH_WLM, "");
        }
        edit.apply();
    }

    public static String c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b6487b8", new Object[]{context, str});
        }
        SharedPreferences e2 = e(context, WEEX_BRANCH_SP_NAME);
        if (e2 == null) {
            return null;
        }
        return e2.getString(str + SP_KEY_WEEX_BRANCH_WLM, null);
    }

    public static int i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a382c14b", new Object[]{context})).intValue();
        }
        SharedPreferences e2 = e(context, SP_NAME);
        if (e2 != null) {
            return e2.getInt(SP_KEY_HALF_SCREEN_SHOW_TIME, 0);
        }
        return 0;
    }

    public static void a(Context context, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{context, new Integer(i2)});
            return;
        }
        SharedPreferences e2 = e(context, SP_NAME);
        if (e2 == null) {
            return;
        }
        SharedPreferences.Editor edit = e2.edit();
        edit.putInt(SP_KEY_HALF_SCREEN_SHOW_TIME, i2);
        edit.putString(SP_KEY_HALF_SCREEN_SHOW_DATE, new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis())));
        edit.apply();
    }

    public static boolean j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a42f6cfb", new Object[]{context})).booleanValue();
        }
        SharedPreferences e2 = e(context, SP_NAME);
        if (e2 != null) {
            return e2.getString(SP_KEY_HALF_SCREEN_SHOW_DATE, "").equals(new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis())));
        }
        return false;
    }

    public static void a(Context context, String str, a aVar) {
        SharedPreferences e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b92b3b", new Object[]{context, str, aVar});
        } else if (aVar == null || StringUtils.isEmpty(str) || StringUtils.isEmpty(aVar.b()) || StringUtils.isEmpty(aVar.a()) || StringUtils.isEmpty(aVar.c()) || (e2 = e(context, SP_NAME)) == null) {
        } else {
            SharedPreferences.Editor edit = e2.edit();
            edit.putString(str + SP_KEY_BX_IDENTIFIER, aVar.b());
            edit.putString(str + SP_KEY_BX_CURRENT_SCENE, aVar.c());
            edit.putString(str + SP_KEY_BX_INVOKE_ID, aVar.a());
            edit.apply();
        }
    }

    public static a d(Context context, String str) {
        SharedPreferences e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("f832785c", new Object[]{context, str});
        }
        a aVar = new a();
        if (StringUtils.isEmpty(str) || (e2 = e(context, SP_NAME)) == null) {
            return aVar;
        }
        aVar.c(e2.getString(str + SP_KEY_BX_CURRENT_SCENE, ""));
        aVar.b(e2.getString(str + SP_KEY_BX_IDENTIFIER, ""));
        aVar.a(e2.getString(str + SP_KEY_BX_INVOKE_ID, ""));
        return aVar;
    }

    private static SharedPreferences e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("22af84fa", new Object[]{context, str});
        }
        if (context == null) {
            return null;
        }
        if (!(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        return context.getSharedPreferences(str, 0);
    }
}

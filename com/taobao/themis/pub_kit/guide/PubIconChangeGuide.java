package com.taobao.themis.pub_kit.guide;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.view.Window;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.pub_kit.guide.model.PubIconChangeGuidePopupModel;
import com.taobao.themis.pub_kit.guide.model.PubPropertiesFatigueModel;
import com.taobao.themis.pub_kit.guide.model.PubPropertiesModel;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.dlr;
import tb.eau;
import tb.kge;
import tb.riy;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0003%&'B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010JJ\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002JT\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001e\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J@\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0007J,\u0010\"\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010#\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010$\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/taobao/themis/pub_kit/guide/PubIconChangeGuide;", "", "mContext", "Landroid/content/Context;", "mUserGuideModel", "Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;", "homePagePopDataList", "Lcom/alibaba/fastjson/JSONArray;", "(Landroid/content/Context;Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;Lcom/alibaba/fastjson/JSONArray;)V", "mDisplayed", "", "mIconChangeGuidePopupModel", "Lcom/taobao/themis/pub_kit/guide/model/PubIconChangeGuidePopupModel;", "addTimesFatigue", "", "appId", "", "userId", "canShow", "Lcom/taobao/themis/pub_kit/guide/PubIconChangeGuide$ShowIconChangeGuideResult;", "doShowICONChangeStrongGuide", "name", "guideType", "", "icon", "strongGuidePopTitle", "strongGuidePopDesc", "newPopupData", "Lcom/alibaba/fastjson/JSONObject;", "getTBHomeIconChangeGuideUrl", "baseUrl", "show", "type", "Lcom/taobao/themis/pub_kit/guide/PubIconChangeGuide$PubIconChangeGuideType;", "showICONChangeStrongGuideByAPI", "showICONChangeStrongGuideByContainer", "timesFatigue", "Companion", "PubIconChangeGuideType", "ShowIconChangeGuideResult", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class PubIconChangeGuide {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f22785a;
    private final PubIconChangeGuidePopupModel b;
    private final Context c;
    private final PubUserGuideModule d;
    private final JSONArray e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/PubIconChangeGuide$PubIconChangeGuideType;", "", "(Ljava/lang/String;I)V", "ICON_CHANGE_STRONG_GUIDE", "ICON_CHANGE_STRONG_GUIDE_API", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public enum PubIconChangeGuideType {
        ICON_CHANGE_STRONG_GUIDE,
        ICON_CHANGE_STRONG_GUIDE_API
    }

    static {
        kge.a(-1726913926);
        Companion = new a(null);
    }

    public PubIconChangeGuide(Context mContext, PubUserGuideModule mUserGuideModel, JSONArray jSONArray) {
        q.d(mContext, "mContext");
        q.d(mUserGuideModel, "mUserGuideModel");
        this.c = mContext;
        this.d = mUserGuideModel;
        this.e = jSONArray;
        this.b = this.d.getIconChangeGuidePopup();
    }

    public /* synthetic */ PubIconChangeGuide(Context context, PubUserGuideModule pubUserGuideModule, JSONArray jSONArray, int i, o oVar) {
        this(context, pubUserGuideModule, (i & 4) != 0 ? null : jSONArray);
    }

    public static /* synthetic */ b a(PubIconChangeGuide pubIconChangeGuide, PubIconChangeGuideType pubIconChangeGuideType, String str, String str2, int i, String str3, String str4, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("bf36a4a7", new Object[]{pubIconChangeGuide, pubIconChangeGuideType, str, str2, new Integer(i), str3, str4, new Integer(i2), obj});
        }
        return pubIconChangeGuide.a(pubIconChangeGuideType, str, str2, i, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4);
    }

    public final b a(PubIconChangeGuideType type, String userId, String appId, int i, String str, String str2) {
        b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("ffec92a9", new Object[]{this, type, userId, appId, new Integer(i), str, str2});
        }
        q.d(type, "type");
        q.d(userId, "userId");
        q.d(appId, "appId");
        b a3 = a(appId, userId);
        if (a3.a() != 0) {
            return a3;
        }
        int i2 = d.$EnumSwitchMapping$0[type.ordinal()];
        if (i2 == 1) {
            a2 = a(appId);
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            a2 = a(appId, i, str, str2);
        }
        if (a2.a() == 0) {
            this.f22785a = true;
            c(appId, userId);
        }
        return a2;
    }

    public final b a(String appId, String userId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("6e385c51", new Object[]{this, appId, userId});
        }
        q.d(appId, "appId");
        q.d(userId, "userId");
        Context context = this.c;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
            TMSLogger.d("iconChangeGuidePopup", "environment illegality");
            return new b(4, "environment illegality");
        } else if (this.f22785a) {
            TMSLogger.d("iconChangeGuidePopup", "已展示过添加Icon弹窗");
            return new b(100, "已展示过添加Icon弹窗");
        } else if (b(appId, userId)) {
            TMSLogger.d("iconChangeGuidePopup", "疲劳度受限");
            return new b(101, "疲劳度受限");
        } else {
            return new b(0, "success");
        }
    }

    private final b a(String str) {
        JSONObject jSONObject;
        int i;
        String guideType;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f410635b", new Object[]{this, str});
        }
        TMSLogger.a("iconChangeGuidePopup", "showICONChangeStrongGuideByContainer");
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel = this.b;
        JSONObject jSONObject2 = null;
        String icon = pubIconChangeGuidePopupModel != null ? pubIconChangeGuidePopupModel.getIcon() : null;
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel2 = this.b;
        String name = pubIconChangeGuidePopupModel2 != null ? pubIconChangeGuidePopupModel2.getName() : null;
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel3 = this.b;
        String strongGuidePopTitle = pubIconChangeGuidePopupModel3 != null ? pubIconChangeGuidePopupModel3.getStrongGuidePopTitle() : null;
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel4 = this.b;
        String strongGuidePopDesc = pubIconChangeGuidePopupModel4 != null ? pubIconChangeGuidePopupModel4.getStrongGuidePopDesc() : null;
        JSONObject jSONObject3 = null;
        try {
            PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel5 = this.b;
            if (pubIconChangeGuidePopupModel5 != null && (guideType = pubIconChangeGuidePopupModel5.getGuideType()) != null) {
                i2 = Integer.parseInt(guideType);
            }
            PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel6 = this.b;
            if (pubIconChangeGuidePopupModel6 != null) {
                jSONObject2 = pubIconChangeGuidePopupModel6.getNewPopupData();
            }
            i = i2;
            jSONObject = jSONObject2;
        } catch (Exception e) {
            e.printStackTrace();
            jSONObject = jSONObject3;
            i = i2;
        }
        if (i < 2) {
            TMSLogger.d("iconChangeGuidePopup", "参数有误");
            return new b(2, "参数有误");
        }
        return a(name, str, i, icon, strongGuidePopTitle, strongGuidePopDesc, jSONObject);
    }

    private final b a(String str, int i, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("1b29c3c8", new Object[]{this, str, new Integer(i), str2, str3});
        }
        TMSLogger.a("iconChangeGuidePopup", "showICONChangeStrongGuideByAPI");
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel = this.b;
        String str4 = null;
        String icon = pubIconChangeGuidePopupModel != null ? pubIconChangeGuidePopupModel.getIcon() : null;
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel2 = this.b;
        if (pubIconChangeGuidePopupModel2 != null) {
            str4 = pubIconChangeGuidePopupModel2.getName();
        }
        return a(str4, str, i, icon, str2, str3, null);
    }

    private final b a(String str, String str2, int i, String str3, String str4, String str5, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b848f942", new Object[]{this, str, str2, new Integer(i), str3, str4, str5, jSONObject});
        }
        dlr dlrVar = new dlr();
        dlrVar.a(this.c);
        Context context = this.c;
        if (context == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
        Window window = ((Activity) context).getWindow();
        q.b(window, "(mContext as Activity).window");
        dlrVar.a(window.getDecorView());
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) "type", "showWeex2Pop");
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = jSONObject4;
        jSONObject5.put((JSONObject) "url", a(n.c(), str, str2, i, str3, str4, str5, jSONObject));
        jSONObject5.put((JSONObject) "popId", str2);
        jSONObject5.put((JSONObject) "animation", com.taobao.android.abilitykit.ability.pop.model.d.KEY_BOTTOM_IN_OUT);
        JSONObject jSONObject6 = new JSONObject();
        JSONObject jSONObject7 = jSONObject6;
        jSONObject7.put((JSONObject) "gravity", "center");
        jSONObject7.put((JSONObject) "tapEnable", (String) false);
        jSONObject7.put((JSONObject) "pushType", "outterJump");
        if (n.a(str2)) {
            jSONObject7.put((JSONObject) "maxHeight", (String) Double.valueOf(0.95d));
            jSONObject7.put((JSONObject) "maxWidth", (String) Double.valueOf(0.4d));
        } else {
            jSONObject7.put((JSONObject) "maxHeight", (String) Double.valueOf(0.6d));
            jSONObject7.put((JSONObject) "maxWidth", (String) Double.valueOf(0.8d));
        }
        jSONObject7.put((JSONObject) "useViewMode", (String) true);
        t tVar = t.INSTANCE;
        jSONObject5.put((JSONObject) com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG, (String) jSONObject6);
        JSONObject jSONObject8 = new JSONObject();
        JSONObject jSONObject9 = jSONObject8;
        jSONObject9.put((JSONObject) "popType", com.taobao.themis.pub_kit.utils.h.a(this.e, "iconChangeGuidePopup"));
        Object expBuckets = this.d.getExpBuckets();
        if (expBuckets == null) {
            expBuckets = new String[0];
        }
        jSONObject9.put((JSONObject) "expBuckets", (String) expBuckets);
        Resources resources = this.c.getResources();
        q.b(resources, "mContext.resources");
        if (resources.getConfiguration().orientation != 2) {
            z = false;
        }
        jSONObject9.put((JSONObject) "landscape", (String) Boolean.valueOf(z));
        t tVar2 = t.INSTANCE;
        jSONObject5.put((JSONObject) "content", (String) jSONObject8);
        t tVar3 = t.INSTANCE;
        jSONObject3.put((JSONObject) "params", (String) jSONObject4);
        TMSLogger.b("iconChangeGuidePopup", jSONObject2.toJSONString());
        com.taobao.themis.kernel.utils.a.a(new PubIconChangeGuide$doShowICONChangeStrongGuide$1(this, jSONObject2, dlrVar), 500L);
        return new b(0, "success");
    }

    private final String a(String str, String str2, String str3, int i, String str4, String str5, String str6, JSONObject jSONObject) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a2c888b", new Object[]{this, str, str2, str3, new Integer(i), str4, str5, str6, jSONObject});
        }
        if (StringUtils.isEmpty(str) || (parse = Uri.parse(str)) == null) {
            return null;
        }
        Uri.Builder buildUpon = parse.buildUpon();
        if (!StringUtils.isEmpty(str2)) {
            buildUpon = buildUpon.appendQueryParameter("appName", str2);
        }
        if (!StringUtils.isEmpty(str3)) {
            buildUpon = buildUpon.appendQueryParameter("miniappId", str3);
        }
        Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("guideType", String.valueOf(i));
        if (!StringUtils.isEmpty(str4)) {
            appendQueryParameter = appendQueryParameter.appendQueryParameter("icon", str4);
        }
        if (!StringUtils.isEmpty(str5)) {
            appendQueryParameter = appendQueryParameter.appendQueryParameter("strongGuidePopTitle", str5);
        }
        if (!StringUtils.isEmpty(str6)) {
            appendQueryParameter = appendQueryParameter.appendQueryParameter("strongGuidePopDesc", str6);
        }
        if (jSONObject != null) {
            appendQueryParameter = appendQueryParameter.appendQueryParameter("newPopupData", jSONObject.toJSONString());
        }
        return appendQueryParameter.appendQueryParameter("isNewMiniAppReplace", String.valueOf(true)).build().toString();
    }

    private final boolean b(String str, String str2) {
        PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig;
        List<String> range;
        String fatigueCountValue;
        String fatigueDayValue;
        Map<String, String> bizFatigueModel;
        String str3;
        Map<String, String> bizFatigueModel2;
        String str4;
        Map<String, String> userFatigueModel;
        String str5;
        Map<String, String> userFatigueModel2;
        String str6;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel = this.b;
        int parseInt = (pubIconChangeGuidePopupModel == null || (userFatigueModel2 = pubIconChangeGuidePopupModel.getUserFatigueModel()) == null || (str6 = userFatigueModel2.get("backFatigueDayValue")) == null) ? 0 : Integer.parseInt(str6);
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel2 = this.b;
        int parseInt2 = (pubIconChangeGuidePopupModel2 == null || (userFatigueModel = pubIconChangeGuidePopupModel2.getUserFatigueModel()) == null || (str5 = userFatigueModel.get("backFatigueCountValue")) == null) ? 0 : Integer.parseInt(str5);
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel3 = this.b;
        int parseInt3 = (pubIconChangeGuidePopupModel3 == null || (bizFatigueModel2 = pubIconChangeGuidePopupModel3.getBizFatigueModel()) == null || (str4 = bizFatigueModel2.get("backFatigueDayValue")) == null) ? 0 : Integer.parseInt(str4);
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel4 = this.b;
        int parseInt4 = (pubIconChangeGuidePopupModel4 == null || (bizFatigueModel = pubIconChangeGuidePopupModel4.getBizFatigueModel()) == null || (str3 = bizFatigueModel.get("backFatigueCountValue")) == null) ? 0 : Integer.parseInt(str3);
        com.taobao.themis.pub_kit.utils.d dVar = null;
        PubPropertiesModel properties = this.d.getProperties();
        if (properties != null && (totalGuidePopupUserFatigueConfig = properties.getTotalGuidePopupUserFatigueConfig()) != null && (range = totalGuidePopupUserFatigueConfig.getRange()) != null && range.contains("iconChangeGuidePopup")) {
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig2 = properties.getTotalGuidePopupUserFatigueConfig();
            int parseInt5 = (totalGuidePopupUserFatigueConfig2 == null || (fatigueDayValue = totalGuidePopupUserFatigueConfig2.getFatigueDayValue()) == null) ? 0 : Integer.parseInt(fatigueDayValue);
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig3 = properties.getTotalGuidePopupUserFatigueConfig();
            if (totalGuidePopupUserFatigueConfig3 != null && (fatigueCountValue = totalGuidePopupUserFatigueConfig3.getFatigueCountValue()) != null) {
                i = Integer.parseInt(fatigueCountValue);
            }
            dVar = new com.taobao.themis.pub_kit.utils.d(str2, parseInt5, i);
        }
        return com.taobao.themis.pub_kit.utils.e.a(this.c, "iconChangeGuidePopup", new com.taobao.themis.pub_kit.utils.d(str, parseInt3, parseInt4), new com.taobao.themis.pub_kit.utils.d(str2, parseInt, parseInt2), dVar);
    }

    private final void c(String str, String str2) {
        PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig;
        List<String> range;
        String fatigueCountValue;
        String fatigueDayValue;
        Map<String, String> bizFatigueModel;
        String str3;
        Map<String, String> bizFatigueModel2;
        String str4;
        Map<String, String> userFatigueModel;
        String str5;
        Map<String, String> userFatigueModel2;
        String str6;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
            return;
        }
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel = this.b;
        int parseInt = (pubIconChangeGuidePopupModel == null || (userFatigueModel2 = pubIconChangeGuidePopupModel.getUserFatigueModel()) == null || (str6 = userFatigueModel2.get("backFatigueDayValue")) == null) ? 0 : Integer.parseInt(str6);
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel2 = this.b;
        int parseInt2 = (pubIconChangeGuidePopupModel2 == null || (userFatigueModel = pubIconChangeGuidePopupModel2.getUserFatigueModel()) == null || (str5 = userFatigueModel.get("backFatigueCountValue")) == null) ? 0 : Integer.parseInt(str5);
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel3 = this.b;
        int parseInt3 = (pubIconChangeGuidePopupModel3 == null || (bizFatigueModel2 = pubIconChangeGuidePopupModel3.getBizFatigueModel()) == null || (str4 = bizFatigueModel2.get("backFatigueDayValue")) == null) ? 0 : Integer.parseInt(str4);
        PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel4 = this.b;
        int parseInt4 = (pubIconChangeGuidePopupModel4 == null || (bizFatigueModel = pubIconChangeGuidePopupModel4.getBizFatigueModel()) == null || (str3 = bizFatigueModel.get("backFatigueCountValue")) == null) ? 0 : Integer.parseInt(str3);
        com.taobao.themis.pub_kit.utils.d dVar = null;
        PubPropertiesModel properties = this.d.getProperties();
        if (properties != null && (totalGuidePopupUserFatigueConfig = properties.getTotalGuidePopupUserFatigueConfig()) != null && (range = totalGuidePopupUserFatigueConfig.getRange()) != null && range.contains("iconChangeGuidePopup")) {
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig2 = properties.getTotalGuidePopupUserFatigueConfig();
            int parseInt5 = (totalGuidePopupUserFatigueConfig2 == null || (fatigueDayValue = totalGuidePopupUserFatigueConfig2.getFatigueDayValue()) == null) ? 0 : Integer.parseInt(fatigueDayValue);
            PubPropertiesFatigueModel totalGuidePopupUserFatigueConfig3 = properties.getTotalGuidePopupUserFatigueConfig();
            if (totalGuidePopupUserFatigueConfig3 != null && (fatigueCountValue = totalGuidePopupUserFatigueConfig3.getFatigueCountValue()) != null) {
                i = Integer.parseInt(fatigueCountValue);
            }
            dVar = new com.taobao.themis.pub_kit.utils.d(str2, parseInt5, i);
        }
        com.taobao.themis.pub_kit.utils.e.b(this.c, "iconChangeGuidePopup", new com.taobao.themis.pub_kit.utils.d(str, parseInt3, parseInt4), new com.taobao.themis.pub_kit.utils.d(str2, parseInt, parseInt2), dVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/PubIconChangeGuide$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(919338306);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/PubIconChangeGuide$ShowIconChangeGuideResult;", "", "code", "", "msg", "", "(ILjava/lang/String;)V", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "component1", "component2", "copy", eau.PARSER_TAG, "", "other", "hashCode", "toString", "themis_pub_kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final int f22786a;
        private final String b;

        static {
            kge.a(1856544809);
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (this.f22786a != bVar.f22786a || !q.a((Object) this.b, (Object) bVar.b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            int i2 = this.f22786a * 31;
            String str = this.b;
            if (str != null) {
                i = str.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "ShowIconChangeGuideResult(code=" + this.f22786a + ", msg=" + this.b + riy.BRACKET_END_STR;
        }

        public b(int i, String msg) {
            q.d(msg, "msg");
            this.f22786a = i;
            this.b = msg;
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f22786a;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }
    }
}

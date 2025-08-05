package com.taobao.themis.container.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.i;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.m;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.t;
import com.taobao.themis.utils.f;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0015\u001a\u00020\rH\u0003J\b\u0010\u0016\u001a\u00020\rH\u0003J\b\u0010\u0017\u001a\u00020\rH\u0003J\b\u0010\u0018\u001a\u00020\rH\u0003J\u000e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u001a\u001a\u00020\rH\u0007J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/taobao/themis/container/utils/TMSSwitchUtils;", "", "()V", "FLAG_DEV_JS_FRAMEWORK", "", "FLAG_QKING", "FLAG_TMS", "FLAG_TRIVER", "FLAG_V8", "INNER_SWITCH_LIST", "", "LOCAL_PATH", "downgradeOn32", "", "uri", "Landroid/net/Uri;", "enableEnterTMSH5AFC", "context", "Landroid/content/Context;", "enableEnterUniApp", "isEnterTMS", "isFullSwitchToQking", "isFullSwitchToTMS", "isFullSwitchToTriver", "isFullSwitchToV8", "isHD", "useDevJSFramework", "useThemisWidget", RVConstants.EXTRA_START_PARAMS, "Lcom/alibaba/fastjson/JSONObject;", "useV8Runtime", "appId", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSSwitchUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FLAG_DEV_JS_FRAMEWORK = ".switchtoDevJsFramework";
    private static final String FLAG_QKING = ".switchToQking";
    private static final String FLAG_TMS = ".switchToThemis";
    private static final String FLAG_TRIVER = ".switchToTriver";
    private static final String FLAG_V8 = ".switchToV8";
    private static final List<String> INNER_SWITCH_LIST;
    public static final TMSSwitchUtils INSTANCE;
    private static final String LOCAL_PATH = "/data/local/tmp/.themis_local_switch/";

    static {
        kge.a(1501327109);
        INSTANCE = new TMSSwitchUtils();
        INNER_SWITCH_LIST = p.b("3000000106525574", "3000000050566565", "3000000005168953", "3000000028714301", "3000000108495875", "1000003", "1000004", "1000410", "1000413", "1000414", "1000415", "1000416", "1000437", "1000474", "1000476", "10703953", "1159349", "12044118", "12303126", "12721076", "13417847", "17588434", "19433716", "19760947", "19905101", "20012401", "20133772", "22129413", "3000000026238431", "3000000026855752", "3000000027280761", "3000000027490524", "3000000027610902", "3000000028555582", "3000000029462362", "3000000035930451", "3000000036299515", "3000000041273562", "3000000042315414", "3000000047286294", "3000000050106724", "3000000052571421", "3000000055944572", "3000000056086413", "3000000057060663", "3000000059869791", "3000000060129722", "3000000060917022", "3000000062695594", "3000000064426654", "3000000066607081", "3000000070496171", "3000000070975124", "3000000073987945", "3000000074911405", "3000000078644662", "3000000079494892", "3000000081492872", "3000000082511381", "3000000083212031", "3000000083541514", "3000000083741174", "3000000083994175", "3000000084652842", "3000000085107245", "3000000085349091", "3000000086587283", "3000000086736082", "3000000087948954", "3000000088744373", "3000000088746171", "3000000088770721", "3000000089053801", "3000000089144025", "3000000089437432", "3000000090196802", "3000000090438101", "3000000090474045", "3000000090756462", "3000000091808351", "3000000091811391", "3000000091825373", "3000000091987794", "3000000091992743", "3000000092259091", "3000000092576361", "3000000092670541", "3000000093000831", "3000000093210663", "3000000093231824", "3000000093510282", "3000000093709391", "3000000093832684", "3000000093854812", "3000000094040673", "3000000094232113", "3000000094280644", "3000000094311515", "3000000094337401", "3000000094352082", "3000000094568574", "3000000094625664", "3000000094774333", "3000000094776154", "3000000095219882", "3000000095496142", "3000000097410125", "3000000098640642", "3000000099752931", "3000000101663741", "3000000101891044", "3000000102026985", "3000000103156613", "3000000103461192", "3000000105138882", "3000000105361054", "3000000106876185", "3000000106895985", "3000000107577405", "3000000108058665", "3000000108838293", "3000000108841962", "3000000109566362", "3000000110389174", "3000000110389744", "3000000110390273", "3000000110390602", "3000000110390931", "3000000112592904", "3000000114819352", "3000000116425325", "5972516", "6158543", "6296385", "6365528", "6483140", "6528465", "6579080", "6639583", "8536719", "8697302");
    }

    private TMSSwitchUtils() {
    }

    @JvmStatic
    public static final boolean isEnterTMS(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e3cf7b6", new Object[]{context, uri})).booleanValue();
        }
        q.d(context, "context");
        q.d(uri, "uri");
        t.a(context);
        if (isFullSwitchToTriver()) {
            return false;
        }
        if (isFullSwitchToTMS() || enableEnterUniApp(uri)) {
            return true;
        }
        if (f.a(context) && uri.getQueryParameter("isThemis") != null) {
            return m.c(uri);
        }
        String queryParameter = uri.getQueryParameter(i.APP_ID);
        if (!TextUtils.isEmpty(n.E()) && kotlin.text.n.b((CharSequence) n.E(), (CharSequence) String.valueOf(queryParameter), false, 2, (Object) null)) {
            return false;
        }
        return p.a((Iterable<? extends String>) INNER_SWITCH_LIST, queryParameter) || INSTANCE.isHD(uri) || TMSSolutionType.getType(uri) == TMSSolutionType.MINIGAME || t.a(queryParameter);
    }

    @JvmStatic
    private static final boolean isFullSwitchToTriver() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("60451b8b", new Object[0])).booleanValue() : new File("/data/local/tmp/.themis_local_switch/.switchToTriver").exists() && !new File("/data/local/tmp/.themis_local_switch/.switchToThemis").exists();
    }

    @JvmStatic
    private static final boolean isFullSwitchToTMS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5454ccbd", new Object[0])).booleanValue() : !new File("/data/local/tmp/.themis_local_switch/.switchToTriver").exists() && new File("/data/local/tmp/.themis_local_switch/.switchToThemis").exists();
    }

    @JvmStatic
    public static final boolean enableEnterTMSH5AFC(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d31c756", new Object[]{context, uri})).booleanValue();
        }
        q.d(context, "context");
        q.d(uri, "uri");
        return TMSSolutionType.getType(uri) == TMSSolutionType.WEB_SINGLE_PAGE && m.a(context, uri);
    }

    @JvmStatic
    public static final boolean enableEnterUniApp(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bb274de", new Object[]{uri})).booleanValue();
        }
        q.d(uri, "uri");
        return com.taobao.themis.kernel.utils.i.a(uri);
    }

    @JvmStatic
    public static final boolean downgradeOn32(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e99bef1", new Object[]{uri})).booleanValue();
        }
        q.d(uri, "uri");
        return Build.VERSION.SDK_INT >= 23 && !Process.is64Bit() && TextUtils.equals(uri.getQueryParameter("downgradeOn32"), "true");
    }

    @JvmStatic
    public static final boolean useThemisWidget(Context context, JSONObject startParams) {
        JSONObject jSONObject;
        String string;
        JSONObject jSONObject2;
        String string2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f422a384", new Object[]{context, startParams})).booleanValue();
        }
        q.d(context, "context");
        q.d(startParams, "startParams");
        t.a(context);
        String string3 = startParams.getString("widgetId");
        if (string3 != null && (jSONObject = startParams.getJSONObject("sceneParams")) != null && (string = jSONObject.getString("sellerId")) != null && (jSONObject2 = startParams.getJSONObject("sceneParams")) != null && (string2 = jSONObject2.getString("sceneId")) != null) {
            return t.a(string2, string, string3);
        }
        return false;
    }

    public final boolean isHD(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bef23fbe", new Object[]{this, uri})).booleanValue();
        }
        q.d(uri, "uri");
        return p.a((Iterable<? extends String>) new ArrayList(Arrays.asList("3000000073987945", "3000000078644662", "19760947", "3000000084652842", "3000000074911405", "3000000052571421", "3000000062695594", "22129413", "3000000027610902", "3000000056086413", "3000000092259091", "3000000094568574", "6579080")), uri.getQueryParameter(i.APP_ID));
    }

    @JvmStatic
    public static final boolean useV8Runtime(String appId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1c4a284", new Object[]{appId})).booleanValue();
        }
        q.d(appId, "appId");
        if (isFullSwitchToQking()) {
            return false;
        }
        if (isFullSwitchToV8()) {
            return true;
        }
        String str = appId;
        if (kotlin.text.n.b((CharSequence) n.p(), (CharSequence) str, false, 2, (Object) null)) {
            return false;
        }
        return n.ad() || kotlin.text.n.b((CharSequence) n.ae(), (CharSequence) str, false, 2, (Object) null);
    }

    @JvmStatic
    private static final boolean isFullSwitchToV8() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1daf76f5", new Object[0])).booleanValue() : new File("/data/local/tmp/.themis_local_switch/.switchToV8").exists() && !new File("/data/local/tmp/.themis_local_switch/.switchToQking").exists();
    }

    @JvmStatic
    private static final boolean isFullSwitchToQking() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fe631e2b", new Object[0])).booleanValue() : !new File("/data/local/tmp/.themis_local_switch/.switchToV8").exists() && new File("/data/local/tmp/.themis_local_switch/.switchToQking").exists();
    }

    @JvmStatic
    public static final boolean useDevJSFramework() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bf0789f2", new Object[0])).booleanValue() : new File("/data/local/tmp/.themis_local_switch/.switchtoDevJsFramework").exists();
    }
}

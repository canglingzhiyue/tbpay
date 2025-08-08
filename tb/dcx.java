package tb;

import android.os.Build;
import android.os.PowerManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.c;
import com.taobao.adaemon.e;
import com.taobao.adaemon.l;
import com.taobao.orange.candidate.VersionCompare;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import mtopsdk.common.util.SymbolExpUtil;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dcx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, List<dcw>> f26701a;

    public static /* synthetic */ String b(byte[] bArr) throws Throwable {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("47058030", new Object[]{bArr}) : c(bArr);
    }

    static {
        kge.a(-954483736);
        f26701a = new ConcurrentHashMap();
    }

    public static void a(String str, int i) {
        List<dcw> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{str, new Integer(i)});
        } else if (StringUtils.isEmpty(str) || (list = f26701a.get(str)) == null) {
        } else {
            if (list.size() > i) {
                list.get(i).a();
            } else {
                e.b("ActionChains", "execute end", "chainId", str);
            }
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            f26701a.remove(str);
        }
    }

    public static void a(final byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{bArr});
        } else if (bArr == null) {
        } else {
            c.a().execute(new Runnable() { // from class: tb.dcx.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        String b = dcx.b(bArr);
                        if (StringUtils.isEmpty(b)) {
                            return;
                        }
                        dcx.a(b, 0);
                    } catch (Throwable th) {
                        e.a("ActionChains", "parse err", th, new Object[0]);
                    }
                }
            });
        }
    }

    private static String c(byte[] bArr) throws Throwable {
        dcw dcyVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43070f0f", new Object[]{bArr});
        }
        JSONObject jSONObject = new JSONObject(new String(bArr));
        int optInt = jSONObject.optInt("version");
        if (optInt != 1) {
            e.b("ActionChains", "parseDataProtocol, not support version", "version", Integer.valueOf(optInt));
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("contentList");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            e.b("ActionChains", "parseDataProtocol, empty contentList", new Object[0]);
            return null;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            String optString = optJSONObject.optString("id");
            if (optJSONObject.optLong("expire") < System.currentTimeMillis()) {
                e.b("ActionChains", "parseDataProtocol, expire", new Object[0]);
            } else if (!a(optJSONObject.optJSONObject("condition"))) {
                continue;
            } else {
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("chains");
                if (optJSONArray2 == null || optJSONArray2.length() == 0) {
                    e.b("ActionChains", "parseDataProtocol, empty chain", new Object[0]);
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= optJSONArray2.length()) {
                            break;
                        }
                        JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                        String optString2 = optJSONObject2.optString("name");
                        if ("start_svc".equals(optString2)) {
                            dcyVar = new dda(optString, i2);
                        } else if ("restart_channel".equals(optString2)) {
                            dcyVar = new dcz(optString, i2);
                        } else {
                            dcyVar = "launch_tb".equals(optString2) ? new dcy(optString, i2) : null;
                        }
                        if (dcyVar == null) {
                            copyOnWriteArrayList.clear();
                            break;
                        }
                        String optString3 = optJSONObject2.optString("data");
                        if (!StringUtils.isEmpty(optString3)) {
                            dcyVar.a(optString3);
                        }
                        copyOnWriteArrayList.add(dcyVar);
                        i2++;
                    }
                    if (copyOnWriteArrayList.size() > 0) {
                        f26701a.put(optString, copyOnWriteArrayList);
                        return optString;
                    }
                }
            }
        }
        e.b("ActionChains", "parseDataProtocol, empty action list", new Object[0]);
        return null;
    }

    private static boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3286165a", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject != null) {
            try {
                if (jSONObject.has("brand") && !Build.BRAND.equals(jSONObject.optString("brand"))) {
                    e.b("ActionChains", "checkCondition, different brand", new Object[0]);
                    return false;
                } else if (jSONObject.has("keeplive") && l.c() != jSONObject.optBoolean("keeplive")) {
                    e.b("ActionChains", "checkCondition, not keepalive", new Object[0]);
                    return false;
                } else if (jSONObject.has(pqe.STAGE_INTERACTIVE) && jSONObject.optBoolean(pqe.STAGE_INTERACTIVE, false) && !((PowerManager) l.e().getSystemService("power")).isInteractive()) {
                    e.b("ActionChains", "checkCondition, screen off", new Object[0]);
                    return false;
                } else if (jSONObject.has("appversion")) {
                    VersionCompare versionCompare = new VersionCompare();
                    String d = l.d();
                    String[] split = jSONObject.optString("appversion").split(SymbolExpUtil.SYMBOL_VERTICALBAR);
                    String str = split[0];
                    if (!StringUtils.isEmpty(str) && str.contains("-")) {
                        String[] split2 = str.split("-");
                        if (split2.length != 2) {
                            e.b("ActionChains", "checkCondition, app version range err", new Object[0]);
                            return false;
                        }
                        String str2 = split2[0];
                        String str3 = split2[1];
                        if (!"*".equals(str2) && versionCompare.less(d, str2)) {
                            e.b("ActionChains", "checkCondition, app version less", "start", str2);
                            return false;
                        } else if (!"*".equals(str3) && versionCompare.greater(d, str3)) {
                            e.b("ActionChains", "checkCondition, app version greater", "end", str3);
                            return false;
                        } else {
                            str = split.length == 2 ? split[1] : "";
                        }
                    }
                    if (!StringUtils.isEmpty(str)) {
                        boolean z = split.length == 1;
                        List asList = Arrays.asList(str.split(","));
                        if (z) {
                            if (!asList.contains(d)) {
                                e.b("ActionChains", "checkCondition, app version not allowed", new Object[0]);
                                return false;
                            }
                        } else if (asList.contains(d)) {
                            e.b("ActionChains", "checkCondition, app version blocked", new Object[0]);
                            return false;
                        }
                    }
                }
            } catch (Throwable th) {
                e.a("ActionChains", "checkCondition err", th, new Object[0]);
            }
        }
        return true;
    }
}

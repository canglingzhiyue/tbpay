package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.remote.d;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopStatistics;

/* loaded from: classes5.dex */
public class sov {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, String> f33782a;

    static {
        kge.a(205118396);
        f33782a = new HashMap<>();
    }

    public static JSONObject a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5579f4ff", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        return a(uri.getQueryParameter("extParams"));
    }

    public static JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{str});
        }
        if (!StringUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                if (ogv.a(parseObject) || !StringUtils.equals(parseObject.getString("target"), "web")) {
                    return parseObject;
                }
                spz.c("PickPreloadController_ParseUtils", "PickPreloadControllerNew，getExtParamsByQuery: target = web，不承接");
                return null;
            } catch (Exception e) {
                spz.c("PickPreloadController_ParseUtils", "PickPreloadControllerNew,parseVideoExtParamsByJsonStr" + e.getMessage());
            }
        }
        return null;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        return obz.a(str).getString("firstFrameUrl");
    }

    public static String a(MtopResponse mtopResponse, Pair<String, String> pair, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68402c99", new Object[]{mtopResponse, pair, new Boolean(z)});
        }
        try {
            MtopStatistics mtopStat = mtopResponse.getMtopStat();
            if (mtopStat != null) {
                str = mtopStat.fullTraceId;
                spz.c("PickPreloadController_ParseUtils", "fullTraceId:" + str);
                if (f33782a == null) {
                    f33782a = new HashMap<>();
                }
                if (!StringUtils.isEmpty(str) && f33782a.containsKey(str)) {
                    return f33782a.get(str);
                }
            } else {
                str = null;
            }
            String a2 = a(JSONObject.parseObject(new String(mtopResponse.getBytedata())), pair, z);
            if (!StringUtils.isEmpty(str)) {
                f33782a.put(str, a2);
            }
            return a2;
        } catch (Throwable th) {
            spz.a("PickPreloadController_ParseUtils", th.getMessage(), th);
            return null;
        }
    }

    private static String a(JSONObject jSONObject, Pair<String, String> pair, boolean z) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dddacc1e", new Object[]{jSONObject, pair, new Boolean(z)});
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (z) {
                string = jSONObject2.toJSONString();
            } else {
                string = jSONObject2.getString("resourceStr");
            }
            if (pair == null) {
                return string;
            }
            if (!StringUtils.isEmpty((CharSequence) pair.second) && d.d()) {
                return d(string);
            }
            return (StringUtils.isEmpty((CharSequence) pair.first) || !d.c()) ? string : d(string);
        } catch (Throwable th) {
            spz.a("PickPreloadController_ParseUtils", th.getMessage(), th);
            return null;
        }
    }

    private static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
        }
        try {
            pio.a(pio.GG_VIDEOTAB_VIDEO_DECRYPT);
            spz.c("PickPreloadController_ParseUtils", "findVideoResource");
            byte[] decode = Base64.decode(str, 2);
            byte[] copyOfRange = Arrays.copyOfRange(decode, 0, 16);
            byte[] copyOfRange2 = Arrays.copyOfRange(decode, 27, 43);
            byte[] copyOfRange3 = Arrays.copyOfRange(decode, 16, 27);
            byte[] copyOfRange4 = Arrays.copyOfRange(decode, 43, decode.length);
            byte[] bArr = new byte[copyOfRange3.length + copyOfRange4.length];
            System.arraycopy(copyOfRange3, 0, bArr, 0, copyOfRange3.length);
            System.arraycopy(copyOfRange4, 0, bArr, copyOfRange3.length, copyOfRange4.length);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new SecretKeySpec(copyOfRange2, "AES"), new IvParameterSpec(copyOfRange));
            byte[] doFinal = cipher.doFinal(bArr);
            pio.b(pio.GG_VIDEOTAB_VIDEO_DECRYPT);
            return new String(doFinal, "utf-8");
        } catch (Throwable th) {
            spz.c("PickPreloadController_ParseUtils", "find VideoResource fail: " + th.getMessage());
            pio.a(pio.GG_VIDEOTAB_VIDEO_DECRYPT, "onError");
            return null;
        }
    }

    public static Pair<String, String> b(Uri uri) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("bce24f48", new Object[]{uri});
        }
        if (uri == null || (a2 = a(uri)) == null) {
            return null;
        }
        try {
            return new Pair<>(a2.getString("id"), a2.getString("goodItemId"));
        } catch (Exception e) {
            spz.c("PickPreloadController_ParseUtils", "parseVideoIdAndItemId" + e.getMessage());
            return null;
        }
    }

    public static Pair<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("31b01bd2", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            return new Pair<>(jSONObject.getString("id"), jSONObject.getString("goodItemId"));
        } catch (Exception e) {
            spz.c("PickPreloadController_ParseUtils", "parseVideoIdAndItemId" + e.getMessage());
            return null;
        }
    }

    public static String a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6e6d446", new Object[]{fluidContext});
        }
        Pair<String, String> j = ((IUsePreloadService) fluidContext.getService(IUsePreloadService.class)).getConfig().j();
        sps sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        String str = (sessionParams == null || sessionParams.d == null) ? skw.FAKE_CONTENT_ID : sessionParams.d;
        return (j == null || j.first == null) ? str : (String) j.first;
    }

    public static HashMap<String, String> b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("314bc63e", new Object[]{fluidContext});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        sps sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        if (sessionParams != null) {
            hashMap.put("from", sessionParams.c);
        }
        hashMap.put(oyw.VIDEO_PLAY_SCENES, fluidContext.getInstanceConfig().getPlayScenes());
        return hashMap;
    }

    public static String c(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6767f723", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("extParams");
        if (StringUtils.isEmpty(queryParameter)) {
            return null;
        }
        try {
            JSONObject parseObject = JSON.parseObject(queryParameter);
            if (ogv.a(parseObject)) {
                return null;
            }
            return parseObject.getString("sceneSource");
        } catch (Exception e) {
            spz.c("PickPreloadController_ParseUtils", "PickPreloadControllerNew,parseVideoExtParamsScreenSource" + e.getMessage());
            return null;
        }
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        JSONObject a2 = obz.a(str);
        if (ogv.a(a2)) {
            return null;
        }
        return a2.getString("id");
    }
}

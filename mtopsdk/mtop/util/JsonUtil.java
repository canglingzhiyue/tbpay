package mtopsdk.mtop.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.a;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.global.SwitchConfig;
import tb.kge;

/* loaded from: classes9.dex */
public class JsonUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.JsonUtil";

    static {
        kge.a(-1854638003);
    }

    public static JSONObject parse(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("975b6321", new Object[]{bArr});
        }
        JSONObject jSONObject = null;
        if (bArr != null && bArr.length != 0) {
            try {
                if (SwitchConfig.getInstance().isFastJson2Enable()) {
                    jSONObject = parseWithJson2(bArr);
                } else if (SwitchConfig.getInstance().isFastJson1Enable()) {
                    jSONObject = (JSONObject) JSON.parse(bArr, new Feature[0]);
                }
            } catch (Exception e) {
                TBSdkLog.e(TAG, "[JsonUtil]parse error", e);
            }
        }
        return jSONObject;
    }

    public static JSONObject parseWithJson2(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cb52139f", new Object[]{bArr});
        }
        if (bArr != null && bArr.length != 0) {
            try {
                JSONReader.c b = JSONFactory.b();
                b.a($$Lambda$LS0jSaaqVn1tGDsQ7NTpMRRi1s.INSTANCE);
                b.b($$Lambda$Qw3nmyClOGKd5nO5XDVBdrsVYCI.INSTANCE);
                return (JSONObject) a.CC.a(bArr, b);
            } catch (Exception e) {
                TBSdkLog.e(TAG, "[JsonUtil]parseWithJson2 error", e);
            }
        }
        return null;
    }

    public static BaseOutDo parseObject(byte[] bArr, Class<?> cls) {
        BaseOutDo baseOutDo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseOutDo) ipChange.ipc$dispatch("5f7bae27", new Object[]{bArr, cls});
        }
        if (cls == null || bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            if (SwitchConfig.getInstance().isFastJson2Enable()) {
                JSONReader.c b = JSONFactory.b();
                b.a($$Lambda$LS0jSaaqVn1tGDsQ7NTpMRRi1s.INSTANCE);
                b.b($$Lambda$Qw3nmyClOGKd5nO5XDVBdrsVYCI.INSTANCE);
                baseOutDo = (BaseOutDo) a.CC.a(bArr, cls, b);
            } else if (!SwitchConfig.getInstance().isFastJson1Enable()) {
                return null;
            } else {
                baseOutDo = (BaseOutDo) JSON.parseObject(bArr, cls, new Feature[0]);
            }
            return baseOutDo;
        } catch (Exception e) {
            TBSdkLog.e(TAG, "[JsonUtil]parseObject error", e);
            return null;
        }
    }
}

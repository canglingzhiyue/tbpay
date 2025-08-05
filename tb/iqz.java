package tb;

import android.content.Context;
import com.alipay.android.phone.iifaa.did.api.DIDResult;
import tb.ifj;

/* loaded from: classes2.dex */
public abstract class iqz {
    public abstract DIDResult a(Context context, String str, String str2);

    public DIDResult a(Context context, String str, String str2, String str3) {
        String[] split;
        try {
            split = ((ifj.a) ifj.a().c).a("my_did_appid", ifh.b(str)).split("_");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (split.length > 1) {
            return new DIDResult(DIDResult.a.FAILED_AUTH.ordinal(), "暂不支持使用带 PIN 秘钥");
        }
        char c = 65535;
        int hashCode = str3.hashCode();
        if (hashCode != -822722038) {
            if (hashCode == 1120499232 && str3.equals("vcDecrypt")) {
                c = 1;
            }
        } else if (str3.equals("vcSign")) {
            c = 0;
        }
        if (c == 0) {
            return b(context, split[0], str2);
        }
        if (c == 1) {
            return a(context, split[0], str2);
        }
        return new DIDResult(DIDResult.a.FAILED_EXCP);
    }

    public abstract DIDResult b(Context context, String str, String str2);
}

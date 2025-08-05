package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.framework.data.datamodel.a;

/* loaded from: classes5.dex */
public class sin {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2012774394);
    }

    public static void a(a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad5f4ea4", new Object[]{dVar});
        } else if (dVar == null || !TextUtils.isEmpty(dVar.e())) {
        } else {
            String orangeStringConfig = FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("isFirstFrameUseJpegOnly", "true");
            String str = null;
            String g = dVar.g();
            boolean isEnableImageOriginMode = FluidSDK.getImageAdapter().isEnableImageOriginMode();
            if (g != null) {
                if ("false".equalsIgnoreCase(orangeStringConfig) || isEnableImageOriginMode) {
                    str = dVar.g();
                } else {
                    Uri.Builder buildUpon = Uri.parse(dVar.g()).buildUpon();
                    buildUpon.appendQueryParameter("imgheiftag", "0").appendQueryParameter("imgwebptag", "0");
                    str = buildUpon.toString();
                }
            }
            if (str != null && str.startsWith("/storage")) {
                dVar.b(str);
            } else if (str == null) {
            } else {
                dVar.b(FluidSDK.getImageAdapter().decideUrl(str, dVar.n(), dVar.j()));
            }
        }
    }
}

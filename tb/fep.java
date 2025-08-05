package tb;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.editionswitcher.b;
import com.taobao.android.weex_framework.util.a;
import java.util.HashMap;
import java.util.Map;
import tb.bax;

/* loaded from: classes5.dex */
public final class fep implements fel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-970855017);
        kge.a(-178837752);
    }

    public fep() {
        emu.a("com.taobao.android.detail.wrapper.ext.request.mainParams.impl.DeviceParamsAppender");
    }

    @Override // tb.fel
    public Map<String, String> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4d84e95", new Object[]{this, context});
        }
        HashMap hashMap = new HashMap();
        a(context, hashMap);
        a(hashMap);
        b(context, hashMap);
        if (jqm.a()) {
            hashMap.put(Constants.SP_KEY_DEBUG_MODE, "true");
        }
        return hashMap;
    }

    private void a(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{this, context, map});
            return;
        }
        map.putAll(ecq.a());
        try {
            PositionInfo b = b.b(context);
            if (b == null) {
                return;
            }
            map.put("countryCode", b.countryCode);
        } catch (Throwable unused) {
            i.a("DeviceParamsAppender", "get CountryInfo failed.");
        }
    }

    private void a(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        bax.a a2 = bax.a();
        if (a2.f25741a == 3) {
            str = "high";
        } else {
            str = a2.f25741a == 2 ? "medium" : "low";
        }
        map.put("deviceLevel", str);
    }

    private void b(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2893eda6", new Object[]{this, context, map});
            return;
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
            map.put(d.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, String.valueOf(displayMetrics.widthPixels));
            map.put("screenHeight", String.valueOf(displayMetrics.heightPixels));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

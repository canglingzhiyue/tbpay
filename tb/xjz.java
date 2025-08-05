package tb;

import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexAdvanced;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.index.SoInfo2;
import com.taobao.android.remoteso.index.e;
import com.taobao.android.remoteso.index.g;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.Map;

/* loaded from: classes6.dex */
public class xjz implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ijd f34344a;

    public xjz(ijd ijdVar) {
        this.f34344a = ijdVar;
    }

    @Override // com.taobao.android.remoteso.index.g
    public void a(SoIndexData soIndexData, SoIndexAdvanced soIndexAdvanced) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48cc4ef0", new Object[]{this, soIndexData, soIndexAdvanced});
        } else if (this.f34344a.a("key_localization_disabled", false)) {
            RSoLog.c("LocalizationIndexDataHook, remote config disabled , skip Localization");
        } else if (b.f()) {
            RSoLog.c("LocalizationIndexDataHook, cn site , skip Localization");
        } else {
            String b = this.f34344a.b("key_localization_black_libs", "artc_engine,themis_gfx,fcanvas_v8_jsi");
            if (ikw.a((CharSequence) b)) {
                RSoLog.c("LocalizationIndexDataHook, blackLibs is empty, skip Localization");
                return;
            }
            for (Map.Entry<String, SoInfo2> entry : soIndexAdvanced.getInfoMap().entrySet()) {
                String a2 = e.a(entry.getKey());
                if (ikw.a((CharSequence) a2)) {
                    RSoLog.b("LocalizationIndexDataHook, libName is empty, wtf !!!, skip Localization, " + entry.getKey());
                } else if (b.contains(a2)) {
                    entry.getValue().ext.allowPreFetch = false;
                    RSoLog.c("LocalizationIndexDataHook, disable prefetch for " + a2);
                }
            }
        }
    }
}

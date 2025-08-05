package com.alibaba.ariver.app.api.ui.darkmode;

import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public interface ColorSchemeDecider {
    public static final String TAG = "AriverApp:ColorSchemeDecider";

    ColorSchemeType getCurrentColorScheme();

    /* loaded from: classes2.dex */
    public static class DefaultDecider implements ColorSchemeDecider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private JSONArray f2892a;

        static {
            kge.a(-1827220342);
            kge.a(260062947);
        }

        public DefaultDecider(JSONArray jSONArray) {
            this.f2892a = jSONArray;
            RVLogger.d(ColorSchemeDecider.TAG, "initialize ColorDecider by supportColorScheme: " + jSONArray);
        }

        @Override // com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeDecider
        public ColorSchemeType getCurrentColorScheme() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ColorSchemeType) ipChange.ipc$dispatch("f0159d78", new Object[]{this});
            }
            JSONArray jSONArray = this.f2892a;
            if (jSONArray == null || jSONArray.size() == 0) {
                return ColorSchemeType.DEFAULT;
            }
            if (ThemeUtils.isDarkMode(((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext()) && this.f2892a.contains("dark")) {
                return ColorSchemeType.DARK;
            }
            if (this.f2892a.contains("light")) {
                return ColorSchemeType.LIGHT;
            }
            return ColorSchemeType.DEFAULT;
        }
    }
}

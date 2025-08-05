package com.taobao.themis.kernel.page;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.Window;
import tb.kge;

/* loaded from: classes9.dex */
public interface ITMSPageFactory {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1195006896);
        }

        public static /* synthetic */ ITMSPage a(ITMSPageFactory iTMSPageFactory, String str, Window window, JSONObject jSONObject, String str2, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ITMSPage) ipChange.ipc$dispatch("ea1455f2", new Object[]{iTMSPageFactory, str, window, jSONObject, str2, new Integer(i), obj});
            }
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createPageByUrl");
            }
            if ((i & 8) != 0) {
                str2 = "web";
            }
            return iTMSPageFactory.a(str, window, jSONObject, str2);
        }
    }

    ITMSPage a(String str, Window window, JSONObject jSONObject, String str2);

    ITMSPage a(String str, Window window, String str2, JSONObject jSONObject);
}

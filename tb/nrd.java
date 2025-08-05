package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.search.mmd.util.g;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.domain.MethodEnum;

/* loaded from: classes7.dex */
public final class nrd extends nqa {
    public static final String APP_ID = "24707";
    public static final String CHI_TU_ALIAS = "SEARCHDOOR_BG_WORDS_ALIAS";
    public static final a Companion;

    static {
        kge.a(-745601091);
        Companion = new a(null);
    }

    public nrd(Map<String, String> map) {
        super(Companion.a(map), CHI_TU_ALIAS, MethodEnum.POST);
        if (map != null && (!map.isEmpty())) {
            noo.a(map);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key)) {
                    b(key, value);
                }
            }
        }
        String d = g.d();
        q.a((Object) d, "SearchCountryUtil.getEditionCode()");
        if (!TextUtils.isEmpty(d)) {
            b(noa.KEY_EDITION_CODE, d);
        }
        TBLocationDTO a2 = nnq.a();
        if (a2 != null) {
            b("longitude", a2.longitude);
            b("latitude", a2.latitude);
            b(noa.KEY_CITY_CODE, a2.cityCode);
        }
        b("sversion", noa.SERVER_VERSION_VALUE);
        b("area", "shouye_query_rec_hintq_rolling");
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1743115579);
        }

        @JvmStatic
        public final String a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1a4c023", new Object[]{this, map}) : nrd.APP_ID;
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}

package com.alibaba.ability.localization.constants;

import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import tb.kge;

/* loaded from: classes2.dex */
public enum Location {
    CN("CN"),
    HK("HK"),
    MO("MO"),
    TW("TW"),
    SG("SG"),
    MY("MY"),
    CA("CA"),
    AU("AU"),
    NZ("NZ"),
    JP("JP"),
    KR("KR"),
    VN("VN"),
    TH("TH"),
    PH("PH"),
    KH("KH"),
    KZ("KZ"),
    UZ("UZ"),
    KG("KG"),
    MN("MN"),
    GE("GE"),
    GLOBAL("GLOBAL");
    
    public static final a Companion = new a(null);
    private static final String TAG = "Location";
    private final String code;

    Location(String str) {
        this.code = str;
    }

    @JvmStatic
    public static final Location cast2Enum(String str) {
        return Companion.a(str);
    }

    public final String getCode() {
        return this.code;
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1318277037);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final Location a(String str) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                return (Location) ipChange.ipc$dispatch("9ddc2e5e", new Object[]{this, str});
            }
            if (str == null) {
                return null;
            }
            if (str.length() <= 0) {
                z = false;
            }
            if (!z) {
                str = null;
            }
            if (str == null) {
                return null;
            }
            try {
                return Location.valueOf(str);
            } catch (Exception e) {
                TLog.loge(b.LOG_MODULE, "Location", String.valueOf(e.getMessage()));
                return null;
            }
        }
    }
}

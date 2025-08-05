package android.taobao.windvane.monitor;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import tb.kge;
import tb.mto;

/* loaded from: classes2.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String v = "0";
    public b stat = new b();
    public boolean isErrorBlacklist = true;
    public List<a> errorRule = new ArrayList();
    public double perfCheckSampleRate = mto.a.GEO_NOT_SUPPORT;
    public String perfCheckURL = "";

    /* loaded from: classes2.dex */
    public class a {
        public String url = "";
        public Pattern urlPattern = null;
        public String msg = "";
        public Pattern msgPattern = null;
        public String code = "";

        static {
            kge.a(796298756);
        }

        public a() {
        }
    }

    /* loaded from: classes2.dex */
    public class b {
        public int resSample;
        public long onLoad = 0;
        public long onDomLoad = 0;
        public long resTime = 0;
        public boolean netstat = false;

        static {
            kge.a(-468404592);
        }

        public b() {
        }
    }

    static {
        kge.a(-1798723164);
    }

    public a newErrorRuleInstance(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b00647c1", new Object[]{this, str, str2, str3});
        }
        a aVar = new a();
        aVar.url = str;
        aVar.msg = str2;
        aVar.code = str3;
        return aVar;
    }
}

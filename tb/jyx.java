package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.track.XSWeexRenderTrackEvent;
import com.ut.mini.l;
import java.util.HashSet;
import java.util.Set;
import tb.mto;

/* loaded from: classes6.dex */
public class jyx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DIMENSION_BUSINESS_NAME = "businessName";
    public static final String DIMENSION_ERROR_MSG = "errorMsg";
    public static final String DIMENSION_ITEM_TYPE = "tItemType";
    public static final String DIMENSION_JSVERSION = "jsversion";
    public static final String DIMENSION_PAGENAME = "pageName";
    public static final String DIMENSION_QKING3 = "qking_version";
    public static final String DIMENSION_SVERSION = "sversion";
    public static final String DIMENSION_URL = "url";
    public static final double FAIL = 1.0d;
    public static final String MODULE_NAME = "XSearch";
    public static final double SUCCESS = 0.0d;
    public static final Set<String> WEEX_ERR_CODE_WHITE_LIST;

    /* renamed from: a  reason: collision with root package name */
    private String f29867a;
    private imn b;
    private a c = new a();
    private d d = new d();
    private e e = new e();
    private c f = new c();
    private b g = new b();

    /* loaded from: classes6.dex */
    public class c {
        public static final String MEASURE_TOTAL_TIME = "totalTime";
        public static final String POINT_NAME = "downloadTime";

        static {
            kge.a(843555792);
        }

        public c() {
        }
    }

    static {
        kge.a(389024905);
        HashSet hashSet = new HashSet();
        WEEX_ERR_CODE_WHITE_LIST = hashSet;
        hashSet.add("-2013");
        WEEX_ERR_CODE_WHITE_LIST.add("-2116");
        WEEX_ERR_CODE_WHITE_LIST.add("-9400");
        WEEX_ERR_CODE_WHITE_LIST.add("-9401");
        WEEX_ERR_CODE_WHITE_LIST.add("-9600");
        WEEX_ERR_CODE_WHITE_LIST.add("-9700");
        WEEX_ERR_CODE_WHITE_LIST.add("-9611");
        WEEX_ERR_CODE_WHITE_LIST.add("-9616");
        WEEX_ERR_CODE_WHITE_LIST.add("-9619");
        WEEX_ERR_CODE_WHITE_LIST.add("-9620");
        WEEX_ERR_CODE_WHITE_LIST.add("-9801");
        WEEX_ERR_CODE_WHITE_LIST.add("-1007");
        WEEX_ERR_CODE_WHITE_LIST.add("-1006");
        WEEX_ERR_CODE_WHITE_LIST.add("-1000");
    }

    public jyx(String str, imn imnVar) {
        this.f29867a = str;
        this.b = imnVar;
    }

    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6800e598", new Object[]{this}) : this.c;
    }

    public b b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("49deaf56", new Object[]{this}) : this.g;
    }

    public d c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("2bbc7933", new Object[]{this}) : this.d;
    }

    public e d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("d9a42f1", new Object[]{this}) : this.e;
    }

    public DimensionSet f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionSet) ipChange.ipc$dispatch("a9d8fc51", new Object[]{this});
        }
        DimensionSet create = DimensionSet.create();
        create.addDimension(DIMENSION_BUSINESS_NAME);
        create.addDimension("tItemType");
        create.addDimension("sversion");
        create.addDimension(DIMENSION_JSVERSION);
        create.addDimension("pageName");
        create.addDimension("url");
        return create;
    }

    public DimensionSet g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionSet) ipChange.ipc$dispatch("ed641a12", new Object[]{this});
        }
        DimensionSet f = f();
        f.addDimension("errorMsg");
        return f;
    }

    public MeasureSet a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeasureSet) ipChange.ipc$dispatch("6413138e", new Object[]{this, str});
        }
        MeasureSet create = MeasureSet.create();
        create.addMeasure(str);
        create.addMeasure("__type__" + str);
        return create;
    }

    public MeasureValueSet a(String str, double d2, double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeasureValueSet) ipChange.ipc$dispatch("ec617795", new Object[]{this, str, new Double(d2), new Double(d3)});
        }
        MeasureValueSet create = MeasureValueSet.create();
        create.setValue(str, d2);
        create.setValue("__type__" + str, d3);
        return create;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.f29867a;
    }

    public DimensionValueSet a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionValueSet) ipChange.ipc$dispatch("d0632e65", new Object[]{this, str, str2, str3, str4, str5});
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue(DIMENSION_BUSINESS_NAME, str);
        create.setValue("tItemType", str2);
        create.setValue("sversion", this.b.a().e());
        create.setValue(DIMENSION_JSVERSION, str3);
        create.setValue("pageName", str4);
        create.setValue("url", str5);
        return create;
    }

    public DimensionValueSet a(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionValueSet) ipChange.ipc$dispatch("baef66db", new Object[]{this, str, str2, str3, str4, str5, str6});
        }
        DimensionValueSet a2 = a(str, str2, str3, str4, str6);
        a2.setValue("errorMsg", str5);
        return a2;
    }

    /* loaded from: classes6.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String MEASURE_CODE = "code";
        public static final String POINT_NAME = "degradation";

        static {
            kge.a(1066260043);
        }

        public b() {
        }

        public void a(String str, String str2, String str3, String str4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
                return;
            }
            AppMonitor.register(jyx.MODULE_NAME, POINT_NAME, jyx.this.a("code"), jyx.this.f(), true);
            jyx jyxVar = jyx.this;
            AppMonitor.Stat.commit(jyx.MODULE_NAME, POINT_NAME, jyxVar.a(jyxVar.h(), str, str2, str3, str4), jyx.this.a("code", mto.a.GEO_NOT_SUPPORT, mto.a.GEO_NOT_SUPPORT));
        }

        public void b(String str, String str2, String str3, String str4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb13311", new Object[]{this, str, str2, str3, str4});
                return;
            }
            AppMonitor.register(jyx.MODULE_NAME, POINT_NAME, jyx.this.a("code"), jyx.this.f(), true);
            jyx jyxVar = jyx.this;
            AppMonitor.Stat.commit(jyx.MODULE_NAME, POINT_NAME, jyxVar.a(jyxVar.h(), str, str2, str3, str4), jyx.this.a("code", 1.0d, mto.a.GEO_NOT_SUPPORT));
        }
    }

    /* loaded from: classes6.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final double DATA_WRONG_FORMAT = 2.0d;
        public static final String ERROR_POINT_NAME = "availableError";
        public static final double JS_DOWNLOAD_FAIL = 5.0d;
        public static final double JS_ERROR = 3.0d;
        public static final String MEASURE_CODE = "code";
        public static final String POINT_NAME = "available";
        public static final double SERVER_TEMPLATE_MISS = 4.0d;

        static {
            kge.a(-402896818);
        }

        public a() {
        }

        public void a(String str, String str2, String str3, double d, String str4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e450482", new Object[]{this, str, str2, str3, new Double(d), str4});
                return;
            }
            AppMonitor.register(jyx.MODULE_NAME, POINT_NAME, jyx.this.a("code"), jyx.this.f(), true);
            jyx jyxVar = jyx.this;
            AppMonitor.Stat.commit(jyx.MODULE_NAME, POINT_NAME, jyxVar.a(jyxVar.h(), str, str2, str3, str4), jyx.this.a("code", d, mto.a.GEO_NOT_SUPPORT));
        }

        public void a(String str, String str2, String str3, double d, String str4, String str5, String str6) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1aafa096", new Object[]{this, str, str2, str3, new Double(d), str4, str5, str6});
            } else {
                a(str, str2, str3, d, str5, str6);
            }
        }

        public void a(String str, String str2, String str3, double d, String str4, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a5c3e92", new Object[]{this, str, str2, str3, new Double(d), str4, new Boolean(z)});
            } else {
                a(str, str2, str3, d, str4, "");
            }
        }

        public void a(String str, String str2, String str3, double d, String str4, String str5) {
            String str6 = str4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3d6d1cc", new Object[]{this, str, str2, str3, new Double(d), str6, str5});
                return;
            }
            AppMonitor.register(jyx.MODULE_NAME, POINT_NAME, jyx.this.a("code"), jyx.this.f(), true);
            jyx jyxVar = jyx.this;
            AppMonitor.Stat.commit(jyx.MODULE_NAME, POINT_NAME, jyxVar.a(jyxVar.h(), str, str2, str3, str5), jyx.this.a("code", d, mto.a.GEO_NOT_SUPPORT));
            if (!StringUtils.isEmpty(str4)) {
                int indexOf = str6.indexOf("exception function:");
                if (indexOf > 0) {
                    str6 = str6.substring(indexOf + 19);
                }
                int indexOf2 = str6.indexOf(", extInitTime:");
                if (indexOf2 > 0) {
                    str6 = str6.substring(0, indexOf2);
                }
                str6 = str6.replace("\n", "__n__");
                if (str6.length() > 1024) {
                    str6 = str6.substring(0, 1024);
                }
            }
            AppMonitor.register(jyx.MODULE_NAME, ERROR_POINT_NAME, jyx.this.a("code"), jyx.this.g(), true);
            jyx jyxVar2 = jyx.this;
            AppMonitor.Stat.commit(jyx.MODULE_NAME, ERROR_POINT_NAME, jyxVar2.a(jyxVar2.h(), str, str2, str3, str6, str5), jyx.this.a("code", d, mto.a.GEO_NOT_SUPPORT));
        }
    }

    /* loaded from: classes6.dex */
    public class d {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String MEASURE_TOTAL_TIME = "totalTime";
        public static final String POINT_NAME = "loadPerformance";

        static {
            kge.a(-1719153361);
        }

        public d() {
        }

        public void a(String str, String str2, String str3, double d, boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f52a538", new Object[]{this, str, str2, str3, new Double(d), new Boolean(z), new Boolean(z2)});
                return;
            }
            DimensionSet f = jyx.this.f();
            f.addDimension(jyx.DIMENSION_QKING3);
            AppMonitor.register(jyx.MODULE_NAME, POINT_NAME, jyx.this.a("totalTime"), f);
            jyx jyxVar = jyx.this;
            DimensionValueSet a2 = jyxVar.a(jyxVar.h(), str, str2, str3, "");
            a2.setValue(jyx.DIMENSION_QKING3, z2 ? "2.0" : "3.0");
            AppMonitor.Stat.commit(jyx.MODULE_NAME, POINT_NAME, a2, jyx.this.a("totalTime", d, 1.0d));
        }
    }

    /* loaded from: classes6.dex */
    public class e {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String MEASURE_TOTAL_TIME = "totalTime";
        public static final String POINT_NAME = "refreshPerformance";

        static {
            kge.a(1286932080);
        }

        public e() {
        }

        public void a(String str, String str2, String str3, double d, boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f52a538", new Object[]{this, str, str2, str3, new Double(d), new Boolean(z), new Boolean(z2)});
                return;
            }
            DimensionSet f = jyx.this.f();
            f.addDimension(jyx.DIMENSION_QKING3);
            AppMonitor.register(jyx.MODULE_NAME, POINT_NAME, jyx.this.a("totalTime"), f);
            jyx jyxVar = jyx.this;
            DimensionValueSet a2 = jyxVar.a(jyxVar.h(), str, str2, str3, "");
            a2.setValue(jyx.DIMENSION_QKING3, z2 ? "2.0" : "3.0");
            AppMonitor.Stat.commit(jyx.MODULE_NAME, POINT_NAME, a2, jyx.this.a("totalTime", d, 1.0d));
        }
    }

    public void onEventMainThread(XSWeexRenderTrackEvent xSWeexRenderTrackEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858fab49", new Object[]{this, xSWeexRenderTrackEvent});
            return;
        }
        String currentPageName = l.getInstance().getCurrentPageName();
        int i = xSWeexRenderTrackEvent.f15006a;
        if (i == 0) {
            if (xSWeexRenderTrackEvent.g < 8000.0d) {
                c().a(xSWeexRenderTrackEvent.d.templateName, xSWeexRenderTrackEvent.d.version, currentPageName, xSWeexRenderTrackEvent.g, xSWeexRenderTrackEvent.d.binary, xSWeexRenderTrackEvent.h);
            }
            a().a(xSWeexRenderTrackEvent.d.templateName, xSWeexRenderTrackEvent.d.version, currentPageName, mto.a.GEO_NOT_SUPPORT, xSWeexRenderTrackEvent.c);
        } else if (i == 1) {
            if (xSWeexRenderTrackEvent.g < 8000.0d) {
                d().a(xSWeexRenderTrackEvent.d.templateName, xSWeexRenderTrackEvent.d.version, currentPageName, xSWeexRenderTrackEvent.g, xSWeexRenderTrackEvent.d.binary, xSWeexRenderTrackEvent.h);
            }
            a().a(xSWeexRenderTrackEvent.d.templateName, xSWeexRenderTrackEvent.d.version, currentPageName, mto.a.GEO_NOT_SUPPORT, xSWeexRenderTrackEvent.c);
        } else if (i == 2) {
            a().a(xSWeexRenderTrackEvent.d.templateName, xSWeexRenderTrackEvent.d.version, currentPageName, 1.0d, xSWeexRenderTrackEvent.e, xSWeexRenderTrackEvent.f, xSWeexRenderTrackEvent.c);
        } else if (i == 3) {
            a().a(xSWeexRenderTrackEvent.b, (String) null, currentPageName, 4.0d, "template miss", xSWeexRenderTrackEvent.c);
        } else if (i != 4) {
        } else {
            if (xSWeexRenderTrackEvent.f == null) {
                b().a(xSWeexRenderTrackEvent.b, null, currentPageName, xSWeexRenderTrackEvent.c);
            } else {
                b().b(xSWeexRenderTrackEvent.b, null, currentPageName, xSWeexRenderTrackEvent.c);
            }
        }
    }
}

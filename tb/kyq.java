package tb;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.j;
import com.taobao.homepage.messiah.model.TbHRLogModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public class kyq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int d;
    private final kyl b = new kyl();

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f30405a = b();
    private final kyr c = new kyr();

    static {
        kge.a(1166121714);
    }

    public static /* synthetic */ int a(kyq kyqVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f15e661", new Object[]{kyqVar, new Integer(i)})).intValue();
        }
        kyqVar.d = i;
        return i;
    }

    public static /* synthetic */ kyr a(kyq kyqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kyr) ipChange.ipc$dispatch("7b8c56d", new Object[]{kyqVar}) : kyqVar.c;
    }

    public static /* synthetic */ void a(kyq kyqVar, kyp kypVar, kys kysVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb2ed2e", new Object[]{kyqVar, kypVar, kysVar});
        } else {
            kyqVar.a(kypVar, kysVar);
        }
    }

    public static /* synthetic */ int b(kyq kyqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e08bf9a9", new Object[]{kyqVar})).intValue();
        }
        int i = kyqVar.d;
        kyqVar.d = i + 1;
        return i;
    }

    public void a(String str, String str2, String str3, kyp kypVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7c24b4", new Object[]{this, str, str2, str3, kypVar});
        } else if (a(str, str2, str3)) {
            a(str, kypVar);
        } else if ("monitor".equals(str2)) {
            b(kypVar, str2);
        } else if (!"investigate".equals(str2)) {
        } else {
            a(kypVar, str2);
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.d > 3;
    }

    private void a(kyp kypVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb57df20", new Object[]{this, kypVar, str});
            return;
        }
        List<TbHRLogModel> a2 = kypVar.a();
        if (!a(a2)) {
            ldf.d("TbHRLogDataUploader", "uploadInvestigateList 不允许上报日志，当前的logType是：" + str);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(a2);
        kypVar.c(a2);
        kys a3 = a("log");
        this.b.a(a3, arrayList, a(kypVar));
        this.c.a(a3, arrayList, null);
        ldf.d("TbHRLogDataUploader", "当前的日志缓存大于50主动上报一次，上报耗时：" + (System.currentTimeMillis() - currentTimeMillis));
    }

    private void b(kyp kypVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e040a761", new Object[]{this, kypVar, str});
            return;
        }
        List<TbHRLogModel> b = kypVar.b();
        if (!b(b)) {
            ldf.d("TbHRLogDataUploader", "uploadMonitorList 不允许上报日志，当前的logType是：" + str);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(b);
        kypVar.d(b);
        kys a2 = a("monitor");
        this.b.a(a2, arrayList, a(kypVar));
        this.c.a(a2, null, arrayList);
        ldf.d("TbHRLogDataUploader", "当前的监控缓存大于50主动上报一次，上报耗时：" + (System.currentTimeMillis() - currentTimeMillis));
    }

    private void a(String str, kyp kypVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f2f4a0", new Object[]{this, str, kypVar});
            return;
        }
        kys a2 = a("all");
        List<TbHRLogModel> a3 = a(a2, kypVar);
        if (a3.isEmpty()) {
            ldf.d("TbHRLogDataUploader", "uploadInWhiteList 需要上报的数据为空");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        kypVar.c();
        this.b.a(a2, a3, a(kypVar));
        ldf.d("TbHRLogDataUploader", "当前白名单阶段上报，上报耗时：" + (System.currentTimeMillis() - currentTimeMillis) + " 当前的actionType是：" + str);
    }

    private List<TbHRLogModel> a(kys kysVar, kyp kypVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d2f50c6", new Object[]{this, kysVar, kypVar});
        }
        ArrayList arrayList = new ArrayList();
        List<TbHRLogModel> a2 = kypVar.a();
        if (a2 != null) {
            arrayList.addAll(a2);
        }
        List<TbHRLogModel> b = kypVar.b();
        if (b != null) {
            arrayList.addAll(b);
        }
        this.c.a(kysVar, a2, b);
        return arrayList;
    }

    private List<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        String a2 = j.a("stabilityDataUploadTimingWhiteList", "Page_Home_monitor_page_disappear");
        if (!StringUtils.isEmpty(a2)) {
            arrayList.addAll(Arrays.asList(a2.split(",")));
        }
        return arrayList;
    }

    private boolean a(List<TbHRLogModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{this, list})).booleanValue();
        }
        return list != null && list.size() > j.a("logsUploadMaxCount", 50);
    }

    private boolean b(List<TbHRLogModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d39e1ede", new Object[]{this, list})).booleanValue();
        }
        return list != null && list.size() > j.a("monitorsUploadMaxCount", 50);
    }

    private boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{this, str, str2, str3})).booleanValue();
        }
        return this.f30405a.contains(str3 + "_" + str2 + "_" + str);
    }

    private kym a(final kyp kypVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kym) ipChange.ipc$dispatch("72d41211", new Object[]{this, kypVar}) : new kym() { // from class: tb.kyq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.kym
            public void a(kys kysVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f209dbf3", new Object[]{this, kysVar});
                    return;
                }
                ldf.d("TbHRLogDataUploader", "数据上报失败");
                kyq.a(kyq.this, kypVar, kysVar);
                kyq.a(kyq.this).a(kysVar);
                kyq.b(kyq.this);
                ldf.d("TbHRLogDataUploader", "数据上报失败，清空暂存区的数据");
            }

            @Override // tb.kym
            public void b(kys kysVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e08ce274", new Object[]{this, kysVar});
                    return;
                }
                kyq.a(kyq.this).a(kysVar);
                kyq.a(kyq.this, 0);
                ldf.d("TbHRLogDataUploader", "数据上报成功，清空暂存区的数据");
            }
        };
    }

    private void a(kyp kypVar, kys kysVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dba061", new Object[]{this, kypVar, kysVar});
            return;
        }
        String b = kysVar.b();
        String a2 = kysVar.a();
        if ("log".equals(b)) {
            c(kypVar, a2);
        } else if ("monitor".equals(b)) {
            d(kypVar, a2);
        } else if (!"all".equals(b)) {
        } else {
            c(kypVar, a2);
            d(kypVar, a2);
        }
    }

    private void c(kyp kypVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5296fa2", new Object[]{this, kypVar, str});
            return;
        }
        List<TbHRLogModel> a2 = this.c.a(str);
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        kypVar.a(a2);
        ldf.d("TbHRLogDataUploader", "数据上报失败，回存日志数据");
    }

    private void d(kyp kypVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1237e3", new Object[]{this, kypVar, str});
            return;
        }
        List<TbHRLogModel> b = this.c.b(str);
        if (b == null || b.isEmpty()) {
            return;
        }
        kypVar.b(b);
        ldf.d("TbHRLogDataUploader", "数据上报失败，回存监控数据");
    }

    private kys a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kys) ipChange.ipc$dispatch("7c71c5ef", new Object[]{this, str});
        }
        return new kys("TbHRLogDataUploader_" + SystemClock.uptimeMillis(), str);
    }
}

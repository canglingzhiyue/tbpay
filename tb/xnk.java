package tb;

import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.IRocketSubService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.cew;

/* loaded from: classes7.dex */
public class xnk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f34402a;
    private long b;
    private xnj g;
    private final xni h;
    private String i;
    private int c = -1;
    private int d = -1;
    private long e = -1;
    private final List<a> f = new ArrayList();
    private int j = -1;

    static {
        kge.a(2091093656);
    }

    public xnk(ljs ljsVar) {
        this.f34402a = ljsVar;
        this.h = new xni(ljsVar);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i == -1) {
        } else {
            this.j = i;
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            if (this.g == null) {
                this.g = new xnj();
            }
            this.g.a(jSONObject);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ldf.d("ClickAiRefresher", "onInfoFlowInVisible type : ");
        this.b = System.currentTimeMillis() - 1000;
    }

    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.h.a(this.g, this.c, this.f, this.i, this.j, this.b);
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        xnj xnjVar = this.g;
        if (xnjVar == null || !xnjVar.a()) {
            ldf.d("ClickAiRefresher", "功能开关未打开");
            return false;
        } else if (!d(str)) {
            ldf.d("ClickAiRefresher", "isAllowRequest is false， requestType： " + str);
            return false;
        } else if (g()) {
            ldf.d("ClickAiRefresher", "is not first screen");
            return false;
        } else if (bxn.b(this.f34402a)) {
            ldf.d("ClickAiRefresher", "isDataAbandoned is true");
            return false;
        } else if (f()) {
            return true;
        } else {
            ldf.d("ClickAiRefresher", "isAllowFrequencyLimit is false");
            return false;
        }
    }

    private boolean d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue() : com.taobao.infoflow.protocol.model.datamodel.request.a.b(str);
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (this.g == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.e < this.g.c() * 1000 || Math.abs(this.c - this.d) < this.g.d()) {
            return false;
        }
        this.d = this.c;
        this.e = elapsedRealtime;
        return true;
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        IRocketSubService iRocketSubService = (IRocketSubService) this.f34402a.a(IRocketSubService.class);
        return iRocketSubService != null && !iRocketSubService.isOnRocketState();
    }

    public void a(BaseSectionModel<?> baseSectionModel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67d7b53", new Object[]{this, baseSectionModel, new Integer(i)});
            return;
        }
        JSONObject ext = baseSectionModel.getExt();
        if (ext != null) {
            c(ext.getString(a.X_EXPOSED_ID));
        }
        if (i == -1) {
            return;
        }
        b(i);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        xnj xnjVar = this.g;
        return xnjVar != null && xnjVar.e();
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        xnj xnjVar = this.g;
        return xnjVar != null && xnjVar.f();
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.d = -1;
        this.e = -1L;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (str == null) {
        } else {
            this.f.add(new a(str, System.currentTimeMillis()));
            while (this.f.size() > 10) {
                this.f.remove(0);
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int MAX_SIZE = 10;
        public static final String X_EXPOSED_ID = "x_exposed";

        /* renamed from: a  reason: collision with root package name */
        private String f34403a;
        private long b;

        static {
            kge.a(-413480854);
        }

        public a(String str, long j) {
            this.f34403a = str;
            this.b = j;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f34403a;
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : System.currentTimeMillis() - this.b <= cew.a.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT;
        }
    }
}

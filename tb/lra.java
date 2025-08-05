package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IFirstScreenDataService;
import com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService;

/* loaded from: classes7.dex */
public class lra {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final IPullRefreshService b;
    private final IFirstScreenDataService e;
    private final kyu f;
    private IPullRefreshService.a g;
    private String k;

    static {
        kge.a(834875383);
    }

    public static /* synthetic */ String a(lra lraVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a70358e3", new Object[]{lraVar}) : lraVar.k;
    }

    public static /* synthetic */ String a(lra lraVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0b85199", new Object[]{lraVar, str});
        }
        lraVar.k = str;
        return str;
    }

    public static /* synthetic */ void a(lra lraVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7728b203", new Object[]{lraVar, new Float(f)});
        } else {
            lraVar.b(f);
        }
    }

    public static /* synthetic */ void b(lra lraVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59067ba2", new Object[]{lraVar, new Float(f)});
        } else {
            lraVar.a(f);
        }
    }

    public lra(ljs ljsVar, kyu kyuVar) {
        this.f = kyuVar;
        this.b = (IPullRefreshService) ljsVar.a(IPullRefreshService.class);
        this.e = (IFirstScreenDataService) ljsVar.a(IFirstScreenDataService.class);
        b();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            c();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.b == null) {
        } else {
            this.g = i();
            this.b.addPullRefreshListener(this.g);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        IPullRefreshService iPullRefreshService = this.b;
        if (iPullRefreshService == null) {
            return;
        }
        iPullRefreshService.removePullRefreshListener(this.g);
    }

    private IPullRefreshService.a i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPullRefreshService.a) ipChange.ipc$dispatch("9ad913fb", new Object[]{this}) : new IPullRefreshService.a() { // from class: tb.lra.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService.a
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                } else if ("NONE".equals(lra.a(lra.this))) {
                    ldf.d("PullSecondAnimationProcess", "当前不在下拉刷新态了，不要设置alpha了");
                } else {
                    lra.b(lra.this, i);
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService.a
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    return;
                }
                ldf.d("PullSecondAnimationProcess", "当前的状态是：" + str2);
                lra.a(lra.this, str2);
                if ("NONE".equals(str2)) {
                    lra.a(lra.this, 1.0f);
                    ldf.d("PullSecondAnimationProcess", "当前刷新状态为none，直接alpha置为1");
                }
                if (!"REFRESHING".equals(str2)) {
                    return;
                }
                lra.a(lra.this, 0.0f);
                ldf.d("PullSecondAnimationProcess", "当前在刷新状态，直接alpha置为0");
            }
        };
    }

    private void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            b(f < 10.0f ? 1.0f : Math.max(0.0f, (float) ((f * (-0.15d)) + 1.0d)));
        }
    }

    private void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
            return;
        }
        JSONArray k = k();
        if (k == null || k.isEmpty()) {
            ldf.d("PullSecondAnimationProcess", "needPullRefreshHidePopId == null");
            return;
        }
        int size = k.size();
        for (int i = 0; i < size; i++) {
            Object obj = k.get(i);
            if (obj instanceof String) {
                this.f.g().a((String) obj, f);
            }
        }
    }

    private JSONArray k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("6697548c", new Object[]{this});
        }
        IFirstScreenDataService iFirstScreenDataService = this.e;
        if (iFirstScreenDataService == null) {
            ldf.d("PullSecondAnimationProcess", "mFirstScreenDataService == null");
            return null;
        }
        JSONObject firstScreenExt = iFirstScreenDataService.getFirstScreenExt();
        if (firstScreenExt == null) {
            ldf.d("PullSecondAnimationProcess", "ext == null");
            return null;
        }
        return firstScreenExt.getJSONArray("needPullRefreshHidePopId");
    }
}

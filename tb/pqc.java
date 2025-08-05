package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.monitor.a;
import com.taobao.taolive.sdk.monitor.bean.LiveAPMBean;
import com.taobao.taolive.sdk.utils.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public class pqc implements com.taobao.taolive.sdk.monitor.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, LiveAPMBean> f32810a;
    private Handler b = new a(Looper.getMainLooper());
    private pqd c = new pqd();
    private ConcurrentHashMap<String, String> d;
    private WeakReference<Context> e;
    private pqb f;

    static {
        kge.a(453059445);
        kge.a(1673701538);
    }

    public static /* synthetic */ float a(pqc pqcVar, WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d829cd38", new Object[]{pqcVar, weakReference})).floatValue() : pqcVar.a(weakReference);
    }

    public static /* synthetic */ pqb a(pqc pqcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pqb) ipChange.ipc$dispatch("4e3b1a4f", new Object[]{pqcVar}) : pqcVar.f;
    }

    public static /* synthetic */ void a(pqc pqcVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91086560", new Object[]{pqcVar, str});
        } else {
            pqcVar.c(str);
        }
    }

    public static /* synthetic */ void a(pqc pqcVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a42f72a", new Object[]{pqcVar, str, str2});
        } else {
            pqcVar.b(str, str2);
        }
    }

    public static /* synthetic */ WeakReference b(pqc pqcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("6adcfe5", new Object[]{pqcVar}) : pqcVar.e;
    }

    @Override // com.taobao.taolive.sdk.monitor.a
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.e = new WeakReference<>(context);
        }
    }

    @Override // com.taobao.taolive.sdk.monitor.a
    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        this.e = new WeakReference<>(context);
        this.f32810a = new ConcurrentHashMap<>();
        this.d = new ConcurrentHashMap<>();
    }

    @Override // com.taobao.taolive.sdk.monitor.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (this.f32810a != null && this.f32810a.keySet().size() > 0) {
                for (String str : this.f32810a.keySet()) {
                    this.c.a(str, this.f32810a);
                }
            }
            b();
            if (this.b != null) {
                this.b.removeCallbacksAndMessages(null);
            }
            if (this.f32810a == null) {
                return;
            }
            this.f32810a.clear();
        } catch (Exception e) {
            pnj m = pmd.a().m();
            m.b("IMonitorExecutorImpl", "upload data error:" + e.getMessage());
        }
    }

    @Override // com.taobao.taolive.sdk.monitor.a
    public void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
            return;
        }
        String b = b(str);
        if (this.f32810a.containsKey(b)) {
            this.f32810a.remove(b);
            pnj m = pmd.a().m();
            m.b("IMonitorExecutorImpl", "start collect remove generateSessionId: " + b);
        }
        if (this.f32810a.containsKey(b)) {
            return;
        }
        LiveAPMBean a2 = a(str, map);
        a2.sceneDataList.add(a(a2, str2));
        this.f32810a.put(b, a2);
        pnj m2 = pmd.a().m();
        m2.b("IMonitorExecutorImpl", "start collect data generateSessionId: " + b);
        if (!u.aE()) {
            return;
        }
        if (this.f == null) {
            this.f = new pqb();
        }
        this.f.a(this.e, a2);
    }

    private LiveAPMBean a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveAPMBean) ipChange.ipc$dispatch("1af83723", new Object[]{this, str, map});
        }
        LiveAPMBean liveAPMBean = new LiveAPMBean();
        if (liveAPMBean.extParams == null) {
            liveAPMBean.extParams = new HashMap<>();
        }
        if (map != null && map.size() > 0) {
            liveAPMBean.extParams.putAll(map);
        }
        liveAPMBean.endPerformanceData = new LiveAPMBean.PerformanceData();
        if (pqe.f32814a) {
            liveAPMBean.isColdStart = true;
        } else {
            liveAPMBean.isColdStart = false;
        }
        liveAPMBean.startSessionTime = System.currentTimeMillis();
        liveAPMBean.originSessionId = str;
        liveAPMBean.sceneDataList = new ArrayList();
        liveAPMBean.totalPerformanceData = new LiveAPMBean.PerformanceData();
        liveAPMBean.refreshRate = a(this.e);
        return liveAPMBean;
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        String str2 = str + "_" + System.currentTimeMillis();
        this.d.put(str, str2);
        return str2;
    }

    private LiveAPMBean.SceneData a(LiveAPMBean liveAPMBean, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveAPMBean.SceneData) ipChange.ipc$dispatch("def13940", new Object[]{this, liveAPMBean, str});
        }
        LiveAPMBean.SceneData sceneData = new LiveAPMBean.SceneData();
        sceneData.performanceData = new LiveAPMBean.PerformanceData();
        sceneData.performanceData.currentTime = System.currentTimeMillis();
        sceneData.scenePoint = str;
        if (sceneData.performanceData == null) {
            sceneData.performanceData = new LiveAPMBean.PerformanceData();
        }
        if (liveAPMBean.sceneDataList.size() > 0) {
            sceneData.performanceData.costTime = sceneData.performanceData.currentTime - liveAPMBean.sceneDataList.get(0).performanceData.currentTime;
        }
        LiveAPMBean.PerformanceData performanceData = sceneData.performanceData;
        performanceData.freezeFrameNums = liveAPMBean.totalPerformanceData.freezeFrameNums;
        performanceData.hitchTotal = liveAPMBean.totalPerformanceData.hitchTotal / 1000000;
        performanceData.allFrameNums = liveAPMBean.totalPerformanceData.allFrameNums;
        if (sceneData.performanceData.costTime > 0) {
            performanceData.fps = (performanceData.allFrameNums * 1000) / sceneData.performanceData.costTime;
        }
        performanceData.frameNumsNormal_100 = liveAPMBean.totalPerformanceData.frameNumsNormal_100;
        performanceData.frameNums100_300 = liveAPMBean.totalPerformanceData.frameNums100_300;
        performanceData.frameNums300_500 = liveAPMBean.totalPerformanceData.frameNums300_500;
        performanceData.frameNums500_700 = liveAPMBean.totalPerformanceData.frameNums500_700;
        performanceData.stuckFrames = liveAPMBean.totalPerformanceData.stuckFrames;
        performanceData.seriousFrames = liveAPMBean.totalPerformanceData.seriousFrames;
        performanceData.f0_t1 = liveAPMBean.totalPerformanceData.f0_t1;
        performanceData.ft1_t2 = liveAPMBean.totalPerformanceData.ft1_t2;
        performanceData.ft2_x = liveAPMBean.totalPerformanceData.ft2_x;
        if (u.aL() && pmd.a() != null) {
            ppv v = pmd.a().v();
            if (v != null && v.a() != null) {
                performanceData.cpu = String.valueOf(v.a().c);
            }
            if (v != null && v.b() != null) {
                performanceData.memory = String.valueOf(v.b().b);
            }
        }
        if (u.aK()) {
            performanceData.frameNums100_150 = liveAPMBean.totalPerformanceData.frameNums100_150;
            performanceData.frameNums150_300 = liveAPMBean.totalPerformanceData.frameNums150_300;
        }
        return sceneData;
    }

    @Override // com.taobao.taolive.sdk.monitor.a
    public void a(String str, String str2, Map<String, String> map, a.InterfaceC0908a interfaceC0908a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a0e38f8", new Object[]{this, str, str2, map, interfaceC0908a});
            return;
        }
        pqe.f32814a = false;
        if (this.d.containsKey(str)) {
            String str3 = this.d.get(str);
            if (this.f32810a.containsKey(str3)) {
                LiveAPMBean liveAPMBean = this.f32810a.get(str3);
                if (liveAPMBean.isEnd) {
                    pnj m = pmd.a().m();
                    m.b("IMonitorExecutorImpl", "endCollectData has called end: " + str3);
                    return;
                }
                liveAPMBean.isEnd = true;
                liveAPMBean.sceneDataList.add(a(liveAPMBean, str2));
                if (liveAPMBean.extParams == null) {
                    liveAPMBean.extParams = new HashMap<>();
                }
                if (map != null && map.size() > 0) {
                    liveAPMBean.extParams.putAll(map);
                }
                liveAPMBean.monitorListener = interfaceC0908a;
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 1000;
                this.b.sendMessage(obtain);
                pnj m2 = pmd.a().m();
                m2.b("IMonitorExecutorImpl", "endCollectData generateSessionId: " + str3);
                return;
            }
        }
        pmd.a().m().b("IMonitorExecutorImpl", "endCollectData bad case ");
    }

    @Override // com.taobao.taolive.sdk.monitor.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            b(str, str2, null);
        }
    }

    @Override // com.taobao.taolive.sdk.monitor.a
    public void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{this, str, str2, map});
            return;
        }
        pnj m = pmd.a().m();
        m.b("IMonitorExecutorImpl", "addMiddleCollectData sessionId: " + str + " sceneId" + str2);
        if (this.d.containsKey(str)) {
            String str3 = this.d.get(str);
            if (this.f32810a.containsKey(str3)) {
                LiveAPMBean liveAPMBean = this.f32810a.get(str3);
                liveAPMBean.sceneDataList.add(a(liveAPMBean, str2));
                if (liveAPMBean.extParams == null) {
                    liveAPMBean.extParams = new HashMap<>();
                }
                if (map != null && map.size() > 0) {
                    liveAPMBean.extParams.putAll(map);
                }
                pnj m2 = pmd.a().m();
                m2.b("IMonitorExecutorImpl", "addMiddleCollectData generateSessionId: " + str3 + " sceneId" + str2);
                return;
            }
        }
        pmd.a().m().b("IMonitorExecutorImpl", "addMiddleCollectData  bad case ");
    }

    @Override // com.taobao.taolive.sdk.monitor.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        pnj m = pmd.a().m();
        m.b("IMonitorExecutorImpl", "intercept sessionId:" + str);
        if (!this.d.containsKey(str)) {
            return;
        }
        String str2 = this.d.get(str);
        pnj m2 = pmd.a().m();
        m2.b("IMonitorExecutorImpl", "intercept generateSessionId:" + str2);
        if (!this.f32810a.containsKey(str2)) {
            return;
        }
        b(str, str2);
        b();
        pnj m3 = pmd.a().m();
        m3.b("IMonitorExecutorImpl", "intercept uploadData generateSessionId:" + str2);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Handler handler = this.b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            pmd.a().m().b("IMonitorExecutorImpl", "intercept  removeMessage");
        }
        pqb pqbVar = this.f;
        if (pqbVar != null) {
            pqbVar.a((LiveAPMBean) null);
        }
        ConcurrentHashMap<String, LiveAPMBean> concurrentHashMap = this.f32810a;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        ConcurrentHashMap<String, String> concurrentHashMap2 = this.d;
        if (concurrentHashMap2 != null) {
            concurrentHashMap2.clear();
        }
        pmd.a().m().b("IMonitorExecutorImpl", "reset all data");
    }

    /* loaded from: classes8.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1639117447);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            if (message == null) {
                return;
            }
            int i = message.what;
            if (i == 1000) {
                Message obtain = Message.obtain();
                obtain.obj = message.obj;
                obtain.what = 1001;
                sendMessage(obtain);
            } else if (i != 1001) {
            } else {
                Object obj = message.obj;
                if (!(obj instanceof String)) {
                    return;
                }
                try {
                    pqc.a(pqc.this, (String) obj);
                } catch (Exception e) {
                    pnj m = pmd.a().m();
                    m.a("IMonitorExecutorImpl", "recordEndInteractive error : " + e.getMessage());
                }
            }
        }
    }

    private void c(String str) {
        pqb pqbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (!this.d.containsKey(str)) {
        } else {
            String str2 = this.d.get(str);
            if (!this.f32810a.containsKey(str2)) {
                return;
            }
            LiveAPMBean liveAPMBean = this.f32810a.get(str2);
            liveAPMBean.sceneDataList.add(a(liveAPMBean, pqe.STAGE_INTERACTIVE));
            if (this.c == null) {
                return;
            }
            if (u.aE()) {
                if (!u.aI() && (pqbVar = this.f) != null) {
                    pqbVar.a(liveAPMBean);
                    liveAPMBean.endPerformanceData = new LiveAPMBean.PerformanceData();
                    this.f.a(this.e, liveAPMBean);
                }
                if (liveAPMBean.endPerformanceData == null) {
                    liveAPMBean.endPerformanceData = new LiveAPMBean.PerformanceData();
                }
                liveAPMBean.endPerformanceData.allFrameNums = 0L;
                liveAPMBean.isWholeSession = true;
                if (u.aF() && TextUtils.equals("LIVE_CODE_BOOT_STAGE", str)) {
                    a(liveAPMBean, false, str, str2);
                    a(str, str2, liveAPMBean);
                    return;
                }
                a(liveAPMBean, true, str, str2);
                return;
            }
            b(str, str2);
        }
    }

    private void a(final String str, final String str2, final LiveAPMBean liveAPMBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dfa9be4", new Object[]{this, str, str2, liveAPMBean});
        } else {
            this.b.postDelayed(new Runnable() { // from class: tb.pqc.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    pqc.a(pqc.this).a(liveAPMBean);
                    liveAPMBean.dataDelay5s = new LiveAPMBean.PerformanceData();
                    liveAPMBean.dataDelay5s.currentTime = System.currentTimeMillis();
                    liveAPMBean.dataDelay5s.allFrameNums = liveAPMBean.endPerformanceData.allFrameNums;
                    long j = liveAPMBean.dataDelay5s.currentTime - liveAPMBean.endPerformanceData.startTime;
                    if (j <= 0 || j > sad.DEFAULT_TCP_CONNECT_TIMEOUT_MS) {
                        pnj m = pmd.a().m();
                        m.a("IMonitorExecutorImpl", "bad costTime : " + j);
                        j = 5000;
                    }
                    liveAPMBean.dataDelay5s.costTime = j;
                    liveAPMBean.dataDelay5s.fps = ((float) liveAPMBean.endPerformanceData.allFrameNums) / (((float) j) / 1000.0f);
                    liveAPMBean.dataDelay5s.hitchTotal = liveAPMBean.endPerformanceData.hitchTotal / 5000000;
                    pnj m2 = pmd.a().m();
                    m2.a("IMonitorExecutorImpl", "5s fps : " + liveAPMBean.dataDelay5s.fps + " costTime:" + j);
                    pqc.a(pqc.this, str, str2);
                }
            }, 5000L);
        }
    }

    private void a(final LiveAPMBean liveAPMBean, final boolean z, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3ca1670", new Object[]{this, liveAPMBean, new Boolean(z), str, str2});
        } else {
            this.b.postDelayed(new Runnable() { // from class: tb.pqc.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (z) {
                        pqc.a(pqc.this).a(liveAPMBean);
                    }
                    liveAPMBean.dataDelay1s = new LiveAPMBean.PerformanceData();
                    liveAPMBean.dataDelay1s.currentTime = System.currentTimeMillis();
                    long j = liveAPMBean.dataDelay1s.currentTime - liveAPMBean.endPerformanceData.startTime;
                    if (j <= 0 || j > 2000) {
                        pnj m = pmd.a().m();
                        m.a("IMonitorExecutorImpl", "bad costTime : " + j);
                        j = 1000;
                    }
                    liveAPMBean.dataDelay1s.costTime = j;
                    liveAPMBean.dataDelay1s.fps = ((float) liveAPMBean.endPerformanceData.allFrameNums) / (((float) j) / 1000.0f);
                    liveAPMBean.dataDelay1s.hitchTotal = liveAPMBean.endPerformanceData.hitchTotal / 1000000;
                    liveAPMBean.dataDelay1s.allFrameNums = liveAPMBean.endPerformanceData.allFrameNums;
                    pnj m2 = pmd.a().m();
                    StringBuilder sb = new StringBuilder();
                    sb.append("1s fps : ");
                    sb.append(liveAPMBean.dataDelay1s.fps);
                    sb.append(" costTime:");
                    sb.append(j);
                    sb.append(" refreshRate:");
                    pqc pqcVar = pqc.this;
                    sb.append(pqc.a(pqcVar, pqc.b(pqcVar)));
                    m2.a("IMonitorExecutorImpl", sb.toString());
                    if (!z) {
                        return;
                    }
                    pqc.a(pqc.this, str, str2);
                }
            }, 1000L);
        }
    }

    private void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        pnj m = pmd.a().m();
        m.a("IMonitorExecutorImpl", "uploadData  generateSessionId: " + str2);
        this.c.a(str2, this.f32810a);
        if (this.f32810a.keySet().contains(str2)) {
            this.f32810a.remove(str2);
        }
        if (!this.d.keySet().contains(str)) {
            return;
        }
        this.d.remove(str);
    }

    private float a(WeakReference weakReference) {
        WindowManager windowManager;
        Display defaultDisplay;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8bb9cf26", new Object[]{this, weakReference})).floatValue();
        }
        if (weakReference != null && weakReference.get() != null && (weakReference.get() instanceof Activity) && (windowManager = ((Activity) weakReference.get()).getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            return defaultDisplay.getRefreshRate();
        }
        return 60.0f;
    }
}

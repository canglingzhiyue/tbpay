package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.quickcomment.bean.QuickCommData;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.quickcomment.bean.QuickCommReport;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.utils.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class hfp implements hfr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static final String f28598a;
    private QuickCommData b;
    private QuickCommReport c;
    private final hfq g;
    private boolean d = false;
    private final Runnable e = new Runnable() { // from class: tb.-$$Lambda$hfp$KPMDoTpap9eyWvgRRqRY5636VNM
        @Override // java.lang.Runnable
        public final void run() {
            hfp.lambda$KPMDoTpap9eyWvgRRqRY5636VNM(hfp.this);
        }
    };
    private final Runnable f = new Runnable() { // from class: tb.-$$Lambda$hfp$K2ccI2HgJg49VkLPp12ExY0PV_M
        @Override // java.lang.Runnable
        public final void run() {
            hfp.lambda$K2ccI2HgJg49VkLPp12ExY0PV_M(hfp.this);
        }
    };
    private final Handler h = new Handler(Looper.getMainLooper());

    public static /* synthetic */ void lambda$K2ccI2HgJg49VkLPp12ExY0PV_M(hfp hfpVar) {
        hfpVar.h();
    }

    public static /* synthetic */ void lambda$KPMDoTpap9eyWvgRRqRY5636VNM(hfp hfpVar) {
        hfpVar.g();
    }

    static {
        kge.a(768812130);
        kge.a(-1010612295);
        f28598a = hfp.class.getSimpleName();
    }

    public hfp(hfq hfqVar) {
        this.g = hfqVar;
    }

    @Override // tb.hfr
    public void a(long j, String str) {
        QuickCommData a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8a2226", new Object[]{this, new Long(j), str});
            return;
        }
        String str2 = f28598a;
        q.c(str2, "[updateQuickCommentTask] msg:" + str);
        if (!hfo.a() || (a2 = a(str)) == null || TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - j) < a(a2)) {
            return;
        }
        i();
        this.b = a2;
        this.c = c(a2);
        this.h.post(this.e);
        this.h.postDelayed(this.f, TimeUnit.SECONDS.toMillis(b(a2)));
    }

    @Override // tb.hfr
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        i();
        this.h.post(this.f);
    }

    @Override // tb.hfr
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.d;
    }

    @Override // tb.hfr
    public List<String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this});
        }
        QuickCommData quickCommData = this.b;
        if (quickCommData != null && quickCommData.quickCommentList != null && !this.b.quickCommentList.isEmpty() && this.b.quickCommentList.get(0) != null) {
            return this.b.quickCommentList.get(0).commentList;
        }
        return null;
    }

    @Override // tb.hfr
    public QuickCommReport d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (QuickCommReport) ipChange.ipc$dispatch("68abd939", new Object[]{this}) : this.c;
    }

    private QuickCommData a(String str) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QuickCommData) ipChange.ipc$dispatch("566287dc", new Object[]{this, str});
        }
        QuickCommData quickCommData = (QuickCommData) pqj.a(String.valueOf(str), QuickCommData.class);
        QuickCommData quickCommData2 = new QuickCommData();
        if (quickCommData == null) {
            return quickCommData2;
        }
        try {
            quickCommData2.liveId = quickCommData.liveId;
            quickCommData2.config = quickCommData.config;
            quickCommData2.itemId = quickCommData.itemId;
            if (quickCommData.quickCommentList != null && !quickCommData.quickCommentList.isEmpty()) {
                int random = (int) (Math.random() * quickCommData.quickCommentList.size());
                quickCommData2.quickCommentList = new ArrayList();
                quickCommData2.quickCommentList.add(quickCommData.quickCommentList.get(random));
            }
            if (quickCommData2.quickCommentList != null && !quickCommData2.quickCommentList.isEmpty() && (list = quickCommData2.quickCommentList.get(0).commentList) != null) {
                while (list.size() > 2) {
                    list.remove((int) (Math.random() * list.size()));
                }
            }
        } catch (Exception e) {
            String str2 = f28598a;
            q.b(str2, "[genQuickCommData] error: " + e);
        }
        String str3 = f28598a;
        q.c(str3, "[genQuickCommData] genData:" + pqj.a(quickCommData2));
        return quickCommData2;
    }

    private String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        QuickCommData quickCommData = this.b;
        return (quickCommData == null || quickCommData.quickCommentList == null || this.b.quickCommentList.isEmpty() || v.f(this.b.quickCommentList.get(0).guideText)) ? "" : this.b.quickCommentList.get(0).guideText;
    }

    private int a(QuickCommData quickCommData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2a7e6993", new Object[]{this, quickCommData})).intValue();
        }
        if (quickCommData != null && quickCommData.config != null) {
            return quickCommData.config.waitSecond;
        }
        return 0;
    }

    private int b(QuickCommData quickCommData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8389b514", new Object[]{this, quickCommData})).intValue();
        }
        if (quickCommData != null && quickCommData.config != null) {
            return quickCommData.config.showSecond;
        }
        return 0;
    }

    private QuickCommReport c(QuickCommData quickCommData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QuickCommReport) ipChange.ipc$dispatch("76229662", new Object[]{this, quickCommData});
        }
        QuickCommReport quickCommReport = new QuickCommReport();
        if (quickCommData != null && quickCommData.quickCommentList != null && !quickCommData.quickCommentList.isEmpty()) {
            quickCommReport.itemId = String.valueOf(quickCommData.itemId);
            quickCommReport.guideText = quickCommData.quickCommentList.get(0).guideText;
        }
        return quickCommReport;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.d = true;
        if (this.g == null) {
            return;
        }
        String f = f();
        this.g.showQuickCommentGuide(f);
        if (v.f(f) || this.c == null) {
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("content_guide", f);
        hashMap.put("item_id", this.c.itemId);
        phg.a().a(hfr.QUICK_COMMENT_GUIDE, hashMap);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.d = false;
        hfq hfqVar = this.g;
        if (hfqVar == null) {
            return;
        }
        hfqVar.hideQuickCommentGuide();
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.h.removeCallbacks(this.e);
        this.h.removeCallbacks(this.f);
    }

    @Override // tb.hfr
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            i();
        }
    }
}

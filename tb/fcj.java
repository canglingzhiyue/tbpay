package tb;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.android.split.core.splitinstall.m;
import com.alibaba.android.split.core.splitinstall.o;
import com.alibaba.android.split.core.tasks.d;
import com.alibaba.android.split.core.tasks.e;
import com.alibaba.android.split.k;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.open.DetailBusinessDetector;
import com.taobao.android.detail.core.open.g;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.TradeNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.appbundle.c;
import com.taobao.tao.detail.biz.adapter.DetailSwitcherAdapter;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class fcj implements DetailBusinessDetector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f27798a;
    private long b;
    private String c;
    private DetailBusinessDetector d;

    static {
        kge.a(1703336010);
        kge.a(1436843255);
    }

    public static /* synthetic */ int a(fcj fcjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e847845e", new Object[]{fcjVar})).intValue() : fcjVar.f27798a;
    }

    public static /* synthetic */ int a(fcj fcjVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20a97beb", new Object[]{fcjVar, new Integer(i)})).intValue();
        }
        fcjVar.f27798a = i;
        return i;
    }

    public static /* synthetic */ void a(fcj fcjVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20a9bbc9", new Object[]{fcjVar, new Boolean(z)});
        } else {
            fcjVar.a(z);
        }
    }

    public fcj() {
        if (a(epo.a())) {
            try {
                this.d = (DetailBusinessDetector) Class.forName("com.alibaba.customdetail.TMDetailDetector").newInstance();
            } catch (Exception e) {
                i.a("TMDetailBusinessDetectorProxy", "class not found " + e.getMessage());
            }
        }
        emu.a("com.taobao.android.detail.wrapper.ext.dynamicbase.TMDetailBusinessDetectorProxy");
    }

    @Override // com.taobao.android.detail.core.open.DetailBusinessDetector
    public boolean isDefaultDetailApi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdd7679d", new Object[]{this})).booleanValue();
        }
        DetailBusinessDetector detailBusinessDetector = this.d;
        return detailBusinessDetector == null || detailBusinessDetector.isDefaultDetailApi();
    }

    @Override // com.taobao.android.detail.core.open.DetailBusinessDetector
    public DetailBusinessDetector.DetectResult detect(String str, DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailBusinessDetector.DetectResult) ipChange.ipc$dispatch("3e61846b", new Object[]{this, str, detailCoreActivity});
        }
        DetailBusinessDetector detailBusinessDetector = this.d;
        if (detailBusinessDetector != null) {
            return detailBusinessDetector.detect(str, detailCoreActivity);
        }
        this.c = str;
        return DetailBusinessDetector.DetectResult.no;
    }

    @Override // com.taobao.android.detail.core.open.DetailBusinessDetector
    public boolean detect(b bVar, DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2adf01b", new Object[]{this, bVar, detailCoreActivity})).booleanValue();
        }
        DetailBusinessDetector detailBusinessDetector = this.d;
        if (detailBusinessDetector != null) {
            return detailBusinessDetector.detect(bVar, detailCoreActivity);
        }
        a(bVar);
        b(bVar);
        return false;
    }

    @Override // com.taobao.android.detail.core.open.DetailBusinessDetector
    public void reCustomizeDetail(g gVar, DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d0a9e9", new Object[]{this, gVar, detailCoreActivity});
            return;
        }
        DetailBusinessDetector detailBusinessDetector = this.d;
        if (detailBusinessDetector == null) {
            return;
        }
        detailBusinessDetector.reCustomizeDetail(gVar, detailCoreActivity);
    }

    private void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c456302", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            ItemNode c = eqb.c(bVar);
            String str = c.categoryId;
            String str2 = c.itemId;
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("itemId", str2);
            hashMap.put("categoryId", str);
            hashMap.put("installed", "false");
            hashMap.put("timeStamp", String.valueOf(currentTimeMillis));
            hashMap.put("f_business_type", "travel");
            eps.a(null, 19999, "tm_detail_Status", null, null, ect.a(hashMap));
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("download", String.valueOf(z));
        hashMap.put("feature", "tmdetailaar");
        hashMap.put("timeStamp", String.valueOf(currentTimeMillis));
        hashMap.put("f_business_type", "travel");
        long j = this.b;
        if (j > 0) {
            hashMap.put("cost", String.valueOf(currentTimeMillis - j));
        }
        eps.a(null, 19999, "tm_detail__download", null, null, ect.a(hashMap));
    }

    private void b(b bVar) {
        TradeNode e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fd4e743", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            try {
                if (StringUtils.isEmpty(this.c) || (e = eqb.e(bVar)) == null) {
                    return;
                }
                String str = e.degradeUrl;
                if (StringUtils.isEmpty(str)) {
                    return;
                }
                e.degradeUrl = a(this.c, str);
            } catch (Exception e2) {
                i.a("TMDetailBusinessDetectorProxy", e2.getMessage());
            }
        }
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        try {
            Uri parse = Uri.parse(str);
            Uri parse2 = Uri.parse(str2);
            Uri.Builder buildUpon = parse2.buildUpon();
            for (String str3 : parse.getQueryParameterNames()) {
                String queryParameter = parse.getQueryParameter(str3);
                if (!StringUtils.isEmpty(queryParameter) && StringUtils.isEmpty(parse2.getQueryParameter(queryParameter))) {
                    buildUpon.appendQueryParameter(str3, queryParameter);
                }
            }
            return buildUpon.toString();
        } catch (Exception unused) {
            return str2;
        }
    }

    private boolean a(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        com.alibaba.android.split.core.splitinstall.g c = c.Companion.a().c();
        if (c == null) {
            return false;
        }
        if (c.a().contains("tmdetailaar")) {
            return true;
        }
        if (Build.VERSION.SDK_INT > 29 || "true".equalsIgnoreCase(DetailSwitcherAdapter.a("sync_load", "false"))) {
            try {
                z = k.a().a(context, false, "tmdetailaar");
            } catch (Exception e) {
                i.a("TMDetailBusinessDetectorProxy", "SplitCompatHolder load err " + e.getMessage());
                z = false;
            }
            if (z && c.a().contains("tmdetailaar")) {
                return true;
            }
        }
        i.c("TMDetailBusinessDetectorProxy", "remomte module not installed：tmdetailaar");
        a(c);
        return false;
    }

    private void a(final com.alibaba.android.split.core.splitinstall.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398c5d46", new Object[]{this, gVar});
            return;
        }
        final a aVar = new a(gVar);
        gVar.a(aVar);
        j a2 = j.a().a("tmdetailaar").a();
        this.b = System.currentTimeMillis();
        gVar.a(a2).a(new e<Integer>() { // from class: tb.fcj.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.split.core.tasks.e
            public /* synthetic */ void onSuccess(Integer num) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ea580ec7", new Object[]{this, num});
                } else {
                    a(num);
                }
            }

            public void a(Integer num) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6cdec50f", new Object[]{this, num});
                    return;
                }
                fcj.a(fcj.this, num.intValue());
                i.c("TMDetailBusinessDetectorProxy", "send install request success: " + fcj.a(fcj.this));
            }
        }).a(new d() { // from class: tb.fcj.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.split.core.tasks.d
            public void onFailure(Exception exc) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ebfde814", new Object[]{this, exc});
                    return;
                }
                gVar.b(aVar);
                i.a("TMDetailBusinessDetectorProxy", "send install request failure: tmdetailaar");
            }
        });
    }

    /* loaded from: classes5.dex */
    public class a implements o {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final com.alibaba.android.split.core.splitinstall.g b;

        static {
            kge.a(-48841294);
            kge.a(-1887429869);
        }

        @Override // com.alibaba.android.split.core.listener.b
        public /* synthetic */ void onStateUpdate(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd17bbbe", new Object[]{this, mVar});
            } else {
                a(mVar);
            }
        }

        public a(com.alibaba.android.split.core.splitinstall.g gVar) {
            this.b = gVar;
        }

        public void a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("398f1780", new Object[]{this, mVar});
            } else if (mVar.a() != fcj.a(fcj.this)) {
            } else {
                int b = mVar.b();
                if (b == 2) {
                    i.c("TMDetailBusinessDetectorProxy", "downloading tmdetailaar");
                } else if (b == 4) {
                    i.c("TMDetailBusinessDetectorProxy", "installing tmdetailaar");
                } else if (b == 5) {
                    fcj.a(fcj.this, true);
                    this.b.b(this);
                    i.c("TMDetailBusinessDetectorProxy", "installed tmdetailaar");
                } else if (b != 6) {
                } else {
                    fcj.a(fcj.this, false);
                    this.b.b(this);
                    i.a("TMDetailBusinessDetectorProxy", "install failed tmdetailaar");
                }
            }
        }
    }
}

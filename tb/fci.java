package tb;

import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.android.split.core.splitinstall.m;
import com.alibaba.android.split.core.splitinstall.o;
import com.alibaba.android.split.core.tasks.d;
import com.alibaba.android.split.core.tasks.e;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.b;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.open.DetailBusinessDetector;
import com.taobao.android.detail.core.open.g;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.p;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.TradeNode;
import com.taobao.appbundle.c;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class fci implements DetailBusinessDetector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f27794a;
    private long b;
    private String c;
    private DetailBusinessDetector d;

    static {
        kge.a(2140259885);
        kge.a(1436843255);
    }

    @Override // com.taobao.android.detail.core.open.DetailBusinessDetector
    public boolean isDefaultDetailApi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdd7679d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ int a(fci fciVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e8470fff", new Object[]{fciVar})).intValue() : fciVar.f27794a;
    }

    public static /* synthetic */ int a(fci fciVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("209b646a", new Object[]{fciVar, new Integer(i)})).intValue();
        }
        fciVar.f27794a = i;
        return i;
    }

    public static /* synthetic */ void a(fci fciVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209ba448", new Object[]{fciVar, new Boolean(z)});
        } else {
            fciVar.a(z);
        }
    }

    public fci() {
        if (!(b.a().c("fliggy_vacation_detail") != null) || a(epo.a())) {
            try {
                this.d = (DetailBusinessDetector) Class.forName("com.taobao.android.detail.fliggy.FliggyVacationDetailInit").newInstance();
            } catch (Exception e) {
                i.a("FliggyDetectorProxy", "class not found " + e.getMessage());
            }
        }
        emu.a("com.taobao.android.detail.wrapper.ext.dynamicbase.FliggyDetailBusinessDetectorProxy");
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
    public boolean detect(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar, DetailCoreActivity detailCoreActivity) {
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

    private void a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
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
            eps.a(null, 19999, "Fliggy_Vacation_Status", null, null, ect.a(hashMap));
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
        hashMap.put("feature", "fliggy_vacation_detail");
        hashMap.put("timeStamp", String.valueOf(currentTimeMillis));
        hashMap.put("f_business_type", "travel");
        long j = this.b;
        if (j > 0) {
            hashMap.put("cost", String.valueOf(currentTimeMillis - j));
        }
        eps.a(null, 19999, "Fliggy_Vacation_download", null, null, ect.a(hashMap));
    }

    private void b(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        TradeNode e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fd4e743", new Object[]{this, bVar});
        } else if (bVar != null) {
            try {
                if (StringUtils.isEmpty(this.c) || (e = eqb.e(bVar)) == null) {
                    return;
                }
                String str = e.degradeUrl;
                if (StringUtils.isEmpty(str)) {
                    return;
                }
                Uri parse = Uri.parse(this.c);
                for (String str2 : parse.getQueryParameterNames()) {
                    String queryParameter = parse.getQueryParameter(str2);
                    if (!StringUtils.isEmpty(queryParameter)) {
                        str = p.a(str, str2, queryParameter);
                    }
                }
                e.degradeUrl = str;
            } catch (Exception e2) {
                i.a("FliggyDetectorProxy", e2.getMessage());
            }
        }
    }

    private boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        com.alibaba.android.split.core.splitinstall.g c = c.Companion.a().c();
        if (c == null) {
            return false;
        }
        if (c.a().contains("fliggy_vacation_detail")) {
            return true;
        }
        i.c("FliggyDetectorProxy", "remomte module not installed：fliggy_vacation_detail");
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
        j a2 = j.a().a("fliggy_vacation_detail").a();
        this.b = System.currentTimeMillis();
        gVar.a(a2).a(new e<Integer>() { // from class: tb.fci.2
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
                fci.a(fci.this, num.intValue());
                i.c("FliggyDetectorProxy", "send install request success: " + fci.a(fci.this));
            }
        }).a(new d() { // from class: tb.fci.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.split.core.tasks.d
            public void onFailure(Exception exc) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ebfde814", new Object[]{this, exc});
                    return;
                }
                gVar.b(aVar);
                i.a("FliggyDetectorProxy", "send install request failure: fliggy_vacation_detail");
            }
        });
    }

    /* loaded from: classes5.dex */
    public class a implements o {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private com.alibaba.android.split.core.splitinstall.g b;

        static {
            kge.a(-2063328404);
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
            } else if (mVar.a() != fci.a(fci.this)) {
            } else {
                int b = mVar.b();
                if (b == 2) {
                    i.c("FliggyDetectorProxy", "downloading fliggy_vacation_detail");
                } else if (b == 4) {
                    i.c("FliggyDetectorProxy", "installing fliggy_vacation_detail");
                } else if (b == 5) {
                    fci.a(fci.this, true);
                    this.b.b(this);
                    i.c("FliggyDetectorProxy", "installed fliggy_vacation_detail");
                } else if (b != 6) {
                } else {
                    fci.a(fci.this, false);
                    this.b.b(this);
                    i.a("FliggyDetectorProxy", "install failed fliggy_vacation_detail");
                }
            }
        }
    }
}

package tb;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.homepage.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes7.dex */
public class sts {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ljs c;
    private boolean d = false;

    /* renamed from: a  reason: collision with root package name */
    private final a f33896a = new a();
    private final b<String> b = new b<>(100);

    static {
        kge.a(164316026);
    }

    public sts(ljs ljsVar) {
        this.c = ljsVar;
    }

    public void e(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c21474f", new Object[]{this, iContainerDataModel});
        } else if (iContainerDataModel == null || this.d) {
        } else {
            this.d = true;
            if (!f(iContainerDataModel) && !thd.a((IMainFeedsViewService) this.c.a(IMainFeedsViewService.class))) {
                return;
            }
            b(iContainerDataModel);
            a(iContainerDataModel);
        }
    }

    public void a(IContainerDataModel<?> iContainerDataModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5499aadd", new Object[]{this, iContainerDataModel, str});
        } else if (iContainerDataModel == null) {
        } else {
            if (d(iContainerDataModel) || f(iContainerDataModel)) {
                this.b.b();
            }
            if (!c(iContainerDataModel)) {
                return;
            }
            b(iContainerDataModel);
            a(iContainerDataModel);
        }
    }

    private boolean d(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be2de174", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        if (iContainerDataModel == null) {
            ldf.d("ExpoFilterManger", "containerData == null");
            return false;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            ldf.d("ExpoFilterManger", "baseData == null");
            return false;
        }
        JSONObject ext = base.getExt();
        if (ext == null) {
            ldf.d("ExpoFilterManger", "ext == null");
            return false;
        }
        return StringUtils.equals("true", ext.getString("clearExposureFilterBuffer"));
    }

    private void b(IContainerDataModel<?> iContainerDataModel) {
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24715b2", new Object[]{this, iContainerDataModel});
            return;
        }
        try {
            if (d.a() == null) {
                ldf.d("ExpoFilterManger", "HomeGateway.getRecmdDataSource() == null");
                return;
            }
            JSONObject c = d.a().c();
            if (c == null) {
                ldf.d("ExpoFilterManger", "ext == null");
                ldl.a("Page_Home", 19999, "expoFilterError", "ext is null", null, null);
                return;
            }
            if (c.containsKey("exposureFilterOptimization")) {
                this.f33896a.a(c.getBooleanValue("exposureFilterOptimization"));
            } else {
                ldl.a("Page_Home", 19999, "expoFilterError", "ext not contains exposureFilterOptimization", null, null);
                ldf.d("ExpoFilterManger", "ext not contains exposureFilterOptimization");
            }
            if (!c.containsKey("exposureFilterBufferSize") || this.b.a() == (intValue = c.getInteger("exposureFilterBufferSize").intValue())) {
                return;
            }
            this.b.a(intValue);
        } catch (Exception e) {
            ldl.a("Page_Home", 19999, "expoFilterError", "parser config failed" + Log.getStackTraceString(e), null, null);
            ldf.d("ExpoFilterManger", "parser config failed" + Log.getStackTraceString(e));
        }
    }

    public void a(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2453afd3", new Object[]{this, iContainerDataModel});
        } else if (!this.f33896a.c()) {
            ldf.d("ExpoFilterManger", "expo redundant item filter unEnable,server:" + this.f33896a.a() + ",local:" + this.f33896a.b());
        } else {
            try {
                List<?> sections = iContainerDataModel.getBase().getSections();
                ArrayList arrayList = new ArrayList(8);
                Iterator<?> it = sections.iterator();
                while (it.hasNext()) {
                    SectionModel sectionModel = (SectionModel) it.next();
                    String string = sectionModel.getExt().getString("cardFeatureId");
                    if (StringUtils.isEmpty(string)) {
                        ldf.d("ExpoFilterManger", "cardFeatureId is empty");
                    } else if (this.b.a((b<String>) string)) {
                        arrayList.add(sectionModel);
                        a(string);
                    } else {
                        b.a(this.b, string);
                    }
                }
                sections.removeAll(arrayList);
            } catch (Exception e) {
                ldf.d("ExpoFilterManger", "filter items failed" + Log.getStackTraceString(e));
            }
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cardFeature", (Object) str);
        ldl.a(this.c.a().c(), 19999, "expoFilterRemoveSameItem", null, null, jSONObject.toJSONString());
    }

    private boolean c(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e03a7b95", new Object[]{this, iContainerDataModel})).booleanValue() : (iContainerDataModel == null || iContainerDataModel.getBase() == null) ? false : true;
    }

    private boolean f(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7a14ad32", new Object[]{this, iContainerDataModel})).booleanValue() : (iContainerDataModel == null || iContainerDataModel.getBase() == null || iContainerDataModel.getBase().mo1280getPageParams() == null || iContainerDataModel.getBase().mo1280getPageParams().getPageNum() != 0) ? false : true;
    }

    /* loaded from: classes7.dex */
    public static class b<E> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f33898a;
        private final LinkedList<E> b = new LinkedList<>();

        static {
            kge.a(-881567856);
        }

        public static /* synthetic */ void a(b bVar, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37347c44", new Object[]{bVar, obj});
            } else {
                bVar.b(obj);
            }
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.f33898a = i;
            }
        }

        public int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f33898a;
        }

        public b(int i) {
            this.f33898a = i;
        }

        private void b(E e) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f056ab85", new Object[]{this, e});
                return;
            }
            if (this.b.size() >= this.f33898a) {
                this.b.poll();
            }
            this.b.offer(e);
        }

        public boolean a(E e) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, e})).booleanValue() : this.b.contains(e);
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                this.b.clear();
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f33897a = false;
        private boolean b = ldj.a("localOrangeExpoFilterEnable", true);

        static {
            kge.a(764334070);
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f33897a;
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.f33897a = z;
            }
        }

        public boolean c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.b && this.f33897a;
        }
    }
}

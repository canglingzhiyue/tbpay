package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.gateway.msgcenter.Message;
import com.taobao.android.home.component.utils.e;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView;
import com.taobao.tao.recommend4.recyclerview.h;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes8.dex */
public class oso implements com.taobao.android.gateway.msgcenter.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Handler f32362a = new Handler(Looper.getMainLooper());
    private a b;
    private WeakReference<HomeChildRecyclerView> c;
    private ksk d;
    private final otc e;

    /* loaded from: classes8.dex */
    public interface a {
        void a();

        void a(boolean z);

        void a(boolean z, boolean z2, boolean z3);
    }

    static {
        kge.a(1120180484);
        kge.a(2092605998);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "recmd.container";
    }

    public static /* synthetic */ void a(oso osoVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fbc9d59", new Object[]{osoVar, str, jSONObject});
        } else {
            osoVar.a(str, jSONObject);
        }
    }

    public oso(ksk kskVar, HomeChildRecyclerView homeChildRecyclerView, otc otcVar) {
        this.c = new WeakReference<>(homeChildRecyclerView);
        this.d = kskVar;
        this.e = otcVar;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f12390d0", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public void a(ksk kskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b1abf5", new Object[]{this, kskVar});
        } else {
            this.d = kskVar;
        }
    }

    @Override // com.taobao.android.gateway.msgcenter.a
    public void a(Message message) {
        final JSONObject params;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be9bf67", new Object[]{this, message});
        } else if (!TextUtils.equals(message.getChannelId(), a()) || (params = message.getParams()) == null) {
        } else {
            final String string = params.getString("_msgType");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            if (opb.b()) {
                a(string, params);
            } else {
                this.f32362a.post(new Runnable() { // from class: tb.oso.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            oso.a(oso.this, string, params);
                        }
                    }
                });
            }
        }
    }

    private void a(String str, JSONObject jSONObject) {
        AwesomeGetContainerData awesomeGetContainerData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else if (TextUtils.equals(str, "dinamicX3")) {
            a(jSONObject);
        } else {
            String string = jSONObject.getString("containerId");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            String substring = string.substring(string.lastIndexOf(95) + 1);
            if (TextUtils.isEmpty(substring)) {
                return;
            }
            if (TextUtils.equals(jSONObject.getString("dataSourceType"), "remote") && (jSONObject.get("containerModel") instanceof AwesomeGetContainerData) && TextUtils.equals(str, "uiRefresh") && (awesomeGetContainerData = (AwesomeGetContainerData) jSONObject.get("containerModel")) != null && awesomeGetContainerData.getBaseRemind() != null) {
                kxf.a().a(new kxv(awesomeGetContainerData.getBaseRemind(), false));
            }
            HomeChildRecyclerView homeChildRecyclerView = this.c.get();
            if (homeChildRecyclerView == null) {
                return;
            }
            if (TextUtils.equals(str, "scrollToTop")) {
                b(jSONObject, substring, homeChildRecyclerView);
            } else if (!TextUtils.equals(str, "uiRefresh")) {
            } else {
                a(jSONObject, string, homeChildRecyclerView);
            }
        }
    }

    private void a(JSONObject jSONObject, String str, HomeChildRecyclerView homeChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d67e114", new Object[]{this, jSONObject, str, homeChildRecyclerView});
            return;
        }
        String string = jSONObject.getString("dataChangeType");
        if (TextUtils.isEmpty(string)) {
            ((h) homeChildRecyclerView.getAdapter()).a();
            this.e.e();
            a aVar = this.b;
            if (aVar == null) {
                return;
            }
            aVar.a();
            return;
        }
        AwesomeGetContainerData awesomeGetContainerData = (AwesomeGetContainerData) jSONObject.get("containerModel");
        if (awesomeGetContainerData == null || awesomeGetContainerData.getBaseData() == null || awesomeGetContainerData.getPageParams() == null || awesomeGetContainerData.getTotalData() == null) {
            a aVar2 = this.b;
            if (aVar2 != null) {
                aVar2.a();
            }
            this.e.e();
            return;
        }
        boolean a2 = a(str, awesomeGetContainerData, string);
        boolean equals = TextUtils.equals(jSONObject.getString("dataSourceType"), "local");
        boolean a3 = opb.a(awesomeGetContainerData.getPageParams().isLastPage);
        a aVar3 = this.b;
        if (aVar3 != null) {
            aVar3.a(a2);
        }
        try {
            h hVar = (h) homeChildRecyclerView.getAdapter();
            if (equals && hVar.getItemCount() > 1 && TextUtils.equals(this.d.f30287a, str)) {
                a(a2, true, a3);
                return;
            }
            if (a2) {
                hVar.b(0);
            } else {
                hVar.b(-1);
            }
            a(a2, equals, a3);
            this.e.a(a2, equals, a3);
        } catch (Throwable unused) {
            e.e("RecmdContainerChannel4", "");
        }
    }

    private void a(boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("271102ec", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.a(z, z2, z3);
    }

    private boolean a(String str, IContainerDataModel<?> iContainerDataModel, String str2) {
        IPageDataModel mo1280getPageParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffa0e757", new Object[]{this, str, iContainerDataModel, str2})).booleanValue();
        }
        boolean equals = TextUtils.equals(str2, "base");
        return (Boolean.parseBoolean(otj.a(str, "isNextPageToDeltaRefresh", "true")) && equals && (mo1280getPageParams = iContainerDataModel.getBase().mo1280getPageParams()) != null) ? mo1280getPageParams.getPageNum() == 0 : equals;
    }

    private void b(JSONObject jSONObject, String str, HomeChildRecyclerView homeChildRecyclerView) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c67ee7b3", new Object[]{this, jSONObject, str, homeChildRecyclerView});
            return;
        }
        try {
            z = jSONObject.getBooleanValue("animated");
        } catch (Throwable unused) {
            z = false;
        }
        if (z) {
            homeChildRecyclerView.smoothScrollToPosition(0);
        } else {
            homeChildRecyclerView.scrollToPosition(0);
        }
    }

    private void a(JSONObject jSONObject) {
        HomeChildRecyclerView homeChildRecyclerView;
        List<SectionModel> b;
        int a2;
        View findViewByPosition;
        View childAt;
        DinamicXEngine b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("sectionBizCode");
        Object obj = jSONObject.get("DX3Params");
        if (TextUtils.isEmpty(string) || obj == null || !(obj instanceof JSONObject) || (homeChildRecyclerView = this.c.get()) == null || (b = ((h) homeChildRecyclerView.getAdapter()).b()) == null || b.isEmpty() || (a2 = opb.a(string, b)) < 0 || a2 >= b.size() || (findViewByPosition = homeChildRecyclerView.getLayoutManager().findViewByPosition(a2)) == null || !(findViewByPosition instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) findViewByPosition;
        if (viewGroup.getChildCount() <= 0 || (childAt = viewGroup.getChildAt(0)) == null || !(childAt instanceof DXRootView) || (b2 = com.taobao.tao.recommend3.a.a().b()) == null) {
            return;
        }
        b2.a((DXRootView) childAt, obj);
    }
}

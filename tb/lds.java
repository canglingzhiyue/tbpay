package tb;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.j;
import com.taobao.infoflow.core.engine.env.protocol.h;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.biz.IGlobalSceneUtPassService;
import com.taobao.infoflow.protocol.subservice.biz.IUserExperienceCheckService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.unit.center.mdc.dinamicx.constants.DinamicxNativeConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class lds {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_NAV_REQUEST_CODE = "info_flow_nav_request_code";

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30508a;
    private int b = 1200;
    private long c = 0;
    private List<String> d;

    static {
        kge.a(-198988123);
    }

    public abstract void b(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view);

    public lds(ljs ljsVar) {
        this.f30508a = ljsVar;
    }

    public void a(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6a38c", new Object[]{this, baseSectionModel, baseSubItemModel, view});
        } else if (System.currentTimeMillis() - this.c < 800) {
        } else {
            this.c = System.currentTimeMillis();
            String targetUrl = baseSubItemModel.getTargetUrl();
            if (TextUtils.isEmpty(targetUrl)) {
                a(baseSectionModel, targetUrl);
                return;
            }
            String a2 = ldw.a(targetUrl, baseSectionModel.getSectionBizCode());
            if (qnl.h()) {
                ldf.d("AbsTapEventProcess", "the utLogMap has been stored");
                tdk.b(baseSectionModel);
            }
            a(baseSectionModel, baseSubItemModel, a2, view);
            c(baseSectionModel, baseSubItemModel, view);
            b(baseSectionModel, baseSubItemModel, view);
            d(baseSectionModel, baseSubItemModel, view);
            a(baseSectionModel);
        }
    }

    private Context a(View view) {
        Context a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("52552462", new Object[]{this, view});
        }
        Context context = view.getContext();
        return (!(context instanceof fpz) || (a2 = ((fpz) context).a()) == null) ? context : a2;
    }

    private Context b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("8c1fc641", new Object[]{this, view});
        }
        IHostService iHostService = (IHostService) this.f30508a.a(IHostService.class);
        if (iHostService == null) {
            return a(view);
        }
        lkc i = iHostService.getInvokeCallback().i();
        if (i == null) {
            return a(view);
        }
        Context b = i.b();
        return b == null ? a(view) : b;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel<?> r23, com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel r24, java.lang.String r25, android.view.View r26) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lds.a(com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel, com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel, java.lang.String, android.view.View):void");
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.d == null) {
            this.d = new ArrayList();
            String a2 = j.a("homepageNavSimpleProcessorUrls", "");
            if (TextUtils.isEmpty(a2)) {
                return false;
            }
            String[] split = a2.split(",");
            if (split.length > 0) {
                this.d.addAll(Arrays.asList(split));
            }
        }
        for (String str2 : this.d) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        ljs ljsVar = this.f30508a;
        if (ljsVar == null) {
            ldf.d("AbsTapEventProcess", "LowBatteryNdQuickJump:Error: mInfoFlowContext is null.");
            return false;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("AbsTapEventProcess", "LowBatteryNdQuickJump:Error: dataService is null.");
            return false;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null) {
            ldf.d("AbsTapEventProcess", "LowBatteryNdQuickJump:Error: dataModel is null.");
            return false;
        }
        IContainerInnerDataModel base = containerData.getBase();
        if (base == null) {
            ldf.d("AbsTapEventProcess", "LowBatteryNdQuickJump:Error: innerDataModel is null.");
            return false;
        }
        JSONObject ext = base.getExt();
        if (ext == null) {
            ldf.d("AbsTapEventProcess", "LowBatteryNdQuickJump:Error: globalExt is null.");
            return false;
        }
        boolean a2 = qnl.a(ext, "lowBatteryNdQuickJump", false);
        if (a2) {
            ldf.d("AbsTapEventProcess", "LowBatteryNdQuickJump:SuccessServer");
        } else {
            ldf.d("AbsTapEventProcess", "LowBatteryNdQuickJump:SkipServer");
        }
        return a2;
    }

    private Fragment a(ljs ljsVar) {
        IHostService iHostService;
        lkc i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("65691165", new Object[]{this, ljsVar});
        }
        if (ljsVar != null && (iHostService = (IHostService) ljsVar.a(IHostService.class)) != null && (i = iHostService.getInvokeCallback().i()) != null) {
            return i.c();
        }
        return null;
    }

    private void a(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71ccf1d8", new Object[]{this, baseSectionModel, baseSubItemModel, bundle, str});
            return;
        }
        IDxItemClickService iDxItemClickService = (IDxItemClickService) this.f30508a.a(IDxItemClickService.class);
        if (iDxItemClickService == null) {
            return;
        }
        iDxItemClickService.onNav(baseSectionModel, baseSubItemModel, bundle, str);
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        IDxItemClickService iDxItemClickService = (IDxItemClickService) this.f30508a.a(IDxItemClickService.class);
        if (iDxItemClickService == null) {
            return;
        }
        iDxItemClickService.onNavFinished(z);
    }

    public void d(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba709329", new Object[]{this, baseSectionModel, baseSubItemModel, view});
            return;
        }
        IGlobalSceneUtPassService iGlobalSceneUtPassService = (IGlobalSceneUtPassService) this.f30508a.a(IGlobalSceneUtPassService.class);
        if (iGlobalSceneUtPassService == null) {
            return;
        }
        iGlobalSceneUtPassService.onClick(baseSubItemModel);
    }

    private void c(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1dd434a", new Object[]{this, baseSectionModel, baseSubItemModel, view});
            return;
        }
        IDxItemClickService iDxItemClickService = (IDxItemClickService) this.f30508a.a(IDxItemClickService.class);
        if (iDxItemClickService == null) {
            return;
        }
        iDxItemClickService.click(baseSectionModel, baseSubItemModel, view);
    }

    public ljs a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljs) ipChange.ipc$dispatch("f075909", new Object[]{this}) : this.f30508a;
    }

    public void a(BaseSectionModel<?> baseSectionModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d28fcb7a", new Object[]{this, baseSectionModel, str});
            return;
        }
        String sectionBizCode = baseSectionModel.getSectionBizCode();
        String a2 = this.f30508a.a().a();
        ljb ljbVar = new ljb(a2, "clickNav", 3001, "errorTargetUrl", "sectionBizCode: " + sectionBizCode + " url is " + str);
        ljc.a(ljbVar);
        StringBuilder sb = new StringBuilder();
        sb.append("error: ");
        sb.append(ljbVar.toString());
        ldf.d("AbsTapEventProcess", sb.toString());
    }

    /* loaded from: classes7.dex */
    public static class a implements h.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Bundle f30509a;
        private final Bundle b;
        private int c;
        private Fragment d;
        private boolean e;

        static {
            kge.a(1150645221);
            kge.a(-1454440677);
        }

        public a(Bundle bundle, Bundle bundle2, int i, Fragment fragment) {
            this.c = 0;
            this.d = null;
            this.f30509a = bundle;
            this.b = bundle2;
            this.c = i;
            this.d = fragment;
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.e = z;
            }
        }

        @Override // com.taobao.infoflow.core.engine.env.protocol.h.a
        public boolean e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.e;
        }

        @Override // com.taobao.infoflow.core.engine.env.protocol.h.a
        public Bundle a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("d1a37f2c", new Object[]{this}) : this.f30509a;
        }

        @Override // com.taobao.infoflow.core.engine.env.protocol.h.a
        public Bundle b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("1bd5186d", new Object[]{this}) : this.b;
        }

        @Override // com.taobao.infoflow.core.engine.env.protocol.h.a
        public int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.c;
        }

        @Override // com.taobao.infoflow.core.engine.env.protocol.h.a
        public Fragment d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("4e9ed04d", new Object[]{this}) : this.d;
        }
    }

    private Bundle b(BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("ecc56043", new Object[]{this, baseSubItemModel});
        }
        JSONObject ext = baseSubItemModel.getExt();
        Bundle bundle = new Bundle();
        if (ext != null) {
            String string = ext.getString("targetParams");
            if (!TextUtils.isEmpty(string)) {
                bundle.putSerializable("targetParams", string);
            }
        }
        return bundle;
    }

    private void a(BaseSectionModel<?> baseSectionModel) {
        IUserExperienceCheckService iUserExperienceCheckService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc98adb0", new Object[]{this, baseSectionModel});
            return;
        }
        ljs ljsVar = this.f30508a;
        if (ljsVar == null || (iUserExperienceCheckService = (IUserExperienceCheckService) ljsVar.a(IUserExperienceCheckService.class)) == null) {
            return;
        }
        iUserExperienceCheckService.startExperienceCheckTask(baseSectionModel, IUserExperienceCheckService.CheckOccasion.CLICK);
    }

    private void a(BaseSectionModel<?> baseSectionModel, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49acf924", new Object[]{this, baseSectionModel, bundle});
            return;
        }
        JSONObject ext = baseSectionModel.getExt();
        if (ext != null) {
            if (TextUtils.equals("1", ext.getString(tim.S_ARGS_IS_CLIENT_CACHE))) {
                bundle.putString(tim.S_ARGS_IS_CLIENT_CACHE, "1");
                ldf.d("AbsTapEventProcess", "isClientCachetrue");
            }
            if (TextUtils.equals("1", ext.getString("requestNewDetailFlag"))) {
                bundle.putString("requestNewDetailFlag", "true");
            }
            String string = ext.getString("requestNewDetailTime");
            if (string != null) {
                bundle.putString("requestNewDetailTime", string);
            }
            String string2 = ext.getString(com.taobao.infoflow.core.subservice.biz.experiencecheck.impl.a.KEY_PRICE);
            if (string2 != null) {
                bundle.putString(com.taobao.infoflow.core.subservice.biz.experiencecheck.impl.a.KEY_PRICE, string2);
            }
            String string3 = ext.getString(com.taobao.infoflow.core.subservice.biz.experiencecheck.impl.a.KEY_MAIN_TITLE);
            if (string3 != null) {
                bundle.putString(com.taobao.infoflow.core.subservice.biz.experiencecheck.impl.a.KEY_MAIN_TITLE, string3);
            }
            String string4 = ext.getString(com.taobao.infoflow.core.subservice.biz.experiencecheck.impl.a.KEY_MAIN_IMAGE_URL);
            if (string4 != null) {
                bundle.putString(com.taobao.infoflow.core.subservice.biz.experiencecheck.impl.a.KEY_MAIN_IMAGE_URL, string4);
            }
        }
        Object a2 = lja.a("item.0.ext.targetType", baseSectionModel);
        if (!(a2 instanceof String)) {
            return;
        }
        bundle.putString(DinamicxNativeConfig.TARGETTYPE, (String) a2);
        ldf.d("AbsTapEventProcess", "targetType: " + a2);
    }

    private void a(View view, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e05c3b2", new Object[]{this, view, baseSectionModel});
            return;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof View)) {
            return;
        }
        stn.a(baseSectionModel, (View) parent);
    }
}

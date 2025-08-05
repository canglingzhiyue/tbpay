package com.taobao.infoflow.taobao.subservice.biz.iconbackanimeservice;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.b;
import com.taobao.android.home.component.utils.j;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.biz.IIconService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.ldf;
import tb.ljs;
import tb.lli;
import tb.tmv;

/* loaded from: classes7.dex */
public class IconServiceImpl implements IIconService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "IconServiceImpl";
    private int initPageIndex;
    private int lastPageIndex;
    private IDxItemClickService mDxItemClickService;
    private ljs mInfoFlowContext;
    private IContainerDataService.b mRequestListener;
    private IDxItemClickService.c mTargetUrlParamsCreator;
    private String sectionBizCode;
    private final Map<String, JSONObject> mPassParams = new HashMap();
    private final Map<String, Long> mPassPopLayerTriggerTimeMap = new HashMap();
    private final Map<String, Long> mEffectiveTimeMap = new HashMap();

    static {
        kge.a(506462243);
        kge.a(-531294510);
    }

    public static /* synthetic */ int access$000(IconServiceImpl iconServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("37f66b16", new Object[]{iconServiceImpl})).intValue() : iconServiceImpl.lastPageIndex;
    }

    public static /* synthetic */ int access$002(IconServiceImpl iconServiceImpl, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5219f171", new Object[]{iconServiceImpl, new Integer(i)})).intValue();
        }
        iconServiceImpl.lastPageIndex = i;
        return i;
    }

    public static /* synthetic */ String access$100(IconServiceImpl iconServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3ee04cbc", new Object[]{iconServiceImpl}) : iconServiceImpl.sectionBizCode;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IIconService
    public void setPageIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e74d6bb", new Object[]{this, new Integer(i)});
        } else {
            this.lastPageIndex = i;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IIconService
    public int getPageIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("913ddec7", new Object[]{this})).intValue();
        }
        if (!j.a("iconUsePageNumDataParser", true)) {
            this.initPageIndex = 0;
            return this.initPageIndex;
        }
        this.initPageIndex = this.lastPageIndex;
        return this.initPageIndex;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IIconService
    public int getInitPageIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8c892e97", new Object[]{this})).intValue() : this.initPageIndex;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IIconService
    public void setSectionBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3dbfece", new Object[]{this, str});
        } else {
            this.sectionBizCode = str;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IIconService
    public void passPopLayerData(tmv tmvVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("239d13bf", new Object[]{this, tmvVar, str});
            return;
        }
        this.mPassParams.put(str, tmvVar.a());
        this.mEffectiveTimeMap.put(str, Long.valueOf(tmvVar.b()));
        this.mPassPopLayerTriggerTimeMap.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IIconService
    public JSONObject getPopLayerData(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab0a4571", new Object[]{this, str}) : this.mPassParams.get(str);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IIconService
    public void clearPopLayerData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1bcc788", new Object[]{this, str});
            return;
        }
        if (!this.mPassParams.isEmpty()) {
            ldf.d(TAG, "clearPopLayerData");
            this.mPassParams.remove(str);
        }
        if (!this.mEffectiveTimeMap.isEmpty()) {
            this.mEffectiveTimeMap.remove(str);
        }
        if (this.mPassPopLayerTriggerTimeMap.isEmpty()) {
            return;
        }
        this.mPassPopLayerTriggerTimeMap.remove(str);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IIconService
    public boolean isPassPopLayerDataAvailable(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2e3a299", new Object[]{this, str})).booleanValue();
        }
        Long l = this.mEffectiveTimeMap.get(str);
        if (l == null || l.longValue() <= 0) {
            ldf.d(TAG, "effectiveTime <=0");
            return true;
        }
        Long l2 = this.mPassPopLayerTriggerTimeMap.get(str);
        if (l2 != null) {
            return System.currentTimeMillis() - l2.longValue() < l.longValue();
        }
        ldf.d(TAG, "passPopLayerDataTime == null");
        return false;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mInfoFlowContext = ljsVar;
        initRegisterDataProcessListener();
        registerTargetUrlParamsCreator();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        unRegisterDataProcessListener();
        unRegisterTargetUrlParamsCreator();
        this.mPassParams.clear();
    }

    private void initRegisterDataProcessListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecb9ed", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return;
        }
        this.mRequestListener = createRequestListener();
        iContainerDataService.addRequestListener(this.mRequestListener);
    }

    private void unRegisterDataProcessListener() {
        IContainerDataService.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435b1f44", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null || (bVar = this.mRequestListener) == null) {
            return;
        }
        iContainerDataService.removeRequestListener(bVar);
    }

    private IContainerDataService.b createRequestListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.b) ipChange.ipc$dispatch("88e46762", new Object[]{this}) : new IContainerDataService.b() { // from class: com.taobao.infoflow.taobao.subservice.biz.iconbackanimeservice.IconServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("552c8b59", new Object[]{this, lliVar, str});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("74bec7ed", new Object[]{this, lliVar, str, str2, str3});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel, String str) {
                List<?> sections;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d905f556", new Object[]{this, lliVar, iContainerDataModel, str});
                    return;
                }
                if (TextUtils.equals(str, "pullRefresh") || TextUtils.equals(str, "coldStart") || TextUtils.equals(str, "editionSwitch") || TextUtils.equals(str, LogContext.ENVENT_USERLOGIN) || TextUtils.equals(str, b.REFRESH_SOURCE_HOT_START)) {
                    IconServiceImpl.access$002(IconServiceImpl.this, 0);
                }
                if (IconServiceImpl.access$000(IconServiceImpl.this) != 1 || TextUtils.isEmpty(IconServiceImpl.access$100(IconServiceImpl.this)) || iContainerDataModel == null || iContainerDataModel.getDelta() == null || (sections = iContainerDataModel.getDelta().getSections()) == null || sections.isEmpty()) {
                    return;
                }
                int size = sections.size();
                for (int i = 0; i < size; i++) {
                    BaseSectionModel baseSectionModel = (BaseSectionModel) sections.get(i);
                    if (TextUtils.equals(baseSectionModel.getSectionBizCode(), IconServiceImpl.access$100(IconServiceImpl.this)) && baseSectionModel.mo1098getSubSection() != null && baseSectionModel.mo1098getSubSection().size() == 1) {
                        IconServiceImpl.access$002(IconServiceImpl.this, 0);
                    }
                }
            }
        };
    }

    private void registerTargetUrlParamsCreator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64a1fbd2", new Object[]{this});
            return;
        }
        if (this.mTargetUrlParamsCreator == null) {
            this.mTargetUrlParamsCreator = new c(this.mInfoFlowContext);
        }
        this.mDxItemClickService = (IDxItemClickService) this.mInfoFlowContext.a(IDxItemClickService.class);
        IDxItemClickService iDxItemClickService = this.mDxItemClickService;
        if (iDxItemClickService == null) {
            return;
        }
        iDxItemClickService.addTargetUrlParamsCreator(this.mTargetUrlParamsCreator);
    }

    private void unRegisterTargetUrlParamsCreator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b0a04b", new Object[]{this});
            return;
        }
        this.mDxItemClickService = (IDxItemClickService) this.mInfoFlowContext.a(IDxItemClickService.class);
        IDxItemClickService iDxItemClickService = this.mDxItemClickService;
        if (iDxItemClickService == null) {
            return;
        }
        iDxItemClickService.removeTargetUrlParamsCreator(this.mTargetUrlParamsCreator);
    }
}

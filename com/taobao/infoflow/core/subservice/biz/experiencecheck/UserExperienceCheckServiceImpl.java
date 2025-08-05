package com.taobao.infoflow.core.subservice.biz.experiencecheck;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.biz.experiencecheck.impl.UserExperienceCheck;
import com.taobao.infoflow.core.subservice.biz.experiencecheck.impl.b;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IUserExperienceCheckService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import tb.kge;
import tb.ldf;
import tb.ljs;
import tb.lli;
import tb.ons;

/* loaded from: classes7.dex */
public class UserExperienceCheckServiceImpl implements IUserExperienceCheckService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String HOME_GLOBAL_AB_TEST = "homeGlobalABTest";
    private String TAG = "UserExperienceCheckServiceImpl";
    private ons mCardTitleDisplayCollector;
    private IContainerDataService<?> mContainerDataService;
    private UserExperienceCheck mExperienceCheck;
    private ljs mInfoFlowContext;
    private IContainerDataService.b mOnRequestListener;
    private b mUserExperienceConfig;

    static {
        kge.a(-837562791);
        kge.a(2087810860);
    }

    public static /* synthetic */ void access$000(UserExperienceCheckServiceImpl userExperienceCheckServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e211bee", new Object[]{userExperienceCheckServiceImpl, iContainerDataModel});
        } else {
            userExperienceCheckServiceImpl.getExperimentConfig(iContainerDataModel);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        if (this.mExperienceCheck == null) {
            this.mExperienceCheck = new UserExperienceCheck(ljsVar);
        }
        if (this.mUserExperienceConfig == null) {
            this.mUserExperienceConfig = new b();
        }
        this.mExperienceCheck.a(this.mUserExperienceConfig);
        registerRequestListener(ljsVar);
        this.mCardTitleDisplayCollector = new ons(ljsVar);
    }

    private void registerRequestListener(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24222862", new Object[]{this, ljsVar});
            return;
        }
        this.mContainerDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        if (this.mContainerDataService == null) {
            ldf.d(this.TAG, "registerRequestListener mContainerDataService is null");
            return;
        }
        this.mOnRequestListener = createRequestListener();
        this.mContainerDataService.addRequestListener(this.mOnRequestListener);
    }

    private void unRegisterRequestListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c3916e", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.mContainerDataService;
        if (iContainerDataService == null) {
            ldf.d(this.TAG, "unRegisterRequestListener mContainerDataService is null");
            return;
        }
        IContainerDataService.b bVar = this.mOnRequestListener;
        if (bVar == null) {
            return;
        }
        iContainerDataService.removeRequestListener(bVar);
        this.mOnRequestListener = null;
    }

    private IContainerDataService.b createRequestListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.b) ipChange.ipc$dispatch("88e46762", new Object[]{this}) : new IContainerDataService.b() { // from class: com.taobao.infoflow.core.subservice.biz.experiencecheck.UserExperienceCheckServiceImpl.1
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
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d905f556", new Object[]{this, lliVar, iContainerDataModel, str});
                } else {
                    UserExperienceCheckServiceImpl.access$000(UserExperienceCheckServiceImpl.this, iContainerDataModel);
                }
            }
        };
    }

    private void getExperimentConfig(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acb8509f", new Object[]{this, iContainerDataModel});
            return;
        }
        JSONObject homeGlobalAbTest = getHomeGlobalAbTest(iContainerDataModel);
        if (homeGlobalAbTest == null) {
            ldf.d(this.TAG, "updateNdLowFeatureList homeGlobalAbTest == null");
            return;
        }
        b bVar = this.mUserExperienceConfig;
        if (bVar == null) {
            return;
        }
        bVar.a(homeGlobalAbTest);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        UserExperienceCheck userExperienceCheck = this.mExperienceCheck;
        if (userExperienceCheck != null) {
            userExperienceCheck.a();
        }
        unRegisterRequestListener();
        this.mCardTitleDisplayCollector.a();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IUserExperienceCheckService
    public void startExperienceCheckTask(BaseSectionModel<?> baseSectionModel, IUserExperienceCheckService.CheckOccasion checkOccasion) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bc3533a", new Object[]{this, baseSectionModel, checkOccasion});
            return;
        }
        UserExperienceCheck userExperienceCheck = this.mExperienceCheck;
        if (userExperienceCheck == null) {
            return;
        }
        userExperienceCheck.a(baseSectionModel);
        this.mExperienceCheck.a(baseSectionModel, checkOccasion);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IUserExperienceCheckService
    public void saveGoodsInfo(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f2e776", new Object[]{this, baseSectionModel});
            return;
        }
        UserExperienceCheck userExperienceCheck = this.mExperienceCheck;
        if (userExperienceCheck == null) {
            return;
        }
        userExperienceCheck.a(baseSectionModel);
    }

    private JSONObject getHomeGlobalAbTest(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("91e03649", new Object[]{this, iContainerDataModel});
        }
        if (iContainerDataModel == null) {
            ldf.d(this.TAG, "containerDataModel == null");
            return null;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            ldf.d(this.TAG, "baseData == null");
            return null;
        }
        JSONObject ext = base.getExt();
        if (ext == null) {
            ldf.d(this.TAG, "ext == null");
            return null;
        }
        return ext.getJSONObject(HOME_GLOBAL_AB_TEST);
    }
}

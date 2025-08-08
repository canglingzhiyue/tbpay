package com.taobao.infoflow.taobao.subservice.biz.iconbackanimeservice;

import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IIconBackGuideAnimeService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.List;
import tb.kge;
import tb.ldj;
import tb.ljs;
import tb.lkq;
import tb.lli;
import tb.lns;
import tb.lny;
import tb.loa;

/* loaded from: classes7.dex */
public class IconBackGuideAnimeServiceImpl implements IIconBackGuideAnimeService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CURRENT_ICON_VERSION = "iconVersion";
    private static final String DOUBLE_ROW_ICON = "doubleRow";
    private static final String K_ENABLE_USE_ICON_BACK_ANIME = "enablePlayIconBackAnimeService";
    private static final String TAG = "IconAnimeServiceImpl";
    private Context mContext;
    private lns mIconBackGuideAnimeProcess;
    private ljs mInfoFlowContext;
    private boolean mLastIsUpgradeIcon;
    private IContainerDataService.a mOnDataProcessListener;
    private FrameLayout mRootLayout;

    static {
        kge.a(2052441860);
        kge.a(-1121105933);
    }

    @Override // tb.lkq
    public void addOnContainerListener(lkq.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f3597dd", new Object[]{this, aVar});
        }
    }

    @Override // tb.lkq
    public void removeOnContainerListener(lkq.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8982e05a", new Object[]{this, aVar});
        }
    }

    public static /* synthetic */ boolean access$000(IconBackGuideAnimeServiceImpl iconBackGuideAnimeServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("84e7f026", new Object[]{iconBackGuideAnimeServiceImpl})).booleanValue() : iconBackGuideAnimeServiceImpl.isIconAnimeOrangeEnable();
    }

    public static /* synthetic */ boolean access$100(IconBackGuideAnimeServiceImpl iconBackGuideAnimeServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("514f5bc", new Object[]{iconBackGuideAnimeServiceImpl, iContainerDataModel})).booleanValue() : iconBackGuideAnimeServiceImpl.isUpgradeIcon(iContainerDataModel);
    }

    public static /* synthetic */ lns access$200(IconBackGuideAnimeServiceImpl iconBackGuideAnimeServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lns) ipChange.ipc$dispatch("7d2101d1", new Object[]{iconBackGuideAnimeServiceImpl}) : iconBackGuideAnimeServiceImpl.mIconBackGuideAnimeProcess;
    }

    public static /* synthetic */ lns access$202(IconBackGuideAnimeServiceImpl iconBackGuideAnimeServiceImpl, lns lnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lns) ipChange.ipc$dispatch("f28b5390", new Object[]{iconBackGuideAnimeServiceImpl, lnsVar});
        }
        iconBackGuideAnimeServiceImpl.mIconBackGuideAnimeProcess = lnsVar;
        return lnsVar;
    }

    public static /* synthetic */ lns access$300(IconBackGuideAnimeServiceImpl iconBackGuideAnimeServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lns) ipChange.ipc$dispatch("556aadc6", new Object[]{iconBackGuideAnimeServiceImpl, new Boolean(z)}) : iconBackGuideAnimeServiceImpl.createIConBackGuideAnimeProcess(z);
    }

    public static /* synthetic */ boolean access$400(IconBackGuideAnimeServiceImpl iconBackGuideAnimeServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e9151e2a", new Object[]{iconBackGuideAnimeServiceImpl})).booleanValue() : iconBackGuideAnimeServiceImpl.mLastIsUpgradeIcon;
    }

    public static /* synthetic */ boolean access$402(IconBackGuideAnimeServiceImpl iconBackGuideAnimeServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aaa8da30", new Object[]{iconBackGuideAnimeServiceImpl, new Boolean(z)})).booleanValue();
        }
        iconBackGuideAnimeServiceImpl.mLastIsUpgradeIcon = z;
        return z;
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
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        unRegisterDataProcessListener();
        lns lnsVar = this.mIconBackGuideAnimeProcess;
        if (lnsVar == null) {
            return;
        }
        lnsVar.a();
        this.mIconBackGuideAnimeProcess = null;
    }

    @Override // tb.lkq
    /* renamed from: createContainer */
    public ViewGroup mo1092createContainer(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("1c667639", new Object[]{this, context});
        }
        if (this.mRootLayout == null) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.setVisibility(8);
            this.mRootLayout = frameLayout;
        }
        ViewParent parent = this.mRootLayout.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.mRootLayout);
        }
        lns lnsVar = this.mIconBackGuideAnimeProcess;
        if (lnsVar != null) {
            lnsVar.a(context);
        }
        this.mContext = context;
        return this.mRootLayout;
    }

    @Override // tb.lkq
    public void destroyContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a77eae", new Object[]{this});
            return;
        }
        if (this.mContext != null) {
            this.mContext = null;
        }
        if (this.mRootLayout == null) {
            return;
        }
        this.mRootLayout = null;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IIconBackGuideAnimeService
    public void onOutLinkTrigger(String str, Intent intent) {
        lns lnsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a23a8fd", new Object[]{this, str, intent});
        } else if (StringUtils.isEmpty(str) || (lnsVar = this.mIconBackGuideAnimeProcess) == null) {
        } else {
            lnsVar.a(str, intent);
        }
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
        this.mOnDataProcessListener = createDataProcessListener();
        iContainerDataService.addDataProcessListener(this.mOnDataProcessListener);
    }

    private void unRegisterDataProcessListener() {
        IContainerDataService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435b1f44", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null || (aVar = this.mOnDataProcessListener) == null) {
            return;
        }
        iContainerDataService.removeDataProcessListener(aVar);
    }

    private IContainerDataService.a createDataProcessListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.a) ipChange.ipc$dispatch("a962c199", new Object[]{this}) : new IContainerDataService.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.iconbackanimeservice.IconBackGuideAnimeServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f302f74f", new Object[]{this, lliVar});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ce5cd68c", new Object[]{this, lliVar, iContainerDataModel});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void b(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("30b7ed6b", new Object[]{this, lliVar, iContainerDataModel});
                } else if (!IconBackGuideAnimeServiceImpl.access$000(IconBackGuideAnimeServiceImpl.this)) {
                } else {
                    boolean access$100 = IconBackGuideAnimeServiceImpl.access$100(IconBackGuideAnimeServiceImpl.this, iContainerDataModel);
                    if (IconBackGuideAnimeServiceImpl.access$200(IconBackGuideAnimeServiceImpl.this) == null) {
                        IconBackGuideAnimeServiceImpl iconBackGuideAnimeServiceImpl = IconBackGuideAnimeServiceImpl.this;
                        IconBackGuideAnimeServiceImpl.access$202(iconBackGuideAnimeServiceImpl, IconBackGuideAnimeServiceImpl.access$300(iconBackGuideAnimeServiceImpl, access$100));
                        IconBackGuideAnimeServiceImpl iconBackGuideAnimeServiceImpl2 = IconBackGuideAnimeServiceImpl.this;
                        IconBackGuideAnimeServiceImpl.access$402(iconBackGuideAnimeServiceImpl2, IconBackGuideAnimeServiceImpl.access$100(iconBackGuideAnimeServiceImpl2, iContainerDataModel));
                    } else if (access$100 == IconBackGuideAnimeServiceImpl.access$400(IconBackGuideAnimeServiceImpl.this)) {
                    } else {
                        IconBackGuideAnimeServiceImpl.access$200(IconBackGuideAnimeServiceImpl.this).a();
                        IconBackGuideAnimeServiceImpl iconBackGuideAnimeServiceImpl3 = IconBackGuideAnimeServiceImpl.this;
                        IconBackGuideAnimeServiceImpl.access$202(iconBackGuideAnimeServiceImpl3, IconBackGuideAnimeServiceImpl.access$300(iconBackGuideAnimeServiceImpl3, access$100));
                        IconBackGuideAnimeServiceImpl iconBackGuideAnimeServiceImpl4 = IconBackGuideAnimeServiceImpl.this;
                        IconBackGuideAnimeServiceImpl.access$402(iconBackGuideAnimeServiceImpl4, IconBackGuideAnimeServiceImpl.access$100(iconBackGuideAnimeServiceImpl4, iContainerDataModel));
                    }
                }
            }
        };
    }

    private lns createIConBackGuideAnimeProcess(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lns) ipChange.ipc$dispatch("bb703303", new Object[]{this, new Boolean(z)}) : z ? new loa(this.mInfoFlowContext, this.mContext) : new lny(this.mInfoFlowContext, this.mContext);
    }

    private boolean isUpgradeIcon(IContainerDataModel<?> iContainerDataModel) {
        List<?> sections;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e8599cd", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        return (base == null || (sections = base.getSections()) == null || StringUtils.equals(getIconVersion(sections), DOUBLE_ROW_ICON)) ? false : true;
    }

    private String getIconVersion(List<?> list) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce19c8df", new Object[]{this, list});
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if ((obj instanceof SectionModel) && (string = ((SectionModel) obj).getExt().getString(CURRENT_ICON_VERSION)) != null) {
                return string;
            }
        }
        return DOUBLE_ROW_ICON;
    }

    private boolean isIconAnimeOrangeEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7ff78ced", new Object[]{this})).booleanValue() : ldj.a(K_ENABLE_USE_ICON_BACK_ANIME, true);
    }
}

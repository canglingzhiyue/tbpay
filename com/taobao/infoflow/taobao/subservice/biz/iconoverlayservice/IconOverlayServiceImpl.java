package com.taobao.infoflow.taobao.subservice.biz.iconoverlayservice;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.IIconOverlayService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import tb.kge;
import tb.ldf;
import tb.ljs;
import tb.lks;
import tb.lkz;

/* loaded from: classes7.dex */
public class IconOverlayServiceImpl implements IIconOverlayService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "IconOverlayServiceImpl";
    private lkz.a mItemRenderListener;
    private IMainFeedsViewService<?> mMainFeedsViewService;

    static {
        kge.a(-192834502);
        kge.a(-643275384);
    }

    public static /* synthetic */ void access$000(IconOverlayServiceImpl iconOverlayServiceImpl, int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbcabe67", new Object[]{iconOverlayServiceImpl, new Integer(i), view, baseSectionModel});
        } else {
            iconOverlayServiceImpl.hideIconOverlay(i, view, baseSectionModel);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mMainFeedsViewService = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        IMainFeedsViewService<?> iMainFeedsViewService = this.mMainFeedsViewService;
        if (iMainFeedsViewService == null) {
            ldf.d(TAG, "no validate feedsViewService!");
            return;
        }
        lks mo1084getLifeCycleRegister = iMainFeedsViewService.mo1084getLifeCycleRegister();
        if (this.mItemRenderListener == null) {
            this.mItemRenderListener = createOnItemRenderListener();
        }
        mo1084getLifeCycleRegister.a(this.mItemRenderListener);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mMainFeedsViewService;
        if (iMainFeedsViewService == null || this.mItemRenderListener == null) {
            return;
        }
        iMainFeedsViewService.mo1084getLifeCycleRegister().b(this.mItemRenderListener);
    }

    private lkz.a createOnItemRenderListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lkz.a) ipChange.ipc$dispatch("5ec84e8f", new Object[]{this}) : new lkz.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.iconoverlayservice.IconOverlayServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lkz.a
            public void a(int i, View view, BaseSectionModel baseSectionModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e0524b1f", new Object[]{this, new Integer(i), view, baseSectionModel});
                }
            }

            @Override // tb.lkz.a
            public void a(boolean z, int i, BaseSectionModel baseSectionModel, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5ac4f93", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
                }
            }

            @Override // tb.lkz.a
            public void a_(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b34bf30d", new Object[]{this, view});
                }
            }

            @Override // tb.lkz.a
            public void b(int i, View view, BaseSectionModel baseSectionModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c5fda7a0", new Object[]{this, new Integer(i), view, baseSectionModel});
                } else {
                    IconOverlayServiceImpl.access$000(IconOverlayServiceImpl.this, i, view, baseSectionModel);
                }
            }
        };
    }

    private void hideIconOverlay(int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d0467b3", new Object[]{this, new Integer(i), view, baseSectionModel});
        } else if (baseSectionModel == null) {
        } else {
            try {
                if (!TextUtils.equals(getClientCache(baseSectionModel, "iconOverylayVisibility"), "visible")) {
                    return;
                }
                String clientCache = getClientCache(baseSectionModel, "iconOverylayUserId");
                if ((view instanceof ViewGroup) && !TextUtils.isEmpty(clientCache)) {
                    setClientCache(baseSectionModel, "iconOverylayVisibility", "gone");
                    refreshWidgetNode((ViewGroup) view, clientCache);
                }
            } catch (Exception e) {
                ldf.d(TAG, "hide iconOverlay failed!" + e.toString());
            }
        }
    }

    private String getClientCache(BaseSectionModel baseSectionModel, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a4a6c786", new Object[]{this, baseSectionModel, str}) : getClientCacheFromModel(baseSectionModel).getString(str);
    }

    private void setClientCache(BaseSectionModel<?> baseSectionModel, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7aa2918", new Object[]{this, baseSectionModel, str, str2});
        } else {
            getClientCacheFromModel(baseSectionModel).put(str, (Object) str2);
        }
    }

    private JSONObject getClientCacheFromModel(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3ec31ccd", new Object[]{this, baseSectionModel});
        }
        JSONObject ext = baseSectionModel.getExt();
        if (ext == null) {
            ext = new JSONObject();
            baseSectionModel.put("ext", (Object) ext);
        }
        JSONObject jSONObject = ext.getJSONObject("clientCache");
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        ext.put("clientCache", (Object) jSONObject2);
        return jSONObject2;
    }

    private void refreshWidgetNode(ViewGroup viewGroup, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67431f1", new Object[]{this, viewGroup, str});
            return;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof DXRootView) {
                DXWidgetNode queryWidgetNodeByUserId = ((DXRootView) childAt).getExpandWidgetNode().queryWidgetNodeByUserId(str);
                if (queryWidgetNodeByUserId != null) {
                    queryWidgetNodeByUserId.setNeedParse(new DXWidgetRefreshOption.a().a(true).b(true).a());
                    return;
                }
                ldf.d(TAG, "item not found!");
            }
        }
    }
}

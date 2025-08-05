package com.taobao.android.live.plugin.atype.flexalocal.topbar.official;

import android.content.Context;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.live.plugin.atype.flexalocal.officialLive.OfficialLiveEntryFrame;
import com.taobao.android.live.plugin.atype.flexalocal.officialLive.b;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import tb.ddv;
import tb.ddw;
import tb.fvb;
import tb.fve;
import tb.hgs;
import tb.hhs;
import tb.hkk;
import tb.kge;
import tb.nlq;

/* loaded from: classes6.dex */
public class OfficialLiveTopBarEntryFrame extends OfficialLiveEntryFrame implements ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DX_TEMPLATE_DEFAULT_URL = "https://dinamicx.alibabausercontent.com/pub/taolive_officiallive_entry_v2/1702624965993/taolive_officiallive_entry_v2.zip";
    private static final long DX_TEMPLATE_DEFAULT_VERSION = 3;
    private static final String DX_TEMPLATE_NAME = "taolive_officiallive_entry_v2";
    public static final String TAG = "OfficialLiveTopBarEntryFrame";
    private ViewGroup mAvatarLayout;

    static {
        kge.a(1439155855);
        kge.a(191318335);
    }

    public static /* synthetic */ Object ipc$super(OfficialLiveTopBarEntryFrame officialLiveTopBarEntryFrame, String str, Object... objArr) {
        if (str.hashCode() == -309961236) {
            super.onCleanUp();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this}) : TAG;
    }

    public static /* synthetic */ void access$000(OfficialLiveTopBarEntryFrame officialLiveTopBarEntryFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c00c0b7", new Object[]{officialLiveTopBarEntryFrame});
        } else {
            officialLiveTopBarEntryFrame.loadLocal();
        }
    }

    public static /* synthetic */ DXRootView access$100(OfficialLiveTopBarEntryFrame officialLiveTopBarEntryFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("cd758a9f", new Object[]{officialLiveTopBarEntryFrame}) : officialLiveTopBarEntryFrame.mDxRootView;
    }

    public static /* synthetic */ ViewGroup access$200(OfficialLiveTopBarEntryFrame officialLiveTopBarEntryFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("4f2c223c", new Object[]{officialLiveTopBarEntryFrame}) : officialLiveTopBarEntryFrame.mAvatarLayout;
    }

    public static /* synthetic */ DXRootView access$300(OfficialLiveTopBarEntryFrame officialLiveTopBarEntryFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("e5eef55d", new Object[]{officialLiveTopBarEntryFrame}) : officialLiveTopBarEntryFrame.mDxRootView;
    }

    public static /* synthetic */ DXRootView access$400(OfficialLiveTopBarEntryFrame officialLiveTopBarEntryFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("722baabc", new Object[]{officialLiveTopBarEntryFrame}) : officialLiveTopBarEntryFrame.mDxRootView;
    }

    public static /* synthetic */ VideoInfo access$500(OfficialLiveTopBarEntryFrame officialLiveTopBarEntryFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoInfo) ipChange.ipc$dispatch("808908b9", new Object[]{officialLiveTopBarEntryFrame}) : officialLiveTopBarEntryFrame.mVideoInfo;
    }

    public static /* synthetic */ DXRootView access$600(OfficialLiveTopBarEntryFrame officialLiveTopBarEntryFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("8aa5157a", new Object[]{officialLiveTopBarEntryFrame}) : officialLiveTopBarEntryFrame.mDxRootView;
    }

    public OfficialLiveTopBarEntryFrame(Context context, a aVar) {
        super(context, aVar);
        createLocalIfNeed();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.officialLive.OfficialLiveEntryFrame
    public void createDx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("420a0737", new Object[]{this});
            return;
        }
        this.mDxRootView = f.m().createDX(this.mContext, DX_TEMPLATE_NAME);
        if (this.mDxRootView == null) {
            loadLocal();
        }
        if (this.mDxRootView == null) {
            return;
        }
        hhs.a().c().a(this.mContext, this.mDxRootView.getDxTemplateItem(), this.mDxRootView.getData(), 0, (DXRenderOptions) null);
    }

    private void loadLocal() {
        DXResult<DXRootView> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc2f342c", new Object[]{this});
            return;
        }
        DXTemplateItem dXTemplate = getDXTemplate();
        if (hhs.a().c().a(dXTemplate) == null || (b = hhs.a().c().b(this.mContext, dXTemplate)) == null) {
            return;
        }
        this.mDxRootView = b.f11780a;
    }

    private DXTemplateItem getDXTemplate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("1fc40614", new Object[]{this});
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f11925a = DX_TEMPLATE_NAME;
        dXTemplateItem.b = 3L;
        dXTemplateItem.c = DX_TEMPLATE_DEFAULT_URL;
        return dXTemplateItem;
    }

    private void createLocalIfNeed() {
        DinamicXEngine c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7980789", new Object[]{this});
            return;
        }
        this.mDxRootView = f.m().createDX(this.mContext, DX_TEMPLATE_NAME);
        if (this.mDxRootView != null || (c = hhs.a().c()) == null) {
            return;
        }
        final DXTemplateItem dXTemplate = getDXTemplate();
        if (c.a(dXTemplate) != null) {
            return;
        }
        c.b(new fve() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.official.OfficialLiveTopBarEntryFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.fve
            public void onNotificationListener(fvb fvbVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
                } else if (fvbVar == null || fvbVar.f28139a == null || !fvbVar.f28139a.contains(dXTemplate)) {
                } else {
                    OfficialLiveTopBarEntryFrame.access$000(OfficialLiveTopBarEntryFrame.this);
                    if (OfficialLiveTopBarEntryFrame.access$100(OfficialLiveTopBarEntryFrame.this) == null) {
                        return;
                    }
                    OfficialLiveTopBarEntryFrame.this.renderDx();
                }
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.add(dXTemplate);
        c.a(arrayList);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.officialLive.OfficialLiveEntryFrame
    public void renderDx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b74c51", new Object[]{this});
            return;
        }
        inflateViewOnNeed();
        if (!b.a().a(this.mFrameContext, this.mVideoInfo)) {
            return;
        }
        createDx();
        if (this.mDxRootView == null) {
            return;
        }
        ddw.a().a(this);
        hhs.a().a(this.mDxRootView, (JSONObject) JSON.toJSON(this.mVideoInfo), nlq.a(this.mContext));
        ((ViewGroup) this.mContainer).removeAllViews();
        ((ViewGroup) this.mContainer).addView(this.mDxRootView);
        performHandleOfficialViewWidth();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.officialLive.OfficialLiveEntryFrame
    public void updateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b12a895", new Object[]{this});
        } else {
            renderDx();
        }
    }

    private void performHandleOfficialViewWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db108f94", new Object[]{this});
        } else if (!b.a().a(this.mFrameContext, this.mVideoInfo) || this.mAvatarLayout == null || this.mDxRootView == null) {
        } else {
            this.mAvatarLayout.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.topbar.official.OfficialLiveTopBarEntryFrame.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (OfficialLiveTopBarEntryFrame.access$200(OfficialLiveTopBarEntryFrame.this) == null || OfficialLiveTopBarEntryFrame.access$300(OfficialLiveTopBarEntryFrame.this) == null) {
                    } else {
                        int measuredWidth = OfficialLiveTopBarEntryFrame.access$200(OfficialLiveTopBarEntryFrame.this).getMeasuredWidth();
                        int measuredWidth2 = OfficialLiveTopBarEntryFrame.access$400(OfficialLiveTopBarEntryFrame.this).getMeasuredWidth();
                        OfficialLiveTopBarEntryFrame.access$200(OfficialLiveTopBarEntryFrame.this).measure(-2, -2);
                        int measuredWidth3 = OfficialLiveTopBarEntryFrame.access$200(OfficialLiveTopBarEntryFrame.this).getMeasuredWidth();
                        if (measuredWidth3 > measuredWidth2) {
                            DXRenderOptions.a aVar = new DXRenderOptions.a();
                            aVar.a(DXWidgetNode.DXMeasureSpec.a(measuredWidth3, 1073741824));
                            JSONObject jSONObject = (JSONObject) JSON.toJSON(OfficialLiveTopBarEntryFrame.access$500(OfficialLiveTopBarEntryFrame.this));
                            JSONObject jSONObject2 = jSONObject.getJSONObject("officialLiveInfo");
                            if (jSONObject2 == null) {
                                return;
                            }
                            jSONObject2.put("entryWidth", (Object) Integer.valueOf(measuredWidth3));
                            f.m().renderDX(OfficialLiveTopBarEntryFrame.access$600(OfficialLiveTopBarEntryFrame.this), jSONObject, aVar.a());
                        }
                        if (measuredWidth3 >= measuredWidth2) {
                            if (measuredWidth != measuredWidth3) {
                                OfficialLiveTopBarEntryFrame.access$200(OfficialLiveTopBarEntryFrame.this).getLayoutParams().width = measuredWidth3;
                            }
                            if (!hkk.ak() || measuredWidth2 >= d.b(56.0f)) {
                            }
                            OfficialLiveTopBarEntryFrame.access$200(OfficialLiveTopBarEntryFrame.this).getLayoutParams().width = -2;
                            OfficialLiveTopBarEntryFrame.access$200(OfficialLiveTopBarEntryFrame.this).setLayoutParams(OfficialLiveTopBarEntryFrame.access$200(OfficialLiveTopBarEntryFrame.this).getLayoutParams());
                            return;
                        }
                        OfficialLiveTopBarEntryFrame.access$200(OfficialLiveTopBarEntryFrame.this).getLayoutParams().width = measuredWidth2;
                        OfficialLiveTopBarEntryFrame.access$200(OfficialLiveTopBarEntryFrame.this).setLayoutParams(OfficialLiveTopBarEntryFrame.access$200(OfficialLiveTopBarEntryFrame.this).getLayoutParams());
                        if (!hkk.ak()) {
                        }
                    }
                }
            });
        }
    }

    public void setAvatarLayout(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("439f81ab", new Object[]{this, viewGroup});
        } else {
            this.mAvatarLayout = viewGroup;
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.officialLive.OfficialLiveEntryFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        if (!hgs.x() || (viewGroup = this.mAvatarLayout) == null) {
            return;
        }
        viewGroup.getLayoutParams().width = -2;
        ViewGroup viewGroup2 = this.mAvatarLayout;
        viewGroup2.setLayoutParams(viewGroup2.getLayoutParams());
    }
}

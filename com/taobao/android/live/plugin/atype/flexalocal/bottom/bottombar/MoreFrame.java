package com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import tb.ddv;
import tb.hki;
import tb.kge;
import tb.phg;
import tb.pmd;
import tb.pnj;
import tb.pot;
import tb.pqj;

/* loaded from: classes5.dex */
public class MoreFrame extends BaseFrame implements ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EVENT_MEDIAPLATFORM_ADD_PANEL_ICON = "com.taolive.taolive.room.mediaplatform_addPanelIcon";
    public static final String EVENT_MEDIAPLATFORM_REMOVE_PANEL_ICON = "com.taolive.taolive.room.mediaplatform_removePanelIcon";
    private static final String EVENT_SHOW_SCREEN_RECORD_BTN_FRAME = "com.taobao.taolive.room.show_screen_record_btns_frame";
    private static final String TAG = "MoreFrame";
    private AliUrlImageView mAliUrlImageView;
    private View mDefaultIconView;
    private boolean mIsShowGameIcon;
    private View mRootView;

    static {
        kge.a(777101177);
        kge.a(191318335);
    }

    public static /* synthetic */ Object ipc$super(MoreFrame moreFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -309961236) {
            super.onCleanUp();
            return null;
        } else if (hashCode != 91531079) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onViewCreated((View) objArr[0]);
            return null;
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "MoreFrame";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this}) : "more";
    }

    public static /* synthetic */ void access$000(MoreFrame moreFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3a5e30d", new Object[]{moreFrame});
        } else {
            moreFrame.showInteractPanel();
        }
    }

    public MoreFrame(Context context, a aVar) {
        super(context, aVar);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_bottombar_more_layout_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        this.mRootView = view;
        super.onViewCreated(view);
        this.mAliUrlImageView = (AliUrlImageView) view.findViewById(R.id.taolive_bottombar_icon);
        this.mDefaultIconView = view.findViewById(R.id.taolive_bottombar_default);
        ((TUrlImageView) view.findViewById(R.id.taolive_bottombar_more_image)).setImageResource(R.drawable.taolive_icon_more_flexalocal);
        view.setContentDescription("主播互动");
        hki.a(view);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.bottombar.MoreFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                } else {
                    MoreFrame.access$000(MoreFrame.this);
                }
            }
        });
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        updatePanelBtnIcon(null);
        this.mFrameContext.e().a(this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        this.mFrameContext.e().b(this);
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (EVENT_MEDIAPLATFORM_ADD_PANEL_ICON.equals(str)) {
            setPanelBtnIcon((HashMap) obj);
        } else if (EVENT_MEDIAPLATFORM_REMOVE_PANEL_ICON.equals(str)) {
            HashMap<String, String> hashMap = (HashMap) obj;
            hashMap.remove("panelIconUrl");
            setPanelBtnIcon(hashMap);
        } else if (!pot.EVENT_QUALITY_SWITCH_TIPS.equals(str)) {
        } else {
            new pot(this.mContext).a(this.mRootView);
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{EVENT_MEDIAPLATFORM_ADD_PANEL_ICON, EVENT_MEDIAPLATFORM_REMOVE_PANEL_ICON, pot.EVENT_QUALITY_SWITCH_TIPS};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        if (this.mFrameContext != null) {
            return this.mFrameContext.G();
        }
        return null;
    }

    private void setPanelBtnIcon(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d14c99", new Object[]{this, hashMap});
        } else if (hashMap == null) {
        } else {
            String str = hashMap.get("componentName");
            String str2 = hashMap.get("panelIconUrl");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                updatePanelBtnIcon(str2);
                if ("@ali/alivemodx-live-game-entrance".equals(str)) {
                    if (phg.a() != null) {
                        phg.a().a(this.mFrameContext, "Show-gameicon_EXP", (HashMap<String, String>) null);
                    }
                    this.mIsShowGameIcon = true;
                }
            } else {
                updatePanelBtnIcon(null);
                this.mIsShowGameIcon = false;
            }
            String a2 = pqj.a(hashMap);
            pnj m = pmd.a().m();
            m.a("MoreFrame", "setPanelBtnIcon:" + a2);
            if (phg.a() == null) {
                return;
            }
            phg.a().a(this.mFrameContext, "setPanelBtnIcon", hashMap);
        }
    }

    private void updatePanelBtnIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56db1ccb", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.mAliUrlImageView.setVisibility(0);
            this.mDefaultIconView.setVisibility(8);
            this.mAliUrlImageView.setSkipAutoSize(true);
            this.mAliUrlImageView.setImageUrl(str);
        } else {
            this.mAliUrlImageView.setVisibility(8);
            this.mDefaultIconView.setVisibility(0);
        }
    }

    private void showInteractPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95943178", new Object[]{this});
            return;
        }
        this.mFrameContext.e().a("com.taobao.taolive.room.show_screen_record_btns_frame", null, this.mFrameContext.G());
        if (!this.mIsShowGameIcon || phg.a() == null) {
            return;
        }
        phg.a().a(this.mFrameContext, "gameicon_CLK", new String[0]);
    }
}

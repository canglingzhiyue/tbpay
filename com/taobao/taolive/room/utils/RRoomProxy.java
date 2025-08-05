package com.taobao.taolive.room.utils;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.mediaplatform.MediaPlatformFrame;
import com.taobao.taolive.room.mediaplatform.MediaPlatformFrame2;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.ui.fanslevel.H5DynamicSDKFrame;
import com.taobao.taolive.room.ui.model.TBLiveBizDataModel;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import java.util.HashMap;
import java.util.Map;
import tb.dds;
import tb.kge;
import tb.plb;
import tb.plh;
import tb.plj;
import tb.poy;

/* loaded from: classes8.dex */
public class RRoomProxy implements IRRoomProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final RRoomProxy f21751a;

        static {
            kge.a(1789559345);
            f21751a = new RRoomProxy();
        }

        public static /* synthetic */ RRoomProxy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RRoomProxy) ipChange.ipc$dispatch("6e68cd9e", new Object[0]) : f21751a;
        }
    }

    static {
        kge.a(410591);
        kge.a(-263138065);
    }

    public static RRoomProxy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RRoomProxy) ipChange.ipc$dispatch("db7ba834", new Object[0]) : a.a();
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public HashMap<String, String> getConstantsValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9c67ca82", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(IRRoomProxy.PARAM_CHAT_RENDERS_ENHANCE, aw.PARAM_CHAT_RENDERS_ENHANCE);
        hashMap.put(IRRoomProxy.KEY_CHAT_WISH_LIST, aw.KEY_CHAT_WISH_LIST);
        hashMap.put(IRRoomProxy.OPEN_COMMENT, ag.OPEN_COMMENT);
        hashMap.put(IRRoomProxy.CLICK_COMMENT_SEND, ag.CLICK_COMMENT_SEND);
        return hashMap;
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public void trackUtilsCommitTap(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5aede48", new Object[]{this, str, strArr});
        } else {
            ai.b(n.a(), str, strArr);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public void updateNextPageProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a3f1125", new Object[]{this});
        } else {
            ai.c(n.a());
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public String getLiveAndHomeMixSpm() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d3bdf591", new Object[]{this}) : ai.b();
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public boolean userActionManagerHasUserAction(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("50a316aa", new Object[]{this, context, str, str2})).booleanValue() : com.taobao.taolive.room.service.g.a(context).a(str, str2);
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public void userActionManagerAddUserAction(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a9ae3f", new Object[]{this, context, str, str2});
        } else {
            com.taobao.taolive.room.service.g.a(context).b(str, str2);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public void tbLiveContainerManagerNotifyMsg(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de99682", new Object[]{this, str, map});
        } else {
            aq.b(n.a(), str, map);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public String roomDataAdapterGetTopic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("167378d6", new Object[]{this}) : plb.b();
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public AccountInfo roomDataAdapterGetBroadCaster() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AccountInfo) ipChange.ipc$dispatch("5f173ef4", new Object[]{this}) : plb.a();
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public boolean liveDetailMessInfoIsLegal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("896e1677", new Object[]{this})).booleanValue();
        }
        if (n.a() != null && n.a().d() != null) {
            return n.a().d().d();
        }
        return false;
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public dds getLiveDetailMessInfo(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dds) ipChange.ipc$dispatch("e181c0ce", new Object[]{this, aVar});
        }
        if (aVar != null && aVar.d() != null) {
            return aVar.d();
        }
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public String liveDetailMessInfoGetSNSNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce7a7891", new Object[]{this});
        }
        if (n.a() != null && n.a().d() != null) {
            return n.a().d().e();
        }
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public plh getSendMessageListener(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (plh) ipChange.ipc$dispatch("82aa2956", new Object[]{this, context}) : new plj(context, n.a());
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public Map<String, Integer> getRoomRIdMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2128181c", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(IRRoomProxy.R_ID_TAOLIVE_VIDEO_HOLE_IMAGE, Integer.valueOf(R.id.taolive_video_hole_image));
        hashMap.put(IRRoomProxy.R_ID_TAOLIVE_CHATROOM_BCLINK_CONTAINER, Integer.valueOf(R.id.taolive_chatroom_bclink_container));
        hashMap.put(IRRoomProxy.R_ID_TAOLIVE_BTN_HOME, Integer.valueOf(R.id.taolive_btn_home));
        hashMap.put(IRRoomProxy.R_ID_TAOLIVE_OPEN_INTERACT_PANEL_FRAME, Integer.valueOf(R.id.taolive_open_interact_panel_frame));
        hashMap.put(IRRoomProxy.R_ID_TAOLIVE_CLOSE_BTN, Integer.valueOf(R.id.taolive_close_btn));
        hashMap.put(IRRoomProxy.R_ID_TAOLIVE_OPEN_H_5_ROOT_VIEW_FRAME, Integer.valueOf(R.id.taolive_open_h5_root_view_frame));
        hashMap.put(IRRoomProxy.R_ID_TAOLIVE_OPEN_GOODS_FRAME, Integer.valueOf(R.id.taolive_open_goods_frame));
        return hashMap;
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public void showShare(Activity activity, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e315412c", new Object[]{this, activity, new Boolean(z), map});
        } else {
            c.a(activity, z, map);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public boolean enableNewSpm4Shop() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c2c996e2", new Object[]{this})).booleanValue() : aa.c() && (poy.ag(n.a()) || poy.af(n.a()));
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public boolean instanceofTBLiveBizDataModel(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6830b8b9", new Object[]{this, obj})).booleanValue() : obj instanceof TBLiveBizDataModel;
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public boolean liveInteractiveManagerNotNull(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("804162ea", new Object[]{this, obj})).booleanValue() : (obj instanceof TBLiveBizDataModel) && ((TBLiveBizDataModel) obj).liveInteractiveManager != null;
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public boolean platformUtilsShouldOpenOnce(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e7f507b", new Object[]{this, str, str2})).booleanValue() : com.taobao.taolive.room.mediaplatform.h.a(str, str2);
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public BaseFrame createMediaPlatformFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("d2d99121", new Object[]{this, context, new Boolean(z), tBLiveDataModel, aVar}) : new MediaPlatformFrame(context, z, tBLiveDataModel, aVar);
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public BaseFrame createMediaPlatformFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("e10c7013", new Object[]{this, context, new Boolean(z), tBLiveDataModel, aVar}) : new MediaPlatformFrame2(context, z, tBLiveDataModel, aVar);
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public plh createSendMessageListener(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (plh) ipChange.ipc$dispatch("4086629f", new Object[]{this, context, aVar}) : new plj(context, aVar);
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public BaseFrame createH5DynamicSDKFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("47197f4a", new Object[]{this, context, new Boolean(z), tBLiveDataModel, aVar}) : new H5DynamicSDKFrame(context, z, tBLiveDataModel, aVar);
    }

    @Override // com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy
    public ATaoLiveOpenEntity getTaoliveOpenLiveRoomEntity(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ATaoLiveOpenEntity) ipChange.ipc$dispatch("3ab2c27f", new Object[]{this, aVar});
        }
        if (!(aVar instanceof com.taobao.taolive.room.controller2.g)) {
            return null;
        }
        return ((com.taobao.taolive.room.controller2.g) aVar).o();
    }
}

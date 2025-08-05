package com.taobao.android.live.plugin.atype.flexalocal.proxy;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenReplayFrame2;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.schedule.ScheduleFullScreenLiveFrame;
import com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.HashMap;
import java.util.Map;
import tb.hkk;
import tb.kge;

/* loaded from: classes6.dex */
public class FullScreenProxyX implements IFullScreenProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<String, Integer> rIdMap = new HashMap<String, Integer>() { // from class: com.taobao.android.live.plugin.atype.flexalocal.proxy.FullScreenProxyX.1
        {
            put(IFullScreenProxy.R_LAYOUT_TAOLIVE_CLOSE_BTN_LAYOUT, Integer.valueOf(R.layout.taolive_close_btn_layout_flexalocal));
            put(IFullScreenProxy.R_ID_TAOLIVE_ROOM_TOP_MORE_BTN, Integer.valueOf(R.id.taolive_room_top_more_btn));
            put(IFullScreenProxy.R_ID_TAOLIVE_ROOM_TOP_CLOSE_BTN, Integer.valueOf(R.id.taolive_room_top_close_btn));
        }
    };

    static {
        kge.a(283352242);
        kge.a(-409645711);
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public boolean isInstanceOfFullScreenLiveFrame2(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("26ecd109", new Object[]{this, obj})).booleanValue() : obj instanceof FullScreenLiveFrame2;
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public BaseFrame createFullScreenLiveFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("829af46b", new Object[]{this, context, new Boolean(z), tBLiveDataModel, aVar});
        }
        if (hkk.S()) {
            return new ScheduleFullScreenLiveFrame(context, z, tBLiveDataModel, aVar);
        }
        return new FullScreenLiveFrame2(context, z, tBLiveDataModel, aVar);
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public boolean isInstanceOfFullScreenReplayFrame2(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2c0e8944", new Object[]{this, obj})).booleanValue() : obj instanceof FullScreenReplayFrame2;
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public BaseFrame createFullScreenReplayFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseFrame) ipChange.ipc$dispatch("1b9ccb50", new Object[]{this, context, new Boolean(z), tBLiveDataModel, aVar}) : new FullScreenReplayFrame2(context, z, tBLiveDataModel, aVar);
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public boolean isInstanceOfFullScreenFrame(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8a6f1503", new Object[]{this, obj})).booleanValue() : obj instanceof FullScreenFrame;
    }

    @Override // com.taobao.android.live.plugin.proxy.fullscreen.IFullScreenProxy
    public Map<String, Integer> getRealRIdMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("45ea97df", new Object[]{this}) : this.rIdMap;
    }
}

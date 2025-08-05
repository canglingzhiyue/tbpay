package tb;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.taolive.room.controller2.d;
import com.taobao.taolive.room.controller2.e;
import com.taobao.taolive.room.controller2.f;
import com.taobao.taolive.room.controller2.k;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.WatchPlatformListenerEnum;
import com.taobao.taolive.room.openarchitecture.listener.a;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class ffu implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PUBLIC_SUB_LIVE_ROOM_TYPE = "publicSubLiveRoomType";

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f27909a;
    private TaoliveOpenLiveRoom b;
    private pkg c;

    static {
        kge.a(227502052);
        kge.a(61413594);
    }

    public ffu(Activity activity, String str, pla plaVar) {
        a(activity, str, plaVar);
    }

    public ffu(Activity activity, Intent intent) {
        a(activity, intent);
    }

    public void a(Activity activity, String str, pla plaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1ad036f", new Object[]{this, activity, str, plaVar});
            return;
        }
        this.c = pki.a().a(activity, TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_StandardOpenWatch.toString(), (pkf) null, (a) null, new HashMap());
        pki.a().a(this.c);
        this.b = pki.a().b(this.c);
        this.f27909a = pki.a().a(this.c, this.b, activity, str, plaVar);
    }

    public void a(Activity activity, Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d13e9f77", new Object[]{this, activity, intent});
            return;
        }
        HashMap hashMap = new HashMap();
        if (intent != null && (data = intent.getData()) != null && data.getQueryParameter(PUBLIC_SUB_LIVE_ROOM_TYPE) != null) {
            hashMap.put("OpenWatchType", data.getQueryParameter(PUBLIC_SUB_LIVE_ROOM_TYPE));
        }
        this.c = pki.a().a(activity, TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_StandardOpenWatch.toString(), (pkf) null, (a) null, hashMap);
        pki.a().a(this.c);
        this.b = pki.a().b(this.c);
        this.f27909a = pki.a().a(this.c, this.b, activity, intent);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom == null) {
            return;
        }
        taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onCreate, new Object[0]);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public ViewGroup a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("8c7138ad", new Object[]{this}) : this.f27909a;
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
        } else if (this.b == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("onCloseClickListener", onClickListener);
            this.b.callWatchPlatform(WatchPlatformListenerEnum.setClickCloseRoomListener, hashMap);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void b(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04fabb0", new Object[]{this, onClickListener});
        } else if (this.b == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(DataReceiveMonitor.CB_LISTENER, onClickListener);
            this.b.callWatchPlatform(WatchPlatformListenerEnum.setClickMoreListener, hashMap);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(ISmallWindowStrategy iSmallWindowStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa4d14aa", new Object[]{this, iSmallWindowStrategy});
        } else if (this.b == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(DataReceiveMonitor.CB_LISTENER, iSmallWindowStrategy);
            this.b.callWatchPlatform(WatchPlatformListenerEnum.setSmallWindowClickListener, hashMap);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
        } else if (this.b == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("newConfig", configuration);
            this.b.callWatchPlatform(WatchPlatformListenerEnum.onConfigurationChanged, hashMap);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom == null) {
            return;
        }
        taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onStart, new Object[0]);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom == null) {
            return;
        }
        taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onResume, new Object[0]);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom == null) {
            return;
        }
        taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onPause, new Object[0]);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
        } else if (this.b == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("showSmallWindow", String.valueOf(z));
            this.b.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onStop, hashMap);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            g(true);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom == null) {
            return;
        }
        taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onDestroy, new Object[0]);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom == null) {
            return;
        }
        taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.onClickCloseBtn, new Object[0]);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom == null) {
            return;
        }
        taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.onLowMemory, new Object[0]);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom == null) {
            return;
        }
        taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.onTrimMemory, new Object[0]);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        if (this.b == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        Object callWatchPlatform = this.b.callWatchPlatform(WatchPlatformListenerEnum.updateUri, hashMap);
        if (!(callWatchPlatform instanceof Map)) {
            return null;
        }
        return (Map) callWatchPlatform;
    }

    @Override // com.taobao.taolive.room.controller2.d
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom == null) {
            return false;
        }
        return ((Boolean) taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.isDestroyed, new Object[0])).booleanValue();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("keyCode", Integer.valueOf(i));
        hashMap.put("keyEvent", keyEvent);
        return ((Boolean) this.b.callWatchPlatform(WatchPlatformListenerEnum.onKeyDown, hashMap)).booleanValue();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.b == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("success", Boolean.valueOf(z));
            this.b.callWatchPlatform(WatchPlatformListenerEnum.processAddCartAction, hashMap);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom == null) {
            return;
        }
        taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.processGoToDetailAction, new Object[0]);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom == null) {
            return;
        }
        taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.processGoToBulkDetailAction, new Object[0]);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public View b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("18d4778d", new Object[]{this, new Boolean(z)});
        }
        if (this.b == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("top", Boolean.valueOf(z));
        return (View) this.b.callWatchPlatform(WatchPlatformListenerEnum.getUbeeContainer, hashMap);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2864fb4f", new Object[]{this, intent, new Boolean(z)});
        } else if (this.b == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent);
            hashMap.put(aw.PARAM_FORCE_REFRESH, Boolean.valueOf(z));
            this.b.callWatchPlatform(WatchPlatformListenerEnum.refreshByIntent, hashMap);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de1296c", new Object[]{this, fVar});
        } else if (this.b == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("onScrollListener", fVar);
            this.b.callWatchPlatform(WatchPlatformListenerEnum.setOnScrollListener, hashMap);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de0b50d", new Object[]{this, eVar});
        } else if (this.b == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(DataReceiveMonitor.CB_LISTENER, eVar);
            this.b.callWatchPlatform(WatchPlatformListenerEnum.setRoomFinishListener, hashMap);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de36f47", new Object[]{this, kVar});
        } else if (this.b == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("callback", kVar);
            this.b.callWatchPlatform(WatchPlatformListenerEnum.setUTDelegateCallback, hashMap);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom == null) {
            return;
        }
        taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.procResumeForH5Embed, new Object[0]);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom == null) {
            return;
        }
        taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.sendBroadcasterForRecEngine, new Object[0]);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public com.taobao.taolive.sdk.controller.e j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.sdk.controller.e) ipChange.ipc$dispatch("c83a9807", new Object[]{this});
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom == null) {
            return null;
        }
        Object callWatchPlatform = taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.getGlobalContext, new Object[0]);
        if (!(callWatchPlatform instanceof com.taobao.taolive.sdk.controller.e)) {
            return null;
        }
        return (com.taobao.taolive.sdk.controller.e) callWatchPlatform;
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae72241", new Object[]{this, new Boolean(z)});
        } else if (this.b == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("enableAutoShowZoomWindowAbility", Boolean.valueOf(z));
            this.b.callWatchPlatform(WatchPlatformListenerEnum.setEnableAutoShowZoomWindowAbility, hashMap);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public String M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d8450cc", new Object[]{this});
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom == null) {
            return null;
        }
        return (String) taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.getCurRoomIndex, new Object[0]);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public RecyclerView N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("7e9dd54f", new Object[]{this});
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom == null) {
            return null;
        }
        return (RecyclerView) taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.getRecyclerView, new Object[0]);
    }

    @Override // com.taobao.taolive.room.controller2.d
    public boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[]{this})).booleanValue();
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom == null) {
            return false;
        }
        return ((Boolean) taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.isFloatViewShowing, new Object[0])).booleanValue();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9bfae0", new Object[]{this, new Boolean(z)});
        } else if (this.b == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("isClean", Boolean.valueOf(z));
            this.b.callWatchPlatform(WatchPlatformListenerEnum.clearScreen, hashMap);
        }
    }

    @Override // com.taobao.taolive.room.controller2.d
    public boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[]{this})).booleanValue();
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.b;
        if (taoliveOpenLiveRoom == null) {
            return false;
        }
        return ((Boolean) taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.isForceDestroy, new Object[0])).booleanValue();
    }

    @Override // com.taobao.taolive.room.controller2.d
    public void a(Uri uri, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d32ee49f", new Object[]{this, uri, new Boolean(z), new Boolean(z2)});
        } else if (this.b == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("uri", uri);
            hashMap.put(aw.PARAM_FORCE_REFRESH, Boolean.valueOf(z));
            hashMap.put("needUT", Boolean.valueOf(z2));
            this.b.callWatchPlatform(WatchPlatformListenerEnum.refreshByUi, hashMap);
        }
    }
}

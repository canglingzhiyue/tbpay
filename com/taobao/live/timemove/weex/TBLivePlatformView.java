package com.taobao.live.timemove.weex;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.platform.JSGetter;
import com.taobao.android.weex_framework.platform.JSMethod;
import com.taobao.android.weex_framework.platform.WXComponentProp;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.taolive.room.utils.aw;
import io.unicorn.plugin.platform.WeexPlatformView;
import java.util.HashSet;
import tb.kge;
import tb.prs;

/* loaded from: classes7.dex */
public class TBLivePlatformView extends WeexPlatformView implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private c mRealNdView;

    static {
        kge.a(1306486687);
        kge.a(-704790388);
    }

    public static /* synthetic */ Object ipc$super(TBLivePlatformView tBLivePlatformView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -12003312) {
            super.onCreated();
            return null;
        } else if (hashCode != 1056639943) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDispose();
            return null;
        }
    }

    public TBLivePlatformView(Context context, int i) {
        super(context, i);
        prs.a("TBLivePlatformViewApi", "TBLivePlatformView " + this);
        this.mRealNdView = new d(context, i, this);
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff48d810", new Object[]{this});
            return;
        }
        super.onCreated();
        prs.a("TBLivePlatformViewApi", "onCreated:" + this);
        this.mRealNdView.a();
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onDispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3efb0bc7", new Object[]{this});
            return;
        }
        super.onDispose();
        prs.a("TBLivePlatformViewApi", "onDispose: " + this);
        this.mRealNdView.b();
    }

    @JSMethod
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        prs.a("TBLivePlatformViewApi", "play mLiveId:" + this);
        this.mRealNdView.d();
    }

    @JSMethod
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        prs.a("TBLivePlatformViewApi", "stop mLiveId:" + this);
        this.mRealNdView.e();
    }

    @JSMethod
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        prs.a("TBLivePlatformViewApi", "resume mLiveId:" + this);
        this.mRealNdView.f();
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, io.unicorn.plugin.platform.f
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        prs.a("TBLivePlatformViewApi", "getView");
        return this.mRealNdView.c();
    }

    @JSGetter(name = aw.PARAM_PLAY_VIEW_TOKEN)
    public String getPlayerToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41c2c5d7", new Object[]{this});
        }
        prs.a("TBLivePlatformViewApi", "getPlayerToken " + this);
        return this.mRealNdView.g();
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView
    public void onUpdateEvents(HashSet<String> hashSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7615bd25", new Object[]{this, hashSet});
            return;
        }
        prs.a("TBLivePlatformViewApi", "onUpdateEvents " + hashSet + this);
        this.mRealNdView.a(hashSet);
    }

    @WXComponentProp(name = "width")
    public void setWidth(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf5f093", new Object[]{this, new Double(d)});
            return;
        }
        prs.a("TBLivePlatformViewApi", "setWidth " + this);
        this.mRealNdView.a(d);
    }

    @WXComponentProp(name = "height")
    public void setHeight(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde360e", new Object[]{this, new Double(d)});
            return;
        }
        prs.a("TBLivePlatformViewApi", "setWidth " + this);
        this.mRealNdView.b(d);
    }

    @WXComponentProp(name = MusLiveVideo.ATTR_POSTER)
    public void setPoster(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846fd9a0", new Object[]{this, str});
            return;
        }
        prs.a("TBLivePlatformViewApi", "setPoster " + str + this);
        this.mRealNdView.b(str);
    }

    @WXComponentProp(name = "needPM")
    public void setNeedPM(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a36fe8e6", new Object[]{this, str});
            return;
        }
        prs.a("TBLivePlatformViewApi", "setNeedPM " + str + this);
        this.mRealNdView.c(str);
    }

    @WXComponentProp(name = MusLiveVideo.ATTR_MUTE)
    public void setMute(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfa9c5ec", new Object[]{this, str});
            return;
        }
        prs.a("TBLivePlatformViewApi", "WXComponentProp setMuted: " + str);
        this.mRealNdView.d(str);
    }

    @WXComponentProp(name = "liveDataSources")
    public void setMediaInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bec12f01", new Object[]{this, str});
            return;
        }
        prs.a("TBLivePlatformViewApi", "setMediaInfo: " + str);
        this.mRealNdView.e(str);
    }

    @JSMethod
    public void setMuted(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33df7fa", new Object[]{this, str});
            return;
        }
        prs.a("TBLivePlatformViewApi", "JSMethod setMuted: " + str);
        this.mRealNdView.f(str);
    }

    @JSMethod
    public void setPageId(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0994aaf", new Object[]{this, obj});
            return;
        }
        prs.a("TBLivePlatformViewApi", "JSMethod setPageId: " + obj);
        this.mRealNdView.a(obj);
    }

    @JSMethod
    public String getMuted() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4c97ea64", new Object[]{this}) : this.mRealNdView.h();
    }

    @JSGetter(name = aw.PARAM_IGNORE_PV)
    public String ignorePV() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5c65aa1", new Object[]{this});
        }
        prs.a("TBLivePlatformViewApi", "ignorePV ");
        return this.mRealNdView.i();
    }

    @JSMethod
    public void reusePlayer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8d5cb46", new Object[]{this, str});
            return;
        }
        prs.a("TBLivePlatformViewApi", "reusePlayer:" + str);
        this.mRealNdView.a(str);
    }

    @JSMethod
    public void visibilityChanged(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5c4b75d", new Object[]{this, str, str2});
            return;
        }
        prs.a("TBLivePlatformViewApi", "visibilityChanged from weex " + str);
        this.mRealNdView.a(str, str2);
    }

    @JSMethod
    public void subscribePM(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92621818", new Object[]{this, str});
            return;
        }
        prs.a("TBLivePlatformViewApi", "subscribePM:" + str);
        this.mRealNdView.g(str);
    }

    @JSMethod
    public void unsubscribePM(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d718009f", new Object[]{this, str});
            return;
        }
        prs.a("TBLivePlatformViewApi", "unsubscribePM:" + str);
        this.mRealNdView.h(str);
    }

    @JSMethod
    public void unsubscribePMAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7257d3a", new Object[]{this});
            return;
        }
        prs.a("TBLivePlatformViewApi", "unsubscribeAll");
        this.mRealNdView.j();
    }

    @WXComponentProp(name = aw.PARAM_PM_PARAMS)
    public void setPMParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9558116", new Object[]{this, str});
            return;
        }
        prs.a("TBLivePlatformViewApi", "setPMParams");
        this.mRealNdView.i(str);
    }

    @JSMethod
    public void updatePMParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17b8f3d", new Object[]{this, str});
            return;
        }
        prs.a("TBLivePlatformViewApi", "updatePMParams");
        this.mRealNdView.j(str);
    }

    @Override // com.taobao.live.timemove.weex.b
    public void callPareFireEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b9f35d3", new Object[]{this, str});
        } else {
            fireEvent(str);
        }
    }

    @Override // com.taobao.live.timemove.weex.b
    public void callPareFireEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ce76ef", new Object[]{this, str, obj});
        } else {
            fireEvent(str, obj);
        }
    }
}

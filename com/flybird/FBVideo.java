package com.flybird;

import android.content.Context;
import android.graphics.Point;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.util.FBLogger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.uc.webview.export.media.CommandID;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class FBVideo extends FBView implements BirdNestEngine.UiVideoProvider.VideoCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public BirdNestEngine.UiVideoProvider A;
    public HashMap<String, String> B;

    public FBVideo(Context context, FBDocument fBDocument) {
        super(fBDocument);
        this.B = new HashMap<>();
        BirdNestEngine.UiVideoProvider uiVideoProvider = this.mDoc.getEngine().getConfig().getUiVideoProvider();
        this.A = uiVideoProvider;
        FrameLayout.LayoutParams layoutParams = this.v;
        layoutParams.width = -1;
        layoutParams.height = -1;
        setInnerView(uiVideoProvider.createVideoView(context, this));
    }

    public static /* synthetic */ Object ipc$super(FBVideo fBVideo, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1912803358:
                super.onClick((View) objArr[0]);
                return null;
            case 190242413:
                return super.invoke((String) objArr[0], (String) objArr[1]);
            case 1244158581:
                super.updateAttr((String) objArr[0], (String) objArr[1]);
                return null;
            case 1852014070:
                super.doDestroy();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.flybird.FBView
    public void doDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637df6", new Object[]{this});
            return;
        }
        try {
            this.A.destroyVideoView(this.mView);
            super.doDestroy();
        } catch (Throwable th) {
            FBLogger.e(FBView.TAG, th);
        }
    }

    @Override // com.flybird.FBView
    public String invoke(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b56de6d", new Object[]{this, str, str2});
        }
        if (CommandID.getCurrentPosition.equals(str)) {
            return String.valueOf(this.A.getAttribute(getInnerView(), "currentPosition"));
        }
        if (!"paused".equals(str)) {
            return super.invoke(str, str2);
        }
        return ((Boolean) this.A.getAttribute(getInnerView(), "paused")).booleanValue() ? "true" : "false";
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void onCompletion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7313c222", new Object[]{this});
        } else if (isDestroyed()) {
        } else {
            FBDocument.a(this.mDoc, getNode(), "onplayerstatechange", "completed");
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void onError(int i, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4819ff39", new Object[]{this, new Integer(i), str, obj});
        } else if (isDestroyed()) {
        } else {
            FBDocument.a(this.mDoc, getNode(), "onplayerstatechange", "error, code: " + i + ", desc: " + str + ", extra: " + obj);
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void onFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
        } else if (isDestroyed()) {
        } else {
            FBDocument.a(this.mDoc, getNode(), "onplayerstatechange", "finished");
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void onPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad91656", new Object[]{this});
        } else if (isDestroyed()) {
        } else {
            FBDocument.a(this.mDoc, getNode(), "onplayerstatechange", AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PLAYING);
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else if (isDestroyed()) {
        } else {
            FBDocument.a(this.mDoc, getNode(), "onplayerstatechange", "started");
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void onUserAction(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce5133b", new Object[]{this, str, str2});
        } else if (isDestroyed()) {
        } else {
            FBDocument.a(this.mDoc, getNode(), "onuseraction", str2);
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void onViewClicked(Point point, Point point2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5813b0", new Object[]{this, point, point2});
        } else {
            super.onClick(null);
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void playerBuffering() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe3e89c8", new Object[]{this});
        } else if (isDestroyed()) {
        } else {
            FBDocument.a(this.mDoc, getNode(), "onplayerstatechange", "playerBuffering");
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void playerBufferingEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf426e1", new Object[]{this});
        } else if (isDestroyed()) {
        } else {
            FBDocument.a(this.mDoc, getNode(), "onplayerstatechange", "playerBufferingEnd");
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void playerPaused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b46ee876", new Object[]{this});
        } else if (isDestroyed()) {
        } else {
            FBDocument.a(this.mDoc, getNode(), "onplayerstatechange", "paused");
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void playerSeekComplete(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d74b11b", new Object[]{this, new Boolean(z)});
        } else if (isDestroyed()) {
        } else {
            FBDocument.a(this.mDoc, getNode(), "onplayerstatechange", "playerSeekComplete");
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void playerSeeking() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdc0fc50", new Object[]{this});
        } else if (isDestroyed()) {
        } else {
            FBDocument.a(this.mDoc, getNode(), "onplayerstatechange", "playerSeeking");
        }
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiVideoProvider.VideoCallback
    public void playerStopped() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e68e33", new Object[]{this});
        } else if (isDestroyed()) {
        } else {
            FBDocument.a(this.mDoc, getNode(), "onplayerstatechange", DXRecyclerLayout.LOAD_MORE_STOPED);
        }
    }

    @Override // com.flybird.FBView
    public void updateAttr(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a285a75", new Object[]{this, str, str2});
            return;
        }
        this.B.put(str, str2);
        View innerView = getInnerView();
        if (str == null) {
            str = "";
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 114148:
                if (str.equals("src")) {
                    c = 0;
                    break;
                }
                break;
            case 109757585:
                if (str.equals("state")) {
                    c = 1;
                    break;
                }
                break;
            case 1946948128:
                if (str.equals("behaviorInfo")) {
                    c = 2;
                    break;
                }
                break;
            case 2045330211:
                if (str.equals("mutewhenstartplay")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            this.A.loadUri(innerView, this.B);
            this.mDoc.getClass();
            if (!StringUtils.equals(this.B.get("autoplay"), "true")) {
                this.A.prepare(innerView);
            } else {
                this.A.play(innerView);
            }
        } else if (c != 1) {
            if (c != 2 && c != 3) {
                super.updateAttr(str, str2);
                this.A.loadUri(innerView, this.B);
                return;
            }
            this.A.setAttribute(getInnerView(), str, str2);
        } else if ("pause".equals(str2)) {
            this.A.pause(getInnerView());
        } else if (!"resume".equals(str2)) {
        } else {
            this.A.resume(getInnerView());
        }
    }
}

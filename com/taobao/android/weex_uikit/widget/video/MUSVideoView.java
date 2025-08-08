package com.taobao.android.weex_uikit.widget.video;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.img.UIImageDrawable;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import tb.jwr;
import tb.kge;
import tb.sku;

/* loaded from: classes6.dex */
public class MUSVideoView extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean hidePoster;
    private boolean isLoop;
    private boolean isMute;
    private d mCallback;
    private jwr mCreator;
    private int mHeight;
    private boolean mPlayed;
    private View mPosterContainer;
    private int mWidth;
    private boolean posterContained;
    private UIImageDrawable posterDrawable;
    private boolean valid;
    private c videoAdapter;
    private UINode videoNode;

    static {
        kge.a(-1125454308);
    }

    public static /* synthetic */ Object ipc$super(MUSVideoView mUSVideoView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1944670684:
                super.invalidateDrawable((Drawable) objArr[0]);
                return null;
            case -1894755994:
                return new Boolean(super.verifyDrawable((Drawable) objArr[0]));
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 1289754646:
                super.setPadding(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public MUSVideoView(Context context) {
        super(context);
        this.hidePoster = false;
        this.posterContained = false;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue();
        }
        if (drawable != this.posterDrawable) {
            return super.verifyDrawable(drawable);
        }
        return true;
    }

    private void loadPoster(MUSDKInstance mUSDKInstance, String str, String str2, int i, int i2, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7c374c9", new Object[]{this, mUSDKInstance, str, str2, new Integer(i), new Integer(i2), rect});
        } else if (StringUtils.isEmpty(str)) {
            releasePoster(mUSDKInstance);
        } else {
            this.posterDrawable = new UIImageDrawable();
            this.posterDrawable.a(rect);
            this.posterDrawable.setBounds(0, 0, i, i2);
            this.posterDrawable.setCallback(this);
            this.posterDrawable.a(null, mUSDKInstance, str, "", str2, i, i2, MUSImageQuality.AUTO);
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c16ae24", new Object[]{this, drawable});
            return;
        }
        super.invalidateDrawable(drawable);
        View view = this.mPosterContainer;
        if (view == null) {
            return;
        }
        view.invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        UIImageDrawable uIImageDrawable = this.posterDrawable;
        if (uIImageDrawable == null) {
            return;
        }
        uIImageDrawable.setBounds(0, 0, i, i2);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce01816", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.setPadding(i, i2, i3, i4);
        UIImageDrawable uIImageDrawable = this.posterDrawable;
        if (uIImageDrawable == null) {
            return;
        }
        uIImageDrawable.a(new Rect(i, i2, i3, i4));
    }

    private void releasePoster(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c433ec9b", new Object[]{this, mUSDKInstance});
        } else if (this.posterDrawable == null) {
        } else {
            invalidate();
            View view = this.mPosterContainer;
            if (view != null) {
                view.invalidate();
            }
            this.posterDrawable.a(mUSDKInstance);
            this.posterDrawable.setCallback(null);
            this.posterDrawable = null;
            this.posterContained = false;
            this.mPosterContainer = null;
        }
    }

    private void fireEvent(UINode uINode, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b0c3ee9", new Object[]{this, uINode, str, jSONObject});
        } else if (uINode.getInstance() == null || uINode.getInstance().isDestroyed() || StringUtils.isEmpty(str)) {
        } else {
            uINode.getInstance().fireEventOnNode(uINode.getNodeId(), str, jSONObject);
        }
    }

    public void mount(UINode uINode, MUSDKInstance mUSDKInstance, jwr jwrVar, d dVar, int i, int i2, Rect rect, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9744e4ee", new Object[]{this, uINode, mUSDKInstance, jwrVar, dVar, new Integer(i), new Integer(i2), rect, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.isLoop = z;
        this.isMute = z2;
        this.videoNode = uINode;
        reset();
        this.mPlayed = false;
        this.mCreator = jwrVar;
        this.mWidth = i;
        this.mHeight = i2;
        this.mCallback = dVar;
        loadPoster(mUSDKInstance, (String) uINode.getAttribute(MusLiveVideo.ATTR_POSTER), (String) uINode.getAttribute("objectFit"), i, i2, rect);
        this.valid = false;
        this.hidePoster = false;
        this.posterContained = false;
        tryLoadVideo();
    }

    public void hidePoster() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b45a236", new Object[]{this});
        } else if (this.hidePoster) {
        } else {
            this.hidePoster = true;
            invalidate();
            View view = this.mPosterContainer;
            if (view == null) {
                return;
            }
            view.setVisibility(4);
            this.mPosterContainer.invalidate();
        }
    }

    public void showPoster() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de00f231", new Object[]{this});
        } else if (!this.hidePoster) {
        } else {
            this.hidePoster = false;
            invalidate();
            View view = this.mPosterContainer;
            if (view == null) {
                return;
            }
            view.setVisibility(0);
            this.mPosterContainer.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        super.dispatchDraw(canvas);
        UIImageDrawable uIImageDrawable = this.posterDrawable;
        if (uIImageDrawable == null || this.hidePoster || this.posterContained) {
            return;
        }
        uIImageDrawable.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (getChildCount() == 0) {
        } else {
            getChildAt(0).layout(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        if (getChildCount() == 0) {
            return;
        }
        getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - getPaddingTop()) - getPaddingBottom(), 1073741824));
    }

    private void tryLoadVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb9b741", new Object[]{this});
            return;
        }
        jwr jwrVar = this.mCreator;
        if (jwrVar == null || this.valid) {
            return;
        }
        this.valid = true;
        addNewVideo(jwrVar, this.mCallback, (String) this.videoNode.getAttribute("src"), this.isLoop, this.isMute, (String) this.videoNode.getAttribute("videoId"), this.mWidth, this.mHeight);
    }

    private void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else if (this.videoAdapter == null || !this.valid) {
        } else {
            this.mPlayed = false;
            this.valid = false;
            this.mPosterContainer = null;
            this.posterContained = false;
            removeAllViews();
            this.videoAdapter.b();
            this.videoAdapter.a((d) null);
            this.videoAdapter = null;
        }
    }

    private void addNewVideo(jwr jwrVar, d dVar, String str, boolean z, boolean z2, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebc7d3d4", new Object[]{this, jwrVar, dVar, str, new Boolean(z), new Boolean(z2), str2, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.videoAdapter == null) {
            this.videoAdapter = jwrVar.a(getContext());
        }
        this.videoAdapter.a(dVar);
        e eVar = new e((String) this.videoNode.getAttribute("bizFrom"), (String) this.videoNode.getAttribute("contentId"), (JSONObject) this.videoNode.getAttribute("utParams"), (String) this.videoNode.getAttribute("objectFit"), (String) this.videoNode.getAttribute("panoType"));
        eVar.b((String) this.videoNode.getAttribute(sku.KEY_VIDEO_SOURCE));
        eVar.a((Boolean) this.videoNode.getAttribute("controls"));
        eVar.d((Boolean) this.videoNode.getAttribute(MusLiveVideo.ATTR_SHOW_CENTER_PLAY_BTN));
        eVar.b((Boolean) this.videoNode.getAttribute(MusLiveVideo.ATTR_SHOW_FULLSCREEN_BTN));
        eVar.c((Boolean) this.videoNode.getAttribute(MusLiveVideo.ATTR_SHOW_PLAY_BTN));
        eVar.e((Boolean) this.videoNode.getAttribute(MusLiveVideo.ATTR_SHOW_MUTE_BTN));
        eVar.f((Boolean) this.videoNode.getAttribute("showPlayRateBtn"));
        eVar.g((Boolean) this.videoNode.getAttribute("enablePan"));
        eVar.a((String) this.videoNode.getAttribute(MusLiveVideo.ATTR_PLAY_SCENES));
        this.videoAdapter.a(str, z, z2, str2, eVar, i, i2);
        View a2 = this.videoAdapter.a();
        if (a2 == null) {
            throw new RuntimeException("IMUSVideoAdapter mustn't return null");
        }
        if (a2.getParent() != null) {
            ((ViewGroup) a2.getParent()).removeView(a2);
        }
        addView(a2);
        this.mPosterContainer = a2.findViewWithTag(Boolean.TRUE);
        View view = this.mPosterContainer;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(this.posterDrawable);
        this.posterContained = true;
    }

    public void unmount(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c637732f", new Object[]{this, mUSDKInstance});
            return;
        }
        this.mWidth = 0;
        this.mHeight = 0;
        this.mCreator = null;
        this.mCallback = null;
        this.videoNode = null;
        this.mPosterContainer = null;
        reset();
        releasePoster(mUSDKInstance);
    }

    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        tryLoadVideo();
        c cVar = this.videoAdapter;
        if (cVar == null) {
            return;
        }
        this.mPlayed = true;
        cVar.c();
    }

    public void toggleFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c2dab56", new Object[]{this});
            return;
        }
        c cVar = this.videoAdapter;
        if (cVar == null) {
            return;
        }
        cVar.e();
    }

    public void onPlayed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4331dd19", new Object[]{this});
        } else {
            this.mPlayed = true;
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        c cVar = this.videoAdapter;
        if (cVar == null) {
            return;
        }
        cVar.d();
    }

    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        c cVar = this.videoAdapter;
        if (cVar == null) {
            return;
        }
        cVar.a(i);
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else if (this.videoAdapter == null) {
        } else {
            if (this.mPlayed) {
                reset();
                tryLoadVideo();
            }
            showPoster();
        }
    }

    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        c cVar = this.videoAdapter;
        if (cVar == null) {
            return;
        }
        this.isMute = z;
        cVar.a(z);
    }

    public void setFov(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97af191e", new Object[]{this, jSONObject});
            return;
        }
        c cVar = this.videoAdapter;
        if (cVar == null || jSONObject == null) {
            return;
        }
        cVar.a(jSONObject);
    }

    public JSONObject getFov() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("24f3d1be", new Object[]{this});
        }
        c cVar = this.videoAdapter;
        if (cVar != null) {
            return cVar.f();
        }
        return null;
    }
}

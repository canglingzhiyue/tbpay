package com.taobao.bootimage.interact.view;

import android.content.Context;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import tb.kej;
import tb.kge;
import tb.nwp;

/* loaded from: classes6.dex */
public class BootImageInteractBaseView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BOOTIAMGE_INTERACT_COUPON_RECEIVED_IMAGE = "https://gw.alicdn.com/imgextra/i2/O1CN0197arjn292Axjvmcqf_!!6000000008009-2-tps-180-180.png";
    public static final String BOOTIMAGE_INTERACT_COUPON_DEFAULT_IMAGE = "https://gw.alicdn.com/imgextra/i3/O1CN01dpoH4e1itJHwnu6Bk_!!6000000004470-2-tps-180-180.png";
    public static final String BOOTIMAGE_INTERACT_ITEM_DEFAULT_IMAGE = "https://gw.alicdn.com/imgextra/i3/O1CN016e9lgF20HRco2zQib_!!6000000006824-2-tps-180-180.png";
    private static final String TAG = "BootImageInteractBaseView";
    public static final int TYPE_CLICK = 7;
    public static final String TYPE_CUSTOM_INTERACT = "1";
    public static final String TYPE_DEFAULT_INTERACT = "0";
    public static final int TYPE_INTERACT_FAIL = 10;
    public static final int TYPE_INTERACT_SUCCESS = 9;
    public static final int TYPE_POP_INTERACT_FAIL = 15;
    public static final int TYPE_POP_INTERACT_SUCCESS = 14;
    public static final int TYPE_SLIDE_FAIL = 11;
    public static final int TYPE_SLIDE_SUCCESS = 8;
    private nwp mBootImageContentListener;
    public BootImageInfo mBootImageInfo;
    public Context mContext;
    public boolean mShowed;
    public String showInteractCardImage;
    public String showInteractGuideImage;

    static {
        kge.a(684165323);
    }

    public void switchToReceived() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c9f057", new Object[]{this});
        }
    }

    public BootImageInteractBaseView(Context context, BootImageInfo bootImageInfo) {
        super(context);
        this.showInteractGuideImage = "";
        this.showInteractCardImage = "";
        this.mContext = context;
        this.mBootImageInfo = bootImageInfo;
        setVisibility(8);
    }

    public void startInteract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcba53f", new Object[]{this});
        } else {
            kej.a(TAG, "startInteract");
        }
    }

    public void stopInteract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8e78df", new Object[]{this});
        } else {
            kej.a(TAG, "stopInteract");
        }
    }

    public boolean show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebbb9908", new Object[]{this})).booleanValue();
        }
        if (this.mBootImageInfo == null) {
            kej.a(TAG, "show fail: bootImageInfo_null");
            this.mShowed = false;
            return false;
        }
        if (this.mShowed) {
            kej.a(TAG, "already show");
            close();
        }
        kej.a(TAG, "show success");
        this.mShowed = true;
        return true;
    }

    public boolean showWithAnim(Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8767dccb", new Object[]{this, animationListener})).booleanValue() : show();
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        kej.a(TAG, "close");
        this.mShowed = false;
    }

    public String getShowInteractGuideImage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aaf91491", new Object[]{this}) : this.showInteractGuideImage;
    }

    public void setShowInteractGuideImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daa3d305", new Object[]{this, str});
        } else {
            this.showInteractGuideImage = str;
        }
    }

    public String getShowInteractCardImage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f1f40d7", new Object[]{this}) : this.showInteractCardImage;
    }

    public void setShowInteractCardImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b2407e7", new Object[]{this, str});
        } else {
            this.showInteractCardImage = str;
        }
    }

    public nwp getBootImageContentListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nwp) ipChange.ipc$dispatch("bc6713fe", new Object[]{this}) : this.mBootImageContentListener;
    }

    public void setBootImageContentListener(nwp nwpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("618c07d6", new Object[]{this, nwpVar});
        } else {
            this.mBootImageContentListener = nwpVar;
        }
    }
}

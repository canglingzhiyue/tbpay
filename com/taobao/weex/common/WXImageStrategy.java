package com.taobao.weex.common;

import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class WXImageStrategy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int blurRadius;
    public ImageListener imageListener;
    public String instanceId;
    @Deprecated
    public boolean isClipping;
    public boolean isSharpen;
    public String placeHolder;

    /* loaded from: classes9.dex */
    public interface ImageListener {
        void onImageFinish(String str, ImageView imageView, boolean z, Map map);
    }

    static {
        kge.a(-1253316572);
    }

    public WXImageStrategy() {
    }

    public WXImageStrategy(String str) {
        this.instanceId = str;
    }

    public ImageListener getImageListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageListener) ipChange.ipc$dispatch("d973c1d6", new Object[]{this}) : this.imageListener;
    }

    public void setImageListener(ImageListener imageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42e4db74", new Object[]{this, imageListener});
        } else {
            this.imageListener = imageListener;
        }
    }
}

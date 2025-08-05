package com.taobao.android.detail2.core.framework.base.weex;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.jwi;
import tb.jwl;
import tb.kge;

/* loaded from: classes5.dex */
public class VideoWeexModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "newdetail_video";

    static {
        kge.a(55292120);
    }

    public static /* synthetic */ Object ipc$super(VideoWeexModule videoWeexModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public VideoWeexModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod
    public void getSnapshotImage(float f, com.taobao.android.weex_framework.bridge.b bVar) {
        TextureView a2;
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d347c68f", new Object[]{this, new Float(f), bVar});
            return;
        }
        View findVideoParent = findVideoParent(getInstance().getRenderView().getParent());
        Context uIContext = getInstance().getUIContext();
        if (!(findVideoParent instanceof ViewGroup) || (a2 = jwi.a((ViewGroup) findVideoParent)) == null || uIContext == null) {
            return;
        }
        int i = uIContext.getResources().getDisplayMetrics().widthPixels;
        if (a2.getWidth() >= i) {
            bitmap = a2.getBitmap(i, a2.getHeight());
        } else {
            bitmap = a2.getBitmap();
        }
        if (bitmap == null) {
            return;
        }
        String str = "video" + System.currentTimeMillis();
        jwl.a().a(str, bitmap);
        HashMap hashMap = new HashMap(1);
        hashMap.put("fileName", str);
        bVar.a(MUSValue.ofJSON(hashMap));
    }

    private View findVideoParent(ViewParent viewParent) {
        ViewGroup viewGroup;
        int id;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8c30dc97", new Object[]{this, viewParent});
        }
        if (viewParent == null) {
            return null;
        }
        if ((viewParent instanceof ViewGroup) && ((id = (viewGroup = (ViewGroup) viewParent).getId()) == R.id.main_render_fl || id == 16908290)) {
            View findViewById = viewGroup.findViewById(R.id.mainpic_layout);
            if (findViewById != null && findViewById.getVisibility() != 8) {
                return findViewById.findViewById(R.id.video_host);
            }
            return viewGroup.findViewById(R.id.video_host);
        }
        return findVideoParent(viewParent.getParent());
    }
}

package com.taobao.search.musie.img;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_uikit.widget.img.Image;
import com.taobao.media.MediaConstant;
import com.taobao.search.sf.MainSearchResultActivity;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class LowDeviceImage extends Image {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-590946439);
    }

    public static /* synthetic */ Object ipc$super(LowDeviceImage lowDeviceImage, String str, Object... objArr) {
        if (str.hashCode() == -285278287) {
            super.onMount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public LowDeviceImage(int i) {
        super(i);
    }

    @Override // com.taobao.android.weex_uikit.widget.img.Image, com.taobao.android.weex_uikit.ui.aa
    /* renamed from: onCreateMountContent */
    public Object mo1225onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context}) : new b();
    }

    @Override // com.taobao.android.weex_uikit.widget.img.Image, com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        b bVar = null;
        if (!((mUSDKInstance != null ? mUSDKInstance.getUIContext() : null) instanceof MainSearchResultActivity)) {
            if (obj instanceof b) {
                bVar = obj;
            }
            b bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.k();
            }
        }
        super.onMount(mUSDKInstance, obj);
    }

    /* loaded from: classes7.dex */
    public static final class a extends com.taobao.android.weex_uikit.ui.b<LowDeviceImage> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1985263495);
        }

        @Override // com.taobao.android.weex_framework.bridge.a
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }

        @Override // com.taobao.android.weex_framework.ui.l
        public /* synthetic */ INode a(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (INode) ipChange.ipc$dispatch("91d13828", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2}) : b(mUSDKInstance, i, mUSProps, mUSProps2);
        }

        public LowDeviceImage b(MUSDKInstance instance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LowDeviceImage) ipChange.ipc$dispatch("edae91da", new Object[]{this, instance, new Integer(i), mUSProps, mUSProps2});
            }
            q.c(instance, "instance");
            LowDeviceImage lowDeviceImage = new LowDeviceImage(i);
            lowDeviceImage.setInstance(instance);
            if (mUSProps != null) {
                lowDeviceImage.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                lowDeviceImage.updateAttrs(mUSProps2);
            }
            return lowDeviceImage;
        }
    }
}

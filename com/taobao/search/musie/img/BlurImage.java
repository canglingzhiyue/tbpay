package com.taobao.search.musie.img;

import android.content.Context;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.search.common.util.r;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.nia;

/* loaded from: classes7.dex */
public final class BlurImage extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1386660500);
    }

    public static /* synthetic */ Object ipc$super(BlurImage blurImage, String str, Object... objArr) {
        if (str.hashCode() == -285278287) {
            super.onMount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public BlurImage(int i) {
        super(i);
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    /* renamed from: onCreateMountContent */
    public Object mo1225onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context}) : new TUrlImageView(context);
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onMount(mUSDKInstance, obj);
        updateSrc();
        updateObjectFit();
    }

    private final void updateSrc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32534b62", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = (TUrlImageView) getMountContent();
        String str = (String) getAttribute("src");
        PhenixOptions phenixOptions = new PhenixOptions();
        nia[] niaVarArr = new nia[1];
        MUSDKInstance blurImage = getInstance();
        if (blurImage == null) {
            q.a();
        }
        niaVarArr[0] = new com.taobao.phenix.compat.effects.b(blurImage.getUIContext(), r.bW());
        tUrlImageView.setImageUrl(str, phenixOptions.bitmapProcessors(niaVarArr));
    }

    private final void updateObjectFit() {
        ImageView.ScaleType scaleType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa728590", new Object[]{this});
            return;
        }
        String str = (String) getAttribute("objectFit");
        Object mountContent = getMountContent();
        q.a(mountContent, "getMountContent<TUrlImageView>()");
        TUrlImageView tUrlImageView = (TUrlImageView) mountContent;
        if (str == null) {
            scaleType = ImageView.ScaleType.FIT_XY;
        } else {
            int hashCode = str.hashCode();
            if (hashCode == 3143043) {
                if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_fill)) {
                    scaleType = ImageView.ScaleType.FIT_XY;
                }
                scaleType = ImageView.ScaleType.FIT_XY;
            } else if (hashCode != 94852023) {
                if (hashCode == 951526612 && str.equals("contain")) {
                    scaleType = ImageView.ScaleType.FIT_CENTER;
                }
                scaleType = ImageView.ScaleType.FIT_XY;
            } else {
                if (str.equals("cover")) {
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                scaleType = ImageView.ScaleType.FIT_XY;
            }
        }
        tUrlImageView.setScaleType(scaleType);
    }

    @MUSNodeProp(name = "src")
    public final void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
        } else {
            setAttribute("src", str);
        }
    }

    @MUSNodeProp(name = "src", refresh = true)
    public final void refreshSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae43deda", new Object[]{this, str});
        } else {
            updateSrc();
        }
    }

    @MUSNodeProp(name = "objectFit")
    public final void setObjectFit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cbbb4a1", new Object[]{this, str});
        } else {
            setAttribute("objectFit", str);
        }
    }

    @MUSNodeProp(name = "objectFit", refresh = true)
    public final void refreshObjectFit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3e4f08", new Object[]{this, str});
        } else {
            updateObjectFit();
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this}) : UINodeType.VIEW;
    }
}

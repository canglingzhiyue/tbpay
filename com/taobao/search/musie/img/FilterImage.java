package com.taobao.search.musie.img;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.img.Image;
import com.taobao.media.MediaConstant;
import tb.kge;

/* loaded from: classes7.dex */
public class FilterImage extends Image {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ATTR_COLOR_FILTER = "colorFilter";

    static {
        kge.a(-1669875973);
    }

    public static /* synthetic */ Object ipc$super(FilterImage filterImage, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -285278287) {
            super.onMount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else if (hashCode == -46368733) {
            super.onRefreshAttribute((UINode) objArr[0], objArr[1], (String) objArr[2], objArr[3]);
            return null;
        } else if (hashCode != 2146603619) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.onUpdateAttr((UINode) objArr[0], (String) objArr[1], (MUSValue) objArr[2]));
        }
    }

    public FilterImage(int i) {
        super(i);
    }

    @Override // com.taobao.android.weex_uikit.widget.img.Image, com.taobao.android.weex_uikit.ui.aa
    /* renamed from: onCreateMountContent */
    public Object mo1225onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context}) : new com.taobao.search.musie.img.a();
    }

    @Override // com.taobao.android.weex_uikit.widget.img.Image, com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        refreshColorFilter((com.taobao.search.musie.img.a) obj, getAttribute(ATTR_COLOR_FILTER));
        super.onMount(mUSDKInstance, obj);
    }

    @Override // com.taobao.android.weex_uikit.widget.img.Image, com.taobao.android.weex_uikit.ui.UINode
    public boolean onUpdateAttr(UINode uINode, String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ff29263", new Object[]{this, uINode, str, mUSValue})).booleanValue();
        }
        if (super.onUpdateAttr(uINode, str, mUSValue)) {
            return true;
        }
        if (!TextUtils.equals(str, ATTR_COLOR_FILTER)) {
            return false;
        }
        String stringValue = mUSValue.getStringValue();
        if (TextUtils.isEmpty(stringValue)) {
            setAttribute(ATTR_COLOR_FILTER, null);
            return true;
        }
        try {
            uINode.setAttribute(ATTR_COLOR_FILTER, Integer.valueOf(com.taobao.android.weex_uikit.util.b.a(stringValue)));
        } catch (Exception unused) {
            g.d("colorFilter value is invalid " + stringValue);
            uINode.setAttribute(ATTR_COLOR_FILTER, null);
        }
        return true;
    }

    @Override // com.taobao.android.weex_uikit.widget.img.Image, com.taobao.android.weex_uikit.ui.UINode
    public void onRefreshAttribute(UINode uINode, Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3c7823", new Object[]{this, uINode, obj, str, obj2});
            return;
        }
        super.onRefreshAttribute(uINode, obj, str, obj2);
        if (!TextUtils.equals(str, ATTR_COLOR_FILTER)) {
            return;
        }
        refreshColorFilter((com.taobao.search.musie.img.a) obj, obj2);
    }

    private void refreshColorFilter(com.taobao.search.musie.img.a aVar, Object obj) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1384ffd", new Object[]{this, aVar, obj});
        } else if (aVar == null) {
        } else {
            if (obj instanceof Integer) {
                i = ((Integer) obj).intValue();
            }
            aVar.b(i);
        }
    }

    /* loaded from: classes7.dex */
    public static class a extends com.taobao.android.weex_uikit.ui.b<FilterImage> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(907283383);
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

        public FilterImage b(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FilterImage) ipChange.ipc$dispatch("b0cda9a8", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            FilterImage filterImage = new FilterImage(i);
            filterImage.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                filterImage.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                filterImage.updateAttrs(mUSProps2);
            }
            return filterImage;
        }
    }
}

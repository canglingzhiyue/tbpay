package com.taobao.oversea.baobao.view;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.oversea.baobao.c;
import com.taobao.oversea.baobao.d;
import java.util.Map;

/* loaded from: classes7.dex */
public class MSProgress extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPONENT_TYPE = "tmgbaobaoprogress";
    private BaobaoProgress mRootView;

    public static /* synthetic */ Object ipc$super(MSProgress mSProgress, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -940796597) {
            super.unmount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else if (hashCode == -285278287) {
            super.onMount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else if (hashCode != -142946533) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.onUpdateAttr((String) objArr[0], (MUSValue) objArr[1]));
        }
    }

    public static /* synthetic */ BaobaoProgress access$000(MSProgress mSProgress) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaobaoProgress) ipChange.ipc$dispatch("bd82e1b7", new Object[]{mSProgress}) : mSProgress.mRootView;
    }

    public MSProgress(int i) {
        super(i);
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    /* renamed from: onCreateMountContent */
    public Object mo1225onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context});
        }
        BaobaoProgress build = BaobaoProgress.build(context);
        d.a().a(MSProgress.class.getName(), this.mRootView);
        try {
            build.init((Map) JSON.parse(((MUSValue) getAttribute("data")).convertToString()));
        } catch (Exception unused) {
        }
        return build;
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        this.mRootView = (BaobaoProgress) obj;
        super.onMount(mUSDKInstance, obj);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode, com.taobao.android.weex_uikit.ui.aa
    public void unmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ec954b", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.unmount(mUSDKInstance, obj);
        this.mRootView = null;
        d.a().a(MSProgress.class.getName());
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean onUpdateAttr(String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f77acf1b", new Object[]{this, str, mUSValue})).booleanValue();
        }
        try {
            if (str.equals("data")) {
                setAttribute(str, mUSValue);
                if (this.mRootView != null) {
                    final Map map = (Map) JSON.parse(mUSValue.convertToString());
                    c.a().a(new Runnable() { // from class: com.taobao.oversea.baobao.view.MSProgress.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                if (MSProgress.access$000(MSProgress.this) == null) {
                                    return;
                                }
                                MSProgress.access$000(MSProgress.this).update(map);
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
                return true;
            }
            return super.onUpdateAttr(str, mUSValue);
        } catch (Exception unused) {
            return super.onUpdateAttr(str, mUSValue);
        }
    }
}

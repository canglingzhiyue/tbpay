package com.taobao.android.weex_uikit.widget.slide;

import android.content.Context;
import android.support.v4.view.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_framework.util.k;
import com.taobao.android.weex_framework.util.m;
import com.taobao.android.weex_framework.util.o;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.android.weex_uikit.widget.slide.a;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class BaseSlide extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, Object> ATTR_DEF_MAP;
    public a.C0625a currentIndex;
    public SlideDelegateNode delegateNode;
    public ViewPager.OnPageChangeListener pageListener;

    @Override // com.taobao.android.weex_uikit.ui.aa
    public boolean canPreallocate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ad6217b", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean isGenerated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95a1590", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public int poolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bdc9c37", new Object[]{this})).intValue();
        }
        return 5;
    }

    public static /* synthetic */ MUSValue access$000(BaseSlide baseSlide, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("11e5a78b", new Object[]{baseSlide, mUSValueArr, new Integer(i)}) : baseSlide.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$100(BaseSlide baseSlide, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("7662722a", new Object[]{baseSlide, mUSValueArr, new Integer(i)}) : baseSlide.getArgument(mUSValueArr, i);
    }

    static {
        kge.a(-51146609);
        HashMap hashMap = new HashMap();
        ATTR_DEF_MAP = hashMap;
        hashMap.put(Constants.Name.SCROLLABLE, true);
        ATTR_DEF_MAP.put("infinite", true);
        ATTR_DEF_MAP.put("autoplay", false);
        ATTR_DEF_MAP.put("index", 0);
        ATTR_DEF_MAP.put(Constants.Name.INTERVAL, 1);
        ATTR_DEF_MAP.put("previousMargin", 0);
        ATTR_DEF_MAP.put("nextMargin", 0);
    }

    public BaseSlide(int i) {
        super(i);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public Object getDefaultAttribute(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("acae82d0", new Object[]{this, str}) : ATTR_DEF_MAP.get(str);
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    /* renamed from: onCreateMountContent */
    public Object mo1225onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context}) : com.taobao.android.weex_uikit.widget.slide.a.a(context);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onNodeCreate(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78938224", new Object[]{this, uINode});
            return;
        }
        m mVar = new m();
        m mVar2 = new m();
        m mVar3 = new m();
        com.taobao.android.weex_uikit.widget.slide.a.a(uINode, mVar, mVar2, mVar3);
        if (mVar.a()) {
            this.delegateNode = (SlideDelegateNode) mVar.b();
        }
        if (mVar2.a()) {
            this.currentIndex = (a.C0625a) mVar2.b();
        }
        if (!mVar3.a()) {
            return;
        }
        this.pageListener = (ViewPager.OnPageChangeListener) mVar3.b();
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onBindInstance(UINode uINode, MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("362d97e6", new Object[]{this, uINode, mUSDKInstance});
        } else {
            com.taobao.android.weex_uikit.widget.slide.a.a(uINode, mUSDKInstance, this.delegateNode);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
        } else {
            com.taobao.android.weex_uikit.widget.slide.a.a(this, mUSDKInstance, (SlideContainer) obj, this.delegateNode, this.pageListener, this.currentIndex);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
        } else {
            com.taobao.android.weex_uikit.widget.slide.a.a(this, mUSDKInstance, (SlideContainer) obj, this.pageListener);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void postCollectBatchTask(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27c658d", new Object[]{this, list});
        } else {
            com.taobao.android.weex_uikit.widget.slide.a.a(this, list, this.delegateNode);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onDispatchMethod(UINode uINode, String str, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d011af1", new Object[]{this, uINode, str, mUSValueArr});
            return;
        }
        char c = 65535;
        if (str.hashCode() == -402165208 && str.equals("scrollTo")) {
            c = 0;
        }
        if (c != 0) {
            return;
        }
        scrollTo(uINode, mUSValueArr);
    }

    public void scrollTo(final UINode uINode, final MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba879fa9", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_uikit.widget.slide.BaseSlide.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        com.taobao.android.weex_uikit.widget.slide.a.a(uINode, ((Integer) k.a(BaseSlide.this.getInstance(), null, Integer.TYPE, BaseSlide.access$000(BaseSlide.this, mUSValueArr, 0))).intValue(), ((Boolean) k.a(BaseSlide.this.getInstance(), null, Boolean.TYPE, BaseSlide.access$100(BaseSlide.this, mUSValueArr, 1))).booleanValue());
                    }
                }
            });
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
        if (r9.equals("nextMargin") != false) goto L11;
     */
    @Override // com.taobao.android.weex_uikit.ui.UINode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onUpdateAttr(com.taobao.android.weex_uikit.ui.UINode r8, java.lang.String r9, com.taobao.android.weex_framework.MUSValue r10) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.weex_uikit.widget.slide.BaseSlide.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 3
            r3 = 2
            r4 = 4
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L22
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r5] = r7
            r1[r6] = r8
            r1[r3] = r9
            r1[r2] = r10
            java.lang.String r8 = "7ff29263"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L22:
            r0 = -1
            int r1 = r9.hashCode()
            switch(r1) {
                case -1453344127: goto L73;
                case -1306084975: goto L69;
                case -202057851: goto L5e;
                case 66669991: goto L53;
                case 100346066: goto L49;
                case 173173268: goto L3f;
                case 570418373: goto L35;
                case 1439562083: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L7c
        L2b:
            java.lang.String r1 = "autoplay"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L7c
            r2 = 0
            goto L7d
        L35:
            java.lang.String r1 = "interval"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L7c
            r2 = 1
            goto L7d
        L3f:
            java.lang.String r1 = "infinite"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L7c
            r2 = 5
            goto L7d
        L49:
            java.lang.String r1 = "index"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L7c
            r2 = 4
            goto L7d
        L53:
            java.lang.String r1 = "scrollable"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L7c
            r2 = 7
            goto L7d
        L5e:
            java.lang.String r1 = "previousMargin"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L7c
            r2 = 2
            goto L7d
        L69:
            java.lang.String r1 = "effect"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L7c
            r2 = 6
            goto L7d
        L73:
            java.lang.String r1 = "nextMargin"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L7c
            goto L7d
        L7c:
            r2 = -1
        L7d:
            switch(r2) {
                case 0: goto L9d;
                case 1: goto L99;
                case 2: goto L95;
                case 3: goto L91;
                case 4: goto L8d;
                case 5: goto L89;
                case 6: goto L85;
                case 7: goto L81;
                default: goto L80;
            }
        L80:
            return r5
        L81:
            r7.setScrollable(r8, r10)
            return r6
        L85:
            r7.setEffect(r8, r10)
            return r6
        L89:
            r7.setInfinite(r8, r10)
            return r6
        L8d:
            r7.setIndex(r8, r10)
            return r6
        L91:
            r7.setNextMargin(r8, r10)
            return r6
        L95:
            r7.setPreviousMargin(r8, r10)
            return r6
        L99:
            r7.setInterval(r8, r10)
            return r6
        L9d:
            r7.setAutoPlay(r8, r10)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.slide.BaseSlide.onUpdateAttr(com.taobao.android.weex_uikit.ui.UINode, java.lang.String, com.taobao.android.weex_framework.MUSValue):boolean");
    }

    public void setAutoPlay(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca058a9", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) k.a(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        com.taobao.android.weex_uikit.widget.slide.a.a(uINode, z);
    }

    public void setInterval(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa543fa7", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            i = ((Integer) k.a(getInstance(), null, Integer.TYPE, mUSValue)).intValue();
        }
        com.taobao.android.weex_uikit.widget.slide.a.a(uINode, i);
    }

    public void setPreviousMargin(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de9e67", new Object[]{this, uINode, mUSValue});
        } else {
            com.taobao.android.weex_uikit.widget.slide.a.a(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setNextMargin(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a0bfdeb", new Object[]{this, uINode, mUSValue});
        } else {
            com.taobao.android.weex_uikit.widget.slide.a.b(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setIndex(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93d157e", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            i = ((Integer) k.a(getInstance(), null, Integer.TYPE, mUSValue)).intValue();
        }
        com.taobao.android.weex_uikit.widget.slide.a.b(uINode, i);
    }

    public void setInfinite(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("576cf938", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) k.a(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        com.taobao.android.weex_uikit.widget.slide.a.b(uINode, z);
    }

    public void setEffect(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58a55fdb", new Object[]{this, uINode, mUSValue});
        } else {
            com.taobao.android.weex_uikit.widget.slide.a.a(uINode, (JSONObject) k.a(getInstance(), null, JSONObject.class, mUSValue));
        }
    }

    public void setScrollable(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1265185", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) k.a(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        com.taobao.android.weex_uikit.widget.slide.a.c(uINode, z);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onRefreshAttribute(UINode uINode, Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3c7823", new Object[]{this, uINode, obj, str, obj2});
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1306084975:
                if (str.equals(com.taobao.tinct.impl.collect.e.UPLOAD_TYPE_EFFECT)) {
                    c = 3;
                    break;
                }
                break;
            case 66669991:
                if (str.equals(Constants.Name.SCROLLABLE)) {
                    c = 5;
                    break;
                }
                break;
            case 100346066:
                if (str.equals("index")) {
                    c = 2;
                    break;
                }
                break;
            case 173173268:
                if (str.equals("infinite")) {
                    c = 4;
                    break;
                }
                break;
            case 570418373:
                if (str.equals(Constants.Name.INTERVAL)) {
                    c = 1;
                    break;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    c = 0;
                    break;
                }
                break;
        }
        if (c == 0) {
            refreshAutoPlay(uINode, obj, obj2);
        } else if (c == 1) {
            refreshInterval(uINode, obj, obj2);
        } else if (c == 2) {
            refreshIndex(uINode, obj, obj2);
        } else if (c == 3) {
            refreshEffect(uINode, obj, obj2);
        } else if (c == 4) {
            refreshInfinite(uINode, obj, obj2);
        } else if (c != 5) {
        } else {
            refreshScrollable(uINode, obj, obj2);
        }
    }

    public void refreshAutoPlay(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caaf565b", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.slide.a.a(uINode, (SlideContainer) obj, ((Boolean) obj2).booleanValue());
        }
    }

    public void refreshInterval(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88811b59", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.slide.a.a(uINode, (SlideContainer) obj, ((Integer) obj2).intValue());
        }
    }

    public void refreshIndex(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eecba42", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.slide.a.a(uINode, (SlideContainer) obj, ((Integer) obj2).intValue(), this.currentIndex);
        }
    }

    public void refreshEffect(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e86d4d", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.slide.a.a(uINode, (SlideContainer) obj, (JSONObject) obj2);
        }
    }

    public void refreshInfinite(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3350f5ea", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.slide.a.a(uINode, (SlideContainer) obj, ((Boolean) obj2).booleanValue(), this.delegateNode);
        }
    }

    public void refreshScrollable(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7499d77", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.slide.a.b(uINode, (SlideContainer) obj, ((Boolean) obj2).booleanValue());
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this}) : UINodeType.VIEW;
    }

    /* loaded from: classes6.dex */
    public static class a extends com.taobao.android.weex_uikit.ui.b<BaseSlide> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1385835939);
        }

        @Override // com.taobao.android.weex_framework.bridge.a
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "[\"scrollTo\"]";
        }

        @Override // com.taobao.android.weex_framework.ui.l
        public /* synthetic */ INode a(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (INode) ipChange.ipc$dispatch("91d13828", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2}) : b(mUSDKInstance, i, mUSProps, mUSProps2);
        }

        public BaseSlide b(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseSlide) ipChange.ipc$dispatch("e377ed84", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            BaseSlide baseSlide = new BaseSlide(i);
            baseSlide.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                baseSlide.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                baseSlide.updateAttrs(mUSProps2);
            }
            return baseSlide;
        }
    }
}

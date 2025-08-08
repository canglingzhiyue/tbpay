package com.taobao.search.musie.component.filter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Rect;
import mtopsdk.common.util.StringUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_framework.util.i;
import com.taobao.android.weex_uikit.widget.div.Div;
import com.taobao.android.xsearchplugin.muise.SFMuiseSDK;
import com.taobao.android.xsearchplugin.muise.c;
import com.taobao.android.xsearchplugin.muise.l;
import com.taobao.android.xsearchplugin.muise.o;
import com.taobao.android.xsearchplugin.weex.weex.h;
import com.taobao.search.common.util.q;
import com.taobao.search.musie.k;
import java.util.ArrayList;
import java.util.List;
import tb.irp;
import tb.irq;
import tb.ise;
import tb.ius;
import tb.jzf;
import tb.kge;

/* loaded from: classes7.dex */
public class TbFilter extends Div implements View.OnTouchListener, ViewTreeObserver.OnScrollChangedListener, p.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ATTR_HALF_STICKY_OFFSET = "halfStickyOffset";
    private static final String ATTR_MAX_WEEX_HEIGHT = "maxWeexHeight";
    public static final int DURATION = 200;
    private static final String EVENT_STATE_CHANGE = "statechange";
    public static final String FILTER_TAG = "tbFilter";
    private static final String KEY_FLAG = "flag";
    private static final String KEY_VISIBLE = "visible";
    private static final String TAG = "TbFilter";
    private FrameLayout container;
    private boolean hasHolderToShow;
    private b holder;
    private View interceptView;
    private ObjectAnimator maskAnimation;
    private View maskView;
    public final List<ViewTreeObserver.OnScrollChangedListener> scrollObservers;
    private View topView;

    static {
        kge.a(707046639);
        kge.a(-1409480824);
        kge.a(-468432129);
        kge.a(-1249230565);
    }

    public static /* synthetic */ Object ipc$super(TbFilter tbFilter, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1300470387) {
            super.postCollectBatchTask((List) objArr[0]);
            return null;
        } else if (hashCode == -285278287) {
            super.onMount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else if (hashCode != -136526582) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onUnmount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.div.Div, com.taobao.android.weex_uikit.ui.UINode
    public boolean isGenerated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95a1590", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ void access$000(TbFilter tbFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("358e1f5b", new Object[]{tbFilter});
        } else {
            tbFilter.updateHalfStickyOffset();
        }
    }

    public static /* synthetic */ b access$100(TbFilter tbFilter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("ad60a7b2", new Object[]{tbFilter}) : tbFilter.holder;
    }

    public static /* synthetic */ void access$200(TbFilter tbFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f684d99", new Object[]{tbFilter});
        } else {
            tbFilter.removeFromDecor();
        }
    }

    public static /* synthetic */ void access$300(TbFilter tbFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc5564b8", new Object[]{tbFilter});
        } else {
            tbFilter.traverseScrollObservers();
        }
    }

    public TbFilter(int i) {
        super(i);
        this.hasHolderToShow = false;
        this.scrollObservers = new ArrayList();
    }

    @MUSNodeProp(name = ATTR_HALF_STICKY_OFFSET)
    public void setHalfStickyOffset(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34e49c02", new Object[]{this, str});
        } else {
            setAttribute(ATTR_HALF_STICKY_OFFSET, Integer.valueOf((int) i.a(str)));
        }
    }

    @MUSNodeProp(name = ATTR_MAX_WEEX_HEIGHT)
    public void setMaxWeexHeight(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("847176db", new Object[]{this, str});
        } else {
            setAttribute(ATTR_MAX_WEEX_HEIGHT, Integer.valueOf((int) i.a(str)));
        }
    }

    @MUSNodeProp(name = ATTR_HALF_STICKY_OFFSET, refresh = true)
    public void refreshHalfStickyOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d20a88f2", new Object[]{this, new Integer(i)});
        } else {
            updateHalfStickyOffset();
        }
    }

    private void updateHalfStickyOffset() {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb1531f", new Object[]{this});
            return;
        }
        Object tag = getInstance().getTag(SFMuiseSDK.MUISE_EVENT_LISTENER);
        if (!(tag instanceof h) || (num = (Integer) getAttribute(ATTR_HALF_STICKY_OFFSET)) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("offset", (Object) num);
        ((h) tag).b("updateHalfStickyOffset", jSONObject, null, null);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void postCollectBatchTask(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27c658d", new Object[]{this, list});
            return;
        }
        super.postCollectBatchTask(list);
        if (!isMounted()) {
            return;
        }
        list.add(new Runnable() { // from class: com.taobao.search.musie.component.filter.TbFilter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TbFilter.access$000(TbFilter.this);
                }
            }
        });
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onMount(mUSDKInstance, obj);
        updateHalfStickyOffset();
        this.container = new FrameLayout(mUSDKInstance.getUIContext());
        this.maskView = new View(mUSDKInstance.getUIContext());
        this.maskView.setOnTouchListener(this);
        this.maskView.setBackgroundColor(Color.argb(76, 0, 0, 0));
        this.topView = new View(mUSDKInstance.getUIContext());
        this.topView.setOnTouchListener(this);
        this.container.addView(this.maskView, new FrameLayout.LayoutParams(-1, -1));
        this.container.addView(this.topView, new ViewGroup.LayoutParams(-1, 0));
        this.interceptView = new View(mUSDKInstance.getUIContext());
        this.interceptView.setClickable(true);
        mUSDKInstance.registerNativeEventCallback(c.ACTION_CLOSE_PRE_FILTER, this);
        mUSDKInstance.registerNativeEventCallback(k.ACTION_LIST_SCROLL, this);
        mUSDKInstance.registerNativeEventCallback(k.ACTION_START_SCROLL, this);
        mUSDKInstance.registerNativeEventCallback("stopScroll", this);
        mUSDKInstance.registerNativeEventCallback(o.EVENT_WIDGET_BIND, this);
        mUSDKInstance.setTag(FILTER_TAG, FILTER_TAG);
        mUSDKInstance.getRenderRoot().setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.search.musie.component.filter.TbFilter.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                if (motionEvent.getAction() == 0 && TbFilter.access$100(TbFilter.this) != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                return false;
            }
        });
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onUnmount(mUSDKInstance, obj);
        mUSDKInstance.removeNativeEventCallback(c.ACTION_CLOSE_PRE_FILTER, this);
        mUSDKInstance.removeNativeEventCallback(k.ACTION_LIST_SCROLL, this);
        mUSDKInstance.removeNativeEventCallback(k.ACTION_START_SCROLL, this);
        mUSDKInstance.removeNativeEventCallback("stopScroll", this);
        mUSDKInstance.removeNativeEventCallback(o.EVENT_WIDGET_BIND, this);
        mUSDKInstance.getRenderRoot().setOnTouchListener(null);
        mUSDKInstance.setTag(FILTER_TAG, new Object());
        this.container.removeAllViews();
        removeFromDecor();
        b bVar = this.holder;
        if (bVar == null) {
            return;
        }
        bVar.a(false);
        this.holder = null;
    }

    private void addInterceptView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed6084ed", new Object[]{this});
            return;
        }
        View view = this.interceptView;
        if (view == null || view.getParent() != null) {
            return;
        }
        getContainer((Activity) getInstance().getUIContext()).addView(this.interceptView, new FrameLayout.LayoutParams(-1, -1));
    }

    private void removeInterceptView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cc0676a", new Object[]{this});
            return;
        }
        View view = this.interceptView;
        if (view == null || view.getParent() == null) {
            return;
        }
        getContainer((Activity) getInstance().getUIContext()).removeView(this.interceptView);
    }

    private irq getCreatorParam(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (irq) ipChange.ipc$dispatch("7d405112", new Object[]{this, lVar}) : new irq(lVar.getActivity(), lVar.getParent(), lVar.S());
    }

    @MUSMethod(uiThread = true)
    public void toggleDropFilter(String str, JSONObject jSONObject, String str2, String str3, boolean z) {
        ise iseVar;
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f1845c", new Object[]{this, str, jSONObject, str2, str3, new Boolean(z)});
        } else if (jSONObject == null) {
            q.c(TAG, com.taobao.vessel.utils.c.LOAD_DATA_NULL);
        } else if (StringUtils.isEmpty(str)) {
            q.c(TAG, "tItemType is null");
        } else {
            ObjectAnimator objectAnimator = this.maskAnimation;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                q.c(TAG, "正在处于开或关的状态中，本次点击跳过");
                return;
            }
            b bVar = this.holder;
            if (bVar != null && StringUtils.equals(bVar.b(), str2)) {
                hideDropFilter(true, true);
                return;
            }
            l lVar = (l) getInstance().getTag(com.taobao.android.xsearchplugin.muise.a.KEY_WIDGET_CONTEXT);
            if (lVar == null) {
                q.c(TAG, "当前不在列表环境下，不支持显示下拉框");
                return;
            }
            TemplateBean template = lVar.S().d().getTemplate(str);
            if (template == null) {
                q.c(TAG, "tItemType 对应的模板为空");
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("model");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.put("tItemType", (Object) str);
            BaseTypedBean a2 = lVar.getCore().g().a(jSONObject2, (BaseSearchResult) lVar.S().d().getTotalSearchResult(), null);
            if (a2 == null) {
                q.c(TAG, "info parse 失败");
                return;
            }
            if (a2 instanceof MuiseBean) {
                ((MuiseBean) a2).status = jSONObject.getJSONObject("status");
                iseVar = lVar.getCore().m().b.f29267a;
            } else if (a2 instanceof WeexBean) {
                ((WeexBean) a2).status = jSONObject.getJSONObject("status");
                iseVar = lVar.getCore().m().f29266a.b;
            } else {
                iseVar = null;
            }
            if (iseVar == null) {
                return;
            }
            ius iusVar = (ius) iseVar.a(new irp(getCreatorParam(lVar), template));
            boolean z2 = iusVar instanceof jzf;
            if (z2 && (num = (Integer) getAttribute(ATTR_MAX_WEEX_HEIGHT)) != null) {
                ((jzf) iusVar).b(num.intValue());
            }
            iusVar.bindWithData(a2);
            Object tag = getInstance().getTag(SFMuiseSDK.MUISE_EVENT_LISTENER);
            if (tag != null) {
                if (iusVar instanceof o) {
                    ((o) iusVar).a((h) tag);
                } else if (z2) {
                    ((jzf) iusVar).a((h) tag);
                }
            }
            hideDropFilter(false, true);
            this.holder = new a(this, iusVar, (int) i.a(str3), str2);
            h hVar = (h) getInstance().getTag(SFMuiseSDK.MUISE_EVENT_LISTENER);
            if (hVar != null) {
                hVar.b("showDropFilter", null, null, null);
            }
            if (z) {
                addInterceptView();
                this.hasHolderToShow = true;
                if (hVar == null) {
                    return;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("anim", (Object) true);
                jSONObject3.put("offset", (Object) 0);
                hVar.b("scrollCellToTop", jSONObject3, null, null);
                return;
            }
            showNewDropFilter();
        }
    }

    private void adjustLocation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58eeeeb", new Object[]{this});
        } else if (this.maskView == null) {
        } else {
            View renderRoot = getInstance().getRenderRoot();
            Rect rect = new Rect();
            renderRoot.getGlobalVisibleRect(rect);
            if (((l) getInstance().getTag(com.taobao.android.xsearchplugin.muise.a.KEY_WIDGET_CONTEXT)) == null) {
                rect.bottom = rect.top + getInstance().getRootHeight();
            }
            this.maskView.setTranslationY(rect.bottom);
            this.topView.getLayoutParams().height = Math.max(rect.top, 0);
            this.topView.requestLayout();
        }
    }

    private void showNewDropFilter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ff77c91", new Object[]{this});
            return;
        }
        removeInterceptView();
        this.hasHolderToShow = false;
        this.holder.c();
        this.holder.a(this.container, getContainer((Activity) getInstance().getUIContext()));
        onStateChange(this.holder.b(), true);
        animateContainer(true);
    }

    private void onStateChange(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("900243e1", new Object[]{this, str, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("visible", (Object) String.valueOf(z));
        jSONObject.put("flag", (Object) str);
        fireEvent(EVENT_STATE_CHANGE, jSONObject);
    }

    private void hideDropFilter(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2c1cb0", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        removeInterceptView();
        b bVar = this.holder;
        if (bVar == null) {
            return;
        }
        if (this.hasHolderToShow) {
            bVar.a(false);
            this.hasHolderToShow = false;
            this.holder = null;
            return;
        }
        bVar.a(z2);
        onStateChange(this.holder.b(), false);
        this.holder = null;
        if (!z) {
            return;
        }
        animateContainer(false);
    }

    private void animateContainer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f6fc8d", new Object[]{this, new Boolean(z)});
            return;
        }
        ObjectAnimator objectAnimator = this.maskAnimation;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        if (z) {
            if (this.container.getParent() != null) {
                return;
            }
            addToDecor();
            this.maskAnimation = ObjectAnimator.ofFloat(this.maskView, View.ALPHA, 0.0f, 1.0f);
        } else if (this.container.getParent() == null) {
            return;
        } else {
            this.maskAnimation = ObjectAnimator.ofFloat(this.maskView, View.ALPHA, 1.0f, 0.0f);
            this.maskAnimation.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.search.musie.component.filter.TbFilter.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else {
                        TbFilter.access$200(TbFilter.this);
                    }
                }
            });
        }
        this.maskAnimation.setDuration(200L);
        this.maskAnimation.start();
    }

    private void addToDecor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f523fd0", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.container;
        if (frameLayout == null || frameLayout.getParent() != null) {
            return;
        }
        getContainer((Activity) this.container.getContext()).addView(this.container, new ViewGroup.LayoutParams(-1, -1));
        this.maskView.setAlpha(0.0f);
        adjustLocation();
        this.scrollObservers.add(this);
    }

    private ViewGroup getContainer(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("e28cef1", new Object[]{this, activity});
        }
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        return viewGroup == null ? (ViewGroup) activity.getWindow().getDecorView() : viewGroup;
    }

    private void removeFromDecor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fd518be", new Object[]{this});
            return;
        }
        removeInterceptView();
        FrameLayout frameLayout = this.container;
        if (frameLayout == null || frameLayout.getParent() == null) {
            return;
        }
        ((ViewGroup) this.container.getParent()).removeView(this.container);
        this.scrollObservers.remove(this);
    }

    @Override // com.taobao.android.weex_framework.p.a
    public void onNativeEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d43f7f", new Object[]{this, str, str2});
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1881848369:
                if (str.equals(k.ACTION_START_SCROLL)) {
                    c = 0;
                    break;
                }
                break;
            case -1364766353:
                if (str.equals("stopScroll")) {
                    c = 3;
                    break;
                }
                break;
            case -923579048:
                if (str.equals(o.EVENT_WIDGET_BIND)) {
                    c = 4;
                    break;
                }
                break;
            case 349312267:
                if (str.equals(k.ACTION_LIST_SCROLL)) {
                    c = 2;
                    break;
                }
                break;
            case 980325089:
                if (str.equals(c.ACTION_CLOSE_PRE_FILTER)) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1) {
            hideDropFilter(true, true);
        } else if (c == 2) {
            traverseScrollObservers();
        } else if (c == 3) {
            if (!this.hasHolderToShow) {
                return;
            }
            showNewDropFilter();
            this.container.post(new Runnable() { // from class: com.taobao.search.musie.component.filter.TbFilter.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TbFilter.access$300(TbFilter.this);
                    }
                }
            });
        } else if (c != 4 || this.holder == null) {
        } else {
            hideDropFilter(true, false);
        }
    }

    private void traverseScrollObservers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42166dc5", new Object[]{this});
            return;
        }
        for (ViewTreeObserver.OnScrollChangedListener onScrollChangedListener : this.scrollObservers) {
            onScrollChangedListener.onScrollChanged();
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        ObjectAnimator objectAnimator = this.maskAnimation;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            hideDropFilter(true, true);
        }
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d815a80f", new Object[]{this});
        } else {
            adjustLocation();
        }
    }
}

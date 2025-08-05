package com.taobao.tao.flexbox.layoutmanager.core;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaPositionType;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.databinding.componentbind.componentinfo.ComponentInfoDef;
import com.taobao.tao.flexbox.layoutmanager.databinding.componentbind.componentinfo.b;
import com.taobao.taobao.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.oeg;
import tb.oel;
import tb.ogg;
import tb.ogh;
import tb.ogl;
import tb.ohc;
import tb.ohd;

/* loaded from: classes8.dex */
public abstract class Component<V extends View, P extends ogl> implements com.taobao.tao.flexbox.layoutmanager.core.b, f<V, P> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APPEAR_TYPE_ADD = "add";
    public static final String APPEAR_TYPE_BACKGROUND = "background";
    public static final String APPEAR_TYPE_DELETE = "delete";
    public static final String APPEAR_TYPE_FOREGROUND = "foreground";
    public static final String APPEAR_TYPE_Item = "item";
    public static final String APPEAR_TYPE_PAGE = "page";
    public static final String APPEAR_TYPE_TAB = "tab";
    public static final int INVALID_ANIMATION_VALUE = Integer.MIN_VALUE;
    public static final String KEY_PAGE_NAME = "pagename";
    public static final String KEY_SPM = "spm";
    public static final String KEY_SPM_CNT = "spm-cnt";
    public static final String KEY_SPM_URL = "spm-url";
    public static final int MSG_FLAG_APPEAR = 130;
    public static final int MSG_FLAG_DEPTH = 2;
    public static final int MSG_FLAG_DISAPPEAR = 386;
    public static final int MSG_FLAG_EXCEPT_SELF = 64;
    public static final int MSG_FLAG_IGNORE_ALL_HANDLER = 128;
    public static final int MSG_FLAG_IGNORE_CHILD = 2048;
    public static final int MSG_FLAG_IGNORE_CONTAINER = 8;
    public static final int MSG_FLAG_IGNORE_TRACK = 4;
    public static final int MSG_FLAG_MESSAGE_HANDLE = 32;
    public static final int MSG_FLAG_MESSAGE_WATCH = 512;
    public static final int MSG_FLAG_PAGE_APPEAR = 130;
    public static final int MSG_FLAG_PAGE_DISAPPEAR = 130;
    public static final int MSG_FLAG_REVERSE = 256;
    public static final int MSG_FLAG_SIBLING = 16;
    public static final int MSG_FLAG_UP = 1;
    public static final int MSG_FLAG_WATCH_HANDLED = 1024;
    public static final String SELF_TRANSITION_NAME = "tnode_self_transition";
    public static final int TAB_TRANSLATION_DURATION = 250;
    private static Map<String, c> attributeHandlers;
    private static boolean fixWidthHeightTransition;
    private boolean attrInitInPrepare;
    private ImageLoader.e backgroundTask;
    public View.OnClickListener clickListener;
    public long clickTimeStamp;
    public a currentHostViewComponentInfo;
    public long doubleClickTimeStamp;
    private m flexBoxNode;
    public View.OnLongClickListener longClickListener;
    public r measureResult;
    public String name;
    public aa node;
    public V prepareView;
    public Map<String, com.taobao.tao.flexbox.layoutmanager.event.d> renderCompleteListeners;
    public View.OnTouchListener touchListener;
    public V view;
    public P viewParams;
    private int animationWidth = Integer.MIN_VALUE;
    private int animationHeight = Integer.MIN_VALUE;
    private int animationLeft = Integer.MIN_VALUE;
    private int animationTop = Integer.MIN_VALUE;
    private int animationRight = Integer.MIN_VALUE;
    private int animationBottom = Integer.MIN_VALUE;
    public boolean attached = false;
    public boolean initRender = true;
    private float componentAlpha = 1.0f;
    private int preRealWidth = 0;
    private int preRealHeight = 0;
    private boolean isFirstTime = true;

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Component f20278a;
        public r b;

        static {
            kge.a(-202567280);
        }
    }

    /* loaded from: classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f20279a;
        public Rect b;
        public Bitmap c;
        public String d;
        public Bitmap e;
        public String f;

        static {
            kge.a(-1770220846);
        }
    }

    public void addOrUpdateDrawable(boolean z, Drawable[] drawableArr, r rVar, aa aaVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b250bf4d", new Object[]{this, new Boolean(z), drawableArr, rVar, aaVar, new Boolean(z2)});
        }
    }

    public HashMap clickArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("16a46aef", new Object[]{this});
        }
        return null;
    }

    public b getSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("1d100afe", new Object[]{this});
        }
        return null;
    }

    public boolean interceptVNodeDiff(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7f54970", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    public boolean isDoubleClickSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a243ded", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public HashMap longClickArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3bdeccd3", new Object[]{this});
        }
        return null;
    }

    public boolean onAfterAddToLayoutTree(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d5828a", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return false;
    }

    public void onAttachComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e92464", new Object[]{this});
        }
    }

    public boolean onBeforeAddToLayoutTree() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51812d71", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void onChildLayoutChanged(Component component, int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156bb51d", new Object[]{this, component, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
        }
    }

    public YogaMeasureFunction onCreateMeasureFunction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaMeasureFunction) ipChange.ipc$dispatch("622da8f1", new Object[]{this});
        }
        return null;
    }

    public abstract V onCreateView(Context context);

    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
        }
    }

    public void onLayoutTreeBuilt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4163a9e", new Object[]{this});
        }
    }

    public void onPatchCompleted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2dd229", new Object[]{this});
        }
    }

    public void onSaveInstanceState(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afbed9be", new Object[]{this, map});
        }
    }

    public void onViewCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6b63ab", new Object[]{this});
        }
    }

    public void removeDrawable(Drawable[] drawableArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398d4010", new Object[]{this, drawableArr});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.b
    public boolean sendViewAppearForAdd(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfadc3ad", new Object[]{this, aaVar})).booleanValue();
        }
        return true;
    }

    public void sortChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72a97c4", new Object[]{this});
        }
    }

    public static /* synthetic */ String access$000(Component component, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("53c0b150", new Object[]{component, obj}) : component.getString(obj);
    }

    public static /* synthetic */ void access$100(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac179dd3", new Object[]{component});
        } else {
            component.requestParentTouchDisallow();
        }
    }

    static {
        kge.a(1376573430);
        kge.a(196203508);
        kge.a(23113765);
        fixWidthHeightTransition = oeb.a("fixWidthHeightTransition", true);
        HashMap hashMap = new HashMap();
        attributeHandlers = hashMap;
        hashMap.put("width", c.c);
        attributeHandlers.put("height", c.d);
        attributeHandlers.put("padding", c.e);
        attributeHandlers.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_padding_left, c.e);
        attributeHandlers.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_padding_top, c.e);
        attributeHandlers.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_padding_right, c.e);
        attributeHandlers.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_padding_bottom, c.e);
        attributeHandlers.put("background-color", c.f);
        attributeHandlers.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_background_image, c.f);
        attributeHandlers.put("background", c.f);
        attributeHandlers.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_border_color, c.h);
        attributeHandlers.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_border_radius, c.h);
        attributeHandlers.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_border_bottom_left_radius, c.h);
        attributeHandlers.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_border_bottom_right_radius, c.h);
        attributeHandlers.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_border_top_left_radius, c.h);
        attributeHandlers.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_border_top_right_radius, c.h);
        attributeHandlers.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_border_width, c.h);
        attributeHandlers.put("foreground-color", c.g);
        attributeHandlers.put("opacity", c.i);
        attributeHandlers.put("enabled", c.l);
        attributeHandlers.put("accessibility-text", c.n);
        attributeHandlers.put("visibility", c.k);
        attributeHandlers.put(AmnetConstant.VAL_SUPPORT_ZSTD, c.m);
        attributeHandlers.put("auto-focus", c.j);
        attributeHandlers.put("clip-children", c.o);
        attributeHandlers.put("transform", c.p);
        attributeHandlers.put("translate", c.q);
        attributeHandlers.put("translateX", c.r);
        attributeHandlers.put("translateY", c.s);
        attributeHandlers.put("rotate", c.t);
        attributeHandlers.put("rotateX", c.u);
        attributeHandlers.put("rotateY", c.v);
        attributeHandlers.put("scaleX", c.x);
        attributeHandlers.put("scaleY", c.y);
        attributeHandlers.put("scale", c.w);
        attributeHandlers.put("apm-valid", c.z);
        attributeHandlers.put("fading-edge", c.B);
        if (oeb.a("enableBoxShadowHandler", true)) {
            attributeHandlers.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_box_shadow, c.A);
        }
    }

    public boolean hasComponentClickTouchListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("995d26d9", new Object[]{this})).booleanValue() : (this.longClickListener == null && this.clickListener == null && this.touchListener == null) ? false : true;
    }

    public void setComponentClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c740bd1", new Object[]{this, onClickListener});
        } else {
            this.clickListener = onClickListener;
        }
    }

    public View.OnClickListener getComponentClickListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("5a9761c5", new Object[]{this}) : this.clickListener;
    }

    public View.OnTouchListener getComponentTouchListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnTouchListener) ipChange.ipc$dispatch("9090f765", new Object[]{this}) : this.touchListener;
    }

    public P getViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (P) ipChange.ipc$dispatch("ccffcdea", new Object[]{this}) : this.viewParams;
    }

    public aa getNode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("ae5c451f", new Object[]{this}) : this.node;
    }

    public V getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (V) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.view;
    }

    public View getTransitionView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("23b99399", new Object[]{this}) : this.view;
    }

    public float getComponentAlpha() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e09f084e", new Object[]{this})).floatValue() : this.componentAlpha;
    }

    public boolean setComponentAlpha(boolean z, float f, List<aa> list) {
        boolean z2;
        Drawable foreground;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9538c84b", new Object[]{this, new Boolean(z), new Float(f), list})).booleanValue();
        }
        if (this.componentAlpha == f) {
            return false;
        }
        this.componentAlpha = f;
        boolean z3 = list != null && list.contains(getNode());
        if (!z3) {
            List<aa> a2 = ad.a(this.node, f, false);
            z2 = a2 != null && !a2.isEmpty();
            if (z2) {
                list = new ArrayList<>();
                for (aa aaVar : a2) {
                    list.addAll(ad.a(aaVar, this.node));
                }
            }
        } else {
            z2 = z3;
        }
        if (z2) {
            if (this.view != null) {
                int i = z ? (int) (255.0f * f) : (int) (this.viewParams.aT * f * 255.0f);
                if (Build.VERSION.SDK_INT >= 23 && (foreground = this.view.getForeground()) != null) {
                    foreground.setAlpha(i);
                }
                Drawable background = this.view.getBackground();
                if (background != null) {
                    background.setAlpha(i);
                }
            }
            if (this.node.R() > 0) {
                for (aa aaVar2 : this.node.H()) {
                    if (aaVar2.I() != null) {
                        aaVar2.I().setComponentAlpha(false, f, list);
                    }
                }
            }
        } else {
            V v = this.view;
            if (v != null) {
                v.setAlpha(f * this.viewParams.aT);
            }
        }
        return true;
    }

    public boolean needAnimation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fe5c0919", new Object[]{this})).booleanValue() : this.node.p != null && this.node.p.f20297a;
    }

    public boolean considerLayoutAnimation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9cd20c8c", new Object[]{this})).booleanValue() : needAnimation();
    }

    public void applyAttrForView(V v, P p, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805910c7", new Object[]{this, v, p, map, new Boolean(z)});
        } else if (this.view == null || this.attrInitInPrepare) {
        } else {
            if (z || this.node.r()) {
                onInitAttrs(this, this.view, this.viewParams, this.node.p);
                return;
            }
            c.b.a((f) this, (Component<V, P>) this.view, (V) this.viewParams, this.node.p);
            handleUpdateAttributes(map);
        }
    }

    public void onInitAttrs(f fVar, V v, P p, aa.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c263d0e", new Object[]{this, fVar, v, p, dVar});
            return;
        }
        c.b.a(fVar, (f) v, (V) p, dVar);
        c.e.a(fVar, (f) v, (V) p, dVar);
        c.f.a(fVar, (f) v, (V) p, dVar);
        c.g.a(fVar, (f) v, (V) p, dVar);
        c.i.a(fVar, (f) v, (V) p, dVar);
        c.k.a(fVar, (f) v, (V) p, dVar);
        c.j.a(fVar, (f) v, (V) p, dVar);
        c.m.a(fVar, (f) v, (V) p, dVar);
        c.l.a(fVar, (f) v, (V) p, dVar);
        c.n.a(fVar, (f) v, (V) p, dVar);
        c.o.a(fVar, (f) v, (V) p, dVar);
        c.p.a(fVar, (f) v, (V) p, dVar);
        c.z.a(fVar, (f) v, (V) p, dVar);
        c.B.a(fVar, (f) v, (V) p, dVar);
        if (p.bl != 0.0f || p.bm != 0.0f) {
            c.q.a(fVar, (f) v, (V) p, dVar);
        }
        if (p.bn != 0.0f) {
            c.t.a(fVar, (f) v, (V) p, dVar);
        }
        if (p.bo != 0.0f) {
            c.u.a(fVar, (f) v, (V) p, dVar);
        }
        if (p.bp != 0.0f) {
            c.v.a(fVar, (f) v, (V) p, dVar);
        }
        if (p.bq == 1.0f && p.br == 1.0f) {
            return;
        }
        c.w.a(fVar, (f) v, (V) p, dVar);
    }

    public void handleUpdateAttributes(Map map) {
        c attributeHandler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30809d6", new Object[]{this, map});
        } else if (map != null) {
            ArrayList arrayList = null;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (!str.equals("width") && !str.equals("height") && (attributeHandler = getAttributeHandler(str)) != null) {
                    if (attributeHandler.a() != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        if (!arrayList.contains(attributeHandler)) {
                            onUpdateAttribute(attributeHandler, str, entry.getValue(), this.node.p);
                            arrayList.add(attributeHandler);
                        }
                    } else {
                        onUpdateAttribute(attributeHandler, str, entry.getValue(), this.node.p);
                    }
                }
            }
        }
    }

    public CharSequence getContentDescription() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("3a52ebfa", new Object[]{this}) : this.viewParams.aX;
    }

    public void setAnimationWidth(int i) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c988fc38", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.animationWidth = i;
        V v = this.view;
        if (v != null && (layoutParams = v.getLayoutParams()) != null) {
            layoutParams.width = i;
            this.view.setLayoutParams(layoutParams);
        }
        notifyRealLayoutChange();
    }

    public void setAnimationHeight(int i) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3aa6bf3", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.animationHeight = i;
        V v = this.view;
        if (v != null && (layoutParams = v.getLayoutParams()) != null) {
            layoutParams.height = i;
            this.view.setLayoutParams(layoutParams);
        }
        notifyRealLayoutChange();
    }

    public void setAnimationLeft(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97a6893", new Object[]{this, new Integer(i)});
            return;
        }
        this.animationLeft = i;
        V v = this.view;
        if (v != null) {
            v.requestLayout();
        }
        notifyRealLayoutChange();
    }

    public void setAnimationTop(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e49a89", new Object[]{this, new Integer(i)});
            return;
        }
        this.animationTop = i;
        V v = this.view;
        if (v != null) {
            v.requestLayout();
        }
        notifyRealLayoutChange();
    }

    public void setAnimationRight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d56cada2", new Object[]{this, new Integer(i)});
            return;
        }
        this.animationRight = i;
        V v = this.view;
        if (v != null) {
            v.requestLayout();
        }
        notifyRealLayoutChange();
    }

    public void setAnimationBottom(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce6656f", new Object[]{this, new Integer(i)});
            return;
        }
        this.animationBottom = i;
        V v = this.view;
        if (v != null) {
            v.requestLayout();
        }
        notifyRealLayoutChange();
    }

    public void resetAnimationWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e2fdbd8", new Object[]{this});
        } else {
            this.animationWidth = Integer.MIN_VALUE;
        }
    }

    public void resetAnimationHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe3f03", new Object[]{this});
        } else {
            this.animationHeight = Integer.MIN_VALUE;
        }
    }

    public void resetAnimationLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b8f0f23", new Object[]{this});
        } else {
            this.animationLeft = Integer.MIN_VALUE;
        }
    }

    public void resetAnimationTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30ccb6a7", new Object[]{this});
        } else {
            this.animationTop = Integer.MIN_VALUE;
        }
    }

    public void resetAnimationRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23bb552e", new Object[]{this});
        } else {
            this.animationRight = Integer.MIN_VALUE;
        }
    }

    public void resetAnimationBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44df2607", new Object[]{this});
        } else {
            this.animationBottom = Integer.MIN_VALUE;
        }
    }

    public int getLayoutWidth() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a60b4500", new Object[]{this})).intValue();
        }
        int i = this.animationWidth;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        int layoutLeft = getLayoutLeft();
        r rVar = this.measureResult;
        int i2 = (rVar != null ? rVar.f20361a : 0) + layoutLeft;
        int i3 = this.animationRight;
        if (i3 != Integer.MIN_VALUE) {
            i2 = i3;
        } else {
            a aVar2 = this.currentHostViewComponentInfo;
            int i4 = aVar2 != null ? aVar2.b.c : 0;
            int i5 = this.animationLeft;
            if ((i5 == Integer.MIN_VALUE || (i5 <= i4 && !fixWidthHeightTransition)) && (aVar = this.currentHostViewComponentInfo) != null) {
                i2 = this.currentHostViewComponentInfo.b.f20361a + aVar.b.c;
            }
        }
        int i6 = i2 - layoutLeft;
        if (i6 >= 0) {
            return i6;
        }
        return 0;
    }

    public int getLayoutHeight() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d58ffc61", new Object[]{this})).intValue();
        }
        int i = this.animationHeight;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        int layoutTop = getLayoutTop();
        r rVar = this.measureResult;
        int i2 = (rVar != null ? rVar.b : 0) + layoutTop;
        int i3 = this.animationBottom;
        if (i3 != Integer.MIN_VALUE) {
            i2 = i3;
        } else {
            a aVar2 = this.currentHostViewComponentInfo;
            int i4 = aVar2 != null ? aVar2.b.d : 0;
            int i5 = this.animationTop;
            if ((i5 == Integer.MIN_VALUE || (i5 <= i4 && !fixWidthHeightTransition)) && (aVar = this.currentHostViewComponentInfo) != null) {
                i2 = this.currentHostViewComponentInfo.b.b + aVar.b.d;
            }
        }
        int i6 = i2 - layoutTop;
        if (i6 >= 0) {
            return i6;
        }
        return 0;
    }

    public int getLayoutLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b72b41", new Object[]{this})).intValue();
        }
        int i = this.animationLeft;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        a aVar = this.currentHostViewComponentInfo;
        if (aVar == null) {
            return 0;
        }
        return aVar.b.c;
    }

    public int getLayoutTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("876ae90f", new Object[]{this})).intValue();
        }
        int i = this.animationTop;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        a aVar = this.currentHostViewComponentInfo;
        if (aVar == null) {
            return 0;
        }
        return aVar.b.d;
    }

    public int getLayoutRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b96be56", new Object[]{this})).intValue();
        }
        int i = this.animationRight;
        return i != Integer.MIN_VALUE ? i : getLayoutLeft() + getLayoutWidth();
    }

    public int getLayoutBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1870e365", new Object[]{this})).intValue();
        }
        int i = this.animationBottom;
        return i != Integer.MIN_VALUE ? i : getLayoutTop() + getLayoutHeight();
    }

    public void sendMessage(aa aaVar, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d682ff4e", new Object[]{this, aaVar, str, str2, map, bVar});
        } else {
            this.node.k().b(0, aaVar, str, str2, map, bVar);
        }
    }

    public void postMessage(aa aaVar, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47f89a66", new Object[]{this, aaVar, str, str2, map, bVar});
        } else {
            this.node.k().a(0, aaVar, str, str2, map, bVar);
        }
    }

    public void postMessage(int i, aa aaVar, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b94835f", new Object[]{this, new Integer(i), aaVar, str, str2, map, bVar});
        } else {
            this.node.k().a(i, aaVar, str, str2, map, bVar);
        }
    }

    public void sendMessage(int i, aa aaVar, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e56bb77", new Object[]{this, new Integer(i), aaVar, str, str2, map, bVar});
        } else {
            this.node.k().b(i, aaVar, str, str2, map, bVar);
        }
    }

    /* renamed from: generateViewParams */
    public P mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (P) ipChange.ipc$dispatch("36baa12b", new Object[]{this}) : (P) new ogl();
    }

    public boolean onPrepareComponent(Context context) {
        V v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42f0f990", new Object[]{this, context})).booleanValue();
        }
        if (this.view == null && (v = this.prepareView) == null) {
            if (v == null) {
                this.prepareView = onCreateView(context);
                V v2 = this.prepareView;
                if (v2 != null) {
                    onInitAttrs(this, v2, this.viewParams, null);
                    this.attrInitInPrepare = true;
                }
            }
            if (this.prepareView != null) {
                return true;
            }
        }
        return false;
    }

    private void notifyRealLayoutChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("458799a8", new Object[]{this});
        } else {
            notifyRealLayoutChange(-1, -1);
        }
    }

    private void notifyRealLayoutChange(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2163008", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (i < 0) {
            i = getLayoutWidth();
        }
        if (i2 < 0) {
            i2 = getLayoutHeight();
        }
        if (this.preRealWidth == i && this.preRealHeight == i2) {
            return;
        }
        if (this.isFirstTime && this.preRealWidth == 0 && this.preRealHeight == 0) {
            this.isFirstTime = false;
        }
        onRealLayoutChanged(this.preRealWidth, this.preRealHeight, i, i2, this.isFirstTime);
        this.preRealWidth = i;
        this.preRealHeight = i2;
    }

    @Deprecated
    private void executeCreateAnimation() {
        AnimatorSet a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86d7b0ba", new Object[]{this});
            return;
        }
        oeg T = this.node.T();
        if (T == null || (a2 = oel.a(this.node.k(), this.node.E(), T, oel.d.a(this.measureResult.f20361a, this.measureResult.b, this.viewParams))) == null || a2.getChildAnimations().isEmpty()) {
            return;
        }
        a2.start();
    }

    private void executeShareElementAnimation() {
        com.taobao.tao.flexbox.layoutmanager.container.n transitionInfo;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767dacf9", new Object[]{this});
        } else if (this.view != null && this.node.k().n()) {
            if (this.viewParams.be) {
                this.view.setTransitionName(SELF_TRANSITION_NAME);
            }
            Object g = getNode().k().g();
            if (g instanceof com.taobao.tao.flexbox.layoutmanager.container.f) {
                com.taobao.tao.flexbox.layoutmanager.container.f fVar = (com.taobao.tao.flexbox.layoutmanager.container.f) g;
                if (!fVar.isEnterTransitionExecuted() && (transitionInfo = fVar.getTransitionInfo()) != null && transitionInfo.f != null) {
                    int i = 0;
                    boolean z2 = false;
                    while (true) {
                        if (i >= transitionInfo.f.size()) {
                            z = z2;
                            break;
                        }
                        Map a2 = oec.a(transitionInfo.f.get(i), (Map) null);
                        boolean z3 = a2.size() == 1;
                        if (a2 != null) {
                            if (oec.a(a2.get(com.taobao.tao.flexbox.layoutmanager.container.n.MATCH_TAG), false)) {
                                z = true;
                                break;
                            }
                            for (Map.Entry entry : a2.entrySet()) {
                                if (entry.getValue() != null && ((String) entry.getValue()).equals(getNode().e((String) entry.getKey()))) {
                                    updateShareElement((String) entry.getValue());
                                    z2 = true;
                                }
                            }
                            if (z3 && z2) {
                                a2.put(com.taobao.tao.flexbox.layoutmanager.container.n.MATCH_TAG, true);
                            }
                        }
                        i++;
                    }
                }
            }
            if (z || oec.h(this.viewParams.bd)) {
                return;
            }
            updateShareElement(this.viewParams.bd);
        }
    }

    private void updateShareElement(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6cf797", new Object[]{this, str});
        } else if (getTransitionView() == null) {
        } else {
            getTransitionView().setTransitionName(str);
            getTransitionView().setId(str.hashCode());
            this.node.k().s().a(this.node);
        }
    }

    public void attachComponent() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c1e34bf", new Object[]{this});
            return;
        }
        if (this.view != null) {
            a aVar = this.currentHostViewComponentInfo;
            if (aVar == null) {
                aVar = getHostViewComponent();
            }
            if (aVar != null && aVar.f20278a != null) {
                ogh.a("addOrUpdateView:" + this.node.c.l);
                aVar.f20278a.addOrUpdateView(this.attached ^ true, this.view, aVar.b, this.node);
                ogh.b();
            }
            aa J = this.node.J();
            if (this.viewParams.aZ && J != null) {
                int i = this.measureResult.f20361a;
                int i2 = this.measureResult.b;
                int i3 = i;
                for (int i4 = 0; i4 < this.node.d.size(); i4++) {
                    r G = this.node.d.get(i4).G();
                    i3 = Math.max(i3, G.f20361a);
                    i2 = Math.max(i2, G.b);
                }
                if (this.measureResult.d + i2 > J.G().b || this.measureResult.c + i3 > J.G().f20361a) {
                    z = true;
                }
                if (z) {
                    this.view.setVisibility(8);
                }
            }
        }
        this.attached = true;
    }

    public boolean isAttached() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f518279", new Object[]{this})).booleanValue() : this.attached;
    }

    private String getString(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3aaaa176", new Object[]{this, obj});
        }
        if (!(obj instanceof String)) {
            return null;
        }
        return (String) obj;
    }

    public void updateClickListener() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b6f1a", new Object[]{this});
            return;
        }
        float f = this.viewParams.aT;
        if (this.view == null) {
            return;
        }
        View.OnClickListener componentClickListener = getComponentClickListener();
        View.OnTouchListener componentTouchListener = getComponentTouchListener();
        if (componentTouchListener != null) {
            V v = this.view;
            if (f == 0.0f) {
                componentTouchListener = null;
            }
            v.setOnTouchListener(componentTouchListener);
        } else if (componentClickListener == null) {
        } else {
            V v2 = this.view;
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i == 0) {
                componentClickListener = null;
            }
            v2.setOnClickListener(componentClickListener);
            V v3 = this.view;
            if (i != 0) {
                z = true;
            }
            v3.setClickable(z);
        }
    }

    public void bindEvent() {
        final aa findLongClickableParentNode;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56398a64", new Object[]{this});
        } else if (this.view == null) {
        } else {
            if (!this.viewParams.aW) {
                this.view.setOnClickListener(null);
                this.view.setClickable(false);
                this.view.setOnTouchListener(null);
                this.clickListener = null;
                this.longClickListener = null;
                this.touchListener = null;
                return;
            }
            final Object e = this.node.e("ondblclick");
            if (e != null) {
                if (isDoubleClickSupport()) {
                    final GestureDetector gestureDetector = new GestureDetector(this.node.N(), new GestureDetector.SimpleOnGestureListener() { // from class: com.taobao.tao.flexbox.layoutmanager.core.Component.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                            if (str.hashCode() == -2043089436) {
                                super.onLongPress((MotionEvent) objArr[0]);
                                return null;
                            }
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                        }

                        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("886c5d07", new Object[]{this, motionEvent})).booleanValue();
                            }
                            return true;
                        }

                        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                        public boolean onDown(MotionEvent motionEvent) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
                            }
                            return true;
                        }

                        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                        public boolean onDoubleTap(MotionEvent motionEvent) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("7a319393", new Object[]{this, motionEvent})).booleanValue();
                            }
                            Component component = Component.this;
                            component.sendMessage(component.node, "ondblclick", Component.access$000(Component.this, e), Component.this.clickArgs(), null);
                            Component.this.doubleClickTimeStamp = System.currentTimeMillis();
                            return true;
                        }

                        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                        public void onLongPress(MotionEvent motionEvent) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
                                return;
                            }
                            if (Component.this.longClickListener != null) {
                                Component.this.longClickListener.onLongClick(Component.this.view);
                            }
                            super.onLongPress(motionEvent);
                        }

                        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("d156fc43", new Object[]{this, motionEvent})).booleanValue();
                            }
                            if (Component.this.clickListener != null && System.currentTimeMillis() - Component.this.doubleClickTimeStamp > ViewConfiguration.getDoubleTapTimeout() * 2) {
                                Component.this.clickListener.onClick(Component.this.view);
                            }
                            return Component.this.clickListener != null;
                        }

                        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                        public boolean onSingleTapUp(MotionEvent motionEvent) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue() : Component.this.clickListener != null;
                        }
                    });
                    this.touchListener = new View.OnTouchListener() { // from class: com.taobao.tao.flexbox.layoutmanager.core.Component.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue() : gestureDetector.onTouchEvent(motionEvent);
                        }
                    };
                    this.view.setOnTouchListener(this.touchListener);
                } else {
                    ogg.b("组件" + this.node.K() + "配置了ondblclick消息, 但是组件本身不支持该事件");
                }
            }
            final Object e2 = this.node.e("onclick");
            if (e2 != null) {
                this.clickListener = new View.OnClickListener() { // from class: com.taobao.tao.flexbox.layoutmanager.core.Component.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        if ((Component.this.viewParams.bb > 0 && currentTimeMillis - Component.this.clickTimeStamp < Component.this.viewParams.bb) || !com.taobao.tao.flexbox.layoutmanager.event.c.a().a(Component.this.getNode())) {
                            return;
                        }
                        Component component = Component.this;
                        component.sendMessage(component.node, "click", null, null, null);
                        Component component2 = Component.this;
                        component2.sendMessage(component2.node, "onclick", Component.access$000(Component.this, e2), Component.this.clickArgs(), com.taobao.tao.flexbox.layoutmanager.event.c.a().b());
                        Component.this.clickTimeStamp = currentTimeMillis;
                    }
                };
                if (this.touchListener == null) {
                    this.view.setOnClickListener(this.clickListener);
                }
            } else {
                this.view.setOnClickListener(null);
                this.view.setClickable(false);
                this.clickListener = null;
            }
            final Object e3 = this.node.e("onlongpress");
            if (e3 != null) {
                this.longClickListener = new View.OnLongClickListener() { // from class: com.taobao.tao.flexbox.layoutmanager.core.Component.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnLongClickListener
                    public boolean onLongClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                        }
                        Component.access$100(Component.this);
                        Component component = Component.this;
                        component.sendMessage(component.node, "onlongpress", Component.access$000(Component.this, e3), Component.this.longClickArgs(), null);
                        return true;
                    }
                };
                if (this.touchListener == null) {
                    this.view.setOnLongClickListener(this.longClickListener);
                }
            } else if (oec.a(this.node.e("enabled-drag"), false)) {
                this.longClickListener = new View.OnLongClickListener() { // from class: com.taobao.tao.flexbox.layoutmanager.core.Component.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnLongClickListener
                    public boolean onLongClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                        }
                        View.OnLongClickListener onLongClickListener = (View.OnLongClickListener) Component.this.node.a(2);
                        if (onLongClickListener != null) {
                            onLongClickListener.onLongClick(Component.this.view);
                        }
                        return true;
                    }
                };
                if (this.touchListener == null) {
                    this.view.setOnLongClickListener(this.longClickListener);
                }
            } else {
                if (e2 == null || (findLongClickableParentNode = findLongClickableParentNode()) == null) {
                    z = false;
                } else {
                    this.longClickListener = new View.OnLongClickListener() { // from class: com.taobao.tao.flexbox.layoutmanager.core.Component.6
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnLongClickListener
                        public boolean onLongClick(View view) {
                            View.OnLongClickListener onLongClickListener;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                            }
                            HashMap hashMap = null;
                            String a2 = oec.a(findLongClickableParentNode.e("onlongpress"), (String) null);
                            if (a2 != null) {
                                Component.access$100(Component.this);
                                if (findLongClickableParentNode.I() != null) {
                                    hashMap = findLongClickableParentNode.I().longClickArgs();
                                }
                                Component.this.sendMessage(findLongClickableParentNode, "onlongpress", a2, hashMap, null);
                            } else if (oec.a(findLongClickableParentNode.e("enabled-drag"), false) && (onLongClickListener = (View.OnLongClickListener) findLongClickableParentNode.a(2)) != null) {
                                onLongClickListener.onLongClick(findLongClickableParentNode.x());
                            }
                            return true;
                        }
                    };
                    if (this.touchListener == null) {
                        this.view.setOnLongClickListener(this.longClickListener);
                    }
                }
                if (!z) {
                    this.view.setOnLongClickListener(null);
                    this.view.setLongClickable(false);
                    this.longClickListener = null;
                    if (oeb.ay() && !(this instanceof q) && this.touchListener == null && e2 != null) {
                        final GestureDetector gestureDetector2 = new GestureDetector(this.node.N(), new GestureDetector.SimpleOnGestureListener() { // from class: com.taobao.tao.flexbox.layoutmanager.core.Component.7
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                            public boolean onSingleTapUp(MotionEvent motionEvent) {
                                IpChange ipChange2 = $ipChange;
                                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue() : Component.this.clickListener != null;
                            }

                            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    return ((Boolean) ipChange2.ipc$dispatch("d156fc43", new Object[]{this, motionEvent})).booleanValue();
                                }
                                if (Component.this.clickListener != null && System.currentTimeMillis() - Component.this.doubleClickTimeStamp > ViewConfiguration.getDoubleTapTimeout() * 2) {
                                    Component.this.clickListener.onClick(Component.this.view);
                                }
                                return Component.this.clickListener != null;
                            }
                        });
                        this.touchListener = new View.OnTouchListener() { // from class: com.taobao.tao.flexbox.layoutmanager.core.Component.8
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.View.OnTouchListener
                            public boolean onTouch(View view, MotionEvent motionEvent) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                                }
                                view.setOnClickListener(null);
                                return gestureDetector2.onTouchEvent(motionEvent);
                            }
                        };
                        this.view.setOnTouchListener(this.touchListener);
                    }
                }
            }
            if (e2 != null) {
                return;
            }
            this.view.setOnClickListener(null);
            this.view.setClickable(false);
            this.clickListener = null;
        }
    }

    private void requestParentTouchDisallow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ab3848", new Object[]{this});
        } else if (oeb.t() && getView() != null) {
            for (ViewParent parent = getView().getParent(); parent != null; parent = parent.getParent()) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private aa findLongClickableParentNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("ff96d97e", new Object[]{this});
        }
        aa aaVar = this.node;
        do {
            aaVar = aaVar.J();
            if (aaVar == null) {
                return null;
            }
            if (aaVar.e("onlongpress") != null) {
                break;
            }
        } while (aaVar.e("enabled-drag") == null);
        return aaVar;
    }

    public void onRenderCompleted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751666fd", new Object[]{this});
            return;
        }
        Map<String, com.taobao.tao.flexbox.layoutmanager.event.d> map = this.renderCompleteListeners;
        if (map == null) {
            return;
        }
        for (Map.Entry<String, com.taobao.tao.flexbox.layoutmanager.event.d> entry : map.entrySet()) {
            entry.getValue().a(this.node, this);
        }
    }

    public void registerRenderCompleteListener(String str, com.taobao.tao.flexbox.layoutmanager.event.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49ed700", new Object[]{this, str, dVar});
            return;
        }
        if (this.renderCompleteListeners == null) {
            this.renderCompleteListeners = new HashMap();
        }
        if (this.renderCompleteListeners.containsKey(str)) {
            return;
        }
        this.renderCompleteListeners.put(str, dVar);
    }

    public void addOrUpdateView(boolean z, View view, r rVar, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1854fc7", new Object[]{this, new Boolean(z), view, rVar, aaVar});
        } else if (!(this.view instanceof ViewGroup)) {
        } else {
            if (view.getParent() != null) {
                if (view.getParent() == this.view) {
                    return;
                }
                ((ViewGroup) view.getParent()).removeView(view);
            }
            ((ViewGroup) this.view).addView(view);
        }
    }

    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        onDetach();
        cancelImageLoadTask();
        cancelRunningAnimator();
        this.node.k().s().b(this.node);
        V v = this.view;
        if (v != null && v.getParent() != null) {
            ((ViewGroup) this.view.getParent()).removeView(this.view);
        }
        V v2 = this.view;
        if (v2 instanceof ViewGroup) {
            ((ViewGroup) v2).removeAllViews();
        }
        this.view = null;
        this.initRender = true;
        m mVar = this.flexBoxNode;
        if (mVar != null) {
            mVar.d();
        }
        this.attached = false;
        this.node.k().e().a(this);
        Map<String, com.taobao.tao.flexbox.layoutmanager.event.d> map = this.renderCompleteListeners;
        if (map == null) {
            return;
        }
        map.clear();
        this.renderCompleteListeners = null;
    }

    private void cancelRunningAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8e5aa73", new Object[]{this});
        } else {
            this.node.g();
        }
    }

    public void parseViewParams(HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95dd246e", new Object[]{this, hashMap});
            return;
        }
        if (this.viewParams == null) {
            this.viewParams = mo1260generateViewParams();
            this.viewParams.a(this.node);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("parseViewParams:");
        sb.append(this.node.c != null ? this.node.c.l : "null");
        ogh.a(sb.toString());
        this.viewParams.a(this.node.f20292a.f20321a, hashMap);
        ogh.b();
    }

    public a peekHostViewComponent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("dc86eeda", new Object[]{this}) : this.currentHostViewComponentInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fa, code lost:
        r0.f20278a = r2.f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.tao.flexbox.layoutmanager.core.Component.a getHostViewComponent() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.Component.getHostViewComponent():com.taobao.tao.flexbox.layoutmanager.core.Component$a");
    }

    public void removePerformClickCallback() {
        Method a2;
        if (this.view == null || (a2 = ohc.a("removePerformClickCallback", View.class)) == null) {
            return;
        }
        try {
            a2.invoke(this.view, new Object[0]);
        } catch (IllegalAccessException e) {
            ogg.b("failed to removePerformClick" + e.getMessage());
        } catch (InvocationTargetException e2) {
            ogg.b("failed to removePerformClick" + e2.getMessage());
        }
    }

    public void handleChildAdded(aa aaVar, int i, aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc32990", new Object[]{this, aaVar, new Integer(i), aaVar2});
        } else {
            checkListItemChanged(aaVar, aaVar2);
        }
    }

    public void handleChildDeleted(aa aaVar, int i, aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80fbc97", new Object[]{this, aaVar, new Integer(i), aaVar2});
            return;
        }
        checkListItemChanged(aaVar, aaVar2);
        HashMap hashMap = new HashMap();
        hashMap.put("type", "delete");
        sendMessage(MSG_FLAG_DISAPPEAR, aaVar2, "onwilldisappear", null, hashMap, null);
        sendMessage(MSG_FLAG_DISAPPEAR, aaVar2, "ondestroy", null, hashMap, null);
    }

    public void handleChildMoved(aa aaVar, int i, int i2, aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f8fdf6", new Object[]{this, aaVar, new Integer(i), new Integer(i2), aaVar2});
            return;
        }
        if (aaVar2 != null && aaVar2.f != null && aaVar2.f.flexBoxNode != null) {
            aaVar2.f.flexBoxNode.a(i, i2);
        }
        if (!oeb.cq()) {
            sortChildren();
        }
        checkListItemChanged(aaVar, aaVar2);
    }

    public void handleChildChanged(aa aaVar, aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ffabe17", new Object[]{this, aaVar, aaVar2});
        } else {
            checkListItemChanged(aaVar, aaVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void checkListItemChanged(com.taobao.tao.flexbox.layoutmanager.core.aa r10, com.taobao.tao.flexbox.layoutmanager.core.aa r11) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.core.Component.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r9
            r2 = 1
            r1[r2] = r10
            r10 = 2
            r1[r10] = r11
            java.lang.String r10 = "7f734452"
            r0.ipc$dispatch(r10, r1)
            return
        L18:
            com.taobao.tao.flexbox.layoutmanager.core.aa r0 = com.taobao.tao.flexbox.layoutmanager.core.ad.d(r11)
            if (r0 == 0) goto L71
            android.view.View r1 = r0.x()
            if (r1 == 0) goto L71
            com.taobao.tao.flexbox.layoutmanager.core.Component r1 = r0.I()
            boolean r1 = r1 instanceof tb.ofo
            if (r1 == 0) goto L71
            r1 = 4
            com.taobao.tao.flexbox.layoutmanager.core.aa r3 = r10.J()
            if (r3 == 0) goto L49
            com.taobao.tao.flexbox.layoutmanager.core.aa r3 = r10.J()
            java.lang.String r3 = r3.K()
            java.lang.String r4 = "header"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L49
            r1 = 20
            r4 = 20
        L47:
            r5 = 0
            goto L58
        L49:
            com.taobao.tao.flexbox.layoutmanager.core.Component r3 = r0.I()     // Catch: java.lang.Exception -> L56
            tb.ofo r3 = (tb.ofo) r3     // Catch: java.lang.Exception -> L56
            int r10 = r3.a(r10, r11)     // Catch: java.lang.Exception -> L56
            r5 = r10
            r4 = 4
            goto L58
        L56:
            r4 = 4
            goto L47
        L58:
            if (r5 < 0) goto L71
            r0.b(r2)
            com.taobao.tao.flexbox.layoutmanager.core.Component r10 = r0.I()
            r3 = r10
            tb.ofo r3 = (tb.ofo) r3
            r6 = -1
            r7 = 0
            r8 = r11
            r3.a(r4, r5, r6, r7, r8)
            com.taobao.tao.flexbox.layoutmanager.core.aa r10 = r0.L()
            r9.checkListItemChanged(r10, r0)
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.Component.checkListItemChanged(com.taobao.tao.flexbox.layoutmanager.core.aa, com.taobao.tao.flexbox.layoutmanager.core.aa):void");
    }

    public void setWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf60358", new Object[]{this, new Integer(i)});
        } else if (this.view == null || this.measureResult.f20361a == i) {
        } else {
            this.measureResult.f20361a = i;
            if (!this.node.d.isEmpty()) {
                int i2 = this.measureResult.c;
                int i3 = this.measureResult.d;
                this.node.c(this.measureResult.f20361a, this.measureResult.b);
                r rVar = this.measureResult;
                rVar.c = i2;
                rVar.d = i3;
            }
            this.node.b(this.view.getContext());
        }
    }

    public void setHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde48d3", new Object[]{this, new Integer(i)});
        } else if (this.view == null || this.measureResult.b == i) {
        } else {
            this.measureResult.b = i;
            if (!this.node.d.isEmpty()) {
                int i2 = this.measureResult.c;
                int i3 = this.measureResult.d;
                this.node.c(this.measureResult.f20361a, this.measureResult.b);
                r rVar = this.measureResult;
                rVar.c = i2;
                rVar.d = i3;
            }
            this.node.b(this.view.getContext());
        }
    }

    public void updateNeedLayoutOrRender(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea683293", new Object[]{this, str});
        } else if (isLayoutKey(str)) {
            this.node.m();
        } else {
            this.node.b(false);
        }
    }

    public final boolean isLayoutKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4aad6520", new Object[]{this, str})).booleanValue();
        }
        c attributeHandler = getAttributeHandler(str);
        return (attributeHandler != null && attributeHandler.b()) || j.a(str);
    }

    public aa setAttributes(Map<String, Object> map, Map map2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("8b3d2cfe", new Object[]{this, map, map2});
        }
        if (map != null) {
            aa L = this.node.L();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                boolean a2 = this.node.a(entry.getKey(), entry.getValue());
                z |= a2;
                if (a2) {
                    this.node.f.updateNeedLayoutOrRender(entry.getKey());
                }
            }
            if (z) {
                handleChildChanged(L, this.node);
                return L;
            }
        }
        return null;
    }

    public static Map<String, c> getBaseAttributeHandles() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a96acf72", new Object[0]) : attributeHandlers;
    }

    public void onCreate(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b45d2a", new Object[]{this, aaVar});
            return;
        }
        this.node = aaVar;
        aaVar.aa();
    }

    public Map<String, c> getAttributeHandleMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("98d47bca", new Object[]{this}) : attributeHandlers;
    }

    public c getAttributeHandler(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("1e262aca", new Object[]{this, str}) : getAttributeHandleMap().get(str);
    }

    private void postOnViewDidLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ca9090c", new Object[]{this});
            return;
        }
        final String str = (String) this.node.e("onviewdidlayout");
        V v = this.view;
        if (v == null || str == null) {
            return;
        }
        v.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.taobao.tao.flexbox.layoutmanager.core.Component.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                } else if (Component.this.measureResult == null || Component.this.view == null) {
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("x", Integer.valueOf(ohd.b(Component.this.getNode(), Component.this.view.getContext(), Component.this.measureResult.c)));
                    hashMap.put("y", Integer.valueOf(ohd.b(Component.this.getNode(), Component.this.view.getContext(), Component.this.measureResult.d)));
                    hashMap.put("w", Integer.valueOf(ohd.b(Component.this.getNode(), Component.this.view.getContext(), Component.this.measureResult.f20361a)));
                    hashMap.put("h", Integer.valueOf(ohd.b(Component.this.getNode(), Component.this.view.getContext(), Component.this.measureResult.b)));
                    Component component = Component.this;
                    component.sendMessage(component.node, "onviewdidlayout", str, hashMap, null);
                }
            }
        });
    }

    public void onRender(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6dc40ec", new Object[]{this, context});
            return;
        }
        if (this.view == null) {
            try {
                ogh.a("onCreateView:" + this.node.c.l);
                if (this.prepareView != null) {
                    this.view = this.prepareView;
                    this.prepareView = null;
                } else {
                    this.view = onCreateView(context);
                }
                if (this.view != null) {
                    this.view.setTag(R.id.layout_manager_tnode, this.node);
                }
                postOnViewDidLayout();
                onViewCreated();
                String str = (String) this.node.e("oncreate");
                boolean p = this.node.p();
                if (str != null && !p) {
                    sendMessage(this.node, "oncreate", str, null, null);
                }
                executeCreateAnimation();
                executeShareElementAnimation();
                ogh.b();
            } catch (Exception e) {
                ogh.b();
                ogg.a("TNode", e.getMessage());
            }
        }
        if (this.view != null) {
            a aVar = this.currentHostViewComponentInfo;
            a hostViewComponent = getHostViewComponent();
            if (hostViewComponent != null && aVar != null && hostViewComponent.b.equals(aVar.b)) {
                z = false;
            }
            this.currentHostViewComponentInfo = hostViewComponent;
            if (this.initRender) {
                ogh.a("firstRender:" + this.node.c.l);
                onBindEvent();
                ogh.b();
            }
            if (z || needApplyAttrForComponent()) {
                ogh.a("applyAttrForView:" + this.node.c.l);
                applyAttrForView(this.view, this.viewParams, this.node.v(), this.initRender);
                ogh.b();
            }
            this.initRender = false;
        }
        ogh.a("onAttach:" + this.node.c.l);
        if (!this.attached) {
            onAttach();
            onAttachComplete();
        } else if (z) {
            onUpdateLayout();
        }
        this.attrInitInPrepare = false;
        ogh.b();
    }

    public boolean needApplyAttrForComponent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e11fa968", new Object[]{this})).booleanValue() : !this.attached || this.initRender || this.node.s() || this.node.r() || (this instanceof g) || (this instanceof o);
    }

    public void onAttach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f7278b", new Object[]{this});
        } else {
            attachComponent();
        }
    }

    public void onUpdateLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79c9fc59", new Object[]{this});
        } else {
            attachComponent();
        }
    }

    public void onBindEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89486ec5", new Object[]{this});
        } else {
            bindEvent();
        }
    }

    public boolean onUpdateAttribute(c cVar, String str, Object obj, aa.d dVar) {
        V v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("659a14fc", new Object[]{this, cVar, str, obj, dVar})).booleanValue();
        }
        if (cVar == null || (v = this.view) == null) {
            return false;
        }
        cVar.a((f) this, (Component<V, P>) v, (V) this.viewParams, this.node.p);
        return true;
    }

    public boolean needUpdateViewParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffaabeb4", new Object[]{this})).booleanValue();
        }
        HashMap<String, Object> v = this.node.v();
        return (v != null && !v.isEmpty()) || this.node.r();
    }

    public void onLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6839f0", new Object[]{this});
            return;
        }
        if (this.viewParams == null) {
            ogh.a("onLayout");
            this.viewParams = mo1260generateViewParams();
            this.viewParams.a(this.node);
            HashMap y = this.node.y();
            this.viewParams.a(this.node.N(), y);
            if (oeb.cy()) {
                this.node.c(y);
            }
            if (this.node.k() != null && this.node.k().c() != null && this.node.J() == null) {
                k c = this.node.k().c();
                c.c(this.viewParams.bi);
                c.a(this.viewParams.bj);
            }
            ogh.b();
        } else {
            ogh.a("parseViewParams");
            if (needUpdateViewParam()) {
                this.viewParams.a(this.node.N(), this.node.y());
            }
            ogh.b();
        }
        if (this instanceof ah) {
            return;
        }
        ogh.a("setup flexBoxNode");
        if (this.flexBoxNode == null) {
            this.flexBoxNode = m.a(this);
        }
        if (this.flexBoxNode.b()) {
            this.flexBoxNode.c();
            this.flexBoxNode.a(onCreateMeasureFunction());
            this.flexBoxNode.f();
        } else {
            if (this.node.n()) {
                this.flexBoxNode.e();
            }
            if (this.node.J() != null && this.node.J().n() && oeb.bP()) {
                this.flexBoxNode.e();
            }
            if (this.node.r()) {
                this.flexBoxNode.f();
            } else {
                HashMap<String, Object> v = this.node.v();
                if (v != null) {
                    for (Map.Entry<String, Object> entry : v.entrySet()) {
                        this.flexBoxNode.a(entry.getKey());
                    }
                }
            }
        }
        if (!onBeforeAddToLayoutTree()) {
            onAfterAddToLayoutTree(this.flexBoxNode.g());
        }
        ogh.b();
    }

    public void calculateLayout(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("281c58f7", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.flexBoxNode.a(f, f2);
        }
    }

    public void onLayoutComplete() {
        int i;
        int i2;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2801c9", new Object[]{this});
            return;
        }
        r rVar = this.measureResult;
        if (rVar == null) {
            this.measureResult = new r();
            i = 0;
            i2 = 0;
            z = true;
        } else {
            i = rVar.f20361a;
            i2 = this.measureResult.b;
            z = false;
        }
        m mVar = this.flexBoxNode;
        if (mVar != null) {
            this.measureResult.a((int) mVar.j(), (int) this.flexBoxNode.k(), (int) this.flexBoxNode.h(), (int) this.flexBoxNode.i());
            checkOverFlow();
            if (ad.a(this.node)) {
                this.flexBoxNode.d();
            }
        }
        if (i != this.measureResult.f20361a || i2 != this.measureResult.b) {
            onLayoutChanged(i, i2, this.measureResult.f20361a, this.measureResult.b, z);
        }
        notifyRealLayoutChange(this.measureResult.f20361a, this.measureResult.b);
    }

    private void checkOverFlow() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("377bb8d1", new Object[]{this});
        } else if (this.viewParams.az != null || this.node.b == null || this.node.b.f == null || ignoreClipCheck(this.node.b.f) || this.node.b.f.flexBoxNode == null) {
        } else {
            boolean bm = oeb.bm();
            if (this.measureResult.c + this.measureResult.f20361a > this.node.b.f.flexBoxNode.j() || this.measureResult.d + this.measureResult.b > this.node.b.f.flexBoxNode.k()) {
                z = true;
            }
            if (!bm) {
                return;
            }
            if (z) {
                setupClipStatus(this.node.b.f.getViewParams().e());
                return;
            }
            if (oec.a(this.node.b.e("clip-children"), true)) {
                updateClipChild(this.node.b.f, true);
            }
            if (this.node.b.b == null || !oec.a(this.node.b.b.e("clip-children"), true)) {
                return;
            }
            updateClipChild(this.node.b.b.f, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updateClipChild(Component component, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31507b13", new Object[]{this, component, new Boolean(z)});
        } else if (component == null || component.getViewParams().ba == z) {
        } else {
            component.getViewParams().ba = z;
            c.o.a((f) component, (Component) component.getView(), (View) component.getViewParams(), (aa.d) null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
        if (r1.f == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ba, code lost:
        if (ignoreClipCheck(r1.f) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
        if (r1.f.getViewParams().e() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c8, code lost:
        updateClipChild(r1.f, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cd, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setupClipStatus(boolean r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.core.Component.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1a
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r4
            java.lang.Boolean r2 = new java.lang.Boolean
            r2.<init>(r5)
            r1[r3] = r2
            java.lang.String r5 = "fc637cce"
            r0.ipc$dispatch(r5, r1)
            return
        L1a:
            if (r5 == 0) goto L63
            com.taobao.tao.flexbox.layoutmanager.core.aa r5 = r4.node
            com.taobao.tao.flexbox.layoutmanager.core.aa r5 = r5.b
            java.lang.String r0 = "clip-children"
            java.lang.Object r5 = r5.e(r0)
            boolean r5 = tb.oec.a(r5, r3)
            if (r5 == 0) goto L35
            com.taobao.tao.flexbox.layoutmanager.core.aa r5 = r4.node
            com.taobao.tao.flexbox.layoutmanager.core.aa r5 = r5.b
            com.taobao.tao.flexbox.layoutmanager.core.Component r5 = r5.f
            r4.updateClipChild(r5, r3)
        L35:
            com.taobao.tao.flexbox.layoutmanager.core.aa r5 = r4.node
            com.taobao.tao.flexbox.layoutmanager.core.aa r5 = r5.b
            com.taobao.tao.flexbox.layoutmanager.core.aa r5 = r5.b
            if (r5 == 0) goto Lcd
            com.taobao.tao.flexbox.layoutmanager.core.aa r5 = r4.node
            com.taobao.tao.flexbox.layoutmanager.core.aa r5 = r5.b
            com.taobao.tao.flexbox.layoutmanager.core.aa r5 = r5.b
            com.taobao.tao.flexbox.layoutmanager.core.Component r5 = r5.f
            if (r5 == 0) goto Lcd
            com.taobao.tao.flexbox.layoutmanager.core.aa r5 = r4.node
            com.taobao.tao.flexbox.layoutmanager.core.aa r5 = r5.b
            com.taobao.tao.flexbox.layoutmanager.core.aa r5 = r5.b
            java.lang.Object r5 = r5.e(r0)
            boolean r5 = tb.oec.a(r5, r3)
            if (r5 == 0) goto Lcd
            com.taobao.tao.flexbox.layoutmanager.core.aa r5 = r4.node
            com.taobao.tao.flexbox.layoutmanager.core.aa r5 = r5.b
            com.taobao.tao.flexbox.layoutmanager.core.aa r5 = r5.b
            com.taobao.tao.flexbox.layoutmanager.core.Component r5 = r5.f
            r4.updateClipChild(r5, r3)
            return
        L63:
            com.taobao.tao.flexbox.layoutmanager.core.r r5 = r4.measureResult
            int r5 = r5.c
            com.taobao.tao.flexbox.layoutmanager.core.r r0 = r4.measureResult
            int r0 = r0.d
            com.taobao.tao.flexbox.layoutmanager.core.aa r1 = r4.node
            com.taobao.tao.flexbox.layoutmanager.core.aa r1 = r1.b
        L6f:
            if (r1 == 0) goto Lae
            com.taobao.tao.flexbox.layoutmanager.core.Component r3 = r1.f
            if (r3 == 0) goto Lae
            com.taobao.tao.flexbox.layoutmanager.core.Component r3 = r1.f
            boolean r3 = r4.ignoreClipCheck(r3)
            if (r3 != 0) goto Lae
            boolean r3 = r4.overFlow(r1, r5, r0)
            if (r3 == 0) goto Lae
            float r5 = (float) r5
            com.taobao.tao.flexbox.layoutmanager.core.Component r3 = r1.f
            com.taobao.tao.flexbox.layoutmanager.core.m r3 = r3.flexBoxNode
            float r3 = r3.h()
            float r5 = r5 + r3
            int r5 = (int) r5
            float r0 = (float) r0
            com.taobao.tao.flexbox.layoutmanager.core.Component r3 = r1.f
            com.taobao.tao.flexbox.layoutmanager.core.m r3 = r3.flexBoxNode
            float r3 = r3.i()
            float r0 = r0 + r3
            int r0 = (int) r0
            com.taobao.tao.flexbox.layoutmanager.core.Component r3 = r1.f
            tb.ogl r3 = r3.getViewParams()
            boolean r3 = r3.e()
            if (r3 != 0) goto Lad
            com.taobao.tao.flexbox.layoutmanager.core.Component r3 = r1.f
            r4.updateClipChild(r3, r2)
            com.taobao.tao.flexbox.layoutmanager.core.aa r1 = r1.b
            goto L6f
        Lad:
            return
        Lae:
            if (r1 == 0) goto Lcd
            com.taobao.tao.flexbox.layoutmanager.core.Component r5 = r1.f
            if (r5 == 0) goto Lcd
            com.taobao.tao.flexbox.layoutmanager.core.Component r5 = r1.f
            boolean r5 = r4.ignoreClipCheck(r5)
            if (r5 != 0) goto Lcd
            com.taobao.tao.flexbox.layoutmanager.core.Component r5 = r1.f
            tb.ogl r5 = r5.getViewParams()
            boolean r5 = r5.e()
            if (r5 != 0) goto Lcd
            com.taobao.tao.flexbox.layoutmanager.core.Component r5 = r1.f
            r4.updateClipChild(r5, r2)
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.Component.setupClipStatus(boolean):void");
    }

    private boolean ignoreClipCheck(Component component) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5e2d442", new Object[]{this, component})).booleanValue() : (component instanceof ah) || (component instanceof u) || (component instanceof g) || (component instanceof com.taobao.tao.flexbox.layoutmanager.component.u) || component.getNode().b == null || component.getViewParams().az == YogaPositionType.ABSOLUTE;
    }

    private boolean overFlow(aa aaVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74ee35f5", new Object[]{this, aaVar, new Integer(i), new Integer(i2)})).booleanValue();
        }
        m mVar = aaVar.I().flexBoxNode;
        return ((float) (i + this.measureResult.f20361a)) > mVar.j() || ((float) (i2 + this.measureResult.b)) > mVar.k();
    }

    public void onLayoutChanged(int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8e65c2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
        } else if (this.node.J() == null || this.node.J().I() == null) {
        } else {
            this.node.J().I().onChildLayoutChanged(this, i, i2, i3, i4, z);
        }
    }

    public void onRealLayoutChanged(int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa37c980", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
        } else if (i2 == i4) {
        } else {
            notifyComponentInfoChange(ComponentInfoDef.HEIGHT, Integer.valueOf(i4));
        }
    }

    public m getFlexBoxNode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("76fc7c70", new Object[]{this}) : this.flexBoxNode;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.f
    public r getMeasureResult() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (r) ipChange.ipc$dispatch("fb302372", new Object[]{this}) : this.measureResult;
    }

    public r getHostViewMeasureResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("2d0d2005", new Object[]{this});
        }
        a aVar = this.currentHostViewComponentInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.b;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.f
    public aa getTNode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("f30069b7", new Object[]{this}) : this.node;
    }

    public boolean invoke(g.c cVar, String str, JSONObject jSONObject, g.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f67261c", new Object[]{this, cVar, str, jSONObject, dVar})).booleanValue();
        }
        char c = 65535;
        if (str.hashCode() == 1795898796 && str.equals("setToFront")) {
            c = 0;
        }
        if (c != 0) {
            return false;
        }
        if (this.view != null) {
            if (this.node.J() != null && (this.node.J().I() instanceof p)) {
                ((p) this.node.J().I()).a(this.node);
            } else if (Build.VERSION.SDK_INT >= 21) {
                this.view.setZ(1.0f);
            }
        }
        return true;
    }

    public void setBackgroundTask(ImageLoader.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a879d442", new Object[]{this, eVar});
        } else {
            this.backgroundTask = eVar;
        }
    }

    public void cancelImageLoadTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("855b433", new Object[]{this});
            return;
        }
        ImageLoader.e eVar = this.backgroundTask;
        if (eVar == null) {
            return;
        }
        eVar.a();
    }

    public boolean isTransitionChildComponent(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c87ac28", new Object[]{this, component})).booleanValue();
        }
        View view = component.getView();
        return view != null && view.getParent() == this.view;
    }

    public <T> T getComponentInfo(com.taobao.tao.flexbox.layoutmanager.databinding.componentbind.componentinfo.b<T, ?> bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("890694d3", new Object[]{this, bVar}) : bVar.a(this);
    }

    public <T> void notifyComponentInfoChange(com.taobao.tao.flexbox.layoutmanager.databinding.componentbind.componentinfo.b<T, ?> bVar, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bd539d8", new Object[]{this, bVar, t});
            return;
        }
        String a2 = oec.a(getNode().e("id"), (String) null);
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        getNode().k().e().a((Component) this, a2, (com.taobao.tao.flexbox.layoutmanager.databinding.componentbind.componentinfo.b<com.taobao.tao.flexbox.layoutmanager.databinding.componentbind.componentinfo.b<T, ?>, ?>) bVar, (com.taobao.tao.flexbox.layoutmanager.databinding.componentbind.componentinfo.b<T, ?>) t);
    }

    public <T, Observer extends b.a<T>> T registerComponentInfoChangeObserver(String str, com.taobao.tao.flexbox.layoutmanager.databinding.componentbind.componentinfo.b<T, Observer> bVar, Observer observer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("ab8987ca", new Object[]{this, str, bVar, observer}) : (T) getNode().k().e().a((Component) this, str, (com.taobao.tao.flexbox.layoutmanager.databinding.componentbind.componentinfo.b<Object, com.taobao.tao.flexbox.layoutmanager.databinding.componentbind.componentinfo.b<T, Observer>>) bVar, (com.taobao.tao.flexbox.layoutmanager.databinding.componentbind.componentinfo.b<T, Observer>) observer);
    }

    public <T, Observer extends b.a<T>> void removeComponentInfoChangeObserver(String str, com.taobao.tao.flexbox.layoutmanager.databinding.componentbind.componentinfo.b<T, Observer> bVar, b.a<T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eafc84e7", new Object[]{this, str, bVar, aVar});
        } else {
            getNode().k().e().b(this, str, bVar, aVar);
        }
    }

    public com.taobao.tao.flexbox.layoutmanager.container.i getRenderIntercept() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.container.i) ipChange.ipc$dispatch("4070f656", new Object[]{this});
        }
        TNodeView findTNodeView = findTNodeView(this.view);
        if (findTNodeView == null) {
            return null;
        }
        return findTNodeView.getRenderIntercept();
    }

    private TNodeView findTNodeView(View view) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeView) ipChange.ipc$dispatch("2f0fe5e6", new Object[]{this, view});
        }
        while (true) {
            z = view instanceof TNodeView;
            if (z || view == null) {
                break;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                break;
            }
            view = (View) parent;
        }
        if (!z) {
            return null;
        }
        return (TNodeView) view;
    }

    public void updateAPMToken(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcfe6c11", new Object[]{this, view, str});
        } else if (view == null) {
        } else {
            if (this.viewParams.bz) {
                view.setTag(com.taobao.monitor.procedure.v.APM_VIEW_TOKEN, str);
            } else {
                view.setTag(com.taobao.monitor.procedure.v.APM_VIEW_TOKEN, com.taobao.monitor.procedure.v.APM_VIEW_IGNORE);
            }
        }
    }

    public void clearCacheSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89accc5d", new Object[]{this});
            return;
        }
        m mVar = this.flexBoxNode;
        if (mVar == null) {
            return;
        }
        mVar.A();
    }
}

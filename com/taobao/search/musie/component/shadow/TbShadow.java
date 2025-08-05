package com.taobao.search.musie.component.shadow;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_framework.util.i;
import com.taobao.android.weex_uikit.ui.MUSNodeHost;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.div.Div;
import com.taobao.search.common.util.q;
import com.taobao.search.mmd.util.d;
import tb.kge;

/* loaded from: classes7.dex */
public class TbShadow extends Div {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ATTR_BOX_SHADOW = "boxShadow";
    private static final String ATTR_SHADOW_RADIUS = "shadowRadius";
    private com.taobao.search.musie.component.shadow.a shadowDrawable;

    static {
        kge.a(-903247377);
    }

    public static /* synthetic */ Object ipc$super(TbShadow tbShadow, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -285278287:
                super.onMount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case -136526582:
                super.onUnmount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case -110296387:
                super.dispatchDraw((MUSNodeHost) objArr[0], (Canvas) objArr[1], ((Number) objArr[2]).floatValue());
                return null;
            case 545542899:
                return new Boolean(super.onUpdateStyle((UINode) objArr[0], (String) objArr[1], (MUSValue) objArr[2]));
            case 1084303291:
                super.onUpdateExtra((UINode) objArr[0], objArr[1], (String) objArr[2], objArr[3]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean isRenderNodeEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("491d646a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public TbShadow(int i) {
        super(i);
    }

    @MUSNodeProp(name = ATTR_SHADOW_RADIUS)
    public void setShadowRadius(MUSValue mUSValue) {
        String valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ac50008", new Object[]{this, mUSValue});
        } else if (mUSValue.isNull()) {
            setAttribute(ATTR_SHADOW_RADIUS, Float.valueOf(0.0f));
        } else {
            if (mUSValue.isString()) {
                valueOf = mUSValue.getStringValue();
            } else {
                valueOf = mUSValue.isInt() ? String.valueOf(mUSValue.getIntValue()) : "0";
            }
            setAttribute(ATTR_SHADOW_RADIUS, Float.valueOf(i.a(valueOf)));
        }
    }

    @MUSNodeProp(name = ATTR_SHADOW_RADIUS, refresh = true)
    public void refreshShadowRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("200cabec", new Object[]{this, new Float(f)});
            return;
        }
        com.taobao.search.musie.component.shadow.a aVar = this.shadowDrawable;
        if (aVar == null) {
            return;
        }
        aVar.a(this, (a) getExtra("boxShadow"), getShadowRadius());
        invalidate();
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean onUpdateStyle(UINode uINode, String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("208452f3", new Object[]{this, uINode, str, mUSValue})).booleanValue();
        }
        boolean onUpdateStyle = super.onUpdateStyle(uINode, str, mUSValue);
        if (!onUpdateStyle) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1621067310) {
                if (hashCode == 743055051 && str.equals("boxShadow")) {
                    c = 0;
                }
            } else if (str.equals(ATTR_SHADOW_RADIUS)) {
                c = 1;
            }
            if (c == 0) {
                setExtra("boxShadow", new a(mUSValue.getStringValue()));
                return true;
            } else if (c == 1) {
                setShadowRadius(mUSValue);
                return true;
            }
        }
        return onUpdateStyle;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onUpdateExtra(UINode uINode, Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40a127bb", new Object[]{this, uINode, obj, str, obj2});
            return;
        }
        super.onUpdateExtra(uINode, obj, str, obj2);
        if (!"boxShadow".equals(str) || obj == null) {
            return;
        }
        ((com.taobao.search.musie.component.shadow.a) obj).a(uINode, (a) obj2, getShadowRadius());
        invalidate();
    }

    private float getShadowRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4bf92cbf", new Object[]{this})).floatValue();
        }
        Float f = (Float) getAttribute(ATTR_SHADOW_RADIUS);
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void dispatchDraw(MUSNodeHost mUSNodeHost, Canvas canvas, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96d02bd", new Object[]{this, mUSNodeHost, canvas, new Float(f)});
            return;
        }
        com.taobao.search.musie.component.shadow.a aVar = this.shadowDrawable;
        if (aVar != null) {
            aVar.a(canvas);
        }
        super.dispatchDraw(mUSNodeHost, canvas, f);
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onMount(mUSDKInstance, obj);
        this.shadowDrawable = new com.taobao.search.musie.component.shadow.a();
        this.shadowDrawable.a(this, (a) getExtra("boxShadow"), getShadowRadius());
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onUnmount(mUSDKInstance, obj);
        this.shadowDrawable.a();
        this.shadowDrawable = null;
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f19234a;
        public int b;
        public int c;
        public int d;
        public Paint e;

        static {
            kge.a(1311068726);
        }

        public a(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String[] split = str.split(" +");
            if (split.length != 4) {
                q.b("TbDiv", "boxShadow属性不合法，必须要四个属性都有 hOffset vOffset radius color");
                return;
            }
            this.f19234a = (int) i.a(split[0]);
            this.b = (int) i.a(split[1]);
            this.c = (int) i.a(split[2]);
            String str2 = split[3];
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            if (str2.startsWith("rgba")) {
                String[] split2 = str2.substring(5, str2.length() - 1).split(",");
                if (split2.length != 4) {
                    return;
                }
                this.d = Color.argb(a(split2[3]), a(split2[0]), a(split2[1]), a(split2[2]));
            } else if (!str2.startsWith("#")) {
            } else {
                this.d = d.a(split[3], 0);
            }
        }

        private int a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue() : (int) (Float.parseFloat(str) * 255.0f);
        }

        public void a(Canvas canvas, int i, int i2, int i3) {
            int i4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("747ef86", new Object[]{this, canvas, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            if (this.e == null) {
                this.e = new Paint(1);
                this.e.setColor(0);
            }
            this.e.setShadowLayer(this.c, 0.0f, 0.0f, this.d);
            Path path = new Path();
            float f = (int) (this.c * 1.5f);
            RectF rectF = new RectF(f, f, i - i4, i2 - i4);
            float f2 = i3;
            path.addRoundRect(rectF, new float[]{f2, f2, f2, f2, f2, f2, f2, f2}, Path.Direction.CW);
            canvas.drawPath(path, this.e);
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.d != 0;
        }
    }
}

package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXRichTextLinkEvent;
import com.taobao.android.dinamicx.expression.event.DXRichTextPressEvent;
import com.taobao.android.dinamicx.view.richtext.node.a;
import com.taobao.android.dinamicx.view.richtext.node.b;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;

/* loaded from: classes5.dex */
public class gay extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXIMAGESPAN_CORNERRADIUS = 6313115730157071869L;
    public static final long DXIMAGESPAN_IMAGESPAN = 7700670379007126142L;
    public static final long DXIMAGESPAN_ISTRUNCATED = -1735247218921453423L;
    public static final long DXIMAGESPAN_LINK = 35873943762L;
    public static final long DXIMAGESPAN_ONLINK = 9859228430928305L;
    public static final long DXIMAGESPAN_ONPRESS = 5176476879387311985L;
    public static final long DXIMAGESPAN_PRESS = 19050239308914L;

    /* renamed from: a  reason: collision with root package name */
    private String f28253a;
    private String b;
    private com.taobao.android.dinamicx.view.richtext.node.a c;
    private boolean d;

    /* loaded from: classes5.dex */
    public interface b {
        void a(Bitmap bitmap);
    }

    static {
        kge.a(1369325065);
    }

    public static /* synthetic */ Object ipc$super(gay gayVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.bs
    public void onPrefetchSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfda7834", new Object[]{this});
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        }
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1450247200);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new gay();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new gay();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof gay)) {
        } else {
            super.onClone(dXWidgetNode, z);
            gay gayVar = (gay) dXWidgetNode;
            this.f28253a = gayVar.f28253a;
            this.b = gayVar.b;
            this.d = gayVar.d;
            this.c = gayVar.c;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        if (!fqi.a(this)) {
            return super.onCreateView(context);
        }
        return null;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else if (this.c == null) {
            if (fqi.a(this)) {
                return;
            }
            super.onBindEvent(context, view, j);
        } else if (j == 9859228430928305L && !TextUtils.isEmpty(this.f28253a)) {
            this.c.a(new b.a() { // from class: tb.gay.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.view.richtext.node.b.a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    DXRichTextLinkEvent dXRichTextLinkEvent = new DXRichTextLinkEvent(j);
                    dXRichTextLinkEvent.setLink(str);
                    gay.this.postEvent(dXRichTextLinkEvent);
                }
            });
        } else if (j == 5176476879387311985L && !TextUtils.isEmpty(this.b)) {
            this.c.a(new b.InterfaceC0479b() { // from class: tb.gay.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.view.richtext.node.b.InterfaceC0479b
                public boolean a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
                    }
                    DXRichTextPressEvent dXRichTextPressEvent = new DXRichTextPressEvent(j);
                    dXRichTextPressEvent.setData(str);
                    gay.this.postEvent(dXRichTextPressEvent);
                    return true;
                }
            });
        } else if (j == 18903999933159L) {
            this.c.a(new b.d() { // from class: tb.gay.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.view.richtext.node.b.d
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        gay.this.postEvent(new DXEvent(18903999933159L));
                    }
                }
            });
        } else if (j == -6544685697300501093L) {
            this.c.a(new b.c() { // from class: tb.gay.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.view.richtext.node.b.c
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        gay.this.postEvent(new DXEvent(-6544685697300501093L));
                    }
                }
            });
        } else if (fqi.a(this)) {
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 35873943762L) {
            this.f28253a = str;
        } else if (j == 19050239308914L) {
            this.b = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == -1735247218921453423L) {
            if (i == 0) {
                z = false;
            }
            this.d = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    public com.taobao.android.dinamicx.view.richtext.node.a a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.view.richtext.node.a) ipChange.ipc$dispatch("8e6eb23a", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
        if (getLayoutWidth() <= 0 && getLayoutHeight() <= 0) {
            return null;
        }
        a.C0478a c0478a = new a.C0478a();
        c0478a.a(getLayoutWidth()).b(getLayoutHeight()).a(this.f28253a).b(this.b).a(getAspectRatio()).c(getCornerRadius());
        com.taobao.android.dinamicx.view.richtext.node.a a2 = c0478a.a();
        if (z) {
            a(a2, z2);
        }
        this.c = a2;
        return a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
        if (android.text.TextUtils.isEmpty(r7) == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(final com.taobao.android.dinamicx.view.richtext.node.a r6, boolean r7) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.gay.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L1d
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r2 = 1
            r1[r2] = r6
            r6 = 2
            java.lang.Boolean r2 = new java.lang.Boolean
            r2.<init>(r7)
            r1[r6] = r2
            java.lang.String r6 = "511bbc20"
            r0.ipc$dispatch(r6, r1)
            return
        L1d:
            if (r6 != 0) goto L20
            return
        L20:
            com.taobao.android.dinamicx.DXRuntimeContext r0 = r5.getDXRuntimeContext()
            com.taobao.android.dinamicx.widget.am r0 = com.taobao.android.dinamicx.u.b(r0)
            if (r0 != 0) goto L2b
            return
        L2b:
            com.taobao.android.dinamicx.DXRuntimeContext r1 = r5.getDXRuntimeContext()
            if (r1 == 0) goto La9
            com.taobao.android.dinamicx.DXRuntimeContext r1 = r5.getDXRuntimeContext()
            android.content.Context r1 = r1.m()
            if (r1 != 0) goto L3c
            goto La9
        L3c:
            java.lang.String r1 = r5.getImageUrl()
            if (r7 != 0) goto L65
            boolean r7 = android.text.TextUtils.isEmpty(r1)
            if (r7 != 0) goto L65
            com.taobao.android.dinamicx.widget.ao r7 = com.taobao.android.dinamicx.u.d()
            if (r7 == 0) goto L65
            int r2 = r6.c()
            int r3 = r6.d()
            com.taobao.android.dinamicx.widget.DXImageWidgetNode$d r4 = r5.buildSimpleImageOption()
            java.lang.String r7 = r7.a(r1, r2, r3, r4)
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 != 0) goto L65
            goto L66
        L65:
            r7 = r1
        L66:
            r6.a()
            tb.gay$5 r1 = new tb.gay$5
            r1.<init>()
            boolean r6 = r0 instanceof com.taobao.android.dinamicx.widget.bf
            if (r6 == 0) goto L9e
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            com.taobao.android.dinamicx.DXRuntimeContext r2 = r5.getDXRuntimeContext()
            java.lang.String r2 = r2.A()
            if (r2 != 0) goto L83
            java.lang.String r2 = ""
        L83:
            java.lang.String r3 = "bundle_biz_code"
            r6.put(r3, r2)
            com.taobao.android.dinamicx.widget.bf$a r2 = new com.taobao.android.dinamicx.widget.bf$a
            r2.<init>()
            r2.a(r6)
            com.taobao.android.dinamicx.widget.bf r0 = (com.taobao.android.dinamicx.widget.bf) r0
            com.taobao.android.dinamicx.DXRuntimeContext r6 = r5.getDXRuntimeContext()
            android.content.Context r6 = r6.m()
            r0.a(r6, r7, r2, r1)
            return
        L9e:
            com.taobao.android.dinamicx.DXRuntimeContext r6 = r5.getDXRuntimeContext()
            android.content.Context r6 = r6.m()
            r0.a(r6, r7, r1)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gay.a(com.taobao.android.dinamicx.view.richtext.node.a, boolean):void");
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.d;
    }
}

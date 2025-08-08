package tb;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.m;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.RichTextViewImpl;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.dinamicx.widget.as;
import com.taobao.android.dinamicx.widget.c;
import com.taobao.android.g;
import com.taobao.android.i;
import com.taobao.android.k;
import com.taobao.android.l;
import com.taobao.android.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class hng extends as {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DETAIL_WIDGET_ID = -5311711999181646300L;
    private boolean g = false;
    private List<as.b> i = new ArrayList();
    private iof h = new iof();

    static {
        kge.a(-1000445235);
    }

    public static /* synthetic */ Object ipc$super(hng hngVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(hng hngVar, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29682965", new Object[]{hngVar, view, str});
        } else {
            hngVar.a(view, str);
        }
    }

    public static /* synthetic */ boolean a(hng hngVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d113aa1", new Object[]{hngVar, new Boolean(z)})).booleanValue();
        }
        hngVar.g = z;
        return z;
    }

    public hng() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.widget.DXTBDetailRichTextWidgetNode");
    }

    /* loaded from: classes4.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1547164508);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new hng();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.as, com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new hng();
    }

    @Override // com.taobao.android.dinamicx.widget.as, com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        RichTextViewImpl richTextViewImpl = new RichTextViewImpl(context);
        if (richTextViewImpl instanceof TextView) {
            richTextViewImpl.setMovementMethod(hns.a());
        }
        return richTextViewImpl;
    }

    @Override // com.taobao.android.dinamicx.widget.as, com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        if (view instanceof TextView) {
            ((TextView) view).setText(this.e);
        }
        for (final as.b bVar : this.i) {
            if (!bVar.b && !bVar.c) {
                try {
                    bVar.b = true;
                    k.a().a(getDXRuntimeContext().m()).a(bVar.f).b(new i<l>() { // from class: tb.hng.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.i
                        public boolean a(l lVar) {
                            BitmapDrawable a2;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("f5589b42", new Object[]{this, lVar})).booleanValue();
                            }
                            if (lVar != null && (a2 = lVar.a()) != null) {
                                a2.setBounds(0, 0, (int) (bVar.e * bVar.d), (int) bVar.e);
                                hng.this.e.setSpan(new c(a2, bVar.e), bVar.f12062a.f12063a, bVar.f12062a.b, bVar.f12062a.c);
                                View view2 = view;
                                if (view2 instanceof TextView) {
                                    ((TextView) view2).setText(hng.this.e);
                                }
                                bVar.c = true;
                            }
                            return false;
                        }
                    }).a(new i<g>() { // from class: tb.hng.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.i
                        public boolean a(g gVar) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("f5565567", new Object[]{this, gVar})).booleanValue();
                            }
                            bVar.c = true;
                            return false;
                        }
                    }).a();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8 A[SYNTHETIC] */
    @Override // com.taobao.android.dinamicx.widget.as
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.text.SpannableString a(com.alibaba.fastjson.JSONArray r16, int r17) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hng.a(com.alibaba.fastjson.JSONArray, int):android.text.SpannableString");
    }

    @Override // com.taobao.android.dinamicx.widget.as
    public void a(String str, as.c cVar, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("637ead06", new Object[]{this, str, cVar, new Float(f), new Float(f2)});
            return;
        }
        as.b bVar = new as.b();
        bVar.f = str;
        bVar.d = f;
        bVar.f12062a = cVar;
        bVar.e = f2;
        this.i.add(bVar);
    }

    @Override // com.taobao.android.dinamicx.widget.as
    public Object a(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f202d417", new Object[]{this, jSONObject, new Integer(i)});
        }
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("openUrl");
        if (StringUtils.isEmpty(string)) {
            return null;
        }
        return new b(string, i);
    }

    /* loaded from: classes4.dex */
    public class b extends ClickableSpan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f28740a;
        public int b;

        static {
            kge.a(-1948314014);
        }

        public b(String str, int i) {
            this.f28740a = str;
            this.b = i;
            hng.a(hng.this, false);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
                return;
            }
            textPaint.setColor(this.b);
            textPaint.setUnderlineText(false);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            try {
                if (StringUtils.isEmpty(this.f28740a)) {
                    return;
                }
                if (this.f28740a.contains("detailOpenFullFloat=true")) {
                    hng.a(hng.this, view, this.f28740a);
                } else {
                    t.a().a(view.getContext()).a(this.f28740a);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void a(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c0c6b4", new Object[]{this, view, str});
        } else if (this.g) {
        } else {
            this.g = true;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bizId", (Object) "tbDetail");
            jSONObject.put("popId", (Object) null);
            jSONObject.put("url", (Object) str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("maxHeight", (Object) 1);
            jSONObject2.put("cornerRadius", (Object) 0);
            jSONObject2.put("isOpaque", (Object) false);
            jSONObject2.put("panEnable", (Object) false);
            jSONObject2.put("attachMode", (Object) "activity");
            jSONObject2.put("droidFullScreen", (Object) true);
            jSONObject.put(com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG, (Object) jSONObject2);
            m.a(view.getContext(), view, "stdPop", com.taobao.android.tbabilitykit.m.API_H5, jSONObject, new alo() { // from class: tb.hng.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.alo
                public void onCallback(ExecuteResult executeResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                    } else {
                        hng.a(hng.this, false);
                    }
                }
            });
            android.taobao.windvane.monitor.b.commitEvent("Page_Detail", 2101, "Page_Detail_Button-WordExplain", null, null, null);
        }
    }
}

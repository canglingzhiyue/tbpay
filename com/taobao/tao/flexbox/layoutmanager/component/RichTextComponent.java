package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Xml;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.component.r;
import com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView;
import com.taobao.weex.common.Constants;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import tb.kge;
import tb.oec;
import tb.ogg;
import tb.ogk;
import tb.ogm;
import tb.ogn;
import tb.ogu;
import tb.ohd;
import tb.ohe;

/* loaded from: classes8.dex */
public class RichTextComponent extends TextComponent implements r, ogn.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static HashMap<String, a> customParsers;
    private List<b> pieces = new ArrayList();

    /* loaded from: classes8.dex */
    public interface a {
        b a(XmlPullParser xmlPullParser);
    }

    public static /* synthetic */ Object ipc$super(RichTextComponent richTextComponent, String str, Object... objArr) {
        if (str.hashCode() == 1052797818) {
            super.detach(((Boolean) objArr[0]).booleanValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.d
    public boolean canbeDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e62ddc", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$100(RichTextComponent richTextComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("9a1000b0", new Object[]{richTextComponent}) : richTextComponent.node;
    }

    public static /* synthetic */ Map access$200(RichTextComponent richTextComponent, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7577a54e", new Object[]{richTextComponent, str}) : richTextComponent.getClickTrackInfo(str);
    }

    public static /* synthetic */ Map access$300(RichTextComponent richTextComponent, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("78ff484f", new Object[]{richTextComponent, str}) : richTextComponent.getTrackInfo(str);
    }

    public static /* synthetic */ void access$400(RichTextComponent richTextComponent, SpannableString spannableString, b bVar, Drawable drawable, ogk ogkVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d3b8ec", new Object[]{richTextComponent, spannableString, bVar, drawable, ogkVar, new Integer(i), new Integer(i2)});
        } else {
            richTextComponent.setupImageSpan(spannableString, bVar, drawable, ogkVar, i, i2);
        }
    }

    public static /* synthetic */ SpannableString access$500(RichTextComponent richTextComponent, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SpannableString) ipChange.ipc$dispatch("fab53fc", new Object[]{richTextComponent, str}) : richTextComponent.getRichText(str);
    }

    static {
        kge.a(-1104238791);
        kge.a(688678286);
        kge.a(941553152);
        customParsers = new HashMap<>();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : ogu.d(context);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.d, com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.view != 0) {
            ogu.a((StaticLayoutView) this.view);
        }
        this.view = null;
        super.detach(z);
    }

    private SpannableString getRichText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("7907f6a8", new Object[]{this, str});
        }
        if (str != null && !str.startsWith("<span>")) {
            str = "<span>" + str + "</span>";
        }
        this.pieces.clear();
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            newPullParser.setInput(new StringReader(str));
            int eventType = newPullParser.getEventType();
            b bVar = null;
            boolean z = false;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = newPullParser.getName();
                    if ("span".equals(name)) {
                        bVar = new b(0);
                        bVar.a(ogk.a(this.node, this.node.N(), newPullParser.getAttributeValue(null, "style")));
                        bVar.d(oec.j(newPullParser.getAttributeValue(null, "trackinfo")));
                        this.pieces.add(bVar);
                    } else if ("img".equals(name)) {
                        bVar = new b(1);
                        bVar.a(ogk.a(this.node, this.node.N(), newPullParser.getAttributeValue(null, "style")));
                        bVar.a(newPullParser.getAttributeValue(null, "onclick"));
                        bVar.b(newPullParser.getAttributeValue(null, "src"));
                        bVar.d(oec.j(newPullParser.getAttributeValue(null, "trackinfo")));
                        this.pieces.add(bVar);
                    } else if ("a".equals(name)) {
                        bVar = new b(2);
                        bVar.a(ogk.a(this.node, this.node.N(), newPullParser.getAttributeValue(null, "style")));
                        bVar.c(oec.j(newPullParser.getAttributeValue(null, Constants.Name.HREF)));
                        bVar.d(oec.j(newPullParser.getAttributeValue(null, "trackinfo")));
                        this.pieces.add(bVar);
                    } else {
                        a aVar = customParsers.get(name);
                        if (aVar != null) {
                            bVar = aVar.a(newPullParser);
                            b.a(bVar, aVar);
                            this.pieces.add(bVar);
                        }
                    }
                    z = false;
                } else if (eventType == 3) {
                    z = true;
                } else if (eventType == 4) {
                    String j = oec.j(newPullParser.getText());
                    if (z) {
                        bVar = new b(0);
                        this.pieces.add(bVar);
                    }
                    bVar.b(j);
                }
                try {
                    eventType = newPullParser.next();
                } catch (XmlPullParserException unused) {
                    eventType = newPullParser.next();
                }
            }
            try {
                return applyPieces();
            } catch (ArrayIndexOutOfBoundsException unused2) {
                ogg.b("arrayIndexOutofBoundsException:" + str);
                return new SpannableString("");
            }
        } catch (Exception e) {
            ogg.b("setRichText: " + e.getMessage());
            return new SpannableString("");
        }
    }

    private SpannableString applyPieces() {
        SpannableString spannableString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("2088a67e", new Object[]{this});
        }
        ohe.a a2 = ohe.a();
        for (b bVar : this.pieces) {
            if (bVar.b != null) {
                a2.a(bVar.b);
            }
        }
        SpannableString spannableString2 = new SpannableString(a2.toString());
        synchronized (spannableString2) {
            spannableString = spannableString2;
            int i = 0;
            for (b bVar2 : this.pieces) {
                if (bVar2.b != null) {
                    spannableString = getSpannableString(bVar2, spannableString, i, bVar2.b.length() + i);
                    i += bVar2.b.length();
                }
            }
        }
        return spannableString;
    }

    private void parseHrefSpannable(SpannableString spannableString, ogk ogkVar, final b bVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f365fb5e", new Object[]{this, spannableString, ogkVar, bVar, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = -16776961;
        if (ogkVar.s != 1) {
            i3 = ogkVar.s;
        }
        if (ogkVar.ak > 0 || ogkVar.al > 0) {
            ogn ognVar = new ogn(this, new ColorDrawable(), 0);
            ognVar.a(i3);
            ognVar.h(ogkVar.ak);
            ognVar.i(ogkVar.al);
            if (ogkVar.p) {
                ognVar.a(true);
            }
            spannableString.setSpan(ognVar, i, i2, 33);
        } else {
            spannableString.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
            if (ogkVar.p) {
                spannableString.setSpan(new StyleSpan(1), i, i2, 33);
            }
        }
        if (ogkVar.m > 0.0f) {
            spannableString.setSpan(new AbsoluteSizeSpan((int) (ogkVar.m * this.node.k().b())), i, i2, 33);
        }
        spannableString.setSpan(new ClickableSpan() { // from class: com.taobao.tao.flexbox.layoutmanager.component.RichTextComponent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                Map access$200;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                RichTextComponent.this.removePerformClickCallback();
                com.taobao.tao.flexbox.layoutmanager.adapter.a.a().l().a(RichTextComponent.access$100(RichTextComponent.this).N(), bVar.c, null);
                if (StringUtils.isEmpty(bVar.g) || (access$200 = RichTextComponent.access$200(RichTextComponent.this, bVar.g)) == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("pageName", RichTextComponent.this.getNode().b(RichTextComponent.access$300(RichTextComponent.this, bVar.g)));
                hashMap.put("clickInfo", access$200);
                RichTextComponent richTextComponent = RichTextComponent.this;
                richTextComponent.sendMessage(richTextComponent.getNode(), "click", null, hashMap, null);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
                } else {
                    textPaint.setUnderlineText(false);
                }
            }
        }, i, i2, 33);
    }

    private Map getClickTrackInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1311e06d", new Object[]{this, str});
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject == null) {
                return null;
            }
            return parseObject.getJSONObject("click");
        } catch (JSONException unused) {
            return null;
        }
    }

    private Map getTrackInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7e15a369", new Object[]{this, str});
        }
        try {
            return JSON.parseObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private void parseImageSpannable(final SpannableString spannableString, final ogk ogkVar, final b bVar, final int i, final int i2) {
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da7634b4", new Object[]{this, spannableString, ogkVar, bVar, new Integer(i), new Integer(i2)});
            return;
        }
        Drawable drawable = null;
        int i5 = ogkVar.aa >= 0 ? ogkVar.aa : 0;
        int i6 = ogkVar.ab >= 0 ? ogkVar.ab : 0;
        if (StringUtils.isEmpty(bVar.b)) {
            return;
        }
        String str = bVar.b;
        if (str.startsWith("./")) {
            int c2 = ohd.c(this.node.N(), str);
            if (c2 != 0) {
                drawable = this.node.N().getResources().getDrawable(c2);
            }
            i3 = i6;
        } else {
            final int i7 = i5;
            final int i8 = i6;
            i3 = i6;
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().i().a(this.node.N(), str, i5, i3, new ImageLoader.c() { // from class: com.taobao.tao.flexbox.layoutmanager.component.RichTextComponent.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
                public void onImageLoadFailed() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3feabda6", new Object[]{this});
                    }
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
                public void onImageLoaded(BitmapDrawable bitmapDrawable) {
                    int i9;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
                        return;
                    }
                    int i10 = i7;
                    if (i10 > 0 && (i9 = i8) > 0) {
                        bitmapDrawable.setBounds(0, 0, i10, i9);
                    }
                    RichTextComponent.access$400(RichTextComponent.this, spannableString, bVar, bitmapDrawable, ogkVar, i, i2);
                }
            });
            drawable = new ColorDrawable(placeHolder);
        }
        if (bVar.e != null) {
            return;
        }
        if (drawable == null) {
            drawable = new ColorDrawable(placeHolder);
        }
        Drawable drawable2 = drawable;
        if (i5 > 0 && (i4 = i3) > 0) {
            drawable2.setBounds(0, 0, i5, i4);
        } else {
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        }
        setupImageSpan(spannableString, bVar, drawable2, ogkVar, i, i2);
    }

    private void setupImageSpan(SpannableString spannableString, final b bVar, Drawable drawable, ogk ogkVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdbdf1ea", new Object[]{this, spannableString, bVar, drawable, ogkVar, new Integer(i), new Integer(i2)});
            return;
        }
        bVar.e = new ogm(drawable, 0, 0);
        bVar.e.b(ogkVar.ak);
        bVar.e.d(ogkVar.al);
        bVar.e.a(ogkVar.x);
        bVar.e.e(ogkVar.o);
        synchronized (spannableString) {
            if (!StringUtils.isEmpty(bVar.f)) {
                spannableString.setSpan(new ClickableSpan() { // from class: com.taobao.tao.flexbox.layoutmanager.component.RichTextComponent.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.text.style.ClickableSpan
                    public void onClick(View view) {
                        Map access$200;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        RichTextComponent.this.removePerformClickCallback();
                        RichTextComponent richTextComponent = RichTextComponent.this;
                        richTextComponent.sendMessage(richTextComponent.getNode(), "onclick", bVar.f, null, null);
                        if (StringUtils.isEmpty(bVar.g) || (access$200 = RichTextComponent.access$200(RichTextComponent.this, bVar.g)) == null) {
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("pageName", RichTextComponent.this.getNode().b(RichTextComponent.access$300(RichTextComponent.this, bVar.g)));
                        hashMap.put("clickInfo", access$200);
                        RichTextComponent richTextComponent2 = RichTextComponent.this;
                        richTextComponent2.sendMessage(richTextComponent2.getNode(), "click", null, hashMap, null);
                    }
                }, i, i2, 33);
            }
            spannableString.setSpan(bVar.e, i, i2, 33);
        }
    }

    private void parseTextSpannable(SpannableString spannableString, ogk ogkVar, final b bVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184cb39c", new Object[]{this, spannableString, ogkVar, bVar, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = ogkVar.s != 1 ? ogkVar.s : 0;
        if (hasBackgroundDrawable(ogkVar)) {
            ogn ognVar = new ogn(this, com.taobao.tao.flexbox.layoutmanager.drawable.b.a((Drawable) null, ogkVar), 0);
            if (ogkVar.aa >= 0) {
                ognVar.f(ogkVar.aa);
            }
            if (ogkVar.ab >= 0) {
                ognVar.g(ogkVar.ab);
            }
            ognVar.a(i3);
            ognVar.d(ogkVar.ag);
            ognVar.b(ogkVar.ai);
            ognVar.e(ogkVar.ah);
            ognVar.c(ogkVar.aj);
            ognVar.h(ogkVar.ak);
            ognVar.i(ogkVar.al);
            if (ogkVar.p) {
                ognVar.a(true);
            }
            ognVar.j(ogkVar.aO);
            spannableString.setSpan(ognVar, i, i2, 33);
        } else {
            if (ogkVar.ak > 0 || ogkVar.al > 0) {
                ogn ognVar2 = new ogn(this, new ColorDrawable(), 0);
                ognVar2.a(i3);
                ognVar2.h(ogkVar.ak);
                ognVar2.i(ogkVar.al);
                spannableString.setSpan(ognVar2, i, i2, 33);
            } else if (i3 != 0) {
                spannableString.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
            }
            if (ogkVar.p) {
                spannableString.setSpan(new StyleSpan(1), i, i2, 33);
            }
        }
        if (ogkVar.m > 0.0f && !ohd.a(3)) {
            spannableString.setSpan(new AbsoluteSizeSpan((int) (ogkVar.m * this.node.k().b())), i, i2, 33);
        }
        if (StringUtils.isEmpty(bVar.f)) {
            return;
        }
        spannableString.setSpan(new ClickableSpan() { // from class: com.taobao.tao.flexbox.layoutmanager.component.RichTextComponent.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                Map access$200;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                RichTextComponent.this.removePerformClickCallback();
                RichTextComponent richTextComponent = RichTextComponent.this;
                richTextComponent.sendMessage(richTextComponent.getNode(), "onclick", bVar.f, null, null);
                if (StringUtils.isEmpty(bVar.g) || (access$200 = RichTextComponent.access$200(RichTextComponent.this, bVar.g)) == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("pageName", RichTextComponent.this.getNode().b(RichTextComponent.access$300(RichTextComponent.this, bVar.g)));
                hashMap.put("clickInfo", access$200);
                RichTextComponent richTextComponent2 = RichTextComponent.this;
                richTextComponent2.sendMessage(richTextComponent2.getNode(), "click", null, hashMap, null);
            }
        }, i, i2, 33);
    }

    private SpannableString getSpannableString(b bVar, SpannableString spannableString, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("16017f5e", new Object[]{this, bVar, spannableString, new Integer(i), new Integer(i2)});
        }
        ogk ogkVar = bVar.d;
        if (ogkVar == null) {
            return spannableString;
        }
        if (bVar.f20024a == 0) {
            parseTextSpannable(spannableString, ogkVar, bVar, i, i2);
        } else if (bVar.f20024a == 1) {
            parseImageSpannable(spannableString, ogkVar, bVar, i, i2);
            r.a aVar = new r.a();
            if (this.view != 0) {
                aVar.a(this.view);
            }
            spannableString.setSpan(aVar, i, i2, 33);
        } else if (bVar.f20024a == 2) {
            parseHrefSpannable(spannableString, ogkVar, bVar, i, i2);
        } else {
            b.a(bVar);
            r.a aVar2 = new r.a();
            if (this.view != 0) {
                aVar2.a(this.view);
            }
            spannableString.setSpan(aVar2, i, i2, 33);
        }
        return spannableString;
    }

    public static void registerParser(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b65d9ec", new Object[]{str, aVar});
        } else {
            customParsers.put(str, aVar);
        }
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f20024a;
        public String b;
        public String c;
        public ogk d;
        public ogm e;
        public String f;
        public String g;
        private a h;

        static {
            kge.a(497002915);
        }

        public static /* synthetic */ a a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c3da1f0f", new Object[]{bVar}) : bVar.h;
        }

        public static /* synthetic */ a a(b bVar, a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d89862b6", new Object[]{bVar, aVar});
            }
            bVar.h = aVar;
            return aVar;
        }

        public b(int i) {
            this.f20024a = i;
        }

        public void a(ogk ogkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7dbf465", new Object[]{this, ogkVar});
            } else {
                this.d = ogkVar;
            }
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.f = str;
            }
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            } else {
                this.g = str;
            }
        }
    }

    private boolean hasBackgroundDrawable(ogk ogkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7b573cae", new Object[]{this, ogkVar})).booleanValue() : ogkVar.aP != 1 || ogkVar.aO > 0 || ogkVar.aJ > 0 || ogkVar.aH != null;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.TextComponent, com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public ogk mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogk) ipChange.ipc$dispatch("36baa10c", new Object[]{this}) : new c();
    }

    /* loaded from: classes8.dex */
    public class c extends ogk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(753062143);
        }

        public c() {
        }

        @Override // tb.ogk
        public CharSequence a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("2d0b4348", new Object[]{this, str}) : RichTextComponent.access$500(RichTextComponent.this, str);
        }
    }
}

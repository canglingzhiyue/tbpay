package com.taobao.search.musie.component;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.g;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.android.xsearchplugin.muise.f;
import com.taobao.search.mmd.uikit.shopinfo.b;
import com.taobao.search.mmd.uikit.shopinfo.c;
import com.taobao.tao.infoflow.multitab.e;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class MusShopInfo extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ATTR_DATA = "data";
    private static final String ATTR_ITEM_LIST = "itemList";
    private static final String ATTR_TB2024 = "tb2024";
    private static final String EXTRA_BACKGROUND = "background";
    private static final String EXTRA_DRAW_LIST = "drawList";
    private boolean layout;

    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f19223a;
        public List<c> b;

        static {
            kge.a(961083251);
        }

        public a(int i, List<c> list) {
            this.f19223a = i;
            this.b = list;
        }
    }

    static {
        kge.a(575974177);
    }

    public static /* synthetic */ Object ipc$super(MusShopInfo musShopInfo, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -136526582) {
            super.onUnmount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else if (hashCode != 1084303291) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onUpdateExtra((UINode) objArr[0], objArr[1], (String) objArr[2], objArr[3]);
            return null;
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public int poolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bdc9c37", new Object[]{this})).intValue();
        }
        return 10;
    }

    public MusShopInfo(int i) {
        super(i);
        this.layout = false;
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    /* renamed from: onCreateMountContent */
    public b mo1225onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("34e3c19c", new Object[]{this, context}) : new b();
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this}) : UINodeType.DRAWABLE;
    }

    @MUSNodeProp(name = "data")
    public void setData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            setExtra(EXTRA_DRAW_LIST, null);
            setAttribute("itemList", null);
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray("infoList");
            boolean booleanValue = jSONObject.getBooleanValue("tb2024");
            setAttribute("tb2024", Boolean.valueOf(booleanValue));
            if (jSONArray == null || jSONArray.isEmpty()) {
                setExtra(EXTRA_DRAW_LIST, null);
                setAttribute("itemList", null);
                return;
            }
            if (isDarkMode()) {
                jSONObject.put(e.KEY_BG_COLOR, "#333333");
            }
            if (!StringUtils.isEmpty(jSONObject.getString(e.KEY_BG_COLOR))) {
                setExtra("background", com.taobao.search.mmd.uikit.shopinfo.a.a(jSONObject));
            } else {
                setExtra("background", null);
            }
            int a2 = g.a(jSONObject.getString("guideColor"), b.d);
            if (isDarkMode()) {
                a2 = b.e;
            }
            int i = a2;
            ArrayList arrayList = new ArrayList(jSONArray.size());
            int size = jSONArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(new c(jSONArray.getJSONObject(i2)));
            }
            setAttribute("itemList", new a(i, arrayList));
            if (!this.layout) {
                return;
            }
            updateDrawList(arrayList, i, getLayoutWidth(), getLayoutHeight(), booleanValue);
        }
    }

    private boolean isDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded1a48e", new Object[]{this})).booleanValue();
        }
        Context uIContext = getInstance().getUIContext();
        return (uIContext instanceof f) && ((f) uIContext).g();
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onUpdateExtra(UINode uINode, Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40a127bb", new Object[]{this, uINode, obj, str, obj2});
            return;
        }
        super.onUpdateExtra(uINode, obj, str, obj2);
        b bVar = (b) obj;
        if (bVar == null) {
            return;
        }
        if (StringUtils.equals(str, EXTRA_DRAW_LIST)) {
            bVar.b();
            bVar.a((List) obj2);
        } else if (!StringUtils.equals(str, "background")) {
        } else {
            bVar.a((com.taobao.search.mmd.uikit.shopinfo.a) obj2);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        b bVar = (b) obj;
        bVar.a((List) getExtra(EXTRA_DRAW_LIST));
        bVar.a((com.taobao.search.mmd.uikit.shopinfo.a) getExtra("background"));
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onUnmount(mUSDKInstance, obj);
        ((b) obj).b();
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onUpdateLayout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87585099", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.layout = true;
        a aVar = (a) getAttribute("itemList");
        Boolean bool = (Boolean) getAttribute("tb2024");
        if (aVar == null) {
            return;
        }
        updateDrawList(aVar.b, aVar.f19223a, i3 - i, i4 - i2, bool != null && bool.booleanValue());
    }

    private void updateDrawList(List<c> list, int i, int i2, int i3, boolean z) {
        String str;
        int i4;
        int i5;
        String str2;
        int i6;
        int breakText;
        int min;
        List<c> list2 = list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d4692f4", new Object[]{this, list2, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
            return;
        }
        com.taobao.search.mmd.uikit.shopinfo.a aVar = (com.taobao.search.mmd.uikit.shopinfo.a) getExtra("background");
        String str3 = EXTRA_DRAW_LIST;
        if (list2 == null || list.isEmpty()) {
            setExtra(str3, null);
            return;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(b.b);
        TextPaint textPaint2 = new TextPaint(1);
        float b = (int) j.b(12.0f);
        textPaint.setTextSize(b);
        textPaint2.setTextSize(b);
        ArrayList arrayList = new ArrayList();
        int measureText = (int) (i2 - textPaint.measureText(b.c));
        int a2 = aVar == null ? 0 : aVar.a();
        int b2 = (measureText - a2) - (aVar == null ? 0 : aVar.b());
        float calculateBaseline = calculateBaseline(textPaint2, i3);
        float[] fArr = new float[1];
        int i7 = z ? b.k : b.f;
        int size = list.size();
        int i8 = a2;
        int i9 = b2;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                str = str3;
                i4 = i8;
                break;
            }
            c cVar = list2.get(i10);
            if (!StringUtils.isEmpty(cVar.b()) && cVar.f() > 0 && cVar.g() > 0) {
                int h = cVar.h();
                if (h <= 0) {
                    h = b.g;
                }
                i6 = size;
                int f = (int) ((cVar.f() / cVar.g()) * Math.min(h, i3));
                if (f <= i9) {
                    str = str3;
                    com.taobao.search.mmd.uikit.shopinfo.e eVar = new com.taobao.search.mmd.uikit.shopinfo.e(textPaint, true);
                    int i11 = (int) ((i3 - min) / 2.0f);
                    int i12 = i8;
                    eVar.a(i12, i11, i12 + f, i3 - i11);
                    eVar.a(cVar.i());
                    eVar.a(cVar.b(), f, getInstance().getUIContext());
                    int i13 = f + i7;
                    i9 -= i13;
                    i8 = i12 + i13;
                    arrayList.add(eVar);
                    i10++;
                    list2 = list;
                    size = i6;
                    str3 = str;
                } else {
                    str = str3;
                    i4 = i8;
                }
            } else {
                str = str3;
                i6 = size;
                i4 = i8;
                if (!StringUtils.isEmpty(cVar.c())) {
                    textPaint2.setFakeBoldText(cVar.j());
                    textPaint2.setTextSize(j.b(cVar.e()));
                    float measureText2 = textPaint2.measureText(cVar.c());
                    float f2 = i9;
                    if (measureText2 <= f2) {
                        com.taobao.search.mmd.uikit.shopinfo.e eVar2 = new com.taobao.search.mmd.uikit.shopinfo.e(textPaint2, false);
                        int a3 = g.a(cVar.a(), b.d);
                        if (isDarkMode()) {
                            a3 = b.e;
                        }
                        eVar2.a(cVar.c(), calculateBaseline, a3, cVar.e(), cVar.j());
                        eVar2.a(i4, 0, 0, 0);
                        arrayList.add(eVar2);
                        float f3 = measureText2 + i7;
                        textPaint2.setFakeBoldText(false);
                        textPaint2.setTextSize(j.b(12.0f));
                        i9 = (int) (f2 - f3);
                        i8 = (int) (i4 + f3);
                        i10++;
                        list2 = list;
                        size = i6;
                        str3 = str;
                    } else if (StringUtils.equals(Constants.Name.SUFFIX, cVar.d())) {
                        float measureText3 = textPaint2.measureText("...");
                        if (textPaint2.breakText(cVar.c(), true, f2 - measureText3, fArr) > 2) {
                            com.taobao.search.mmd.uikit.shopinfo.e eVar3 = new com.taobao.search.mmd.uikit.shopinfo.e(textPaint2, false);
                            int a4 = g.a(cVar.a(), b.d);
                            if (isDarkMode()) {
                                a4 = b.e;
                            }
                            eVar3.a(cVar.c().substring(0, breakText) + "...", calculateBaseline, a4, cVar.e(), cVar.j());
                            eVar3.a(i4, 0, 0, 0);
                            arrayList.add(eVar3);
                            i5 = (int) (((float) i4) + fArr[0] + ((float) i7) + measureText3);
                        }
                    }
                }
            }
            i8 = i4;
            i10++;
            list2 = list;
            size = i6;
            str3 = str;
        }
        i5 = i4;
        float calculateBaseline2 = calculateBaseline(textPaint, i3);
        com.taobao.search.mmd.uikit.shopinfo.e eVar4 = new com.taobao.search.mmd.uikit.shopinfo.e(textPaint, true);
        if (z) {
            str2 = b.j;
            eVar4.a(b.j, calculateBaseline2, i);
        } else {
            str2 = b.c;
            eVar4.a(b.c, calculateBaseline2, i);
        }
        int i14 = i5 - i7;
        eVar4.a(i14, 0, (int) (i14 + textPaint.measureText(str2)), 0);
        arrayList.add(eVar4);
        setExtra(str, arrayList);
    }

    private float calculateBaseline(TextPaint textPaint, int i) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e185561", new Object[]{this, textPaint, new Integer(i)})).floatValue();
        }
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f2 = fontMetrics.descent - fontMetrics.ascent;
        float f3 = i;
        if (f2 > f3) {
            f = fontMetrics.descent;
        } else {
            f3 -= (f3 - f2) / 2.0f;
            f = fontMetrics.descent;
        }
        return f3 - f;
    }
}

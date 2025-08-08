package com.taobao.android.detail.core.detail.kit.view.dinamic_ext;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.view.XSimpleRichTextView;
import com.taobao.android.detail.datasdk.protocol.adapter.core.c;
import com.taobao.android.dinamic.constructor.DTextViewConstructor;
import com.taobao.android.dinamic.dinamic.DinamicAttr;
import java.util.ArrayList;
import java.util.Iterator;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.dzv;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class DetailXSimpleTextViewConstructor extends DTextViewConstructor implements IMTOPDataObject {
    public static final String VIEW_TAG = "XSimpleRichText";

    static {
        kge.a(-290880283);
        kge.a(-350052935);
    }

    public DetailXSimpleTextViewConstructor() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailXSimpleTextViewConstructor");
    }

    @Override // com.taobao.android.dinamic.constructor.DTextViewConstructor, com.taobao.android.dinamic.dinamic.h
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        return new XSimpleRichTextView(context, attributeSet);
    }

    @DinamicAttr(attrSet = {"dImages"})
    public void setImageUrl(final XSimpleRichTextView xSimpleRichTextView, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        ArrayList<XSimpleRichTextView.DrawableHolder> drawableArrayList = xSimpleRichTextView.getDrawableArrayList();
        if (jSONArray != null) {
            Iterator<Object> it = jSONArray.iterator();
            while (it != null && it.hasNext()) {
                Object next = it.next();
                if (next != null && (next instanceof String)) {
                    String str = (String) next;
                    if (!arrayList.contains(str)) {
                        Iterator<XSimpleRichTextView.DrawableHolder> it2 = drawableArrayList.iterator();
                        boolean z = false;
                        while (it2.hasNext()) {
                            if (it2.next().url.equals(str)) {
                                z = true;
                            }
                        }
                        if (!z) {
                            arrayList.add(str);
                        }
                    }
                }
            }
        }
        if (arrayList.size() > 0) {
            xSimpleRichTextView.setDrawableCount(arrayList.size());
            for (int i = 0; i < arrayList.size(); i++) {
                final String str2 = (String) arrayList.get(i);
                xSimpleRichTextView.setUrlIndex(str2, i);
                dzv.a(str2, xSimpleRichTextView.getContext(), new c.a() { // from class: com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailXSimpleTextViewConstructor.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.c.a
                    public void a(Drawable drawable) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                        } else {
                            xSimpleRichTextView.addIcon(drawable, str2);
                        }
                    }
                }, null);
            }
        }
    }

    @Override // com.taobao.android.dinamic.constructor.DTextViewConstructor
    @DinamicAttr(attrSet = {"dText"})
    public void setText(TextView textView, String str) {
        textView.setText(str);
    }

    @DinamicAttr(attrSet = {"dImageSpace"})
    public void setImageSpace(XSimpleRichTextView xSimpleRichTextView, String str) {
        if (xSimpleRichTextView != null) {
            try {
                xSimpleRichTextView.setImageSpace(Integer.parseInt(str));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @DinamicAttr(attrSet = {"dImageTextSpace"})
    public void setImageTextSpace(XSimpleRichTextView xSimpleRichTextView, String str) {
        if (xSimpleRichTextView != null) {
            try {
                xSimpleRichTextView.setImageTextSpace(Integer.parseInt(str));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @DinamicAttr(attrSet = {"dTextSize"})
    public void setTextSize(XSimpleRichTextView xSimpleRichTextView, String str) {
        if (xSimpleRichTextView != null) {
            try {
                xSimpleRichTextView.setTextSize(Integer.parseInt(str));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @DinamicAttr(attrSet = {"dTextColor"})
    public void setTextColor(XSimpleRichTextView xSimpleRichTextView, String str) {
        if (xSimpleRichTextView == null || StringUtils.isEmpty(str)) {
            return;
        }
        try {
            xSimpleRichTextView.setTextColor(Color.parseColor(str));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

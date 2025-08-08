package com.taobao.android.detail.core.detail.kit.view.dinamic_ext;

import android.content.Context;
import android.graphics.Color;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.view.xwraptagview.XWrapTagView;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.view.xwraptagview.a;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.view.xwraptagview.b;
import com.taobao.android.dinamic.dinamic.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.emu;
import tb.epo;
import tb.fpd;
import tb.kge;

/* loaded from: classes4.dex */
public class DetailXWrapTagViewConstructor extends h implements IMTOPDataObject {
    public static final String VIEW_TAG = "XWrapTagView";
    private String fixedTagString;
    private int dataUpdateCount = 0;
    private int containerHeight = 0;
    private int contentPaddingLeft = 0;
    private int contentPaddingRight = 0;
    private int contentPaddingTop = 0;
    private int contentPaddingBottom = 0;
    private int maxTagWidth = 0;
    private int spaceBetweenTags = 0;
    private int textSize = 0;
    private int textColor = 0;
    private int tagBackgroundColor = -592138;
    private ArrayList<a> tagList = null;
    private int fixedTagCornorRadius = 6;

    static {
        kge.a(1796617366);
        kge.a(-350052935);
    }

    public DetailXWrapTagViewConstructor() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailXWrapTagViewConstructor");
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        return new XWrapTagView(context, attributeSet);
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, fpd fpdVar) {
        super.setAttributes(view, map, arrayList, fpdVar);
        this.tagList = null;
        this.fixedTagString = null;
        if (view != null) {
            parseData(view.getContext(), view, map);
        }
    }

    private void parseData(Context context, View view, Map<String, Object> map) {
        try {
            if (map.containsKey("dHeight")) {
                this.containerHeight = epo.b(Integer.parseInt((String) map.get("dHeight")));
            }
            if (map.containsKey("dContentPaddingLeft")) {
                this.contentPaddingLeft = epo.b(Integer.parseInt((String) map.get("dContentPaddingLeft")));
            }
            if (map.containsKey("dContentPaddingTop")) {
                this.contentPaddingTop = epo.b(Integer.parseInt((String) map.get("dContentPaddingTop")));
            }
            if (map.containsKey("dContentPaddingRight")) {
                this.contentPaddingRight = epo.b(Integer.parseInt((String) map.get("dContentPaddingRight")));
            }
            if (map.containsKey("dContentPaddingBottom")) {
                this.contentPaddingBottom = epo.b(Integer.parseInt((String) map.get("dContentPaddingBottom")));
            }
            if (map.containsKey("dMaxTagWidth")) {
                this.maxTagWidth = epo.b(Integer.parseInt((String) map.get("dMaxTagWidth")));
            }
            if (map.containsKey("dSpaceBetweenTags")) {
                this.spaceBetweenTags = epo.b(Integer.parseInt((String) map.get("dSpaceBetweenTags")));
            }
            if (map.containsKey("dTextSize")) {
                this.textSize = epo.b(Integer.parseInt((String) map.get("dTextSize")));
            }
            if (map.containsKey("dTextColor")) {
                this.textColor = Color.parseColor((String) map.get("dTextColor"));
            }
            if (map.containsKey("dTagBackgroundColor")) {
                this.tagBackgroundColor = Color.parseColor((String) map.get("dTagBackgroundColor"));
            }
            if (map.containsKey("dTags")) {
                this.tagList = buildTagList((JSONArray) map.get("dTags"));
            }
            TextView textView = null;
            if (map.containsKey("dFixedTag")) {
                this.fixedTagString = (String) map.get("dFixedTag");
                if (!StringUtils.isEmpty(this.fixedTagString)) {
                    int b = epo.b(11);
                    textView = createFixedTextTag(context, this.fixedTagString, (this.containerHeight - this.contentPaddingTop) - this.contentPaddingBottom, b, this.textColor, this.tagBackgroundColor);
                }
            }
            bindData(view, textView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void bindData(View view, TextView textView) {
        if (view == null || !(view instanceof XWrapTagView)) {
            return;
        }
        XWrapTagView xWrapTagView = (XWrapTagView) view;
        xWrapTagView.setLineNumAndOpenSimplifiedMode("1");
        xWrapTagView.setBackgroundColor(-1);
        xWrapTagView.setLayoutParams(new FrameLayout.LayoutParams(-1, this.containerHeight));
        xWrapTagView.setPadding(this.contentPaddingLeft, this.contentPaddingTop, this.contentPaddingRight, this.contentPaddingBottom);
        xWrapTagView.setTextSizeInPixel(this.textSize);
        xWrapTagView.setTextColor(this.textColor);
        xWrapTagView.setTagHeightInPixel((this.containerHeight - this.contentPaddingTop) - this.contentPaddingBottom);
        xWrapTagView.setMaxTagWidth(this.maxTagWidth);
        xWrapTagView.setSpaceBetweenTags(this.spaceBetweenTags);
        ArrayList<a> arrayList = this.tagList;
        if (arrayList != null && arrayList.size() > 0) {
            xWrapTagView.setTagList(this.tagList);
        } else {
            xWrapTagView.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (textView == null) {
            return;
        }
        xWrapTagView.addLayoutEndView(textView);
    }

    private TextView createFixedTextTag(Context context, String str, int i, int i2, int i3, int i4) {
        if (context == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, i);
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextColor(i3);
        textView.setTextSize(0, i2);
        textView.setPadding(b.TAG_LEFT_RIGHT_PADDING, b.TAG_TOP_BOTTOM_PADDING, b.TAG_LEFT_RIGHT_PADDING, b.TAG_TOP_BOTTOM_PADDING);
        textView.setBackgroundDrawable(b.a(this.fixedTagCornorRadius * ((int) epo.f27511a), i4));
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    private ArrayList<a> buildTagList(JSONArray jSONArray) {
        ArrayList<a> arrayList = new ArrayList<>();
        if (jSONArray != null) {
            Iterator<Object> it = jSONArray.iterator();
            while (it != null && it.hasNext()) {
                Object next = it.next();
                if (next != null && (next instanceof JSONObject)) {
                    arrayList.add(new a((JSONObject) next));
                }
            }
        }
        return arrayList;
    }
}

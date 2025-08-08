package com.taobao.android.detail.core.detail.kit.view.dinamic_ext;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.view.DetailCommentTagsView;
import com.taobao.android.dinamic.dinamic.DinamicAttr;
import com.taobao.android.dinamic.dinamic.h;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.emu;
import tb.fpn;
import tb.kge;

/* loaded from: classes4.dex */
public class DetailCommentTagsViewConstructor extends h implements IMTOPDataObject {
    public static final String VIEW_TAG = "XCommentTagView";

    static {
        kge.a(-1041126332);
        kge.a(-350052935);
    }

    public DetailCommentTagsViewConstructor() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailCommentTagsViewConstructor");
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        return new DetailCommentTagsView(context, attributeSet);
    }

    @DinamicAttr(attrSet = {"xtagsData", "xlineNum", "textColor", "tagColor"})
    public void setTagsAttrs(View view, JSONArray jSONArray, String str, String str2, String str3) {
        if (view instanceof DetailCommentTagsView) {
            DetailCommentTagsView detailCommentTagsView = (DetailCommentTagsView) view;
            detailCommentTagsView.setLineNum(str);
            if (!StringUtils.isEmpty(str2)) {
                detailCommentTagsView.setTagTextColor(fpn.a(str2, 0));
            }
            if (!StringUtils.isEmpty(str3)) {
                detailCommentTagsView.setTagBgColor(fpn.a(str3, 0));
            }
            detailCommentTagsView.setTagList(jSONArray);
        }
    }
}

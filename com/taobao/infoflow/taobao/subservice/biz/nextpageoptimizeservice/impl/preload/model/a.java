package com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.unit.center.mdc.dinamicx.constants.DinamicxNativeConfig;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.ldf;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TARGET_TYPE_LITE_DETAIL = "liteDetail";
    public static final String TARGET_TYPE_MINI_APP = "miniApp";
    public static final String TARGET_TYPE_NEW_DETAIL = "newDetail";

    static {
        kge.a(-1959589569);
    }

    public static PreLoadModel a(List<? extends BaseSectionModel> list, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreLoadModel) ipChange.ipc$dispatch("41734b82", new Object[]{list, new Integer(i), str, str2});
        }
        if (ObjectUtils.a(list)) {
            ldf.d("PreLoadModelCreator", "ParsePreLoadModel sectionModels is empty");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (BaseSectionModel baseSectionModel : list) {
            String a2 = a(baseSectionModel, str);
            if (!TextUtils.isEmpty(a2)) {
                PreLoadItem preLoadItem = new PreLoadItem();
                preLoadItem.setUrl(a2);
                arrayList.add(preLoadItem);
            }
        }
        if (arrayList.isEmpty()) {
            ldf.d("PreLoadModelCreator", "ParsePreLoadModel 未找到卡片 : " + str);
            return null;
        }
        PreLoadModel preLoadModel = new PreLoadModel();
        preLoadModel.setItems(arrayList);
        preLoadModel.setSourceFrom(str2);
        preLoadModel.setPageIndex(String.valueOf(i));
        return preLoadModel;
    }

    private static String a(BaseSectionModel<?> baseSectionModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("625f4c66", new Object[]{baseSectionModel, str});
        }
        if (baseSectionModel == null) {
            return null;
        }
        BaseItemModel mo1097getItem = baseSectionModel.mo1097getItem();
        if (mo1097getItem == null) {
            ldf.d("PreLoadModelCreator", "getTargetUrl baseItemModel is null");
            return null;
        }
        int itemCount = mo1097getItem.getItemCount();
        if (itemCount <= 0) {
            ldf.d("PreLoadModelCreator", "getTargetUrl itemCount <= 0");
            return null;
        }
        for (int i = 0; i < itemCount; i++) {
            BaseSubItemModel mo1094getBaseItemModel = mo1097getItem.mo1094getBaseItemModel(i);
            if (mo1094getBaseItemModel != null && !ObjectUtils.a(mo1094getBaseItemModel.getExt()) && TextUtils.equals(str, mo1094getBaseItemModel.getExt().getString(DinamicxNativeConfig.TARGETTYPE)) && !TextUtils.equals("true", mo1094getBaseItemModel.getExt().getString("enableSimpleDeliver"))) {
                return mo1094getBaseItemModel.getTargetUrl();
            }
        }
        return null;
    }
}

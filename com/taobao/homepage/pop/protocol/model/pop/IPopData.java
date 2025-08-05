package com.taobao.homepage.pop.protocol.model.pop;

import com.alibaba.fastjson.JSONObject;
import com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel;
import java.io.Serializable;
import java.util.List;
import tb.lag;

/* loaded from: classes7.dex */
public interface IPopData<M extends BasePopSectionModel> extends Serializable {
    /* renamed from: fetchPopSection */
    M mo1070fetchPopSection();

    String getBusinessID();

    JSONObject getClientParams();

    JSONObject getExt();

    JSONObject getPassParam();

    IPopConfig getPopConfig();

    List<M> getSections();

    lag getUCPConfig();

    JSONObject getUploadData();

    boolean isAllowShow();

    boolean isDeltaRefreshWhiteList(String str);

    boolean isFirstShow();

    boolean isResetShowCount();

    void recordShow();

    void resetShowCount();

    boolean valid();
}

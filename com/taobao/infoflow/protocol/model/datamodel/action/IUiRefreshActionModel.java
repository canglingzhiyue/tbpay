package com.taobao.infoflow.protocol.model.datamodel.action;

import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes7.dex */
public interface IUiRefreshActionModel {
    public static final String DATA_CHANGE_TYPE_BASE = "base";
    public static final String DATA_CHANGE_TYPE_DELTA = "delta";
    public static final String DATA_SOURCE_TYPE_DOWNLOAD = "download";
    public static final String DATA_SOURCE_TYPE_LOCAL = "local";
    public static final String DATA_SOURCE_TYPE_REMOTE = "remote";
    public static final String OPERATION_TYPE_SCROLL_TO_TOP = "scrollToTop";
    public static final String OPERATION_TYPE_UI_REFRESH = "uiRefresh";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface DataChange {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface Operation {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface SourceType {
    }

    String getContainerId();

    IContainerDataModel getContainerModel();

    String getDataChangeType();

    String getDataSourceType();

    String getErrorCode();

    String getRequestType();

    String getUiOperationType();

    boolean isSecondReturn();
}

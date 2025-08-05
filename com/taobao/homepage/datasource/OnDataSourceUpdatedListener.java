package com.taobao.homepage.datasource;

/* loaded from: classes7.dex */
public interface OnDataSourceUpdatedListener {

    /* loaded from: classes7.dex */
    public enum DataSourceType {
        DS_TYPE_CACHED_CONTENT,
        DS_TYPE_REMOTE_CONTENT,
        DS_TYPE_NEW_CONTAINER_CONTENT,
        DS_TYPE_REFRESH_CONTENT,
        DS_TYPE_RECOMMEND_CONTENT,
        DS_TYPE_TEMPLATE_UPDATE;

        public boolean isHomeLoadContent() {
            return this == DS_TYPE_CACHED_CONTENT || this == DS_TYPE_REMOTE_CONTENT;
        }

        public boolean isPresentedAsContent() {
            return this == DS_TYPE_CACHED_CONTENT || this == DS_TYPE_REMOTE_CONTENT || this == DS_TYPE_REFRESH_CONTENT || this == DS_TYPE_NEW_CONTAINER_CONTENT;
        }

        public boolean isPresentedAsR4U() {
            return this == DS_TYPE_RECOMMEND_CONTENT;
        }

        public boolean isRefresh() {
            return this == DS_TYPE_REFRESH_CONTENT;
        }
    }
}

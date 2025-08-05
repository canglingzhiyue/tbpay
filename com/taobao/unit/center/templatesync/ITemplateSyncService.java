package com.taobao.unit.center.templatesync;

/* loaded from: classes9.dex */
public interface ITemplateSyncService {
    public static final String LAYOUT_STYLE_BUBBLE = "bubble";
    public static final String LAYOUT_STYLE_CARD = "card";
    public static final String NAMESPACE = "tbmessage";

    /* loaded from: classes9.dex */
    public interface ISyncListener {
        void onSync();
    }

    void addSyncListener(ISyncListener iSyncListener);

    void checkDoSingleMakeup(int i);

    void checkSync();

    String getLayoutId(int i);

    String getLayoutStyle(String str);

    String getTemplateData(int i);

    void init();

    void reInit();

    void removeSyncListener(ISyncListener iSyncListener);
}

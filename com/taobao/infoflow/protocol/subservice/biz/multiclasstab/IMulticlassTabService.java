package com.taobao.infoflow.protocol.subservice.biz.multiclasstab;

import android.view.ViewGroup;
import com.taobao.infoflow.protocol.subservice.ISubService;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.lkq;
import tb.llj;
import tb.llm;

/* loaded from: classes.dex */
public interface IMulticlassTabService<V extends ViewGroup> extends ISubService, lkq<V> {
    public static final String SERVICE_NAME = "MulticlassTabService";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface ContentType {
    }

    /* loaded from: classes.dex */
    public interface a {
        void a(llm llmVar);
    }

    /* loaded from: classes7.dex */
    public interface b {
        void a();

        void b();
    }

    void addTabChangeListener(a aVar);

    void addTabContentListener(b bVar);

    llm getCurrentTabInfo();

    void hideTabContent();

    boolean isShowTabContent();

    void loadTabContent(String str, llj lljVar);

    void removeTabChangeListener(a aVar);

    void removeTabContentListener(b bVar);
}

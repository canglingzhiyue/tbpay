package com.taobao.infoflow.protocol.subservice.biz;

import android.os.Bundle;
import android.view.View;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.ISubService;
import java.util.Map;

/* loaded from: classes.dex */
public interface IDxItemClickService extends ISubService {
    public static final String SERVICE_NAME = "DxItemClickService";

    /* loaded from: classes7.dex */
    public interface OnDxClickNavListener {

        /* renamed from: com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService$OnDxClickNavListener$-CC  reason: invalid class name */
        /* loaded from: classes7.dex */
        public final /* synthetic */ class CC {
            public static void $default$onNavFinished(OnDxClickNavListener onDxClickNavListener, boolean z) {
            }
        }

        void a(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, Bundle bundle, String str);

        void onNavFinished(boolean z);
    }

    /* loaded from: classes.dex */
    public interface a {
        void a(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view);
    }

    /* loaded from: classes7.dex */
    public interface c {
        Map<String, String> a(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel);
    }

    void addDxClickNavListener(OnDxClickNavListener onDxClickNavListener);

    void addDxItemClickListener(a aVar);

    void addTargetUrlParamsCreator(c cVar);

    String assembleBizParamsToTargetUrl(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, String str);

    void click(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view);

    void onNav(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, Bundle bundle, String str);

    void onNavFinished(boolean z);

    void removeDxClickNavListener(OnDxClickNavListener onDxClickNavListener);

    void removeDxItemClickListener(a aVar);

    void removeTargetUrlParamsCreator(c cVar);
}

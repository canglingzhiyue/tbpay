package com.taobao.message.sp.category;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.message.SimpleFrameworkModule;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.message.lab.aura.mp_aura_devtool.AuraDevTools;
import com.taobao.message.lab.comfrm.ComponentFrmModule;
import com.taobao.message.lab.comfrm.inner2.ClassPool;
import com.taobao.message.lab.comfrm.inner2.Snapshot;
import com.taobao.message.lab.comfrm.inner2.plugin.ISnapshotCenter;
import com.taobao.message.lab.comfrm.inner2.plugin.SnapshotCenter;
import com.taobao.message.lab.comfrm.support.list.ClipSectionFunction;
import com.taobao.message.notification.banner.InnerPushNotification;
import com.taobao.message.sp.category.source.SimpleConversationListSource;
import com.taobao.message.sp.category.transformer.SimpleConversationViewTransformer;
import com.taobao.message.sp.category.transformer.SimpleSectionSortTransformer;
import com.taobao.message.sp.category.transformer.UpdateDownloadProgressTransformer;
import com.taobao.message.sp.category.widget.NewCategoryPageInstance;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import java.util.Collections;
import tb.kge;

/* loaded from: classes7.dex */
public class SimpleCategoryModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-526745610);
    }

    public static void injectDependencies(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("496846b", new Object[]{str});
            return;
        }
        SimpleFrameworkModule.injectDependencies(str);
        try {
            if (ApplicationUtil.isDebug()) {
                AuraDevTools.init(ApplicationUtil.getApplication().getBaseContext());
            }
        } catch (Throwable unused) {
        }
        InnerPushNotification.excludeFragmentClassNames(Collections.singleton("com.taobao.message.conversation.MessageTabFragment"));
        ComponentFrmModule.initWithNamespace(SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("widget.message.category.pageLayout", NewCategoryPageInstance.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("transformer.message.category.simpleSectionSort", SimpleSectionSortTransformer.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("transformer.message.category.simpleList", SimpleConversationViewTransformer.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("transformer.message.category.updateDownloadProgress", UpdateDownloadProgressTransformer.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        ClassPool.instance().put("source.message.category.simpleList", SimpleConversationListSource.class, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
        if (((ISnapshotCenter) GlobalContainer.getInstance().get(ISnapshotCenter.class, str, "")) != null || ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "msgTabSimpleCloseSnapshot") || TextUtils.isEmpty(str)) {
            return;
        }
        SnapshotCenter snapshotCenter = new SnapshotCenter();
        Snapshot snapshot = new Snapshot("conversationTabSimple");
        snapshot.setSnapshotCustom(new ClipSectionFunction());
        TLog.loge(BundleSplitUtil.TAG, " start initSnapshot " + str);
        snapshot.initSnapshot();
        TLog.loge(BundleSplitUtil.TAG, " end initSnapshot");
        snapshotCenter.putSnapshot("conversationTabSimple", snapshot);
        GlobalContainer.getInstance().register(ISnapshotCenter.class, str, "", snapshotCenter);
    }
}

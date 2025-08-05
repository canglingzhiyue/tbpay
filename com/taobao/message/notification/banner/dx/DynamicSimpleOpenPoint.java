package com.taobao.message.notification.banner.dx;

import com.taobao.android.dinamicx.DXRootView;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\f"}, d2 = {"Lcom/taobao/message/notification/banner/dx/DynamicSimpleOpenPoint;", "", "onAfterCreateView", "", "deRootView", "Lcom/taobao/android/dinamicx/DXRootView;", "onAfterRender", "renderStatus", "", "onBeforeCreateView", "onBeforeRender", "Companion", "notification_sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public interface DynamicSimpleOpenPoint {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int RENDER_FAIL = 1;
    public static final int RENDER_SUCCESS = 0;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/taobao/message/notification/banner/dx/DynamicSimpleOpenPoint$Companion;", "", "()V", "RENDER_FAIL", "", "RENDER_SUCCESS", "notification_sdk_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE;
        public static final int RENDER_FAIL = 1;
        public static final int RENDER_SUCCESS = 0;

        static {
            kge.a(1558428798);
            $$INSTANCE = new Companion();
        }

        private Companion() {
        }
    }

    void onAfterCreateView(DXRootView dXRootView);

    void onAfterRender(int i);

    void onBeforeCreateView();

    void onBeforeRender();
}

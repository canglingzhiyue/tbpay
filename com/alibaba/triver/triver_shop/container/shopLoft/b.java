package com.alibaba.triver.triver_shop.container.shopLoft;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.business.ShareContent;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes3.dex */
public interface b {

    /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0127b extends a.InterfaceC0126a {
        void a(JSONObject jSONObject);
    }

    /* loaded from: classes3.dex */
    public interface c {
        public static final String EVENT_ON_ERROR = "onError";
        public static final String EVENT_ON_FINISH = "onFinish";
        public static final String EVENT_ON_HIDE_BAR = "onHideContainerBar";
        public static final String EVENT_ON_MESSAGE = "onMessage";
        public static final String EVENT_ON_MUTE_STATUS_CHANGED = "onMuteStatusChanged";
        public static final String EVENT_ON_PAUSE = "onPause";
        public static final String EVENT_ON_PLAY = "onPlay";
        public static final String EVENT_ON_SCROLL_DISABLE = "onScrollDisable";
        public static final String EVENT_ON_SCROLL_ENABLE = "onScrollEnable";
        public static final String EVENT_ON_SHOW_BAR = "onShowContainerBar";
        public static final String EVENT_UT_PAGE_APPEAR = "utPageAppear";
        public static final String EVENT_UT_PAGE_DIS_APPEAR = "utPageDisappear";

        void a(String str, JSONObject jSONObject);
    }

    void didAppear();

    void didDisappear();

    void endAnimation();

    ShareContent getShareContent();

    String getUTPageName();

    Map<String, String> getUTProperties();

    View getView();

    void initWithData(Context context, JSONObject jSONObject, c cVar, a aVar);

    void mute(boolean z);

    void onActivityPause();

    void onActivityResume();

    void onActivityStop();

    void onDestroyed();

    void onPageStable();

    void pause();

    void play();

    void startAnimation();

    void willAppear();

    void willDisappear();

    /* loaded from: classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Map<String, InterfaceC0126a> f3712a = new ConcurrentHashMap();

        /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public interface InterfaceC0126a {
            void a();
        }

        static {
            kge.a(-1522623933);
        }

        public void a(String str, InterfaceC0126a interfaceC0126a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a2329325", new Object[]{this, str, interfaceC0126a});
            } else if (str == null || interfaceC0126a == null) {
            } else {
                this.f3712a.put(str, interfaceC0126a);
            }
        }

        public InterfaceC0126a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InterfaceC0126a) ipChange.ipc$dispatch("36521039", new Object[]{this, str});
            }
            if (str != null) {
                return this.f3712a.get(str);
            }
            return null;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            for (InterfaceC0126a interfaceC0126a : this.f3712a.values()) {
                try {
                    interfaceC0126a.a();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }
}

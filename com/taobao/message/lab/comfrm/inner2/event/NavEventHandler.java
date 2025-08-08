package com.taobao.message.lab.comfrm.inner2.event;

import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.message.kit.util.URLUtil;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.EventHandler;
import com.taobao.message.lab.comfrm.inner2.PageService;
import com.taobao.message.lab.comfrm.inner2.ServiceProvider;
import com.taobao.message.lab.comfrm.inner2.WeakDependence;
import com.taobao.message.lab.comfrm.support.UserIdentifier;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class NavEventHandler implements EventHandler, WeakDependence, UserIdentifier {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ONLINE_HOST = "market.m.taobao.com";
    private static final String ONLINE_HOST_WEB = "web.m.taobao.com";
    private static final String PREPARE_HOST = "market.wapa.taobao.com";
    private static final String PREPARE_HOST_WEB = "web.wapa.taobao.com";
    private static long lastClickTime;
    private String mIdentifier;

    static {
        kge.a(-1267818275);
        kge.a(778700337);
        kge.a(451726918);
        kge.a(-1306136720);
    }

    private boolean isFastDoubleClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57bf07bc", new Object[]{this})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - lastClickTime;
        if (0 < j && j < 500) {
            return true;
        }
        lastClickTime = currentTimeMillis;
        return false;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.EventHandler
    public void handle(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b707af03", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
        } else if (isFastDoubleClick()) {
            Logger.e("NavEventHandler", "ignore fastDoubleClick");
        } else {
            Map map = (Map) action.getData();
            String str = (String) map.get("actionUrl");
            String string = ValueUtil.getString(map, "identifier", this.mIdentifier);
            if (ValueUtil.getMap(map, "pool") != null) {
                str = URLUtil.$ipChange;
            }
            HashMap hashMap = new HashMap();
            for (int i = 0; i < 9; i++) {
                hashMap.put(ValueUtil.getString(map, "argKey" + i), ValueUtil.getString(map, "argValue" + i));
            }
            if (StringUtils.isEmpty(str)) {
                return;
            }
            Uri parse = Uri.parse(str);
            Uri.Builder builder = null;
            if (ApplicationUtil.getEnvType() == 1) {
                z = true;
            }
            if (z && Arrays.asList("market.m.taobao.com", ONLINE_HOST_WEB).contains(parse.getHost())) {
                builder = parse.buildUpon();
                if (StringUtils.equals("market.m.taobao.com", parse.getHost())) {
                    builder.authority("market.wapa.taobao.com");
                } else if (StringUtils.equals(ONLINE_HOST_WEB, parse.getHost())) {
                    builder.authority(PREPARE_HOST_WEB);
                }
            }
            if (parse.getQueryParameter("identifier") == null) {
                if (builder == null) {
                    builder = parse.buildUpon();
                }
                builder.appendQueryParameter("identifier", string);
            }
            if (!hashMap.isEmpty()) {
                if (builder == null) {
                    builder = parse.buildUpon();
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (entry.getValue() instanceof String) {
                        builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            PageService pageService = (PageService) serviceProvider.service(PageService.class);
            if (builder != null) {
                if (DisplayUtil.isLargeScreen(pageService.getActivity())) {
                    builder.appendQueryParameter("largescreenmask", "false");
                }
                str = builder.build().toString();
            }
            Schedules.ui(new MyRunnable(pageService, str));
        }
    }

    @Override // com.taobao.message.lab.comfrm.support.UserIdentifier
    public void identifier(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee19127a", new Object[]{this, str});
        } else {
            this.mIdentifier = str;
        }
    }

    /* loaded from: classes7.dex */
    public static class MyRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String finalActionUrl;
        private final PageService pageService;

        static {
            kge.a(980155184);
            kge.a(-1390502639);
        }

        public MyRunnable(PageService pageService, String str) {
            this.pageService = pageService;
            this.finalActionUrl = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Nav.from(this.pageService.getActivity()).withExtras(new Bundle()).toUri(this.finalActionUrl);
            }
        }
    }
}

package com.taobao.android.interactive;

import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.interactive_common.video.b;
import com.taobao.tao.log.TLog;
import java.util.Set;
import tb.kge;

/* loaded from: classes5.dex */
public class c implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARG_WH_WEEX = "wh_weex";
    public static final String PATH_INDEX = "/app/tb-source-app/video-fullpage/pages/index";
    public static final String PATH_INDEX2 = "/app/tb-source-app/video-fullpage/pages/index2";

    static {
        kge.a(-1396844697);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "VideoListBeforeNavProcessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        Uri data;
        String path;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        if (intent == null || dVar == null) {
            return true;
        }
        try {
            data = intent.getData();
        } catch (Throwable th) {
            TLog.loge("VideoListBeforeNavProcessor", "beforeNavTo error", th);
        }
        if (data == null || (path = data.getPath()) == null) {
            return true;
        }
        String queryParameter = data.getQueryParameter("wh_weex");
        if (path.equals("/app/tb-source-app/video-fullpage/pages/index2") && StringUtils.isEmpty(queryParameter)) {
            return true;
        }
        Set<String> queryParameterNames = data.getQueryParameterNames();
        Uri.Builder buildUpon = data.buildUpon();
        if (PATH_INDEX.equals(path)) {
            buildUpon.path("/app/tb-source-app/video-fullpage/pages/index2");
        }
        buildUpon.clearQuery();
        if (queryParameterNames != null) {
            for (String str : queryParameterNames) {
                String queryParameter2 = data.getQueryParameter(str);
                if (!"wh_weex".equals(str)) {
                    buildUpon.appendQueryParameter(str, queryParameter2);
                }
            }
        }
        intent.setData(buildUpon.build());
        return true;
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue() : b.d();
    }
}

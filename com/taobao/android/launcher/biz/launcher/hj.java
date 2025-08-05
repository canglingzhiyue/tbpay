package com.taobao.android.launcher.biz.launcher;

import android.app.Application;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import tb.gve;

/* loaded from: classes.dex */
public class hj extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(hj hjVar, String str, Object... objArr) {
        if (str.hashCode() == -222138312) {
            return new Boolean(super.intercept((com.taobao.android.job.core.task.c) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public hj(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        android.taobao.safemode.k c = android.taobao.safemode.h.a().c();
        if (c == null) {
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("startupUrl", c.h);
        hashMap2.put("startIntent", c.e.getDataString());
        com.taobao.taolive.room.d.a(application, hashMap2);
    }

    @Override // com.taobao.android.job.core.task.e
    public boolean intercept(com.taobao.android.job.core.task.c<String, Void> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2c27038", new Object[]{this, cVar})).booleanValue();
        }
        boolean intercept = super.intercept(cVar);
        if (!intercept) {
            return false;
        }
        android.taobao.safemode.k c = android.taobao.safemode.h.a().c();
        return c != null ? a(c) : intercept;
    }

    private boolean a(android.taobao.safemode.k kVar) {
        Uri data;
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edfc5550", new Object[]{this, kVar})).booleanValue();
        }
        if (kVar.e == null || (data = kVar.e.getData()) == null || data.isOpaque()) {
            return false;
        }
        String queryParameter = data.getQueryParameter("h5Url");
        if (TextUtils.isEmpty(queryParameter) || com.taobao.android.launcher.bootstrap.tao.ability.h.c(queryParameter) == null || (parse = Uri.parse(queryParameter)) == null) {
            return false;
        }
        String path = parse.getPath();
        TLog.loge(gve.MODULE, getId(), "path:" + path);
        if (TextUtils.equals(path, "/taolive/video.html")) {
            return true;
        }
        if (TextUtils.equals(path, "/taolive/main.html")) {
            String queryParameter2 = parse.getQueryParameter("channelType");
            String queryParameter3 = parse.getQueryParameter(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.LIVE_HOME_PAGE_TYPE);
            if ("jingxuan,singleLiveTab".equals(queryParameter2) && (com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.LIVE_HOME_PAGE_TYPE_mixLiveAndTab.equals(queryParameter3) || com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.LIVE_HOME_PAGE_TYPE_mixLive.equals(queryParameter3))) {
                return true;
            }
        }
        return false;
    }
}
